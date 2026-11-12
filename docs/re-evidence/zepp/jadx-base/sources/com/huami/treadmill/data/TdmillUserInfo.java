package com.huami.treadmill.data;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.fitness.data.Field;
import com.google.gson.annotations.SerializedName;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B9\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b*\u0010+BC\b\u0017\u0012\u0006\u0010,\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b*\u0010/J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u000eHÆ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0018\u001a\u00020\tHÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0011\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\"\u0010\u0012\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001b\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010&\u001a\u0004\b\u0014\u0010'\"\u0004\b(\u0010)¨\u00062"}, d2 = {"Lcom/huami/treadmill/data/TdmillUserInfo;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "component3", "component4", "", "component5", "cum_number", Field.NUTRIENT_CALORIES, "total_dis", "not_upload", "isBinding", "copy", "", "toString", "hashCode", "other", "equals", LogUtil.I, "getCum_number", "()I", "setCum_number", "(I)V", "getCalories", "setCalories", "getTotal_dis", "setTotal_dis", "getNot_upload", "setNot_upload", "Z", "()Z", "setBinding", "(Z)V", "<init>", "(IIIIZ)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIIIIZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "treadmill_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class TdmillUserInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName(Field.NUTRIENT_CALORIES)
    private int calories;

    @SerializedName("cum_number")
    private int cum_number;

    @SerializedName("isBinding")
    private boolean isBinding;

    @SerializedName("not_upload")
    private int not_upload;

    @SerializedName("total_dis")
    private int total_dis;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/treadmill/data/TdmillUserInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/treadmill/data/TdmillUserInfo;", "serializer", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<TdmillUserInfo> serializer() {
            return TdmillUserInfo$$serializer.INSTANCE;
        }
    }

    public TdmillUserInfo() {
        this(0, 0, 0, 0, false, 31, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ TdmillUserInfo(int i, int i2, int i3, int i4, int i5, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, TdmillUserInfo$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.cum_number = 0;
        } else {
            this.cum_number = i2;
        }
        if ((i & 2) == 0) {
            this.calories = 0;
        } else {
            this.calories = i3;
        }
        if ((i & 4) == 0) {
            this.total_dis = 0;
        } else {
            this.total_dis = i4;
        }
        if ((i & 8) == 0) {
            this.not_upload = 0;
        } else {
            this.not_upload = i5;
        }
        if ((i & 16) == 0) {
            this.isBinding = false;
        } else {
            this.isBinding = z;
        }
    }

    public static /* synthetic */ TdmillUserInfo copy$default(TdmillUserInfo tdmillUserInfo, int i, int i2, int i3, int i4, boolean z, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = tdmillUserInfo.cum_number;
        }
        if ((i5 & 2) != 0) {
            i2 = tdmillUserInfo.calories;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = tdmillUserInfo.total_dis;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = tdmillUserInfo.not_upload;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            z = tdmillUserInfo.isBinding;
        }
        return tdmillUserInfo.copy(i, i6, i7, i8, z);
    }

    @JvmStatic
    public static final void write$Self(@NotNull TdmillUserInfo self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.cum_number != 0) {
            output.encodeIntElement(serialDesc, 0, self.cum_number);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.calories != 0) {
            output.encodeIntElement(serialDesc, 1, self.calories);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.total_dis != 0) {
            output.encodeIntElement(serialDesc, 2, self.total_dis);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.not_upload != 0) {
            output.encodeIntElement(serialDesc, 3, self.not_upload);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.isBinding) {
            output.encodeBooleanElement(serialDesc, 4, self.isBinding);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCum_number() {
        return this.cum_number;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCalories() {
        return this.calories;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTotal_dis() {
        return this.total_dis;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getNot_upload() {
        return this.not_upload;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsBinding() {
        return this.isBinding;
    }

    @NotNull
    public final TdmillUserInfo copy(int cum_number, int calories, int total_dis, int not_upload, boolean isBinding) {
        return new TdmillUserInfo(cum_number, calories, total_dis, not_upload, isBinding);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TdmillUserInfo)) {
            return false;
        }
        TdmillUserInfo tdmillUserInfo = (TdmillUserInfo) other;
        return this.cum_number == tdmillUserInfo.cum_number && this.calories == tdmillUserInfo.calories && this.total_dis == tdmillUserInfo.total_dis && this.not_upload == tdmillUserInfo.not_upload && this.isBinding == tdmillUserInfo.isBinding;
    }

    public final int getCalories() {
        return this.calories;
    }

    public final int getCum_number() {
        return this.cum_number;
    }

    public final int getNot_upload() {
        return this.not_upload;
    }

    public final int getTotal_dis() {
        return this.total_dis;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        int i = ((((((this.cum_number * 31) + this.calories) * 31) + this.total_dis) * 31) + this.not_upload) * 31;
        boolean z = this.isBinding;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return i + r1;
    }

    public final boolean isBinding() {
        return this.isBinding;
    }

    public final void setBinding(boolean z) {
        this.isBinding = z;
    }

    public final void setCalories(int i) {
        this.calories = i;
    }

    public final void setCum_number(int i) {
        this.cum_number = i;
    }

    public final void setNot_upload(int i) {
        this.not_upload = i;
    }

    public final void setTotal_dis(int i) {
        this.total_dis = i;
    }

    @NotNull
    public String toString() {
        return "TdmillUserInfo(cum_number=" + this.cum_number + ", calories=" + this.calories + ", total_dis=" + this.total_dis + ", not_upload=" + this.not_upload + ", isBinding=" + this.isBinding + ')';
    }

    public TdmillUserInfo(int i, int i2, int i3, int i4, boolean z) {
        this.cum_number = i;
        this.calories = i2;
        this.total_dis = i3;
        this.not_upload = i4;
        this.isBinding = z;
    }

    public /* synthetic */ TdmillUserInfo(int i, int i2, int i3, int i4, boolean z, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4, (i5 & 16) != 0 ? false : z);
    }
}
