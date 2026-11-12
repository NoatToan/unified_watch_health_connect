package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hianalytics.process.HiAnalyticsConfig;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class gqy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    HiAnalyticsInstance f35946c;

    public static String e() {
        return "85040100";
    }

    public static String b(Context context, String str, String str2) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(context.getAssets().open(str), "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                } else {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return new JSONObject(sb.toString()).getString(str2);
                }
            }
        } catch (IOException unused) {
            grn.c("AAR,HiAUtil", "getConfigUrl IOException");
            return null;
        } catch (JSONException unused2) {
            grn.c("AAR,HiAUtil", "getConfigUrl JSONException");
            return null;
        }
    }

    public void d(Context context) {
        String strB = b(context, "config.json", "dotUrl");
        if (TextUtils.isEmpty(strB)) {
            grn.c("AAR,HiAUtil", "init IOException");
            return;
        }
        HiAnalyticsConfig hiAnalyticsConfigBuild = new HiAnalyticsConfig.Builder().setChannel("RoadDataDownload").setCollectURL(strB).build();
        HiAnalyticsConfig hiAnalyticsConfigBuild2 = new HiAnalyticsConfig.Builder().setCollectURL(strB).build();
        if (this.f35946c == null) {
            this.f35946c = new HiAnalyticsInstance.Builder(context).setOperConf(hiAnalyticsConfigBuild).setMaintConf(hiAnalyticsConfigBuild2).create("RoadDataDownload");
        }
        this.f35946c = new HiAnalyticsInstance.Builder(context).setOperConf(hiAnalyticsConfigBuild).setMaintConf(hiAnalyticsConfigBuild2).refresh("RoadDataDownload");
    }

    public int b(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        grn.a("AAR,HiAUtil", " type = " + i + " eventId = " + str + " content = " + linkedHashMap.toString());
        HiAnalyticsInstance hiAnalyticsInstance = this.f35946c;
        if (hiAnalyticsInstance != null) {
            hiAnalyticsInstance.onEvent(i, str, linkedHashMap);
            b();
            return 0;
        }
        grn.a("AAR,HiAUtil", "setEvent instance is null");
        return -1;
    }

    public void b() {
        grn.d("AAR,HiAUtil", "onReport");
        this.f35946c.onReport(1);
        this.f35946c.onReport(0);
    }

    private gqy() {
    }

    static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final gqy f35947b = new gqy();
    }

    public static gqy d() {
        return c.f35947b;
    }
}
