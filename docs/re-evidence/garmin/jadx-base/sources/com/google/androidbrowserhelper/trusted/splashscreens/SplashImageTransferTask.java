package com.google.androidbrowserhelper.trusted.splashscreens;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.RemoteException;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import o2.c;
import r.g;

/* JADX INFO: loaded from: classes14.dex */
public class SplashImageTransferTask {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String FILE_NAME = "splash_image.png";
    private static final String FOLDER_NAME = "twa_splash";
    private static final String PREFS_FILE = "splashImagePrefs";
    private static final String PREF_LAST_UPDATE_TIME = "lastUpdateTime";
    private static final String TAG = "SplashImageTransferTask";

    @SuppressLint({"StaticFieldLeak"})
    private final AsyncTask<Void, Void, Boolean> mAsyncTask = new AsyncTask<Void, Void, Boolean>() { // from class: com.google.androidbrowserhelper.trusted.splashscreens.SplashImageTransferTask.1
        private long getLastAppUpdateTime() {
            try {
                return SplashImageTransferTask.this.mContext.getPackageManager().getPackageInfo(SplashImageTransferTask.this.mContext.getPackageName(), 0).lastUpdateTime;
            } catch (PackageManager.NameNotFoundException e4) {
                c.p(e4);
                return 0L;
            }
        }

        private boolean transferToCustomTabsProvider(File file) {
            Context context = SplashImageTransferTask.this.mContext;
            String str = SplashImageTransferTask.this.mAuthority;
            String str2 = SplashImageTransferTask.this.mProviderPackage;
            g gVar = SplashImageTransferTask.this.mSession;
            Uri uriD = FileProvider.d(context, str, file);
            context.grantUriPermission(str2, uriD, 1);
            try {
                return gVar.f148685a.receiveFile(gVar.f148686b, uriD, 1, gVar.a());
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // android.os.AsyncTask
        public Boolean doInBackground(Void... voidArr) {
            Boolean boolValueOf;
            if (isCancelled()) {
                return Boolean.FALSE;
            }
            File file = new File(SplashImageTransferTask.this.mContext.getFilesDir(), SplashImageTransferTask.FOLDER_NAME);
            if (!file.exists() && !file.mkdir()) {
                return Boolean.FALSE;
            }
            File file2 = new File(file, SplashImageTransferTask.FILE_NAME);
            SharedPreferences sharedPreferences = SplashImageTransferTask.this.mContext.getSharedPreferences(SplashImageTransferTask.PREFS_FILE, 0);
            long lastAppUpdateTime = getLastAppUpdateTime();
            if (file2.exists() && lastAppUpdateTime == sharedPreferences.getLong(SplashImageTransferTask.PREF_LAST_UPDATE_TIME, 0L)) {
                return Boolean.valueOf(transferToCustomTabsProvider(file2));
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    if (isCancelled()) {
                        boolValueOf = Boolean.FALSE;
                    } else {
                        SplashImageTransferTask.this.mBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.flush();
                        sharedPreferences.edit().putLong(SplashImageTransferTask.PREF_LAST_UPDATE_TIME, lastAppUpdateTime).commit();
                        boolValueOf = isCancelled() ? Boolean.FALSE : Boolean.valueOf(transferToCustomTabsProvider(file2));
                    }
                    fileOutputStream.close();
                    return boolValueOf;
                } catch (Throwable th3) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Exception e4) {
                c.p(e4);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Boolean bool) {
            if (SplashImageTransferTask.this.mCallback == null || isCancelled()) {
                return;
            }
            SplashImageTransferTask.this.mCallback.onFinished(bool.booleanValue());
        }
    };
    private final String mAuthority;
    private final Bitmap mBitmap;
    private Callback mCallback;
    private final Context mContext;
    private final String mProviderPackage;
    private final g mSession;

    public interface Callback {
        void onFinished(boolean z14);
    }

    public SplashImageTransferTask(Context context, Bitmap bitmap, String str, g gVar, String str2) {
        this.mContext = context.getApplicationContext();
        this.mBitmap = bitmap;
        this.mAuthority = str;
        this.mSession = gVar;
        this.mProviderPackage = str2;
    }

    public void cancel() {
        this.mAsyncTask.cancel(true);
        this.mCallback = null;
    }

    public void execute(Callback callback) {
        this.mCallback = callback;
        this.mAsyncTask.execute(new Void[0]);
    }
}
