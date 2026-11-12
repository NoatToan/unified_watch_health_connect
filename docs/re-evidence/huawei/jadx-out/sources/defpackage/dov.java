package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes7.dex */
public class dov {
    private int i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32168c = 30;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32166a = 180;

    @SerializedName("ackEnable")
    private boolean e = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f32167b = 0;

    @SerializedName("offsetEnable")
    private boolean d = false;

    public long g() {
        return ((Long) lst.d(Long.valueOf(this.f32167b))).longValue();
    }

    public void b(long j) {
        this.f32167b = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public void c(boolean z) {
        this.e = ((Boolean) lst.d(Boolean.valueOf(z))).booleanValue();
    }

    public boolean c() {
        return ((Boolean) lst.d(Boolean.valueOf(this.e))).booleanValue();
    }

    public int a() {
        return ((Integer) lst.d(Integer.valueOf(this.f32166a))).intValue();
    }

    public void e(int i) {
        this.f32166a = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int e() {
        return ((Integer) lst.d(Integer.valueOf(this.f32168c))).intValue();
    }

    public int b() {
        return ((Integer) lst.d(Integer.valueOf(this.f32168c))).intValue() * 1000;
    }

    public void a(int i) {
        this.f32168c = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int f() {
        return ((Integer) lst.d(Integer.valueOf(this.i))).intValue();
    }

    public void c(int i) {
        this.i = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public boolean d() {
        return ((Boolean) lst.d(Boolean.valueOf(this.d))).booleanValue();
    }

    public void e(boolean z) {
        this.d = ((Boolean) lst.d(Boolean.valueOf(z))).booleanValue();
    }
}
