package com.huami.femalehealth.logiclib.api.pojo;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.sleepassistant.apilib.utils.WebConst;
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
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Entity
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b>\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 Q2\u00020\u0001:\u0002RQBO\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u001e\u001a\u00020\r¢\u0006\u0004\bK\u0010LBs\b\u0017\u0012\u0006\u0010M\u001a\u00020\r\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u0018\u001a\u00020\r\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0001\u0010\u001e\u001a\u00020\r\u0012\b\u0010O\u001a\u0004\u0018\u00010N¢\u0006\u0004\bK\u0010PJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0006\u0010\n\u001a\u00020\tJ\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0013\u001a\u00020\u000fHÆ\u0003J\t\u0010\u0014\u001a\u00020\u000bHÆ\u0003J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\t\u0010\u0016\u001a\u00020\rHÆ\u0003Jd\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\u000f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u001e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\t\u0010!\u001a\u00020\u000bHÖ\u0001J\t\u0010\"\u001a\u00020\rHÖ\u0001J\u0013\u0010$\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b%\u0010&\u0012\u0004\b+\u0010,\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\u0018\u001a\u00020\r8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b1\u0010,\u001a\u0004\b/\u00100R(\u0010\u0019\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b2\u00103\u0012\u0004\b8\u0010,\u001a\u0004\b4\u00105\"\u0004\b6\u00107R*\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b9\u0010:\u0012\u0004\b>\u0010,\u001a\u0004\b;\u0010\u0012\"\u0004\b<\u0010=R\"\u0010\u001b\u001a\u00020\u000f8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u00103\u0012\u0004\bA\u0010,\u001a\u0004\b@\u00105R\"\u0010\u001c\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bB\u0010&\u0012\u0004\bD\u0010,\u001a\u0004\bC\u0010(R$\u0010\u001d\u001a\u0004\u0018\u00010\u000f8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bE\u0010:\u0012\u0004\bG\u0010,\u001a\u0004\bF\u0010\u0012R\"\u0010\u001e\u001a\u00020\r8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bH\u0010.\u0012\u0004\bJ\u0010,\u001a\u0004\bI\u00100¨\u0006S"}, d2 = {"Lcom/huami/femalehealth/logiclib/api/pojo/HistoryItemBean;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "isEnd", "", "component1", "", "component2", "", "component3", "component4", "()Ljava/lang/Long;", "component5", "component6", "component7", "component8", "id", "cycle", "menstrualPeriod", "menstrualEndTime", "month", "userId", EcgData.TIMESTAMP_SERVER_UPDATED, "end", "copy", "(Ljava/lang/String;IJLjava/lang/Long;JLjava/lang/String;Ljava/lang/Long;I)Lcom/huami/femalehealth/logiclib/api/pojo/HistoryItemBean;", "toString", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", WebConst.QueryParam.SET_ID, "(Ljava/lang/String;)V", "getId$annotations", "()V", "b", LogUtil.I, "getCycle", "()I", "getCycle$annotations", "c", "J", "getMenstrualPeriod", "()J", "setMenstrualPeriod", "(J)V", "getMenstrualPeriod$annotations", GoogleApiAvailabilityLight.a, "Ljava/lang/Long;", "getMenstrualEndTime", "setMenstrualEndTime", "(Ljava/lang/Long;)V", "getMenstrualEndTime$annotations", "e", "getMonth", "getMonth$annotations", "f", "getUserId", "getUserId$annotations", "g", "getUpdateTime", "getUpdateTime$annotations", "h", "getEnd", "getEnd$annotations", "<init>", "(Ljava/lang/String;IJLjava/lang/Long;JLjava/lang/String;Ljava/lang/Long;I)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;IJLjava/lang/Long;JLjava/lang/String;Ljava/lang/Long;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "logiclib_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class HistoryItemBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @PrimaryKey
    @NotNull
    private String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int cycle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private long menstrualPeriod;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private Long menstrualEndTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final long month;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long updateTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final int end;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/femalehealth/logiclib/api/pojo/HistoryItemBean$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/femalehealth/logiclib/api/pojo/HistoryItemBean;", "serializer", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<HistoryItemBean> serializer() {
            return HistoryItemBean$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ HistoryItemBean(int i, @SerialName("id") String str, @SerialName("cycle") int i2, @SerialName("menstrualPeriod") long j, @SerialName("menstrualEndTime") Long l, @SerialName("month") long j2, @SerialName("userId") String str2, @SerialName(EcgData.TIMESTAMP_SERVER_UPDATED) Long l2, @SerialName("end") int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (183 != (i & 183)) {
            PluginExceptionsKt.throwMissingFieldException(i, 183, HistoryItemBean$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.cycle = i2;
        this.menstrualPeriod = j;
        if ((i & 8) == 0) {
            this.menstrualEndTime = 0L;
        } else {
            this.menstrualEndTime = l;
        }
        this.month = j2;
        this.userId = str2;
        if ((i & 64) == 0) {
            this.updateTime = 0L;
        } else {
            this.updateTime = l2;
        }
        this.end = i3;
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
    public static final void write$Self(@NotNull HistoryItemBean self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        Long l;
        Long l2;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeIntElement(serialDesc, 1, self.cycle);
        output.encodeLongElement(serialDesc, 2, self.menstrualPeriod);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || (l = self.menstrualEndTime) == null || l.longValue() != 0) {
            output.encodeNullableSerializableElement(serialDesc, 3, LongSerializer.INSTANCE, self.menstrualEndTime);
        }
        output.encodeLongElement(serialDesc, 4, self.month);
        output.encodeStringElement(serialDesc, 5, self.userId);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || (l2 = self.updateTime) == null || l2.longValue() != 0) {
            output.encodeNullableSerializableElement(serialDesc, 6, LongSerializer.INSTANCE, self.updateTime);
        }
        output.encodeIntElement(serialDesc, 7, self.end);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCycle() {
        return this.cycle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getMenstrualPeriod() {
        return this.menstrualPeriod;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getMenstrualEndTime() {
        return this.menstrualEndTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getMonth() {
        return this.month;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    @NotNull
    public final HistoryItemBean copy(@NotNull String id, int cycle, long menstrualPeriod, @Nullable Long menstrualEndTime, long month, @NotNull String userId, @Nullable Long updateTime, int end) {
        return new HistoryItemBean(id, cycle, menstrualPeriod, menstrualEndTime, month, userId, updateTime, end);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryItemBean)) {
            return false;
        }
        HistoryItemBean historyItemBean = (HistoryItemBean) other;
        return Intrinsics.areEqual(this.id, historyItemBean.id) && this.cycle == historyItemBean.cycle && this.menstrualPeriod == historyItemBean.menstrualPeriod && Intrinsics.areEqual(this.menstrualEndTime, historyItemBean.menstrualEndTime) && this.month == historyItemBean.month && Intrinsics.areEqual(this.userId, historyItemBean.userId) && Intrinsics.areEqual(this.updateTime, historyItemBean.updateTime) && this.end == historyItemBean.end;
    }

    public final int getCycle() {
        return this.cycle;
    }

    public final int getEnd() {
        return this.end;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Long getMenstrualEndTime() {
        return this.menstrualEndTime;
    }

    public final long getMenstrualPeriod() {
        return this.menstrualPeriod;
    }

    public final long getMonth() {
        return this.month;
    }

    @Nullable
    public final Long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.cycle) * 31) + b.a(this.menstrualPeriod)) * 31;
        Long l = this.menstrualEndTime;
        int iHashCode2 = (((((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + b.a(this.month)) * 31) + this.userId.hashCode()) * 31;
        Long l2 = this.updateTime;
        return ((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31) + this.end;
    }

    public final boolean isEnd() {
        return this.end == 1;
    }

    public final void setId(@NotNull String str) {
        this.id = str;
    }

    public final void setMenstrualEndTime(@Nullable Long l) {
        this.menstrualEndTime = l;
    }

    public final void setMenstrualPeriod(long j) {
        this.menstrualPeriod = j;
    }

    @NotNull
    public String toString() {
        return "HistoryItemBean(id=" + this.id + ", cycle=" + this.cycle + ", menstrualPeriod=" + this.menstrualPeriod + ", menstrualEndTime=" + this.menstrualEndTime + ", month=" + this.month + ", userId=" + this.userId + ", updateTime=" + this.updateTime + ", end=" + this.end + ')';
    }

    public HistoryItemBean(@NotNull String str, int i, long j, @Nullable Long l, long j2, @NotNull String str2, @Nullable Long l2, int i2) {
        this.id = str;
        this.cycle = i;
        this.menstrualPeriod = j;
        this.menstrualEndTime = l;
        this.month = j2;
        this.userId = str2;
        this.updateTime = l2;
        this.end = i2;
    }

    public /* synthetic */ HistoryItemBean(String str, int i, long j, Long l, long j2, String str2, Long l2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, j, (i3 & 8) != 0 ? 0L : l, j2, str2, (i3 & 64) != 0 ? 0L : l2, i2);
    }
}
