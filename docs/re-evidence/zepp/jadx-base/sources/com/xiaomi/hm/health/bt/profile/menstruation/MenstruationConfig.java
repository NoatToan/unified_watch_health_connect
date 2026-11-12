package com.xiaomi.hm.health.bt.profile.menstruation;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0086\b\u0018\u0000 +2\u00020\u0001:\u0001+BC\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0006J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\b\u0010\u0006J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\u0006J\u0012\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJX\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003R\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0006R\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0006R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u0006R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000bR\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u0006R\u001b\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u000b¨\u0006,"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationConfig;", "Ljava/io/Serializable;", "", "toString", "", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "", "component4", "()Ljava/lang/Byte;", "component5", "component6", "smartPredict", "deviceNotify", "menstruationNotify", "menstruationNotifyDays", "ovulationNotify", "ovulationDays", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Byte;Ljava/lang/Boolean;Ljava/lang/Byte;)Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationConfig;", "", "hashCode", "", "other", "equals", "a", "Ljava/lang/Boolean;", "getSmartPredict", "b", "getDeviceNotify", "c", "getMenstruationNotify", GoogleApiAvailabilityLight.a, "Ljava/lang/Byte;", "getMenstruationNotifyDays", "e", "getOvulationNotify", "f", "getOvulationDays", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Byte;Ljava/lang/Boolean;Ljava/lang/Byte;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MenstruationConfig implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final Boolean smartPredict;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final Boolean deviceNotify;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final Boolean menstruationNotify;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final Byte menstruationNotifyDays;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final Boolean ovulationNotify;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private final Byte ovulationDays;

    public MenstruationConfig(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Byte b, @Nullable Boolean bool4, @Nullable Byte b2) {
        this.smartPredict = bool;
        this.deviceNotify = bool2;
        this.menstruationNotify = bool3;
        this.menstruationNotifyDays = b;
        this.ovulationNotify = bool4;
        this.ovulationDays = b2;
    }

    public static /* synthetic */ MenstruationConfig copy$default(MenstruationConfig menstruationConfig, Boolean bool, Boolean bool2, Boolean bool3, Byte b, Boolean bool4, Byte b2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = menstruationConfig.smartPredict;
        }
        if ((i & 2) != 0) {
            bool2 = menstruationConfig.deviceNotify;
        }
        Boolean bool5 = bool2;
        if ((i & 4) != 0) {
            bool3 = menstruationConfig.menstruationNotify;
        }
        Boolean bool6 = bool3;
        if ((i & 8) != 0) {
            b = menstruationConfig.menstruationNotifyDays;
        }
        Byte b3 = b;
        if ((i & 16) != 0) {
            bool4 = menstruationConfig.ovulationNotify;
        }
        Boolean bool7 = bool4;
        if ((i & 32) != 0) {
            b2 = menstruationConfig.ovulationDays;
        }
        return menstruationConfig.copy(bool, bool5, bool6, b3, bool7, b2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getSmartPredict() {
        return this.smartPredict;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getDeviceNotify() {
        return this.deviceNotify;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getMenstruationNotify() {
        return this.menstruationNotify;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Byte getMenstruationNotifyDays() {
        return this.menstruationNotifyDays;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getOvulationNotify() {
        return this.ovulationNotify;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Byte getOvulationDays() {
        return this.ovulationDays;
    }

    @NotNull
    public final MenstruationConfig copy(@Nullable Boolean smartPredict, @Nullable Boolean deviceNotify, @Nullable Boolean menstruationNotify, @Nullable Byte menstruationNotifyDays, @Nullable Boolean ovulationNotify, @Nullable Byte ovulationDays) {
        return new MenstruationConfig(smartPredict, deviceNotify, menstruationNotify, menstruationNotifyDays, ovulationNotify, ovulationDays);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenstruationConfig)) {
            return false;
        }
        MenstruationConfig menstruationConfig = (MenstruationConfig) other;
        return Intrinsics.areEqual(this.smartPredict, menstruationConfig.smartPredict) && Intrinsics.areEqual(this.deviceNotify, menstruationConfig.deviceNotify) && Intrinsics.areEqual(this.menstruationNotify, menstruationConfig.menstruationNotify) && Intrinsics.areEqual(this.menstruationNotifyDays, menstruationConfig.menstruationNotifyDays) && Intrinsics.areEqual(this.ovulationNotify, menstruationConfig.ovulationNotify) && Intrinsics.areEqual(this.ovulationDays, menstruationConfig.ovulationDays);
    }

    @Nullable
    public final Boolean getDeviceNotify() {
        return this.deviceNotify;
    }

    @Nullable
    public final Boolean getMenstruationNotify() {
        return this.menstruationNotify;
    }

    @Nullable
    public final Byte getMenstruationNotifyDays() {
        return this.menstruationNotifyDays;
    }

    @Nullable
    public final Byte getOvulationDays() {
        return this.ovulationDays;
    }

    @Nullable
    public final Boolean getOvulationNotify() {
        return this.ovulationNotify;
    }

    @Nullable
    public final Boolean getSmartPredict() {
        return this.smartPredict;
    }

    public int hashCode() {
        Boolean bool = this.smartPredict;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.deviceNotify;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.menstruationNotify;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Byte b = this.menstruationNotifyDays;
        int iHashCode4 = (iHashCode3 + (b == null ? 0 : b.hashCode())) * 31;
        Boolean bool4 = this.ovulationNotify;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Byte b2 = this.ovulationDays;
        return iHashCode5 + (b2 != null ? b2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MenstruationConfig: deviceNotify: " + this.deviceNotify + ", menstruationNotify: " + this.menstruationNotify + ", menstruationNotifyDays: " + this.menstruationNotifyDays + ", ovulationNotify: " + this.ovulationNotify;
    }
}
