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
import defpackage.ays;
import defpackage.fws;
import defpackage.uts;
import defpackage.wts;
import defpackage.xts;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 implements ICloudSearch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f6177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CloudSearch.OnCloudSearchListener f6178b;
    public CloudSearch.Query c;
    public int d;
    public HashMap<Integer, CloudResult> e;
    public Handler f;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CloudSearch.Query f6179a;

        public a(CloudSearch.Query query) {
            this.f6179a = query;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Message messageObtainMessage = y.a().obtainMessage();
            try {
                try {
                    messageObtainMessage.arg1 = 12;
                    messageObtainMessage.what = 700;
                    y.e eVar = new y.e();
                    eVar.f6331b = k0.this.f6178b;
                    messageObtainMessage.obj = eVar;
                    eVar.f6330a = k0.this.e(this.f6179a);
                    messageObtainMessage.arg2 = 1000;
                } catch (AMapException e) {
                    messageObtainMessage.arg2 = e.getErrorCode();
                }
            } finally {
                k0.this.f.sendMessage(messageObtainMessage);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f6181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f6182b;

        public b(String str, String str2) {
            this.f6181a = str;
            this.f6182b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Message messageObtainMessage = y.a().obtainMessage();
            try {
                try {
                    messageObtainMessage.arg1 = 12;
                    messageObtainMessage.what = 701;
                    y.d dVar = new y.d();
                    dVar.f6329b = k0.this.f6178b;
                    messageObtainMessage.obj = dVar;
                    dVar.f6328a = k0.this.b(this.f6181a, this.f6182b);
                    messageObtainMessage.arg2 = 1000;
                } catch (AMapException e) {
                    messageObtainMessage.arg2 = e.getErrorCode();
                }
            } finally {
                k0.this.f.sendMessage(messageObtainMessage);
            }
        }
    }

    public k0(Context context) throws AMapException {
        y0 y0VarA = iu.a(context, wts.a(false));
        if (y0VarA.f6352a != iu.c.SuccessCode) {
            String str = y0VarA.f6353b;
            throw new AMapException(str, 1, str, y0VarA.f6352a.a());
        }
        this.f6177a = context.getApplicationContext();
        this.f = y.a();
    }

    public static boolean j(CloudSearch.Query query) {
        if (query == null || xts.j(query.getTableID()) || query.getBound() == null) {
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

    public final CloudItemDetail b(String str, String str2) throws AMapException {
        if (str == null || str.trim().equals("")) {
            throw new AMapException("无效的参数 - IllegalArgumentException");
        }
        if (str2 == null || str2.trim().equals("")) {
            throw new AMapException("无效的参数 - IllegalArgumentException");
        }
        try {
            return new uts(this.f6177a, new fws(str, str2)).m();
        } catch (Throwable th) {
            xts.i(th, "CloudSearch", "searchCloudDetail");
            if (th instanceof AMapException) {
                throw th;
            }
            th.printStackTrace();
            return null;
        }
    }

    public final CloudResult c(int i) {
        if (i(i)) {
            return this.e.get(Integer.valueOf(i));
        }
        throw new IllegalArgumentException("page out of range");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.amap.api.services.cloud.CloudResult] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.amap.api.services.cloud.CloudResult] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final CloudResult e(CloudSearch.Query query) throws AMapException {
        ?? r0;
        ?? r1 = 0;
        try {
            if (!j(query)) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (!query.queryEquals(this.c)) {
                this.d = 0;
                this.c = query.m96clone();
                HashMap<Integer, CloudResult> map = this.e;
                if (map != null) {
                    map.clear();
                }
            }
            ?? r2 = this.d;
            try {
                if (r2 != 0) {
                    CloudResult cloudResultC = c(query.getPageNum());
                    if (cloudResultC == null) {
                        r0 = cloudResultC;
                        CloudResult cloudResultM = new v(this.f6177a, query).m();
                        this.e.put(Integer.valueOf(query.getPageNum()), cloudResultM);
                        r2 = cloudResultM;
                    }
                    r0 = cloudResultC;
                    return r0;
                }
                CloudResult cloudResultM2 = new v(this.f6177a, query).m();
                g(cloudResultM2, query);
                r2 = cloudResultM2;
                return r2;
            } catch (Throwable th) {
                th = th;
                r1 = r2;
                xts.i(th, "CloudSearch", "searchCloud");
                if (th instanceof AMapException) {
                    throw th;
                }
                th.printStackTrace();
                r0 = r1;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void g(CloudResult cloudResult, CloudSearch.Query query) {
        HashMap<Integer, CloudResult> map = new HashMap<>();
        this.e = map;
        if (this.d > 0) {
            map.put(Integer.valueOf(query.getPageNum()), cloudResult);
        }
    }

    public final boolean i(int i) {
        return i <= this.d && i > 0;
    }

    @Override // com.amap.api.services.interfaces.ICloudSearch
    public final void searchCloudAsyn(CloudSearch.Query query) {
        try {
            ays.a().b(new a(query));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.services.interfaces.ICloudSearch
    public final void searchCloudDetailAsyn(String str, String str2) {
        try {
            ays.a().b(new b(str, str2));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.services.interfaces.ICloudSearch
    public final void setOnCloudSearchListener(CloudSearch.OnCloudSearchListener onCloudSearchListener) {
        this.f6178b = onCloudSearchListener;
    }
}
