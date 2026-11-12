package com.liulishuo.filedownloader;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.liulishuo.filedownloader.util.FileDownloadExecutors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes18.dex */
public class FileDownloadMessageStation {
    public static final int DEFAULT_INTERVAL = 10;
    public static final int DEFAULT_SUB_PACKAGE_SIZE = 5;
    public static final int f = 1;
    public static final int g = 2;
    public static int h = 10;
    public static int i = 5;
    private final Executor a;
    private final Handler b;
    private final LinkedBlockingQueue<d> c;
    private final Object d;
    private final ArrayList<d> e;

    public class a implements Runnable {
        public final /* synthetic */ d a;

        public a(d dVar) {
            this.a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.h();
        }
    }

    public static final class b {
        private static final FileDownloadMessageStation a = new FileDownloadMessageStation(null);

        private b() {
        }
    }

    public static class c implements Handler.Callback {
        private c() {
        }

        private void a(ArrayList<d> arrayList) {
            Iterator<d> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().h();
            }
            arrayList.clear();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                ((d) message.obj).h();
            } else if (i == 2) {
                a((ArrayList) message.obj);
                FileDownloadMessageStation.getImpl().d();
            }
            return true;
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    public /* synthetic */ FileDownloadMessageStation(a aVar) {
        this();
    }

    private void b(d dVar) {
        synchronized (this.d) {
            this.c.offer(dVar);
        }
        d();
    }

    private void c(d dVar) {
        Handler handler = this.b;
        handler.sendMessage(handler.obtainMessage(1, dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        synchronized (this.d) {
            if (this.e.isEmpty()) {
                if (this.c.isEmpty()) {
                    return;
                }
                int i2 = 0;
                if (isIntervalValid()) {
                    int i3 = h;
                    int iMin = Math.min(this.c.size(), i);
                    while (i2 < iMin) {
                        this.e.add(this.c.remove());
                        i2++;
                    }
                    i2 = i3;
                } else {
                    this.c.drainTo(this.e);
                }
                Handler handler = this.b;
                handler.sendMessageDelayed(handler.obtainMessage(2, this.e), i2);
            }
        }
    }

    public static FileDownloadMessageStation getImpl() {
        return b.a;
    }

    public static boolean isIntervalValid() {
        return h > 0;
    }

    public void e(d dVar) {
        f(dVar, false);
    }

    public void f(d dVar, boolean z) {
        if (dVar.i()) {
            dVar.h();
            return;
        }
        if (dVar.f()) {
            this.a.execute(new a(dVar));
            return;
        }
        if (!isIntervalValid() && !this.c.isEmpty()) {
            synchronized (this.d) {
                if (!this.c.isEmpty()) {
                    Iterator<d> it2 = this.c.iterator();
                    while (it2.hasNext()) {
                        c(it2.next());
                    }
                }
                this.c.clear();
            }
        }
        if (!isIntervalValid() || z) {
            c(dVar);
        } else {
            b(dVar);
        }
    }

    private FileDownloadMessageStation() {
        this.a = FileDownloadExecutors.newDefaultThreadPool(5, "BlockCompleted");
        this.d = new Object();
        this.e = new ArrayList<>();
        this.b = new Handler(Looper.getMainLooper(), new c(null));
        this.c = new LinkedBlockingQueue<>();
    }
}
