package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes7.dex */
public class ebi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("psk")
    private String f32670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("devId")
    private String f32671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("cloudUrl")
    private String f32672c;

    @SerializedName("code")
    private String e;

    public void d(String str) {
        this.f32671b = str;
    }

    public String e() {
        return this.f32671b;
    }

    public void c(String str) {
        this.e = str;
    }

    public void e(String str) {
        this.f32672c = str;
    }

    public void a(String str) {
        this.f32670a = str;
    }

    public String toString() {
        return "SoftApRegisterInfo{devId =" + dyg.b(this.f32671b) + ", code ='" + dyg.b(this.e) + "', cloudUrl ='" + dyg.b(this.f32672c) + "', psk ='" + dyg.b(this.f32670a) + "'}";
    }
}
