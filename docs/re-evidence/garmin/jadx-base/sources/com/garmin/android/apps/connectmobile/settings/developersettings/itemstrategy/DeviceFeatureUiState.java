package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/DeviceFeatureUiState;", "", "isAllPairedDevicesEnabled", "", "forceBasicFlowEnabled", "<init>", "(ZZ)V", "()Z", "getForceBasicFlowEnabled", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DeviceFeatureUiState {
    public static final int $stable = 0;
    private final boolean forceBasicFlowEnabled;
    private final boolean isAllPairedDevicesEnabled;

    public /* synthetic */ DeviceFeatureUiState(boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15);
    }

    public static /* synthetic */ DeviceFeatureUiState copy$default(DeviceFeatureUiState deviceFeatureUiState, boolean z14, boolean z15, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z14 = deviceFeatureUiState.isAllPairedDevicesEnabled;
        }
        if ((i14 & 2) != 0) {
            z15 = deviceFeatureUiState.forceBasicFlowEnabled;
        }
        return deviceFeatureUiState.copy(z14, z15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsAllPairedDevicesEnabled() {
        return this.isAllPairedDevicesEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getForceBasicFlowEnabled() {
        return this.forceBasicFlowEnabled;
    }

    public final DeviceFeatureUiState copy(boolean isAllPairedDevicesEnabled, boolean forceBasicFlowEnabled) {
        return new DeviceFeatureUiState(isAllPairedDevicesEnabled, forceBasicFlowEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceFeatureUiState)) {
            return false;
        }
        DeviceFeatureUiState deviceFeatureUiState = (DeviceFeatureUiState) other;
        return this.isAllPairedDevicesEnabled == deviceFeatureUiState.isAllPairedDevicesEnabled && this.forceBasicFlowEnabled == deviceFeatureUiState.forceBasicFlowEnabled;
    }

    public final boolean getForceBasicFlowEnabled() {
        return this.forceBasicFlowEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.forceBasicFlowEnabled) + (Boolean.hashCode(this.isAllPairedDevicesEnabled) * 31);
    }

    public final boolean isAllPairedDevicesEnabled() {
        return this.isAllPairedDevicesEnabled;
    }

    public String toString() {
        return com.airbnb.lottie.animation.keyframe.a.e("DeviceFeatureUiState(isAllPairedDevicesEnabled=", ", forceBasicFlowEnabled=", ")", this.isAllPairedDevicesEnabled, this.forceBasicFlowEnabled);
    }

    public DeviceFeatureUiState(boolean z14, boolean z15) {
        this.isAllPairedDevicesEnabled = z14;
        this.forceBasicFlowEnabled = z15;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DeviceFeatureUiState() {
        boolean z14 = false;
        this(z14, z14, 3, null);
    }
}
