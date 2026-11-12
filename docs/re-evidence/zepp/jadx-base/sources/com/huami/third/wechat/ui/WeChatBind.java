package com.huami.third.wechat.ui;

import android.content.Context;
import android.content.Intent;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/huami/third/wechat/ui/WeChatBind;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/third/wechat/ui/WeChatStartDestination;", "weChatStartDestination", "", "open", "<init>", "()V", "wechat-ui_release"}, k = 1, mv = {1, 5, 1})
public final class WeChatBind {

    @NotNull
    public static final WeChatBind INSTANCE = new WeChatBind();

    private WeChatBind() {
    }

    @JvmStatic
    public static final void open(@NotNull Context context, @NotNull WeChatStartDestination weChatStartDestination) {
        AnalyzeUtilsKt.analytics$default("WeChat", null, 2, null);
        Intent intent = new Intent(context, (Class<?>) WeChatBindActivity.class);
        intent.putExtra(WeChatBindActivity.START_DESTINATION, weChatStartDestination.getStartDestination());
        context.startActivity(intent);
    }
}
