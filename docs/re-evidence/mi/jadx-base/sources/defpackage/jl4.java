package defpackage;

import android.os.RemoteException;
import com.xiaomi.smarthome.core.server.IServerHandle;
import com.xiaomi.smarthome.library.util.GlobalHandlerManager;

/* JADX INFO: loaded from: classes5.dex */
public abstract class jl4 extends IServerHandle.Stub implements Runnable {
    @Override // com.xiaomi.smarthome.core.server.IServerHandle
    public final void cancel() throws RemoteException {
        onCancel();
    }

    public void execute() {
        GlobalHandlerManager.getInstance().getGlobalWorkerHandler().post(this);
    }

    public abstract void onCancel();
}
