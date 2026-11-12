package h5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lh5/f2;", "Lp3/a;", "Lh5/e0;", "root", "<init>", "(Lh5/e0;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f2 extends p3.a<e0> {
    public f2(e0 e0Var) {
        super(e0Var);
    }

    @Override // p3.c
    public final void insertBottomUp(int i14, Object obj) {
        getCurrent().Q(i14, (e0) obj);
    }

    @Override // p3.c
    public final /* bridge */ /* synthetic */ void insertTopDown(int i14, Object obj) {
    }

    @Override // p3.c
    public final void move(int i14, int i15, int i16) {
        getCurrent().Y(i14, i15, i16);
    }

    @Override // p3.a
    public final void onClear() {
        getRoot().d0();
    }

    @Override // p3.c
    public final void onEndChanges() {
        o1 o1Var = getRoot().f81774n;
        if (o1Var != null) {
            o1Var.p();
        }
    }

    @Override // p3.c
    public final void remove(int i14, int i15) {
        getCurrent().e0(i14, i15);
    }

    @Override // p3.c
    public final void reuse() {
        getCurrent().e();
    }
}
