package com.huami.passport.utils;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes12.dex */
public class RWFileHelper {
    private static final String TAG = "PanLog";
    private boolean flag;
    private Context mContext;
    public File EXTERNAL_STORAGE_DIR = null;
    private File LOG_FILE_NAME = null;
    private ExecutorService mExecutor = Executors.newSingleThreadExecutor();

    public RWFileHelper(Context context) {
        this.mContext = context;
    }

    private boolean checkState() {
        if (this.mContext.getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", this.mContext.getPackageName()) == 0) {
            Log.d(TAG, "write granted");
            try {
                this.EXTERNAL_STORAGE_DIR = this.mContext.getExternalFilesDir(null);
                this.LOG_FILE_NAME = new File(this.EXTERNAL_STORAGE_DIR, "hm_pan.txt");
                this.flag = true;
                if (Environment.getExternalStorageState().equals("mounted")) {
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Log.d(TAG, "write NO granted");
        return false;
    }

    public void write(final String str) {
        if (checkState()) {
            this.mExecutor.execute(new Runnable() { // from class: com.huami.passport.utils.RWFileHelper.1
                /* JADX WARN: Code duplicated, block: B:28:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    BufferedWriter bufferedWriter;
                    Throwable th;
                    IOException e;
                    try {
                        bufferedWriter = new BufferedWriter(new FileWriter(RWFileHelper.this.LOG_FILE_NAME, true));
                        try {
                            try {
                                bufferedWriter.write(new SimpleDateFormat("yy-MM-dd HH:mm:ss SSS ", Locale.US).format(new Date()) + str + "\n");
                            } catch (IOException e2) {
                                e = e2;
                                Log.e(RWFileHelper.TAG, e.getMessage(), e);
                                if (bufferedWriter == null) {
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (bufferedWriter != null) {
                                try {
                                    bufferedWriter.close();
                                } catch (IOException unused) {
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e3) {
                        bufferedWriter = null;
                        e = e3;
                    } catch (Throwable th3) {
                        bufferedWriter = null;
                        th = th3;
                        if (bufferedWriter != null) {
                            bufferedWriter.close();
                        }
                        throw th;
                    }
                    try {
                        bufferedWriter.close();
                    } catch (IOException unused2) {
                    }
                }
            });
        }
    }
}
