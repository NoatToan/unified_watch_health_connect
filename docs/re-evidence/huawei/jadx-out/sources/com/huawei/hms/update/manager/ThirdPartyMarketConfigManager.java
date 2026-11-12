package com.huawei.hms.update.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.http.HttpWiseContentHelper;
import com.huawei.hms.update.http.WiseContentUrlHelper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class ThirdPartyMarketConfigManager {
    private static final String g = SystemUtils.getManufacturer();
    private static final ThirdPartyMarketConfigManager h = new ThirdPartyMarketConfigManager();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f16726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile MarketConfig f16727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile long f16728c;
    private final Handler d = new Handler(Looper.getMainLooper());
    private final Handler e = new Handler(Looper.getMainLooper());
    private WeakReference<MarketConfigCallback> f;

    public static class AppMarket {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f16729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f16730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f16731c;

        public AppMarket(String str, String str2, String str3) {
            this.f16729a = str;
            this.f16730b = str2;
            this.f16731c = str3;
        }

        public String getMfr() {
            return this.f16731c;
        }

        public String getPackageName() {
            return this.f16729a;
        }

        public String getPackageSize() {
            return this.f16730b;
        }

        public String toString() {
            return "AppMarket{packageName='" + this.f16729a + "', packageSize='" + this.f16730b + "', mfr='" + this.f16731c + "'}";
        }
    }

    public static class MarketConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f16732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<AppMarket> f16733b = new ArrayList();

        public MarketConfig(String str) {
            a(str);
        }

        private void a(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f16732a = jSONObject.getString("version");
                JSONArray jSONArray = jSONObject.getJSONArray("appMarket");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    String string = jSONObject2.getString("MFR");
                    if (ThirdPartyMarketConfigManager.g.equalsIgnoreCase(string)) {
                        this.f16733b.add(new AppMarket(jSONObject2.getString("packageName"), jSONObject2.getString("packageSize"), string));
                    }
                }
                HMSLog.i("ThirdPartyMarketConfigManager", "<asyncGetMarketCofig> parse MarketConfig successful");
            } catch (RuntimeException e) {
                HMSLog.e("ThirdPartyMarketConfigManager", "parse MarketConfig RuntimeException: " + e.getMessage());
            } catch (JSONException e2) {
                HMSLog.e("ThirdPartyMarketConfigManager", "parse MarketConfig JSONException: " + e2.getMessage());
            }
        }

        public List<AppMarket> getAppMarketList() {
            return this.f16733b;
        }

        public String getVersion() {
            return this.f16732a;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            Iterator<AppMarket> it = this.f16733b.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString());
                sb.append(" ");
            }
            sb.append("]");
            return "MarketConfig{version='" + this.f16732a + "', appMarketList=" + sb.toString() + '}';
        }
    }

    public interface MarketConfigCallback {
        void onResult(MarketConfig marketConfig);
    }

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MarketConfig f16734a;

        a(MarketConfig marketConfig) {
            this.f16734a = marketConfig;
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.i("ThirdPartyMarketConfigManager", "<onResult> start");
            if (this.f16734a != null) {
                HMSLog.i("ThirdPartyMarketConfigManager", "<onResult> update mCachedMarketConfig");
                ThirdPartyMarketConfigManager.this.f16728c = SystemClock.elapsedRealtime();
                ThirdPartyMarketConfigManager.this.f16727b = this.f16734a;
            }
            if (ThirdPartyMarketConfigManager.this.f == null) {
                HMSLog.e("ThirdPartyMarketConfigManager", "<onResult> mWeakCallback is null");
                return;
            }
            MarketConfigCallback marketConfigCallback = (MarketConfigCallback) ThirdPartyMarketConfigManager.this.f.get();
            if (marketConfigCallback == null) {
                HMSLog.e("ThirdPartyMarketConfigManager", "<onResult> configCallback is null");
            } else {
                ThirdPartyMarketConfigManager.this.f = null;
                marketConfigCallback.onResult(ThirdPartyMarketConfigManager.this.f16727b);
            }
        }
    }

    static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThirdPartyMarketConfigManager f16736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f16737b;

        public b(Context context, ThirdPartyMarketConfigManager thirdPartyMarketConfigManager) {
            this.f16737b = context;
            this.f16736a = thirdPartyMarketConfigManager;
        }

        private void a(MarketConfig marketConfig) {
            this.f16736a.b();
            this.f16736a.f16726a = false;
            this.f16736a.a(marketConfig);
        }

        @Override // java.lang.Runnable
        public void run() {
            String strSyncGetUrl = WiseContentUrlHelper.syncGetUrl(this.f16737b);
            if (TextUtils.isEmpty(strSyncGetUrl)) {
                HMSLog.e("ThirdPartyMarketConfigManager", "<DownloadConfigRunnable> get url failed.");
                a(null);
                return;
            }
            HMSLog.i("ThirdPartyMarketConfigManager", "<DownloadConfigRunnable> get url successful.");
            String strSyncGetContent = HttpWiseContentHelper.syncGetContent(this.f16737b, strSyncGetUrl);
            if (TextUtils.isEmpty(strSyncGetContent)) {
                HMSLog.e("ThirdPartyMarketConfigManager", "<DownloadConfigRunnable> download failed.");
                a(null);
            } else {
                HMSLog.i("ThirdPartyMarketConfigManager", "<DownloadConfigRunnable> download successful.");
                a(new MarketConfig(strSyncGetContent));
            }
        }
    }

    static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThirdPartyMarketConfigManager f16738a;

        public c(ThirdPartyMarketConfigManager thirdPartyMarketConfigManager) {
            this.f16738a = thirdPartyMarketConfigManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.e("ThirdPartyMarketConfigManager", "<TimeoutRunnable> download timeout");
            this.f16738a.a((MarketConfig) null);
        }
    }

    private ThirdPartyMarketConfigManager() {
    }

    public static ThirdPartyMarketConfigManager getInstance() {
        return h;
    }

    public void asyncGetMarketConfig(Context context, Handler handler, MarketConfigCallback marketConfigCallback) {
        HMSLog.i("ThirdPartyMarketConfigManager", "<asyncGetMarketConfig> start");
        if (context == null || handler == null || marketConfigCallback == null) {
            HMSLog.e("ThirdPartyMarketConfigManager", "<asyncGetMarketConfig> param contains null");
            return;
        }
        if (c()) {
            HMSLog.i("ThirdPartyMarketConfigManager", "<asyncGetSize> CachedMarketConfig: " + this.f16727b);
            marketConfigCallback.onResult(this.f16727b);
            return;
        }
        if (this.f16726a) {
            HMSLog.e("ThirdPartyMarketConfigManager", "<asyncGetSize> isDownloading: " + this.f16726a);
            marketConfigCallback.onResult(null);
            return;
        }
        this.f = new WeakReference<>(marketConfigCallback);
        this.f16726a = true;
        this.e.postDelayed(new c(this), C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        handler.post(new b(context.getApplicationContext(), this));
    }

    public MarketConfig getMarketConfig() {
        HMSLog.i("ThirdPartyMarketConfigManager", "<getMarketConfig> start");
        if (!c()) {
            HMSLog.e("ThirdPartyMarketConfigManager", "<getMarketConfig> mCachedMarketConfig is null");
            return null;
        }
        HMSLog.i("ThirdPartyMarketConfigManager", "<getMarketConfig> " + this.f16727b);
        return this.f16727b;
    }

    private boolean c() {
        if (this.f16728c == 0) {
            HMSLog.i("ThirdPartyMarketConfigManager", "<useCachedConfig> no CachedMarketConfig");
            return false;
        }
        boolean z = SystemClock.elapsedRealtime() - this.f16728c > 86400000;
        HMSLog.i("ThirdPartyMarketConfigManager", "<useCachedConfig> CachedMarketConfig is expiration: " + z);
        if (z) {
            return false;
        }
        if (this.f16727b != null && this.f16727b.getAppMarketList().size() > 0) {
            return true;
        }
        HMSLog.i("ThirdPartyMarketConfigManager", "<useCachedConfig> CachedMarketConfig is null or list.size is empty");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.e.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MarketConfig marketConfig) {
        this.d.post(new a(marketConfig));
    }
}
