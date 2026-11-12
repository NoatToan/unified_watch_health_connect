package com.amap.api.maps.offlinemap;

import android.content.Context;
import android.os.Handler;
import com.amap.api.col.p0003sl.bb;
import com.amap.api.col.p0003sl.bc;
import com.amap.api.col.p0003sl.bg;
import com.amap.api.col.p0003sl.dy;
import com.amap.api.col.p0003sl.eb;
import com.amap.api.col.p0003sl.ir;
import com.amap.api.col.p0003sl.iu;
import com.amap.api.col.p0003sl.iv;
import com.amap.api.col.p0003sl.jv;
import com.amap.api.maps.AMap;
import com.amap.api.maps.AMapException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class OfflineMapManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    bg f3455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    bc f3456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f3457c;
    private OfflineMapDownloadListener d;
    private OfflineLoadedListener e;
    private Handler f;
    private Handler g;

    public interface OfflineLoadedListener {
        void onVerifyComplete();
    }

    public interface OfflineMapDownloadListener {
        void onCheckUpdate(boolean z, String str);

        void onDownload(int i, int i2, String str);

        void onRemove(boolean z, String str, String str2);
    }

    public final void restart() {
    }

    public OfflineMapManager(Context context, OfflineMapDownloadListener offlineMapDownloadListener) throws Exception {
        iv ivVarA = iu.a(context, eb.a());
        if (ivVarA.f2835a != iu.c.SuccessCode) {
            throw new Exception(ivVarA.f2836b);
        }
        this.d = offlineMapDownloadListener;
        this.f3457c = context.getApplicationContext();
        this.f = new Handler(this.f3457c.getMainLooper());
        this.g = new Handler(this.f3457c.getMainLooper());
        a(context);
        ir.a().a(this.f3457c);
    }

    public OfflineMapManager(Context context, OfflineMapDownloadListener offlineMapDownloadListener, AMap aMap) {
        this.d = offlineMapDownloadListener;
        this.f3457c = context.getApplicationContext();
        this.f = new Handler(this.f3457c.getMainLooper());
        this.g = new Handler(this.f3457c.getMainLooper());
        try {
            a(context);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(Context context) {
        this.f3457c = context.getApplicationContext();
        bc.f2250b = false;
        bc bcVarA = bc.a(this.f3457c);
        this.f3456b = bcVarA;
        bcVarA.a(new bc.a() { // from class: com.amap.api.maps.offlinemap.OfflineMapManager.1
            @Override // com.amap.api.col.3sl.bc.a
            public final void a(final bb bbVar) {
                if (OfflineMapManager.this.d == null || bbVar == null) {
                    return;
                }
                OfflineMapManager.this.f.post(new Runnable() { // from class: com.amap.api.maps.offlinemap.OfflineMapManager.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            OfflineMapManager.this.d.onDownload(bbVar.c().b(), bbVar.getcompleteCode(), bbVar.getCity());
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
            }

            @Override // com.amap.api.col.3sl.bc.a
            public final void b(final bb bbVar) {
                if (OfflineMapManager.this.d == null || bbVar == null) {
                    return;
                }
                OfflineMapManager.this.f.post(new Runnable() { // from class: com.amap.api.maps.offlinemap.OfflineMapManager.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            if (!bbVar.c().equals(bbVar.g) && !bbVar.c().equals(bbVar.f2242a)) {
                                OfflineMapManager.this.d.onCheckUpdate(false, bbVar.getCity());
                                return;
                            }
                            OfflineMapManager.this.d.onCheckUpdate(true, bbVar.getCity());
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
            }

            @Override // com.amap.api.col.3sl.bc.a
            public final void c(final bb bbVar) {
                if (OfflineMapManager.this.d == null || bbVar == null) {
                    return;
                }
                OfflineMapManager.this.f.post(new Runnable() { // from class: com.amap.api.maps.offlinemap.OfflineMapManager.1.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            if (bbVar.c().equals(bbVar.f2242a)) {
                                OfflineMapManager.this.d.onRemove(true, bbVar.getCity(), "");
                            } else {
                                OfflineMapManager.this.d.onRemove(false, bbVar.getCity(), "");
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
            }

            @Override // com.amap.api.col.3sl.bc.a
            public final void a() {
                if (OfflineMapManager.this.e != null) {
                    OfflineMapManager.this.f.post(new Runnable() { // from class: com.amap.api.maps.offlinemap.OfflineMapManager.1.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                OfflineMapManager.this.e.onVerifyComplete();
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                    });
                }
            }
        });
        try {
            this.f3456b.a();
            this.f3455a = this.f3456b.f;
            dy.b(context);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void downloadByCityCode(String str) throws AMapException {
        try {
            this.f3456b.f(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void downloadByCityName(String str) throws AMapException {
        try {
            this.f3456b.e(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void downloadByProvinceName(String str) throws AMapException {
        try {
            a();
            OfflineMapProvince itemByProvinceName = getItemByProvinceName(str);
            if (itemByProvinceName == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            Iterator<OfflineMapCity> it = itemByProvinceName.getCityList().iterator();
            while (it.hasNext()) {
                final String city = it.next().getCity();
                this.g.post(new Runnable() { // from class: com.amap.api.maps.offlinemap.OfflineMapManager.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            OfflineMapManager.this.f3456b.e(city);
                        } catch (AMapException e) {
                            jv.c(e, "OfflineMapManager", "downloadByProvinceName");
                        }
                    }
                });
            }
        } catch (Throwable th) {
            if (th instanceof AMapException) {
                throw th;
            }
            jv.c(th, "OfflineMapManager", "downloadByProvinceName");
        }
    }

    public final void remove(String str) {
        try {
            if (this.f3456b.b(str)) {
                this.f3456b.c(str);
                return;
            }
            OfflineMapProvince offlineMapProvinceC = this.f3455a.c(str);
            if (offlineMapProvinceC != null && offlineMapProvinceC.getCityList() != null) {
                Iterator<OfflineMapCity> it = offlineMapProvinceC.getCityList().iterator();
                while (it.hasNext()) {
                    final String city = it.next().getCity();
                    this.g.post(new Runnable() { // from class: com.amap.api.maps.offlinemap.OfflineMapManager.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            OfflineMapManager.this.f3456b.c(city);
                        }
                    });
                }
                return;
            }
            OfflineMapDownloadListener offlineMapDownloadListener = this.d;
            if (offlineMapDownloadListener != null) {
                offlineMapDownloadListener.onRemove(false, str, "没有该城市");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final ArrayList<OfflineMapProvince> getOfflineMapProvinceList() {
        return this.f3455a.a();
    }

    public final OfflineMapCity getItemByCityCode(String str) {
        return this.f3455a.a(str);
    }

    public final OfflineMapCity getItemByCityName(String str) {
        return this.f3455a.b(str);
    }

    public final OfflineMapProvince getItemByProvinceName(String str) {
        return this.f3455a.c(str);
    }

    public final ArrayList<OfflineMapCity> getOfflineMapCityList() {
        return this.f3455a.b();
    }

    public final ArrayList<OfflineMapCity> getDownloadingCityList() {
        return this.f3455a.e();
    }

    public final ArrayList<OfflineMapProvince> getDownloadingProvinceList() {
        return this.f3455a.f();
    }

    public final ArrayList<OfflineMapCity> getDownloadOfflineMapCityList() {
        return this.f3455a.c();
    }

    public final ArrayList<OfflineMapProvince> getDownloadOfflineMapProvinceList() {
        return this.f3455a.d();
    }

    private void a(String str) throws AMapException {
        this.f3456b.a(str);
    }

    public final void updateOfflineCityByCode(String str) throws AMapException {
        OfflineMapCity itemByCityCode = getItemByCityCode(str);
        if (itemByCityCode == null || itemByCityCode.getCity() == null) {
            throw new AMapException("无效的参数 - IllegalArgumentException");
        }
        a(itemByCityCode.getCity());
    }

    public final void updateOfflineCityByName(String str) throws AMapException {
        a(str);
    }

    public final void updateOfflineMapProvinceByName(String str) throws AMapException {
        a(str);
    }

    private void a() throws AMapException {
        if (!eb.d(this.f3457c)) {
            throw new AMapException(AMapException.ERROR_CONNECTION);
        }
    }

    public final void stop() {
        this.f3456b.d();
    }

    public final void pause() {
        this.f3456b.e();
    }

    public final void pauseByName(String str) {
        this.f3456b.d(str);
    }

    public final void destroy() {
        try {
            bc bcVar = this.f3456b;
            if (bcVar != null) {
                bcVar.f();
            }
            b();
            Handler handler = this.f;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f = null;
            Handler handler2 = this.g;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
            }
            this.g = null;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void b() {
        this.d = null;
    }

    public final void setOnOfflineLoadedListener(OfflineLoadedListener offlineLoadedListener) {
        this.e = offlineLoadedListener;
    }
}
