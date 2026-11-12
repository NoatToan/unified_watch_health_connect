package com.huami.bluetooth.profile.channel.module.auth;

import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H&J\"\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00062\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH&J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H&J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0006H&J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0006H&¨\u0006\u0019"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/auth/AuthApi;", "", "Lcom/huami/bluetooth/profile/channel/module/auth/AuthorizationProtocolInfo;", "getAuthorizationInfo", "", "apiLevel", "", "keyBytes", "Lcom/huami/bluetooth/profile/channel/module/auth/StartAuthResponse;", "startLocalBinding", "pubKey", "startCloudBiding", "signature", "Lkotlin/Function0;", "", "callback", "Lcom/xiaomi/hm/health/bt/profile/auth/errorcode/AuthResult;", "verifySignature", "Lcom/huami/bluetooth/profile/channel/module/auth/RequestAuthResponse;", "requestAuth", "requestDeAuth", "requestRandomNumber", "cipher", "authorize", "deAuthorize", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface AuthApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AuthResult verifySignature$default(AuthApi authApi, byte[] bArr, Function0 function0, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verifySignature");
            }
            if ((i & 2) != 0) {
                function0 = null;
            }
            return authApi.verifySignature(bArr, function0);
        }
    }

    @NotNull
    AuthResult authorize(@NotNull byte[] cipher);

    int deAuthorize(@NotNull byte[] cipher);

    @Nullable
    AuthorizationProtocolInfo getAuthorizationInfo();

    @Nullable
    RequestAuthResponse requestAuth(int apiLevel, @NotNull byte[] pubKey);

    @Nullable
    byte[] requestDeAuth(int apiLevel);

    @Nullable
    byte[] requestRandomNumber(int apiLevel);

    @Nullable
    StartAuthResponse startCloudBiding(int apiLevel, @NotNull byte[] pubKey);

    @Nullable
    StartAuthResponse startLocalBinding(int apiLevel, @NotNull byte[] keyBytes);

    @NotNull
    AuthResult verifySignature(@NotNull byte[] signature, @Nullable Function0<Unit> callback);
}
