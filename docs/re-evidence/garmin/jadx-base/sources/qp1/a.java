package qp1;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import lc.u0;
import o4.f0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lqp1/a;", "", "", NotificationConstants.KEY_DATA_MIME_TYPE, "", "title", TtmlNode.ATTR_TTS_COLOR, "<init>", "(Ljava/lang/String;ILjava/lang/String;II)V", "a", "gcm-solar-intensity_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum a {
    CHARGE("CHARGE", R.string.solar_intensity, R.color.solar_intensity_active),
    USB_CONNECTED("USB_CONNECTED", R.string.lbl_usb_connected, R.color.solar_intensity_usb_connected),
    BATTERY_FULL("BATTERY_FULL", R.string.lbl_battery_full, R.color.solar_intensity_battery_full),
    BATTERY_COLD("BATTERY_COLD", R.string.lbl_battery_cold, R.color.solar_intensity_battery_cold),
    BATTERY_HOT("BATTERY_HOT", R.string.lbl_battery_hot, R.color.solar_intensity_battery_hot);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2751a f146016c = new C2751a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f146023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f146024b;

    a(String str, int i14, int i15) {
        this.f146023a = i14;
        this.f146024b = i15;
    }

    /* JADX INFO: renamed from: qp1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqp1/a$a;", "", "<init>", "()V", "gcm-solar-intensity_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2751a {

        /* JADX INFO: renamed from: qp1.a$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2752a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f146025a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.CHARGE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.USB_CONNECTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.BATTERY_FULL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.BATTERY_COLD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.BATTERY_HOT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f146025a = iArr;
            }
        }

        public /* synthetic */ C2751a(j jVar) {
            this();
        }

        public static long a(a aVar) {
            aVar.getClass();
            x1 x1Var = n.f135158a;
            int i14 = C2752a.f146025a[aVar.ordinal()];
            if (i14 == 1) {
                return f0.d(4292637733L);
            }
            if (i14 == 2) {
                return f0.d(4284030704L);
            }
            if (i14 == 3) {
                return f0.d(4280520495L);
            }
            if (i14 == 4) {
                return f0.d(4279656390L);
            }
            if (i14 == 5) {
                return f0.d(4288544781L);
            }
            u0.r();
            return 0L;
        }

        private C2751a() {
        }
    }
}
