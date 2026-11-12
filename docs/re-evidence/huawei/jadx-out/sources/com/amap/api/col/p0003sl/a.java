package com.amap.api.col.p0003sl;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.amap.api.fence.GeoFence;
import com.amap.api.fence.GeoFenceListener;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.location.DPoint;
import com.amap.api.services.district.DistrictSearchQuery;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.autonavi.aps.amapapi.utils.i;
import com.autonavi.aps.amapapi.utils.k;
import com.huawei.hianalytics.core.transport.Utils;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class a {
    private static boolean A = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Context f2151b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    i f2150a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    PendingIntent f2152c = null;
    String d = null;
    GeoFenceListener e = null;
    private Object z = new Object();
    volatile int f = 1;
    ArrayList<GeoFence> g = new ArrayList<>();
    c h = null;
    Object i = new Object();
    Object j = new Object();
    HandlerC0024a k = null;
    b l = null;
    volatile boolean m = false;
    volatile boolean n = false;
    volatile boolean o = false;
    com.amap.api.col.p0003sl.b p = null;
    com.amap.api.col.p0003sl.c q = null;
    AMapLocationClient r = null;
    volatile AMapLocation s = null;
    long t = 0;
    AMapLocationClientOption u = null;
    int v = 0;
    AMapLocationListener w = new AMapLocationListener() { // from class: com.amap.api.col.3sl.a.1
        /* JADX WARN: Code duplicated, block: B:17:0x005f A[Catch: all -> 0x00a1, TryCatch #0 {all -> 0x00a1, blocks: (B:2:0x0000, B:5:0x0008, B:8:0x0010, B:10:0x001d, B:12:0x0027, B:17:0x005f, B:19:0x006a, B:21:0x0075, B:22:0x0087, B:24:0x0095, B:13:0x0037), top: B:27:0x0000 }] */
        /* JADX WARN: Code duplicated, block: B:19:0x006a A[Catch: all -> 0x00a1, TryCatch #0 {all -> 0x00a1, blocks: (B:2:0x0000, B:5:0x0008, B:8:0x0010, B:10:0x001d, B:12:0x0027, B:17:0x005f, B:19:0x006a, B:21:0x0075, B:22:0x0087, B:24:0x0095, B:13:0x0037), top: B:27:0x0000 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x0075 A[Catch: all -> 0x00a1, TryCatch #0 {all -> 0x00a1, blocks: (B:2:0x0000, B:5:0x0008, B:8:0x0010, B:10:0x001d, B:12:0x0027, B:17:0x005f, B:19:0x006a, B:21:0x0075, B:22:0x0087, B:24:0x0095, B:13:0x0037), top: B:27:0x0000 }] */
        /* JADX WARN: Code duplicated, block: B:24:0x0095 A[Catch: all -> 0x00a1, TRY_LEAVE, TryCatch #0 {all -> 0x00a1, blocks: (B:2:0x0000, B:5:0x0008, B:8:0x0010, B:10:0x001d, B:12:0x0027, B:17:0x005f, B:19:0x006a, B:21:0x0075, B:22:0x0087, B:24:0x0095, B:13:0x0037), top: B:27:0x0000 }] */
        /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
        @Override // com.amap.api.location.AMapLocationListener
        public final void onLocationChanged(AMapLocation aMapLocation) {
            int errorCode;
            boolean z;
            Bundle bundle;
            try {
                if (!a.this.y && a.this.o) {
                    a.this.s = aMapLocation;
                    if (aMapLocation != null) {
                        errorCode = aMapLocation.getErrorCode();
                        if (aMapLocation.getErrorCode() == 0) {
                            a.this.t = k.b();
                            a.this.a(5, (Bundle) null, 0L);
                            z = true;
                        } else {
                            a.a("定位失败", aMapLocation.getErrorCode(), aMapLocation.getErrorInfo(), "locationDetail:" + aMapLocation.getLocationDetail());
                        }
                        if (z) {
                            a.this.v = 0;
                            a.this.a(6, (Bundle) null, 0L);
                            return;
                        }
                        bundle = new Bundle();
                        if (!a.this.m) {
                            a.this.b(7);
                            bundle.putLong("interval", 2000L);
                            a.this.a(8, bundle, 2000L);
                        }
                        a.this.v++;
                        if (a.this.v >= 3) {
                            bundle.putInt(GeoFence.BUNDLE_KEY_LOCERRORCODE, errorCode);
                            a.this.a(1002, bundle);
                        }
                    }
                    errorCode = 8;
                    z = false;
                    if (z) {
                        a.this.v = 0;
                        a.this.a(6, (Bundle) null, 0L);
                        return;
                    }
                    bundle = new Bundle();
                    if (!a.this.m) {
                        a.this.b(7);
                        bundle.putLong("interval", 2000L);
                        a.this.a(8, bundle, 2000L);
                    }
                    a.this.v++;
                    if (a.this.v >= 3) {
                        bundle.putInt(GeoFence.BUNDLE_KEY_LOCERRORCODE, errorCode);
                        a.this.a(1002, bundle);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    };
    final int x = 3;
    volatile boolean y = false;

    public a(Context context) {
        this.f2151b = null;
        try {
            this.f2151b = context.getApplicationContext();
            j();
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManger", "<init>");
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002c -> B:38:0x0031). Please report as a decompilation issue!!! */
    private void j() {
        if (!this.o) {
            this.o = true;
        }
        if (this.n) {
            return;
        }
        try {
            if (Looper.myLooper() == null) {
                this.h = new c(this.f2151b.getMainLooper());
            } else {
                this.h = new c();
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManger", "init 1");
        }
        try {
            b bVar = new b("fenceActionThread");
            this.l = bVar;
            bVar.setPriority(5);
            this.l.start();
            this.k = new HandlerC0024a(this.l.getLooper());
        } catch (Throwable th2) {
            com.autonavi.aps.amapapi.utils.c.a(th2, "GeoFenceManger", "init 2");
        }
        try {
            this.p = new com.amap.api.col.p0003sl.b(this.f2151b);
            this.q = new com.amap.api.col.p0003sl.c();
            this.u = new AMapLocationClientOption();
            AMapLocationClient aMapLocationClient = new AMapLocationClient(this.f2151b);
            this.r = aMapLocationClient;
            aMapLocationClient.setLocationListener(this.w);
            if (this.f2150a == null) {
                this.f2150a = new i();
            }
        } catch (Throwable th3) {
            com.autonavi.aps.amapapi.utils.c.a(th3, "GeoFenceManger", "initBase");
        }
        this.n = true;
        try {
            String str = this.d;
            if (str != null && this.f2152c == null) {
                a(str);
            }
        } catch (Throwable th4) {
            com.autonavi.aps.amapapi.utils.c.a(th4, "GeoFenceManger", "init 4");
        }
        if (A) {
            return;
        }
        A = true;
        i.a(this.f2151b, "O020", (JSONObject) null);
    }

    static final class b extends HandlerThread {
        public b(String str) {
            super(str);
        }

        @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                super.run();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.amap.api.col.3sl.a$a, reason: collision with other inner class name */
    final class HandlerC0024a extends Handler {
        public HandlerC0024a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            try {
                switch (message.what) {
                    case 0:
                        a.this.b(message.getData());
                        break;
                    case 1:
                        a.this.c(message.getData());
                        break;
                    case 2:
                        a.this.e(message.getData());
                        break;
                    case 3:
                        a.this.d(message.getData());
                        break;
                    case 4:
                        a.this.f(message.getData());
                        break;
                    case 5:
                        a.this.e();
                        break;
                    case 6:
                        a aVar = a.this;
                        aVar.a(aVar.s);
                        break;
                    case 7:
                        a.this.d();
                        break;
                    case 8:
                        a.this.j(message.getData());
                        break;
                    case 9:
                        a.this.a(message.getData());
                        break;
                    case 10:
                        a.this.c();
                        break;
                    case 11:
                        a.this.h(message.getData());
                        break;
                    case 12:
                        a.this.g(message.getData());
                        break;
                    case 13:
                        a.this.g();
                        break;
                    default:
                        break;
                }
            } catch (Throwable unused) {
            }
        }
    }

    final class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        public c() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            try {
                Bundle data = message.getData();
                switch (message.what) {
                    case 1000:
                        a.this.i(data);
                        return;
                    case 1001:
                        try {
                            a.this.b((GeoFence) data.getParcelable(Constants.IS_GEO_FENCE));
                            return;
                        } catch (Throwable th) {
                            th.printStackTrace();
                            return;
                        }
                    case 1002:
                        try {
                            a.this.c(data.getInt(GeoFence.BUNDLE_KEY_LOCERRORCODE));
                            return;
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                            return;
                        }
                    default:
                        return;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final PendingIntent a(String str) {
        synchronized (this.z) {
            try {
                Intent intent = new Intent(str);
                intent.setPackage(il.c(this.f2151b));
                if (Build.VERSION.SDK_INT >= 31 && this.f2151b.getApplicationInfo().targetSdkVersion >= 31) {
                    this.f2152c = PendingIntent.getBroadcast(this.f2151b, 0, intent, 33554432);
                } else {
                    this.f2152c = PendingIntent.getBroadcast(this.f2151b, 0, intent, 0);
                }
                this.d = str;
                ArrayList<GeoFence> arrayList = this.g;
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (GeoFence geoFence : this.g) {
                        geoFence.setPendingIntent(this.f2152c);
                        geoFence.setPendingIntentAction(this.d);
                    }
                }
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "createPendingIntent");
            }
        }
        return this.f2152c;
    }

    public final void a(int i) {
        try {
            j();
            if (i > 7 || i <= 0) {
                i = 1;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("activatesAction", i);
            a(9, bundle, 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "setActivateAction");
        }
    }

    final void a(Bundle bundle) {
        int i = 1;
        if (bundle != null) {
            try {
                i = bundle.getInt("activatesAction", 1);
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "doSetActivatesAction");
                return;
            }
        }
        if (this.f != i) {
            ArrayList<GeoFence> arrayList = this.g;
            if (arrayList != null && !arrayList.isEmpty()) {
                for (GeoFence geoFence : this.g) {
                    geoFence.setStatus(0);
                    geoFence.setEnterTime(-1L);
                }
            }
            n();
        }
        this.f = i;
    }

    public final void a(GeoFenceListener geoFenceListener) {
        try {
            this.e = geoFenceListener;
        } catch (Throwable unused) {
        }
    }

    public final void a(AMapLocationClientOption aMapLocationClientOption) {
        try {
            this.u = aMapLocationClientOption.m750clone();
        } catch (Throwable unused) {
        }
    }

    public final void a(DPoint dPoint, float f, String str) {
        try {
            j();
            Bundle bundle = new Bundle();
            bundle.putParcelable("centerPoint", dPoint);
            bundle.putFloat("fenceRadius", f);
            bundle.putString(GeoFence.BUNDLE_KEY_CUSTOMID, str);
            a(0, bundle, 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "addRoundGeoFence");
        }
    }

    final void b(Bundle bundle) {
        String string;
        try {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            int iC = 1;
            if (bundle == null || bundle.isEmpty()) {
                string = "";
            } else {
                DPoint dPoint = (DPoint) bundle.getParcelable("centerPoint");
                string = bundle.getString(GeoFence.BUNDLE_KEY_CUSTOMID);
                if (dPoint != null) {
                    if (dPoint.getLatitude() > 90.0d || dPoint.getLatitude() < -90.0d || dPoint.getLongitude() > 180.0d || dPoint.getLongitude() < -180.0d) {
                        a("添加围栏失败", 1, "经纬度错误，传入的纬度：" + dPoint.getLatitude() + "传入的经度:" + dPoint.getLongitude(), new String[0]);
                    } else {
                        GeoFence geoFenceA = a(bundle, false);
                        iC = c(geoFenceA);
                        if (iC == 0) {
                            arrayList.add(geoFenceA);
                        }
                    }
                }
            }
            Bundle bundle2 = new Bundle();
            bundle2.putInt("errorCode", iC);
            bundle2.putParcelableArrayList("resultList", arrayList);
            bundle2.putString(GeoFence.BUNDLE_KEY_CUSTOMID, string);
            a(1000, bundle2);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "doAddGeoFenceRound");
        }
    }

    public final void a(List<DPoint> list, String str) {
        try {
            j();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("pointList", new ArrayList<>(list));
            bundle.putString(GeoFence.BUNDLE_KEY_CUSTOMID, str);
            a(1, bundle, 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "addPolygonGeoFence");
        }
    }

    final void c(Bundle bundle) {
        String string;
        GeoFence geoFenceA;
        try {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            int iC = 1;
            if (bundle != null && !bundle.isEmpty()) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("pointList");
                string = bundle.getString(GeoFence.BUNDLE_KEY_CUSTOMID);
                if (parcelableArrayList != null && parcelableArrayList.size() > 2 && (iC = c((geoFenceA = a(bundle, true)))) == 0) {
                    arrayList.add(geoFenceA);
                }
            } else {
                string = "";
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString(GeoFence.BUNDLE_KEY_CUSTOMID, string);
            bundle2.putInt("errorCode", iC);
            bundle2.putParcelableArrayList("resultList", arrayList);
            a(1000, bundle2);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "doAddGeoFencePolygon");
        }
    }

    private GeoFence a(Bundle bundle, boolean z) {
        GeoFence geoFence = new GeoFence();
        ArrayList arrayList = new ArrayList();
        DPoint dPoint = new DPoint();
        if (z) {
            geoFence.setType(1);
            arrayList = bundle.getParcelableArrayList("pointList");
            if (arrayList != null) {
                dPoint = b(arrayList);
            }
            geoFence.setMaxDis2Center(b(dPoint, arrayList));
            geoFence.setMinDis2Center(a(dPoint, arrayList));
        } else {
            geoFence.setType(0);
            dPoint = (DPoint) bundle.getParcelable("centerPoint");
            if (dPoint != null) {
                arrayList.add(dPoint);
            }
            float f = bundle.getFloat("fenceRadius", 1000.0f);
            float f2 = f > 0.0f ? f : 1000.0f;
            geoFence.setRadius(f2);
            geoFence.setMinDis2Center(f2);
            geoFence.setMaxDis2Center(f2);
        }
        geoFence.setActivatesAction(this.f);
        geoFence.setCustomId(bundle.getString(GeoFence.BUNDLE_KEY_CUSTOMID));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(arrayList);
        geoFence.setPointList(arrayList2);
        geoFence.setCenter(dPoint);
        geoFence.setPendingIntentAction(this.d);
        geoFence.setExpiration(-1L);
        geoFence.setPendingIntent(this.f2152c);
        StringBuilder sb = new StringBuilder();
        sb.append(com.amap.api.col.p0003sl.c.a());
        geoFence.setFenceId(sb.toString());
        i iVar = this.f2150a;
        if (iVar != null) {
            iVar.a(this.f2151b, 2);
        }
        return geoFence;
    }

    public final void a(String str, String str2, DPoint dPoint, float f, int i, String str3) {
        try {
            j();
            if (f <= 0.0f || f > 50000.0f) {
                f = 3000.0f;
            }
            if (i <= 0) {
                i = 10;
            }
            if (i > 25) {
                i = 25;
            }
            Bundle bundle = new Bundle();
            bundle.putString("keyWords", str);
            bundle.putString("poiType", str2);
            bundle.putParcelable("centerPoint", dPoint);
            bundle.putFloat("aroundRadius", f);
            bundle.putInt("searchSize", i);
            bundle.putString(GeoFence.BUNDLE_KEY_CUSTOMID, str3);
            a(3, bundle, 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "addNearbyGeoFence");
        }
    }

    final void d(Bundle bundle) {
        b(2, bundle);
    }

    public final void a(String str, String str2, String str3, int i, String str4) {
        try {
            j();
            if (i <= 0) {
                i = 10;
            }
            if (i > 25) {
                i = 25;
            }
            Bundle bundle = new Bundle();
            bundle.putString("keyWords", str);
            bundle.putString("poiType", str2);
            bundle.putString(DistrictSearchQuery.KEYWORDS_CITY, str3);
            bundle.putInt("searchSize", i);
            bundle.putString(GeoFence.BUNDLE_KEY_CUSTOMID, str4);
            a(2, bundle, 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "addKeywordGeoFence");
        }
    }

    final void e(Bundle bundle) {
        b(1, bundle);
    }

    public final void a(String str, String str2) {
        try {
            j();
            Bundle bundle = new Bundle();
            bundle.putString("keyWords", str);
            bundle.putString(GeoFence.BUNDLE_KEY_CUSTOMID, str2);
            a(4, bundle, 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "addDistricetGeoFence");
        }
    }

    final void f(Bundle bundle) {
        b(3, bundle);
    }

    private static boolean a(int i, String str, String str2, DPoint dPoint) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (i != 1) {
            if (i == 2) {
                if (dPoint == null) {
                    return false;
                }
                if (dPoint.getLatitude() > 90.0d || dPoint.getLatitude() < -90.0d || dPoint.getLongitude() > 180.0d || dPoint.getLongitude() < -180.0d) {
                    a("添加围栏失败", 0, "经纬度错误，传入的纬度：" + dPoint.getLatitude() + "传入的经度:" + dPoint.getLongitude(), new String[0]);
                    return false;
                }
            }
        } else if (TextUtils.isEmpty(str2)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0148  */
    private void b(int i, Bundle bundle) {
        String str;
        int i2;
        int i3;
        String strA;
        int iD;
        String str2 = "errorCode";
        Bundle bundle2 = new Bundle();
        try {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            if (bundle != null) {
                try {
                    if (bundle.isEmpty()) {
                        str2 = "errorCode";
                        i3 = 1;
                    } else {
                        List<GeoFence> arrayList2 = new ArrayList<>();
                        String string = bundle.getString(GeoFence.BUNDLE_KEY_CUSTOMID);
                        String string2 = bundle.getString("keyWords");
                        String string3 = bundle.getString(DistrictSearchQuery.KEYWORDS_CITY);
                        String string4 = bundle.getString("poiType");
                        DPoint dPoint = (DPoint) bundle.getParcelable("centerPoint");
                        int i4 = bundle.getInt("searchSize", 10);
                        float f = bundle.getFloat("aroundRadius", 3000.0f);
                        if (a(i, string2, string4, dPoint)) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putString(GeoFence.BUNDLE_KEY_CUSTOMID, string);
                            bundle3.putString("pendingIntentAction", this.d);
                            bundle3.putLong("expiration", -1L);
                            bundle3.putInt("activatesAction", this.f);
                            try {
                                if (i == 1) {
                                    bundle3.putFloat("fenceRadius", 1000.0f);
                                    strA = this.p.a(this.f2151b, "http://restsdk.amap.com/v3/place/text?", string2, string4, string3, String.valueOf(i4));
                                } else if (i == 2) {
                                    double dB = k.b(dPoint.getLatitude());
                                    double dB2 = k.b(dPoint.getLongitude());
                                    int iIntValue = Float.valueOf(f).intValue();
                                    bundle3.putFloat("fenceRadius", 200.0f);
                                    strA = this.p.a(this.f2151b, "http://restsdk.amap.com/v3/place/around?", string2, string4, String.valueOf(i4), String.valueOf(dB), String.valueOf(dB2), String.valueOf(iIntValue));
                                } else {
                                    strA = i != 3 ? null : this.p.a(this.f2151b, "http://restsdk.amap.com/v3/config/district?", string2);
                                }
                                if (strA != null) {
                                    int iA = 1 == i ? com.amap.api.col.p0003sl.c.a(strA, arrayList2, bundle3) : 0;
                                    if (2 == i) {
                                        iA = com.amap.api.col.p0003sl.c.b(strA, arrayList2, bundle3);
                                    }
                                    if (3 == i) {
                                        iA = this.q.c(strA, arrayList2, bundle3);
                                    }
                                    if (iA == 10000) {
                                        if (arrayList2.isEmpty()) {
                                            iD = 16;
                                        } else {
                                            int iA2 = a(arrayList2);
                                            if (iA2 == 0) {
                                                try {
                                                    arrayList.addAll(arrayList2);
                                                } catch (Throwable th) {
                                                    th = th;
                                                    i2 = iA2;
                                                    str = str2;
                                                    try {
                                                        com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "doAddGeoFenceNearby");
                                                        bundle2.putInt(str, 8);
                                                        int i5 = 1000;
                                                    } finally {
                                                        bundle2.putInt(str, i2);
                                                        a(1000, bundle2);
                                                    }
                                                }
                                            }
                                            i3 = iA2;
                                        }
                                    } else {
                                        iD = d(iA);
                                    }
                                } else {
                                    iD = 4;
                                }
                                i3 = iD;
                            } catch (Throwable th2) {
                                th = th2;
                                str = "errorCode";
                                i2 = 0;
                                com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "doAddGeoFenceNearby");
                                bundle2.putInt(str, 8);
                            }
                        } else {
                            str2 = "errorCode";
                            i3 = 1;
                        }
                        try {
                            bundle2.putString(GeoFence.BUNDLE_KEY_CUSTOMID, string);
                            bundle2.putParcelableArrayList("resultList", arrayList);
                        } catch (Throwable th3) {
                            th = th3;
                            i2 = i3;
                            str = str2;
                            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "doAddGeoFenceNearby");
                            bundle2.putInt(str, 8);
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } else {
                str2 = "errorCode";
                i3 = 1;
            }
            bundle2.putInt(str2, i3);
        } catch (Throwable th5) {
            th = th5;
            str = "errorCode";
        }
        int i6 = 1000;
    }

    public final void a() {
        try {
            this.o = false;
            a(10, (Bundle) null, 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "removeGeoFence");
        }
    }

    public final boolean a(GeoFence geoFence) {
        try {
            ArrayList<GeoFence> arrayList = this.g;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (!this.g.contains(geoFence)) {
                    return false;
                }
                if (this.g.size() == 1) {
                    this.o = false;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable("fc", geoFence);
                a(11, bundle, 0L);
                return true;
            }
            this.o = false;
            a(10, (Bundle) null, 0L);
            return true;
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "removeGeoFence(GeoFence)");
            return false;
        }
    }

    public final void a(String str, boolean z) {
        try {
            j();
            Bundle bundle = new Bundle();
            bundle.putString("fid", str);
            bundle.putBoolean("ab", z);
            a(12, bundle, 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "setGeoFenceAble");
        }
    }

    final void g(Bundle bundle) {
        if (bundle != null) {
            try {
                if (bundle.isEmpty()) {
                    return;
                }
                String string = bundle.getString("fid");
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                boolean z = bundle.getBoolean("ab", true);
                ArrayList<GeoFence> arrayList = this.g;
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (GeoFence geoFence : this.g) {
                        if (geoFence.getFenceId().equals(string)) {
                            geoFence.setAble(z);
                            break;
                        }
                    }
                }
                if (!z) {
                    if (k()) {
                        g();
                        return;
                    }
                    return;
                }
                n();
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "doSetGeoFenceAble");
            }
        }
    }

    private boolean k() {
        ArrayList<GeoFence> arrayList = this.g;
        if (arrayList == null || arrayList.isEmpty()) {
            return true;
        }
        Iterator<GeoFence> it = this.g.iterator();
        while (it.hasNext()) {
            if (it.next().isAble()) {
                return false;
            }
        }
        return true;
    }

    public final List<GeoFence> b() {
        try {
            if (this.g == null) {
                this.g = new ArrayList<>();
            }
            return (ArrayList) this.g.clone();
        } catch (Throwable unused) {
            return new ArrayList();
        }
    }

    final void h(Bundle bundle) {
        try {
            if (this.g != null) {
                GeoFence geoFence = (GeoFence) bundle.getParcelable("fc");
                if (this.g.contains(geoFence)) {
                    this.g.remove(geoFence);
                }
                if (this.g.size() <= 0) {
                    c();
                } else {
                    n();
                }
            }
        } catch (Throwable unused) {
        }
    }

    final void c() {
        try {
            if (!this.n) {
                return;
            }
            ArrayList<GeoFence> arrayList = this.g;
            if (arrayList != null) {
                arrayList.clear();
                this.g = null;
            }
            if (this.o) {
                return;
            }
            m();
            AMapLocationClient aMapLocationClient = this.r;
            if (aMapLocationClient != null) {
                aMapLocationClient.stopLocation();
                this.r.onDestroy();
            }
            this.r = null;
            b bVar = this.l;
            if (bVar != null) {
                bVar.quitSafely();
            }
            this.l = null;
            this.p = null;
            synchronized (this.z) {
                PendingIntent pendingIntent = this.f2152c;
                if (pendingIntent != null) {
                    pendingIntent.cancel();
                }
                this.f2152c = null;
            }
            l();
            i iVar = this.f2150a;
            if (iVar != null) {
                iVar.b(this.f2151b);
            }
        } catch (Throwable unused) {
        }
        this.m = false;
        this.n = false;
    }

    private void l() {
        try {
            synchronized (this.j) {
                c cVar = this.h;
                if (cVar != null) {
                    cVar.removeCallbacksAndMessages(null);
                }
                this.h = null;
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "destroyResultHandler");
        }
    }

    private int c(GeoFence geoFence) {
        try {
            if (this.g == null) {
                this.g = new ArrayList<>();
            }
            if (this.g.contains(geoFence)) {
                return 17;
            }
            this.g.add(geoFence);
            return 0;
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "addGeoFence2List");
            a("添加围栏失败", 8, th.getMessage(), new String[0]);
            return 8;
        }
    }

    private int a(List<GeoFence> list) {
        try {
            if (this.g == null) {
                this.g = new ArrayList<>();
            }
            Iterator<GeoFence> it = list.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
            return 0;
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "addGeoFenceList");
            a("添加围栏失败", 8, th.getMessage(), new String[0]);
            return 8;
        }
    }

    final void a(int i, Bundle bundle, long j) {
        try {
            synchronized (this.i) {
                HandlerC0024a handlerC0024a = this.k;
                if (handlerC0024a != null) {
                    Message messageObtainMessage = handlerC0024a.obtainMessage();
                    messageObtainMessage.what = i;
                    messageObtainMessage.setData(bundle);
                    this.k.sendMessageDelayed(messageObtainMessage, j);
                }
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "sendActionHandlerMessage");
        }
    }

    final void b(int i) {
        try {
            synchronized (this.i) {
                HandlerC0024a handlerC0024a = this.k;
                if (handlerC0024a != null) {
                    handlerC0024a.removeMessages(i);
                }
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "removeActionHandlerMessage");
        }
    }

    private void m() {
        try {
            synchronized (this.i) {
                HandlerC0024a handlerC0024a = this.k;
                if (handlerC0024a != null) {
                    handlerC0024a.removeCallbacksAndMessages(null);
                }
                this.k = null;
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "destroyActionHandler");
        }
    }

    final void a(int i, Bundle bundle) {
        try {
            synchronized (this.j) {
                c cVar = this.h;
                if (cVar != null) {
                    Message messageObtainMessage = cVar.obtainMessage();
                    messageObtainMessage.what = i;
                    messageObtainMessage.setData(bundle);
                    this.h.sendMessage(messageObtainMessage);
                }
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "sendResultHandlerMessage");
        }
    }

    final void i(Bundle bundle) {
        if (bundle != null) {
            try {
                if (bundle.isEmpty()) {
                    return;
                }
                int i = bundle.getInt("errorCode");
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("resultList");
                if (parcelableArrayList == null) {
                    parcelableArrayList = new ArrayList();
                }
                String string = bundle.getString(GeoFence.BUNDLE_KEY_CUSTOMID);
                if (string == null) {
                    string = "";
                }
                GeoFenceListener geoFenceListener = this.e;
                if (geoFenceListener != null) {
                    geoFenceListener.onGeoFenceCreateFinished((ArrayList) parcelableArrayList.clone(), i, string);
                }
                if (i == 0) {
                    n();
                }
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "resultAddGeoFenceFinished");
            }
        }
    }

    private void n() {
        if (this.y || this.k == null) {
            return;
        }
        if (p()) {
            a(6, (Bundle) null, 0L);
            a(5, (Bundle) null, 0L);
        } else {
            b(7);
            a(7, (Bundle) null, 0L);
        }
    }

    private static Bundle a(GeoFence geoFence, String str, String str2, int i, int i2) {
        Bundle bundle = new Bundle();
        if (str == null) {
            str = "";
        }
        bundle.putString(GeoFence.BUNDLE_KEY_FENCEID, str);
        bundle.putString(GeoFence.BUNDLE_KEY_CUSTOMID, str2);
        bundle.putInt("event", i);
        bundle.putInt(GeoFence.BUNDLE_KEY_LOCERRORCODE, i2);
        bundle.putParcelable("fence", geoFence);
        return bundle;
    }

    final void c(int i) {
        try {
            if (this.f2151b != null) {
                synchronized (this.z) {
                    if (this.f2152c == null) {
                        return;
                    }
                    Intent intent = new Intent();
                    intent.putExtras(a((GeoFence) null, (String) null, (String) null, 4, i));
                    this.f2152c.send(this.f2151b, 0, intent);
                }
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "resultRemindLocationError");
        }
    }

    final void b(GeoFence geoFence) {
        try {
            synchronized (this.z) {
                if (this.f2151b != null) {
                    if (this.f2152c == null && geoFence.getPendingIntent() == null) {
                        return;
                    }
                    Intent intent = new Intent();
                    intent.putExtras(a(geoFence, geoFence.getFenceId(), geoFence.getCustomId(), geoFence.getStatus(), 0));
                    String str = this.d;
                    if (str != null) {
                        intent.setAction(str);
                    }
                    intent.setPackage(il.c(this.f2151b));
                    if (geoFence.getPendingIntent() != null) {
                        geoFence.getPendingIntent().send(this.f2151b, 0, intent);
                    } else {
                        this.f2152c.send(this.f2151b, 0, intent);
                    }
                }
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "resultTriggerGeoFence");
        }
    }

    final void a(AMapLocation aMapLocation) {
        ArrayList<GeoFence> arrayList;
        try {
            if (this.y || (arrayList = this.g) == null || arrayList.isEmpty() || aMapLocation == null || aMapLocation.getErrorCode() != 0) {
                return;
            }
            for (GeoFence geoFence : this.g) {
                if (geoFence.isAble() && b(aMapLocation, geoFence) && a(geoFence, this.f)) {
                    geoFence.setCurrentLocation(aMapLocation);
                    d(geoFence);
                }
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "doCheckFence");
        }
    }

    private void d(GeoFence geoFence) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(Constants.IS_GEO_FENCE, geoFence);
        a(1001, bundle);
    }

    final void d() {
        try {
            if (this.r != null) {
                o();
                this.u.setLocationCacheEnable(true);
                this.u.setNeedAddress(false);
                this.u.setOnceLocation(true);
                this.r.setLocationOption(this.u);
                this.r.startLocation();
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "doStartOnceLocation");
        }
    }

    private void o() {
        try {
            if (this.m) {
                b(8);
            }
            AMapLocationClient aMapLocationClient = this.r;
            if (aMapLocationClient != null) {
                aMapLocationClient.stopLocation();
            }
            this.m = false;
        } catch (Throwable unused) {
        }
    }

    final void j(Bundle bundle) {
        try {
            if (this.r != null) {
                long j = 2000;
                if (bundle != null && !bundle.isEmpty()) {
                    j = bundle.getLong("interval", 2000L);
                }
                this.u.setOnceLocation(false);
                this.u.setInterval(j);
                this.u.setLocationCacheEnable(true);
                this.u.setNeedAddress(false);
                this.r.setLocationOption(this.u);
                if (this.m) {
                    return;
                }
                this.r.stopLocation();
                this.r.startLocation();
                this.m = true;
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "doStartContinueLocation");
        }
    }

    private boolean p() {
        return this.s != null && k.a(this.s) && k.b() - this.t < 10000;
    }

    final void e() {
        try {
            if (!this.y && k.a(this.s)) {
                float fA = a(this.s, this.g);
                if (fA == Float.MAX_VALUE) {
                    return;
                }
                if (fA < 1000.0f) {
                    b(7);
                    Bundle bundle = new Bundle();
                    bundle.putLong("interval", 2000L);
                    a(8, bundle, 500L);
                    return;
                }
                if (fA < 5000.0f) {
                    o();
                    b(7);
                    a(7, (Bundle) null, 10000L);
                } else {
                    o();
                    b(7);
                    a(7, (Bundle) null, (long) (((fA - 4000.0f) / 100.0f) * 1000.0f));
                }
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "doCheckLocationPolicy");
        }
    }

    private static DPoint b(List<DPoint> list) {
        DPoint dPoint = new DPoint();
        if (list != null) {
            try {
                double latitude = 0.0d;
                double longitude = 0.0d;
                for (DPoint dPoint2 : list) {
                    latitude += dPoint2.getLatitude();
                    longitude += dPoint2.getLongitude();
                }
                return new DPoint(k.b(latitude / ((double) list.size())), k.b(longitude / ((double) list.size())));
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceUtil", "getPolygonCenter");
            }
        }
        return dPoint;
    }

    private static float a(AMapLocation aMapLocation, List<GeoFence> list) {
        float fMin = Float.MAX_VALUE;
        if (aMapLocation != null && aMapLocation.getErrorCode() == 0 && list != null && !list.isEmpty()) {
            DPoint dPoint = new DPoint(aMapLocation.getLatitude(), aMapLocation.getLongitude());
            for (GeoFence geoFence : list) {
                if (geoFence.isAble()) {
                    float fA = k.a(dPoint, geoFence.getCenter());
                    if (fA > geoFence.getMinDis2Center() && fA < geoFence.getMaxDis2Center()) {
                        return 0.0f;
                    }
                    if (fA > geoFence.getMaxDis2Center()) {
                        fMin = Math.min(fMin, fA - geoFence.getMaxDis2Center());
                    }
                    if (fA < geoFence.getMinDis2Center()) {
                        fMin = Math.min(fMin, geoFence.getMinDis2Center() - fA);
                    }
                }
            }
        }
        return fMin;
    }

    static float a(DPoint dPoint, List<DPoint> list) {
        float fMin = Float.MAX_VALUE;
        if (dPoint != null && list != null && !list.isEmpty()) {
            Iterator<DPoint> it = list.iterator();
            while (it.hasNext()) {
                fMin = Math.min(fMin, k.a(dPoint, it.next()));
            }
        }
        return fMin;
    }

    static float b(DPoint dPoint, List<DPoint> list) {
        float fMax = Float.MIN_VALUE;
        if (dPoint != null && list != null && !list.isEmpty()) {
            Iterator<DPoint> it = list.iterator();
            while (it.hasNext()) {
                fMax = Math.max(fMax, k.a(dPoint, it.next()));
            }
        }
        return fMax;
    }

    private static boolean a(AMapLocation aMapLocation, DPoint dPoint, float f) {
        return k.a(new double[]{dPoint.getLatitude(), dPoint.getLongitude(), aMapLocation.getLatitude(), aMapLocation.getLongitude()}) <= f;
    }

    private static boolean b(AMapLocation aMapLocation, List<DPoint> list) {
        if (list.size() < 3) {
            return false;
        }
        return com.autonavi.aps.amapapi.utils.c.a(new DPoint(aMapLocation.getLatitude(), aMapLocation.getLongitude()), list);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0046 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:3:0x0001, B:6:0x0009, B:8:0x000f, B:10:0x0019, B:18:0x0029, B:19:0x0031, B:21:0x0037, B:25:0x0046), top: B:32:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0054 A[RETURN] */
    private static boolean a(AMapLocation aMapLocation, GeoFence geoFence) {
        boolean z = false;
        try {
            if (k.a(aMapLocation) && geoFence != null && geoFence.getPointList() != null && !geoFence.getPointList().isEmpty()) {
                int type = geoFence.getType();
                if (type == 0) {
                    if (a(aMapLocation, geoFence.getCenter(), geoFence.getRadius())) {
                        return true;
                    }
                } else {
                    if (type != 1) {
                        if (type != 2) {
                            if (type != 3) {
                            }
                        } else if (a(aMapLocation, geoFence.getCenter(), geoFence.getRadius())) {
                            return true;
                        }
                    }
                    Iterator<List<DPoint>> it = geoFence.getPointList().iterator();
                    while (it.hasNext()) {
                        if (b(aMapLocation, it.next())) {
                            z = true;
                        }
                    }
                    return z;
                }
            }
            return false;
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, Utils.TAG, "isInGeoFence");
            return false;
        }
    }

    private static boolean b(AMapLocation aMapLocation, GeoFence geoFence) {
        boolean z = false;
        try {
            if (a(aMapLocation, geoFence)) {
                if (geoFence.getEnterTime() == -1) {
                    if (geoFence.getStatus() != 1) {
                        geoFence.setEnterTime(k.b());
                        geoFence.setStatus(1);
                        return true;
                    }
                } else if (geoFence.getStatus() != 3 && k.b() - geoFence.getEnterTime() > 600000) {
                    geoFence.setStatus(3);
                    return true;
                }
            } else if (geoFence.getStatus() != 2) {
                try {
                    geoFence.setStatus(2);
                    geoFence.setEnterTime(-1L);
                    return true;
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    com.autonavi.aps.amapapi.utils.c.a(th, Utils.TAG, "isFenceStatusChanged");
                    return z;
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean a(GeoFence geoFence, int i) {
        boolean z = false;
        if ((i & 1) == 1) {
            try {
                if (geoFence.getStatus() == 1) {
                    z = true;
                }
                if ((i & 2) == 2 && geoFence.getStatus() == 2) {
                    z = true;
                }
                if ((i & 4) != 4 && geoFence.getStatus() == 3) {
                    return true;
                }
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, Utils.TAG, "remindStatus");
            }
        } else {
            if ((i & 2) == 2) {
                z = true;
            }
            if ((i & 4) != 4) {
            }
        }
        return z;
    }

    private static int d(int i) {
        if (i != 1 && i != 7 && i != 4 && i != 5 && i != 16 && i != 17) {
            switch (i) {
                case 10000:
                    i = 0;
                    break;
                case 10001:
                case 10002:
                case 10007:
                case 10008:
                case 10009:
                case 10012:
                case 10013:
                    i = 7;
                    break;
                case 10003:
                case 10004:
                case 10005:
                case 10006:
                case 10010:
                case 10011:
                case PrebakedEffectId.RT_CALENDAR_DATE /* 10014 */:
                case 10015:
                case 10016:
                case 10017:
                    i = 4;
                    break;
                default:
                    switch (i) {
                        case 20000:
                        case 20001:
                        case 20002:
                            i = 1;
                            break;
                        default:
                            i = 8;
                            break;
                    }
                    break;
            }
        }
        if (i != 0) {
            a("添加围栏失败", i, "searchErrCode is ".concat(String.valueOf(i)), new String[0]);
        }
        return i;
    }

    static void a(String str, int i, String str2, String... strArr) {
        StringBuffer stringBuffer = new StringBuffer("===========================================\n");
        stringBuffer.append("              " + str + "                ").append("\n-------------------------------------------\n");
        stringBuffer.append("errorCode:".concat(String.valueOf(i))).append("\n");
        stringBuffer.append("错误信息:".concat(String.valueOf(str2))).append("\n");
        if (strArr.length > 0) {
            for (String str3 : strArr) {
                stringBuffer.append(str3).append("\n");
            }
        }
        stringBuffer.append("===========================================\n");
        Log.i("fenceErrLog", stringBuffer.toString());
    }

    public final void f() {
        try {
            j();
            this.y = true;
            a(13, (Bundle) null, 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "pauseGeoFence");
        }
    }

    final void g() {
        try {
            b(7);
            b(8);
            AMapLocationClient aMapLocationClient = this.r;
            if (aMapLocationClient != null) {
                aMapLocationClient.stopLocation();
            }
            this.m = false;
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "doPauseGeoFence");
        }
    }

    public final void h() {
        try {
            j();
            if (this.y) {
                this.y = false;
                n();
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "resumeGeoFence");
        }
    }

    public final boolean i() {
        return this.y;
    }
}
