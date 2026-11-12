package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.common.utils.HexUtils;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.kit.wsp.task.BleTaskQueueUtil;
import com.huawei.health.device.kit.wsp.task.IAsynBleTaskCallback;
import com.huawei.health.device.util.EventBus;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class dye {
    public static void c(String str, UUID uuid, UUID uuid2) {
        if (TextUtils.isEmpty(str) || uuid == null || uuid2 == null) {
            LogUtil.j("HwWspMeasureUtil", " publishMsg is null");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("service_uuid", uuid);
        bundle.putSerializable("characteristic_uuid", uuid2);
        EventBus.a(new EventBus.d(str, bundle));
    }

    public static void a(byte[] bArr, dnj dnjVar) {
        if (bArr == null || bArr.length == 0) {
            LogUtil.j("HwWspMeasureUtil", " publishHistoryDataMsg historyData is null");
            doq.e().b(false);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putByteArray("historyData", bArr);
        if (dnjVar != null) {
            bundle.putInt("age", dnjVar.c());
        }
        EventBus.a(new EventBus.d("history_weight_info", bundle));
    }

    public static void d(byte[] bArr) {
        if (bArr == null) {
            LogUtil.j("HwWspMeasureUtil", " publishAuthMsg tokens is null");
        } else {
            if (bArr.length == 0) {
                EventBus.a(new EventBus.d("request_auth_failed", new Bundle()));
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putByteArray("token", bArr);
            EventBus.a(new EventBus.d("request_auth_token", bundle));
        }
    }

    public static void c(final Context context, final String str) {
        if (context == null) {
            LogUtil.j("HwWspMeasureUtil", " showToastOnUiThread context is null");
        } else if (BaseApplication.getActivity() == null) {
            LogUtil.j("HwWspMeasureUtil", "HwWspMeasureController getActivity is null !");
        } else {
            BaseApplication.getActivity().runOnUiThread(new Runnable() { // from class: dye.5
                @Override // java.lang.Runnable
                public void run() {
                    if (dxm.av(str)) {
                        Context context2 = context;
                        qpx.e(context2, context2.getResources().getString(R.string.IDS_device_offline_sync_data_done));
                    } else {
                        Context context3 = context;
                        qpx.e(context3, context3.getResources().getString(R.string.IDS_device_sync_data_done_toast));
                    }
                }
            });
        }
    }

    public static void e(byte[] bArr, Context context, String str) {
        if (bArr == null || bArr.length == 0) {
            LogUtil.j("HwWspMeasureUtil", "setNewWeightHonorDevice randA is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HwWspMeasureUtil", "setNewWeightHonorDevice uniqueId is null");
            return;
        }
        if (context == null) {
            LogUtil.j("HwWspMeasureUtil", "setNewWeightHonorDevice context is null");
            return;
        }
        Bundle bundle = new Bundle();
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 0, bArr2, 0, 16);
        bundle.putByteArray("randA", bArr2);
        EventBus.a(new EventBus.d("request_auth", bundle));
        if (bArr.length > 16) {
            byte[] bArr3 = {bArr[16]};
            dxn.b(context, CommonUtil.a(bArr3, 1), str);
            e(HexUtils.c(bArr3), str);
        }
    }

    private static void e(String str, String str2) {
        String strE = nio.e(str2);
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append("weightUnit");
        stringBuffer.append(strE);
        KeyValDbManager.d(com.huawei.haf.application.BaseApplication.b()).b(stringBuffer.toString(), str);
    }

    public static byte[] e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            LogUtil.e("HwWspMeasureUtil", "getStringBytes occur UnsupportedEncodingException");
            return null;
        }
    }

    public static void a(efx efxVar) {
        if (efxVar == null || TextUtils.isEmpty(efxVar.getUniqueId())) {
            return;
        }
        drc.b().d(dxx.d().b(efxVar.getUniqueId()));
    }

    public static drf d(Bundle bundle, byte[] bArr, byte[] bArr2, String str) {
        drf drfVar = new drf();
        if (bundle != null) {
            if (bundle.getInt("guestUser", 0) == 1) {
                drfVar.c(bundle.getInt("age"));
            } else {
                drfVar.c(dor.a(bundle.getInt("birthday"), bundle.getInt("age")));
            }
            drfVar.a(bArr);
            drfVar.e(bundle.getInt(CommonConstant.KEY_GENDER));
            drfVar.d(bundle.getFloat("weight"));
            drfVar.c(bArr2);
            drfVar.d(bundle.getInt("height"));
            if (dor.b(str)) {
                drfVar.b(dor.e(bundle.getInt("birthday")));
            }
        }
        return drfVar;
    }

    public static ArrayList<byte[]> a(ArrayList<byte[]> arrayList) {
        byte[] bArr;
        ArrayList<byte[]> arrayList2 = new ArrayList<>(16);
        if (arrayList == null) {
            LogUtil.j("HwWspMeasureUtil", "value is null");
            return arrayList2;
        }
        Iterator<byte[]> it = arrayList.iterator();
        while (it.hasNext()) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(it.next());
            while (byteBufferWrap.position() < byteBufferWrap.limit()) {
                if (byteBufferWrap.position() + 20 <= byteBufferWrap.limit()) {
                    bArr = new byte[20];
                } else {
                    bArr = new byte[byteBufferWrap.limit() - byteBufferWrap.position()];
                }
                byteBufferWrap.get(bArr);
                arrayList2.add(bArr);
            }
        }
        return arrayList2;
    }

    public static void d(UUID uuid, UUID uuid2, dro droVar, IAsynBleTaskCallback iAsynBleTaskCallback, efx efxVar) {
        if (efxVar == null) {
            LogUtil.j("HwWspMeasureUtil", "setCharacteristicNotificationUds: mDevice is null");
            return;
        }
        String address = efxVar.getAddress();
        if (TextUtils.isEmpty(address)) {
            LogUtil.j("HwWspMeasureUtil", "setCharacteristicNotificationUds: address is null");
            return;
        }
        boolean zB = droVar != null ? droVar.c().b() : false;
        UniteDevice uniteDeviceB = dxx.d().b(address);
        if (uuid != null && uuid2 != null) {
            drc.b().b(uniteDeviceB, uuid.toString(), uuid2.toString(), zB);
        }
        if (iAsynBleTaskCallback != null) {
            iAsynBleTaskCallback.success(null);
        }
    }

    public static void e(byte[] bArr, String str, dnj dnjVar) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("realTimeData", bArr);
        bundle.putString("unique_id", str);
        if (dnjVar != null) {
            bundle.putInt("age", dnjVar.c());
        }
        EventBus.a(new EventBus.d("real_time_weight_info", bundle));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    public static boolean a(dnj dnjVar) {
        boolean z = false;
        if (dnjVar == null) {
            LogUtil.j("HwWspMeasureUtil", "user is null");
            return false;
        }
        dnj currentUser = MultiUsersManager.INSTANCE.getCurrentUser();
        String strI = currentUser.i();
        if (strI != null) {
            if (strI.equals(dnjVar.i())) {
                z = true;
            }
        } else if (currentUser.m() == 1 && currentUser.m() == dnjVar.m()) {
            z = true;
        } else {
            LogUtil.j("HwWspMeasureUtil", "could not determin, assume not same user");
        }
        LogUtil.a("HwWspMeasureUtil", "current user is same: ", Boolean.valueOf(z));
        return z;
    }

    public static boolean c(efx efxVar, String str, Map<String, Set<UUID>> map, UUID uuid) {
        if (efxVar == null || TextUtils.isEmpty(efxVar.getAddress())) {
            LogUtil.j("HwWspMeasureUtil", "isSupportCharacteristic device or device address is empty");
            return false;
        }
        if (dxm.aq(str)) {
            Integer num = dpg.c().get(uuid);
            BleTaskQueueUtil.TaskType[] taskTypeArrValues = BleTaskQueueUtil.TaskType.values();
            if (num == null || njy.e(taskTypeArrValues, num.intValue())) {
                LogUtil.j("HwWspMeasureUtil", "isSupportCharacteristic : type is null or index is out of bound");
                return false;
            }
            dpg.e eVar = dpg.b().get(taskTypeArrValues[num.intValue()]);
            if (eVar == null) {
                LogUtil.j("HwWspMeasureUtil", "isSupportCharacteristic map is null");
                return false;
            }
            String address = efxVar.getAddress();
            if (TextUtils.isEmpty(address)) {
                return false;
            }
            return drc.b().a(dxx.d().b(address), eVar.c().toString(), eVar.a().toString());
        }
        if (map == null || map.isEmpty()) {
            LogUtil.j("HwWspMeasureUtil", "isSupportCharacteristic deviceCapacities is null or is empty");
            return false;
        }
        Set<UUID> set = map.get(efxVar.getAddress());
        if (njy.e(set)) {
            LogUtil.j("HwWspMeasureUtil", "isSupportCharacteristic characteristicSet is null or is empty");
            return false;
        }
        return set.contains(uuid);
    }

    public static dnj b(drf drfVar) {
        if (drfVar == null) {
            LogUtil.j("HwWspMeasureUtil", "buildUserBaseInfor bean is null");
            return null;
        }
        dnj dnjVar = new dnj();
        dnjVar.e(drfVar.a());
        dnjVar.c(drfVar.d());
        dnjVar.e(drfVar.i());
        dnjVar.b(drfVar.c());
        return dnjVar;
    }

    public static void c(byte[] bArr) {
        if (bArr != null && bArr.length > 0 && bArr[0] == 9) {
            dpa.b().c(bArr);
        } else {
            LogUtil.a("HwWspMeasureUtil", "parseDataContents enter.");
            dns.c().c(bArr);
        }
    }

    public static void c(dom domVar, String str) {
        if (domVar == null) {
            LogUtil.j("HwWspMeasureUtil", "updateBondedDeviceSn deviceVersion is null");
            return;
        }
        dxm.g(str, domVar.e());
        String strB = domVar.b();
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        LogUtil.a("HwWspMeasureUtil", "onReceiveVersionCode serialNumber is not null");
        dxm.d(strB, str);
        dxm.b(str, strB);
        ContentValues contentValues = new ContentValues();
        contentValues.put("sn", strB);
        dmp.d().a(contentValues, "uniqueId=?", new String[]{str});
    }

    public static void a(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
            LogUtil.e("HwWspMeasureUtil", "sleep delay interrupted");
        }
    }
}
