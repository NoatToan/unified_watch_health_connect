package com.huami.watch.companion.agps;

import android.content.Context;
import android.widget.Toast;
import androidx.annotation.NonNull;
import com.huami.watch.companion.agps.AGpsSyncHelper;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.cloud.api.AGpsDataAPI;
import com.huami.watch.companion.cloud.api.AGpsDataQualcommAPI;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.sync.SyncResult;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.transport.FileTransporter;
import com.huami.watch.util.Box;
import com.huami.watch.util.DoLooper;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import com.huami.watch.util.StorageUtil;
import com.huami.watch.util.TimeUtil;
import com.ingenic.iwds.datatransactor.DataTransactor;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
public class AGpsSyncHelper {
    public static final String FILE_TYPE_SONY_LLE = "LLE";
    private static final String g = "AGps-SyncHelper";
    private static final String h = "agps_data_zip";
    private static AGpsSyncHelper i = null;
    private static final int j = 1410;
    private static final int k = 1410;
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
            if (AGpsSyncHelper.this.a) {
                AGpsSyncHelper.this.b = true;
                if (dataTransactResult.getResultCode() == 0) {
                    File file = (File) dataTransactResult.getTransferedObject();
                    if (AGpsSyncHelper.this.d == null || !AGpsSyncHelper.this.d.getAbsolutePath().equals(file.getAbsolutePath())) {
                        return;
                    }
                    AGpsSyncHelper.this.c = true;
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
            if (AGpsSyncHelper.this.b) {
                result.finish = true;
                result.success = AGpsSyncHelper.this.c;
            }
            return result;
        }
    }

    private AGpsSyncHelper() {
    }

    public static void clearLastAGpsSyncTime() {
        Box.get().remove("AGpsSyncTime-AGPSZIP");
        Box.get().remove("AGpsSyncTime-QUALCOMM");
        Box.get().remove("AGpsSyncTime-AGPS_ALM");
    }

    public static boolean downloadData(Context context, String str, @NonNull File file) throws Throwable {
        boolean z;
        Log.i(g, "Download Data Start, Save To : " + file, new Object[0]);
        byte[] data = Cloud.FILE_TYPE_QUALCOMM.equals(str) ? AGpsDataQualcommAPI.getData() : AGpsDataAPI.getData(context, str);
        if (data != null) {
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
                        }
                        z = true;
                    } catch (IOException e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        e.printStackTrace();
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        z = false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e5) {
                e = e5;
            }
        } else {
            z = false;
        }
        boolean z2 = z & (file.length() > 0);
        Log.d(g, "Download Data Success : " + z2, new Object[0]);
        return z2;
    }

    public static AGpsSyncHelper getHelper() {
        if (i == null) {
            i = new AGpsSyncHelper();
        }
        return i;
    }

    private File i(Context context, String str) {
        return Cloud.FILE_TYPE_QUALCOMM.equals(str) ? StorageUtil.getAGpsQualcommDownloadFile(context, Config.isDebug()) : context.getFileStreamPath(h);
    }

    public static boolean isNeedSync(String str) {
        int iAbs = Math.abs(TimeUtil.offsetMinusCurrentToMillis(j(str), "LastAGpsSync-" + str));
        boolean z = true;
        if (Cloud.FILE_TYPE_AGPS_ZIP.equals(str) || Cloud.FILE_TYPE_AGPS_ALM_ZIP.equals(str) || FILE_TYPE_SONY_LLE.equals(str) ? iAbs < 1410 : !Cloud.FILE_TYPE_QUALCOMM.equals(str) || iAbs < 1410) {
            z = false;
        }
        Log.d(g, "IsNeedSync : " + str + ", " + z, new Object[0]);
        return z;
    }

    private static long j(String str) {
        return Box.get().getLong("AGpsSyncTime-" + str, 0L);
    }

    public static boolean k() {
        if (Box.get() == null) {
            return false;
        }
        return isNeedSync(Cloud.FILE_TYPE_AGPS_ZIP) || isNeedSync(Cloud.FILE_TYPE_QUALCOMM);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(String str, Context context, int i2, ObservableEmitter observableEmitter) throws Exception {
        SyncResult syncResult = new SyncResult();
        Device deviceFind = str != null ? DeviceManager.getManager(context).find(str) : DeviceManager.getManager(context).getCurrentDevice();
        if (deviceFind != null) {
            SyncUtil.waitDeviceChannelAvailable(context, deviceFind);
            syncResult = syncAGpsToWatch(context, i2, deviceFind);
        }
        observableEmitter.onNext(syncResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(Context context, SyncResult syncResult) throws Exception {
        Log.d(g, "SyncResult: " + syncResult, new Object[0]);
        if (Config.isTestMode()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Sync AGps ");
            sb.append(syncResult.success ? "Success" : "Fail");
            Toast.makeText(context, sb.toString(), 0).show();
        }
    }

    private void n() {
        FileTransporter fileTransporter = this.e;
        if (fileTransporter != null) {
            fileTransporter.start();
        }
    }

    @NonNull
    private SyncResult o(Context context, String str, int i2) throws Throwable {
        SyncResult syncResult = new SyncResult();
        if (this.a) {
            Log.w(g, "Is Already Syncing...Abort!!", new Object[0]);
            return syncResult;
        }
        File fileI = i(context, str);
        this.d = fileI;
        if (fileI == null) {
            Log.w(g, "File to save is Null, Abort!!", new Object[0]);
            return syncResult;
        }
        Log.i(g, "Sync To Watch Start : " + str, new Object[0]);
        this.a = true;
        this.b = false;
        this.c = false;
        n();
        if (this.e == null) {
            return syncResult;
        }
        boolean zDownloadData = downloadData(context, str, this.d);
        if (zDownloadData) {
            Log.d(g, "Send Data To Watch Start...", new Object[0]);
            this.e.send(this.d);
            zDownloadData = DoLooper.doLoop(new b(), 500, i2);
            if (!zDownloadData) {
                syncResult.failCode = 2;
            }
        } else {
            syncResult.failCode = 1;
        }
        this.a = false;
        if (zDownloadData) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Log.d(g, "Save Sync Time : " + TimeUtil.formatDateTime(jCurrentTimeMillis), new Object[0]);
            putAGpsSyncTime(str, jCurrentTimeMillis);
        }
        syncResult.finish = true;
        syncResult.success = zDownloadData;
        Log.i(g, "Sync Data To Watch End : " + syncResult, new Object[0]);
        return syncResult;
    }

    public static void putAGpsSyncTime(String str, long j2) {
        Box.get().put("AGpsSyncTime-" + str, j2);
    }

    public void startFileTransporter(Context context) {
        if (this.e == null) {
            FileTransporter transporter = FileTransporter.getTransporter(context);
            this.e = transporter;
            transporter.addFileListener(this.f);
        }
        n();
    }

    public SyncResult syncAGpsToWatch(Context context, int i2, @NonNull Device device) throws Throwable {
        SyncResult syncResult = new SyncResult();
        syncResult.success = true;
        boolean zIsSeriesXihu = DeviceSource.isSeriesXihu(device);
        Log.d(g, "Is Qualcomm Platform: " + zIsSeriesXihu, new Object[0]);
        if (!zIsSeriesXihu && isNeedSync(Cloud.FILE_TYPE_AGPS_ZIP)) {
            syncResult = o(context, Cloud.FILE_TYPE_AGPS_ZIP, i2);
        }
        return (zIsSeriesXihu && isNeedSync(Cloud.FILE_TYPE_QUALCOMM)) ? o(context, Cloud.FILE_TYPE_QUALCOMM, i2) : syncResult;
    }

    public Observable<SyncResult> syncAGpsToWatchObservable(final Context context, long j2, final int i2, final String str) {
        Log.i(g, "Sync AGps To Watch Async, Delay : " + j2 + "s, Timeout : " + i2 + "s, Device: " + str, new Object[0]);
        return Rx.io(new ObservableOnSubscribe() { // from class: c
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.l(str, context, i2, observableEmitter);
            }
        }).timer(j2, TimeUnit.SECONDS).observable().doOnNext(new Consumer() { // from class: d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                AGpsSyncHelper.m(context, (SyncResult) obj);
            }
        });
    }
}
