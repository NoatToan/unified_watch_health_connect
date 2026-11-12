package com.huami.sleepassistant.lib.jsbridge;

import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.huami.discovery.bridge.model.WebItem;
import com.huami.network.hmnetwork.server.HMServerDef;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/sleepassistant/lib/jsbridge/BridgeConstant;", "", "Lcom/huami/discovery/bridge/model/WebItem;", "buildWebItem", "buildMiWebItem", "<init>", "()V", MAPCookie.KEY_PATH, "lib_release"}, k = 1, mv = {1, 5, 1})
public final class BridgeConstant {

    @NotNull
    public static final BridgeConstant INSTANCE = new BridgeConstant();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/huami/sleepassistant/lib/jsbridge/BridgeConstant$Path;", "", "", "SLEEP_SERVICE_TESTING_WEB_VIEW_URL", "Ljava/lang/String;", "SLEEP_SERVICE_WEB_VIEW_URL", "SLEEP_SERVICE_TESTING_XIAOMI_WEB_VIEW_URL", "SLEEP_SERVICE_XIAOMI_WEB_VIEW_URL", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Path {

        @NotNull
        public static final Path INSTANCE = new Path();

        @NotNull
        public static final String SLEEP_SERVICE_TESTING_WEB_VIEW_URL = "https://sec-app-web-testing.bj.bcebos.com/sleep/index.html#";

        @NotNull
        public static final String SLEEP_SERVICE_TESTING_XIAOMI_WEB_VIEW_URL = "https://sec-app-web-testing.bj.bcebos.com/mifitsleep/index.html#";

        @NotNull
        public static final String SLEEP_SERVICE_WEB_VIEW_URL = "https://sec-app-web-cdn.huami.com/sleep/index.html#";

        @NotNull
        public static final String SLEEP_SERVICE_XIAOMI_WEB_VIEW_URL = "https://sec-app-web-cdn.huami.com/mifitsleep/index.html#";

        private Path() {
        }
    }

    private BridgeConstant() {
    }

    @NotNull
    public final WebItem buildMiWebItem() {
        WebItem webItem = new WebItem();
        webItem.url = StringsKt__StringsKt.contains$default((CharSequence) HMServerDef.getHost(), (CharSequence) "staging", false, 2, (Object) null) ? Intrinsics.stringPlus("https://sec-app-web-testing.bj.bcebos.com/mifitsleep/index.html#/?time=", Long.valueOf(System.currentTimeMillis())) : Intrinsics.stringPlus("https://sec-app-web-cdn.huami.com/mifitsleep/index.html#/?time=", Long.valueOf(System.currentTimeMillis()));
        webItem.titleBarStyle = 3;
        return webItem;
    }

    @NotNull
    public final WebItem buildWebItem() {
        WebItem webItem = new WebItem();
        webItem.url = StringsKt__StringsKt.contains$default((CharSequence) HMServerDef.getHost(), (CharSequence) "staging", false, 2, (Object) null) ? Intrinsics.stringPlus("https://sec-app-web-testing.bj.bcebos.com/sleep/index.html#/?time=", Long.valueOf(System.currentTimeMillis())) : Intrinsics.stringPlus("https://sec-app-web-cdn.huami.com/sleep/index.html#/?time=", Long.valueOf(System.currentTimeMillis()));
        webItem.titleBarStyle = 3;
        return webItem;
    }
}
