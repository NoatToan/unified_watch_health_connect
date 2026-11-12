package com.xiaomi.fitness.sport.view.tab.adapter;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.sport.bean.LocalSportBean;
import com.xiaomi.fitness.sport.eco.export.EcoSportManager;
import com.xiaomi.fitness.sport.eco.export.EcoSportManagerExtKt;
import com.xiaomi.fitness.sport.sporttab.util.SportTabOneTrackExtKt;
import com.xiaomi.fitness.sport.view.launch.LaunchSportModel;
import com.xiaomi.fitness.sport.view.launch.gym.GymLaunchSportActivity;
import com.xiaomi.fitness.sport.view.tab.adapter.LocalSportEcoView$SportDataUtil$cardZoom$1;
import com.xiaomi.fitness.sport_eco_manager_export.SportConstants;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import defpackage.zr3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/xiaomi/fitness/sport/view/tab/adapter/LocalSportEcoView$SportDataUtil$cardZoom$1", "Lzr3;", "Landroid/app/ActivityOptions;", "activityOptions", "", "onCardZoomTriggered", "(Landroid/app/ActivityOptions;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class LocalSportEcoView$SportDataUtil$cardZoom$1 extends zr3 {
    final /* synthetic */ Context $context;
    final /* synthetic */ LocalSportBean $itemData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalSportEcoView$SportDataUtil$cardZoom$1(Context context, LocalSportBean localSportBean, View view) {
        super(context, view, null);
        this.$context = context;
        this.$itemData = localSportBean;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCardZoomTriggered$lambda$0(Intent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    @Override // defpackage.zr3
    public void onCardZoomTriggered(ActivityOptions activityOptions) {
        String model;
        String model2;
        String model3;
        if (new LaunchSportModel().isShowCtaDialog(this.$context)) {
            return;
        }
        LocalSportBean localSportBean = this.$itemData;
        FitnessLogUtils.i("LocalSportEcoView", "itemData?.model is " + (localSportBean != null ? localSportBean.getModel() : null));
        LocalSportBean localSportBean2 = this.$itemData;
        String str = "ksmb.treadmill.m1v1";
        String str2 = "";
        if (Intrinsics.areEqual(localSportBean2 != null ? localSportBean2.getModel() : null, "ksmb.treadmill.m1v1")) {
            SportManagerExportPreference sportManagerExportPreference = SportManagerExportPreference.INSTANCE;
            WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
            WearableDeviceModel localDeviceModel = DeviceManagerExtKt.getInstance(companion).getLocalDeviceModel("ksmb.treadmill.m1v1");
            Boolean boolValueOf = localDeviceModel != null ? Boolean.valueOf(localDeviceModel.getIsDeviceConnected()) : null;
            Boolean bool = Boolean.TRUE;
            if (!Intrinsics.areEqual(boolValueOf, bool)) {
                WearableDeviceModel localDeviceModel2 = DeviceManagerExtKt.getInstance(companion).getLocalDeviceModel("ksmb.treadmill.m2");
                str = Intrinsics.areEqual(localDeviceModel2 != null ? Boolean.valueOf(localDeviceModel2.getIsDeviceConnected()) : null, bool) ? "ksmb.treadmill.m2" : "";
            }
            sportManagerExportPreference.setKEY_GYM_LOCAL_SPORT_TYPE(str);
            LaunchExtensionKt.startActivity(this.$context, GymLaunchSportActivity.class, activityOptions, new Function1() { // from class: tke
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return LocalSportEcoView$SportDataUtil$cardZoom$1.onCardZoomTriggered$lambda$0((Intent) obj);
                }
            });
            return;
        }
        LocalSportBean localSportBean3 = this.$itemData;
        if (localSportBean3 == null || (model = localSportBean3.getModel()) == null) {
            model = "";
        }
        if (!StringsKt__StringsJVMKt.startsWith$default(model, SportConstants.GYM_MODEL_YUN_MAI_JUMP_PREFIX, false, 2, null)) {
            SportTabOneTrackExtKt.oneTrackOnLaunchSportEntranceClick(324);
            SportManagerExportPreference sportManagerExportPreference2 = SportManagerExportPreference.INSTANCE;
            LocalSportBean localSportBean4 = this.$itemData;
            if (localSportBean4 != null && (model2 = localSportBean4.getModel()) != null) {
                str2 = model2;
            }
            sportManagerExportPreference2.setKEY_GYM_LOCAL_SPORT_TYPE(str2);
            EcoSportManagerExtKt.getINSTANCE(EcoSportManager.INSTANCE).goToGymLaunchSportActivity(this.$context, activityOptions);
            return;
        }
        SportTabOneTrackExtKt.oneTrackOnLaunchSportEntranceClick(14);
        SportManagerExportPreference sportManagerExportPreference3 = SportManagerExportPreference.INSTANCE;
        EcoDeviceManager.Companion companion2 = EcoDeviceManager.INSTANCE;
        EcoDeviceModel localDeviceModel3 = EcoDeviceManagerExtKt.getInstance(companion2).getLocalDeviceModel("yunmai.jmprope.sr803");
        Boolean boolValueOf2 = localDeviceModel3 != null ? Boolean.valueOf(localDeviceModel3.getIsDeviceConnected()) : null;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.areEqual(boolValueOf2, bool2)) {
            str2 = "yunmai.jmprope.sr803";
        } else {
            EcoDeviceModel localDeviceModel4 = EcoDeviceManagerExtKt.getInstance(companion2).getLocalDeviceModel(SportConstants.GYM_MODEL_YUN_MAI_JUMP_WINE_RED);
            if (Intrinsics.areEqual(localDeviceModel4 != null ? Boolean.valueOf(localDeviceModel4.getIsDeviceConnected()) : null, bool2)) {
                str2 = SportConstants.GYM_MODEL_YUN_MAI_JUMP_WINE_RED;
            } else {
                LocalSportBean localSportBean5 = this.$itemData;
                if (localSportBean5 != null && (model3 = localSportBean5.getModel()) != null) {
                    str2 = model3;
                }
            }
        }
        sportManagerExportPreference3.setKEY_GYM_LOCAL_SPORT_TYPE(str2);
        EcoSportManagerExtKt.getINSTANCE(EcoSportManager.INSTANCE).goToGymLaunchSportActivity(this.$context, activityOptions);
    }
}
