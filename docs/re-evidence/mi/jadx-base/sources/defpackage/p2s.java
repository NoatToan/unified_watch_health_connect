package defpackage;

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
import com.amap.api.fence.GeoFence;
import com.amap.api.fence.GeoFenceListener;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.location.DPoint;
import com.autonavi.aps.amapapi.utils.i;
import com.autonavi.aps.amapapi.utils.k;
import com.miui.tsmclient.model.ErrorCode;
import com.miui.tsmclient.model.mitsm.h;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.accountsdk.account.ServerErrorCode;
import com.xiaomi.fitness.access.misport.MiSportImportUtilKt;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import miuix.preference.flexible.PreferenceMarkLevel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"NewApi"})
public final class p2s {
    public static boolean A = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f29943b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f29942a = null;
    public PendingIntent c = null;
    public String d = null;
    public GeoFenceListener e = null;
    public Object f = new Object();
    public volatile int g = 1;
    public ArrayList<GeoFence> h = new ArrayList<>();
    public d i = null;
    public Object j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f29944k = new Object();
    public b l = null;
    public c m = null;
    public volatile boolean n = false;
    public volatile boolean o = false;
    public volatile boolean p = false;
    public l9s q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public jes f29945r = null;
    public AMapLocationClient s = null;
    public volatile AMapLocation t = null;
    public long u = 0;
    public AMapLocationClientOption v = null;
    public int w = 0;
    public AMapLocationListener x = new a();
    public final int y = 3;
    public volatile boolean z = false;

    public class a implements AMapLocationListener {
        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:17:0x005e A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:2:0x0000, B:5:0x0007, B:8:0x000e, B:10:0x001b, B:12:0x0025, B:17:0x005e, B:19:0x0067, B:21:0x0072, B:22:0x0084, B:24:0x008e, B:13:0x0035), top: B:27:0x0000 }] */
        /* JADX WARN: Code duplicated, block: B:19:0x0067 A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:2:0x0000, B:5:0x0007, B:8:0x000e, B:10:0x001b, B:12:0x0025, B:17:0x005e, B:19:0x0067, B:21:0x0072, B:22:0x0084, B:24:0x008e, B:13:0x0035), top: B:27:0x0000 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x0072 A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:2:0x0000, B:5:0x0007, B:8:0x000e, B:10:0x001b, B:12:0x0025, B:17:0x005e, B:19:0x0067, B:21:0x0072, B:22:0x0084, B:24:0x008e, B:13:0x0035), top: B:27:0x0000 }] */
        /* JADX WARN: Code duplicated, block: B:24:0x008e A[Catch: all -> 0x009a, TRY_LEAVE, TryCatch #0 {all -> 0x009a, blocks: (B:2:0x0000, B:5:0x0007, B:8:0x000e, B:10:0x001b, B:12:0x0025, B:17:0x005e, B:19:0x0067, B:21:0x0072, B:22:0x0084, B:24:0x008e, B:13:0x0035), top: B:27:0x0000 }] */
        /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
        @Override // com.amap.api.location.AMapLocationListener
        public final void onLocationChanged(AMapLocation aMapLocation) {
            int errorCode;
            boolean z;
            Bundle bundle;
            int i;
            try {
                if (!p2s.this.z && p2s.this.p) {
                    p2s.this.t = aMapLocation;
                    if (aMapLocation != null) {
                        errorCode = aMapLocation.getErrorCode();
                        if (aMapLocation.getErrorCode() == 0) {
                            p2s.this.u = k.b();
                            p2s.this.j(5, null, 0L);
                            z = true;
                        } else {
                            p2s.p("定位失败", aMapLocation.getErrorCode(), aMapLocation.getErrorInfo(), "locationDetail:" + aMapLocation.getLocationDetail());
                        }
                        if (z) {
                            p2s p2sVar = p2s.this;
                            p2sVar.w = 0;
                            p2sVar.j(6, null, 0L);
                            return;
                        }
                        bundle = new Bundle();
                        if (!p2s.this.n) {
                            p2s.this.D(7);
                            bundle.putLong("interval", VibrateModeProgressBar.sLongToLong);
                            p2s.this.j(8, bundle, VibrateModeProgressBar.sLongToLong);
                        }
                        p2s p2sVar2 = p2s.this;
                        i = p2sVar2.w + 1;
                        p2sVar2.w = i;
                        if (i >= 3) {
                            bundle.putInt(GeoFence.BUNDLE_KEY_LOCERRORCODE, errorCode);
                            p2s.this.i(1002, bundle);
                        }
                    }
                    errorCode = 8;
                    z = false;
                    if (z) {
                        p2s p2sVar3 = p2s.this;
                        p2sVar3.w = 0;
                        p2sVar3.j(6, null, 0L);
                        return;
                    }
                    bundle = new Bundle();
                    if (!p2s.this.n) {
                        p2s.this.D(7);
                        bundle.putLong("interval", VibrateModeProgressBar.sLongToLong);
                        p2s.this.j(8, bundle, VibrateModeProgressBar.sLongToLong);
                    }
                    p2s p2sVar4 = p2s.this;
                    i = p2sVar4.w + 1;
                    p2sVar4.w = i;
                    if (i >= 3) {
                        bundle.putInt(GeoFence.BUNDLE_KEY_LOCERRORCODE, errorCode);
                        p2s.this.i(1002, bundle);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            try {
                switch (message.what) {
                    case 0:
                        p2s.this.F(message.getData());
                        break;
                    case 1:
                        p2s.this.M(message.getData());
                        break;
                    case 2:
                        p2s.this.S(message.getData());
                        break;
                    case 3:
                        p2s.this.P(message.getData());
                        break;
                    case 4:
                        p2s.this.U(message.getData());
                        break;
                    case 5:
                        p2s.this.R();
                        break;
                    case 6:
                        p2s p2sVar = p2s.this;
                        p2sVar.m(p2sVar.t);
                        break;
                    case 7:
                        p2s.this.O();
                        break;
                    case 8:
                        p2s.this.c0(message.getData());
                        break;
                    case 9:
                        p2s.this.k(message.getData());
                        break;
                    case 10:
                        p2s.this.K();
                        break;
                    case 11:
                        p2s.this.Y(message.getData());
                        break;
                    case 12:
                        p2s.this.W(message.getData());
                        break;
                    case 13:
                        p2s.this.V();
                        break;
                    default:
                        break;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static class c extends HandlerThread {
        public c(String str) {
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

    public p2s(Context context) {
        this.f29943b = null;
        try {
            this.f29943b = context.getApplicationContext();
            b0();
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManger", "<init>");
        }
    }

    public static float A(DPoint dPoint, List<DPoint> list) {
        float fMax = Float.MIN_VALUE;
        if (dPoint != null && list != null && !list.isEmpty()) {
            Iterator<DPoint> it = list.iterator();
            while (it.hasNext()) {
                fMax = Math.max(fMax, k.a(dPoint, it.next()));
            }
        }
        return fMax;
    }

    public static DPoint B(List<DPoint> list) {
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
            return new DPoint(k.b(latitude / ((double) list.size())), k.b(longitude / ((double) list.size())));
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceUtil", "getPolygonCenter");
            return dPoint;
        }
    }

    public static boolean H(AMapLocation aMapLocation, GeoFence geoFence) {
        boolean z = false;
        try {
            if (y(aMapLocation, geoFence)) {
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
                    z = true;
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    com.autonavi.aps.amapapi.utils.c.a(th, "Utils", "isFenceStatusChanged");
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return z;
    }

    public static boolean I(AMapLocation aMapLocation, List<DPoint> list) {
        if (list.size() < 3) {
            return false;
        }
        return com.autonavi.aps.amapapi.utils.c.a(new DPoint(aMapLocation.getLatitude(), aMapLocation.getLongitude()), list);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x001d A[PHI: r2
      0x001d: PHI (r2v3 int) = (r2v2 int), (r2v4 int) binds: [B:14:0x0015, B:16:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    public static int N(int i) {
        if (i != 1) {
            int i2 = 7;
            if (i != 7 && i != 4 && i != 5 && i != 16 && i != 17) {
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
                        i = i2;
                        break;
                    case 10003:
                    case 10004:
                    case 10005:
                    case 10006:
                    case 10010:
                    case MiSportImportUtilKt.REQUEST_CODE /* 10011 */:
                    case h.v /* 10014 */:
                    case 10015:
                    case ServerErrorCode.ERROR_LACK_OF_PARAM /* 10016 */:
                    case ServerErrorCode.ERROR_ILLEGAL_PARAM /* 10017 */:
                        i = 4;
                        break;
                    default:
                        i2 = 8;
                        switch (i) {
                            case ErrorCode.ERROR_CODE_INVALID_PARAM /* 20000 */:
                            case PreferenceMarkLevel.LEVEL_LARGE_ONLY_TITLE /* 20001 */:
                            case PreferenceMarkLevel.LEVEL_LARGE_ONLY_SUMMARY /* 20002 */:
                                i = 1;
                                break;
                            case 20003:
                            default:
                                i = i2;
                                break;
                        }
                        break;
                }
            }
        }
        if (i != 0) {
            p("添加围栏失败", i, "searchErrCode is ".concat(String.valueOf(i)), new String[0]);
        }
        return i;
    }

    public static float a(AMapLocation aMapLocation, List<GeoFence> list) {
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

    public static float b(DPoint dPoint, List<DPoint> list) {
        float fMin = Float.MAX_VALUE;
        if (dPoint != null && list != null && !list.isEmpty()) {
            Iterator<DPoint> it = list.iterator();
            while (it.hasNext()) {
                fMin = Math.min(fMin, k.a(dPoint, it.next()));
            }
        }
        return fMin;
    }

    public static Bundle e(GeoFence geoFence, String str, String str2, int i, int i2) {
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

    public static void p(String str, int i, String str2, String... strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("===========================================\n");
        stringBuffer.append("              " + str + "                ");
        stringBuffer.append("\n");
        stringBuffer.append("-------------------------------------------\n");
        stringBuffer.append("errorCode:".concat(String.valueOf(i)));
        stringBuffer.append("\n");
        stringBuffer.append("错误信息:".concat(String.valueOf(str2)));
        stringBuffer.append("\n");
        if (strArr.length > 0) {
            for (String str3 : strArr) {
                stringBuffer.append(str3);
                stringBuffer.append("\n");
            }
        }
        stringBuffer.append("===========================================\n");
    }

    public static boolean v(int i, String str, String str2, DPoint dPoint) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (i != 1) {
            if (i == 2) {
                if (dPoint == null) {
                    return false;
                }
                if (dPoint.getLatitude() > 90.0d || dPoint.getLatitude() < -90.0d || dPoint.getLongitude() > 180.0d || dPoint.getLongitude() < -180.0d) {
                    p("添加围栏失败", 0, "经纬度错误，传入的纬度：" + dPoint.getLatitude() + "传入的经度:" + dPoint.getLongitude(), new String[0]);
                    return false;
                }
            }
        } else if (TextUtils.isEmpty(str2)) {
            return false;
        }
        return true;
    }

    public static boolean x(GeoFence geoFence, int i) {
        boolean z = false;
        if ((i & 1) == 1) {
            try {
                if (geoFence.getStatus() == 1) {
                    z = true;
                }
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "Utils", "remindStatus");
                return z;
            }
        }
        if ((i & 2) == 2 && geoFence.getStatus() == 2) {
            z = true;
        }
        return ((i & 4) == 4 && geoFence.getStatus() == 3) ? true : z;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0029 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:3:0x0001, B:6:0x0009, B:8:0x000f, B:10:0x0019, B:18:0x0029, B:19:0x0031, B:21:0x0037, B:26:0x0047), top: B:32:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0037 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:3:0x0001, B:6:0x0009, B:8:0x000f, B:10:0x0019, B:18:0x0029, B:19:0x0031, B:21:0x0037, B:26:0x0047), top: B:32:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0047 A[Catch: all -> 0x0045, TRY_LEAVE, TryCatch #0 {all -> 0x0045, blocks: (B:3:0x0001, B:6:0x0009, B:8:0x000f, B:10:0x0019, B:18:0x0029, B:19:0x0031, B:21:0x0037, B:26:0x0047), top: B:32:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    public static boolean y(AMapLocation aMapLocation, GeoFence geoFence) {
        Iterator<List<DPoint>> it;
        boolean z = false;
        try {
            if (k.a(aMapLocation) && geoFence != null && geoFence.getPointList() != null && !geoFence.getPointList().isEmpty()) {
                int type = geoFence.getType();
                if (type == 0) {
                    if (z(aMapLocation, geoFence.getCenter(), geoFence.getRadius())) {
                        return true;
                    }
                } else if (type == 1) {
                    it = geoFence.getPointList().iterator();
                    while (it.hasNext()) {
                        if (I(aMapLocation, it.next())) {
                            z = true;
                        }
                    }
                } else if (type != 2) {
                    if (type == 3) {
                        it = geoFence.getPointList().iterator();
                        while (it.hasNext()) {
                            if (I(aMapLocation, it.next())) {
                                z = true;
                            }
                        }
                    }
                } else if (z(aMapLocation, geoFence.getCenter(), geoFence.getRadius())) {
                    return true;
                }
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "Utils", "isInGeoFence");
        }
        return z;
    }

    public static boolean z(AMapLocation aMapLocation, DPoint dPoint, float f) {
        return k.a(new double[]{dPoint.getLatitude(), dPoint.getLongitude(), aMapLocation.getLatitude(), aMapLocation.getLongitude()}) <= f;
    }

    public final List<GeoFence> C() {
        try {
            if (this.h == null) {
                this.h = new ArrayList<>();
            }
            return (ArrayList) this.h.clone();
        } catch (Throwable unused) {
            return new ArrayList();
        }
    }

    public final void D(int i) {
        try {
            synchronized (this.j) {
                try {
                    b bVar = this.l;
                    if (bVar != null) {
                        bVar.removeMessages(i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            com.autonavi.aps.amapapi.utils.c.a(th2, "GeoFenceManager", "removeActionHandlerMessage");
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0153  */
    public final void E(int i, Bundle bundle) {
        String str;
        int iC;
        int i2;
        int i3;
        String strB;
        int iN;
        String str2 = "errorCode";
        Bundle bundle2 = new Bundle();
        try {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            if (bundle != null) {
                try {
                    if (bundle.isEmpty()) {
                        str2 = "errorCode";
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
                        if (v(i, string2, string4, dPoint)) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putString(GeoFence.BUNDLE_KEY_CUSTOMID, string);
                            bundle3.putString("pendingIntentAction", this.d);
                            bundle3.putLong("expiration", -1L);
                            bundle3.putInt("activatesAction", this.g);
                            try {
                                if (i == 1) {
                                    i3 = 3;
                                    bundle3.putFloat("fenceRadius", 1000.0f);
                                    strB = this.q.b(this.f29943b, "http://restsdk.amap.com/v3/place/text?", string2, string4, string3, String.valueOf(i4));
                                } else if (i != 2) {
                                    strB = i != 3 ? null : this.q.a(this.f29943b, "http://restsdk.amap.com/v3/config/district?", string2);
                                    i3 = 3;
                                } else {
                                    double dB = k.b(dPoint.getLatitude());
                                    double dB2 = k.b(dPoint.getLongitude());
                                    int iIntValue = Float.valueOf(f).intValue();
                                    bundle3.putFloat("fenceRadius", 200.0f);
                                    strB = this.q.c(this.f29943b, "http://restsdk.amap.com/v3/place/around?", string2, string4, String.valueOf(i4), String.valueOf(dB), String.valueOf(dB2), String.valueOf(iIntValue));
                                    i3 = 3;
                                }
                                if (strB != null) {
                                    int iB = 1 == i ? jes.b(strB, arrayList2, bundle3) : 0;
                                    if (2 == i) {
                                        iB = jes.e(strB, arrayList2, bundle3);
                                    }
                                    if (i3 == i) {
                                        iB = this.f29945r.f(strB, arrayList2, bundle3);
                                    }
                                    if (iB != 10000) {
                                        iN = N(iB);
                                    } else if (arrayList2.isEmpty()) {
                                        iN = 16;
                                    } else {
                                        iC = c(arrayList2);
                                        if (iC == 0) {
                                            try {
                                                arrayList.addAll(arrayList2);
                                            } catch (Throwable th) {
                                                th = th;
                                                str = str2;
                                                try {
                                                    com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "doAddGeoFenceNearby");
                                                    bundle2.putInt(str, 8);
                                                    int i5 = 1000;
                                                    return;
                                                } finally {
                                                    bundle2.putInt(str, iC);
                                                    i(1000, bundle2);
                                                }
                                            }
                                        }
                                    }
                                    iC = iN;
                                } else {
                                    iC = 4;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                str = "errorCode";
                                iC = 0;
                                com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "doAddGeoFenceNearby");
                                bundle2.putInt(str, 8);
                                int i6 = 1000;
                                return;
                            }
                        } else {
                            str2 = "errorCode";
                            iC = 1;
                        }
                        bundle2.putString(GeoFence.BUNDLE_KEY_CUSTOMID, string);
                        bundle2.putParcelableArrayList("resultList", arrayList);
                        i2 = iC;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                str2 = "errorCode";
                i2 = 1;
            }
            bundle2.putInt(str2, i2);
            i(1000, bundle2);
        } catch (Throwable th4) {
            th = th4;
            str = "errorCode";
        }
    }

    public final void F(Bundle bundle) {
        String string;
        try {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            String str = "";
            int iJ = 1;
            if (bundle == null || bundle.isEmpty()) {
                string = str;
            } else {
                DPoint dPoint = (DPoint) bundle.getParcelable("centerPoint");
                string = bundle.getString(GeoFence.BUNDLE_KEY_CUSTOMID);
                if (dPoint == null) {
                    str = string;
                    string = str;
                } else if (dPoint.getLatitude() > 90.0d || dPoint.getLatitude() < -90.0d || dPoint.getLongitude() > 180.0d || dPoint.getLongitude() < -180.0d) {
                    p("添加围栏失败", 1, "经纬度错误，传入的纬度：" + dPoint.getLatitude() + "传入的经度:" + dPoint.getLongitude(), new String[0]);
                } else {
                    GeoFence geoFenceF = f(bundle, false);
                    iJ = J(geoFenceF);
                    if (iJ == 0) {
                        arrayList.add(geoFenceF);
                    }
                }
            }
            Bundle bundle2 = new Bundle();
            bundle2.putInt("errorCode", iJ);
            bundle2.putParcelableArrayList("resultList", arrayList);
            bundle2.putString(GeoFence.BUNDLE_KEY_CUSTOMID, string);
            i(1000, bundle2);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "doAddGeoFenceRound");
        }
    }

    public final void G(GeoFence geoFence) {
        try {
            synchronized (this.f) {
                try {
                    if (this.f29943b != null) {
                        if (this.c == null && geoFence.getPendingIntent() == null) {
                            return;
                        }
                        Intent intent = new Intent();
                        intent.putExtras(e(geoFence, geoFence.getFenceId(), geoFence.getCustomId(), geoFence.getStatus(), 0));
                        String str = this.d;
                        if (str != null) {
                            intent.setAction(str);
                        }
                        intent.setPackage(e0t.g(this.f29943b));
                        if (geoFence.getPendingIntent() != null) {
                            geoFence.getPendingIntent().send(this.f29943b, 0, intent);
                        } else {
                            this.c.send(this.f29943b, 0, intent);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            com.autonavi.aps.amapapi.utils.c.a(th2, "GeoFenceManager", "resultTriggerGeoFence");
        }
    }

    public final int J(GeoFence geoFence) {
        try {
            if (this.h == null) {
                this.h = new ArrayList<>();
            }
            if (this.h.contains(geoFence)) {
                return 17;
            }
            this.h.add(geoFence);
            return 0;
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "addGeoFence2List");
            p("添加围栏失败", 8, th.getMessage(), new String[0]);
            return 8;
        }
    }

    public final void K() {
        try {
            if (!this.o) {
                return;
            }
            ArrayList<GeoFence> arrayList = this.h;
            if (arrayList != null) {
                arrayList.clear();
                this.h = null;
            }
            if (this.p) {
                return;
            }
            f0();
            AMapLocationClient aMapLocationClient = this.s;
            if (aMapLocationClient != null) {
                aMapLocationClient.stopLocation();
                this.s.onDestroy();
            }
            this.s = null;
            c cVar = this.m;
            if (cVar != null) {
                cVar.quitSafely();
            }
            this.m = null;
            this.q = null;
            synchronized (this.f) {
                try {
                    PendingIntent pendingIntent = this.c;
                    if (pendingIntent != null) {
                        pendingIntent.cancel();
                    }
                    this.c = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            e0();
            i iVar = this.f29942a;
            if (iVar != null) {
                iVar.b(this.f29943b);
            }
        } catch (Throwable unused) {
        }
        this.n = false;
        this.o = false;
    }

    public final void L(int i) {
        try {
            if (this.f29943b != null) {
                synchronized (this.f) {
                    try {
                        if (this.c == null) {
                            return;
                        }
                        Intent intent = new Intent();
                        intent.putExtras(e(null, null, null, 4, i));
                        this.c.send(this.f29943b, 0, intent);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (Throwable th2) {
            com.autonavi.aps.amapapi.utils.c.a(th2, "GeoFenceManager", "resultRemindLocationError");
        }
    }

    public final void M(Bundle bundle) {
        GeoFence geoFenceF;
        try {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            String str = "";
            int iJ = 1;
            if (bundle != null && !bundle.isEmpty()) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("pointList");
                String string = bundle.getString(GeoFence.BUNDLE_KEY_CUSTOMID);
                if (parcelableArrayList != null && parcelableArrayList.size() > 2 && (iJ = J((geoFenceF = f(bundle, true)))) == 0) {
                    arrayList.add(geoFenceF);
                }
                str = string;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString(GeoFence.BUNDLE_KEY_CUSTOMID, str);
            bundle2.putInt("errorCode", iJ);
            bundle2.putParcelableArrayList("resultList", arrayList);
            i(1000, bundle2);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "doAddGeoFencePolygon");
        }
    }

    public final void O() {
        try {
            if (this.s != null) {
                h0();
                this.v.setLocationCacheEnable(true);
                this.v.setNeedAddress(false);
                this.v.setOnceLocation(true);
                this.s.setLocationOption(this.v);
                this.s.startLocation();
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "doStartOnceLocation");
        }
    }

    public final void P(Bundle bundle) {
        E(2, bundle);
    }

    public final void Q(GeoFence geoFence) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("geoFence", geoFence);
        i(1001, bundle);
    }

    public final void R() {
        try {
            if (!this.z && k.a(this.t)) {
                float fA = a(this.t, this.h);
                if (fA == Float.MAX_VALUE) {
                    return;
                }
                if (fA < 1000.0f) {
                    D(7);
                    Bundle bundle = new Bundle();
                    bundle.putLong("interval", VibrateModeProgressBar.sLongToLong);
                    j(8, bundle, 500L);
                    return;
                }
                if (fA < 5000.0f) {
                    h0();
                    D(7);
                    j(7, null, 10000L);
                } else {
                    h0();
                    D(7);
                    j(7, null, (long) (((fA - 4000.0f) / 100.0f) * 1000.0f));
                }
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "doCheckLocationPolicy");
        }
    }

    public final void S(Bundle bundle) {
        E(1, bundle);
    }

    public final void T() {
        try {
            b0();
            this.z = true;
            j(13, null, 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "pauseGeoFence");
        }
    }

    public final void U(Bundle bundle) {
        E(3, bundle);
    }

    public final void V() {
        try {
            D(7);
            D(8);
            AMapLocationClient aMapLocationClient = this.s;
            if (aMapLocationClient != null) {
                aMapLocationClient.stopLocation();
            }
            this.n = false;
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "doPauseGeoFence");
        }
    }

    public final void W(Bundle bundle) {
        if (bundle != null) {
            try {
                if (bundle.isEmpty()) {
                    return;
                }
                String string = bundle.getString(Constants.KEY_FID);
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                boolean z = bundle.getBoolean("ab", true);
                ArrayList<GeoFence> arrayList = this.h;
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (GeoFence geoFence : this.h) {
                        if (geoFence.getFenceId().equals(string)) {
                            geoFence.setAble(z);
                            break;
                        }
                    }
                }
                if (z) {
                    g0();
                } else if (d0()) {
                    V();
                }
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "doSetGeoFenceAble");
            }
        }
    }

    public final void X() {
        try {
            b0();
            if (this.z) {
                this.z = false;
                g0();
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "resumeGeoFence");
        }
    }

    public final void Y(Bundle bundle) {
        try {
            if (this.h != null) {
                GeoFence geoFence = (GeoFence) bundle.getParcelable("fc");
                if (this.h.contains(geoFence)) {
                    this.h.remove(geoFence);
                }
                if (this.h.size() <= 0) {
                    K();
                } else {
                    g0();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void Z(Bundle bundle) {
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
                    g0();
                }
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "resultAddGeoFenceFinished");
            }
        }
    }

    public final boolean a0() {
        return this.z;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002c -> B:39:0x0031). Please report as a decompilation issue!!! */
    public final void b0() {
        if (!this.p) {
            this.p = true;
        }
        if (this.o) {
            return;
        }
        try {
            if (Looper.myLooper() == null) {
                this.i = new d(this.f29943b.getMainLooper());
            } else {
                this.i = new d();
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManger", "init 1");
        }
        try {
            c cVar = new c("fenceActionThread");
            this.m = cVar;
            cVar.setPriority(5);
            this.m.start();
            this.l = new b(this.m.getLooper());
        } catch (Throwable th2) {
            com.autonavi.aps.amapapi.utils.c.a(th2, "GeoFenceManger", "init 2");
        }
        try {
            this.q = new l9s(this.f29943b);
            this.f29945r = new jes();
            this.v = new AMapLocationClientOption();
            AMapLocationClient aMapLocationClient = new AMapLocationClient(this.f29943b);
            this.s = aMapLocationClient;
            aMapLocationClient.setLocationListener(this.x);
            if (this.f29942a == null) {
                this.f29942a = new i();
            }
        } catch (Throwable th3) {
            com.autonavi.aps.amapapi.utils.c.a(th3, "GeoFenceManger", "initBase");
        }
        this.o = true;
        try {
            String str = this.d;
            if (str != null && this.c == null) {
                d(str);
            }
        } catch (Throwable th4) {
            com.autonavi.aps.amapapi.utils.c.a(th4, "GeoFenceManger", "init 4");
        }
        if (A) {
            return;
        }
        A = true;
        i.a(this.f29943b, "O020", (JSONObject) null);
    }

    public final int c(List<GeoFence> list) {
        try {
            if (this.h == null) {
                this.h = new ArrayList<>();
            }
            Iterator<GeoFence> it = list.iterator();
            while (it.hasNext()) {
                J(it.next());
            }
            return 0;
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "addGeoFenceList");
            p("添加围栏失败", 8, th.getMessage(), new String[0]);
            return 8;
        }
    }

    public final void c0(Bundle bundle) {
        try {
            if (this.s != null) {
                long j = VibrateModeProgressBar.sLongToLong;
                if (bundle != null && !bundle.isEmpty()) {
                    j = bundle.getLong("interval", VibrateModeProgressBar.sLongToLong);
                }
                this.v.setOnceLocation(false);
                this.v.setInterval(j);
                this.v.setLocationCacheEnable(true);
                this.v.setNeedAddress(false);
                this.s.setLocationOption(this.v);
                if (this.n) {
                    return;
                }
                this.s.stopLocation();
                this.s.startLocation();
                this.n = true;
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "doStartContinueLocation");
        }
    }

    public final PendingIntent d(String str) {
        synchronized (this.f) {
            try {
                Intent intent = new Intent(str);
                intent.setPackage(e0t.g(this.f29943b));
                if (Build.VERSION.SDK_INT < 31 || this.f29943b.getApplicationInfo().targetSdkVersion < 31) {
                    this.c = PendingIntent.getBroadcast(this.f29943b, 0, intent, 0);
                } else {
                    this.c = PendingIntent.getBroadcast(this.f29943b, 0, intent, 33554432);
                }
                this.d = str;
                ArrayList<GeoFence> arrayList = this.h;
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (GeoFence geoFence : this.h) {
                        geoFence.setPendingIntent(this.c);
                        geoFence.setPendingIntentAction(this.d);
                    }
                }
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "createPendingIntent");
            }
        }
        return this.c;
    }

    public final boolean d0() {
        ArrayList<GeoFence> arrayList = this.h;
        if (arrayList == null || arrayList.isEmpty()) {
            return true;
        }
        Iterator<GeoFence> it = this.h.iterator();
        while (it.hasNext()) {
            if (it.next().isAble()) {
                return false;
            }
        }
        return true;
    }

    public final void e0() {
        try {
            synchronized (this.f29944k) {
                try {
                    d dVar = this.i;
                    if (dVar != null) {
                        dVar.removeCallbacksAndMessages(null);
                    }
                    this.i = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            com.autonavi.aps.amapapi.utils.c.a(th2, "GeoFenceManager", "destroyResultHandler");
        }
    }

    public final GeoFence f(Bundle bundle, boolean z) {
        GeoFence geoFence = new GeoFence();
        ArrayList arrayList = new ArrayList();
        DPoint dPoint = new DPoint();
        if (z) {
            geoFence.setType(1);
            arrayList = bundle.getParcelableArrayList("pointList");
            if (arrayList != null) {
                dPoint = B(arrayList);
            }
            geoFence.setMaxDis2Center(A(dPoint, arrayList));
            geoFence.setMinDis2Center(b(dPoint, arrayList));
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
        geoFence.setActivatesAction(this.g);
        geoFence.setCustomId(bundle.getString(GeoFence.BUNDLE_KEY_CUSTOMID));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(arrayList);
        geoFence.setPointList(arrayList2);
        geoFence.setCenter(dPoint);
        geoFence.setPendingIntentAction(this.d);
        geoFence.setExpiration(-1L);
        geoFence.setPendingIntent(this.c);
        StringBuilder sb = new StringBuilder();
        sb.append(jes.c());
        geoFence.setFenceId(sb.toString());
        i iVar = this.f29942a;
        if (iVar != null) {
            iVar.a(this.f29943b, 2);
        }
        return geoFence;
    }

    public final void f0() {
        try {
            synchronized (this.j) {
                try {
                    b bVar = this.l;
                    if (bVar != null) {
                        bVar.removeCallbacksAndMessages(null);
                    }
                    this.l = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            com.autonavi.aps.amapapi.utils.c.a(th2, "GeoFenceManager", "destroyActionHandler");
        }
    }

    public final void g() {
        try {
            this.p = false;
            j(10, null, 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "removeGeoFence");
        }
    }

    public final void g0() {
        if (this.z || this.l == null) {
            return;
        }
        if (i0()) {
            j(6, null, 0L);
            j(5, null, 0L);
        } else {
            D(7);
            j(7, null, 0L);
        }
    }

    public final void h(int i) {
        try {
            b0();
            if (i > 7 || i <= 0) {
                i = 1;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("activatesAction", i);
            j(9, bundle, 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "setActivateAction");
        }
    }

    public final void h0() {
        try {
            if (this.n) {
                D(8);
            }
            AMapLocationClient aMapLocationClient = this.s;
            if (aMapLocationClient != null) {
                aMapLocationClient.stopLocation();
            }
            this.n = false;
        } catch (Throwable unused) {
        }
    }

    public final void i(int i, Bundle bundle) {
        try {
            synchronized (this.f29944k) {
                try {
                    d dVar = this.i;
                    if (dVar != null) {
                        Message messageObtainMessage = dVar.obtainMessage();
                        messageObtainMessage.what = i;
                        messageObtainMessage.setData(bundle);
                        this.i.sendMessage(messageObtainMessage);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            com.autonavi.aps.amapapi.utils.c.a(th2, "GeoFenceManager", "sendResultHandlerMessage");
        }
    }

    public final boolean i0() {
        return this.t != null && k.a(this.t) && k.b() - this.u < 10000;
    }

    public final void j(int i, Bundle bundle, long j) {
        try {
            synchronized (this.j) {
                try {
                    b bVar = this.l;
                    if (bVar != null) {
                        Message messageObtainMessage = bVar.obtainMessage();
                        messageObtainMessage.what = i;
                        messageObtainMessage.setData(bundle);
                        this.l.sendMessageDelayed(messageObtainMessage, j);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            com.autonavi.aps.amapapi.utils.c.a(th2, "GeoFenceManager", "sendActionHandlerMessage");
        }
    }

    public final void k(Bundle bundle) {
        int i = 1;
        if (bundle != null) {
            try {
                i = bundle.getInt("activatesAction", 1);
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "doSetActivatesAction");
                return;
            }
        }
        if (this.g != i) {
            ArrayList<GeoFence> arrayList = this.h;
            if (arrayList != null && !arrayList.isEmpty()) {
                for (GeoFence geoFence : this.h) {
                    geoFence.setStatus(0);
                    geoFence.setEnterTime(-1L);
                }
            }
            g0();
        }
        this.g = i;
    }

    public final void l(GeoFenceListener geoFenceListener) {
        try {
            this.e = geoFenceListener;
        } catch (Throwable unused) {
        }
    }

    public final void m(AMapLocation aMapLocation) {
        ArrayList<GeoFence> arrayList;
        try {
            if (this.z || (arrayList = this.h) == null || arrayList.isEmpty() || aMapLocation == null || aMapLocation.getErrorCode() != 0) {
                return;
            }
            for (GeoFence geoFence : this.h) {
                if (geoFence.isAble() && H(aMapLocation, geoFence) && x(geoFence, this.g)) {
                    geoFence.setCurrentLocation(aMapLocation);
                    Q(geoFence);
                }
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "doCheckFence");
        }
    }

    public final void n(AMapLocationClientOption aMapLocationClientOption) {
        try {
            this.v = aMapLocationClientOption.m79clone();
        } catch (Throwable unused) {
        }
    }

    public final void o(DPoint dPoint, float f, String str) {
        try {
            b0();
            Bundle bundle = new Bundle();
            bundle.putParcelable("centerPoint", dPoint);
            bundle.putFloat("fenceRadius", f);
            bundle.putString(GeoFence.BUNDLE_KEY_CUSTOMID, str);
            j(0, bundle, 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "addRoundGeoFence");
        }
    }

    public final void q(String str, String str2) {
        try {
            b0();
            Bundle bundle = new Bundle();
            bundle.putString("keyWords", str);
            bundle.putString(GeoFence.BUNDLE_KEY_CUSTOMID, str2);
            j(4, bundle, 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "addDistricetGeoFence");
        }
    }

    public final void r(String str, String str2, DPoint dPoint, float f, int i, String str3) {
        try {
            b0();
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
            j(3, bundle, 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "addNearbyGeoFence");
        }
    }

    public final void s(String str, String str2, String str3, int i, String str4) {
        try {
            b0();
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
            j(2, bundle, 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "addKeywordGeoFence");
        }
    }

    public final void t(String str, boolean z) {
        try {
            b0();
            Bundle bundle = new Bundle();
            bundle.putString(Constants.KEY_FID, str);
            bundle.putBoolean("ab", z);
            j(12, bundle, 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "setGeoFenceAble");
        }
    }

    public final void u(List<DPoint> list, String str) {
        try {
            b0();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("pointList", new ArrayList<>(list));
            bundle.putString(GeoFence.BUNDLE_KEY_CUSTOMID, str);
            j(1, bundle, 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "addPolygonGeoFence");
        }
    }

    public final boolean w(GeoFence geoFence) {
        try {
            ArrayList<GeoFence> arrayList = this.h;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (!this.h.contains(geoFence)) {
                    return false;
                }
                if (this.h.size() == 1) {
                    this.p = false;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable("fc", geoFence);
                j(11, bundle, 0L);
                return true;
            }
            this.p = false;
            j(10, null, 0L);
            return true;
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GeoFenceManager", "removeGeoFence(GeoFence)");
            return false;
        }
    }

    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            try {
                Bundle data = message.getData();
                switch (message.what) {
                    case 1000:
                        p2s.this.Z(data);
                        return;
                    case 1001:
                        try {
                            p2s.this.G((GeoFence) data.getParcelable("geoFence"));
                            return;
                        } catch (Throwable th) {
                            th.printStackTrace();
                            return;
                        }
                    case 1002:
                        try {
                            p2s.this.L(data.getInt(GeoFence.BUNDLE_KEY_LOCERRORCODE));
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

        public d() {
        }
    }
}
