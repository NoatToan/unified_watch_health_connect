package com.huami.sleepassistant.apilib.bean;

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

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B7\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b)\u0010*BK\b\u0017\u0012\u0006\u0010+\u001a\u00020\u0014\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b)\u0010.J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0013\u001a\u00020\tHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R*\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000e\u0010\u0019\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010\u0019\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR*\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0010\u0010\u0019\u0012\u0004\b%\u0010\u001f\u001a\u0004\b#\u0010\u001b\"\u0004\b$\u0010\u001dR*\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010\u0019\u0012\u0004\b(\u0010\u001f\u001a\u0004\b&\u0010\u001b\"\u0004\b'\u0010\u001d¨\u00061"}, d2 = {"Lcom/huami/sleepassistant/apilib/bean/AudioResources;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "component3", "component4", "sleepAudioUrl", "sleepAudioId", "bigImgUrl", "smallImgUrl", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getSleepAudioUrl", "()Ljava/lang/String;", "setSleepAudioUrl", "(Ljava/lang/String;)V", "getSleepAudioUrl$annotations", "()V", "getSleepAudioId", "setSleepAudioId", "getSleepAudioId$annotations", "getBigImgUrl", "setBigImgUrl", "getBigImgUrl$annotations", "getSmallImgUrl", "setSmallImgUrl", "getSmallImgUrl$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "apilib_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class AudioResources {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private String bigImgUrl;

    @Nullable
    private String sleepAudioId;

    @Nullable
    private String sleepAudioUrl;

    @Nullable
    private String smallImgUrl;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/sleepassistant/apilib/bean/AudioResources$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/sleepassistant/apilib/bean/AudioResources;", "serializer", "<init>", "()V", "apilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<AudioResources> serializer() {
            return AudioResources$$serializer.INSTANCE;
        }
    }

    public AudioResources() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ AudioResources(int i, @SerialName("sleepAudioUrl") String str, @SerialName("sleepAudioId") String str2, @SerialName("bigImgUrl") String str3, @SerialName("smallImgUrl") String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, AudioResources$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.sleepAudioUrl = null;
        } else {
            this.sleepAudioUrl = str;
        }
        if ((i & 2) == 0) {
            this.sleepAudioId = null;
        } else {
            this.sleepAudioId = str2;
        }
        if ((i & 4) == 0) {
            this.bigImgUrl = null;
        } else {
            this.bigImgUrl = str3;
        }
        if ((i & 8) == 0) {
            this.smallImgUrl = null;
        } else {
            this.smallImgUrl = str4;
        }
    }

    public static /* synthetic */ AudioResources copy$default(AudioResources audioResources, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = audioResources.sleepAudioUrl;
        }
        if ((i & 2) != 0) {
            str2 = audioResources.sleepAudioId;
        }
        if ((i & 4) != 0) {
            str3 = audioResources.bigImgUrl;
        }
        if ((i & 8) != 0) {
            str4 = audioResources.smallImgUrl;
        }
        return audioResources.copy(str, str2, str3, str4);
    }

    @SerialName("bigImgUrl")
    public static /* synthetic */ void getBigImgUrl$annotations() {
    }

    @SerialName("sleepAudioId")
    public static /* synthetic */ void getSleepAudioId$annotations() {
    }

    @SerialName("sleepAudioUrl")
    public static /* synthetic */ void getSleepAudioUrl$annotations() {
    }

    @SerialName("smallImgUrl")
    public static /* synthetic */ void getSmallImgUrl$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull AudioResources self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.sleepAudioUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.sleepAudioUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.sleepAudioId != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.sleepAudioId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.bigImgUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.bigImgUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.smallImgUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.smallImgUrl);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSleepAudioUrl() {
        return this.sleepAudioUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSleepAudioId() {
        return this.sleepAudioId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBigImgUrl() {
        return this.bigImgUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSmallImgUrl() {
        return this.smallImgUrl;
    }

    @NotNull
    public final AudioResources copy(@Nullable String sleepAudioUrl, @Nullable String sleepAudioId, @Nullable String bigImgUrl, @Nullable String smallImgUrl) {
        return new AudioResources(sleepAudioUrl, sleepAudioId, bigImgUrl, smallImgUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioResources)) {
            return false;
        }
        AudioResources audioResources = (AudioResources) other;
        return Intrinsics.areEqual(this.sleepAudioUrl, audioResources.sleepAudioUrl) && Intrinsics.areEqual(this.sleepAudioId, audioResources.sleepAudioId) && Intrinsics.areEqual(this.bigImgUrl, audioResources.bigImgUrl) && Intrinsics.areEqual(this.smallImgUrl, audioResources.smallImgUrl);
    }

    @Nullable
    public final String getBigImgUrl() {
        return this.bigImgUrl;
    }

    @Nullable
    public final String getSleepAudioId() {
        return this.sleepAudioId;
    }

    @Nullable
    public final String getSleepAudioUrl() {
        return this.sleepAudioUrl;
    }

    @Nullable
    public final String getSmallImgUrl() {
        return this.smallImgUrl;
    }

    public int hashCode() {
        String str = this.sleepAudioUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sleepAudioId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bigImgUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.smallImgUrl;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setBigImgUrl(@Nullable String str) {
        this.bigImgUrl = str;
    }

    public final void setSleepAudioId(@Nullable String str) {
        this.sleepAudioId = str;
    }

    public final void setSleepAudioUrl(@Nullable String str) {
        this.sleepAudioUrl = str;
    }

    public final void setSmallImgUrl(@Nullable String str) {
        this.smallImgUrl = str;
    }

    @NotNull
    public String toString() {
        return "AudioResources(sleepAudioUrl=" + ((Object) this.sleepAudioUrl) + ", sleepAudioId=" + ((Object) this.sleepAudioId) + ", bigImgUrl=" + ((Object) this.bigImgUrl) + ", smallImgUrl=" + ((Object) this.smallImgUrl) + ')';
    }

    public AudioResources(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.sleepAudioUrl = str;
        this.sleepAudioId = str2;
        this.bigImgUrl = str3;
        this.smallImgUrl = str4;
    }

    public /* synthetic */ AudioResources(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
