package defpackage;

import android.content.ContentValues;
import android.content.Context;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwcloudmodel.healthdatacloud.model.BindDeviceReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetBindDeviceReq;
import com.huawei.hwcloudmodel.model.userprofile.BindDeviceRsp;
import com.huawei.hwcloudmodel.model.userprofile.DeviceInfo;
import com.huawei.hwcloudmodel.model.userprofile.GetBindDeviceRsp;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.utils.FoundationCommonUtil;
import health.compact.a.HiCommonUtil;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
class lit {
    private static boolean c(int i) {
        return 21 > i && 1 != i;
    }

    private static void e(Context context, kym kymVar) {
        if (kymVar == null) {
            return;
        }
        kymVar.d(0L);
        kymVar.h(0);
        kymVar.c(1);
        kwt.b().a(kymVar);
    }

    private static void a(Context context, kym kymVar, BindDeviceReq bindDeviceReq) throws lif {
        LogUtil.a("HiH_HiSyncUtilHelper", "reBindUnknownDevice bindDevice start bindDevice product is ", bindDeviceReq.getProductId());
        BindDeviceRsp bindDeviceRspB = lqo.b(context).b(bindDeviceReq);
        if (!lih.e(bindDeviceRspB, false)) {
            LogUtil.e("HiH_HiSyncUtilHelper", "reBindUnknownDevice bindDevice error");
            return;
        }
        long jLongValue = bindDeviceRspB.getDeviceCode().longValue();
        if (jLongValue <= 0) {
            LogUtil.e("HiH_HiSyncUtilHelper", "reBindUnknownDevice bindDevice error ans from cloud client is ", kymVar);
            return;
        }
        kymVar.d(jLongValue);
        kymVar.h(1);
        kymVar.c(1);
        kwt.b().a(kymVar);
    }

    private static BindDeviceReq d(Context context, kym kymVar) {
        if (kymVar == null) {
            return null;
        }
        HiDeviceInfo hiDeviceInfoB = kwy.b(context).b(kymVar.d());
        if (hiDeviceInfoB == null) {
            LogUtil.j("HiH_HiSyncUtilHelper", "reBindUnknownDevice createBindDeviceReq get no hiDeviceInfo from DB");
            return null;
        }
        BindDeviceReq bindDeviceReq = new BindDeviceReq();
        if (c(hiDeviceInfoB.getDeviceType())) {
            LogUtil.j("HiH_HiSyncUtilHelper", "reBindUnknownDevice createBindDeviceReq device productid is error, productid=", Integer.valueOf(hiDeviceInfoB.getDeviceType()));
            return null;
        }
        if (hiDeviceInfoB.getModel() != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("model", hiDeviceInfoB.getModel());
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
        if (hiDeviceInfoB.getDeviceUniqueCode() == null) {
            LogUtil.e("HiH_HiSyncUtilHelper", "reBindUnknownDevice binddevice deviceUUID is null !");
        }
        return bindDeviceReq;
    }

    static void e(Context context, int i) throws lif {
        ReleaseLogUtil.c("HiH_HiSyncUtilHelper", "reBindUnKnowDevice, userId=", Integer.valueOf(i));
        List<kym> listA = kwt.b().a(i);
        if (HiCommonUtil.b(listA)) {
            return;
        }
        GetBindDeviceRsp getBindDeviceRspA = lqo.b(context).a(new GetBindDeviceReq());
        if (!lih.e(getBindDeviceRspA, true)) {
            LogUtil.e("HiH_HiSyncUtilHelper", "reBindUnknownDevice error");
            return;
        }
        List<DeviceInfo> deviceInfos = getBindDeviceRspA.getDeviceInfos();
        if (HiCommonUtil.b(deviceInfos)) {
            LogUtil.e("HiH_HiSyncUtilHelper", "reBindUnknownDevice cloud deviceInfos is null or empty, need rebind all device");
            for (kym kymVar : listA) {
                e(context, kymVar);
                BindDeviceReq bindDeviceReqD = d(context, kymVar);
                if (bindDeviceReqD != null) {
                    a(context, kymVar, bindDeviceReqD);
                }
            }
            return;
        }
        for (kym kymVar2 : listA) {
            Iterator<DeviceInfo> it = deviceInfos.iterator();
            do {
                if (!it.hasNext()) {
                    e(context, kymVar2);
                    BindDeviceReq bindDeviceReqD2 = d(context, kymVar2);
                    if (bindDeviceReqD2 == null) {
                        break;
                    }
                    a(context, kymVar2, bindDeviceReqD2);
                    break;
                }
            } while (kymVar2.e() != it.next().getDeviceCode().longValue());
        }
    }

    static void a(Context context) {
        if (context == null) {
            return;
        }
        HiDeviceInfo hiDeviceInfoB = kwy.b(context).b(FoundationCommonUtil.getAndroidId(context));
        if (hiDeviceInfoB == null) {
            LogUtil.e("HiH_HiSyncUtilHelper", "updateLocalPhoneModel device is not exist!");
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("model", kwd.c());
        kwy.b(context).b(hiDeviceInfoB.getDeviceId(), contentValues);
    }
}
