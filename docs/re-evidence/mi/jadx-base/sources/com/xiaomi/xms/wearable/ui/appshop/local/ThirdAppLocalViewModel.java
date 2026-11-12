package com.xiaomi.xms.wearable.ui.appshop.local;

import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.xms.wearable.ui.appshop.base.ThirdAppListBaseViewModel;
import com.xiaomi.xms.wearable.ui.appshop.manager.AppDownloadManager;
import com.xiaomi.xms.wearable.ui.appshop.model.AppListItem;
import com.xiaomi.xms.wearable.ui.appshop.model.AppStatusInfo;
import com.xiaomi.xms.wearable.ui.appshop.model.WatchAppListData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/appshop/local/ThirdAppLocalViewModel;", "Lcom/xiaomi/xms/wearable/ui/appshop/base/ThirdAppListBaseViewModel;", "Lcom/xiaomi/xms/wearable/ui/appshop/local/ThirdAppLocalRequest;", "<init>", "()V", "installSuccessLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/xms/wearable/ui/appshop/model/AppListItem;", "getInstallSuccessLiveData", "()Landroidx/lifecycle/MutableLiveData;", "uninstallSuccessLiveData", "getUninstallSuccessLiveData", "onAppStatusChanged", "", "itemPosition", "", "statusInfo", "Lcom/xiaomi/xms/wearable/ui/appshop/model/AppStatusInfo;", "onInstallSuccess", "onUninstallSuccess", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ThirdAppLocalViewModel extends ThirdAppListBaseViewModel<ThirdAppLocalRequest> {

    @NotNull
    private final MutableLiveData<AppListItem> installSuccessLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<AppListItem> uninstallSuccessLiveData = new MutableLiveData<>();

    private final void onInstallSuccess(int itemPosition, AppStatusInfo statusInfo) {
        if (itemPosition >= 0) {
            AppListItem appListItem = getMAppList().get(itemPosition);
            appListItem.setLocalInfo(getLocalWatchApp(statusInfo.getPackageName()));
            this.installSuccessLiveData.postValue(appListItem);
        } else {
            WatchAppListData.WatchAppBean cachedAppInfo = AppDownloadManager.INSTANCE.getINSTANCE().getCachedAppInfo(statusInfo.getPackageName());
            if (cachedAppInfo != null) {
                AppListItem appListItem2 = new AppListItem(cachedAppInfo);
                String package_name = appListItem2.getBean().package_name;
                Intrinsics.checkNotNullExpressionValue(package_name, "package_name");
                appListItem2.setLocalInfo(getLocalWatchApp(package_name));
                getMAppList().add(appListItem2);
                this.installSuccessLiveData.postValue(appListItem2);
            } else {
                Logger.e(getTAG(), "onAppInstall success with no cached info:" + statusInfo.getPackageName());
            }
        }
        if (getMAppList().isEmpty()) {
            MutableLiveData<Integer> mLoadStatusLiveData = getMLoadStatusLiveData();
            if (mLoadStatusLiveData != null) {
                mLoadStatusLiveData.postValue(5);
                return;
            }
            return;
        }
        MutableLiveData<Integer> mLoadStatusLiveData2 = getMLoadStatusLiveData();
        if (mLoadStatusLiveData2 != null) {
            mLoadStatusLiveData2.postValue(6);
        }
    }

    private final void onUninstallSuccess(int itemPosition, AppStatusInfo statusInfo) {
        MutableLiveData<Integer> mLoadStatusLiveData;
        if (itemPosition >= 0) {
            this.uninstallSuccessLiveData.postValue(getMAppList().remove(itemPosition));
            if (!getMAppList().isEmpty() || (mLoadStatusLiveData = getMLoadStatusLiveData()) == null) {
                return;
            }
            mLoadStatusLiveData.postValue(5);
            return;
        }
        Logger.e(getTAG(), "onUninstallSuccess: unexpected position:" + itemPosition);
    }

    @NotNull
    public final MutableLiveData<AppListItem> getInstallSuccessLiveData() {
        return this.installSuccessLiveData;
    }

    @NotNull
    public final MutableLiveData<AppListItem> getUninstallSuccessLiveData() {
        return this.uninstallSuccessLiveData;
    }

    @Override // com.xiaomi.xms.wearable.ui.appshop.base.ThirdAppListBaseViewModel
    public void onAppStatusChanged(int itemPosition, @NotNull AppStatusInfo statusInfo) {
        Intrinsics.checkNotNullParameter(statusInfo, "statusInfo");
        int status = statusInfo.getStatus();
        if (status == 11) {
            onInstallSuccess(itemPosition, statusInfo);
        } else if (status != 15) {
            super.onAppStatusChanged(itemPosition, statusInfo);
        } else {
            onUninstallSuccess(itemPosition, statusInfo);
        }
    }
}
