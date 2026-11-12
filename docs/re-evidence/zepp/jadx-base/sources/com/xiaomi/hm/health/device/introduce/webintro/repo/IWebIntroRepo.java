package com.xiaomi.hm.health.device.introduce.webintro.repo;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/device/introduce/webintro/repo/IWebIntroRepo;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "loadUrl", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface IWebIntroRepo {
    @Nullable
    Object loadUrl(@NotNull HMDeviceSource hMDeviceSource, @NotNull Continuation<? super String> continuation);
}
