package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.work.PeriodicWorkRequest;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.json.JsonSanitizer;
import com.hihonor.assistant.cardmgrsdk.model.CardDispReqBuilder;
import com.hihonor.assistant.cardmgrsdk.model.CardDisplayRequestArg;
import com.hihonor.assistant.cardmgrsdk.model.ClickPendingIntent;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.haf.common.utils.AppInfoUtils;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.plugindaemon.R;
import health.compact.a.CommonUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class iph {
    public static final String d = BaseApplication.b().getPackageName();

    public static CardDisplayRequestArg e(int i, HiTrackMetaData hiTrackMetaData, long j, String str, String str2) {
        LogUtil.a("YoyoUtils", "getMovementCardArgs:  ", Integer.valueOf(i));
        StringBuilder sb = new StringBuilder();
        String str3 = d;
        sb.append(str3);
        sb.append("_add_one_card_");
        sb.append(i);
        ims imsVar = new ims(sb.toString());
        return new CardDispReqBuilder("health", str3 + "_add_one_card_" + i).businessParams("").detailType("").endTime(System.currentTimeMillis() + PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS).type(str).widgetPackage(str3).versionCode(d()).cardRemoteViews(imsVar.d(hiTrackMetaData, j, str2, str)).clickPendingIntents(imsVar.c()).setTitle(AppInfoUtils.a()).build();
    }

    public static CardDisplayRequestArg a(int i, WorkoutRecord workoutRecord, String str, String str2) {
        LogUtil.a("YoyoUtils", "getFitnessCardArgs:  ", Integer.valueOf(i));
        StringBuilder sb = new StringBuilder();
        String str3 = d;
        sb.append(str3);
        sb.append("_add_one_card_");
        sb.append(i);
        imt imtVar = new imt(sb.toString());
        return new CardDispReqBuilder("health", str3 + "_add_one_card_" + i).businessParams("").detailType("").endTime(System.currentTimeMillis() + PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS).type(str).widgetPackage(str3).versionCode(d()).cardRemoteViews(imtVar.e(workoutRecord, str2, str)).clickPendingIntents(imtVar.a()).setTitle(AppInfoUtils.a()).build();
    }

    private static int d() {
        LogUtil.a("YoyoUtils", "getVersioncode");
        int i = 1;
        try {
            int i2 = BaseApplication.b().getPackageManager().getPackageInfo(BaseApplication.b().getPackageName(), 0).versionCode;
            try {
                LogUtil.a("YoyoUtils", "versioncode ", Integer.valueOf(i2));
                return i2;
            } catch (PackageManager.NameNotFoundException unused) {
                i = i2;
                LogUtil.e("YoyoUtils", "NameNotFoundException is error");
                return i;
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    private static Intent c(String str, String str2) {
        LogUtil.a("YoyoUtils", "getHealthAppIntent selectClick=", str, " showTrack=", str2);
        Intent intent = new Intent();
        intent.addFlags(335544320);
        if (str.equals("walk") || str.equals("running")) {
            intent.setClassName(BaseApplication.b(), "com.huawei.healthcloud.plugintrack.ui.activity.TrackDetailActivity");
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("movement", str2);
            }
        }
        if (str.equals("stretch")) {
            idy.a((String) null);
            WorkoutRecord workoutRecord = new WorkoutRecord();
            workoutRecord.saveExerciseTime(new Date().getTime());
            if (str2.equals("walk") || str2.equals("running")) {
                workoutRecord.saveWorkoutId("R002");
                workoutRecord.saveWorkoutName(BaseApplication.b().getResources().getString(R.string.IDS_hwh_motiontrack_stretch_after_run));
            } else {
                workoutRecord.saveWorkoutId("W010");
                workoutRecord.saveWorkoutName(BaseApplication.b().getResources().getString(R.string.IDS_fitness_class_W004B));
            }
            workoutRecord.savePlanId("");
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(workoutRecord);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("workoutrecord", new Gson().toJson(arrayList));
                Intent intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("huaweischeme://healthapp/fitnesspage?skip_type=train_details&version=2.0&id=" + workoutRecord.acquireWorkoutId()));
                try {
                    intent2.putExtra("stretch", jSONObject.toString());
                    intent = intent2;
                } catch (JSONException unused) {
                    intent = intent2;
                    LogUtil.a("YoyoUtils", "TrainDetail is error ");
                }
            } catch (JSONException unused2) {
            }
        }
        if (str.equals("Fitness")) {
            intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("huaweischeme://healthapp/fitnesspage?skip_type=fitness_result&fitnessresult=" + str2));
        }
        intent.putExtra("key_click_yoyo_widget", true);
        return intent;
    }

    public static List<ClickPendingIntent> d(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        ClickPendingIntent clickPendingIntent = new ClickPendingIntent(R.id.honor_yoyo_relative, 3, c(str2, str));
        ClickPendingIntent clickPendingIntent2 = new ClickPendingIntent(R.id.honor_yoyo_image_start, 3, c("stretch", str2));
        arrayList.add(clickPendingIntent);
        arrayList.add(clickPendingIntent2);
        return arrayList;
    }

    public static HiTrackMetaData b(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            LogUtil.d("YoyoUtils", "list is null");
            return null;
        }
        try {
            return (HiTrackMetaData) new Gson().fromJson(JsonSanitizer.sanitize(hiHealthData.getMetaData()), HiTrackMetaData.class);
        } catch (JsonSyntaxException unused) {
            LogUtil.e("YoyoUtils", "parse onGetLastHistoryData error");
            return null;
        }
    }

    public static String b(long j) {
        return UnitUtil.e((int) TimeUnit.MILLISECONDS.toSeconds(j));
    }

    public static String b(float f) {
        if (f == 0.0f) {
            return "0";
        }
        return hcc.d(BaseApplication.b(), f);
    }

    public static String e(int i) {
        return UnitUtil.e((((double) i) * 1.0d) / 1000.0d, 1, 0);
    }

    public static double e(boolean z, int i, double d2) {
        if (!UnitUtil.d()) {
            return d2;
        }
        if (z && i == 3) {
            return UnitUtil.c(d2, 3);
        }
        if (i == 3) {
            return UnitUtil.e(d2, 3);
        }
        return -1.0d;
    }

    public static boolean e() {
        if (!LanguageUtil.l(BaseApplication.b())) {
            LogUtil.a("YoyoUtils", "not chineseSimplify");
            return false;
        }
        if (Utils.o()) {
            LogUtil.a("YoyoUtils", "oversea version, dont collect label");
            return false;
        }
        if (!SystemInfo.j()) {
            LogUtil.a("YoyoUtils", "not Honor");
            return false;
        }
        if (!b(3)) {
            return true;
        }
        ReleaseLogUtil.d("R_YoyoUtils", "isUserIdLastDigitBelowThreshold no AccessYoYoCard");
        return false;
    }

    private static boolean b(int i) {
        String accountInfo = LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1011);
        if (accountInfo == null || accountInfo.isEmpty()) {
            return false;
        }
        char cCharAt = accountInfo.charAt(accountInfo.length() - 1);
        return Character.isDigit(cCharAt) && CommonUtils.j(String.valueOf(cCharAt)) < i;
    }
}
