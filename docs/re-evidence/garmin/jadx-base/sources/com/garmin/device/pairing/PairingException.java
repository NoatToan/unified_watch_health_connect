package com.garmin.device.pairing;

import am.j;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import om2.b;
import rs2.c;
import yl2.e;

/* JADX INFO: loaded from: classes11.dex */
public class PairingException extends Exception {
    private e mFailure;
    private String mFailureCode;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50924a;

        static {
            int[] iArr = new int[e.values().length];
            f50924a = iArr;
            try {
                iArr[e.NULL_OR_EMPTY_DEVICE_XML_BYTES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50924a[e.XML_DOWNLOAD_FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50924a[e.DISCONNECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50924a[e.CONNECTION_TIMED_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50924a[e.CONNECTION_FAILURE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50924a[e.BAD_BLUETOOTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50924a[e.PASSKEY_TIMEOUT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public PairingException(b bVar, e eVar, String str) {
        String opName = parseOpName(bVar);
        StringBuilder sb3 = new StringBuilder("Failed operation [");
        sb3.append(opName);
        sb3.append("] ");
        sb3.append(eVar);
        sb3.append(" (");
        super(j.o(str, ")", sb3));
        this.mFailure = eVar;
        this.mFailureCode = str;
    }

    private static String parseOpName(b bVar) {
        return bVar != null ? bVar.a().replace("PAIR#", "") : PrivacyUpdateRequestError.UNKNOWN;
    }

    public String getFailureCode() {
        return this.mFailureCode;
    }

    public e getPairingFailure() {
        return this.mFailure;
    }

    public boolean isConnectionError(c cVar) {
        switch (a.f50924a[this.mFailure.ordinal()]) {
            case 1:
            case 2:
                return cVar == null || !cVar.getConfigurationFlags().contains(90);
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    public PairingException(e eVar, String str) {
        this(null, eVar, str);
    }

    public PairingException(b bVar, e eVar) {
        this(bVar, eVar, null);
    }

    public PairingException(e eVar) {
        this(eVar, (String) null);
    }
}
