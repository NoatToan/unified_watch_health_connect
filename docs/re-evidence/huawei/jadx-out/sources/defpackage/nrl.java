package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.gson.JsonObject;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataAggregateProOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListenerEx;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.model.HiHealthDictType;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwonesdk.datastructure.request.DataType;
import com.huawei.hwonesdk.process.HiHealthProcess;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class nrl implements HiHealthProcess {
    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<HiDataAggregateProOption> preProcess(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.a("HiHealthProcess_aggregateData", "preProcess request is empty");
            return null;
        }
        List<nqo> listE = e(str);
        if (listE.isEmpty()) {
            ReleaseLogUtil.a("HiHealthProcess_aggregateData", "aggregateRequest is null");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (nqo nqoVar : listE) {
            Iterator<nqo.c> it = nqoVar.f().iterator();
            while (it.hasNext()) {
                b(it.next(), nqoVar, arrayList);
            }
        }
        LogUtil.a("HiHealthProcess_aggregateData", "build Options times = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return arrayList;
    }

    private void b(nqo.c cVar, nqo nqoVar, List<HiDataAggregateProOption> list) {
        for (Integer num : cVar.e()) {
            HiAggregateOption hiAggregateOption = new HiAggregateOption();
            int iD = nqj.a().d(nqoVar, cVar.a(), num.intValue());
            if (iD != -1) {
                hiAggregateOption.setType(new int[]{iD});
                hiAggregateOption.setAggregateType(nqj.a().c(num.intValue()));
            } else {
                hiAggregateOption.setAggregateType(num.intValue());
                hiAggregateOption.setType(nqj.a().e(nqoVar.d().getmId(), cVar.a()));
            }
            hiAggregateOption.setConstantsKey(new String[]{cVar.a()});
            if (hiAggregateOption.getType().length != hiAggregateOption.getConstantsKey().length) {
                LogUtil.d("HiHealthProcess_aggregateData", "length is not match,", hiAggregateOption);
            } else {
                HiDataAggregateProOption hiDataAggregateProOptionA = a(nqoVar, hiAggregateOption);
                if (hiDataAggregateProOptionA != null) {
                    list.add(hiDataAggregateProOptionA);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<nqo> e(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.startsWith("[") && str.endsWith("]")) {
            arrayList.addAll(peh.c(str, nqo[].class));
            return arrayList;
        }
        arrayList.add((nqo) peh.b(str, nqo.class));
        return arrayList;
    }

    private HiDataAggregateProOption a(nqo nqoVar, HiAggregateOption hiAggregateOption) {
        try {
            hiAggregateOption.setTimeInterval(DateFormatUtil.d(DateFormatUtil.d(nqoVar.g(), DateFormatUtil.DateFormatType.DATE_FORMAT_MDY).getTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_8), DateFormatUtil.d(DateFormatUtil.d(nqoVar.c(), DateFormatUtil.DateFormatType.DATE_FORMAT_MDY).getTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_8), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
            hiAggregateOption.setGroupUnitType(nqoVar.e().b());
            hiAggregateOption.setGroupUnitSize(nqoVar.e().c());
            hiAggregateOption.setSortOrder(nqoVar.h());
            hiAggregateOption.setCount(nqoVar.b());
            if (nqoVar.a() != null && !"matchAll".equals(nqoVar.a().b())) {
                hiAggregateOption.setDeviceUuid(nqoVar.a().b());
                hiAggregateOption.setReadType(2);
            }
            return HiDataAggregateProOption.builder().c(hiAggregateOption).e();
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    public String postProcess(Object obj, Object obj2) {
        if (obj == null || !(obj instanceof SparseArray) || !(obj2 instanceof List)) {
            LogUtil.d("HiHealthProcess_aggregateData", "postProcess null");
            return "";
        }
        List<nqo> list = (List) obj2;
        SparseArray sparseArray = (SparseArray) obj;
        ArrayList<nrh> arrayList = new ArrayList<>();
        Map<Integer, JsonObject> mapC = c(list);
        for (nqo nqoVar : list) {
            for (Map.Entry<Integer, JsonObject> entry : mapC.entrySet()) {
                List<HiHealthData> list2 = (List) sparseArray.get(entry.getKey().intValue());
                if (!njy.e(list2)) {
                    a(list2, nqoVar.d().getmId(), entry.getValue(), arrayList, nqoVar.e().b());
                }
            }
            nqk.b(arrayList, nqoVar.h());
        }
        LogUtil.a("HiHealthProcess_aggregateData", "arkUiDataList is ", peh.c(arrayList));
        return peh.c(arrayList);
    }

    public Map<Integer, JsonObject> c(List<nqo> list) {
        HashMap map = new HashMap();
        int i = 0;
        for (nqo nqoVar : list) {
            for (nqo.c cVar : nqoVar.f()) {
                for (String str : cVar.d()) {
                    JsonObject jsonObject = new JsonObject();
                    int iD = nqj.a().d(nqoVar, cVar.a(), nqk.e(str));
                    String str2 = nqk.g;
                    if (iD == -1) {
                        iD = nqj.a().e(nqoVar.d().getmId(), cVar.a())[0];
                    }
                    jsonObject.addProperty(str2, Integer.valueOf(iD));
                    jsonObject.addProperty(nqk.f43453a, cVar.a());
                    jsonObject.addProperty(nqk.f43454b, str);
                    jsonObject.addProperty(nqk.d, Integer.valueOf(nqoVar.d().getmId()));
                    map.put(Integer.valueOf(i), jsonObject);
                    i++;
                }
            }
        }
        return map;
    }

    private void a(List<HiHealthData> list, int i, JsonObject jsonObject, ArrayList<nrh> arrayList, int i2) {
        if (i != jsonObject.get(nqk.d).getAsInt()) {
            return;
        }
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                int type = hiHealthData.getType();
                HiHealthDictType hiHealthDictTypeI = HiHealthDictManager.a((Context) null).i(type);
                if (type == jsonObject.get(nqk.g).getAsInt() || ((hiHealthDictTypeI != null && hiHealthDictTypeI.l() == jsonObject.get(nqk.g).getAsInt()) || e(jsonObject, i2))) {
                    nrh nrhVarA = nqk.a(arrayList, hiHealthData, i2, i);
                    nrg nrgVar = new nrg();
                    if (nrhVarA == null) {
                        nrhVarA = new nrh(hiHealthData);
                        nrhVarA.d(new DataType(i, nqj.a().b(i)));
                        arrayList.add(nrhVarA);
                    } else {
                        nrgVar = nrhVarA.d(jsonObject.get(nqk.f43453a).getAsString());
                    }
                    nqk.d(nrgVar, jsonObject.get(nqk.f43454b).getAsString(), jsonObject.get(nqk.f43453a).getAsString(), hiHealthData);
                    nrhVarA.c(jsonObject.get(nqk.f43453a).getAsString(), nrgVar);
                }
            }
        }
    }

    private boolean e(JsonObject jsonObject, int i) {
        nqq.e eVarA;
        int iE = nqk.e(jsonObject.get(nqk.f43454b).getAsString());
        int asInt = jsonObject.get(nqk.d).getAsInt();
        String asString = jsonObject.get(nqk.f43453a).getAsString();
        if (i < 3 || (!(iE == 4 || iE == 5) || (eVarA = nqj.a().a(asInt)) == null)) {
            return false;
        }
        for (nqq.e.a aVar : eVarA.b()) {
            if (asString.equals(aVar.e())) {
                List<nqq.e.a.b> listI = aVar.i();
                if (CollectionUtils.a(listI)) {
                    continue;
                } else {
                    Iterator<nqq.e.a.b> it = listI.iterator();
                    while (it.hasNext()) {
                        if (nqk.e(it.next().a()) == iE) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    public void doAction(String str, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.a("HiHealthProcess_aggregateData", "doAction callback is null");
            return;
        }
        List<HiDataAggregateProOption> listPreProcess = preProcess(str);
        if (njy.e(listPreProcess)) {
            LogUtil.c("HiHealthProcess_aggregateData", "HiDataAggregateProOption list is empty");
            iBaseResponseCallback.a(-1, "");
        } else {
            LogUtil.a("HiHealthProcess_aggregateData", "aggregateHiHealthDataProEx ", listPreProcess);
            HiHealthManager.d(BaseApplication.b()).aggregateHiHealthDataProEx(listPreProcess, new b(this, str, iBaseResponseCallback));
        }
    }

    static class b implements HiAggregateListenerEx {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final IBaseResponseCallback f43539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final nrl f43540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f43541c;

        b(nrl nrlVar, String str, IBaseResponseCallback iBaseResponseCallback) {
            this.f43540b = nrlVar;
            this.f43541c = str;
            this.f43539a = iBaseResponseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListenerEx
        public void onResult(final SparseArray<List<HiHealthData>> sparseArray, int i, int i2) {
            LogUtil.a("HiHealthProcess_aggregateData", "aggregateHiHealthDataProEx success, data is ", sparseArray);
            if (this.f43539a == null) {
                ReleaseLogUtil.a("HiHealthProcess_aggregateData", "doAction callback is null");
            } else if (this.f43540b == null) {
                LogUtil.d("HiHealthProcess_aggregateData", "process is null");
                this.f43539a.a(-1, "");
            } else {
                ThreadPoolManager.c().execute(new Runnable() { // from class: nrq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f43549a.d(sparseArray);
                    }
                });
            }
        }

        /* synthetic */ void d(SparseArray sparseArray) {
            IBaseResponseCallback iBaseResponseCallback = this.f43539a;
            nrl nrlVar = this.f43540b;
            iBaseResponseCallback.a(0, nrlVar.postProcess(sparseArray, nrlVar.e(this.f43541c)));
        }
    }
}
