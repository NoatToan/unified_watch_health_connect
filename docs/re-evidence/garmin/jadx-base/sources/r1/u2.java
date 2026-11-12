package r1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr1/r0;", "it", "Lo4/d0;", "invoke-vNxB06k", "(Lr1/r0;)J", "<anonymous>"}, k = 3, mv = {2, 0, 0})
public final class u2 extends p005kotlin.jvm.internal.w implements e23.l<r0, o4.d0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v2 f149289a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f149290a;

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
            f149290a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(v2 v2Var) {
        super(1);
        this.f149289a = v2Var;
    }

    @Override // e23.l
    public final o4.d0 invoke(r0 r0Var) {
        long j8;
        int i14 = a.f149290a[r0Var.ordinal()];
        v2 v2Var = this.f149289a;
        if (i14 == 1) {
            r2 r2Var = v2Var.f149297b.getF149295c().f149185e;
            if (r2Var != null) {
                j8 = r2Var.f149223b;
            } else {
                r2 r2Var2 = v2Var.f149298c.getF149312d().f149185e;
                if (r2Var2 != null) {
                    j8 = r2Var2.f149222a;
                } else {
                    o4.d0.f128823b.getClass();
                    j8 = o4.d0.f128831j;
                }
            }
        } else if (i14 == 2) {
            r2 r2Var3 = v2Var.f149297b.getF149295c().f149185e;
            if (r2Var3 != null) {
                j8 = r2Var3.f149222a;
            } else {
                o4.d0.f128823b.getClass();
                j8 = o4.d0.f128831j;
            }
        } else {
            if (i14 != 3) {
                lc.u0.r();
                return null;
            }
            r2 r2Var4 = v2Var.f149298c.getF149312d().f149185e;
            if (r2Var4 != null) {
                j8 = r2Var4.f149223b;
            } else {
                o4.d0.f128823b.getClass();
                j8 = o4.d0.f128831j;
            }
        }
        return o4.d0.a(j8);
    }
}
