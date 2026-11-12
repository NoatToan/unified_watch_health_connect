package com.huawei.health.basesport.wearengine;

import android.content.Context;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.constant.ConnectState;
import com.huawei.unitedevice.manager.EngineLogicBaseManager;
import defpackage.dey;
import defpackage.dff;
import defpackage.njy;
import defpackage.xiu;
import health.compact.a.HEXUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public abstract class SportBaseEngineManager extends EngineLogicBaseManager {
    private List<DeviceStateListener> mConnectionStatusListeners;
    private Map<Integer, Set<DataReceiver>> mDataReceiverMap;
    private final Object mObserverLock;
    private SendCallback mSendCallback;

    protected abstract String getTag();

    static class c implements SendCallback {
        String e;

        c(String str) {
            this.e = str;
        }

        @Override // com.huawei.health.deviceconnect.callback.SendCallback
        public void onSendResult(int i) {
            LogUtil.a(this.e, "sendCommand errCode:", Integer.valueOf(i));
        }

        @Override // com.huawei.health.deviceconnect.callback.SendCallback
        public void onSendProgress(long j) {
            LogUtil.a(this.e, "sendCommand process:", Long.valueOf(j));
        }

        @Override // com.huawei.health.deviceconnect.callback.SendCallback
        public void onFileTransferReport(String str) {
            LogUtil.a(this.e, "DefaultSendCallback onFileTransferReport transferWay: ", str);
        }
    }

    public SportBaseEngineManager(Context context) {
        super(context);
        this.mObserverLock = new Object();
        this.mSendCallback = new c(getTag());
        this.mDataReceiverMap = new ConcurrentHashMap();
        this.mConnectionStatusListeners = new CopyOnWriteArrayList();
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onReceiveDeviceCommand(DeviceInfo deviceInfo, int i, xiu xiuVar) {
        ReleaseLogUtil.d(getTag(), "onReceiveDeviceCommand errorCode ", Integer.valueOf(i));
        if (xiuVar != null) {
            if (xiuVar.c() == 2) {
                ReleaseLogUtil.e(getTag(), "onReceiveDeviceCommand type is file, pls check.");
                return;
            }
            byte[] bArrB = xiuVar.b();
            if (bArrB == null || bArrB.length <= dey.d()) {
                ReleaseLogUtil.e(getTag(), "data illegal");
                return;
            }
            LogUtil.j(getTag(), "dataInfo", HEXUtils.a(bArrB));
            dey deyVar = new dey(Arrays.copyOfRange(bArrB, 0, dey.d()));
            LogUtil.j(getTag(), "onReceiveDeviceCommand msgHead:", deyVar.toString());
            dispatchReceiveData(deyVar, Arrays.copyOfRange(bArrB, dey.d(), bArrB.length));
            return;
        }
        LogUtil.e(getTag(), "onReceiveDeviceCommand Message is null");
    }

    public boolean registerCallback(DataReceiver dataReceiver, int i) {
        boolean zAdd;
        if (dataReceiver == null) {
            return false;
        }
        synchronized (this.mObserverLock) {
            if (!this.mDataReceiverMap.containsKey(Integer.valueOf(i))) {
                this.mDataReceiverMap.put(Integer.valueOf(i), new HashSet(10));
            }
            zAdd = this.mDataReceiverMap.get(Integer.valueOf(i)).add(dataReceiver);
        }
        LogUtil.a(getTag(), "mDataReceiverMap size:", Integer.valueOf(this.mDataReceiverMap.size()), " businessType:", Integer.valueOf(i));
        return zAdd;
    }

    public boolean registerDeviceStateListener(DeviceStateListener deviceStateListener) {
        LogUtil.a(getTag(), "registerDeviceStateListener enter");
        if (deviceStateListener == null) {
            ReleaseLogUtil.a(getTag(), "registerDeviceStateListener listener is null");
            return false;
        }
        return this.mConnectionStatusListeners.add(deviceStateListener);
    }

    public boolean unregisterDeviceStateListener(DeviceStateListener deviceStateListener) {
        LogUtil.a(getTag(), "unregisterDeviceStateListener enter");
        if (deviceStateListener == null) {
            ReleaseLogUtil.a(getTag(), "unregisterDeviceStateListener listener is null");
            return false;
        }
        return this.mConnectionStatusListeners.remove(deviceStateListener);
    }

    public boolean unregisterCallback(DataReceiver dataReceiver, int i) {
        if (dataReceiver == null) {
            LogUtil.j(getTag(), "callback == null");
            return false;
        }
        synchronized (this.mObserverLock) {
            if (!this.mDataReceiverMap.containsKey(Integer.valueOf(i))) {
                LogUtil.j(getTag(), "callback not exist");
                return false;
            }
            Set<DataReceiver> set = this.mDataReceiverMap.get(Integer.valueOf(i));
            boolean zRemove = set != null ? set.remove(dataReceiver) : false;
            LogUtil.a(getTag(), "unregisterCallback businessType:", Integer.valueOf(i));
            return zRemove;
        }
    }

    protected void dispatchReceiveData(dey deyVar, byte[] bArr) {
        if (deyVar == null) {
            LogUtil.e(getTag(), "dispatchReceiveData with null MsgHead, pls check");
            return;
        }
        Set<DataReceiver> set = this.mDataReceiverMap.get(Integer.valueOf(deyVar.c()));
        if (njy.e(set)) {
            ReleaseLogUtil.e(getTag(), "dispatchReceiveData with the type empty observe , type is ", Integer.valueOf(deyVar.c()));
            return;
        }
        ReleaseLogUtil.d(getTag(), "dispatchReceiveData , type is ", Integer.valueOf(deyVar.c()), "observe size is", Integer.valueOf(set.size()));
        for (DataReceiver dataReceiver : set) {
            if (dataReceiver.isMatch(deyVar.a())) {
                dataReceiver.onDataReceived(deyVar, bArr.length, bArr);
            }
        }
    }

    public void sendCommandToDevice(xiu xiuVar) {
        sendComand(xiuVar, this.mSendCallback);
    }

    public void sendCommandToDevice(xiu xiuVar, SendCallback sendCallback) {
        if (sendCallback == null) {
            sendCommandToDevice(xiuVar);
        } else {
            sendComand(xiuVar, sendCallback);
        }
    }

    public void sendCommandToDevice(final String str, final xiu xiuVar, final dff dffVar, final IBaseResponseCallback iBaseResponseCallback) {
        if (dffVar != null) {
            registerCallback(dffVar, dffVar.e());
        }
        sendCommandToDevice(xiuVar, new SendCallback() { // from class: com.huawei.health.basesport.wearengine.SportBaseEngineManager.4
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i) {
                if (i != 500000 && i != 207) {
                    ReleaseLogUtil.a(SportBaseEngineManager.this.getTag(), str, " send failed, resultCode is", Integer.valueOf(i));
                    SportBaseEngineManager.this.releaseMsgResource(xiuVar);
                    dff dffVar2 = dffVar;
                    if (dffVar2 != null) {
                        SportBaseEngineManager.this.unregisterCallback(dffVar2, dffVar2.e());
                    }
                    iBaseResponseCallback.a(1, Integer.valueOf(i));
                    return;
                }
                if (i == 207) {
                    ReleaseLogUtil.d(SportBaseEngineManager.this.getTag(), str, " send success, resultCode is", Integer.valueOf(i));
                    if (dffVar == null) {
                        iBaseResponseCallback.a(0, Integer.valueOf(i));
                    }
                    SportBaseEngineManager.this.releaseMsgResource(xiuVar);
                    return;
                }
                ReleaseLogUtil.e(SportBaseEngineManager.this.getTag(), str, " send called success, resultCode is", Integer.valueOf(i));
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
                LogUtil.a(SportBaseEngineManager.this.getTag(), str, " send progress is", Long.valueOf(j));
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str2) {
                LogUtil.a(SportBaseEngineManager.this.getTag(), "sendCommandToDevice onFileTransferReport transferWay: ", str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseMsgResource(xiu xiuVar) {
        if (xiuVar == null) {
            LogUtil.j(getTag(), " releaseMsgResource failed with null message.");
        } else if (xiuVar.c() == 2) {
            FileUtils.j(xiuVar.e());
        }
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onDeviceConnectionChange(ConnectState connectState, DeviceInfo deviceInfo) {
        if (connectState == null) {
            ReleaseLogUtil.a(getTag(), " onDeviceConnectionChange error with null connectState.");
            return;
        }
        if (njy.e(this.mConnectionStatusListeners)) {
            ReleaseLogUtil.a(getTag(), " onDeviceConnectionChange mConnectionStatusListeners is empty.");
            return;
        }
        ReleaseLogUtil.d(getTag(), "onDeviceConnectionChange state is:", connectState.name(), " listeners size is:", Integer.valueOf(this.mConnectionStatusListeners.size()));
        int i = AnonymousClass2.d[connectState.ordinal()];
        if (i == 1) {
            Iterator<DeviceStateListener> it = this.mConnectionStatusListeners.iterator();
            while (it.hasNext()) {
                it.next().onConnected();
            }
        } else if (i == 2) {
            Iterator<DeviceStateListener> it2 = this.mConnectionStatusListeners.iterator();
            while (it2.hasNext()) {
                it2.next().onDisconnected();
            }
        } else {
            if (i != 3) {
                return;
            }
            Iterator<DeviceStateListener> it3 = this.mConnectionStatusListeners.iterator();
            while (it3.hasNext()) {
                it3.next().onConnecting();
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.basesport.wearengine.SportBaseEngineManager$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[ConnectState.values().length];
            d = iArr;
            try {
                iArr[ConnectState.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[ConnectState.DISCONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[ConnectState.CONNECTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onDestroy() {
        super.onDestroy();
        this.mDataReceiverMap.clear();
        this.mConnectionStatusListeners.clear();
    }
}
