package com.huami.bluetooth.profile.channel;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ResponseRequire;", "", "", "component1", "", "component2", "component3", "withResponse", "sessionId", "appId", "copy", "", "toString", "hashCode", "other", "equals", "a", "Z", "getWithResponse", "()Z", "b", LogUtil.I, "getSessionId", "()I", "c", "getAppId", "<init>", "(ZII)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ResponseRequire {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean withResponse;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int sessionId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int appId;

    public ResponseRequire(boolean z, int i, int i2) {
        this.withResponse = z;
        this.sessionId = i;
        this.appId = i2;
    }

    public static /* synthetic */ ResponseRequire copy$default(ResponseRequire responseRequire, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = responseRequire.withResponse;
        }
        if ((i3 & 2) != 0) {
            i = responseRequire.sessionId;
        }
        if ((i3 & 4) != 0) {
            i2 = responseRequire.appId;
        }
        return responseRequire.copy(z, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getWithResponse() {
        return this.withResponse;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAppId() {
        return this.appId;
    }

    @NotNull
    public final ResponseRequire copy(boolean withResponse, int sessionId, int appId) {
        return new ResponseRequire(withResponse, sessionId, appId);
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

    public final int getAppId() {
        return this.appId;
    }

    public final int getSessionId() {
        return this.sessionId;
    }

    public final boolean getWithResponse() {
        return this.withResponse;
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
        return (((r0 * 31) + this.sessionId) * 31) + this.appId;
    }

    @NotNull
    public String toString() {
        return "ResponseRequire(withResponse=" + this.withResponse + ", sessionId=" + this.sessionId + ", appId=" + this.appId + ')';
    }

    public /* synthetic */ ResponseRequire(boolean z, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }
}
