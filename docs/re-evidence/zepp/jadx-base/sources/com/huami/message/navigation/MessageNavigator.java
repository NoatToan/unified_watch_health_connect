package com.huami.message.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.huami.message.ui.home.MidongMessageCenterActivity;
import com.huami.message.ui.submessage.SubMessageActivity;
import com.huami.message.utils.AppUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/message/navigation/MessageNavigator;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/content/Intent;", "intent", "", "a", "navigateToMessageCenterActivity", "", "subType", "navigateToSubMessageActivity", "", "Ljava/lang/String;", "tag", "<init>", "()V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class MessageNavigator {

    @NotNull
    public static final MessageNavigator INSTANCE = new MessageNavigator();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String tag = "messageNavigator";

    private MessageNavigator() {
    }

    private final void a(Context context, Intent intent) {
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    public final void navigateToMessageCenterActivity(@NotNull Context context) {
        String str = tag;
        HMLog.d(str, "navigateToMessageCenterActivity", new Object[0]);
        HMLog.d(str, Intrinsics.stringPlus("package name ::  ", AppUtils.INSTANCE.getPackageName(context.getApplicationContext())), new Object[0]);
        a(context, new Intent(context, (Class<?>) MidongMessageCenterActivity.class));
    }

    public final void navigateToSubMessageActivity(@NotNull Context context, int subType) {
        HMLog.d(tag, Intrinsics.stringPlus("navigateToSubMessageActivity:", Integer.valueOf(subType)), new Object[0]);
        Intent intent = new Intent(context, (Class<?>) SubMessageActivity.class);
        intent.putExtra(SubMessageActivity.EXTRA_SUB_TYPE, subType);
        a(context, intent);
    }
}
