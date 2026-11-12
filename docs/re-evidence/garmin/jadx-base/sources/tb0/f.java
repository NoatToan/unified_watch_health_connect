package tb0;

import c2.x2;
import o4.d0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class f implements e23.r<Boolean, d0, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ub0.m f163620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ub0.l f163621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f163622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l<ub0.a, Unit> f163623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f163624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f163625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f163626g;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f163627a;

        static {
            int[] iArr = new int[ub0.m.values().length];
            try {
                iArr[ub0.m.VIEW_TUTORIALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ub0.m.SKIP_TUTORIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f163627a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(ub0.m mVar, ub0.l lVar, p pVar, e23.l<? super ub0.a, Unit> lVar2, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3) {
        this.f163620a = mVar;
        this.f163621b = lVar;
        this.f163622c = pVar;
        this.f163623d = lVar2;
        this.f163624e = aVar;
        this.f163625f = aVar2;
        this.f163626g = aVar3;
    }

    @Override // e23.r
    public final Unit invoke(Boolean bool, d0 d0Var, p3.m mVar, Integer num) {
        bool.getClass();
        long j8 = d0Var.f128833a;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 129) != 128)) {
            x1 x1Var = p3.n.f135158a;
            ub0.m mVar3 = this.f163620a;
            int i14 = mVar3 == null ? -1 : a.f163627a[mVar3.ordinal()];
            if (i14 == -1) {
                mVar2.C(551188184);
                ub0.k.f(x2.f(h4.r.S, 1.0f), this.f163625f, this.f163626g, mVar2, 6);
                mVar2.f();
            } else if (i14 == 1) {
                mVar2.C(550449361);
                h4.r rVarF = x2.f(h4.r.S, 1.0f);
                boolean z14 = this.f163621b != ub0.l.PAUSED;
                p pVar = this.f163622c;
                ub0.k.e(rVarF, z14, pVar.f163669b, pVar.f163670c, pVar.f163675h, pVar.f163674g, this.f163623d, this.f163624e, mVar2, 6);
                mVar2.f();
            } else {
                if (i14 != 2) {
                    throw n23.j.m(mVar2, -2060455155);
                }
                mVar2.C(551105042);
                mVar2.f();
                this.f163624e.invoke();
            }
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
