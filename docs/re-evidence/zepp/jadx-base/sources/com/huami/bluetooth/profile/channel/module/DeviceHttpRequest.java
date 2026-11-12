package com.huami.bluetooth.profile.channel.module;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\t\u0018\u0000  2\u00020\u0001:\u0001 BK\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR'\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/DeviceHttpRequest;", "Ljava/io/Serializable;", "", "toString", "", "a", LogUtil.I, "getSessionId", "()I", "sessionId", "b", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "url", "c", "getMethod", "method", "", GoogleApiAvailabilityLight.a, "Ljava/util/Map;", "getHeader", "()Ljava/util/Map;", "header", "", "e", "[B", "getBody", "()[B", "body", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;[B)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceHttpRequest implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int sessionId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String url;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String method;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final Map<String, String> header;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final byte[] body;

    public DeviceHttpRequest(int i, @Nullable String str, @Nullable String str2, @Nullable Map<String, String> map, @Nullable byte[] bArr) {
        this.sessionId = i;
        this.url = str;
        this.method = str2;
        this.header = map;
        this.body = bArr;
    }

    @Nullable
    public final byte[] getBody() {
        return this.body;
    }

    @Nullable
    public final Map<String, String> getHeader() {
        return this.header;
    }

    @Nullable
    public final String getMethod() {
        return this.method;
    }

    public final int getSessionId() {
        return this.sessionId;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public String toString() {
        return "DeviceHttpRequest(sessionId=" + this.sessionId + ", url=" + ((Object) this.url) + ", method=" + ((Object) this.method) + ')';
    }

    public /* synthetic */ DeviceHttpRequest(int i, String str, String str2, Map map, byte[] bArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : map, (i2 & 16) != 0 ? null : bArr);
    }
}
