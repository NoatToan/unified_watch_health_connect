package com.huami.training.api.pojo;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.message.ui.submessage.SubMessageActivity;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGBO\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\r\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0012¢\u0006\u0004\bA\u0010BBg\b\u0017\u0012\u0006\u0010C\u001a\u00020\r\u0012\b\b\u0001\u0010\u0015\u001a\u00020\t\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u0017\u001a\u00020\r\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0012\u0012\b\u0010E\u001a\u0004\u0018\u00010D¢\u0006\u0004\bA\u0010FJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0012HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0012HÆ\u0003JU\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\r2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u0012HÆ\u0001J\t\u0010\u001d\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001e\u001a\u00020\rHÖ\u0001J\u0013\u0010 \u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0015\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R$\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010&\u001a\u0004\b)\u0010*R\"\u0010\u0017\u001a\u00020\r8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u0010&\u001a\u0004\b.\u0010/R$\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010(\u0012\u0004\b3\u0010&\u001a\u0004\b2\u0010*R$\u0010\u0019\u001a\u0004\u0018\u00010\u00108\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b8\u0010&\u001a\u0004\b6\u00107R\"\u0010\u001a\u001a\u00020\u00128\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b=\u0010&\u001a\u0004\b;\u0010<R\"\u0010\u001b\u001a\u00020\u00128\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b>\u0010:\u0012\u0004\b@\u0010&\u001a\u0004\b?\u0010<¨\u0006I"}, d2 = {"Lcom/huami/training/api/pojo/EntranceCardExtension;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "", "component3", "component4", "Lcom/huami/training/api/pojo/ExtensionClassify;", "component5", "", "component6", "component7", "jsbridgeAuth", "subType", "useNetworkType", "image", "classify", "startTime", "endTime", "copy", "toString", "hashCode", "other", "equals", "a", "Z", "getJsbridgeAuth", "()Z", "getJsbridgeAuth$annotations", "()V", "b", "Ljava/lang/String;", "getSubType", "()Ljava/lang/String;", "getSubType$annotations", "c", LogUtil.I, "getUseNetworkType", "()I", "getUseNetworkType$annotations", GoogleApiAvailabilityLight.a, "getImage", "getImage$annotations", "e", "Lcom/huami/training/api/pojo/ExtensionClassify;", "getClassify", "()Lcom/huami/training/api/pojo/ExtensionClassify;", "getClassify$annotations", "f", "J", "getStartTime", "()J", "getStartTime$annotations", "g", "getEndTime", "getEndTime$annotations", "<init>", "(ZLjava/lang/String;ILjava/lang/String;Lcom/huami/training/api/pojo/ExtensionClassify;JJ)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;ILjava/lang/String;Lcom/huami/training/api/pojo/ExtensionClassify;JJLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "lib_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class EntranceCardExtension {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean jsbridgeAuth;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String subType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int useNetworkType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final String image;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final ExtensionClassify classify;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final long startTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final long endTime;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/training/api/pojo/EntranceCardExtension$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/training/api/pojo/EntranceCardExtension;", "serializer", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<EntranceCardExtension> serializer() {
            return EntranceCardExtension$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ EntranceCardExtension(int i, @SerialName("jsbridge_auth") boolean z, @SerialName(SubMessageActivity.EXTRA_SUB_TYPE) String str, @SerialName("use_network_type") int i2, @SerialName("image") String str2, @SerialName("classify") ExtensionClassify extensionClassify, @SerialName("starttime") long j, @SerialName("endtime") long j2, SerializationConstructorMarker serializationConstructorMarker) {
        if (96 != (i & 96)) {
            PluginExceptionsKt.throwMissingFieldException(i, 96, EntranceCardExtension$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.jsbridgeAuth = false;
        } else {
            this.jsbridgeAuth = z;
        }
        if ((i & 2) == 0) {
            this.subType = null;
        } else {
            this.subType = str;
        }
        if ((i & 4) == 0) {
            this.useNetworkType = 0;
        } else {
            this.useNetworkType = i2;
        }
        if ((i & 8) == 0) {
            this.image = null;
        } else {
            this.image = str2;
        }
        if ((i & 16) == 0) {
            this.classify = null;
        } else {
            this.classify = extensionClassify;
        }
        this.startTime = j;
        this.endTime = j2;
    }

    @SerialName("classify")
    public static /* synthetic */ void getClassify$annotations() {
    }

    @SerialName("endtime")
    public static /* synthetic */ void getEndTime$annotations() {
    }

    @SerialName("image")
    public static /* synthetic */ void getImage$annotations() {
    }

    @SerialName("jsbridge_auth")
    public static /* synthetic */ void getJsbridgeAuth$annotations() {
    }

    @SerialName("starttime")
    public static /* synthetic */ void getStartTime$annotations() {
    }

    @SerialName(SubMessageActivity.EXTRA_SUB_TYPE)
    public static /* synthetic */ void getSubType$annotations() {
    }

    @SerialName("use_network_type")
    public static /* synthetic */ void getUseNetworkType$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull EntranceCardExtension self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.jsbridgeAuth) {
            output.encodeBooleanElement(serialDesc, 0, self.jsbridgeAuth);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.subType != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.subType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.useNetworkType != 0) {
            output.encodeIntElement(serialDesc, 2, self.useNetworkType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.image != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.image);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.classify != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, ExtensionClassify$$serializer.INSTANCE, self.classify);
        }
        output.encodeLongElement(serialDesc, 5, self.startTime);
        output.encodeLongElement(serialDesc, 6, self.endTime);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getJsbridgeAuth() {
        return this.jsbridgeAuth;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getUseNetworkType() {
        return this.useNetworkType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ExtensionClassify getClassify() {
        return this.classify;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final EntranceCardExtension copy(boolean jsbridgeAuth, @Nullable String subType, int useNetworkType, @Nullable String image, @Nullable ExtensionClassify classify, long startTime, long endTime) {
        return new EntranceCardExtension(jsbridgeAuth, subType, useNetworkType, image, classify, startTime, endTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntranceCardExtension)) {
            return false;
        }
        EntranceCardExtension entranceCardExtension = (EntranceCardExtension) other;
        return this.jsbridgeAuth == entranceCardExtension.jsbridgeAuth && Intrinsics.areEqual(this.subType, entranceCardExtension.subType) && this.useNetworkType == entranceCardExtension.useNetworkType && Intrinsics.areEqual(this.image, entranceCardExtension.image) && Intrinsics.areEqual(this.classify, entranceCardExtension.classify) && this.startTime == entranceCardExtension.startTime && this.endTime == entranceCardExtension.endTime;
    }

    @Nullable
    public final ExtensionClassify getClassify() {
        return this.classify;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    public final boolean getJsbridgeAuth() {
        return this.jsbridgeAuth;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getSubType() {
        return this.subType;
    }

    public final int getUseNetworkType() {
        return this.useNetworkType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    public int hashCode() {
        boolean z = this.jsbridgeAuth;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.subType;
        int iHashCode = (((i + (str == null ? 0 : str.hashCode())) * 31) + this.useNetworkType) * 31;
        String str2 = this.image;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ExtensionClassify extensionClassify = this.classify;
        return ((((iHashCode2 + (extensionClassify != null ? extensionClassify.hashCode() : 0)) * 31) + b.a(this.startTime)) * 31) + b.a(this.endTime);
    }

    @NotNull
    public String toString() {
        return "EntranceCardExtension(jsbridgeAuth=" + this.jsbridgeAuth + ", subType=" + ((Object) this.subType) + ", useNetworkType=" + this.useNetworkType + ", image=" + ((Object) this.image) + ", classify=" + this.classify + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ')';
    }

    public EntranceCardExtension(boolean z, @Nullable String str, int i, @Nullable String str2, @Nullable ExtensionClassify extensionClassify, long j, long j2) {
        this.jsbridgeAuth = z;
        this.subType = str;
        this.useNetworkType = i;
        this.image = str2;
        this.classify = extensionClassify;
        this.startTime = j;
        this.endTime = j2;
    }

    public /* synthetic */ EntranceCardExtension(boolean z, String str, int i, String str2, ExtensionClassify extensionClassify, long j, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : extensionClassify, j, j2);
    }
}
