package com.huami.femalehealth.logiclib.api.pojo;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.sleepassistant.apilib.utils.WebConst;
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
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 S2\u00020\u0001:\u0002TSBg\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\bM\u0010NB{\b\u0017\u0012\u0006\u0010O\u001a\u00020\t\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010Q\u001a\u0004\u0018\u00010P¢\u0006\u0004\bM\u0010RJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011Jp\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010 \u001a\u00020\rHÖ\u0001J\t\u0010!\u001a\u00020\tHÖ\u0001J\u0013\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003R*\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b%\u0010&\u0012\u0004\b*\u0010+\u001a\u0004\b'\u0010\u000b\"\u0004\b(\u0010)R*\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b,\u0010&\u0012\u0004\b/\u0010+\u001a\u0004\b-\u0010\u000b\"\u0004\b.\u0010)R*\u0010\u0018\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b0\u00101\u0012\u0004\b6\u0010+\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u0010\u0019\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b7\u00108\u0012\u0004\b<\u0010+\u001a\u0004\b9\u0010\u0011\"\u0004\b:\u0010;R*\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b=\u00108\u0012\u0004\b@\u0010+\u001a\u0004\b>\u0010\u0011\"\u0004\b?\u0010;R*\u0010\u001b\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bA\u00108\u0012\u0004\bD\u0010+\u001a\u0004\bB\u0010\u0011\"\u0004\bC\u0010;R*\u0010\u001c\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bE\u00101\u0012\u0004\bH\u0010+\u001a\u0004\bF\u00103\"\u0004\bG\u00105R*\u0010\u001d\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bI\u00108\u0012\u0004\bL\u0010+\u001a\u0004\bJ\u0010\u0011\"\u0004\bK\u0010;¨\u0006U"}, d2 = {"Lcom/huami/femalehealth/logiclib/api/pojo/MenstruationRecordBean;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "()Ljava/lang/Integer;", "component2", "", "component3", "", "component4", "()Ljava/lang/Long;", "component5", "component6", "component7", "component8", "cycle", "end", "id", "menstrualEndTime", "menstrualPeriod", "month", "userId", EcgData.TIMESTAMP_SERVER_UPDATED, "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)Lcom/huami/femalehealth/logiclib/api/pojo/MenstruationRecordBean;", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/Integer;", "getCycle", "setCycle", "(Ljava/lang/Integer;)V", "getCycle$annotations", "()V", "b", "getEnd", "setEnd", "getEnd$annotations", "c", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", WebConst.QueryParam.SET_ID, "(Ljava/lang/String;)V", "getId$annotations", GoogleApiAvailabilityLight.a, "Ljava/lang/Long;", "getMenstrualEndTime", "setMenstrualEndTime", "(Ljava/lang/Long;)V", "getMenstrualEndTime$annotations", "e", "getMenstrualPeriod", "setMenstrualPeriod", "getMenstrualPeriod$annotations", "f", "getMonth", "setMonth", "getMonth$annotations", "g", "getUserId", "setUserId", "getUserId$annotations", "h", "getUpdateTime", "setUpdateTime", "getUpdateTime$annotations", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "logiclib_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class MenstruationRecordBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer cycle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer end;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private String id;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private Long menstrualEndTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private Long menstrualPeriod;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private Long month;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private String userId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private Long updateTime;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¨\u0006\u000b"}, d2 = {"Lcom/huami/femalehealth/logiclib/api/pojo/MenstruationRecordBean$Companion;", "", "", "isEnd", "", "endInt", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/femalehealth/logiclib/api/pojo/MenstruationRecordBean;", "serializer", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int endInt(boolean isEnd) {
            return isEnd ? 1 : 0;
        }

        @NotNull
        public final KSerializer<MenstruationRecordBean> serializer() {
            return MenstruationRecordBean$$serializer.INSTANCE;
        }
    }

    public MenstruationRecordBean() {
        this((Integer) null, (Integer) null, (String) null, (Long) null, (Long) null, (Long) null, (String) null, (Long) null, 255, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ MenstruationRecordBean(int i, @SerialName("cycle") Integer num, @SerialName("end") Integer num2, @SerialName("id") String str, @SerialName("menstrualEndTime") Long l, @SerialName("menstrualPeriod") Long l2, @SerialName("month") Long l3, @SerialName("userId") String str2, @SerialName(EcgData.TIMESTAMP_SERVER_UPDATED) Long l4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, MenstruationRecordBean$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.cycle = null;
        } else {
            this.cycle = num;
        }
        if ((i & 2) == 0) {
            this.end = null;
        } else {
            this.end = num2;
        }
        if ((i & 4) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 8) == 0) {
            this.menstrualEndTime = null;
        } else {
            this.menstrualEndTime = l;
        }
        if ((i & 16) == 0) {
            this.menstrualPeriod = null;
        } else {
            this.menstrualPeriod = l2;
        }
        if ((i & 32) == 0) {
            this.month = null;
        } else {
            this.month = l3;
        }
        if ((i & 64) == 0) {
            this.userId = null;
        } else {
            this.userId = str2;
        }
        if ((i & 128) == 0) {
            this.updateTime = null;
        } else {
            this.updateTime = l4;
        }
    }

    @SerialName("cycle")
    public static /* synthetic */ void getCycle$annotations() {
    }

    @SerialName("end")
    public static /* synthetic */ void getEnd$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName("menstrualEndTime")
    public static /* synthetic */ void getMenstrualEndTime$annotations() {
    }

    @SerialName("menstrualPeriod")
    public static /* synthetic */ void getMenstrualPeriod$annotations() {
    }

    @SerialName("month")
    public static /* synthetic */ void getMonth$annotations() {
    }

    @SerialName(EcgData.TIMESTAMP_SERVER_UPDATED)
    public static /* synthetic */ void getUpdateTime$annotations() {
    }

    @SerialName("userId")
    public static /* synthetic */ void getUserId$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull MenstruationRecordBean self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.cycle != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.cycle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.end != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.end);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.id != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.menstrualEndTime != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, LongSerializer.INSTANCE, self.menstrualEndTime);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.menstrualPeriod != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, LongSerializer.INSTANCE, self.menstrualPeriod);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.month != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, LongSerializer.INSTANCE, self.month);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.userId != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.userId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.updateTime != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, LongSerializer.INSTANCE, self.updateTime);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getCycle() {
        return this.cycle;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getEnd() {
        return this.end;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getMenstrualEndTime() {
        return this.menstrualEndTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getMenstrualPeriod() {
        return this.menstrualPeriod;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getMonth() {
        return this.month;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    public final MenstruationRecordBean copy(@Nullable Integer cycle, @Nullable Integer end, @Nullable String id, @Nullable Long menstrualEndTime, @Nullable Long menstrualPeriod, @Nullable Long month, @Nullable String userId, @Nullable Long updateTime) {
        return new MenstruationRecordBean(cycle, end, id, menstrualEndTime, menstrualPeriod, month, userId, updateTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenstruationRecordBean)) {
            return false;
        }
        MenstruationRecordBean menstruationRecordBean = (MenstruationRecordBean) other;
        return Intrinsics.areEqual(this.cycle, menstruationRecordBean.cycle) && Intrinsics.areEqual(this.end, menstruationRecordBean.end) && Intrinsics.areEqual(this.id, menstruationRecordBean.id) && Intrinsics.areEqual(this.menstrualEndTime, menstruationRecordBean.menstrualEndTime) && Intrinsics.areEqual(this.menstrualPeriod, menstruationRecordBean.menstrualPeriod) && Intrinsics.areEqual(this.month, menstruationRecordBean.month) && Intrinsics.areEqual(this.userId, menstruationRecordBean.userId) && Intrinsics.areEqual(this.updateTime, menstruationRecordBean.updateTime);
    }

    @Nullable
    public final Integer getCycle() {
        return this.cycle;
    }

    @Nullable
    public final Integer getEnd() {
        return this.end;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Long getMenstrualEndTime() {
        return this.menstrualEndTime;
    }

    @Nullable
    public final Long getMenstrualPeriod() {
        return this.menstrualPeriod;
    }

    @Nullable
    public final Long getMonth() {
        return this.month;
    }

    @Nullable
    public final Long getUpdateTime() {
        return this.updateTime;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        Integer num = this.cycle;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.end;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.id;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.menstrualEndTime;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.menstrualPeriod;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.month;
        int iHashCode6 = (iHashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str2 = this.userId;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l4 = this.updateTime;
        return iHashCode7 + (l4 != null ? l4.hashCode() : 0);
    }

    public final void setCycle(@Nullable Integer num) {
        this.cycle = num;
    }

    public final void setEnd(@Nullable Integer num) {
        this.end = num;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setMenstrualEndTime(@Nullable Long l) {
        this.menstrualEndTime = l;
    }

    public final void setMenstrualPeriod(@Nullable Long l) {
        this.menstrualPeriod = l;
    }

    public final void setMonth(@Nullable Long l) {
        this.month = l;
    }

    public final void setUpdateTime(@Nullable Long l) {
        this.updateTime = l;
    }

    public final void setUserId(@Nullable String str) {
        this.userId = str;
    }

    @NotNull
    public String toString() {
        return "MenstruationRecordBean(cycle=" + this.cycle + ", end=" + this.end + ", id=" + ((Object) this.id) + ", menstrualEndTime=" + this.menstrualEndTime + ", menstrualPeriod=" + this.menstrualPeriod + ", month=" + this.month + ", userId=" + ((Object) this.userId) + ", updateTime=" + this.updateTime + ')';
    }

    public MenstruationRecordBean(@Nullable Integer num, @Nullable Integer num2, @Nullable String str, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable String str2, @Nullable Long l4) {
        this.cycle = num;
        this.end = num2;
        this.id = str;
        this.menstrualEndTime = l;
        this.menstrualPeriod = l2;
        this.month = l3;
        this.userId = str2;
        this.updateTime = l4;
    }

    public /* synthetic */ MenstruationRecordBean(Integer num, Integer num2, String str, Long l, Long l2, Long l3, String str2, Long l4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : l3, (i & 64) != 0 ? null : str2, (i & 128) == 0 ? l4 : null);
    }
}
