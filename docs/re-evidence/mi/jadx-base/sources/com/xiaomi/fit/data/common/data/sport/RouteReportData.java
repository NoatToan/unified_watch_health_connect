package com.xiaomi.fit.data.common.data.sport;

import com.xiaomi.hm.health.dataprocess.StepsInfo;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010¨\u0006%"}, d2 = {"Lcom/xiaomi/fit/data/common/data/sport/RouteReportData;", "Ljava/io/Serializable;", "id", "", "name", "", StepsInfo.KEY_DISTANCE, "", "state", "icon", "routeUrl", "<init>", "(ILjava/lang/String;FILjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getDis", "()F", "setDis", "(F)V", "getState", "getIcon", "getRouteUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteReportData implements Serializable {
    private float dis;

    @NotNull
    private final String icon;
    private final int id;

    @NotNull
    private final String name;

    @NotNull
    private final String routeUrl;
    private final int state;

    public RouteReportData(int i, @NotNull String name, float f, int i2, @NotNull String icon, @NotNull String routeUrl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(routeUrl, "routeUrl");
        this.id = i;
        this.name = name;
        this.dis = f;
        this.state = i2;
        this.icon = icon;
        this.routeUrl = routeUrl;
    }

    public static /* synthetic */ RouteReportData copy$default(RouteReportData routeReportData, int i, String str, float f, int i2, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = routeReportData.id;
        }
        if ((i3 & 2) != 0) {
            str = routeReportData.name;
        }
        String str4 = str;
        if ((i3 & 4) != 0) {
            f = routeReportData.dis;
        }
        float f2 = f;
        if ((i3 & 8) != 0) {
            i2 = routeReportData.state;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            str2 = routeReportData.icon;
        }
        String str5 = str2;
        if ((i3 & 32) != 0) {
            str3 = routeReportData.routeUrl;
        }
        return routeReportData.copy(i, str4, f2, i4, str5, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getDis() {
        return this.dis;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getState() {
        return this.state;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRouteUrl() {
        return this.routeUrl;
    }

    @NotNull
    public final RouteReportData copy(int id, @NotNull String name, float dis, int state, @NotNull String icon, @NotNull String routeUrl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(routeUrl, "routeUrl");
        return new RouteReportData(id, name, dis, state, icon, routeUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouteReportData)) {
            return false;
        }
        RouteReportData routeReportData = (RouteReportData) other;
        return this.id == routeReportData.id && Intrinsics.areEqual(this.name, routeReportData.name) && Float.compare(this.dis, routeReportData.dis) == 0 && this.state == routeReportData.state && Intrinsics.areEqual(this.icon, routeReportData.icon) && Intrinsics.areEqual(this.routeUrl, routeReportData.routeUrl);
    }

    public final float getDis() {
        return this.dis;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getRouteUrl() {
        return this.routeUrl;
    }

    public final int getState() {
        return this.state;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + Float.hashCode(this.dis)) * 31) + Integer.hashCode(this.state)) * 31) + this.icon.hashCode()) * 31) + this.routeUrl.hashCode();
    }

    public final void setDis(float f) {
        this.dis = f;
    }

    @NotNull
    public String toString() {
        return "RouteReportData(id=" + this.id + ", name=" + this.name + ", dis=" + this.dis + ", state=" + this.state + ", icon=" + this.icon + ", routeUrl=" + this.routeUrl + ")";
    }
}
