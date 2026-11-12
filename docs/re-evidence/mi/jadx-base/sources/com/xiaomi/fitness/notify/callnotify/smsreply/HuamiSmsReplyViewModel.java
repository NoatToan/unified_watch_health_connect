package com.xiaomi.fitness.notify.callnotify.smsreply;

import android.os.Bundle;
import com.huami.bluetooth.profile.channel.module.call_reply.ReplyMsg;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.wearable.hm.HuamiDataWrapper;
import com.xiaomi.wearable.hm.HuamiDataWrapperKt;
import com.xiaomi.wearable.hm.v;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J$\u0010\u000e\u001a\u00020\u000b2\u001a\u0010\u000f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016J0\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b0\u0015H\u0016J*\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00172\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b0\u0015H\u0016J\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011*\b\u0012\u0004\u0012\u00020\u001b0\u0011H\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/notify/callnotify/smsreply/HuamiSmsReplyViewModel;", "Lcom/xiaomi/fitness/notify/callnotify/smsreply/BaseSmsReplyViewModel;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "curDeviceApi", "Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "getSmsList", "callback", "Lkotlin/Function1;", "", "Lcom/xiaomi/fitness/notify/callnotify/smsreply/SmsAdapter$Sms;", "doSyncSmsList", "smsList", "Lkotlin/Function2;", "", "", "doDeleteSms", "id", "convert2Sms", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyMsg;", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHuamiSmsReplyViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HuamiSmsReplyViewModel.kt\ncom/xiaomi/fitness/notify/callnotify/smsreply/HuamiSmsReplyViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1557#2:64\n1628#2,3:65\n1557#2:68\n1628#2,3:69\n*S KotlinDebug\n*F\n+ 1 HuamiSmsReplyViewModel.kt\ncom/xiaomi/fitness/notify/callnotify/smsreply/HuamiSmsReplyViewModel\n*L\n45#1:64\n45#1:65,3\n62#1:68\n62#1:69,3\n*E\n"})
public final class HuamiSmsReplyViewModel extends BaseSmsReplyViewModel {

    @Nullable
    private HuamiApiCaller curDeviceApi;

    /* JADX INFO: Access modifiers changed from: private */
    public final List<SmsAdapter.Sms> convert2Sms(List<ReplyMsg> list) {
        List<ReplyMsg> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (ReplyMsg replyMsg : list2) {
            arrayList.add(new SmsAdapter.Sms(replyMsg.getId(), replyMsg.getContent()));
        }
        return arrayList;
    }

    @Override // com.xiaomi.fitness.notify.callnotify.smsreply.BaseSmsReplyViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            this.curDeviceApi = DeviceManagerExtKt.getInstance(companion).getHuaMiApiCaller(DeviceModelExtKt.getMac(wearableDeviceModel));
        }
    }

    @Override // com.xiaomi.fitness.notify.callnotify.smsreply.BaseSmsReplyViewModel
    public void doDeleteSms(int id, @NotNull final Function2<? super Boolean, ? super Integer, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        HuamiApiCaller huamiApiCaller = this.curDeviceApi;
        if (huamiApiCaller != null) {
            huamiApiCaller.smsDelete(id, new v.a() { // from class: com.xiaomi.fitness.notify.callnotify.smsreply.HuamiSmsReplyViewModel.doDeleteSms.1
                @Override // com.xiaomi.wearable.hm.v
                public void onResult(int code, List<HuamiDataWrapper> data) {
                    callback.invoke(Boolean.valueOf(code == 1), Integer.valueOf(code));
                }
            });
        } else {
            callback.invoke(Boolean.FALSE, -2);
        }
    }

    @Override // com.xiaomi.fitness.notify.callnotify.smsreply.BaseSmsReplyViewModel
    public void doSyncSmsList(@NotNull List<SmsAdapter.Sms> smsList, @NotNull final Function2<? super Boolean, ? super Integer, Unit> callback) {
        Intrinsics.checkNotNullParameter(smsList, "smsList");
        Intrinsics.checkNotNullParameter(callback, "callback");
        HuamiApiCaller huamiApiCaller = this.curDeviceApi;
        if (huamiApiCaller == null) {
            callback.invoke(Boolean.FALSE, -2);
            return;
        }
        List<SmsAdapter.Sms> list = smsList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SmsAdapter.Sms) it.next()).convert2ReplyMsg());
        }
        huamiApiCaller.smsSyncMsg(arrayList, new v.a() { // from class: com.xiaomi.fitness.notify.callnotify.smsreply.HuamiSmsReplyViewModel.doSyncSmsList.2
            @Override // com.xiaomi.wearable.hm.v
            public void onResult(int code, List<HuamiDataWrapper> data) {
                callback.invoke(Boolean.valueOf(code == 1), Integer.valueOf(code));
            }
        });
    }

    @Override // com.xiaomi.fitness.notify.callnotify.smsreply.BaseSmsReplyViewModel
    public void getSmsList(@NotNull final Function1<? super List<SmsAdapter.Sms>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        HuamiApiCaller huamiApiCaller = this.curDeviceApi;
        if (huamiApiCaller != null) {
            huamiApiCaller.smsQueryData(new v.a() { // from class: com.xiaomi.fitness.notify.callnotify.smsreply.HuamiSmsReplyViewModel.getSmsList.1
                @Override // com.xiaomi.wearable.hm.v
                public void onResult(int code, List<HuamiDataWrapper> data) {
                    if (code == -1) {
                        Logger.e(this.getTAG(), "getDeviceSmsList Timeout");
                        return;
                    }
                    if (code == 0) {
                        Logger.e(this.getTAG(), "getDeviceSmsList failure");
                    } else {
                        if (code != 1) {
                            return;
                        }
                        Function1<List<SmsAdapter.Sms>, Unit> function1 = callback;
                        List listAsData = HuamiDataWrapperKt.asData(data);
                        function1.invoke2(listAsData != null ? this.convert2Sms(listAsData) : null);
                    }
                }
            });
        }
    }

    @Override // com.xiaomi.fitness.notify.callnotify.smsreply.BaseSmsReplyViewModel
    @NotNull
    public String getTAG() {
        return "HuamiSmsReplyViewModel";
    }
}
