package q81;

import android.content.Context;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.R;
import d53.w;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq81/o;", "", "<init>", "()V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f143356a;

        static {
            int[] iArr = new int[o81.f.values().length];
            try {
                iArr[o81.f.HILL_STRENGTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o81.f.HILL_ENDURANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o81.f.VO2_MAX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f143356a = iArr;
        }
    }

    public static String a(Context context, double d14) {
        if (Double.isNaN(d14)) {
            return null;
        }
        l22.a aVar = new l22.a(context);
        f12.l.f68084a.getClass();
        int iU = f12.l.a.a().u();
        boolean z14 = f12.l.a.a().w().equals("MALE") || TextUtils.isEmpty(f12.l.a.a().w());
        a61.e.f1563a.getClass();
        String strI = a61.e.i(iU, d14, z14);
        if (TextUtils.isEmpty(f12.l.a.a().w())) {
            return StringUtils.SPACE;
        }
        return w.z(strI, "top", false) ? aVar.a(R.string.vo2_max_top_percentile_msg, w.O(strI, "top ")) : aVar.a(R.string.vo2_max_bottom_percentile_msg, w.O(strI, "bottom "));
    }
}
