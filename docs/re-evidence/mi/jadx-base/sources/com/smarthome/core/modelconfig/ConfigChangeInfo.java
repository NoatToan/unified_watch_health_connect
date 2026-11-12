package com.smarthome.core.modelconfig;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/smarthome/core/modelconfig/ConfigChangeInfo;", "", "deviceListChanged", "", "developerListChanged", "(ZZ)V", "getDeveloperListChanged", "()Z", "getDeviceListChanged", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "smarthome-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class ConfigChangeInfo {
    private final boolean developerListChanged;
    private final boolean deviceListChanged;

    public ConfigChangeInfo(boolean z, boolean z2) {
        this.deviceListChanged = z;
        this.developerListChanged = z2;
    }

    public static /* synthetic */ ConfigChangeInfo copy$default(ConfigChangeInfo configChangeInfo, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = configChangeInfo.deviceListChanged;
        }
        if ((i & 2) != 0) {
            z2 = configChangeInfo.developerListChanged;
        }
        return configChangeInfo.copy(z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getDeviceListChanged() {
        return this.deviceListChanged;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getDeveloperListChanged() {
        return this.developerListChanged;
    }

    @NotNull
    public final ConfigChangeInfo copy(boolean deviceListChanged, boolean developerListChanged) {
        return new ConfigChangeInfo(deviceListChanged, developerListChanged);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigChangeInfo)) {
            return false;
        }
        ConfigChangeInfo configChangeInfo = (ConfigChangeInfo) other;
        return this.deviceListChanged == configChangeInfo.deviceListChanged && this.developerListChanged == configChangeInfo.developerListChanged;
    }

    public final boolean getDeveloperListChanged() {
        return this.developerListChanged;
    }

    public final boolean getDeviceListChanged() {
        return this.deviceListChanged;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z = this.deviceListChanged;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.developerListChanged;
        return i + (z2 ? 1 : z2);
    }

    @NotNull
    public String toString() {
        return "ConfigChangeInfo(deviceListChanged=" + this.deviceListChanged + ", developerListChanged=" + this.developerListChanged + ')';
    }
}
