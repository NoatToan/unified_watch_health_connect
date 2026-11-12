package u70;

import e23.l;
import e23.r;
import o4.d0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p1;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class f implements r<Boolean, d0, m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f169414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f169415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f169416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f169417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x3<Boolean> f169418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l<a, Unit> f169419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f169420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p1<a> f169421h;

    /* JADX WARN: Multi-variable type inference failed */
    public f(b bVar, e23.a<Unit> aVar, boolean z14, e23.a<Unit> aVar2, x3<Boolean> x3Var, l<? super a, Unit> lVar, p1<Boolean> p1Var, p1<a> p1Var2) {
        this.f169414a = bVar;
        this.f169415b = aVar;
        this.f169416c = z14;
        this.f169417d = aVar2;
        this.f169418e = x3Var;
        this.f169419f = lVar;
        this.f169420g = p1Var;
        this.f169421h = p1Var2;
    }

    @Override // e23.r
    public final Unit invoke(Boolean bool, d0 d0Var, m mVar, Integer num) {
        bool.getClass();
        long j8 = d0Var.f128833a;
        m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 129) != 128)) {
            x1 x1Var = n.f135158a;
            b82.c.b(null, null, z3.f.c(1836334692, new c(this.f169414a, this.f169415b, 1), mVar2), z3.f.c(1031919427, new defpackage.d(this.f169414a, this.f169416c, this.f169417d, this.f169418e, this.f169419f, this.f169420g, this.f169421h), mVar2), 0L, mVar2, 3456, 19);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
