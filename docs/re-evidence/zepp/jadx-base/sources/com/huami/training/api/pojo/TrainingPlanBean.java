package com.huami.training.api.pojo;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.huami.training.api.PlanDifficultyBo;
import com.huami.training.api.PlanTypeBo;
import com.huami.training.api.ks.PlanDifficultyBoSerializer;
import com.huami.training.api.ks.PlanTypeBoSerializer;
import com.loc.z;
import defpackage.b;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 j2\u00020\u0001:\u0002kjB\u0085\u0001\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\u0006\u0010\u001e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010!\u001a\u00020\u000f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010#\u001a\u00020\u0012\u0012\u0006\u0010$\u001a\u00020\u0014\u0012\u0006\u0010%\u001a\u00020\u000b\u0012\u0006\u0010&\u001a\u00020\t\u0012\u0006\u0010'\u001a\u00020\u000f\u0012\u0006\u0010(\u001a\u00020\u000f\u0012\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a¢\u0006\u0004\bd\u0010eB³\u0001\b\u0017\u0012\u0006\u0010f\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u001d\u001a\u00020\t\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010!\u001a\u00020\u000f\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010&\u001a\u00020\t\u0012\b\b\u0001\u0010'\u001a\u00020\u000f\u0012\b\b\u0001\u0010(\u001a\u00020\u000f\u0012\u0010\b\u0001\u0010)\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\b\u0010h\u001a\u0004\u0018\u00010g¢\u0006\u0004\bd\u0010iJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\u0013\u001a\u00020\u0012HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0014HÆ\u0003J\t\u0010\u0016\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J\t\u0010\u0018\u001a\u00020\u000fHÆ\u0003J\t\u0010\u0019\u001a\u00020\u000fHÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aHÆ\u0003J\u0099\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010!\u001a\u00020\u000f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\u00142\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\t2\b\b\u0002\u0010'\u001a\u00020\u000f2\b\b\u0002\u0010(\u001a\u00020\u000f2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aHÆ\u0001J\t\u0010+\u001a\u00020\u000bHÖ\u0001J\t\u0010,\u001a\u00020\u000fHÖ\u0001J\u0013\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u001d\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u00105\u001a\u0004\b2\u00103R\"\u0010\u001e\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b:\u00105\u001a\u0004\b8\u00109R$\u0010\u001f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u00107\u0012\u0004\b=\u00105\u001a\u0004\b<\u00109R$\u0010 \u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b>\u00107\u0012\u0004\b@\u00105\u001a\u0004\b?\u00109R\"\u0010!\u001a\u00020\u000f8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010B\u0012\u0004\bE\u00105\u001a\u0004\bC\u0010DR$\u0010\"\u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bF\u00107\u0012\u0004\bH\u00105\u001a\u0004\bG\u00109R\"\u0010#\u001a\u00020\u00128\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bI\u0010J\u0012\u0004\bM\u00105\u001a\u0004\bK\u0010LR\"\u0010$\u001a\u00020\u00148\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bN\u0010O\u0012\u0004\bR\u00105\u001a\u0004\bP\u0010QR\"\u0010%\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bS\u00107\u0012\u0004\bU\u00105\u001a\u0004\bT\u00109R\"\u0010&\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bV\u00101\u0012\u0004\bX\u00105\u001a\u0004\bW\u00103R\"\u0010'\u001a\u00020\u000f8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bY\u0010B\u0012\u0004\b[\u00105\u001a\u0004\bZ\u0010DR\"\u0010(\u001a\u00020\u000f8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\\\u0010B\u0012\u0004\b^\u00105\u001a\u0004\b]\u0010DR*\u0010)\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b_\u0010`\u0012\u0004\bc\u00105\u001a\u0004\ba\u0010b¨\u0006l"}, d2 = {"Lcom/huami/training/api/pojo/TrainingPlanBean;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "component3", "component4", "", "component5", "component6", "Lcom/huami/training/api/PlanTypeBo;", "component7", "Lcom/huami/training/api/PlanDifficultyBo;", "component8", "component9", "component10", "component11", "component12", "", "Lcom/huami/training/api/pojo/PlanTrainingBean;", "component13", BloodPressureConst.ParamKey.PLANID, "name", "listImageUrl", "detailImageUrl", "consumption", "introduction", "type", "difficulty", "startDay", "duration", "totalDays", "trainingDays", "dayTrainingItems", "copy", "toString", "hashCode", "other", "", "equals", "a", "J", "getPlanId", "()J", "getPlanId$annotations", "()V", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getName$annotations", "c", "getListImageUrl", "getListImageUrl$annotations", GoogleApiAvailabilityLight.a, "getDetailImageUrl", "getDetailImageUrl$annotations", "e", LogUtil.I, "getConsumption", "()I", "getConsumption$annotations", "f", "getIntroduction", "getIntroduction$annotations", "g", "Lcom/huami/training/api/PlanTypeBo;", "getType", "()Lcom/huami/training/api/PlanTypeBo;", "getType$annotations", "h", "Lcom/huami/training/api/PlanDifficultyBo;", "getDifficulty", "()Lcom/huami/training/api/PlanDifficultyBo;", "getDifficulty$annotations", "i", "getStartDay", "getStartDay$annotations", z.j, "getDuration", "getDuration$annotations", hl.k, "getTotalDays", "getTotalDays$annotations", "l", "getTrainingDays", "getTrainingDays$annotations", "m", "Ljava/util/List;", "getDayTrainingItems", "()Ljava/util/List;", "getDayTrainingItems$annotations", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/huami/training/api/PlanTypeBo;Lcom/huami/training/api/PlanDifficultyBo;Ljava/lang/String;JIILjava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/huami/training/api/PlanTypeBo;Lcom/huami/training/api/PlanDifficultyBo;Ljava/lang/String;JIILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "lib_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class TrainingPlanBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long planId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String listImageUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final String detailImageUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int consumption;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final String introduction;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    private final PlanTypeBo type;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    private final PlanDifficultyBo difficulty;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @NotNull
    private final String startDay;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    private final long duration;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    private final int totalDays;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    private final int trainingDays;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @Nullable
    private final List<PlanTrainingBean> dayTrainingItems;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/training/api/pojo/TrainingPlanBean$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/training/api/pojo/TrainingPlanBean;", "serializer", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<TrainingPlanBean> serializer() {
            return TrainingPlanBean$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ TrainingPlanBean(int i, @SerialName("trainingPlanId") long j, @SerialName("name") String str, @SerialName("listPageIllustrated") String str2, @SerialName("detailsPageIllustrated") String str3, @SerialName("consumption") int i2, @SerialName("introduction") String str4, @SerialName("trainingType") @Serializable(with = PlanTypeBoSerializer.class) PlanTypeBo planTypeBo, @SerialName("difficultyDegree") @Serializable(with = PlanDifficultyBoSerializer.class) PlanDifficultyBo planDifficultyBo, @SerialName("startDay") String str5, @SerialName("time") long j2, @SerialName("totalDays") int i3, @SerialName("trainingDays") int i4, @SerialName("dayTrainingItems") List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (4051 != (i & 4051)) {
            PluginExceptionsKt.throwMissingFieldException(i, 4051, TrainingPlanBean$$serializer.INSTANCE.getDescriptor());
        }
        this.planId = j;
        this.name = str;
        if ((i & 4) == 0) {
            this.listImageUrl = null;
        } else {
            this.listImageUrl = str2;
        }
        if ((i & 8) == 0) {
            this.detailImageUrl = null;
        } else {
            this.detailImageUrl = str3;
        }
        this.consumption = i2;
        if ((i & 32) == 0) {
            this.introduction = null;
        } else {
            this.introduction = str4;
        }
        this.type = planTypeBo;
        this.difficulty = planDifficultyBo;
        this.startDay = str5;
        this.duration = j2;
        this.totalDays = i3;
        this.trainingDays = i4;
        if ((i & 4096) == 0) {
            this.dayTrainingItems = null;
        } else {
            this.dayTrainingItems = list;
        }
    }

    @SerialName("consumption")
    public static /* synthetic */ void getConsumption$annotations() {
    }

    @SerialName("dayTrainingItems")
    public static /* synthetic */ void getDayTrainingItems$annotations() {
    }

    @SerialName("detailsPageIllustrated")
    public static /* synthetic */ void getDetailImageUrl$annotations() {
    }

    @SerialName("difficultyDegree")
    @Serializable(with = PlanDifficultyBoSerializer.class)
    public static /* synthetic */ void getDifficulty$annotations() {
    }

    @SerialName("time")
    public static /* synthetic */ void getDuration$annotations() {
    }

    @SerialName("introduction")
    public static /* synthetic */ void getIntroduction$annotations() {
    }

    @SerialName("listPageIllustrated")
    public static /* synthetic */ void getListImageUrl$annotations() {
    }

    @SerialName("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @SerialName("trainingPlanId")
    public static /* synthetic */ void getPlanId$annotations() {
    }

    @SerialName("startDay")
    public static /* synthetic */ void getStartDay$annotations() {
    }

    @SerialName("totalDays")
    public static /* synthetic */ void getTotalDays$annotations() {
    }

    @SerialName("trainingDays")
    public static /* synthetic */ void getTrainingDays$annotations() {
    }

    @SerialName("trainingType")
    @Serializable(with = PlanTypeBoSerializer.class)
    public static /* synthetic */ void getType$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull TrainingPlanBean self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeLongElement(serialDesc, 0, self.planId);
        output.encodeStringElement(serialDesc, 1, self.name);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.listImageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.listImageUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.detailImageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.detailImageUrl);
        }
        output.encodeIntElement(serialDesc, 4, self.consumption);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.introduction != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.introduction);
        }
        output.encodeSerializableElement(serialDesc, 6, new PlanTypeBoSerializer(), self.type);
        output.encodeSerializableElement(serialDesc, 7, new PlanDifficultyBoSerializer(), self.difficulty);
        output.encodeStringElement(serialDesc, 8, self.startDay);
        output.encodeLongElement(serialDesc, 9, self.duration);
        output.encodeIntElement(serialDesc, 10, self.totalDays);
        output.encodeIntElement(serialDesc, 11, self.trainingDays);
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.dayTrainingItems != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, new ArrayListSerializer(PlanTrainingBean$$serializer.INSTANCE), self.dayTrainingItems);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getPlanId() {
        return this.planId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getTotalDays() {
        return this.totalDays;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getTrainingDays() {
        return this.trainingDays;
    }

    @Nullable
    public final List<PlanTrainingBean> component13() {
        return this.dayTrainingItems;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getListImageUrl() {
        return this.listImageUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDetailImageUrl() {
        return this.detailImageUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getConsumption() {
        return this.consumption;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIntroduction() {
        return this.introduction;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final PlanTypeBo getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final PlanDifficultyBo getDifficulty() {
        return this.difficulty;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getStartDay() {
        return this.startDay;
    }

    @NotNull
    public final TrainingPlanBean copy(long planId, @NotNull String name, @Nullable String listImageUrl, @Nullable String detailImageUrl, int consumption, @Nullable String introduction, @NotNull PlanTypeBo type, @NotNull PlanDifficultyBo difficulty, @NotNull String startDay, long duration, int totalDays, int trainingDays, @Nullable List<PlanTrainingBean> dayTrainingItems) {
        return new TrainingPlanBean(planId, name, listImageUrl, detailImageUrl, consumption, introduction, type, difficulty, startDay, duration, totalDays, trainingDays, dayTrainingItems);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrainingPlanBean)) {
            return false;
        }
        TrainingPlanBean trainingPlanBean = (TrainingPlanBean) other;
        return this.planId == trainingPlanBean.planId && Intrinsics.areEqual(this.name, trainingPlanBean.name) && Intrinsics.areEqual(this.listImageUrl, trainingPlanBean.listImageUrl) && Intrinsics.areEqual(this.detailImageUrl, trainingPlanBean.detailImageUrl) && this.consumption == trainingPlanBean.consumption && Intrinsics.areEqual(this.introduction, trainingPlanBean.introduction) && this.type == trainingPlanBean.type && this.difficulty == trainingPlanBean.difficulty && Intrinsics.areEqual(this.startDay, trainingPlanBean.startDay) && this.duration == trainingPlanBean.duration && this.totalDays == trainingPlanBean.totalDays && this.trainingDays == trainingPlanBean.trainingDays && Intrinsics.areEqual(this.dayTrainingItems, trainingPlanBean.dayTrainingItems);
    }

    public final int getConsumption() {
        return this.consumption;
    }

    @Nullable
    public final List<PlanTrainingBean> getDayTrainingItems() {
        return this.dayTrainingItems;
    }

    @Nullable
    public final String getDetailImageUrl() {
        return this.detailImageUrl;
    }

    @NotNull
    public final PlanDifficultyBo getDifficulty() {
        return this.difficulty;
    }

    public final long getDuration() {
        return this.duration;
    }

    @Nullable
    public final String getIntroduction() {
        return this.introduction;
    }

    @Nullable
    public final String getListImageUrl() {
        return this.listImageUrl;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final long getPlanId() {
        return this.planId;
    }

    @NotNull
    public final String getStartDay() {
        return this.startDay;
    }

    public final int getTotalDays() {
        return this.totalDays;
    }

    public final int getTrainingDays() {
        return this.trainingDays;
    }

    @NotNull
    public final PlanTypeBo getType() {
        return this.type;
    }

    public int hashCode() {
        int iA = ((b.a(this.planId) * 31) + this.name.hashCode()) * 31;
        String str = this.listImageUrl;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.detailImageUrl;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.consumption) * 31;
        String str3 = this.introduction;
        int iHashCode3 = (((((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.type.hashCode()) * 31) + this.difficulty.hashCode()) * 31) + this.startDay.hashCode()) * 31) + b.a(this.duration)) * 31) + this.totalDays) * 31) + this.trainingDays) * 31;
        List<PlanTrainingBean> list = this.dayTrainingItems;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TrainingPlanBean(planId=" + this.planId + ", name=" + this.name + ", listImageUrl=" + ((Object) this.listImageUrl) + ", detailImageUrl=" + ((Object) this.detailImageUrl) + ", consumption=" + this.consumption + ", introduction=" + ((Object) this.introduction) + ", type=" + this.type + ", difficulty=" + this.difficulty + ", startDay=" + this.startDay + ", duration=" + this.duration + ", totalDays=" + this.totalDays + ", trainingDays=" + this.trainingDays + ", dayTrainingItems=" + this.dayTrainingItems + ')';
    }

    public TrainingPlanBean(long j, @NotNull String str, @Nullable String str2, @Nullable String str3, int i, @Nullable String str4, @NotNull PlanTypeBo planTypeBo, @NotNull PlanDifficultyBo planDifficultyBo, @NotNull String str5, long j2, int i2, int i3, @Nullable List<PlanTrainingBean> list) {
        this.planId = j;
        this.name = str;
        this.listImageUrl = str2;
        this.detailImageUrl = str3;
        this.consumption = i;
        this.introduction = str4;
        this.type = planTypeBo;
        this.difficulty = planDifficultyBo;
        this.startDay = str5;
        this.duration = j2;
        this.totalDays = i2;
        this.trainingDays = i3;
        this.dayTrainingItems = list;
    }

    public /* synthetic */ TrainingPlanBean(long j, String str, String str2, String str3, int i, String str4, PlanTypeBo planTypeBo, PlanDifficultyBo planDifficultyBo, String str5, long j2, int i2, int i3, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, (i4 & 4) != 0 ? null : str2, (i4 & 8) != 0 ? null : str3, i, (i4 & 32) != 0 ? null : str4, planTypeBo, planDifficultyBo, str5, j2, i2, i3, (i4 & 4096) != 0 ? null : list);
    }
}
