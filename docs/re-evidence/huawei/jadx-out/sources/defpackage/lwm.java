package defpackage;

import com.huawei.datatype.DeviceCommand;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwdevice.mainprocess.mgr.hwdevicemodemgr.BusinessBaseClient;
import com.huawei.hwlogsmodel.LogUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lwm extends BusinessBaseClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f40969a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<Integer, List<IBaseResponseCallback>> f40970c = new HashMap(16);
    private String d;

    public lwm(String str) {
        this.d = str;
    }

    public void d(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("DeviceModeClient", "getModeStatus enter");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(38);
        deviceCommand.setCommandID(1);
        deviceCommand.setmIdentify(this.d);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put((byte) 2);
        byteBufferAllocate.put((byte) 0);
        deviceCommand.setDataLen(byteBufferAllocate.array().length);
        deviceCommand.setDataContent(byteBufferAllocate.array());
        lvb.e().c(deviceCommand);
        synchronized (this.f40969a) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> list = this.f40970c.get(1);
                if (list == null) {
                    LogUtil.j("DeviceModeClient", "getModeStatus, callbackList is null");
                    ArrayList arrayList = new ArrayList(16);
                    arrayList.add(iBaseResponseCallback);
                    this.f40970c.put(1, arrayList);
                } else {
                    LogUtil.a("DeviceModeClient", "getModeStatus, have callback, add");
                    list.add(iBaseResponseCallback);
                }
            }
        }
    }

    public void d(int i, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("DeviceModeClient", "sendAutoModeDetectSwitchStatus enter");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(38);
        deviceCommand.setCommandID(2);
        deviceCommand.setmIdentify(this.d);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(3);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put(eeq.c(eeq.d(i)));
        deviceCommand.setDataLen(byteBufferAllocate.array().length);
        deviceCommand.setDataContent(byteBufferAllocate.array());
        lvb.e().c(deviceCommand);
        synchronized (this.f40969a) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> list = this.f40970c.get(2);
                if (list == null) {
                    LogUtil.j("DeviceModeClient", "sendAutoModeDetectSwitchStatus, callbackList is null");
                    ArrayList arrayList = new ArrayList(16);
                    arrayList.add(iBaseResponseCallback);
                    this.f40970c.put(2, arrayList);
                } else {
                    LogUtil.a("DeviceModeClient", "sendAutoModeDetectSwitchStatus, have callback, add");
                    list.add(iBaseResponseCallback);
                }
            }
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwdevicemodemgr.BusinessBaseClient
    public void onReceivedData(int i, byte[] bArr) {
        synchronized (this.f40969a) {
            if (i == 0) {
                byte b2 = bArr[1];
                if (b2 == 1 || b2 == 2 || b2 == 3 || b2 == 4) {
                    b(i, b2, bArr);
                } else {
                    LogUtil.j("DeviceModeClient", "onResponse, switch default");
                }
            }
        }
    }

    private void b(int i, int i2, byte[] bArr) {
        List<IBaseResponseCallback> list = this.f40970c.get(Integer.valueOf(i2));
        if (list != null && list.size() > 0) {
            Iterator<IBaseResponseCallback> it = list.iterator();
            while (it.hasNext()) {
                it.next().a(i, bArr);
            }
            this.f40970c.remove(Integer.valueOf(i2));
            return;
        }
        LogUtil.j("DeviceModeClient", "onResponse, callbackList is null or size is zero");
    }
}
