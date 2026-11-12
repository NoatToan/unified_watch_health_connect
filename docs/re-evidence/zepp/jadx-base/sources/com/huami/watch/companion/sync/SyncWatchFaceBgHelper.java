package com.huami.watch.companion.sync;

import android.content.Context;
import androidx.annotation.NonNull;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.transport.FileTransporter;
import com.huami.watch.util.DoLooper;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import com.ingenic.iwds.datatransactor.DataTransactor;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.io.File;
import org.cybergarage.soap.SOAP;

/* JADX INFO: loaded from: classes16.dex */
public class SyncWatchFaceBgHelper {
    private static final String g = "SyncHelper-WatchFaceBg";
    private static SyncWatchFaceBgHelper h;
    private boolean a;
    private boolean b;
    private boolean c;
    private File d;
    private FileTransporter e;
    private FileTransporter.FileListener f = new a();

    public class a implements FileTransporter.FileListener {
        public a() {
        }

        @Override // com.huami.watch.transport.FileTransporter.FileListener
        public void onFileArrived(File file) {
        }

        @Override // com.huami.watch.transport.FileTransporter.FileListener
        public void onReceiveFileProgress(int i) {
        }

        @Override // com.huami.watch.transport.FileTransporter.FileListener
        public void onSendFileProgress(int i) {
        }

        @Override // com.huami.watch.transport.FileTransporter.FileListener
        public void onSendResult(DataTransactor.DataTransactResult dataTransactResult) {
            if (SyncWatchFaceBgHelper.this.a) {
                SyncWatchFaceBgHelper.this.b = true;
                if (dataTransactResult.getResultCode() == 0) {
                    File file = (File) dataTransactResult.getTransferedObject();
                    if (SyncWatchFaceBgHelper.this.d == null || !SyncWatchFaceBgHelper.this.d.getAbsolutePath().equals(file.getAbsolutePath())) {
                        return;
                    }
                    SyncWatchFaceBgHelper.this.c = true;
                }
            }
        }
    }

    public class b implements DoLooper.Function<DoLooper.Result> {
        public b() {
        }

        @Override // com.huami.watch.util.DoLooper.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DoLooper.Result apply() throws Exception {
            DoLooper.Result result = new DoLooper.Result();
            if (SyncWatchFaceBgHelper.this.b) {
                result.finish = true;
                result.success = SyncWatchFaceBgHelper.this.c;
            }
            return result;
        }
    }

    public class c implements ObservableOnSubscribe<SyncResult> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ int b;

        public c(Context context, int i) {
            this.a = context;
            this.b = i;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<SyncResult> observableEmitter) throws Exception {
            SyncResult syncResult = new SyncResult();
            try {
                syncResult = SyncWatchFaceBgHelper.this.syncWFBgToWatch(this.a, this.b);
            } catch (Exception e) {
                Log.e(SyncWatchFaceBgHelper.g, "SyncWFBgToWatchErr", e, new Object[0]);
            }
            observableEmitter.onNext(syncResult);
        }
    }

    private SyncWatchFaceBgHelper() {
    }

    private void g() {
        FileTransporter fileTransporter = this.e;
        if (fileTransporter != null) {
            fileTransporter.start();
        }
    }

    public static SyncWatchFaceBgHelper getHelper() {
        if (h == null) {
            h = new SyncWatchFaceBgHelper();
        }
        return h;
    }

    public void setFilePath(String str) {
        this.d = new File(str);
    }

    public void startFileTransporter(Context context) {
        if (this.e == null) {
            FileTransporter transporter = FileTransporter.getTransporter(context);
            this.e = transporter;
            transporter.addFileListener(this.f);
        }
        g();
    }

    @NonNull
    public SyncResult syncWFBgToWatch(Context context, int i) {
        SyncResult syncResult = new SyncResult();
        if (this.a) {
            Log.w(g, "Is already syncing, Abort!!", new Object[0]);
            return syncResult;
        }
        if (!DeviceManager.getManager(context).hasBoundDevice()) {
            Log.d(g, "No bound device, Abort!!", new Object[0]);
            return syncResult;
        }
        if (this.d == null) {
            Log.w(g, "File to save is Null, Abort!!", new Object[0]);
            return syncResult;
        }
        Log.i(g, "Sync Data To Watch Start...", new Object[0]);
        this.a = true;
        this.b = false;
        this.c = false;
        g();
        Log.d(g, "Send Data To Watch Start...", new Object[0]);
        this.e.send(this.d);
        boolean zDoLoop = DoLooper.doLoop(new b(), 500, i);
        if (!zDoLoop) {
            syncResult.failCode = 2;
        }
        this.a = false;
        syncResult.finish = true;
        syncResult.success = zDoLoop;
        Log.i(g, "Sync Data To Watch End : " + syncResult, new Object[0]);
        return syncResult;
    }

    public Observable<SyncResult> syncWFBgToWatchObservable(Context context, int i) {
        Log.i(g, "Sync Watch Face Bg To Watch Async, Timeout : " + i + SOAP.XMLNS, new Object[0]);
        return Rx.io(new c(context, i)).observable();
    }
}
