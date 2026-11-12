package com.huami.account.ui.login.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/huami/account/ui/login/entity/PasswordAttemptData;", "", "", "a", LogUtil.I, "getAttempts", "()I", "attempts", "b", "getMaxAttempts", "maxAttempts", "<init>", "(II)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class PasswordAttemptData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int attempts;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int maxAttempts;

    public PasswordAttemptData(int i, int i2) {
        this.attempts = i;
        this.maxAttempts = i2;
    }

    public final int getAttempts() {
        return this.attempts;
    }

    public final int getMaxAttempts() {
        return this.maxAttempts;
    }
}
