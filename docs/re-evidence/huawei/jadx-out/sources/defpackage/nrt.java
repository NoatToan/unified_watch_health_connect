package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiDataDeleteOption;
import com.huawei.hihealth.HiDataDeleteProOption;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDeleteListenerEx;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwonesdk.process.HiHealthProcess;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class nrt implements HiHealthProcess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f43552c;

    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    public String postProcess(Object obj, Object obj2) {
        return null;
    }

    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public List<HiDataDeleteProOption> preProcess(String str) {
        this.f43552c = false;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (str.contains("fields")) {
            Iterator it = peh.c(str, nrk[].class).iterator();
            while (it.hasNext()) {
                a((nrk) it.next(), arrayList);
            }
        } else {
            a((nrk) peh.b(str, nrk.class), arrayList);
            boolean zB = njy.b(arrayList);
            this.f43552c = zB;
            if (zB) {
                LogUtil.a("HiHealthProcess_deleteData", "preProcess sampleData options:", arrayList.toString());
                return arrayList;
            }
            List listC = peh.c(str, nqw[].class);
            if (njy.e(listC)) {
                nqw nqwVar = (nqw) peh.b(str, nqw.class);
                if (nqwVar == null) {
                    return null;
                }
                d(nqwVar, arrayList);
            } else if (listC.size() == 1) {
                nqw nqwVar2 = (nqw) listC.get(0);
                if (nqwVar2 == null) {
                    return null;
                }
                d(nqwVar2, arrayList);
            } else {
                c(listC, arrayList);
            }
        }
        LogUtil.a("HiHealthProcess_deleteData", "deleteDataProcess preProcess options:", arrayList.toString());
        return arrayList;
    }

    private static void c(List<nqw> list, List<HiDataDeleteProOption> list2) {
        int[] iArrC = CommonUtil.c(nqj.a().d(list.get(0).f()));
        HiDataDeleteOption hiDataDeleteOption = new HiDataDeleteOption();
        hiDataDeleteOption.setTypes(iArrC);
        for (nqw nqwVar : list) {
            if (nqwVar != null) {
                hiDataDeleteOption.addTimeInterval(new HiTimeInterval(nqwVar.c(), nqwVar.e()));
            }
        }
        list2.add(HiDataDeleteProOption.builder().c(hiDataDeleteOption).d(0).b((Integer) 0).a((Integer) 1).c());
    }

    private static void a(nrk nrkVar, List<HiDataDeleteProOption> list) {
        if (nrkVar == null || nrkVar.a() == null || nrkVar.a().getmId() <= 0 || nrkVar.f() <= 0 || nrkVar.e() <= 0) {
            LogUtil.c("HiHealthProcess_deleteData", "buildOptions sampleData is invalid");
            return;
        }
        HiDataDeleteOption hiDataDeleteOption = new HiDataDeleteOption();
        hiDataDeleteOption.setTypes(CommonUtil.c(nqj.a().d(new int[]{nrkVar.a().getmId()})));
        hiDataDeleteOption.setTimeInterval(nrkVar.f(), nrkVar.e());
        list.add(HiDataDeleteProOption.builder().c(hiDataDeleteOption).d(0).b((Integer) 0).a((Integer) 0).c());
    }

    private void d(nqw nqwVar, List<HiDataDeleteProOption> list) {
        HiDataDeleteOption hiDataDeleteOption = new HiDataDeleteOption();
        List<Integer> listD = nqj.a().d(nqwVar.f());
        if (listD.isEmpty()) {
            for (int i : nqwVar.f()) {
                listD.add(Integer.valueOf(i));
            }
        }
        hiDataDeleteOption.setTypes(CommonUtil.c(listD));
        hiDataDeleteOption.setTimeInterval(nqwVar.c(), nqwVar.e());
        list.add(HiDataDeleteProOption.builder().c(hiDataDeleteOption).d(0).b((Integer) 0).a((Integer) 1).b(nqwVar.d().c()).a(nqwVar.d().d()).c());
    }

    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    public void doAction(String str, final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.a("HiHealthProcess_deleteData", "doAction callback is null");
            return;
        }
        List<HiDataDeleteProOption> listPreProcess = preProcess(str);
        if (njy.e(listPreProcess)) {
            LogUtil.a("HiHealthProcess_deleteData", "HiDataAggregateProOption list is empty");
            iBaseResponseCallback.a(-1, "");
        } else {
            LogUtil.a("HiHealthProcess_deleteData", "deleteHiHealthDataProEx ", listPreProcess);
            HiHealthManager.d(BaseApplication.b()).deleteHiHealthDataProEx(listPreProcess, new HiDeleteListenerEx() { // from class: nrt.5
                @Override // com.huawei.hihealth.data.listener.HiDeleteListenerEx
                public void onResult(Map<Integer, List<Object>> map) {
                    LogUtil.a("HiHealthProcess_deleteData", "deleteData result", map);
                    if (nrt.this.f43552c) {
                        iBaseResponseCallback.a(0, Boolean.valueOf(njy.e(map)));
                    } else {
                        iBaseResponseCallback.a(0, "");
                    }
                }
            });
        }
    }
}
