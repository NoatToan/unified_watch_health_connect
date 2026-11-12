package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class fqm extends qmf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private fqq f34413a;

    public fqm(float f, fqq fqqVar) {
        super(f);
        this.f34413a = fqqVar;
    }

    public fqq a() {
        return this.f34413a;
    }

    @Override // defpackage.qmf
    public float b() {
        fqq fqqVar = this.f34413a;
        if (fqqVar != null) {
            return fqqVar.b();
        }
        return super.b();
    }

    @Override // defpackage.qmf
    public float c() {
        fqq fqqVar = this.f34413a;
        if (fqqVar != null) {
            return fqqVar.a();
        }
        return super.c();
    }
}
