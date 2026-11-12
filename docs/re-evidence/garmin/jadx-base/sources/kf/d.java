package kf;

import f5.k;
import o4.e0;
import o53.b0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkf/d;", "Lkf/a;", "Ljf/d;", "painter", "Lh4/d;", "alignment", "Lf5/k;", "contentScale", "", "alpha", "Lo4/e0;", "colorFilter", "", "clipToBounds", "", "contentDescription", "Ljf/j;", "constraintSizeResolver", "<init>", "(Ljf/d;Lh4/d;Lf5/k;FLo4/e0;ZLjava/lang/String;Ljf/j;)V", "coil-compose-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jf.d f104577h;

    public d(jf.d dVar, h4.d dVar2, k kVar, float f14, e0 e0Var, boolean z14, String str, jf.j jVar) {
        super(dVar2, kVar, f14, e0Var, z14, str, jVar);
        this.f104577h = dVar;
    }

    @Override // kf.a
    /* JADX INFO: renamed from: V1 */
    public final t4.d getF104589h() {
        return this.f104577h;
    }

    @Override // h4.r.c
    public final void onAttach() {
        b0 coroutineScope = getCoroutineScope();
        jf.d dVar = this.f104577h;
        dVar.f98623h = coroutineScope;
        dVar.onRemembered();
    }

    @Override // h4.r.c
    public final void onDetach() {
        this.f104577h.onForgotten();
    }

    @Override // h4.r.c
    public final void onReset() {
        this.f104577h.d(null);
    }
}
