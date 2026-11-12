package com.huami.training.api.pojo;

import com.huami.training.api.WebConst;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B+\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b \u0010!B?\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u0012\u0012\u0010\b\u0001\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0001\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001e\u0010\u001a¨\u0006("}, d2 = {"Lcom/huami/training/api/pojo/CardBean;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "Lcom/huami/training/api/pojo/EntranceCardBean;", "component1", "component2", "banner", "subject", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getBanner", "()Ljava/util/List;", "getBanner$annotations", "()V", "b", "getSubject", "getSubject$annotations", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "lib_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class CardBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final List<EntranceCardBean> banner;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final List<EntranceCardBean> subject;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/training/api/pojo/CardBean$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/training/api/pojo/CardBean;", "serializer", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<CardBean> serializer() {
            return CardBean$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CardBean() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ CardBean(int i, @SerialName(WebConst.Value.CARD_TYPE.CAROUSEL) List list, @SerialName(WebConst.Value.CARD_TYPE.SUBJECT) List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, CardBean$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.banner = null;
        } else {
            this.banner = list;
        }
        if ((i & 2) == 0) {
            this.subject = null;
        } else {
            this.subject = list2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardBean copy$default(CardBean cardBean, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cardBean.banner;
        }
        if ((i & 2) != 0) {
            list2 = cardBean.subject;
        }
        return cardBean.copy(list, list2);
    }

    @SerialName(WebConst.Value.CARD_TYPE.CAROUSEL)
    public static /* synthetic */ void getBanner$annotations() {
    }

    @SerialName(WebConst.Value.CARD_TYPE.SUBJECT)
    public static /* synthetic */ void getSubject$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull CardBean self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.banner != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, new ArrayListSerializer(EntranceCardBean$$serializer.INSTANCE), self.banner);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.subject != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, new ArrayListSerializer(EntranceCardBean$$serializer.INSTANCE), self.subject);
        }
    }

    @Nullable
    public final List<EntranceCardBean> component1() {
        return this.banner;
    }

    @Nullable
    public final List<EntranceCardBean> component2() {
        return this.subject;
    }

    @NotNull
    public final CardBean copy(@Nullable List<EntranceCardBean> banner, @Nullable List<EntranceCardBean> subject) {
        return new CardBean(banner, subject);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardBean)) {
            return false;
        }
        CardBean cardBean = (CardBean) other;
        return Intrinsics.areEqual(this.banner, cardBean.banner) && Intrinsics.areEqual(this.subject, cardBean.subject);
    }

    @Nullable
    public final List<EntranceCardBean> getBanner() {
        return this.banner;
    }

    @Nullable
    public final List<EntranceCardBean> getSubject() {
        return this.subject;
    }

    public int hashCode() {
        List<EntranceCardBean> list = this.banner;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<EntranceCardBean> list2 = this.subject;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CardBean(banner=" + this.banner + ", subject=" + this.subject + ')';
    }

    public CardBean(@Nullable List<EntranceCardBean> list, @Nullable List<EntranceCardBean> list2) {
        this.banner = list;
        this.subject = list2;
    }

    public /* synthetic */ CardBean(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
