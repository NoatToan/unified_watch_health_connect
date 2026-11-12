package com.huami.device.feature.health.ui.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.feature.health.res.AppResKt;
import com.huami.device.feature.health.user.HealthSettingConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u000b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u000b\u0010\u001bR\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/huami/device/feature/health/ui/model/IntervalExp;", "", "", "component1", "component2", "", "component3", "Lcom/huami/device/feature/health/user/HealthSettingConfig;", "component4", "preValue", "userChoose", "isHuamiOs", "userConfig", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getPreValue", "()I", "b", "getUserChoose", "c", "Z", "()Z", GoogleApiAvailabilityLight.a, "Lcom/huami/device/feature/health/user/HealthSettingConfig;", "getUserConfig", "()Lcom/huami/device/feature/health/user/HealthSettingConfig;", "<init>", "(IIZLcom/huami/device/feature/health/user/HealthSettingConfig;)V", "Companion", "health-ui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class IntervalExp {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int preValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int userChoose;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean isHuamiOs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final HealthSettingConfig userConfig;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/device/feature/health/ui/model/IntervalExp$Companion;", "", "", "interval", "", "toHrIntervalStr", "<init>", "()V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String toHrIntervalStr(int interval) {
            if (interval != -1) {
                return interval != 0 ? AppResKt.getHealthStr().getTimeFormatMinute(interval) : AppResKt.getHealthStr().getHrDetectClose();
            }
            return AppResKt.getHealthStr().getHrDetectAtrial();
        }
    }

    public IntervalExp(int i, int i2, boolean z, @NotNull HealthSettingConfig healthSettingConfig) {
        this.preValue = i;
        this.userChoose = i2;
        this.isHuamiOs = z;
        this.userConfig = healthSettingConfig;
    }

    public static /* synthetic */ IntervalExp copy$default(IntervalExp intervalExp, int i, int i2, boolean z, HealthSettingConfig healthSettingConfig, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = intervalExp.preValue;
        }
        if ((i3 & 2) != 0) {
            i2 = intervalExp.userChoose;
        }
        if ((i3 & 4) != 0) {
            z = intervalExp.isHuamiOs;
        }
        if ((i3 & 8) != 0) {
            healthSettingConfig = intervalExp.userConfig;
        }
        return intervalExp.copy(i, i2, z, healthSettingConfig);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPreValue() {
        return this.preValue;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getUserChoose() {
        return this.userChoose;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsHuamiOs() {
        return this.isHuamiOs;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final HealthSettingConfig getUserConfig() {
        return this.userConfig;
    }

    @NotNull
    public final IntervalExp copy(int preValue, int userChoose, boolean isHuamiOs, @NotNull HealthSettingConfig userConfig) {
        return new IntervalExp(preValue, userChoose, isHuamiOs, userConfig);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntervalExp)) {
            return false;
        }
        IntervalExp intervalExp = (IntervalExp) other;
        return this.preValue == intervalExp.preValue && this.userChoose == intervalExp.userChoose && this.isHuamiOs == intervalExp.isHuamiOs && Intrinsics.areEqual(this.userConfig, intervalExp.userConfig);
    }

    public final int getPreValue() {
        return this.preValue;
    }

    public final int getUserChoose() {
        return this.userChoose;
    }

    @NotNull
    public final HealthSettingConfig getUserConfig() {
        return this.userConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        int i = ((this.preValue * 31) + this.userChoose) * 31;
        boolean z = this.isHuamiOs;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((i + r1) * 31) + this.userConfig.hashCode();
    }

    public final boolean isHuamiOs() {
        return this.isHuamiOs;
    }

    @NotNull
    public String toString() {
        return "IntervalExp(preValue=" + this.preValue + ", userChoose=" + this.userChoose + ", isHuamiOs=" + this.isHuamiOs + ", userConfig=" + this.userConfig + ")";
    }
}
