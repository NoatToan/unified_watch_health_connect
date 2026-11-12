package com.xiaomi.hm.health.bt.profile.auth.errorcode;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/auth/errorcode/Success;", "Lcom/xiaomi/hm/health/bt/profile/auth/errorcode/AuthError;", "", "a", LogUtil.I, "getCode", "()I", "code", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class Success implements AuthError {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int code = Integer.MAX_VALUE;

    @Override // com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthError
    public int getCode() {
        return this.code;
    }
}
