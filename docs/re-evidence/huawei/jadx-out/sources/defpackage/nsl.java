package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
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
public class nsl implements HiHealthProcess {
    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<Integer> preProcess(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("HiHealthProcess__unSubscribeData", "preProcess request is empty");
            return Collections.EMPTY_LIST;
        }
        List<DataType> listC = peh.c(str, DataType[].class);
        if (CollectionUtils.a(listC)) {
            LogUtil.e("HiHealthProcess__unSubscribeData", "dataTypeList is", listC);
            return Collections.EMPTY_LIST;
        }
        int[] iArrC = CommonUtil.c(nqj.a().d(c(listC)));
        ArrayList arrayList = new ArrayList(10);
        for (int i : iArrC) {
            Integer.valueOf(i).getClass();
            int iD = HiSubscribeType.d(i);
            if (HiSubscribeType.b(iD) && !arrayList.contains(Integer.valueOf(iD))) {
                arrayList.add(Integer.valueOf(iD));
            }
        }
        LogUtil.a("HiHealthProcess__unSubscribeData", "unsubscribeList is ", arrayList);
        return arrayList;
    }

    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    public String postProcess(Object obj, Object obj2) {
        if (obj == null || !(obj instanceof DataType) || !(obj2 instanceof Boolean)) {
            LogUtil.j("HiHealthProcess__unSubscribeData", "postProcess null");
            return "";
        }
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        DataChangeEvent dataChangeEvent = new DataChangeEvent();
        dataChangeEvent.setDataType((DataType) obj);
        dataChangeEvent.setUnsubscribeRes(zBooleanValue);
        return peh.c(dataChangeEvent);
    }

    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    public void doAction(String str, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.e("HiHealthProcess__unSubscribeData", "doAction callback is null");
            return;
        }
        List<Integer> listPreProcess = preProcess(str);
        if (CollectionUtils.a(listPreProcess)) {
            LogUtil.a("HiHealthProcess__unSubscribeData", "dataType is empty");
            iBaseResponseCallback.a(-1, "");
        } else {
            HiHealthManager.d(BaseApplication.b()).unSubscribeHiHealthData(listPreProcess, new e(this, iBaseResponseCallback));
        }
    }

    static class e implements HiUnSubscribeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final IBaseResponseCallback f43593b;
        private final WeakReference<nsl> e;

        public e(nsl nslVar, IBaseResponseCallback iBaseResponseCallback) {
            this.e = new WeakReference<>(nslVar);
            this.f43593b = iBaseResponseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
        public void onResult(boolean z) {
            if (this.f43593b == null) {
                LogUtil.e("HiHealthProcess__unSubscribeData", "callback is null");
                return;
            }
            nsl nslVar = this.e.get();
            if (nslVar != null) {
                this.f43593b.a(0, nslVar.postProcess(new DataType(0, ""), Boolean.valueOf(z)));
            } else {
                LogUtil.e("HiHealthProcess__unSubscribeData", "process is null");
            }
        }
    }

    private int[] c(List<DataType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<DataType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().getmId()));
        }
        return CommonUtil.c((List<Integer>) arrayList);
    }
}
