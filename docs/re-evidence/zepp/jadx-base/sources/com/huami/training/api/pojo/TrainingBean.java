package com.huami.training.api.pojo;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.api.DifficultyBo;
import com.huami.training.api.TrainingTypeBo;
import com.huami.training.api.ks.DifficultyBoSerializer;
import com.huami.training.api.ks.GenderLongPairSerializer;
import com.huami.training.api.ks.GenderStringPairSerializer;
import com.huami.training.api.ks.TrainingTypeBoSerializer;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\bC\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 u2\u00020\u0001:\u0002vuB}\u0012\u0006\u0010\u001e\u001a\u00020\t\u0012\u0006\u0010\u001f\u001a\u00020\u000b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010#\u001a\u00020\u0013\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010%\u001a\u00020\u0015\u0012\u0006\u0010&\u001a\u00020\u0015\u0012\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\bo\u0010pB\u009f\u0001\b\u0017\u0012\u0006\u0010q\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u001e\u001a\u00020\t\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0001\u0010%\u001a\u00020\u0015\u0012\b\b\u0001\u0010&\u001a\u00020\u0015\u0012\u0010\b\u0001\u0010'\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010s\u001a\u0004\u0018\u00010r¢\u0006\u0004\bo\u0010tJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0013HÆ\u0003J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0018\u001a\u00020\u0015HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0090\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010#\u001a\u00020\u00132\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010%\u001a\u00020\u00152\b\b\u0002\u0010&\u001a\u00020\u00152\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b)\u0010*J\t\u0010+\u001a\u00020\u000bHÖ\u0001J\t\u0010,\u001a\u00020\u0015HÖ\u0001J\u0013\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u001e\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u00105\u001a\u0004\b2\u00103R(\u0010\u001f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b6\u00107\u0012\u0004\b<\u00105\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R*\u0010 \u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b=\u0010>\u0012\u0004\bC\u00105\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR*\u0010!\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bD\u0010E\u0012\u0004\bJ\u00105\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR*\u0010\"\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bK\u0010L\u0012\u0004\bQ\u00105\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR(\u0010#\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bR\u0010S\u0012\u0004\bX\u00105\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR*\u0010$\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bY\u0010Z\u0012\u0004\b^\u00105\u001a\u0004\b[\u0010\u0017\"\u0004\b\\\u0010]R\"\u0010%\u001a\u00020\u00158\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b_\u0010`\u0012\u0004\bc\u00105\u001a\u0004\ba\u0010bR\"\u0010&\u001a\u00020\u00158\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bd\u0010`\u0012\u0004\bf\u00105\u001a\u0004\be\u0010bR*\u0010'\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bg\u0010h\u0012\u0004\bk\u00105\u001a\u0004\bi\u0010jR$\u0010(\u001a\u0004\u0018\u00010\u00118\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bl\u0010L\u0012\u0004\bn\u00105\u001a\u0004\bm\u0010N¨\u0006w"}, d2 = {"Lcom/huami/training/api/pojo/TrainingBean;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "Lcom/huami/training/api/TrainingTypeBo;", "component3", "Lcom/huami/training/api/DifficultyBo;", "component4", "Lcom/huami/training/api/pojo/GenderStringPair;", "component5", "Lcom/huami/training/api/pojo/GenderLongPair;", "component6", "", "component7", "()Ljava/lang/Integer;", "component8", "component9", "", "Lcom/huami/training/api/pojo/LabelBean;", "component10", "component11", "id", "name", "trainingType", "difficulty", "largeListImageUrl", "duration", "contentCount", "calorie", "participants", "label", "squareListImageUrl", "copy", "(JLjava/lang/String;Lcom/huami/training/api/TrainingTypeBo;Lcom/huami/training/api/DifficultyBo;Lcom/huami/training/api/pojo/GenderStringPair;Lcom/huami/training/api/pojo/GenderLongPair;Ljava/lang/Integer;IILjava/util/List;Lcom/huami/training/api/pojo/GenderStringPair;)Lcom/huami/training/api/pojo/TrainingBean;", "toString", "hashCode", "other", "", "equals", "a", "J", "getId", "()J", "getId$annotations", "()V", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getName$annotations", "c", "Lcom/huami/training/api/TrainingTypeBo;", "getTrainingType", "()Lcom/huami/training/api/TrainingTypeBo;", "setTrainingType", "(Lcom/huami/training/api/TrainingTypeBo;)V", "getTrainingType$annotations", GoogleApiAvailabilityLight.a, "Lcom/huami/training/api/DifficultyBo;", "getDifficulty", "()Lcom/huami/training/api/DifficultyBo;", "setDifficulty", "(Lcom/huami/training/api/DifficultyBo;)V", "getDifficulty$annotations", "e", "Lcom/huami/training/api/pojo/GenderStringPair;", "getLargeListImageUrl", "()Lcom/huami/training/api/pojo/GenderStringPair;", "setLargeListImageUrl", "(Lcom/huami/training/api/pojo/GenderStringPair;)V", "getLargeListImageUrl$annotations", "f", "Lcom/huami/training/api/pojo/GenderLongPair;", "getDuration", "()Lcom/huami/training/api/pojo/GenderLongPair;", "setDuration", "(Lcom/huami/training/api/pojo/GenderLongPair;)V", "getDuration$annotations", "g", "Ljava/lang/Integer;", "getContentCount", "setContentCount", "(Ljava/lang/Integer;)V", "getContentCount$annotations", "h", LogUtil.I, "getCalorie", "()I", "getCalorie$annotations", "i", "getParticipants", "getParticipants$annotations", z.j, "Ljava/util/List;", "getLabel", "()Ljava/util/List;", "getLabel$annotations", hl.k, "getSquareListImageUrl", "getSquareListImageUrl$annotations", "<init>", "(JLjava/lang/String;Lcom/huami/training/api/TrainingTypeBo;Lcom/huami/training/api/DifficultyBo;Lcom/huami/training/api/pojo/GenderStringPair;Lcom/huami/training/api/pojo/GenderLongPair;Ljava/lang/Integer;IILjava/util/List;Lcom/huami/training/api/pojo/GenderStringPair;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/lang/String;Lcom/huami/training/api/TrainingTypeBo;Lcom/huami/training/api/DifficultyBo;Lcom/huami/training/api/pojo/GenderStringPair;Lcom/huami/training/api/pojo/GenderLongPair;Ljava/lang/Integer;IILjava/util/List;Lcom/huami/training/api/pojo/GenderStringPair;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "lib_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class TrainingBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private TrainingTypeBo trainingType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private DifficultyBo difficulty;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private GenderStringPair largeListImageUrl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private GenderLongPair duration;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer contentCount;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final int calorie;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private final int participants;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private final List<LabelBean> label;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    private final GenderStringPair squareListImageUrl;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/training/api/pojo/TrainingBean$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/training/api/pojo/TrainingBean;", "serializer", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<TrainingBean> serializer() {
            return TrainingBean$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ TrainingBean(int i, @SerialName("id") long j, @SerialName("name") String str, @SerialName("trainingType") @Serializable(with = TrainingTypeBoSerializer.class) TrainingTypeBo trainingTypeBo, @SerialName("difficultyDegree") @Serializable(with = DifficultyBoSerializer.class) DifficultyBo difficultyBo, @SerialName("listPageIllustrated") @Serializable(with = GenderStringPairSerializer.class) GenderStringPair genderStringPair, @SerialName("time") @Serializable(with = GenderLongPairSerializer.class) GenderLongPair genderLongPair, @SerialName("actionAmount") Integer num, @SerialName("consumption") int i2, @SerialName("participantNumber") int i3, @SerialName("label") List list, @SerialName("squareIllustrated") @Serializable(with = GenderStringPairSerializer.class) GenderStringPair genderStringPair2, SerializationConstructorMarker serializationConstructorMarker) {
        if (419 != (i & 419)) {
            PluginExceptionsKt.throwMissingFieldException(i, 419, TrainingBean$$serializer.INSTANCE.getDescriptor());
        }
        this.id = j;
        this.name = str;
        if ((i & 4) == 0) {
            this.trainingType = null;
        } else {
            this.trainingType = trainingTypeBo;
        }
        if ((i & 8) == 0) {
            this.difficulty = null;
        } else {
            this.difficulty = difficultyBo;
        }
        if ((i & 16) == 0) {
            this.largeListImageUrl = null;
        } else {
            this.largeListImageUrl = genderStringPair;
        }
        this.duration = genderLongPair;
        if ((i & 64) == 0) {
            this.contentCount = null;
        } else {
            this.contentCount = num;
        }
        this.calorie = i2;
        this.participants = i3;
        if ((i & 512) == 0) {
            this.label = null;
        } else {
            this.label = list;
        }
        if ((i & 1024) == 0) {
            this.squareListImageUrl = null;
        } else {
            this.squareListImageUrl = genderStringPair2;
        }
    }

    @SerialName("consumption")
    public static /* synthetic */ void getCalorie$annotations() {
    }

    @SerialName("actionAmount")
    public static /* synthetic */ void getContentCount$annotations() {
    }

    @SerialName("difficultyDegree")
    @Serializable(with = DifficultyBoSerializer.class)
    public static /* synthetic */ void getDifficulty$annotations() {
    }

    @SerialName("time")
    @Serializable(with = GenderLongPairSerializer.class)
    public static /* synthetic */ void getDuration$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName("label")
    public static /* synthetic */ void getLabel$annotations() {
    }

    @SerialName("listPageIllustrated")
    @Serializable(with = GenderStringPairSerializer.class)
    public static /* synthetic */ void getLargeListImageUrl$annotations() {
    }

    @SerialName("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @SerialName("participantNumber")
    public static /* synthetic */ void getParticipants$annotations() {
    }

    @SerialName("squareIllustrated")
    @Serializable(with = GenderStringPairSerializer.class)
    public static /* synthetic */ void getSquareListImageUrl$annotations() {
    }

    @SerialName("trainingType")
    @Serializable(with = TrainingTypeBoSerializer.class)
    public static /* synthetic */ void getTrainingType$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull TrainingBean self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeLongElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.name);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.trainingType != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, new TrainingTypeBoSerializer(), self.trainingType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.difficulty != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, new DifficultyBoSerializer(), self.difficulty);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.largeListImageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, new GenderStringPairSerializer(), self.largeListImageUrl);
        }
        output.encodeSerializableElement(serialDesc, 5, new GenderLongPairSerializer(), self.duration);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.contentCount != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, IntSerializer.INSTANCE, self.contentCount);
        }
        output.encodeIntElement(serialDesc, 7, self.calorie);
        output.encodeIntElement(serialDesc, 8, self.participants);
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.label != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, new ArrayListSerializer(LabelBean$$serializer.INSTANCE), self.label);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.squareListImageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, new GenderStringPairSerializer(), self.squareListImageUrl);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Nullable
    public final List<LabelBean> component10() {
        return this.label;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final GenderStringPair getSquareListImageUrl() {
        return this.squareListImageUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TrainingTypeBo getTrainingType() {
        return this.trainingType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DifficultyBo getDifficulty() {
        return this.difficulty;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final GenderStringPair getLargeListImageUrl() {
        return this.largeListImageUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final GenderLongPair getDuration() {
        return this.duration;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getContentCount() {
        return this.contentCount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getCalorie() {
        return this.calorie;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getParticipants() {
        return this.participants;
    }

    @NotNull
    public final TrainingBean copy(long id, @NotNull String name, @Nullable TrainingTypeBo trainingType, @Nullable DifficultyBo difficulty, @Nullable GenderStringPair largeListImageUrl, @NotNull GenderLongPair duration, @Nullable Integer contentCount, int calorie, int participants, @Nullable List<LabelBean> label, @Nullable GenderStringPair squareListImageUrl) {
        return new TrainingBean(id, name, trainingType, difficulty, largeListImageUrl, duration, contentCount, calorie, participants, label, squareListImageUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrainingBean)) {
            return false;
        }
        TrainingBean trainingBean = (TrainingBean) other;
        return this.id == trainingBean.id && Intrinsics.areEqual(this.name, trainingBean.name) && this.trainingType == trainingBean.trainingType && this.difficulty == trainingBean.difficulty && Intrinsics.areEqual(this.largeListImageUrl, trainingBean.largeListImageUrl) && Intrinsics.areEqual(this.duration, trainingBean.duration) && Intrinsics.areEqual(this.contentCount, trainingBean.contentCount) && this.calorie == trainingBean.calorie && this.participants == trainingBean.participants && Intrinsics.areEqual(this.label, trainingBean.label) && Intrinsics.areEqual(this.squareListImageUrl, trainingBean.squareListImageUrl);
    }

    public final int getCalorie() {
        return this.calorie;
    }

    @Nullable
    public final Integer getContentCount() {
        return this.contentCount;
    }

    @Nullable
    public final DifficultyBo getDifficulty() {
        return this.difficulty;
    }

    @NotNull
    public final GenderLongPair getDuration() {
        return this.duration;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final List<LabelBean> getLabel() {
        return this.label;
    }

    @Nullable
    public final GenderStringPair getLargeListImageUrl() {
        return this.largeListImageUrl;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getParticipants() {
        return this.participants;
    }

    @Nullable
    public final GenderStringPair getSquareListImageUrl() {
        return this.squareListImageUrl;
    }

    @Nullable
    public final TrainingTypeBo getTrainingType() {
        return this.trainingType;
    }

    public int hashCode() {
        int iA = ((b.a(this.id) * 31) + this.name.hashCode()) * 31;
        TrainingTypeBo trainingTypeBo = this.trainingType;
        int iHashCode = (iA + (trainingTypeBo == null ? 0 : trainingTypeBo.hashCode())) * 31;
        DifficultyBo difficultyBo = this.difficulty;
        int iHashCode2 = (iHashCode + (difficultyBo == null ? 0 : difficultyBo.hashCode())) * 31;
        GenderStringPair genderStringPair = this.largeListImageUrl;
        int iHashCode3 = (((iHashCode2 + (genderStringPair == null ? 0 : genderStringPair.hashCode())) * 31) + this.duration.hashCode()) * 31;
        Integer num = this.contentCount;
        int iHashCode4 = (((((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31) + this.calorie) * 31) + this.participants) * 31;
        List<LabelBean> list = this.label;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        GenderStringPair genderStringPair2 = this.squareListImageUrl;
        return iHashCode5 + (genderStringPair2 != null ? genderStringPair2.hashCode() : 0);
    }

    public final void setContentCount(@Nullable Integer num) {
        this.contentCount = num;
    }

    public final void setDifficulty(@Nullable DifficultyBo difficultyBo) {
        this.difficulty = difficultyBo;
    }

    public final void setDuration(@NotNull GenderLongPair genderLongPair) {
        this.duration = genderLongPair;
    }

    public final void setLargeListImageUrl(@Nullable GenderStringPair genderStringPair) {
        this.largeListImageUrl = genderStringPair;
    }

    public final void setName(@NotNull String str) {
        this.name = str;
    }

    public final void setTrainingType(@Nullable TrainingTypeBo trainingTypeBo) {
        this.trainingType = trainingTypeBo;
    }

    @NotNull
    public String toString() {
        return "TrainingBean(id=" + this.id + ", name=" + this.name + ", trainingType=" + this.trainingType + ", difficulty=" + this.difficulty + ", largeListImageUrl=" + this.largeListImageUrl + ", duration=" + this.duration + ", contentCount=" + this.contentCount + ", calorie=" + this.calorie + ", participants=" + this.participants + ", label=" + this.label + ", squareListImageUrl=" + this.squareListImageUrl + ')';
    }

    public TrainingBean(long j, @NotNull String str, @Nullable TrainingTypeBo trainingTypeBo, @Nullable DifficultyBo difficultyBo, @Nullable GenderStringPair genderStringPair, @NotNull GenderLongPair genderLongPair, @Nullable Integer num, int i, int i2, @Nullable List<LabelBean> list, @Nullable GenderStringPair genderStringPair2) {
        this.id = j;
        this.name = str;
        this.trainingType = trainingTypeBo;
        this.difficulty = difficultyBo;
        this.largeListImageUrl = genderStringPair;
        this.duration = genderLongPair;
        this.contentCount = num;
        this.calorie = i;
        this.participants = i2;
        this.label = list;
        this.squareListImageUrl = genderStringPair2;
    }

    public /* synthetic */ TrainingBean(long j, String str, TrainingTypeBo trainingTypeBo, DifficultyBo difficultyBo, GenderStringPair genderStringPair, GenderLongPair genderLongPair, Integer num, int i, int i2, List list, GenderStringPair genderStringPair2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, (i3 & 4) != 0 ? null : trainingTypeBo, (i3 & 8) != 0 ? null : difficultyBo, (i3 & 16) != 0 ? null : genderStringPair, genderLongPair, (i3 & 64) != 0 ? null : num, i, i2, (i3 & 512) != 0 ? null : list, (i3 & 1024) != 0 ? null : genderStringPair2);
    }
}
