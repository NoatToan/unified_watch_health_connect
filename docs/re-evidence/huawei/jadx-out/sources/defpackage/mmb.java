package defpackage;

import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hwdevice.phoneprocess.mgr.common.DataSender;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HEXUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class mmb implements DataSender {
    @Override // com.huawei.hwdevice.phoneprocess.mgr.common.DataSender
    public void send(DeviceInfo deviceInfo, Object obj, String str, String str2) {
        a(deviceInfo, obj, str, str2);
    }

    public static void a(DeviceInfo deviceInfo, Object obj, String str, String str2) {
        ReleaseLogUtil.d("R_BaseDataSender", "sendSampleConfig");
        if (d(obj) || (obj = a(str, str2)) != null) {
            List<HiSampleConfig> list = (List) obj;
            eef eefVar = new eef();
            eefVar.setSrcPkgName(str);
            eefVar.setWearPkgName(str2);
            eefVar.setCommandId(1);
            if (njy.e(list)) {
                LogUtil.a("BaseDataSender", "sendSampleConfig configDataJson null");
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (HiSampleConfig hiSampleConfig : list) {
                eeg eegVar = new eeg();
                try {
                    eegVar.b(Long.parseLong(hiSampleConfig.getConfigId()));
                } catch (NumberFormatException e) {
                    ReleaseLogUtil.d("R_BaseDataSender", "sendSampleConfig exception ", ExceptionUtils.c(e));
                }
                eegVar.b(1);
                eegVar.c(Long.valueOf(hiSampleConfig.getModifiedTime()));
                eegVar.d(HEXUtils.a(HEXUtils.c(hiSampleConfig.getConfigData())));
                arrayList.add(eegVar);
            }
            eefVar.setConfigInfoList(arrayList);
            ReleaseLogUtil.d("R_BaseDataSender", "sendSampleConfig sample config ", eefVar.toString());
            ReleaseLogUtil.d("R_BaseDataSender", "sendSampleConfig sample success ", Boolean.valueOf(edc.e().sendSampleConfigCommand(deviceInfo, eefVar, "BaseDataSender")));
        }
    }

    private static List<HiSampleConfig> a(String str, String str2) {
        if (!"hw.unitedevice.wheelchair".equals(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HiSampleConfig.Builder().a("900500039").b(ffv.e("wheelchairSwitch", "0")).e(0L).c());
        return arrayList;
    }

    public static boolean d(Object obj) {
        if (!njy.b(obj, HiSampleConfig.class)) {
            ReleaseLogUtil.e("R_BaseDataSender", "list getSampleConfigData isListTypeMatch false ");
            return false;
        }
        if (!njy.e((List) obj)) {
            return true;
        }
        ReleaseLogUtil.e("R_BaseDataSender", "list getSampleConfigData list is empty ");
        return false;
    }
}
