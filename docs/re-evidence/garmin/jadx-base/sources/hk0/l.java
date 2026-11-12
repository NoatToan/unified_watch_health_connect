package hk0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhk0/l;", "Lcom/garmin/device/nfc/f;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements com.garmin.device.nfc.f {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84076a;

        static {
            int[] iArr = new int[com.garmin.device.nfc.k.values().length];
            try {
                iArr[com.garmin.device.nfc.k.APDU_TRANSFER_STATUS_NOTIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.device.nfc.k.DEVICE_DRIVEN_SOCKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f84076a = iArr;
        }
    }
}
