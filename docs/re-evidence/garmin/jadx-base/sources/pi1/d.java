package pi1;

import e23.l;
import o13.q;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import wd2.m1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class d implements l<Boolean, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t13.d<m1> f137857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1 f137858b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(t13.d<? super m1> dVar, m1 m1Var) {
        this.f137857a = dVar;
        this.f137858b = m1Var;
    }

    @Override // e23.l
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        int i14 = q.f128596b;
        this.f137857a.resumeWith(zBooleanValue ? this.f137858b : null);
        return Unit.INSTANCE;
    }
}
