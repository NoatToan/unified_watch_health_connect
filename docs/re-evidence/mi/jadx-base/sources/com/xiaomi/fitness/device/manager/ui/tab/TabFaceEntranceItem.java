package com.xiaomi.fitness.device.manager.ui.tab;

import android.content.Context;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;
import androidx.databinding.ObservableLong;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.miui.circulate.device.api.Constant;
import com.xiaomi.fitness.common.extensions.StringExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.IItemChangesWithDevice;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.fitness.device.manager.ui.tab.TabFaceEntranceItem;
import com.xiaomi.fitness.watch.face.data.RecentOnlineData;
import com.xiaomi.fitness.watch.face.data.RecentOnlineListData;
import com.xiaomi.fitness.watch.face.data.RecentOnlineTabData;
import com.xiaomi.fitness.watch.face.export.FaceHelper;
import com.xiaomi.fitness.watch.face.export.FaceHelperExtKt;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0016\u0010&\u001a\u00020\b2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010J\u0010\u0010(\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010*J\u000e\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020-J\u000e\u0010$\u001a\u00020\b2\u0006\u0010.\u001a\u00020/J\u0006\u00100\u001a\u000201R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR6\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u001e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u0017@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/tab/TabFaceEntranceItem;", "Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "Lcom/xiaomi/fitness/device/manager/export/IItemChangesWithDevice;", "<init>", "()V", "currentDid", "", "onDeviceChanged", "", "did", "value", "Landroidx/databinding/ObservableInt;", "deviceType", "getDeviceType", "()Landroidx/databinding/ObservableInt;", "Landroidx/databinding/ObservableField;", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "dataList", "getDataList", "()Landroidx/databinding/ObservableField;", "recentOnlineCount", "getRecentOnlineCount", "Landroidx/databinding/ObservableBoolean;", "redPoint", "getRedPoint", "()Landroidx/databinding/ObservableBoolean;", "newRoute", "getNewRoute", "()Ljava/lang/String;", "setNewRoute", "(Ljava/lang/String;)V", "loadTime", "Landroidx/databinding/ObservableLong;", "getLoadTime", "()Landroidx/databinding/ObservableLong;", "setLoadTime", "(Landroidx/databinding/ObservableLong;)V", "setDataList", "list", "setRecentOnlineCount", "recentOnlineData", "Lcom/xiaomi/fitness/watch/face/data/RecentOnlineData;", "setRedPoint", "show", "", "time", "", "getSkuNum", "", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceFaceEntranceItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFaceEntranceItem.kt\ncom/xiaomi/fitness/device/manager/ui/tab/TabFaceEntranceItem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n1863#2,2:149\n*S KotlinDebug\n*F\n+ 1 DeviceFaceEntranceItem.kt\ncom/xiaomi/fitness/device/manager/ui/tab/TabFaceEntranceItem\n*L\n93#1:149,2\n*E\n"})
public final class TabFaceEntranceItem extends TabContentItem implements IItemChangesWithDevice {

    @NotNull
    private static final String TAG = "TabFaceEntranceItem";

    @NotNull
    private String currentDid;

    @NotNull
    private ObservableField<List<FaceData>> dataList;

    @NotNull
    private ObservableInt deviceType;

    @NotNull
    private ObservableLong loadTime;

    @NotNull
    private String newRoute;

    @NotNull
    private ObservableInt recentOnlineCount;

    @NotNull
    private ObservableBoolean redPoint;

    public TabFaceEntranceItem() {
        super(17, 102, -1, StringExtKt.toLiveData(""), StringExtKt.toLiveData(""), false, null, null, null, new Function1() { // from class: zyo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TabFaceEntranceItem._init_$lambda$0((Context) obj);
            }
        }, new Function1() { // from class: azo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(TabFaceEntranceItem._init_$lambda$1((WearableDeviceModel) obj));
            }
        }, null, null, 6592, null);
        this.currentDid = "";
        this.deviceType = new ObservableInt(0);
        this.dataList = new ObservableField<>(new ArrayList());
        this.recentOnlineCount = new ObservableInt(0);
        this.redPoint = new ObservableBoolean(false);
        this.newRoute = "";
        this.loadTime = new ObservableLong(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("click_v3", "56.51.0.1.36390"), "name", "Device_page_Dialmarket_btname", "type", "device_tab", "subtype", "1");
        FaceHelperExtKt.getInstance(FaceHelper.INSTANCE).gotoFacePage(it, (!DeviceFaceEntranceItemKt.getTabFaceEntranceItem().redPoint.get() || DeviceFaceEntranceItemKt.getTabFaceEntranceItem().newRoute.length() <= 0) ? "" : DeviceFaceEntranceItemKt.getTabFaceEntranceItem().newRoute);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return !DeviceModelExtKt.isWearOS(wearableDeviceModel);
    }

    @NotNull
    public final ObservableField<List<FaceData>> getDataList() {
        return this.dataList;
    }

    @NotNull
    public final ObservableInt getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final ObservableLong getLoadTime() {
        return this.loadTime;
    }

    @NotNull
    public final String getNewRoute() {
        return this.newRoute;
    }

    @NotNull
    public final ObservableInt getRecentOnlineCount() {
        return this.recentOnlineCount;
    }

    @NotNull
    public final ObservableBoolean getRedPoint() {
        return this.redPoint;
    }

    public final int getSkuNum() {
        List<FaceData> list = this.dataList.get();
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // com.xiaomi.fitness.device.manager.export.IItemChangesWithDevice
    public void onDeviceChanged(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i(TAG, "onDeviceChanged: " + did);
        this.currentDid = did;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
        if (wearableDeviceModel == null || !DeviceModelExtKt.isBandType(wearableDeviceModel)) {
            getTitle().postValue(Constant.DeviceType.WATCH);
        } else {
            getTitle().postValue("band");
        }
    }

    public final void setDataList(@Nullable List<FaceData> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.dataList.set(CollectionsKt___CollectionsKt.toMutableList((Collection) list));
    }

    public final void setLoadTime(@NotNull ObservableLong observableLong) {
        Intrinsics.checkNotNullParameter(observableLong, "<set-?>");
        this.loadTime = observableLong;
    }

    public final void setNewRoute(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.newRoute = str;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    public final void setRecentOnlineCount(@Nullable RecentOnlineData recentOnlineData) {
        List<RecentOnlineListData> list;
        int i;
        if (recentOnlineData == null || !recentOnlineData.getHasRecent() || (list = recentOnlineData.getList()) == null || list.isEmpty()) {
            i = 0;
        } else {
            long enterFaceEntranceTime = FaceHelperExtKt.getInstance(FaceHelper.INSTANCE).getEnterFaceEntranceTime(this.currentDid);
            List<RecentOnlineListData> list2 = recentOnlineData.getList();
            if (list2 != null) {
                Iterator<T> it = list2.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (((RecentOnlineListData) it.next()).getTime() > enterFaceEntranceTime) {
                        i++;
                    }
                }
            } else {
                i = 0;
            }
        }
        RecentOnlineTabData tab = recentOnlineData != null ? recentOnlineData.getTab() : null;
        if (tab != null) {
            String route = tab.getRoute();
            this.newRoute = route;
            if (route.length() == 0) {
                this.newRoute = "https://m.xiaomi.com/miwear/dial/DialCategoryList?operationType=" + tab.getType() + "&operationId=" + tab.getId();
            }
        }
        if (this.recentOnlineCount.get() == i) {
            this.recentOnlineCount.notifyChange();
        }
        setRedPoint(i >= 5);
        this.recentOnlineCount.set(i);
    }

    public final void setRedPoint(boolean show) {
        if (this.redPoint.get() == show) {
            this.redPoint.notifyChange();
        }
        FaceHelperExtKt.getInstance(FaceHelper.INSTANCE).setFaceEntranceRedPoint(this.currentDid, show);
        this.redPoint.set(show);
    }

    public final void setLoadTime(long time) {
        if (this.loadTime.get() == time) {
            this.loadTime.notifyChange();
        }
        this.loadTime.set(time);
    }
}
