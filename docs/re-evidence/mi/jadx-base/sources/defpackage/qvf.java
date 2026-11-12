package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.miui.tsmclient.account.IMiOAuth;
import com.miui.tsmclient.util.IDeviceInfo;
import com.service.mi.common.util.a;
import com.service.mi.entity.CardType;
import com.tsmclient.smartcard.terminal.external.IChannel;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes6.dex */
public class qvf {
    public static String A = null;
    public static String B = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f31883a = "https://overseas-bankcard-config.nfcpay.xiaomi.com/mastercard/wallet/getHostInfo";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f31884b = "https://staging.nfcpay.xiaomi.com/mastercard/wallet/getHostInfo";
    public static String c = "https://staging.nfcpay.xiaomi.com/mastercard/wallet/getHostInfo";
    public static String d = null;
    public static String e = null;
    public static String f = null;
    public static List<CardType> g = null;
    public static String h = "publickey";
    public static String i = "privatekey";
    public static String j = "publickeyvisa";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static IChannel f31885k = null;
    public static IChannel l = null;
    public static IMiOAuth m = null;
    public static IDeviceInfo n = null;
    public static String o = "accessToken";
    public static String p = "userId";
    public static String q = "nfcpay_api";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static String f31886r = null;
    public static String s = null;
    public static String t = null;
    public static String u = null;
    public static String v = null;
    public static int w = 0;
    public static String x = null;
    public static String y = null;
    public static boolean z = true;

    public static void a() {
        IDeviceInfo iDeviceInfo;
        IDeviceInfo iDeviceInfo2;
        IDeviceInfo iDeviceInfo3;
        if (TextUtils.isEmpty(u) && (iDeviceInfo3 = n) != null) {
            String deviceModel = iDeviceInfo3.getDeviceModel();
            u = deviceModel;
            z5i.c(!TextUtils.isEmpty(deviceModel), "deviceModel获取失败");
        }
        if (TextUtils.isEmpty(t) && (iDeviceInfo2 = n) != null) {
            String deviceId = iDeviceInfo2.getDeviceId(a.a());
            t = deviceId;
            z5i.c(!TextUtils.isEmpty(deviceId), "deviceId获取失败");
        }
        if (w != 0 || (iDeviceInfo = n) == null) {
            return;
        }
        int deviceType = iDeviceInfo.getDeviceType();
        w = deviceType;
        z5i.c(deviceType != 0, "deviceType获取失败");
    }

    public static void b() throws ExecutionException, InterruptedException {
        if (TextUtils.isEmpty(x) || TextUtils.isEmpty(y)) {
            Future<Bundle> accessToken = m.getAccessToken(z ? f31886r : q);
            z5i.c(accessToken != null, "设备认证失败：IMiOAuth返回空");
            Bundle bundle = accessToken.get();
            z5i.c(bundle != null, "设备认证失败：IMiOAuth返回空数据");
            x = bundle.getString(o);
            y = bundle.getString(p);
            z5i.c(x != null, "设备认证失败：token为空");
            z5i.c(y != null, "设备认证失败：userId为空");
        }
    }

    public static void c(String str) {
        z5i.b(str, "HostUrl cannot be null");
        e = str + "mastercard/wallet/sdk";
        d = str + "visa/wallet/sdk";
        f = str + "mastercard/tsm";
    }
}
