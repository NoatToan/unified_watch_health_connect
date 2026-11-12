package com.xiaomi.hm.health.bt.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/bt/utils/AsyncHandler;", "Landroid/os/Handler$Callback;", "Ljava/lang/Runnable;", "runnable", "", "run", "Landroid/os/Message;", "msg", "", "handleMessage", "Landroid/os/Handler;", "a", "Landroid/os/Handler;", "handler", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class AsyncHandler implements Handler.Callback {
    private static final int b = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Handler handler;

    public AsyncHandler() {
        if (Looper.myLooper() == null) {
            throw new RuntimeException();
        }
        this.handler = new Handler(Looper.myLooper(), this);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NotNull Message msg) {
        if (msg.what == 1) {
            Object obj = msg.obj;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
            ((Runnable) obj).run();
        }
        return true;
    }

    public final void run(@NotNull Runnable runnable) {
        this.handler.obtainMessage(1, runnable).sendToTarget();
    }
}
