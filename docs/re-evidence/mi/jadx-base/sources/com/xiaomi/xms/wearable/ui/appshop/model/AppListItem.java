package com.xiaomi.xms.wearable.ui.appshop.model;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.xms.wearable.db.entity.WatchAppItemEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 '2\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001bJ\u0006\u0010\u001f\u001a\u00020\u001bJ\u0006\u0010 \u001a\u00020!J\b\u0010\"\u001a\u00020\u0010H\u0016J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010&\u001a\u00020!H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/xiaomi/xms/wearable/ui/appshop/model/AppListItem;", "", "remoteInfo", "Lcom/xiaomi/xms/wearable/ui/appshop/model/WatchAppListData$WatchAppBean;", "<init>", "(Lcom/xiaomi/xms/wearable/ui/appshop/model/WatchAppListData$WatchAppBean;)V", "getRemoteInfo", "()Lcom/xiaomi/xms/wearable/ui/appshop/model/WatchAppListData$WatchAppBean;", "value", "Lcom/xiaomi/xms/wearable/db/entity/WatchAppItemEntity;", "localInfo", "getLocalInfo", "()Lcom/xiaomi/xms/wearable/db/entity/WatchAppItemEntity;", "setLocalInfo", "(Lcom/xiaomi/xms/wearable/db/entity/WatchAppItemEntity;)V", "developer_name", "", "kotlin.jvm.PlatformType", "getDeveloper_name", "()Ljava/lang/String;", "setDeveloper_name", "(Ljava/lang/String;)V", "Ljava/lang/String;", "record_number", "getRecord_number", "setRecord_number", "appStatusInfo", "Lcom/xiaomi/xms/wearable/ui/appshop/model/AppStatusInfo;", "updateStatus", "", "statusInfo", "newAppStatusInfo", "getAppStatus", "", "toString", "equals", "", "other", "hashCode", "Companion", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppListItem {

    @NotNull
    public static final String TAG = "AppListItem";

    /* JADX INFO: renamed from: appStatusInfo, reason: from kotlin metadata and from toString */
    @NotNull
    private final AppStatusInfo beanStatus;
    private String developer_name;

    /* JADX INFO: renamed from: localInfo, reason: from kotlin metadata and from toString */
    @Nullable
    private WatchAppItemEntity localBean;
    private String record_number;

    /* JADX INFO: renamed from: remoteInfo, reason: from kotlin metadata and from toString */
    @NotNull
    private final WatchAppListData.WatchAppBean bean;

    public AppListItem(@NotNull WatchAppListData.WatchAppBean remoteInfo) {
        Intrinsics.checkNotNullParameter(remoteInfo, "remoteInfo");
        this.bean = remoteInfo;
        this.developer_name = remoteInfo.developer_name;
        this.record_number = remoteInfo.record_number;
        String package_name = remoteInfo.package_name;
        Intrinsics.checkNotNullExpressionValue(package_name, "package_name");
        this.beanStatus = new AppStatusInfo(package_name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(AppListItem.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.xiaomi.xms.wearable.ui.appshop.model.AppListItem");
        AppListItem appListItem = (AppListItem) other;
        return Intrinsics.areEqual(this.bean, appListItem.bean) && Intrinsics.areEqual(this.localBean, appListItem.localBean) && Intrinsics.areEqual(this.beanStatus, appListItem.beanStatus);
    }

    public final int getAppStatus() {
        return this.beanStatus.getStatus();
    }

    public final String getDeveloper_name() {
        return this.developer_name;
    }

    @Nullable
    /* JADX INFO: renamed from: getLocalInfo, reason: from getter */
    public final WatchAppItemEntity getLocalBean() {
        return this.localBean;
    }

    public final String getRecord_number() {
        return this.record_number;
    }

    @NotNull
    /* JADX INFO: renamed from: getRemoteInfo, reason: from getter */
    public final WatchAppListData.WatchAppBean getBean() {
        return this.bean;
    }

    public int hashCode() {
        int iHashCode = this.bean.hashCode() * 31;
        WatchAppItemEntity watchAppItemEntity = this.localBean;
        return ((iHashCode + (watchAppItemEntity != null ? watchAppItemEntity.hashCode() : 0)) * 31) + this.beanStatus.hashCode();
    }

    @NotNull
    public final AppStatusInfo newAppStatusInfo() {
        return new AppStatusInfo(this.beanStatus);
    }

    public final void setDeveloper_name(String str) {
        this.developer_name = str;
    }

    public final void setLocalInfo(@Nullable WatchAppItemEntity watchAppItemEntity) {
        int i;
        this.localBean = watchAppItemEntity;
        if (watchAppItemEntity != null) {
            i = watchAppItemEntity.getVersionCode() < this.bean.app_version_code ? 2 : 1;
        } else {
            i = 0;
        }
        Logger.i(TAG, this.bean.package_name + " updateStatus by localInfo " + i);
        this.beanStatus.setStatus(i);
    }

    public final void setRecord_number(String str) {
        this.record_number = str;
    }

    @NotNull
    public String toString() {
        return "AppListItem(bean=" + this.bean + ", localBean=" + this.localBean + ", beanStatus=" + this.beanStatus + ")";
    }

    public final void updateStatus(@NotNull AppStatusInfo statusInfo) {
        Intrinsics.checkNotNullParameter(statusInfo, "statusInfo");
        if (Intrinsics.areEqual(this.beanStatus.getPackageName(), statusInfo.getPackageName())) {
            this.beanStatus.setStatus(statusInfo.getStatus());
            this.beanStatus.setStatusValue(statusInfo.getStatusValue());
        }
    }
}
