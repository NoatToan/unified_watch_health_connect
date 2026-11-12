package com.huami.bloodoxygen.bluetooth.synctime.remote.api.property;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/Properties;", "", "", "component1", "bloodOxygenSyncTime", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getBloodOxygenSyncTime", "()Ljava/lang/String;", "setBloodOxygenSyncTime", "(Ljava/lang/String;)V", "<init>", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Properties {

    @NotNull
    public static final String BLOOD_OXYGEN = "huami.amazfit.midong.spo2synctime";

    @SerializedName(BLOOD_OXYGEN)
    @Nullable
    private String bloodOxygenSyncTime;

    /* JADX WARN: Multi-variable type inference failed */
    public Properties() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public Properties(@Nullable String str) {
        this.bloodOxygenSyncTime = str;
    }

    public static /* synthetic */ Properties copy$default(Properties properties, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = properties.bloodOxygenSyncTime;
        }
        return properties.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBloodOxygenSyncTime() {
        return this.bloodOxygenSyncTime;
    }

    @NotNull
    public final Properties copy(@Nullable String bloodOxygenSyncTime) {
        return new Properties(bloodOxygenSyncTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Properties) && Intrinsics.areEqual(this.bloodOxygenSyncTime, ((Properties) other).bloodOxygenSyncTime);
    }

    @Nullable
    public final String getBloodOxygenSyncTime() {
        return this.bloodOxygenSyncTime;
    }

    public int hashCode() {
        String str = this.bloodOxygenSyncTime;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setBloodOxygenSyncTime(@Nullable String str) {
        this.bloodOxygenSyncTime = str;
    }

    @NotNull
    public String toString() {
        return "Properties(bloodOxygenSyncTime=" + this.bloodOxygenSyncTime + ")";
    }

    public /* synthetic */ Properties(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
