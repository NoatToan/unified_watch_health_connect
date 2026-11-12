package com.xiaomi.hm.health.device;

import android.os.Handler;
import android.os.Message;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/s;", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "", "handleMessage", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
final class s extends Handler {
    @Override // android.os.Handler
    public void handleMessage(@NotNull Message msg) {
        HMTreadmillSettingActivity.INSTANCE.dealMsg(msg.what);
        super.handleMessage(msg);
    }
}
