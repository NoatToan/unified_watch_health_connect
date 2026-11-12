package com.huami.bluetooth.profile.channel;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J,\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\nR.\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t0\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R.\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t0\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelCallbackHolder;", "", "", "module", "", "a", "mode", "", "isOneTime", "Lkotlin/Function1;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "callback", "register", MiPushClient.COMMAND_UNREGISTER, "hasModule", AbstractJSONTokenResponse.RESPONSE, "dispatch", "", "Ljava/util/Map;", "callbacks", "b", "oneTimeCallbacks", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ChannelCallbackHolder {

    @NotNull
    public static final String TAG = "ChannelCallbackHolder";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Map<Integer, Function1<ChannelResponse, Unit>> callbacks = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private Map<Integer, Function1<ChannelResponse, Unit>> oneTimeCallbacks = new LinkedHashMap();

    private final void a(int module) {
        if (this.oneTimeCallbacks.containsKey(Integer.valueOf(module))) {
            this.oneTimeCallbacks.remove(Integer.valueOf(module));
        }
    }

    public static /* synthetic */ void register$default(ChannelCallbackHolder channelCallbackHolder, int i, boolean z, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        channelCallbackHolder.register(i, z, function1);
    }

    public final void dispatch(int mode, @NotNull ChannelResponse response) {
        Function1<ChannelResponse, Unit> function1 = this.callbacks.get(Integer.valueOf(mode));
        if (function1 == null) {
            function1 = this.oneTimeCallbacks.get(Integer.valueOf(mode));
        }
        if (function1 != null) {
            a(mode);
            function1.invoke(response);
            return;
        }
        Debug.fi(TAG, "No mode(" + mode + ") callback, data dropped");
    }

    public final boolean hasModule(int module) {
        return this.callbacks.containsKey(Integer.valueOf(module)) || this.oneTimeCallbacks.containsKey(Integer.valueOf(module));
    }

    public final void register(int mode, boolean isOneTime, @NotNull Function1<? super ChannelResponse, Unit> callback) {
        if (isOneTime) {
            this.oneTimeCallbacks.put(Integer.valueOf(mode), callback);
        } else {
            this.callbacks.put(Integer.valueOf(mode), callback);
        }
    }

    public final void unregister(int mode) {
        this.callbacks.remove(Integer.valueOf(mode));
        if (this.callbacks.containsKey(Integer.valueOf(mode))) {
            this.callbacks.remove(Integer.valueOf(mode));
        } else if (this.oneTimeCallbacks.containsKey(Integer.valueOf(mode))) {
            this.oneTimeCallbacks.remove(Integer.valueOf(mode));
        }
    }
}
