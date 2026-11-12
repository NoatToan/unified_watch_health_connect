package r1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr1/r0;", "it", "Lo4/z1;", "invoke-LIALnN8", "(Lr1/r0;)J", "<anonymous>"}, k = 3, mv = {2, 0, 0})
public final class b1 extends p005kotlin.jvm.internal.w implements e23.l<r0, o4.z1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o4.z1 f149015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u1 f149016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w1 f149017c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f149018a;

        static {
            int[] iArr = new int[r0.values().length];
            try {
                iArr[r0.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r0.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r0.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f149018a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(o4.z1 z1Var, u1 u1Var, w1 w1Var) {
        super(1);
        this.f149015a = z1Var;
        this.f149016b = u1Var;
        this.f149017c = w1Var;
    }

    @Override // e23.l
    public final o4.z1 invoke(r0 r0Var) {
        o4.z1 z1VarA;
        long j8;
        int i14 = a.f149018a[r0Var.ordinal()];
        if (i14 != 1) {
            z1VarA = null;
            u1 u1Var = this.f149016b;
            w1 w1Var = this.f149017c;
            if (i14 == 2) {
                e2 e2Var = u1Var.getF149295c().f149184d;
                if (e2Var != null || (e2Var = w1Var.getF149312d().f149184d) != null) {
                    z1VarA = o4.z1.a(e2Var.f149078b);
                }
            } else {
                if (i14 != 3) {
                    lc.u0.r();
                    return null;
                }
                e2 e2Var2 = w1Var.getF149312d().f149184d;
                if (e2Var2 != null || (e2Var2 = u1Var.getF149295c().f149184d) != null) {
                    z1VarA = o4.z1.a(e2Var2.f149078b);
                }
            }
        } else {
            z1VarA = this.f149015a;
        }
        if (z1VarA != null) {
            j8 = z1VarA.f129048a;
        } else {
            o4.z1.f129046b.getClass();
            j8 = o4.z1.f129047c;
        }
        return o4.z1.a(j8);
    }
}
