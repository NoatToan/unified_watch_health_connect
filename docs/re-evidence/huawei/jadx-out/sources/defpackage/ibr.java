package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.utils.ActivityHtmlPathApi;
import com.huawei.operation.utils.OperationUtilsApi;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes31.dex */
public class ibr {
    public static String e(String str, dlp dlpVar) {
        LogUtil.d("Suggestion_RecommendActivityHelper", "getOperationActivityUrl activityUrl = ", str);
        if (dlpVar.q() == 4) {
            LogUtil.a("Suggestion_RecommendActivityHelper", "Enter ACTIVITY_TEMPLATETYPE_NO_DETAIL");
            return dlpVar.e();
        }
        return d(str, dlpVar);
    }

    private static String d(String str, dlp dlpVar) {
        String str2;
        String str3 = str + ((ActivityHtmlPathApi) Services.b("PluginOperation", ActivityHtmlPathApi.class)).getActivityHtmlPath();
        if (dlpVar.i() == -1) {
            str2 = str3 + "activityShare";
        } else if (c(dlpVar)) {
            str2 = str3 + "rankList";
        } else {
            str2 = str3 + "calendar";
        }
        if (dlpVar.q() == 5) {
            str2 = str2 + "New";
        }
        String str4 = str2 + ".html?activityId=" + dlpVar.d();
        if (dlpVar.i() == -1) {
            return str4;
        }
        return str4 + "&activityName=" + dlpVar.c();
    }

    public static boolean b(dlp dlpVar) {
        return dlpVar.h() == 400;
    }

    private static boolean c(dlp dlpVar) {
        OperationUtilsApi operationUtilsApi = (OperationUtilsApi) Services.d("PluginOperation", OperationUtilsApi.class);
        if (operationUtilsApi == null) {
            return false;
        }
        return operationUtilsApi.isChallengeActivity(dlpVar.h());
    }

    public static int c(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            LogUtil.j("Suggestion_RecommendActivityHelper", "curDate or startDate or endDate is empty");
            return 2;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        try {
            Date date = simpleDateFormat.parse(str);
            Date date2 = simpleDateFormat.parse(str3);
            Date date3 = simpleDateFormat.parse(str2);
            if (date.getTime() < date3.getTime()) {
                return 0;
            }
            if (date3.getTime() <= date.getTime() && date.getTime() <= date2.getTime()) {
                return 1;
            }
            if (date2.getTime() < date.getTime()) {
                return -1;
            }
            LogUtil.j("Suggestion_RecommendActivityHelper", "current time is invalid , use default status:  ", 1);
            return 1;
        } catch (ParseException e) {
            LogUtil.e("Suggestion_RecommendActivityHelper", "getGMTtoLocal(),Exception e = ", LogAnonymous.b(e));
            return 2;
        }
    }

    public static boolean b(String str) {
        LogUtil.a("Suggestion_RecommendActivityHelper", "judgeVersionSupport enter!");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Suggestion_RecommendActivityHelper", "judgeVersionSupport cloudVersion is empty");
            return true;
        }
        String strA = CommonUtil.a(BaseApplication.getContext());
        if (TextUtils.isEmpty(strA)) {
            LogUtil.j("Suggestion_RecommendActivityHelper", "judgeVersionSupport version is empty");
            return true;
        }
        LogUtil.d("Suggestion_RecommendActivityHelper", "version from app = ", strA);
        LogUtil.d("Suggestion_RecommendActivityHelper", "version from cloud = ", str);
        int iIndexOf = strA.indexOf(Constants.LINK);
        LogUtil.d("Suggestion_RecommendActivityHelper", "index:  ", Integer.valueOf(iIndexOf));
        if (iIndexOf >= 0) {
            strA = strA.substring(0, iIndexOf);
        }
        while (!"".equals(strA)) {
            int iA = qrs.a(strA.substring(0, strA.contains(".") ? strA.indexOf(".") : strA.length()));
            if (!strA.contains(".")) {
                strA = "";
            } else {
                strA = strA.substring(strA.indexOf(".") + 1);
            }
            int iA2 = qrs.a(str.substring(0, str.contains(".") ? str.indexOf(".") : str.length()));
            str = str.substring(str.indexOf(".") + 1);
            if (iA > iA2) {
                return true;
            }
            if (iA < iA2) {
                return false;
            }
        }
        return true;
    }

    public static void c(Context context, boolean z) {
        String str;
        StorageParams storageParams = new StorageParams();
        if (z) {
            str = "TRUE_VALUE";
        } else {
            str = "FALSE_VALUE";
        }
        SharedPreferenceManager.e(context, Integer.toString(10011), "SOCIAL_FRAGMENT_IS_NEED_UPDATE_ACTIVITY", str, storageParams);
    }
}
