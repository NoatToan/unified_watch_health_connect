package com.huami.watch.companion.account;

import android.app.Activity;
import com.huami.passport.ErrorCode;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001a\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&JR\u0010\u0013\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\t0\u0010H&¨\u0006\u0014"}, d2 = {"Lcom/huami/watch/companion/account/IDeviceTokenManager;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "isSupportDeviceToken", "", "sn", "hasXiaoAiDeviceToken", "", "clearToken", "Landroid/app/Activity;", "activity", "Lkotlin/Function0;", "onSuccess", "onUserCancel", "Lkotlin/Function1;", "Lcom/huami/passport/ErrorCode;", "onError", "authorizeDeviceToken", "companion_release"}, k = 1, mv = {1, 5, 1})
public interface IDeviceTokenManager {
    void authorizeDeviceToken(@NotNull Activity activity, @NotNull HMDeviceSource source, @NotNull String sn, @NotNull Function0<Unit> onSuccess, @NotNull Function0<Unit> onUserCancel, @NotNull Function1<? super ErrorCode, Unit> onError);

    void clearToken(@Nullable HMDeviceSource source, @NotNull String sn);

    boolean hasXiaoAiDeviceToken(@Nullable HMDeviceSource source, @NotNull String sn);

    boolean isSupportDeviceToken(@NotNull HMDeviceSource source);
}
