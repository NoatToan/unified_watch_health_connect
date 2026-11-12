package com.xiaomi.hm.health.device.headset.bean;

import io.reactivex.disposables.Disposable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"Lio/reactivex/disposables/Disposable;", "Lcom/xiaomi/hm/health/device/headset/bean/AutoDisposable;", "autoDisposable", "", "addTo", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class AutoDisposableKt {
    public static final void addTo(@NotNull Disposable disposable, @NotNull AutoDisposable autoDisposable) {
        autoDisposable.add(disposable);
    }
}
