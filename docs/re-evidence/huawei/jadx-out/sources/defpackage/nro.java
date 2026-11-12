package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSportStatDataAggregateOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwonesdk.process.HiHealthProcess;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class nro implements HiHealthProcess {
    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    public void doAction(String str, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("R_HiHealthProcess_aggregateSportData", "Enter AggregateSportDataProcess");
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.a("HiHealthProcess_aggregateSportData", "doAction callback is null");
            return;
        }
        HiSportStatDataAggregateOption hiSportStatDataAggregateOptionPreProcess = preProcess(str);
        if (hiSportStatDataAggregateOptionPreProcess == null) {
            LogUtil.c("HiHealthProcess_aggregateSportData", "HiSportStatDataAggregateOption is empty");
            iBaseResponseCallback.a(-1, "");
        } else {
            LogUtil.a("HiHealthProcess_aggregateSportData", "aggregateHiHealthDataProEx ", hiSportStatDataAggregateOptionPreProcess);
            HiHealthManager.d(BaseApplication.b()).aggregateSportStatData(hiSportStatDataAggregateOptionPreProcess, new c(this, str, iBaseResponseCallback));
        }
    }

    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public HiSportStatDataAggregateOption preProcess(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.a("HiHealthProcess_aggregateSportData", "preProcess request is empty");
            return null;
        }
        List<nqo> listE = e(str);
        if (njy.e(listE)) {
            ReleaseLogUtil.a("HiHealthProcess_aggregateSportData", "aggregateRequest is null");
            return null;
        }
        HiSportStatDataAggregateOption hiSportStatDataAggregateOption = new HiSportStatDataAggregateOption();
        long jCurrentTimeMillis = System.currentTimeMillis();
        b(listE.get(0), hiSportStatDataAggregateOption);
        LogUtil.a("HiHealthProcess_aggregateSportData", "build Options times = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return hiSportStatDataAggregateOption;
    }

    private void b(nqo nqoVar, HiSportStatDataAggregateOption hiSportStatDataAggregateOption) {
        hiSportStatDataAggregateOption.setReadType(0);
        hiSportStatDataAggregateOption.setConstantsKey(new String[]{"Value"});
        hiSportStatDataAggregateOption.setHiHealthTypes(nqoVar.i());
        hiSportStatDataAggregateOption.setType(nqoVar.j());
        hiSportStatDataAggregateOption.setAggregateType(1);
        a(nqoVar, hiSportStatDataAggregateOption);
        hiSportStatDataAggregateOption.setGroupUnitType(3);
    }

    private void a(nqo nqoVar, HiSportStatDataAggregateOption hiSportStatDataAggregateOption) {
        try {
            hiSportStatDataAggregateOption.setTimeRange(DateFormatUtil.d(nqoVar.g(), DateFormatUtil.DateFormatType.DATE_FORMAT_MDY).getTime(), lsl.c(DateFormatUtil.d(nqoVar.c(), DateFormatUtil.DateFormatType.DATE_FORMAT_MDY).getTime()));
        } catch (ParseException e) {
            LogUtil.c("HiHealthProcess_aggregateSportData", "dateFormat ParseException", ExceptionUtils.c(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<nqo> e(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.startsWith("[") && str.endsWith("]")) {
                arrayList.addAll(peh.c(str, nqo[].class));
                return arrayList;
            }
            arrayList.add((nqo) peh.b(str, nqo.class));
            return arrayList;
        } catch (Exception e) {
            LogUtil.c("HiHealthProcess_aggregateSportData", "getAggregateDataRequests exception: ", ExceptionUtils.c(e));
            arrayList.clear();
            return arrayList;
        }
    }

    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    public String postProcess(Object obj, Object obj2) {
        if (obj == null || !(obj instanceof List) || !(obj2 instanceof List)) {
            LogUtil.d("HiHealthProcess_aggregateSportData", "postProcess null");
            return "";
        }
        ArrayList<nrh> arrayList = new ArrayList<>();
        nqo nqoVar = (nqo) ((List) obj2).get(0);
        c((List) obj, nqoVar, arrayList);
        nqk.b(arrayList, nqoVar.h());
        LogUtil.a("HiHealthProcess_aggregateSportData", "arkUiDataList is ", peh.c(arrayList));
        return peh.c(arrayList);
    }

    private void c(List<HiHealthData> list, nqo nqoVar, ArrayList<nrh> arrayList) {
        nqo.c cVar = nqoVar.f().get(0);
        String strA = cVar.a();
        String str = cVar.d().get(0);
        for (HiHealthData hiHealthData : list) {
            nrh nrhVar = new nrh(hiHealthData);
            nrhVar.c(a(strA, str, Double.valueOf(hiHealthData.getDouble("Value"))));
            nrhVar.c(DateFormatUtil.e(hiHealthData.getStartTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_MDY));
            nrhVar.d(nqoVar.d());
            arrayList.add(nrhVar);
        }
    }

    private Map<String, Object> a(String str, String str2, Object obj) {
        HashMap map = new HashMap();
        map.put(str2, obj);
        HashMap map2 = new HashMap();
        map2.put(str, map);
        return map2;
    }

    static class c implements HiAggregateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final IBaseResponseCallback f43546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final nro f43547c;
        private final String d;

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
        }

        c(nro nroVar, String str, IBaseResponseCallback iBaseResponseCallback) {
            this.f43547c = nroVar;
            this.d = str;
            this.f43546b = iBaseResponseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(final List<HiHealthData> list, int i, int i2) {
            LogUtil.a("HiHealthProcess_aggregateSportData", "aggregateSportStatData success, data is ", list);
            if (this.f43546b == null) {
                ReleaseLogUtil.a("HiHealthProcess_aggregateSportData", "doAction callback is null");
            } else if (this.f43547c == null) {
                LogUtil.d("HiHealthProcess_aggregateSportData", "process is null");
                this.f43546b.a(-1, "");
            } else {
                ThreadPoolManager.c().execute(new Runnable() { // from class: nrr
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e.c(list);
                    }
                });
            }
        }

        /* synthetic */ void c(List list) {
            IBaseResponseCallback iBaseResponseCallback = this.f43546b;
            nro nroVar = this.f43547c;
            iBaseResponseCallback.a(0, nroVar.postProcess(list, nroVar.e(this.d)));
        }
    }
}
