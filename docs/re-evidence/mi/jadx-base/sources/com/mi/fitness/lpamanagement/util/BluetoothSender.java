package com.mi.fitness.lpamanagement.util;

import com.google.android.gms.common.Scopes;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import defpackage.fve;
import defpackage.hve;
import defpackage.ive;
import defpackage.kve;
import defpackage.lve;
import defpackage.mve;
import defpackage.nve;
import defpackage.s7r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010(J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006JH\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017JS\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022<\u0010\u000e\u001a8\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00040\u0018¢\u0006\u0004\b\u001c\u0010\u001dJO\u0010 \u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u000228\u0010\u000e\u001a4\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u001e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00040\u0018¢\u0006\u0004\b \u0010\u001dJ%\u0010#\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u0013¢\u0006\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/mi/fitness/lpamanagement/util/BluetoothSender;", "", "", "did", "", "prepareDownloadProfile", "(Ljava/lang/String;)V", "activationCode", "confirmationCode", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "result", "callBack", "downloadProfile", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "", "xid", "", Constants.PARAM_STATUS_CODE, "resContent", "responseHttp", "(Ljava/lang/String;JILjava/lang/String;)V", "Lkotlin/Function2;", "", "Lkve;", "profiles", "loadProfiles", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Lfve;", "euiccInfo", "getEuiccInfo", Scopes.PROFILE, "cmd", "operateProfile", "(Ljava/lang/String;Lkve;I)V", "TAG", "Ljava/lang/String;", "<init>", "()V", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BluetoothSender {

    @NotNull
    public static final BluetoothSender INSTANCE = new BluetoothSender();

    @NotNull
    public static final String TAG = "LpaManagementSender";

    private BluetoothSender() {
    }

    public final void downloadProfile(@NotNull String did, @NotNull String activationCode, @NotNull String confirmationCode, @NotNull final Function1<? super Boolean, Unit> callBack) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(activationCode, "activationCode");
        Intrinsics.checkNotNullParameter(confirmationCode, "confirmationCode");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        s7r s7rVar = new s7r();
        s7rVar.e = 9;
        s7rVar.f = 6;
        s7rVar.V(new ive());
        lve lveVar = new lve();
        lveVar.c = activationCode;
        lveVar.d = confirmationCode;
        s7rVar.x().v(lveVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), did, s7rVar, false, new OnSyncCallback() { // from class: com.mi.fitness.lpamanagement.util.BluetoothSender.downloadProfile.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) {
                Logger.i(BluetoothSender.TAG, "DOWNLOAD_PROFILE onError code:" + code);
                callBack.invoke2(Boolean.FALSE);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) {
                Logger.i(BluetoothSender.TAG, "DOWNLOAD_PROFILE onSuccess result:" + (result != null ? Boolean.valueOf(result.isSuccess()) : null));
                callBack.invoke2(Boolean.valueOf(result != null ? result.isSuccess() : false));
            }
        }, 0, 16, (Object) null);
    }

    public final void getEuiccInfo(@NotNull String did, @NotNull final Function2<? super Boolean, ? super fve, Unit> callBack) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        s7r s7rVar = new s7r();
        s7rVar.e = 9;
        s7rVar.f = 1;
        s7rVar.V(new ive());
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), did, s7rVar, true, new OnSyncCallback() { // from class: com.mi.fitness.lpamanagement.util.BluetoothSender.getEuiccInfo.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) {
                Logger.i(BluetoothSender.TAG, "getEuiccInfo onError code:" + code);
                callBack.invoke(Boolean.FALSE, null);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) {
                ive iveVarX;
                Logger.i(BluetoothSender.TAG, "getEuiccInfo onSuccess result:" + (result != null ? Boolean.valueOf(result.isSuccess()) : null));
                if (result == null || !result.isSuccess()) {
                    callBack.invoke(Boolean.FALSE, null);
                    return;
                }
                s7r packet = result.getPacket();
                fve fveVarP = (packet == null || (iveVarX = packet.x()) == null) ? null : iveVarX.p();
                Logger.i(BluetoothSender.TAG, "getEuiccInfo eid:" + ByteUtil.byteToString(fveVarP != null ? fveVarP.c : null) + " imei:" + (fveVarP != null ? fveVarP.d : null));
                callBack.invoke(Boolean.TRUE, fveVarP);
            }
        }, 0, 16, (Object) null);
    }

    public final void loadProfiles(@NotNull String did, @NotNull final Function2<? super Boolean, ? super List<kve>, Unit> callBack) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        s7r s7rVar = new s7r();
        s7rVar.e = 9;
        s7rVar.f = 2;
        s7rVar.V(new ive());
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).call(did, s7rVar, true, new OnSyncCallback() { // from class: com.mi.fitness.lpamanagement.util.BluetoothSender.loadProfiles.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) {
                Logger.i(BluetoothSender.TAG, "GET_PROFILE_LIST onError code:" + code);
                callBack.invoke(Boolean.FALSE, new ArrayList());
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) {
                List listAsList;
                ive iveVarX;
                kve.a aVarS;
                kve[] kveVarArr = null;
                Logger.i(BluetoothSender.TAG, "GET_PROFILE_LIST onSuccess result:" + (result != null ? Boolean.valueOf(result.isSuccess()) : null));
                ArrayList arrayList = new ArrayList();
                if (result == null || !result.isSuccess()) {
                    callBack.invoke(Boolean.FALSE, arrayList);
                    return;
                }
                s7r packet = result.getPacket();
                if (packet != null && (iveVarX = packet.x()) != null && (aVarS = iveVarX.s()) != null) {
                    kveVarArr = aVarS.c;
                }
                if (kveVarArr != null && (listAsList = ArraysKt___ArraysJvmKt.asList(kveVarArr)) != null) {
                    List list = listAsList;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Boolean.valueOf(arrayList.add((kve) it.next())));
                    }
                }
                callBack.invoke(Boolean.TRUE, arrayList);
            }
        }, 60000);
    }

    public final void operateProfile(@NotNull String did, @NotNull kve profile, int cmd) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(profile, "profile");
        s7r s7rVar = new s7r();
        s7rVar.e = 9;
        s7rVar.f = 3;
        s7rVar.V(new ive());
        mve mveVar = new mve();
        mveVar.c = cmd;
        mveVar.d = profile.c;
        s7rVar.x().w(mveVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), did, s7rVar, false, new OnSyncCallback() { // from class: com.mi.fitness.lpamanagement.util.BluetoothSender.operateProfile.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) {
                Logger.i(BluetoothSender.TAG, "operateProfile onError code:" + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) {
                Logger.i(BluetoothSender.TAG, "operateProfile onSuccess result:" + (result != null ? Boolean.valueOf(result.isSuccess()) : null));
            }
        }, 0, 16, (Object) null);
    }

    public final void prepareDownloadProfile(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        s7r s7rVar = new s7r();
        s7rVar.e = 9;
        s7rVar.f = 5;
        s7rVar.V(new ive());
        nve nveVar = new nve();
        nveVar.c = 2;
        s7rVar.x().x(nveVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), did, s7rVar, false, new OnSyncCallback() { // from class: com.mi.fitness.lpamanagement.util.BluetoothSender.prepareDownloadProfile.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) {
                Logger.i(BluetoothSender.TAG, "PREPARE_DOWNLOAD_PROFILE onError code:" + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) {
                Logger.i(BluetoothSender.TAG, "PREPARE_DOWNLOAD_PROFILE onSuccess result:" + (result != null ? Boolean.valueOf(result.isSuccess()) : null));
            }
        }, 0, 16, (Object) null);
    }

    public final void responseHttp(@NotNull String did, long xid, int statusCode, @NotNull String resContent) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(resContent, "resContent");
        s7r s7rVar = new s7r();
        s7rVar.e = 9;
        s7rVar.f = 9;
        s7rVar.V(new ive());
        hve hveVar = new hve();
        hveVar.e = resContent;
        hveVar.d = statusCode;
        hveVar.c = xid;
        s7rVar.x().u(hveVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), did, s7rVar, false, new OnSyncCallback() { // from class: com.mi.fitness.lpamanagement.util.BluetoothSender.responseHttp.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) {
                Logger.i(BluetoothSender.TAG, "responseHttp onError code:" + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) {
                Logger.i(BluetoothSender.TAG, "responseHttp onSuccess result:" + (result != null ? Boolean.valueOf(result.isSuccess()) : null));
            }
        }, 0, 16, (Object) null);
    }
}
