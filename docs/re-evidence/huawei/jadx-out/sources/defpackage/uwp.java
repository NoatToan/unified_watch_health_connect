package defpackage;

import com.huawei.hihealth.HiHealthData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.model.unite.LacticStatistics;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class uwp {
    private static final jyd d = new jyd();

    public static void a(long j, long j2, final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("LactateThresholdPStorage", "readDetailData callback is null");
        } else {
            d.c(BaseApplication.getContext(), j, j2, 300012, new IBaseResponseCallback() { // from class: uwp.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    iBaseResponseCallback.a(i, obj);
                }
            });
        }
    }

    public static void b(long j, long j2, final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("LactateThresholdPStorage", "readData callback is null");
        } else {
            d.c(BaseApplication.getContext(), j, j2, 300012, new IBaseResponseCallback() { // from class: uwp.3
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (obj == null) {
                        LogUtil.j("LactateThresholdPStorage", "objData is null");
                        iBaseResponseCallback.a(100001, new ArrayList());
                        return;
                    }
                    if (!njy.b(obj, LacticStatistics.class)) {
                        LogUtil.j("LactateThresholdPStorage", "objData is type error");
                        iBaseResponseCallback.a(100001, new ArrayList());
                        return;
                    }
                    List list = (List) obj;
                    if (!njy.e(list)) {
                        List listD = uwp.d(list);
                        LogUtil.a("LactateThresholdPStorage", "readData data size = ", Integer.valueOf(listD.size()));
                        iBaseResponseCallback.a(0, listD);
                    } else {
                        LogUtil.j("LactateThresholdPStorage", "lacticStatisticsList is empty");
                        iBaseResponseCallback.a(100001, new ArrayList());
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<HiHealthData> d(List<LacticStatistics> list) {
        ArrayList arrayList = new ArrayList();
        for (LacticStatistics lacticStatistics : list) {
            HiHealthData hiHealthData = new HiHealthData();
            if (lacticStatistics.getStatistics() != null) {
                hiHealthData.putInt("lthrHr", lacticStatistics.getStatistics().getLastLthrHr());
                hiHealthData.putInt("lthrPace", lacticStatistics.getStatistics().getLastLthrPace());
                hiHealthData.setStartTime(lacticStatistics.getGenerateTime());
                arrayList.add(hiHealthData);
            }
        }
        return arrayList;
    }
}
