package defpackage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes7.dex */
public class dsg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("icon")
    private String f32310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("content")
    private String f32311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("iconDark")
    private String f32312c;

    @Expose(serialize = false)
    private long d;

    @Expose(serialize = false)
    private boolean e;

    @Expose(serialize = false)
    private long f;

    @Expose(serialize = false)
    private int g;

    @SerializedName("routerUrl")
    private String h;

    @SerializedName("title")
    private String i;

    @Expose(serialize = false)
    private String j;

    public String e() {
        return this.i;
    }

    public void h(String str) {
        this.i = str;
    }

    public void c(String str) {
        this.f32311b = str;
    }

    public void d(String str) {
        this.f32310a = str;
    }

    public void b(String str) {
        this.h = str;
    }

    public String a() {
        return this.j;
    }

    public void e(String str) {
        this.j = str;
    }

    public boolean j() {
        return this.e;
    }

    public void c(boolean z) {
        this.e = z;
    }

    public int d() {
        return this.g;
    }

    public void a(int i) {
        this.g = i;
    }

    public long b() {
        return this.f;
    }

    public void b(long j) {
        this.f = j;
    }

    public long c() {
        return this.d;
    }

    public void d(long j) {
        this.d = j;
    }

    public void a(String str) {
        this.f32312c = str;
    }
}
