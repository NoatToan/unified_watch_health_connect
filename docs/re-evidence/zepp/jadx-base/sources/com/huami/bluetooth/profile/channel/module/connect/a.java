package com.huami.bluetooth.profile.channel.module.connect;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.slre.HMLFEvent;
import com.xiaomi.hm.health.bt.profile.slre.ILFEventListener;
import com.xiaomi.hm.health.bt.profile.slre.LfType;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\b\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/connect/a;", "Lcom/xiaomi/hm/health/bt/profile/slre/ILFEventListener;", "", "c", "Lcom/xiaomi/hm/health/bt/profile/slre/HMLFEvent;", "event", "onLFEvent", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "a", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "b", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "()Ljava/lang/ref/WeakReference;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceType;Ljava/lang/ref/WeakReference;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
final class a implements ILFEventListener {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMDeviceType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final WeakReference<ILFEventListener> listener;

    public a(@NotNull HMDeviceType hMDeviceType, @NotNull WeakReference<ILFEventListener> weakReference) {
        this.type = hMDeviceType;
        this.listener = weakReference;
    }

    @NotNull
    public final WeakReference<ILFEventListener> a() {
        return this.listener;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final HMDeviceType getType() {
        return this.type;
    }

    public final void c() {
        onLFEvent(new HMLFEvent(this.type, LfType.WAKE_UP));
    }

    @Override // com.xiaomi.hm.health.bt.profile.slre.ILFEventListener
    public void onLFEvent(@Nullable HMLFEvent event) {
        ILFEventListener iLFEventListener = this.listener.get();
        if (iLFEventListener == null) {
            return;
        }
        iLFEventListener.onLFEvent(event);
    }
}
