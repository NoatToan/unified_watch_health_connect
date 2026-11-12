package c22;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lc22/o3;", "", "", "isMetric", "", "otherMeasuringSystemConversionMultiplier", "", "unitResId", "<init>", "(Ljava/lang/String;IZDI)V", "a", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum o3 {
    BAR(true, 14.5037738d, R.string.lbl_bar),
    PSI(false, 0.0689475729d, R.string.lbl_psi);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f23180d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f23185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23186c;

    o3(boolean z14, double d14, int i14) {
        this.f23184a = z14;
        this.f23185b = d14;
        this.f23186c = i14;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc22/o3$a;", "", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static double a(o3 o3Var, o3 o3Var2) {
            o3Var.getClass();
            o3Var2.getClass();
            if (o3Var.f23184a != o3Var2.f23184a) {
                return o3Var.f23185b * 1.0d;
            }
            return 1.0d;
        }

        private a() {
        }
    }
}
