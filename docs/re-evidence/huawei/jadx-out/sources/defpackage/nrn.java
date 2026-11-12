package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataAggregateProOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListenerEx;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwonesdk.process.HiHealthProcess;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class nrn implements HiHealthProcess {
    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<HiDataAggregateProOption> preProcess(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.a("HiHealthProcess_aggregateHealthData", "preProcess request is empty");
            return null;
        }
        return Arrays.asList(c((nqr) peh.b(str, nqr.class), new HiAggregateOption()));
    }

    private HiDataAggregateProOption c(nqr nqrVar, HiAggregateOption hiAggregateOption) {
        if (nqrVar.m() == 0) {
            hiAggregateOption.setTimeInterval(0L, System.currentTimeMillis());
        } else {
            hiAggregateOption.setTimeInterval(nqrVar.m(), nqrVar.j());
        }
        hiAggregateOption.setAggregateType(nqrVar.c());
        hiAggregateOption.setGroupUnitSize(nqrVar.h());
        hiAggregateOption.setType(nqj.a().a(nqrVar.l()));
        hiAggregateOption.setConstantsKey((String[]) nqrVar.d().toArray(new String[0]));
        hiAggregateOption.setGroupUnitType(nqrVar.g());
        hiAggregateOption.setSortOrder(nqrVar.k());
        hiAggregateOption.setAnchor(nqrVar.b());
        hiAggregateOption.setCount(nqrVar.f());
        hiAggregateOption.setReadType(nqrVar.o());
        hiAggregateOption.setDeviceUuid(nqrVar.i());
        if (hiAggregateOption.getType().length != hiAggregateOption.getConstantsKey().length) {
            LogUtil.d("HiHealthProcess_aggregateHealthData", "length is not match,", hiAggregateOption);
            return null;
        }
        return HiDataAggregateProOption.builder().c(hiAggregateOption).e();
    }

    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    public String postProcess(Object obj, Object obj2) {
        if (!(obj instanceof SparseArray) || !(obj2 instanceof nqr)) {
            LogUtil.d("HiHealthProcess_aggregateHealthData", "postProcess null");
            return "";
        }
        nqr nqrVar = (nqr) obj2;
        ArrayList<nri> arrayList = new ArrayList<>();
        Map<Integer, JSONObject> mapE = nqrVar.e();
        List<HiHealthData> list = (List) ((SparseArray) obj).get(0);
        for (Map.Entry<Integer, JSONObject> entry : mapE.entrySet()) {
            a(list, entry.getKey().intValue(), entry.getValue(), arrayList);
        }
        nqk.b(arrayList, nqrVar.k());
        LogUtil.a("HiHealthProcess_aggregateHealthData", "handleAggregateHealthData is ", peh.c(arrayList));
        return peh.c(arrayList);
    }

    private void a(List<HiHealthData> list, int i, JSONObject jSONObject, ArrayList<nri> arrayList) {
        if (CollectionUtils.a(list)) {
            LogUtil.d("HiHealthProcess_aggregateHealthData", "hiHealthDatas is empty");
            return;
        }
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null && hiHealthData.getType() == i) {
                try {
                    nri nriVar = new nri(hiHealthData);
                    for (String str : peh.c(jSONObject.get(nqk.f43453a).toString(), String[].class)) {
                        nriVar.d(str, hiHealthData.get(str));
                    }
                    nriVar.e(0);
                    nriVar.c(jSONObject.getInt(nqk.d));
                    arrayList.add(nriVar);
                } catch (JSONException unused) {
                    LogUtil.c("HiHealthProcess_aggregateHealthData", "JSONException");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public nqr c(String str) {
        return (nqr) peh.b(str, nqr.class);
    }

    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    public void doAction(String str, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.a("HiHealthProcess_aggregateHealthData", "doAction callback is null");
            return;
        }
        List<HiDataAggregateProOption> listPreProcess = preProcess(str);
        if (CollectionUtils.a(listPreProcess)) {
            LogUtil.a("HiHealthProcess_aggregateHealthData", "HiDataAggregateProOption list is empty");
            iBaseResponseCallback.a(-1, "");
        } else {
            HiHealthManager.d(BaseApplication.b()).aggregateHiHealthDataProEx(listPreProcess, new d(this, str, iBaseResponseCallback));
        }
    }

    static class d implements HiAggregateListenerEx {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final nrn f43544a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f43545c;
        private final IBaseResponseCallback e;

        d(nrn nrnVar, String str, IBaseResponseCallback iBaseResponseCallback) {
            this.f43544a = nrnVar;
            this.f43545c = str;
            this.e = iBaseResponseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListenerEx
        public void onResult(final SparseArray<List<HiHealthData>> sparseArray, int i, int i2) {
            LogUtil.a("HiHealthProcess_aggregateHealthData", "aggregateHiHealthDataProEx success, data is ", sparseArray);
            if (this.e == null) {
                LogUtil.d("HiHealthProcess_aggregateHealthData", "callback is null");
            } else if (this.f43544a == null) {
                LogUtil.d("HiHealthProcess_aggregateHealthData", "process is null");
                this.e.a(-1, "");
            } else {
                ThreadPoolManager.c().execute(new Runnable() { // from class: nrp
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f43548b.e(sparseArray);
                    }
                });
            }
        }

        /* synthetic */ void e(SparseArray sparseArray) {
            IBaseResponseCallback iBaseResponseCallback = this.e;
            nrn nrnVar = this.f43544a;
            iBaseResponseCallback.a(0, nrnVar.postProcess(sparseArray, nrnVar.c(this.f43545c)));
        }
    }
}
