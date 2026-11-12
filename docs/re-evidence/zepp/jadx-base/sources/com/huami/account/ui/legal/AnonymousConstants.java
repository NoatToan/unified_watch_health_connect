package com.huami.account.ui.legal;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/huami/account/ui/legal/AnonymousConstants;", "", "", "ANONYMOUS_USER_ID", "Ljava/lang/String;", "ANONYMOUS_TOKEN", "DEFAULT_REGION_ID", "", "DEFAULT_WEIGHT", "F", "", "DEFAULT_GOAL_STEPS", LogUtil.I, "DEFAULT_NICK_NAME", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class AnonymousConstants {

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
    public static final AnonymousConstants INSTANCE = new AnonymousConstants();

    private AnonymousConstants() {
    }
}
