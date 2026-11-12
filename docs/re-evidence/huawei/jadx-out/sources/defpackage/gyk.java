package defpackage;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public class gyk implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("mNeedMirror")
    private boolean f36232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("mSelectIcon")
    private int f36233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("mDetailItemType")
    private String f36234c;

    @SerializedName("mName")
    private String d;

    @SerializedName("mNameAndUnit")
    private String e;

    @SerializedName("mUnit")
    private String i;

    @SerializedName("mValue")
    private String j;

    public gyk() {
    }

    public gyk(String str, String str2, String str3, String str4, String str5) {
        this.f36234c = str;
        this.d = str2;
        this.j = str3;
        this.i = str4;
        this.e = str5;
        this.f36232a = false;
    }

    public String e() {
        return this.f36234c;
    }

    public void c(String str) {
        this.f36234c = str;
    }

    public String a() {
        return this.d;
    }

    public void a(String str) {
        this.d = str;
    }

    public String f() {
        return this.j;
    }

    public void e(String str) {
        this.j = str;
    }

    public String d() {
        return this.i;
    }

    public void b(String str) {
        this.i = str;
    }

    public String b() {
        return this.e;
    }

    public void d(String str) {
        this.e = str;
    }

    public int c() {
        return this.f36233b;
    }

    public void a(int i) {
        this.f36233b = i;
    }

    public boolean h() {
        return this.f36232a;
    }

    public void a(boolean z) {
        this.f36232a = z;
    }

    public String toString() {
        return "SportsShareDetailBean{mDetailItemType='" + this.f36234c + "', mName='" + this.d + "', mValue=" + this.j + ", mUnit=" + this.i + ", mNameAndUnit=" + this.e + ", mSelectIcon=" + this.f36233b + ", mNeedMirror=" + this.f36232a + '}';
    }
}
