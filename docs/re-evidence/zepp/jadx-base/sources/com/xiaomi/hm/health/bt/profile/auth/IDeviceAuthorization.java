package com.xiaomi.hm.health.bt.profile.auth;

import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/auth/IDeviceAuthorization;", "", "Lcom/xiaomi/hm/health/bt/profile/auth/AuthInfo;", "authInfo", "Lcom/xiaomi/hm/health/bt/profile/auth/IHMAuthCallback;", "authCallback", "Lcom/xiaomi/hm/health/bt/profile/auth/errorcode/AuthResult;", "authorize", "", "deAuthorize", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface IDeviceAuthorization {
    @NotNull
    AuthResult authorize(@NotNull AuthInfo authInfo, @NotNull IHMAuthCallback authCallback);

    boolean deAuthorize(@NotNull AuthInfo authInfo);
}
