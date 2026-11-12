package com.huawei.ui.commonui.linechart.icommon;

import android.content.Context;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.utils.ResponseCallback;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public interface IChartStorageHelper {
    void queryStepDayData(Context context, long j, long j2, DataInfos dataInfos, HwHealthChartHolder.c cVar, ResponseCallback<Map<Long, IStorageModel>> responseCallback);
}
