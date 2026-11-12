package com.huami.watch.ota;

import android.content.Context;
import android.os.Handler;
import com.huami.watch.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes16.dex */
public class DownloadThread extends Thread {
    private static final String c = "HmOta-DownloadThread";
    private static BeanDownload d;
    private static Context e;
    private MessageDigest a;
    private Handler b;

    public DownloadThread(Context context, BeanDownload beanDownload, Handler handler) {
        d = beanDownload;
        this.b = handler;
        e = context;
    }

    public boolean isRuning() {
        return d.enable;
    }

    public void reload() {
        BeanDownload beanDownload = d;
        beanDownload.loadedSize = 0L;
        beanDownload.size = 0L;
        beanDownload.enable = true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws Throwable {
        String md5ByFile;
        BeanDownload beanDownload = d;
        beanDownload.state = 0;
        beanDownload.enable = true;
        NetworkTool.download2File(e, beanDownload, this.b);
        Log.i(c, "size:" + d.size + " loaded:" + d.loadedSize + " enable:" + d.enable, new Object[0]);
        BeanDownload beanDownload2 = d;
        long j = beanDownload2.size;
        if (j <= 0 || beanDownload2.loadedSize != j) {
            this.b.obtainMessage(400, beanDownload2).sendToTarget();
            this.b.obtainMessage(200, 1, -1).sendToTarget();
            BeanDownload beanDownload3 = d;
            if (beanDownload3.enable) {
                beanDownload3.state = 3;
            } else {
                beanDownload3.state = 2;
            }
            BeanDownload.updateLastDownload(e, beanDownload3);
        } else {
            File file = new File(d.name);
            d.enable = false;
            try {
                md5ByFile = UpdateUtils.getMd5ByFile(file);
            } catch (FileNotFoundException e2) {
                e2.printStackTrace();
                md5ByFile = "";
            }
            Log.d(c, "checking file " + file.getAbsolutePath() + " downloadFile = " + md5ByFile + " standFile = " + d.md5, new Object[0]);
            if (md5ByFile.equals(d.md5)) {
                d.state = 1;
                this.b.obtainMessage(200, 0, 0).sendToTarget();
            } else {
                file.delete();
                d.state = 3;
                this.b.obtainMessage(300, 0, 0).sendToTarget();
            }
        }
        Log.d(c, "Download stop state=" + d.state, new Object[0]);
    }

    public void shut() {
        d.enable = false;
    }
}
