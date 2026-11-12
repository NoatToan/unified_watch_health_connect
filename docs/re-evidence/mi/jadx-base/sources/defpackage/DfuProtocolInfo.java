package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o7, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000f"}, d2 = {"Lo7;", "", "", "toString", "", "version", "I", PluginDeviceInfo.FDESC, "()I", "maxChunkSize", PluginDeviceInfo.FMODEL, "code", "backGroundUpgrade", "<init>", "(IIII)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class DfuProtocolInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final int version;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int maxChunkSize;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final int backGroundUpgrade;

    public DfuProtocolInfo(int i, int i2, int i3, int i4) {
        this.code = i;
        this.version = i2;
        this.maxChunkSize = i3;
        this.backGroundUpgrade = i4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getMaxChunkSize() {
        return this.maxChunkSize;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @NotNull
    public String toString() {
        return "DfuProtocolInfo(code=" + this.code + ", version=" + this.version + ", maxChunkSize=" + this.maxChunkSize + ", backGroundUpgrade=" + this.backGroundUpgrade + ", desc=" + bm.v.a(this.code).getU() + ')';
    }
}
