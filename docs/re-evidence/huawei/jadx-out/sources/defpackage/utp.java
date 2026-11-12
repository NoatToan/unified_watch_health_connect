package defpackage;

import android.content.Context;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.linechart.utils.ResponseCallback;
import com.huawei.ui.main.stories.health.util.BloodPressureUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class utp implements IChartStorageHelper {
    @Override // com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper
    public void queryStepDayData(Context context, final long j, final long j2, final DataInfos dataInfos, HwHealthChartHolder.c cVar, final ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        final HashMap map = new HashMap(16);
        new utk().d(true, j, j2, new IBaseResponseCallback() { // from class: uto
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.d.c(j, j2, responseCallback, map, dataInfos, i, obj);
            }
        });
    }

    /* synthetic */ void c(long j, long j2, ResponseCallback responseCallback, Map map, DataInfos dataInfos, int i, Object obj) {
        LogUtil.a("BloodPressureStorageHelper", "queryStepDayData, errorCode: " + i, ", startTime: " + j + ", endTime: " + j2);
        if (i != 0) {
            if (i == 100001) {
                responseCallback.onResult(0, map);
                return;
            } else {
                responseCallback.onResult(100001, map);
                return;
            }
        }
        if (!(obj instanceof List)) {
            LogUtil.j("BloodPressureStorageHelper", "readData type error");
            responseCallback.onResult(100001, map);
            return;
        }
        List<uwh> list = (List) obj;
        if (njy.e(list)) {
            LogUtil.j("BloodPressureStorageHelper", "readData list is empty");
            responseCallback.onResult(100001, map);
            return;
        }
        Iterator<uwh> it = list.iterator();
        while (it.hasNext()) {
            LogUtil.a("BloodPressureStorageHelper", "healthData: " + it.next().toString());
        }
        if (dataInfos.isDayData()) {
            b(map, list);
        } else {
            d(map, list);
        }
        responseCallback.onResult(0, map);
    }

    private void d(Map<Long, IStorageModel> map, List<uwh> list) {
        HashMap map2 = new HashMap();
        for (uwh uwhVar : list) {
            long jH = ltb.h(uwhVar.g());
            List arrayList = (List) map2.get(Long.valueOf(jH));
            if (arrayList == null) {
                arrayList = new ArrayList();
                map2.put(Long.valueOf(jH), arrayList);
            }
            arrayList.add(uwhVar);
        }
        for (Map.Entry entry : map2.entrySet()) {
            Long l = (Long) entry.getKey();
            l.longValue();
            List<uwh> list2 = (List) entry.getValue();
            int size = list2.size();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            double dM = 0.0d;
            double dO = 0.0d;
            double d = 0.0d;
            double d2 = 0.0d;
            double d3 = 0.0d;
            for (uwh uwhVar2 : list2) {
                dM += uwhVar2.m();
                dO += uwhVar2.o();
                double dL = uwhVar2.l();
                if (dL > 0.0d) {
                    i++;
                    d += dL;
                }
                double dN = uwhVar2.n();
                if (dN > 0.0d) {
                    i2++;
                    d2 += dN;
                }
                double dK = uwhVar2.k();
                if (dK > 0.0d) {
                    i3++;
                    d3 += dK;
                }
            }
            float fRound = 0.0f;
            float fRound2 = i > 0 ? Math.round(d / ((double) i)) : 0.0f;
            float fRound3 = i2 > 0 ? Math.round(d2 / ((double) i2)) : 0.0f;
            if (i3 > 0) {
                fRound = Math.round(d3 / ((double) i3));
            }
            double d4 = size;
            map.put(l, new fsq(Math.round(dM / d4), Math.round(dO / d4), fRound2, size, fRound3, fRound));
        }
    }

    private void b(Map<Long, IStorageModel> map, List<uwh> list) {
        HashMap map2 = new HashMap();
        for (uwh uwhVar : list) {
            long jC = BloodPressureUtil.c(uwhVar.g());
            List arrayList = (List) map2.get(Long.valueOf(jC));
            if (arrayList == null) {
                arrayList = new ArrayList();
                map2.put(Long.valueOf(jC), arrayList);
            }
            arrayList.add(uwhVar);
        }
        Iterator it = map2.entrySet().iterator();
        while (it.hasNext()) {
            a((Map.Entry) it.next(), map);
        }
    }

    private void a(Map.Entry<Long, List<uwh>> entry, Map<Long, IStorageModel> map) {
        long jLongValue = entry.getKey().longValue();
        List<uwh> value = entry.getValue();
        int size = value.size();
        double d = 0.0d;
        double dM = 0.0d;
        double dO = 0.0d;
        double dL = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (uwh uwhVar : value) {
            dM += uwhVar.m();
            dO += uwhVar.o();
            dL += uwhVar.l();
            if (uwhVar.l() > d) {
                i2++;
            }
            double dN = uwhVar.n();
            if (dN > d) {
                i++;
                d2 += dN;
            }
            double dK = uwhVar.k();
            if (dK > d) {
                i3++;
                d3 += dK;
            }
            d = 0.0d;
        }
        int i4 = i3;
        float fRound = i2 > 0 ? Math.round(dL / ((double) i2)) : 0.0f;
        float fRound2 = i > 0 ? Math.round(d2 / ((double) i)) : 0.0f;
        float fRound3 = i4 > 0 ? Math.round(d3 / ((double) i4)) : 0.0f;
        if (size == 1) {
            jLongValue = value.get(0).g();
        }
        double d4 = size;
        map.put(Long.valueOf(jLongValue), new fsq(Math.round(dM / d4), Math.round(dO / d4), fRound, size, fRound2, fRound3));
    }
}
