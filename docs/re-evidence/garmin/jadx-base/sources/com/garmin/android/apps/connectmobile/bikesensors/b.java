package com.garmin.android.apps.connectmobile.bikesensors;

import android.app.DownloadManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class b extends HandlerThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f30856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference<InterfaceC0491b> f30857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference<Context> f30858c;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            b bVar = b.this;
            Context context = bVar.f30858c.get();
            InterfaceC0491b interfaceC0491b = bVar.f30857b.get();
            if (context == null || interfaceC0491b == null) {
                return;
            }
            long jLongValue = ((Long) message.obj).longValue();
            DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
            DownloadManager.Query query = new DownloadManager.Query();
            query.setFilterById(jLongValue);
            Cursor cursorQuery = downloadManager.query(query);
            int i14 = message.arg1;
            if (i14 == 1) {
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    return;
                }
                interfaceC0491b.O0(cursorQuery.getInt(cursorQuery.getColumnIndex("bytes_so_far")), cursorQuery.getInt(cursorQuery.getColumnIndex("total_size")));
                return;
            }
            if (i14 == 2) {
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    return;
                }
                interfaceC0491b.Y4(cursorQuery.getInt(cursorQuery.getColumnIndex("status")));
                return;
            }
            if (i14 != 3) {
                return;
            }
            if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                interfaceC0491b.F6();
            } else {
                interfaceC0491b.s3(cursorQuery.getInt(cursorQuery.getColumnIndex("status")));
            }
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.bikesensors.b$b, reason: collision with other inner class name */
    public interface InterfaceC0491b {
        void F6();

        void O0(int i14, int i15);

        void Y4(int i14);

        void s3(int i14);
    }

    public b(Context context, InterfaceC0491b interfaceC0491b) {
        super("DownloadManagerHandlerThread", -2);
        this.f30858c = new WeakReference<>(context);
        this.f30857b = new WeakReference<>(interfaceC0491b);
    }

    public final synchronized void a(long j8) {
        if (this.f30856a != null && isAlive()) {
            Message message = new Message();
            message.arg1 = 2;
            message.obj = Long.valueOf(j8);
            this.f30856a.sendMessage(message);
        }
    }

    public final synchronized void b(long j8) {
        if (this.f30856a != null && isAlive()) {
            Message message = new Message();
            message.arg1 = 1;
            message.obj = Long.valueOf(j8);
            this.f30856a.sendMessage(message);
        }
    }

    public final synchronized void c(long j8) {
        if (this.f30856a != null && isAlive()) {
            Message message = new Message();
            message.arg1 = 3;
            message.obj = Long.valueOf(j8);
            this.f30856a.sendMessage(message);
        }
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        this.f30856a = new a(getLooper());
    }

    @Override // android.os.HandlerThread
    public final boolean quitSafely() {
        a aVar = this.f30856a;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
        }
        return super.quitSafely();
    }
}
