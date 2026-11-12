package com.xiaomi.hm.health.relation;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/relation/AddFriendResult;", "", "", "code", "", "isSuccess", com.alipay.sdk.m.f0.c.p, LogUtil.I, "LIMIT", "FAILED", "SEVER_DOWN", "ILLEGAL", "QR_INVALID", "<init>", "()V", "relatives_release"}, k = 1, mv = {1, 5, 1})
public final class AddFriendResult {
    public static final int FAILED = 3;
    public static final int ILLEGAL = 5;

    @NotNull
    public static final AddFriendResult INSTANCE = new AddFriendResult();
    public static final int LIMIT = 2;
    public static final int QR_INVALID = 6;
    public static final int SEVER_DOWN = 4;
    public static final int SUCCESS = 1;

    private AddFriendResult() {
    }

    @JvmStatic
    public static final boolean isSuccess(int code) {
        return 1 == code;
    }
}
