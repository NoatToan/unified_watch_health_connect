package defpackage;

import android.content.Context;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.linechart.utils.ResponseCallback;
import health.compact.a.LogUtil;
import health.compact.a.ReflectionUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public class ftq implements IChartStorageHelper {
    private static ftq e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IChartStorageHelper f34558c;

    private ftq() {
        c();
    }

    public static ftq e() {
        ftq ftqVar;
        ftq ftqVar2 = e;
        if (ftqVar2 != null) {
            return ftqVar2;
        }
        synchronized (ftq.class) {
            if (e == null) {
                e = new ftq();
            }
            ftqVar = e;
        }
        return ftqVar;
    }

    protected final void c() {
        IChartStorageHelper iChartStorageHelper = (IChartStorageHelper) ReflectionUtils.a("com.huawei.ui.main.stories.fitness.activity.heartrate.helper.HeartRateStorageHelper");
        this.f34558c = iChartStorageHelper;
        if (iChartStorageHelper != null) {
            LogUtil.b("HeartRateHelperProxy", "create HeartRateHelper success.");
        }
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper
    public void queryStepDayData(Context context, long j, long j2, DataInfos dataInfos, HwHealthChartHolder.c cVar, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        IChartStorageHelper iChartStorageHelper = this.f34558c;
        if (iChartStorageHelper == null) {
            LogUtil.b("HeartRateHelperProxy", "mHeartRateHelperImpl is null");
        } else {
            iChartStorageHelper.queryStepDayData(context, j, j2, dataInfos, cVar, responseCallback);
        }
    }
}
