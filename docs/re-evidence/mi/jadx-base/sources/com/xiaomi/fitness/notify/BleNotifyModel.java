package com.xiaomi.fitness.notify;

import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import com.xiaomi.fitness.notify.BleNotifyModel;
import com.xiaomi.fitness.notify.callnotify.CallNotifyViewModel;
import com.xiaomi.fitness.notify.di.NotifyStartExtKt;
import com.xiaomi.fitness.notify.extension.DeviceModelExtKt;
import com.xiaomi.fitness.notify.util.BlueToothSender;
import com.xiaomi.fitness.notify.util.NotifyPreference;
import com.xiaomi.fitness.notify.util.NotifyUtil;
import com.xiaomi.fitness.settingitem.settingitem.InCall;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.q0j;
import defpackage.qxg;
import defpackage.rxg;
import defpackage.s7r;
import defpackage.sxg;
import defpackage.wxg;
import defpackage.xpd;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b7\u0010\"J5\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0017\u001a\u00020\u00162\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001f\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\t¢\u0006\u0004\b&\u0010\"J\u0017\u0010'\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b)\u0010(J\u001d\u0010,\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u000e¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/notify/BleNotifyModel;", "", "", TSMAuthContants.PARAM_PHONE_NUMBER, MediaStoreUtil.MediaInfo.DISPLAY_NAME, "", "callType", "Lcom/xiaomi/fitness/settingitem/settingitem/InCall;", "result", "", "addCallNotification", "(Ljava/lang/String;Ljava/lang/String;ILcom/xiaomi/fitness/settingitem/settingitem/InCall;)V", "", "needRequestCallLogPerm", "()Z", "needRequestContactsPerm", "did", "success", "sendSmsSendResult", "(Ljava/lang/String;Z)V", RealNameWebViewActivity.NUMBER, "callReply", "Lrxg;", "getInCallNotifyData", "(Ljava/lang/String;Ljava/lang/String;IZ)Lrxg;", "status", "updatePhoneStatus", "(I)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "name", "alertCall", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Ljava/lang/String;Ljava/lang/String;)V", "alertInCallStop", "()V", "incomingNumber", "missPhoneCall", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Ljava/lang/String;)V", "alertOutGoingCall", "getInCallResult", "(Ljava/lang/String;)Lcom/xiaomi/fitness/settingitem/settingitem/InCall;", "getInCall", "Lwxg;", "request", "sendSms", "(Ljava/lang/String;Lwxg;)V", "Landroid/os/Handler;", "mAlertIncallHandler", "Landroid/os/Handler;", "phoneStatus", "I", "Ljava/text/SimpleDateFormat;", "mSimpleDateFormat", "Ljava/text/SimpleDateFormat;", "isNeedContactPermGranted", "<init>", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBleNotifyModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleNotifyModel.kt\ncom/xiaomi/fitness/notify/BleNotifyModel\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,279:1\n37#2:280\n36#2,3:281\n37#2:285\n36#2,3:286\n37#2:289\n36#2,3:290\n1#3:284\n*S KotlinDebug\n*F\n+ 1 BleNotifyModel.kt\ncom/xiaomi/fitness/notify/BleNotifyModel\n*L\n90#1:280\n90#1:281,3\n116#1:285\n116#1:286,3\n132#1:289\n132#1:290,3\n*E\n"})
public final class BleNotifyModel {

    @NotNull
    public static final BleNotifyModel INSTANCE = new BleNotifyModel();

    @NotNull
    private static final Handler mAlertIncallHandler = new Handler(Looper.getMainLooper());

    @NotNull
    private static final SimpleDateFormat mSimpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.ENGLISH);
    private static int phoneStatus;

    private BleNotifyModel() {
    }

    private final void addCallNotification(String phoneNumber, String displayName, final int callType, InCall result) {
        rxg inCallNotifyData = getInCallNotifyData(phoneNumber, displayName, callType, result != null ? result.isIncomingCallReply() : false);
        inCallNotifyData.h = mSimpleDateFormat.format(new Date());
        ArrayList arrayList = new ArrayList();
        arrayList.add(inCallNotifyData);
        final rxg.d dVar = new rxg.d();
        dVar.c = (rxg[]) arrayList.toArray(new rxg[0]);
        if (result != null) {
            CallNotifyViewModel.Companion companion = CallNotifyViewModel.INSTANCE;
            if (companion.isDelayNoticeSwitchOn(result)) {
                int delayTime = companion.getDelayTime(result);
                Logger.d("BleNotifyModel", "alertCall display " + displayName + " delay:" + delayTime);
                mAlertIncallHandler.postDelayed(new Runnable() { // from class: ss2
                    @Override // java.lang.Runnable
                    public final void run() {
                        BleNotifyModel.addCallNotification$lambda$1(callType, dVar);
                    }
                }, (long) (delayTime * 1000));
                return;
            }
        }
        Logger.d("BleNotifyModel", "alertCall display false ");
        if (phoneStatus == 1 || callType == 3) {
            BlueToothSender.INSTANCE.addNotifications(dVar);
        }
    }

    public static /* synthetic */ void addCallNotification$default(BleNotifyModel bleNotifyModel, String str, String str2, int i, InCall inCall, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            inCall = null;
        }
        bleNotifyModel.addCallNotification(str, str2, i, inCall);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addCallNotification$lambda$1(int i, rxg.d list) {
        Intrinsics.checkNotNullParameter(list, "$list");
        if (phoneStatus == 1 || i == 3) {
            BlueToothSender.INSTANCE.addNotifications(list);
        }
    }

    private final rxg getInCallNotifyData(String number, String displayName, int callType, boolean callReply) {
        rxg rxgVar = new rxg();
        rxgVar.i = 0;
        rxgVar.c = "phone";
        rxgVar.d = "phone";
        rxgVar.j = "";
        if (number == null || number.length() == 0) {
            rxgVar.e = AppUtil.getApp().getString(q0j.y);
            rxgVar.g = AppUtil.getApp().getString(q0j.i);
        } else if (displayName == null || displayName.length() == 0) {
            rxgVar.e = number;
            rxgVar.g = "";
        } else {
            rxgVar.e = displayName;
            rxgVar.g = number;
        }
        rxgVar.f = "";
        rxgVar.l = callType;
        Logger.i("getInCallNotifyData supportReply:" + callReply, new Object[0]);
        rxgVar.n = callReply;
        return rxgVar;
    }

    private final boolean isNeedContactPermGranted() {
        return needRequestCallLogPerm() || needRequestContactsPerm();
    }

    private final boolean needRequestCallLogPerm() {
        if (Build.VERSION.SDK_INT >= 28) {
            return NotifyUtil.INSTANCE.shouldRequestPermission("android.permission.READ_CALL_LOG");
        }
        return false;
    }

    private final boolean needRequestContactsPerm() {
        return NotifyUtil.INSTANCE.shouldRequestPermission("android.permission.READ_CONTACTS");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendSms$lambda$6(String did, boolean z) {
        Intrinsics.checkNotNullParameter(did, "$did");
        INSTANCE.sendSmsSendResult(did, z);
        return Unit.INSTANCE;
    }

    private final void sendSmsSendResult(String did, final boolean success) {
        if (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did) == 0) {
            Logger.w("sendSmsSendResult " + did + " error: device not connected !", new Object[0]);
            return;
        }
        s7r s7rVar = new s7r();
        s7rVar.e = 7;
        s7rVar.f = 14;
        s7rVar.a0(new qxg());
        s7rVar.C().E(success ? 0 : 4);
        s7rVar.C().G(success ? 0 : 4);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), did, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.notify.BleNotifyModel.sendSmsSendResult.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) {
                Logger.e("sendSmsSendResult " + did2 + " " + success + " error:" + code, new Object[0]);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) {
                s7r packet;
                qxg qxgVarC;
                if (result == null || (packet = result.getPacket()) == null || (qxgVarC = packet.C()) == null) {
                    onError(did2, type, -1);
                    return;
                }
                int iW = qxgVarC.w();
                Logger.i("sendSmsSendResult " + did2 + " " + success + " result:" + (iW == 0), new Object[0]);
            }
        }, 0, 16, (Object) null);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    public final void alertCall(@Nullable WearableDeviceModel deviceModel, @Nullable String phoneNumber, @NotNull String name) {
        boolean z;
        Intrinsics.checkNotNullParameter(name, "name");
        if (deviceModel == null) {
            return;
        }
        InCall inCallResult = getInCallResult(deviceModel.getDid());
        if (inCallResult == null) {
            inCallResult = new InCall();
        }
        if (!inCallResult.isIncallNameDisplayEnabled()) {
            name = "";
        }
        if (NotifyStartExtKt.getNotificationManagerImpl().isDualCallWithOutBle()) {
            if (!DeviceModelExtKt.isSupportSmsReply(deviceModel)) {
                inCallResult = null;
            }
            addCallNotification(phoneNumber, name, 1, inCallResult);
            Logger.i(BaseNotifySyncService.TAG, "alertCall isDual phoneNumber.isNullOrEmpty = " + (phoneNumber == null || phoneNumber.length() == 0) + "displayName.isNullOrEmpty = " + (name.length() == 0));
            return;
        }
        if (inCallResult.isIncallNotifyEnabled()) {
            if (NotifyStartExtKt.getNotificationManagerImpl().isNotificationPolicyAccessGranted()) {
                Application application = ApplicationExtKt.getApplication();
                String[] filterPhoneNotifyPermissionList = NotifyStartExtKt.getNotificationManagerImpl().getFilterPhoneNotifyPermissionList(inCallResult.isIncallNotifyEnabled(), AppUtil.INSTANCE.isPlayChannel());
                if (PermissionExtKt.isPermissionGranted(application, (String[]) Arrays.copyOf(filterPhoneNotifyPermissionList, filterPhoneNotifyPermissionList.length))) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            Logger.i(BaseNotifySyncService.TAG, "alertCall isBLe isCallPermGranted " + z + " phoneNumber.isNullOrEmpty = " + (phoneNumber == null || phoneNumber.length() == 0) + "displayName.isNullOrEmpty = " + (name.length() == 0));
            if (z) {
                if (RomUtils.isXiaomi() && inCallResult.isIncallContactNotifyEnabled() && !isNeedContactPermGranted() && name.length() == 0) {
                    return;
                }
                addCallNotification(phoneNumber, name, 1, inCallResult);
            }
        }
    }

    public final void alertInCallStop() {
        sxg sxgVar = new sxg();
        sxgVar.c = 0;
        sxgVar.d = "phone";
        sxgVar.e = "";
        ArrayList arrayList = new ArrayList();
        arrayList.add(sxgVar);
        sxg.a aVar = new sxg.a();
        aVar.c = (sxg[]) arrayList.toArray(new sxg[0]);
        BlueToothSender.INSTANCE.removeNotifications(aVar);
    }

    public final void alertOutGoingCall() {
        addCallNotification$default(this, "", "", 3, null, 8, null);
    }

    @Nullable
    public final InCall getInCall(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        NotifyPreference notifyPreference = NotifyPreference.INSTANCE;
        String inCallNotifyConfig = notifyPreference.getInCallNotifyConfig(did);
        if (!TextUtils.isEmpty(inCallNotifyConfig)) {
            return (InCall) xpd.f(inCallNotifyConfig, InCall.class);
        }
        String notifyListString = notifyPreference.getNotifyListString(did);
        if (TextUtils.isEmpty(notifyListString)) {
            InCall inCall = new InCall();
            inCall.setInComingCallNotifyTime(SportSummary.VERSION_103);
            return inCall;
        }
        List listG = xpd.g(notifyListString, String.class);
        Intrinsics.checkNotNull(listG, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        if (listG.isEmpty()) {
            InCall inCall2 = new InCall();
            inCall2.setInComingCallNotifyTime(SportSummary.VERSION_103);
            return inCall2;
        }
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            if (StringsKt__StringsJVMKt.equals("telephony_app", (String) it.next(), true)) {
                InCall inCall3 = new InCall();
                inCall3.setInComingCallNotifyTime(SportSummary.VERSION_103);
                inCall3.setIncallNotifyEnabled(true);
                return inCall3;
            }
        }
        InCall inCall4 = new InCall();
        inCall4.setInComingCallNotifyTime(SportSummary.VERSION_103);
        return inCall4;
    }

    @Nullable
    public final InCall getInCallResult(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return getInCall(did);
    }

    public final void missPhoneCall(@NotNull WearableDeviceModel deviceModel, @Nullable String incomingNumber) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        if (!NotifyStartExtKt.getNotificationManagerImpl().isDualCallWithOutBle()) {
            alertInCallStop();
            return;
        }
        sxg sxgVar = new sxg();
        sxgVar.c = 0;
        sxgVar.d = "phone";
        sxgVar.e = "";
        ArrayList arrayList = new ArrayList();
        arrayList.add(sxgVar);
        sxg.a aVar = new sxg.a();
        aVar.c = (sxg[]) arrayList.toArray(new sxg[0]);
        s7r s7rVar = new s7r();
        s7rVar.e = 7;
        s7rVar.f = 1;
        qxg qxgVar = new qxg();
        qxgVar.B(aVar);
        s7rVar.a0(qxgVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.notify.BleNotifyModel.missPhoneCall.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
            }
        }, 0, 8, null);
    }

    public final void sendSms(@NotNull final String did, @NotNull wxg request) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(request, "request");
        if (!request.p()) {
            Logger.e("handleReplyRequest error:phoneNumber is null", new Object[0]);
            return;
        }
        if (request.g) {
            String strO = request.o();
            Intrinsics.checkNotNullExpressionValue(strO, "getPhoneNumber(...)");
            String contents = request.f;
            Intrinsics.checkNotNullExpressionValue(contents, "contents");
            DeviceModelExtKt.sendSms(strO, contents, new Function1() { // from class: rs2
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BleNotifyModel.sendSms$lambda$6(did, ((Boolean) obj).booleanValue());
                }
            });
            return;
        }
        String strO2 = request.o();
        Intrinsics.checkNotNullExpressionValue(strO2, "getPhoneNumber(...)");
        String contents2 = request.f;
        Intrinsics.checkNotNullExpressionValue(contents2, "contents");
        DeviceModelExtKt.sendSms$default(strO2, contents2, null, 4, null);
    }

    public final void updatePhoneStatus(int status) {
        phoneStatus = status;
    }
}
