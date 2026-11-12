package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.OneTrack;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sk, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u001a"}, d2 = {"Lsk;", "", "", "toString", "", "hashCode", "other", "", "equals", OneTrack.Param.PKG, "Ljava/lang/String;", PluginDeviceInfo.FICONON, "()Ljava/lang/String;", "Lrk;", "format", "Lrk;", PluginDeviceInfo.FMODEL, "()Lrk;", "width", "I", PluginDeviceInfo.FICONOFF, "()I", "height", PluginDeviceInfo.FDESC, "<init>", "(Ljava/lang/String;Lrk;II)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class LogoRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @NotNull
    public final String pkg;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @NotNull
    public final rk format;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int width;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final int height;

    public LogoRequest(@NotNull String pkg, @NotNull rk format, int i, int i2) {
        Intrinsics.checkNotNullParameter(pkg, "pkg");
        Intrinsics.checkNotNullParameter(format, "format");
        this.pkg = pkg;
        this.format = format;
        this.width = i;
        this.height = i2;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final rk getFormat() {
        return this.format;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPkg() {
        return this.pkg;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogoRequest)) {
            return false;
        }
        LogoRequest logoRequest = (LogoRequest) other;
        return Intrinsics.areEqual(this.pkg, logoRequest.pkg) && this.format == logoRequest.format && this.width == logoRequest.width && this.height == logoRequest.height;
    }

    public int hashCode() {
        return (((((this.pkg.hashCode() * 31) + this.format.hashCode()) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height);
    }

    @NotNull
    public String toString() {
        return "LogoRequest(pkg=" + this.pkg + ", format=" + this.format + ", width=" + this.width + ", height=" + this.height + ')';
    }
}
