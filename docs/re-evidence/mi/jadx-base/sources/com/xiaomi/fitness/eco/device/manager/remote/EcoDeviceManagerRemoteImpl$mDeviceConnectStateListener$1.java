package com.xiaomi.fitness.eco.device.manager.remote;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.g8h;
import defpackage.yrc;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007J/\u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0007¨\u0006\u000f"}, d2 = {"com/xiaomi/fitness/eco/device/manager/remote/EcoDeviceManagerRemoteImpl$mDeviceConnectStateListener$1", "Lyrc;", "", "did", "mac", "", "onConnectStart", "(Ljava/lang/String;Ljava/lang/String;)V", "onConnectSuccess", "", "errorCode", "retryTimes", "onConnectFailure", "(Ljava/lang/String;Ljava/lang/String;II)V", "onDisconnect", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEcoDeviceManagerRemoteImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoDeviceManagerRemoteImpl.kt\ncom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceManagerRemoteImpl$mDeviceConnectStateListener$1\n+ 2 ListExt.kt\ncom/xiaomi/fitness/common/extensions/ListExtKt\n*L\n1#1,768:1\n90#2,19:769\n90#2,19:788\n90#2,19:807\n90#2,19:826\n*S KotlinDebug\n*F\n+ 1 EcoDeviceManagerRemoteImpl.kt\ncom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceManagerRemoteImpl$mDeviceConnectStateListener$1\n*L\n74#1:769,19\n82#1:788,19\n90#1:807,19\n98#1:826,19\n*E\n"})
public final class EcoDeviceManagerRemoteImpl$mDeviceConnectStateListener$1 implements yrc {
    final /* synthetic */ EcoDeviceManagerRemoteImpl this$0;

    public EcoDeviceManagerRemoteImpl$mDeviceConnectStateListener$1(EcoDeviceManagerRemoteImpl ecoDeviceManagerRemoteImpl) {
        this.this$0 = ecoDeviceManagerRemoteImpl;
    }

    @Override // defpackage.c23
    public /* bridge */ /* synthetic */ void onBluetoothError(int i) {
        super.onBluetoothError(i);
    }

    @Override // defpackage.yrc
    public void onConnectFailure(String did, String mac, int errorCode, int retryTimes) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(mac, "mac");
        EcoDeviceModelExtKt.logi("EcoDeviceManagerRemoteImpl", "onConnectFailure...");
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
                            ((g8h) broadcastItem).onConnectFailure(did, mac, errorCode, retryTimes);
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

    @Override // defpackage.yrc
    public void onConnectStart(String did, String mac) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(mac, "mac");
        EcoDeviceModelExtKt.logi("EcoDeviceManagerRemoteImpl", "onConnectStart...");
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
                            ((g8h) broadcastItem).onConnectStart(did, mac);
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

    @Override // defpackage.yrc
    public void onConnectSuccess(String did, String mac) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(mac, "mac");
        EcoDeviceModelExtKt.logi("EcoDeviceManagerRemoteImpl", "onConnectSuccess...");
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
                            ((g8h) broadcastItem).onConnectSuccess(did, mac);
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

    @Override // defpackage.yrc
    public void onDisconnect(String did, String mac) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(mac, "mac");
        EcoDeviceModelExtKt.logi("EcoDeviceManagerRemoteImpl", "onDisconnect...");
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
                            ((g8h) broadcastItem).onDisconnect(did, mac);
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

    @Override // defpackage.yrc
    public /* bridge */ /* synthetic */ void onWearConnectFailure(int i, String str, int i2) {
        super.onWearConnectFailure(i, str, i2);
    }

    @Override // defpackage.yrc
    public /* bridge */ /* synthetic */ void onWearConnectStart() {
        super.onWearConnectStart();
    }

    @Override // defpackage.yrc
    public /* bridge */ /* synthetic */ void onWearConnectSuccess() {
        super.onWearConnectSuccess();
    }

    @Override // defpackage.yrc
    public /* bridge */ /* synthetic */ void onWearDisconnect() {
        super.onWearDisconnect();
    }
}
