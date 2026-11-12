package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gu, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lgu;", "", "", "toString", "", "hashCode", "other", "", "equals", "requireEncryption", "Z", PluginDeviceInfo.FMODEL, "()Z", "moduleId", "<init>", "(IZ)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class SupportModuleInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int moduleId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final boolean requireEncryption;

    public SupportModuleInfo(int i, boolean z) {
        this.moduleId = i;
        this.requireEncryption = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getRequireEncryption() {
        return this.requireEncryption;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportModuleInfo)) {
            return false;
        }
        SupportModuleInfo supportModuleInfo = (SupportModuleInfo) other;
        return this.moduleId == supportModuleInfo.moduleId && this.requireEncryption == supportModuleInfo.requireEncryption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.moduleId) * 31;
        boolean z = this.requireEncryption;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        return "SupportModuleInfo(moduleId=" + this.moduleId + ", requireEncryption=" + this.requireEncryption + ')';
    }
}
