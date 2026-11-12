package com.huawei.ui.main.stories.health.fragment.rqpackage;

import android.content.Context;
import com.huawei.hwcloudmodel.model.unite.GetRunLevelReq;
import com.huawei.hwcloudmodel.model.unite.GetRunLevelRsp;
import com.huawei.hwcloudmodel.model.unite.RunLevelDetail;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.linechart.utils.ResponseCallback;
import com.huawei.ui.main.stories.health.interactors.healthdata.StateIndexDayData;
import defpackage.ieg;
import defpackage.lqo;
import defpackage.ltb;
import defpackage.qmq;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class RqLineStateChartStorageHelper implements IChartStorageHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OnUserRunLevelDataChangeListener f27935c;
    private int e;

    public interface OnUserRunLevelDataChangeListener {
        void updateData(Map<Integer, RunLevelDetail> map, boolean z, int i, int i2);
    }

    public RqLineStateChartStorageHelper(int i) {
        this.e = i;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper
    public void queryStepDayData(Context context, long j, long j2, DataInfos dataInfos, HwHealthChartHolder.c cVar, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        d(context, j, j2, dataInfos, responseCallback);
    }

    private void d(Context context, long j, long j2, final DataInfos dataInfos, final ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        GetRunLevelReq getRunLevelReq = new GetRunLevelReq();
        if (j2 > System.currentTimeMillis()) {
            j2 = System.currentTimeMillis();
        }
        final int iB = ieg.b(j);
        final int iB2 = ieg.b(j2);
        getRunLevelReq.setStartDay(iB);
        getRunLevelReq.setEndDay(iB2);
        getRunLevelReq.setQueryType(0);
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
        getRunLevelReq.setTypes(hashSet);
        getRunLevelReq.setTimeZone(ieg.d());
        lqo.b(context.getApplicationContext()).c(getRunLevelReq, new ResultCallback<GetRunLevelRsp>() { // from class: com.huawei.ui.main.stories.health.fragment.rqpackage.RqLineStateChartStorageHelper.3
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(GetRunLevelRsp getRunLevelRsp) {
                if (getRunLevelRsp == null) {
                    LogUtil.j("Track_RqLineStateChartStorageHelper", "onSuccess response is null");
                    return;
                }
                Map<Integer, RunLevelDetail> data = getRunLevelRsp.getData();
                RqLineStateChartStorageHelper.this.d(responseCallback, data);
                if (RqLineStateChartStorageHelper.this.f27935c != null) {
                    RqLineStateChartStorageHelper.this.f27935c.updateData(data, dataInfos.isWeekData(), iB, iB2);
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.e("Track_RqLineStateChartStorageHelper", "getRunLevel onFailure:", th.getMessage());
                responseCallback.onResult(-1, Collections.EMPTY_MAP);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ResponseCallback<Map<Long, IStorageModel>> responseCallback, Map<Integer, RunLevelDetail> map) {
        responseCallback.onResult(0, c(map));
    }

    private Map<Long, IStorageModel> c(Map<Integer, RunLevelDetail> map) {
        HashMap map2 = new HashMap();
        if (map != null) {
            for (Map.Entry<Integer, RunLevelDetail> entry : map.entrySet()) {
                long jD = d(entry.getKey().intValue());
                qmq qmqVar = new qmq(1.0f);
                int i = this.e;
                if (i == 0) {
                    qmqVar.d(c(entry.getValue()).getCondition());
                } else if (i == 1) {
                    qmqVar.d(c(entry.getValue()).getFitness());
                } else {
                    qmqVar.d(c(entry.getValue()).getFatigue());
                }
                map2.put(Long.valueOf(jD), qmqVar);
            }
        }
        return map2;
    }

    private StateIndexDayData c(RunLevelDetail runLevelDetail) {
        StateIndexDayData stateIndexDayData = new StateIndexDayData();
        stateIndexDayData.setCondition(runLevelDetail.getCondition());
        stateIndexDayData.setFatigue(runLevelDetail.getFatigue());
        stateIndexDayData.setFitness(runLevelDetail.getFitness());
        return stateIndexDayData;
    }

    private long d(int i) {
        try {
            return ltb.h(new SimpleDateFormat("yyyyMMdd").parse(String.valueOf(i)).getTime());
        } catch (ParseException e) {
            LogUtil.e("Track_RqLineStateChartStorageHelper", e.getMessage());
            return 0L;
        }
    }

    public void b(OnUserRunLevelDataChangeListener onUserRunLevelDataChangeListener) {
        this.f27935c = onUserRunLevelDataChangeListener;
    }
}
