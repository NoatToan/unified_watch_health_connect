package com.xiaomi.fitness.sync.export.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/sync/export/model/Alerts;", "", "alertId", "", "pubTime", "title", "type", "level", "detail", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlertId", "()Ljava/lang/String;", "getPubTime", "getTitle", "getType", "getLevel", "getDetail", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "sync-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Alerts {

    @SerializedName("alertId")
    @NotNull
    private final String alertId;

    @SerializedName("detail")
    @NotNull
    private final String detail;

    @SerializedName("level")
    @NotNull
    private final String level;

    @SerializedName("pubTime")
    @NotNull
    private final String pubTime;

    @SerializedName("title")
    @NotNull
    private final String title;

    @SerializedName("type")
    @NotNull
    private final String type;

    public Alerts(@NotNull String alertId, @NotNull String pubTime, @NotNull String title, @NotNull String type, @NotNull String level, @NotNull String detail) {
        Intrinsics.checkNotNullParameter(alertId, "alertId");
        Intrinsics.checkNotNullParameter(pubTime, "pubTime");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(detail, "detail");
        this.alertId = alertId;
        this.pubTime = pubTime;
        this.title = title;
        this.type = type;
        this.level = level;
        this.detail = detail;
    }

    public static /* synthetic */ Alerts copy$default(Alerts alerts, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alerts.alertId;
        }
        if ((i & 2) != 0) {
            str2 = alerts.pubTime;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = alerts.title;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = alerts.type;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = alerts.level;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = alerts.detail;
        }
        return alerts.copy(str, str7, str8, str9, str10, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAlertId() {
        return this.alertId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPubTime() {
        return this.pubTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLevel() {
        return this.level;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDetail() {
        return this.detail;
    }

    @NotNull
    public final Alerts copy(@NotNull String alertId, @NotNull String pubTime, @NotNull String title, @NotNull String type, @NotNull String level, @NotNull String detail) {
        Intrinsics.checkNotNullParameter(alertId, "alertId");
        Intrinsics.checkNotNullParameter(pubTime, "pubTime");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(detail, "detail");
        return new Alerts(alertId, pubTime, title, type, level, detail);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Alerts)) {
            return false;
        }
        Alerts alerts = (Alerts) other;
        return Intrinsics.areEqual(this.alertId, alerts.alertId) && Intrinsics.areEqual(this.pubTime, alerts.pubTime) && Intrinsics.areEqual(this.title, alerts.title) && Intrinsics.areEqual(this.type, alerts.type) && Intrinsics.areEqual(this.level, alerts.level) && Intrinsics.areEqual(this.detail, alerts.detail);
    }

    @NotNull
    public final String getAlertId() {
        return this.alertId;
    }

    @NotNull
    public final String getDetail() {
        return this.detail;
    }

    @NotNull
    public final String getLevel() {
        return this.level;
    }

    @NotNull
    public final String getPubTime() {
        return this.pubTime;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((this.alertId.hashCode() * 31) + this.pubTime.hashCode()) * 31) + this.title.hashCode()) * 31) + this.type.hashCode()) * 31) + this.level.hashCode()) * 31) + this.detail.hashCode();
    }

    @NotNull
    public String toString() {
        return "Alerts(alertId=" + this.alertId + ", pubTime=" + this.pubTime + ", title=" + this.title + ", type=" + this.type + ", level=" + this.level + ", detail=" + this.detail + ")";
    }
}
