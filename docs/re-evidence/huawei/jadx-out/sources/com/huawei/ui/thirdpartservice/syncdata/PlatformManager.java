package com.huawei.ui.thirdpartservice.syncdata;

import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.CollectionUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.route.TrackInfo;
import com.huawei.ui.thirdpartservice.syncdata.callback.RefreshTokenCallback;
import com.huawei.ui.thirdpartservice.syncdata.strava.StravaConfig;
import defpackage.lsy;
import defpackage.xbu;
import defpackage.xch;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes20.dex */
public class PlatformManager implements BasePlatformHandler.SyncResultListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f29156b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<BasePlatformHandler> f29157c = new ArrayList<>(2);
    private Set<String> d;
    private PlatformStatusCallback e;

    interface PlatformStatusCallback {
        void onInitFinish(boolean z);

        void onSyncFinish();
    }

    PlatformManager() {
    }

    public void b(PlatformStatusCallback platformStatusCallback) {
        this.e = platformStatusCallback;
        LogUtil.a("PlatformManager", "init");
        if (this.f29156b) {
            platformStatusCallback.onInitFinish(false);
            return;
        }
        Set<String> set = this.d;
        if (set != null) {
            set.clear();
        }
        if (!CollectionUtils.isEmpty(this.f29157c)) {
            this.d = new HashSet(this.f29157c.size());
            platformStatusCallback.onInitFinish(!this.f29156b);
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        LogUtil.e("PlatformManager", "  CountDownLatch  2");
        lsy.a(new Runnable() { // from class: xah
            @Override // java.lang.Runnable
            public final void run() {
                this.f52654c.c(countDownLatch);
            }
        });
        lsy.a(new Runnable() { // from class: xai
            @Override // java.lang.Runnable
            public final void run() {
                this.d.e(countDownLatch);
            }
        });
        try {
            ReleaseLogUtil.d("R_PlatformManager", "init isAwait ", Boolean.valueOf(countDownLatch.await(5L, TimeUnit.SECONDS)));
        } catch (InterruptedException unused) {
            LogUtil.j("PlatformManager", " InterruptedException");
        }
        LogUtil.a("PlatformManager", "  countDown   release  mSyncDataHandlers.size():", Integer.valueOf(this.f29157c.size()));
        if (this.f29157c.isEmpty()) {
            this.f29156b = false;
            this.e.onSyncFinish();
            platformStatusCallback.onInitFinish(this.f29156b);
        } else {
            this.d = new HashSet(this.f29157c.size());
            platformStatusCallback.onInitFinish(!this.f29156b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void e(final CountDownLatch countDownLatch) {
        if (String.valueOf(7).equals(LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1009))) {
            final xbu xbuVar = new xbu(BaseApplication.b(), this);
            xbuVar.checkConnectStatus(new RefreshTokenCallback() { // from class: xap
                @Override // com.huawei.ui.thirdpartservice.syncdata.callback.RefreshTokenCallback
                public final void refreshResult(boolean z, boolean z2) {
                    this.f52662a.c(xbuVar, countDownLatch, z, z2);
                }
            });
        } else {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(BasePlatformHandler basePlatformHandler, CountDownLatch countDownLatch, boolean z, boolean z2) {
        ReleaseLogUtil.c("R_PlatformManager", "checkKomootStatus isRequestValid:", Boolean.valueOf(z), ", isSuccess:", Boolean.valueOf(z2));
        if (z && z2) {
            this.f29157c.add(basePlatformHandler);
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void c(final CountDownLatch countDownLatch) {
        new StravaConfig().b(null, LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1010), new StravaConfig.StravaCountryCallback() { // from class: xak
            @Override // com.huawei.ui.thirdpartservice.syncdata.strava.StravaConfig.StravaCountryCallback
            public final void onStravaCountryCallback(boolean z) {
                this.d.e(countDownLatch, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(final CountDownLatch countDownLatch, boolean z) {
        ReleaseLogUtil.c("R_PlatformManager", "checkCountrySupport  isSupport :", Boolean.valueOf(z));
        if (z) {
            final xch xchVar = new xch(BaseApplication.b(), this);
            xchVar.checkConnectStatus(new RefreshTokenCallback() { // from class: xaq
                @Override // com.huawei.ui.thirdpartservice.syncdata.callback.RefreshTokenCallback
                public final void refreshResult(boolean z2, boolean z3) {
                    this.f52665b.b(xchVar, countDownLatch, z2, z3);
                }
            });
        } else {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(BasePlatformHandler basePlatformHandler, CountDownLatch countDownLatch, boolean z, boolean z2) {
        if (z && z2) {
            this.f29157c.add(basePlatformHandler);
        }
        countDownLatch.countDown();
    }

    long b() {
        Iterator<BasePlatformHandler> it = this.f29157c.iterator();
        long jMin = Long.MAX_VALUE;
        while (it.hasNext()) {
            long oauthTime = it.next().getOauthTime();
            if (oauthTime != -1) {
                jMin = Math.min(jMin, oauthTime);
            }
        }
        LogUtil.a("PlatformManager", "  calculateStartTime   ", Long.valueOf(jMin));
        if (jMin == Long.MAX_VALUE) {
            this.f29156b = false;
            this.e.onSyncFinish();
        }
        return jMin;
    }

    int[] d() {
        HashSet hashSet = new HashSet();
        Iterator<BasePlatformHandler> it = this.f29157c.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().getSyncDataType());
        }
        return ArrayUtils.toPrimitiveArray(hashSet);
    }

    void a(HiHealthData hiHealthData, HiTrackMetaData hiTrackMetaData, TrackInfo trackInfo) {
        for (BasePlatformHandler basePlatformHandler : this.f29157c) {
            if (basePlatformHandler.needUpload(hiHealthData)) {
                this.f29156b = true;
                basePlatformHandler.runSyncTask(hiHealthData, hiTrackMetaData, trackInfo);
            }
        }
    }

    boolean a(HiHealthData hiHealthData) {
        Iterator<BasePlatformHandler> it = this.f29157c.iterator();
        while (it.hasNext()) {
            if (it.next().needUpload(hiHealthData)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.BasePlatformHandler.SyncResultListener
    public void syncResultCallback(String str, boolean z, String str2) {
        LogUtil.a("PlatformManager", str, Boolean.valueOf(z), str2);
        if (this.d == null) {
            return;
        }
        for (BasePlatformHandler basePlatformHandler : this.f29157c) {
            if (basePlatformHandler.isSyncFinish()) {
                this.d.add(basePlatformHandler.getPlatform());
            }
        }
        if (this.d.size() == this.f29157c.size()) {
            this.f29156b = false;
            this.e.onSyncFinish();
        }
    }

    public void c() {
        Iterator<BasePlatformHandler> it = this.f29157c.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        this.f29157c.clear();
        this.f29157c.trimToSize();
    }

    void e() {
        Iterator<BasePlatformHandler> it = this.f29157c.iterator();
        while (it.hasNext()) {
            it.next().forceStopSync();
        }
    }
}
