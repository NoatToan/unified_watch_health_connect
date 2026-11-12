package com.huawei.ui.main.stories.health.fragment.rqpackage;

import android.content.Context;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.fitnessdatatype.Vo2maxDetail;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.linechart.utils.ResponseCallback;
import defpackage.coq;
import defpackage.ieg;
import defpackage.ltb;
import defpackage.nkb;
import defpackage.qmq;
import defpackage.wka;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class RqLineVo2maxChartStorageHelper implements IChartStorageHelper {
    private OnVo2maxDataChangeListener e;

    public interface OnVo2maxDataChangeListener {
        void dataChange();
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper
    public void queryStepDayData(Context context, long j, long j2, DataInfos dataInfos, HwHealthChartHolder.c cVar, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        c(j, j2, dataInfos, responseCallback);
    }

    private void c(long j, long j2, final DataInfos dataInfos, final ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        nkb.d().i(j, j2, new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.health.fragment.rqpackage.RqLineVo2maxChartStorageHelper.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (obj instanceof List) {
                    RqLineVo2maxChartStorageHelper.this.c((List) obj, dataInfos, responseCallback);
                } else {
                    responseCallback.onResult(0, new HashMap());
                }
                if (RqLineVo2maxChartStorageHelper.this.e != null) {
                    RqLineVo2maxChartStorageHelper.this.e.dataChange();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<Vo2maxDetail> list, DataInfos dataInfos, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        long jH;
        Map<Long, IStorageModel> map = new HashMap<>();
        if (coq.d(list)) {
            responseCallback.onResult(0, map);
            LogUtil.a("Track_RqLineVo2maxChartStorageHelper", "list is empty");
            return;
        }
        if (dataInfos == DataInfos.Vo2maxYearDetail) {
            list = b(list);
        }
        for (Vo2maxDetail vo2maxDetail : list) {
            if (vo2maxDetail != null) {
                qmq qmqVar = new qmq(1.0f);
                qmqVar.d(vo2maxDetail.getVo2maxValue());
                if (dataInfos == DataInfos.Vo2maxYearDetail) {
                    jH = wka.c(new Date(vo2maxDetail.getTimestamp())).getTime();
                } else {
                    jH = ltb.h(vo2maxDetail.getTimestamp());
                }
                map.put(Long.valueOf(jH), qmqVar);
            }
        }
        responseCallback.onResult(0, map);
    }

    private List<Vo2maxDetail> b(List<Vo2maxDetail> list) {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Vo2maxDetail vo2maxDetail : list) {
            if (vo2maxDetail != null) {
                String strD = ieg.d(new Date(vo2maxDetail.getTimestamp()), "yyyyMM");
                if (map.containsKey(strD) && map.get(strD) != null) {
                    if (vo2maxDetail.getVo2maxValue() > ((Vo2maxDetail) map.get(strD)).getVo2maxValue()) {
                        map.put(strD, vo2maxDetail);
                    }
                } else {
                    map.put(strD, vo2maxDetail);
                }
            }
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((Vo2maxDetail) ((Map.Entry) it.next()).getValue());
        }
        return arrayList;
    }

    public void a(OnVo2maxDataChangeListener onVo2maxDataChangeListener) {
        this.e = onVo2maxDataChangeListener;
    }
}
