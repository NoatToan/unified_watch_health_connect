package com.xiaomi.hm.health.discovery;

import com.huami.sky.lib.constant.WebConstant;
import com.huami.web.service.WebItem;
import com.huami.web.service.WebViewService;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\"\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0007¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/discovery/WebHelper;", "", "", "url", "", WebConstant.QueryParam.LAUNCH, "Lcom/huami/web/service/WebItem;", "webItem", "", "isNotifyFinish", "isShouldPreVerify", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WebHelper {

    @NotNull
    public static final WebHelper INSTANCE = new WebHelper();

    private WebHelper() {
    }

    @JvmStatic
    public static final void launch(@NotNull String url) {
        ((WebViewService) WebHelperKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(WebViewService.class), null, null)).launch(url);
    }

    @JvmStatic
    @JvmOverloads
    public static final void launch(@NotNull String str, boolean z) {
        launch$default(str, z, false, 4, null);
    }

    public static /* synthetic */ void launch$default(String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = true;
        }
        launch(str, z, z2);
    }

    @JvmStatic
    public static final void launch(@NotNull WebItem webItem) {
        ((WebViewService) WebHelperKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(WebViewService.class), null, null)).launch(webItem);
    }

    @JvmStatic
    @JvmOverloads
    public static final void launch(@NotNull String url, boolean isNotifyFinish, boolean isShouldPreVerify) {
        WebItem webItem = new WebItem();
        webItem.url = url;
        webItem.isShouldNotifyFinish = isNotifyFinish;
        webItem.isShouldPreVerify = isShouldPreVerify;
        ((WebViewService) WebHelperKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(WebViewService.class), null, null)).launch(webItem);
    }
}
