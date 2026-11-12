package com.xiaomi.hm.health.device.watchskinstore;

import com.huami.pay.lib.PayConstantsKt;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinstore/PayChannelBo;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", PayConstantsKt.PAY_CHANNEL_WECHAT, PayConstantsKt.PAY_CHANNEL_ALI, "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public enum PayChannelBo {
    WECHAT(TrainingWebConst.Value.PayChannel.WECHAT),
    ALI(TrainingWebConst.Value.PayChannel.ALIPAY);


    @NotNull
    private final String value;

    PayChannelBo(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
