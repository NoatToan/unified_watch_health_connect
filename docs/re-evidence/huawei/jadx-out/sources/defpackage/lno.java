package defpackage;

/* JADX INFO: loaded from: classes10.dex */
public class lno {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f40490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40491b;
    private int d;
    private int e;

    public int a() {
        return ((Integer) cpu.a(Integer.valueOf(this.d))).intValue();
    }

    public void d(int i) {
        this.d = ((Integer) cpu.a(Integer.valueOf(i))).intValue();
    }

    public int e() {
        return ((Integer) cpu.a(Integer.valueOf(this.e))).intValue();
    }

    public void e(int i) {
        this.e = ((Integer) cpu.a(Integer.valueOf(i))).intValue();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(0);
        stringBuffer.append("BTBindStatus{BT_bind_status=").append(this.d).append(", BT_bind_status_info=").append(this.e).append("}");
        return stringBuffer.toString();
    }

    public int d() {
        return ((Integer) cpu.a(Integer.valueOf(this.f40491b))).intValue();
    }

    public void c(int i) {
        this.f40491b = ((Integer) cpu.a(Integer.valueOf(i))).intValue();
    }

    public void b(int i) {
        this.f40490a = ((Integer) cpu.a(Integer.valueOf(i))).intValue();
    }

    public int b() {
        return ((Integer) cpu.a(Integer.valueOf(this.f40490a))).intValue();
    }
}
