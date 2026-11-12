package com.huami.third.wechat.ui;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.NetUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "checkNet", "wechat-ui_release"}, k = 2, mv = {1, 5, 1})
public final class UtilsKt {
    public static final boolean checkNet(@NotNull Context context) {
        if (NetUtil.isNetworkConnected(context)) {
            return true;
        }
        IconToast.showError(context, context.getString(R.string.no_network_connection));
        return false;
    }
}
