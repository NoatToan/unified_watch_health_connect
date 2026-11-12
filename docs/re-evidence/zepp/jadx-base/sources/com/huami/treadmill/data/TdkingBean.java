package com.huami.treadmill.data;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import defpackage.b;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Entity(tableName = "king_rank")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=BQ\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b7\u00108BY\b\u0017\u0012\u0006\u00109\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u000e\u0012\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b7\u0010<J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\u0011\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0012\u001a\u00020\u000eHÆ\u0003JS\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0003\u0010\u0014\u001a\u00020\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u000eHÆ\u0001J\t\u0010\u001b\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0014\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010%\u001a\u0004\b*\u0010'\"\u0004\b+\u0010)R\"\u0010\u0016\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010%\u001a\u0004\b1\u0010'\"\u0004\b2\u0010)R\"\u0010\u0018\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010,\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R\"\u0010\u0019\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010,\u001a\u0004\b5\u0010.\"\u0004\b6\u00100¨\u0006?"}, d2 = {"Lcom/huami/treadmill/data/TdkingBean;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "component3", "", "component4", "component5", "component6", "component7", "index", "userId", "nickName", "value", "icon", "startDay", "continueDays", "copy", "toString", "hashCode", "other", "", "equals", LogUtil.I, "getIndex", "()I", "setIndex", "(I)V", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "getNickName", "setNickName", "J", "getValue", "()J", "setValue", "(J)V", "getIcon", "setIcon", "getStartDay", "setStartDay", "getContinueDays", "setContinueDays", "<init>", "(ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;JJ)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "treadmill_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class TdkingBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("continueDays")
    private long continueDays;

    @SerializedName("icon")
    @Nullable
    private String icon;
    private int index;

    @SerializedName("nickName")
    @Nullable
    private String nickName;

    @SerializedName("startDay")
    @PrimaryKey(autoGenerate = false)
    private long startDay;

    @SerializedName("userId")
    @NotNull
    private String userId;

    @SerializedName("value")
    private long value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/treadmill/data/TdkingBean$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/treadmill/data/TdkingBean;", "serializer", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<TdkingBean> serializer() {
            return TdkingBean$$serializer.INSTANCE;
        }
    }

    public TdkingBean() {
        this(0, (String) null, (String) null, 0L, (String) null, 0L, 0L, 127, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ TdkingBean(int i, int i2, String str, String str2, long j, String str3, long j2, long j3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, TdkingBean$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.index = 0;
        } else {
            this.index = i2;
        }
        if ((i & 2) == 0) {
            this.userId = "";
        } else {
            this.userId = str;
        }
        if ((i & 4) == 0) {
            this.nickName = null;
        } else {
            this.nickName = str2;
        }
        if ((i & 8) == 0) {
            this.value = 0L;
        } else {
            this.value = j;
        }
        if ((i & 16) == 0) {
            this.icon = null;
        } else {
            this.icon = str3;
        }
        if ((i & 32) == 0) {
            this.startDay = 0L;
        } else {
            this.startDay = j2;
        }
        if ((i & 64) == 0) {
            this.continueDays = 0L;
        } else {
            this.continueDays = j3;
        }
    }

    @JvmStatic
    public static final void write$Self(@NotNull TdkingBean self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.index != 0) {
            output.encodeIntElement(serialDesc, 0, self.index);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.userId, "")) {
            output.encodeStringElement(serialDesc, 1, self.userId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.nickName != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.nickName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.value != 0) {
            output.encodeLongElement(serialDesc, 3, self.value);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.icon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.startDay != 0) {
            output.encodeLongElement(serialDesc, 5, self.startDay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.continueDays != 0) {
            output.encodeLongElement(serialDesc, 6, self.continueDays);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getStartDay() {
        return this.startDay;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getContinueDays() {
        return this.continueDays;
    }

    @NotNull
    public final TdkingBean copy(int index, @NonNull @NotNull String userId, @Nullable String nickName, long value, @Nullable String icon, long startDay, long continueDays) {
        return new TdkingBean(index, userId, nickName, value, icon, startDay, continueDays);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TdkingBean)) {
            return false;
        }
        TdkingBean tdkingBean = (TdkingBean) other;
        return this.index == tdkingBean.index && Intrinsics.areEqual(this.userId, tdkingBean.userId) && Intrinsics.areEqual(this.nickName, tdkingBean.nickName) && this.value == tdkingBean.value && Intrinsics.areEqual(this.icon, tdkingBean.icon) && this.startDay == tdkingBean.startDay && this.continueDays == tdkingBean.continueDays;
    }

    public final long getContinueDays() {
        return this.continueDays;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    public final int getIndex() {
        return this.index;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    public final long getStartDay() {
        return this.startDay;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = ((this.index * 31) + this.userId.hashCode()) * 31;
        String str = this.nickName;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + b.a(this.value)) * 31;
        String str2 = this.icon;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + b.a(this.startDay)) * 31) + b.a(this.continueDays);
    }

    public final void setContinueDays(long j) {
        this.continueDays = j;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setNickName(@Nullable String str) {
        this.nickName = str;
    }

    public final void setStartDay(long j) {
        this.startDay = j;
    }

    public final void setUserId(@NotNull String str) {
        this.userId = str;
    }

    public final void setValue(long j) {
        this.value = j;
    }

    @NotNull
    public String toString() {
        return "TdkingBean(index=" + this.index + ", userId=" + this.userId + ", nickName=" + ((Object) this.nickName) + ", value=" + this.value + ", icon=" + ((Object) this.icon) + ", startDay=" + this.startDay + ", continueDays=" + this.continueDays + ')';
    }

    public TdkingBean(int i, @NonNull @NotNull String str, @Nullable String str2, long j, @Nullable String str3, long j2, long j3) {
        this.index = i;
        this.userId = str;
        this.nickName = str2;
        this.value = j;
        this.icon = str3;
        this.startDay = j2;
        this.continueDays = j3;
    }

    public /* synthetic */ TdkingBean(int i, String str, String str2, long j, String str3, long j2, long j3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? 0L : j, (i2 & 16) == 0 ? str3 : null, (i2 & 32) != 0 ? 0L : j2, (i2 & 64) == 0 ? j3 : 0L);
    }
}
