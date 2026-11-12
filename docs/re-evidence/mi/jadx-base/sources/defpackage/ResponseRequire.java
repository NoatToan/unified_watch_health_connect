package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.c.q;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rq, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0015"}, d2 = {"Lrq;", "", "", "toString", "", "hashCode", "other", "", "equals", "withResponse", "Z", PluginDeviceInfo.FICONON, "()Z", "sessionId", "I", PluginDeviceInfo.FDESC, "()I", q.f13858b, PluginDeviceInfo.FMODEL, "<init>", "(ZII)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class ResponseRequire {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final boolean withResponse;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final int sessionId;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int appId;

    public ResponseRequire(boolean z, int i, int i2) {
        this.withResponse = z;
        this.sessionId = i;
        this.appId = i2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAppId() {
        return this.appId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getWithResponse() {
        return this.withResponse;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponseRequire)) {
            return false;
        }
        ResponseRequire responseRequire = (ResponseRequire) other;
        return this.withResponse == responseRequire.withResponse && this.sessionId == responseRequire.sessionId && this.appId == responseRequire.appId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.withResponse;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + Integer.hashCode(this.sessionId)) * 31) + Integer.hashCode(this.appId);
    }

    @NotNull
    public String toString() {
        return "ResponseRequire(withResponse=" + this.withResponse + ", sessionId=" + this.sessionId + ", appId=" + this.appId + ')';
    }
}
