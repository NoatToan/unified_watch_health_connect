package com.huami.healthlabel.db.po;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Entity(tableName = "health_table")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001e¨\u0006#"}, d2 = {"Lcom/huami/healthlabel/db/po/HealthLabel;", "", "", "component1", "", "component2", "", "component3", "component4", "labelId", "timestamp", "labelText", "labelColor", "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getLabelId", "()I", "b", "J", "getTimestamp", "()J", "c", "Ljava/lang/String;", "getLabelText", "()Ljava/lang/String;", GoogleApiAvailabilityLight.a, "getLabelColor", "<init>", "(IJLjava/lang/String;Ljava/lang/String;)V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HealthLabel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int labelId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @PrimaryKey
    private final long timestamp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String labelText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String labelColor;

    public HealthLabel(int i, long j, @NotNull String str, @NotNull String str2) {
        this.labelId = i;
        this.timestamp = j;
        this.labelText = str;
        this.labelColor = str2;
    }

    public static /* synthetic */ HealthLabel copy$default(HealthLabel healthLabel, int i, long j, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = healthLabel.labelId;
        }
        if ((i2 & 2) != 0) {
            j = healthLabel.timestamp;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            str = healthLabel.labelText;
        }
        String str3 = str;
        if ((i2 & 8) != 0) {
            str2 = healthLabel.labelColor;
        }
        return healthLabel.copy(i, j2, str3, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLabelId() {
        return this.labelId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLabelText() {
        return this.labelText;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLabelColor() {
        return this.labelColor;
    }

    @NotNull
    public final HealthLabel copy(int labelId, long timestamp, @NotNull String labelText, @NotNull String labelColor) {
        return new HealthLabel(labelId, timestamp, labelText, labelColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthLabel)) {
            return false;
        }
        HealthLabel healthLabel = (HealthLabel) other;
        return this.labelId == healthLabel.labelId && this.timestamp == healthLabel.timestamp && Intrinsics.areEqual(this.labelText, healthLabel.labelText) && Intrinsics.areEqual(this.labelColor, healthLabel.labelColor);
    }

    @NotNull
    public final String getLabelColor() {
        return this.labelColor;
    }

    public final int getLabelId() {
        return this.labelId;
    }

    @NotNull
    public final String getLabelText() {
        return this.labelText;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((((this.labelId * 31) + b.a(this.timestamp)) * 31) + this.labelText.hashCode()) * 31) + this.labelColor.hashCode();
    }

    @NotNull
    public String toString() {
        return "HealthLabel(labelId=" + this.labelId + ", timestamp=" + this.timestamp + ", labelText=" + this.labelText + ", labelColor=" + this.labelColor + ")";
    }

    public /* synthetic */ HealthLabel(int i, long j, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, j, (i2 & 4) != 0 ? "" : str, str2);
    }
}
