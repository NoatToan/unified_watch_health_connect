package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class frt extends qmf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f34453a;
    private float g;
    private float h;
    private frs i;
    private float j;

    public frt(float f, frs frsVar) {
        super(f);
        this.i = frsVar;
    }

    public float h() {
        return this.j;
    }

    public void d(float f) {
        this.j = f;
    }

    public float e() {
        return this.g;
    }

    public void a(float f) {
        this.g = f;
    }

    public float d() {
        return this.h;
    }

    public void e(float f) {
        this.h = f;
    }

    public float a() {
        return this.f34453a;
    }

    public void c(float f) {
        this.f34453a = f;
    }

    public void c(frs frsVar) {
        this.i = frsVar;
    }

    public frs j() {
        return this.i;
    }

    @Override // defpackage.qmf
    public float b() {
        frs frsVar = this.i;
        if (frsVar != null) {
            return frsVar.a();
        }
        return super.b();
    }

    @Override // defpackage.qmf
    public float c() {
        frs frsVar = this.i;
        if (frsVar != null) {
            return frsVar.d();
        }
        return super.c();
    }
}
