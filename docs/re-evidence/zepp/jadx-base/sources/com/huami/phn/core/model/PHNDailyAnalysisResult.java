package com.huami.phn.core.model;

import androidx.annotation.Keep;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.phn.core.source.impl.db.DailyAnaResultInfoConverter;
import defpackage.b;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@TypeConverters({DailyAnaResultInfoConverter.class})
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000398:B7\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b2\u00103BE\b\u0017\u0012\u0006\u00104\u001a\u00020\r\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u0014\u001a\u00020\r\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b2\u00107J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0006\u0010\t\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u0007J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0012\u001a\u00020\rHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\rHÆ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001b\u001a\u00020\rHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0013\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001f\u0012\u0004\b)\u0010#\u001a\u0004\b(\u0010!R\"\u0010\u0016\u001a\u00020\u00108\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010*\u0012\u0004\b-\u0010#\u001a\u0004\b+\u0010,R(\u0010\u0017\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010$\u0012\u0004\b1\u0010#\u001a\u0004\b.\u0010&\"\u0004\b/\u00100¨\u0006;"}, d2 = {"Lcom/huami/phn/core/model/PHNDailyAnalysisResult;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "stateChangeByServer", "stateChangeByApp", "", "component1", "", "component2", "component3", "Lcom/huami/phn/core/model/PHNDailyAnalysisResult$DailyAnaResultInfo;", "component4", "component5", "timestamp", "timezoneOffset", "phnPlanId", "result", "synced", "copy", "", "toString", "hashCode", "other", "", "equals", "J", "getTimestamp", "()J", "getTimestamp$annotations", "()V", LogUtil.I, "getTimezoneOffset", "()I", "getTimezoneOffset$annotations", "getPhnPlanId", "getPhnPlanId$annotations", "Lcom/huami/phn/core/model/PHNDailyAnalysisResult$DailyAnaResultInfo;", "getResult", "()Lcom/huami/phn/core/model/PHNDailyAnalysisResult$DailyAnaResultInfo;", "getResult$annotations", "getSynced", "setSynced", "(I)V", "getSynced$annotations", "<init>", "(JIJLcom/huami/phn/core/model/PHNDailyAnalysisResult$DailyAnaResultInfo;I)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJIJLcom/huami/phn/core/model/PHNDailyAnalysisResult$DailyAnaResultInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "DailyAnaResultInfo", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
@Serializable
@Entity(tableName = PHNDailyAnalysisResult.TABLE_NAME)
public final /* data */ class PHNDailyAnalysisResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final float ERROR_VALUE = -10000.0f;
    public static final int SYNC_TO_SERVER = 1;

    @NotNull
    public static final String TABLE_NAME = "phn_daily_ana_result";
    public static final int UNSYNCED = 0;
    private final long phnPlanId;

    @NotNull
    private final DailyAnaResultInfo result;
    private int synced;

    @PrimaryKey
    private final long timestamp;
    private final int timezoneOffset;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/huami/phn/core/model/PHNDailyAnalysisResult$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/phn/core/model/PHNDailyAnalysisResult;", "serializer", "", "ERROR_VALUE", "F", "", "SYNC_TO_SERVER", LogUtil.I, "", "TABLE_NAME", "Ljava/lang/String;", "UNSYNCED", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<PHNDailyAnalysisResult> serializer() {
            return PHNDailyAnalysisResult$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PHNDailyAnalysisResult(int i, @SerialName("timestamp") long j, @SerialName("timezone_offset") int i2, @SerialName("phn_plan_id") long j2, @SerialName("result") DailyAnaResultInfo dailyAnaResultInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if (8 != (i & 8)) {
            PluginExceptionsKt.throwMissingFieldException(i, 8, PHNDailyAnalysisResult$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.timestamp = 0L;
        } else {
            this.timestamp = j;
        }
        if ((i & 2) == 0) {
            this.timezoneOffset = 0;
        } else {
            this.timezoneOffset = i2;
        }
        if ((i & 4) == 0) {
            this.phnPlanId = 0L;
        } else {
            this.phnPlanId = j2;
        }
        this.result = dailyAnaResultInfo;
        this.synced = 0;
    }

    @SerialName("phn_plan_id")
    public static /* synthetic */ void getPhnPlanId$annotations() {
    }

    @SerialName("result")
    public static /* synthetic */ void getResult$annotations() {
    }

    @Transient
    public static /* synthetic */ void getSynced$annotations() {
    }

    @SerialName("timestamp")
    public static /* synthetic */ void getTimestamp$annotations() {
    }

    @SerialName("timezone_offset")
    public static /* synthetic */ void getTimezoneOffset$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull PHNDailyAnalysisResult self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.timestamp != 0) {
            output.encodeLongElement(serialDesc, 0, self.timestamp);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.timezoneOffset != 0) {
            output.encodeIntElement(serialDesc, 1, self.timezoneOffset);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.phnPlanId != 0) {
            output.encodeLongElement(serialDesc, 2, self.phnPlanId);
        }
        output.encodeSerializableElement(serialDesc, 3, PHNDailyAnalysisResult$DailyAnaResultInfo$$serializer.INSTANCE, self.result);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTimezoneOffset() {
        return this.timezoneOffset;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getPhnPlanId() {
        return this.phnPlanId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DailyAnaResultInfo getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSynced() {
        return this.synced;
    }

    @NotNull
    public final PHNDailyAnalysisResult copy(long timestamp, int timezoneOffset, long phnPlanId, @NotNull DailyAnaResultInfo result, int synced) {
        return new PHNDailyAnalysisResult(timestamp, timezoneOffset, phnPlanId, result, synced);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PHNDailyAnalysisResult)) {
            return false;
        }
        PHNDailyAnalysisResult pHNDailyAnalysisResult = (PHNDailyAnalysisResult) other;
        return this.timestamp == pHNDailyAnalysisResult.timestamp && this.timezoneOffset == pHNDailyAnalysisResult.timezoneOffset && this.phnPlanId == pHNDailyAnalysisResult.phnPlanId && Intrinsics.areEqual(this.result, pHNDailyAnalysisResult.result) && this.synced == pHNDailyAnalysisResult.synced;
    }

    public final long getPhnPlanId() {
        return this.phnPlanId;
    }

    @NotNull
    public final DailyAnaResultInfo getResult() {
        return this.result;
    }

    public final int getSynced() {
        return this.synced;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final int getTimezoneOffset() {
        return this.timezoneOffset;
    }

    public int hashCode() {
        return (((((((b.a(this.timestamp) * 31) + this.timezoneOffset) * 31) + b.a(this.phnPlanId)) * 31) + this.result.hashCode()) * 31) + this.synced;
    }

    public final void setSynced(int i) {
        this.synced = i;
    }

    public final void stateChangeByApp() {
        this.synced = 0;
    }

    public final void stateChangeByServer() {
        this.synced = 1;
    }

    @NotNull
    public String toString() {
        return "PHNDailyAnalysisResult(timestamp=" + this.timestamp + ", timezoneOffset=" + this.timezoneOffset + ", phnPlanId=" + this.phnPlanId + ", result=" + this.result + ", synced=" + this.synced + ")";
    }

    public PHNDailyAnalysisResult(long j, int i, long j2, @NotNull DailyAnaResultInfo dailyAnaResultInfo, int i2) {
        this.timestamp = j;
        this.timezoneOffset = i;
        this.phnPlanId = j2;
        this.result = dailyAnaResultInfo;
        this.synced = i2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B/\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b+\u0010,BC\b\u0017\u0012\u0006\u0010-\u001a\u00020\t\u0012\b\b\u0001\u0010\u000f\u001a\u00020\t\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u000b\u0012\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b+\u00100J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\u000bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0016\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0010\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010\u001f\u001a\u0004\b\"\u0010#R\"\u0010\u0011\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010!\u0012\u0004\b'\u0010\u001f\u001a\u0004\b&\u0010#R\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010!\u0012\u0004\b*\u0010\u001f\u001a\u0004\b)\u0010#¨\u00063"}, d2 = {"Lcom/huami/phn/core/model/PHNDailyAnalysisResult$DailyAnaResultInfo;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "component3", "component4", "trimp", "atl", "ctl", "tsb", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getTrimp", "()I", "getTrimp$annotations", "()V", "b", "F", "getAtl", "()F", "getAtl$annotations", "c", "getCtl", "getCtl$annotations", GoogleApiAvailabilityLight.a, "getTsb", "getTsb$annotations", "<init>", "(IFFF)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIFFFLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    @Serializable
    public static final /* data */ class DailyAnaResultInfo {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final int trimp;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final float atl;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        private final float ctl;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        private final float tsb;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/phn/core/model/PHNDailyAnalysisResult$DailyAnaResultInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/phn/core/model/PHNDailyAnalysisResult$DailyAnaResultInfo;", "serializer", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer<DailyAnaResultInfo> serializer() {
                return PHNDailyAnalysisResult$DailyAnaResultInfo$$serializer.INSTANCE;
            }
        }

        public DailyAnaResultInfo() {
            this(0, 0.0f, 0.0f, 0.0f, 15, (DefaultConstructorMarker) null);
        }

        public DailyAnaResultInfo(int i, float f, float f2, float f3) {
            this.trimp = i;
            this.atl = f;
            this.ctl = f2;
            this.tsb = f3;
        }

        public static /* synthetic */ DailyAnaResultInfo copy$default(DailyAnaResultInfo dailyAnaResultInfo, int i, float f, float f2, float f3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = dailyAnaResultInfo.trimp;
            }
            if ((i2 & 2) != 0) {
                f = dailyAnaResultInfo.atl;
            }
            if ((i2 & 4) != 0) {
                f2 = dailyAnaResultInfo.ctl;
            }
            if ((i2 & 8) != 0) {
                f3 = dailyAnaResultInfo.tsb;
            }
            return dailyAnaResultInfo.copy(i, f, f2, f3);
        }

        @SerialName("atl")
        public static /* synthetic */ void getAtl$annotations() {
        }

        @SerialName("ctl")
        public static /* synthetic */ void getCtl$annotations() {
        }

        @SerialName("trimp")
        public static /* synthetic */ void getTrimp$annotations() {
        }

        @SerialName("tsb")
        public static /* synthetic */ void getTsb$annotations() {
        }

        @JvmStatic
        public static final void write$Self(@NotNull DailyAnaResultInfo self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.trimp != -10000) {
                output.encodeIntElement(serialDesc, 0, self.trimp);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual((Object) Float.valueOf(self.atl), (Object) Float.valueOf(-10000.0f))) {
                output.encodeFloatElement(serialDesc, 1, self.atl);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual((Object) Float.valueOf(self.ctl), (Object) Float.valueOf(-10000.0f))) {
                output.encodeFloatElement(serialDesc, 2, self.ctl);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual((Object) Float.valueOf(self.tsb), (Object) Float.valueOf(-10000.0f))) {
                output.encodeFloatElement(serialDesc, 3, self.tsb);
            }
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getTrimp() {
            return this.trimp;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getAtl() {
            return this.atl;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getCtl() {
            return this.ctl;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getTsb() {
            return this.tsb;
        }

        @NotNull
        public final DailyAnaResultInfo copy(int trimp, float atl, float ctl, float tsb) {
            return new DailyAnaResultInfo(trimp, atl, ctl, tsb);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DailyAnaResultInfo)) {
                return false;
            }
            DailyAnaResultInfo dailyAnaResultInfo = (DailyAnaResultInfo) other;
            return this.trimp == dailyAnaResultInfo.trimp && Intrinsics.areEqual((Object) Float.valueOf(this.atl), (Object) Float.valueOf(dailyAnaResultInfo.atl)) && Intrinsics.areEqual((Object) Float.valueOf(this.ctl), (Object) Float.valueOf(dailyAnaResultInfo.ctl)) && Intrinsics.areEqual((Object) Float.valueOf(this.tsb), (Object) Float.valueOf(dailyAnaResultInfo.tsb));
        }

        public final float getAtl() {
            return this.atl;
        }

        public final float getCtl() {
            return this.ctl;
        }

        public final int getTrimp() {
            return this.trimp;
        }

        public final float getTsb() {
            return this.tsb;
        }

        public int hashCode() {
            return (((((this.trimp * 31) + Float.floatToIntBits(this.atl)) * 31) + Float.floatToIntBits(this.ctl)) * 31) + Float.floatToIntBits(this.tsb);
        }

        @NotNull
        public String toString() {
            return "DailyAnaResultInfo(trimp=" + this.trimp + ", atl=" + this.atl + ", ctl=" + this.ctl + ", tsb=" + this.tsb + ")";
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ DailyAnaResultInfo(int i, @SerialName("trimp") int i2, @SerialName("atl") float f, @SerialName("ctl") float f2, @SerialName("tsb") float f3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 0) != 0) {
                PluginExceptionsKt.throwMissingFieldException(i, 0, PHNDailyAnalysisResult$DailyAnaResultInfo$$serializer.INSTANCE.getDescriptor());
            }
            this.trimp = (i & 1) == 0 ? -10000 : i2;
            if ((i & 2) == 0) {
                this.atl = -10000.0f;
            } else {
                this.atl = f;
            }
            if ((i & 4) == 0) {
                this.ctl = -10000.0f;
            } else {
                this.ctl = f2;
            }
            if ((i & 8) == 0) {
                this.tsb = -10000.0f;
            } else {
                this.tsb = f3;
            }
        }

        public /* synthetic */ DailyAnaResultInfo(int i, float f, float f2, float f3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? -10000 : i, (i2 & 2) != 0 ? -10000.0f : f, (i2 & 4) != 0 ? -10000.0f : f2, (i2 & 8) != 0 ? -10000.0f : f3);
        }
    }

    public /* synthetic */ PHNDailyAnalysisResult(long j, int i, long j2, DailyAnaResultInfo dailyAnaResultInfo, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0L : j2, dailyAnaResultInfo, (i3 & 16) != 0 ? 0 : i2);
    }
}
