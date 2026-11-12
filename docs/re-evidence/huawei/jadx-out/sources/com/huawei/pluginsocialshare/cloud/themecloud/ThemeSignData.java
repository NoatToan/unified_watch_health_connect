package com.huawei.pluginsocialshare.cloud.themecloud;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hms.network.embedded.j2;
import com.huawei.hms.network.embedded.w9;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hwcommonmodel.R;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.IRequest;
import com.huawei.networkclient.ParamsFactory;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.ofe;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LogUtil;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes15.dex */
public class ThemeSignData implements IRequest, ParamsFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("resultcode")
    private int f22559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("resultinfo")
    private String f22560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f22561c;

    @SerializedName(HwPayConstant.KEY_SIGN)
    private String e;

    public ThemeSignData(Context context) {
        if (context == null) {
            this.f22561c = BaseApplication.b();
        } else {
            this.f22561c = context.getApplicationContext();
        }
    }

    public String e() {
        return this.e;
    }

    public int d() {
        return this.f22559a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("ThemeSignFactory{sign=");
        stringBuffer.append(this.e);
        stringBuffer.append("resultinfo=").append(this.f22560b);
        stringBuffer.append(", resultcode=").append(this.f22559a);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(this.f22561c).getUrl("domainThemeCloud") + "/servicesupport/theme/tis/service/getFrontParam.do";
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, String> getHeaders() {
        HashMap map = new HashMap();
        map.put(j2.v, "gzip, deflate");
        map.put("Connection", w9.j);
        map.put(ProfileRequestConstants.X_APPID_KEY, "10013");
        String strReplace = "1.0";
        try {
            Matcher matcher = Pattern.compile("^[0-9.,x]*").matcher(BaseApplication.i());
            if (matcher.find()) {
                strReplace = matcher.group(0).replace(".", "");
            }
        } catch (PatternSyntaxException e) {
            LogUtil.d("ThemeSignFactory", "getHeaders ex=", LogUtil.c(e));
        }
        map.put("versionCode", strReplace);
        String strD = d(20);
        LogUtil.b("ThemeSignFactory", "random request :", strD);
        map.put(WatchFaceConstant.X_CLIENTTRACEID, strD);
        map.put("x-hc", GRSManager.c(this.f22561c).getCommonCountryCode());
        map.put("x-devicemodel", Build.MODEL);
        return map;
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, Object> getBody(Object obj) {
        Map<String, Object> mapA = ofe.a(obj);
        if (mapA == null) {
            mapA = new HashMap<>();
        }
        mapA.put(JsbMapKeyNames.H5_USER_ID, LoginInit.getInstance(this.f22561c).getDeviceId());
        mapA.put("firmware", Build.VERSION.RELEASE);
        String strValueOf = String.valueOf(b(this.f22561c));
        mapA.put("screen", strValueOf + "*" + strValueOf);
        mapA.put("phoneType", Build.MODEL);
        String commonCountryCode = GRSManager.c(this.f22561c).getCommonCountryCode();
        mapA.put("local", CommonUtil.u() + "_" + commonCountryCode);
        mapA.put("isoCode", commonCountryCode);
        mapA.put("mcc", b(this.f22561c, commonCountryCode));
        mapA.put("type", "5");
        return mapA;
    }

    private String b(Context context, String str) {
        String[] stringArray = context.getResources().getStringArray(R.array.CountryCodes);
        com.huawei.hwlogsmodel.LogUtil.a("ThemeSignFactory", "getMobileCountryCode stringCountryId:", str);
        String str2 = "";
        if (stringArray == null) {
            return "";
        }
        for (String str3 : stringArray) {
            String[] strArrSplit = str3.split(",");
            if (strArrSplit.length > 1 && strArrSplit[1].trim().equals(str.trim())) {
                str2 = strArrSplit[0];
                break;
            }
        }
        LogUtil.b("ThemeSignFactory", "getMobileCountryCode resourceCountryCode:", str2);
        return str2;
    }

    private static int b(Context context) {
        Point point = new Point();
        Object systemService = context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (!(systemService instanceof WindowManager)) {
            return point.x;
        }
        ((WindowManager) systemService).getDefaultDisplay().getRealSize(point);
        return point.x;
    }

    private String d(int i) {
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder sb = new StringBuilder(i);
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(secureRandom.nextInt(10));
        }
        return sb.toString();
    }
}
