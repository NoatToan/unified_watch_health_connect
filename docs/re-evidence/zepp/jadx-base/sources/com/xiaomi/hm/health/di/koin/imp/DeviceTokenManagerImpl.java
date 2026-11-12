package com.xiaomi.hm.health.di.koin.imp;

import android.app.Activity;
import com.huami.account.XiaoaiTokenKeeper;
import com.huami.account.XiaomiTokenMananger;
import com.huami.ai.speech.simplify.auth.DeviceTokenManager;
import com.huami.passport.ErrorCode;
import com.huami.watch.companion.account.IDeviceTokenManager;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016JR\u0010\u0013\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\t0\u0010H\u0016¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/di/koin/imp/DeviceTokenManagerImpl;", "Lcom/huami/watch/companion/account/IDeviceTokenManager;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "isSupportDeviceToken", "", "sn", "hasXiaoAiDeviceToken", "", "clearToken", "Landroid/app/Activity;", "activity", "Lkotlin/Function0;", "onSuccess", "onUserCancel", "Lkotlin/Function1;", "Lcom/huami/passport/ErrorCode;", "onError", "authorizeDeviceToken", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceTokenManagerImpl implements IDeviceTokenManager {
    @Override // com.huami.watch.companion.account.IDeviceTokenManager
    public void authorizeDeviceToken(@NotNull Activity activity, @NotNull HMDeviceSource source, @NotNull String sn, @NotNull final Function0<Unit> onSuccess, @NotNull final Function0<Unit> onUserCancel, @NotNull final Function1<? super ErrorCode, Unit> onError) {
        XiaomiTokenMananger.reAuthorization(activity, sn, DeviceTokenManager.INSTANCE.getTpacProvider(source), new XiaomiTokenMananger.OnDeviceAuthCallback() { // from class: com.xiaomi.hm.health.di.koin.imp.DeviceTokenManagerImpl.authorizeDeviceToken.1
            @Override // com.huami.account.XiaomiTokenMananger.OnAuthCallback
            public void onError(@Nullable ErrorCode errorCode) {
                onError.invoke(errorCode);
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnAuthCallback
            public void onSuccess() {
                onSuccess.invoke();
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnAuthCallback
            public void onUserCancel() {
                onUserCancel.invoke();
            }
        });
    }

    @Override // com.huami.watch.companion.account.IDeviceTokenManager
    public void clearToken(@Nullable HMDeviceSource source, @NotNull String sn) {
        XiaoaiTokenKeeper.INSTANCE.removeToken(sn);
    }

    @Override // com.huami.watch.companion.account.IDeviceTokenManager
    public boolean hasXiaoAiDeviceToken(@Nullable HMDeviceSource source, @NotNull String sn) {
        if (source == null) {
            return false;
        }
        return XiaomiTokenMananger.hasXiaomiAiToken(source.getValue(), sn);
    }

    @Override // com.huami.watch.companion.account.IDeviceTokenManager
    public boolean isSupportDeviceToken(@NotNull HMDeviceSource source) {
        return DeviceTokenManager.INSTANCE.isSupportDeviceToken(source);
    }
}
