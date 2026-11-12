package com.huawei.health.suggestion.ui.fitness.helper;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.ui.fitness.activity.CourseEquipmentConnectActivity;
import com.huawei.health.suggestion.ui.fitness.activity.LongCoachActivity;
import com.huawei.health.suggestion.ui.fitness.module.CoachData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.db.bean.ContentTemplateRecord;
import com.huawei.pluginfitnessadvice.FitWorkout;
import defpackage.buh;
import defpackage.eqr;
import defpackage.gzx;
import defpackage.hmd;
import defpackage.iov;
import health.compact.a.Services;
import health.compact.a.utils.StringUtils;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class JumpConnectHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f9329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9331c;
    private Gson d;
    private c e;

    /* JADX INFO: loaded from: classes2.dex */
    public interface JumpActivityHandleInterface {
        default void showEquipmentMatchTip(int i) {
        }

        default void startLongCoachAfter() {
        }
    }

    private JumpConnectHelper() {
        this.f9330b = 0;
        this.f9331c = 0;
        this.d = new Gson();
        this.e = new c();
        this.f9329a = false;
    }

    public c d() {
        return this.e;
    }

    static class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final JumpConnectHelper f9333c = new JumpConnectHelper();
    }

    public static JumpConnectHelper c() {
        return e.f9333c;
    }

    public boolean b() {
        return this.f9329a;
    }

    public void e(boolean z) {
        this.f9329a = z;
    }

    public void d(int i, int i2) {
        if (i == 0 || i2 == 0) {
            LogUtil.j("Suggestion_JumpConnectHelper", "startCourseConnectActivity entranceType or equipmentType invalid");
            return;
        }
        this.f9331c = i;
        this.f9330b = i2;
        Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) CourseEquipmentConnectActivity.class);
        intent.putExtra("KEY_INTENT_COURSE_ENTRANCE", i);
        intent.putExtra("KEY_INTENT_EQUIPMENT_TYPE", i2);
        intent.addFlags(268435456);
        iov.d(BaseApplication.getContext(), intent);
    }

    public void c(List<ContentValues> list, int i, int i2) {
        if (i == 0 || i2 == 0) {
            LogUtil.j("Suggestion_JumpConnectHelper", "startCourseConnectActivity entranceType or equipmentType invalid");
            return;
        }
        this.f9331c = i;
        this.f9330b = i2;
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.getContext(), "com.huawei.indoorequip.activity.IndoorEquipConnectedActivity");
        ContentValues contentValues = list.get(0);
        intent.putExtra("PAYLOAD_FROM_NFC", eqr.a().c(contentValues));
        intent.putExtra("KEY_INTENT_COURSE_ENTRANCE", i);
        intent.putExtra("KEY_INTENT_EQUIPMENT_TYPE", eqr.a().a(i2));
        String asString = contentValues.getAsString("uniqueId");
        IndoorEquipManagerApi indoorEquipManagerApi = (IndoorEquipManagerApi) Services.b("PluginLinkIndoorEquip", IndoorEquipManagerApi.class);
        if (indoorEquipManagerApi.isDeviceBtConnected() && !TextUtils.isEmpty(asString) && asString.equals(indoorEquipManagerApi.getCurrentMacAddress())) {
            intent.putExtra(WorkoutRecord.Extend.COURSE_TARGET_TYPE, 6);
        }
        LogUtil.a("Suggestion_JumpConnectHelper", "startIndoorEquipmentConnectActivity,", intent.getExtras() != null ? intent.getExtras().toString() : Integer.valueOf(i2));
        iov.d(BaseApplication.getContext(), intent);
    }

    public void g() {
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.getContext(), "com.huawei.ui.device.activity.adddevice.OneKeyScanActivity");
        intent.putExtra("KEY_INTENT_COURSE_ENTRANCE", this.f9331c);
        intent.putExtra("KEY_INTENT_EQUIPMENT_TYPE", eqr.a().a(this.f9330b));
        intent.addFlags(268435456);
        iov.d(BaseApplication.getContext(), intent);
    }

    public void d(Context context, int i) {
        if (!a(context, i)) {
            LogUtil.j("Suggestion_JumpConnectHelper", "startLongCoachActivity data is invalid");
            return;
        }
        hmd hmdVar = (hmd) this.d.fromJson(buh.e("course_equipment_start_long_info"), hmd.class);
        CoachData coachDataE = hmdVar.e();
        Intent intent = new Intent(context, (Class<?>) LongCoachActivity.class);
        intent.putExtra("KEY_INTENT_COURSE_ENTRANCE", i);
        intent.putExtra("KEY_INTENT_EQUIPMENT_TYPE", this.f9330b);
        intent.putExtra(ContentTemplateRecord.MOTIONS, coachDataE);
        FitWorkout fitWorkoutB = hmdVar.b();
        intent.putExtra("long_coach_type", fitWorkoutB.getVideoProperty());
        intent.putExtra("commodityFlag", fitWorkoutB.acquireCommodityFlag());
        intent.putExtra("workout_package_id", hmdVar.m());
        intent.putExtra("course_belong_type", hmdVar.a());
        intent.putExtra("long_coach_video_url", hmdVar.g());
        intent.putExtra("long_coach_show_action", hmdVar.f());
        intent.putExtra("long_coach_need_calories", fitWorkoutB.getShowCalories());
        intent.putExtra("long_coach_need_countdown", fitWorkoutB.getShowCountdown());
        intent.putExtra("long_coach_need_heart_rate", fitWorkoutB.getShowHeartRate());
        intent.putExtra("havenexttrain", hmdVar.d() != hmdVar.h().size() - 1);
        WorkoutRecord workoutRecordJ = hmdVar.j();
        intent.putExtra("coach_detail_name", !TextUtils.isEmpty(workoutRecordJ.acquireWorkoutName()) ? workoutRecordJ.acquireWorkoutName() : fitWorkoutB.acquireName());
        intent.putExtra("coach_detail_picture", !TextUtils.isEmpty(fitWorkoutB.acquireMidPicture()) ? StringUtils.c((Object) fitWorkoutB.acquireMidPicture()) : StringUtils.c((Object) fitWorkoutB.acquirePicture()));
        intent.putExtra("workoutrecord", workoutRecordJ);
        Bundle bundle = new Bundle();
        bundle.putBoolean("isshowbutton", hmdVar.l());
        bundle.putInt("track_type", hmdVar.o());
        bundle.putLong("plan_execute_time", hmdVar.i());
        intent.putExtra("bundlekey", bundle);
        intent.putExtra("topic_name", hmdVar.n());
        intent.putExtra("entrance", hmdVar.c());
        intent.putExtra("ISPLANFIT", hmdVar.k());
        intent.addFlags(268435456);
        iov.d(BaseApplication.getContext(), intent);
        this.e.startLongCoachAfter();
    }

    private boolean a(Context context, int i) {
        String strE = buh.e("course_equipment_start_long_info");
        if (context == null || i == 0 || TextUtils.isEmpty(strE)) {
            LogUtil.j("Suggestion_JumpConnectHelper", "isValidData params is invalid");
            return false;
        }
        return gzx.e(((hmd) this.d.fromJson(strE, hmd.class)).e());
    }

    public int a() {
        return this.f9330b;
    }

    public int e() {
        return this.f9331c;
    }

    public void j() {
        this.e.b();
        this.f9330b = 0;
        this.f9331c = 0;
        buh.d("course_equipment_start_long_info", "");
    }

    public static class c implements JumpActivityHandleInterface {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map<String, WeakReference<JumpActivityHandleInterface>> f9332a = new ConcurrentHashMap();

        public void e(String str, WeakReference<JumpActivityHandleInterface> weakReference) {
            if (str == null || weakReference == null) {
                LogUtil.j("Suggestion_JumpConnectHelper", "JumpActivityHandle registerHandleInterface params is invalid");
            } else {
                this.f9332a.put(str, weakReference);
            }
        }

        public void d(String str) {
            if (str == null) {
                LogUtil.j("Suggestion_JumpConnectHelper", "JumpActivityHandle unRegisterHandleInterface unregist activity tag is null");
            } else {
                this.f9332a.remove(str);
            }
        }

        @Override // com.huawei.health.suggestion.ui.fitness.helper.JumpConnectHelper.JumpActivityHandleInterface
        public void startLongCoachAfter() {
            Iterator<WeakReference<JumpActivityHandleInterface>> it = this.f9332a.values().iterator();
            while (it.hasNext()) {
                JumpActivityHandleInterface jumpActivityHandleInterface = it.next().get();
                if (jumpActivityHandleInterface == null) {
                    LogUtil.e("Suggestion_JumpConnectHelper", "startLongCoachAfter activityHandleInterface is null.");
                    return;
                }
                jumpActivityHandleInterface.startLongCoachAfter();
            }
        }

        @Override // com.huawei.health.suggestion.ui.fitness.helper.JumpConnectHelper.JumpActivityHandleInterface
        public void showEquipmentMatchTip(int i) {
            Iterator<WeakReference<JumpActivityHandleInterface>> it = this.f9332a.values().iterator();
            while (it.hasNext()) {
                JumpActivityHandleInterface jumpActivityHandleInterface = it.next().get();
                if (jumpActivityHandleInterface == null) {
                    LogUtil.e("Suggestion_JumpConnectHelper", "showEquipmentMatchTip activityHandleInterface is null.");
                    return;
                }
                jumpActivityHandleInterface.showEquipmentMatchTip(i);
            }
        }

        public void b() {
            this.f9332a.clear();
        }
    }
}
