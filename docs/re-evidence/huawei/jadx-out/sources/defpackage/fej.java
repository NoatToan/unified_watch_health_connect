package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.google.json.JsonSanitizer;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.io.File;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class fej {
    public static fdi d(String str, String str2, String str3) {
        ReleaseLogUtil.d("R_CloudFeatureFileAnalysisUtil", "getFeatureFileExtInfo start, configId: ", str, ", packageName: ", str3);
        try {
            fdn fdnVar = (fdn) HiJsonUtil.d(JsonSanitizer.sanitize(CommonUtil.q(fdy.d(str, "feature_" + LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010) + "_app", str2))), fdn.class);
            if (fdnVar != null && fdnVar.c() != null) {
                ReleaseLogUtil.d("R_CloudFeatureFileAnalysisUtil", "getFeatureFileExtInfo current local feature file version is ", Integer.valueOf(fdnVar.b()));
                for (fdi fdiVar : fdnVar.c()) {
                    if (str3.equals(fdiVar.b())) {
                        ReleaseLogUtil.d("R_CloudFeatureFileAnalysisUtil", "getFeatureFileExtInfo: ", str3, " found");
                        return fdiVar;
                    }
                }
                ReleaseLogUtil.d("R_CloudFeatureFileAnalysisUtil", "getFeatureFileExtInfo cannot found feature: ", str3);
                return null;
            }
            ReleaseLogUtil.d("R_CloudFeatureFileAnalysisUtil", "getFeatureFileExtInfo: File content or feature list is missing");
            return null;
        } catch (JsonSyntaxException e) {
            ReleaseLogUtil.a("R_CloudFeatureFileAnalysisUtil", "JsonSyntaxException in getFeatureFileExtInfo: ", LogAnonymous.b(e));
        }
    }

    public static boolean a(String str, String str2, String str3) {
        String str4 = "isFeatureSupport, configId: " + str + ", packageName: " + str3 + ", ";
        fdi fdiVarD = d(str, str2, str3);
        if (fdiVarD == null) {
            ReleaseLogUtil.e("R_CloudFeatureFileAnalysisUtil", str4, "feature not found");
            return false;
        }
        Integer numD = fdiVarD.d();
        fdl fdlVarC = fdiVarD.c();
        String str5 = str4 + "support=" + numD;
        if (numD != null && numD.intValue() != 1) {
            ReleaseLogUtil.d("R_CloudFeatureFileAnalysisUtil", str5);
            return false;
        }
        if (fdlVarC == null) {
            ReleaseLogUtil.d("R_CloudFeatureFileAnalysisUtil", str5);
            Integer num = 1;
            return num.equals(numD);
        }
        String strA = fdlVarC.a();
        if (!d(strA)) {
            ReleaseLogUtil.e("R_CloudFeatureFileAnalysisUtil", str5, ", invalid suppVer=", strA);
            Integer num2 = 1;
            return num2.equals(numD);
        }
        String strA2 = CommonUtil.a((Context) null);
        if (strA2.contains(Constants.LINK)) {
            strA2 = strA2.substring(0, strA2.indexOf(45));
        }
        String str6 = strA2;
        int iE = CommonUtil.e(str6, strA);
        ReleaseLogUtil.d("R_CloudFeatureFileAnalysisUtil", str5, ", currVer=", str6, ", suppVer=", strA, ", compResult=", Integer.valueOf(iE));
        return iE >= 0;
    }

    private static boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length != 4) {
            return false;
        }
        for (String str2 : strArrSplit) {
            if (!StringUtils.a(str2)) {
                return false;
            }
        }
        return true;
    }

    public static void d(DownloadCallback<File> downloadCallback) {
        String str = "feature_" + LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010);
        String str2 = str + "_app";
        String str3 = str + "_device";
        HashMap map = new HashMap();
        map.put("configType", TrackConstants$Events.FEATURE);
        DownloadCallback<File> downloadCallbackA = a(str, "_app");
        if (downloadCallback == null) {
            downloadCallback = a(str, "_device");
        }
        fdy.d(new fda("com.huawei.health_deviceFeature_config", map), str2, 1, downloadCallbackA);
        fdy.d(new fda("com.huawei.health_deviceFeature_config", map), str3, 1, downloadCallback);
    }

    private static DownloadCallback<File> a(final String str, final String str2) {
        return new DownloadCallback<File>() { // from class: fej.3
            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onFinish(File file) {
                ReleaseLogUtil.d("R_CloudFeatureFileAnalysisUtil", "updateFeatureConfig onFinish, data is: ", file.getName());
                if ("_device".equals(str2)) {
                    fec.d().b("com.huawei.health_deviceFeature_config", str + str2, (String) null);
                }
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onProgress(long j, long j2, boolean z, String str3) {
                LogUtil.a("CloudFeatureFileAnalysisUtil", "updateFeatureConfig onProgress, handleBytes: ", Long.valueOf(j), ", contentLength: ", Long.valueOf(j2), ", isDone: ", Boolean.valueOf(z), ", fileId: ", str3);
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onFail(int i, Throwable th) {
                ReleaseLogUtil.d("R_CloudFeatureFileAnalysisUtil", "updateFeatureConfig on Fail: ", LogAnonymous.b(th), ", errCode: ", Integer.valueOf(i));
            }
        };
    }

    public static JSONObject c(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resultCode", -1);
            jSONObject.put("resultDesc", "Cloud config file caused JSONException");
            ReleaseLogUtil.d("R_CloudFeatureFileAnalysisUtil", "getContextByFeature start");
            fdi fdiVarD = d(str, "txt", str2);
            if (fdiVarD == null) {
                ReleaseLogUtil.a("R_CloudFeatureFileAnalysisUtil", "getContextByFeature: Feature not found");
                jSONObject.put("resultDesc", "Feature not found");
                return jSONObject;
            }
            jSONObject.put("resultCode", 0);
            jSONObject.put("resultDesc", new JSONObject(HiJsonUtil.d(fdiVarD)));
            return jSONObject;
        } catch (JSONException e) {
            ReleaseLogUtil.a("R_CloudFeatureFileAnalysisUtil", "getContextByFeature JSONException: ", LogAnonymous.b(e));
            return jSONObject;
        }
    }

    public static String b(String str, String str2) {
        ReleaseLogUtil.d("R_CloudFeatureFileAnalysisUtil", "getFeatureFileExtInfo start, configId: ", str);
        return CommonUtil.q(fdy.d(str, "feature_" + LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010) + "_app", str2));
    }
}
