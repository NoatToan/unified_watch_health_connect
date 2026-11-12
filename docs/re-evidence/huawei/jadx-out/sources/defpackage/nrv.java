package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSportStatDataAggregateOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwonesdk.process.HiHealthProcess;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class nrv implements HiHealthProcess {
    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public HiSportStatDataAggregateOption preProcess(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.c("HiHealthProcess_aggregateSportData", "preProcess input is empty");
            return null;
        }
        nqr nqrVar = (nqr) peh.b(str, nqr.class);
        int i = 0;
        if (nqrVar == null || nqrVar.a() == null) {
            LogUtil.c("HiHealthProcess_aggregateSportData", "request is null ? ", Boolean.valueOf(nqrVar == null));
            return null;
        }
        int i2 = nqrVar.a().getmId();
        HiSportStatDataAggregateOption hiSportStatDataAggregateOption = new HiSportStatDataAggregateOption();
        hiSportStatDataAggregateOption.setSortOrder(1);
        hiSportStatDataAggregateOption.setStartTime(nqrVar.m());
        hiSportStatDataAggregateOption.setEndTime(nqrVar.j());
        hiSportStatDataAggregateOption.setAggregateType(1);
        hiSportStatDataAggregateOption.setGroupUnitType(5);
        hiSportStatDataAggregateOption.setReadType(0);
        hiSportStatDataAggregateOption.setHiHealthTypes(new int[]{30001});
        int[] iArrL = nqrVar.l();
        ArrayList arrayList = new ArrayList(iArrL.length);
        for (int i3 : iArrL) {
            arrayList.add(Integer.valueOf(i3));
        }
        Map<Integer, String> mapE = nqj.a().e(i2, nqrVar.n(), arrayList, nqrVar.d());
        Set<Integer> setKeySet = mapE.keySet();
        int[] iArr = new int[setKeySet.size()];
        String[] strArr = new String[setKeySet.size()];
        for (Integer num : setKeySet) {
            iArr[i] = num.intValue();
            strArr[i] = mapE.get(num);
            i++;
        }
        hiSportStatDataAggregateOption.setType(iArr);
        hiSportStatDataAggregateOption.setConstantsKey(strArr);
        return hiSportStatDataAggregateOption;
    }

    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    public void doAction(String str, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.c("HiHealthProcess_aggregateSportData", "doAction callback is null");
            return;
        }
        HiSportStatDataAggregateOption hiSportStatDataAggregateOptionPreProcess = preProcess(str);
        if (hiSportStatDataAggregateOptionPreProcess == null) {
            LogUtil.c("HiHealthProcess_aggregateSportData", "options is empty");
            iBaseResponseCallback.a(-1, "");
        } else {
            LogUtil.a("HiHealthProcess_aggregateSportData", "options ", hiSportStatDataAggregateOptionPreProcess);
            HiHealthManager.d(BaseApplication.b()).aggregateSportStatData(hiSportStatDataAggregateOptionPreProcess, new e(this, str, iBaseResponseCallback));
        }
    }

    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    public String postProcess(Object obj, Object obj2) {
        if (obj == null || !(obj instanceof List) || !(obj2 instanceof nqr)) {
            LogUtil.d("HiHealthProcess_aggregateSportData", "postProcess no valid data available");
            return "";
        }
        ArrayList<nri> arrayList = new ArrayList<>();
        b((List) obj, (nqr) obj2, arrayList);
        LogUtil.a("HiHealthProcess_aggregateSportData", "postProcess arkUiHealthDataList is ", peh.c(arrayList));
        return peh.c(arrayList);
    }

    private void b(List<HiHealthData> list, nqr nqrVar, ArrayList<nri> arrayList) {
        Object obj;
        if (njy.e(list)) {
            LogUtil.c("HiHealthProcess_aggregateSportData", "matchAggregateArkUiData hiHealthDataList is empty");
            return;
        }
        List<String> listD = nqrVar.d();
        if (njy.e(listD)) {
            LogUtil.d("HiHealthProcess_aggregateSportData", "matchAggregateArkUiData constantsKeys is empty");
            return;
        }
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData == null || hiHealthData.getValueHolder() == null) {
                LogUtil.d("HiHealthProcess_aggregateSportData", "matchAggregateArkUiData hiHealthData is invalid");
            } else {
                ContentValues valueHolder = hiHealthData.getValueHolder();
                nri nriVar = new nri(hiHealthData);
                HashMap map = new HashMap();
                nriVar.d(map);
                arrayList.add(nriVar);
                for (String str : listD) {
                    if (str != null && (obj = valueHolder.get(str)) != null) {
                        map.put(str, obj);
                    } else {
                        map.put(str, 0);
                    }
                }
            }
        }
    }

    static class e implements HiAggregateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f43557b;
        private final nrv d;
        private final IBaseResponseCallback e;

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
        }

        e(nrv nrvVar, String str, IBaseResponseCallback iBaseResponseCallback) {
            this.d = nrvVar;
            this.f43557b = str;
            this.e = iBaseResponseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(final List<HiHealthData> list, int i, int i2) {
            LogUtil.a("HiHealthProcess_aggregateSportData", "aggregateSportStatData success, data is ", list);
            if (this.e == null) {
                ReleaseLogUtil.a("HiHealthProcess_aggregateSportData", "doAction callback is null");
            } else if (this.d == null) {
                LogUtil.d("HiHealthProcess_aggregateSportData", "process is null");
                this.e.a(-1, "");
            } else {
                final nqr nqrVar = (nqr) peh.b(this.f43557b, nqr.class);
                ThreadPoolManager.c().execute(new Runnable() { // from class: nru
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f43556b.e(list, nqrVar);
                    }
                });
            }
        }

        /* synthetic */ void e(List list, nqr nqrVar) {
            this.e.a(0, this.d.postProcess(list, nqrVar));
        }
    }
}
