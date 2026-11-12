package defpackage;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rw, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u000e"}, d2 = {"Lrw;", "", "", "toString", "", "hashCode", "other", "", "equals", "version", "supportAlexaLanguageSettings", "supportAlexaNotification", "<init>", "(IZZ)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class VoiceVersion {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int version;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final boolean supportAlexaLanguageSettings;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final boolean supportAlexaNotification;

    public VoiceVersion(int i, boolean z, boolean z2) {
        this.version = i;
        this.supportAlexaLanguageSettings = z;
        this.supportAlexaNotification = z2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceVersion)) {
            return false;
        }
        VoiceVersion voiceVersion = (VoiceVersion) other;
        return this.version == voiceVersion.version && this.supportAlexaLanguageSettings == voiceVersion.supportAlexaLanguageSettings && this.supportAlexaNotification == voiceVersion.supportAlexaNotification;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.version) * 31;
        boolean z = this.supportAlexaLanguageSettings;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.supportAlexaNotification;
        return i + (z2 ? 1 : z2);
    }

    @NotNull
    public String toString() {
        return "VoiceVersion(version=" + this.version + ", supportAlexaLanguageSettings=" + this.supportAlexaLanguageSettings + ", supportAlexaNotification=" + this.supportAlexaNotification + ')';
    }
}
