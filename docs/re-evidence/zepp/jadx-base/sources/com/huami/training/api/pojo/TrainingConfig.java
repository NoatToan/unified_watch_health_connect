package com.huami.training.api.pojo;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.api.ks.BackgroundImageBeanSerializer;
import com.huami.training.api.ks.SerializersKt;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FEBC\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b?\u0010@BW\b\u0017\u0012\u0006\u0010A\u001a\u00020\u0017\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\b\u0010C\u001a\u0004\u0018\u00010B¢\u0006\u0004\b?\u0010DJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\rHÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\rHÆ\u0001J\t\u0010\u0016\u001a\u00020\tHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR$\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u0012\u0004\b$\u0010!\u001a\u0004\b#\u0010\u001fR$\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u001d\u0012\u0004\b'\u0010!\u001a\u0004\b&\u0010\u001fR$\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010!\u001a\u0004\b*\u0010+R$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010)\u0012\u0004\b/\u0010!\u001a\u0004\b.\u0010+R%\u00106\u001a\n\u0012\u0004\u0012\u000201\u0018\u0001008F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R%\u0010:\u001a\n\u0012\u0004\u0012\u000207\u0018\u0001008F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u00105R%\u0010>\u001a\n\u0012\u0004\u0012\u00020;\u0018\u0001008F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u00103\u001a\u0004\b=\u00105¨\u0006G"}, d2 = {"Lcom/huami/training/api/pojo/TrainingConfig;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "component3", "Lcom/huami/training/api/pojo/BackgroundImageBean;", "component4", "component5", "iconsString", "tagsString", "filterModesString", "planBgInFit", "planBgInCourse", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getIconsString", "()Ljava/lang/String;", "getIconsString$annotations", "()V", "b", "getTagsString", "getTagsString$annotations", "c", "getFilterModesString", "getFilterModesString$annotations", GoogleApiAvailabilityLight.a, "Lcom/huami/training/api/pojo/BackgroundImageBean;", "getPlanBgInFit", "()Lcom/huami/training/api/pojo/BackgroundImageBean;", "getPlanBgInFit$annotations", "e", "getPlanBgInCourse", "getPlanBgInCourse$annotations", "", "Lcom/huami/training/api/pojo/EntranceKingBean;", "f", "Lkotlin/Lazy;", "getIcons", "()Ljava/util/List;", "icons", "Lcom/huami/training/api/pojo/TagBean;", "g", "getTags", "tags", "Lcom/huami/training/api/pojo/FilterModeBean;", "h", "getFilterModes", "filterModes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huami/training/api/pojo/BackgroundImageBean;Lcom/huami/training/api/pojo/BackgroundImageBean;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huami/training/api/pojo/BackgroundImageBean;Lcom/huami/training/api/pojo/BackgroundImageBean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "lib_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class TrainingConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final String iconsString;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String tagsString;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String filterModesString;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final BackgroundImageBean planBgInFit;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final BackgroundImageBean planBgInCourse;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy icons;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy tags;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy filterModes;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/training/api/pojo/TrainingConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/training/api/pojo/TrainingConfig;", "serializer", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<TrainingConfig> serializer() {
            return TrainingConfig$$serializer.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<List<? extends EntranceKingBean>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final List<? extends EntranceKingBean> invoke() {
            return SerializersKt.decodeStrList(EntranceKingBean.INSTANCE.serializer(), TrainingConfig.this.getIconsString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<List<? extends TagBean>> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final List<? extends TagBean> invoke() {
            return SerializersKt.decodeStrList(TagBean.INSTANCE.serializer(), TrainingConfig.this.getTagsString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<List<? extends FilterModeBean>> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final List<? extends FilterModeBean> invoke() {
            return SerializersKt.decodeStrList(FilterModeBean.INSTANCE.serializer(), TrainingConfig.this.getFilterModesString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/training/api/pojo/FilterModeBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<List<? extends FilterModeBean>> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final List<? extends FilterModeBean> invoke() {
            return SerializersKt.decodeStrList(FilterModeBean.INSTANCE.serializer(), TrainingConfig.this.getFilterModesString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/training/api/pojo/EntranceKingBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<List<? extends EntranceKingBean>> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final List<? extends EntranceKingBean> invoke() {
            return SerializersKt.decodeStrList(EntranceKingBean.INSTANCE.serializer(), TrainingConfig.this.getIconsString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/training/api/pojo/TagBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<List<? extends TagBean>> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final List<? extends TagBean> invoke() {
            return SerializersKt.decodeStrList(TagBean.INSTANCE.serializer(), TrainingConfig.this.getTagsString());
        }
    }

    public TrainingConfig() {
        this((String) null, (String) null, (String) null, (BackgroundImageBean) null, (BackgroundImageBean) null, 31, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ TrainingConfig(int i, @SerialName("huami.mifit.training.entrance.icons") String str, @SerialName("huami.mifit.training.tags.content.nonConstraint") String str2, @SerialName("huami.mifit.training.entrance.allCourse") String str3, @SerialName("huami.mifit.training.fitness.trainingPlan") @Serializable(with = BackgroundImageBeanSerializer.class) BackgroundImageBean backgroundImageBean, @SerialName("huami.mifit.training.entrance.trainingPlan") @Serializable(with = BackgroundImageBeanSerializer.class) BackgroundImageBean backgroundImageBean2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, TrainingConfig$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.iconsString = null;
        } else {
            this.iconsString = str;
        }
        if ((i & 2) == 0) {
            this.tagsString = null;
        } else {
            this.tagsString = str2;
        }
        if ((i & 4) == 0) {
            this.filterModesString = null;
        } else {
            this.filterModesString = str3;
        }
        if ((i & 8) == 0) {
            this.planBgInFit = null;
        } else {
            this.planBgInFit = backgroundImageBean;
        }
        if ((i & 16) == 0) {
            this.planBgInCourse = null;
        } else {
            this.planBgInCourse = backgroundImageBean2;
        }
        this.icons = LazyKt__LazyJVMKt.lazy(new a());
        this.tags = LazyKt__LazyJVMKt.lazy(new b());
        this.filterModes = LazyKt__LazyJVMKt.lazy(new c());
    }

    public static /* synthetic */ TrainingConfig copy$default(TrainingConfig trainingConfig, String str, String str2, String str3, BackgroundImageBean backgroundImageBean, BackgroundImageBean backgroundImageBean2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trainingConfig.iconsString;
        }
        if ((i & 2) != 0) {
            str2 = trainingConfig.tagsString;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = trainingConfig.filterModesString;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            backgroundImageBean = trainingConfig.planBgInFit;
        }
        BackgroundImageBean backgroundImageBean3 = backgroundImageBean;
        if ((i & 16) != 0) {
            backgroundImageBean2 = trainingConfig.planBgInCourse;
        }
        return trainingConfig.copy(str, str4, str5, backgroundImageBean3, backgroundImageBean2);
    }

    @SerialName("huami.mifit.training.entrance.allCourse")
    public static /* synthetic */ void getFilterModesString$annotations() {
    }

    @SerialName("huami.mifit.training.entrance.icons")
    public static /* synthetic */ void getIconsString$annotations() {
    }

    @SerialName("huami.mifit.training.entrance.trainingPlan")
    @Serializable(with = BackgroundImageBeanSerializer.class)
    public static /* synthetic */ void getPlanBgInCourse$annotations() {
    }

    @SerialName("huami.mifit.training.fitness.trainingPlan")
    @Serializable(with = BackgroundImageBeanSerializer.class)
    public static /* synthetic */ void getPlanBgInFit$annotations() {
    }

    @SerialName("huami.mifit.training.tags.content.nonConstraint")
    public static /* synthetic */ void getTagsString$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull TrainingConfig self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.iconsString != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.iconsString);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.tagsString != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.tagsString);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.filterModesString != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.filterModesString);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.planBgInFit != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, new BackgroundImageBeanSerializer(), self.planBgInFit);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.planBgInCourse != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, new BackgroundImageBeanSerializer(), self.planBgInCourse);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIconsString() {
        return this.iconsString;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTagsString() {
        return this.tagsString;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFilterModesString() {
        return this.filterModesString;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BackgroundImageBean getPlanBgInFit() {
        return this.planBgInFit;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BackgroundImageBean getPlanBgInCourse() {
        return this.planBgInCourse;
    }

    @NotNull
    public final TrainingConfig copy(@Nullable String iconsString, @Nullable String tagsString, @Nullable String filterModesString, @Nullable BackgroundImageBean planBgInFit, @Nullable BackgroundImageBean planBgInCourse) {
        return new TrainingConfig(iconsString, tagsString, filterModesString, planBgInFit, planBgInCourse);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrainingConfig)) {
            return false;
        }
        TrainingConfig trainingConfig = (TrainingConfig) other;
        return Intrinsics.areEqual(this.iconsString, trainingConfig.iconsString) && Intrinsics.areEqual(this.tagsString, trainingConfig.tagsString) && Intrinsics.areEqual(this.filterModesString, trainingConfig.filterModesString) && Intrinsics.areEqual(this.planBgInFit, trainingConfig.planBgInFit) && Intrinsics.areEqual(this.planBgInCourse, trainingConfig.planBgInCourse);
    }

    @Nullable
    public final List<FilterModeBean> getFilterModes() {
        return (List) this.filterModes.getValue();
    }

    @Nullable
    public final String getFilterModesString() {
        return this.filterModesString;
    }

    @Nullable
    public final List<EntranceKingBean> getIcons() {
        return (List) this.icons.getValue();
    }

    @Nullable
    public final String getIconsString() {
        return this.iconsString;
    }

    @Nullable
    public final BackgroundImageBean getPlanBgInCourse() {
        return this.planBgInCourse;
    }

    @Nullable
    public final BackgroundImageBean getPlanBgInFit() {
        return this.planBgInFit;
    }

    @Nullable
    public final List<TagBean> getTags() {
        return (List) this.tags.getValue();
    }

    @Nullable
    public final String getTagsString() {
        return this.tagsString;
    }

    public int hashCode() {
        String str = this.iconsString;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tagsString;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.filterModesString;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BackgroundImageBean backgroundImageBean = this.planBgInFit;
        int iHashCode4 = (iHashCode3 + (backgroundImageBean == null ? 0 : backgroundImageBean.hashCode())) * 31;
        BackgroundImageBean backgroundImageBean2 = this.planBgInCourse;
        return iHashCode4 + (backgroundImageBean2 != null ? backgroundImageBean2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TrainingConfig(iconsString=" + ((Object) this.iconsString) + ", tagsString=" + ((Object) this.tagsString) + ", filterModesString=" + ((Object) this.filterModesString) + ", planBgInFit=" + this.planBgInFit + ", planBgInCourse=" + this.planBgInCourse + ')';
    }

    public TrainingConfig(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable BackgroundImageBean backgroundImageBean, @Nullable BackgroundImageBean backgroundImageBean2) {
        this.iconsString = str;
        this.tagsString = str2;
        this.filterModesString = str3;
        this.planBgInFit = backgroundImageBean;
        this.planBgInCourse = backgroundImageBean2;
        this.icons = LazyKt__LazyJVMKt.lazy(new e());
        this.tags = LazyKt__LazyJVMKt.lazy(new f());
        this.filterModes = LazyKt__LazyJVMKt.lazy(new d());
    }

    public /* synthetic */ TrainingConfig(String str, String str2, String str3, BackgroundImageBean backgroundImageBean, BackgroundImageBean backgroundImageBean2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : backgroundImageBean, (i & 16) != 0 ? null : backgroundImageBean2);
    }
}
