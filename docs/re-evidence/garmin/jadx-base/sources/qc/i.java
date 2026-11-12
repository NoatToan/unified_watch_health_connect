package qc;

import lc.d0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f144341b;

    public /* synthetic */ i(d0 d0Var, int i14) {
        this.f144340a = i14;
        this.f144341b = d0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        boolean zContains;
        String str = (String) obj;
        switch (this.f144340a) {
            case 0:
                str.getClass();
                zContains = this.f144341b.b().contains(str);
                break;
            default:
                str.getClass();
                zContains = this.f144341b.b().contains(str);
                break;
        }
        return Boolean.valueOf(!zContains);
    }
}
