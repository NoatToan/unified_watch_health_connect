package com.mi.fitness.checkupdate.util;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mi.fitness.checkupdate.ota.GeneralOtaExecutor;
import com.mi.fitness.checkupdate.ota.HyOtaExecutor;
import com.mi.fitness.checkupdate.ota.OtaExecutor;
import com.mi.fitness.checkupdate.util.DeviceSender;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import defpackage.ixo;
import defpackage.kxo;
import defpackage.qch;
import defpackage.s7r;
import defpackage.txo;
import defpackage.wwo;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b.\u0010\u001cJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J[\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00040\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R$\u0010#\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/mi/fitness/checkupdate/util/DeviceSender;", "", "", "version", "", "notifyForceUpgrade", "(Ljava/lang/String;)V", "", "force", "", "type", "firmwareVersion", "fileMd5", "Lkotlin/Function1;", "Lkxo;", "onResult", "onError", "prepareOta", "(ZILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "otaMode", "otaType", "path", "segmentLength", "Lqch;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "startOta", "(IILjava/lang/String;ILqch;)V", "pauseOta", "()V", "Landroid/os/Handler;", "mMainHandler", "Landroid/os/Handler;", "getMMainHandler", "()Landroid/os/Handler;", "Lcom/mi/fitness/checkupdate/ota/OtaExecutor;", "mOtaExecutor", "Lcom/mi/fitness/checkupdate/ota/OtaExecutor;", "getMOtaExecutor", "()Lcom/mi/fitness/checkupdate/ota/OtaExecutor;", "setMOtaExecutor", "(Lcom/mi/fitness/checkupdate/ota/OtaExecutor;)V", "OTA_TYPE_NORMAL", "I", "OTA_TYPE_SILENT", "TAG", "Ljava/lang/String;", "<init>", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceSender {
    public static final int OTA_TYPE_NORMAL = 0;
    public static final int OTA_TYPE_SILENT = 1;

    @NotNull
    private static final String TAG = "DeviceSender";

    @Nullable
    private static OtaExecutor mOtaExecutor;

    @NotNull
    public static final DeviceSender INSTANCE = new DeviceSender();

    @NotNull
    private static final Handler mMainHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.mi.fitness.checkupdate.util.DeviceSender$prepareOta$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\"\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"com/mi/fitness/checkupdate/util/DeviceSender$prepareOta$1", "Lcom/xiaomi/fitness/device/contact/export/OnSyncCallback;", "onSuccess", "", "did", "", "type", "", "result", "Lcom/xiaomi/fitness/device/contact/export/SyncResult;", "onError", "code", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 implements OnSyncCallback {
        final /* synthetic */ Function1<Integer, Unit> $onError;
        final /* synthetic */ Function1<kxo, Unit> $onResult;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super kxo, Unit> function1, Function1<? super Integer, Unit> function2) {
            this.$onResult = function1;
            this.$onError = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onError$lambda$1(Function1 onError, int i) {
            Intrinsics.checkNotNullParameter(onError, "$onError");
            onError.invoke(Integer.valueOf(i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$0(Function1 onResult, SyncResult syncResult) {
            s7r packet;
            txo txoVarE;
            Intrinsics.checkNotNullParameter(onResult, "$onResult");
            onResult.invoke((syncResult == null || (packet = syncResult.getPacket()) == null || (txoVarE = packet.E()) == null) ? null : txoVarE.A());
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onError(String did, int type, final int code) {
            Handler mMainHandler = DeviceSender.INSTANCE.getMMainHandler();
            final Function1<Integer, Unit> function1 = this.$onError;
            mMainHandler.post(new Runnable() { // from class: yb6
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceSender.AnonymousClass1.onError$lambda$1(function1, code);
                }
            });
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onSuccess(String did, int type, final SyncResult result) {
            Handler mMainHandler = DeviceSender.INSTANCE.getMMainHandler();
            final Function1<kxo, Unit> function1 = this.$onResult;
            mMainHandler.post(new Runnable() { // from class: xb6
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceSender.AnonymousClass1.onSuccess$lambda$0(function1, result);
                }
            });
        }
    }

    private DeviceSender() {
    }

    @NotNull
    public final Handler getMMainHandler() {
        return mMainHandler;
    }

    @Nullable
    public final OtaExecutor getMOtaExecutor() {
        return mOtaExecutor;
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
        Logger.i(TAG, "pauseOta() called");
        OtaExecutor otaExecutor = mOtaExecutor;
        if (otaExecutor != null) {
            otaExecutor.stop();
        }
        mOtaExecutor = null;
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
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new AnonymousClass1(onResult, onError), 0, 8, null);
    }

    public final void setMOtaExecutor(@Nullable OtaExecutor otaExecutor) {
        mOtaExecutor = otaExecutor;
    }

    public final void startOta(int otaMode, int otaType, @NotNull String path, int segmentLength, @NotNull qch listener) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Logger.i(TAG, "startOta() called with: otaMode = " + otaMode + ", otaType = " + otaType + ", path = " + path + ", segmentLength = " + segmentLength + ", listener = " + listener);
        DeviceSender$startOta$otaListener$1 deviceSender$startOta$otaListener$1 = new DeviceSender$startOta$otaListener$1(listener);
        File file = new File(path);
        OtaExecutor hyOtaExecutor = otaMode == 1 ? new HyOtaExecutor(otaType, file, deviceSender$startOta$otaListener$1) : new GeneralOtaExecutor(otaType, file, segmentLength, deviceSender$startOta$otaListener$1);
        mOtaExecutor = hyOtaExecutor;
        hyOtaExecutor.start();
    }
}
