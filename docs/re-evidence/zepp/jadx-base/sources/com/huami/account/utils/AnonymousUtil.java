package com.huami.account.utils;

import android.content.Context;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.account.HMLoginManager;
import com.huami.tools.analytics.DbUtils;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated(message = "因加入个人信息需求废弃，后续请使用 PolicyUtil。常量定义迁移到了 AnonymousConstants")
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007R\u0016\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0016\u0010\u000e\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0016\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/huami/account/utils/AnonymousUtil;", "", "", "showLoginIfNeeded", "", "showLoginTip", "isAnonymousUser", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "initAnonymousUser", "", "ANONYMOUS_USER_ID", "Ljava/lang/String;", "ANONYMOUS_TOKEN", "DEFAULT_REGION_ID", "", "DEFAULT_WEIGHT", "F", "", "DEFAULT_GOAL_STEPS", LogUtil.I, "DEFAULT_NICK_NAME", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class AnonymousUtil {

    @NotNull
    public static final String ANONYMOUS_TOKEN = "_ANONYMOUS";

    @NotNull
    public static final String ANONYMOUS_USER_ID = "0";
    public static final int DEFAULT_GOAL_STEPS = 8000;

    @NotNull
    public static final String DEFAULT_NICK_NAME = "--";

    @NotNull
    public static final String DEFAULT_REGION_ID = "1";
    public static final float DEFAULT_WEIGHT = 120.0f;

    @NotNull
    public static final AnonymousUtil INSTANCE = new AnonymousUtil();

    private AnonymousUtil() {
    }

    @Deprecated(message = "", replaceWith = @ReplaceWith(expression = "HMLoginManager.initAnonymousUser(context)", imports = {"com.huami.account.HMLoginManager"}))
    @JvmStatic
    public static final void initAnonymousUser(@NotNull Context context) {
        HMLoginManager.initAnonymousUser(context);
    }

    @Deprecated(message = "新增了个人信息使用逻辑，如需纯粹判断匿名状态请使用 AnonymousService", replaceWith = @ReplaceWith(expression = "PolicyTipUtil.isNeedIntercept()", imports = {}))
    @JvmStatic
    public static final boolean isAnonymousUser() {
        return PolicyTipUtil.isNeedIntercept();
    }

    @Deprecated(message = "新增了个人信息使用逻辑，如需纯粹判断匿名状态请使用 AnonymousService", replaceWith = @ReplaceWith(expression = "PolicyTipUtil.interceptWithShowTip()", imports = {}))
    @JvmStatic
    public static final boolean showLoginIfNeeded() {
        return PolicyTipUtil.interceptWithShowTip();
    }

    @Deprecated(message = "新增了个人信息使用逻辑，如需纯粹判断匿名状态请使用 AnonymousService", replaceWith = @ReplaceWith(expression = "PolicyTipUtil.showTip()", imports = {}))
    @JvmStatic
    public static final void showLoginTip() {
        PolicyTipUtil.showTip();
    }
}
