package eb1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Leb1/d;", "", "", "displayImageView", "<init>", "(Ljava/lang/String;IZ)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum d {
    HAD_BABY(true),
    EXPERIENCED_LOSS(false, 1, null),
    PREFER_NOT_SAY(false, 1, null);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f63667a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f63668a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.HAD_BABY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.EXPERIENCED_LOSS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.PREFER_NOT_SAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f63668a = iArr;
        }
    }

    /* synthetic */ d(boolean z14, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14);
    }

    public final String a(Context context) {
        int i14 = a.f63668a[ordinal()];
        if (i14 == 1) {
            String string = context.getString(R.string.pregnancy_had_my_baby);
            string.getClass();
            return string;
        }
        if (i14 == 2) {
            String string2 = context.getString(R.string.pregnancy_experienced_a_loss);
            string2.getClass();
            return string2;
        }
        if (i14 != 3) {
            u0.r();
            return null;
        }
        String string3 = context.getString(R.string.lbl_reason_other);
        string3.getClass();
        return string3;
    }

    d(boolean z14) {
        this.f63667a = z14;
    }
}
