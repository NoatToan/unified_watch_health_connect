package com.mi.fitness.checkupdate.eco.util;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mi.fitness.checkupdate.eco.ota.EcoGeneralOtaExecutor;
import com.mi.fitness.checkupdate.eco.util.EcoDeviceSender;
import com.mi.fitness.checkupdate.ota.HyOtaExecutor;
import com.mi.fitness.checkupdate.ota.OtaExecutor;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncExtKt;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import defpackage.ixo;
import defpackage.jxo;
import defpackage.kxo;
import defpackage.lxo;
import defpackage.qch;
import defpackage.s7r;
import defpackage.txo;
import defpackage.u7r;
import defpackage.uxo;
import defpackage.wwo;
import defpackage.xwo;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b3\u0010#J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJe\u0010\u0014\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00040\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0004\b\u0014\u0010\u0015J[\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00040\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0004\b\u0014\u0010\u0017J?\u0010 \u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010#R\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R$\u0010*\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u00101¨\u00064"}, d2 = {"Lcom/mi/fitness/checkupdate/eco/util/EcoDeviceSender;", "", "", "version", "", "notifyForceUpgrade", "(Ljava/lang/String;)V", "did", "notifyEcoForceUpgrade", "(Ljava/lang/String;Ljava/lang/String;)V", "", "force", "", "type", "firmwareVersion", "fileMd5", "Lkotlin/Function1;", "Llxo;", "onResult", "onError", "prepareOta", "(Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lkxo;", "(ZILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "otaMode", "otaType", "path", "segmentLength", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "deviceModel", "Lqch;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "startOta", "(IILjava/lang/String;ILcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;Lqch;)V", "pauseOta", "()V", "Landroid/os/Handler;", "mMainHandler", "Landroid/os/Handler;", "getMMainHandler", "()Landroid/os/Handler;", "Lcom/mi/fitness/checkupdate/ota/OtaExecutor;", "mOtaExecutor", "Lcom/mi/fitness/checkupdate/ota/OtaExecutor;", "getMOtaExecutor", "()Lcom/mi/fitness/checkupdate/ota/OtaExecutor;", "setMOtaExecutor", "(Lcom/mi/fitness/checkupdate/ota/OtaExecutor;)V", "OTA_TYPE_NORMAL", "I", "OTA_TYPE_SILENT", "<init>", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EcoDeviceSender {
    public static final int OTA_TYPE_NORMAL = 0;
    public static final int OTA_TYPE_SILENT = 1;

    @Nullable
    private static OtaExecutor mOtaExecutor;

    @NotNull
    public static final EcoDeviceSender INSTANCE = new EcoDeviceSender();

    @NotNull
    private static final Handler mMainHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.mi.fitness.checkupdate.eco.util.EcoDeviceSender$prepareOta$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\"\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"com/mi/fitness/checkupdate/eco/util/EcoDeviceSender$prepareOta$1", "Lcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;", "onSuccess", "", "did", "", "type", "", "result", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoSyncResult;", "onError", "code", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C13681 implements OnEcoSyncCallback {
        final /* synthetic */ Function1<Integer, Unit> $onError;
        final /* synthetic */ Function1<lxo, Unit> $onResult;

        /* JADX WARN: Multi-variable type inference failed */
        public C13681(Function1<? super lxo, Unit> function1, Function1<? super Integer, Unit> function2) {
            this.$onResult = function1;
            this.$onError = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onError$lambda$1(Function1 onError, int i) {
            Intrinsics.checkNotNullParameter(onError, "$onError");
            onError.invoke2(Integer.valueOf(i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$0(Function1 onResult, EcoSyncResult ecoSyncResult) {
            u7r packet;
            uxo uxoVarU;
            Intrinsics.checkNotNullParameter(onResult, "$onResult");
            onResult.invoke2((ecoSyncResult == null || (packet = ecoSyncResult.getPacket()) == null || (uxoVarU = packet.u()) == null) ? null : uxoVarU.p());
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
        public void onError(String did, int type, final int code) {
            Logger.e("EcoDeviceSender", "prepareOta error " + code);
            Handler mMainHandler = EcoDeviceSender.INSTANCE.getMMainHandler();
            final Function1<Integer, Unit> function1 = this.$onError;
            mMainHandler.post(new Runnable() { // from class: rs7
                @Override // java.lang.Runnable
                public final void run() {
                    EcoDeviceSender.C13681.onError$lambda$1(function1, code);
                }
            });
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
        public void onSuccess(String did, int type, final EcoSyncResult result) {
            Logger.d("EcoDeviceSender", "prepareOta success " + result);
            Handler mMainHandler = EcoDeviceSender.INSTANCE.getMMainHandler();
            final Function1<lxo, Unit> function1 = this.$onResult;
            mMainHandler.post(new Runnable() { // from class: ss7
                @Override // java.lang.Runnable
                public final void run() {
                    EcoDeviceSender.C13681.onSuccess$lambda$0(function1, result);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.mi.fitness.checkupdate.eco.util.EcoDeviceSender$prepareOta$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\"\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"com/mi/fitness/checkupdate/eco/util/EcoDeviceSender$prepareOta$2", "Lcom/xiaomi/fitness/device/contact/export/OnSyncCallback;", "onSuccess", "", "did", "", "type", "", "result", "Lcom/xiaomi/fitness/device/contact/export/SyncResult;", "onError", "code", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass2 implements OnSyncCallback {
        final /* synthetic */ Function1<Integer, Unit> $onError;
        final /* synthetic */ Function1<kxo, Unit> $onResult;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super kxo, Unit> function1, Function1<? super Integer, Unit> function2) {
            this.$onResult = function1;
            this.$onError = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onError$lambda$1(Function1 onError, int i) {
            Intrinsics.checkNotNullParameter(onError, "$onError");
            onError.invoke2(Integer.valueOf(i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$0(Function1 onResult, SyncResult syncResult) {
            s7r packet;
            txo txoVarE;
            Intrinsics.checkNotNullParameter(onResult, "$onResult");
            onResult.invoke2((syncResult == null || (packet = syncResult.getPacket()) == null || (txoVarE = packet.E()) == null) ? null : txoVarE.A());
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onError(String did, int type, final int code) {
            Handler mMainHandler = EcoDeviceSender.INSTANCE.getMMainHandler();
            final Function1<Integer, Unit> function1 = this.$onError;
            mMainHandler.post(new Runnable() { // from class: us7
                @Override // java.lang.Runnable
                public final void run() {
                    EcoDeviceSender.AnonymousClass2.onError$lambda$1(function1, code);
                }
            });
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onSuccess(String did, int type, final SyncResult result) {
            Handler mMainHandler = EcoDeviceSender.INSTANCE.getMMainHandler();
            final Function1<kxo, Unit> function1 = this.$onResult;
            mMainHandler.post(new Runnable() { // from class: ts7
                @Override // java.lang.Runnable
                public final void run() {
                    EcoDeviceSender.AnonymousClass2.onSuccess$lambda$0(function1, result);
                }
            });
        }
    }

    private EcoDeviceSender() {
    }

    @NotNull
    public final Handler getMMainHandler() {
        return mMainHandler;
    }

    @Nullable
    public final OtaExecutor getMOtaExecutor() {
        return mOtaExecutor;
    }

    public final void notifyEcoForceUpgrade(@Nullable String did, @NotNull String version) {
        Intrinsics.checkNotNullParameter(version, "version");
        u7r u7rVar = new u7r();
        u7rVar.e = 2;
        u7rVar.f = 4;
        xwo xwoVar = new xwo();
        xwoVar.c = true;
        xwoVar.d = version;
        uxo uxoVar = new uxo();
        uxoVar.r(xwoVar);
        u7rVar.E(uxoVar);
        EcoDeviceContact.DefaultImpls.call$default(EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE), did, u7rVar, true, new OnEcoSyncCallback() { // from class: com.mi.fitness.checkupdate.eco.util.EcoDeviceSender.notifyEcoForceUpgrade.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did2, int type, int code) {
                Logger.e("EcoDeviceSender", "notifyEcoForceUpgrade error " + code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did2, int type, EcoSyncResult result) {
                Logger.d("EcoDeviceSender", "notifyEcoForceUpgrade success");
            }
        }, 0, 16, null);
    }

    public final void notifyForceUpgrade(@NotNull String version) {
        Intrinsics.checkNotNullParameter(version, "version");
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 4;
        wwo wwoVar = new wwo();
        wwoVar.c = true;
        wwoVar.d = version;
        txo txoVar = new txo();
        txoVar.Y(wwoVar);
        s7rVar.c0(txoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 8, null);
    }

    public final void pauseOta() {
        OtaExecutor otaExecutor = mOtaExecutor;
        if (otaExecutor != null) {
            otaExecutor.stop();
        }
        mOtaExecutor = null;
    }

    public final void prepareOta(@Nullable String did, boolean force, int type, @Nullable String firmwareVersion, @Nullable String fileMd5, @NotNull Function1<? super lxo, Unit> onResult, @NotNull Function1<? super Integer, Unit> onError) {
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        Intrinsics.checkNotNullParameter(onError, "onError");
        u7r u7rVar = new u7r();
        u7rVar.e = 2;
        u7rVar.f = 5;
        jxo jxoVar = new jxo();
        jxoVar.c = force;
        jxoVar.d = type;
        jxoVar.e = firmwareVersion;
        jxoVar.f = fileMd5;
        uxo uxoVar = new uxo();
        uxoVar.s(jxoVar);
        u7rVar.E(uxoVar);
        Logger.i("EcoDeviceSender", "prepareOta packet " + u7rVar);
        EcoDeviceContact.DefaultImpls.call$default(EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE), did, u7rVar, true, new C13681(onResult, onError), 0, 16, null);
    }

    public final void setMOtaExecutor(@Nullable OtaExecutor otaExecutor) {
        mOtaExecutor = otaExecutor;
    }

    public final void startOta(int otaMode, int otaType, @NotNull String path, int segmentLength, @Nullable EcoDeviceModel deviceModel, @NotNull qch listener) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(listener, "listener");
        EcoDeviceSender$startOta$otaListener$1 ecoDeviceSender$startOta$otaListener$1 = new EcoDeviceSender$startOta$otaListener$1(listener);
        File file = new File(path);
        OtaExecutor hyOtaExecutor = otaMode == 1 ? new HyOtaExecutor(otaType, file, ecoDeviceSender$startOta$otaListener$1) : new EcoGeneralOtaExecutor(otaType, file, segmentLength, deviceModel, ecoDeviceSender$startOta$otaListener$1);
        mOtaExecutor = hyOtaExecutor;
        hyOtaExecutor.start();
    }

    public final void prepareOta(boolean force, int type, @Nullable String firmwareVersion, @Nullable String fileMd5, @NotNull Function1<? super kxo, Unit> onResult, @NotNull Function1<? super Integer, Unit> onError) {
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        Intrinsics.checkNotNullParameter(onError, "onError");
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 5;
        ixo ixoVar = new ixo();
        ixoVar.c = force;
        ixoVar.d = type;
        ixoVar.e = firmwareVersion;
        ixoVar.f = fileMd5;
        txo txoVar = new txo();
        txoVar.h0(ixoVar);
        s7rVar.c0(txoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new AnonymousClass2(onResult, onError), 0, 8, null);
    }
}
