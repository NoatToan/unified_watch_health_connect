package ww0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lww0/i;", "", "<init>", "(Ljava/lang/String;I)V", "a", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum i {
    NONE,
    CONTRACEPTIVE_INJECTIONS,
    CONTRACEPTIVE_PATCH,
    IMPLANT,
    IUD,
    ORAL_CONTRACEPTION,
    VAGINAL_RING;


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f187563a = new a(null);

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f187572a;

        static {
            int[] iArr = new int[i.values().length];
            try {
                iArr[i.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.CONTRACEPTIVE_INJECTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i.CONTRACEPTIVE_PATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i.IMPLANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[i.IUD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[i.ORAL_CONTRACEPTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[i.VAGINAL_RING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f187572a = iArr;
        }
    }

    public final String a(Context context) {
        switch (b.f187572a[ordinal()]) {
            case 1:
                String string = context.getString(R.string.mct_none);
                string.getClass();
                return string;
            case 2:
                String string2 = context.getString(R.string.mct_contraceptive_injection);
                string2.getClass();
                return string2;
            case 3:
                String string3 = context.getString(R.string.mct_contraceptive_patch);
                string3.getClass();
                return string3;
            case 4:
                String string4 = context.getString(R.string.mct_implant);
                string4.getClass();
                return string4;
            case 5:
                String string5 = context.getString(R.string.mct_iud);
                string5.getClass();
                return string5;
            case 6:
                String string6 = context.getString(R.string.mct_oral_contraceptive);
                string6.getClass();
                return string6;
            case 7:
                String string7 = context.getString(R.string.mct_vaginal_ring);
                string7.getClass();
                return string7;
            default:
                u0.r();
                return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lww0/i$a;", "", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
