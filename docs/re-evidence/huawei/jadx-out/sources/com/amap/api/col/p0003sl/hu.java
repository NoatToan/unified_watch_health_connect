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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes21.dex */
public final class hu implements INearbySearch {
    private static long e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f2662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f2663c;
    private gf d;
    private ExecutorService f;
    private UploadInfoCallback k;
    private TimerTask l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<NearbySearch.NearbyListener> f2661a = new ArrayList();
    private LatLonPoint g = null;
    private String h = null;
    private boolean i = false;
    private Timer j = new Timer();

    public hu(Context context) throws AMapException {
        iv ivVarA = iu.a(context, ft.a(false));
        if (ivVarA.f2835a != iu.c.SuccessCode) {
            throw new AMapException(ivVarA.f2836b, 1, ivVarA.f2836b, ivVarA.f2835a.a());
        }
        this.f2663c = context.getApplicationContext();
        this.d = gf.a();
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public final void addNearbyListener(NearbySearch.NearbyListener nearbyListener) {
        synchronized (this) {
            try {
                this.f2661a.add(nearbyListener);
            } catch (Throwable th) {
                fu.a(th, "NearbySearch", "addNearbyListener");
            }
        }
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public final void removeNearbyListener(NearbySearch.NearbyListener nearbyListener) {
        synchronized (this) {
            if (nearbyListener == null) {
                return;
            }
            try {
                this.f2661a.remove(nearbyListener);
            } catch (Throwable th) {
                fu.a(th, "NearbySearch", "removeNearbyListener");
            }
        }
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public final void clearUserInfoAsyn() {
        try {
            he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.hu.1
                @Override // java.lang.Runnable
                public final void run() {
                    Message messageObtainMessage = hu.this.d.obtainMessage();
                    messageObtainMessage.arg1 = 8;
                    messageObtainMessage.obj = hu.this.f2661a;
                    try {
                        hu.this.a();
                        messageObtainMessage.what = 1000;
                    } catch (AMapException e2) {
                        messageObtainMessage.what = e2.getErrorCode();
                        fu.a(e2, "NearbySearch", "clearUserInfoAsyn");
                    } finally {
                        if (hu.this.d != null) {
                            hu.this.d.sendMessage(messageObtainMessage);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            fu.a(th, "NearbySearch", "clearUserInfoAsynThrowable");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a() throws AMapException {
        try {
            if (this.i) {
                throw new AMapException(AMapException.AMAP_CLIENT_UPLOADAUTO_STARTED_ERROR);
            }
            if (!a(this.f2662b)) {
                throw new AMapException(AMapException.AMAP_CLIENT_USERID_ILLEGAL);
            }
            gd.a(this.f2663c);
            return new gg(this.f2663c, this.f2662b).d().intValue();
        } catch (AMapException e2) {
            throw e2;
        } catch (Throwable unused) {
            throw new AMapException(AMapException.AMAP_CLIENT_UNKNOWN_ERROR);
        }
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public final void setUserID(String str) {
        this.f2662b = str;
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public final void startUploadNearbyInfoAuto(UploadInfoCallback uploadInfoCallback, int i) {
        TimerTask timerTask;
        synchronized (this) {
            if (i < 7000) {
                i = 7000;
            }
            try {
                this.k = uploadInfoCallback;
                if (this.i && (timerTask = this.l) != null) {
                    timerTask.cancel();
                }
                this.i = true;
                a aVar = new a(this, (byte) 0);
                this.l = aVar;
                this.j.schedule(aVar, 0L, i);
            } catch (Throwable th) {
                fu.a(th, "NearbySearch", "startUploadNearbyInfoAuto");
            }
        }
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public final void stopUploadNearbyInfoAuto() {
        synchronized (this) {
            try {
                TimerTask timerTask = this.l;
                if (timerTask != null) {
                    timerTask.cancel();
                }
            } catch (Throwable th) {
                fu.a(th, "NearbySearch", "stopUploadNearbyInfoAuto");
            }
            this.i = false;
            this.l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(UploadInfo uploadInfo) {
        return this.i ? AMapException.CODE_AMAP_CLIENT_UPLOADAUTO_STARTED_ERROR : b(uploadInfo);
    }

    private static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("^[a-z0-9A-Z_-]{1,32}$").matcher(str).find();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b(UploadInfo uploadInfo) {
        try {
            gd.a(this.f2663c);
            if (uploadInfo == null) {
                return 2202;
            }
            long time = new Date().getTime();
            if (time - e < 6500) {
                return 2203;
            }
            e = time;
            String userID = uploadInfo.getUserID();
            if (!a(userID)) {
                return 2201;
            }
            if (TextUtils.isEmpty(this.h)) {
                this.h = userID;
            }
            if (!userID.equals(this.h)) {
                return 2201;
            }
            LatLonPoint point = uploadInfo.getPoint();
            if (point != null && !point.equals(this.g)) {
                new gi(this.f2663c, uploadInfo).d();
                this.g = point.copy();
                return 1000;
            }
            return 2204;
        } catch (AMapException e2) {
            return e2.getErrorCode();
        } catch (Throwable unused) {
            return 1900;
        }
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public final void uploadNearbyInfoAsyn(final UploadInfo uploadInfo) {
        if (this.f == null) {
            this.f = Executors.newSingleThreadExecutor();
        }
        this.f.submit(new Runnable() { // from class: com.amap.api.col.3sl.hu.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Message messageObtainMessage = hu.this.d.obtainMessage();
                    messageObtainMessage.arg1 = 10;
                    messageObtainMessage.obj = hu.this.f2661a;
                    messageObtainMessage.what = hu.this.a(uploadInfo);
                    hu.this.d.sendMessage(messageObtainMessage);
                } catch (Throwable th) {
                    fu.a(th, "NearbySearch", "uploadNearbyInfoAsyn");
                }
            }
        });
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public final void searchNearbyInfoAsyn(final NearbySearch.NearbyQuery nearbyQuery) {
        try {
            he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.hu.3
                @Override // java.lang.Runnable
                public final void run() {
                    Message messageObtainMessage = hu.this.d.obtainMessage();
                    messageObtainMessage.arg1 = 9;
                    gf.g gVar = new gf.g();
                    gVar.f2563a = hu.this.f2661a;
                    messageObtainMessage.obj = gVar;
                    try {
                        gVar.f2564b = hu.this.searchNearbyInfo(nearbyQuery);
                        messageObtainMessage.what = 1000;
                    } catch (AMapException e2) {
                        messageObtainMessage.what = e2.getErrorCode();
                        fu.a(e2, "NearbySearch", "searchNearbyInfoAsyn");
                    } finally {
                        if (hu.this.d != null) {
                            hu.this.d.sendMessage(messageObtainMessage);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            fu.a(th, "NearbySearch", "searchNearbyInfoAsynThrowable");
        }
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public final NearbySearchResult searchNearbyInfo(NearbySearch.NearbyQuery nearbyQuery) throws AMapException {
        try {
            gd.a(this.f2663c);
            if (!a(nearbyQuery)) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            return new gh(this.f2663c, nearbyQuery).d();
        } catch (AMapException e2) {
            throw e2;
        } catch (Throwable th) {
            fu.a(th, "NearbySearch", "searchNearbyInfo");
            throw new AMapException(AMapException.AMAP_CLIENT_UNKNOWN_ERROR);
        }
    }

    private static boolean a(NearbySearch.NearbyQuery nearbyQuery) {
        return (nearbyQuery == null || nearbyQuery.getCenterPoint() == null) ? false : true;
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public final void destroy() {
        synchronized (this) {
            try {
                this.j.cancel();
            } catch (Throwable th) {
                fu.a(th, "NearbySearch", "destryoy");
            }
        }
    }

    final class a extends TimerTask {
        private a() {
        }

        /* synthetic */ a(hu huVar, byte b2) {
            this();
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            try {
                if (hu.this.k != null) {
                    int iB = hu.this.b(hu.this.k.OnUploadInfoCallback());
                    Message messageObtainMessage = hu.this.d.obtainMessage();
                    messageObtainMessage.arg1 = 10;
                    messageObtainMessage.obj = hu.this.f2661a;
                    messageObtainMessage.what = iB;
                    hu.this.d.sendMessage(messageObtainMessage);
                }
            } catch (Throwable th) {
                fu.a(th, "NearbySearch", "UpdateDataTask");
            }
        }
    }
}
