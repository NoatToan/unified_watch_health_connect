package db1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldb1/b;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum b {
    SINGLE,
    MULTIPLE;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f58988a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.MULTIPLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f58988a = iArr;
        }
    }

    public final String a(Context context) {
        int i14 = a.f58988a[ordinal()];
        if (i14 == 1) {
            String string = context.getString(R.string.pregnancy_single_child);
            string.getClass();
            return string;
        }
        if (i14 != 2) {
            u0.r();
            return null;
        }
        String string2 = context.getString(R.string.pregnancy_twins_multiples);
        string2.getClass();
        return string2;
    }
}
