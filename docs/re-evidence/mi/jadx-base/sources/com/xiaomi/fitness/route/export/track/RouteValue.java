package com.xiaomi.fitness.route.export.track;

import com.xiaomi.hm.health.dataprocess.StepsInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/route/export/track/RouteValue;", "", "alias", "", "source", "suffix", StepsInfo.KEY_DISTANCE, "uploadTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlias", "()Ljava/lang/String;", "setAlias", "(Ljava/lang/String;)V", "getSource", "getSuffix", "getDis", "getUploadTime", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "route-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteValue {

    @Nullable
    private String alias;

    @Nullable
    private final String dis;

    @Nullable
    private final String source;

    @Nullable
    private final String suffix;

    @Nullable
    private final String uploadTime;

    public RouteValue(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.alias = str;
        this.source = str2;
        this.suffix = str3;
        this.dis = str4;
        this.uploadTime = str5;
    }

    public static /* synthetic */ RouteValue copy$default(RouteValue routeValue, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = routeValue.alias;
        }
        if ((i & 2) != 0) {
            str2 = routeValue.source;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = routeValue.suffix;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = routeValue.dis;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = routeValue.uploadTime;
        }
        return routeValue.copy(str, str6, str7, str8, str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAlias() {
        return this.alias;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSuffix() {
        return this.suffix;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDis() {
        return this.dis;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUploadTime() {
        return this.uploadTime;
    }

    @NotNull
    public final RouteValue copy(@Nullable String alias, @Nullable String source, @Nullable String suffix, @Nullable String dis, @Nullable String uploadTime) {
        return new RouteValue(alias, source, suffix, dis, uploadTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouteValue)) {
            return false;
        }
        RouteValue routeValue = (RouteValue) other;
        return Intrinsics.areEqual(this.alias, routeValue.alias) && Intrinsics.areEqual(this.source, routeValue.source) && Intrinsics.areEqual(this.suffix, routeValue.suffix) && Intrinsics.areEqual(this.dis, routeValue.dis) && Intrinsics.areEqual(this.uploadTime, routeValue.uploadTime);
    }

    @Nullable
    public final String getAlias() {
        return this.alias;
    }

    @Nullable
    public final String getDis() {
        return this.dis;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    @Nullable
    public final String getSuffix() {
        return this.suffix;
    }

    @Nullable
    public final String getUploadTime() {
        return this.uploadTime;
    }

    public int hashCode() {
        String str = this.alias;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.source;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.suffix;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dis;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.uploadTime;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setAlias(@Nullable String str) {
        this.alias = str;
    }

    @NotNull
    public String toString() {
        return "RouteValue(alias=" + this.alias + ", source=" + this.source + ", suffix=" + this.suffix + ", dis=" + this.dis + ", uploadTime=" + this.uploadTime + ")";
    }
}
