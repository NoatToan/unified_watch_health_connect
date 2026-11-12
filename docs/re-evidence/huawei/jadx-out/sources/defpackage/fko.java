package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.model.HiHealthDictField;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HEXUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class fko implements DataReceiveCallback {
    private boolean e = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f34129b = false;

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        if (i != 100000) {
            ReleaseLogUtil.e("HWhealthLinkage_Posture_SamplePointChannel", "onDataReceived errCode is error");
            return;
        }
        if (deviceInfo == null || eecVar == null) {
            ReleaseLogUtil.e("HWhealthLinkage_Posture_SamplePointChannel", "onDataReceived deviceInfo or sampleBase is null.");
            return;
        }
        String srcPkgName = eecVar.getSrcPkgName();
        String wearPkgName = eecVar.getWearPkgName();
        LogUtil.a("Posture_SamplePointChannel", "onDataReceived srcPkgNam: ", srcPkgName, ", wearPkgName:", wearPkgName);
        if ("hw.bolt.linkage".equals(srcPkgName) && "hw.sport.linkage".equals(wearPkgName)) {
            e(deviceInfo, eecVar);
        } else if ("hw.linkage.watch.posture.device".equals(srcPkgName) && "hw.linkage.watch.posture.app".equals(wearPkgName)) {
            d(deviceInfo, eecVar);
        }
    }

    public void e(Bundle bundle, DeviceInfo deviceInfo) {
        LogUtil.a("Posture_SamplePointChannel", "sendSamplePointToDevice");
        if (bundle == null) {
            return;
        }
        eeh eehVar = new eeh();
        eehVar.d(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA.value());
        eehVar.c(new Date().getTime());
        eehVar.a(new Date().getTime());
        eehVar.setSrcPkgName("hw.linkage.watch.posture.app");
        eehVar.setWearPkgName("hw.linkage.watch.posture.device");
        eehVar.e(b(bundle));
        edc.e().sendSamplePointCommand(deviceInfo, eehVar, "Posture_SamplePointChannel");
    }

    private void e(DeviceInfo deviceInfo, eec eecVar) {
        if (eecVar instanceof eee) {
            c((eee) eecVar, deviceInfo);
            return;
        }
        if (eecVar instanceof eeh) {
            eeh eehVar = (eeh) eecVar;
            LogUtil.a("Posture_SamplePointChannel", "mDataReceiveCallback bolt samplePoint = ", eehVar);
            List<eed> listB = eehVar.b();
            if (njy.e(listB)) {
                ReleaseLogUtil.e("HWhealthLinkage_Posture_SamplePointChannel", "mDataReceiveCallback bolt dataInfoList is empty");
            } else {
                b(deviceInfo, listB);
            }
        }
    }

    private void d(DeviceInfo deviceInfo, eec eecVar) {
        if (eecVar instanceof eeh) {
            eeh eehVar = (eeh) eecVar;
            LogUtil.a("Posture_SamplePointChannel", "onDataReceived watch samplePoint = ", eehVar);
            List<eed> listB = eehVar.b();
            if (njy.e(listB)) {
                ReleaseLogUtil.e("HWhealthLinkage_Posture_SamplePointChannel", "onDataReceived watch dataInfoList is empty.");
                return;
            }
            Map<Integer, Double> mapC = fkn.c(listB);
            if (mapC.isEmpty()) {
                ReleaseLogUtil.e("HWhealthLinkage_Posture_SamplePointChannel", "onDataReceived watch fieldsValue is empty.");
                return;
            }
            if (!this.e) {
                mga.h(deviceInfo);
                this.e = true;
            }
            fhf.b().a(deviceInfo, HiJsonUtil.d(mapC), fkn.b(mapC.keySet()));
        }
    }

    private List<eed> b(Bundle bundle) {
        HiHealthDictField hiHealthDictFieldE;
        ArrayList arrayList = new ArrayList(10);
        for (String str : fkn.f34128c) {
            if (bundle.containsKey(str) && (hiHealthDictFieldE = HiHealthDictManager.a((Context) null).e(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA.value(), str)) != null) {
                int iE = hiHealthDictFieldE.e();
                eed eedVar = new eed();
                eedVar.e(iE);
                if (fkn.e.contains(Integer.valueOf(iE))) {
                    int iIntValue = ((Integer) bundle.get(str)).intValue();
                    if (iE != DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_EVERSION.value() || iIntValue != -101) {
                        if (iIntValue != -1) {
                            eedVar.a(HEXUtils.a(HEXUtils.b(iIntValue)));
                            arrayList.add(eedVar);
                            LogUtil.a("Posture_SamplePointChannel", "samplePoint send to device key:", Long.valueOf(eedVar.a()), ", value: ", HEXUtils.a(eedVar.b()));
                        }
                    }
                } else if (fkn.f34126a.contains(Integer.valueOf(iE))) {
                    float fFloatValue = ((Float) bundle.get(str)).floatValue();
                    if (Float.compare(fFloatValue, -1.0f) != 0) {
                        if (iE == DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_VERTICAL_OSCILLATION.value()) {
                            eedVar.a(HEXUtils.a(HEXUtils.b((int) (fFloatValue * 10.0f))));
                            arrayList.add(eedVar);
                        } else if (iE == DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_GC_TIME_BALANCE.value()) {
                            eedVar.a(HEXUtils.a(HEXUtils.b((int) (fFloatValue * 100.0f))));
                            arrayList.add(eedVar);
                        } else if (iE == DicDataTypeUtil.DataType.REALTIME_SPORT_VERTICAL_RATIO.value()) {
                            eedVar.a(HEXUtils.a(HEXUtils.b((int) (fFloatValue * 10.0f))));
                            arrayList.add(eedVar);
                        } else {
                            eedVar.a(HEXUtils.a(HEXUtils.b(fFloatValue)));
                            arrayList.add(eedVar);
                            LogUtil.a("Posture_SamplePointChannel", "samplePoint send to device key:", Long.valueOf(eedVar.a()), ", value: ", HEXUtils.a(eedVar.b()));
                        }
                    }
                } else {
                    if (fkn.f34127b.contains(Integer.valueOf(iE))) {
                        double dDoubleValue = ((Double) bundle.get(str)).doubleValue();
                        if (Double.compare(dDoubleValue, -1.0d) != 0) {
                            if (iE == DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_FLIGHT_RATIO.value()) {
                                eedVar.a(HEXUtils.a(HEXUtils.b((int) (dDoubleValue * 100.0d))));
                                arrayList.add(eedVar);
                            } else {
                                eedVar.a(HEXUtils.a(HEXUtils.d(dDoubleValue)));
                                arrayList.add(eedVar);
                            }
                        }
                    } else {
                        LogUtil.a("Posture_SamplePointChannel", "sendData null");
                    }
                    LogUtil.a("Posture_SamplePointChannel", "samplePoint send to device key:", Long.valueOf(eedVar.a()), ", value: ", HEXUtils.a(eedVar.b()));
                }
            }
        }
        return arrayList;
    }

    private void c(eee eeeVar, DeviceInfo deviceInfo) {
        if (eeeVar.d() == 800100001) {
            LogUtil.a("Posture_SamplePointChannel", "mDataReceiveCallback: sampleEvent = ", eeeVar);
            c();
            Iterator<IBaseResponseCallback> it = fib.d().b().values().iterator();
            while (it.hasNext()) {
                it.next().a(0, deviceInfo);
            }
        }
    }

    private void c() {
        String string;
        LogUtil.a("Posture_SamplePointChannel", "showBoltNotification...");
        Context context = BaseApplication.getContext();
        String strB = een.b(554, context, context.getPackageName());
        if (LanguageUtil.l(context)) {
            string = context.getResources().getString(R.string.IDS_motiontrack_bolt_tips, strB);
        } else {
            string = context.getResources().getString(R.string.IDS_motiontrack_wear_tips, strB);
        }
        lsb.d().c(ieg.e(), new NotificationCompat.Builder(context, "channel_common_id").setContentText(string).setSmallIcon(R.drawable.healthlogo_ic_notification).setContentIntent(lsb.a(context)).setStyle(new NotificationCompat.BigTextStyle().bigText(string)).setAutoCancel(true).build());
    }

    private void b(DeviceInfo deviceInfo, List<eed> list) {
        Double d;
        Map<Integer, Double> mapC = fkn.c(list);
        if (mapC.isEmpty()) {
            LogUtil.j("Posture_SamplePointChannel", "onDataReceived: fieldsValue is empty.");
            return;
        }
        if (!this.f34129b) {
            fhf.b().e(fib.d().a());
            this.f34129b = true;
        }
        String strD = HiJsonUtil.d(mapC);
        String strB = fkn.b(mapC.keySet());
        if (fib.d().c() == 259) {
            fhf.b().a(deviceInfo, strD, strB);
        } else if (!mapC.containsKey(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_WALK_OR_RUN.value())) || ((d = mapC.get(Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_WALK_OR_RUN.value()))) != null && d.equals(Double.valueOf(1.0d)))) {
            fhf.b().a(deviceInfo, strD, strB);
        }
    }

    public void c(int i, int i2) {
        LogUtil.a("Posture_SamplePointChannel", "changeBoltPostureReportStatus, 1 & 3 means open, 2 & 4 means close, sportStatus = ", Integer.valueOf(i));
        eef eefVarA = a(i2, i);
        Iterator<ivo.d> it = fib.d().e().iterator();
        while (it.hasNext()) {
            DeviceInfo deviceInfoE = it.next().e();
            LogUtil.a("Posture_SamplePointChannel", "sendSampleConfig result = " + edc.e().sendSampleConfigCommand(deviceInfoE, eefVarA, "Posture_SamplePointChannel") + ", deviceName = " + deviceInfoE.getDeviceName());
        }
    }

    private eef a(final int i, final int i2) {
        return new eef() { // from class: fko.4
            {
                setSrcPkgName("hw.sport.linkage");
                setWearPkgName("hw.bolt.linkage");
                setConfigInfoList(Collections.singletonList(new eeg() { // from class: fko.4.3
                    {
                        b(900200001L);
                        b(i2);
                        d(HEXUtils.a(HEXUtils.c(SportSupportUtil.c(i))));
                    }
                }));
            }
        };
    }
}
