package com.xiaomi.fitness.rn.share.bean;

import com.xiaomi.fitness.mijia.sdk.data.BaseBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003HÆ\u0003J%\u0010\r\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R,\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/rn/share/bean/DeviceListShareUserListGetBean;", "Lcom/xiaomi/fitness/mijia/sdk/data/BaseBean;", "list", "", "", "", "Lcom/xiaomi/fitness/rn/share/bean/DeviceListUserBean;", "<init>", "(Ljava/util/Map;)V", "getList", "()Ljava/util/Map;", "setList", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceListShareUserListGetBean extends BaseBean {

    @NotNull
    private Map<String, ? extends List<DeviceListUserBean>> list;

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceListShareUserListGetBean() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceListShareUserListGetBean copy$default(DeviceListShareUserListGetBean deviceListShareUserListGetBean, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = deviceListShareUserListGetBean.list;
        }
        return deviceListShareUserListGetBean.copy(map);
    }

    @NotNull
    public final Map<String, List<DeviceListUserBean>> component1() {
        return this.list;
    }

    @NotNull
    public final DeviceListShareUserListGetBean copy(@NotNull Map<String, ? extends List<DeviceListUserBean>> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        return new DeviceListShareUserListGetBean(list);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeviceListShareUserListGetBean) && Intrinsics.areEqual(this.list, ((DeviceListShareUserListGetBean) other).list);
    }

    @NotNull
    public final Map<String, List<DeviceListUserBean>> getList() {
        return this.list;
    }

    public int hashCode() {
        return this.list.hashCode();
    }

    public final void setList(@NotNull Map<String, ? extends List<DeviceListUserBean>> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.list = map;
    }

    @NotNull
    public String toString() {
        return "DeviceListShareUserListGetBean(list=" + this.list + ")";
    }

    public /* synthetic */ DeviceListShareUserListGetBean(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new HashMap() : map);
    }

    public DeviceListShareUserListGetBean(@NotNull Map<String, ? extends List<DeviceListUserBean>> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list = list;
    }
}
