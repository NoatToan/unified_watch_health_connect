package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.cloud.CloudItemDetail;
import com.amap.api.services.cloud.CloudResult;
import com.amap.api.services.cloud.CloudSearch;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.interfaces.ICloudSearch;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class hp implements ICloudSearch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f2633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CloudSearch.OnCloudSearchListener f2634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CloudSearch.Query f2635c;
    private int d;
    private HashMap<Integer, CloudResult> e;
    private Handler f;

    public hp(Context context) throws AMapException {
        iv ivVarA = iu.a(context, ft.a(false));
        if (ivVarA.f2835a != iu.c.SuccessCode) {
            throw new AMapException(ivVarA.f2836b, 1, ivVarA.f2836b, ivVarA.f2835a.a());
        }
        this.f2633a = context.getApplicationContext();
        this.f = gf.a();
    }

    @Override // com.amap.api.services.interfaces.ICloudSearch
    public final void setOnCloudSearchListener(CloudSearch.OnCloudSearchListener onCloudSearchListener) {
        this.f2634b = onCloudSearchListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    public CloudResult a(CloudSearch.Query query) throws AMapException {
        CloudResult cloudResult;
        try {
            if (!b(query)) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (!query.queryEquals(this.f2635c)) {
                this.d = 0;
                this.f2635c = query.m767clone();
                HashMap<Integer, CloudResult> map = this.e;
                if (map != null) {
                    map.clear();
                }
            }
            cloudResult = this.d;
            try {
                if (cloudResult == 0) {
                    CloudResult cloudResultD = new fs(this.f2633a, query).d();
                    a(cloudResultD, query);
                    return cloudResultD;
                }
                CloudResult cloudResultA = a(query.getPageNum());
                if (cloudResultA != null) {
                    return cloudResultA;
                }
                CloudResult cloudResultD2 = new fs(this.f2633a, query).d();
                this.e.put(Integer.valueOf(query.getPageNum()), cloudResultD2);
                return cloudResultD2;
            } catch (Throwable th) {
                th = th;
                fu.a(th, "CloudSearch", "searchCloud");
                if (th instanceof AMapException) {
                    throw th;
                }
                th.printStackTrace();
                return cloudResult;
            }
        } catch (Throwable th2) {
            th = th2;
            cloudResult = 0;
        }
    }

    @Override // com.amap.api.services.interfaces.ICloudSearch
    public final void searchCloudAsyn(final CloudSearch.Query query) {
        try {
            he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.hp.1
                @Override // java.lang.Runnable
                public final void run() {
                    Message messageObtainMessage = gf.a().obtainMessage();
                    try {
                        try {
                            messageObtainMessage.arg1 = 12;
                            messageObtainMessage.what = 700;
                            gf.e eVar = new gf.e();
                            eVar.f2560b = hp.this.f2634b;
                            messageObtainMessage.obj = eVar;
                            eVar.f2559a = hp.this.a(query);
                            messageObtainMessage.arg2 = 1000;
                        } catch (AMapException e) {
                            messageObtainMessage.arg2 = e.getErrorCode();
                        }
                    } finally {
                        hp.this.f.sendMessage(messageObtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CloudItemDetail a(String str, String str2) throws AMapException {
        if (str == null || str.trim().equals("")) {
            throw new AMapException("无效的参数 - IllegalArgumentException");
        }
        if (str2 == null || str2.trim().equals("")) {
            throw new AMapException("无效的参数 - IllegalArgumentException");
        }
        try {
            return new fr(this.f2633a, new gp(str, str2)).d();
        } catch (Throwable th) {
            fu.a(th, "CloudSearch", "searchCloudDetail");
            if (th instanceof AMapException) {
                throw th;
            }
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.amap.api.services.interfaces.ICloudSearch
    public final void searchCloudDetailAsyn(final String str, final String str2) {
        try {
            he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.hp.2
                @Override // java.lang.Runnable
                public final void run() {
                    Message messageObtainMessage = gf.a().obtainMessage();
                    try {
                        try {
                            messageObtainMessage.arg1 = 12;
                            messageObtainMessage.what = 701;
                            gf.d dVar = new gf.d();
                            dVar.f2558b = hp.this.f2634b;
                            messageObtainMessage.obj = dVar;
                            dVar.f2557a = hp.this.a(str, str2);
                            messageObtainMessage.arg2 = 1000;
                        } catch (AMapException e) {
                            messageObtainMessage.arg2 = e.getErrorCode();
                        }
                    } finally {
                        hp.this.f.sendMessage(messageObtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(CloudResult cloudResult, CloudSearch.Query query) {
        HashMap<Integer, CloudResult> map = new HashMap<>();
        this.e = map;
        if (this.d > 0) {
            map.put(Integer.valueOf(query.getPageNum()), cloudResult);
        }
    }

    private CloudResult a(int i) {
        if (!b(i)) {
            throw new IllegalArgumentException("page out of range");
        }
        return this.e.get(Integer.valueOf(i));
    }

    private boolean b(int i) {
        return i <= this.d && i > 0;
    }

    private static boolean b(CloudSearch.Query query) {
        if (query == null || fu.a(query.getTableID()) || query.getBound() == null) {
            return false;
        }
        if (query.getBound() != null && query.getBound().getShape().equals("Bound") && query.getBound().getCenter() == null) {
            return false;
        }
        if (query.getBound() != null && query.getBound().getShape().equals("Rectangle")) {
            LatLonPoint lowerLeft = query.getBound().getLowerLeft();
            LatLonPoint upperRight = query.getBound().getUpperRight();
            if (lowerLeft == null || upperRight == null || lowerLeft.getLatitude() >= upperRight.getLatitude() || lowerLeft.getLongitude() >= upperRight.getLongitude()) {
                return false;
            }
        }
        if (query.getBound() == null || !query.getBound().getShape().equals("Polygon")) {
            return true;
        }
        List<LatLonPoint> polyGonList = query.getBound().getPolyGonList();
        for (int i = 0; i < polyGonList.size(); i++) {
            if (polyGonList.get(i) == null) {
                return false;
            }
        }
        return true;
    }
}
