package com.huami.discovery.bridge.jsbridge.handler;

import android.content.Context;
import com.huami.discovery.bridge.jsbridge.api.ApiHandler;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¨\u0006\u0004"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/discovery/bridge/jsbridge/handler/Handler;", "getThemeHandler", "bridge_release"}, k = 2, mv = {1, 5, 1})
public final class ThemeHandlerKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/discovery/bridge/jsbridge/api/ApiHandler;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ApiHandler> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ApiHandler invoke() {
            return new ThemeHandler(this.a);
        }
    }

    @NotNull
    public static final Handler getThemeHandler(@NotNull Context context) {
        return HandlerKt.handler(ThemeHandler.THEME_ID, new a(context));
    }
}
