package com.huami.ai.speech.simplify.inject.impl;

import com.huami.ai.helper.DeviceCheck;
import com.huami.ai.helper.DeviceSpeechSupportFuncKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/huami/ai/speech/simplify/inject/impl/DeviceCheckImpl;", "Lcom/huami/ai/helper/DeviceCheck;", "", "isSupportNewBleProtocol", "Lkotlin/Function0;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "a", "Lkotlin/jvm/functions/Function0;", "deviceFunc", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "speech-simplify_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceCheckImpl implements DeviceCheck {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<HMBaseDevice> deviceFunc;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "get device null";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceCheckImpl(@NotNull Function0<? extends HMBaseDevice> function0) {
        this.deviceFunc = function0;
    }

    @Override // com.huami.ai.helper.DeviceCheck
    public boolean isSupportNewBleProtocol() {
        HMBaseDevice hMBaseDeviceInvoke = this.deviceFunc.invoke();
        if (hMBaseDeviceInvoke != null) {
            return DeviceSpeechSupportFuncKt.featureSupportAlexa(hMBaseDeviceInvoke) || DeviceSpeechSupportFuncKt.featureSupportMIAI(hMBaseDeviceInvoke);
        }
        HMLog.warn$default("speech", null, a.a, 2, null);
        return false;
    }
}
