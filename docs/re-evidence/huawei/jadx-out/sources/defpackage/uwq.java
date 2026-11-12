package defpackage;

import android.content.Context;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.model.unite.LacticStatistics;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.linechart.utils.ResponseCallback;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class uwq implements IChartStorageHelper {
    private String d = "lthrHr";

    @Override // com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper
    public void queryStepDayData(Context context, long j, long j2, DataInfos dataInfos, HwHealthChartHolder.c cVar, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        if (dataInfos.isMonthData()) {
            c(j, j2, responseCallback);
        } else {
            a(j, j2, responseCallback);
        }
    }

    private void a(long j, long j2, final ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        final HashMap map = new HashMap(16);
        uwp.a(j, j2, new IBaseResponseCallback() { // from class: uwv
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.d.d(responseCallback, map, i, obj);
            }
        });
    }

    /* synthetic */ void d(ResponseCallback responseCallback, Map map, int i, Object obj) {
        if (i != 0) {
            responseCallback.onResult(100001, map);
            return;
        }
        if (!njy.b(obj, LacticStatistics.class)) {
            LogUtil.j("LacticStorageHelper", "readYearDatas type error");
            responseCallback.onResult(100001, map);
            return;
        }
        List<LacticStatistics> list = (List) obj;
        if (njy.e(list)) {
            LogUtil.j("LacticStorageHelper", "readYearDatas map is empty");
            responseCallback.onResult(100001, map);
        } else {
            b(map, list);
            responseCallback.onResult(0, map);
        }
    }

    private void c(long j, long j2, final ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        final HashMap map = new HashMap(16);
        uwp.b(j, j2, new IBaseResponseCallback() { // from class: uwn
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f50667b.b(responseCallback, map, i, obj);
            }
        });
    }

    /* synthetic */ void b(ResponseCallback responseCallback, Map map, int i, Object obj) {
        if (i != 0) {
            responseCallback.onResult(100001, map);
            return;
        }
        if (!njy.b(obj, HiHealthData.class)) {
            LogUtil.j("LacticStorageHelper", "readData type error");
            responseCallback.onResult(100001, map);
            return;
        }
        List<HiHealthData> list = (List) obj;
        if (njy.e(list)) {
            LogUtil.j("LacticStorageHelper", "readData list is empty");
            responseCallback.onResult(100001, map);
        } else {
            a(map, list);
            responseCallback.onResult(0, map);
        }
    }

    private void a(Map<Long, IStorageModel> map, List<HiHealthData> list) {
        for (HiHealthData hiHealthData : list) {
            long jH = ltb.h(hiHealthData.getStartTime());
            map.put(Long.valueOf(jH), new fsx(hiHealthData.getFloat("lthrHr"), hiHealthData.getFloat("lthrPace"), this.d));
        }
    }

    private void b(Map<Long, IStorageModel> map, List<LacticStatistics> list) {
        if (njy.e(list)) {
            return;
        }
        for (LacticStatistics lacticStatistics : list) {
            long jG = qnh.g(DateFormatUtil.d(lacticStatistics.getRecordDay()));
            if (lacticStatistics.getStatistics() != null) {
                map.put(Long.valueOf(jG), new fsx(lacticStatistics.getStatistics().getLastLthrHr(), lacticStatistics.getStatistics().getLastLthrPace(), this.d));
            }
        }
    }

    public void b(String str) {
        this.d = str;
    }
}
