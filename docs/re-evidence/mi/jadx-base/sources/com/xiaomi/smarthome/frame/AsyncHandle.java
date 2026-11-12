package com.xiaomi.smarthome.frame;

import android.os.RemoteException;
import com.xiaomi.smarthome.core.server.IServerHandle;
import com.xiaomi.smarthome.frame.cancel.Cancelable;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import okhttp3.Call;

/* JADX INFO: loaded from: classes2.dex */
public class AsyncHandle<H> {
    protected WeakReference<H> mHandle;

    public static class AsyncHandleWrap extends AsyncHandle {
        private boolean mCancel;

        public AsyncHandleWrap() {
            super(null);
        }

        @Override // com.xiaomi.smarthome.frame.AsyncHandle
        public void cancel() {
            this.mCancel = true;
            super.cancel();
        }

        public boolean isCancel() {
            return this.mCancel;
        }

        public void wrap(AsyncHandle asyncHandle) {
            if (asyncHandle != null) {
                this.mHandle = asyncHandle.mHandle;
            }
        }
    }

    public static class ExecuteAsyncHandle extends AsyncHandle {
        Callable<AsyncHandle> execute;

        public ExecuteAsyncHandle(Callable<AsyncHandle> callable) {
            super(null);
            this.execute = callable;
        }

        @Override // com.xiaomi.smarthome.frame.AsyncHandle
        public void cancel() {
            this.execute = null;
            super.cancel();
        }

        public void execute() throws Exception {
            Callable<AsyncHandle> callable = this.execute;
            if (callable == null) {
                return;
            }
            AsyncHandle asyncHandleCall = callable.call();
            this.execute = null;
            if (asyncHandleCall != null) {
                this.mHandle = asyncHandleCall.mHandle;
            }
        }
    }

    public AsyncHandle(H h) {
        this.mHandle = new WeakReference<>(h);
    }

    public void cancel() {
        H h;
        WeakReference<H> weakReference = this.mHandle;
        if (weakReference == null || (h = weakReference.get()) == null) {
            return;
        }
        if (h instanceof Cancelable) {
            ((Cancelable) h).cancel();
            return;
        }
        if (h instanceof IServerHandle) {
            try {
                ((IServerHandle) h).cancel();
            } catch (RemoteException unused) {
            }
        } else if (h instanceof Call) {
            ((Call) h).cancel();
        }
    }
}
