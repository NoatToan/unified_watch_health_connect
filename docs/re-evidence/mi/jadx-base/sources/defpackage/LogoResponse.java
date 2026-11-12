package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.OneTrack;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: tk, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Ltk;", "", "", "toString", "", "hashCode", "other", "", "equals", OneTrack.Param.PKG, "Ljava/lang/String;", PluginDeviceInfo.FDESC, "()Ljava/lang/String;", "code", "I", PluginDeviceInfo.FMODEL, "()I", "<init>", "(Ljava/lang/String;I)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class LogoResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @NotNull
    public final String pkg;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final int code;

    public LogoResponse(@NotNull String pkg, int i) {
        Intrinsics.checkNotNullParameter(pkg, "pkg");
        this.pkg = pkg;
        this.code = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPkg() {
        return this.pkg;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogoResponse)) {
            return false;
        }
        LogoResponse logoResponse = (LogoResponse) other;
        return Intrinsics.areEqual(this.pkg, logoResponse.pkg) && this.code == logoResponse.code;
    }

    public int hashCode() {
        return (this.pkg.hashCode() * 31) + Integer.hashCode(this.code);
    }

    @NotNull
    public String toString() {
        return "LogoResponse(pkg=" + this.pkg + ", code=" + this.code + ')';
    }
}
