package com.xiaomi.fitness.net.url;

import com.xiaomi.onetrack.api.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/net/url/DefaultUrlData;", "Lcom/xiaomi/fitness/net/url/BaseUrlData;", b.E, "", "path", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getHost", "()Ljava/lang/String;", "getPath", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultUrlData extends BaseUrlData {

    @NotNull
    private final String host;

    @NotNull
    private final String path;

    public DefaultUrlData(@NotNull String host, @NotNull String path) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(path, "path");
        this.host = host;
        this.path = path;
    }

    @Override // com.xiaomi.fitness.net.url.BaseUrlData
    @NotNull
    public String getHost() {
        return this.host;
    }

    @Override // com.xiaomi.fitness.net.url.BaseUrlData
    @NotNull
    public String getPath() {
        return this.path;
    }
}
