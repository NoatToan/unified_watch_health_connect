package com.amap.api.maps.offlinemap;

import android.content.Context;
import android.os.Handler;
import com.amap.api.col.p0003sl.bb;
import com.amap.api.col.p0003sl.iu;
import com.amap.api.col.p0003sl.y0;
import com.amap.api.maps.AMap;
import com.amap.api.maps.AMapException;
import defpackage.k0t;
import defpackage.m2t;
import defpackage.mms;
import defpackage.qbs;
import defpackage.zas;
import defpackage.zns;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class OfflineMapManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    qbs f6469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    zas f6470b;
    private Context c;
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

    public OfflineMapManager(Context context, OfflineMapDownloadListener offlineMapDownloadListener) throws Exception {
        y0 y0VarA = iu.a(context, zns.t());
        if (y0VarA.f6352a != iu.c.SuccessCode) {
            throw new Exception(y0VarA.f6353b);
        }
        this.d = offlineMapDownloadListener;
        this.c = context.getApplicationContext();
        this.f = new Handler(this.c.getMainLooper());
        this.g = new Handler(this.c.getMainLooper());
        a(context);
        k0t.a().c(this.c);
    }

    public final void destroy() {
        try {
            zas zasVar = this.f6470b;
            if (zasVar != null) {
                zasVar.A();
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

    public final void downloadByCityCode(String str) throws AMapException {
        try {
            this.f6470b.C(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void downloadByCityName(String str) throws AMapException {
        try {
            this.f6470b.y(str);
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
                            OfflineMapManager.this.f6470b.y(city);
                        } catch (AMapException e) {
                            m2t.r(e, "OfflineMapManager", "downloadByProvinceName");
                        }
                    }
                });
            }
        } catch (Throwable th) {
            if (th instanceof AMapException) {
                throw th;
            }
            m2t.r(th, "OfflineMapManager", "downloadByProvinceName");
        }
    }

    public final ArrayList<OfflineMapCity> getDownloadOfflineMapCityList() {
        return this.f6469a.s();
    }

    public final ArrayList<OfflineMapProvince> getDownloadOfflineMapProvinceList() {
        return this.f6469a.t();
    }

    public final ArrayList<OfflineMapCity> getDownloadingCityList() {
        return this.f6469a.u();
    }

    public final ArrayList<OfflineMapProvince> getDownloadingProvinceList() {
        return this.f6469a.v();
    }

    public final OfflineMapCity getItemByCityCode(String str) {
        return this.f6469a.a(str);
    }

    public final OfflineMapCity getItemByCityName(String str) {
        return this.f6469a.m(str);
    }

    public final OfflineMapProvince getItemByProvinceName(String str) {
        return this.f6469a.r(str);
    }

    public final ArrayList<OfflineMapCity> getOfflineMapCityList() {
        return this.f6469a.n();
    }

    public final ArrayList<OfflineMapProvince> getOfflineMapProvinceList() {
        return this.f6469a.b();
    }

    public final void pause() {
        this.f6470b.w();
    }

    public final void pauseByName(String str) {
        this.f6470b.v(str);
    }

    public final void remove(String str) {
        try {
            if (this.f6470b.m(str)) {
                this.f6470b.r(str);
                return;
            }
            OfflineMapProvince offlineMapProvinceR = this.f6469a.r(str);
            if (offlineMapProvinceR != null && offlineMapProvinceR.getCityList() != null) {
                Iterator<OfflineMapCity> it = offlineMapProvinceR.getCityList().iterator();
                while (it.hasNext()) {
                    final String city = it.next().getCity();
                    this.g.post(new Runnable() { // from class: com.amap.api.maps.offlinemap.OfflineMapManager.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            OfflineMapManager.this.f6470b.r(city);
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

    public final void restart() {
    }

    public final void setOnOfflineLoadedListener(OfflineLoadedListener offlineLoadedListener) {
        this.e = offlineLoadedListener;
    }

    public final void stop() {
        this.f6470b.t();
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

    private void a(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext;
        zas.p = false;
        zas zasVarA = zas.a(applicationContext);
        this.f6470b = zasVarA;
        zasVarA.e(new zas.d() { // from class: com.amap.api.maps.offlinemap.OfflineMapManager.1
            @Override // zas.d
            public final void a(final bb bbVar) {
                if (OfflineMapManager.this.d == null || bbVar == null) {
                    return;
                }
                OfflineMapManager.this.f.post(new Runnable() { // from class: com.amap.api.maps.offlinemap.OfflineMapManager.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            OfflineMapManager.this.d.onDownload(bbVar.B().d(), bbVar.getcompleteCode(), bbVar.getCity());
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
            }

            @Override // zas.d
            public final void b(final bb bbVar) {
                if (OfflineMapManager.this.d == null || bbVar == null) {
                    return;
                }
                OfflineMapManager.this.f.post(new Runnable() { // from class: com.amap.api.maps.offlinemap.OfflineMapManager.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            if (!bbVar.B().equals(bbVar.l) && !bbVar.B().equals(bbVar.f)) {
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

            @Override // zas.d
            public final void c(final bb bbVar) {
                if (OfflineMapManager.this.d == null || bbVar == null) {
                    return;
                }
                OfflineMapManager.this.f.post(new Runnable() { // from class: com.amap.api.maps.offlinemap.OfflineMapManager.1.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            if (bbVar.B().equals(bbVar.f)) {
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

            @Override // zas.d
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
            this.f6470b.d();
            this.f6469a = this.f6470b.f41088k;
            mms.i(context);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void b() {
        this.d = null;
    }

    private void a(String str) throws AMapException {
        this.f6470b.h(str);
    }

    public OfflineMapManager(Context context, OfflineMapDownloadListener offlineMapDownloadListener, AMap aMap) {
        this.d = offlineMapDownloadListener;
        this.c = context.getApplicationContext();
        this.f = new Handler(this.c.getMainLooper());
        this.g = new Handler(this.c.getMainLooper());
        try {
            a(context);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a() throws AMapException {
        if (!zns.j0(this.c)) {
            throw new AMapException(AMapException.ERROR_CONNECTION);
        }
    }
}
