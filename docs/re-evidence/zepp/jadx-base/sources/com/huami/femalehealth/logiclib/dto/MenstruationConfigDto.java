package com.huami.femalehealth.logiclib.dto;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b(\u0010)J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\n\u0010\bJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\u0004JX\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0004R\u001b\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0004R\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\bR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u0004R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\bR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010\u0004¨\u0006*"}, d2 = {"Lcom/huami/femalehealth/logiclib/dto/MenstruationConfigDto;", "", "", "component1", "()Ljava/lang/Boolean;", "component2", "", "component3", "()Ljava/lang/Byte;", "component4", "component5", "component6", "deviceNotify", "menstruationNotify", "menstruationNotifyDays", "ovulationNotify", "ovulationDays", "smartPredict", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Byte;Ljava/lang/Boolean;Ljava/lang/Byte;Ljava/lang/Boolean;)Lcom/huami/femalehealth/logiclib/dto/MenstruationConfigDto;", "", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/Boolean;", "getDeviceNotify", "b", "getMenstruationNotify", "c", "Ljava/lang/Byte;", "getMenstruationNotifyDays", GoogleApiAvailabilityLight.a, "getOvulationNotify", "e", "getOvulationDays", "f", "getSmartPredict", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Byte;Ljava/lang/Boolean;Ljava/lang/Byte;Ljava/lang/Boolean;)V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MenstruationConfigDto {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final Boolean deviceNotify;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final Boolean menstruationNotify;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Byte menstruationNotifyDays;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final Boolean ovulationNotify;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final Byte ovulationDays;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final Boolean smartPredict;

    public MenstruationConfigDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public MenstruationConfigDto(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Byte b, @Nullable Boolean bool3, @Nullable Byte b2, @Nullable Boolean bool4) {
        this.deviceNotify = bool;
        this.menstruationNotify = bool2;
        this.menstruationNotifyDays = b;
        this.ovulationNotify = bool3;
        this.ovulationDays = b2;
        this.smartPredict = bool4;
    }

    public static /* synthetic */ MenstruationConfigDto copy$default(MenstruationConfigDto menstruationConfigDto, Boolean bool, Boolean bool2, Byte b, Boolean bool3, Byte b2, Boolean bool4, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = menstruationConfigDto.deviceNotify;
        }
        if ((i & 2) != 0) {
            bool2 = menstruationConfigDto.menstruationNotify;
        }
        Boolean bool5 = bool2;
        if ((i & 4) != 0) {
            b = menstruationConfigDto.menstruationNotifyDays;
        }
        Byte b3 = b;
        if ((i & 8) != 0) {
            bool3 = menstruationConfigDto.ovulationNotify;
        }
        Boolean bool6 = bool3;
        if ((i & 16) != 0) {
            b2 = menstruationConfigDto.ovulationDays;
        }
        Byte b4 = b2;
        if ((i & 32) != 0) {
            bool4 = menstruationConfigDto.smartPredict;
        }
        return menstruationConfigDto.copy(bool, bool5, b3, bool6, b4, bool4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getDeviceNotify() {
        return this.deviceNotify;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getMenstruationNotify() {
        return this.menstruationNotify;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Byte getMenstruationNotifyDays() {
        return this.menstruationNotifyDays;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getOvulationNotify() {
        return this.ovulationNotify;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Byte getOvulationDays() {
        return this.ovulationDays;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getSmartPredict() {
        return this.smartPredict;
    }

    @NotNull
    public final MenstruationConfigDto copy(@Nullable Boolean deviceNotify, @Nullable Boolean menstruationNotify, @Nullable Byte menstruationNotifyDays, @Nullable Boolean ovulationNotify, @Nullable Byte ovulationDays, @Nullable Boolean smartPredict) {
        return new MenstruationConfigDto(deviceNotify, menstruationNotify, menstruationNotifyDays, ovulationNotify, ovulationDays, smartPredict);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenstruationConfigDto)) {
            return false;
        }
        MenstruationConfigDto menstruationConfigDto = (MenstruationConfigDto) other;
        return Intrinsics.areEqual(this.deviceNotify, menstruationConfigDto.deviceNotify) && Intrinsics.areEqual(this.menstruationNotify, menstruationConfigDto.menstruationNotify) && Intrinsics.areEqual(this.menstruationNotifyDays, menstruationConfigDto.menstruationNotifyDays) && Intrinsics.areEqual(this.ovulationNotify, menstruationConfigDto.ovulationNotify) && Intrinsics.areEqual(this.ovulationDays, menstruationConfigDto.ovulationDays) && Intrinsics.areEqual(this.smartPredict, menstruationConfigDto.smartPredict);
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
        Boolean bool = this.deviceNotify;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.menstruationNotify;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Byte b = this.menstruationNotifyDays;
        int iHashCode3 = (iHashCode2 + (b == null ? 0 : b.hashCode())) * 31;
        Boolean bool3 = this.ovulationNotify;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Byte b2 = this.ovulationDays;
        int iHashCode5 = (iHashCode4 + (b2 == null ? 0 : b2.hashCode())) * 31;
        Boolean bool4 = this.smartPredict;
        return iHashCode5 + (bool4 != null ? bool4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MenstruationConfigDto(deviceNotify=" + this.deviceNotify + ", menstruationNotify=" + this.menstruationNotify + ", menstruationNotifyDays=" + this.menstruationNotifyDays + ", ovulationNotify=" + this.ovulationNotify + ", ovulationDays=" + this.ovulationDays + ", smartPredict=" + this.smartPredict + ')';
    }

    public /* synthetic */ MenstruationConfigDto(Boolean bool, Boolean bool2, Byte b, Boolean bool3, Byte b2, Boolean bool4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : b, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : b2, (i & 32) != 0 ? null : bool4);
    }
}
