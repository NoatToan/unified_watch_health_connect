package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.google.common.base.Ascii;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class odk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f44201b = "AkaSimAuth";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f44202a;
    private final String d;

    public odk(Context context, String str) {
        this.f44202a = context;
        this.d = str;
    }

    private byte[] c(String str) {
        if (str != null && ocq.f44154c.booleanValue()) {
            ocq.e(f44201b, "Get rand and autn--data =" + str + "  dataLength=" + str.length());
        }
        byte[] bArrDecode = Base64.decode(str, 0);
        if (bArrDecode.length < 48) {
            ocq.e(f44201b, "bytesData len = " + bArrDecode.length + ", illegal.");
            return new byte[0];
        }
        byte[] bArr = new byte[16];
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < 16; i++) {
            bArr[i] = bArrDecode[i + 12];
            bArr2[i] = bArrDecode[i + 32];
        }
        return odi.e(bArr, bArr2);
    }

    private String d(String str, int i) {
        if (str != null && this.f44202a != null) {
            byte[] bArrC = c(str);
            if (bArrC.length >= 32) {
                byte[] bArr = new byte[17];
                byte[] bArr2 = new byte[17];
                int i2 = 0;
                bArr[0] = 16;
                bArr2[0] = 16;
                while (i2 < 16) {
                    int i3 = i2 + 1;
                    bArr[i3] = bArrC[i2];
                    bArr2[i3] = bArrC[i2 + 16];
                    i2 = i3;
                }
                int iE = oco.e(this.f44202a, i);
                TelephonyManager telephonyManager = (TelephonyManager) this.f44202a.getSystemService(TelephonyManager.class);
                if (telephonyManager == null) {
                    ocq.c(f44201b, "telephonyManagerClass is null");
                    return null;
                }
                TelephonyManager telephonyManagerCreateForSubscriptionId = telephonyManager.createForSubscriptionId(iE);
                if (telephonyManagerCreateForSubscriptionId == null) {
                    return null;
                }
                String iccAuthentication = telephonyManagerCreateForSubscriptionId.getIccAuthentication(2, 129, Base64.encodeToString(odi.e(bArr, bArr2), 2));
                if (!TextUtils.isEmpty(iccAuthentication)) {
                    return iccAuthentication;
                }
                ocq.e(f44201b, "devAuth failed,devAuthResponse is empty");
                return null;
            }
            ocq.e(f44201b, "auth failed,data == null or wrong dataLength");
        }
        return null;
    }

    public String b(String str, int i) {
        String str2 = f44201b;
        ocq.a(str2, "requestDevAkaAuth data = " + str + ", slotId = " + i);
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArrB = b(bArrDecode);
        String strD = d(str, i);
        ocq.a(str2, "b64Result = " + strD);
        if (TextUtils.isEmpty(strD)) {
            return "";
        }
        byte[] bArrD = d(strD);
        byte[] bArrD2 = d(odi.e(odi.d(a(a(i), e(strD), b(strD))), 160));
        if (!a(bArrB, obj.b(b(bArrDecode, (byte[]) null), bArrD2))) {
            ocq.e(str2, "checkMac=: false");
            return "";
        }
        byte[] bArrD3 = d(bArrD, bArrDecode[1]);
        byte[] bArrB2 = obj.b(bArrD3, bArrD2);
        return Base64.encodeToString(b(bArrD3, bArrB2 != null ? Arrays.copyOfRange(bArrB2, 0, 16) : null), 2);
    }

    private boolean a(byte[] bArr, byte[] bArr2) {
        byte[] bArrCopyOfRange = bArr2 != null ? Arrays.copyOfRange(bArr2, 0, 16) : null;
        if (bArr != null && bArrCopyOfRange != null) {
            ocq.e(f44201b, "checkMac is true");
            return Arrays.equals(bArr, bArrCopyOfRange);
        }
        ocq.e(f44201b, "checkMac is false");
        return false;
    }

    private byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return new byte[0];
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length);
        int i = 8;
        while (i < bArr.length) {
            if (bArr[i] == 11) {
                if (bArr2 == null) {
                    Arrays.fill(bArrCopyOfRange, i + 4, i + 20, (byte) 0);
                    return bArrCopyOfRange;
                }
                for (int i2 = 0; i2 < bArr2.length; i2++) {
                    bArrCopyOfRange[i + 4 + i2] = bArr2[i2];
                }
                break;
            }
            i += bArr[i + 1] * 4;
        }
        return bArrCopyOfRange;
    }

    public byte[] b(byte[] bArr) {
        if (bArr == null) {
            return new byte[0];
        }
        int i = 8;
        while (i < bArr.length) {
            if (bArr[i] == 11) {
                return Arrays.copyOfRange(bArr, i + 4, i + 20);
            }
            i += bArr[i + 1] * 4;
        }
        return new byte[0];
    }

    private byte[] d(byte[] bArr, byte b2) {
        byte[] bArr2 = new byte[20];
        bArr2[0] = 11;
        bArr2[1] = 5;
        int length = bArr.length;
        byte[] bArr3 = new byte[length + 4];
        bArr3[0] = 3;
        bArr3[1] = (byte) ((length + 7) / 4);
        byte[] bArrC = odi.c(bArr.length * 8);
        bArr3[2] = bArrC[2];
        bArr3[3] = bArrC[3];
        System.arraycopy(bArr, 0, bArr3, 4, bArr.length);
        byte[] bArrC2 = odi.c((bArr2[1] * 4) + 8 + (bArr3[1] * 4));
        return odi.e(new byte[]{2, b2, bArrC2[2], bArrC2[3], Ascii.ETB, 1, 0, 0}, odi.e(bArr3, bArr2));
    }

    public byte[] d(String str) {
        if (TextUtils.isEmpty(str)) {
            ocq.e(f44201b, "Process response failed, authResult is empty, return");
            return new byte[0];
        }
        byte[] bArrDecode = Base64.decode(str, 0);
        String str2 = f44201b;
        ocq.e(str2, "AKA-auth byteAuthResult.length=" + bArrDecode.length + "byteAuthResult[0]=" + ((int) bArrDecode[0]));
        if (bArrDecode.length > 4 && bArrDecode[0] == -37) {
            ocq.e(str2, "AKA-auth success");
            int i = bArrDecode[1] + 2;
            if (i >= bArrDecode.length) {
                ocq.e(str2, " bad response, no CK data");
                return new byte[0];
            }
            if (bArrDecode[i] + i >= bArrDecode.length) {
                ocq.e(str2, " bad response, no IK data");
                return new byte[0];
            }
            return Arrays.copyOfRange(bArrDecode, 2, i);
        }
        if (bArrDecode[0] == -36 && bArrDecode.length >= 2) {
            ocq.e(str2, "SQN Synchronisation failure");
            return new byte[0];
        }
        ocq.a(str2, "unexpected condition.");
        return new byte[0];
    }

    public byte[] e(String str) {
        if (TextUtils.isEmpty(str)) {
            ocq.e(f44201b, "hexAuthResponse is null ,return");
            return new byte[0];
        }
        byte[] bArrDecode = Base64.decode(str, 0);
        if (bArrDecode.length > 4 && bArrDecode[0] == -37) {
            byte b2 = bArrDecode[1];
            int i = b2 + 2;
            if (i >= bArrDecode.length) {
                ocq.e(f44201b, " bad response,no CK data");
                return new byte[0];
            }
            byte b3 = bArrDecode[i];
            if (i + b3 >= bArrDecode.length) {
                ocq.e(f44201b, " bad response,no IK data");
                return new byte[0];
            }
            int i2 = b2 + 3;
            return Arrays.copyOfRange(bArrDecode, i2, b3 + i2);
        }
        if (bArrDecode[0] == -36 && bArrDecode.length >= 2) {
            ocq.e(f44201b, "SQN Synchronisation failure");
            return new byte[0];
        }
        ocq.a(f44201b, "unexpected condition.");
        return new byte[0];
    }

    public byte[] b(String str) {
        if (TextUtils.isEmpty(str)) {
            ocq.e(f44201b, "hexAuthResponse is null ,return");
            return new byte[0];
        }
        byte[] bArrDecode = Base64.decode(str, 0);
        if (bArrDecode.length > 4 && bArrDecode[0] == -37) {
            byte b2 = bArrDecode[1];
            int i = b2 + 2;
            if (i >= bArrDecode.length) {
                return new byte[0];
            }
            byte b3 = bArrDecode[i];
            if (i + b3 >= bArrDecode.length) {
                return new byte[0];
            }
            int i2 = b2 + 3 + b3;
            byte b4 = bArrDecode[i2];
            int i3 = i2 + 1;
            return Arrays.copyOfRange(bArrDecode, i3, b4 + i3);
        }
        if (bArrDecode[0] == -36 && bArrDecode.length >= 2) {
            return new byte[0];
        }
        ocq.a(f44201b, "unexpected condition.");
        return new byte[0];
    }

    private byte[] a(String str, byte[] bArr, byte[] bArr2) {
        try {
            return odi.a(odi.e(odi.e(str.getBytes("UTF-8"), bArr2), bArr));
        } catch (UnsupportedEncodingException unused) {
            return new byte[0];
        }
    }

    private byte[] d(byte[] bArr) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 16, 32);
        ocq.e(f44201b, "bytesAuthKey.length = " + bArrCopyOfRange.length + "bytesAuthKey = " + obj.b(bArrCopyOfRange));
        return bArrCopyOfRange;
    }

    public String a(int i) {
        Context context = this.f44202a;
        if (context != null) {
            int iE = oco.e(context, i);
            TelephonyManager telephonyManager = (TelephonyManager) this.f44202a.getSystemService(TelephonyManager.class);
            if (telephonyManager == null) {
                ocq.c(f44201b, "telephonyManagerClass is null");
                return "";
            }
            TelephonyManager telephonyManagerCreateForSubscriptionId = telephonyManager.createForSubscriptionId(iE);
            if (telephonyManagerCreateForSubscriptionId == null) {
                ocq.c(f44201b, "telephonyManager is null");
                return "";
            }
            String simOperator = telephonyManagerCreateForSubscriptionId.getSimOperator();
            if (TextUtils.isEmpty(simOperator) || simOperator.length() < 3) {
                ocq.c(f44201b, "mccMnc is invalid");
            } else {
                String strSubstring = simOperator.substring(0, 3);
                String strSubstring2 = simOperator.substring(3);
                if (strSubstring2.length() == 3) {
                    return "0" + this.d + "@nai.epc.mnc" + strSubstring2 + ".mcc" + strSubstring + ".3gppnetwork.org";
                }
                return "0" + this.d + "@nai.epc.mnc0" + strSubstring2 + ".mcc" + strSubstring + ".3gppnetwork.org";
            }
        }
        return "";
    }
}
