package com.xiaomi.hm.health.device.setting.life.feature.inject;

import android.app.Activity;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.device.setting.SoftFeature;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&J\u0013\u0010\r\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0006H&J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&J\u001b\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H¦@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/feature/inject/JsAppApi;", "", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "baseDevice", "Lcom/xiaomi/hm/health/device/setting/SoftFeature;", "softFeature", "", "supportJsApp", "", "cache", "Landroid/app/Activity;", "activity", "onDevicePageClick", "hasJsAppNeedUpgrade", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isDeveloperModeOpen", "onJsAppDeveloperModePageClick", "", "appId", "hasJsAppInstalled", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface JsAppApi {
    void cache(@NotNull HMBaseDevice baseDevice, @NotNull SoftFeature softFeature, boolean supportJsApp);

    @Nullable
    Object hasJsAppInstalled(@NotNull String str, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object hasJsAppNeedUpgrade(@NotNull Continuation<? super Boolean> continuation);

    boolean isDeveloperModeOpen();

    void onDevicePageClick(@NotNull Activity activity);

    void onJsAppDeveloperModePageClick(@NotNull Activity activity);
}
