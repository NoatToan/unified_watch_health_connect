package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class igj extends i00 implements s67, vqh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final igj f21117a = new igj();

    @Override // defpackage.vqh
    public void d(fgj fgjVar, Object obj, bw3 bw3Var) {
        int[] iArr = wq5.c(bw3Var).get(fgjVar, ((hgj) obj).getMillis());
        for (int i = 0; i < iArr.length; i++) {
            fgjVar.setValue(i, iArr[i]);
        }
    }

    @Override // defpackage.ck4
    public Class<?> e() {
        return hgj.class;
    }

    @Override // defpackage.s67
    public long f(Object obj) {
        return ((hgj) obj).getMillis();
    }
}
