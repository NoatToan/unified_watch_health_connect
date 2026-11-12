package com.xiaomi.fitness.sport.export;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mi.health.course.export.CourseApi;
import com.mi.health.course.export.data.TrainingCourseInfo;
import com.mi.health.utils.MapUtilsKt;
import com.xiaomi.eco.api.EcoScalePreference;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.internal.extetions.LogExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.net.downloadV2.DownloadException;
import com.xiaomi.fitness.net.downloadV2.DownloadManager;
import com.xiaomi.fitness.net.downloadV2.DownloadProgress;
import com.xiaomi.fitness.net.downloadV2.DownloadRequest;
import com.xiaomi.fitness.net.downloadV2.listener.ISingleFileDownloadListener;
import com.xiaomi.fitness.net.downloadV2.util.ZipUtils;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.RNDeviceModel;
import com.xiaomi.fitness.rn.export.bean.RNDevice;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import com.xiaomi.fitness.sport.MapboxUtilImpl;
import com.xiaomi.fitness.sport.eco.export.EcoSportManager;
import com.xiaomi.fitness.sport.eco.export.EcoSportManagerExtKt;
import com.xiaomi.fitness.sport.export.SportAccessApiImp;
import com.xiaomi.fitness.sport.sporttab.SupportCityManager;
import com.xiaomi.fitness.sport.sporttab.recycler.LaunchSportButtonAdapter;
import com.xiaomi.fitness.sport.sporttab.util.SportTabOneTrackExtKt;
import com.xiaomi.fitness.sport.utils.AidongMotionSensingCourseUtilExtKt;
import com.xiaomi.fitness.sport.utils.SportAccessUtils;
import com.xiaomi.fitness.sport.utils.SportAudioFeedbackExtKt;
import com.xiaomi.fitness.sport.utils.SportBeanHelperExtKt;
import com.xiaomi.fitness.sport.utils.SportPermissionsUtil;
import com.xiaomi.fitness.sport.utils.SportPreference;
import com.xiaomi.fitness.sport.utils.SportUtilsExtKt;
import com.xiaomi.fitness.sport.view.SensingGameCourseSdkCheckActivity;
import com.xiaomi.fitness.sport.view.launch.LaunchSportActivity;
import com.xiaomi.fitness.sport.view.launch.LaunchSportModel;
import com.xiaomi.fitness.sport.view.wear.guide.SportBeanModeWearGuideActivity;
import com.xiaomi.fitness.sport_eco_manager_export.SportConstants;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import com.xiaomi.fitness.sport_export.ISportAccessApi;
import com.xiaomi.fitness.sport_export.data.RunningRouteSupportCityBean;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlanCourse;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanRunningCourse;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanVideoCourse;
import com.xiaomi.fitness.training_plan_export.model.HabitDayPlan;
import defpackage.c1j;
import defpackage.clb;
import defpackage.dbm;
import defpackage.eoi;
import defpackage.im9;
import defpackage.lp5;
import defpackage.pz6;
import defpackage.wam;
import defpackage.zxi;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 M2\u00020\u0001:\u0001MB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016J \u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0016J\b\u0010\u001f\u001a\u00020\u000bH\u0016J\u001a\u0010 \u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010!\u001a\u00020\"H\u0016J\"\u0010#\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020'H\u0016J\u0018\u0010(\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010)\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010*\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0016J@\u00107\u001a\u00020\u000b26\u00108\u001a2\u0012\u0013\u0012\u00110,¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(5\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u000b02H\u0016J@\u00109\u001a\u00020\u000b26\u00108\u001a2\u0012\u0013\u0012\u00110,¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(5\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u000b02H\u0016J\u0018\u0010:\u001a\u00020\u000b2\u0006\u00105\u001a\u00020,2\u0006\u00106\u001a\u00020\u001bH\u0016J\u0016\u0010<\u001a\u00020\u000b2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0016J\u0016\u0010=\u001a\u00020\u000b2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0016J\b\u0010>\u001a\u00020\u000bH\u0016J4\u0010?\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020'2\u0006\u0010A\u001a\u00020,2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0016J\b\u0010D\u001a\u00020\u000bH\u0016J6\u0010E\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020'2\b\u0010F\u001a\u0004\u0018\u00010,2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0002J3\u0010G\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020,2!\u0010B\u001a\u001d\u0012\u0013\u0012\u00110,¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(I\u0012\u0004\u0012\u00020\u000b0HH\u0002J\u0010\u0010J\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020LH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tRD\u00100\u001a8\u00124\u00122\u0012\u0013\u0012\u00110,¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(5\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u000b0201X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000f01X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lcom/xiaomi/fitness/sport/export/SportAccessApiImp;", "Lcom/xiaomi/fitness/sport_export/ISportAccessApi;", "<init>", "()V", "courseApi", "Lcom/mi/health/course/export/CourseApi;", "getCourseApi", "()Lcom/mi/health/course/export/CourseApi;", "setCourseApi", "(Lcom/mi/health/course/export/CourseApi;)V", "checkWearModeAndSwitchToBandModeIfNeed", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "callback", "Lkotlin/Function0;", "getMapboxInstance", "doAllNecessaryChecksAndGoToAidongSdkIfNeed", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "fallbackFunction", "jumpSensingGamePageCheckActivity", "context", "Landroid/content/Context;", "launchSportBeanModeWearGuideActivity", "launchLaunchSportActivity", DailyRecordKey.sportType, "", "getSportPermissions", LifecycleConstantKt.TYPE_ACTIVITY, "launch", "addLaunchSportShortcut", "launchAbilityTrainingSport", "abilityPlanCourse", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlanCourse;", "launchHabitTrainingSport", "habitDayPlan", "Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;", "isDeviceSupportTrainingPlan", "", "clickSportBanner", "setClickCallback", "launchToRopeSkipping", "getFirstLineStr", "", "report", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "getSecondLineStr", "mSportChangeListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "status", "type", "addSportChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeSportChangeListener", "notifySportChanged", "mSportDataChangeListeners", "addSportDataChangeListener", "removeSportDataChangeListener", "notifySportDataChanged", "checkAndDownloadAudioFeedbackResourcesIfNeed", "showToast", "callSite", "onSuccess", "onFail", "unzipAndDeleteAudioFeedbackResZipFile", "downloadSportAudioFeedbackIfNeed", "targetDirPath", "executeDownload", "Lkotlin/Function1;", "path", "initSupportCityData", "data", "Lcom/xiaomi/fitness/sport_export/data/RunningRouteSupportCityBean;", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportAccessApiImp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportAccessApiImp.kt\ncom/xiaomi/fitness/sport/export/SportAccessApiImp\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,561:1\n774#2:562\n865#2,2:563\n1062#2:565\n1863#2,2:566\n1863#2,2:568\n*S KotlinDebug\n*F\n+ 1 SportAccessApiImp.kt\ncom/xiaomi/fitness/sport/export/SportAccessApiImp\n*L\n282#1:562\n282#1:563,2\n283#1:565\n404#1:566,2\n419#1:568,2\n*E\n"})
public final class SportAccessApiImp implements ISportAccessApi {

    @NotNull
    private static final String SPORT_AUDIO_FEEDBACK_ZIP_MD5 = "11edc6258f6b6460e036024074b7266f";

    @NotNull
    public static final String TAG = "SportAccessApiImp";
    public CourseApi courseApi;

    @NotNull
    private final CopyOnWriteArrayList<Function2<String, Integer, Unit>> mSportChangeListeners = new CopyOnWriteArrayList<>();

    @NotNull
    private final CopyOnWriteArrayList<Function0<Unit>> mSportDataChangeListeners = new CopyOnWriteArrayList<>();

    private final void downloadSportAudioFeedbackIfNeed(final boolean showToast, final String targetDirPath, final Function0<Unit> onSuccess, final Function0<Unit> onFail) {
        if (targetDirPath == null) {
            return;
        }
        if (showToast) {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), c1j.f0);
        }
        executeDownload(targetDirPath, new Function1() { // from class: h9n
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportAccessApiImp.downloadSportAudioFeedbackIfNeed$lambda$15(targetDirPath, onSuccess, onFail, showToast, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit downloadSportAudioFeedbackIfNeed$lambda$15(String str, Function0 onSuccess, Function0 onFail, boolean z, String path) {
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "$onFail");
        Intrinsics.checkNotNullParameter(path, "path");
        Logger.i(TAG, "downloadSportAudioFeedbackIfNeed onSuccess: path=" + path + " targetDirPath=" + str);
        File file = new File(path);
        String fileMD5 = MD5Util.getFileMD5(file);
        if (Intrinsics.areEqual(fileMD5, SPORT_AUDIO_FEEDBACK_ZIP_MD5)) {
            Logger.i(TAG, "downloadSportAudioFeedbackIfNeed zipFileMD5=" + fileMD5);
            boolean zUnzip = ZipUtils.INSTANCE.unzip(path, str);
            Logger.i(TAG, "downloadSportAudioFeedbackIfNeed unzip result: " + zUnzip);
            if (zUnzip) {
                onSuccess.invoke();
                try {
                    new File(path).delete();
                    Logger.i(TAG, "downloadSportAudioFeedbackIfNeed delete succeeded.");
                } catch (Exception e) {
                    Logger.i(TAG, "downloadSportAudioFeedbackIfNeed delete failed. error: " + e);
                }
            } else {
                onFail.invoke();
            }
        } else {
            onFail.invoke();
            Logger.i(TAG, "downloadSportAudioFeedbackIfNeed MD5 verification failed. ");
            try {
                file.deleteOnExit();
                if (z) {
                    ToastExtKt.toastShort(ApplicationExtKt.getApplication(), c1j.common_hint_unkonwn_error);
                }
            } catch (Exception e2) {
                Logger.i(TAG, "downloadSportAudioFeedbackIfNeed deleteOnExit failed. error=" + e2);
            }
        }
        return Unit.INSTANCE;
    }

    private final void executeDownload(String targetDirPath, final Function1<? super String, Unit> onSuccess) {
        try {
            DownloadManager.INSTANCE.downloadSingleFile(new DownloadRequest(SportAudioFeedbackExtKt.SPORT_AUDIO_FEEDBACK_URL, null, null, targetDirPath, 6, null), new ISingleFileDownloadListener() { // from class: com.xiaomi.fitness.sport.export.SportAccessApiImp.executeDownload.1
                @Override // com.xiaomi.fitness.net.downloadV2.listener.ISingleFileDownloadListener
                public void onError(DownloadException e) {
                    Intrinsics.checkNotNullParameter(e, "e");
                    Logger.e(SportAccessApiImp.TAG, "Download error: " + e.getMessage(), e);
                }

                @Override // com.xiaomi.fitness.net.downloadV2.listener.ISingleFileDownloadListener
                public void onProgress(DownloadProgress progress) {
                    Intrinsics.checkNotNullParameter(progress, "progress");
                    Logger.d(SportAccessApiImp.TAG, "onProgress progress=" + progress);
                }

                @Override // com.xiaomi.fitness.net.downloadV2.listener.ISingleFileDownloadListener
                public void onStart(long contentLength) {
                    Logger.d(SportAccessApiImp.TAG, "onStart contentLength=" + contentLength);
                }

                @Override // com.xiaomi.fitness.net.downloadV2.listener.ISingleFileDownloadListener
                public void onSuccess(String path) {
                    Intrinsics.checkNotNullParameter(path, "path");
                    Logger.i(SportAccessApiImp.TAG, "onSuccess path=" + path);
                    onSuccess.invoke2(path);
                }
            });
        } catch (Exception e) {
            Logger.e(TAG, "Unexpected error: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }

    private final void launchToRopeSkipping(Context context) {
        EcoDeviceModel localDeviceModel;
        String str;
        Iterable deviceModels = RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).getDeviceModels();
        ArrayList arrayList = new ArrayList();
        for (Object obj : deviceModels) {
            if (StringsKt__StringsJVMKt.startsWith$default(DeviceModelExtKt.getModel((RNDeviceModel) obj), SportConstants.GYM_MODEL_YUN_MAI_JUMP2_PREFIX, false, 2, null)) {
                arrayList.add(obj);
            }
        }
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.xiaomi.fitness.sport.export.SportAccessApiImp$launchToRopeSkipping$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                String orderTimeJString;
                String orderTimeJString2;
                RNDevice device = ((RNDeviceModel) t2).getDevice();
                Integer numValueOf = null;
                Integer numValueOf2 = (device == null || (orderTimeJString2 = device.getOrderTimeJString()) == null) ? null : Integer.valueOf(Integer.parseInt(orderTimeJString2));
                RNDevice device2 = ((RNDeviceModel) t).getDevice();
                if (device2 != null && (orderTimeJString = device2.getOrderTimeJString()) != null) {
                    numValueOf = Integer.valueOf(Integer.parseInt(orderTimeJString));
                }
                return ComparisonsKt__ComparisonsKt.compareValues(numValueOf2, numValueOf);
            }
        });
        List list = listSortedWith;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RNDevice device = ((RNDeviceModel) listSortedWith.get(i)).getDevice();
            Logger.i(LaunchSportButtonAdapter.TAG, "orderTimeJString --------" + (device != null ? device.getOrderTimeJString() : null) + " ");
        }
        if (!(!list.isEmpty())) {
            SportManagerExportPreference sportManagerExportPreference = SportManagerExportPreference.INSTANCE;
            if (AppUtil.INSTANCE.isPlayChannel()) {
                str = "yunmai.jmprope.sr804";
            } else {
                EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
                EcoDeviceModel localDeviceModel2 = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel("yunmai.jmprope.sr803");
                str = ((localDeviceModel2 == null || !localDeviceModel2.getIsDeviceConnected()) && (localDeviceModel = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel(SportConstants.GYM_MODEL_YUN_MAI_JUMP_WINE_RED)) != null && localDeviceModel.getIsDeviceConnected()) ? SportConstants.GYM_MODEL_YUN_MAI_JUMP_WINE_RED : "yunmai.jmprope.sr803";
            }
            sportManagerExportPreference.setKEY_GYM_LOCAL_SPORT_TYPE(str);
            EcoSportManagerExtKt.getINSTANCE(EcoSportManager.INSTANCE).goToGymLaunchSportActivity(context, null);
            return;
        }
        String string = EcoScalePreference.getString(SportConstants.KEY_CURRENT_BIND_ROPE_SKIPPING + AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId());
        if (string == null || string.length() == 0) {
            RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).openPlugin(((RNDeviceModel) listSortedWith.get(0)).getDid());
            return;
        }
        RNDeviceManager.Companion companion2 = RNDeviceManager.INSTANCE;
        if (((RNDeviceModel) RNDeviceManagerExtKt.getInstance(companion2).getDeviceModel(string)) != null) {
            RNDeviceManagerExtKt.getInstance(companion2).openPlugin(string);
        } else {
            RNDeviceManagerExtKt.getInstance(companion2).openPlugin(((RNDeviceModel) listSortedWith.get(0)).getDid());
        }
    }

    private final void setClickCallback(int sportType, FragmentActivity fragmentActivity) {
        if (sportType == 1 || sportType == 2 || sportType == 3 || sportType == 6) {
            if (!SportUtilsExtKt.perfectInfo(fragmentActivity) || new LaunchSportModel().isShowCtaDialog(fragmentActivity)) {
                return;
            }
            Intent intent = new Intent(fragmentActivity, (Class<?>) LaunchSportActivity.class);
            intent.putExtra("KEY_SPORT_TYPE", sportType);
            intent.putExtra("type", String.valueOf(sportType));
            fragmentActivity.startActivity(intent);
            return;
        }
        if (sportType == 14) {
            if (!SportUtilsExtKt.perfectInfo(fragmentActivity) || new LaunchSportModel().isShowCtaDialog(fragmentActivity)) {
                return;
            }
            launchToRopeSkipping(fragmentActivity);
            return;
        }
        if (sportType == 324 && SportUtilsExtKt.perfectInfo(fragmentActivity) && !new LaunchSportModel().isShowCtaDialog(fragmentActivity)) {
            SportManagerExportPreference.INSTANCE.setKEY_GYM_LOCAL_SPORT_TYPE("yesoul.exbike.jsc01y");
            EcoSportManagerExtKt.getINSTANCE(EcoSportManager.INSTANCE).goToGymLaunchSportActivity(fragmentActivity, null);
        }
    }

    @Override // com.xiaomi.fitness.sport_export.ISportAccessApi
    public void addLaunchSportShortcut() {
        if (AppUtil.INSTANCE.isPlayChannel()) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("mihealth://intent?pageType=sporttab"));
        intent.setFlags(268468224);
        wam wamVarA = new wam.b(ApplicationExtKt.getApplication(), "startSport").f(ResourceExtKt.getString(c1j.I5)).f(ResourceExtKt.getString(c1j.I5)).b(IconCompat.j(ApplicationExtKt.getApplication(), eoi.o)).c(intent).e(0).a();
        Intrinsics.checkNotNullExpressionValue(wamVarA, "build(...)");
        dbm.f(ApplicationExtKt.getApplication(), wamVarA);
    }

    @Override // com.xiaomi.fitness.sport_export.ISportAccessApi
    public void addSportChangeListener(@NotNull Function2<? super String, ? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mSportChangeListeners.add(listener);
    }

    @Override // com.xiaomi.fitness.sport_export.ISportAccessApi
    public void addSportDataChangeListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mSportDataChangeListeners.add(listener);
    }

    @Override // com.xiaomi.fitness.sport_export.ISportAccessApi
    public void checkAndDownloadAudioFeedbackResourcesIfNeed(boolean showToast, @NotNull String callSite, @NotNull Function0<Unit> onSuccess, @NotNull Function0<Unit> onFail) {
        Intrinsics.checkNotNullParameter(callSite, "callSite");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        if (AppUtil.INSTANCE.isPlayChannel()) {
            onSuccess.invoke();
            return;
        }
        boolean zCheckSportRemindAudioFilesComplete = SportAudioFeedbackExtKt.checkSportRemindAudioFilesComplete();
        Logger.i(TAG, "downloadSportAudioFeedbackResources complete=" + zCheckSportRemindAudioFilesComplete + " callSite=" + callSite);
        if (!RegionPreference.INSTANCE.getPRIVACY_AGREE()) {
            onFail.invoke();
            return;
        }
        if (zCheckSportRemindAudioFilesComplete) {
            onSuccess.invoke();
        } else {
            if (NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication())) {
                downloadSportAudioFeedbackIfNeed(showToast, im9.H(), onSuccess, onFail);
                return;
            }
            if (showToast) {
                ToastExtKt.toastShort(ApplicationExtKt.getApplication(), c1j.common_network_unavailable_wont_work);
            }
            onFail.invoke();
        }
    }

    @Override // com.xiaomi.fitness.sport_export.ISportAccessApi
    public void checkWearModeAndSwitchToBandModeIfNeed(@NotNull FragmentManager fragmentManager, @NotNull Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(callback, "callback");
        SportBeanHelperExtKt.checkDeviceWearModeAndSwitchToBandModeIfNeed$default(fragmentManager, null, callback, 2, null);
    }

    @Override // com.xiaomi.fitness.sport_export.ISportAccessApi
    public void clickSportBanner(@NotNull FragmentActivity fragmentActivity, int sportType) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        clb.a(fragmentActivity);
        setClickCallback(sportType, fragmentActivity);
        SportTabOneTrackExtKt.oneTrackOnLaunchSportEntranceClick(sportType);
    }

    @Override // com.xiaomi.fitness.sport_export.ISportAccessApi
    public void doAllNecessaryChecksAndGoToAidongSdkIfNeed(@NotNull FragmentActivity fragmentActivity, @Nullable Function0<Unit> fallbackFunction) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        AidongMotionSensingCourseUtilExtKt.doAllNecessaryCheckAndGoToAidongSdkIfNeed$default(fallbackFunction, fragmentActivity, null, 4, null);
    }

    @NotNull
    public final CourseApi getCourseApi() {
        CourseApi courseApi = this.courseApi;
        if (courseApi != null) {
            return courseApi;
        }
        Intrinsics.throwUninitializedPropertyAccessException("courseApi");
        return null;
    }

    @Override // com.xiaomi.fitness.sport_export.ISportAccessApi
    @NotNull
    public String getFirstLineStr(@NotNull SportBasicReport report) {
        Integer gymTrainingTotalTimes;
        Intrinsics.checkNotNullParameter(report, "report");
        int sportType = report.getSportType();
        Integer distance = report.getDistance();
        int iIntValue = distance != null ? distance.intValue() : 0;
        int iA = lp5.a(report);
        String courseName = report.getCourseName();
        if (courseName == null) {
            courseName = lp5.c(iA);
        }
        Intrinsics.checkNotNull(courseName);
        if (sportType == 14) {
            int sportCount = report.getSportCount();
            String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(zxi.common_unit_rope_count, sportCount);
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            return ApplicationExtKt.getApplication().getString(c1j.a5, courseName, sportCount + quantityString);
        }
        if ((sportType == 313 && (gymTrainingTotalTimes = report.getGymTrainingTotalTimes()) != null && gymTrainingTotalTimes.intValue() > 0) || sportType == 334) {
            int sportCount2 = report.getSportCount();
            String quantityString2 = ApplicationExtKt.getApplication().getResources().getQuantityString(zxi.f41783r, sportCount2, Integer.valueOf(sportCount2));
            Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
            return ApplicationExtKt.getApplication().getString(c1j.a5, courseName, quantityString2);
        }
        if (iIntValue <= 0) {
            return courseName;
        }
        Integer correctedDistance = report.getCorrectedDistance();
        Integer distance2 = (correctedDistance == null || correctedDistance.intValue() <= 0) ? report.getDistance() : report.getCorrectedDistance();
        Application application = ApplicationExtKt.getApplication();
        Intrinsics.checkNotNull(distance2);
        return ApplicationExtKt.getApplication().getString(c1j.a5, courseName, pz6.b(application, distance2.intValue()));
    }

    @Override // com.xiaomi.fitness.sport_export.ISportAccessApi
    public void getMapboxInstance() {
        MapboxUtilImpl.INSTANCE.getMapboxInstance();
    }

    @Override // com.xiaomi.fitness.sport_export.ISportAccessApi
    @NotNull
    public String getSecondLineStr(@NotNull SportBasicReport report) {
        int duration;
        String string;
        Intrinsics.checkNotNullParameter(report, "report");
        if (report.getProtoType() != 25 || report.getTotalDivingDuration() == null) {
            duration = report.getDuration();
        } else {
            Integer totalDivingDuration = report.getTotalDivingDuration();
            Intrinsics.checkNotNull(totalDivingDuration);
            duration = totalDivingDuration.intValue();
        }
        String zNTimeWithSec = TimeDateUtil.getZNTimeWithSec(duration);
        Integer calories = report.getCalories();
        int iIntValue = calories != null ? calories.intValue() : 0;
        String dateMMddFormat = TimeDateUtil.getDateMMddFormat(report.getStartTime());
        if (iIntValue > 0) {
            String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(zxi.common_unit_calorie_desc, report.getCalories(), report.getCalories());
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            string = ApplicationExtKt.getApplication().getString(c1j.b5, zNTimeWithSec, quantityString, dateMMddFormat);
        } else {
            string = ApplicationExtKt.getApplication().getString(c1j.c5, zNTimeWithSec, dateMMddFormat);
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    @Override // com.xiaomi.fitness.sport_export.ISportAccessApi
    public void getSportPermissions(@Nullable FragmentActivity activity, int sportType, @NotNull Function0<Unit> launch) {
        Intrinsics.checkNotNullParameter(launch, "launch");
        if (activity != null) {
            SportPermissionsUtil.INSTANCE.getSportPermissions(activity, sportType, launch);
        }
    }

    @Override // com.xiaomi.fitness.sport_export.ISportAccessApi
    public void initSupportCityData(@NotNull RunningRouteSupportCityBean data) {
        Intrinsics.checkNotNullParameter(data, "data");
        SupportCityManager.INSTANCE.initSupportCityData(data);
    }

    @Override // com.xiaomi.fitness.sport_export.ISportAccessApi
    public boolean isDeviceSupportTrainingPlan() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        return wearableDeviceModel != null && com.xiaomi.fitness.sport.extension.DeviceModelExtKt.supportTrainingPlan(wearableDeviceModel);
    }

    @Override // com.xiaomi.fitness.sport_export.ISportAccessApi
    public void jumpSensingGamePageCheckActivity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, (Class<?>) SensingGameCourseSdkCheckActivity.class);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.sport_export.ISportAccessApi
    public void launchAbilityTrainingSport(@Nullable FragmentActivity context, @NotNull AbilityDayPlanCourse abilityPlanCourse) {
        Intrinsics.checkNotNullParameter(abilityPlanCourse, "abilityPlanCourse");
        AbilityPlanRunningCourse runningCourse = abilityPlanCourse.getCourseContent().getRunningCourse();
        AbilityPlanVideoCourse abilityPlanVideoCourse = null;
        if (runningCourse != null) {
            runningCourse.setPlanId(abilityPlanCourse.getPlanId());
            runningCourse.setCourseId(abilityPlanCourse.getCourseId());
            runningCourse.setName(abilityPlanCourse.getName());
        } else {
            runningCourse = null;
        }
        AbilityPlanVideoCourse videoCourse = abilityPlanCourse.getCourseContent().getVideoCourse();
        if (videoCourse != null) {
            videoCourse.setPlanId(abilityPlanCourse.getPlanId());
            abilityPlanVideoCourse = videoCourse;
        }
        if (context == null) {
            LogExtKt.loge(TAG, "can not launchAbilityTrainingSport with empty context!!");
            return;
        }
        if (runningCourse == null) {
            if (abilityPlanVideoCourse != null) {
                CourseApi.DefaultImpls.goToCourseInfoActivity$default(getCourseApi(), context, abilityPlanVideoCourse.getCourseId(), new TrainingCourseInfo(abilityPlanVideoCourse.getPlanId(), abilityPlanCourse.getStatus()), 0, 8, null);
                return;
            }
            return;
        }
        MapUtilsKt.updatePrivacy();
        Logger.d(TAG, "launchAbilityTrainingSport:" + runningCourse.getPlanId() + "-" + runningCourse.getCourseId());
        SportAccessUtils sportAccessUtils = SportAccessUtils.INSTANCE;
        Bundle bundle = new Bundle();
        bundle.putSerializable(com.xiaomi.fitness.sport.SportConstants.KEY_ABILITY_TRAINING_INFO, runningCourse);
        Unit unit = Unit.INSTANCE;
        sportAccessUtils.launchSportImmediately(context, 1, bundle);
    }

    @Override // com.xiaomi.fitness.sport_export.ISportAccessApi
    public void launchHabitTrainingSport(@Nullable FragmentActivity context, int sportType, @NotNull HabitDayPlan habitDayPlan) {
        Intrinsics.checkNotNullParameter(habitDayPlan, "habitDayPlan");
        if (context == null) {
            LogExtKt.loge(TAG, "can not launchHabitTrainingSport with empty context!!");
            return;
        }
        MapUtilsKt.updatePrivacy();
        SportAccessUtils sportAccessUtils = SportAccessUtils.INSTANCE;
        Bundle bundle = new Bundle();
        bundle.putSerializable(com.xiaomi.fitness.sport.SportConstants.KEY_HABIT_TRAINING_INFO, habitDayPlan);
        Unit unit = Unit.INSTANCE;
        sportAccessUtils.launchSportImmediately(context, sportType, bundle);
    }

    @Override // com.xiaomi.fitness.sport_export.ISportAccessApi
    public void launchLaunchSportActivity(int sportType, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, (Class<?>) LaunchSportActivity.class);
        intent.putExtra("KEY_SPORT_TYPE", sportType);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.sport_export.ISportAccessApi
    public void launchSportBeanModeWearGuideActivity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (SportPreference.INSTANCE.getSHOULD_SHOW_SPORT_BEAN_MODE_WEAR_GUIDE()) {
            Intent intent = new Intent(context, (Class<?>) SportBeanModeWearGuideActivity.class);
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    @Override // com.xiaomi.fitness.sport_export.ISportAccessApi
    public void notifySportChanged(@NotNull String status, int type) {
        Intrinsics.checkNotNullParameter(status, "status");
        Iterator<T> it = this.mSportChangeListeners.iterator();
        while (it.hasNext()) {
            ((Function2) it.next()).invoke(status, Integer.valueOf(type));
        }
    }

    @Override // com.xiaomi.fitness.sport_export.ISportAccessApi
    public void notifySportDataChanged() {
        Iterator<T> it = this.mSportDataChangeListeners.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
    }

    @Override // com.xiaomi.fitness.sport_export.ISportAccessApi
    public void removeSportChangeListener(@NotNull Function2<? super String, ? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mSportChangeListeners.remove(listener);
    }

    @Override // com.xiaomi.fitness.sport_export.ISportAccessApi
    public void removeSportDataChangeListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mSportDataChangeListeners.remove(listener);
    }

    public final void setCourseApi(@NotNull CourseApi courseApi) {
        Intrinsics.checkNotNullParameter(courseApi, "<set-?>");
        this.courseApi = courseApi;
    }

    @Override // com.xiaomi.fitness.sport_export.ISportAccessApi
    public void unzipAndDeleteAudioFeedbackResZipFile() {
        String strH = im9.H();
        if (strH == null) {
            return;
        }
        String str = strH + "AudioFeedback.zip";
        Logger.d(TAG, "unzipAudioFeedbackZipAndDeleteZip zipFilePath=" + str);
        if (new File(str).exists()) {
            boolean zUnzip = ZipUtils.INSTANCE.unzip(str, strH);
            Logger.i(TAG, "unzipAudioFeedbackZipAndDeleteZip unzip result: " + zUnzip);
            if (zUnzip) {
                try {
                    new File(str).delete();
                    Logger.i(TAG, "unzipAudioFeedbackZipAndDeleteZip delete succeeded.");
                } catch (Exception e) {
                    Logger.i(TAG, "unzipAudioFeedbackZipAndDeleteZip delete failed. error: " + e);
                }
            }
        }
    }
}
