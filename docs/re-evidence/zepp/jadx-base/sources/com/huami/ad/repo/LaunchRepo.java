package com.huami.ad.repo;

import android.os.Message;
import android.text.TextUtils;
import com.huami.ad.AdLoadListener;
import com.huami.ad.AdModule;
import com.huami.ad.Constants;
import com.huami.ad.ITimeListener;
import com.huami.ad.config.LaunchConfig;
import com.huami.ad.db.AdKeeper;
import com.huami.ad.db.LaunchProvider;
import com.huami.ad.entity.LaunchAd;
import com.huami.ad.entity.LaunchViewEntity;
import com.huami.ad.utils.AdHelper;
import com.huami.ad.utils.LaunchEntityProbabilityUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.tools.log.HMLog;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.FileAsyncHttpResponseHandler;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.databases.model.LaunchEntity;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.imageload.HMLoadTarget;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.Header;

/* JADX INFO: loaded from: classes4.dex */
public class LaunchRepo extends Repo<LaunchViewEntity, LaunchConfig> {
    private static final String A = "wifi";
    private static final String h = "LaunchRepo";
    private static final int i = 2000;
    private static final int j = 4000;
    private static final int k = 5000;
    private static final int l = 0;
    private static final int m = 1;
    private static final int n = 2;
    private static final int o = 3;
    private static final String p = "LoadSuccessTime_WIFI";
    private static final String q = "LoadSuccessTime_2G";
    private static final String r = "LoadSuccessTime_3G";
    private static final String s = "LoadSuccessTime_4G";
    private static final String t = "LoadFailTime_WIFI";
    private static final String u = "LoadFailTime_2G";
    private static final String v = "LoadFailTime_3G";
    private static final String w = "LoadFailTime_4G";
    private static final String x = "2g";
    private static final String y = "3g";
    private static final String z = "4g";
    private boolean b;
    private boolean c;
    private String d;
    private boolean e;
    private OnAdNetEntityGetListener f;
    private boolean g;

    public interface OnAdNetEntityGetListener {
        void onSuccess(LaunchAd launchAd);
    }

    public static class Range {
        public int a;
        public int b;

        public Range(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public int getEnd() {
            return this.b;
        }

        public int getStart() {
            return this.a;
        }

        public boolean inRange(int i) {
            return i >= this.a && i < this.b;
        }

        public String toString() {
            return "[" + this.a + "," + this.b + ")";
        }
    }

    public class StartImageLoadTarget extends HMLoadTarget<File> {
        public LaunchEntity a;
        public long b;

        public StartImageLoadTarget(LaunchEntity launchEntity) {
            this.a = launchEntity;
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFailed(Exception exc) {
            HMLog.d(LaunchRepo.h, "load image Exception = " + exc.getMessage() + Thread.currentThread(), new Object[0]);
            LaunchRepo.this.f(false, this.b);
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadStarted() {
            super.onLoadStarted();
            HMLog.d(LaunchRepo.h, "onLoadStarted " + Thread.currentThread(), new Object[0]);
            this.b = System.currentTimeMillis();
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFinish(File file) {
            HMLog.d(LaunchRepo.h, "onLoadFinish " + Thread.currentThread(), new Object[0]);
            LaunchRepo.this.e(this.a);
            LaunchRepo.this.f(true, this.b);
        }
    }

    public class a extends FileAsyncHttpResponseHandler {
        public LaunchEntity a;

        public a(LaunchEntity launchEntity) {
            super(AdHelper.getTempVideoFile(launchEntity.id.longValue()));
            this.a = launchEntity;
        }

        public void download() {
            new AsyncHttpClient().get(AdHelper.getUrl(this.a), this);
        }

        @Override // com.loopj.android.http.FileAsyncHttpResponseHandler
        public void onFailure(int i, Header[] headerArr, Throwable th, File file) {
            HMLog.d(LaunchRepo.h, "gif onFailure file = " + file.getPath() + Thread.currentThread(), new Object[0]);
        }

        @Override // com.loopj.android.http.FileAsyncHttpResponseHandler
        public void onSuccess(int i, Header[] headerArr, File file) {
            HMLog.d(LaunchRepo.h, "onSuccess " + Thread.currentThread(), new Object[0]);
            String path = file.getPath();
            StringBuilder sb = new StringBuilder();
            sb.append(path);
            sb.append(AdHelper.isGif(this.a) ? Constants.GIF_RENAME_SUFFIX : Constants.VIDEO_RENAME_SUFFIX);
            String string = sb.toString();
            HMLog.d(LaunchRepo.h, "onSuccess = " + file.renameTo(new File(string)) + ", path:" + string, new Object[0]);
            LaunchRepo.this.e(this.a);
        }
    }

    public LaunchRepo(int i2, int i3, boolean z2, String str, String str2) {
        super(new LaunchConfig(i3, i2, str, str2));
        this.d = "";
        this.e = false;
        this.g = false;
        this.c = z2;
        HMLog.d(h, "mCacheState.add " + AdKeeper.getDownloadList().size(), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(LaunchEntity launchEntity) {
        LaunchProvider.getInstance().insertOrReplace(launchEntity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(boolean z2, long j2) {
        String str;
        if (NetUtil.isNetworkConnected(AdModule.appContext)) {
            String netType = NetUtil.getNetType(AdModule.appContext);
            netType.hashCode();
            switch (netType) {
                case "2g":
                    if (!z2) {
                        str = "LoadFailTime_2G";
                        break;
                    } else {
                        str = "LoadSuccessTime_2G";
                        break;
                    }
                    break;
                case "3g":
                    if (!z2) {
                        str = "LoadFailTime_3G";
                        break;
                    } else {
                        str = "LoadSuccessTime_3G";
                        break;
                    }
                    break;
                case "4g":
                    if (!z2) {
                        str = "LoadFailTime_4G";
                        break;
                    } else {
                        str = "LoadSuccessTime_4G";
                        break;
                    }
                    break;
                case "wifi":
                    if (!z2) {
                        str = "LoadFailTime_WIFI";
                        break;
                    } else {
                        str = "LoadSuccessTime_WIFI";
                        break;
                    }
                    break;
                default:
                    str = "";
                    break;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Analytics.event(AdModule.appContext, str, String.valueOf(((System.currentTimeMillis() - j2) / 100) / 10.0f));
        }
    }

    private void g(List<LaunchEntity> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            LaunchEntity launchEntity = (LaunchEntity) arrayList.get(i2);
            if (!isValid(launchEntity)) {
                list.remove(launchEntity);
                HMLog.d(h, "delete Valid data= " + launchEntity.title, new Object[0]);
            }
        }
    }

    private void h(List<LaunchEntity> list) {
        HMLog.d(h, "deleteInvalidFromDB ", new Object[0]);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            LaunchEntity launchEntity = list.get(size);
            if (!isValid(launchEntity) || !o(launchEntity, true)) {
                HMLog.d(h, "remove entity" + launchEntity.id, new Object[0]);
                list.remove(launchEntity);
                try {
                    LaunchProvider.getInstance().deleteEntity(launchEntity);
                } catch (Exception e) {
                    HMLog.e(h, e.getMessage(), new Object[0]);
                }
            }
        }
    }

    private void i(LaunchEntity launchEntity) {
        this.g = true;
        HMLog.d(h, "downUrl", new Object[0]);
        if (NetUtil.isNetworkConnected(AdModule.appContext)) {
            if (!(launchEntity.isLoadWithGPRS.intValue() == 0) || NetUtil.isConnectedByWifi(AdModule.appContext)) {
                if (AdHelper.isPic(launchEntity)) {
                    HMImageLoader.with(AdModule.appContext).load(launchEntity.imageUrl).downloadOnly(new StartImageLoadTarget(launchEntity));
                    return;
                }
                new a(launchEntity).download();
                if (!AdHelper.isVideo(launchEntity) || TextUtils.isEmpty(launchEntity.imageUrl)) {
                    return;
                }
                HMImageLoader.with(AdModule.appContext).load(launchEntity.imageUrl).downloadOnly(new StartImageLoadTarget(launchEntity));
            }
        }
    }

    private void j(List<LaunchEntity> list) {
        HMLog.d(h, "downloadOnly " + list.size(), new Object[0]);
        Iterator<LaunchEntity> it2 = list.iterator();
        while (it2.hasNext()) {
            i(it2.next());
        }
    }

    private ArrayList<LaunchAd> k(List<LaunchEntity> list) {
        int size;
        HMLog.i(h, "get launch ad entity from api, size is " + list.size(), new Object[0]);
        ArrayList<LaunchAd> arrayList = new ArrayList<>(3);
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i2 > 3) {
                return arrayList;
            }
            arrayList.add(new LaunchAd(list.get(i2), false));
        }
        if (this.c && (size = 3 - arrayList.size()) > 0) {
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(new LaunchAd(null, true));
            }
        }
        return arrayList;
    }

    private List<LaunchEntity> l() {
        HMLog.d(h, "getValidEntity ", new Object[0]);
        ArrayList arrayList = new ArrayList();
        for (LaunchEntity launchEntity : LaunchProvider.getInstance().getValidityEntity()) {
            if (isValid(launchEntity) && o(launchEntity, false)) {
                arrayList.add(launchEntity);
            }
        }
        HMLog.d(h, "valid size " + arrayList.size(), new Object[0]);
        return arrayList;
    }

    private void m(List<LaunchEntity> list) {
        HMLog.d(h, "handleLaunch ", new Object[0]);
        List<LaunchEntity> validityEntity = LaunchProvider.getInstance().getValidityEntity();
        h(validityEntity);
        g(list);
        if (list == null || list.isEmpty()) {
            LaunchProvider.getInstance().deleteAll();
            if (validityEntity != null) {
                for (LaunchEntity launchEntity : validityEntity) {
                    HMLog.d(h, "e: " + launchEntity.getAdType() + " id " + launchEntity.id, new Object[0]);
                    u(launchEntity);
                }
            }
            r("no data from web");
            return;
        }
        if (validityEntity == null) {
            HMLog.d(h, "lastCacheList is null", new Object[0]);
            j(list);
            return;
        }
        for (int i2 = 0; i2 < validityEntity.size(); i2++) {
            LaunchEntity launchEntity2 = validityEntity.get(i2);
            if (!list.contains(launchEntity2)) {
                HMLog.d(h, "newList not contain item " + launchEntity2.id, new Object[0]);
                u(launchEntity2);
            }
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!validityEntity.contains(list.get(i3))) {
                arrayList.add(list.get(i3));
            }
        }
        HMLog.d(h, "compareNewList = " + arrayList.size(), new Object[0]);
        if (arrayList.size() > 0) {
            j(arrayList);
        }
    }

    private boolean n(long j2) {
        if (AdHelper.getGifFile(j2).exists()) {
            return true;
        }
        HMLog.d(h, "sdcard not exist", new Object[0]);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006a  */
    private boolean o(LaunchEntity launchEntity, boolean z2) {
        boolean zIsDownCompleteOfVideo;
        HMLog.d(h, "isDownload " + launchEntity.id, new Object[0]);
        if (AdHelper.isPic(launchEntity)) {
            zIsDownCompleteOfVideo = LaunchProvider.getInstance().has(launchEntity.id);
        } else if (AdHelper.isGif(launchEntity)) {
            zIsDownCompleteOfVideo = n(launchEntity.id.longValue());
        } else if (!AdHelper.isVideo(launchEntity)) {
            zIsDownCompleteOfVideo = false;
        } else if (z2) {
            zIsDownCompleteOfVideo = AdHelper.isDownCompleteOfVideo(launchEntity.id.longValue());
        } else if (AdHelper.isDownCompleteOfVideo(launchEntity.id.longValue()) || LaunchProvider.getInstance().has(launchEntity.id)) {
            zIsDownCompleteOfVideo = true;
        } else {
            zIsDownCompleteOfVideo = false;
        }
        HMLog.d(h, "isCached " + zIsDownCompleteOfVideo, new Object[0]);
        return zIsDownCompleteOfVideo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (this.e) {
            return;
        }
        this.e = true;
        HMLog.d(h, "loadCacheAd ", new Object[0]);
        LaunchAd launchAdPickRandomEntity = LaunchEntityProbabilityUtils.pickRandomEntity(k(l()));
        if (launchAdPickRandomEntity != null) {
            s(launchAdPickRandomEntity);
        } else {
            r("no valid data from cache");
            q();
        }
    }

    private void q() {
        AdLoadListener<T> adLoadListener = this.adLoadListener;
        if (adLoadListener != 0) {
            adLoadListener.onError("", null);
        }
    }

    private void r(String str) {
        this.d = "";
        this.b = false;
        HMLog.d(h, "onFail msg: " + str, new Object[0]);
    }

    private void s(LaunchAd launchAd) {
        if (!launchAd.isAdNetEntity()) {
            HMLog.i(h, "show api ad", new Object[0]);
            t(launchAd.mEntity);
            return;
        }
        HMLog.i(h, "show adnet ad", new Object[0]);
        OnAdNetEntityGetListener onAdNetEntityGetListener = this.f;
        if (onAdNetEntityGetListener != null) {
            onAdNetEntityGetListener.onSuccess(launchAd);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void t(LaunchEntity launchEntity) {
        this.d = launchEntity.adType;
        this.b = true;
        HMLog.d(h, "====== show ad  + " + launchEntity.id + "=========", new Object[0]);
        if (this.adLoadListener != 0) {
            HMLog.d(h, "onSuccess " + Thread.currentThread(), new Object[0]);
            this.adLoadListener.onSuccess((T) AdHelper.toViewEntity(launchEntity));
        }
    }

    private void u(LaunchEntity launchEntity) {
        if (AdHelper.isVideo(launchEntity)) {
            AdHelper.deleteLaunchVideo(launchEntity);
        } else {
            AdHelper.deleteLaunchImage(launchEntity);
        }
        LaunchProvider.getInstance().deleteEntity(launchEntity);
    }

    private void v() {
        this.b = false;
        this.d = "";
    }

    @Override // com.huami.ad.repo.Repo
    public void a(HMHttpResponseData hMHttpResponseData) {
        HMLog.d(h, "onFailure response : " + hMHttpResponseData, new Object[0]);
        r(hMHttpResponseData.toString());
    }

    @Override // com.huami.ad.repo.Repo
    public void doHandleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            if ("VIDEO".equals(this.d)) {
                return;
            }
            ITimeListener iTimeListener = this.iTimeListener;
            if (iTimeListener != null) {
                iTimeListener.onRequestTimeout(this.b);
            }
            if (this.b) {
                return;
            }
            this.handler.post(new Runnable() { // from class: dm4
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.p();
                }
            });
            return;
        }
        if (i2 == 1) {
            if ("VIDEO".equals(this.d)) {
                return;
            }
            HMLog.d(h, "time out", new Object[0]);
            ITimeListener iTimeListener2 = this.iTimeListener;
            if (iTimeListener2 != null) {
                iTimeListener2.onTotallyTimeout();
            }
            v();
            return;
        }
        if (i2 == 2 && "VIDEO".equals(this.d)) {
            HMLog.d(h, "time out for video", new Object[0]);
            ITimeListener iTimeListener3 = this.iTimeListener;
            if (iTimeListener3 != null) {
                iTimeListener3.onAdShowTimeout();
            }
            v();
        }
    }

    @Override // com.huami.ad.repo.Repo
    public void handleSuccess(HMHttpResponseData hMHttpResponseData) {
        if (!hMHttpResponseData.isSuccess()) {
            r("response failed");
            return;
        }
        String str = new String(hMHttpResponseData.getResponseBody(), StandardCharsets.UTF_8);
        HMLog.d(h, "resposeData " + str, new Object[0]);
        m(AdHelper.getLaunchList(str));
    }

    public boolean isValid(LaunchEntity launchEntity) {
        if (AdHelper.isVideo(launchEntity)) {
            if (TextUtils.isEmpty(launchEntity.bgVideoUrl)) {
                HMLog.d(h, "videoUrl is null", new Object[0]);
                return false;
            }
        } else if (TextUtils.isEmpty(launchEntity.imageUrl)) {
            HMLog.d(h, "imageUrl is null", new Object[0]);
            return false;
        }
        long jLongValue = launchEntity.startTime.longValue();
        long jLongValue2 = launchEntity.endTime.longValue();
        if (jLongValue <= 0 || jLongValue2 <= 0 || jLongValue2 <= jLongValue) {
            HMLog.d(h, "time is invalid , start_time = " + jLongValue + " , expire_time = " + jLongValue2, new Object[0]);
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        if (jCurrentTimeMillis > jLongValue2) {
            HMLog.d(h, "time is expired!", new Object[0]);
            return false;
        }
        if (jCurrentTimeMillis < jLongValue) {
            HMLog.d(h, "还没到开始时间。", new Object[0]);
            return false;
        }
        HMLog.d(h, "isValid ", new Object[0]);
        return true;
    }

    public void setAdNetListener(OnAdNetEntityGetListener onAdNetEntityGetListener) {
        this.f = onAdNetEntityGetListener;
    }

    public boolean updateLaunch() {
        HMLog.d(h, "updateLaunch ", new Object[0]);
        this.handler.removeCallbacksAndMessages(null);
        this.handler.sendEmptyMessageDelayed(0, 2000L);
        this.handler.sendEmptyMessageDelayed(1, 4000L);
        this.handler.sendEmptyMessageDelayed(2, 5000L);
        if (NetUtil.isNetworkConnected(AdModule.appContext)) {
            requestAd();
        }
        return true;
    }
}
