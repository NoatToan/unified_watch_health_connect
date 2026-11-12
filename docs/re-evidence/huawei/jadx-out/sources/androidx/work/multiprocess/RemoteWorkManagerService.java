package androidx.work.multiprocess;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.work.Logger;

/* JADX INFO: loaded from: classes4.dex */
public class RemoteWorkManagerService extends Service {
    static final String TAG = Logger.tagWithPrefix("RemoteWorkManagerService");
    private IBinder mBinder;

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mBinder = new RemoteWorkManagerImpl(this);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Logger.get().info(TAG, "Binding to RemoteWorkManager");
        return this.mBinder;
    }
}
