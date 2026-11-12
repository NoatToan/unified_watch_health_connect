package com.xiaomi.fitness.health.sleep.rhythm.utils;

import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.health.connect.client.records.OvulationTestRecord;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.api.repository.ISleepRepository;
import com.xiaomi.fit.fitness.export.data.project.SleepDiaryReport;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmPreference;
import com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmCalendarActivity;
import com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmMonitorGuideActivity;
import com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmSupportDevicesFragment;
import com.xiaomi.fitness.main.export.ConfigPreference;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import defpackage.av6;
import defpackage.c0j;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\u001a-\u0010\u0005\u001a\u00020\u0003*\u00020\u00062!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00030\b\u001a\u0010\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u001a\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013*\b\u0012\u0004\u0012\u00020\u00150\u0016\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"TAG", "", "startSleepRhythmActivity", "", "Landroid/content/Context;", "checkDeviceSupportEffective", "Landroidx/fragment/app/FragmentActivity;", "resultCallback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", OvulationTestRecord.Result.POSITIVE, "DEVICE_CAPABILITY_SUPPORT_RHYTHM", "", "checkDeviceSupportSleepRhythmEnable", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "toMap", "", "", "Lcom/xiaomi/fit/fitness/export/data/project/SleepDiaryReport;", "", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepRhythmExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepRhythmExt.kt\ncom/xiaomi/fitness/health/sleep/rhythm/utils/SleepRhythmExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,178:1\n1863#2,2:179\n*S KotlinDebug\n*F\n+ 1 SleepRhythmExt.kt\ncom/xiaomi/fitness/health/sleep/rhythm/utils/SleepRhythmExtKt\n*L\n174#1:179,2\n*E\n"})
public final class SleepRhythmExtKt {
    public static final int DEVICE_CAPABILITY_SUPPORT_RHYTHM = 268435456;

    @NotNull
    public static final String TAG = "SleepRhythmExt";

    public static final void checkDeviceSupportEffective(@NotNull final FragmentActivity fragmentActivity, @NotNull Function1<? super Boolean, Unit> resultCallback) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        boolean zIsDeviceConnected = wearableDeviceModel != null ? wearableDeviceModel.getIsDeviceConnected() : false;
        if (wearableDeviceModel != null && DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.SLEEP_RHYTHM) && checkDeviceSupportSleepRhythmEnable(wearableDeviceModel) && zIsDeviceConnected) {
            resultCallback.invoke2(Boolean.TRUE);
            return;
        }
        if (zIsDeviceConnected && wearableDeviceModel != null && DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.SLEEP_RHYTHM)) {
            CommonDialog commonDialogCreate = (CommonDialog) supportFragmentManager.l0("guide_update");
            if (commonDialogCreate == null || !commonDialogCreate.isShowing()) {
                if (commonDialogCreate == null) {
                    commonDialogCreate = new CommonDialog.c("guide_update").setDialogTitle(c0j.nj).setDialogDescription(c0j.mj).setNegativeText(c0j.oj).setPositiveText(c0j.pj).setCancelable(true).create();
                    Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
                }
                commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.sleep.rhythm.utils.SleepRhythmExtKt.checkDeviceSupportEffective.1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        super.onDialogClick(dialogName, dialog, which);
                        if (which == -1) {
                            MainExtKt.showTabWithIndex(fragmentActivity, MainTab.INSTANCE.getINDEX_DEVICE());
                        }
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                    }
                });
                commonDialogCreate.showIfNeed(supportFragmentManager);
                return;
            }
            return;
        }
        if (checkDeviceSupportSleepRhythmEnable(wearableDeviceModel) && (wearableDeviceModel == null || DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.SLEEP_RHYTHM))) {
            Application application = fragmentActivity.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            ToastExtKt.toastShort(application, c0j.f4801r);
            return;
        }
        CommonDialog commonDialogCreate2 = (CommonDialog) supportFragmentManager.l0("guide_bind_or_buy");
        if (commonDialogCreate2 == null || !commonDialogCreate2.isShowing()) {
            if (commonDialogCreate2 == null) {
                commonDialogCreate2 = new CommonDialog.c("guide_bind_or_buy").setDialogTitle(c0j.Qi).setDialogDescription(c0j.Oi).setNegativeText(c0j.I7).setPositiveText(c0j.Pi).setCancelable(false).setCanceledOnBackPressed(false).setCanceledOnTouchOutside(false).create();
                Intrinsics.checkNotNullExpressionValue(commonDialogCreate2, "create(...)");
            }
            commonDialogCreate2.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.sleep.rhythm.utils.SleepRhythmExtKt.checkDeviceSupportEffective.2
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -1) {
                        BaseFragmentExKt.gotoFragmentPage(fragmentActivity, SleepRhythmSupportDevicesFragment.class, null, false);
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            });
            commonDialogCreate2.showIfNeed(supportFragmentManager);
        }
    }

    public static final boolean checkDeviceSupportSleepRhythmEnable(@Nullable WearableDeviceModel wearableDeviceModel) {
        if (wearableDeviceModel == null) {
            Logger.i(TAG, "checkDeviceSupportSleepRhythmEnable device model null");
            return false;
        }
        int deviceCapability = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapability(wearableDeviceModel.getDid());
        boolean z = (268435456 & deviceCapability) != 0;
        Logger.i(TAG, "deviceSupportCapability " + deviceCapability + ";device support rhythm: " + z);
        return z;
    }

    public static final void startSleepRhythmActivity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        boolean is_support_sleep_rhythm = ConfigPreference.INSTANCE.getIS_SUPPORT_SLEEP_RHYTHM();
        Logger.i("是否支持健康研究" + is_support_sleep_rhythm, new Object[0]);
        boolean rhyThmDataValidByAllData = ((ISleepRepository) FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRepository(ISleepRepository.class)).getRhyThmDataValidByAllData();
        Logger.i(TAG, "dataValidByAllData " + rhyThmDataValidByAllData);
        if (rhyThmDataValidByAllData) {
            SleepRhythmPreference.INSTANCE.setUsedSleepRhythmMonitorCycle(true);
            context.startActivity(new Intent(context, (Class<?>) SleepRhythmCalendarActivity.class));
            return;
        }
        if (is_support_sleep_rhythm && !rhyThmDataValidByAllData) {
            HealthPageExtKt.getInstance(IHealthPage.INSTANCE).goToHealthVisitDoctorPage(context, 98);
        }
        if (is_support_sleep_rhythm || rhyThmDataValidByAllData) {
            return;
        }
        context.startActivity(new Intent(context, (Class<?>) SleepRhythmMonitorGuideActivity.class));
    }

    @NotNull
    public static final Map<Long, SleepDiaryReport> toMap(@NotNull List<SleepDiaryReport> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (SleepDiaryReport sleepDiaryReport : list) {
            linkedHashMap.put(Long.valueOf(sleepDiaryReport.getTime()), sleepDiaryReport);
        }
        return linkedHashMap;
    }
}
