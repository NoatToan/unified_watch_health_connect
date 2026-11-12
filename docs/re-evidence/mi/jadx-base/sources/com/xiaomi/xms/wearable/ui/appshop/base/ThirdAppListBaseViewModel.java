package com.xiaomi.xms.wearable.ui.appshop.base;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.xms.wearable.db.WatchAppRepository;
import com.xiaomi.xms.wearable.db.entity.WatchAppItemEntity;
import com.xiaomi.xms.wearable.extensions.ExtensionsKt;
import com.xiaomi.xms.wearable.ui.appshop.base.AbsAppRequest;
import com.xiaomi.xms.wearable.ui.appshop.base.ThirdAppListBaseViewModel;
import com.xiaomi.xms.wearable.ui.appshop.manager.AppDownloadManager;
import com.xiaomi.xms.wearable.ui.appshop.manager.AppInstallManager;
import com.xiaomi.xms.wearable.ui.appshop.manager.AppStatusManager;
import com.xiaomi.xms.wearable.ui.appshop.model.AppListItem;
import com.xiaomi.xms.wearable.ui.appshop.model.AppStatusInfo;
import com.xiaomi.xms.wearable.ui.appshop.model.WatchAppListData;
import defpackage.lg1;
import defpackage.x1j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u001e\u00104\u001a\u00020/2\u0006\u00105\u001a\u0002062\u000e\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001508J\u001e\u00109\u001a\u00020/2\u0006\u00105\u001a\u0002062\u000e\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001908J\"\u0010:\u001a\u00020/2\u0006\u00105\u001a\u0002062\u0012\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f08J\"\u0010;\u001a\u00020/2\u0006\u00105\u001a\u0002062\u0012\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f08J\u0006\u0010<\u001a\u00020/J\u0006\u0010=\u001a\u00020/J\u0012\u0010>\u001a\u00020/2\b\u0010?\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010@\u001a\u00020/2\u0006\u0010A\u001a\u00020%H\u0002J\u001e\u0010B\u001a\u00020/2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010A\u001a\u00020%H\u0002J\u0018\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010E\u001a\u0004\u0018\u00010FH\u0014J\u000e\u0010G\u001a\u00020/2\u0006\u0010H\u001a\u00020\u0010J\u0010\u0010I\u001a\u00020/2\u0006\u0010H\u001a\u00020\u0010H\u0002J\u0012\u0010J\u001a\u00020/2\b\u0010K\u001a\u0004\u0018\u00010\u0015H\u0002J\u0018\u0010L\u001a\u00020/2\u0006\u0010M\u001a\u00020\u00192\u0006\u0010K\u001a\u00020\u0015H\u0014J\u0012\u0010N\u001a\u0004\u0018\u00010O2\u0006\u0010P\u001a\u00020\u0007H\u0004J\b\u0010Q\u001a\u00020/H\u0014J\f\u0010R\u001a\u00020%*\u00020\u0010H\u0002J\f\u0010S\u001a\u00020%*\u00020\u0010H\u0002J\f\u0010T\u001a\u00020%*\u00020\u0010H\u0002R\u0014\u0010\u0006\u001a\u00020\u0007X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010 R\u0014\u0010$\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R \u0010(\u001a\u00028\u00008\u0006@\u0006X\u0087.¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u00102\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020/03X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006U"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/appshop/base/ThirdAppListBaseViewModel;", "T", "Lcom/xiaomi/xms/wearable/ui/appshop/base/AbsAppRequest;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "mDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mAppList", "", "Lcom/xiaomi/xms/wearable/ui/appshop/model/AppListItem;", "getMAppList", "()Ljava/util/List;", "mAppStatusInfoLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/xms/wearable/ui/appshop/model/AppStatusInfo;", "mAppListeData", "mAppListeDataMore", "mLoadStatusLiveData", "", "getMLoadStatusLiveData", "()Landroidx/lifecycle/MutableLiveData;", "mAppVersion", "value", "mFwVersion", "setMFwVersion", "(Ljava/lang/String;)V", "mNextKey", "getMNextKey", "setMNextKey", "hasMoreData", "", "getHasMoreData", "()Z", "mRequest", "getMRequest", "()Lcom/xiaomi/xms/wearable/ui/appshop/base/AbsAppRequest;", "setMRequest", "(Lcom/xiaomi/xms/wearable/ui/appshop/base/AbsAppRequest;)V", "Lcom/xiaomi/xms/wearable/ui/appshop/base/AbsAppRequest;", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "mAppStatusListener", "Lkotlin/Function1;", "observerAppStatus", CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "observerLoadStatus", "observerAllAppList", "observerAllAppListMore", "loadDataLists", "loadMore", "loadVersionInfo", "deviceModel", "doLoadDataLists", "isLoadMore", "onDataLoaded", "list", "handleWatchAppResponse", b.I, "Lcom/xiaomi/xms/wearable/ui/appshop/model/WatchAppListData$WatchAppListBean;", "onItemBtnClicked", "appListItem", "downloadApp", "handleAppStatusChanged", "statusInfo", "onAppStatusChanged", "itemPosition", "getLocalWatchApp", "Lcom/xiaomi/xms/wearable/db/entity/WatchAppItemEntity;", "packageName", "onCleared", "isInstalled", "needUpdate", "canRemove", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nThirdAppListBaseViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThirdAppListBaseViewModel.kt\ncom/xiaomi/xms/wearable/ui/appshop/base/ThirdAppListBaseViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,253:1\n1863#2,2:254\n*S KotlinDebug\n*F\n+ 1 ThirdAppListBaseViewModel.kt\ncom/xiaomi/xms/wearable/ui/appshop/base/ThirdAppListBaseViewModel\n*L\n159#1:254,2\n*E\n"})
public abstract class ThirdAppListBaseViewModel<T extends AbsAppRequest> extends AbsViewModel {

    @NotNull
    private final String TAG;

    @NotNull
    private final List<AppListItem> mAppList;

    @NotNull
    private final MutableLiveData<List<AppListItem>> mAppListeData;

    @NotNull
    private final MutableLiveData<List<AppListItem>> mAppListeDataMore;

    @NotNull
    private final MutableLiveData<AppStatusInfo> mAppStatusInfoLiveData;

    @NotNull
    private final Function1<AppStatusInfo, Unit> mAppStatusListener;

    @NotNull
    private String mAppVersion;

    @Nullable
    private final WearableDeviceModel mDeviceModel;

    @NotNull
    private String mFwVersion;

    @NotNull
    private final MutableLiveData<Integer> mLoadStatusLiveData;

    @Nullable
    private String mNextKey;
    public T mRequest;

    public ThirdAppListBaseViewModel() {
        String name = getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        this.TAG = name;
        this.mDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        this.mAppList = new ArrayList();
        this.mAppStatusInfoLiveData = new MutableLiveData<>();
        this.mAppListeData = new MutableLiveData<>();
        this.mAppListeDataMore = new MutableLiveData<>();
        this.mLoadStatusLiveData = new MutableLiveData<>();
        this.mAppVersion = "";
        this.mFwVersion = "";
        this.mAppStatusListener = new Function1() { // from class: kap
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ThirdAppListBaseViewModel.mAppStatusListener$lambda$0(this.f23666a, (AppStatusInfo) obj);
            }
        };
    }

    private final boolean canRemove(AppListItem appListItem) {
        WatchAppItemEntity localInfo = appListItem.getLocalBean();
        if (localInfo != null) {
            return localInfo.getCanRemove();
        }
        return true;
    }

    private final void doLoadDataLists(final boolean isLoadMore) {
        String str = isLoadMore ? this.mNextKey : null;
        AbsAppRequest mRequest = getMRequest();
        WearableDeviceModel wearableDeviceModel = this.mDeviceModel;
        Intrinsics.checkNotNull(wearableDeviceModel);
        mRequest.loadAppList(wearableDeviceModel, str, new Function1() { // from class: lap
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ThirdAppListBaseViewModel.doLoadDataLists$lambda$3(this.f24838a, isLoadMore, (WatchAppListData.WatchAppListBean) obj);
            }
        }, new Function1() { // from class: map
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ThirdAppListBaseViewModel.doLoadDataLists$lambda$4(this.f25956a, isLoadMore, (ApiException) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doLoadDataLists$lambda$3(ThirdAppListBaseViewModel this$0, boolean z, WatchAppListData.WatchAppListBean watchAppListBean) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onDataLoaded(this$0.handleWatchAppResponse(watchAppListBean), z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doLoadDataLists$lambda$4(ThirdAppListBaseViewModel this$0, boolean z, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.e(this$0.TAG + " doLoadDataLists error", it);
        ToastUtil.INSTANCE.showToast(x1j.common_hint_unkonwn_error);
        this$0.onDataLoaded(new ArrayList(), z);
        return Unit.INSTANCE;
    }

    private final void downloadApp(AppListItem appListItem) {
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

    private final boolean getHasMoreData() {
        return this.mNextKey != null;
    }

    private final void handleAppStatusChanged(AppStatusInfo statusInfo) {
        if (statusInfo == null) {
            return;
        }
        int size = this.mAppList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(statusInfo.getPackageName(), this.mAppList.get(i).getBean().package_name)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1 && statusInfo.getStatus() == 11) {
            loadDataLists();
        } else {
            onAppStatusChanged(i, statusInfo);
            this.mAppStatusInfoLiveData.postValue(statusInfo);
        }
    }

    private final boolean isInstalled(AppListItem appListItem) {
        return appListItem.getLocalBean() != null;
    }

    private final void loadVersionInfo(WearableDeviceModel deviceModel) {
        String firmwareVersion;
        Logger.i("Test loadVersionInfo " + (deviceModel != null ? Boolean.valueOf(deviceModel.isDeviceConnected()) : null) + " " + (deviceModel != null ? DeviceModelExtKt.getFirmwareVersion(deviceModel) : null), new Object[0]);
        if (deviceModel == null || (firmwareVersion = DeviceModelExtKt.getFirmwareVersion(deviceModel)) == null) {
            firmwareVersion = "";
        }
        setMFwVersion(firmwareVersion);
        String versionName = AppUtil.getVersionName();
        this.mAppVersion = versionName;
        Logger.i(this.TAG, " loadVersionInfo " + this.mFwVersion + " " + versionName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mAppStatusListener$lambda$0(ThirdAppListBaseViewModel this$0, AppStatusInfo appStatusInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.handleAppStatusChanged(appStatusInfo);
        return Unit.INSTANCE;
    }

    private final boolean needUpdate(AppListItem appListItem) {
        return appListItem.getAppStatus() == 2;
    }

    private final void onDataLoaded(List<AppListItem> list, boolean isLoadMore) {
        int i;
        lg1.d("onDataLoaded " + isLoadMore + " " + list);
        if (!isLoadMore) {
            this.mAppList.clear();
            AppStatusManager.INSTANCE.getINSTANCE().addGlobalStatusListener(this.mAppStatusListener);
        }
        this.mAppList.addAll(list);
        if (isLoadMore) {
            this.mAppListeDataMore.postValue(list);
        } else {
            this.mAppListeData.postValue(list);
        }
        if (isLoadMore || !list.isEmpty()) {
            i = TextUtils.isEmpty(this.mNextKey) ? 4 : 3;
        } else {
            i = 5;
        }
        this.mLoadStatusLiveData.postValue(Integer.valueOf(i));
    }

    private final void setMFwVersion(String str) {
        Logger.d(this.TAG, "set mFwVersion " + str);
        this.mFwVersion = str;
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @Nullable
    public final WatchAppItemEntity getLocalWatchApp(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        String did = wearableDeviceModel != null ? wearableDeviceModel.getDid() : null;
        if (did == null) {
            Logger.w(this.TAG, "getLocalApp device not connected");
        }
        if (did != null) {
            return WatchAppRepository.INSTANCE.getInstance().getWatchApp(packageName, did);
        }
        return null;
    }

    @NotNull
    public final List<AppListItem> getMAppList() {
        return this.mAppList;
    }

    @Nullable
    public final WearableDeviceModel getMDeviceModel() {
        return this.mDeviceModel;
    }

    @NotNull
    public final MutableLiveData<Integer> getMLoadStatusLiveData() {
        return this.mLoadStatusLiveData;
    }

    @Nullable
    public final String getMNextKey() {
        return this.mNextKey;
    }

    @NotNull
    public final T getMRequest() {
        T t = this.mRequest;
        if (t != null) {
            return t;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRequest");
        return null;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @NotNull
    public List<AppListItem> handleWatchAppResponse(@Nullable WatchAppListData.WatchAppListBean response) {
        List<WatchAppListData.WatchAppBean> list;
        Logger.i(this.TAG, "handleWatchAppResponse " + ((response == null || (list = response.watchAppList) == null) ? null : Integer.valueOf(list.size())));
        ArrayList arrayList = new ArrayList();
        if (response != null) {
            this.mNextKey = response.nextKey;
            List<WatchAppListData.WatchAppBean> list2 = response.watchAppList;
            if (list2 != null) {
                for (WatchAppListData.WatchAppBean watchAppBean : list2) {
                    Intrinsics.checkNotNull(watchAppBean);
                    AppListItem appListItem = new AppListItem(watchAppBean);
                    WatchAppRepository companion = WatchAppRepository.INSTANCE.getInstance();
                    String package_name = watchAppBean.package_name;
                    Intrinsics.checkNotNullExpressionValue(package_name, "package_name");
                    WearableDeviceModel wearableDeviceModel = this.mDeviceModel;
                    Intrinsics.checkNotNull(wearableDeviceModel);
                    appListItem.setLocalInfo(companion.getWatchApp(package_name, wearableDeviceModel.getDid()));
                    arrayList.add(appListItem);
                }
            }
        } else {
            this.mNextKey = null;
            Logger.e(this.TAG, "handleWatchAppResponse error:response is null");
            ToastUtil.INSTANCE.showToast(x1j.common_hint_unkonwn_error);
        }
        return arrayList;
    }

    public final void loadDataLists() {
        if (!NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication())) {
            this.mLoadStatusLiveData.postValue(1);
            return;
        }
        WearableDeviceModel wearableDeviceModel = this.mDeviceModel;
        if (wearableDeviceModel != null) {
            loadVersionInfo(wearableDeviceModel);
            doLoadDataLists(false);
        } else {
            Logger.e(this.TAG, "loadDataLists error: curDeviceModel is null");
            onDataLoaded(new ArrayList(), false);
        }
    }

    public final void loadMore() {
        Logger.d(this.TAG, "loadMore " + getHasMoreData());
        if (!NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication())) {
            this.mLoadStatusLiveData.postValue(2);
        } else if (!getHasMoreData()) {
            this.mLoadStatusLiveData.postValue(4);
        } else {
            this.mLoadStatusLiveData.postValue(0);
            doLoadDataLists(true);
        }
    }

    public final void observerAllAppList(@NotNull LifecycleOwner owner, @NotNull Observer<List<AppListItem>> observer) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.mAppListeData.observe(owner, observer);
    }

    public final void observerAllAppListMore(@NotNull LifecycleOwner owner, @NotNull Observer<List<AppListItem>> observer) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.mAppListeDataMore.observe(owner, observer);
    }

    public final void observerAppStatus(@NotNull LifecycleOwner owner, @NotNull Observer<AppStatusInfo> observer) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.mAppStatusInfoLiveData.observe(owner, observer);
    }

    public final void observerLoadStatus(@NotNull LifecycleOwner owner, @NotNull Observer<Integer> observer) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.mLoadStatusLiveData.observe(owner, observer);
    }

    public void onAppStatusChanged(int itemPosition, @NotNull AppStatusInfo statusInfo) {
        Intrinsics.checkNotNullParameter(statusInfo, "statusInfo");
        if (itemPosition < 0) {
            return;
        }
        AppListItem appListItem = this.mAppList.get(itemPosition);
        appListItem.updateStatus(statusInfo);
        int status = statusInfo.getStatus();
        if (status != 11) {
            if (status == 15) {
                appListItem.setLocalInfo(null);
                return;
            } else if (status != 18) {
                return;
            }
        }
        String package_name = appListItem.getBean().package_name;
        Intrinsics.checkNotNullExpressionValue(package_name, "package_name");
        appListItem.setLocalInfo(getLocalWatchApp(package_name));
    }

    @Override // defpackage.dvq
    public void onCleared() {
        super.onCleared();
        AppStatusManager.INSTANCE.getINSTANCE().removeGlobalStatusListener(this.mAppStatusListener);
    }

    public final void onItemBtnClicked(@NotNull AppListItem appListItem) {
        Intrinsics.checkNotNullParameter(appListItem, "appListItem");
        lg1.d("onItemBtnClicked isInstalled:" + isInstalled(appListItem) + " needUpdate:" + needUpdate(appListItem) + " canRemove:" + canRemove(appListItem));
        if (!ExtensionsKt.isBleDeviceConnected()) {
            ToastUtil.INSTANCE.showToast(x1j.d);
            return;
        }
        if (!isInstalled(appListItem)) {
            downloadApp(appListItem);
            return;
        }
        if (needUpdate(appListItem)) {
            downloadApp(appListItem);
            return;
        }
        if (!canRemove(appListItem)) {
            ToastUtil.INSTANCE.showToast(x1j.f);
            return;
        }
        AppInstallManager instance = AppInstallManager.INSTANCE.getINSTANCE();
        WatchAppItemEntity localInfo = appListItem.getLocalBean();
        Intrinsics.checkNotNull(localInfo);
        String packageName = localInfo.getPackageName();
        WatchAppItemEntity localInfo2 = appListItem.getLocalBean();
        Intrinsics.checkNotNull(localInfo2);
        instance.unInstall(packageName, localInfo2.getFingerprint());
    }

    public final void setMNextKey(@Nullable String str) {
        this.mNextKey = str;
    }

    public final void setMRequest(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "<set-?>");
        this.mRequest = t;
    }
}
