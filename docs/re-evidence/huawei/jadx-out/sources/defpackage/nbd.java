package defpackage;

import android.os.RemoteException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwdevice.phoneprocess.mgr.linkage.channel.SampelBaseHandler;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IBaseCallback;
import com.huawei.hwservicesmgr.LinkageDeviceCommandListener;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class nbd implements SampelBaseHandler {
    @Override // com.huawei.hwdevice.phoneprocess.mgr.linkage.channel.SampelBaseHandler
    public void handle(eec eecVar, LinkageDeviceCommandListener linkageDeviceCommandListener, IBaseCallback iBaseCallback) {
        if (eecVar instanceof eeh) {
            a((eeh) eecVar, iBaseCallback);
        } else {
            ReleaseLogUtil.d("R_LINKAGE_Real_SampleRealHandler", "message not SamplePoint");
        }
    }

    private void a(eeh eehVar, IBaseCallback iBaseCallback) {
        LogUtil.a("LINKAGE_Real_SampleRealHandler", "sampleRealHandle samplePoint = ", eehVar);
        List<eed> listB = eehVar.b();
        if (njy.e(listB)) {
            ReleaseLogUtil.e("R_LINKAGE_Real_SampleRealHandler", "handle dataInfoList is empty.");
            return;
        }
        HashMap<Integer, Double> mapE = e(listB);
        if (mapE.isEmpty()) {
            ReleaseLogUtil.e("R_LINKAGE_Real_SampleRealHandler", "handle fieldsValue is empty.");
            return;
        }
        String strD = HiJsonUtil.d(mapE);
        try {
            ReleaseLogUtil.e("R_LINKAGE_Real_SampleRealHandler", "deviceDataListener: ", iBaseCallback);
            if (iBaseCallback == null) {
                return;
            }
            iBaseCallback.onResponse(0, strD);
        } catch (RemoteException e) {
            ReleaseLogUtil.a("R_LINKAGE_Real_SampleRealHandler", "handle RemoteException: ", ExceptionUtils.c(e));
        }
    }

    private HashMap<Integer, Double> e(List<eed> list) {
        double d;
        int iE;
        HashMap<Integer, Double> map = new HashMap<>(20);
        if (njy.e(list)) {
            ReleaseLogUtil.e("R_LINKAGE_Real_SampleRealHandler", "parseRunPostureSamplePoints failed, SamplePointInfos is null");
            return map;
        }
        for (eed eedVar : list) {
            int iA = (int) eedVar.a();
            if (oau.f44016c.contains(Integer.valueOf(iA))) {
                if (iA == 50004388 || iA == 50004935) {
                    double dC = cph.c(eedVar.b(), -255.0d);
                    LogUtil.a("LINKAGE_Real_SampleRealHandler", "parseSamplePoints dataDicId: ", Integer.valueOf(iA), ", value: ", Double.valueOf(dC), ", valueHex: ", eeq.e(eedVar.b()));
                    d = dC;
                } else {
                    if (iA == 50004286 || iA == 50004642) {
                        iE = cph.e(eedVar.b(), 0);
                    } else if (iA == 50004934) {
                        iE = cph.b(eedVar.b(), (short) 0);
                    } else {
                        iE = CommonUtil.v(eeq.e(eedVar.b()));
                    }
                    d = iE;
                }
                map.put(Integer.valueOf(iA), Double.valueOf(d));
            } else {
                LogUtil.j("LINKAGE_Real_SampleRealHandler", "parseSamplePoints noMapping dataDicId=", Integer.valueOf(iA));
            }
        }
        return map;
    }
}
