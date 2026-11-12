package com.huami.bluetooth.profile.channel.module.base;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.module.auth.AuthModuleKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/base/DefaultPredict;", "Lcom/huami/bluetooth/profile/channel/module/base/ResponsePredict;", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleRequest;", "request", "", AbstractJSONTokenResponse.RESPONSE, "", "predict", "", "a", LogUtil.I, "RESPONSE_PREFIX", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DefaultPredict implements ResponsePredict {

    @NotNull
    public static final DefaultPredict INSTANCE = new DefaultPredict();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int RESPONSE_PREFIX = 16;

    private DefaultPredict() {
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.ResponsePredict
    public boolean predict(@NotNull ModuleRequest request, @NotNull byte[] response) {
        if (response.length <= 2 || ArraysKt___ArraysKt.first(response) != 16) {
            return false;
        }
        Integer numSecond = AuthModuleKt.second(response);
        return numSecond != null && numSecond.intValue() == ArraysKt___ArraysKt.first(request.getBytes());
    }
}
