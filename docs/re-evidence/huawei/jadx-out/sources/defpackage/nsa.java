package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.HiSampleConfigKey;
import com.huawei.hihealth.HiSampleConfigProcessOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwonesdk.datastructure.request.DataType;
import com.huawei.hwonesdk.datastructure.request.SubDataType;
import com.huawei.hwonesdk.process.HiHealthProcess;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class nsa implements HiHealthProcess {
    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    public void doAction(String str, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.a("HiHealthProcess__readConfigData", "doAction callback is null");
            return;
        }
        HiSampleConfigProcessOption hiSampleConfigProcessOptionPreProcess = preProcess(str);
        LogUtil.a("HiHealthProcess__readConfigData", "preProcess ReadConfigDataProcess", hiSampleConfigProcessOptionPreProcess);
        if (hiSampleConfigProcessOptionPreProcess == null) {
            iBaseResponseCallback.a(0, "[]");
            ReleaseLogUtil.a("HiHealthProcess__readConfigData", "doAction option is null");
        } else {
            HiHealthManager.d(BaseApplication.b()).getSampleConfig(hiSampleConfigProcessOptionPreProcess, new c(this, str, iBaseResponseCallback));
        }
    }

    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public HiSampleConfigProcessOption preProcess(String str) {
        ReleaseLogUtil.d("R_HiHealthProcess__readConfigData", "Enter ReadConfigDataProcess");
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.a("HiHealthProcess__readConfigData", "preProcess request is empty");
            return null;
        }
        nqx nqxVar = (nqx) peh.b(str, nqx.class);
        if (nqxVar == null) {
            ReleaseLogUtil.a("HiHealthProcess__readConfigData", "SampleConfigReadRequest is null");
            return null;
        }
        DataType dataTypeL = nqxVar.l();
        SubDataType subDataTypeK = nqxVar.k();
        if (dataTypeL == null || subDataTypeK == null) {
            ReleaseLogUtil.a("HiHealthProcess__readConfigData", "request is empty");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        HiSampleConfigKey.Builder builder = new HiSampleConfigKey.Builder();
        builder.c(String.valueOf(0));
        builder.d(String.valueOf(0));
        builder.e(String.valueOf(dataTypeL.getmId()));
        builder.a(String.valueOf(subDataTypeK.getmId()));
        arrayList.add(new HiSampleConfigKey(builder));
        HiSampleConfigProcessOption hiSampleConfigProcessOption = new HiSampleConfigProcessOption();
        hiSampleConfigProcessOption.setSampleConfigKeyList(arrayList);
        return hiSampleConfigProcessOption;
    }

    static class c implements HiDataReadResultListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final IBaseResponseCallback f43571c;
        private final String d;
        private final nsa e;

        c(nsa nsaVar, String str, IBaseResponseCallback iBaseResponseCallback) {
            this.e = nsaVar;
            this.d = str;
            this.f43571c = iBaseResponseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(final Object obj, int i, int i2) {
            LogUtil.a("HiHealthProcess__readConfigData", "ReadConfigDataProcess success, data is ", obj);
            if (this.f43571c == null) {
                ReleaseLogUtil.e("HiHealthProcess__readConfigData", "onResult callback is null");
                return;
            }
            if (this.e == null) {
                ReleaseLogUtil.e("HiHealthProcess__readConfigData", "onResult process is null");
                this.f43571c.a(-1, "");
                return;
            }
            final nqx nqxVar = (nqx) peh.b(this.d, nqx.class);
            if (nqxVar == null) {
                ReleaseLogUtil.e("HiHealthProcess__readConfigData", "onResult request is null");
                this.f43571c.a(-1, "");
            } else {
                ThreadPoolManager.c().execute(new Runnable() { // from class: nrx
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.c(obj, nqxVar);
                    }
                });
            }
        }

        /* synthetic */ void c(Object obj, nqx nqxVar) {
            String strPostProcess = this.e.postProcess(obj, nqxVar);
            LogUtil.a("HiHealthProcess__readConfigData", "ReadConfigDataProcess result:", strPostProcess);
            this.f43571c.a(0, strPostProcess);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
            LogUtil.a("HiHealthProcess__readConfigData", "readConfigDataProcess, data is ", obj);
            this.f43571c.a(-1, "");
        }
    }

    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    public String postProcess(Object obj, Object obj2) {
        if (obj == null || !(obj2 instanceof nqx)) {
            LogUtil.d("HiHealthProcess__readConfigData", "postProcess null");
            return "";
        }
        if (!njy.b(obj, HiSampleConfig.class)) {
            ReleaseLogUtil.e("HiHealthProcess__readConfigData", "getSampleConfigForHealth object ", obj);
            return "";
        }
        nqx nqxVar = (nqx) obj2;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(new nre((HiSampleConfig) it.next()));
        }
        nqk.b(arrayList, nqxVar.g());
        LogUtil.a("HiHealthProcess__readConfigData", "arkUiConfigDataList is ", peh.c(arrayList));
        return peh.c(arrayList);
    }
}
