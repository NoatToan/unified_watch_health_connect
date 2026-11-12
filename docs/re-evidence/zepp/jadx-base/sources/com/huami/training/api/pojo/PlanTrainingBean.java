package com.huami.training.api.pojo;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\bP\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 g2\u00020\u0001:\u0002hgB\u0093\u0001\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u001f\u001a\u00020\r\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\"\u001a\u00020\u0013\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010$\u001a\u00020\r\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\ba\u0010bB¯\u0001\b\u0017\u0012\u0006\u0010c\u001a\u00020\r\u0012\b\b\u0001\u0010\u001d\u001a\u00020\t\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u001f\u001a\u00020\r\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\r\u0012\b\b\u0001\u0010\"\u001a\u00020\u0013\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0001\u0010$\u001a\u00020\r\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010e\u001a\u0004\u0018\u00010d¢\u0006\u0004\ba\u0010fJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0014\u001a\u00020\u0013HÆ\u0003J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0017\u001a\u00020\rHÆ\u0003J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003J¤\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\r2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\"\u001a\u00020\u00132\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010$\u001a\u00020\r2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b*\u0010+J\t\u0010,\u001a\u00020\u000bHÖ\u0001J\t\u0010-\u001a\u00020\rHÖ\u0001J\u0013\u0010/\u001a\u00020\u00132\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u001d\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u00105\u001a\u0004\b2\u00103R$\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b:\u00105\u001a\u0004\b8\u00109R\"\u0010\u001f\u001a\u00020\r8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b?\u00105\u001a\u0004\b=\u0010>R$\u0010 \u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b@\u0010A\u0012\u0004\bC\u00105\u001a\u0004\bB\u0010\u0010R$\u0010!\u001a\u0004\u0018\u00010\r8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bD\u0010E\u0012\u0004\bG\u00105\u001a\u0004\bF\u0010\u0012R\"\u0010\"\u001a\u00020\u00138\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bH\u0010I\u0012\u0004\bK\u00105\u001a\u0004\b\"\u0010JR$\u0010#\u001a\u0004\u0018\u00010\u00138\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bL\u0010M\u0012\u0004\bN\u00105\u001a\u0004\b#\u0010\u0016R\"\u0010$\u001a\u00020\r8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bO\u0010<\u0012\u0004\bQ\u00105\u001a\u0004\bP\u0010>R$\u0010%\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bR\u0010A\u0012\u0004\bT\u00105\u001a\u0004\bS\u0010\u0010R$\u0010&\u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bU\u00107\u0012\u0004\bW\u00105\u001a\u0004\bV\u00109R$\u0010'\u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bX\u00107\u0012\u0004\bZ\u00105\u001a\u0004\bY\u00109R$\u0010(\u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b[\u00107\u0012\u0004\b]\u00105\u001a\u0004\b\\\u00109R$\u0010)\u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b^\u00107\u0012\u0004\b`\u00105\u001a\u0004\b_\u00109¨\u0006i"}, d2 = {"Lcom/huami/training/api/pojo/PlanTrainingBean;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "", "component3", "component4", "()Ljava/lang/Long;", "component5", "()Ljava/lang/Integer;", "", "component6", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "component10", "component11", "component12", "component13", "id", "name", "dayOfWeek", "duration", "consumption", "isFinished", "isToday", "dayIndex", "articleId", "articleTitle", "articleDescription", "articleLink", "articleImgUrl", "copy", "(JLjava/lang/String;ILjava/lang/Long;Ljava/lang/Integer;ZLjava/lang/Boolean;ILjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huami/training/api/pojo/PlanTrainingBean;", "toString", "hashCode", "other", "equals", "a", "J", "getId", "()J", "getId$annotations", "()V", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getName$annotations", "c", LogUtil.I, "getDayOfWeek", "()I", "getDayOfWeek$annotations", GoogleApiAvailabilityLight.a, "Ljava/lang/Long;", "getDuration", "getDuration$annotations", "e", "Ljava/lang/Integer;", "getConsumption", "getConsumption$annotations", "f", "Z", "()Z", "isFinished$annotations", "g", "Ljava/lang/Boolean;", "isToday$annotations", "h", "getDayIndex", "getDayIndex$annotations", "i", "getArticleId", "getArticleId$annotations", z.j, "getArticleTitle", "getArticleTitle$annotations", hl.k, "getArticleDescription", "getArticleDescription$annotations", "l", "getArticleLink", "getArticleLink$annotations", "m", "getArticleImgUrl", "getArticleImgUrl$annotations", "<init>", "(JLjava/lang/String;ILjava/lang/Long;Ljava/lang/Integer;ZLjava/lang/Boolean;ILjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/lang/String;ILjava/lang/Long;Ljava/lang/Integer;ZLjava/lang/Boolean;ILjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "lib_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class PlanTrainingBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int dayOfWeek;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long duration;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer consumption;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final boolean isFinished;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private final Boolean isToday;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final int dayIndex;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long articleId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private final String articleTitle;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    private final String articleDescription;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @Nullable
    private final String articleLink;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @Nullable
    private final String articleImgUrl;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/training/api/pojo/PlanTrainingBean$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/training/api/pojo/PlanTrainingBean;", "serializer", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<PlanTrainingBean> serializer() {
            return PlanTrainingBean$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PlanTrainingBean(int i, @SerialName("trainingId") long j, @SerialName("name") String str, @SerialName("dayOfWeek") int i2, @SerialName("time") Long l, @SerialName("consumption") Integer num, @SerialName("isFinished") boolean z, @SerialName("isToday") Boolean bool, @SerialName("dayIndex") int i3, @SerialName("articleId") Long l2, @SerialName("articleTitle") String str2, @SerialName("articleDescription") String str3, @SerialName("articleLink") String str4, @SerialName("articleImgUrl") String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (165 != (i & 165)) {
            PluginExceptionsKt.throwMissingFieldException(i, 165, PlanTrainingBean$$serializer.INSTANCE.getDescriptor());
        }
        this.id = j;
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        this.dayOfWeek = i2;
        if ((i & 8) == 0) {
            this.duration = null;
        } else {
            this.duration = l;
        }
        if ((i & 16) == 0) {
            this.consumption = null;
        } else {
            this.consumption = num;
        }
        this.isFinished = z;
        if ((i & 64) == 0) {
            this.isToday = null;
        } else {
            this.isToday = bool;
        }
        this.dayIndex = i3;
        if ((i & 256) == 0) {
            this.articleId = null;
        } else {
            this.articleId = l2;
        }
        if ((i & 512) == 0) {
            this.articleTitle = null;
        } else {
            this.articleTitle = str2;
        }
        if ((i & 1024) == 0) {
            this.articleDescription = null;
        } else {
            this.articleDescription = str3;
        }
        if ((i & 2048) == 0) {
            this.articleLink = null;
        } else {
            this.articleLink = str4;
        }
        if ((i & 4096) == 0) {
            this.articleImgUrl = null;
        } else {
            this.articleImgUrl = str5;
        }
    }

    @SerialName("articleDescription")
    public static /* synthetic */ void getArticleDescription$annotations() {
    }

    @SerialName("articleId")
    public static /* synthetic */ void getArticleId$annotations() {
    }

    @SerialName("articleImgUrl")
    public static /* synthetic */ void getArticleImgUrl$annotations() {
    }

    @SerialName("articleLink")
    public static /* synthetic */ void getArticleLink$annotations() {
    }

    @SerialName("articleTitle")
    public static /* synthetic */ void getArticleTitle$annotations() {
    }

    @SerialName("consumption")
    public static /* synthetic */ void getConsumption$annotations() {
    }

    @SerialName("dayIndex")
    public static /* synthetic */ void getDayIndex$annotations() {
    }

    @SerialName("dayOfWeek")
    public static /* synthetic */ void getDayOfWeek$annotations() {
    }

    @SerialName("time")
    public static /* synthetic */ void getDuration$annotations() {
    }

    @SerialName("trainingId")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @SerialName("isFinished")
    public static /* synthetic */ void isFinished$annotations() {
    }

    @SerialName("isToday")
    public static /* synthetic */ void isToday$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull PlanTrainingBean self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeLongElement(serialDesc, 0, self.id);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.name != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.name);
        }
        output.encodeIntElement(serialDesc, 2, self.dayOfWeek);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.duration != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, LongSerializer.INSTANCE, self.duration);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.consumption != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, IntSerializer.INSTANCE, self.consumption);
        }
        output.encodeBooleanElement(serialDesc, 5, self.isFinished);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.isToday != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, BooleanSerializer.INSTANCE, self.isToday);
        }
        output.encodeIntElement(serialDesc, 7, self.dayIndex);
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.articleId != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, LongSerializer.INSTANCE, self.articleId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.articleTitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.articleTitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.articleDescription != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.articleDescription);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.articleLink != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, self.articleLink);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.articleImgUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, StringSerializer.INSTANCE, self.articleImgUrl);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getArticleTitle() {
        return this.articleTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getArticleDescription() {
        return this.articleDescription;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getArticleLink() {
        return this.articleLink;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getArticleImgUrl() {
        return this.articleImgUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDayOfWeek() {
        return this.dayOfWeek;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getDuration() {
        return this.duration;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getConsumption() {
        return this.consumption;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsFinished() {
        return this.isFinished;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsToday() {
        return this.isToday;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getDayIndex() {
        return this.dayIndex;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getArticleId() {
        return this.articleId;
    }

    @NotNull
    public final PlanTrainingBean copy(long id, @Nullable String name, int dayOfWeek, @Nullable Long duration, @Nullable Integer consumption, boolean isFinished, @Nullable Boolean isToday, int dayIndex, @Nullable Long articleId, @Nullable String articleTitle, @Nullable String articleDescription, @Nullable String articleLink, @Nullable String articleImgUrl) {
        return new PlanTrainingBean(id, name, dayOfWeek, duration, consumption, isFinished, isToday, dayIndex, articleId, articleTitle, articleDescription, articleLink, articleImgUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlanTrainingBean)) {
            return false;
        }
        PlanTrainingBean planTrainingBean = (PlanTrainingBean) other;
        return this.id == planTrainingBean.id && Intrinsics.areEqual(this.name, planTrainingBean.name) && this.dayOfWeek == planTrainingBean.dayOfWeek && Intrinsics.areEqual(this.duration, planTrainingBean.duration) && Intrinsics.areEqual(this.consumption, planTrainingBean.consumption) && this.isFinished == planTrainingBean.isFinished && Intrinsics.areEqual(this.isToday, planTrainingBean.isToday) && this.dayIndex == planTrainingBean.dayIndex && Intrinsics.areEqual(this.articleId, planTrainingBean.articleId) && Intrinsics.areEqual(this.articleTitle, planTrainingBean.articleTitle) && Intrinsics.areEqual(this.articleDescription, planTrainingBean.articleDescription) && Intrinsics.areEqual(this.articleLink, planTrainingBean.articleLink) && Intrinsics.areEqual(this.articleImgUrl, planTrainingBean.articleImgUrl);
    }

    @Nullable
    public final String getArticleDescription() {
        return this.articleDescription;
    }

    @Nullable
    public final Long getArticleId() {
        return this.articleId;
    }

    @Nullable
    public final String getArticleImgUrl() {
        return this.articleImgUrl;
    }

    @Nullable
    public final String getArticleLink() {
        return this.articleLink;
    }

    @Nullable
    public final String getArticleTitle() {
        return this.articleTitle;
    }

    @Nullable
    public final Integer getConsumption() {
        return this.consumption;
    }

    public final int getDayIndex() {
        return this.dayIndex;
    }

    public final int getDayOfWeek() {
        return this.dayOfWeek;
    }

    @Nullable
    public final Long getDuration() {
        return this.duration;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v38 */
    public int hashCode() {
        int iA = b.a(this.id) * 31;
        String str = this.name;
        int iHashCode = (((iA + (str == null ? 0 : str.hashCode())) * 31) + this.dayOfWeek) * 31;
        Long l = this.duration;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.consumption;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z = this.isFinished;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode3 + r1) * 31;
        Boolean bool = this.isToday;
        int iHashCode4 = (((i + (bool == null ? 0 : bool.hashCode())) * 31) + this.dayIndex) * 31;
        Long l2 = this.articleId;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.articleTitle;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.articleDescription;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.articleLink;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.articleImgUrl;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean isFinished() {
        return this.isFinished;
    }

    @Nullable
    public final Boolean isToday() {
        return this.isToday;
    }

    @NotNull
    public String toString() {
        return "PlanTrainingBean(id=" + this.id + ", name=" + ((Object) this.name) + ", dayOfWeek=" + this.dayOfWeek + ", duration=" + this.duration + ", consumption=" + this.consumption + ", isFinished=" + this.isFinished + ", isToday=" + this.isToday + ", dayIndex=" + this.dayIndex + ", articleId=" + this.articleId + ", articleTitle=" + ((Object) this.articleTitle) + ", articleDescription=" + ((Object) this.articleDescription) + ", articleLink=" + ((Object) this.articleLink) + ", articleImgUrl=" + ((Object) this.articleImgUrl) + ')';
    }

    public PlanTrainingBean(long j, @Nullable String str, int i, @Nullable Long l, @Nullable Integer num, boolean z, @Nullable Boolean bool, int i2, @Nullable Long l2, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.id = j;
        this.name = str;
        this.dayOfWeek = i;
        this.duration = l;
        this.consumption = num;
        this.isFinished = z;
        this.isToday = bool;
        this.dayIndex = i2;
        this.articleId = l2;
        this.articleTitle = str2;
        this.articleDescription = str3;
        this.articleLink = str4;
        this.articleImgUrl = str5;
    }

    public /* synthetic */ PlanTrainingBean(long j, String str, int i, Long l, Integer num, boolean z, Boolean bool, int i2, Long l2, String str2, String str3, String str4, String str5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i3 & 2) != 0 ? null : str, i, (i3 & 8) != 0 ? null : l, (i3 & 16) != 0 ? null : num, z, (i3 & 64) != 0 ? null : bool, i2, (i3 & 256) != 0 ? null : l2, (i3 & 512) != 0 ? null : str2, (i3 & 1024) != 0 ? null : str3, (i3 & 2048) != 0 ? null : str4, (i3 & 4096) != 0 ? null : str5);
    }
}
