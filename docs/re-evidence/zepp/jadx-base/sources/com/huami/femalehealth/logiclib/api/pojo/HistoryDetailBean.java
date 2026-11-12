package com.huami.femalehealth.logiclib.api.pojo;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleepassistant.apilib.utils.WebConst;
import com.xiaomi.hm.health.Constant;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@B=\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b:\u0010;Ba\b\u0017\u0012\u0006\u0010<\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010>\u001a\u0004\u0018\u00010=¢\u0006\u0004\b:\u0010?J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010JR\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001b\u001a\u00020\tHÖ\u0001J\t\u0010\u001c\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b \u0010!\u0012\u0004\b&\u0010'\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u0014\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010'\u001a\u0004\b*\u0010+R\"\u0010\u0015\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010!\u0012\u0004\b/\u0010'\u001a\u0004\b.\u0010#R$\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b3\u0010'\u001a\u0004\b2\u0010\u0010R$\u0010\u0017\u001a\u0004\u0018\u00010\u000e8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u00101\u0012\u0004\b6\u0010'\u001a\u0004\b5\u0010\u0010R$\u0010\u0018\u001a\u0004\u0018\u00010\u000e8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u00101\u0012\u0004\b9\u0010'\u001a\u0004\b8\u0010\u0010¨\u0006B"}, d2 = {"Lcom/huami/femalehealth/logiclib/api/pojo/HistoryDetailBean;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "component3", "", "component4", "()Ljava/lang/Integer;", "component5", "component6", "id", "menstruationTime", "menstruationManagementId", "blood", "mood", "pain", "copy", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/huami/femalehealth/logiclib/api/pojo/HistoryDetailBean;", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", WebConst.QueryParam.SET_ID, "(Ljava/lang/String;)V", "getId$annotations", "()V", "b", "J", "getMenstruationTime", "()J", "getMenstruationTime$annotations", "c", "getMenstruationManagementId", "getMenstruationManagementId$annotations", GoogleApiAvailabilityLight.a, "Ljava/lang/Integer;", "getBlood", "getBlood$annotations", "e", "getMood", "getMood$annotations", "f", "getPain", "getPain$annotations", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "logiclib_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class HistoryDetailBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long menstruationTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String menstruationManagementId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer blood;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer mood;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer pain;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/femalehealth/logiclib/api/pojo/HistoryDetailBean$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/femalehealth/logiclib/api/pojo/HistoryDetailBean;", "serializer", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<HistoryDetailBean> serializer() {
            return HistoryDetailBean$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ HistoryDetailBean(int i, @SerialName("id") String str, @SerialName("menstruationTime") long j, @SerialName("menstruationManagementId") String str2, @SerialName(Constant.PAI_KEY_HIGH_ZONE_PAI) Integer num, @SerialName("mood") Integer num2, @SerialName("pain") Integer num3, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, HistoryDetailBean$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.menstruationTime = j;
        this.menstruationManagementId = str2;
        this.blood = num;
        this.mood = num2;
        this.pain = num3;
    }

    public static /* synthetic */ HistoryDetailBean copy$default(HistoryDetailBean historyDetailBean, String str, long j, String str2, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = historyDetailBean.id;
        }
        if ((i & 2) != 0) {
            j = historyDetailBean.menstruationTime;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str2 = historyDetailBean.menstruationManagementId;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            num = historyDetailBean.blood;
        }
        Integer num4 = num;
        if ((i & 16) != 0) {
            num2 = historyDetailBean.mood;
        }
        Integer num5 = num2;
        if ((i & 32) != 0) {
            num3 = historyDetailBean.pain;
        }
        return historyDetailBean.copy(str, j2, str3, num4, num5, num3);
    }

    @SerialName(Constant.PAI_KEY_HIGH_ZONE_PAI)
    public static /* synthetic */ void getBlood$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName("menstruationManagementId")
    public static /* synthetic */ void getMenstruationManagementId$annotations() {
    }

    @SerialName("menstruationTime")
    public static /* synthetic */ void getMenstruationTime$annotations() {
    }

    @SerialName("mood")
    public static /* synthetic */ void getMood$annotations() {
    }

    @SerialName("pain")
    public static /* synthetic */ void getPain$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull HistoryDetailBean self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeLongElement(serialDesc, 1, self.menstruationTime);
        output.encodeStringElement(serialDesc, 2, self.menstruationManagementId);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 3, intSerializer, self.blood);
        output.encodeNullableSerializableElement(serialDesc, 4, intSerializer, self.mood);
        output.encodeNullableSerializableElement(serialDesc, 5, intSerializer, self.pain);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getMenstruationTime() {
        return this.menstruationTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMenstruationManagementId() {
        return this.menstruationManagementId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getBlood() {
        return this.blood;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getMood() {
        return this.mood;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getPain() {
        return this.pain;
    }

    @NotNull
    public final HistoryDetailBean copy(@NotNull String id, long menstruationTime, @NotNull String menstruationManagementId, @Nullable Integer blood, @Nullable Integer mood, @Nullable Integer pain) {
        return new HistoryDetailBean(id, menstruationTime, menstruationManagementId, blood, mood, pain);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryDetailBean)) {
            return false;
        }
        HistoryDetailBean historyDetailBean = (HistoryDetailBean) other;
        return Intrinsics.areEqual(this.id, historyDetailBean.id) && this.menstruationTime == historyDetailBean.menstruationTime && Intrinsics.areEqual(this.menstruationManagementId, historyDetailBean.menstruationManagementId) && Intrinsics.areEqual(this.blood, historyDetailBean.blood) && Intrinsics.areEqual(this.mood, historyDetailBean.mood) && Intrinsics.areEqual(this.pain, historyDetailBean.pain);
    }

    @Nullable
    public final Integer getBlood() {
        return this.blood;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getMenstruationManagementId() {
        return this.menstruationManagementId;
    }

    public final long getMenstruationTime() {
        return this.menstruationTime;
    }

    @Nullable
    public final Integer getMood() {
        return this.mood;
    }

    @Nullable
    public final Integer getPain() {
        return this.pain;
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + b.a(this.menstruationTime)) * 31) + this.menstruationManagementId.hashCode()) * 31;
        Integer num = this.blood;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.mood;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.pain;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final void setId(@NotNull String str) {
        this.id = str;
    }

    @NotNull
    public String toString() {
        return "HistoryDetailBean(id=" + this.id + ", menstruationTime=" + this.menstruationTime + ", menstruationManagementId=" + this.menstruationManagementId + ", blood=" + this.blood + ", mood=" + this.mood + ", pain=" + this.pain + ')';
    }

    public HistoryDetailBean(@NotNull String str, long j, @NotNull String str2, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        this.id = str;
        this.menstruationTime = j;
        this.menstruationManagementId = str2;
        this.blood = num;
        this.mood = num2;
        this.pain = num3;
    }
}
