package com.huami.hmchartui.utils;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/huami/hmchartui/utils/Constant;", "", "", "DAY_BAR_MAX_SIZE", LogUtil.I, "WEEK_BAR_MAX_SIZE", "YEAR_BAR_MAX_SIZE", "TYPE_HOUR", "TYPE_DAY", "TYPE_WEEK", "TYPE_MONTH", "TYPE_YEAR", "", Constant.KEY_TIME_TYPE, "Ljava/lang/String;", Constant.KEY_TIME, Constant.USER_ID, "<init>", "()V", "hmchartui_release"}, k = 1, mv = {1, 5, 1})
public final class Constant {
    public static final int DAY_BAR_MAX_SIZE = 24;

    @NotNull
    public static final Constant INSTANCE = new Constant();

    @NotNull
    public static final String KEY_TIME = "KEY_TIME";

    @NotNull
    public static final String KEY_TIME_TYPE = "KEY_TIME_TYPE";
    public static final int TYPE_DAY = 16;
    public static final int TYPE_HOUR = 20;
    public static final int TYPE_MONTH = 18;
    public static final int TYPE_WEEK = 17;
    public static final int TYPE_YEAR = 19;

    @NotNull
    public static final String USER_ID = "USER_ID";
    public static final int WEEK_BAR_MAX_SIZE = 7;
    public static final int YEAR_BAR_MAX_SIZE = 12;

    private Constant() {
    }
}
