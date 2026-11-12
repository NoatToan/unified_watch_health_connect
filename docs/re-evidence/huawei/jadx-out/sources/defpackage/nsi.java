package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.type.HiSubscribeType;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwonesdk.datastructure.request.DataType;
import com.huawei.hwonesdk.datastructure.response.DataChangeEvent;
import com.huawei.hwonesdk.process.HiHealthProcess;
import health.compact.a.CommonUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class nsi implements HiHealthProcess {
    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public List<Integer> preProcess(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("HiHealthProcess__subscribeData", "preProcess request is empty");
            return Collections.EMPTY_LIST;
        }
        List<DataType> listC = peh.c(str, DataType[].class);
        if (CollectionUtils.a(listC)) {
            LogUtil.e("HiHealthProcess__subscribeData", "dataTypeList is empty");
            return Collections.EMPTY_LIST;
        }
        LogUtil.a("HiHealthProcess__subscribeData", "dataTypeList is ", listC);
        int[] iArrC = CommonUtil.c(nqj.a().d(d(listC)));
        ArrayList arrayList = new ArrayList(10);
        for (int i : iArrC) {
            Integer.valueOf(i).getClass();
            int iD = HiSubscribeType.d(i);
            if (HiSubscribeType.b(iD) && !arrayList.contains(Integer.valueOf(iD))) {
                arrayList.add(Integer.valueOf(iD));
            }
        }
        LogUtil.a("HiHealthProcess__subscribeData", "subscribeList is ", arrayList);
        return arrayList;
    }

    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    public String postProcess(Object obj, Object obj2) {
        if (!(obj instanceof Integer) || !(obj2 instanceof Long)) {
            LogUtil.j("HiHealthProcess__subscribeData", "postProcess null");
            return "";
        }
        int iIntValue = ((Integer) obj).intValue();
        long jLongValue = ((Long) obj2).longValue();
        DataType dataType = new DataType(iIntValue, "");
        ArrayList arrayList = new ArrayList();
        DataChangeEvent dataChangeEvent = new DataChangeEvent();
        dataChangeEvent.setDataTimeRange(dataType, jLongValue, jLongValue);
        dataChangeEvent.setDataType(dataType);
        arrayList.add(dataChangeEvent);
        LogUtil.a("HiHealthProcess__subscribeData", "dataChangeEvent is ", peh.c(arrayList));
        return peh.c(arrayList);
    }

    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    public void doAction(String str, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.e("HiHealthProcess__subscribeData", "doAction callback is null");
            return;
        }
        List<Integer> listPreProcess = preProcess(str);
        if (CollectionUtils.a(listPreProcess)) {
            LogUtil.a("HiHealthProcess__subscribeData", "dataType is empty");
            iBaseResponseCallback.a(-1, "");
        } else {
            HiHealthManager.d(BaseApplication.b()).subscribeHiHealthData(listPreProcess, new d(this, iBaseResponseCallback));
        }
    }

    static class d implements HiSubscribeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<nsi> f43586a;
        private final IBaseResponseCallback d;

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
        }

        public d(nsi nsiVar, IBaseResponseCallback iBaseResponseCallback) {
            this.f43586a = new WeakReference<>(nsiVar);
            this.d = iBaseResponseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            if (this.d == null) {
                LogUtil.e("HiHealthProcess__subscribeData", "callback is null");
                return;
            }
            LogUtil.a("HiHealthProcess__subscribeData", "data change type is ", Integer.valueOf(i));
            nsi nsiVar = this.f43586a.get();
            if (nsiVar != null) {
                this.d.a(0, nsiVar.postProcess(Integer.valueOf(i), Long.valueOf(j)));
            } else {
                LogUtil.e("HiHealthProcess__subscribeData", "process is null");
            }
        }
    }

    private int[] d(List<DataType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<DataType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().getmId()));
        }
        return CommonUtil.c((List<Integer>) arrayList);
    }
}
