package com.huami.bluetooth.profile.channel.module.voice.content;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/VoiceVersion;", "", "", "component1", "", "component2", "version", "supportAlexaLanguageSettings", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getVersion", "()I", "b", "Z", "getSupportAlexaLanguageSettings", "()Z", "<init>", "(IZ)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class VoiceVersion {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int version;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean supportAlexaLanguageSettings;

    public VoiceVersion(int i, boolean z) {
        this.version = i;
        this.supportAlexaLanguageSettings = z;
    }

    public static /* synthetic */ VoiceVersion copy$default(VoiceVersion voiceVersion, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = voiceVersion.version;
        }
        if ((i2 & 2) != 0) {
            z = voiceVersion.supportAlexaLanguageSettings;
        }
        return voiceVersion.copy(i, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSupportAlexaLanguageSettings() {
        return this.supportAlexaLanguageSettings;
    }

    @NotNull
    public final VoiceVersion copy(int version, boolean supportAlexaLanguageSettings) {
        return new VoiceVersion(version, supportAlexaLanguageSettings);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceVersion)) {
            return false;
        }
        VoiceVersion voiceVersion = (VoiceVersion) other;
        return this.version == voiceVersion.version && this.supportAlexaLanguageSettings == voiceVersion.supportAlexaLanguageSettings;
    }

    public final boolean getSupportAlexaLanguageSettings() {
        return this.supportAlexaLanguageSettings;
    }

    public final int getVersion() {
        return this.version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int i = this.version * 31;
        boolean z = this.supportAlexaLanguageSettings;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return i + r1;
    }

    @NotNull
    public String toString() {
        return "VoiceVersion(version=" + this.version + ", supportAlexaLanguageSettings=" + this.supportAlexaLanguageSettings + ')';
    }
}
