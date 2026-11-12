package com.huami.bluetooth.profile.generic;

import androidx.core.app.NotificationCompat;
import com.xiaomi.hm.health.bt.classic.ITransport;
import com.xiaomi.hm.health.bt.classic.Protocol;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\tB\u001f\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/huami/bluetooth/profile/generic/ClassicGenericNotifyCharacteristic;", "Lcom/huami/bluetooth/profile/generic/GenericNotifyCharacteristic;", "", "data", "", "timeout", "Lcom/huami/bluetooth/profile/generic/GenericResponse;", "send", "Lcom/xiaomi/hm/health/bt/classic/Protocol;", "a", "Lcom/xiaomi/hm/health/bt/classic/Protocol;", "protocol", "Lkotlin/Function0;", "Lcom/xiaomi/hm/health/bt/classic/ITransport;", "b", "Lkotlin/jvm/functions/Function0;", NotificationCompat.CATEGORY_TRANSPORT, "<init>", "(Lcom/xiaomi/hm/health/bt/classic/Protocol;Lkotlin/jvm/functions/Function0;)V", "c", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ClassicGenericNotifyCharacteristic implements GenericNotifyCharacteristic {

    @Deprecated
    @NotNull
    public static final String TAG = "ClassicGenericNotifyCharacteristic";

    @NotNull
    private static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Protocol protocol;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<ITransport> transport;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/bluetooth/profile/generic/ClassicGenericNotifyCharacteristic$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClassicGenericNotifyCharacteristic(@NotNull Protocol protocol, @NotNull Function0<? extends ITransport> function0) {
        this.protocol = protocol;
        this.transport = function0;
    }

    @Override // com.huami.bluetooth.profile.generic.GenericNotifyCharacteristic
    @Nullable
    public GenericResponse send(@NotNull byte[] bArr) {
        return GenericNotifyCharacteristic.DefaultImpls.send(this, bArr);
    }

    @Override // com.huami.bluetooth.profile.generic.GenericNotifyCharacteristic
    @Nullable
    public GenericResponse send(@NotNull byte[] data, int timeout) {
        HMNotifyResponse hMNotifyResponseSendCommandWithResponse;
        Debug.fi(TAG, Intrinsics.stringPlus("send: ", GattUtils.bytesToHexString(data)));
        ITransport iTransportInvoke = this.transport.invoke();
        if (iTransportInvoke == null || (hMNotifyResponseSendCommandWithResponse = iTransportInvoke.sendCommandWithResponse(this.protocol, data, timeout)) == null) {
            return null;
        }
        Debug.fi(TAG, Intrinsics.stringPlus("received: ", GattUtils.bytesToHexString(hMNotifyResponseSendCommandWithResponse.getOriginResponseData())));
        GenericNotify genericNotify = GenericNotifyKt.toGenericNotify(hMNotifyResponseSendCommandWithResponse.getOriginResponseData());
        if (genericNotify != null && genericNotify.isEnd()) {
            return GenericResponseKt.toGenericResponse(genericNotify.getData$bluetooth_release());
        }
        return null;
    }
}
