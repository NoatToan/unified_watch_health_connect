package com.liulishuo.filedownloader;

import android.app.Notification;
import android.os.Looper;
import java.io.File;

/* JADX INFO: loaded from: classes18.dex */
public class FileDownloadLine {

    public class a implements f {
        public final /* synthetic */ int a;
        public final /* synthetic */ Notification b;

        public a(int i, Notification notification) {
            this.a = i;
            this.b = notification;
        }

        @Override // com.liulishuo.filedownloader.FileDownloadLine.f
        public void connected() {
            FileDownloader.getImpl().startForeground(this.a, this.b);
        }

        @Override // com.liulishuo.filedownloader.FileDownloadLine.f
        public Object getValue() {
            return null;
        }
    }

    public class b implements f {
        private long a;
        public final /* synthetic */ int b;

        public b(int i) {
            this.b = i;
        }

        @Override // com.liulishuo.filedownloader.FileDownloadLine.f
        public void connected() {
            this.a = FileDownloader.getImpl().getSoFar(this.b);
        }

        @Override // com.liulishuo.filedownloader.FileDownloadLine.f
        public Object getValue() {
            return Long.valueOf(this.a);
        }
    }

    public class c implements f {
        private long a;
        public final /* synthetic */ int b;

        public c(int i) {
            this.b = i;
        }

        @Override // com.liulishuo.filedownloader.FileDownloadLine.f
        public void connected() {
            this.a = FileDownloader.getImpl().getTotal(this.b);
        }

        @Override // com.liulishuo.filedownloader.FileDownloadLine.f
        public Object getValue() {
            return Long.valueOf(this.a);
        }
    }

    public class d implements f {
        private byte a;
        public final /* synthetic */ int b;
        public final /* synthetic */ String c;

        public d(int i, String str) {
            this.b = i;
            this.c = str;
        }

        @Override // com.liulishuo.filedownloader.FileDownloadLine.f
        public void connected() {
            this.a = FileDownloader.getImpl().getStatus(this.b, this.c);
        }

        @Override // com.liulishuo.filedownloader.FileDownloadLine.f
        public Object getValue() {
            return Byte.valueOf(this.a);
        }
    }

    public static class e implements Runnable {
        private boolean a = false;
        private final f b;

        public e(f fVar) {
            this.b = fVar;
        }

        public boolean a() {
            return this.a;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                this.b.connected();
                this.a = true;
                notifyAll();
            }
        }
    }

    public interface f {
        void connected();

        Object getValue();
    }

    private void a(f fVar) {
        e eVar = new e(fVar);
        synchronized (eVar) {
            FileDownloader.getImpl().bindService(eVar);
            if (!eVar.a()) {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    throw new IllegalThreadStateException("Sorry, FileDownloader can not block the main thread, because the system is also  callbacks ServiceConnection#onServiceConnected method in the main thread.");
                }
                try {
                    eVar.wait(200000L);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public long getSoFar(int i) {
        if (FileDownloader.getImpl().isServiceConnected()) {
            return FileDownloader.getImpl().getSoFar(i);
        }
        b bVar = new b(i);
        a(bVar);
        return ((Long) bVar.getValue()).longValue();
    }

    public byte getStatus(int i, String str) {
        if (FileDownloader.getImpl().isServiceConnected()) {
            return FileDownloader.getImpl().getStatus(i, str);
        }
        if (str != null && new File(str).exists()) {
            return (byte) -3;
        }
        d dVar = new d(i, str);
        a(dVar);
        return ((Byte) dVar.getValue()).byteValue();
    }

    public long getTotal(int i) {
        if (FileDownloader.getImpl().isServiceConnected()) {
            return FileDownloader.getImpl().getTotal(i);
        }
        c cVar = new c(i);
        a(cVar);
        return ((Long) cVar.getValue()).longValue();
    }

    public void startForeground(int i, Notification notification) {
        if (FileDownloader.getImpl().isServiceConnected()) {
            FileDownloader.getImpl().startForeground(i, notification);
        } else {
            a(new a(i, notification));
        }
    }
}
