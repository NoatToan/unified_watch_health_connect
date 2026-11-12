package com.huami.phn.util;

import com.huami.sky.lib.constant.WebConstant;
import com.huami.web.service.WebItem;
import com.huami.web.service.WebViewService;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\"\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Lcom/huami/phn/util/WebHelper;", "", "", "url", "", WebConstant.QueryParam.LAUNCH, "", "isNotifyFinish", "isShouldPreVerify", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
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
    @JvmOverloads
    public static final void launch(@NotNull String url, boolean isNotifyFinish, boolean isShouldPreVerify) {
        WebItem webItem = new WebItem();
        webItem.url = url;
        webItem.isShouldNotifyFinish = isNotifyFinish;
        webItem.isShouldPreVerify = isShouldPreVerify;
        ((WebViewService) WebHelperKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(WebViewService.class), null, null)).launch(webItem);
    }
}
