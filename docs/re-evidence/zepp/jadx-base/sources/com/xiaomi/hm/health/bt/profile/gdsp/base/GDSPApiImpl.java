package com.xiaomi.hm.health.bt.profile.gdsp.base;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.google.android.gms.common.Scopes;
import com.huami.bluetooth.profile.channel.module.auth.AuthModuleKt;
import com.twitter.sdk.android.tweetcomposer.g;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPApiImpl;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.io.ByteArrayOutputStream;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.CRC32;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b$\u0010%J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J&\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\bH\u0016J\b\u0010\u001b\u001a\u00020\u0006H\u0016R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPApiImpl;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GeneralDataSensingProcedureApi;", "Lcom/xiaomi/hm/health/bt/profile/base/HMNotifyResponse;", AbstractJSONTokenResponse.RESPONSE, "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/StartTransferResult;", "e", "", PointCategory.INIT, "", "type", "Ljava/util/Calendar;", "time", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "getDateSize", "Lkotlin/Function1;", "", "", "progress", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/IDataInterceptor;", "dataInterceptor", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/DataResultResult;", "getData", "startTransferData", g.g, "code", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/StopTransferResult;", "stopTransfer", "deInit", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/HMProSyncDataBaseProfile;", "a", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/HMProSyncDataBaseProfile;", Scopes.PROFILE, "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "forceStop", "<init>", "(Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/HMProSyncDataBaseProfile;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GDSPApiImpl implements GeneralDataSensingProcedureApi {

    @NotNull
    private static final String c = "GDSPApiImpl";
    private static final int d = 4;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMProSyncDataBaseProfile profile;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AtomicBoolean forceStop = new AtomicBoolean(false);

    public GDSPApiImpl(@NotNull HMProSyncDataBaseProfile hMProSyncDataBaseProfile) {
        this.profile = hMProSyncDataBaseProfile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPErrorCode] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPErrorCode] */
    public static final void c(Ref.IntRef intRef, Ref.ObjectRef objectRef, AtomicBoolean atomicBoolean, GDSPApiImpl gDSPApiImpl, CRC32 crc32, IDataInterceptor iDataInterceptor, ByteArrayOutputStream byteArrayOutputStream, Ref.LongRef longRef, Function1 function1, byte[] bArr) {
        int i = bArr[0] & 255;
        if ((intRef.element + 1) % 256 != i) {
            objectRef.element = GDSPErrorCode.PACKET_INDEX_ERROR;
            Debug.fi(c, "missing package!!!");
            atomicBoolean.getAndSet(true);
            gDSPApiImpl.profile.waitingNotify();
        } else {
            try {
                byte[] bArrSubArrayWithoutFirstElement = ByteArrayKt.subArrayWithoutFirstElement(bArr);
                crc32.update(bArrSubArrayWithoutFirstElement);
                if ((iDataInterceptor == null || iDataInterceptor.onInterceptor(bArrSubArrayWithoutFirstElement)) ? false : true) {
                    byteArrayOutputStream.write(bArrSubArrayWithoutFirstElement);
                }
                long length = longRef.element + ((long) bArrSubArrayWithoutFirstElement.length);
                longRef.element = length;
                function1.invoke(Long.valueOf(length));
            } catch (Exception e) {
                objectRef.element = GDSPErrorCode.OPERATION_FAILED;
                Debug.fi(c, Intrinsics.stringPlus("exception:", e.getMessage()));
                atomicBoolean.getAndSet(true);
                gDSPApiImpl.profile.waitingNotify();
            }
        }
        intRef.element = i;
        atomicBoolean.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(HMNotifyResponse hMNotifyResponse, AtomicBoolean atomicBoolean, GDSPApiImpl gDSPApiImpl, byte[] bArr) {
        Debug.fi(c, Intrinsics.stringPlus("control:", GattUtils.bytesToHexString(bArr)));
        hMNotifyResponse.from(bArr);
        atomicBoolean.set(true);
        gDSPApiImpl.profile.waitingNotify();
    }

    private final StartTransferResult e(HMNotifyResponse response) {
        if (response == null) {
            return null;
        }
        int unSignInt = AuthModuleKt.toUnSignInt(response.getCode());
        return (response.getData() == null || response.getData().length < 4) ? new StartTransferResult(unSignInt, 0L, 2, null) : new StartTransferResult(unSignInt, GattUtils.bytesToLong(response.getData(), 0, 4));
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.base.GeneralDataSensingProcedureApi
    public void cancel() {
        this.forceStop.set(true);
        this.profile.waitingNotify();
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.base.GeneralDataSensingProcedureApi
    public boolean deInit() {
        return this.profile.deInit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPErrorCode] */
    @Override // com.xiaomi.hm.health.bt.profile.gdsp.base.GeneralDataSensingProcedureApi
    @NotNull
    public DataResultResult getData(@NotNull final Function1<? super Long, Unit> progress, @Nullable final IDataInterceptor dataInterceptor) {
        final CRC32 crc32 = new CRC32();
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = GDSPErrorCode.SUCCESS;
        final Ref.LongRef longRef = new Ref.LongRef();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.profile.setDataCallback(new IGattCallback.INotifyCallback() { // from class: nc2
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                GDSPApiImpl.c(intRef, objectRef, atomicBoolean, this, crc32, dataInterceptor, byteArrayOutputStream, longRef, progress, bArr);
            }
        });
        final HMNotifyResponse hMNotifyResponse = new HMNotifyResponse();
        this.profile.setControlCallback(new IGattCallback.INotifyCallback() { // from class: mc2
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                GDSPApiImpl.d(hMNotifyResponse, atomicBoolean, this, bArr);
            }
        });
        if (!startTransferData()) {
            return new DataResultResult(((GDSPErrorCode) objectRef.element).getCode(), null, 2, null);
        }
        while (!atomicBoolean.get() && !this.forceStop.get()) {
            atomicBoolean.set(true);
            this.profile.waiting(20000);
        }
        StartTransferResult startTransferResultE = e(hMNotifyResponse);
        Debug.fi(c, "Transfer result: " + startTransferResultE + ", received data rcr:" + crc32.getValue());
        if (startTransferResultE == null) {
            return new DataResultResult(GDSPErrorCode.TIMEOUT.getCode(), null, 2, null);
        }
        int code = startTransferResultE.getCode();
        GDSPErrorCode gDSPErrorCode = GDSPErrorCode.SUCCESS;
        if (code != gDSPErrorCode.getCode()) {
            return new DataResultResult(startTransferResultE.getCode(), null, 2, null);
        }
        return startTransferResultE.getCrc() != crc32.getValue() ? new DataResultResult(GDSPErrorCode.CRC_MISMATCH.getCode(), null, 2, null) : new DataResultResult(gDSPErrorCode.getCode(), byteArrayOutputStream.toByteArray());
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.base.GeneralDataSensingProcedureApi
    @Nullable
    public DataHeader getDateSize(int type, @NotNull Calendar time) {
        return this.profile.getDataHeader(time, (byte) type);
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.base.GeneralDataSensingProcedureApi
    public boolean init() {
        return this.profile.init();
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.base.GeneralDataSensingProcedureApi
    public boolean startTransferData() {
        return this.profile.sendControlCommandNoResponse(GDSPCommand.StartTransferCommand.INSTANCE.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String());
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.base.GeneralDataSensingProcedureApi
    @NotNull
    public StopTransferResult stopTransfer(int code) {
        HMNotifyResponse hMNotifyResponseSendControlCommandResponse = this.profile.sendControlCommandResponse(GDSPCommand.StopTransferCommand.INSTANCE.withByte(code).getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String());
        Debug.fi(c, Intrinsics.stringPlus("Stop response:", hMNotifyResponseSendControlCommandResponse));
        if (hMNotifyResponseSendControlCommandResponse == null) {
            return new StopTransferResult(0, 1, null);
        }
        if (hMNotifyResponseSendControlCommandResponse.getData() != null) {
            if (!(hMNotifyResponseSendControlCommandResponse.getData().length == 0)) {
                return new StopTransferResult(AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(hMNotifyResponseSendControlCommandResponse.getData())));
            }
        }
        return new StopTransferResult(0, 1, null);
    }
}
