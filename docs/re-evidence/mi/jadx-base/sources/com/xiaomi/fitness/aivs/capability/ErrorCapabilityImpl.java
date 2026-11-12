package com.xiaomi.fitness.aivs.capability;

import android.os.Handler;
import android.os.Message;
import com.xiaomi.ai.android.capability.ErrorCapability;
import com.xiaomi.fitness.aivs.base.BaseAivsService;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.f01;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/aivs/capability/ErrorCapabilityImpl;", "Lcom/xiaomi/ai/android/capability/ErrorCapability;", "Lf01;", "error", "", "onError", "(Lf01;)V", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "", "model", "Ljava/lang/String;", "getModel", "()Ljava/lang/String;", "<init>", "(Landroid/os/Handler;Ljava/lang/String;)V", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ErrorCapabilityImpl extends ErrorCapability {

    @Nullable
    private final Handler handler;

    @NotNull
    private final String model;

    public ErrorCapabilityImpl(@Nullable Handler handler, @NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.handler = handler;
        this.model = model;
    }

    @Nullable
    public final Handler getHandler() {
        return this.handler;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @Override // com.xiaomi.ai.android.capability.ErrorCapability
    public void onError(@Nullable f01 error) {
        Logger.e(BaseAivsService.TAG, "ErrorCapability onError " + (error != null ? Integer.valueOf(error.a()) : null) + " : " + (error != null ? error.b() : null));
        Handler handler = this.handler;
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage(-1, error != null ? Integer.valueOf(error.a()) : null);
            if (messageObtainMessage != null) {
                messageObtainMessage.sendToTarget();
            }
        }
    }
}
