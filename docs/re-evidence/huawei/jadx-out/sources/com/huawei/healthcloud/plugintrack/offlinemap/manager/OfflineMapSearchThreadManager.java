package com.huawei.healthcloud.plugintrack.offlinemap.manager;

import android.os.Handler;
import android.os.Message;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.healthcloud.plugintrack.offlinemap.ui.view.CityListBean;
import com.huawei.hwlogsmodel.LogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class OfflineMapSearchThreadManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OfflineMapSearchCallback f10507a;
    private ExtendHandler e = null;
    private a d = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10508b = 0;

    public interface OfflineMapSearchCallback {
        void onSearchResult(List<OfflineMapCity> list);
    }

    public void d(OfflineMapSearchCallback offlineMapSearchCallback) {
        this.f10507a = offlineMapSearchCallback;
    }

    public void c() {
        this.e = HandlerCenter.b(new Handler.Callback(this) { // from class: com.huawei.healthcloud.plugintrack.offlinemap.manager.OfflineMapSearchThreadManager.4
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                return false;
            }
        }, "SearchHandlerThread");
    }

    public void a(String str, HashMap<Integer, CityListBean> map) {
        LogUtil.a("OfflineMapSearchThreadManager", "updateSearch");
        ExtendHandler extendHandler = this.e;
        if (extendHandler == null) {
            LogUtil.e("OfflineMapSearchThreadManager", "updateSearch() mExtendHandler null");
            return;
        }
        a aVar = this.d;
        if (aVar == null) {
            extendHandler.removeTasks(aVar);
        }
        int i = this.f10508b + 1;
        this.f10508b = i;
        a aVar2 = new a(str, this, map, i);
        this.d = aVar2;
        this.e.postTask(aVar2);
    }

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<OfflineMapSearchThreadManager> f10509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10510b;
        private String d;
        private HashMap<Integer, CityListBean> e;

        a(String str, OfflineMapSearchThreadManager offlineMapSearchThreadManager, HashMap<Integer, CityListBean> map, int i) {
            if (str != null) {
                this.d = str;
            }
            this.f10509a = new WeakReference<>(offlineMapSearchThreadManager);
            if (map != null) {
                this.e = map;
            }
            this.f10510b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            OfflineMapSearchThreadManager offlineMapSearchThreadManager = this.f10509a.get();
            if (offlineMapSearchThreadManager == null) {
                LogUtil.e("OfflineMapSearchThreadManager", "MyRunnable run() fragment null");
                return;
            }
            ArrayList arrayList = new ArrayList(10);
            int size = this.e.size();
            if (size <= 1) {
                LogUtil.e("OfflineMapSearchThreadManager", "MyRunnable run() size <=1 ");
                return;
            }
            for (int i = 1; i < size; i++) {
                for (OfflineMapCity offlineMapCity : this.e.get(Integer.valueOf(i))) {
                    String city = offlineMapCity.getCity();
                    String jianpin = offlineMapCity.getJianpin();
                    String lowerCase = this.d.toLowerCase(Locale.getDefault());
                    if (city.contains(this.d) || e(offlineMapCity, jianpin, lowerCase)) {
                        LogUtil.d("OfflineMapSearchThreadManager", "city:", city, "pinyin:", jianpin);
                        arrayList.add(offlineMapCity);
                    }
                }
            }
            LogUtil.a("OfflineMapSearchThreadManager", "MyRunnable run() end mCurrentCount:", Integer.valueOf(this.f10510b), ",mThreadCount:", Integer.valueOf(offlineMapSearchThreadManager.f10508b));
            if (this.f10510b != offlineMapSearchThreadManager.f10508b) {
                LogUtil.a("OfflineMapSearchThreadManager", "MyRunnable run() mCurrentCount != mThreadCount:");
            } else if (offlineMapSearchThreadManager.f10507a != null) {
                offlineMapSearchThreadManager.f10507a.onSearchResult(arrayList);
            }
        }

        private boolean e(OfflineMapCity offlineMapCity, String str, String str2) {
            return str.startsWith(str2) || offlineMapCity.getPinyin().startsWith(str2);
        }
    }

    public void d() {
        LogUtil.a("OfflineMapSearchThreadManager", "qiut()");
        ExtendHandler extendHandler = this.e;
        if (extendHandler != null) {
            extendHandler.quit(false);
            this.e = null;
        }
    }
}
