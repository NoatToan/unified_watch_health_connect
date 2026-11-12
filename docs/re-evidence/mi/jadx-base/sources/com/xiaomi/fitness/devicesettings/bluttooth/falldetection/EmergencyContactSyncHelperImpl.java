package com.xiaomi.fitness.devicesettings.bluttooth.falldetection;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.falldetection.EmergencyContactSyncHelperImpl;
import com.xiaomi.fitness.devicesettings.export.emergency.EmergencyContactSyncHelper;
import com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference;
import defpackage.dg4;
import defpackage.eg4;
import defpackage.fg4;
import defpackage.s7r;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0007¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/EmergencyContactSyncHelperImpl;", "Lcom/xiaomi/fitness/devicesettings/export/emergency/EmergencyContactSyncHelper;", "Lfg4;", "emergencyContact", "", "Leg4;", "list", "", "syncMIUISosToDevice", "(Lfg4;Ljava/util/List;)V", "Lkotlin/Function1;", "contact", "loadData", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "syncEmergencyContacts", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "<init>", "()V", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEmergencyContactSyncHelperImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmergencyContactSyncHelperImpl.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/falldetection/EmergencyContactSyncHelperImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,106:1\n37#2:107\n36#2,3:108\n*S KotlinDebug\n*F\n+ 1 EmergencyContactSyncHelperImpl.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/falldetection/EmergencyContactSyncHelperImpl\n*L\n46#1:107\n46#1:108,3\n*E\n"})
public final class EmergencyContactSyncHelperImpl implements EmergencyContactSyncHelper {

    @NotNull
    private static final String TAG = "EmergencyContactSyncHelperImpl";

    private final void loadData(final Function1<? super fg4, Unit> contact) {
        s7r s7rVar = new s7r();
        s7rVar.e = 21;
        s7rVar.f = 0;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.EmergencyContactSyncHelperImpl.loadData.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(EmergencyContactSyncHelperImpl.TAG, "loadData error: " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                dg4 dg4VarR;
                if (result != null) {
                    s7r packet = result.getPacket();
                    fg4 fg4VarP = (packet == null || (dg4VarR = packet.r()) == null) ? null : dg4VarR.p();
                    if (fg4VarP != null) {
                        contact.invoke(fg4VarP);
                    }
                }
            }
        }, 0, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncEmergencyContacts$lambda$1(boolean z, final EmergencyContactSyncHelperImpl this$0, final fg4 it) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (z) {
            Logger.i(TAG, "sos: " + it.c + " sos: " + it.h);
            MIUISosManager.INSTANCE.supportSyncMIUISosContacts(new Function1() { // from class: j88
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EmergencyContactSyncHelperImpl.syncEmergencyContacts$lambda$1$lambda$0(this.f22518a, it, (List) obj);
                }
            });
        } else if (it.d) {
            this$0.syncMIUISosToDevice(new fg4(), null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncEmergencyContacts$lambda$1$lambda$0(EmergencyContactSyncHelperImpl this$0, fg4 it, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.syncMIUISosToDevice(it, list);
        return Unit.INSTANCE;
    }

    private final void syncMIUISosToDevice(fg4 emergencyContact, List<eg4> list) {
        dg4 dg4Var = new dg4();
        List<eg4> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            emergencyContact.e = null;
            emergencyContact.f = null;
            emergencyContact.c = false;
            emergencyContact.h = 2;
        } else {
            emergencyContact.e = list.get(0);
            emergencyContact.f = list.size() > 1 ? (eg4[]) list.subList(1, list.size()).toArray(new eg4[0]) : null;
        }
        dg4Var.v(emergencyContact);
        s7r s7rVar = new s7r();
        s7rVar.e = 21;
        s7rVar.f = 1;
        s7rVar.Q(dg4Var);
        Logger.d(TAG, "syncSosContactInfo: " + dg4Var);
        Logger.i(TAG, "syncSosContactInfo: " + (list != null ? Integer.valueOf(list.size()) : null));
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.EmergencyContactSyncHelperImpl.syncMIUISosToDevice.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(EmergencyContactSyncHelperImpl.TAG, "set sos fail: " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                if (result == null || !result.isSuccess()) {
                    onError(did, type, 255);
                } else {
                    Logger.i(EmergencyContactSyncHelperImpl.TAG, "set sos success");
                }
            }
        }, 0, 8, null);
    }

    @Override // com.xiaomi.fitness.devicesettings.export.emergency.EmergencyContactSyncHelper
    public void syncEmergencyContacts(@NotNull WearableDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        final boolean agreeSyncMIUISosContacts = DeviceSettingsPreference.INSTANCE.getAgreeSyncMIUISosContacts(deviceModel.getDid());
        Logger.i(TAG, "agreeSyncMIUISosContacts: " + agreeSyncMIUISosContacts);
        loadData(new Function1() { // from class: i88
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmergencyContactSyncHelperImpl.syncEmergencyContacts$lambda$1(agreeSyncMIUISosContacts, this, (fg4) obj);
            }
        });
    }
}
