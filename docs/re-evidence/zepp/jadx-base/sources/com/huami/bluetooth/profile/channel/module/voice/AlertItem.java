package com.huami.bluetooth.profile.channel.module.voice;

import com.baidu.ocr.sdk.utils.LogUtil;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/AlertItem;", "", "", "component1", "", "component2", "", "component3", "alertType", "id", Constants.ENABLED, "copy", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getAlertType", "()I", "b", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "c", "Z", "getEnabled", "()Z", "<init>", "(ILjava/lang/String;Z)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AlertItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int alertType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean enabled;

    public AlertItem(int i, @NotNull String str, boolean z) {
        this.alertType = i;
        this.id = str;
        this.enabled = z;
    }

    public static /* synthetic */ AlertItem copy$default(AlertItem alertItem, int i, String str, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = alertItem.alertType;
        }
        if ((i2 & 2) != 0) {
            str = alertItem.id;
        }
        if ((i2 & 4) != 0) {
            z = alertItem.enabled;
        }
        return alertItem.copy(i, str, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAlertType() {
        return this.alertType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final AlertItem copy(int alertType, @NotNull String id, boolean enabled) {
        return new AlertItem(alertType, id, enabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlertItem)) {
            return false;
        }
        AlertItem alertItem = (AlertItem) other;
        return this.alertType == alertItem.alertType && Intrinsics.areEqual(this.id, alertItem.id) && this.enabled == alertItem.enabled;
    }

    public final int getAlertType() {
        return this.alertType;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iHashCode = ((this.alertType * 31) + this.id.hashCode()) * 31;
        boolean z = this.enabled;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        return "AlertItem(alertType=" + this.alertType + ", id=" + this.id + ", enabled=" + this.enabled + ')';
    }
}
