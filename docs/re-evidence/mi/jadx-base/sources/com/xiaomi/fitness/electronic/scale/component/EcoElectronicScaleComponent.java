package com.xiaomi.fitness.electronic.scale.component;

import android.app.Application;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.extensions.OnUserInfoChange;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelper;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelperExtKt;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import com.xiaomi.fitness.electronic.scale.util.EcoDataHandlerHelper;
import com.xiaomi.fitness.electronic.scale.util.WeightInfoUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000/\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\n\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0004\n\u0002\b\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/component/EcoElectronicScaleComponent;", "", "<init>", "()V", "TAG", "", "TAG$1", "deviceStatusListener", "Lcom/xiaomi/fitness/eco/device/manager/export/OnEcoDeviceStatusListener;", "mUserInfoListener", "com/xiaomi/fitness/electronic/scale/component/EcoElectronicScaleComponent$mUserInfoListener$1", "Lcom/xiaomi/fitness/electronic/scale/component/EcoElectronicScaleComponent$mUserInfoListener$1;", "addEcoDataHandler", "", "application", "Landroid/app/Application;", "addUserInfoChange", "addEcoDeviceListener", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "EcoElectronicScaleComponent")
public final class EcoElectronicScaleComponent {

    @NotNull
    public static final String TAG = "EcoDeviceManagerComponent";

    /* JADX INFO: renamed from: TAG$1, reason: from kotlin metadata */
    @NotNull
    private final String TAG = "EcoElectronicScaleCompo";

    @NotNull
    private OnEcoDeviceStatusListener deviceStatusListener = new OnEcoDeviceStatusListener() { // from class: com.xiaomi.fitness.electronic.scale.component.EcoElectronicScaleComponent$deviceStatusListener$1
        @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
        public void onConnectFailure(String did, String mac, int errorCode, int retryTimes) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            Logger.i(this.this$0.TAG, "onConnectFailure did  " + did);
        }

        @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
        public void onConnectStart(String did, String mac) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            Logger.i(this.this$0.TAG, "onConnectStart did  " + did);
        }

        @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
        public void onConnectSuccess(String did, String mac) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            Logger.i(this.this$0.TAG, "onConnectSuccess did  " + did);
            if (did != null) {
                ElectronicScaleManagerExtKt.syncElectronicScale(AppUtil.getApp(), did);
                WeightInfoUtil.INSTANCE.pullRecordWhenConnected();
            }
        }

        @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
        public void onDisconnect(String did, String mac) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            Logger.i(this.this$0.TAG, "onDisconnect did  " + did);
        }
    };

    @NotNull
    private EcoElectronicScaleComponent$mUserInfoListener$1 mUserInfoListener = new OnUserInfoChange() { // from class: com.xiaomi.fitness.electronic.scale.component.EcoElectronicScaleComponent$mUserInfoListener$1
        @Override // com.xiaomi.fitness.account.extensions.OnUserInfoChange
        public void userInfoChange(UserProfile userProfile) {
            Intrinsics.checkNotNullParameter(userProfile, "userProfile");
            ElectronicScaleCMDHelperExtKt.getInstance(ElectronicScaleCMDHelper.INSTANCE).syncMainUserInfo(true);
        }
    };

    @ComponentTask(name = "AddEcoDataHandler", notLaterThan = 3, onMainThread = true)
    public final void addEcoDataHandler(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        EcoDataHandlerHelper.INSTANCE.addDataHandler();
    }

    @ComponentTask(name = "addEcoDeviceListener", notLaterThan = 3, onMainThread = true)
    public final void addEcoDeviceListener(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).addDeviceStatusListener(this.deviceStatusListener);
    }

    @ComponentTask(name = "AddUserInfoChange", notLaterThan = 11, onMainThread = true)
    public final void addUserInfoChange(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).addUserInfoChangeListener(this.mUserInfoListener);
    }
}
