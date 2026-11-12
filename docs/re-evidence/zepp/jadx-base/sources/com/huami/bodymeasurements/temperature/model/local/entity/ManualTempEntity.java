package com.huami.bodymeasurements.temperature.model.local.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Entity(tableName = "ManualTemp")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b)\u0010*J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\t\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\"\u0010(\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/local/entity/ManualTempEntity;", "", "", "component1", "", "component2", "", "component3", "component4", "timestamp", "temp", "userId", "appName", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getTimestamp", "()J", "b", "F", "getTemp", "()F", "c", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", GoogleApiAvailabilityLight.a, "getAppName", "e", "Z", "getSyncStatus", "()Z", "setSyncStatus", "(Z)V", "syncStatus", "<init>", "(JFLjava/lang/String;Ljava/lang/String;)V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ManualTempEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @PrimaryKey
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final float temp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String appName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean syncStatus;

    public ManualTempEntity(long j, float f, @NotNull String str, @NotNull String str2) {
        this.timestamp = j;
        this.temp = f;
        this.userId = str;
        this.appName = str2;
    }

    public static /* synthetic */ ManualTempEntity copy$default(ManualTempEntity manualTempEntity, long j, float f, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = manualTempEntity.timestamp;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            f = manualTempEntity.temp;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            str = manualTempEntity.userId;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = manualTempEntity.appName;
        }
        return manualTempEntity.copy(j2, f2, str3, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getTemp() {
        return this.temp;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    public final ManualTempEntity copy(long timestamp, float temp, @NotNull String userId, @NotNull String appName) {
        return new ManualTempEntity(timestamp, temp, userId, appName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManualTempEntity)) {
            return false;
        }
        ManualTempEntity manualTempEntity = (ManualTempEntity) other;
        return this.timestamp == manualTempEntity.timestamp && Intrinsics.areEqual((Object) Float.valueOf(this.temp), (Object) Float.valueOf(manualTempEntity.temp)) && Intrinsics.areEqual(this.userId, manualTempEntity.userId) && Intrinsics.areEqual(this.appName, manualTempEntity.appName);
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    public final boolean getSyncStatus() {
        return this.syncStatus;
    }

    public final float getTemp() {
        return this.temp;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((b.a(this.timestamp) * 31) + Float.floatToIntBits(this.temp)) * 31) + this.userId.hashCode()) * 31) + this.appName.hashCode();
    }

    public final void setSyncStatus(boolean z) {
        this.syncStatus = z;
    }

    @NotNull
    public String toString() {
        return "ManualTempEntity(timestamp=" + this.timestamp + ", temp=" + this.temp + ", userId=" + this.userId + ", appName=" + this.appName + ')';
    }
}
