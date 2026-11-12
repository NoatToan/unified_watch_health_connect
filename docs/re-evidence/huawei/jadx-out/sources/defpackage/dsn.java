package defpackage;

/* JADX INFO: loaded from: classes27.dex */
public class dsn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32329b;
    private String d;
    private int e;

    public void c(int i) {
        this.f32329b = i;
    }

    public void b(int i) {
        this.f32328a = i;
    }

    public void d(int i) {
        this.e = i;
    }

    public void c(String str) {
        this.d = str;
    }

    public String toString() {
        return "PostureReminder{postureId='" + this.d + "', type=" + this.f32329b + ", value=" + this.f32328a + ", time=" + this.e + '}';
    }
}
