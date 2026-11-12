package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.interfaces.INearbySearch;
import com.amap.api.services.nearby.NearbySearch;
import com.amap.api.services.nearby.NearbySearchResult;
import com.amap.api.services.nearby.UploadInfo;
import com.amap.api.services.nearby.UploadInfoCallback;
import defpackage.ays;
import defpackage.pvs;
import defpackage.rvs;
import defpackage.tvs;
import defpackage.wts;
import defpackage.xts;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 implements INearbySearch {
    public static long l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6229b;
    public Context c;
    public y d;
    public ExecutorService e;
    public UploadInfoCallback j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TimerTask f6230k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<NearbySearch.NearbyListener> f6228a = new ArrayList();
    public LatLonPoint f = null;
    public String g = null;
    public boolean h = false;
    public Timer i = new Timer();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Message messageObtainMessage = p0.this.d.obtainMessage();
            messageObtainMessage.arg1 = 8;
            messageObtainMessage.obj = p0.this.f6228a;
            try {
                p0.this.a();
                messageObtainMessage.what = 1000;
            } catch (AMapException e) {
                messageObtainMessage.what = e.getErrorCode();
                xts.i(e, "NearbySearch", "clearUserInfoAsyn");
            } finally {
                if (p0.this.d != null) {
                    p0.this.d.sendMessage(messageObtainMessage);
                }
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ UploadInfo f6232a;

        public b(UploadInfo uploadInfo) {
            this.f6232a = uploadInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Message messageObtainMessage = p0.this.d.obtainMessage();
                messageObtainMessage.arg1 = 10;
                messageObtainMessage.obj = p0.this.f6228a;
                messageObtainMessage.what = p0.this.c(this.f6232a);
                p0.this.d.sendMessage(messageObtainMessage);
            } catch (Throwable th) {
                xts.i(th, "NearbySearch", "uploadNearbyInfoAsyn");
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NearbySearch.NearbyQuery f6234a;

        public c(NearbySearch.NearbyQuery nearbyQuery) {
            this.f6234a = nearbyQuery;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Message messageObtainMessage = p0.this.d.obtainMessage();
            messageObtainMessage.arg1 = 9;
            y.g gVar = new y.g();
            gVar.f6334a = p0.this.f6228a;
            messageObtainMessage.obj = gVar;
            try {
                gVar.f6335b = p0.this.searchNearbyInfo(this.f6234a);
                messageObtainMessage.what = 1000;
            } catch (AMapException e) {
                messageObtainMessage.what = e.getErrorCode();
                xts.i(e, "NearbySearch", "searchNearbyInfoAsyn");
            } finally {
                if (p0.this.d != null) {
                    p0.this.d.sendMessage(messageObtainMessage);
                }
            }
        }
    }

    public class d extends TimerTask {
        public d() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            try {
                if (p0.this.j != null) {
                    int iH = p0.this.h(p0.this.j.OnUploadInfoCallback());
                    Message messageObtainMessage = p0.this.d.obtainMessage();
                    messageObtainMessage.arg1 = 10;
                    messageObtainMessage.obj = p0.this.f6228a;
                    messageObtainMessage.what = iH;
                    p0.this.d.sendMessage(messageObtainMessage);
                }
            } catch (Throwable th) {
                xts.i(th, "NearbySearch", "UpdateDataTask");
            }
        }

        public /* synthetic */ d(p0 p0Var, byte b2) {
            this();
        }
    }

    public p0(Context context) throws AMapException {
        y0 y0VarA = iu.a(context, wts.a(false));
        if (y0VarA.f6352a != iu.c.SuccessCode) {
            String str = y0VarA.f6353b;
            throw new AMapException(str, 1, str, y0VarA.f6352a.a());
        }
        this.c = context.getApplicationContext();
        this.d = y.a();
    }

    public static boolean e(NearbySearch.NearbyQuery nearbyQuery) {
        return (nearbyQuery == null || nearbyQuery.getCenterPoint() == null) ? false : true;
    }

    public static boolean f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("^[a-z0-9A-Z_-]{1,32}$").matcher(str).find();
    }

    public final int a() throws AMapException {
        try {
            if (this.h) {
                throw new AMapException(AMapException.AMAP_CLIENT_UPLOADAUTO_STARTED_ERROR);
            }
            if (!f(this.f6229b)) {
                throw new AMapException(AMapException.AMAP_CLIENT_USERID_ILLEGAL);
            }
            x.c(this.c);
            return new pvs(this.c, this.f6229b).m().intValue();
        } catch (AMapException e) {
            throw e;
        } catch (Throwable unused) {
            throw new AMapException(AMapException.AMAP_CLIENT_UNKNOWN_ERROR);
        }
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public final synchronized void addNearbyListener(NearbySearch.NearbyListener nearbyListener) {
        try {
            this.f6228a.add(nearbyListener);
        } catch (Throwable th) {
            xts.i(th, "NearbySearch", "addNearbyListener");
        }
    }

    public final int c(UploadInfo uploadInfo) {
        return this.h ? AMapException.CODE_AMAP_CLIENT_UPLOADAUTO_STARTED_ERROR : h(uploadInfo);
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public final void clearUserInfoAsyn() {
        try {
            ays.a().b(new a());
        } catch (Throwable th) {
            xts.i(th, "NearbySearch", "clearUserInfoAsynThrowable");
        }
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public final synchronized void destroy() {
        try {
            this.i.cancel();
        } catch (Throwable th) {
            xts.i(th, "NearbySearch", "destryoy");
        }
    }

    public final int h(UploadInfo uploadInfo) {
        try {
            x.c(this.c);
            if (uploadInfo == null) {
                return AMapException.CODE_AMAP_CLIENT_NEARBY_NULL_RESULT;
            }
            long time = new Date().getTime();
            if (time - l < 6500) {
                return AMapException.CODE_AMAP_CLIENT_UPLOAD_TOO_FREQUENT;
            }
            l = time;
            String userID = uploadInfo.getUserID();
            if (!f(userID)) {
                return AMapException.CODE_AMAP_CLIENT_USERID_ILLEGAL;
            }
            if (TextUtils.isEmpty(this.g)) {
                this.g = userID;
            }
            if (!userID.equals(this.g)) {
                return AMapException.CODE_AMAP_CLIENT_USERID_ILLEGAL;
            }
            LatLonPoint point = uploadInfo.getPoint();
            if (point != null && !point.equals(this.f)) {
                new tvs(this.c, uploadInfo).m();
                this.f = point.copy();
                return 1000;
            }
            return AMapException.CODE_AMAP_CLIENT_UPLOAD_LOCATION_ERROR;
        } catch (AMapException e) {
            return e.getErrorCode();
        } catch (Throwable unused) {
            return 1900;
        }
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public final synchronized void removeNearbyListener(NearbySearch.NearbyListener nearbyListener) {
        if (nearbyListener == null) {
            return;
        }
        try {
            this.f6228a.remove(nearbyListener);
        } catch (Throwable th) {
            xts.i(th, "NearbySearch", "removeNearbyListener");
        }
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public final NearbySearchResult searchNearbyInfo(NearbySearch.NearbyQuery nearbyQuery) throws AMapException {
        try {
            x.c(this.c);
            if (e(nearbyQuery)) {
                return new rvs(this.c, nearbyQuery).m();
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e) {
            throw e;
        } catch (Throwable th) {
            xts.i(th, "NearbySearch", "searchNearbyInfo");
            throw new AMapException(AMapException.AMAP_CLIENT_UNKNOWN_ERROR);
        }
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public final void searchNearbyInfoAsyn(NearbySearch.NearbyQuery nearbyQuery) {
        try {
            ays.a().b(new c(nearbyQuery));
        } catch (Throwable th) {
            xts.i(th, "NearbySearch", "searchNearbyInfoAsynThrowable");
        }
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public final void setUserID(String str) {
        this.f6229b = str;
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public final synchronized void startUploadNearbyInfoAuto(UploadInfoCallback uploadInfoCallback, int i) {
        TimerTask timerTask;
        if (i < 7000) {
            i = 7000;
        }
        try {
            this.j = uploadInfoCallback;
            if (this.h && (timerTask = this.f6230k) != null) {
                timerTask.cancel();
            }
            this.h = true;
            d dVar = new d(this, (byte) 0);
            this.f6230k = dVar;
            this.i.schedule(dVar, 0L, i);
        } catch (Throwable th) {
            xts.i(th, "NearbySearch", "startUploadNearbyInfoAuto");
        }
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public final synchronized void stopUploadNearbyInfoAuto() {
        try {
            TimerTask timerTask = this.f6230k;
            if (timerTask != null) {
                timerTask.cancel();
            }
        } catch (Throwable th) {
            xts.i(th, "NearbySearch", "stopUploadNearbyInfoAuto");
        }
        this.h = false;
        this.f6230k = null;
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public final void uploadNearbyInfoAsyn(UploadInfo uploadInfo) {
        if (this.e == null) {
            this.e = Executors.newSingleThreadExecutor();
        }
        this.e.submit(new b(uploadInfo));
    }
}
