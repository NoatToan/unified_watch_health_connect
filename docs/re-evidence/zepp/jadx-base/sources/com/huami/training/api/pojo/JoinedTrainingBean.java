package com.huami.training.api.pojo;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.sleepassistant.apilib.utils.WebConst;
import com.huami.training.api.DifficultyBo;
import com.huami.training.api.TrainingTypeBo;
import com.huami.training.api.ks.DifficultyBoSerializer;
import com.huami.training.api.ks.GenderLongPairSerializer;
import com.huami.training.api.ks.GenderStringPairSerializer;
import com.huami.training.api.ks.IdNamePairSerializer;
import com.huami.training.api.ks.SerializersKt;
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
import kotlinx.serialization.Transient;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\bS\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u0098\u00012\u00020\u0001:\u0004\u0099\u0001\u0098\u0001B¡\u0001\u0012\u0006\u0010!\u001a\u00020\t\u0012\u0006\u0010\"\u001a\u00020\u000b\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010(\u001a\u00020\u0016\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010,\u001a\u00020\t\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0011¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001BÄ\u0001\b\u0017\u0012\u0007\u0010\u0094\u0001\u001a\u00020\u0018\u0012\b\b\u0001\u0010!\u001a\u00020\t\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010,\u001a\u00020\t\u0012\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\u0011\u0012\n\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u0001¢\u0006\u0006\b\u0092\u0001\u0010\u0097\u0001J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0016HÆ\u0003J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0011HÆ\u0003J°\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\u000b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010(\u001a\u00020\u00162\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010,\u001a\u00020\t2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b/\u00100J\t\u00101\u001a\u00020\u000bHÖ\u0001J\t\u00102\u001a\u00020\u0018HÖ\u0001J\u0013\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010!\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b6\u00107\u0012\u0004\b<\u0010=\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R(\u0010\"\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b>\u0010?\u0012\u0004\bD\u0010=\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR*\u0010#\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bE\u0010F\u0012\u0004\bK\u0010=\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR*\u0010$\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bL\u0010M\u0012\u0004\bR\u0010=\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR*\u0010%\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bS\u0010T\u0012\u0004\bY\u0010=\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR*\u0010&\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bZ\u0010?\u0012\u0004\b]\u0010=\u001a\u0004\b[\u0010A\"\u0004\b\\\u0010CR*\u0010'\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b^\u0010_\u0012\u0004\bd\u0010=\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR(\u0010(\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\be\u0010f\u0012\u0004\bk\u0010=\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR*\u0010)\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bl\u0010m\u0012\u0004\bq\u0010=\u001a\u0004\bn\u0010\u001a\"\u0004\bo\u0010pR*\u0010*\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\br\u0010m\u0012\u0004\bu\u0010=\u001a\u0004\bs\u0010\u001a\"\u0004\bt\u0010pR*\u0010+\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bv\u0010w\u0012\u0004\b{\u0010=\u001a\u0004\bx\u0010\u001d\"\u0004\by\u0010zR(\u0010,\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b|\u00107\u0012\u0004\b\u007f\u0010=\u001a\u0004\b}\u00109\"\u0004\b~\u0010;R.\u0010-\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u001c\n\u0005\b\u0080\u0001\u0010w\u0012\u0005\b\u0083\u0001\u0010=\u001a\u0005\b\u0081\u0001\u0010\u001d\"\u0005\b\u0082\u0001\u0010zR.\u0010.\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u001c\n\u0005\b\u0084\u0001\u0010T\u0012\u0005\b\u0087\u0001\u0010=\u001a\u0005\b\u0085\u0001\u0010V\"\u0005\b\u0086\u0001\u0010XRK\u0010\u0091\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0088\u00012\u0010\u0010\u0089\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0088\u00018F@FX\u0087\u000e¢\u0006\u001f\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u0012\u0005\b\u0090\u0001\u0010=\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001¨\u0006\u009a\u0001"}, d2 = {"Lcom/huami/training/api/pojo/JoinedTrainingBean;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "Lcom/huami/training/api/TrainingTypeBo;", "component3", "Lcom/huami/training/api/DifficultyBo;", "component4", "Lcom/huami/training/api/pojo/GenderStringPair;", "component5", "component6", "Lcom/huami/training/api/pojo/IdNamePair;", "component7", "Lcom/huami/training/api/pojo/GenderLongPair;", "component8", "", "component9", "()Ljava/lang/Integer;", "component10", "component11", "()Ljava/lang/Long;", "component12", "component13", "component14", "id", "name", "trainingType", "difficulty", "largeListImageUrl", "location", "instrument", "duration", "contentCount", "finishedTimes", "expirationDate", EcgData.TIMESTAMP_SERVER_UPDATED, "lastTrainingTime", "squareImageUrl", "copy", "(JLjava/lang/String;Lcom/huami/training/api/TrainingTypeBo;Lcom/huami/training/api/DifficultyBo;Lcom/huami/training/api/pojo/GenderStringPair;Ljava/lang/String;Lcom/huami/training/api/pojo/IdNamePair;Lcom/huami/training/api/pojo/GenderLongPair;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;JLjava/lang/Long;Lcom/huami/training/api/pojo/GenderStringPair;)Lcom/huami/training/api/pojo/JoinedTrainingBean;", "toString", "hashCode", "other", "", "equals", "a", "J", "getId", "()J", WebConst.QueryParam.SET_ID, "(J)V", "getId$annotations", "()V", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getName$annotations", "c", "Lcom/huami/training/api/TrainingTypeBo;", "getTrainingType", "()Lcom/huami/training/api/TrainingTypeBo;", "setTrainingType", "(Lcom/huami/training/api/TrainingTypeBo;)V", "getTrainingType$annotations", GoogleApiAvailabilityLight.a, "Lcom/huami/training/api/DifficultyBo;", "getDifficulty", "()Lcom/huami/training/api/DifficultyBo;", "setDifficulty", "(Lcom/huami/training/api/DifficultyBo;)V", "getDifficulty$annotations", "e", "Lcom/huami/training/api/pojo/GenderStringPair;", "getLargeListImageUrl", "()Lcom/huami/training/api/pojo/GenderStringPair;", "setLargeListImageUrl", "(Lcom/huami/training/api/pojo/GenderStringPair;)V", "getLargeListImageUrl$annotations", "f", "getLocation", "setLocation", "getLocation$annotations", "g", "Lcom/huami/training/api/pojo/IdNamePair;", "getInstrument", "()Lcom/huami/training/api/pojo/IdNamePair;", "setInstrument", "(Lcom/huami/training/api/pojo/IdNamePair;)V", "getInstrument$annotations", "h", "Lcom/huami/training/api/pojo/GenderLongPair;", "getDuration", "()Lcom/huami/training/api/pojo/GenderLongPair;", "setDuration", "(Lcom/huami/training/api/pojo/GenderLongPair;)V", "getDuration$annotations", "i", "Ljava/lang/Integer;", "getContentCount", "setContentCount", "(Ljava/lang/Integer;)V", "getContentCount$annotations", z.j, "getFinishedTimes", "setFinishedTimes", "getFinishedTimes$annotations", hl.k, "Ljava/lang/Long;", "getExpirationDate", "setExpirationDate", "(Ljava/lang/Long;)V", "getExpirationDate$annotations", "l", "getUpdateTime", "setUpdateTime", "getUpdateTime$annotations", "m", "getLastTrainingTime", "setLastTrainingTime", "getLastTrainingTime$annotations", GoogleApiAvailabilityLight.b, "getSquareImageUrl", "setSquareImageUrl", "getSquareImageUrl$annotations", "", "value", "o", "Ljava/util/List;", "getBodyparts", "()Ljava/util/List;", "setBodyparts", "(Ljava/util/List;)V", "getBodyparts$annotations", "bodyparts", "<init>", "(JLjava/lang/String;Lcom/huami/training/api/TrainingTypeBo;Lcom/huami/training/api/DifficultyBo;Lcom/huami/training/api/pojo/GenderStringPair;Ljava/lang/String;Lcom/huami/training/api/pojo/IdNamePair;Lcom/huami/training/api/pojo/GenderLongPair;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;JLjava/lang/Long;Lcom/huami/training/api/pojo/GenderStringPair;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/lang/String;Lcom/huami/training/api/TrainingTypeBo;Lcom/huami/training/api/DifficultyBo;Lcom/huami/training/api/pojo/GenderStringPair;Ljava/lang/String;Lcom/huami/training/api/pojo/IdNamePair;Lcom/huami/training/api/pojo/GenderLongPair;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;JLjava/lang/Long;Lcom/huami/training/api/pojo/GenderStringPair;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "lib_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class JoinedTrainingBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private long id;

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
    @Nullable
    private String location;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private IdNamePair instrument;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    private GenderLongPair duration;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer contentCount;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer finishedTimes;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    private Long expirationDate;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    private long updateTime;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @Nullable
    private Long lastTrainingTime;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    @Nullable
    private GenderStringPair squareImageUrl;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    private List<IdNamePair> bodyparts;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/training/api/pojo/JoinedTrainingBean$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/training/api/pojo/JoinedTrainingBean;", "serializer", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<JoinedTrainingBean> serializer() {
            return JoinedTrainingBean$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ JoinedTrainingBean(int i, @SerialName("id") long j, @SerialName("name") String str, @SerialName("trainingType") @Serializable(with = TrainingTypeBoSerializer.class) TrainingTypeBo trainingTypeBo, @SerialName("difficultyDegree") @Serializable(with = DifficultyBoSerializer.class) DifficultyBo difficultyBo, @SerialName("listPageIllustrated") @Serializable(with = GenderStringPairSerializer.class) GenderStringPair genderStringPair, @SerialName("location") String str2, @SerialName("instrument") @Serializable(with = IdNamePairSerializer.class) IdNamePair idNamePair, @SerialName("time") @Serializable(with = GenderLongPairSerializer.class) GenderLongPair genderLongPair, @SerialName("actionAmount") Integer num, @SerialName("finishedNumber") Integer num2, @SerialName("expireAt") Long l, @SerialName(EcgData.TIMESTAMP_SERVER_UPDATED) long j2, @SerialName("lastTrainingTime") Long l2, @SerialName("squareIllustrated") @Serializable(with = GenderStringPairSerializer.class) GenderStringPair genderStringPair2, SerializationConstructorMarker serializationConstructorMarker) {
        if (2179 != (i & 2179)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2179, JoinedTrainingBean$$serializer.INSTANCE.getDescriptor());
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
        if ((i & 32) == 0) {
            this.location = null;
        } else {
            this.location = str2;
        }
        if ((i & 64) == 0) {
            this.instrument = null;
        } else {
            this.instrument = idNamePair;
        }
        this.duration = genderLongPair;
        this.contentCount = (i & 256) == 0 ? 0 : num;
        if ((i & 512) == 0) {
            this.finishedTimes = null;
        } else {
            this.finishedTimes = num2;
        }
        if ((i & 1024) == 0) {
            this.expirationDate = null;
        } else {
            this.expirationDate = l;
        }
        this.updateTime = j2;
        if ((i & 4096) == 0) {
            this.lastTrainingTime = null;
        } else {
            this.lastTrainingTime = l2;
        }
        if ((i & 8192) == 0) {
            this.squareImageUrl = null;
        } else {
            this.squareImageUrl = genderStringPair2;
        }
        this.bodyparts = null;
    }

    @Transient
    public static /* synthetic */ void getBodyparts$annotations() {
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

    @SerialName("expireAt")
    public static /* synthetic */ void getExpirationDate$annotations() {
    }

    @SerialName("finishedNumber")
    public static /* synthetic */ void getFinishedTimes$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName("instrument")
    @Serializable(with = IdNamePairSerializer.class)
    public static /* synthetic */ void getInstrument$annotations() {
    }

    @SerialName("listPageIllustrated")
    @Serializable(with = GenderStringPairSerializer.class)
    public static /* synthetic */ void getLargeListImageUrl$annotations() {
    }

    @SerialName("lastTrainingTime")
    public static /* synthetic */ void getLastTrainingTime$annotations() {
    }

    @SerialName("location")
    public static /* synthetic */ void getLocation$annotations() {
    }

    @SerialName("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @SerialName("squareIllustrated")
    @Serializable(with = GenderStringPairSerializer.class)
    public static /* synthetic */ void getSquareImageUrl$annotations() {
    }

    @SerialName("trainingType")
    @Serializable(with = TrainingTypeBoSerializer.class)
    public static /* synthetic */ void getTrainingType$annotations() {
    }

    @SerialName(EcgData.TIMESTAMP_SERVER_UPDATED)
    public static /* synthetic */ void getUpdateTime$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull JoinedTrainingBean self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        Integer num;
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
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.location != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.location);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.instrument != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, new IdNamePairSerializer(), self.instrument);
        }
        output.encodeSerializableElement(serialDesc, 7, new GenderLongPairSerializer(), self.duration);
        if (output.shouldEncodeElementDefault(serialDesc, 8) || (num = self.contentCount) == null || num.intValue() != 0) {
            output.encodeNullableSerializableElement(serialDesc, 8, IntSerializer.INSTANCE, self.contentCount);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.finishedTimes != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, IntSerializer.INSTANCE, self.finishedTimes);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.expirationDate != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, LongSerializer.INSTANCE, self.expirationDate);
        }
        output.encodeLongElement(serialDesc, 11, self.updateTime);
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.lastTrainingTime != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, LongSerializer.INSTANCE, self.lastTrainingTime);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.squareImageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, new GenderStringPairSerializer(), self.squareImageUrl);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getFinishedTimes() {
        return this.finishedTimes;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Long getLastTrainingTime() {
        return this.lastTrainingTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final GenderStringPair getSquareImageUrl() {
        return this.squareImageUrl;
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

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final IdNamePair getInstrument() {
        return this.instrument;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final GenderLongPair getDuration() {
        return this.duration;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getContentCount() {
        return this.contentCount;
    }

    @NotNull
    public final JoinedTrainingBean copy(long id, @NotNull String name, @Nullable TrainingTypeBo trainingType, @Nullable DifficultyBo difficulty, @Nullable GenderStringPair largeListImageUrl, @Nullable String location, @Nullable IdNamePair instrument, @NotNull GenderLongPair duration, @Nullable Integer contentCount, @Nullable Integer finishedTimes, @Nullable Long expirationDate, long updateTime, @Nullable Long lastTrainingTime, @Nullable GenderStringPair squareImageUrl) {
        return new JoinedTrainingBean(id, name, trainingType, difficulty, largeListImageUrl, location, instrument, duration, contentCount, finishedTimes, expirationDate, updateTime, lastTrainingTime, squareImageUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JoinedTrainingBean)) {
            return false;
        }
        JoinedTrainingBean joinedTrainingBean = (JoinedTrainingBean) other;
        return this.id == joinedTrainingBean.id && Intrinsics.areEqual(this.name, joinedTrainingBean.name) && this.trainingType == joinedTrainingBean.trainingType && this.difficulty == joinedTrainingBean.difficulty && Intrinsics.areEqual(this.largeListImageUrl, joinedTrainingBean.largeListImageUrl) && Intrinsics.areEqual(this.location, joinedTrainingBean.location) && Intrinsics.areEqual(this.instrument, joinedTrainingBean.instrument) && Intrinsics.areEqual(this.duration, joinedTrainingBean.duration) && Intrinsics.areEqual(this.contentCount, joinedTrainingBean.contentCount) && Intrinsics.areEqual(this.finishedTimes, joinedTrainingBean.finishedTimes) && Intrinsics.areEqual(this.expirationDate, joinedTrainingBean.expirationDate) && this.updateTime == joinedTrainingBean.updateTime && Intrinsics.areEqual(this.lastTrainingTime, joinedTrainingBean.lastTrainingTime) && Intrinsics.areEqual(this.squareImageUrl, joinedTrainingBean.squareImageUrl);
    }

    @Nullable
    public final List<IdNamePair> getBodyparts() {
        return SerializersKt.decodeStrList(IdNamePair.INSTANCE.serializer(), this.location);
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

    @Nullable
    public final Long getExpirationDate() {
        return this.expirationDate;
    }

    @Nullable
    public final Integer getFinishedTimes() {
        return this.finishedTimes;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final IdNamePair getInstrument() {
        return this.instrument;
    }

    @Nullable
    public final GenderStringPair getLargeListImageUrl() {
        return this.largeListImageUrl;
    }

    @Nullable
    public final Long getLastTrainingTime() {
        return this.lastTrainingTime;
    }

    @Nullable
    public final String getLocation() {
        return this.location;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final GenderStringPair getSquareImageUrl() {
        return this.squareImageUrl;
    }

    @Nullable
    public final TrainingTypeBo getTrainingType() {
        return this.trainingType;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        int iA = ((b.a(this.id) * 31) + this.name.hashCode()) * 31;
        TrainingTypeBo trainingTypeBo = this.trainingType;
        int iHashCode = (iA + (trainingTypeBo == null ? 0 : trainingTypeBo.hashCode())) * 31;
        DifficultyBo difficultyBo = this.difficulty;
        int iHashCode2 = (iHashCode + (difficultyBo == null ? 0 : difficultyBo.hashCode())) * 31;
        GenderStringPair genderStringPair = this.largeListImageUrl;
        int iHashCode3 = (iHashCode2 + (genderStringPair == null ? 0 : genderStringPair.hashCode())) * 31;
        String str = this.location;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        IdNamePair idNamePair = this.instrument;
        int iHashCode5 = (((iHashCode4 + (idNamePair == null ? 0 : idNamePair.hashCode())) * 31) + this.duration.hashCode()) * 31;
        Integer num = this.contentCount;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.finishedTimes;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.expirationDate;
        int iHashCode8 = (((iHashCode7 + (l == null ? 0 : l.hashCode())) * 31) + b.a(this.updateTime)) * 31;
        Long l2 = this.lastTrainingTime;
        int iHashCode9 = (iHashCode8 + (l2 == null ? 0 : l2.hashCode())) * 31;
        GenderStringPair genderStringPair2 = this.squareImageUrl;
        return iHashCode9 + (genderStringPair2 != null ? genderStringPair2.hashCode() : 0);
    }

    public final void setBodyparts(@Nullable List<IdNamePair> list) {
        this.bodyparts = list;
        this.location = SerializersKt.encodeStrList(IdNamePair.INSTANCE.serializer(), list);
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

    public final void setExpirationDate(@Nullable Long l) {
        this.expirationDate = l;
    }

    public final void setFinishedTimes(@Nullable Integer num) {
        this.finishedTimes = num;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setInstrument(@Nullable IdNamePair idNamePair) {
        this.instrument = idNamePair;
    }

    public final void setLargeListImageUrl(@Nullable GenderStringPair genderStringPair) {
        this.largeListImageUrl = genderStringPair;
    }

    public final void setLastTrainingTime(@Nullable Long l) {
        this.lastTrainingTime = l;
    }

    public final void setLocation(@Nullable String str) {
        this.location = str;
    }

    public final void setName(@NotNull String str) {
        this.name = str;
    }

    public final void setSquareImageUrl(@Nullable GenderStringPair genderStringPair) {
        this.squareImageUrl = genderStringPair;
    }

    public final void setTrainingType(@Nullable TrainingTypeBo trainingTypeBo) {
        this.trainingType = trainingTypeBo;
    }

    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    @NotNull
    public String toString() {
        return "JoinedTrainingBean(id=" + this.id + ", name=" + this.name + ", trainingType=" + this.trainingType + ", difficulty=" + this.difficulty + ", largeListImageUrl=" + this.largeListImageUrl + ", location=" + ((Object) this.location) + ", instrument=" + this.instrument + ", duration=" + this.duration + ", contentCount=" + this.contentCount + ", finishedTimes=" + this.finishedTimes + ", expirationDate=" + this.expirationDate + ", updateTime=" + this.updateTime + ", lastTrainingTime=" + this.lastTrainingTime + ", squareImageUrl=" + this.squareImageUrl + ')';
    }

    public JoinedTrainingBean(long j, @NotNull String str, @Nullable TrainingTypeBo trainingTypeBo, @Nullable DifficultyBo difficultyBo, @Nullable GenderStringPair genderStringPair, @Nullable String str2, @Nullable IdNamePair idNamePair, @NotNull GenderLongPair genderLongPair, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l, long j2, @Nullable Long l2, @Nullable GenderStringPair genderStringPair2) {
        this.id = j;
        this.name = str;
        this.trainingType = trainingTypeBo;
        this.difficulty = difficultyBo;
        this.largeListImageUrl = genderStringPair;
        this.location = str2;
        this.instrument = idNamePair;
        this.duration = genderLongPair;
        this.contentCount = num;
        this.finishedTimes = num2;
        this.expirationDate = l;
        this.updateTime = j2;
        this.lastTrainingTime = l2;
        this.squareImageUrl = genderStringPair2;
    }

    public /* synthetic */ JoinedTrainingBean(long j, String str, TrainingTypeBo trainingTypeBo, DifficultyBo difficultyBo, GenderStringPair genderStringPair, String str2, IdNamePair idNamePair, GenderLongPair genderLongPair, Integer num, Integer num2, Long l, long j2, Long l2, GenderStringPair genderStringPair2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, (i & 4) != 0 ? null : trainingTypeBo, (i & 8) != 0 ? null : difficultyBo, (i & 16) != 0 ? null : genderStringPair, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : idNamePair, genderLongPair, (i & 256) != 0 ? 0 : num, (i & 512) != 0 ? null : num2, (i & 1024) != 0 ? null : l, j2, (i & 4096) != 0 ? null : l2, (i & 8192) != 0 ? null : genderStringPair2);
    }
}
