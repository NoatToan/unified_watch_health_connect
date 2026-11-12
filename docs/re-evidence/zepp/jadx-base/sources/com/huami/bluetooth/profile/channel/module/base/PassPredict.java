package com.huami.bluetooth.profile.channel.module.base;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/base/PassPredict;", "Lcom/huami/bluetooth/profile/channel/module/base/RequestPredict;", "", "byteArray", "", "predict", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class PassPredict implements RequestPredict {

    @NotNull
    public static final PassPredict INSTANCE = new PassPredict();

    private PassPredict() {
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.RequestPredict
    public boolean predict(@NotNull byte[] byteArray) {
        return true;
    }
}
