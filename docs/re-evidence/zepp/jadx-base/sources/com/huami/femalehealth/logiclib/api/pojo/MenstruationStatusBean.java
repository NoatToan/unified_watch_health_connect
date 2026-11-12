package com.huami.femalehealth.logiclib.api.pojo;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleepassistant.apilib.utils.WebConst;
import com.xiaomi.hm.health.Constant;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGBO\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\bA\u0010BBc\b\u0017\u0012\u0006\u0010C\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010E\u001a\u0004\u0018\u00010D¢\u0006\u0004\bA\u0010FJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011JX\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\u000fHÖ\u0001J\u0013\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R*\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b!\u0010\"\u0012\u0004\b'\u0010(\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b)\u0010\"\u0012\u0004\b,\u0010(\u001a\u0004\b*\u0010$\"\u0004\b+\u0010&R*\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b-\u0010.\u0012\u0004\b2\u0010(\u001a\u0004\b/\u0010\u000e\"\u0004\b0\u00101R*\u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b3\u00104\u0012\u0004\b8\u0010(\u001a\u0004\b5\u0010\u0011\"\u0004\b6\u00107R*\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b9\u00104\u0012\u0004\b<\u0010(\u001a\u0004\b:\u0010\u0011\"\u0004\b;\u00107R*\u0010\u0019\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b=\u00104\u0012\u0004\b@\u0010(\u001a\u0004\b>\u0010\u0011\"\u0004\b?\u00107¨\u0006I"}, d2 = {"Lcom/huami/femalehealth/logiclib/api/pojo/MenstruationStatusBean;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "", "component3", "()Ljava/lang/Long;", "", "component4", "()Ljava/lang/Integer;", "component5", "component6", "id", "menstruationManagementId", "menstruationTime", Constant.PAI_KEY_HIGH_ZONE_PAI, "mood", "pain", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/huami/femalehealth/logiclib/api/pojo/MenstruationStatusBean;", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", WebConst.QueryParam.SET_ID, "(Ljava/lang/String;)V", "getId$annotations", "()V", "b", "getMenstruationManagementId", "setMenstruationManagementId", "getMenstruationManagementId$annotations", "c", "Ljava/lang/Long;", "getMenstruationTime", "setMenstruationTime", "(Ljava/lang/Long;)V", "getMenstruationTime$annotations", GoogleApiAvailabilityLight.a, "Ljava/lang/Integer;", "getHp", "setHp", "(Ljava/lang/Integer;)V", "getHp$annotations", "e", "getMood", "setMood", "getMood$annotations", "f", "getPain", "setPain", "getPain$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "logiclib_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class MenstruationStatusBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private String menstruationManagementId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private Long menstruationTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer hp;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer mood;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer pain;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/femalehealth/logiclib/api/pojo/MenstruationStatusBean$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/femalehealth/logiclib/api/pojo/MenstruationStatusBean;", "serializer", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<MenstruationStatusBean> serializer() {
            return MenstruationStatusBean$$serializer.INSTANCE;
        }
    }

    public MenstruationStatusBean() {
        this((String) null, (String) null, (Long) null, (Integer) null, (Integer) null, (Integer) null, 63, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ MenstruationStatusBean(int i, @SerialName("id") String str, @SerialName("menstruationManagementId") String str2, @SerialName("menstruationTime") Long l, @SerialName(Constant.PAI_KEY_HIGH_ZONE_PAI) Integer num, @SerialName("mood") Integer num2, @SerialName("pain") Integer num3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, MenstruationStatusBean$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.menstruationManagementId = null;
        } else {
            this.menstruationManagementId = str2;
        }
        if ((i & 4) == 0) {
            this.menstruationTime = null;
        } else {
            this.menstruationTime = l;
        }
        if ((i & 8) == 0) {
            this.hp = null;
        } else {
            this.hp = num;
        }
        if ((i & 16) == 0) {
            this.mood = null;
        } else {
            this.mood = num2;
        }
        if ((i & 32) == 0) {
            this.pain = null;
        } else {
            this.pain = num3;
        }
    }

    public static /* synthetic */ MenstruationStatusBean copy$default(MenstruationStatusBean menstruationStatusBean, String str, String str2, Long l, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = menstruationStatusBean.id;
        }
        if ((i & 2) != 0) {
            str2 = menstruationStatusBean.menstruationManagementId;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            l = menstruationStatusBean.menstruationTime;
        }
        Long l2 = l;
        if ((i & 8) != 0) {
            num = menstruationStatusBean.hp;
        }
        Integer num4 = num;
        if ((i & 16) != 0) {
            num2 = menstruationStatusBean.mood;
        }
        Integer num5 = num2;
        if ((i & 32) != 0) {
            num3 = menstruationStatusBean.pain;
        }
        return menstruationStatusBean.copy(str, str3, l2, num4, num5, num3);
    }

    @SerialName(Constant.PAI_KEY_HIGH_ZONE_PAI)
    public static /* synthetic */ void getHp$annotations() {
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
    public static final void write$Self(@NotNull MenstruationStatusBean self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.id != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.menstruationManagementId != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.menstruationManagementId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.menstruationTime != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.menstruationTime);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.hp != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, IntSerializer.INSTANCE, self.hp);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.mood != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, IntSerializer.INSTANCE, self.mood);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.pain != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, IntSerializer.INSTANCE, self.pain);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMenstruationManagementId() {
        return this.menstruationManagementId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getMenstruationTime() {
        return this.menstruationTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getHp() {
        return this.hp;
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
    public final MenstruationStatusBean copy(@Nullable String id, @Nullable String menstruationManagementId, @Nullable Long menstruationTime, @Nullable Integer hp, @Nullable Integer mood, @Nullable Integer pain) {
        return new MenstruationStatusBean(id, menstruationManagementId, menstruationTime, hp, mood, pain);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenstruationStatusBean)) {
            return false;
        }
        MenstruationStatusBean menstruationStatusBean = (MenstruationStatusBean) other;
        return Intrinsics.areEqual(this.id, menstruationStatusBean.id) && Intrinsics.areEqual(this.menstruationManagementId, menstruationStatusBean.menstruationManagementId) && Intrinsics.areEqual(this.menstruationTime, menstruationStatusBean.menstruationTime) && Intrinsics.areEqual(this.hp, menstruationStatusBean.hp) && Intrinsics.areEqual(this.mood, menstruationStatusBean.mood) && Intrinsics.areEqual(this.pain, menstruationStatusBean.pain);
    }

    @Nullable
    public final Integer getHp() {
        return this.hp;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getMenstruationManagementId() {
        return this.menstruationManagementId;
    }

    @Nullable
    public final Long getMenstruationTime() {
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
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.menstruationManagementId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.menstruationTime;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.hp;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.mood;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.pain;
        return iHashCode5 + (num3 != null ? num3.hashCode() : 0);
    }

    public final void setHp(@Nullable Integer num) {
        this.hp = num;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setMenstruationManagementId(@Nullable String str) {
        this.menstruationManagementId = str;
    }

    public final void setMenstruationTime(@Nullable Long l) {
        this.menstruationTime = l;
    }

    public final void setMood(@Nullable Integer num) {
        this.mood = num;
    }

    public final void setPain(@Nullable Integer num) {
        this.pain = num;
    }

    @NotNull
    public String toString() {
        return "MenstruationStatusBean(id=" + ((Object) this.id) + ", menstruationManagementId=" + ((Object) this.menstruationManagementId) + ", menstruationTime=" + this.menstruationTime + ", hp=" + this.hp + ", mood=" + this.mood + ", pain=" + this.pain + ')';
    }

    public MenstruationStatusBean(@Nullable String str, @Nullable String str2, @Nullable Long l, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        this.id = str;
        this.menstruationManagementId = str2;
        this.menstruationTime = l;
        this.hp = num;
        this.mood = num2;
        this.pain = num3;
    }

    public /* synthetic */ MenstruationStatusBean(String str, String str2, Long l, Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : num3);
    }
}
