package o72;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lo72/x3;", "Lk82/f;", "<init>", "()V", "a", "preview_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x3 implements k82.f {
    static {
        new a(null);
    }

    @Override // k82.f
    public final String a(boolean z14) {
        return z14 ? "km/h" : "mph";
    }

    @Override // k82.f
    public final double b(double d14) {
        return ((d14 - ((double) 32)) * ((double) 5)) / ((double) 9);
    }

    @Override // k82.f
    public final double c(double d14) {
        return d14 * 1.60934d;
    }

    @Override // k82.f
    public final double d(double d14) {
        return d14 * 1.15078d;
    }

    @Override // k82.f
    public final String e(double d14, boolean z14) {
        if (!z14) {
            d14 = ((d14 * ((double) 9)) / ((double) 5)) + ((double) 32);
        }
        int i14 = z14 ? R.string.lbl_fahrenheit_degrees : R.string.lbl_celsius_degrees;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(d14);
        sb3.append(i14);
        return sb3.toString();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo72/x3$a;", "", "<init>", "()V", "", "KNOTS_TO_MPH", "D", "preview_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
