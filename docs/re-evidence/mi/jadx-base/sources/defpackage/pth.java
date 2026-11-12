package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.telephony.TelephonyManager;
import com.xiaomi.account.privacy_data.master.PrivacyDataMaster;
import com.xiaomi.account.privacy_data.master.PrivacyDataType;
import com.xiaomi.accountsdk.utils.AccountLogger;

/* JADX INFO: loaded from: classes11.dex */
public class pth implements euh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile pth f30755b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f30756a;

    public pth(Context context) {
        this.f30756a = context;
    }

    public static pth g(Context context) {
        if (f30755b == null) {
            synchronized (pth.class) {
                try {
                    if (f30755b == null) {
                        f30755b = new pth(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f30755b;
    }

    @Override // defpackage.euh
    public String a(int i) {
        return PrivacyDataMaster.forceGet(this.f30756a, PrivacyDataType.NETWORK_MCCMNC, String.valueOf(i));
    }

    @Override // defpackage.euh
    public boolean b(int i) {
        return Boolean.parseBoolean(PrivacyDataMaster.forceGet(this.f30756a, PrivacyDataType.MOBILE_DATA_ENABLE, String.valueOf(i)));
    }

    @Override // defpackage.euh
    public int c(int i) {
        return ((TelephonyManager) this.f30756a.getSystemService("phone")).createForSubscriptionId(i).getPhoneType();
    }

    @Override // defpackage.euh
    public boolean d() {
        return Boolean.parseBoolean(PrivacyDataMaster.forceGet(this.f30756a, PrivacyDataType.MOBILE_DATA_ENABLE, new String[0]));
    }

    @Override // defpackage.euh
    public bcm e(int i) {
        String strH;
        String strI;
        String strJ = null;
        try {
            strH = h(i);
            try {
                strI = i(i);
                try {
                    strJ = j(i);
                } catch (SecurityException e) {
                    e = e;
                    AccountLogger.log("PhoneInfo", "tryGetSimForSubId", e);
                }
            } catch (SecurityException e2) {
                e = e2;
                strI = null;
            }
        } catch (SecurityException e3) {
            e = e3;
            strH = null;
            strI = null;
        }
        return new bcm(strH, strI, k(i), strJ);
    }

    @Override // defpackage.euh
    @SuppressLint({"HardwareIds"})
    public String f() {
        return PrivacyDataMaster.get(this.f30756a, PrivacyDataType.DEVICE_ID, new String[0]);
    }

    @Override // defpackage.euh
    public String getDeviceId() {
        return f();
    }

    @Override // defpackage.euh
    public int getPhoneCount() {
        return ((TelephonyManager) this.f30756a.getSystemService("phone")).getPhoneCount();
    }

    public String h(int i) {
        return PrivacyDataMaster.forceGet(this.f30756a, PrivacyDataType.ICCID, String.valueOf(i));
    }

    public String i(int i) {
        return PrivacyDataMaster.forceGet(this.f30756a, PrivacyDataType.IMSI, String.valueOf(i));
    }

    public String j(int i) {
        return PrivacyDataMaster.forceGet(this.f30756a, PrivacyDataType.LINE_1_NUMBER, String.valueOf(i));
    }

    public String k(int i) {
        return PrivacyDataMaster.forceGet(this.f30756a, PrivacyDataType.MCCMNC, String.valueOf(i));
    }
}
