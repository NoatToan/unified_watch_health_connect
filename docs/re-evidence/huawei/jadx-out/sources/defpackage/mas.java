package defpackage;

import android.content.Context;
import com.huawei.callback.BluetoothDataReceiveCallback;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class mas extends HwBaseManager implements BluetoothDataReceiveCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static mas f41290b;
    private lvb d;
    private int e;
    private eet f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<Integer, List<IBaseResponseCallback>> f41291c = new HashMap(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static List<Integer> f41289a = new ArrayList(Arrays.asList(1, 2));

    private mas(Context context) {
        super(context);
        this.f = new eet();
        lvb lvbVarE = lvb.e();
        this.d = lvbVarE;
        if (lvbVarE != null) {
            lvbVarE.d(34, this);
        } else {
            LogUtil.j("HwOneLevelMenuManager", "HwWearableManager() hwDeviceConfigManager is null");
        }
    }

    private static Object e() {
        Map<Integer, List<IBaseResponseCallback>> map;
        synchronized (mas.class) {
            map = f41291c;
        }
        return map;
    }

    public static mas c(Context context) {
        mas masVar;
        synchronized (e()) {
            LogUtil.a("OneLevelMenuManagerActivity", "instance = ", f41290b);
            mas masVar2 = f41290b;
            if (masVar2 != null) {
                masVar2.onDestroy();
            }
            if (f41291c.isEmpty()) {
                Iterator<Integer> it = f41289a.iterator();
                while (it.hasNext()) {
                    f41291c.put(it.next(), new ArrayList(16));
                }
            }
            if (f41290b == null && context != null) {
                f41290b = new mas(BaseApplication.getContext());
            }
            masVar = f41290b;
        }
        return masVar;
    }

    private void a(byte[] bArr) {
        Object objE;
        int iC = c(bArr);
        if (iC == 100000) {
            this.e = 0;
        } else {
            this.e = -1;
        }
        LogUtil.a("HwOneLevelMenuManager", "getResult(): ", eeq.e(bArr));
        byte b2 = bArr[1];
        if (b2 == 1) {
            objE = e(bArr);
        } else if (b2 == 2) {
            objE = Integer.valueOf(iC);
        } else {
            LogUtil.j("HwOneLevelMenuManager", "not support the commandIdList");
            objE = null;
        }
        d(bArr[1], this.e, objE);
    }

    private Object e(byte[] bArr) {
        String strE = eeq.e(bArr);
        HashMap map = new HashMap(16);
        if (strE != null && strE.length() > 4) {
            try {
                for (eew eewVar : this.f.b(strE.substring(4, strE.length())).e()) {
                    int iB = CommonUtil.b(eewVar.e(), 16);
                    if (iB == -1) {
                        LogUtil.a("HwOneLevelMenuManager", "getResult() OneLevelMenuConstants.ONE_LEVEL_MENU_ERROR_CODE");
                    } else if (iB == 1) {
                        this.e = 0;
                        map.put("all", eeq.c(eewVar.b()));
                    } else if (iB != 2) {
                        LogUtil.j("HwOneLevelMenuManager", "not support the typeId");
                    } else {
                        this.e = 0;
                        map.put("open", eeq.c(eewVar.b()));
                    }
                }
            } catch (eeu e) {
                LogUtil.e("HwOneLevelMenuManager", "getResult() command id mune set error = ", e.getMessage());
            }
        }
        return map;
    }

    private void d(int i, int i2, Object obj) {
        synchronized (e()) {
            Map<Integer, List<IBaseResponseCallback>> map = f41291c;
            if (map == null) {
                LogUtil.j("HwOneLevelMenuManager", "procCallback callback, commandCallback is null");
                return;
            }
            List<IBaseResponseCallback> list = map.get(Integer.valueOf(i));
            if (list != null) {
                if (obj != null && list.size() != 0) {
                    LogUtil.a("HwOneLevelMenuManager", "procCallback callback,commandIdList =", Integer.valueOf(i));
                    list.get(0).a(i2, obj);
                    list.remove(0);
                } else if (list.size() != 0) {
                    list.get(0).a(100001, "UNKNOWN_ERROR");
                    list.remove(0);
                }
            } else {
                LogUtil.a("HwOneLevelMenuManager", "procCallback callback,callbackList is null");
            }
        }
    }

    public void e(String str, List<Integer> list, IBaseResponseCallback iBaseResponseCallback) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(34);
        deviceCommand.setCommandID(2);
        deviceCommand.setmIdentify(str);
        StringBuffer stringBuffer = new StringBuffer(16);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(eeq.d(it.next().intValue()));
        }
        String string = stringBuffer.toString();
        String strB = eeq.b(string.length() / 2);
        String strD = eeq.d(2);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((strD.length() / 2) + (strB.length() / 2) + (string.length() / 2));
        byteBufferAllocate.put(eeq.c(strD + strB + string));
        LogUtil.a("DEVMGR_SETTING", "HwOneLevelMenuManager", " transmitFile() , byteBufferAll", eeq.e(byteBufferAllocate.array()));
        b(deviceCommand, byteBufferAllocate, 2, iBaseResponseCallback);
    }

    public void d(String str, IBaseResponseCallback iBaseResponseCallback) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(34);
        deviceCommand.setCommandID(1);
        deviceCommand.setmIdentify(str);
        String strB = eeq.b(0);
        String strD = eeq.d(1);
        String strB2 = eeq.b(0);
        String strD2 = eeq.d(2);
        int length = strB.length() / 2;
        int length2 = strD.length() / 2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + length2 + (strD2.length() / 2) + (strB2.length() / 2));
        byteBufferAllocate.put(eeq.c(strD));
        byteBufferAllocate.put(eeq.c(strB));
        byteBufferAllocate.put(eeq.c(strD2));
        byteBufferAllocate.put(eeq.c(strB2));
        LogUtil.d("HwOneLevelMenuManager", "getBTCInfo() byteBufferAll = ", eeq.e(byteBufferAllocate.array()));
        b(deviceCommand, byteBufferAllocate, 1, iBaseResponseCallback);
    }

    private void b(DeviceCommand deviceCommand, ByteBuffer byteBuffer, int i, IBaseResponseCallback iBaseResponseCallback) {
        synchronized (e()) {
            try {
                if (iBaseResponseCallback != null) {
                    List<IBaseResponseCallback> list = f41291c.get(Integer.valueOf(i));
                    if (list != null) {
                        LogUtil.a("HwOneLevelMenuManager", "addToList(), callbacks != null");
                        list.add(iBaseResponseCallback);
                    } else {
                        LogUtil.j("HwOneLevelMenuManager", "addToList() callbacks is null");
                    }
                } else {
                    LogUtil.j("HwOneLevelMenuManager", "addToList() callback is null");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        deviceCommand.setDataLen(byteBuffer.array().length);
        deviceCommand.setDataContent(byteBuffer.array());
        this.d.c(deviceCommand);
    }

    private static void c() {
        f41290b = null;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public void onDestroy() {
        super.onDestroy();
        this.d.c(34);
        synchronized (e()) {
            for (Integer num : f41289a) {
                if (f41291c.get(num) != null) {
                    f41291c.get(num).clear();
                }
            }
        }
        LogUtil.a("HwOneLevelMenuManager", "onDestroy()");
        c();
        LogUtil.a("HwOneLevelMenuManager", "onDestroy() complete");
    }

    private int c(byte[] bArr) {
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() <= 8) {
            return 0;
        }
        try {
            return Integer.parseInt(strE.substring(8, strE.length()), 16);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 34;
    }

    @Override // com.huawei.callback.BluetoothDataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, byte[] bArr) {
        if (bArr != null) {
            LogUtil.a("HwOneLevelMenuManager", "OneLevelMenu manager receive data = ", eeq.e(bArr));
            a(bArr);
        } else {
            LogUtil.j("HwOneLevelMenuManager", "data is null");
        }
    }
}
