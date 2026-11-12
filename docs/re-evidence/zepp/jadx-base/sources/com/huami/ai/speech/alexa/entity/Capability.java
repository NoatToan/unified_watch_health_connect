package com.huami.ai.speech.alexa.entity;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u0000 \"*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\"B)\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b \u0010!J\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ@\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u001c\u0010\t\u001a\u00020\u00038\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u00020\u00038\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u000b\u001a\u00020\u00038\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001e\u0010\f\u001a\u0004\u0018\u00018\u00008\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\b¨\u0006#"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/Capability;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "component1", "component2", "component3", "component4", "()Ljava/lang/Object;", "type", "interfaceName", "version", "configurations", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/huami/ai/speech/alexa/entity/Capability;", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "b", "getInterfaceName", "c", "getVersion", GoogleApiAvailabilityLight.a, "Ljava/lang/Object;", "getConfigurations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "Companion", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Capability<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("interface")
    @NotNull
    private final String interfaceName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("version")
    @NotNull
    private final String version;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("configurations")
    @Nullable
    private final T configurations;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002¨\u0006\u000e"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/Capability$Companion;", "", "", "version", "Lcom/huami/ai/speech/alexa/entity/Capability;", "Lcom/huami/ai/speech/alexa/entity/CapabilityConfiguration;", "system", "speechRecognizer", "speechSynthesizer", "configurations", "alert", "apiGateway", "<init>", "()V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Capability alert$default(Companion companion, String str, CapabilityConfiguration capabilityConfiguration, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "1.3";
            }
            return companion.alert(str, capabilityConfiguration);
        }

        public static /* synthetic */ Capability apiGateway$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "1.0";
            }
            return companion.apiGateway(str);
        }

        public static /* synthetic */ Capability speechRecognizer$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "2.3";
            }
            return companion.speechRecognizer(str);
        }

        public static /* synthetic */ Capability speechSynthesizer$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "1.3";
            }
            return companion.speechSynthesizer(str);
        }

        public static /* synthetic */ Capability system$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "2.0";
            }
            return companion.system(str);
        }

        @NotNull
        public final Capability<CapabilityConfiguration> alert(@NotNull String version, @NotNull CapabilityConfiguration configurations) {
            return new Capability<>("AlexaInterface", "Alerts", version, configurations);
        }

        @NotNull
        public final Capability<CapabilityConfiguration> apiGateway(@NotNull String version) {
            return new Capability<>("AlexaInterface", "Alexa.ApiGateway", version, null);
        }

        @NotNull
        public final Capability<CapabilityConfiguration> speechRecognizer(@NotNull String version) {
            return new Capability<>("AlexaInterface", "SpeechRecognizer", version, null);
        }

        @NotNull
        public final Capability<CapabilityConfiguration> speechSynthesizer(@NotNull String version) {
            return new Capability<>("AlexaInterface", "SpeechSynthesizer", version, null);
        }

        @NotNull
        public final Capability<CapabilityConfiguration> system(@NotNull String version) {
            return new Capability<>("AlexaInterface", "System", version, null);
        }
    }

    public Capability(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable T t) {
        this.type = str;
        this.interfaceName = str2;
        this.version = str3;
        this.configurations = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Capability copy$default(Capability capability, String str, String str2, String str3, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = capability.type;
        }
        if ((i & 2) != 0) {
            str2 = capability.interfaceName;
        }
        if ((i & 4) != 0) {
            str3 = capability.version;
        }
        if ((i & 8) != 0) {
            obj = capability.configurations;
        }
        return capability.copy(str, str2, str3, obj);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInterfaceName() {
        return this.interfaceName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @Nullable
    public final T component4() {
        return this.configurations;
    }

    @NotNull
    public final Capability<T> copy(@NotNull String type, @NotNull String interfaceName, @NotNull String version, @Nullable T configurations) {
        return new Capability<>(type, interfaceName, version, configurations);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Capability)) {
            return false;
        }
        Capability capability = (Capability) other;
        return Intrinsics.areEqual(this.type, capability.type) && Intrinsics.areEqual(this.interfaceName, capability.interfaceName) && Intrinsics.areEqual(this.version, capability.version) && Intrinsics.areEqual(this.configurations, capability.configurations);
    }

    @Nullable
    public final T getConfigurations() {
        return this.configurations;
    }

    @NotNull
    public final String getInterfaceName() {
        return this.interfaceName;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = ((((this.type.hashCode() * 31) + this.interfaceName.hashCode()) * 31) + this.version.hashCode()) * 31;
        T t = this.configurations;
        return iHashCode + (t == null ? 0 : t.hashCode());
    }

    @NotNull
    public String toString() {
        return "Capability(type=" + this.type + ", interfaceName=" + this.interfaceName + ", version=" + this.version + ", configurations=" + this.configurations + ')';
    }
}
