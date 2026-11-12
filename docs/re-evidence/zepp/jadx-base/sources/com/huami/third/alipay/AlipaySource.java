package com.huami.third.alipay;

import android.app.Activity;
import com.huami.passport.Configs;
import com.xiaomi.hm.health.device.bind.HMUnbindBaseLogic;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J(\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H&J(\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H&J0\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H&J(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H&¨\u0006\u0016"}, d2 = {"Lcom/huami/third/alipay/AlipaySource;", "", "", "authString", "Landroid/app/Activity;", "activity", "Lcom/huami/third/alipay/AuthResult;", "auth", "host", "userId", "appId", "Lcom/huami/third/alipay/ApiResult;", "Lcom/huami/third/alipay/AuthInfo;", "getAuthInfo", "Lcom/huami/third/alipay/UserInfo;", "getUserInfo", Configs.Params.AUTHCODE, "Lcom/huami/third/alipay/UploadResult;", "uploadAuthCode", "nickName", "", HMUnbindBaseLogic.TAG, "alipay_release"}, k = 1, mv = {1, 4, 1})
public interface AlipaySource {
    @Nullable
    AuthResult auth(@NotNull String authString, @NotNull Activity activity);

    @Nullable
    ApiResult<AuthInfo> getAuthInfo(@NotNull String host, @NotNull String userId, @NotNull String appId);

    @Nullable
    ApiResult<UserInfo> getUserInfo(@NotNull String host, @NotNull String userId, @NotNull String appId);

    boolean unbind(@NotNull String host, @NotNull String userId, @NotNull String appId, @NotNull String nickName);

    @Nullable
    ApiResult<UploadResult> uploadAuthCode(@NotNull String host, @NotNull String userId, @NotNull String appId, @NotNull String authCode);
}
