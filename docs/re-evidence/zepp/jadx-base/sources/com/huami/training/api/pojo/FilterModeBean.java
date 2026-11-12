package com.huami.training.api.pojo;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.List;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B5\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\r¢\u0006\u0004\b+\u0010,BQ\b\u0017\u0012\u0006\u0010-\u001a\u00020\u0015\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\r\u0012\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b+\u00100J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\rHÆ\u0003J;\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\rHÆ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u001b\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u001dR$\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001b\u0012\u0004\b%\u0010\u001f\u001a\u0004\b$\u0010\u001dR*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\r8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010\u001f\u001a\u0004\b(\u0010)¨\u00063"}, d2 = {"Lcom/huami/training/api/pojo/FilterModeBean;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "component3", "", "component4", "text", "jumpType", "defaultOrder", "supportOrders", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "getText$annotations", "()V", "b", "getJumpType", "getJumpType$annotations", "c", "getDefaultOrder", "getDefaultOrder$annotations", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "getSupportOrders", "()Ljava/util/List;", "getSupportOrders$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "lib_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class FilterModeBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String jumpType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String defaultOrder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final List<String> supportOrders;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/training/api/pojo/FilterModeBean$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/training/api/pojo/FilterModeBean;", "serializer", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<FilterModeBean> serializer() {
            return FilterModeBean$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ FilterModeBean(int i, @SerialName("text") String str, @SerialName("jumpType") String str2, @SerialName("defaultOrder") String str3, @SerialName("supportOrders") List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, FilterModeBean$$serializer.INSTANCE.getDescriptor());
        }
        this.text = str;
        this.jumpType = str2;
        if ((i & 4) == 0) {
            this.defaultOrder = null;
        } else {
            this.defaultOrder = str3;
        }
        if ((i & 8) == 0) {
            this.supportOrders = null;
        } else {
            this.supportOrders = list;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FilterModeBean copy$default(FilterModeBean filterModeBean, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = filterModeBean.text;
        }
        if ((i & 2) != 0) {
            str2 = filterModeBean.jumpType;
        }
        if ((i & 4) != 0) {
            str3 = filterModeBean.defaultOrder;
        }
        if ((i & 8) != 0) {
            list = filterModeBean.supportOrders;
        }
        return filterModeBean.copy(str, str2, str3, list);
    }

    @SerialName("defaultOrder")
    public static /* synthetic */ void getDefaultOrder$annotations() {
    }

    @SerialName("jumpType")
    public static /* synthetic */ void getJumpType$annotations() {
    }

    @SerialName("supportOrders")
    public static /* synthetic */ void getSupportOrders$annotations() {
    }

    @SerialName("text")
    public static /* synthetic */ void getText$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull FilterModeBean self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.text);
        output.encodeStringElement(serialDesc, 1, self.jumpType);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.defaultOrder != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.defaultOrder);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.supportOrders != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, new ArrayListSerializer(StringSerializer.INSTANCE), self.supportOrders);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getJumpType() {
        return this.jumpType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDefaultOrder() {
        return this.defaultOrder;
    }

    @Nullable
    public final List<String> component4() {
        return this.supportOrders;
    }

    @NotNull
    public final FilterModeBean copy(@NotNull String text, @NotNull String jumpType, @Nullable String defaultOrder, @Nullable List<String> supportOrders) {
        return new FilterModeBean(text, jumpType, defaultOrder, supportOrders);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterModeBean)) {
            return false;
        }
        FilterModeBean filterModeBean = (FilterModeBean) other;
        return Intrinsics.areEqual(this.text, filterModeBean.text) && Intrinsics.areEqual(this.jumpType, filterModeBean.jumpType) && Intrinsics.areEqual(this.defaultOrder, filterModeBean.defaultOrder) && Intrinsics.areEqual(this.supportOrders, filterModeBean.supportOrders);
    }

    @Nullable
    public final String getDefaultOrder() {
        return this.defaultOrder;
    }

    @NotNull
    public final String getJumpType() {
        return this.jumpType;
    }

    @Nullable
    public final List<String> getSupportOrders() {
        return this.supportOrders;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = ((this.text.hashCode() * 31) + this.jumpType.hashCode()) * 31;
        String str = this.defaultOrder;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.supportOrders;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FilterModeBean(text=" + this.text + ", jumpType=" + this.jumpType + ", defaultOrder=" + ((Object) this.defaultOrder) + ", supportOrders=" + this.supportOrders + ')';
    }

    public FilterModeBean(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable List<String> list) {
        this.text = str;
        this.jumpType = str2;
        this.defaultOrder = str3;
        this.supportOrders = list;
    }

    public /* synthetic */ FilterModeBean(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list);
    }
}
