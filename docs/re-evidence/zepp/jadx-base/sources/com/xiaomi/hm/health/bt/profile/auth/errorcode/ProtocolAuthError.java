package com.xiaomi.hm.health.bt.profile.auth.errorcode;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bt.profile.auth.AuthErrorCode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\t\u001a\u00020\u00048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/auth/errorcode/ProtocolAuthError;", "Lcom/xiaomi/hm/health/bt/profile/auth/errorcode/AuthError;", "", "toString", "", "a", LogUtil.I, "getCode", "()I", "code", "<init>", "(I)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ProtocolAuthError implements AuthError {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int code;

    public ProtocolAuthError(int i) {
        this.code = i;
    }

    @Override // com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthError
    public int getCode() {
        return this.code;
    }

    @NotNull
    public String toString() {
        return "ProtocolAuthError{code:" + getCode() + ", desc: " + AuthErrorCode.INSTANCE.fromValue(getCode()) + '}';
    }
}
