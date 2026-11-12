package com.huami.bluetooth.profile.channel;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.impl.ReplyParseV1Impl;
import com.huami.bluetooth.profile.channel.model.BleChannelLink;
import com.huami.bluetooth.profile.channel.model.ChannelOptions;
import com.huami.bluetooth.profile.channel.model.ChannelTransferMethod;
import com.huami.bluetooth.profile.channel.model.ChannelVersion;
import com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic;
import com.huami.bluetooth.profile.characteristic.DataCallback;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 02\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b.\u0010/J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u001c\u0010\n\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016J#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R.\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001d\u0010*\u001a\u00020%8D@\u0004X\u0084\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010-\u001a\u00020%8D@\u0004X\u0084\u0084\u0002¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Lcom/huami/bluetooth/profile/channel/BleChannelImpl;", "Lcom/huami/bluetooth/profile/channel/Channel;", "Lcom/huami/bluetooth/profile/channel/model/ChannelOptions;", "channelOptions", "Lcom/huami/bluetooth/profile/channel/model/ChannelVersion;", "version", "Lkotlin/Function1;", "", "", "callback", "dataCallback", HTTP.CONTENT_RANGE_BYTES, "Lcom/huami/bluetooth/profile/channel/ResponseRequire;", "responseRequire", "Lcom/huami/bluetooth/profile/channel/DataSendResponse;", "sendData", "([BLcom/huami/bluetooth/profile/channel/ResponseRequire;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sendReply", "", "getAddress", "Lcom/huami/bluetooth/profile/channel/model/BleChannelLink;", "a", "Lcom/huami/bluetooth/profile/channel/model/BleChannelLink;", "bleChannelLink", "b", "Lkotlin/jvm/functions/Function1;", "getDataCallback", "()Lkotlin/jvm/functions/Function1;", "setDataCallback", "(Lkotlin/jvm/functions/Function1;)V", "c", "Lcom/huami/bluetooth/profile/channel/model/ChannelOptions;", "Lcom/huami/bluetooth/profile/channel/impl/ReplyParseV1Impl;", GoogleApiAvailabilityLight.a, "Lcom/huami/bluetooth/profile/channel/impl/ReplyParseV1Impl;", "replyParseApi", "Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;", "e", "Lkotlin/Lazy;", "getDownLinkCharacteristic", "()Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;", "downLinkCharacteristic", "f", "getUpLinkCharacteristic", "upLinkCharacteristic", "<init>", "(Lcom/huami/bluetooth/profile/channel/model/BleChannelLink;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class BleChannelImpl implements Channel {

    @NotNull
    private static final String g = "BleChannelImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BleChannelLink bleChannelLink;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private ChannelOptions channelOptions;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private Function1<? super byte[], Unit> dataCallback = a.a;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final ReplyParseV1Impl replyParseApi = new ReplyParseV1Impl();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy downLinkCharacteristic = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy upLinkCharacteristic = LazyKt__LazyJVMKt.lazy(new c());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<byte[], Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(@NotNull byte[] bArr) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<BluetoothCharacteristic> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BluetoothCharacteristic invoke() {
            return BleChannelImpl.this.bleChannelLink.getGattPeripheral().getCharacteristic(ChannelTransferMethod.ChannelDown);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<BluetoothCharacteristic> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BluetoothCharacteristic invoke() {
            return BleChannelImpl.this.bleChannelLink.getGattPeripheral().getCharacteristic(ChannelTransferMethod.ChannelUp);
        }
    }

    public BleChannelImpl(@NotNull BleChannelLink bleChannelLink) {
        this.bleChannelLink = bleChannelLink;
        this.channelOptions = new ChannelOptions(bleChannelLink.getGattPeripheral().getMtu());
        try {
            Debug.fi(g, "Init channel profile result: " + bleChannelLink.getGattPeripheral().registerNotification(getUpLinkCharacteristic(), new DataCallback() { // from class: com.huami.bluetooth.profile.channel.BleChannelImpl$ret$1
                @Override // com.huami.bluetooth.profile.characteristic.DataCallback
                public void onReceived(@NotNull byte[] data) {
                    Object objM3845constructorimpl;
                    BleChannelImpl bleChannelImpl = this.a;
                    try {
                        Result.Companion companion = Result.Companion;
                        Debug.fi("BleChannelImpl", "notify");
                        bleChannelImpl.getDataCallback().invoke(data);
                        objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                    }
                    Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                    if (thM3848exceptionOrNullimpl != null) {
                        Debug.fi("BleChannelImpl", Intrinsics.stringPlus("handle data failed:", thM3848exceptionOrNullimpl));
                    }
                }
            }) + ", device mtu: " + this.channelOptions.getMtu().size());
        } catch (Exception e) {
            Debug.fi(g, Intrinsics.stringPlus("Init exception:", e));
        }
    }

    public static /* synthetic */ Object a(BleChannelImpl bleChannelImpl, byte[] bArr, ResponseRequire responseRequire, Continuation continuation) {
        if (!responseRequire.getWithResponse()) {
            return new DataSendResponse(bleChannelImpl.bleChannelLink.getGattPeripheral().sendCommandWithNoResponse(bleChannelImpl.getDownLinkCharacteristic(), bArr), null, 2, null);
        }
        HMNotifyResponse hMNotifyResponseSendCommandWithResponse = bleChannelImpl.bleChannelLink.getGattPeripheral().sendCommandWithResponse(bleChannelImpl.getDownLinkCharacteristic(), bArr);
        return (hMNotifyResponseSendCommandWithResponse == null || hMNotifyResponseSendCommandWithResponse.getOriginResponseData() == null) ? new DataSendResponse(false, null, 2, null) : new DataSendResponse(true, bleChannelImpl.replyParseApi.parse(hMNotifyResponseSendCommandWithResponse.getOriginResponseData()));
    }

    @Override // com.huami.bluetooth.profile.channel.Channel
    @NotNull
    /* JADX INFO: renamed from: channelOptions, reason: from getter */
    public ChannelOptions getChannelOptions() {
        return this.channelOptions;
    }

    @Override // com.huami.bluetooth.profile.channel.Channel
    public void dataCallback(@NotNull Function1<? super byte[], Unit> callback) {
        this.dataCallback = callback;
    }

    @Override // com.huami.bluetooth.profile.channel.Channel
    @NotNull
    public String getAddress() {
        return this.bleChannelLink.getAddress();
    }

    @NotNull
    public final Function1<byte[], Unit> getDataCallback() {
        return this.dataCallback;
    }

    @NotNull
    public final BluetoothCharacteristic getDownLinkCharacteristic() {
        return (BluetoothCharacteristic) this.downLinkCharacteristic.getValue();
    }

    @NotNull
    public final BluetoothCharacteristic getUpLinkCharacteristic() {
        return (BluetoothCharacteristic) this.upLinkCharacteristic.getValue();
    }

    @Override // com.huami.bluetooth.profile.channel.Channel
    @Nullable
    public Object sendData(@NotNull byte[] bArr, @NotNull ResponseRequire responseRequire, @NotNull Continuation<? super DataSendResponse> continuation) {
        return a(this, bArr, responseRequire, continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.Channel
    public boolean sendReply(@NotNull byte[] bytes) {
        return this.bleChannelLink.getGattPeripheral().sendCommandWithNoResponse(getUpLinkCharacteristic(), bytes);
    }

    public final void setDataCallback(@NotNull Function1<? super byte[], Unit> function1) {
        this.dataCallback = function1;
    }

    @Override // com.huami.bluetooth.profile.channel.Channel
    @NotNull
    public ChannelVersion version() {
        return this.bleChannelLink.getVersion();
    }
}
