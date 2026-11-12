package o62;

import androidx.lifecycle.u1;
import p005kotlin.Metadata;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lo62/r0;", "Landroidx/lifecycle/u1;", "Lo62/v0;", "initialWeightData", "<init>", "(Lo62/v0;)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r0 extends u1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d53.k f129759e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f129760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f129761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f129762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f129763d;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f129764a;

        static {
            int[] iArr = new int[i.values().length];
            try {
                iArr[i.MANUAL_WEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.SCALED_FROM_BENCHMARK_WEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i.VERBAL_WEIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f129764a = iArr;
        }
    }

    static {
        new a(null);
        f129759e = new d53.k("\\d*\\.?\\d?");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    public r0(v0 v0Var) {
        i iVar;
        String strValueOf;
        String strValueOf2;
        v0Var.getClass();
        Double d14 = v0Var.f129794f;
        Double d15 = v0Var.f129789a;
        this.f129760a = v0Var;
        this.f129761b = v0Var.f129790b;
        if (v0Var.f129796h && zf.b.D(d15)) {
            iVar = i.MANUAL_WEIGHT;
        } else if (d14 == null || d14.doubleValue() < 1.0d) {
            iVar = v0Var.f129797i != null ? i.VERBAL_WEIGHT : i.MANUAL_WEIGHT;
        } else {
            iVar = i.SCALED_FROM_BENCHMARK_WEIGHT;
        }
        String str = "";
        if (d15 != null) {
            d15 = Double.isNaN(d15.doubleValue()) ? null : d15;
            strValueOf = (d15 == null || (strValueOf = String.valueOf(d15.doubleValue())) == null) ? "" : strValueOf;
        }
        if (d14 != null) {
            d14 = Double.isNaN(d14.doubleValue()) ? null : d14;
            if (d14 != null && (strValueOf2 = String.valueOf(d14.doubleValue())) != null) {
                str = strValueOf2;
            }
        }
        p2 p2VarA = q2.a(new j(v0Var, iVar, strValueOf, str));
        this.f129762c = p2VarA;
        this.f129763d = p2VarA;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo62/r0$a;", "", "<init>", "()V", "Ld53/k;", "INPUT_REGEX", "Ld53/k;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
