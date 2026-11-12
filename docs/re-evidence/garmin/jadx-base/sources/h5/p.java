package h5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lh5/p;", "", "", "extraAssertions", "<init>", "(Z)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f81930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f81931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f81932c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f81933a;

        static {
            int[] iArr = new int[z.values().length];
            try {
                iArr[z.LookaheadMeasurement.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[z.LookaheadPlacement.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[z.Measurement.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[z.Placement.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f81933a = iArr;
        }
    }

    public p(boolean z14) {
        this.f81930a = new n(z14);
        this.f81931b = new n(z14);
        this.f81932c = new n(z14);
    }

    public final void a(e0 e0Var, z zVar) {
        int i14 = a.f81933a[zVar.ordinal()];
        n nVar = this.f81930a;
        n nVar2 = this.f81932c;
        if (i14 == 1) {
            nVar.a(e0Var);
            nVar2.a(e0Var);
            return;
        }
        n nVar3 = this.f81931b;
        if (i14 == 2) {
            nVar3.a(e0Var);
            nVar2.a(e0Var);
            return;
        }
        if (i14 == 3) {
            if (e0Var.f81767h != null) {
                nVar2.a(e0Var);
                return;
            } else {
                nVar.a(e0Var);
                return;
            }
        }
        if (i14 != 4) {
            lc.u0.r();
        } else if (e0Var.f81767h != null) {
            nVar2.a(e0Var);
        } else {
            nVar3.a(e0Var);
        }
    }

    public final boolean b(e0 e0Var) {
        return !(e0Var.f81767h == null) && (this.f81930a.b(e0Var) || this.f81931b.b(e0Var));
    }

    public final boolean c() {
        return !(this.f81930a.f81897c.isEmpty() && this.f81932c.f81897c.isEmpty() && this.f81931b.f81897c.isEmpty());
    }
}
