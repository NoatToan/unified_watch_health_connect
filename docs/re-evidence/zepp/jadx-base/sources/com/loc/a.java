package com.loc;

import android.annotation.SuppressLint;
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
import com.huami.feedback.util.ErrorConstKt;
import com.huami.passport.Configs;
import com.huami.watch.companion.xiaomiai.EngineProcessor;
import com.huami.web.container.utils.UtilsKt;
import com.unionpay.tsm.constant.TsmResultCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
@SuppressLint({"NewApi"})
public final class a {
    private static boolean A = false;
    public Context b;
    public em a = null;
    public PendingIntent c = null;
    public String d = null;
    public GeoFenceListener e = null;
    private Object z = new Object();
    public volatile int f = 1;
    public ArrayList<GeoFence> g = new ArrayList<>();
    public c h = null;
    public Object i = new Object();
    public Object j = new Object();
    public HandlerC0734a k = null;
    public b l = null;
    public volatile boolean m = false;
    public volatile boolean n = false;
    public volatile boolean o = false;
    public com.loc.b p = null;
    public com.loc.c q = null;
    public AMapLocationClient r = null;
    public volatile AMapLocation s = null;
    public long t = 0;
    public AMapLocationClientOption u = null;
    public int v = 0;
    public AMapLocationListener w = new AMapLocationListener() { // from class: com.loc.a.1
        @Override // com.amap.api.location.AMapLocationListener
        public final void onLocationChanged(AMapLocation aMapLocation) {
            boolean z;
            int errorCode;
            try {
                if (!a.this.y && a.this.o) {
                    a.this.s = aMapLocation;
                    if (aMapLocation != null) {
                        errorCode = aMapLocation.getErrorCode();
                        if (aMapLocation.getErrorCode() == 0) {
                            a.this.t = eo.b();
                            a.this.a(5, (Bundle) null, 0L);
                            z = true;
                        } else {
                            a.a("定位失败", aMapLocation.getErrorCode(), aMapLocation.getErrorInfo(), "locationDetail:" + aMapLocation.getLocationDetail());
                            z = false;
                        }
                    } else {
                        z = false;
                        errorCode = 8;
                    }
                    if (z) {
                        a aVar = a.this;
                        aVar.v = 0;
                        aVar.a(6, (Bundle) null, 0L);
                        return;
                    }
                    Bundle bundle = new Bundle();
                    if (!a.this.m) {
                        a.this.b(7);
                        bundle.putLong("interval", 2000L);
                        a.this.a(8, bundle, 2000L);
                    }
                    a aVar2 = a.this;
                    int i = aVar2.v + 1;
                    aVar2.v = i;
                    if (i >= 3) {
                        bundle.putInt(GeoFence.BUNDLE_KEY_LOCERRORCODE, errorCode);
                        a.this.a(1002, bundle);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    };
    public final int x = 3;
    public volatile boolean y = false;

    /* JADX INFO: renamed from: com.loc.a$a, reason: collision with other inner class name */
    public class HandlerC0734a extends Handler {
        public HandlerC0734a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            String string;
            GeoFence geoFenceA;
            try {
                String str = "";
                int iB = 1;
                switch (message.what) {
                    case 0:
                        a aVar = a.this;
                        Bundle data = message.getData();
                        try {
                            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                            if (data == null || data.isEmpty()) {
                                string = str;
                            } else {
                                DPoint dPoint = (DPoint) data.getParcelable("centerPoint");
                                string = data.getString(GeoFence.BUNDLE_KEY_CUSTOMID);
                                if (dPoint == null) {
                                    str = string;
                                    string = str;
                                } else if (dPoint.getLatitude() > 90.0d || dPoint.getLatitude() < -90.0d || dPoint.getLongitude() > 180.0d || dPoint.getLongitude() < -180.0d) {
                                    a.a("添加围栏失败", 1, "经纬度错误，传入的纬度：" + dPoint.getLatitude() + "传入的经度:" + dPoint.getLongitude(), new String[0]);
                                } else {
                                    GeoFence geoFenceA2 = aVar.a(data, false);
                                    iB = aVar.b(geoFenceA2);
                                    if (iB == 0) {
                                        arrayList.add(geoFenceA2);
                                    }
                                }
                            }
                            Bundle bundle = new Bundle();
                            bundle.putInt("errorCode", iB);
                            bundle.putParcelableArrayList("resultList", arrayList);
                            bundle.putString(GeoFence.BUNDLE_KEY_CUSTOMID, string);
                            aVar.a(1000, bundle);
                            return;
                        } catch (Throwable th) {
                            ei.a(th, "GeoFenceManager", "doAddGeoFenceRound");
                            return;
                        }
                    case 1:
                        a aVar2 = a.this;
                        Bundle data2 = message.getData();
                        try {
                            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                            if (data2 != null && !data2.isEmpty()) {
                                ArrayList parcelableArrayList = data2.getParcelableArrayList("pointList");
                                String string2 = data2.getString(GeoFence.BUNDLE_KEY_CUSTOMID);
                                if (parcelableArrayList != null && parcelableArrayList.size() > 2 && (iB = aVar2.b((geoFenceA = aVar2.a(data2, true)))) == 0) {
                                    arrayList2.add(geoFenceA);
                                }
                                str = string2;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putString(GeoFence.BUNDLE_KEY_CUSTOMID, str);
                            bundle2.putInt("errorCode", iB);
                            bundle2.putParcelableArrayList("resultList", arrayList2);
                            aVar2.a(1000, bundle2);
                            return;
                        } catch (Throwable th2) {
                            ei.a(th2, "GeoFenceManager", "doAddGeoFencePolygon");
                            return;
                        }
                    case 2:
                        a.this.c(message.getData());
                        return;
                    case 3:
                        a.this.b(message.getData());
                        return;
                    case 4:
                        a.this.d(message.getData());
                        return;
                    case 5:
                        a.this.f();
                        return;
                    case 6:
                        a aVar3 = a.this;
                        aVar3.a(aVar3.s);
                        return;
                    case 7:
                        a aVar4 = a.this;
                        try {
                            if (aVar4.r != null) {
                                aVar4.e();
                                aVar4.u.setOnceLocation(true);
                                aVar4.r.setLocationOption(aVar4.u);
                                aVar4.r.startLocation();
                                return;
                            }
                            return;
                        } catch (Throwable th3) {
                            ei.a(th3, "GeoFenceManager", "doStartOnceLocation");
                            return;
                        }
                    case 8:
                        a aVar5 = a.this;
                        Bundle data3 = message.getData();
                        try {
                            if (aVar5.r != null) {
                                long j = 2000;
                                if (data3 != null && !data3.isEmpty()) {
                                    j = data3.getLong("interval", 2000L);
                                }
                                aVar5.u.setOnceLocation(false);
                                aVar5.u.setInterval(j);
                                aVar5.r.setLocationOption(aVar5.u);
                                if (aVar5.m) {
                                    return;
                                }
                                aVar5.r.stopLocation();
                                aVar5.r.startLocation();
                                aVar5.m = true;
                                return;
                            }
                            return;
                        } catch (Throwable th4) {
                            ei.a(th4, "GeoFenceManager", "doStartContinueLocation");
                            return;
                        }
                    case 9:
                        a.this.a(message.getData());
                        return;
                    case 10:
                        a.this.c();
                        return;
                    case 11:
                        a.this.f(message.getData());
                        return;
                    case 12:
                        a.this.e(message.getData());
                        return;
                    case 13:
                        a.this.h();
                        return;
                    default:
                        return;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static class b extends HandlerThread {
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

    public class c extends Handler {
        public c() {
        }

        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            try {
                Bundle data = message.getData();
                switch (message.what) {
                    case 1000:
                        a aVar = a.this;
                        if (data != null) {
                            try {
                                if (data.isEmpty()) {
                                    return;
                                }
                                int i = data.getInt("errorCode");
                                ArrayList parcelableArrayList = data.getParcelableArrayList("resultList");
                                if (parcelableArrayList == null) {
                                    parcelableArrayList = new ArrayList();
                                }
                                String string = data.getString(GeoFence.BUNDLE_KEY_CUSTOMID);
                                if (string == null) {
                                    string = "";
                                }
                                GeoFenceListener geoFenceListener = aVar.e;
                                if (geoFenceListener != null) {
                                    geoFenceListener.onGeoFenceCreateFinished((ArrayList) parcelableArrayList.clone(), i, string);
                                }
                                if (i == 0) {
                                    aVar.d();
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                ei.a(th, "GeoFenceManager", "resultAddGeoFenceFinished");
                                return;
                            }
                        }
                        return;
                    case 1001:
                        try {
                            a.this.c((GeoFence) data.getParcelable("geoFence"));
                            return;
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                            return;
                        }
                    case 1002:
                        try {
                            a.this.c(data.getInt(GeoFence.BUNDLE_KEY_LOCERRORCODE));
                            return;
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                            return;
                        }
                    default:
                        return;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public a(Context context) {
        this.b = null;
        try {
            this.b = context.getApplicationContext();
            k();
        } catch (Throwable th) {
            ei.a(th, "GeoFenceManger", "<init>");
        }
    }

    public static float a(DPoint dPoint, List<DPoint> list) {
        float fMin = Float.MAX_VALUE;
        if (dPoint != null && list != null && !list.isEmpty()) {
            Iterator<DPoint> it2 = list.iterator();
            while (it2.hasNext()) {
                fMin = Math.min(fMin, eo.a(dPoint, it2.next()));
            }
        }
        return fMin;
    }

    private int a(List<GeoFence> list) {
        try {
            if (this.g == null) {
                this.g = new ArrayList<>();
            }
            Iterator<GeoFence> it2 = list.iterator();
            while (it2.hasNext()) {
                b(it2.next());
            }
            return 0;
        } catch (Throwable th) {
            ei.a(th, "GeoFenceManager", "addGeoFenceList");
            a("添加围栏失败", 8, th.getMessage(), new String[0]);
            return 8;
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
        bundle.putParcelable(GeoFence.BUNDLE_KEY_FENCE, geoFence);
        return bundle;
    }

    public static void a(String str, int i, String str2, String... strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("===========================================\n");
        stringBuffer.append("              " + str + "                ");
        stringBuffer.append("\n");
        stringBuffer.append("-------------------------------------------\n");
        stringBuffer.append("errorCode:" + i);
        stringBuffer.append("\n");
        stringBuffer.append("错误信息:" + str2);
        stringBuffer.append("\n");
        if (strArr.length > 0) {
            for (String str3 : strArr) {
                stringBuffer.append(str3);
                stringBuffer.append("\n");
            }
        }
        stringBuffer.append("===========================================\n");
        Log.i("fenceErrLog", stringBuffer.toString());
    }

    private static boolean a(GeoFence geoFence, int i) {
        boolean z = false;
        if ((i & 1) == 1) {
            try {
                if (geoFence.getStatus() == 1) {
                    z = true;
                }
            } catch (Throwable th) {
                ei.a(th, UtilsKt.TAG, "remindStatus");
                return z;
            }
        }
        if ((i & 2) == 2 && geoFence.getStatus() == 2) {
            z = true;
        }
        return ((i & 4) == 4 && geoFence.getStatus() == 3) ? true : z;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002a A[Catch: all -> 0x0092, TRY_LEAVE, TryCatch #0 {all -> 0x0092, blocks: (B:3:0x0002, B:6:0x000a, B:8:0x0010, B:10:0x001a, B:16:0x002a, B:29:0x0061), top: B:41:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0039 A[Catch: all -> 0x005e, TryCatch #1 {all -> 0x005e, blocks: (B:18:0x0033, B:20:0x0039, B:23:0x0047), top: B:43:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0045  */
    /* JADX WARN: Code duplicated, block: B:23:0x0047 A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #1 {all -> 0x005e, blocks: (B:18:0x0033, B:20:0x0039, B:23:0x0047), top: B:43:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0061 A[Catch: all -> 0x0092, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0092, blocks: (B:3:0x0002, B:6:0x000a, B:8:0x0010, B:10:0x001a, B:16:0x002a, B:29:0x0061), top: B:41:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008c  */
    /* JADX WARN: Code duplicated, block: B:33:0x008e  */
    /* JADX WARN: Code duplicated, block: B:46:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    private static boolean a(AMapLocation aMapLocation, GeoFence geoFence) {
        DPoint center;
        boolean z;
        boolean z2;
        boolean zA;
        boolean z3 = false;
        try {
            if (eo.a(aMapLocation) && geoFence != null && geoFence.getPointList() != null && !geoFence.getPointList().isEmpty()) {
                int type = geoFence.getType();
                if (type == 0) {
                    center = geoFence.getCenter();
                    if (eo.a(new double[]{center.getLatitude(), center.getLongitude(), aMapLocation.getLatitude(), aMapLocation.getLongitude()}) <= geoFence.getRadius()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return true;
                    }
                } else if (type == 1) {
                    z2 = false;
                    for (List<DPoint> list : geoFence.getPointList()) {
                        try {
                            if (list.size() < 3) {
                                zA = false;
                            } else {
                                zA = ei.a(new DPoint(aMapLocation.getLatitude(), aMapLocation.getLongitude()), list);
                            }
                            if (zA) {
                                z2 = true;
                            }
                        } catch (Throwable th) {
                            th = th;
                            z3 = z2;
                            ei.a(th, UtilsKt.TAG, "isInGeoFence");
                        }
                    }
                    z3 = z2;
                } else if (type == 2) {
                    center = geoFence.getCenter();
                    if (eo.a(new double[]{center.getLatitude(), center.getLongitude(), aMapLocation.getLatitude(), aMapLocation.getLongitude()}) <= geoFence.getRadius()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return true;
                    }
                } else if (type == 3) {
                    z2 = false;
                    while (r11.hasNext()) {
                        if (list.size() < 3) {
                            zA = false;
                        } else {
                            zA = ei.a(new DPoint(aMapLocation.getLatitude(), aMapLocation.getLongitude()), list);
                        }
                        if (zA) {
                            z2 = true;
                        }
                    }
                    z3 = z2;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return z3;
    }

    public static float b(DPoint dPoint, List<DPoint> list) {
        float fMax = Float.MIN_VALUE;
        if (dPoint != null && list != null && !list.isEmpty()) {
            Iterator<DPoint> it2 = list.iterator();
            while (it2.hasNext()) {
                fMax = Math.max(fMax, eo.a(dPoint, it2.next()));
            }
        }
        return fMax;
    }

    private static DPoint b(List<DPoint> list) {
        DPoint dPoint = new DPoint();
        if (list == null) {
            return dPoint;
        }
        try {
            double latitude = 0.0d;
            double longitude = 0.0d;
            for (DPoint dPoint2 : list) {
                latitude += dPoint2.getLatitude();
                longitude += dPoint2.getLongitude();
            }
            return new DPoint(eo.b(latitude / ((double) list.size())), eo.b(longitude / ((double) list.size())));
        } catch (Throwable th) {
            ei.a(th, "GeoFenceUtil", "getPolygonCenter");
            return dPoint;
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0203  */
    private void b(int i, Bundle bundle) {
        String str;
        int iA;
        String str2;
        boolean z;
        boolean z2;
        String str3;
        String str4;
        int i2;
        String str5;
        String strA;
        int i3;
        Bundle bundle2 = new Bundle();
        try {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            if (bundle != null) {
                try {
                    if (bundle.isEmpty()) {
                        str5 = "errorCode";
                        i2 = 1;
                    } else {
                        List<GeoFence> arrayList2 = new ArrayList<>();
                        String string = bundle.getString(GeoFence.BUNDLE_KEY_CUSTOMID);
                        String string2 = bundle.getString("keyWords");
                        String string3 = bundle.getString("city");
                        String string4 = bundle.getString("poiType");
                        DPoint dPoint = (DPoint) bundle.getParcelable("centerPoint");
                        int i4 = bundle.getInt("searchSize", 10);
                        float f = bundle.getFloat("aroundRadius", 3000.0f);
                        if (TextUtils.isEmpty(string2)) {
                            str2 = "添加围栏失败";
                            z2 = false;
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    if (dPoint == null) {
                                        str2 = "添加围栏失败";
                                    } else {
                                        try {
                                            if (dPoint.getLatitude() > 90.0d || dPoint.getLatitude() < -90.0d || dPoint.getLongitude() > 180.0d || dPoint.getLongitude() < -180.0d) {
                                                str2 = "添加围栏失败";
                                                a(str2, 0, "经纬度错误，传入的纬度：" + dPoint.getLatitude() + "传入的经度:" + dPoint.getLongitude(), new String[0]);
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            str = "errorCode";
                                            iA = 0;
                                            try {
                                                ei.a(th, "GeoFenceManager", "doAddGeoFenceNearby");
                                                bundle2.putInt(str, 8);
                                                int i5 = 1000;
                                                return;
                                            } finally {
                                                bundle2.putInt(str, iA);
                                                a(1000, bundle2);
                                            }
                                        }
                                    }
                                }
                                str2 = "添加围栏失败";
                            } else {
                                str2 = "添加围栏失败";
                                z = !TextUtils.isEmpty(string4);
                            }
                            z2 = z;
                        }
                        if (z2) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putString(GeoFence.BUNDLE_KEY_CUSTOMID, string);
                            bundle3.putString("pendingIntentAction", this.d);
                            str3 = GeoFence.BUNDLE_KEY_CUSTOMID;
                            str4 = "errorCode";
                            try {
                                bundle3.putLong(Configs.Params.EXPIRATION, -1L);
                                bundle3.putInt("activatesAction", this.f);
                                try {
                                    if (i == 1) {
                                        bundle3.putFloat("fenceRadius", 1000.0f);
                                        strA = this.p.a(this.b, "http://restapi.amap.com/v3/place/text?", string2, string4, string3, String.valueOf(i4));
                                    } else if (i != 2) {
                                        strA = i != 3 ? null : this.p.a(this.b, "http://restapi.amap.com/v3/config/district?", string2);
                                    } else {
                                        double dB = eo.b(dPoint.getLatitude());
                                        double dB2 = eo.b(dPoint.getLongitude());
                                        int iIntValue = Float.valueOf(f).intValue();
                                        bundle3.putFloat("fenceRadius", 200.0f);
                                        strA = this.p.a(this.b, "http://restapi.amap.com/v3/place/around?", string2, string4, String.valueOf(i4), String.valueOf(dB), String.valueOf(dB2), String.valueOf(iIntValue));
                                    }
                                    int i6 = 4;
                                    if (strA == null) {
                                        iA = i6;
                                    } else {
                                        int iA2 = 1 == i ? com.loc.c.a(strA, arrayList2, bundle3) : 0;
                                        if (2 == i) {
                                            iA2 = com.loc.c.a(strA, arrayList2, bundle3);
                                        }
                                        if (3 == i) {
                                            iA2 = this.q.b(strA, arrayList2, bundle3);
                                        }
                                        if (iA2 != 10000) {
                                            if (iA2 != 1 && iA2 != 7 && iA2 != 4 && iA2 != 5 && iA2 != 16 && iA2 != 17) {
                                                switch (iA2) {
                                                    case 10000:
                                                        i3 = 0;
                                                        break;
                                                    case 10001:
                                                    case 10002:
                                                    case 10007:
                                                    case 10008:
                                                    case 10009:
                                                    case 10012:
                                                    case TsmResultCode.ERROR_CARD_DOWNLOAD_FAIL /* 10013 */:
                                                        i3 = 7;
                                                        break;
                                                    case 10003:
                                                    case EngineProcessor.MSG_NEW_ANSWER_RESULT /* 10004 */:
                                                    case 10005:
                                                    case 10006:
                                                    case 10010:
                                                    case 10011:
                                                    case 10014:
                                                    case 10015:
                                                    case 10016:
                                                    case 10017:
                                                        i3 = 4;
                                                        break;
                                                    default:
                                                        switch (iA2) {
                                                            case 20000:
                                                            case 20001:
                                                            case ErrorConstKt.DEVICE_CONNECTING_FAILED /* 20002 */:
                                                                i3 = 1;
                                                                break;
                                                            case ErrorConstKt.DEVICE_DISCONNECT /* 20003 */:
                                                            default:
                                                                i3 = 8;
                                                                break;
                                                        }
                                                        break;
                                                }
                                            } else {
                                                i3 = iA2;
                                            }
                                            if (i3 != 0) {
                                                a(str2, i3, "searchErrCode is " + i3, new String[0]);
                                            }
                                            iA = i3;
                                        } else if (arrayList2.isEmpty()) {
                                            iA = 16;
                                        } else {
                                            iA = a(arrayList2);
                                            if (iA == 0) {
                                                try {
                                                    arrayList.addAll(arrayList2);
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    str = str4;
                                                    ei.a(th, "GeoFenceManager", "doAddGeoFenceNearby");
                                                    bundle2.putInt(str, 8);
                                                    int i7 = 1000;
                                                    return;
                                                }
                                            } else {
                                                i6 = iA;
                                                iA = i6;
                                            }
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    str = str4;
                                    iA = 0;
                                    ei.a(th, "GeoFenceManager", "doAddGeoFenceNearby");
                                    bundle2.putInt(str, 8);
                                    int i8 = 1000;
                                    return;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } else {
                            str3 = GeoFence.BUNDLE_KEY_CUSTOMID;
                            str4 = "errorCode";
                            iA = 1;
                        }
                        bundle2.putString(str3, string);
                        bundle2.putParcelableArrayList("resultList", arrayList);
                        i2 = iA;
                        str5 = str4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } else {
                str5 = "errorCode";
                i2 = 1;
            }
            bundle2.putInt(str5, i2);
            a(1000, bundle2);
        } catch (Throwable th6) {
            th = th6;
            str = "errorCode";
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    private static boolean b(AMapLocation aMapLocation, GeoFence geoFence) {
        boolean z = true;
        try {
            if (a(aMapLocation, geoFence)) {
                if (geoFence.getEnterTime() == -1) {
                    if (geoFence.getStatus() != 1) {
                        geoFence.setEnterTime(eo.b());
                        geoFence.setStatus(1);
                    } else {
                        z = false;
                    }
                } else if (geoFence.getStatus() == 3 || eo.b() - geoFence.getEnterTime() <= 600000) {
                    z = false;
                } else {
                    geoFence.setStatus(3);
                }
            } else if (geoFence.getStatus() != 2) {
                try {
                    geoFence.setStatus(2);
                    geoFence.setEnterTime(-1L);
                } catch (Throwable th) {
                    th = th;
                    ei.a(th, UtilsKt.TAG, "isFenceStatusChanged");
                }
            } else {
                z = false;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
        return z;
    }

    private void k() {
        if (!this.o) {
            this.o = true;
        }
        if (this.n) {
            return;
        }
        try {
            this.h = Looper.myLooper() == null ? new c(this.b.getMainLooper()) : new c();
        } catch (Throwable th) {
            ei.a(th, "GeoFenceManger", "init 1");
        }
        try {
            b bVar = new b("fenceActionThread");
            this.l = bVar;
            bVar.setPriority(5);
            this.l.start();
            this.k = new HandlerC0734a(this.l.getLooper());
        } catch (Throwable th2) {
            ei.a(th2, "GeoFenceManger", "init 2");
        }
        try {
            this.p = new com.loc.b(this.b);
            this.q = new com.loc.c();
            this.u = new AMapLocationClientOption();
            this.r = new AMapLocationClient(this.b);
            this.u.setLocationCacheEnable(true);
            this.u.setNeedAddress(false);
            this.r.setLocationListener(this.w);
            if (this.a == null) {
                this.a = new em();
            }
        } catch (Throwable th3) {
            ei.a(th3, "GeoFenceManger", "initBase");
        }
        this.n = true;
        try {
            String str = this.d;
            if (str != null && this.c == null) {
                a(str);
            }
        } catch (Throwable th4) {
            ei.a(th4, "GeoFenceManger", "init 4");
        }
        if (A) {
            return;
        }
        A = true;
        em.a(this.b, "O020", (JSONObject) null);
    }

    public final PendingIntent a(String str) {
        synchronized (this.z) {
            try {
                Intent intent = new Intent(str);
                intent.setPackage(k.c(this.b));
                this.c = PendingIntent.getBroadcast(this.b, 0, intent, 0);
                this.d = str;
                ArrayList<GeoFence> arrayList = this.g;
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (GeoFence geoFence : this.g) {
                        geoFence.setPendingIntent(this.c);
                        geoFence.setPendingIntentAction(this.d);
                    }
                }
            } catch (Throwable th) {
                ei.a(th, "GeoFenceManager", "createPendingIntent");
            }
        }
        return this.c;
    }

    public final GeoFence a(Bundle bundle, boolean z) {
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
        geoFence.setPendingIntent(this.c);
        StringBuilder sb = new StringBuilder();
        sb.append(com.loc.c.a());
        geoFence.setFenceId(sb.toString());
        em emVar = this.a;
        if (emVar != null) {
            emVar.a(this.b, 2);
        }
        return geoFence;
    }

    public final void a() {
        try {
            this.o = false;
            a(10, (Bundle) null, 0L);
        } catch (Throwable th) {
            ei.a(th, "GeoFenceManager", "removeGeoFence");
        }
    }

    public final void a(int i) {
        try {
            k();
            if (i > 7 || i <= 0) {
                i = 1;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("activatesAction", i);
            a(9, bundle, 0L);
        } catch (Throwable th) {
            ei.a(th, "GeoFenceManager", "setActivateAction");
        }
    }

    public final void a(int i, Bundle bundle) {
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
            ei.a(th, "GeoFenceManager", "sendResultHandlerMessage");
        }
    }

    public final void a(int i, Bundle bundle, long j) {
        try {
            synchronized (this.i) {
                HandlerC0734a handlerC0734a = this.k;
                if (handlerC0734a != null) {
                    Message messageObtainMessage = handlerC0734a.obtainMessage();
                    messageObtainMessage.what = i;
                    messageObtainMessage.setData(bundle);
                    this.k.sendMessageDelayed(messageObtainMessage, j);
                }
            }
        } catch (Throwable th) {
            ei.a(th, "GeoFenceManager", "sendActionHandlerMessage");
        }
    }

    public final void a(Bundle bundle) {
        int i = 1;
        if (bundle != null) {
            try {
                i = bundle.getInt("activatesAction", 1);
            } catch (Throwable th) {
                ei.a(th, "GeoFenceManager", "doSetActivatesAction");
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
            d();
        }
        this.f = i;
    }

    public final void a(GeoFenceListener geoFenceListener) {
        try {
            this.e = geoFenceListener;
        } catch (Throwable unused) {
        }
    }

    public final void a(AMapLocation aMapLocation) {
        ArrayList<GeoFence> arrayList;
        try {
            if (this.y || (arrayList = this.g) == null || arrayList.isEmpty() || aMapLocation == null || aMapLocation.getErrorCode() != 0) {
                return;
            }
            for (GeoFence geoFence : this.g) {
                if (geoFence.isAble() && b(aMapLocation, geoFence) && a(geoFence, this.f)) {
                    geoFence.setCurrentLocation(aMapLocation);
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("geoFence", geoFence);
                    a(1001, bundle);
                }
            }
        } catch (Throwable th) {
            ei.a(th, "GeoFenceManager", "doCheckFence");
        }
    }

    public final void a(DPoint dPoint, float f, String str) {
        try {
            k();
            Bundle bundle = new Bundle();
            bundle.putParcelable("centerPoint", dPoint);
            bundle.putFloat("fenceRadius", f);
            bundle.putString(GeoFence.BUNDLE_KEY_CUSTOMID, str);
            a(0, bundle, 0L);
        } catch (Throwable th) {
            ei.a(th, "GeoFenceManager", "addRoundGeoFence");
        }
    }

    public final void a(String str, String str2) {
        try {
            k();
            Bundle bundle = new Bundle();
            bundle.putString("keyWords", str);
            bundle.putString(GeoFence.BUNDLE_KEY_CUSTOMID, str2);
            a(4, bundle, 0L);
        } catch (Throwable th) {
            ei.a(th, "GeoFenceManager", "addDistricetGeoFence");
        }
    }

    public final void a(String str, String str2, DPoint dPoint, float f, int i, String str3) {
        try {
            k();
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
            ei.a(th, "GeoFenceManager", "addNearbyGeoFence");
        }
    }

    public final void a(String str, String str2, String str3, int i, String str4) {
        try {
            k();
            if (i <= 0) {
                i = 10;
            }
            if (i > 25) {
                i = 25;
            }
            Bundle bundle = new Bundle();
            bundle.putString("keyWords", str);
            bundle.putString("poiType", str2);
            bundle.putString("city", str3);
            bundle.putInt("searchSize", i);
            bundle.putString(GeoFence.BUNDLE_KEY_CUSTOMID, str4);
            a(2, bundle, 0L);
        } catch (Throwable th) {
            ei.a(th, "GeoFenceManager", "addKeywordGeoFence");
        }
    }

    public final void a(String str, boolean z) {
        try {
            k();
            Bundle bundle = new Bundle();
            bundle.putString("fid", str);
            bundle.putBoolean("ab", z);
            a(12, bundle, 0L);
        } catch (Throwable th) {
            ei.a(th, "GeoFenceManager", "setGeoFenceAble");
        }
    }

    public final void a(List<DPoint> list, String str) {
        try {
            k();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("pointList", new ArrayList<>(list));
            bundle.putString(GeoFence.BUNDLE_KEY_CUSTOMID, str);
            a(1, bundle, 0L);
        } catch (Throwable th) {
            ei.a(th, "GeoFenceManager", "addPolygonGeoFence");
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
            ei.a(th, "GeoFenceManager", "removeGeoFence(GeoFence)");
            return false;
        }
    }

    public final int b(GeoFence geoFence) {
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
            ei.a(th, "GeoFenceManager", "addGeoFence2List");
            a("添加围栏失败", 8, th.getMessage(), new String[0]);
            return 8;
        }
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

    public final void b(int i) {
        try {
            synchronized (this.i) {
                HandlerC0734a handlerC0734a = this.k;
                if (handlerC0734a != null) {
                    handlerC0734a.removeMessages(i);
                }
            }
        } catch (Throwable th) {
            ei.a(th, "GeoFenceManager", "removeActionHandlerMessage");
        }
    }

    public final void b(Bundle bundle) {
        b(2, bundle);
    }

    public final void c() {
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
            try {
                synchronized (this.i) {
                    HandlerC0734a handlerC0734a = this.k;
                    if (handlerC0734a != null) {
                        handlerC0734a.removeCallbacksAndMessages(null);
                    }
                    this.k = null;
                }
            } catch (Throwable th) {
                ei.a(th, "GeoFenceManager", "destroyActionHandler");
            }
            AMapLocationClient aMapLocationClient = this.r;
            if (aMapLocationClient != null) {
                aMapLocationClient.stopLocation();
                this.r.onDestroy();
            }
            this.r = null;
            b bVar = this.l;
            if (bVar != null) {
                if (Build.VERSION.SDK_INT >= 18) {
                    bVar.quitSafely();
                } else {
                    bVar.quit();
                }
            }
            this.l = null;
            this.p = null;
            synchronized (this.z) {
                PendingIntent pendingIntent = this.c;
                if (pendingIntent != null) {
                    pendingIntent.cancel();
                }
                this.c = null;
            }
            try {
                synchronized (this.j) {
                    c cVar = this.h;
                    if (cVar != null) {
                        cVar.removeCallbacksAndMessages(null);
                    }
                    this.h = null;
                }
            } catch (Throwable th2) {
                ei.a(th2, "GeoFenceManager", "destroyResultHandler");
            }
            em emVar = this.a;
            if (emVar != null) {
                emVar.b(this.b);
            }
        } catch (Throwable unused) {
        }
        this.m = false;
        this.n = false;
    }

    public final void c(int i) {
        try {
            if (this.b != null) {
                synchronized (this.z) {
                    if (this.c == null) {
                        return;
                    }
                    Intent intent = new Intent();
                    intent.putExtras(a((GeoFence) null, (String) null, (String) null, 4, i));
                    this.c.send(this.b, 0, intent);
                }
            }
        } catch (Throwable th) {
            ei.a(th, "GeoFenceManager", "resultRemindLocationError");
        }
    }

    public final void c(Bundle bundle) {
        b(1, bundle);
    }

    public final void c(GeoFence geoFence) {
        PendingIntent pendingIntent;
        Context context;
        try {
            synchronized (this.z) {
                if (this.b != null) {
                    if (this.c == null && geoFence.getPendingIntent() == null) {
                        return;
                    }
                    Intent intent = new Intent();
                    intent.putExtras(a(geoFence, geoFence.getFenceId(), geoFence.getCustomId(), geoFence.getStatus(), 0));
                    String str = this.d;
                    if (str != null) {
                        intent.setAction(str);
                    }
                    intent.setPackage(k.c(this.b));
                    if (geoFence.getPendingIntent() != null) {
                        pendingIntent = geoFence.getPendingIntent();
                        context = this.b;
                    } else {
                        pendingIntent = this.c;
                        context = this.b;
                    }
                    pendingIntent.send(context, 0, intent);
                }
            }
        } catch (Throwable th) {
            ei.a(th, "GeoFenceManager", "resultTriggerGeoFence");
        }
    }

    public final void d() {
        if (this.y || this.k == null) {
            return;
        }
        boolean z = false;
        if (this.s != null && eo.a(this.s) && eo.b() - this.t < 10000) {
            z = true;
        }
        if (z) {
            a(6, (Bundle) null, 0L);
            a(5, (Bundle) null, 0L);
        } else {
            b(7);
            a(7, (Bundle) null, 0L);
        }
    }

    public final void d(Bundle bundle) {
        b(3, bundle);
    }

    public final void e() {
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

    public final void e(Bundle bundle) {
        if (bundle != null) {
            try {
                if (bundle.isEmpty()) {
                    return;
                }
                String string = bundle.getString("fid");
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                boolean z = true;
                boolean z2 = bundle.getBoolean("ab", true);
                ArrayList<GeoFence> arrayList = this.g;
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (GeoFence geoFence : this.g) {
                        if (geoFence.getFenceId().equals(string)) {
                            geoFence.setAble(z2);
                            break;
                        }
                    }
                }
                if (z2) {
                    d();
                    return;
                }
                ArrayList<GeoFence> arrayList2 = this.g;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    Iterator<GeoFence> it2 = this.g.iterator();
                    while (it2.hasNext()) {
                        if (it2.next().isAble()) {
                            z = false;
                            break;
                        }
                    }
                }
                if (z) {
                    h();
                }
            } catch (Throwable th) {
                ei.a(th, "GeoFenceManager", "doSetGeoFenceAble");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0092  */
    /* JADX WARN: Code duplicated, block: B:38:0x0099 A[Catch: all -> 0x00d7, TryCatch #0 {all -> 0x00d7, blocks: (B:2:0x0000, B:5:0x0005, B:8:0x000e, B:10:0x0017, B:13:0x001f, B:15:0x0025, B:16:0x0039, B:18:0x003f, B:20:0x004b, B:22:0x005b, B:38:0x0099, B:42:0x00b8, B:44:0x00c4, B:25:0x0065, B:27:0x006d, B:28:0x0077, B:30:0x007f), top: B:49:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b8 A[Catch: all -> 0x00d7, TryCatch #0 {all -> 0x00d7, blocks: (B:2:0x0000, B:5:0x0005, B:8:0x000e, B:10:0x0017, B:13:0x001f, B:15:0x0025, B:16:0x0039, B:18:0x003f, B:20:0x004b, B:22:0x005b, B:38:0x0099, B:42:0x00b8, B:44:0x00c4, B:25:0x0065, B:27:0x006d, B:28:0x0077, B:30:0x007f), top: B:49:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4 A[Catch: all -> 0x00d7, TRY_LEAVE, TryCatch #0 {all -> 0x00d7, blocks: (B:2:0x0000, B:5:0x0005, B:8:0x000e, B:10:0x0017, B:13:0x001f, B:15:0x0025, B:16:0x0039, B:18:0x003f, B:20:0x004b, B:22:0x005b, B:38:0x0099, B:42:0x00b8, B:44:0x00c4, B:25:0x0065, B:27:0x006d, B:28:0x0077, B:30:0x007f), top: B:49:0x0000 }] */
    public final void f() {
        float fMin;
        float f;
        try {
            if (!this.y && eo.a(this.s)) {
                AMapLocation aMapLocation = this.s;
                ArrayList<GeoFence> arrayList = this.g;
                if (aMapLocation != null && aMapLocation.getErrorCode() == 0 && arrayList != null && !arrayList.isEmpty()) {
                    DPoint dPoint = new DPoint(aMapLocation.getLatitude(), aMapLocation.getLongitude());
                    Iterator<GeoFence> it2 = arrayList.iterator();
                    fMin = Float.MAX_VALUE;
                    while (true) {
                        if (it2.hasNext()) {
                            GeoFence next = it2.next();
                            if (next.isAble()) {
                                float fA = eo.a(dPoint, next.getCenter());
                                if (fA > next.getMinDis2Center() && fA < next.getMaxDis2Center()) {
                                    f = 0.0f;
                                    break;
                                }
                                if (fA > next.getMaxDis2Center()) {
                                    fMin = Math.min(fMin, fA - next.getMaxDis2Center());
                                }
                                if (fA < next.getMinDis2Center()) {
                                    fMin = Math.min(fMin, next.getMinDis2Center() - fA);
                                }
                            }
                        }
                    }
                    if (f == Float.MAX_VALUE) {
                        return;
                    }
                    if (f < 1000.0f) {
                        b(7);
                        Bundle bundle = new Bundle();
                        bundle.putLong("interval", 2000L);
                        a(8, bundle, 500L);
                        return;
                    }
                    if (f < 5000.0f) {
                        e();
                        b(7);
                        a(7, (Bundle) null, 10000L);
                    } else {
                        e();
                        b(7);
                        a(7, (Bundle) null, (long) (((f - 4000.0f) / 100.0f) * 1000.0f));
                    }
                }
                fMin = Float.MAX_VALUE;
                f = fMin;
                if (f == Float.MAX_VALUE) {
                    return;
                }
                if (f < 1000.0f) {
                    b(7);
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("interval", 2000L);
                    a(8, bundle2, 500L);
                    return;
                }
                if (f < 5000.0f) {
                    e();
                    b(7);
                    a(7, (Bundle) null, 10000L);
                } else {
                    e();
                    b(7);
                    a(7, (Bundle) null, (long) (((f - 4000.0f) / 100.0f) * 1000.0f));
                }
            }
        } catch (Throwable th) {
            ei.a(th, "GeoFenceManager", "doCheckLocationPolicy");
        }
    }

    public final void f(Bundle bundle) {
        try {
            if (this.g != null) {
                GeoFence geoFence = (GeoFence) bundle.getParcelable("fc");
                if (this.g.contains(geoFence)) {
                    this.g.remove(geoFence);
                }
                if (this.g.size() <= 0) {
                    c();
                } else {
                    d();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void g() {
        try {
            k();
            this.y = true;
            a(13, (Bundle) null, 0L);
        } catch (Throwable th) {
            ei.a(th, "GeoFenceManager", "pauseGeoFence");
        }
    }

    public final void h() {
        try {
            b(7);
            b(8);
            AMapLocationClient aMapLocationClient = this.r;
            if (aMapLocationClient != null) {
                aMapLocationClient.stopLocation();
            }
            this.m = false;
        } catch (Throwable th) {
            ei.a(th, "GeoFenceManager", "doPauseGeoFence");
        }
    }

    public final void i() {
        try {
            k();
            if (this.y) {
                this.y = false;
                d();
            }
        } catch (Throwable th) {
            ei.a(th, "GeoFenceManager", "resumeGeoFence");
        }
    }

    public final boolean j() {
        return this.y;
    }
}
