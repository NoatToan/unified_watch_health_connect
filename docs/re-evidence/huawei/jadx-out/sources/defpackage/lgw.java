package defpackage;

import android.content.ContentValues;
import android.content.Context;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.sync.syncdata.HiSyncBase;
import com.huawei.hwcloudmodel.healthdatacloud.model.BindDeviceReq;
import com.huawei.hwcloudmodel.model.userprofile.BindDeviceRsp;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lgw implements HiSyncBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ArrayList<String> f40108b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kwi f40109a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<kym> f40110c;
    private kwt d;
    private kwy e;
    private int g;
    private Context j;

    private boolean c(int i) {
        return 21 > i && 1 != i;
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByTime(long j, long j2) throws lif {
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByVersion() throws lif {
    }

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        f40108b = arrayList;
        arrayList.add("com.huawei.health.ecg.collection");
        f40108b.add("com.huawei.health.device");
        f40108b.add("com.huawei.health.h5.sleep-apnea");
    }

    public lgw(Context context, int i) {
        LogUtil.d("HiH_HiSyncClient", "HiSyncClient create");
        this.j = context.getApplicationContext();
        this.g = i;
        b();
    }

    private void b() {
        this.d = kwt.b();
        this.e = kwy.b(this.j);
        this.f40109a = kwi.b();
        this.f40110c = this.d.e(this.g, 0);
    }

    private BindDeviceReq d(kym kymVar) {
        if (kymVar == null) {
            return null;
        }
        HiDeviceInfo hiDeviceInfoB = this.e.b(kymVar.d());
        if (hiDeviceInfoB == null) {
            LogUtil.j("HiH_HiSyncClient", "createBindDeviceReq get no hiDeviceInfo from DB");
            return null;
        }
        if (c(hiDeviceInfoB.getDeviceType())) {
            LogUtil.j("HiH_HiSyncClient", "createBindDeviceReq device productid is error, productid=", Integer.valueOf(hiDeviceInfoB.getDeviceType()));
            return null;
        }
        BindDeviceReq bindDeviceReq = new BindDeviceReq();
        if (hiDeviceInfoB.getModel() != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("model", hiDeviceInfoB.getModel());
            contentValues.put(HiDeviceInfo.MARKET_CODE_KEY, hiDeviceInfoB.getDeviceName());
            bindDeviceReq.setDeviceData(HiJsonUtil.d(contentValues));
        }
        bindDeviceReq.setProductId(Integer.valueOf(hiDeviceInfoB.getDeviceType()));
        bindDeviceReq.setUniqueId(hiDeviceInfoB.getDeviceUniqueCode());
        bindDeviceReq.setName(hiDeviceInfoB.getDeviceName());
        bindDeviceReq.setFirmwareVersion(hiDeviceInfoB.getFirmwareVersion());
        bindDeviceReq.setHardwareVersion(hiDeviceInfoB.getHardwareVersion());
        bindDeviceReq.setSoftwareVersion(hiDeviceInfoB.getSoftwareVersion());
        bindDeviceReq.setManufacturer(hiDeviceInfoB.getManufacturer());
        bindDeviceReq.setProdid(hiDeviceInfoB.getProdId());
        bindDeviceReq.setSubProdId(hiDeviceInfoB.getSubProdId());
        if (hiDeviceInfoB.getDeviceType() != 32) {
            bindDeviceReq.setSn(hiDeviceInfoB.getDeviceSN());
        }
        bindDeviceReq.setMac(hiDeviceInfoB.getDeviceMac());
        bindDeviceReq.setUdid(hiDeviceInfoB.getDeviceUdid());
        a(kymVar, bindDeviceReq);
        if (hiDeviceInfoB.getDeviceUniqueCode() == null) {
            LogUtil.e("HiH_HiSyncClient", "binddevice deviceUUID is null !");
        }
        return bindDeviceReq;
    }

    private void a(kym kymVar, BindDeviceReq bindDeviceReq) {
        HiAppInfo hiAppInfoC = this.f40109a.c(kymVar.b());
        if (hiAppInfoC != null) {
            String packageName = hiAppInfoC.getPackageName();
            String appName = hiAppInfoC.getAppName();
            if (f40108b.contains(packageName)) {
                bindDeviceReq.setAppName(packageName);
                bindDeviceReq.setThirdAppInfo(appName);
            }
        }
    }

    private void e(kym kymVar, BindDeviceReq bindDeviceReq) throws lif {
        LogUtil.a("HiH_HiSyncClient", "bindDevice start bindDevice , device name is ", bindDeviceReq.getName(), " product is ", bindDeviceReq.getProductId());
        BindDeviceRsp bindDeviceRspB = lqo.b(this.j).b(bindDeviceReq);
        if (!lih.e(bindDeviceRspB, false)) {
            LogUtil.e("HiH_HiSyncClient", "bindDevice error");
            return;
        }
        Long deviceCode = bindDeviceRspB.getDeviceCode();
        long jLongValue = deviceCode.longValue();
        if (jLongValue <= 0) {
            LogUtil.e("HiH_HiSyncClient", "bindDevice error ans from cloud, deviceCode is ", deviceCode, " client is ", kymVar);
            return;
        }
        kymVar.d(jLongValue);
        kymVar.h(1);
        kymVar.c(1);
        this.d.a(kymVar);
        kwy.d().c(kymVar.d(), 1);
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pushData() throws lif {
        LogUtil.a("HiH_HiSyncClient", "pushData() begin !");
        if (lgp.e()) {
            LogUtil.j("HiH_HiSyncClient", "pushData() dataPrivacy switch is closed ,can not pushData right now ,push end !");
            return;
        }
        List<kym> list = this.f40110c;
        if (list == null || list.isEmpty()) {
            LogUtil.a("HiH_HiSyncClient", "pushData() end ! no device needed to bindDevice to cloud, stop pushData");
            return;
        }
        for (kym kymVar : this.f40110c) {
            BindDeviceReq bindDeviceReqD = d(kymVar);
            if (bindDeviceReqD != null) {
                e(kymVar, bindDeviceReqD);
            }
        }
        LogUtil.a("HiH_HiSyncClient", "pushData() end !");
    }

    public String toString() {
        return "--HiSyncClient{}";
    }
}
