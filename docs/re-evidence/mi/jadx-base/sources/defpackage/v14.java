package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class v14<T> extends l10<w14<T>> {
    public v14(dbi<w14<T>> dbiVar, o0m o0mVar, ook ookVar) {
        super(dbiVar, o0mVar, ookVar);
    }

    public static <T> cp5<w14<T>> z(dbi<w14<T>> dbiVar, o0m o0mVar, ook ookVar) {
        if (epa.d()) {
            epa.a("CloseableProducerToDataSourceAdapter#create");
        }
        v14 v14Var = new v14(dbiVar, o0mVar, ookVar);
        if (epa.d()) {
            epa.b();
        }
        return v14Var;
    }

    @Override // defpackage.j00, defpackage.cp5
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public w14<T> getResult() {
        return w14.d((w14) super.getResult());
    }

    @Override // defpackage.l10
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void x(w14<T> w14Var, int i) {
        super.x(w14.d(w14Var), i);
    }

    @Override // defpackage.j00
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(w14<T> w14Var) {
        w14.l(w14Var);
    }
}
