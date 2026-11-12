package com.huami.bluetooth.profile.channel.module.base;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/base/DeviceRequestHandler;", "", "", "byteArray", "", "onData", "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", "hook", "Lcom/huami/bluetooth/profile/channel/module/base/RequestPredict;", "b", "Lcom/huami/bluetooth/profile/channel/module/base/RequestPredict;", "predict", "<init>", "(Lkotlin/jvm/functions/Function1;Lcom/huami/bluetooth/profile/channel/module/base/RequestPredict;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceRequestHandler {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function1<byte[], Unit> hook;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final RequestPredict predict;

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceRequestHandler(@NotNull Function1<? super byte[], Unit> function1, @NotNull RequestPredict requestPredict) {
        this.hook = function1;
        this.predict = requestPredict;
    }

    public final void onData(@NotNull byte[] byteArray) {
        if (this.predict.predict(byteArray)) {
            this.hook.invoke(byteArray);
        }
    }
}
