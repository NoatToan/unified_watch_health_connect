package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class nza extends q47<kza> implements fad {
    public nza(kza kzaVar) {
        super(kzaVar);
    }

    @Override // defpackage.kqk
    public Class<kza> a() {
        return kza.class;
    }

    @Override // defpackage.kqk
    public int getSize() {
        return ((kza) this.f31075a).i();
    }

    @Override // defpackage.q47, defpackage.fad
    public void initialize() {
        ((kza) this.f31075a).e().prepareToDraw();
    }

    @Override // defpackage.kqk
    public void recycle() {
        ((kza) this.f31075a).stop();
        ((kza) this.f31075a).k();
    }
}
