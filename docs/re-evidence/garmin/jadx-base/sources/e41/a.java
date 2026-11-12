package e41;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import i41.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Le41/a;", "", "Li41/f;", "dto", "<init>", "(Li41/f;)V", "a", "gcm-overnighthrv_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x31.a f62861a;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f62862a;

        static {
            int[] iArr = new int[x31.b.values().length];
            try {
                iArr[x31.b.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f62862a = iArr;
        }
    }

    static {
        new C1322a(null);
    }

    public a(f fVar) {
        x31.b bVarValueOf;
        fVar.getClass();
        x31.b bVar = x31.b.NONE;
        x31.a aVar = new x31.a(Integer.MIN_VALUE, -1.0f, bVar);
        this.f62861a = aVar;
        if (s.g(fVar.getStatus(), "POOR")) {
            Integer weeklyAvg = fVar.getWeeklyAvg();
            this.f62861a = new x31.a(weeklyAvg != null ? weeklyAvg.intValue() : Integer.MIN_VALUE, -1.0f, x31.b.POOR);
            return;
        }
        if (fVar.getBaseline() != null) {
            i41.a baseline = fVar.getBaseline();
            if (fVar.getStatus() != null && fVar.getWeeklyAvg() != null) {
                if ((baseline != null ? baseline.getMarkerValue() : null) != null && baseline.getBalancedUpper() != null) {
                    String status = fVar.getStatus();
                    if (status != null && (bVarValueOf = x31.b.valueOf(status)) != null) {
                        bVar = bVarValueOf;
                    }
                    if (bVar == x31.b.UNBALANCED) {
                        Integer weeklyAvg2 = fVar.getWeeklyAvg();
                        weeklyAvg2.getClass();
                        int iIntValue = weeklyAvg2.intValue();
                        Integer balancedUpper = baseline.getBalancedUpper();
                        balancedUpper.getClass();
                        bVar = iIntValue >= balancedUpper.intValue() ? x31.b.UNBALANCED_UPPER : x31.b.UNBALANCED_LOW;
                    }
                    if (b.f62862a[bVar.ordinal()] != 1) {
                        Integer weeklyAvg3 = fVar.getWeeklyAvg();
                        int iIntValue2 = weeklyAvg3 != null ? weeklyAvg3.intValue() : Integer.MIN_VALUE;
                        Double markerValue = baseline.getMarkerValue();
                        markerValue.getClass();
                        aVar = new x31.a(iIntValue2, (float) markerValue.doubleValue(), bVar);
                    }
                    this.f62861a = aVar;
                    return;
                }
            }
            if (fVar.getWeeklyAvg() != null) {
                Integer weeklyAvg4 = fVar.getWeeklyAvg();
                this.f62861a = new x31.a(weeklyAvg4 != null ? weeklyAvg4.intValue() : Integer.MIN_VALUE, -1.0f, bVar);
            } else {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "OhrvMarkerStatusService", "calculateMarkerStatus: Baseline data is null or invalid.");
            }
        }
    }

    /* JADX INFO: renamed from: e41.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Le41/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-overnighthrv_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1322a {
        public /* synthetic */ C1322a(j jVar) {
            this();
        }

        private C1322a() {
        }
    }
}
