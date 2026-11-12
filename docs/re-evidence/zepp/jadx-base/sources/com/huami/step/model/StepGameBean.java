package com.huami.step.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.style.constant.BackgroundStyleConstant;
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

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0002MLBu\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\bF\u0010GB\u0089\u0001\b\u0017\u0012\u0006\u0010H\u001a\u00020\t\u0012\b\b\u0001\u0010\u0015\u001a\u00020\t\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u0018\u001a\u00020\t\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0001\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010J\u001a\u0004\u0018\u00010I¢\u0006\u0004\bF\u0010KJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\tHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u000bHÆ\u0003Jw\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00112\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010\u001f\u001a\u00020\u000bHÖ\u0001J\t\u0010 \u001a\u00020\tHÖ\u0001J\u0013\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0015\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R$\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010)\u001a\u0004\b,\u0010-R$\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010+\u0012\u0004\b1\u0010)\u001a\u0004\b0\u0010-R\"\u0010\u0018\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010%\u0012\u0004\b4\u0010)\u001a\u0004\b3\u0010'R$\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010+\u0012\u0004\b7\u0010)\u001a\u0004\b6\u0010-R$\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u0010+\u0012\u0004\b:\u0010)\u001a\u0004\b9\u0010-R*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00118\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b?\u0010)\u001a\u0004\b=\u0010>R$\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b@\u0010+\u0012\u0004\bB\u0010)\u001a\u0004\bA\u0010-R$\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bC\u0010+\u0012\u0004\bE\u0010)\u001a\u0004\bD\u0010-¨\u0006N"}, d2 = {"Lcom/huami/step/model/StepGameBean;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "", "component7", "component8", "component9", "status", "activity_link", "name", "participants", "participants_text", "percentage", "profiles", "background_image_url", BackgroundStyleConstant.BACKGROUND_COLOR, "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getStatus", "()I", "getStatus$annotations", "()V", "b", "Ljava/lang/String;", "getActivity_link", "()Ljava/lang/String;", "getActivity_link$annotations", "c", "getName", "getName$annotations", GoogleApiAvailabilityLight.a, "getParticipants", "getParticipants$annotations", "e", "getParticipants_text", "getParticipants_text$annotations", "f", "getPercentage", "getPercentage$annotations", "g", "Ljava/util/List;", "getProfiles", "()Ljava/util/List;", "getProfiles$annotations", "h", "getBackground_image_url", "getBackground_image_url$annotations", "i", "getBackground_color", "getBackground_color$annotations", "<init>", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "step_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class StepGameBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int status;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String activity_link;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int participants;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final String participants_text;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final String percentage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private final List<String> profiles;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private final String background_image_url;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private final String background_color;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/step/model/StepGameBean$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/step/model/StepGameBean;", "serializer", "<init>", "()V", "step_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<StepGameBean> serializer() {
            return StepGameBean$$serializer.INSTANCE;
        }
    }

    public StepGameBean() {
        this(0, (String) null, (String) null, 0, (String) null, (String) null, (List) null, (String) null, (String) null, 511, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ StepGameBean(int i, @SerialName("status") int i2, @SerialName("activity_link") String str, @SerialName("name") String str2, @SerialName("participants") int i3, @SerialName("participants_text") String str3, @SerialName("percentage") String str4, @SerialName("profiles") List list, @SerialName("background_image_url") String str5, @SerialName(BackgroundStyleConstant.BACKGROUND_COLOR) String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, StepGameBean$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.status = 0;
        } else {
            this.status = i2;
        }
        if ((i & 2) == 0) {
            this.activity_link = null;
        } else {
            this.activity_link = str;
        }
        if ((i & 4) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i & 8) == 0) {
            this.participants = 0;
        } else {
            this.participants = i3;
        }
        if ((i & 16) == 0) {
            this.participants_text = null;
        } else {
            this.participants_text = str3;
        }
        if ((i & 32) == 0) {
            this.percentage = null;
        } else {
            this.percentage = str4;
        }
        if ((i & 64) == 0) {
            this.profiles = null;
        } else {
            this.profiles = list;
        }
        if ((i & 128) == 0) {
            this.background_image_url = null;
        } else {
            this.background_image_url = str5;
        }
        if ((i & 256) == 0) {
            this.background_color = null;
        } else {
            this.background_color = str6;
        }
    }

    @SerialName("activity_link")
    public static /* synthetic */ void getActivity_link$annotations() {
    }

    @SerialName(BackgroundStyleConstant.BACKGROUND_COLOR)
    public static /* synthetic */ void getBackground_color$annotations() {
    }

    @SerialName("background_image_url")
    public static /* synthetic */ void getBackground_image_url$annotations() {
    }

    @SerialName("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @SerialName("participants")
    public static /* synthetic */ void getParticipants$annotations() {
    }

    @SerialName("participants_text")
    public static /* synthetic */ void getParticipants_text$annotations() {
    }

    @SerialName("percentage")
    public static /* synthetic */ void getPercentage$annotations() {
    }

    @SerialName("profiles")
    public static /* synthetic */ void getProfiles$annotations() {
    }

    @SerialName("status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull StepGameBean self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.status != 0) {
            output.encodeIntElement(serialDesc, 0, self.status);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.activity_link != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.activity_link);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.name != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.name);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.participants != 0) {
            output.encodeIntElement(serialDesc, 3, self.participants);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.participants_text != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.participants_text);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.percentage != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.percentage);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.profiles != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, new ArrayListSerializer(StringSerializer.INSTANCE), self.profiles);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.background_image_url != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.background_image_url);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.background_color != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.background_color);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getActivity_link() {
        return this.activity_link;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getParticipants() {
        return this.participants;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getParticipants_text() {
        return this.participants_text;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPercentage() {
        return this.percentage;
    }

    @Nullable
    public final List<String> component7() {
        return this.profiles;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBackground_image_url() {
        return this.background_image_url;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBackground_color() {
        return this.background_color;
    }

    @NotNull
    public final StepGameBean copy(int status, @Nullable String activity_link, @Nullable String name, int participants, @Nullable String participants_text, @Nullable String percentage, @Nullable List<String> profiles, @Nullable String background_image_url, @Nullable String background_color) {
        return new StepGameBean(status, activity_link, name, participants, participants_text, percentage, profiles, background_image_url, background_color);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepGameBean)) {
            return false;
        }
        StepGameBean stepGameBean = (StepGameBean) other;
        return this.status == stepGameBean.status && Intrinsics.areEqual(this.activity_link, stepGameBean.activity_link) && Intrinsics.areEqual(this.name, stepGameBean.name) && this.participants == stepGameBean.participants && Intrinsics.areEqual(this.participants_text, stepGameBean.participants_text) && Intrinsics.areEqual(this.percentage, stepGameBean.percentage) && Intrinsics.areEqual(this.profiles, stepGameBean.profiles) && Intrinsics.areEqual(this.background_image_url, stepGameBean.background_image_url) && Intrinsics.areEqual(this.background_color, stepGameBean.background_color);
    }

    @Nullable
    public final String getActivity_link() {
        return this.activity_link;
    }

    @Nullable
    public final String getBackground_color() {
        return this.background_color;
    }

    @Nullable
    public final String getBackground_image_url() {
        return this.background_image_url;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getParticipants() {
        return this.participants;
    }

    @Nullable
    public final String getParticipants_text() {
        return this.participants_text;
    }

    @Nullable
    public final String getPercentage() {
        return this.percentage;
    }

    @Nullable
    public final List<String> getProfiles() {
        return this.profiles;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        int i = this.status * 31;
        String str = this.activity_link;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.participants) * 31;
        String str3 = this.participants_text;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.percentage;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.profiles;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.background_image_url;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.background_color;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "StepGameBean(status=" + this.status + ", activity_link=" + this.activity_link + ", name=" + this.name + ", participants=" + this.participants + ", participants_text=" + this.participants_text + ", percentage=" + this.percentage + ", profiles=" + this.profiles + ", background_image_url=" + this.background_image_url + ", background_color=" + this.background_color + ")";
    }

    public StepGameBean(int i, @Nullable String str, @Nullable String str2, int i2, @Nullable String str3, @Nullable String str4, @Nullable List<String> list, @Nullable String str5, @Nullable String str6) {
        this.status = i;
        this.activity_link = str;
        this.name = str2;
        this.participants = i2;
        this.participants_text = str3;
        this.percentage = str4;
        this.profiles = list;
        this.background_image_url = str5;
        this.background_color = str6;
    }

    public /* synthetic */ StepGameBean(int i, String str, String str2, int i2, String str3, String str4, List list, String str5, String str6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : str2, (i3 & 8) == 0 ? i2 : 0, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? null : str4, (i3 & 64) != 0 ? null : list, (i3 & 128) != 0 ? null : str5, (i3 & 256) == 0 ? str6 : null);
    }
}
