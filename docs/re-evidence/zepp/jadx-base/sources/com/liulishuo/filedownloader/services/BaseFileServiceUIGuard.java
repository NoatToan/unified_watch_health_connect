package com.liulishuo.filedownloader.services;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.liulishuo.filedownloader.FileDownloadEventPool;
import com.liulishuo.filedownloader.IFileDownloadServiceProxy;
import com.liulishuo.filedownloader.event.DownloadServiceConnectChangedEvent;
import com.liulishuo.filedownloader.util.ExtraKeys;
import com.liulishuo.filedownloader.util.FileDownloadLog;
import com.liulishuo.filedownloader.util.FileDownloadUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public abstract class BaseFileServiceUIGuard<CALLBACK extends Binder, INTERFACE extends IInterface> implements IFileDownloadServiceProxy, ServiceConnection {
    private volatile INTERFACE b;
    private final Class<?> c;
    public boolean runServiceForeground = false;
    private final HashMap<String, Object> d = new HashMap<>();
    private final List<Context> e = new ArrayList();
    private final ArrayList<Runnable> f = new ArrayList<>();
    private final CALLBACK a = (CALLBACK) createCallback();

    public BaseFileServiceUIGuard(Class<?> cls) {
        this.c = cls;
    }

    private void a(boolean z) {
        if (!z && this.b != null) {
            try {
                unregisterCallback(this.b, this.a);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "release connect resources %s", this.b);
        }
        this.b = null;
        FileDownloadEventPool.getImpl().asyncPublishInNewThread(new DownloadServiceConnectChangedEvent(z ? DownloadServiceConnectChangedEvent.ConnectStatus.lost : DownloadServiceConnectChangedEvent.ConnectStatus.disconnected, this.c));
    }

    public abstract INTERFACE asInterface(IBinder iBinder);

    @Override // com.liulishuo.filedownloader.IFileDownloadServiceProxy
    public void bindStartByContext(Context context) {
        bindStartByContext(context, null);
    }

    public abstract CALLBACK createCallback();

    public CALLBACK getCallback() {
        return this.a;
    }

    public INTERFACE getService() {
        return this.b;
    }

    @Override // com.liulishuo.filedownloader.IFileDownloadServiceProxy
    public boolean isConnected() {
        return getService() != null;
    }

    @Override // com.liulishuo.filedownloader.IFileDownloadServiceProxy
    public boolean isRunServiceForeground() {
        return this.runServiceForeground;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.b = (INTERFACE) asInterface(iBinder);
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "onServiceConnected %s %s", componentName, this.b);
        }
        try {
            registerCallback(this.b, this.a);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        List list = (List) this.f.clone();
        this.f.clear();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        FileDownloadEventPool.getImpl().asyncPublishInNewThread(new DownloadServiceConnectChangedEvent(DownloadServiceConnectChangedEvent.ConnectStatus.connected, this.c));
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "onServiceDisconnected %s %s", componentName, this.b);
        }
        a(true);
    }

    public Object popCache(String str) {
        return this.d.remove(str);
    }

    public String putCache(Object obj) {
        if (obj == null) {
            return null;
        }
        String string = obj.toString();
        this.d.put(string, obj);
        return string;
    }

    public abstract void registerCallback(INTERFACE r1, CALLBACK callback) throws RemoteException;

    @Override // com.liulishuo.filedownloader.IFileDownloadServiceProxy
    public void unbindByContext(Context context) {
        if (this.e.contains(context)) {
            if (FileDownloadLog.NEED_LOG) {
                FileDownloadLog.d(this, "unbindByContext %s", context);
            }
            this.e.remove(context);
            if (this.e.isEmpty()) {
                a(false);
            }
            Intent intent = new Intent(context, this.c);
            context.unbindService(this);
            context.stopService(intent);
        }
    }

    public abstract void unregisterCallback(INTERFACE r1, CALLBACK callback) throws RemoteException;

    @Override // com.liulishuo.filedownloader.IFileDownloadServiceProxy
    public void bindStartByContext(Context context, Runnable runnable) {
        if (FileDownloadUtils.isDownloaderProcess(context)) {
            throw new IllegalStateException("Fatal-Exception: You can't bind the FileDownloadService in :filedownloader process.\n It's the invalid operation and is likely to cause unexpected problems.\n Maybe you want to use non-separate process mode for FileDownloader, More detail about non-separate mode, please move to wiki manually: https://github.com/lingochamp/FileDownloader/wiki/filedownloader.properties");
        }
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "bindStartByContext %s", context.getClass().getSimpleName());
        }
        Intent intent = new Intent(context, this.c);
        if (runnable != null && !this.f.contains(runnable)) {
            this.f.add(runnable);
        }
        if (!this.e.contains(context)) {
            this.e.add(context);
        }
        boolean zNeedMakeServiceForeground = FileDownloadUtils.needMakeServiceForeground(context);
        this.runServiceForeground = zNeedMakeServiceForeground;
        intent.putExtra(ExtraKeys.IS_FOREGROUND, zNeedMakeServiceForeground);
        context.bindService(intent, this, 1);
        if (!this.runServiceForeground) {
            context.startService(intent);
            return;
        }
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "start foreground service", new Object[0]);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        }
    }
}
