package com.xiaomi.hm.health.bodyfat.activity;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.appcompat.app.AppCompatActivity;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/WeightResultHandler;", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "", "handleMessage", "Landroid/os/Handler$Callback;", "a", "Landroid/os/Handler$Callback;", "getCallback", "()Landroid/os/Handler$Callback;", "callback", "Ljava/lang/ref/WeakReference;", "Landroidx/appcompat/app/AppCompatActivity;", "b", "Ljava/lang/ref/WeakReference;", "getMWeakReference", "()Ljava/lang/ref/WeakReference;", "setMWeakReference", "(Ljava/lang/ref/WeakReference;)V", "mWeakReference", "mActivity", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Landroid/os/Handler$Callback;)V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class WeightResultHandler extends Handler {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Handler.Callback callback;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private WeakReference<AppCompatActivity> mWeakReference;

    public WeightResultHandler(@NotNull AppCompatActivity appCompatActivity, @NotNull Handler.Callback callback) {
        super(Looper.getMainLooper());
        this.callback = callback;
        this.mWeakReference = new WeakReference<>(appCompatActivity);
    }

    @NotNull
    public final Handler.Callback getCallback() {
        return this.callback;
    }

    @NotNull
    public final WeakReference<AppCompatActivity> getMWeakReference() {
        return this.mWeakReference;
    }

    @Override // android.os.Handler
    public void handleMessage(@NotNull Message msg) {
        if (this.mWeakReference.get() == null) {
            return;
        }
        this.callback.handleMessage(msg);
    }

    public final void setMWeakReference(@NotNull WeakReference<AppCompatActivity> weakReference) {
        this.mWeakReference = weakReference;
    }
}
