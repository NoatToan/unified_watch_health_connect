package defpackage;

import com.huawei.android.airsharing.api.PlayInfo;
import com.huawei.health.BuildConfig;

/* JADX INFO: loaded from: classes20.dex */
public class xov {
    public static String a() {
        return xpo.b().e("WALLET_MERCHANT_ID", BuildConfig.WALLET_MERCHANT_ID);
    }

    public static String b() {
        return xpo.b().e(PlayInfo.KEY_APP_NAME, "hiwallet");
    }

    public static String e() {
        return xpo.b().e("SERVICENAME_CFG_WALLETSERVICES", "hiwalletServices");
    }
}
