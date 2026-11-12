package com.xiaomi.fitness.notify.callnotify.smsreply;

import android.os.Bundle;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.qxg;
import defpackage.s7r;
import defpackage.vxg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b*\u0010+J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0082\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0019\u001a\u00020\u000e2\u001a\u0010\u0018\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u000e0\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010\u001e\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010 \u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\u001cH\u0016¢\u0006\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u0004\u0018\u00010\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/notify/callnotify/smsreply/BleSmsReplyViewModel;", "Lcom/xiaomi/fitness/notify/callnotify/smsreply/BaseSmsReplyViewModel;", "", "", "", "Lcom/xiaomi/fitness/notify/callnotify/smsreply/SmsAdapter$Sms;", "toSmsList", "([Ljava/lang/String;)Ljava/util/List;", "toStringArray", "(Ljava/util/List;)[Ljava/lang/String;", "", "id", "Lkotlin/Function1;", "Lqxg;", "", "Lkotlin/ExtensionFunctionType;", "extra", "Ls7r;", "createPacket", "(ILkotlin/jvm/functions/Function1;)Ls7r;", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "callback", "getSmsList", "(Lkotlin/jvm/functions/Function1;)V", "smsList", "Lkotlin/Function2;", "", "doSyncSmsList", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "doDeleteSms", "(ILkotlin/jvm/functions/Function2;)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDid", "()Ljava/lang/String;", "did", "getTAG", "TAG", "<init>", "()V", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBleSmsReplyViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleSmsReplyViewModel.kt\ncom/xiaomi/fitness/notify/callnotify/smsreply/BleSmsReplyViewModel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,115:1\n107#1,7:116\n107#1,7:127\n107#1,7:142\n11158#2:123\n11493#2,3:124\n1557#3:134\n1628#3,3:135\n37#4:138\n36#4,3:139\n*S KotlinDebug\n*F\n+ 1 BleSmsReplyViewModel.kt\ncom/xiaomi/fitness/notify/callnotify/smsreply/BleSmsReplyViewModel\n*L\n37#1:116,7\n60#1:127,7\n85#1:142,7\n57#1:123\n57#1:124,3\n82#1:134\n82#1:135,3\n82#1:138\n82#1:139,3\n*E\n"})
public final class BleSmsReplyViewModel extends BaseSmsReplyViewModel {

    @Nullable
    private WearableDeviceModel mDeviceModel;

    private final s7r createPacket(int id, Function1<? super qxg, Unit> extra) {
        s7r s7rVar = new s7r();
        s7rVar.f = id;
        s7rVar.e = 7;
        qxg qxgVar = new qxg();
        extra.invoke2(qxgVar);
        s7rVar.a0(qxgVar);
        return s7rVar;
    }

    private final String getDid() {
        WearableDeviceModel wearableDeviceModel = this.mDeviceModel;
        if (wearableDeviceModel != null) {
            return wearableDeviceModel.getDid();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<SmsAdapter.Sms> toSmsList(String[] strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new SmsAdapter.Sms(str));
        }
        return arrayList;
    }

    private final String[] toStringArray(List<SmsAdapter.Sms> list) {
        List<SmsAdapter.Sms> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((SmsAdapter.Sms) it.next()).getContent());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // com.xiaomi.fitness.notify.callnotify.smsreply.BaseSmsReplyViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        super.attach(savedInstanceState);
        this.mDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    @Override // com.xiaomi.fitness.notify.callnotify.smsreply.BaseSmsReplyViewModel
    public void doDeleteSms(final int id, @NotNull final Function2<? super Boolean, ? super Integer, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        s7r s7rVar = new s7r();
        s7rVar.f = 11;
        s7rVar.e = 7;
        qxg qxgVar = new qxg();
        vxg.a aVar = new vxg.a();
        aVar.c = 1;
        aVar.d = new int[]{id};
        qxgVar.D(aVar);
        s7rVar.a0(qxgVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), getDid(), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.notify.callnotify.smsreply.BleSmsReplyViewModel.doDeleteSms.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.e(BleSmsReplyViewModel.this.getTAG(), "doDeleteSms " + id + " error:" + did + " " + code);
                callback.invoke(Boolean.FALSE, Integer.valueOf(code));
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                s7r packet;
                qxg qxgVarC;
                Logger.i(BleSmsReplyViewModel.this.getTAG(), "doDeleteSms " + id + " suc");
                if (result == null || (packet = result.getPacket()) == null || (qxgVarC = packet.C()) == null) {
                    onError(did, type, -1);
                } else {
                    int iU = qxgVarC.u();
                    callback.invoke(Boolean.valueOf(iU == 0), Integer.valueOf(iU));
                }
            }
        }, 0, 16, (Object) null);
    }

    @Override // com.xiaomi.fitness.notify.callnotify.smsreply.BaseSmsReplyViewModel
    public void doSyncSmsList(@NotNull List<SmsAdapter.Sms> smsList, @NotNull final Function2<? super Boolean, ? super Integer, Unit> callback) {
        Intrinsics.checkNotNullParameter(smsList, "smsList");
        Intrinsics.checkNotNullParameter(callback, "callback");
        s7r s7rVar = new s7r();
        s7rVar.f = 12;
        s7rVar.e = 7;
        qxg qxgVar = new qxg();
        vxg vxgVar = new vxg();
        vxgVar.c = 1;
        vxgVar.d = toStringArray(smsList);
        vxgVar.e = getMaxSmsCount();
        qxgVar.C(vxgVar);
        s7rVar.a0(qxgVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), getDid(), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.notify.callnotify.smsreply.BleSmsReplyViewModel.doSyncSmsList.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.e(this.getTAG(), "doSyncSmsList error:" + did + " " + code);
                callback.invoke(Boolean.FALSE, Integer.valueOf(code));
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                s7r packet;
                qxg qxgVarC;
                if (result == null || (packet = result.getPacket()) == null || (qxgVarC = packet.C()) == null) {
                    onError(did, type, -1);
                } else {
                    int iU = qxgVarC.u();
                    callback.invoke(Boolean.valueOf(iU == 0), Integer.valueOf(iU));
                }
            }
        }, 0, 16, (Object) null);
    }

    @Override // com.xiaomi.fitness.notify.callnotify.smsreply.BaseSmsReplyViewModel
    public void getSmsList(@NotNull final Function1<? super List<SmsAdapter.Sms>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        s7r s7rVar = new s7r();
        s7rVar.f = 9;
        s7rVar.e = 7;
        qxg qxgVar = new qxg();
        qxgVar.F(1);
        s7rVar.a0(qxgVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), getDid(), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.notify.callnotify.smsreply.BleSmsReplyViewModel.getSmsList.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.e(BleSmsReplyViewModel.this.getTAG(), "getSmsList error:" + did + " " + code);
                callback.invoke2(null);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                s7r packet;
                qxg qxgVarC;
                vxg vxgVarT;
                if (result == null || (packet = result.getPacket()) == null || (qxgVarC = packet.C()) == null || (vxgVarT = qxgVarC.t()) == null) {
                    onError(did, type, -1);
                    return;
                }
                BleSmsReplyViewModel bleSmsReplyViewModel = BleSmsReplyViewModel.this;
                Function1<List<SmsAdapter.Sms>, Unit> function1 = callback;
                int i = vxgVarT.e;
                if (i > 0) {
                    bleSmsReplyViewModel.setMaxSmsCount(i);
                }
                String[] contents = vxgVarT.d;
                Intrinsics.checkNotNullExpressionValue(contents, "contents");
                function1.invoke2(bleSmsReplyViewModel.toSmsList(contents));
            }
        }, 0, 16, (Object) null);
    }

    @Override // com.xiaomi.fitness.notify.callnotify.smsreply.BaseSmsReplyViewModel
    @NotNull
    public String getTAG() {
        return "BleSmsReplyViewModel";
    }
}
