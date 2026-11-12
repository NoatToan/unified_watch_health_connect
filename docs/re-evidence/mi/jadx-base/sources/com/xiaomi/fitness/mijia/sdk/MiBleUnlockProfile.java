package com.xiaomi.fitness.mijia.sdk;

import android.content.Context;
import com.xiaomi.onetrack.OneTrack;
import defpackage.puf;
import defpackage.ruf;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 #2\u00020\u0001:\u0001#B!\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b!\u0010\"J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/mijia/sdk/MiBleUnlockProfile;", "", "Lcom/xiaomi/fitness/mijia/sdk/IProfileStateChangeCallback;", "callback", "Lpuf$e;", "createMiuiProfileStateChangeCallback", "(Lcom/xiaomi/fitness/mijia/sdk/IProfileStateChangeCallback;)Lpuf$e;", "", "key", "", "setLock", "(Ljava/lang/String;)Z", "", "rssi", "setRssiThreshold", "(I)Z", OneTrack.Event.UNLOCK, "()Z", "", "connect", "()V", "disconnect", "setProfileStateChangeCallback", "(Lcom/xiaomi/fitness/mijia/sdk/IProfileStateChangeCallback;)V", "Lruf;", "unlockProfileImpl", "Lruf;", "isReady", "getRssi", "()I", "Landroid/content/Context;", "context", "device", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/xiaomi/fitness/mijia/sdk/IProfileStateChangeCallback;)V", "Companion", "mijia-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class MiBleUnlockProfile {
    public static final int STATUS_ERROR = -1;
    public static final int STATUS_READY = 4;

    @NotNull
    private final ruf unlockProfileImpl;

    public MiBleUnlockProfile(@NotNull Context context, @NotNull String device, @Nullable IProfileStateChangeCallback iProfileStateChangeCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(device, "device");
        this.unlockProfileImpl = new ruf(context, device, createMiuiProfileStateChangeCallback(iProfileStateChangeCallback));
    }

    private final puf.e createMiuiProfileStateChangeCallback(final IProfileStateChangeCallback callback) {
        if (callback == null) {
            return null;
        }
        return new puf.e() { // from class: quf
            @Override // puf.e
            public final void onState(int i) {
                callback.onState(i);
            }
        };
    }

    public final void connect() {
        this.unlockProfileImpl.h();
    }

    public final void disconnect() {
        this.unlockProfileImpl.i();
    }

    public final int getRssi() {
        return this.unlockProfileImpl.j();
    }

    public final boolean isReady() {
        return this.unlockProfileImpl.k();
    }

    public final boolean setLock(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.unlockProfileImpl.n(key);
    }

    public final void setProfileStateChangeCallback(@Nullable IProfileStateChangeCallback callback) {
        this.unlockProfileImpl.m(createMiuiProfileStateChangeCallback(callback));
    }

    public final boolean setRssiThreshold(int rssi) {
        return this.unlockProfileImpl.o(rssi);
    }

    public final boolean unlock() {
        return this.unlockProfileImpl.p();
    }
}
