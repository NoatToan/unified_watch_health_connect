package com.xiaomi.wearable.transport.queue;

import android.text.TextUtils;
import com.autonavi.base.amap.mapcore.NativeFunctionRunnable;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.wearable.ChannelInfo;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.core.DeviceInfo;
import com.xiaomi.wearable.core.WearApiTask;
import com.xiaomi.wearable.transport.queue.BleTaskQueueV1;
import com.xiaomi.wearable.utils.ByteUtil;
import defpackage.aqc;
import defpackage.e7r;
import defpackage.ekb;
import defpackage.ft3;
import defpackage.ht2;
import defpackage.it3;
import defpackage.jpc;
import defpackage.lq2;
import defpackage.pm5;
import defpackage.qf4;
import defpackage.t7r;
import defpackage.tta;
import defpackage.zpc;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0001LB\u000f\u0012\u0006\u00105\u001a\u000204¢\u0006\u0004\bJ\u0010KJ\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J)\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u0012J\u000f\u0010\u001c\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u0012J\u000f\u0010\u001d\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u0012J\u0017\u0010\u001f\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010\"J\u0019\u0010$\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0004\u001a\u00020\u0003H\u0004¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0010H\u0016¢\u0006\u0004\b&\u0010\u0012J!\u0010)\u001a\u00020\u00102\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010.\u001a\u00020\u00102\u000e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0+H\u0016¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0010¢\u0006\u0004\b0\u0010\u0012J\u0017\u00102\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0014H\u0016¢\u0006\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010<R\u0018\u0010?\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00109R\u0018\u0010@\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010<R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020F8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006M"}, d2 = {"Lcom/xiaomi/wearable/transport/queue/BleTaskQueueV1;", "Lcom/xiaomi/wearable/transport/queue/TaskQueueV1;", "Lcom/xiaomi/wearable/transport/queue/IBleOperation;", "Lcom/xiaomi/wearable/core/WearApiTask;", "apiTask", "Laqc;", "getChannelSend", "(Lcom/xiaomi/wearable/core/WearApiTask;)Laqc;", "", "getDataType", "(Lcom/xiaomi/wearable/core/WearApiTask;)B", "Ljava/util/UUID;", "uuid", "Lft3;", "getRXChannel", "(Ljava/util/UUID;)Lft3;", "", "initChannels", "()V", NativeFunctionRunnable.UPDATE_OPTIONS_FUNC, "", "type", "dataType", "", "data", "dispatchMessage", "(II[B)V", "registerNotificationResponses", "unregisterNotificationResponses", "resetChannels", "Lcom/xiaomi/wearable/core/DeviceInfo$PrivateUUID;", "setPrivateUUID", "(Lcom/xiaomi/wearable/core/DeviceInfo$PrivateUUID;)V", "enqueue", "(Lcom/xiaomi/wearable/core/WearApiTask;)V", "run", "getData", "(Lcom/xiaomi/wearable/core/WearApiTask;)[B", "open", "Lcom/xiaomi/wearable/ChannelInfo;", "channelInfo", "writeToChannel", "(Lcom/xiaomi/wearable/ChannelInfo;[B)V", "Lht2;", "Ljava/lang/Void;", b.I, "enableNotifications", "(Lht2;)V", "disableNotifications", "reason", Constants.EXTRA_CLOSE_TAI, "(I)V", "Llq2;", "bleApiCall", "Llq2;", "Ltta;", "mProtoChannel", "Ltta;", "Lekb;", "mFitnessChannel", "Lekb;", "mVoiceChannel", "mMassDataChannel", "mOtaChannel", "mSensorCaptureChannel", "", "mNotificationsEnabled", "Z", "mPrivateUUID", "Lcom/xiaomi/wearable/core/DeviceInfo$PrivateUUID;", "Ljpc;", "getBleManager", "()Ljpc;", "bleManager", "<init>", "(Llq2;)V", "Companion", "miwear-core_release"}, k = 1, mv = {2, 0, 0})
public final class BleTaskQueueV1 extends TaskQueueV1 implements IBleOperation {

    @NotNull
    private static final String TAG = "BleTaskQueue";

    @NotNull
    private final lq2 bleApiCall;

    @Nullable
    private ekb mFitnessChannel;

    @Nullable
    private ekb mMassDataChannel;
    private boolean mNotificationsEnabled;

    @Nullable
    private tta mOtaChannel;

    @Nullable
    private DeviceInfo.PrivateUUID mPrivateUUID;

    @Nullable
    private tta mProtoChannel;

    @Nullable
    private ekb mSensorCaptureChannel;

    @Nullable
    private ekb mVoiceChannel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleTaskQueueV1(@NotNull lq2 bleApiCall) {
        super(bleApiCall);
        Intrinsics.checkNotNullParameter(bleApiCall, "bleApiCall");
        this.bleApiCall = bleApiCall;
    }

    private final void dispatchMessage(int type, int dataType, byte[] data) {
        byte[] bArrDecryptData = (data == null || dataType != 1) ? data : this.bleApiCall.decryptData(type, data);
        CoreExtKt.getLogger().i(TAG, "dispatchMessage: data = " + data + ", type = " + type + ", dataType = " + dataType + ", rawData = " + (bArrDecryptData != null ? Integer.valueOf(bArrDecryptData.length) : null));
        if (this.bleApiCall.getVersion() == 0) {
            lq2 lq2Var = this.bleApiCall;
            if (!lq2Var.d) {
                if (type != 101) {
                    if (bArrDecryptData != null) {
                        lq2Var.handleData(type, bArrDecryptData);
                        return;
                    }
                    return;
                }
                t7r t7rVarA = pm5.a(data);
                if (t7rVarA == null) {
                    return;
                }
                CoreExtKt.getLogger().i(TAG, "dispatchMessage() called with: type = " + type + ", response = " + t7rVarA.e);
                if (t7rVarA.e == 1) {
                    dispatchMessage(type, data);
                    return;
                } else {
                    if (bArrDecryptData != null) {
                        this.bleApiCall.handleData(type, bArrDecryptData);
                        return;
                    }
                    return;
                }
            }
        }
        if (type == 100) {
            dispatchMessage(type, data);
        } else if (bArrDecryptData != null) {
            this.bleApiCall.handleData(type, bArrDecryptData);
        }
    }

    private final jpc getBleManager() {
        jpc jpcVarH = this.bleApiCall.h();
        Intrinsics.checkNotNullExpressionValue(jpcVarH, "getBleManager(...)");
        return jpcVarH;
    }

    private final aqc getChannelSend(WearApiTask apiTask) {
        int type = apiTask.getType();
        if (type == 100 || type == 101) {
            return this.mProtoChannel;
        }
        if (type == 104) {
            return this.mMassDataChannel;
        }
        if (type != 105) {
            return null;
        }
        return this.mOtaChannel;
    }

    private final byte getDataType(WearApiTask apiTask) {
        int type = apiTask.getType();
        if (type != 100) {
            return ((type == 101 || type == 104 || type == 105) && this.bleApiCall.getVersion() != 0) ? (byte) 1 : (byte) 0;
        }
        return (byte) 2;
    }

    private final ft3 getRXChannel(UUID uuid) {
        tta ttaVar = this.mProtoChannel;
        if (ttaVar != null && ttaVar.e().j0().equals(uuid)) {
            return ttaVar.e();
        }
        ekb ekbVar = this.mFitnessChannel;
        if (ekbVar != null && ekbVar.j0().equals(uuid)) {
            return ekbVar;
        }
        ekb ekbVar2 = this.mVoiceChannel;
        if (ekbVar2 == null || !Intrinsics.areEqual(ekbVar2.j0(), uuid)) {
            return null;
        }
        return ekbVar2;
    }

    private final void initChannels() {
        UUID uuid;
        UUID uuid2;
        UUID uuid3;
        UUID uuid4;
        UUID uuid5;
        UUID uuid6;
        UUID uuid7;
        UUID uuid8;
        UUID uuidFromString;
        if (this.bleApiCall.getVersion() == 0) {
            DeviceInfo.PrivateUUID privateUUID = this.mPrivateUUID;
            uuid = null;
            if (privateUUID != null) {
                UUID uuidFromString2 = UUID.fromString(privateUUID.getService());
                UUID uuidFromString3 = !TextUtils.isEmpty(privateUUID.getProtoTX()) ? UUID.fromString(privateUUID.getProtoTX()) : null;
                UUID uuidFromString4 = !TextUtils.isEmpty(privateUUID.getProtoRX()) ? UUID.fromString(privateUUID.getProtoRX()) : null;
                UUID uuidFromString5 = !TextUtils.isEmpty(privateUUID.getFitness()) ? UUID.fromString(privateUUID.getFitness()) : null;
                UUID uuidFromString6 = !TextUtils.isEmpty(privateUUID.getVoice()) ? UUID.fromString(privateUUID.getVoice()) : null;
                UUID uuidFromString7 = !TextUtils.isEmpty(privateUUID.getMass()) ? UUID.fromString(privateUUID.getMass()) : null;
                UUID uuidFromString8 = !TextUtils.isEmpty(privateUUID.getOtaTX()) ? UUID.fromString(privateUUID.getOtaTX()) : null;
                uuidFromString = !TextUtils.isEmpty(privateUUID.getOtaRX()) ? UUID.fromString(privateUUID.getOtaRX()) : null;
                uuid7 = uuidFromString3;
                uuid8 = uuidFromString4;
                uuid2 = uuidFromString5;
                uuid3 = uuidFromString6;
                uuid4 = uuidFromString7;
                uuid5 = uuidFromString8;
                uuid6 = null;
                uuid = uuidFromString2;
            } else {
                uuidFromString = null;
                uuid2 = null;
                uuid3 = null;
                uuid4 = null;
                uuid5 = null;
                uuid6 = null;
                uuid7 = null;
                uuid8 = null;
            }
        } else {
            uuid = qf4.f31472a;
            UUID uuid9 = qf4.d;
            UUID uuid10 = qf4.c;
            uuid2 = qf4.e;
            uuid3 = qf4.f;
            uuid4 = qf4.g;
            uuid5 = qf4.i;
            UUID uuid11 = qf4.h;
            uuid6 = qf4.l;
            enableParallel();
            uuid7 = uuid9;
            uuid8 = uuid10;
            uuidFromString = uuid11;
        }
        if (uuid != null) {
            if (uuid7 != null && uuid8 != null && getBleManager().a(uuid, uuid7) && getBleManager().a(uuid, uuid8)) {
                this.mProtoChannel = new tta(getBleManager(), false, uuid, uuid7, uuid8, new zpc() { // from class: hv2
                    @Override // defpackage.zpc
                    public final void c(byte b2, byte[] bArr) {
                        BleTaskQueueV1.initChannels$lambda$5(this.f20501a, b2, bArr);
                    }
                });
            }
            if (uuid2 != null && getBleManager().a(uuid, uuid2)) {
                this.mFitnessChannel = new ekb(getBleManager(), false, uuid, uuid2, new zpc() { // from class: iv2
                    @Override // defpackage.zpc
                    public final void c(byte b2, byte[] bArr) {
                        BleTaskQueueV1.initChannels$lambda$6(this.f22119a, b2, bArr);
                    }
                });
            }
            if (uuid3 != null && getBleManager().a(uuid, uuid3)) {
                this.mVoiceChannel = new ekb(getBleManager(), false, uuid, uuid3, new zpc() { // from class: jv2
                    @Override // defpackage.zpc
                    public final void c(byte b2, byte[] bArr) {
                        BleTaskQueueV1.initChannels$lambda$7(this.f23166a, b2, bArr);
                    }
                });
            }
            if (uuid4 != null && getBleManager().a(uuid, uuid4)) {
                this.mMassDataChannel = new ekb(getBleManager(), false, uuid, uuid4, null);
            }
            if (uuid5 != null && uuidFromString != null && getBleManager().a(uuid, uuid5) && getBleManager().a(uuid, uuidFromString)) {
                this.mOtaChannel = new tta(getBleManager(), false, uuid, uuid5, uuidFromString, new zpc() { // from class: kv2
                    @Override // defpackage.zpc
                    public final void c(byte b2, byte[] bArr) {
                        BleTaskQueueV1.initChannels$lambda$8(this.f24321a, b2, bArr);
                    }
                });
            }
            if (uuid6 != null && getBleManager().a(uuid, uuid6)) {
                this.mSensorCaptureChannel = new ekb(getBleManager(), false, uuid, uuid6, new zpc() { // from class: lv2
                    @Override // defpackage.zpc
                    public final void c(byte b2, byte[] bArr) {
                        BleTaskQueueV1.initChannels$lambda$9(this.f25456a, b2, bArr);
                    }
                });
            }
            updateOptions();
            if (getBleManager() instanceof e7r) {
                this.bleApiCall.getCryptoCounter().e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initChannels$lambda$5(BleTaskQueueV1 this$0, byte b2, byte[] bArr) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (b2 == 2) {
            this$0.dispatchMessage(100, b2, bArr);
        } else {
            this$0.dispatchMessage(101, b2, bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initChannels$lambda$6(BleTaskQueueV1 this$0, byte b2, byte[] bArr) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dispatchMessage(102, b2, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initChannels$lambda$7(BleTaskQueueV1 this$0, byte b2, byte[] bArr) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dispatchMessage(103, b2, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initChannels$lambda$8(BleTaskQueueV1 this$0, byte b2, byte[] bArr) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dispatchMessage(105, b2, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initChannels$lambda$9(BleTaskQueueV1 this$0, byte b2, byte[] bArr) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dispatchMessage(107, b2, bArr);
    }

    private final void registerNotificationResponses() {
        tta ttaVar = this.mProtoChannel;
        if (ttaVar != null && ttaVar.f()) {
            ttaVar.g();
        }
        ekb ekbVar = this.mFitnessChannel;
        if (ekbVar != null && ekbVar.k0()) {
            ekbVar.l0();
        }
        ekb ekbVar2 = this.mVoiceChannel;
        if (ekbVar2 != null && ekbVar2.k0()) {
            ekbVar2.l0();
        }
        ekb ekbVar3 = this.mMassDataChannel;
        if (ekbVar3 != null && ekbVar3.k0()) {
            ekbVar3.l0();
        }
        tta ttaVar2 = this.mOtaChannel;
        if (ttaVar2 != null && ttaVar2.f()) {
            ttaVar2.g();
        }
        ekb ekbVar4 = this.mSensorCaptureChannel;
        if (ekbVar4 == null || !ekbVar4.k0()) {
            return;
        }
        ekbVar4.l0();
    }

    private final void resetChannels() {
        tta ttaVar = this.mProtoChannel;
        if (ttaVar != null) {
            ttaVar.h();
        }
        this.mProtoChannel = null;
        ekb ekbVar = this.mFitnessChannel;
        if (ekbVar != null) {
            ekbVar.T();
        }
        this.mFitnessChannel = null;
        ekb ekbVar2 = this.mVoiceChannel;
        if (ekbVar2 != null) {
            ekbVar2.T();
        }
        this.mVoiceChannel = null;
        ekb ekbVar3 = this.mMassDataChannel;
        if (ekbVar3 != null) {
            ekbVar3.T();
        }
        this.mMassDataChannel = null;
        tta ttaVar2 = this.mOtaChannel;
        if (ttaVar2 != null) {
            ttaVar2.h();
        }
        this.mOtaChannel = null;
        ekb ekbVar4 = this.mSensorCaptureChannel;
        if (ekbVar4 != null) {
            ekbVar4.T();
        }
        this.mSensorCaptureChannel = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void run$lambda$0(WearApiTask apiTask, int i) {
        Intrinsics.checkNotNullParameter(apiTask, "$apiTask");
        if (apiTask.isCanceled()) {
            return;
        }
        if (i == -7) {
            apiTask.onSendResult(-11);
            return;
        }
        if (i == -6) {
            apiTask.onSendResult(-10);
            return;
        }
        if (i == -5) {
            apiTask.onSendResult(-9);
            return;
        }
        if (i == -3) {
            apiTask.onSendResult(-4);
            return;
        }
        if (i == -2) {
            apiTask.onSendResult(-1);
        } else if (i != 0) {
            apiTask.onSendResult(i);
        } else {
            apiTask.onSendResult(0);
        }
    }

    private final void unregisterNotificationResponses() {
        tta ttaVar = this.mProtoChannel;
        if (ttaVar != null) {
            ttaVar.j();
        }
        ekb ekbVar = this.mFitnessChannel;
        if (ekbVar != null) {
            ekbVar.m0();
        }
        ekb ekbVar2 = this.mVoiceChannel;
        if (ekbVar2 != null) {
            ekbVar2.m0();
        }
        ekb ekbVar3 = this.mMassDataChannel;
        if (ekbVar3 != null) {
            ekbVar3.m0();
        }
        tta ttaVar2 = this.mOtaChannel;
        if (ttaVar2 != null) {
            ttaVar2.j();
        }
        ekb ekbVar4 = this.mSensorCaptureChannel;
        if (ekbVar4 != null) {
            ekbVar4.m0();
        }
    }

    private final void updateOptions() {
        int iO = getBleManager().o();
        int version = this.bleApiCall.getVersion();
        boolean z = version > 1;
        boolean z2 = version > 1;
        tta ttaVar = this.mProtoChannel;
        if (ttaVar != null) {
            Intrinsics.checkNotNull(ttaVar);
            ttaVar.i(iO, z, z2);
        }
        ekb ekbVar = this.mFitnessChannel;
        if (ekbVar != null) {
            Intrinsics.checkNotNull(ekbVar);
            ekbVar.Z(iO, z, z2);
        }
        ekb ekbVar2 = this.mVoiceChannel;
        if (ekbVar2 != null) {
            Intrinsics.checkNotNull(ekbVar2);
            ekbVar2.Z(iO, z, z2);
        }
        ekb ekbVar3 = this.mMassDataChannel;
        if (ekbVar3 != null) {
            Intrinsics.checkNotNull(ekbVar3);
            ekbVar3.Z(iO, z, z2);
        }
        tta ttaVar2 = this.mOtaChannel;
        if (ttaVar2 != null) {
            Intrinsics.checkNotNull(ttaVar2);
            ttaVar2.i(iO, z, z2);
        }
        ekb ekbVar4 = this.mSensorCaptureChannel;
        if (ekbVar4 != null) {
            Intrinsics.checkNotNull(ekbVar4);
            ekbVar4.Z(iO, z, z2);
        }
    }

    @Override // com.xiaomi.wearable.transport.queue.TaskQueueV1, com.xiaomi.wearable.transport.queue.ITaskQueue
    public void close(int reason) {
        super.close(reason);
        this.mNotificationsEnabled = false;
        unregisterNotificationResponses();
        resetChannels();
    }

    public final void disableNotifications() {
        if (this.mNotificationsEnabled) {
            this.mNotificationsEnabled = false;
            tta ttaVar = this.mProtoChannel;
            if (ttaVar != null) {
                ttaVar.c();
            }
            ekb ekbVar = this.mFitnessChannel;
            if (ekbVar != null) {
                ekbVar.h0();
            }
            ekb ekbVar2 = this.mVoiceChannel;
            if (ekbVar2 != null) {
                ekbVar2.h0();
            }
            ekb ekbVar3 = this.mMassDataChannel;
            if (ekbVar3 != null) {
                ekbVar3.h0();
            }
            tta ttaVar2 = this.mOtaChannel;
            if (ttaVar2 != null) {
                ttaVar2.c();
            }
            ekb ekbVar4 = this.mSensorCaptureChannel;
            if (ekbVar4 != null) {
                ekbVar4.h0();
            }
        }
    }

    @Override // com.xiaomi.wearable.transport.queue.IBleOperation
    public void enableNotifications(@NotNull ht2<Void> response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (this.mNotificationsEnabled) {
            response.onResponse(null);
            return;
        }
        this.mNotificationsEnabled = true;
        tta ttaVar = this.mProtoChannel;
        if (ttaVar != null) {
            ttaVar.d(new tta.a(response));
        }
        ekb ekbVar = this.mFitnessChannel;
        if (ekbVar != null) {
            ekbVar.i0(null);
        }
        ekb ekbVar2 = this.mVoiceChannel;
        if (ekbVar2 != null) {
            ekbVar2.i0(null);
        }
        ekb ekbVar3 = this.mMassDataChannel;
        if (ekbVar3 != null) {
            ekbVar3.i0(null);
        }
        tta ttaVar2 = this.mOtaChannel;
        if (ttaVar2 != null) {
            ttaVar2.d(null);
        }
        ekb ekbVar4 = this.mSensorCaptureChannel;
        if (ekbVar4 != null) {
            ekbVar4.i0(null);
        }
    }

    @Override // com.xiaomi.wearable.transport.queue.TaskQueueV1, com.xiaomi.wearable.transport.queue.ITaskQueue
    public void enqueue(@NotNull WearApiTask apiTask) {
        Intrinsics.checkNotNullParameter(apiTask, "apiTask");
        super.enqueue(apiTask);
    }

    @Nullable
    public final byte[] getData(@NotNull WearApiTask apiTask) {
        Intrinsics.checkNotNullParameter(apiTask, "apiTask");
        return apiTask.getData();
    }

    @Override // com.xiaomi.wearable.transport.queue.TaskQueueV1, com.xiaomi.wearable.transport.queue.ITaskQueue
    public void open() {
        initChannels();
        registerNotificationResponses();
    }

    @Override // com.xiaomi.wearable.transport.queue.TaskQueueV1, com.xiaomi.wearable.transport.queue.TaskRunnable
    public void run(@NotNull final WearApiTask apiTask) {
        Intrinsics.checkNotNullParameter(apiTask, "apiTask");
        super.run(apiTask);
        CoreExtKt.getLogger().i(TAG, "run() called with: apiTask = [" + apiTask + "]");
        setMRunningApiTask(apiTask);
        aqc channelSend = getChannelSend(apiTask);
        if (channelSend == null) {
            apiTask.onSendResult(-7);
            return;
        }
        byte dataType = getDataType(apiTask);
        byte[] data = getData(apiTask);
        if (data != null && dataType == 1) {
            data = this.bleApiCall.encryptData(apiTask.getType(), data);
        }
        if (data == null) {
            apiTask.onSendResult(-8);
        } else {
            channelSend.b(dataType, data, new it3() { // from class: mv2
                @Override // defpackage.it3
                public final void onCallback(int i) {
                    BleTaskQueueV1.run$lambda$0(apiTask, i);
                }
            });
        }
    }

    public final void setPrivateUUID(@Nullable DeviceInfo.PrivateUUID uuid) {
        this.mPrivateUUID = uuid;
    }

    @Override // com.xiaomi.wearable.transport.queue.TaskQueueV1, com.xiaomi.wearable.ChannelWriter
    public void writeToChannel(@Nullable ChannelInfo channelInfo, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (channelInfo == null) {
            return;
        }
        ft3 rXChannel = getRXChannel(channelInfo.getUuid());
        if (rXChannel == null) {
            CoreExtKt.getLogger().i(TAG, "writeToChannel() called with: " + channelInfo + ", data = " + data);
            return;
        }
        CoreExtKt.getLogger().i(TAG, "onAuthConnectSuccess: " + ByteUtil.byteToString(data));
        rXChannel.N(data);
    }
}
