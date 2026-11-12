package com.xiaomi.fitness.notify.util;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.dg4;
import defpackage.eg4;
import defpackage.qxg;
import defpackage.rxg;
import defpackage.s7r;
import defpackage.sxg;
import defpackage.txo;
import defpackage.vxo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J0\u0010\u001a\u001a\u00020\u00042!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00040\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001f\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001f\u0010 Jo\u0010$\u001a\u00020\u00042`\u0010\u0019\u001a\\\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00040!¢\u0006\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/notify/util/BlueToothSender;", "", "", "isEnabled", "", "setEnableAutoScreen", "(Z)V", "Lrxg$d;", "notifyDataList", "addNotifications", "(Lrxg$d;)V", "Lsxg$a;", "notifyIdList", "removeNotifications", "(Lsxg$a;)V", "", RealNameWebViewActivity.NUMBER, MediaStoreUtil.MediaInfo.DISPLAY_NAME, "sendContactInfo", "(Ljava/lang/String;Ljava/lang/String;)V", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "result", "callBack", "getEnableAutoScreen", "(Lkotlin/jvm/functions/Function1;)V", "autoScreen", "onlyLockscreen", "onlyWear", "setNotificationSetBySystemSetting", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Lkotlin/Function4;", "isSupport", "isOnlyWear", "getNotificationSetBySystemSetting", "(Lkotlin/jvm/functions/Function4;)V", "TAG", "Ljava/lang/String;", "<init>", "()V", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BlueToothSender {

    @NotNull
    public static final BlueToothSender INSTANCE = new BlueToothSender();

    @NotNull
    public static final String TAG = "BlueToothSender";

    private BlueToothSender() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setEnableAutoScreen(boolean isEnabled) {
        s7r s7rVar = new s7r();
        s7rVar.e = 7;
        s7rVar.f = 7;
        qxg qxgVar = new qxg();
        qxgVar.A(isEnabled);
        s7rVar.a0(qxgVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 8, null);
    }

    public static /* synthetic */ void setNotificationSetBySystemSetting$default(BlueToothSender blueToothSender, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
        if ((i & 4) != 0) {
            bool3 = null;
        }
        blueToothSender.setNotificationSetBySystemSetting(bool, bool2, bool3);
    }

    public final void addNotifications(@Nullable rxg.d notifyDataList) {
        s7r s7rVar = new s7r();
        s7rVar.e = 7;
        s7rVar.f = 0;
        qxg qxgVar = new qxg();
        qxgVar.z(notifyDataList);
        s7rVar.a0(qxgVar);
        try {
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 8, null);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public final void getEnableAutoScreen(@NotNull final Function1<? super Integer, Unit> callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        s7r s7rVar = new s7r();
        s7rVar.e = 7;
        s7rVar.f = 6;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.notify.util.BlueToothSender.getEnableAutoScreen.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.d("BlueToothSender", "getEnableAutoScreen failed code:" + code);
                callBack.invoke2(0);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                qxg qxgVarC;
                s7r packet = result != null ? result.getPacket() : null;
                boolean zQ = (packet == null || (qxgVarC = packet.C()) == null) ? false : qxgVarC.q();
                callBack.invoke2(Integer.valueOf(zQ ? 1 : 2));
                Logger.d("BlueToothSender", "getEnableAutoScreen succeed " + zQ);
            }
        }, 0, 8, null);
    }

    public final void getNotificationSetBySystemSetting(@NotNull final Function4<? super Boolean, ? super Integer, ? super Integer, ? super Integer, Unit> callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 14;
        vxo.i iVar = new vxo.i();
        iVar.c = 1;
        txo txoVar = new txo();
        txoVar.n0(iVar);
        s7rVar.c0(txoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.notify.util.BlueToothSender.getNotificationSetBySystemSetting.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i("BlueToothSender", "getNotificationSetBySystemSetting onError code = " + code);
                if (code == 1) {
                    callBack.invoke(Boolean.FALSE, 0, 0, 0);
                } else {
                    callBack.invoke(Boolean.FALSE, 0, 0, 0);
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                s7r packet;
                txo txoVarE;
                vxo vxoVarI;
                vxo.g gVar = (result == null || (packet = result.getPacket()) == null || (txoVarE = packet.E()) == null || (vxoVarI = txoVarE.I()) == null) ? null : vxoVarI.c;
                Logger.i("BlueToothSender", "getNotificationSetBySystemSetting onSuccess response = " + gVar);
                if (gVar != null) {
                    callBack.invoke(Boolean.TRUE, Integer.valueOf(gVar.c), Integer.valueOf(gVar.d), Integer.valueOf(gVar.e));
                }
            }
        }, 0, 8, null);
    }

    public final void removeNotifications(@Nullable sxg.a notifyIdList) {
        s7r s7rVar = new s7r();
        s7rVar.e = 7;
        s7rVar.f = 1;
        qxg qxgVar = new qxg();
        qxgVar.B(notifyIdList);
        s7rVar.a0(qxgVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 8, null);
    }

    public final void sendContactInfo(@Nullable String number, @Nullable String displayName) {
        s7r s7rVar = new s7r();
        s7rVar.e = 21;
        s7rVar.f = 3;
        dg4 dg4Var = new dg4();
        eg4 eg4Var = new eg4();
        eg4Var.c = displayName;
        eg4Var.d = number;
        dg4Var.t(eg4Var);
        s7rVar.Q(dg4Var);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.notify.util.BlueToothSender.sendContactInfo.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.d("BlueToothSender", "sendContactInfo fail");
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.d("BlueToothSender", "sendContactInfo success");
            }
        }, 0, 8, null);
    }

    public final void setNotificationSetBySystemSetting(@Nullable final Boolean autoScreen, @Nullable final Boolean onlyLockscreen, @Nullable Boolean onlyWear) {
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 15;
        vxo.g gVar = new vxo.g();
        if (autoScreen != null) {
            gVar.c = autoScreen.booleanValue() ? 1 : 2;
        }
        if (onlyLockscreen != null) {
            gVar.d = onlyLockscreen.booleanValue() ? 1 : 2;
        }
        if (onlyWear != null) {
            gVar.e = onlyWear.booleanValue() ? 1 : 2;
        }
        txo txoVar = new txo();
        vxo vxoVar = new vxo();
        vxoVar.c = gVar;
        txoVar.m0(vxoVar);
        s7rVar.c0(txoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.notify.util.BlueToothSender.setNotificationSetBySystemSetting.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i("BlueToothSender", "setNotificationSetBySystemSetting onError code = " + code);
                if (code == 1) {
                    Boolean bool = autoScreen;
                    if (bool != null) {
                        BlueToothSender.INSTANCE.setEnableAutoScreen(bool.booleanValue());
                    }
                    if (onlyLockscreen != null) {
                        NotifyPreference notifyPreference = NotifyPreference.INSTANCE;
                        Intrinsics.checkNotNull(did);
                        notifyPreference.setSyncNotificationOnlyScreenLock(did, onlyLockscreen.booleanValue());
                    }
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.i("BlueToothSender", "setNotificationSetBySystemSetting onSuccess code = " + (result != null ? Integer.valueOf(result.getCode()) : null));
                if (onlyLockscreen != null) {
                    NotifyPreference notifyPreference = NotifyPreference.INSTANCE;
                    Intrinsics.checkNotNull(did);
                    notifyPreference.setSyncNotificationOnlyScreenLock(did, onlyLockscreen.booleanValue());
                }
            }
        }, 0, 8, null);
    }
}
