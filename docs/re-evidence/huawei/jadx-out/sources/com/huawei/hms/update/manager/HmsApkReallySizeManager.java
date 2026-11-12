package com.huawei.hms.update.manager;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.format.Formatter;
import androidx.media3.common.C;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.updatesdk.UpdateSdkAPI;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.io.Serializable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes34.dex */
public class HmsApkReallySizeManager {
    public static final String INVALID_SIZE = "";
    private static final HmsApkReallySizeManager g = new HmsApkReallySizeManager();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f16720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f16721b;
    private volatile long d;
    private WeakReference<CheckHmsApkSizeCallback> f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile long f16722c = -1;
    private final Handler e = new Handler(Looper.getMainLooper());

    public interface CheckHmsApkSizeCallback {
        void onResult(String str);
    }

    class a implements CheckUpdateCallBack {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f16723a;

        a(Context context) {
            this.f16723a = context;
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onMarketInstallInfo(Intent intent) {
            HMSLog.i("HmsApkReallySizeManager", "<onMarketInstallInfo> intent: ".concat(intent == null ? "is null" : "not null"));
            HmsApkReallySizeManager.this.a("");
            HmsApkReallySizeManager.this.a();
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onMarketStoreError(int i) {
            HMSLog.e("HmsApkReallySizeManager", "<onMarketStoreError> responseCode: " + i);
            HmsApkReallySizeManager.this.a("");
            HmsApkReallySizeManager.this.a();
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onUpdateInfo(Intent intent) {
            HMSLog.i("HmsApkReallySizeManager", "<onUpdateInfo> intent: ".concat(intent == null ? "is null" : "not null"));
            HmsApkReallySizeManager.this.a(this.f16723a, intent);
            HmsApkReallySizeManager.this.a();
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onUpdateStoreError(int i) {
            HMSLog.e("HmsApkReallySizeManager", "<onUpdateStoreError> responseCode: " + i);
            HmsApkReallySizeManager.this.a("");
            HmsApkReallySizeManager.this.a();
        }
    }

    static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HmsApkReallySizeManager f16725a;

        public b(HmsApkReallySizeManager hmsApkReallySizeManager) {
            this.f16725a = hmsApkReallySizeManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.e("HmsApkReallySizeManager", "<CheckTimeoutRunnable> get apk size timeout");
            this.f16725a.a("");
        }
    }

    private HmsApkReallySizeManager() {
    }

    private boolean b() {
        if (this.d == 0) {
            HMSLog.i("HmsApkReallySizeManager", "<useCachedSize> no cachedHmsApkSize");
            return false;
        }
        boolean z = SystemClock.elapsedRealtime() - this.d > 86400000;
        HMSLog.i("HmsApkReallySizeManager", "<useCachedSize> cachedHmsApkSize is expiration: " + z);
        return !z && this.f16722c > 0;
    }

    public static HmsApkReallySizeManager getInstance() {
        return g;
    }

    public void asyncGetSize(Context context, String str, CheckHmsApkSizeCallback checkHmsApkSizeCallback) {
        HMSLog.i("HmsApkReallySizeManager", "<asyncGetSize> start");
        if (context == null || TextUtils.isEmpty(str) || checkHmsApkSizeCallback == null) {
            HMSLog.e("HmsApkReallySizeManager", "<asyncGetSize> param contains null");
            return;
        }
        if (this.f16720a == null) {
            this.f16720a = context.getApplicationContext();
        }
        if (b()) {
            String strA = a(context, this.f16722c);
            HMSLog.i("HmsApkReallySizeManager", "<asyncGetSize> useCachedSize: " + strA);
            checkHmsApkSizeCallback.onResult(strA);
            return;
        }
        if (this.f16721b) {
            HMSLog.e("HmsApkReallySizeManager", "<asyncGetSize> isChecking: " + this.f16721b);
            checkHmsApkSizeCallback.onResult("");
            return;
        }
        this.f = new WeakReference<>(checkHmsApkSizeCallback);
        this.f16721b = true;
        this.e.postDelayed(new b(this), C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        Context applicationContext = context.getApplicationContext();
        UpdateSdkAPI.checkTargetAppUpdate(applicationContext, str, new a(applicationContext));
    }

    public String getApkSize() {
        HMSLog.i("HmsApkReallySizeManager", "<getApkSize> start");
        if (this.f16720a == null) {
            HMSLog.e("HmsApkReallySizeManager", "<getApkSize> mAppContext is null, return INVALID_SIZE");
            return "";
        }
        if (!b()) {
            HMSLog.i("HmsApkReallySizeManager", "<getApkSize> return INVALID_SIZE");
            return "";
        }
        String strA = a(this.f16720a, this.f16722c);
        HMSLog.i("HmsApkReallySizeManager", "<getApkSize> mCachedHmsApkSize: " + strA);
        return strA;
    }

    public void release() {
        HMSLog.i("HmsApkReallySizeManager", "<release> start isChecking: " + this.f16721b);
        if (this.f16721b) {
            UpdateSdkAPI.releaseCallBack();
            this.f16721b = false;
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.e.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, Intent intent) {
        if (intent != null) {
            try {
                int intExtra = intent.getIntExtra("status", -99);
                HMSLog.i("HmsApkReallySizeManager", "<checkHmsUpdateInfo> status is " + intExtra);
                String stringExtra = intent.getStringExtra(UpdateKey.FAIL_REASON);
                if (!TextUtils.isEmpty(stringExtra)) {
                    HMSLog.e("HmsApkReallySizeManager", "<checkHmsUpdateInfo> reason is " + stringExtra);
                }
                if (intExtra == 7) {
                    Serializable serializableExtra = intent.getSerializableExtra(UpdateKey.INFO);
                    if (serializableExtra instanceof ApkUpgradeInfo) {
                        this.f16722c = ((ApkUpgradeInfo) serializableExtra).getLongSize_();
                        String strA = a(context, this.f16722c);
                        HMSLog.i("HmsApkReallySizeManager", "<checkHmsUpdateInfo> get HMS Core size: " + strA);
                        this.d = SystemClock.elapsedRealtime();
                        a(strA);
                        return;
                    }
                } else if (intExtra == 3) {
                    HMSLog.e("HmsApkReallySizeManager", "<checkHmsUpdateInfo> UpdateStatusCode.NO_UPGRADE_INFO");
                } else {
                    HMSLog.e("HmsApkReallySizeManager", "<checkHmsUpdateInfo> other CHECK_FAILURE");
                }
            } catch (Exception e) {
                HMSLog.e("HmsApkReallySizeManager", "<checkHmsUpdateInfo> intent has some error" + e.getMessage());
                a("");
                return;
            }
        }
        a("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        HMSLog.i("HmsApkReallySizeManager", "<onResult> start");
        WeakReference<CheckHmsApkSizeCallback> weakReference = this.f;
        if (weakReference == null) {
            HMSLog.e("HmsApkReallySizeManager", "<onResult> mWeakCallback is null");
            return;
        }
        CheckHmsApkSizeCallback checkHmsApkSizeCallback = weakReference.get();
        if (checkHmsApkSizeCallback == null) {
            HMSLog.e("HmsApkReallySizeManager", "<onResult> sizeCallback is null");
        } else {
            this.f = null;
            checkHmsApkSizeCallback.onResult(str);
        }
    }

    private static String a(Context context, long j) {
        return j > 0 ? Formatter.formatFileSize(context, j) : "";
    }
}
