package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataClientListener;
import com.huawei.hihealth.data.listener.HiMultiDataClientListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwonesdk.datastructure.request.DataType;
import com.huawei.hwonesdk.process.HiHealthProcess;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class nsc implements HiHealthProcess {
    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public List<Integer> preProcess(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("HiHealthProcess_ReadDataSourceProcess", "preProcess input is null");
            return arrayList;
        }
        nqv nqvVar = (nqv) peh.b(str, nqv.class);
        if (nqvVar == null || nqvVar.a() == null) {
            LogUtil.e("HiHealthProcess_ReadDataSourceProcess", "dataSourceRequest is ", nqvVar);
            return arrayList;
        }
        List<DataType> listE = nqvVar.a().e();
        if (CollectionUtils.a(listE)) {
            LogUtil.e("HiHealthProcess_ReadDataSourceProcess", "dataTypes is empty");
            return arrayList;
        }
        Iterator<DataType> it = listE.iterator();
        while (it.hasNext()) {
            arrayList.addAll(nqj.a().d(new int[]{it.next().getmId()}));
        }
        return arrayList;
    }

    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    public String postProcess(Object obj, Object obj2) {
        if (!(obj instanceof List)) {
            LogUtil.j("HiHealthProcess_ReadDataSourceProcess", "postProcess null");
            return "";
        }
        List<HiHealthClient> list = (List) obj;
        if (CollectionUtils.a(list)) {
            LogUtil.j("HiHealthProcess_ReadDataSourceProcess", "hiHealthClients is empty");
            return "";
        }
        if ((obj2 instanceof List) && d((List) obj2)) {
            xjj.a((List<HiHealthClient>) list);
        }
        ArrayList arrayList = new ArrayList();
        for (HiHealthClient hiHealthClient : list) {
            xjj.a(hiHealthClient);
            arrayList.add(new nrf(hiHealthClient));
        }
        LogUtil.a("HiHealthProcess_ReadDataSourceProcess", "arkUiDataSourceResponses is ", peh.c(arrayList));
        return peh.c(arrayList);
    }

    private boolean d(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (iIntValue == 2002 || iIntValue == 2018) {
                return true;
            }
        }
        return false;
    }

    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    public void doAction(String str, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.a("HiHealthProcess_ReadDataSourceProcess", "doAction callback is null");
            return;
        }
        nqv nqvVar = (nqv) peh.b(str, nqv.class);
        if (nqvVar != null && nqvVar.b() != null) {
            HiHealthManager.d(BaseApplication.b()).fetchDataClientByUniqueId(1, nqvVar.b(), new a(this, iBaseResponseCallback));
            return;
        }
        if ("-1".equals(nqvVar.d())) {
            HiHealthManager.d(BaseApplication.b()).fetchRegisteredDataClient(1, new a(this, iBaseResponseCallback));
            return;
        }
        List<Integer> listPreProcess = preProcess(str);
        if (CollectionUtils.a(listPreProcess)) {
            ReleaseLogUtil.a("HiHealthProcess_ReadDataSourceProcess", "types is empty in doAction");
            iBaseResponseCallback.a(-1, "");
        } else {
            HiTimeInterval hiTimeInterval = new HiTimeInterval();
            hiTimeInterval.setStartTime(nqvVar.a().d());
            hiTimeInterval.setEndTime(nqvVar.a().b());
            HiHealthManager.d(BaseApplication.b()).fetchDataSourceByTypes(listPreProcess, hiTimeInterval, true, new d(this, listPreProcess, iBaseResponseCallback));
        }
    }

    static class d implements HiMultiDataClientListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final IBaseResponseCallback f43575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<Integer> f43576b;
        private final nsc e;

        d(nsc nscVar, List<Integer> list, IBaseResponseCallback iBaseResponseCallback) {
            this.e = nscVar;
            this.f43575a = iBaseResponseCallback;
            this.f43576b = list;
        }

        @Override // com.huawei.hihealth.data.listener.HiMultiDataClientListener
        public void onMultiTypeResult(Map<Integer, List<HiHealthClient>> map) {
            LogUtil.a("HiHealthProcess_ReadDataSourceProcess", "onMultiTypeResult:", map.toString());
        }

        @Override // com.huawei.hihealth.data.listener.HiMultiDataClientListener
        public void onMergeTypeResult(List<HiHealthClient> list) {
            LogUtil.a("HiHealthProcess_ReadDataSourceProcess", "onMergeTypeResult:", list);
            if (this.f43575a == null) {
                LogUtil.j("HiHealthProcess_ReadDataSourceProcess", "callback is null");
            } else if (this.e == null || CollectionUtils.a(list)) {
                LogUtil.j("HiHealthProcess_ReadDataSourceProcess", "process is null or no clientList");
                this.f43575a.a(-1, "");
            } else {
                this.f43575a.a(0, this.e.postProcess(list, this.f43576b));
            }
        }
    }

    static class a implements HiDataClientListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final IBaseResponseCallback f43573a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final nsc f43574c;

        a(nsc nscVar, IBaseResponseCallback iBaseResponseCallback) {
            this.f43574c = nscVar;
            this.f43573a = iBaseResponseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataClientListener
        public void onResult(List<HiHealthClient> list) {
            LogUtil.a("HiHealthProcess_ReadDataSourceProcess", "onResult: ", list);
            if (this.f43573a == null) {
                LogUtil.j("HiHealthProcess_ReadDataSourceProcess", "callback is null");
            } else if (this.f43574c == null || CollectionUtils.a(list)) {
                LogUtil.j("HiHealthProcess_ReadDataSourceProcess", "process is null or no clientList");
                this.f43573a.a(-1, "");
            } else {
                this.f43573a.a(0, this.f43574c.postProcess(list, null));
            }
        }
    }
}
