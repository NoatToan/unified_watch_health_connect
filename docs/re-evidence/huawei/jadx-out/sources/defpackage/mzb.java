package defpackage;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.util.GmsVersion;
import com.huawei.devicesdk.entity.SendMode;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.DictionaryCommonInfo;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.hwdictionarymgr.strategy.DictionarySequenceInterface;
import com.huawei.hwdevice.phoneprocess.mgr.hwsynctaskmanager.commonTask.base.TaskInterface;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataJsApi;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mzb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DictionarySequenceInterface f42723c;
    private final List<mzp> e;

    public void b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private mzb() {
        this.f42723c = new mvn();
        List<mzp> listAsList = Arrays.asList(new mzk(MatterDataJsApi.APP_PACKAGE_NAME, MatterDataJsApi.MATTER_PACKAGE_NAME), new mzi("hw.unitedevice.emotion", "hw.device.emotion"));
        this.e = listAsList;
        ArrayList<Pair> arrayList = new ArrayList();
        for (mzp mzpVar : listAsList) {
            if (mzpVar instanceof TaskInterface) {
                arrayList.add(Pair.create(mzpVar.e(), (TaskInterface) mzpVar));
            }
        }
        for (final Pair pair : arrayList) {
            edc.e().registerDeviceSampleListener((String) pair.first, new DataReceiveCallback() { // from class: mzf
                @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
                public final void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
                    mzb.b(pair, i, deviceInfo, eecVar);
                }
            });
        }
    }

    static /* synthetic */ void b(Pair pair, int i, DeviceInfo deviceInfo, eec eecVar) {
        LogUtil.a("CommonDataDictionaryManager", "received sample message pkgName " + ((String) pair.first) + " errCode " + i);
        for (DeviceInfo deviceInfo2 : mkf.e((Context) null).getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "CommonDataDictionaryManager")) {
            if (deviceInfo2.getDeviceIdentify().equals(deviceInfo.getDeviceIdentify())) {
                if (eecVar instanceof eea) {
                    eea eeaVar = (eea) eecVar;
                    LogUtil.a("CommonDataDictionaryManager", "received point dic: " + eeaVar.c());
                    ((TaskInterface) pair.second).handlePoint(deviceInfo2, eeaVar);
                }
                if (eecVar instanceof eee) {
                    ((TaskInterface) pair.second).handleEvent(deviceInfo2, (eee) eecVar);
                    return;
                }
                return;
            }
        }
        LogUtil.e("CommonDataDictionaryManager", "not found current connect device " + deviceInfo.getDeviceName());
    }

    public void b(List<eeb> list, final eea eeaVar, final DeviceInfo deviceInfo) {
        String strE = mvs.e(deviceInfo);
        ArrayList arrayList = new ArrayList();
        a aVarB = b(new mzg(list, eeaVar, strE, arrayList));
        if (aVarB.e == null) {
            return;
        }
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setDatas(arrayList);
        final eeb eebVar = aVarB.e;
        if (aVarB.f42727c == 0) {
            ReleaseLogUtil.d("CommonDataDictionaryManager", "invalidNum: " + aVarB.f42726a);
            if (!d(eebVar, deviceInfo, eeaVar)) {
                LogUtil.j("CommonDataDictionaryManager", "State Invalid, Time less than StartTime");
                return;
            }
        }
        LogUtil.a("CommonDataDictionaryManager", "begin insert: ", arrayList);
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: mzd
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i, Object obj) {
                this.e.b(eebVar, deviceInfo, eeaVar, i, obj);
            }
        });
    }

    /* synthetic */ void b(eeb eebVar, DeviceInfo deviceInfo, eea eeaVar, int i, Object obj) {
        ReleaseLogUtil.d("CommonDataDictionaryManager", "saveDataToHiHealth onResult type:", Integer.valueOf(i));
        if (i == 0) {
            if (!d(eebVar, deviceInfo, eeaVar)) {
                LogUtil.j("CommonDataDictionaryManager", "Time less than StartTime");
                return;
            }
            if (eeaVar.c() == 500043) {
                LogUtil.a("CommonDataDictionaryManager", "no need to sync dic.");
                return;
            }
            DictionaryCommonInfo dictionaryCommonInfo = new DictionaryCommonInfo(MatterDataJsApi.APP_PACKAGE_NAME, MatterDataJsApi.MATTER_PACKAGE_NAME, deviceInfo);
            LogUtil.a("CommonDataDictionaryManager", "continue next dicData sync: " + eeaVar.c());
            mqn.d().a(dictionaryCommonInfo, new int[]{(int) eeaVar.c()});
            return;
        }
        LogUtil.j("CommonDataDictionaryManager", "processInsertToHiHealth error:", Integer.valueOf(i));
    }

    private static a b(mzg mzgVar) {
        eeb eebVar = null;
        for (eeb eebVar2 : mzgVar.b()) {
            HiHealthData hiHealthData = new HiHealthData();
            hiHealthData.setType((int) mzgVar.a().c());
            hiHealthData.setDeviceUuid(mzgVar.c());
            long jE = eebVar2.e();
            long jC = eebVar2.c();
            hiHealthData.setStartTime(jE);
            hiHealthData.setEndTime(jC);
            HashMap map = new HashMap(0);
            boolean zB = b(eebVar2, (HashMap<Integer, Object>) map);
            if (eebVar == null || eebVar.c() < eebVar2.c()) {
                eebVar = eebVar2;
            }
            if (zB) {
                mzgVar.d(mzgVar.f() + 1);
                hiHealthData.setFieldsValue(HiJsonUtil.d(map));
                mzgVar.d().add(hiHealthData);
            } else {
                mzgVar.b(mzgVar.e() + 1);
            }
        }
        return new a(eebVar, mzgVar.f(), mzgVar.e());
    }

    private static boolean b(eeb eebVar, HashMap<Integer, Object> map) {
        boolean z = true;
        for (eed eedVar : eebVar.b()) {
            if (eedVar.a() == 500035550 || eedVar.a() == 500043311) {
                int iE = cph.e(eedVar.b(), 0);
                if (500035550 == eedVar.a()) {
                    if (iE != 0) {
                        if (iE < 1 || iE >= 3) {
                            z = false;
                        }
                    }
                }
                map.put(Integer.valueOf((int) eedVar.a()), Integer.valueOf(iE));
            } else {
                map.put(Integer.valueOf((int) eedVar.a()), Double.valueOf(cph.a(eedVar.b(), false)));
            }
        }
        return z;
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f42726a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f42727c;
        public final eeb e;

        public a(eeb eebVar, int i, int i2) {
            this.e = eebVar;
            this.f42727c = i;
            this.f42726a = i2;
        }
    }

    private boolean d(eeb eebVar, DeviceInfo deviceInfo, eea eeaVar) {
        long jD = mvs.d(deviceInfo.getDeviceIdentify(), (int) eeaVar.c(), GmsVersion.VERSION_LONGHORN, "CommonDataDictionaryManager");
        int iC = (int) eeaVar.c();
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (eebVar.c() <= jD) {
            LogUtil.j("CommonDataDictionaryManager", "Point Sync Do not save any time");
            return false;
        }
        mvs.c(deviceIdentify, iC, eebVar.c(), GmsVersion.VERSION_LONGHORN, "CommonDataDictionaryManager");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DeviceInfo deviceInfo, SparseArray<?> sparseArray, eea eeaVar) {
        int iC = (int) eeaVar.c();
        long jD = mvs.d(deviceInfo.getDeviceIdentify(), iC, GmsVersion.VERSION_LONGHORN, "CommonDataDictionaryManager");
        ReleaseLogUtil.d("CommonDataDictionaryManager", "processReadHiHealthData modifyTime:", Long.valueOf(jD), " ,statTime: ", Long.valueOf(jD));
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jD != 0 ? jD + 1000 : 0L;
        if (sparseArray == null) {
            LogUtil.j("CommonDataDictionaryManager", "processReadHiHealthData readHiHeathList is null");
            eeaVar.e().add(b(j, jCurrentTimeMillis));
            return;
        }
        Object obj = sparseArray.get(iC);
        if (!(obj instanceof List)) {
            LogUtil.j("CommonDataDictionaryManager", "dataObject not list");
            eeaVar.e().add(b(j, jCurrentTimeMillis));
            a(deviceInfo, (int) eeaVar.c(), j, jCurrentTimeMillis);
            return;
        }
        for (Object obj2 : (List) obj) {
            if (obj2 instanceof HiHealthData) {
                HiHealthData hiHealthData = (HiHealthData) obj2;
                LogUtil.a("LZX", "data " + hiHealthData);
                LogUtil.a("LZX", " id " + hiHealthData.getDataId() + " meta " + hiHealthData.getMetaData() + " value " + hiHealthData.getFieldsValue());
                jD = Math.max(jD, hiHealthData.getEndTime());
            } else {
                LogUtil.j("CommonDataDictionaryManager", "data not HiHealthData");
            }
        }
        long j2 = jD + 1000;
        eeaVar.e().add(b(j2, jCurrentTimeMillis));
        a(deviceInfo, (int) eeaVar.c(), j2, jCurrentTimeMillis);
    }

    public void a(DeviceInfo deviceInfo, int i, long j, long j2) {
        if (deviceInfo == null) {
            LogUtil.e("CommonDataDictionaryManager", "queryPoint deviceInfo is null");
            return;
        }
        if (j2 - j <= 54000) {
            LogUtil.j("CommonDataDictionaryManager", "query dic: " + i + " queryPoint time not in 54 seconds startTime: " + j + ", endTime: " + j2);
            return;
        }
        LogUtil.a("CommonDataDictionaryManager", "query dic: " + i + " startTime: " + j + ", endTime: " + j2);
        byte[] bArrE = new cqj().b(1, MatterDataJsApi.APP_PACKAGE_NAME).b(2, MatterDataJsApi.MATTER_PACKAGE_NAME).b(3, i).e(6, j).e(7, j2).e(8, j).e(55, 4).e();
        cmg cmgVar = new cmg();
        cmgVar.b(true);
        cmgVar.a(bArrE);
        cmgVar.d(SendMode.PROTOCOL_TYPE_5A);
        com.huawei.devicesdk.entity.DeviceInfo deviceInfo2 = new com.huawei.devicesdk.entity.DeviceInfo();
        deviceInfo2.setDeviceMac(deviceInfo.getDeviceIdentify());
        cju.d().sendCommand(deviceInfo2, cmgVar);
    }

    private eeb b(long j, long j2) {
        eeb eebVar = new eeb();
        eebVar.c(j);
        eebVar.d(j2);
        return eebVar;
    }

    static class b {
        private static final mzb d = new mzb();
    }

    public static mzb e() {
        return b.d;
    }

    public void a(final DeviceInfo deviceInfo, final mvh mvhVar) {
        if (mvhVar == null) {
            LogUtil.e("CommonDataDictionaryManager", "requestSyncData dictionarySingleInfo is null");
        } else {
            this.f42723c.readHiHealthData(mvhVar.b(), deviceInfo, new HiDataReadResultListener() { // from class: mzb.5
                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResult(Object obj, int i, int i2) {
                    LogUtil.a("CommonDataDictionaryManager", "onResult errorCode: ", Integer.valueOf(i), ", object: ", obj);
                    if (obj == null) {
                        LogUtil.j("CommonDataDictionaryManager", "object is null");
                        return;
                    }
                    if (obj instanceof SparseArray) {
                        SparseArray sparseArray = (SparseArray) obj;
                        if (sparseArray.size() <= 0) {
                            LogUtil.j("CommonDataDictionaryManager", "sparseArray size is zero");
                        }
                        eea eeaVar = new eea();
                        eeaVar.c(mvhVar.b());
                        eeaVar.setCommandId(4);
                        eeaVar.setWearPkgName(mvhVar.d());
                        eeaVar.setSrcPkgName(mvhVar.c());
                        eeaVar.a(new ArrayList());
                        mzb.this.a(deviceInfo, sparseArray, eeaVar);
                        return;
                    }
                    LogUtil.j("CommonDataDictionaryManager", "sparseArray !instanceof no process");
                }

                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResultIntent(int i, Object obj, int i2, int i3) {
                    LogUtil.a("CommonDataDictionaryManager", "onResultIntent intentType:", Integer.valueOf(i), ", object:", obj);
                }
            });
        }
    }
}
