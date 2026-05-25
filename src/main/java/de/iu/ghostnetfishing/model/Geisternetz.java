package de.iu.ghostnetfishing.model;

import jakarta.persistence.*;

@Entity
@Table(name = "geisternetz")
public class Geisternetz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Double latitude;

    @Column(nullable = false)
    private Double longitude;

    @Column(name = "groesse_qm", nullable = false)
    private Double groesseQuadratmeter;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private NetzStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "melder_id")
    private Person melder;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "berger_id")
    private Person berger;

    public Geisternetz() {
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Double getLatitude() { return latitude; }
    public void setLatitude(Double latitude) { this.latitude = latitude; }

    public Double getLongitude() { return longitude; }
    public void setLongitude(Double longitude) { this.longitude = longitude; }

    public Double getGroesseQuadratmeter() { return groesseQuadratmeter; }
    public void setGroesseQuadratmeter(Double groesseQuadratmeter) { this.groesseQuadratmeter = groesseQuadratmeter; }

    public NetzStatus getStatus() { return status; }
    public void setStatus(NetzStatus status) { this.status = status; }

    public Person getMelder() { return melder; }
    public void setMelder(Person melder) { this.melder = melder; }

    public Person getBerger() { return berger; }
    public void setBerger(Person berger) { this.berger = berger; }
}