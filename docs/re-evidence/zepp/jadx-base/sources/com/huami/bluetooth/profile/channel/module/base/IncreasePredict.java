package com.huami.bluetooth.profile.channel.module.base;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.bluetooth.profile.channel.module.auth.AuthModuleKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/base/IncreasePredict;", "Lcom/huami/bluetooth/profile/channel/module/base/ResponsePredict;", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleRequest;", "request", "", AbstractJSONTokenResponse.RESPONSE, "", "predict", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class IncreasePredict implements ResponsePredict {

    @NotNull
    public static final IncreasePredict INSTANCE = new IncreasePredict();

    private IncreasePredict() {
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.ResponsePredict
    public boolean predict(@NotNull ModuleRequest request, @NotNull byte[] response) {
        return !(response.length == 0) && AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(response)) == AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(request.getBytes())) + 1;
    }
}
