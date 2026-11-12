package com.huami.training.api.pojo;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.sportlib.gpx.data.GPXTrackPoint;
import com.huami.training.api.TargetModeBo;
import com.huami.training.api.ks.TargetModeBoSerializer;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCBW\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b=\u0010>Bo\b\u0017\u0012\u0006\u0010?\u001a\u00020\u001c\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\b=\u0010BJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003J[\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\t\u0010\u001b\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\u0013\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0013\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R$\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010\"\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010$R$\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010\"\u0012\u0004\b,\u0010&\u001a\u0004\b+\u0010$R$\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010\"\u0012\u0004\b/\u0010&\u001a\u0004\b.\u0010$R$\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010\"\u0012\u0004\b2\u0010&\u001a\u0004\b1\u0010$R$\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b7\u0010&\u001a\u0004\b5\u00106R$\u0010\u0019\u001a\u0004\u0018\u00010\u00118\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b<\u0010&\u001a\u0004\b:\u0010;¨\u0006E"}, d2 = {"Lcom/huami/training/api/pojo/EntranceCardBean;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "component3", "component4", "component5", "Lcom/huami/training/api/TargetModeBo;", "component6", "Lcom/huami/training/api/pojo/EntranceCardExtension;", "component7", "id", "title", MessengerShareContentUtility.SUBTITLE, "imageUrl", "targetUrl", "targetMode", GPXTrackPoint.XML.TAG_EXTENSIONS, "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "()V", "b", "getTitle", "getTitle$annotations", "c", "getSubtitle", "getSubtitle$annotations", GoogleApiAvailabilityLight.a, "getImageUrl", "getImageUrl$annotations", "e", "getTargetUrl", "getTargetUrl$annotations", "f", "Lcom/huami/training/api/TargetModeBo;", "getTargetMode", "()Lcom/huami/training/api/TargetModeBo;", "getTargetMode$annotations", "g", "Lcom/huami/training/api/pojo/EntranceCardExtension;", "getExtensions", "()Lcom/huami/training/api/pojo/EntranceCardExtension;", "getExtensions$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huami/training/api/TargetModeBo;Lcom/huami/training/api/pojo/EntranceCardExtension;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huami/training/api/TargetModeBo;Lcom/huami/training/api/pojo/EntranceCardExtension;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "lib_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class EntranceCardBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final String imageUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final String targetUrl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final TargetModeBo targetMode;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private final EntranceCardExtension extensions;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/training/api/pojo/EntranceCardBean$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/training/api/pojo/EntranceCardBean;", "serializer", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<EntranceCardBean> serializer() {
            return EntranceCardBean$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ EntranceCardBean(int i, @SerialName("id") String str, @SerialName("title") String str2, @SerialName("describe") String str3, @SerialName("image") String str4, @SerialName("target") String str5, @SerialName("mode") @Serializable(with = TargetModeBoSerializer.class) TargetModeBo targetModeBo, @SerialName(GPXTrackPoint.XML.TAG_EXTENSIONS) EntranceCardExtension entranceCardExtension, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, EntranceCardBean$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str3;
        }
        if ((i & 8) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str4;
        }
        if ((i & 16) == 0) {
            this.targetUrl = null;
        } else {
            this.targetUrl = str5;
        }
        if ((i & 32) == 0) {
            this.targetMode = null;
        } else {
            this.targetMode = targetModeBo;
        }
        if ((i & 64) == 0) {
            this.extensions = null;
        } else {
            this.extensions = entranceCardExtension;
        }
    }

    public static /* synthetic */ EntranceCardBean copy$default(EntranceCardBean entranceCardBean, String str, String str2, String str3, String str4, String str5, TargetModeBo targetModeBo, EntranceCardExtension entranceCardExtension, int i, Object obj) {
        if ((i & 1) != 0) {
            str = entranceCardBean.id;
        }
        if ((i & 2) != 0) {
            str2 = entranceCardBean.title;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = entranceCardBean.subtitle;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = entranceCardBean.imageUrl;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = entranceCardBean.targetUrl;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            targetModeBo = entranceCardBean.targetMode;
        }
        TargetModeBo targetModeBo2 = targetModeBo;
        if ((i & 64) != 0) {
            entranceCardExtension = entranceCardBean.extensions;
        }
        return entranceCardBean.copy(str, str6, str7, str8, str9, targetModeBo2, entranceCardExtension);
    }

    @SerialName(GPXTrackPoint.XML.TAG_EXTENSIONS)
    public static /* synthetic */ void getExtensions$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName("image")
    public static /* synthetic */ void getImageUrl$annotations() {
    }

    @SerialName("describe")
    public static /* synthetic */ void getSubtitle$annotations() {
    }

    @SerialName("mode")
    @Serializable(with = TargetModeBoSerializer.class)
    public static /* synthetic */ void getTargetMode$annotations() {
    }

    @SerialName("target")
    public static /* synthetic */ void getTargetUrl$annotations() {
    }

    @SerialName("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull EntranceCardBean self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.imageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.imageUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.targetUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.targetUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.targetMode != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, new TargetModeBoSerializer(), self.targetMode);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.extensions != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, EntranceCardExtension$$serializer.INSTANCE, self.extensions);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTargetUrl() {
        return this.targetUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TargetModeBo getTargetMode() {
        return this.targetMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final EntranceCardExtension getExtensions() {
        return this.extensions;
    }

    @NotNull
    public final EntranceCardBean copy(@NotNull String id, @Nullable String title, @Nullable String subtitle, @Nullable String imageUrl, @Nullable String targetUrl, @Nullable TargetModeBo targetMode, @Nullable EntranceCardExtension extensions) {
        return new EntranceCardBean(id, title, subtitle, imageUrl, targetUrl, targetMode, extensions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntranceCardBean)) {
            return false;
        }
        EntranceCardBean entranceCardBean = (EntranceCardBean) other;
        return Intrinsics.areEqual(this.id, entranceCardBean.id) && Intrinsics.areEqual(this.title, entranceCardBean.title) && Intrinsics.areEqual(this.subtitle, entranceCardBean.subtitle) && Intrinsics.areEqual(this.imageUrl, entranceCardBean.imageUrl) && Intrinsics.areEqual(this.targetUrl, entranceCardBean.targetUrl) && this.targetMode == entranceCardBean.targetMode && Intrinsics.areEqual(this.extensions, entranceCardBean.extensions);
    }

    @Nullable
    public final EntranceCardExtension getExtensions() {
        return this.extensions;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    public final TargetModeBo getTargetMode() {
        return this.targetMode;
    }

    @Nullable
    public final String getTargetUrl() {
        return this.targetUrl;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.targetUrl;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        TargetModeBo targetModeBo = this.targetMode;
        int iHashCode6 = (iHashCode5 + (targetModeBo == null ? 0 : targetModeBo.hashCode())) * 31;
        EntranceCardExtension entranceCardExtension = this.extensions;
        return iHashCode6 + (entranceCardExtension != null ? entranceCardExtension.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EntranceCardBean(id=" + this.id + ", title=" + ((Object) this.title) + ", subtitle=" + ((Object) this.subtitle) + ", imageUrl=" + ((Object) this.imageUrl) + ", targetUrl=" + ((Object) this.targetUrl) + ", targetMode=" + this.targetMode + ", extensions=" + this.extensions + ')';
    }

    public EntranceCardBean(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable TargetModeBo targetModeBo, @Nullable EntranceCardExtension entranceCardExtension) {
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
        this.imageUrl = str4;
        this.targetUrl = str5;
        this.targetMode = targetModeBo;
        this.extensions = entranceCardExtension;
    }

    public /* synthetic */ EntranceCardBean(String str, String str2, String str3, String str4, String str5, TargetModeBo targetModeBo, EntranceCardExtension entranceCardExtension, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : targetModeBo, (i & 64) == 0 ? entranceCardExtension : null);
    }
}
