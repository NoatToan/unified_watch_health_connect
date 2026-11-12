package r1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr1/r0;", "it", "", "invoke", "(Lr1/r0;)Ljava/lang/Float;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
public final class w0 extends p005kotlin.jvm.internal.w implements e23.l<r0, Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u1 f149301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w1 f149302b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f149303a;

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
            f149303a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(u1 u1Var, w1 w1Var) {
        super(1);
        this.f149301a = u1Var;
        this.f149302b = w1Var;
    }

    @Override // e23.l
    public final Float invoke(r0 r0Var) {
        int i14 = a.f149303a[r0Var.ordinal()];
        float f14 = 1.0f;
        if (i14 != 1) {
            if (i14 == 2) {
                y1 y1Var = this.f149301a.getF149295c().f149181a;
                if (y1Var != null) {
                    f14 = y1Var.f149317a;
                }
            } else {
                if (i14 != 3) {
                    lc.u0.r();
                    return null;
                }
                y1 y1Var2 = this.f149302b.getF149312d().f149181a;
                if (y1Var2 != null) {
                    f14 = y1Var2.f149317a;
                }
            }
        }
        return Float.valueOf(f14);
    }
}
