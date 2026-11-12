package com.liulishuo.filedownloader;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.RemoteException;
import com.liulishuo.filedownloader.i.IFileDownloadIPCService;
import com.liulishuo.filedownloader.util.FileDownloadHelper;
import com.liulishuo.filedownloader.util.FileDownloadLog;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public class PauseAllMarker implements Handler.Callback {
    private static final String d = ".filedownloader_pause_all_marker.b";
    private static File e;
    private static final Long f = 1000L;
    private static final int g = 0;
    private HandlerThread a;
    private Handler b;
    private final IFileDownloadIPCService c;

    public PauseAllMarker(IFileDownloadIPCService iFileDownloadIPCService) {
        this.c = iFileDownloadIPCService;
    }

    private static boolean a() {
        return b().exists();
    }

    private static File b() {
        if (e == null) {
            e = new File(FileDownloadHelper.getAppContext().getCacheDir() + File.separator + d);
        }
        return e;
    }

    public static void clearMarker() {
        File fileB = b();
        if (fileB.exists()) {
            FileDownloadLog.d(PauseAllMarker.class, "delete marker file " + fileB.delete(), new Object[0]);
        }
    }

    public static void createMarker() {
        File fileB = b();
        if (!fileB.getParentFile().exists()) {
            fileB.getParentFile().mkdirs();
        }
        if (fileB.exists()) {
            FileDownloadLog.w(PauseAllMarker.class, "marker file " + fileB.getAbsolutePath() + " exists", new Object[0]);
            return;
        }
        try {
            FileDownloadLog.d(PauseAllMarker.class, "create marker file" + fileB.getAbsolutePath() + " " + fileB.createNewFile(), new Object[0]);
        } catch (IOException e2) {
            FileDownloadLog.e(PauseAllMarker.class, "create marker file failed", e2);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        try {
            if (a()) {
                try {
                    this.c.pauseAllTasks();
                } catch (RemoteException e2) {
                    FileDownloadLog.e(this, e2, "pause all failed", new Object[0]);
                }
                clearMarker();
            }
            this.b.sendEmptyMessageDelayed(0, f.longValue());
            return true;
        } catch (Throwable th) {
            clearMarker();
            throw th;
        }
    }

    public void startPauseAllLooperCheck() {
        HandlerThread handlerThread = new HandlerThread("PauseAllChecker");
        this.a = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(this.a.getLooper(), this);
        this.b = handler;
        handler.sendEmptyMessageDelayed(0, f.longValue());
    }

    public void stopPauseAllLooperCheck() {
        this.b.removeMessages(0);
        this.a.quit();
    }
}
