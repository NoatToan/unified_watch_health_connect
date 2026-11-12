package com.xiaomi.fitness.webview;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/webview/WebviewConstants;", "", "<init>", "()V", "DOMAIN_XIAOMI_TV_PRODUCT", "", "DOMAIN_XIAOMI_TV_TEST", "DOMAIN_MIBI_PRODUCT", "DOMAIN_MIBI_STAGING", "DOMAIN_MIBI_MAGIC", "webview_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WebviewConstants {

    @NotNull
    public static final String DOMAIN_MIBI_MAGIC = "api.mibimagic.xiaomi.com";

    @NotNull
    public static final String DOMAIN_MIBI_PRODUCT = "m.mibi.mi.com";

    @NotNull
    public static final String DOMAIN_MIBI_STAGING = "m.staging.mibi.n.xiaomi.com";

    @NotNull
    public static final String DOMAIN_XIAOMI_TV_PRODUCT = "h5.tv.mi.com";

    @NotNull
    public static final String DOMAIN_XIAOMI_TV_TEST = "h5-test.sys.tv.mi.com";

    @NotNull
    public static final WebviewConstants INSTANCE = new WebviewConstants();

    private WebviewConstants() {
    }
}
