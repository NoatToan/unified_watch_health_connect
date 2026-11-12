package com.xiaomi.fitness.route.track.view;

import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\"\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J*\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\bHÆ\u0003¢\u0006\u0002\u0010\u0014JR\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062$\b\u0002\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R/\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/route/track/view/EditRouteBean;", "Ljava/io/Serializable;", "routeName", "", "routeId", "uploadTime", "", "valueMap", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/util/HashMap;)V", "getRouteName", "()Ljava/lang/String;", "setRouteName", "(Ljava/lang/String;)V", "getRouteId", "getUploadTime", "()J", "getValueMap", "()Ljava/util/HashMap;", "Ljava/util/HashMap;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/util/HashMap;)Lcom/xiaomi/fitness/route/track/view/EditRouteBean;", "equals", "", "other", "", "hashCode", "", "toString", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EditRouteBean implements Serializable {

    @NotNull
    private final String routeId;

    @NotNull
    private String routeName;
    private final long uploadTime;

    @NotNull
    private final HashMap<String, String> valueMap;

    public EditRouteBean(@NotNull String routeName, @NotNull String routeId, long j, @NotNull HashMap<String, String> valueMap) {
        Intrinsics.checkNotNullParameter(routeName, "routeName");
        Intrinsics.checkNotNullParameter(routeId, "routeId");
        Intrinsics.checkNotNullParameter(valueMap, "valueMap");
        this.routeName = routeName;
        this.routeId = routeId;
        this.uploadTime = j;
        this.valueMap = valueMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditRouteBean copy$default(EditRouteBean editRouteBean, String str, String str2, long j, HashMap map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = editRouteBean.routeName;
        }
        if ((i & 2) != 0) {
            str2 = editRouteBean.routeId;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            j = editRouteBean.uploadTime;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            map = editRouteBean.valueMap;
        }
        return editRouteBean.copy(str, str3, j2, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRouteName() {
        return this.routeName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRouteId() {
        return this.routeId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getUploadTime() {
        return this.uploadTime;
    }

    @NotNull
    public final HashMap<String, String> component4() {
        return this.valueMap;
    }

    @NotNull
    public final EditRouteBean copy(@NotNull String routeName, @NotNull String routeId, long uploadTime, @NotNull HashMap<String, String> valueMap) {
        Intrinsics.checkNotNullParameter(routeName, "routeName");
        Intrinsics.checkNotNullParameter(routeId, "routeId");
        Intrinsics.checkNotNullParameter(valueMap, "valueMap");
        return new EditRouteBean(routeName, routeId, uploadTime, valueMap);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditRouteBean)) {
            return false;
        }
        EditRouteBean editRouteBean = (EditRouteBean) other;
        return Intrinsics.areEqual(this.routeName, editRouteBean.routeName) && Intrinsics.areEqual(this.routeId, editRouteBean.routeId) && this.uploadTime == editRouteBean.uploadTime && Intrinsics.areEqual(this.valueMap, editRouteBean.valueMap);
    }

    @NotNull
    public final String getRouteId() {
        return this.routeId;
    }

    @NotNull
    public final String getRouteName() {
        return this.routeName;
    }

    public final long getUploadTime() {
        return this.uploadTime;
    }

    @NotNull
    public final HashMap<String, String> getValueMap() {
        return this.valueMap;
    }

    public int hashCode() {
        return (((((this.routeName.hashCode() * 31) + this.routeId.hashCode()) * 31) + Long.hashCode(this.uploadTime)) * 31) + this.valueMap.hashCode();
    }

    public final void setRouteName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.routeName = str;
    }

    @NotNull
    public String toString() {
        return "EditRouteBean(routeName=" + this.routeName + ", routeId=" + this.routeId + ", uploadTime=" + this.uploadTime + ", valueMap=" + this.valueMap + ")";
    }
}
