package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public class snk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("calendarInfo")
    private snw f48415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f48416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("audioInfo")
    private sng f48417c;

    @SerializedName("audioWorkoutInfo")
    private snp d;
    private boolean e;
    private String f;

    @SerializedName("lastPlayTime")
    private long g;

    @SerializedName("pictureInfo")
    private snx h;

    @SerializedName("lecturerInfo")
    private snq i;
    private String j;

    @SerializedName("status")
    private int k;

    @SerializedName("playRecord")
    private long l;

    @SerializedName("playCount")
    private long n;

    public snp d() {
        return this.d;
    }

    public snx k() {
        return this.h;
    }

    public sng b() {
        return this.f48417c;
    }

    public snq f() {
        return this.i;
    }

    public String i() {
        snq snqVar = this.i;
        return snqVar == null ? "" : snqVar.b();
    }

    public String h() {
        snq snqVar = this.i;
        return snqVar == null ? "" : snqVar.d();
    }

    public long l() {
        return this.l;
    }

    public int n() {
        return this.k;
    }

    public snw c() {
        return this.f48415a;
    }

    public String g() {
        return this.j;
    }

    public void e(String str) {
        this.j = str;
    }

    public String j() {
        return this.f;
    }

    public void a(String str) {
        this.f = str;
    }

    public long e() {
        return this.g;
    }

    public String a() {
        return this.f48416b;
    }

    public void c(String str) {
        this.f48416b = str;
    }

    public boolean o() {
        return this.e;
    }

    public void b(boolean z) {
        this.e = z;
    }

    public String toString() {
        return "AudioWorkoutDetail{audioWorkoutInfo=" + this.d + ", pictureInfo=" + this.h + ", audioInfo=" + this.f48417c + ", lecturerInfo=" + this.i + ", calendarInfo=" + this.f48415a + ", playCount=" + this.n + ", playRecord=" + this.l + ", status=" + this.k + ", lastPlayTime=" + this.g + ", name='" + this.f + "', onlineDate='" + this.j + "'}";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f48415a, ((snk) obj).f48415a);
    }

    public int hashCode() {
        return Objects.hash(this.f48415a);
    }
}
