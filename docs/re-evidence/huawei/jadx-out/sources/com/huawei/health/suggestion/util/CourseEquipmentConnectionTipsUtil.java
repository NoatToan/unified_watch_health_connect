package com.huawei.health.suggestion.util;

import android.content.ContentValues;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.ecologydevice.fitness.datastruct.DeviceInformation;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.h5pro.CourseDetailH5Bridge;
import com.huawei.health.suggestion.ui.fitness.activity.TrainDetail;
import com.huawei.health.suggestion.ui.fitness.helper.JumpConnectHelper;
import com.huawei.health.suggestion.ui.fitness.module.CoachData;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import defpackage.buh;
import defpackage.dmg;
import defpackage.dmp;
import defpackage.emh;
import defpackage.era;
import defpackage.hmd;
import defpackage.njy;
import defpackage.pcd;
import defpackage.qpx;
import defpackage.qrs;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class CourseEquipmentConnectionTipsUtil {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f10212c = {"O03P", "2G97", "2G98", "2GYA", "2IX6"};

    /* JADX INFO: loaded from: classes2.dex */
    public interface DevicesConnectDialogCallback {
        void devicesConnectDialogNavigation();

        void devicesConnectDialogPositive();
    }

    public static int a(int i) {
        if (i == 1) {
            return 264;
        }
        if (i != 2) {
            return i != 3 ? 0 : 283;
        }
        return OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE;
    }

    public static void b(int i, String str, TrainDetail trainDetail) {
        if (i == 3) {
            if (!b()) {
                qpx.e(BaseApplication.getContext(), trainDetail.getString(R.string.IDS_fitness_equip_blutooth_disconnected));
                return;
            } else {
                trainDetail.devicesConnectDialogNavigation();
                return;
            }
        }
        trainDetail.devicesConnectDialogPositive();
        c(i, str, trainDetail);
    }

    private static void c(int i, String str, JumpConnectHelper.JumpActivityHandleInterface jumpActivityHandleInterface) {
        JumpConnectHelper.c().d().e(str, new WeakReference<>(jumpActivityHandleInterface));
        ArrayList<ContentValues> arrayListC = c(i);
        LogUtil.a("Suggestion_CourseEquipmentConnectionTipsUtil", "connectDevice connectedDeviceList ", Integer.valueOf(arrayListC.size()));
        if (arrayListC.size() == 1) {
            JumpConnectHelper.c().c(arrayListC, 1, i);
        } else {
            JumpConnectHelper.c().d(1, i);
        }
    }

    public static void b(int i, String str, CourseDetailH5Bridge courseDetailH5Bridge) {
        if (i == 3) {
            if (!b()) {
                qpx.e(BaseApplication.getContext(), BaseApplication.getContext().getString(R.string.IDS_fitness_equip_blutooth_disconnected));
                return;
            } else {
                courseDetailH5Bridge.devicesConnectDialogNavigation();
                return;
            }
        }
        courseDetailH5Bridge.devicesConnectDialogPositive();
        c(i, str, courseDetailH5Bridge);
    }

    public static void b(pcd pcdVar, hmd hmdVar, FitWorkout fitWorkout, CoachData coachData, int i) {
        if (pcdVar == null || hmdVar == null || fitWorkout == null || coachData == null) {
            LogUtil.j("Suggestion_CourseEquipmentConnectionTipsUtil", "buildStartLongCoachInfo params is null");
            return;
        }
        hmdVar.e(fitWorkout);
        hmdVar.c(coachData);
        hmdVar.e(i);
        hmdVar.d(pcdVar.c());
        hmdVar.c(pcdVar.x());
        hmdVar.b(pcdVar.al());
        hmdVar.a(pcdVar.ak());
        hmdVar.b(pcdVar.v());
        hmdVar.e(pcdVar.f());
    }

    public static void a(hmd hmdVar, int i, String str, ArrayList<WorkoutRecord> arrayList, WorkoutRecord workoutRecord) {
        if (hmdVar == null || TextUtils.isEmpty(str) || arrayList == null || workoutRecord == null) {
            LogUtil.j("Suggestion_CourseEquipmentConnectionTipsUtil", "buildInfo params is null");
            return;
        }
        hmdVar.d(i);
        hmdVar.e(str);
        hmdVar.e(arrayList);
        hmdVar.e(workoutRecord);
        buh.d("course_equipment_start_long_info", new Gson().toJson(hmdVar));
    }

    private static ArrayList<ContentValues> c(int i) {
        ArrayList<ContentValues> arrayListC;
        ArrayList<ContentValues> arrayList = new ArrayList<>();
        if (i == 1) {
            arrayListC = dmp.d().c(HealthDevice.HealthDeviceKind.HDK_TREADMILL);
        } else {
            if (i != 2) {
                LogUtil.j("Suggestion_CourseEquipmentConnectionTipsUtil", "is not treadmill or bicycle connect");
                return arrayList;
            }
            arrayListC = dmp.d().c(HealthDevice.HealthDeviceKind.HDK_EXERCISE_BIKE);
        }
        LogUtil.a("Suggestion_CourseEquipmentConnectionTipsUtil", "getConnectEquipmentDeviceList bondedDeviceByDeviceKind ", Integer.valueOf(arrayListC.size()));
        if (njy.e(arrayListC)) {
            return new ArrayList<>();
        }
        return ((IndoorEquipManagerApi) Services.b("PluginLinkIndoorEquip", IndoorEquipManagerApi.class)).isDeviceBtConnected() ? a(arrayListC) : arrayListC;
    }

    private static ArrayList<ContentValues> a(ArrayList<ContentValues> arrayList) {
        ArrayList<ContentValues> arrayList2 = new ArrayList<>();
        IndoorEquipManagerApi indoorEquipManagerApi = (IndoorEquipManagerApi) Services.b("PluginLinkIndoorEquip", IndoorEquipManagerApi.class);
        for (ContentValues contentValues : arrayList) {
            if (contentValues != null) {
                String asString = contentValues.getAsString("uniqueId");
                if (!TextUtils.isEmpty(asString) && asString.equals(indoorEquipManagerApi.getCurrentMacAddress())) {
                    arrayList2.add(contentValues);
                    break;
                }
            }
        }
        return arrayList2;
    }

    public static int e(FitWorkout fitWorkout, String str) {
        int iB = b(str);
        if (iB != 0) {
            return iB;
        }
        if (fitWorkout == null || !fitWorkout.isEquipmentCourse()) {
            LogUtil.j("Suggestion_CourseEquipmentConnectionTipsUtil", "getCourseEquipmentType Course is not EquipmentCourse");
            return 0;
        }
        if (fitWorkout.getEquipmentWorkoutAction() == null) {
            LogUtil.j("Suggestion_CourseEquipmentConnectionTipsUtil", "getEquipmentWorkoutAction is null.");
            return 0;
        }
        int equipmentType = fitWorkout.getEquipmentWorkoutAction().getEquipmentType();
        if (equipmentType == 1 || equipmentType == 2) {
            return equipmentType;
        }
        LogUtil.a("Suggestion_CourseEquipmentConnectionTipsUtil", "Course equipmentType", Integer.valueOf(equipmentType));
        return 0;
    }

    private static int b(String str) {
        if ("from_treadmill_details".equals(str)) {
            return 1;
        }
        if ("from_bicycle_details".equals(str)) {
            return 2;
        }
        return ("from_rope_details".equals(str) && b()) ? 3 : 0;
    }

    public static boolean b() {
        dmg.a().init();
        String productId = dmg.a().getProductId();
        if (TextUtils.isEmpty(productId)) {
            return false;
        }
        if ("true".equals(era.a("isSupportAutoPauseSuprression", productId)) && dmg.a().isRopeDeviceBtConnected()) {
            return true;
        }
        String strB = era.b(productId);
        for (String str : f10212c) {
            if (str.equals(strB) && dmg.a().isRopeDeviceBtConnected()) {
                LogUtil.a("Suggestion_CourseEquipmentConnectionTipsUtil", "smartProId ", str);
                return c(str);
            }
        }
        return false;
    }

    private static boolean c(String str) {
        if (!str.equals("O03P") && !str.equals("2GYA")) {
            return true;
        }
        DeviceInformation deviceInformationC = emh.b().c();
        return (deviceInformationC == null || deviceInformationC.getSoftwareVersion() == null || a(deviceInformationC.getSoftwareVersion()) <= a("v1.1.2")) ? false : true;
    }

    private static int a(String str) {
        return qrs.a(str.toLowerCase(Locale.ENGLISH).replace("v", "").replace(".", ""));
    }
}
