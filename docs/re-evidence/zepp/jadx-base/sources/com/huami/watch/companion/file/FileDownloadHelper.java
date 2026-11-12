package com.huami.watch.companion.file;

import android.content.Context;
import com.huami.watch.companion.cloud.api.FileDownloadApi;
import com.huami.watch.companion.file.FileDownloadHelper;
import com.huami.watch.companion.sync.SyncResult;
import com.huami.watch.transport.FileTransporter;
import com.huami.watch.util.DoLooper;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import com.huami.watch.util.StorageUtil;
import com.ingenic.iwds.datatransactor.DataTransactor;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public class FileDownloadHelper {
    public static final String KEY_FILE_SUFFIX_NAME = "AppendSuffix";
    public static final String KEY_URL = "DownloadUrl";
    private static final String g = "FileDownloadHelper";
    private static FileDownloadHelper h;
    private FileTransporter a;
    private boolean b;
    private boolean c;
    private boolean d;
    private int e = 30;
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
            Log.w(FileDownloadHelper.g, "Sync File To Watch onSendResult:" + dataTransactResult.getResultCode(), new Object[0]);
            if (FileDownloadHelper.this.b) {
                FileDownloadHelper.this.c = true;
                if (dataTransactResult.getResultCode() == 0) {
                    FileDownloadHelper.this.d = true;
                    Log.w(FileDownloadHelper.g, "Sync File To Watch onSendResult:" + ((File) dataTransactResult.getTransferedObject()).getAbsolutePath(), new Object[0]);
                }
            }
        }
    }

    private boolean g(Context context, String str, File file) throws Throwable {
        byte[] data = FileDownloadApi.INSTANCE.getData(context, str);
        if (data == null) {
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    fileOutputStream2.write(data);
                    fileOutputStream2.flush();
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                        Log.e(g, "downLoadFile: close:error:" + e, new Object[0]);
                    }
                    return true;
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    e.printStackTrace();
                    Log.e(g, "downLoadFile: error:" + e, new Object[0]);
                    if (fileOutputStream == null) {
                        return false;
                    }
                    try {
                        fileOutputStream.close();
                        return false;
                    } catch (IOException e3) {
                        e3.printStackTrace();
                        Log.e(g, "downLoadFile: close:error:" + e3, new Object[0]);
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                            Log.e(g, "downLoadFile: close:error:" + e4, new Object[0]);
                        }
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static FileDownloadHelper getHelper() {
        if (h == null) {
            h = new FileDownloadHelper();
        }
        return h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DoLooper.Result h() throws Exception {
        DoLooper.Result result = new DoLooper.Result();
        if (this.c) {
            result.finish = true;
            result.success = this.d;
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(Context context, String str, String str2, SyncResult syncResult, ObservableEmitter observableEmitter) throws Exception {
        File romDownloadFile = StorageUtil.getRomDownloadFile(context, FileDownloadApi.INSTANCE.getFileNameByUrl(context, str), str2);
        if (romDownloadFile != null) {
            Log.i(g, "Sync File To Watch Start : " + romDownloadFile, new Object[0]);
            boolean zG = g(context, str, romDownloadFile);
            if (zG) {
                this.a.send(romDownloadFile);
                zG = DoLooper.doLoop(new DoLooper.Function() { // from class: a62
                    @Override // com.huami.watch.util.DoLooper.Function
                    public final Object apply() {
                        return this.a.h();
                    }
                }, 500, this.e);
                if (!zG) {
                    syncResult.failCode = 2;
                }
            } else {
                syncResult.failCode = 1;
            }
            syncResult.finish = true;
            syncResult.success = zG;
        } else {
            Log.w(g, "syncFileToWatch:File to save is Null, Abort!!", new Object[0]);
        }
        observableEmitter.onNext(syncResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(SyncResult syncResult, SyncResult syncResult2) throws Exception {
        Log.i(g, "Sync File To Watch End : " + syncResult, new Object[0]);
    }

    private void k() {
        FileTransporter fileTransporter = this.a;
        if (fileTransporter != null) {
            fileTransporter.start();
        }
    }

    public void startFileTransporter(Context context) {
        if (this.a == null) {
            FileTransporter transporter = FileTransporter.getTransporter(context);
            this.a = transporter;
            transporter.addFileListener(this.f);
        }
        Log.d(g, "startFileTransporter !!!", new Object[0]);
        k();
    }

    public void syncFileToWatch(final Context context, final String str, final String str2) {
        Log.d(g, "syncFileToWatch !!!", new Object[0]);
        if (this.a == null) {
            startFileTransporter(context);
        }
        final SyncResult syncResult = new SyncResult();
        this.b = true;
        this.c = false;
        this.d = false;
        Rx.io(new ObservableOnSubscribe() { // from class: b62
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.i(context, str, str2, syncResult, observableEmitter);
            }
        }).safeSubscribe(new Consumer() { // from class: c62
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                FileDownloadHelper.j(syncResult, (SyncResult) obj);
            }
        });
    }
}
