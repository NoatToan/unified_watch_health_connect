package com.xiaomi.fitness.sport.view.justdance.control;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.sport_xms.data.SensorData;
import defpackage.cv9;
import defpackage.qs9;
import defpackage.s7r;
import defpackage.txo;
import defpackage.ur9;
import defpackage.vxo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tJ\u001a\u0010\f\u001a\u00020\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u000eJ\u001a\u0010\u0010\u001a\u00020\u00072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u000eJ\u001a\u0010\u0012\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u000eJ\b\u0010\u0014\u001a\u00020\u0007H\u0002J6\u0010\u0016\u001a\u00020\u00072\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u001e\u0010\u001a\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u001bJ\u0006\u0010\u001c\u001a\u00020\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/sport/view/justdance/control/JustDanceControlSender;", "", "<init>", "()V", "justDanceWearControlHandler", "Lcom/xiaomi/fitness/sport/view/justdance/control/JustDanceControlSender$JustDanceWearControlHandler;", "sendPhoneControl", "", "isMaster", "", "allowControl", "vibrate", "addWearControlListener", "control", "Lkotlin/Function1;", "", "checkSportDoing", "hasOngoingSport", "getDeviceWearMode", "block", "removeWearControlListener", "totalCount", "enqueueAccData", "list", "", "Lcom/xiaomi/fitness/sport_xms/data/SensorData;", "tempListener", "Lkotlin/Function2;", "destroy", "TAG", "", "JustDanceWearControlHandler", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nJustDanceControlSender.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JustDanceControlSender.kt\ncom/xiaomi/fitness/sport/view/justdance/control/JustDanceControlSender\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n1872#2,3:153\n*S KotlinDebug\n*F\n+ 1 JustDanceControlSender.kt\ncom/xiaomi/fitness/sport/view/justdance/control/JustDanceControlSender\n*L\n125#1:153,3\n*E\n"})
public final class JustDanceControlSender {

    @NotNull
    public static final JustDanceControlSender INSTANCE = new JustDanceControlSender();

    @NotNull
    private static final String TAG = "JustDanceControlSender";

    @Nullable
    private static JustDanceWearControlHandler justDanceWearControlHandler;
    private static int totalCount;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/sport/view/justdance/control/JustDanceControlSender$JustDanceWearControlHandler;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "", "did", "", "type", "Ls7r;", "packet", "", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "Lkotlin/Function1;", "", "control", "Lkotlin/jvm/functions/Function1;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class JustDanceWearControlHandler extends DataHandlerWrapper {

        @NotNull
        private final Function1<Integer, Unit> control;

        /* JADX WARN: Multi-variable type inference failed */
        public JustDanceWearControlHandler(@NotNull Function1<? super Integer, Unit> control) {
            Intrinsics.checkNotNullParameter(control, "control");
            this.control = control;
        }

        @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
        public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) {
            int i;
            Intrinsics.checkNotNullParameter(did, "did");
            if (packet == null || packet.e != 8 || packet.f != 84) {
                return false;
            }
            ur9 ur9VarU = packet.u();
            Logger.i(JustDanceControlSender.TAG, "handle fitness: " + ur9VarU);
            cv9 cv9VarZ = ur9VarU != null ? ur9VarU.Z() : null;
            if ((cv9VarZ != null ? Integer.valueOf(cv9VarZ.c) : null) == null || (i = cv9VarZ.c) == 0) {
                return true;
            }
            this.control.invoke2(Integer.valueOf(i));
            return true;
        }
    }

    private JustDanceControlSender() {
    }

    private final void removeWearControlListener() {
        JustDanceWearControlHandler justDanceWearControlHandler2 = justDanceWearControlHandler;
        if (justDanceWearControlHandler2 != null) {
            DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).removeDataHandler(8, justDanceWearControlHandler2);
            justDanceWearControlHandler = null;
        }
    }

    public static /* synthetic */ void sendPhoneControl$default(JustDanceControlSender justDanceControlSender, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 4) != 0) {
            z3 = false;
        }
        justDanceControlSender.sendPhoneControl(z, z2, z3);
    }

    public final void addWearControlListener(@NotNull Function1<? super Integer, Unit> control) {
        Intrinsics.checkNotNullParameter(control, "control");
        justDanceWearControlHandler = new JustDanceWearControlHandler(control);
        DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
        JustDanceWearControlHandler justDanceWearControlHandler2 = justDanceWearControlHandler;
        Intrinsics.checkNotNull(justDanceWearControlHandler2);
        deviceSyncExtKt.addDataHandler(8, justDanceWearControlHandler2);
    }

    public final void checkSportDoing(@NotNull final Function1<? super Boolean, Unit> hasOngoingSport) {
        Intrinsics.checkNotNullParameter(hasOngoingSport, "hasOngoingSport");
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 29;
        s7rVar.S(new ur9());
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.sport.view.justdance.control.JustDanceControlSender.checkSportDoing.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(JustDanceControlSender.TAG, "checkSportDoing onError , did:" + did + " , type : " + type + " , code : " + code);
                hasOngoingSport.invoke2(Boolean.FALSE);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                if ((result != null ? result.getPacket() : null) == null) {
                    hasOngoingSport.invoke2(Boolean.FALSE);
                    return;
                }
                s7r packet = result.getPacket();
                if (packet == null || packet.e != 8) {
                    hasOngoingSport.invoke2(Boolean.FALSE);
                    return;
                }
                s7r packet2 = result.getPacket();
                ur9 ur9VarU = packet2 != null ? packet2.u() : null;
                if (ur9VarU == null) {
                    Logger.w(JustDanceControlSender.TAG, "handleWearSportStatus -- no fitness proto");
                    hasOngoingSport.invoke2(Boolean.FALSE);
                    return;
                }
                int i = ur9VarU.V().c;
                Logger.w(JustDanceControlSender.TAG, "sportType: " + i);
                if (i != 0) {
                    hasOngoingSport.invoke2(Boolean.TRUE);
                } else {
                    hasOngoingSport.invoke2(Boolean.FALSE);
                }
            }
        }, 0, 8, null);
    }

    public final void destroy() {
        totalCount = 0;
        removeWearControlListener();
    }

    public final void enqueueAccData(@Nullable List<SensorData> list, @NotNull Function2<? super List<SensorData>, ? super Integer, Unit> tempListener) {
        Intrinsics.checkNotNullParameter(tempListener, "tempListener");
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            SensorData sensorData = (SensorData) obj;
            if (i % 2 == 0) {
                arrayList.add(sensorData);
            }
            i = i2;
        }
        int size = totalCount + arrayList.size();
        totalCount = size;
        tempListener.invoke(arrayList, Integer.valueOf(size));
    }

    public final void getDeviceWearMode(@NotNull final Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 14;
        txo txoVar = new txo();
        vxo.i iVar = new vxo.i();
        iVar.c = 4;
        txoVar.n0(iVar);
        s7rVar.c0(txoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.sport.view.justdance.control.JustDanceControlSender.getDeviceWearMode.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(JustDanceControlSender.TAG, "getDeviceWearMode fail: " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                txo txoVarE;
                vxo vxoVarI;
                vxo.j jVar;
                if (result == null || !result.isSuccess()) {
                    onError(did, type, 255);
                    return;
                }
                s7r packet = result.getPacket();
                Integer numValueOf = (packet == null || (txoVarE = packet.E()) == null || (vxoVarI = txoVarE.I()) == null || (jVar = vxoVarI.e) == null) ? null : Integer.valueOf(jVar.c);
                Logger.i(JustDanceControlSender.TAG, "loadWearMode success: " + numValueOf);
                block.invoke2(Integer.valueOf(numValueOf != null ? numValueOf.intValue() : -1));
            }
        }, 0, 8, null);
    }

    public final void sendPhoneControl(boolean isMaster, boolean allowControl, boolean vibrate) {
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 83;
        ur9 ur9Var = new ur9();
        qs9 qs9Var = new qs9();
        qs9Var.c = isMaster ? 1 : 2;
        qs9Var.d = allowControl ? 1 : 2;
        qs9Var.e = vibrate ? 3 : 0;
        ur9Var.v0(qs9Var);
        s7rVar.S(ur9Var);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 8, null);
    }
}
