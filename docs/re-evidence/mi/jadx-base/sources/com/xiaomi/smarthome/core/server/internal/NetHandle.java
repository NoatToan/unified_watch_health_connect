package com.xiaomi.smarthome.core.server.internal;

import com.xiaomi.smarthome.frame.cancel.Cancelable;
import java.lang.ref.WeakReference;
import okhttp3.Call;

/* JADX INFO: loaded from: classes10.dex */
public class NetHandle implements Cancelable {
    private final WeakReference<Call> mCall;

    public static class NetHandleWrap extends NetHandle {
        private NetHandle inner;
        private boolean mCancel;

        public NetHandleWrap() {
            super(null);
        }

        @Override // com.xiaomi.smarthome.core.server.internal.NetHandle, com.xiaomi.smarthome.frame.cancel.Cancelable
        public void cancel() {
            this.mCancel = true;
            NetHandle netHandle = this.inner;
            if (netHandle != null) {
                netHandle.cancel();
            }
        }

        public boolean isCancel() {
            return this.mCancel;
        }

        public void setInner(NetHandle netHandle) {
            this.inner = netHandle;
        }
    }

    public NetHandle(Call call) {
        this.mCall = new WeakReference<>(call);
    }

    @Override // com.xiaomi.smarthome.frame.cancel.Cancelable
    public void cancel() {
        Call call = this.mCall.get();
        if (call != null) {
            call.cancel();
        }
    }
}
