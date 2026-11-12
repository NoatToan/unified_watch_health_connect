package br2;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbr2/d;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum d {
    CONNECTED,
    CONNECTING,
    NFC_NOT_CONNECTED,
    NOT_CONNECTED,
    NOT_PAIRED;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19593a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.NFC_NOT_CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.NOT_CONNECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f19593a = iArr;
        }
    }

    public final String a(Context context) {
        context.getClass();
        int i14 = a.f19593a[ordinal()];
        if (i14 == 1) {
            String string = context.getString(R.string.devices_connected);
            string.getClass();
            return string;
        }
        if (i14 == 2) {
            String string2 = context.getString(R.string.wallet_status_securing_connection);
            string2.getClass();
            return string2;
        }
        if (i14 == 3) {
            String string3 = context.getString(R.string.wallet_status_not_connected_to_garminpay);
            string3.getClass();
            return string3;
        }
        if (i14 != 4) {
            String string4 = context.getString(R.string.txt_garmin_device_not_paired);
            string4.getClass();
            return string4;
        }
        String string5 = context.getString(R.string.devices_not_connected);
        string5.getClass();
        return string5;
    }
}
