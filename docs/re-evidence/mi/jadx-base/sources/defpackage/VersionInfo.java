package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mw, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u000bB%\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lmw;", "", "", "toString", "", "hashCode", "other", "", "equals", "version", "I", PluginDeviceInfo.FMODEL, "()I", "type", "maxContactsCount", "<init>", "(III)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class VersionInfo {

    @NotNull
    public static final a d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final int version;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int maxContactsCount;

    /* JADX INFO: renamed from: mw$a */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lmw$a;", "", "", "INVALID_VERSION", "I", "VERSION_TYPE", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public VersionInfo() {
        this(0, 0, 0, 7, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VersionInfo)) {
            return false;
        }
        VersionInfo versionInfo = (VersionInfo) other;
        return this.type == versionInfo.type && this.version == versionInfo.version && this.maxContactsCount == versionInfo.maxContactsCount;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.type) * 31) + Integer.hashCode(this.version)) * 31) + Integer.hashCode(this.maxContactsCount);
    }

    @NotNull
    public String toString() {
        return "VersionInfo(type=" + this.type + ", version=" + this.version + ", maxContactsCount=" + this.maxContactsCount + ')';
    }

    public VersionInfo(int i, int i2, int i3) {
        this.type = i;
        this.version = i2;
        this.maxContactsCount = i3;
    }

    public /* synthetic */ VersionInfo(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? 2 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
