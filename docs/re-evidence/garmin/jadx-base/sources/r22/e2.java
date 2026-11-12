package r22;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B]\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010²\u0006\u000e\u0010\u000f\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Lr22/e2;", "Lr22/x;", "", "millisDigits", "", "defaultTimeSeconds", "minTimeSeconds", "maxTimeSeconds", "Lkotlin/Function1;", "", "formatTime", "", "onTimeSelected", "<init>", "(IDDDLe23/l;Le23/l;)V", "selectedTime", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e2 extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f149639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f149640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f149641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f149642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.l<Double, String> f149643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e23.l<Double, Unit> f149644f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
        public a(Object obj) {
            super(0, obj, e2.class, "dismiss", "dismiss()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((e2) this.receiver).dismiss();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ e2(int i14, double d14, double d15, double d16, e23.l lVar, e23.l lVar2, int i15, p005kotlin.jvm.internal.j jVar) {
        i14 = (i15 & 1) != 0 ? 1 : i14;
        this(i14, (i15 & 2) != 0 ? 0.0d : d14, (i15 & 4) != 0 ? 0.0d : d15, (i15 & 8) != 0 ? 86400.0d - Math.pow(10.0d, -i14) : d16, (i15 & 16) != 0 ? new qv1.l(18) : lVar, lVar2);
    }

    @Override // r22.x
    public final void u6(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(393365372);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            z02.b.a(false, null, null, null, false, z3.f.c(-473863758, new d2(this), o0VarE), o0VarE, 196608, 31);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d2(this, i14);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e2(int i14, double d14, double d15, e23.l<? super Double, Unit> lVar) {
        this(i14, d14, d15, 0.0d, null, lVar, 24, null);
        lVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e2(int i14, double d14, e23.l<? super Double, Unit> lVar) {
        this(i14, d14, 0.0d, 0.0d, null, lVar, 28, null);
        lVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e2(int i14, e23.l<? super Double, Unit> lVar) {
        this(i14, 0.0d, 0.0d, 0.0d, null, lVar, 30, null);
        lVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e2(e23.l<? super Double, Unit> lVar) {
        this(0, 0.0d, 0.0d, 0.0d, null, lVar, 31, null);
        lVar.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e2(int i14, double d14, double d15, double d16, e23.l<? super Double, String> lVar, e23.l<? super Double, Unit> lVar2) {
        lVar.getClass();
        lVar2.getClass();
        this.f149639a = i14;
        this.f149640b = d14;
        this.f149641c = d15;
        this.f149642d = d16;
        this.f149643e = lVar;
        this.f149644f = lVar2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e2(int i14, double d14, double d15, double d16, e23.l<? super Double, Unit> lVar) {
        this(i14, d14, d15, d16, null, lVar, 16, null);
        lVar.getClass();
    }
}
