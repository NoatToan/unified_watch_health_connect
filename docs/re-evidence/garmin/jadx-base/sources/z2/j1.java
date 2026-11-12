package z2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class j1 implements e23.l<z4.b, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1 f201655a;

    public j1(o1 o1Var) {
        this.f201655a = o1Var;
    }

    @Override // e23.l
    public final Boolean invoke(z4.b bVar) {
        boolean z14;
        if (p006l2.w1.f108857a.a(bVar.f202306a) == p006l2.s1.COPY) {
            this.f201655a.b();
            z14 = true;
        } else {
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }
}
