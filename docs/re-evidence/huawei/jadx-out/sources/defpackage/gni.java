package defpackage;

import com.google.gson.JsonSyntaxException;
import com.huawei.health.suggestion.RunCourseRecommendCallback;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class gni implements IBaseResponseCallback {
    private RunCourseRecommendCallback e;

    gni(RunCourseRecommendCallback runCourseRecommendCallback) {
        this.e = runCourseRecommendCallback;
    }

    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
    /* JADX INFO: renamed from: onResponse */
    public void a(int i, Object obj) {
        List<HiHealthData> list;
        LogUtil.a("Suggest_MyMonthDataCallback", "onResponse");
        try {
            list = njy.b(obj, HiHealthData.class) ? (List) obj : null;
        } catch (ClassCastException unused) {
            LogUtil.j("Suggest_MyMonthDataCallback", "parseTrackSimplifyData classCastException ");
            this.e.onFailure(0, "classCastException");
        }
        List<HiHealthData> list2 = list;
        hcp hcpVar = new hcp();
        if (list2 == null) {
            LogUtil.a("Suggest_MyMonthDataCallback", "parseTrackSimplifyData datas is null");
            hcpVar.b(0);
            hcpVar.a(0L);
            hcpVar.e(0L);
            this.e.onSuccess(gnr.c(hcpVar));
            return;
        }
        if (list2.size() == 0) {
            LogUtil.a("Suggest_MyMonthDataCallback", "parseTrackSimplifyData datas size is 0");
            hcpVar.b(0);
            hcpVar.a(0L);
            hcpVar.e(0L);
            this.e.onSuccess(gnr.c(hcpVar));
            return;
        }
        c(list2, hcpVar, 0, 0L);
    }

    private void c(List<HiHealthData> list, hcp hcpVar, int i, long j) {
        ArrayList arrayList = new ArrayList();
        a(list, arrayList);
        int i2 = 0;
        int iE = 0;
        int i3 = 0;
        long jB = 0;
        long jB2 = 0;
        for (b bVar : arrayList) {
            if (bVar != null) {
                i2++;
                jB += bVar.b();
                iE = (int) (iE + bVar.e());
                if (bVar.e() <= 21079.5d) {
                    jB2 += bVar.b();
                    i3++;
                }
            }
        }
        if (i2 == 0 || CommonUtil.b(jB)) {
            hcpVar.b(i);
            hcpVar.a(j);
            hcpVar.e(0L);
            this.e.onSuccess(gnr.c(hcpVar));
            return;
        }
        hcpVar.b(iE / i2);
        hcpVar.a(((long) iE) / jB);
        if (i3 == 0) {
            hcpVar.e(0L);
        } else {
            hcpVar.e(jB2 / ((long) i3));
            this.e.onSuccess(gnr.c(hcpVar));
        }
    }

    private void a(List<HiHealthData> list, List<b> list2) {
        if (njy.b(list)) {
            for (HiHealthData hiHealthData : list) {
                if (hiHealthData != null) {
                    b bVar = new b();
                    try {
                        HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiTrackMetaData.class);
                        LogUtil.a("Suggest_MyMonthDataCallback", " sport getSportType", Integer.valueOf(hiTrackMetaData.getSportType()));
                        if (hiTrackMetaData.getSportType() == 258 || hiTrackMetaData.getSportType() == 264) {
                            bVar.e(hiTrackMetaData.getTotalDistance());
                            bVar.a(hiTrackMetaData.getTotalTime());
                        }
                        list2.add(bVar);
                    } catch (JsonSyntaxException unused) {
                        LogUtil.j("Suggest_MyMonthDataCallback", "parseTrackSimplifyData trackMetaData is jsonSyntaxException");
                    }
                }
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f35807a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f35808c;

        public float e() {
            return this.f35807a;
        }

        public void a(long j) {
            this.f35808c = j;
        }

        public long b() {
            return this.f35808c;
        }

        public void e(float f) {
            this.f35807a = f;
        }
    }
}
