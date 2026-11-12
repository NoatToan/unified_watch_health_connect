package com.xiaomi.fitness.device.manager.remote;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.h;
import com.xiaomi.wearable.connection.IDeviceStateListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016J\u001c\u0010\u000e\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016J\u001c\u0010\u000f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016J$\u0010\u0010\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u0011"}, d2 = {"com/xiaomi/fitness/device/manager/remote/DeviceManagerRemoteImpl$mDeviceConnectStateListener$1", "Lcom/xiaomi/wearable/connection/IDeviceStateListener;", "onConnectStart", "", "did", "", "onConnectSuccess", "onConnectFailure", "errorCode", "", "retryTimes", "onDisconnect", "onSpecificDeviceConnectStart", "model", "onSpecificDeviceDisconnected", "onSpecificDeviceConnectSuccess", "onSpecificDeviceConnectFailure", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceManagerRemoteImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceManagerRemoteImpl.kt\ncom/xiaomi/fitness/device/manager/remote/DeviceManagerRemoteImpl$mDeviceConnectStateListener$1\n+ 2 ListExt.kt\ncom/xiaomi/fitness/common/extensions/ListExtKt\n*L\n1#1,1241:1\n90#2,19:1242\n90#2,19:1261\n90#2,19:1280\n90#2,19:1299\n90#2,19:1318\n90#2,19:1337\n90#2,19:1356\n90#2,19:1375\n*S KotlinDebug\n*F\n+ 1 DeviceManagerRemoteImpl.kt\ncom/xiaomi/fitness/device/manager/remote/DeviceManagerRemoteImpl$mDeviceConnectStateListener$1\n*L\n89#1:1242,19\n96#1:1261,19\n104#1:1280,19\n117#1:1299,19\n125#1:1318,19\n132#1:1337,19\n139#1:1356,19\n146#1:1375,19\n*E\n"})
public final class DeviceManagerRemoteImpl$mDeviceConnectStateListener$1 implements IDeviceStateListener {
    final /* synthetic */ DeviceManagerRemoteImpl this$0;

    public DeviceManagerRemoteImpl$mDeviceConnectStateListener$1(DeviceManagerRemoteImpl deviceManagerRemoteImpl) {
        this.this$0 = deviceManagerRemoteImpl;
    }

    @Override // com.xiaomi.wearable.connection.IDeviceStateListener
    public void onConnectFailure(String did, int errorCode, int retryTimes) {
        Intrinsics.checkNotNullParameter(did, "did");
        this.this$0.setDeviceStatus(did, 1);
        RemoteCallbackList remoteCallbackList = this.this$0.mDeviceStatusListeners;
        try {
            try {
                try {
                    int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                            Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                            h hVar = (h) broadcastItem;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            hVar.onConnectFailure(did, errorCode, retryTimes);
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                            if (jCurrentTimeMillis2 > 1000) {
                                DeviceModelExtKt.logi("DeviceManagerRemoteImpl", "onConnectFailure() cost = " + jCurrentTimeMillis2 + ", " + hVar);
                            }
                        } catch (Exception e) {
                            Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e2) {
                    Logger.e("An exception occurred when finishBroadcast", e2);
                }
            } catch (Exception e3) {
                Logger.e("An exception occurred during RemoteCallbackList forEach", e3);
                remoteCallbackList.finishBroadcast();
            }
            this.this$0.onConnectFailureInternal(did, errorCode, retryTimes);
        } catch (Throwable th) {
            try {
                remoteCallbackList.finishBroadcast();
            } catch (Exception e4) {
                Logger.e("An exception occurred when finishBroadcast", e4);
            }
            throw th;
        }
    }

    @Override // com.xiaomi.wearable.connection.IDeviceStateListener
    public void onConnectStart(String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        this.this$0.setDeviceStatus(did, 2);
        RemoteCallbackList remoteCallbackList = this.this$0.mDeviceStatusListeners;
        try {
            try {
                try {
                    int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                            Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                            ((h) broadcastItem).onConnectStart(did);
                        } catch (Exception e) {
                            Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e2) {
                    Logger.e("An exception occurred during RemoteCallbackList forEach", e2);
                    remoteCallbackList.finishBroadcast();
                }
            } catch (Throwable th) {
                try {
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e3) {
                    Logger.e("An exception occurred when finishBroadcast", e3);
                }
                throw th;
            }
        } catch (Exception e4) {
            Logger.e("An exception occurred when finishBroadcast", e4);
        }
    }

    @Override // com.xiaomi.wearable.connection.IDeviceStateListener
    public void onConnectSuccess(String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        this.this$0.setDeviceStatus(did, 3);
        RemoteCallbackList remoteCallbackList = this.this$0.mDeviceStatusListeners;
        try {
            try {
                try {
                    int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                            Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                            ((h) broadcastItem).onConnectSuccess(did);
                        } catch (Exception e) {
                            Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e2) {
                    Logger.e("An exception occurred during RemoteCallbackList forEach", e2);
                    remoteCallbackList.finishBroadcast();
                }
            } catch (Throwable th) {
                try {
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e3) {
                    Logger.e("An exception occurred when finishBroadcast", e3);
                }
                throw th;
            }
        } catch (Exception e4) {
            Logger.e("An exception occurred when finishBroadcast", e4);
        }
        this.this$0.onConnectSuccessInternal(did);
    }

    @Override // com.xiaomi.wearable.connection.IDeviceStateListener
    public void onDisconnect(String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        this.this$0.setDeviceStatus(did, 4);
        RemoteCallbackList remoteCallbackList = this.this$0.mDeviceStatusListeners;
        try {
            try {
                try {
                    int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                            Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                            ((h) broadcastItem).onDisconnect(did);
                        } catch (Exception e) {
                            Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e2) {
                    Logger.e("An exception occurred during RemoteCallbackList forEach", e2);
                    remoteCallbackList.finishBroadcast();
                }
            } catch (Throwable th) {
                try {
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e3) {
                    Logger.e("An exception occurred when finishBroadcast", e3);
                }
                throw th;
            }
        } catch (Exception e4) {
            Logger.e("An exception occurred when finishBroadcast", e4);
        }
        this.this$0.onDisconnectInternal(did);
    }

    @Override // com.xiaomi.wearable.connection.IDeviceStateListener
    public void onSpecificDeviceConnectFailure(String did, String model, int errorCode) {
        this.this$0.setDeviceStatus(did, 1);
        RemoteCallbackList remoteCallbackList = this.this$0.mDeviceStatusListeners;
        try {
            try {
                try {
                    int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                            Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                            ((h) broadcastItem).onSpecificDeviceConnectFailure(did, model, errorCode);
                        } catch (Exception e) {
                            Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e2) {
                    Logger.e("An exception occurred when finishBroadcast", e2);
                }
            } catch (Exception e3) {
                Logger.e("An exception occurred during RemoteCallbackList forEach", e3);
                remoteCallbackList.finishBroadcast();
            }
        } catch (Throwable th) {
            try {
                remoteCallbackList.finishBroadcast();
            } catch (Exception e4) {
                Logger.e("An exception occurred when finishBroadcast", e4);
            }
            throw th;
        }
    }

    @Override // com.xiaomi.wearable.connection.IDeviceStateListener
    public void onSpecificDeviceConnectStart(String did, String model) {
        this.this$0.setDeviceStatus(did, 2);
        RemoteCallbackList remoteCallbackList = this.this$0.mDeviceStatusListeners;
        try {
            try {
                try {
                    int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                            Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                            ((h) broadcastItem).onSpecificDeviceConnectStart(did, model);
                        } catch (Exception e) {
                            Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e2) {
                    Logger.e("An exception occurred when finishBroadcast", e2);
                }
            } catch (Exception e3) {
                Logger.e("An exception occurred during RemoteCallbackList forEach", e3);
                remoteCallbackList.finishBroadcast();
            }
        } catch (Throwable th) {
            try {
                remoteCallbackList.finishBroadcast();
            } catch (Exception e4) {
                Logger.e("An exception occurred when finishBroadcast", e4);
            }
            throw th;
        }
    }

    @Override // com.xiaomi.wearable.connection.IDeviceStateListener
    public void onSpecificDeviceConnectSuccess(String did, String model) {
        this.this$0.setDeviceStatus(did, 3);
        RemoteCallbackList remoteCallbackList = this.this$0.mDeviceStatusListeners;
        try {
            try {
                try {
                    int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                            Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                            ((h) broadcastItem).onSpecificDeviceConnectSuccess(did, model);
                        } catch (Exception e) {
                            Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e2) {
                    Logger.e("An exception occurred when finishBroadcast", e2);
                }
            } catch (Exception e3) {
                Logger.e("An exception occurred during RemoteCallbackList forEach", e3);
                remoteCallbackList.finishBroadcast();
            }
        } catch (Throwable th) {
            try {
                remoteCallbackList.finishBroadcast();
            } catch (Exception e4) {
                Logger.e("An exception occurred when finishBroadcast", e4);
            }
            throw th;
        }
    }

    @Override // com.xiaomi.wearable.connection.IDeviceStateListener
    public void onSpecificDeviceDisconnected(String did, String model) {
        this.this$0.setDeviceStatus(did, 4);
        RemoteCallbackList remoteCallbackList = this.this$0.mDeviceStatusListeners;
        try {
            try {
                try {
                    int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                            Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                            ((h) broadcastItem).onSpecificDeviceDisconnect(did, model);
                        } catch (Exception e) {
                            Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e2) {
                    Logger.e("An exception occurred when finishBroadcast", e2);
                }
            } catch (Exception e3) {
                Logger.e("An exception occurred during RemoteCallbackList forEach", e3);
                remoteCallbackList.finishBroadcast();
            }
        } catch (Throwable th) {
            try {
                remoteCallbackList.finishBroadcast();
            } catch (Exception e4) {
                Logger.e("An exception occurred when finishBroadcast", e4);
            }
            throw th;
        }
    }
}
