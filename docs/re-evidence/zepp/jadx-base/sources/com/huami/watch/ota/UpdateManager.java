package com.huami.watch.ota;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import com.huami.watch.ota.cloud.RomInfo;
import com.huami.watch.ota.cloud.RomInfoApi;
import com.huami.watch.util.Log;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class UpdateManager {
    public static final int CHECKHASH_FAIL = 0;
    public static final int CHECKHASH_MESSAGE = 300;
    public static final int DOWNLOAD_FAIL = 1;
    public static final int DOWNLOAD_MESSAGE = 200;
    public static final int DOWNLOAD_SUCCESS = 0;
    public static final int PROGRESS_MASSAGE = 400;
    public static final int SYNC_FAIL = 1;
    public static final int SYNC_MESSAGE = 100;
    public static final int SYNC_SUCCESS = 0;
    private static final String l = "HmOta-UpdateManager";
    private static int m;
    private static UpdateManager n;
    private Context a;
    private List<UpdateInfo> b;
    private List<String> c;
    private String d;
    private String e;
    private managerCallback f;
    private BeanDownload h;
    private RomInfoApi i;
    private RomInfo j;
    private DownloadThread g = null;
    private Handler k = new a();

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 100) {
                int iIntValue = Integer.valueOf(message.arg1).intValue();
                Log.d(UpdateManager.l, "sync update info finished, ret: " + iIntValue, new Object[0]);
                if (UpdateManager.this.f != null) {
                    UpdateManager.this.f.syncFinished(iIntValue);
                }
            } else if (i == 200) {
                int iIntValue2 = Integer.valueOf(message.arg1).intValue();
                Log.d(UpdateManager.l, "download complete ret: " + iIntValue2, new Object[0]);
                if (iIntValue2 == 0) {
                    BeanDownload.clearLastDownload(UpdateManager.this.a);
                    UpdateUtils.setUpdateState(UpdateManager.this.a, UpdateUtils.STATE_DOWNLOAD_SUCCESS);
                } else {
                    UpdateUtils.setUpdateState(UpdateManager.this.a, UpdateUtils.STATE_DOWNLOAD_FAIL);
                }
                if (UpdateManager.this.f != null) {
                    UpdateManager.this.f.downloadUpgrade(message.arg1);
                }
            } else if (i == 300) {
                Log.i(UpdateManager.l, "check download file md5 fail", new Object[0]);
                BeanDownload.clearLastDownload(UpdateManager.this.a);
                if (UpdateManager.this.f != null) {
                    UpdateManager.this.f.downloadUpgrade(-1);
                }
            } else if (i == 400) {
                int progressInt = UpdateManager.getProgressInt((BeanDownload) message.obj);
                if (UpdateManager.this.f != null) {
                    UpdateManager.this.f.updateDownloadProgress(progressInt);
                }
            }
            super.handleMessage(message);
        }
    }

    public class b extends AsyncTask {
        public b() {
        }

        @Override // android.os.AsyncTask
        public Object doInBackground(Object... objArr) {
            UpdateManager.this.j = new RomInfo();
            int romInfo = UpdateManager.this.i.getRomInfo(UpdateManager.this.j);
            Log.i(UpdateManager.l, "start to check update in background result : " + romInfo, new Object[0]);
            if (romInfo == 0) {
                return 0;
            }
            if (romInfo == 1) {
                UpdateManager.this.j = null;
                return 0;
            }
            UpdateManager.this.j = null;
            return 1;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Object obj) {
            UpdateManager.this.k.obtainMessage(100, ((Integer) obj).intValue(), 0).sendToTarget();
        }
    }

    public interface managerCallback {
        void downloadUpgrade(int i);

        void syncFinished(int i);

        void updateDownloadProgress(int i);
    }

    private UpdateManager(Context context) {
        this.a = context;
        this.i = new RomInfoApi(context);
    }

    public static UpdateManager getInstance(Context context) {
        if (n == null) {
            n = new UpdateManager(context);
        }
        UpdateUtils.putStringToSP(context, UpdateUtils.CONFIG_URL, UpdateUtils.URL_PRODUCTS_UPDATE);
        return n;
    }

    public static int getProgressInt(BeanDownload beanDownload) {
        long j = beanDownload.size;
        if (j > 0) {
            return (int) ((beanDownload.loadedSize * 100) / j);
        }
        return 0;
    }

    public void downloadUpatezip(RomInfo romInfo, String str) {
        Log.d(l, "start download thread", new Object[0]);
        m = 0;
        UpdateUtils.setUpdateState(this.a, 65282);
        this.h = new BeanDownload();
        if (BeanDownload.getLastMd5(this.a).equals(romInfo.getMd5Content())) {
            this.h.name = BeanDownload.getLastFilename(this.a);
            this.h.size = BeanDownload.getLastFileSize(this.a).longValue();
            this.h.loadedSize = BeanDownload.getLastLoadSize(this.a).longValue();
            this.h.url = BeanDownload.getLastUrl(this.a);
            this.h.md5 = BeanDownload.getLastMd5(this.a);
        } else {
            BeanDownload beanDownload = this.h;
            beanDownload.name = str;
            beanDownload.loadedSize = 0L;
            beanDownload.size = 0L;
            beanDownload.url = romInfo.getFileUrl();
            this.h.md5 = romInfo.getMd5Content();
        }
        BeanDownload beanDownload2 = this.h;
        beanDownload2.enable = true;
        beanDownload2.state = 2;
        DownloadThread downloadThread = new DownloadThread(this.a, this.h, this.k);
        this.g = downloadThread;
        downloadThread.start();
    }

    public int getDownloadProgress() {
        return m;
    }

    public RomInfo getLatestUpdateInfo() {
        return this.j;
    }

    public void registCallback(managerCallback managercallback) {
        this.f = managercallback;
    }

    public void reloadDownload() {
        this.g = new DownloadThread(this.a, this.h, this.k);
        File file = new File(this.h.name);
        if (file.exists()) {
            file.delete();
        }
        Log.d(l, "reDownload file : " + this.h.name + " md5: " + this.h.md5, new Object[0]);
        this.g.reload();
        this.g.start();
    }

    public void resumeDownload() {
        DownloadThread downloadThread = new DownloadThread(this.a, this.h, this.k);
        this.g = downloadThread;
        downloadThread.start();
    }

    public void setAppTokens(String str) {
        this.i.setAppTokens(str);
    }

    public void setCurrentSysInfo(String str, String str2, String str3) {
        if (str3 == null) {
            this.i.setCurrentSysInfo(str, str2, "ALL");
        } else {
            this.i.setCurrentSysInfo(str, str2, str3);
        }
    }

    public void setCurrentUid(String str) {
        this.i.setCurrentUid(str);
    }

    public void setOverSeaUser(boolean z) {
        this.i.setOverSeaUser(z);
    }

    public void setSerialNo(String str) {
        this.i.setSerialNum(str);
    }

    public void stopDownload() {
        BeanDownload beanDownload = this.h;
        if (beanDownload != null) {
            beanDownload.enable = false;
        }
    }

    public void sync() {
        new b().execute("");
    }

    public void unRegistCallback(managerCallback managercallback) {
        this.f = null;
    }
}
