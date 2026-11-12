package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: hp, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lhp;", "", "", "toString", "", PluginDeviceInfo.FICONOFF, "", "code", "I", PluginDeviceInfo.FMODEL, "()I", "receiveSize", PluginDeviceInfo.FICONON, "", "receiveDataCrc", "J", PluginDeviceInfo.FDESC, "()J", "<init>", "(IIJ)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class PrepareResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final int receiveSize;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final long receiveDataCrc;

    public PrepareResponse(int i, int i2, long j) {
        this.code = i;
        this.receiveSize = i2;
        this.receiveDataCrc = j;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getReceiveDataCrc() {
        return this.receiveDataCrc;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getReceiveSize() {
        return this.receiveSize;
    }

    public final boolean d() {
        return this.code == 1;
    }

    @NotNull
    public String toString() {
        return "PrepareResponse(code=" + this.code + ", receiveSize=" + this.receiveSize + ", receiveDataCrc=" + this.receiveDataCrc + ')';
    }
}
