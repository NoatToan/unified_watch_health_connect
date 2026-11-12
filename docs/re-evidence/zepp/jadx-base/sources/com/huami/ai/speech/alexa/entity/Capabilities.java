package com.huami.ai.speech.alexa.entity;

import com.google.gson.annotations.SerializedName;
import com.huami.ai.helper.VoiceConfigFuncKt;
import com.huami.bluetooth.profile.channel.module.voice.VoiceConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB#\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0015\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004HÆ\u0003J)\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R(\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/Capabilities;", "", "", "component1", "", "Lcom/huami/ai/speech/alexa/entity/Capability;", "Lcom/huami/ai/speech/alexa/entity/CapabilityConfiguration;", "component2", "version", "capabilities", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "b", "Ljava/util/List;", "getCapabilities", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Companion", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Capabilities {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("envelopeVersion")
    @NotNull
    private final String version;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("capabilities")
    @NotNull
    private final List<Capability<CapabilityConfiguration>> capabilities;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/Capabilities$Companion;", "", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "voiceConfig", "Lcom/huami/ai/speech/alexa/entity/Capabilities;", "create", "<init>", "()V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Capabilities create(@NotNull VoiceConfig voiceConfig) {
            Capability.Companion companion = Capability.INSTANCE;
            List listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(Capability.Companion.system$default(companion, null, 1, null), Capability.Companion.speechRecognizer$default(companion, null, 1, null), Capability.Companion.speechSynthesizer$default(companion, null, 1, null), Capability.Companion.apiGateway$default(companion, null, 1, null));
            Integer numMaxAlarmCount = VoiceConfigFuncKt.maxAlarmCount(voiceConfig);
            if (numMaxAlarmCount != null) {
                listMutableListOf.add(Capability.Companion.alert$default(companion, null, new AlertCapabilityConfiguration(new MaximumAlerts(Integer.MAX_VALUE, numMaxAlarmCount.intValue(), Integer.MAX_VALUE)), 1, null));
            }
            return new Capabilities("20160207", listMutableListOf);
        }
    }

    public Capabilities(@NotNull String str, @NotNull List<Capability<CapabilityConfiguration>> list) {
        this.version = str;
        this.capabilities = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Capabilities copy$default(Capabilities capabilities, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = capabilities.version;
        }
        if ((i & 2) != 0) {
            list = capabilities.capabilities;
        }
        return capabilities.copy(str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    public final List<Capability<CapabilityConfiguration>> component2() {
        return this.capabilities;
    }

    @NotNull
    public final Capabilities copy(@NotNull String version, @NotNull List<Capability<CapabilityConfiguration>> capabilities) {
        return new Capabilities(version, capabilities);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Capabilities)) {
            return false;
        }
        Capabilities capabilities = (Capabilities) other;
        return Intrinsics.areEqual(this.version, capabilities.version) && Intrinsics.areEqual(this.capabilities, capabilities.capabilities);
    }

    @NotNull
    public final List<Capability<CapabilityConfiguration>> getCapabilities() {
        return this.capabilities;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (this.version.hashCode() * 31) + this.capabilities.hashCode();
    }

    @NotNull
    public String toString() {
        return "Capabilities(version=" + this.version + ", capabilities=" + this.capabilities + ')';
    }
}
