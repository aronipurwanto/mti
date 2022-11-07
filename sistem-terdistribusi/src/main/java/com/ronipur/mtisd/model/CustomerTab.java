package com.ronipur.mtisd.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "customer_tab")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerTab {
    @Id
    @Column(name = "id", length = 36)
    private String id;

    @Column(name = "nik", length = 16, nullable = false)
    private String nik;

    @Column(name = "nama_lengkap", nullable = false)
    private String namaLengkap;

    @Column(name = "alamat")
    private String alamat;

    @Column(name = "tpt_lahir")
    private String tempatLahir;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @Column(name = "tgl_lahir")
    private Date tglLahir;

    @Column(name = "jk", length = 10)
    private String jk;

    @Column(name = "agama")
    private String agama;
}
