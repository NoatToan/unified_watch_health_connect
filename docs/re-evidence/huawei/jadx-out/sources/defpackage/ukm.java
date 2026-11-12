package defpackage;

/* JADX INFO: loaded from: classes19.dex */
public class ukm extends qmf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ukp f50292a;

    public ukm(float f, ukp ukpVar) {
        super(f);
        this.f50292a = ukpVar;
    }

    public ukp a() {
        return this.f50292a;
    }

    @Override // defpackage.qmf
    public float b() {
        ukp ukpVar = this.f50292a;
        if (ukpVar != null) {
            return ukpVar.a();
        }
        return super.b();
    }

    @Override // defpackage.qmf
    public float c() {
        ukp ukpVar = this.f50292a;
        if (ukpVar != null) {
            return ukpVar.d();
        }
        return super.c();
    }
}
