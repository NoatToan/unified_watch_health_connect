package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.utils.EnvironmentHelper;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.health.servicesui.R;
import com.huawei.health.suggestion.ui.fitness.module.Motion;
import com.huawei.health.suggestion.ui.view.AutoFillColorView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.datastruct.MachineControlPointResponse;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.pluginfitnessadvice.Audio;
import com.huawei.pluginfitnessadvice.ChoreographedSingleAction;
import com.huawei.pluginfitnessadvice.Comment;
import com.huawei.pluginfitnessadvice.EquipmentAction;
import com.huawei.pluginfitnessadvice.EquipmentStage;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Pictures;
import com.huawei.pluginfitnessadvice.Video;
import com.huawei.pluginfitnessadvice.VideoSegment;
import com.huawei.pluginfitnessadvice.WorkoutAction;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.hkt;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.HarmonyBuild;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class hkt {
    static /* synthetic */ void b(View view) {
    }

    static /* synthetic */ void c(View view) {
    }

    private static String d(List<Audio> list, String str) {
        if ("hotbody".equals(str)) {
            return StringUtils.c((Object) list.get(0).getUrl());
        }
        return StringUtils.c((Object) list.get(1).getUrl());
    }

    private static String c(AtomicAction atomicAction, String str, int[] iArr) {
        if ("timer".equals(gzq.d(atomicAction.getActionSportType()))) {
            iArr[0] = 1000;
            iArr[1] = CommonUtils.j(e(atomicAction, "duration"));
            return c(str);
        }
        String strD = d(atomicAction, str);
        int iJ = CommonUtils.j(e(atomicAction, "frequency"));
        if (iJ != 0) {
            iArr[0] = (CommonUtils.j(e(atomicAction, "duration")) * 1000) / iJ;
        }
        iArr[1] = iJ;
        return strD;
    }

    private static String c(String str) {
        return !str.equals("hotbody") ? "timer" : str;
    }

    public static void e() {
        String canonicalPath;
        if (CommonUtil.ca()) {
            try {
                canonicalPath = BaseApplication.b().getFilesDir().getCanonicalPath();
            } catch (IOException e) {
                LogUtil.j("Suggestion_TrainDetailHelper", "getCanonicalPath", LogAnonymous.b(e));
                canonicalPath = null;
            }
            pee.b(BaseApplication.b(), "suggestion" + File.separator + "files_runcourse" + File.separator + "audios", canonicalPath);
            pee.b(BaseApplication.b(), "suggestion" + File.separator + "files_runcourse" + File.separator + "audiosBase", canonicalPath);
        }
    }

    private static String d(AtomicAction atomicAction, String str) {
        if (!str.equals("hotbody")) {
            str = "beating";
        }
        if (CommonUtils.j(e(atomicAction, "duration")) < CommonUtils.j(e(atomicAction, "frequency"))) {
            atomicAction.putExtendProperty("duration", e(atomicAction, "frequency"));
        }
        return str;
    }

    private static void a(String str, Motion motion, List<Comment> list) {
        if (njy.b(list)) {
            c(str, motion, list);
        }
    }

    private static void c(String str, Motion motion, List<Comment> list) {
        if ("hotbody".equals(str) && list.size() > 1) {
            motion.saveTrainPointPath(xkf.c(list.get(0).acquireName()));
            motion.setTrainAudioPath(xkf.c(list.get(1).acquireName()));
        } else {
            motion.setCommentaryTraining(list);
        }
    }

    private static boolean d(Video video, String str, Motion motion) {
        if (video == null) {
            LogUtil.e("Suggestion_TrainDetailHelper", "video is null");
            return false;
        }
        if (!gzx.e(video.getUrl(), video.getThumbnail(), str)) {
            LogUtil.j("Suggestion_TrainDetailHelper", "action name is wrong");
            return false;
        }
        motion.saveNamePath(xkf.c(str));
        LogUtil.a("Suggestion_TrainDetailHelper", "url:", video.getUrl());
        motion.saveMotionPath(xkf.l(video.getUrl()));
        motion.savePicUrl(video.getThumbnail());
        motion.setOriginLogo(video.getLogoImgUrl());
        return true;
    }

    public static void d(String str, String str2, AutoFillColorView autoFillColorView) {
        if (autoFillColorView == null) {
            LogUtil.j("Suggestion_TrainDetailHelper", "fullPic, autoFillColorView = null");
            return;
        }
        String strC = TextUtils.isEmpty(str) ? StringUtils.c((Object) str2) : StringUtils.c((Object) str);
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        if (strC.startsWith("http")) {
            autoFillColorView.e(strC, true);
            return;
        }
        if (CommonUtil.ca()) {
            autoFillColorView.e("file:///android_asset/suggestion/img/" + strC, true);
        } else {
            autoFillColorView.e("file:///android_asset/img/" + strC, true);
        }
    }

    public static List<Motion> c(FitWorkout fitWorkout, int i) {
        List<ChoreographedSingleAction> listC;
        if (fitWorkout == null) {
            LogUtil.j("Suggestion_TrainDetailHelper", "convertCourseAction2Motions failed with null fitworkout.");
            return new ArrayList();
        }
        int iAcquireRepeatTimes = fitWorkout.getType() == 3 ? fitWorkout.acquireRepeatTimes() : 1;
        if (fitWorkout.isNewRunCourse() && !fitWorkout.isLongVideoCourse()) {
            listC = ien.b(fitWorkout);
        } else {
            if (fitWorkout.isEquipmentCourse()) {
                return e(fitWorkout);
            }
            List<WorkoutAction> listAcquireWorkoutActions = fitWorkout.acquireWorkoutActions();
            if (njy.b(listAcquireWorkoutActions)) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < iAcquireRepeatTimes; i2++) {
                    arrayList.addAll(listAcquireWorkoutActions);
                }
                listC = ien.c(arrayList);
            } else {
                listC = null;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (njy.e(listC)) {
            ReleaseLogUtil.e("Suggestion_TrainDetailHelper", "workoutActionListAll.size is 0");
            return arrayList2;
        }
        if (fitWorkout.isLongVideoCourse()) {
            d(listC, fitWorkout.acquireId(), (ArrayList<Motion>) arrayList2);
            return arrayList2;
        }
        if (fitWorkout.isRunModelCourse()) {
            b(listC, i, fitWorkout.acquireId(), (ArrayList<Motion>) arrayList2);
            return arrayList2;
        }
        a(listC, i, fitWorkout.acquireId(), arrayList2);
        return arrayList2;
    }

    public static boolean a(List<ChoreographedSingleAction> list, int i, String str, ArrayList<Motion> arrayList) {
        if (list == null) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            AtomicAction action = list.get(i2).getAction();
            ChoreographedSingleAction choreographedSingleAction = list.get(i2);
            if (gzx.e(action, choreographedSingleAction) && !e(action, choreographedSingleAction, i, str, arrayList)) {
                return false;
            }
        }
        return true;
    }

    public static void d(List<ChoreographedSingleAction> list, String str, ArrayList<Motion> arrayList) {
        if (list == null) {
            LogUtil.e("Suggestion_TrainDetailHelper", "buildLongVideoMotions workoutActions is null");
            return;
        }
        for (ChoreographedSingleAction choreographedSingleAction : list) {
            if (choreographedSingleAction != null && choreographedSingleAction.getAction() != null) {
                c(choreographedSingleAction.getAction(), choreographedSingleAction, str, arrayList);
            }
        }
    }

    private static void c(AtomicAction atomicAction, ChoreographedSingleAction choreographedSingleAction, String str, ArrayList<Motion> arrayList) {
        Video video;
        String strD = gzq.d(atomicAction.getActionSportType());
        int[] iArr = {0, CommonUtils.j(e(atomicAction, "frequency"))};
        String strC = c(atomicAction, strD, iArr);
        Motion motion = new Motion(atomicAction.getId(), atomicAction.getName(), CommonUtils.j(e(choreographedSingleAction, MessageConstant.GROUP_MEDAL_TYPE)), iArr[1], iArr[0], strC);
        a(strC, motion, choreographedSingleAction.getCommentaryTraining());
        motion.saveWorkoutId(str);
        motion.setEquipments(atomicAction.getEquipments());
        motion.setTrainingPoints(atomicAction.getTrainingPoints());
        String strE = e(atomicAction, "actionVideo");
        List list = TextUtils.isEmpty(strE) ? Collections.EMPTY_LIST : (List) new Gson().fromJson(strE, new TypeToken<List<Video>>() { // from class: com.huawei.health.suggestion.ui.fitness.helper.TrainDetailHelper$1
        }.getType());
        if (njy.c(list, 0) && (video = (Video) list.get(0)) != null) {
            if (njy.c(video.getVideoSegmentList(), 0)) {
                motion.savePicUrl(video.getVideoSegmentList().get(0).getThumbnail());
            }
            motion.setOriginLogo(video.getLogoImgUrl());
            if (njy.c(video.getVideoSegmentList(), 0)) {
                motion.setDuration(ped.e(video.getVideoSegmentList().get(0).getDuration()));
            }
            motion.setVideoSegments(video.getVideoSegmentList());
        }
        motion.saveCalorie(qrs.h(TextUtils.isEmpty(e(atomicAction, "calorie")) ? "0" : e(atomicAction, "calorie")));
        motion.saveDifficulty(atomicAction.getDifficulty());
        motion.setDescription(atomicAction.getDescription());
        motion.setGap(CommonUtils.j(e(choreographedSingleAction, "gap")));
        motion.setCommentaryGap(choreographedSingleAction.getCommentaryGap());
        motion.setActionStep(e(atomicAction, "actionStep"));
        motion.setIntroduceLyric(e(atomicAction, "introduceLyric"));
        motion.setBreath(e(atomicAction, "breath"));
        motion.setFeeling(e(atomicAction, "feeling"));
        motion.setCommonError(e(atomicAction, "commonError"));
        String strE2 = e(atomicAction, "pictures");
        if (!TextUtils.isEmpty(strE2)) {
            motion.setPictures((List) new Gson().fromJson(strE2, new TypeToken<List<Pictures>>() { // from class: com.huawei.health.suggestion.ui.fitness.helper.TrainDetailHelper$2
            }.getType()));
        }
        arrayList.add(motion);
    }

    public static boolean b(List<ChoreographedSingleAction> list, int i, String str, ArrayList<Motion> arrayList) {
        if (list == null) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            AtomicAction action = list.get(i2).getAction();
            ChoreographedSingleAction choreographedSingleAction = list.get(i2);
            if (gzx.e(action, choreographedSingleAction) && !d(action, choreographedSingleAction, i, str, arrayList)) {
                return false;
            }
        }
        return true;
    }

    public static boolean b() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "Suggestion_TrainDetailHelper");
        if (deviceInfo == null) {
            LogUtil.j("Suggestion_TrainDetailHelper", "device info null");
            return false;
        }
        return eey.d(deviceInfo, 1);
    }

    public static boolean c() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "Suggestion_TrainDetailHelper");
        if (deviceInfo == null) {
            LogUtil.j("Suggestion_TrainDetailHelper", "device info null");
            return false;
        }
        return eey.d(deviceInfo, MachineControlPointResponse.OP_CODE_EXTENSION_SET_SUPPRESS_AUTO_PAUSE);
    }

    private static boolean d(List list) {
        return list != null && list.size() > 1;
    }

    private static Video b(List<Video> list, ChoreographedSingleAction choreographedSingleAction, String str, int i) {
        if ("hotbody".equals(str)) {
            choreographedSingleAction.putExtendProperty(MessageConstant.GROUP_MEDAL_TYPE, "1");
            return list.get(0);
        }
        if (njy.c(list, i)) {
            return list.get(i);
        }
        return null;
    }

    public static boolean c(IntPlan intPlan, String str) {
        return (intPlan == null || TextUtils.isEmpty(str) || intPlan.getPlanType().equals(IntPlan.PlanType.RUN_PLAN)) ? false : true;
    }

    private static void a(AtomicAction atomicAction, Motion motion, int i) {
        if (njy.c(atomicAction.getCovers(), i)) {
            motion.saveCovers(atomicAction.getCovers().get(i));
        }
    }

    private static boolean e(AtomicAction atomicAction, ChoreographedSingleAction choreographedSingleAction, int i, String str, ArrayList<Motion> arrayList) {
        String strD = gzq.d(atomicAction.getActionSportType());
        String strE = e(atomicAction, "actionVideo");
        List list = TextUtils.isEmpty(strE) ? Collections.EMPTY_LIST : (List) new Gson().fromJson(strE, new TypeToken<List<Video>>() { // from class: com.huawei.health.suggestion.ui.fitness.helper.TrainDetailHelper$3
        }.getType());
        if (d(list)) {
            Video videoB = b((List<Video>) list, choreographedSingleAction, strD, i);
            String strE2 = e(atomicAction, "audios");
            List list2 = TextUtils.isEmpty(strE2) ? Collections.EMPTY_LIST : (List) new Gson().fromJson(strE2, new TypeToken<List<Audio>>() { // from class: com.huawei.health.suggestion.ui.fitness.helper.TrainDetailHelper$4
            }.getType());
            if (d(list2)) {
                String strD2 = d((List<Audio>) list2, strD);
                int[] iArr = {0, CommonUtils.j(e(atomicAction, "frequency"))};
                String strC = c(atomicAction, strD, iArr);
                Motion motion = new Motion(atomicAction.getId(), atomicAction.getName(), CommonUtils.j(e(choreographedSingleAction, MessageConstant.GROUP_MEDAL_TYPE)), iArr[1], iArr[0], strC);
                a(strC, motion, choreographedSingleAction.getCommentaryTraining());
                if (!d(videoB, strD2, motion)) {
                    return false;
                }
                motion.saveWorkoutId(str);
                c(motion, atomicAction, i, choreographedSingleAction);
                arrayList.add(motion);
                return true;
            }
            LogUtil.e("Suggestion_TrainDetailHelper", atomicAction.getName(), "audio is null");
            return false;
        }
        LogUtil.e("Suggestion_TrainDetailHelper", atomicAction.getName(), "video is null or data is wrong");
        return false;
    }

    private static void c(Motion motion, AtomicAction atomicAction, int i, ChoreographedSingleAction choreographedSingleAction) {
        motion.setEquipments(atomicAction.getEquipments());
        motion.setTrainingPoints(atomicAction.getTrainingPoints());
        motion.saveCalorie(qrs.h(TextUtils.isEmpty(e(atomicAction, "calorie")) ? "0" : e(atomicAction, "calorie")));
        motion.saveDifficulty(atomicAction.getDifficulty());
        motion.setDescription(atomicAction.getDescription());
        a(atomicAction, motion, i);
        motion.setGap(CommonUtils.j(e(choreographedSingleAction, "gap")));
        motion.setActionStep(e(atomicAction, "actionStep"));
        motion.setIntroduceLyric(e(atomicAction, "introduceLyric"));
        motion.setBreath(e(atomicAction, "breath"));
        motion.setFeeling(e(atomicAction, "feeling"));
        motion.setCommonError(e(atomicAction, "commonError"));
        String strE = e(atomicAction, "pictures");
        if (!TextUtils.isEmpty(strE)) {
            LogUtil.a("Suggestion_TrainDetailHelper", "pictureString:", strE);
            motion.setPictures((List) new Gson().fromJson(strE, new TypeToken<List<Pictures>>() { // from class: com.huawei.health.suggestion.ui.fitness.helper.TrainDetailHelper$5
            }.getType()));
        }
        motion.setDuration(ped.e(CommonUtils.j(e(atomicAction, "duration"))));
        motion.setCommentaryGap(choreographedSingleAction.getCommentaryGap());
    }

    private static boolean d(AtomicAction atomicAction, ChoreographedSingleAction choreographedSingleAction, int i, String str, ArrayList<Motion> arrayList) {
        int iE;
        Motion motion = new Motion(atomicAction.getId(), atomicAction.getName(), CommonUtils.j(e(choreographedSingleAction, MessageConstant.GROUP_MEDAL_TYPE)), CommonUtils.j(e(atomicAction, "frequency")));
        motion.saveWorkoutId(str);
        motion.setEquipments(atomicAction.getEquipments());
        motion.setTrainingPoints(atomicAction.getTrainingPoints());
        motion.saveDifficulty(atomicAction.getDifficulty());
        motion.setDescription(atomicAction.getDescription());
        a(atomicAction, motion, i);
        motion.setGap(CommonUtils.j(e(choreographedSingleAction, "gap")));
        if (choreographedSingleAction.getTargetConfig() != null) {
            int iJ = CommonUtils.j(choreographedSingleAction.getTargetConfig().getId());
            motion.saveMeasurementType(iJ);
            if (iJ == 0) {
                iE = ien.c(choreographedSingleAction);
            } else {
                iE = ped.e(ien.c(choreographedSingleAction));
            }
            motion.saveMeasurementValue(iE);
        }
        motion.savePicUrl(e(choreographedSingleAction, "tabloidPicUrl"));
        if (choreographedSingleAction.getIntensityConfig() != null) {
            motion.saveSpecifiedSlope(choreographedSingleAction.getIntensityConfig().getValueL());
            motion.saveSpecifiedSpeed(choreographedSingleAction.getIntensityConfig().getValueL());
        }
        motion.setOriginLogo(e(atomicAction, "logoImgUrl"));
        motion.setActionStep(e(atomicAction, "actionStep"));
        motion.setIntroduceLyric(e(atomicAction, "introduceLyric"));
        motion.setBreath(e(atomicAction, "breath"));
        motion.setFeeling(e(atomicAction, "feeling"));
        motion.setCommonError(e(atomicAction, "commonError"));
        String strE = e(atomicAction, "pictures");
        if (!TextUtils.isEmpty(strE)) {
            motion.setPictures((List) new Gson().fromJson(strE, new TypeToken<List<Pictures>>() { // from class: com.huawei.health.suggestion.ui.fitness.helper.TrainDetailHelper$6
            }.getType()));
        }
        arrayList.add(motion);
        return true;
    }

    private static String e(Object obj, String str) {
        if (obj instanceof AtomicAction) {
            Map<String, String> extendProperty = ((AtomicAction) obj).getExtendProperty();
            if (extendProperty == null) {
                LogUtil.e("Suggestion_TrainDetailHelper", "getExtendProperty getExtendProperty null");
                return "";
            }
            return extendProperty.get(str);
        }
        if (obj instanceof ChoreographedSingleAction) {
            return ((ChoreographedSingleAction) obj).getExtendProperty(str);
        }
        LogUtil.e("Suggestion_TrainDetailHelper", "getExtendProperty action null");
        return "";
    }

    public static List<Motion> e(FitWorkout fitWorkout) {
        ArrayList arrayList = new ArrayList();
        if (fitWorkout.getEquipmentWorkoutAction() == null) {
            LogUtil.j("Suggestion_TrainDetailHelper", "equipmentWorkoutAction == null");
            arrayList.add(a(fitWorkout));
            return arrayList;
        }
        List<EquipmentStage> stageList = fitWorkout.getEquipmentWorkoutAction().getStageList();
        if (njy.e(stageList)) {
            LogUtil.j("Suggestion_TrainDetailHelper", "stageList == null");
            arrayList.add(a(fitWorkout));
            return arrayList;
        }
        for (EquipmentStage equipmentStage : stageList) {
            if (equipmentStage != null) {
                for (EquipmentAction equipmentAction : equipmentStage.getActionList()) {
                    if (equipmentAction != null) {
                        arrayList.add(e(equipmentAction));
                    }
                }
            }
        }
        return arrayList;
    }

    private static Motion a(FitWorkout fitWorkout) {
        Motion motion = new Motion();
        motion.saveName(fitWorkout.acquireName());
        motion.setDuration(ped.e(fitWorkout.acquireDuration()));
        if (fitWorkout.acquireDuration() == 0) {
            motion.saveCalorie(0.0f);
        } else {
            motion.saveCalorie(fitWorkout.acquireCalorie() / fitWorkout.acquireDuration());
        }
        VideoSegment videoSegment = new VideoSegment();
        videoSegment.setStartTime(0L);
        videoSegment.setEndTime(fitWorkout.acquireDuration() * 1000);
        videoSegment.setDuration(fitWorkout.acquireDuration());
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(videoSegment);
        motion.setVideoSegments(arrayList);
        motion.saveMotionType("timer");
        motion.saveRepeat(1);
        LogUtil.a("Suggestion_TrainDetailHelper", "default motion:", motion.acquireName(), " ", Float.valueOf(motion.acquireDuration()), " ", Float.valueOf(motion.acquireCalorie()));
        return motion;
    }

    private static Motion e(EquipmentAction equipmentAction) {
        Motion motion = new Motion();
        motion.saveName(equipmentAction.getActionName());
        motion.setDuration((int) (equipmentAction.getEndTime() - equipmentAction.getStartTime()));
        motion.saveCalorie(equipmentAction.getCalorie());
        VideoSegment videoSegment = new VideoSegment();
        videoSegment.setStartTime(equipmentAction.getStartTime());
        videoSegment.setEndTime(equipmentAction.getEndTime());
        videoSegment.setDuration(((int) (equipmentAction.getEndTime() - equipmentAction.getStartTime())) / 1000);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(videoSegment);
        motion.setVideoSegments(arrayList);
        motion.saveMotionType("timer");
        motion.saveRepeat(1);
        return motion;
    }

    public static void e(Context context) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(context).a(context.getResources().getString(R.string.IDS_device_bluetooth_open_request)).c(com.huawei.ui.commonui.R.string.IDS_device_bt_right_btn_info, new View.OnClickListener() { // from class: hkt.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Suggestion_TrainDetailHelper", "user choose open BT");
                try {
                    BluetoothAdapter.getDefaultAdapter().enable();
                } catch (RuntimeException e) {
                    ReleaseLogUtil.a("Suggestion_TrainDetailHelper", "user choose open BT error :", LogAnonymous.b(e));
                }
            }
        }).a(com.huawei.health.suggestion.R.string.IDS_device_bt_left_btn_info, new View.OnClickListener() { // from class: hkq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hkt.b(view);
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public static void c(final Context context, String str, String str2) {
        LogUtil.a("Suggestion_TrainDetailHelper", "showNotConnectDeviceDialog ", str);
        View viewInflate = View.inflate(context, com.huawei.health.suggestion.R.layout.dialog_not_connect_device, null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(com.huawei.health.suggestion.R.id.not_connect_device_describe);
        if (healthTextView != null) {
            healthTextView.setText(str);
        }
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(com.huawei.health.suggestion.R.id.go_support_device_explain);
        if (healthTextView2 != null) {
            healthTextView2.setText(str2);
        }
        final CustomViewDialog customViewDialogD = new CustomViewDialog.Builder(context).d(viewInflate).a((String) null).d(com.huawei.health.suggestion.R.string.IDS_plugin_fitnessadvice_ok, new View.OnClickListener() { // from class: hkt.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClassName(context.getPackageName(), "com.huawei.ui.homehealth.device.devicelist.DeviceMoreListActivity");
                iov.d(context, intent);
            }
        }).c(com.huawei.health.suggestion.R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: hkr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hkt.c(view);
            }
        }).d();
        customViewDialogD.setCancelable(false);
        customViewDialogD.show();
        viewInflate.findViewById(com.huawei.health.suggestion.R.id.go_support_device_explain).setOnClickListener(new View.OnClickListener() { // from class: hkt.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Suggestion_TrainDetailHelper", "go to support device explain");
                hkt.b(context);
                CustomViewDialog customViewDialog = customViewDialogD;
                if (customViewDialog == null || !customViewDialog.isShowing()) {
                    return;
                }
                customViewDialogD.dismiss();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context) {
        ddv.b().initH5Pro();
        H5ProLaunchOption h5ProLaunchOptionBuild = new H5ProLaunchOption.Builder().addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).setImmerse().showStatusBar().setStatusBarTextBlack(true).setForceDarkMode(0).build();
        LogUtil.a("Suggestion_TrainDetailHelper", "goToDevicesIntroduction baseUrl", EnvironmentHelper.getInstance().getUrl());
        H5ProClient.startH5LightApp(context, EnvironmentHelper.getInstance().getUrl() + "weixinScan/dist/index.html#/runPlanDevices", h5ProLaunchOptionBuild);
    }

    public static void b(final Context context, String str, String str2) {
        LogUtil.a("Suggestion_TrainDetailHelper", "showNotSupportPlanDialog ", str);
        View viewInflate = View.inflate(context, com.huawei.health.suggestion.R.layout.dialog_not_connect_device, null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(com.huawei.health.suggestion.R.id.not_connect_device_describe);
        if (healthTextView != null) {
            healthTextView.setText(str);
        }
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(com.huawei.health.suggestion.R.id.go_support_device_explain);
        if (healthTextView2 != null) {
            healthTextView2.setText(str2);
        }
        final CustomViewDialog customViewDialogD = new CustomViewDialog.Builder(context).d(viewInflate).a((String) null).d(com.huawei.health.suggestion.R.string.IDS_plugin_fitnessadvice_ok, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.helper.TrainDetailHelper$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hkt.d(context, view);
            }
        }).c(com.huawei.health.suggestion.R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: hkt.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).d();
        customViewDialogD.setCancelable(false);
        customViewDialogD.show();
        viewInflate.findViewById(com.huawei.health.suggestion.R.id.go_support_device_explain).setOnClickListener(new View.OnClickListener() { // from class: hkt.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Suggestion_TrainDetailHelper", "go to support device explain");
                hkt.b(context);
                CustomViewDialog customViewDialog = customViewDialogD;
                if (customViewDialog == null || !customViewDialog.isShowing()) {
                    return;
                }
                customViewDialogD.dismiss();
            }
        });
    }

    public static /* synthetic */ void d(Context context, View view) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.huawei.ui.device.activity.adddevice.OneKeyScanActivity");
        iov.d(context, intent);
    }

    public static String a(Context context) {
        return context.getResources().getString(com.huawei.health.suggestion.R.string.IDS_sug_custom_course_name);
    }

    public static int b(FitWorkout fitWorkout) {
        if (fitWorkout == null) {
            return 0;
        }
        return fitWorkout.acquireCommodityFlag();
    }

    public static boolean c(int i) {
        int modelType = pqh.b().getModelType();
        ReleaseLogUtil.d("Suggestion_TrainDetailHelper", "getIsAi:", Integer.valueOf(i), "modelType: ", Integer.valueOf(modelType), "harmony：", Boolean.valueOf(HarmonyBuild.e));
        return i == 1 && modelType != -1;
    }
}
