package com.xiaomi.hm.health.bt.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.utils.ByteDecoder;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.watch.companion.dataflow.Constant;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b#\b\u0086\b\u0018\u0000 K2\u00020\u0001:\u0001KB[\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0006\u0012\u0006\u0010\u001f\u001a\u00020\u0013\u0012\u0006\u0010 \u001a\u00020\u0006\u0012\u0006\u0010!\u001a\u00020\u0016\u0012\u0006\u0010\"\u001a\u00020\u0006\u0012\u0006\u0010#\u001a\u00020\u0006\u0012\u0006\u0010$\u001a\u00020\u0013\u0012\b\b\u0002\u0010%\u001a\u00020\u0006\u0012\b\b\u0002\u0010&\u001a\u00020\u0004¢\u0006\u0004\bG\u0010HB\u0011\b\u0016\u0012\u0006\u0010I\u001a\u00020\n¢\u0006\u0004\bG\u0010JJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0004J\b\u0010\t\u001a\u00020\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0013HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0016HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0013HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003Jm\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\u00132\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020\u00162\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\u00062\b\b\u0002\u0010$\u001a\u00020\u00132\b\b\u0002\u0010%\u001a\u00020\u00062\b\b\u0002\u0010&\u001a\u00020\u0004HÆ\u0001J\t\u0010(\u001a\u00020\u0006HÖ\u0001J\u0013\u0010+\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003R\u0019\u0010\u001d\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u001e\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u0019\u0010\u001f\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010 \u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b6\u0010-\u001a\u0004\b7\u0010/R\u0019\u0010!\u001a\u00020\u00168\u0006@\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\"\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b<\u0010-\u001a\u0004\b=\u0010/R\u0019\u0010#\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b>\u0010-\u001a\u0004\b?\u0010/R\u0019\u0010$\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b@\u00103\u001a\u0004\bA\u00105R\u0019\u0010%\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\bB\u0010-\u001a\u0004\bC\u0010/R\u0019\u0010&\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\b&\u0010F¨\u0006L"}, d2 = {"Lcom/xiaomi/hm/health/bt/model/MeasureData;", "Landroid/os/Parcelable;", "Lcom/xiaomi/hm/health/bt/model/MeasureState;", EcgData.MEASURE_STATE, "", "isLightWeight", "", "measureResult", "isMatchingUser", "describeContents", "Landroid/os/Parcel;", "dest", DataCacher.j, "", "writeToParcel", "", "toString", "component1", "component2", "", "component3", "component4", "", "component5", "component6", "component7", "component8", "component9", "component10", "flag", "unit", "timestamp", ParamKey.impedance, "weight", Constant.KEY_HR_VALUE, "pressure", "familyId", SDKConstants.PARAM_SESSION_ID, "isOverLoad", "copy", "hashCode", "", "other", "equals", "a", LogUtil.I, "getFlag", "()I", "b", "getUnit", "c", "J", "getTimestamp", "()J", GoogleApiAvailabilityLight.a, "getImpedance", "e", "F", "getWeight", "()F", "f", "getHeartRate", "g", "getPressure", "h", "getFamilyId", "i", "getSessionID", z.j, "Z", "()Z", "<init>", "(IIJIFIIJIZ)V", "source", "(Landroid/os/Parcel;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MeasureData implements Parcelable {
    public static final int FAMILY_ID_BYTES = 6;
    public static final int FLAG_FAMILY_ID = 128;
    public static final int FLAG_HR = 32;
    public static final int FLAG_IMPEDANCE = 16;
    public static final int FLAG_IS_JIN = 16384;
    public static final int FLAG_LEAVE = 32768;
    public static final int FLAG_LIGHT_WEIGHT = 4;
    public static final int FLAG_MEASURE_STATE = 1536;
    public static final int FLAG_OVERLOAD = 65535;
    public static final int FLAG_PRESSURE = 64;
    public static final int FLAG_SESSION_ID = 256;
    public static final int FLAG_UNIT = 1;
    public static final int FLAG_USER_MATCH_STATE = 2048;
    public static final int FLAG_WEIGHT = 8;
    public static final int HR_BYTES = 1;
    public static final int IMPEDANCE_BYTES = 3;
    public static final long INVALID_FAMILY_ID = -2;
    public static final float KG_RATIO = 200.0f;
    public static final int MEASURE_FAILED = 2;
    public static final int MEASURE_SUCCESS = 1;
    public static final int MEASURING = 0;
    public static final float NOT_KG_RATIO = 100.0f;
    public static final int PRESSURE_BYTES = 1;
    public static final int WEIGHT_BYTES = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int flag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int unit;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int impedance;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final float weight;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int heartRate;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final int pressure;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final long familyId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private final int sessionID;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean isOverLoad;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<MeasureData> CREATOR = new Parcelable.Creator<MeasureData>() { // from class: com.xiaomi.hm.health.bt.model.MeasureData$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public MeasureData createFromParcel(@NotNull Parcel source) {
            return new MeasureData(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public MeasureData[] newArray(int size) {
            return new MeasureData[size];
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b+\u0010,J(\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J(\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0016\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010R\u0016\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u0016\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0010R\u0016\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u0016\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0010R\u0016\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u0016\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0010R\u0016\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0010R\u0016\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0010R\u0016\u0010 \u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0010R\u0016\u0010&\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0010R\u0016\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0010R\u0016\u0010(\u001a\u00020\"8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010$R\u0016\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0010R\u0016\u0010*\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0010¨\u0006-"}, d2 = {"Lcom/xiaomi/hm/health/bt/model/MeasureData$Companion;", "", "", "flag", "Lcom/huami/bluetooth/utils/ByteDecoder;", "decoder", "size", "", "defaultValue", "a", "b", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/hm/health/bt/model/MeasureData;", "CREATOR", "Landroid/os/Parcelable$Creator;", "FAMILY_ID_BYTES", LogUtil.I, "FLAG_FAMILY_ID", "FLAG_HR", "FLAG_IMPEDANCE", "FLAG_IS_JIN", "FLAG_LEAVE", "FLAG_LIGHT_WEIGHT", "FLAG_MEASURE_STATE", "FLAG_OVERLOAD", "FLAG_PRESSURE", "FLAG_SESSION_ID", "FLAG_UNIT", "FLAG_USER_MATCH_STATE", "FLAG_WEIGHT", "HR_BYTES", "IMPEDANCE_BYTES", "INVALID_FAMILY_ID", "J", "", "KG_RATIO", "F", "MEASURE_FAILED", "MEASURE_SUCCESS", "MEASURING", "NOT_KG_RATIO", "PRESSURE_BYTES", "WEIGHT_BYTES", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final long a(int flag, ByteDecoder decoder, int size, long defaultValue) {
            return flag > 0 ? decoder.readLong(size) : defaultValue;
        }

        private final int b(int flag, ByteDecoder decoder, int size, int defaultValue) {
            return flag > 0 ? decoder.readInt(size) : defaultValue;
        }
    }

    public MeasureData(int i, int i2, long j, int i3, float f, int i4, int i5, long j2, int i6, boolean z) {
        this.flag = i;
        this.unit = i2;
        this.timestamp = j;
        this.impedance = i3;
        this.weight = f;
        this.heartRate = i4;
        this.pressure = i5;
        this.familyId = j2;
        this.sessionID = i6;
        this.isOverLoad = z;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getFlag() {
        return this.flag;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsOverLoad() {
        return this.isOverLoad;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getImpedance() {
        return this.impedance;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getHeartRate() {
        return this.heartRate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getPressure() {
        return this.pressure;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getFamilyId() {
        return this.familyId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getSessionID() {
        return this.sessionID;
    }

    @NotNull
    public final MeasureData copy(int flag, int unit, long timestamp, int impedance, float weight, int heartRate, int pressure, long familyId, int sessionID, boolean isOverLoad) {
        return new MeasureData(flag, unit, timestamp, impedance, weight, heartRate, pressure, familyId, sessionID, isOverLoad);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MeasureData)) {
            return false;
        }
        MeasureData measureData = (MeasureData) other;
        return this.flag == measureData.flag && this.unit == measureData.unit && this.timestamp == measureData.timestamp && this.impedance == measureData.impedance && Intrinsics.areEqual((Object) Float.valueOf(this.weight), (Object) Float.valueOf(measureData.weight)) && this.heartRate == measureData.heartRate && this.pressure == measureData.pressure && this.familyId == measureData.familyId && this.sessionID == measureData.sessionID && this.isOverLoad == measureData.isOverLoad;
    }

    public final long getFamilyId() {
        return this.familyId;
    }

    public final int getFlag() {
        return this.flag;
    }

    public final int getHeartRate() {
        return this.heartRate;
    }

    public final int getImpedance() {
        return this.impedance;
    }

    public final int getPressure() {
        return this.pressure;
    }

    public final int getSessionID() {
        return this.sessionID;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final int getUnit() {
        return this.unit;
    }

    public final float getWeight() {
        return this.weight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    public int hashCode() {
        int iA = ((((((((((((((((this.flag * 31) + this.unit) * 31) + b.a(this.timestamp)) * 31) + this.impedance) * 31) + Float.floatToIntBits(this.weight)) * 31) + this.heartRate) * 31) + this.pressure) * 31) + b.a(this.familyId)) * 31) + this.sessionID) * 31;
        boolean z = this.isOverLoad;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iA + r1;
    }

    public final boolean isLightWeight() {
        return (this.flag & 4) > 0;
    }

    public final boolean isMatchingUser() {
        return (this.flag & 2048) > 0;
    }

    public final boolean isOverLoad() {
        return this.isOverLoad;
    }

    public final int measureResult() {
        return (this.flag & 1536) >> 9;
    }

    @NotNull
    public final MeasureState measureState() {
        int i = this.flag;
        if ((32768 & i) > 0) {
            return MeasureState.MEASURING_FINISHED;
        }
        if ((i & 64) > 0) {
            return MeasureState.MEASURING_PRESSURE;
        }
        if ((i & 32) > 0) {
            return MeasureState.MEASURING_HR;
        }
        if ((i & 16) > 0) {
            return MeasureState.MEASURING_IMPEDANCE;
        }
        return (i & 8) > 0 ? MeasureState.MEASURING_WEIGHT : MeasureState.MEASURING_WEIGHT;
    }

    @NotNull
    public String toString() {
        return "MeasureData(flag=" + this.flag + ", unit=" + this.unit + ", timestamp=" + this.timestamp + ", impedance=" + this.impedance + ", weight=" + this.weight + ", heartRate=" + this.heartRate + ", pressure=" + this.pressure + ", familyId=" + this.familyId + ", sessionID=" + this.sessionID + ", measureState=" + measureState() + ", measureResult=" + measureResult() + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.writeInt(getFlag());
        dest.writeInt(getUnit());
        dest.writeLong(getTimestamp());
        dest.writeInt(getImpedance());
        dest.writeFloat(getWeight());
        dest.writeInt(getHeartRate());
        dest.writeInt(getPressure());
        dest.writeLong(getFamilyId());
    }

    public /* synthetic */ MeasureData(int i, int i2, long j, int i3, float f, int i4, int i5, long j2, int i6, boolean z, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, j, i3, f, i4, i5, j2, (i7 & 256) != 0 ? 0 : i6, (i7 & 512) != 0 ? false : z);
    }

    public MeasureData(@NotNull Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readLong(), 0, false, 768, null);
    }
}
