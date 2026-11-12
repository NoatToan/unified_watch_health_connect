package com.huawei.health.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.work.PeriodicWorkRequest;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.hihonor.assistant.cardmgrsdk.CardMgrSdkConst;
import com.hihonor.assistant.cardmgrsdk.model.CardDisplayRequestArg;
import com.hihonor.assistant.cardmgrsdk.model.DisplayResult;
import com.hihonor.assistant.cardmgrsdk.model.YOYOWidgetMsg;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.FitnessListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealth.util.WidgetHelperUtils;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.awt;
import defpackage.awv;
import defpackage.iph;
import defpackage.njd;
import defpackage.njy;
import defpackage.nkb;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class YOYOWidgetProvider extends AppWidgetProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static c f10422b;
    private static List<Integer> j = new ArrayList();
    private static List<Integer> g = null;
    private static boolean e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile boolean f10423c = false;
    private static boolean d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f10421a = false;

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        Bundle appWidgetOptions;
        super.onUpdate(context, appWidgetManager, iArr);
        for (int i : iArr) {
            try {
                appWidgetOptions = appWidgetManager.getAppWidgetOptions(i);
            } catch (BadParcelableException unused) {
                LogUtil.e("HonorYoyoWidgetProvider", "catch BadParcelableException onUpdate");
                appWidgetOptions = null;
            }
            d(appWidgetOptions);
        }
    }

    private void d(Bundle bundle) {
        if (bundle == null) {
            LogUtil.e("HonorYoyoWidgetProvider", "appWidgetOptions is null");
            return;
        }
        Optional<YOYOWidgetMsg> optionalC = new awv().c(bundle);
        if (Build.VERSION.SDK_INT >= 30) {
            optionalC.ifPresent(new Consumer<YOYOWidgetMsg>() { // from class: com.huawei.health.widget.YOYOWidgetProvider.3
                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:25:0x008b  */
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void accept(YOYOWidgetMsg yOYOWidgetMsg) throws Throwable {
                    byte b2;
                    String business = yOYOWidgetMsg.getBusiness();
                    String scene = yOYOWidgetMsg.getScene();
                    String type = yOYOWidgetMsg.getType();
                    LogUtil.a("HonorYoyoWidgetProvider", "business:" + business + ",scene:" + scene + ",type:" + type + ",extras: " + yOYOWidgetMsg.getExtras());
                    if (scene.equals(CardMgrSdkConst.MSGScene.SHOWCARD)) {
                        LogUtil.a("HonorYoyoWidgetProvider", "Display Card");
                        return;
                    }
                    type.hashCode();
                    switch (type) {
                        case "com.hihonor.assistant.cardmgr.action.CARD_UI_CHANGED":
                            b2 = 0;
                            break;
                        case "com.hihonor.assisant.action.CARDSTACK_FAILED":
                            b2 = 1;
                            break;
                        case "com.hihonor.assistant.cardmgr.action.CARD_LOCALE_CHANGED":
                            b2 = 2;
                            break;
                        case "com.hihonor.assistant.cardmgr.action.CARD_APK_UPDATE":
                            b2 = 3;
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    if (b2 == 0) {
                        LogUtil.a("HonorYoyoWidgetProvider", "UI_CHANGED_ACTION");
                        return;
                    }
                    if (b2 == 1) {
                        LogUtil.a("HonorYoyoWidgetProvider", "CARDSTACK_FAILED_ACTION");
                        YOYOWidgetProvider.b();
                    } else if (b2 == 2) {
                        LogUtil.a("HonorYoyoWidgetProvider", "LOCALE_CHANGED_ACTION");
                        YOYOWidgetProvider.b();
                    } else {
                        if (b2 != 3) {
                            return;
                        }
                        LogUtil.a("HonorYoyoWidgetProvider", "CARD_APK_UPDATE_ACTION");
                        YOYOWidgetProvider.b();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b() throws Throwable {
        f10421a = true;
        h(-1L);
        e(-1L);
        a(-1L);
        f10421a = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(long j2) throws Throwable {
        try {
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "movement", "DISPLAYREQUESTARG_WALK_MOVEMENT");
            String strE2 = SharedPreferenceManager.e(BaseApplication.getContext(), "movement", "DISPLAYREQUESTARG_WALK_MOVEMENT_JSON");
            long jD = SharedPreferenceManager.d("movement", "DISPLAYREQUESTARG_WALK_MOVEMENT_STARTTIME", 0L);
            long jD2 = SharedPreferenceManager.d("movement", "DISPLAYREQUESTARG_WALK_MOVEMENT_ENDTTIME", 0L);
            HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) new Gson().fromJson(strE, HiTrackMetaData.class);
            LogUtil.a("HonorYoyoWidgetProvider", "systemEventsRemoveWalkMoveMentCard: ", "movementStartTime: ", Long.valueOf(jD), "movementEndTime: ", Long.valueOf(jD2), "displayRequestArgmovement: ", strE, "movementData: ", strE2);
            if (hiTrackMetaData == null || TextUtils.isEmpty(strE2) || jD == 0 || jD2 == 0) {
                return;
            }
            if (j2 == -1 || j2 == jD2) {
                a(strE2, hiTrackMetaData, jD, jD2);
            }
        } catch (JsonSyntaxException unused) {
            LogUtil.e("HonorYoyoWidgetProvider", "systemEventsRemoveWalkMoveMentCard JsonSyntaxException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(long j2) throws Throwable {
        try {
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "movement", "DISPLAYREQUESTARG_RUN_MOVEMENT");
            String strE2 = SharedPreferenceManager.e(BaseApplication.getContext(), "movement", "DISPLAYREQUESTARG_RUN_MOVEMENT_JSON");
            long jD = SharedPreferenceManager.d("movement", "DISPLAYREQUESTARG_RUN_MOVEMENT_STARTTIME", 0L);
            long jD2 = SharedPreferenceManager.d("movement", "DISPLAYREQUESTARG_RUN_MOVEMENT_ENDTTIME", 0L);
            HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) new Gson().fromJson(strE, HiTrackMetaData.class);
            LogUtil.a("HonorYoyoWidgetProvider", "systemEventsRemoveRunMoveMentCard: ", "movementStartTime: ", Long.valueOf(jD), "movementEndTime: ", Long.valueOf(jD2), "displayRequestArgmovement: ", strE, "movementData: ", strE2);
            if (hiTrackMetaData == null || TextUtils.isEmpty(strE2) || jD == 0 || jD2 == 0) {
                return;
            }
            if (j2 == -1 || j2 == jD2) {
                a(strE2, hiTrackMetaData, jD, jD2);
            }
        } catch (JsonSyntaxException unused) {
            LogUtil.e("HonorYoyoWidgetProvider", "systemEventsRemoveRunMoveMentCard JsonSyntaxException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(long j2) throws Throwable {
        try {
            WorkoutRecord workoutRecord = (WorkoutRecord) new Gson().fromJson(SharedPreferenceManager.e(BaseApplication.getContext(), "fitness", "DISPLAYREQUESTARG_FITNESS"), WorkoutRecord.class);
            if (workoutRecord != null) {
                LogUtil.a("HonorYoyoWidgetProvider", "lastWorkoutRecord: ", workoutRecord.toString());
                if (j2 == -1 || j2 == workoutRecord.acquireExerciseTime()) {
                    a(workoutRecord);
                }
            }
        } catch (JsonSyntaxException unused) {
            LogUtil.e("HonorYoyoWidgetProvider", "systemEventsRemoveFitnessCard JsonSyntaxException");
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    static class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) throws Throwable {
            if (intent == null) {
                LogUtil.e("HonorYoyoWidgetProvider", "mAccountDataSwitchReceiver intent is null");
                return;
            }
            try {
                if ("com.huawei.hihealth.action_account_login_datas_switch_finish".equals(intent.getAction())) {
                    int intExtra = intent.getIntExtra("account_switch_status", 0);
                    LogUtil.a("HonorYoyoWidgetProvider", "mAccountDataSwitchReceiver onReceive,", Integer.valueOf(intExtra));
                    if (intExtra == 0 && !YOYOWidgetProvider.e) {
                        HiHealthNativeApi.a(context).subscribeHiHealthData(YOYOWidgetProvider.j, new e());
                    }
                }
                if ("com.huawei.bone.action.UNITSWITCH".equals(intent.getAction())) {
                    LogUtil.a("HonorYoyoWidgetProvider", "UNITSWITCH");
                    YOYOWidgetProvider.b();
                }
                if ("com.huawei.plugin.account.logout".equals(intent.getAction())) {
                    LogUtil.a("HonorYoyoWidgetProvider", "ACTION_LOGOUT_SUCCESSFUL");
                    boolean unused = YOYOWidgetProvider.d = true;
                    YOYOWidgetProvider.h(-1L);
                    YOYOWidgetProvider.e(-1L);
                    YOYOWidgetProvider.a(-1L);
                    boolean unused2 = YOYOWidgetProvider.d = false;
                }
                if ("com.huawei.bone.action.REMOVECARD".equals(intent.getAction())) {
                    String stringExtra = intent.getStringExtra("type");
                    long longExtra = intent.getLongExtra("EndTime", 0L);
                    boolean unused3 = YOYOWidgetProvider.d = true;
                    LogUtil.a("HonorYoyoWidgetProvider", "YOYO_REMOVECARD type: ", stringExtra, "mEndTime:", Long.valueOf(longExtra));
                    if ("movement".equals(stringExtra)) {
                        YOYOWidgetProvider.h(longExtra);
                    }
                    if ("movement_run".equals(stringExtra)) {
                        YOYOWidgetProvider.e(longExtra);
                    }
                    if ("fitness".equals(stringExtra)) {
                        YOYOWidgetProvider.a(longExtra);
                    }
                    boolean unused4 = YOYOWidgetProvider.d = false;
                }
            } catch (BadParcelableException unused5) {
                LogUtil.e("HonorYoyoWidgetProvider", "catch BadParcelableException");
            }
        }
    }

    public static void b(Context context) {
        if (!iph.e()) {
            LogUtil.a("HonorYoyoWidgetProvider", "registerSportData isAccessYoyoCard");
            return;
        }
        LogUtil.a("HonorYoyoWidgetProvider", "registerSportData");
        j.add(4);
        HiHealthNativeApi.a(context).subscribeHiHealthData(j, new e());
        f10422b = new c();
        IntentFilter intentFilter = new IntentFilter("com.huawei.hihealth.action_account_login_datas_switch_finish");
        intentFilter.addAction("com.huawei.hihealth.action_account_login_datas_switch_finish");
        intentFilter.addAction("com.huawei.bone.action.UNITSWITCH");
        intentFilter.addAction("com.huawei.plugin.account.logout");
        intentFilter.addAction("com.huawei.bone.action.REMOVECARD");
        BroadcastManagerUtil.d(context, f10422b, intentFilter, "com.huawei.hihealth.DEFAULT_PERMISSION", null);
        f10423c = true;
        WidgetHelperUtils.a().c(new FitnessListener() { // from class: com.huawei.health.widget.YOYOWidgetProvider.1
            @Override // com.huawei.hihealth.data.listener.FitnessListener
            public void onResult(String str) throws Throwable {
                if (iph.e()) {
                    YOYOWidgetProvider.a(str);
                } else {
                    LogUtil.a("HonorYoyoWidgetProvider", "registListener isAccessYoyoCard");
                }
            }
        });
    }

    public static void d(Context context) {
        if (f10422b != null && f10423c) {
            LogUtil.j("HonorYoyoWidgetProvider", "unregisterReceiver AccountStatusReceiver");
            try {
                BaseApplication.getContext().unregisterReceiver(f10422b);
            } catch (IllegalArgumentException unused) {
                LogUtil.e("HonorYoyoWidgetProvider", "unregisterSportData IllegalArgumentException");
            }
            f10422b = null;
            f10423c = false;
        }
        if (njy.e(g)) {
            LogUtil.j("HonorYoyoWidgetProvider", "unregisterSportData sSportDataList listener has unregister.");
        } else {
            HiHealthNativeApi.a(context).unSubscribeHiHealthData(g, new a("HonorYoyoWidgetProvider", "unSubscribeDataChange, isSuccess:"));
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    static class e implements HiSubscribeListener {
        e() {
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            if (njy.b(list)) {
                LogUtil.a("HonorYoyoWidgetProvider", "onResult successList= ", list, "failList= ", list2);
                boolean unused = YOYOWidgetProvider.e = true;
                List unused2 = YOYOWidgetProvider.g = list;
            } else {
                LogUtil.e("HonorYoyoWidgetProvider", "onResult SportHiSubscribeListener fail.");
                boolean unused3 = YOYOWidgetProvider.e = false;
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            LogUtil.a("HonorYoyoWidgetProvider", "SportHiSubscribeListener onChange type= ", i + " changeKey= " + str);
            if (!iph.e()) {
                LogUtil.a("HonorYoyoWidgetProvider", "onChange isAccessYoyoCard");
            } else if (i == 4 && ArkUIXConstants.INSERT.equals(str)) {
                YOYOWidgetProvider.c();
            }
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    public static class a implements HiUnSubscribeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10426a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f10427c;

        public a(String str, String str2) {
            this.f10426a = str;
            this.f10427c = str2;
        }

        @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
        public void onResult(boolean z) {
            if (z) {
                boolean unused = YOYOWidgetProvider.e = false;
            }
            LogUtil.a(this.f10426a, this.f10427c, Boolean.valueOf(z));
        }
    }

    public static void c() {
        LogUtil.a("HonorYoyoWidgetProvider", "queryLastSportData");
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(System.currentTimeMillis() - 1800000, System.currentTimeMillis());
        hiDataReadOption.setType(new int[]{30004});
        hiDataReadOption.setCount(1);
        hiDataReadOption.setSortOrder(1);
        HiHealthNativeApi.a(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: com.huawei.health.widget.YOYOWidgetProvider.4
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a("HonorYoyoWidgetProvider", "queryLastHistoryData onResult errorCode:", Integer.valueOf(i));
                if (!(obj instanceof SparseArray)) {
                    LogUtil.j("HonorYoyoWidgetProvider", "queryLastSportData error result data");
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    LogUtil.j("HonorYoyoWidgetProvider", "queryLastSportData onResult obj not instanceof List data: ", sparseArray);
                    return;
                }
                Object obj2 = sparseArray.get(30004);
                LogUtil.a("HonorYoyoWidgetProvider", "queryLastSportData obj=", obj2);
                if (obj2 instanceof List) {
                    YOYOWidgetProvider.a((List<HiHealthData>) obj2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(String str) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HonorYoyoWidgetProvider", "convertLastFitnessData value is null");
            return;
        }
        try {
            WorkoutRecord workoutRecord = (WorkoutRecord) HiJsonUtil.d(CommonUtil.ac(str), WorkoutRecord.class);
            LogUtil.a("HonorYoyoWidgetProvider", "convertLastFitnessData lastWorkoutRecord=", workoutRecord.toString());
            long jCurrentTimeMillis = System.currentTimeMillis() - workoutRecord.acquireExerciseTime();
            LogUtil.a("HonorYoyoWidgetProvider", "Fitness Validity Period: ", Long.valueOf(jCurrentTimeMillis));
            if (workoutRecord.getSportRecordType() == 1) {
                LogUtil.a("HonorYoyoWidgetProvider", "convertLastFitnessData getSportRecordType: ", 1);
            } else if (jCurrentTimeMillis <= PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
                LogUtil.a("HonorYoyoWidgetProvider", "Validity Period");
                a(workoutRecord);
            } else {
                LogUtil.a("HonorYoyoWidgetProvider", "Expired Validity Period");
            }
        } catch (JsonSyntaxException e2) {
            LogUtil.e("HonorYoyoWidgetProvider", "convertLastFitnessData JsonSyntaxException: ", e2.getMessage());
        }
    }

    private static void a(WorkoutRecord workoutRecord) throws Throwable {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("workout_record", new Gson().toJson(workoutRecord));
            CardDisplayRequestArg cardDisplayRequestArgC = c(workoutRecord, "Fitness", jSONObject.toString());
            SharedPreferenceManager.e(BaseApplication.getContext(), "fitness", "DISPLAYREQUESTARG_FITNESS", d ? null : new Gson().toJson(workoutRecord), null);
            LogUtil.a("HonorYoyoWidgetProvider", "SharedPreferenceManager:", new Gson().toJson(workoutRecord));
            d(cardDisplayRequestArgC);
        } catch (JSONException unused) {
            LogUtil.e("HonorYoyoWidgetProvider", "lastWorkoutRecord fail");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(List<HiHealthData> list) {
        if (HiCommonUtil.b(list)) {
            LogUtil.e("HonorYoyoWidgetProvider", "list is isEmpty");
            return;
        }
        long endTime = list.get(0).getEndTime();
        if (endTime == 0) {
            LogUtil.e("HonorYoyoWidgetProvider", "endTime is zero");
        } else if (System.currentTimeMillis() - endTime <= PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            b(list);
        }
    }

    private static void b(List<HiHealthData> list) {
        final HiTrackMetaData hiTrackMetaDataB = iph.b(list.get(0));
        if (hiTrackMetaDataB == null) {
            LogUtil.e("HonorYoyoWidgetProvider", "metaData is null");
        } else {
            if (hiTrackMetaDataB.getAbnormalTrack() != 0) {
                LogUtil.e("HonorYoyoWidgetProvider", "Movement abnormality record");
                return;
            }
            final long startTime = list.get(0).getStartTime();
            final long endTime = list.get(0).getEndTime();
            nkb.d().d(startTime, endTime, new IBaseResponseCallback() { // from class: com.huawei.health.widget.YOYOWidgetProvider.5
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) throws Throwable {
                    LogUtil.a("HonorYoyoWidgetProvider", "onResponse code: ", Integer.valueOf(i));
                    if (i == 0 && (obj instanceof njd)) {
                        njd njdVar = (njd) obj;
                        LogUtil.d("HonorYoyoWidgetProvider", "strPathDetail: ", njdVar.b(), "pathMotionPath: ", njdVar.c());
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("contentpath", njdVar.b());
                            jSONObject.put("simplifyDatakey", new Gson().toJson(njdVar.c()));
                        } catch (JSONException unused) {
                            LogUtil.e("HonorYoyoWidgetProvider", "displayCard is errors");
                        }
                        YOYOWidgetProvider.a(jSONObject.toString(), hiTrackMetaDataB, startTime, endTime);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(String str, HiTrackMetaData hiTrackMetaData, long j2, long j3) throws Throwable {
        LogUtil.a("HonorYoyoWidgetProvider", "motionData startTime: ", Long.valueOf(j2));
        if (hiTrackMetaData.getSportType() == 257 || hiTrackMetaData.getSportType() == 281) {
            SharedPreferenceManager.e(BaseApplication.getContext(), "movement", "DISPLAYREQUESTARG_WALK_MOVEMENT", new Gson().toJson(hiTrackMetaData), null);
            SharedPreferenceManager.e(BaseApplication.getContext(), "movement", "DISPLAYREQUESTARG_WALK_MOVEMENT_JSON", str, null);
            SharedPreferenceManager.c("movement", "DISPLAYREQUESTARG_WALK_MOVEMENT_STARTTIME", j2);
            SharedPreferenceManager.c("movement", "DISPLAYREQUESTARG_WALK_MOVEMENT_ENDTTIME", d ? 0L : j3);
            CardDisplayRequestArg cardDisplayRequestArgC = c(257, hiTrackMetaData, j2, "walk", str);
            d(cardDisplayRequestArgC);
            LogUtil.a("HonorYoyoWidgetProvider", "walkOperation: ", Integer.valueOf(cardDisplayRequestArgC.getOperation()));
        }
        if (hiTrackMetaData.getSportType() == 258 || hiTrackMetaData.getSportType() == 264) {
            LogUtil.a("HonorYoyoWidgetProvider", "SPORT_TYPE_RUN=", Integer.valueOf(hiTrackMetaData.getSportType()));
            SharedPreferenceManager.e(BaseApplication.getContext(), "movement", "DISPLAYREQUESTARG_RUN_MOVEMENT", new Gson().toJson(hiTrackMetaData), null);
            SharedPreferenceManager.e(BaseApplication.getContext(), "movement", "DISPLAYREQUESTARG_RUN_MOVEMENT_JSON", str, null);
            SharedPreferenceManager.c("movement", "DISPLAYREQUESTARG_RUN_MOVEMENT_STARTTIME", j2);
            SharedPreferenceManager.c("movement", "DISPLAYREQUESTARG_RUN_MOVEMENT_ENDTTIME", d ? 0L : j3);
            CardDisplayRequestArg cardDisplayRequestArgC2 = c(258, hiTrackMetaData, j2, "running", str);
            d(cardDisplayRequestArgC2);
            LogUtil.a("HonorYoyoWidgetProvider", "runOperation: ", Integer.valueOf(cardDisplayRequestArgC2.getOperation()));
        }
    }

    private static CardDisplayRequestArg c(int i, HiTrackMetaData hiTrackMetaData, long j2, String str, String str2) {
        awt.b().c(BaseApplication.getContext());
        CardDisplayRequestArg cardDisplayRequestArgE = iph.e(i, hiTrackMetaData, j2, str, str2);
        LogUtil.a("HonorYoyoWidgetProvider", "requestArg displayMovementCard: ", cardDisplayRequestArgE.toString());
        return cardDisplayRequestArgE;
    }

    private static CardDisplayRequestArg c(WorkoutRecord workoutRecord, String str, String str2) {
        awt.b().c(BaseApplication.getContext());
        CardDisplayRequestArg cardDisplayRequestArgA = iph.a(259, workoutRecord, str, str2);
        LogUtil.a("HonorYoyoWidgetProvider", "requestArg displayFitnessCard: ", cardDisplayRequestArgA.toString());
        return cardDisplayRequestArgA;
    }

    private static void d(CardDisplayRequestArg cardDisplayRequestArg) throws Throwable {
        Optional<DisplayResult> optionalE;
        int resultCode;
        int iA = awt.b().a(cardDisplayRequestArg);
        LogUtil.a("HonorYoyoWidgetProvider", "queryCardInfo： ", Integer.valueOf(iA));
        if (d) {
            LogUtil.a("HonorYoyoWidgetProvider", "sIsRemoveCard");
            optionalE = awt.b().d(cardDisplayRequestArg);
        } else if (f10421a) {
            optionalE = iA != 4 ? awt.b().e(cardDisplayRequestArg) : null;
        } else if (iA == 4) {
            optionalE = awt.b().c(cardDisplayRequestArg);
        } else {
            optionalE = awt.b().e(cardDisplayRequestArg);
        }
        if (Build.VERSION.SDK_INT < 30 || optionalE == null || !optionalE.isPresent()) {
            resultCode = 10000;
        } else {
            resultCode = optionalE.get().getResultCode();
            LogUtil.a("HonorYoyoWidgetProvider", "displayResult： ", optionalE.toString(), " resultCode: ", Integer.valueOf(resultCode));
        }
        LogUtil.a("HonorYoyoWidgetProvider", "resultCode： ", Integer.valueOf(resultCode));
    }
}
