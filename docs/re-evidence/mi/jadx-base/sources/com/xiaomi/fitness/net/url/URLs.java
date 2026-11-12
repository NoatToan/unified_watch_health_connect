package com.xiaomi.fitness.net.url;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/net/url/URLs;", "", "<init>", "()V", "HEALTH_HOST", "", "HEALTH_URL", "HEALTH_RESEARCH_HOST", "HEALTH_RESEARCH_URL", "WEB_HOST", "WEB_URL", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class URLs {

    @NotNull
    public static final String HEALTH_HOST = "hlth.io.mi.com";

    @NotNull
    public static final String HEALTH_RESEARCH_HOST = "hlth.research.xiaomiwear.com";

    @NotNull
    public static final String HEALTH_RESEARCH_URL = "https://hlth.research.xiaomiwear.com/";

    @NotNull
    public static final String HEALTH_URL = "https://hlth.io.mi.com/";

    @NotNull
    public static final URLs INSTANCE = new URLs();

    @NotNull
    public static final String WEB_HOST = "watch.xiaomiwear.com";

    @NotNull
    public static final String WEB_URL = "https://watch.xiaomiwear.com/html";

    private URLs() {
    }
}
