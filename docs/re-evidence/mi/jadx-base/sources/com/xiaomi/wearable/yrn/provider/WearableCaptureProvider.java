package com.xiaomi.wearable.yrn.provider;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.yrn.env.trace.YRNTraceEvent;
import defpackage.g1d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/wearable/yrn/provider/WearableCaptureProvider;", "Lg1d;", "", DeviceTagInterface.CUSTOM_TAG_TYPE, "", "handleRNException", "(Ljava/lang/Throwable;)V", "Lcom/xiaomi/yrn/env/trace/YRNTraceEvent;", "event", "handleTraceEvent", "(Lcom/xiaomi/yrn/env/trace/YRNTraceEvent;)V", "Lcom/xiaomi/wearable/yrn/provider/WearableRNExceptionListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/wearable/yrn/provider/WearableRNExceptionListener;", "<init>", "(Lcom/xiaomi/wearable/yrn/provider/WearableRNExceptionListener;)V", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WearableCaptureProvider implements g1d {

    @NotNull
    private WearableRNExceptionListener listener;

    public WearableCaptureProvider(@NotNull WearableRNExceptionListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    @Override // defpackage.g1d
    public void handleRNException(@Nullable Throwable t) {
        if (t != null) {
            Exception exc = t instanceof Exception ? (Exception) t : null;
            if (exc != null) {
                this.listener.nativeModuleCallException(exc);
            } else {
                this.listener.nativeModuleCallException(new Exception(t));
            }
        }
    }

    @Override // defpackage.g1d
    public void handleTraceEvent(@Nullable YRNTraceEvent event) {
    }
}
