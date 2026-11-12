package com.huami.bluetooth.profile.channel.module;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\t\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cBK\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/DeviceHttpRequest;", "Ljava/io/Serializable;", "", "toString", "", "sessionId", "I", "getSessionId", "()I", "url", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "method", "getMethod", "", "header", "Ljava/util/Map;", "getHeader", "()Ljava/util/Map;", "", "body", "[B", "getBody", "()[B", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;[B)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class DeviceHttpRequest implements Serializable {
    private static final long serialVersionUID = 1;

    @Nullable
    private final byte[] body;

    @Nullable
    private final Map<String, String> header;

    @Nullable
    private final String method;
    private final int sessionId;

    @Nullable
    private final String url;

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
        return "DeviceHttpRequest(sessionId=" + this.sessionId + ", url=" + this.url + ", method=" + this.method + ')';
    }

    public /* synthetic */ DeviceHttpRequest(int i, String str, String str2, Map map, byte[] bArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : map, (i2 & 16) != 0 ? null : bArr);
    }
}
