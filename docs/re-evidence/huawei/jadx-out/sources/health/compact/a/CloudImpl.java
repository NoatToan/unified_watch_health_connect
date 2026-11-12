package health.compact.a;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.browse.Cloudapi;
import com.huawei.hwcommonmodel.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class CloudImpl implements Cloudapi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile CloudImpl f36524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Context f36525c;
    private static final Object d = new Object();

    private CloudImpl() {
    }

    public static CloudImpl e(Context context) {
        if (f36524b == null) {
            synchronized (d) {
                if (f36524b == null) {
                    f36524b = new CloudImpl();
                    f36525c = context == null ? BaseApplication.getContext() : context.getApplicationContext();
                    LoginInit.setCloudapi(f36524b);
                }
            }
        }
        return f36524b;
    }

    @Override // com.huawei.browse.Cloudapi
    public boolean isOverseaJudgeByCountry(String str) {
        String strA;
        if ("CN".equalsIgnoreCase(str)) {
            return true;
        }
        String[] stringArray = f36525c.getResources().getStringArray(R.array.eu_national_code);
        if (TextUtils.isEmpty(str)) {
            str = Locale.getDefault().getCountry();
        }
        com.huawei.hwlogsmodel.LogUtil.a("PLGLOGIN_CloudImpl", "isOverseaJudgeByCountry() country=", str);
        for (String str2 : stringArray) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        String str3 = CommonUtil.bu() ? com.huawei.common.util.Utils.HEALTH_OVER_SEA : com.huawei.common.util.Utils.HEALTH_OVER_SEA_BETA;
        if (AuthorizationUtils.c(f36525c)) {
            strA = GRSManager.c(f36525c).getNoCheckUrl("SITEID", str3, str);
        } else {
            strA = a("SITEID", str3, str);
        }
        com.huawei.hwlogsmodel.LogUtil.d("PLGLOGIN_CloudImpl", "isOverseaJudgeByCountry() healthCloudUrl=", strA);
        return !TextUtils.isEmpty(strA);
    }

    @Override // com.huawei.browse.Cloudapi
    public int getSiteIdByCountry(String str) {
        String strA;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (str.equalsIgnoreCase("CN")) {
            return 1;
        }
        String str2 = CommonUtil.bu() ? com.huawei.common.util.Utils.HEALTH_OVER_SEA : com.huawei.common.util.Utils.HEALTH_OVER_SEA_BETA;
        if (AuthorizationUtils.c(f36525c)) {
            strA = GRSManager.c(f36525c).getNoCheckUrl("SITEID", str2, str);
            com.huawei.hwlogsmodel.LogUtil.a("PLGLOGIN_CloudImpl", "getSiteIdByCountry() healthCloudUrl=", strA);
        } else {
            strA = a("SITEID", str2, str);
            com.huawei.hwlogsmodel.LogUtil.a("PLGLOGIN_CloudImpl", "getSiteIdByCountry() local healthCloudUrl=", strA);
        }
        return e(strA);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    private int e(String str) {
        int i = 0;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        str.hashCode();
        switch (str) {
            case "https://sportdata-dre.things.dbankcloud.com":
            case "https://sportdata-dre.things.dbankcloud.cn":
                i = 7;
                break;
            case "https://healthdeviceagent-dra.things.hicloud.com":
            case "https://sportdata-dra.things.dbankcloud.com":
                i = 5;
                break;
            case "https://sporthealth-drcn.dbankcdn.cn":
            case "https://sporthealth-drcn.dbankcdn.com":
                i = 1;
                break;
            case "https://sportdata-drru.things.dbankcloud.com":
            case "https://sportdata-drru.things.dbankcloud.cn":
                i = 8;
                break;
        }
        com.huawei.hwlogsmodel.LogUtil.a("PLGLOGIN_CloudImpl", "getSiteIdByUrl() getSiteIdByUrl=", Integer.valueOf(i));
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private String a(String str, String str2, String str3) {
        com.huawei.hwlogsmodel.LogUtil.d("PLGLOGIN_CloudImpl", "key= ", str, "service= ", str2, "countryCode= ", str3);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            com.huawei.hwlogsmodel.LogUtil.j("PLGLOGIN_CloudImpl", "input is null");
            return "";
        }
        Context context = BaseApplication.getContext();
        StringBuilder sb = new StringBuilder();
        try {
            InputStream inputStreamOpen = context.getAssets().open("grs_app_global_route_config.json");
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, StandardCharsets.UTF_8));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th;
                }
                bufferedReader.close();
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                try {
                    JSONArray jSONArray = new JSONObject(sb.toString()).getJSONArray("services");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        if (str2.equals(jSONObject.getString("name"))) {
                            return a(jSONObject.getJSONArray("servings"), e(str3, jSONObject.getJSONArray("countryGroups")), str);
                        }
                    }
                } catch (JSONException unused) {
                    com.huawei.hwlogsmodel.LogUtil.j("PLGLOGIN_CloudImpl", "json exception");
                }
                return "";
            } catch (Throwable th4) {
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                throw th4;
            }
        } catch (IOException unused2) {
            com.huawei.hwlogsmodel.LogUtil.j("PLGLOGIN_CloudImpl", "io Exception");
            return "";
        }
    }

    private static String e(String str, JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                if (jSONArray.getJSONObject(i).getString("countries").contains(str)) {
                    return jSONArray.getJSONObject(i).getString("id");
                }
            } catch (JSONException unused) {
                com.huawei.hwlogsmodel.LogUtil.j("PLGLOGIN_CloudImpl", "getCountryGroupId json exception");
                return "";
            }
        }
        return "";
    }

    private static String a(JSONArray jSONArray, String str, String str2) {
        if (jSONArray == null || jSONArray.length() == 0 || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (str.equals(jSONObject.getString("countryGroup"))) {
                    return jSONObject.getJSONObject("addresses").getString(str2);
                }
            } catch (JSONException unused) {
                com.huawei.hwlogsmodel.LogUtil.j("PLGLOGIN_CloudImpl", "getAddress json exception");
                return "";
            }
        }
        return "";
    }
}
