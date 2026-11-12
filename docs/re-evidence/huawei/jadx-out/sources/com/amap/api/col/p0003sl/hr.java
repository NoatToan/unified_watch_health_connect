package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.district.DistrictResult;
import com.amap.api.services.district.DistrictSearch;
import com.amap.api.services.district.DistrictSearchQuery;
import com.amap.api.services.interfaces.IDistrictSearch;
import java.util.HashMap;

/* JADX INFO: loaded from: classes21.dex */
public final class hr implements IDistrictSearch {
    private static HashMap<Integer, DistrictResult> f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f2646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DistrictSearchQuery f2647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DistrictSearch.OnDistrictSearchListener f2648c;
    private DistrictSearchQuery d;
    private int e;
    private Handler g;

    public hr(Context context) throws AMapException {
        iv ivVarA = iu.a(context, ft.a(false));
        if (ivVarA.f2835a != iu.c.SuccessCode) {
            throw new AMapException(ivVarA.f2836b, 1, ivVarA.f2836b, ivVarA.f2835a.a());
        }
        this.f2646a = context.getApplicationContext();
        this.g = gf.a();
    }

    private void a(DistrictResult districtResult) {
        int i;
        f = new HashMap<>();
        DistrictSearchQuery districtSearchQuery = this.f2647b;
        if (districtSearchQuery == null || districtResult == null || (i = this.e) <= 0 || i <= districtSearchQuery.getPageNum()) {
            return;
        }
        f.put(Integer.valueOf(this.f2647b.getPageNum()), districtResult);
    }

    @Override // com.amap.api.services.interfaces.IDistrictSearch
    public final DistrictSearchQuery getQuery() {
        return this.f2647b;
    }

    @Override // com.amap.api.services.interfaces.IDistrictSearch
    public final void setQuery(DistrictSearchQuery districtSearchQuery) {
        this.f2647b = districtSearchQuery;
    }

    private boolean a() {
        return this.f2647b != null;
    }

    private DistrictResult a(int i) throws AMapException {
        if (!b(i)) {
            throw new AMapException("无效的参数 - IllegalArgumentException");
        }
        return f.get(Integer.valueOf(i));
    }

    private boolean b(int i) {
        return i < this.e && i >= 0;
    }

    @Override // com.amap.api.services.interfaces.IDistrictSearch
    public final DistrictResult searchDistrict() throws AMapException {
        int i;
        try {
            DistrictResult districtResult = new DistrictResult();
            gd.a(this.f2646a);
            if (!a()) {
                this.f2647b = new DistrictSearchQuery();
            }
            districtResult.setQuery(this.f2647b.m769clone());
            if (!this.f2647b.weakEquals(this.d)) {
                this.e = 0;
                this.d = this.f2647b.m769clone();
                HashMap<Integer, DistrictResult> map = f;
                if (map != null) {
                    map.clear();
                }
            }
            if (this.e == 0) {
                DistrictResult districtResultD = new fw(this.f2646a, this.f2647b.m769clone()).d();
                if (districtResultD == null) {
                    return districtResultD;
                }
                this.e = districtResultD.getPageCount();
                a(districtResultD);
                return districtResultD;
            }
            DistrictResult districtResultA = a(this.f2647b.getPageNum());
            if (districtResultA == null) {
                districtResultA = new fw(this.f2646a, this.f2647b.m769clone()).d();
                DistrictSearchQuery districtSearchQuery = this.f2647b;
                if (districtSearchQuery != null && districtResultA != null && (i = this.e) > 0 && i > districtSearchQuery.getPageNum()) {
                    f.put(Integer.valueOf(this.f2647b.getPageNum()), districtResultA);
                }
            }
            return districtResultA;
        } catch (AMapException e) {
            fu.a(e, "DistrictSearch", "searchDistrict");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IDistrictSearch
    public final void searchDistrictAsyn() {
        try {
            he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.hr.1
                /* JADX WARN: Code duplicated, block: B:19:0x0097 A[PHI: r2 r3
                  0x0097: PHI (r2v3 com.amap.api.services.district.DistrictResult) = (r2v1 com.amap.api.services.district.DistrictResult), (r2v4 com.amap.api.services.district.DistrictResult) binds: [B:13:0x0073, B:18:0x0095] A[DONT_GENERATE, DONT_INLINE]
                  0x0097: PHI (r3v7 android.os.Bundle) = (r3v18 android.os.Bundle), (r3v19 android.os.Bundle) binds: [B:13:0x0073, B:18:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r0v12, types: [android.os.Handler] */
                /* JADX WARN: Type inference failed for: r0v16, types: [android.os.Handler] */
                /* JADX WARN: Type inference failed for: r0v17 */
                /* JADX WARN: Type inference failed for: r0v18 */
                /* JADX WARN: Type inference failed for: r0v19 */
                /* JADX WARN: Type inference failed for: r0v3 */
                /* JADX WARN: Type inference failed for: r0v5, types: [android.os.Handler] */
                /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r1v1, types: [android.os.Message] */
                /* JADX WARN: Type inference failed for: r3v11, types: [int] */
                /* JADX WARN: Type inference failed for: r3v14, types: [android.os.Bundle] */
                /* JADX WARN: Type inference failed for: r3v2 */
                /* JADX WARN: Type inference failed for: r3v20 */
                /* JADX WARN: Type inference failed for: r3v21 */
                /* JADX WARN: Type inference failed for: r3v22 */
                /* JADX WARN: Type inference failed for: r3v6 */
                @Override // java.lang.Runnable
                public final void run() {
                    Bundle bundle;
                    ?? r0 = "result";
                    ?? ObtainMessage = gf.a().obtainMessage();
                    DistrictResult districtResult = new DistrictResult();
                    districtResult.setQuery(hr.this.f2647b);
                    ?? r3 = 4;
                    try {
                        try {
                            districtResult = hr.this.searchDistrict();
                            if (districtResult != null) {
                                districtResult.setAMapException(new AMapException());
                            }
                            ((Message) ObtainMessage).arg1 = 4;
                            ((Message) ObtainMessage).obj = hr.this.f2648c;
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("result", districtResult);
                            ObtainMessage.setData(bundle2);
                            if (hr.this.g != null) {
                                hr.this.g.sendMessage(ObtainMessage);
                            }
                        } catch (Throwable th) {
                            ((Message) ObtainMessage).arg1 = r3;
                            ((Message) ObtainMessage).obj = hr.this.f2648c;
                            ?? bundle3 = new Bundle();
                            bundle3.putParcelable(r0, districtResult);
                            ObtainMessage.setData(bundle3);
                            if (hr.this.g != null) {
                                hr.this.g.sendMessage(ObtainMessage);
                            }
                            throw th;
                        }
                    } catch (AMapException e) {
                        districtResult.setAMapException(e);
                        ((Message) ObtainMessage).arg1 = 4;
                        ((Message) ObtainMessage).obj = hr.this.f2648c;
                        Bundle bundle4 = new Bundle();
                        bundle4.putParcelable("result", districtResult);
                        ObtainMessage.setData(bundle4);
                        Handler handler = hr.this.g;
                        bundle = bundle4;
                        r0 = handler;
                        r3 = bundle4;
                        if (handler != null) {
                            ?? r1 = hr.this.g;
                            r1.sendMessage(ObtainMessage);
                            r0 = r1;
                            r3 = bundle;
                        }
                    } catch (Throwable th2) {
                        fu.a(th2, "DistrictSearch", "searchDistrictAnsyThrowable");
                        ((Message) ObtainMessage).arg1 = 4;
                        ((Message) ObtainMessage).obj = hr.this.f2648c;
                        Bundle bundle5 = new Bundle();
                        bundle5.putParcelable("result", districtResult);
                        ObtainMessage.setData(bundle5);
                        Handler handler2 = hr.this.g;
                        bundle = bundle5;
                        r0 = handler2;
                        r3 = bundle5;
                        if (handler2 != null) {
                            ?? r2 = hr.this.g;
                            r2.sendMessage(ObtainMessage);
                            r0 = r2;
                            r3 = bundle;
                        }
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.services.interfaces.IDistrictSearch
    public final void searchDistrictAnsy() {
        searchDistrictAsyn();
    }

    @Override // com.amap.api.services.interfaces.IDistrictSearch
    public final void setOnDistrictSearchListener(DistrictSearch.OnDistrictSearchListener onDistrictSearchListener) {
        this.f2648c = onDistrictSearchListener;
    }
}
