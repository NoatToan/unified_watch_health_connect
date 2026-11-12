package com.huami.web.container.di;

import android.app.Application;
import android.content.Intent;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huami.discovery.bridge.model.WebItem;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.web.container.WebActivity;
import com.huami.web.service.WebViewService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00060\u0006j\u0002`\u0007*\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0019\u0010\u0010\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/huami/web/container/di/WebViewServiceImpl;", "Lcom/huami/web/service/WebViewService;", "Lcom/huami/web/service/WebItem;", "webItem", "", "b", "Lcom/huami/discovery/bridge/model/WebItem;", "Lcom/huami/web/container/di/WebViewProperties;", "a", WebConstant.QueryParam.LAUNCH, "", "url", "Landroid/app/Application;", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, "<init>", "(Landroid/app/Application;)V", "Companion", "web_release"}, k = 1, mv = {1, 5, 1})
public final class WebViewServiceImpl implements WebViewService {

    @NotNull
    public static final String TAG = "WebViewServiceImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Application application;

    public WebViewServiceImpl(@NotNull Application application) {
        this.application = application;
    }

    private final WebItem a(com.huami.web.service.WebItem webItem) {
        Gson gson = new Gson();
        try {
            return (WebItem) gson.fromJson(gson.toJson(webItem), WebItem.class);
        } catch (JsonSyntaxException unused) {
            throw new IllegalStateException(Intrinsics.stringPlus("WebItem json 转化为 [com.huami.discovery.bridge.model.WebItem] 对象失败！是因为 [com.huami.discovery.bridge.model.WebItem]和 [WebItem] 对象不一致导致，请检查两对象。\nWebItem: ", webItem));
        }
    }

    private final void b(com.huami.web.service.WebItem webItem) {
        Application application = this.application;
        Intent intent = new Intent(this.application, (Class<?>) WebActivity.class);
        intent.setFlags(268435456);
        intent.putExtra(WebActivity.KEY_WEB_ITEM, a(webItem));
        Unit unit = Unit.INSTANCE;
        application.startActivity(intent);
    }

    @NotNull
    public final Application getApplication() {
        return this.application;
    }

    @Override // com.huami.web.service.WebViewService
    public void launch(@NotNull com.huami.web.service.WebItem webItem) {
        b(webItem);
    }

    @Override // com.huami.web.service.WebViewService
    public void launch(@NotNull String url) {
        b(new com.huami.web.service.WebItem(url));
    }
}
