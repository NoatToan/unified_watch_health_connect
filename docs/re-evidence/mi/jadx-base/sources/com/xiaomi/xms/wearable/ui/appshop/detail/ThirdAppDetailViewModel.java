package com.xiaomi.xms.wearable.ui.appshop.detail;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.google.gson.Gson;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.xms.wearable.db.WatchAppRepository;
import com.xiaomi.xms.wearable.db.entity.WatchAppItemEntity;
import com.xiaomi.xms.wearable.extensions.ExtensionsKt;
import com.xiaomi.xms.wearable.ui.appshop.detail.ThirdAppDetailViewModel;
import com.xiaomi.xms.wearable.ui.appshop.manager.AppDownloadManager;
import com.xiaomi.xms.wearable.ui.appshop.manager.AppInstallManager;
import com.xiaomi.xms.wearable.ui.appshop.manager.AppStatusManager;
import com.xiaomi.xms.wearable.ui.appshop.model.AppListItem;
import com.xiaomi.xms.wearable.ui.appshop.model.AppStatusInfo;
import com.xiaomi.xms.wearable.ui.appshop.model.WatchAppListData;
import defpackage.lg1;
import defpackage.x1j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 62\u00020\u0001:\u00016B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0012\u0010\"\u001a\u0004\u0018\u00010\u00052\b\u0010#\u001a\u0004\u0018\u00010!J\u0012\u0010$\u001a\u00020\u001e2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\u000e\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u000eJ\u001e\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020+2\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0-J\u0012\u0010.\u001a\u00020\u001e2\b\u0010/\u001a\u0004\u0018\u00010\bH\u0002J\u0012\u00100\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u00020\nH\u0002J\b\u00103\u001a\u00020\u001eH\u0014J\b\u00104\u001a\u00020\u001eH\u0002J\b\u00105\u001a\u00020\u001eH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u000e\u0010\u0014\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/appshop/detail/ThirdAppDetailViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "mAppListModel", "Lcom/xiaomi/xms/wearable/ui/appshop/model/AppListItem;", "mAppStatusInfoLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/xms/wearable/ui/appshop/model/AppStatusInfo;", Constants.EXTRA_APP_PACKAGE_NAME, "", "getAppPkgName", "()Ljava/lang/String;", "isInstalled", "", "()Z", "canRemove", "getCanRemove", "needUpdate", "getNeedUpdate", "mFwVersion", "mAppVersion", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "mAppStatusListener", "Lkotlin/Function1;", "", "attach", "savedInstanceState", "Landroid/os/Bundle;", "handleArguments", "arguments", "loadVersionInfo", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "onActionBtnClicked", "isActiveBtn", "observerAppStatus", CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "onAppStatusChanged", "appStatusInfo", "getLocalWatchApp", "Lcom/xiaomi/xms/wearable/db/entity/WatchAppItemEntity;", "packageName", "onCleared", "downloadApp", "unInstallApp", "Companion", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ThirdAppDetailViewModel extends AbsViewModel {

    @NotNull
    public static final String TAG = "ThirdAppDetailViewModel";
    public Gson gson;

    @Nullable
    private AppListItem mAppListModel;

    @NotNull
    private final MutableLiveData<AppStatusInfo> mAppStatusInfoLiveData = new MutableLiveData<>();

    @NotNull
    private String mFwVersion = "";

    @NotNull
    private String mAppVersion = "";

    @NotNull
    private final Function1<AppStatusInfo, Unit> mAppStatusListener = new Function1() { // from class: v9p
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2(Object obj) {
            return ThirdAppDetailViewModel.mAppStatusListener$lambda$0(this.f36644a, (AppStatusInfo) obj);
        }
    };

    private final void downloadApp() {
        AppListItem appListItem = this.mAppListModel;
        if (appListItem == null) {
            Logger.e(TAG, "downloadApp error: mAppListModel is null");
            return;
        }
        if (!ExtensionsKt.checkVersionSupport$default(this.mAppVersion, appListItem.getBean().support_client_v, null, 4, null)) {
            ToastUtil.INSTANCE.showToast(x1j.o);
            return;
        }
        if (ExtensionsKt.checkVersionSupport$default(this.mFwVersion, appListItem.getBean().support_firmware_v, null, 4, null)) {
            AppDownloadManager.INSTANCE.getINSTANCE().downloadApp(appListItem.getBean());
            return;
        }
        lg1.d("downloadApp mFwVersion:" + this.mFwVersion + " item.remoteInfo.support_firmware_v:" + appListItem.getBean().support_firmware_v);
        ToastUtil.INSTANCE.showToast(x1j.e);
    }

    private final String getAppPkgName() {
        WatchAppListData.WatchAppBean bean;
        AppListItem appListItem = this.mAppListModel;
        if (appListItem == null || (bean = appListItem.getBean()) == null) {
            return null;
        }
        return bean.package_name;
    }

    private final boolean getCanRemove() {
        WatchAppItemEntity localBean;
        AppListItem appListItem = this.mAppListModel;
        if (appListItem == null || (localBean = appListItem.getLocalBean()) == null) {
            return true;
        }
        return localBean.getCanRemove();
    }

    private final WatchAppItemEntity getLocalWatchApp(String packageName) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        String did = wearableDeviceModel != null ? wearableDeviceModel.getDid() : null;
        if (did == null) {
            Logger.w(TAG, "getLocalApp device not connected");
        }
        if (did != null) {
            return WatchAppRepository.INSTANCE.getInstance().getWatchApp(packageName, did);
        }
        return null;
    }

    private final boolean getNeedUpdate() {
        AppListItem appListItem = this.mAppListModel;
        return appListItem != null && appListItem.getAppStatus() == 2;
    }

    private final boolean isInstalled() {
        AppListItem appListItem = this.mAppListModel;
        return (appListItem != null ? appListItem.getLocalBean() : null) != null;
    }

    private final void loadVersionInfo(WearableDeviceModel deviceModel) {
        String firmwareVersion;
        if (deviceModel == null || (firmwareVersion = DeviceModelExtKt.getFirmwareVersion(deviceModel)) == null) {
            firmwareVersion = "";
        }
        this.mFwVersion = firmwareVersion;
        this.mAppVersion = AppUtil.getVersionName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mAppStatusListener$lambda$0(ThirdAppDetailViewModel this$0, AppStatusInfo appStatusInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onAppStatusChanged(appStatusInfo);
        return Unit.INSTANCE;
    }

    private final void onAppStatusChanged(AppStatusInfo appStatusInfo) {
        Logger.i(TAG, "onAppStatusChanged " + appStatusInfo);
        if (appStatusInfo == null) {
            return;
        }
        AppListItem appListItem = this.mAppListModel;
        if (appListItem != null) {
            appListItem.updateStatus(appStatusInfo);
        }
        int status = appStatusInfo.getStatus();
        if (status == 0 || status == 1) {
            lg1.d("ThirdAppDetailViewModel AppStatusInfo.INSTALLED, AppStatusInfo.UNINSTALLED " + appStatusInfo);
            this.mAppStatusInfoLiveData.setValue(appStatusInfo);
            return;
        }
        if (status == 11) {
            AppListItem appListItem2 = this.mAppListModel;
            if (appListItem2 != null) {
                appListItem2.setLocalInfo(getLocalWatchApp(appStatusInfo.getPackageName()));
            }
            lg1.d("ThirdAppDetailViewModel AppStatusInfo.INSTALL_SUCCESS " + appStatusInfo);
            this.mAppStatusInfoLiveData.setValue(appStatusInfo);
            return;
        }
        if (status != 15) {
            lg1.d("ThirdAppDetailViewModel else " + appStatusInfo);
            this.mAppStatusInfoLiveData.postValue(appStatusInfo);
            return;
        }
        AppListItem appListItem3 = this.mAppListModel;
        if (appListItem3 != null) {
            appListItem3.setLocalInfo(null);
        }
        lg1.d("ThirdAppDetailViewModel AppStatusInfo.UNINSTALL_SUCCESS " + appStatusInfo);
        this.mAppStatusInfoLiveData.setValue(appStatusInfo);
    }

    private final void unInstallApp() {
        WatchAppItemEntity localBean;
        AppListItem appListItem = this.mAppListModel;
        if (appListItem == null || (localBean = appListItem.getLocalBean()) == null) {
            Logger.e(TAG, "unInstallApp error: mAppListModel is null");
        } else {
            AppInstallManager.INSTANCE.getINSTANCE().unInstall(localBean.getPackageName(), localBean.getFingerprint());
        }
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final Gson getGson() {
        Gson gson = this.gson;
        if (gson != null) {
            return gson;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gson");
        return null;
    }

    @Nullable
    public final AppListItem handleArguments(@Nullable Bundle arguments) {
        String string;
        if (arguments != null && (string = arguments.getString(ThirdAppDetailFragment.EXTRA_APP_INFO)) != null) {
            try {
                this.mAppListModel = (AppListItem) getGson().fromJson(string, AppListItem.class);
            } catch (Exception e) {
                e.printStackTrace();
                Logger.e("ThirdAppDetailViewModel getExtraAppInfo error", e);
            }
            lg1.d("ThirdAppDetailViewModel handleArguments");
            AppListItem appListItem = this.mAppListModel;
            if (appListItem != null) {
                AppStatusInfo appStatusInfoNewAppStatusInfo = appListItem.newAppStatusInfo();
                lg1.d("ThirdAppDetailViewModel handleArguments gson:" + appListItem + " newAppStatusInfo:" + appStatusInfoNewAppStatusInfo);
                AppStatusManager.updateStatus$default(AppStatusManager.INSTANCE.getINSTANCE(), appStatusInfoNewAppStatusInfo.getPackageName(), appStatusInfoNewAppStatusInfo.getStatus(), 0, null, 12, null);
                this.mAppStatusInfoLiveData.postValue(appStatusInfoNewAppStatusInfo);
            }
        }
        String appPkgName = getAppPkgName();
        if (appPkgName != null) {
            AppStatusManager.INSTANCE.getINSTANCE().addStatusListener(appPkgName, this.mAppStatusListener);
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            loadVersionInfo(wearableDeviceModel);
        }
        return this.mAppListModel;
    }

    public final void observerAppStatus(@NotNull LifecycleOwner owner, @NotNull Observer<AppStatusInfo> observer) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.mAppStatusInfoLiveData.observe(owner, observer);
    }

    public final void onActionBtnClicked(boolean isActiveBtn) {
        if (!ExtensionsKt.isBleDeviceConnected()) {
            ToastUtil.INSTANCE.showToast(x1j.d);
            return;
        }
        if (isActiveBtn && getNeedUpdate()) {
            downloadApp();
            return;
        }
        if (!isInstalled()) {
            downloadApp();
        } else if (getCanRemove()) {
            unInstallApp();
        } else {
            ToastUtil.INSTANCE.showToast(x1j.f);
        }
    }

    @Override // defpackage.dvq
    public void onCleared() {
        super.onCleared();
        String appPkgName = getAppPkgName();
        if (appPkgName != null) {
            AppStatusManager.INSTANCE.getINSTANCE().removeStatusListener(appPkgName, this.mAppStatusListener);
        }
    }

    public final void setGson(@NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(gson, "<set-?>");
        this.gson = gson;
    }
}
