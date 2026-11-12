package com.huami.bluetooth.profile.channel.model;

import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.PeripheralPattern;
import com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\b\u0018\u0000 /2\u00020\u0001:\u0001/B+\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b,\u0010-B\u0019\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b,\u0010.J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0013\u001a\u00020\tHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000f\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0013\u0010+\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u00060"}, d2 = {"Lcom/huami/bluetooth/profile/channel/model/BleChannelLink;", "", "Lcom/huami/bluetooth/profile/channel/model/ChannelVersion;", "linkVersion", "", "isSupportChannel", "isBaseOnHuamiOS", "Lcom/huami/bluetooth/profile/channel/PeripheralPattern;", "component1", "", "component2", "Ljava/util/UUID;", "component3", "component4", "gattPeripheral", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "downLinkUUID", "upLinkUUID", "copy", "toString", "", "hashCode", "other", "equals", "a", "Lcom/huami/bluetooth/profile/channel/PeripheralPattern;", "getGattPeripheral", "()Lcom/huami/bluetooth/profile/channel/PeripheralPattern;", "b", "Ljava/lang/String;", "getAddress", "()Ljava/lang/String;", "c", "Ljava/util/UUID;", "getDownLinkUUID", "()Ljava/util/UUID;", GoogleApiAvailabilityLight.a, "getUpLinkUUID", "e", "Lcom/huami/bluetooth/profile/channel/model/ChannelVersion;", "internalVersion", "getVersion", "()Lcom/huami/bluetooth/profile/channel/model/ChannelVersion;", "version", "<init>", "(Lcom/huami/bluetooth/profile/channel/PeripheralPattern;Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;)V", "(Lcom/huami/bluetooth/profile/channel/PeripheralPattern;Ljava/lang/String;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BleChannelLink {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final UUID f = GattUtils.uuid128(22);

    @NotNull
    private static final UUID g = GattUtils.uuid128(23);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final PeripheralPattern gattPeripheral;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String address;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final UUID downLinkUUID;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final UUID upLinkUUID;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private ChannelVersion internalVersion;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/model/BleChannelLink$Companion;", "", "Ljava/util/UUID;", "defaultDownLinkUUID", "Ljava/util/UUID;", "getDefaultDownLinkUUID", "()Ljava/util/UUID;", "defaultUpLindUUID", "getDefaultUpLindUUID", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UUID getDefaultDownLinkUUID() {
            return BleChannelLink.f;
        }

        @NotNull
        public final UUID getDefaultUpLindUUID() {
            return BleChannelLink.g;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Get version failed";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Version response not valid";
        }
    }

    public BleChannelLink(@NotNull PeripheralPattern peripheralPattern, @NotNull String str, @NotNull UUID uuid, @NotNull UUID uuid2) {
        this.gattPeripheral = peripheralPattern;
        this.address = str;
        this.downLinkUUID = uuid;
        this.upLinkUUID = uuid2;
        this.internalVersion = new ChannelVersion(0, null, 3, null);
    }

    public static /* synthetic */ BleChannelLink copy$default(BleChannelLink bleChannelLink, PeripheralPattern peripheralPattern, String str, UUID uuid, UUID uuid2, int i, Object obj) {
        if ((i & 1) != 0) {
            peripheralPattern = bleChannelLink.gattPeripheral;
        }
        if ((i & 2) != 0) {
            str = bleChannelLink.address;
        }
        if ((i & 4) != 0) {
            uuid = bleChannelLink.downLinkUUID;
        }
        if ((i & 8) != 0) {
            uuid2 = bleChannelLink.upLinkUUID;
        }
        return bleChannelLink.copy(peripheralPattern, str, uuid, uuid2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PeripheralPattern getGattPeripheral() {
        return this.gattPeripheral;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UUID getDownLinkUUID() {
        return this.downLinkUUID;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final UUID getUpLinkUUID() {
        return this.upLinkUUID;
    }

    @NotNull
    public final BleChannelLink copy(@NotNull PeripheralPattern gattPeripheral, @NotNull String address, @NotNull UUID downLinkUUID, @NotNull UUID upLinkUUID) {
        return new BleChannelLink(gattPeripheral, address, downLinkUUID, upLinkUUID);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BleChannelLink)) {
            return false;
        }
        BleChannelLink bleChannelLink = (BleChannelLink) other;
        return Intrinsics.areEqual(this.gattPeripheral, bleChannelLink.gattPeripheral) && Intrinsics.areEqual(this.address, bleChannelLink.address) && Intrinsics.areEqual(this.downLinkUUID, bleChannelLink.downLinkUUID) && Intrinsics.areEqual(this.upLinkUUID, bleChannelLink.upLinkUUID);
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    public final UUID getDownLinkUUID() {
        return this.downLinkUUID;
    }

    @NotNull
    public final PeripheralPattern getGattPeripheral() {
        return this.gattPeripheral;
    }

    @NotNull
    public final UUID getUpLinkUUID() {
        return this.upLinkUUID;
    }

    @NotNull
    public final ChannelVersion getVersion() {
        if (this.internalVersion.getVersionCode() >= 0) {
            return this.internalVersion;
        }
        ChannelVersion channelVersionLinkVersion = linkVersion();
        this.internalVersion = channelVersionLinkVersion;
        return channelVersionLinkVersion;
    }

    public int hashCode() {
        return (((((this.gattPeripheral.hashCode() * 31) + this.address.hashCode()) * 31) + this.downLinkUUID.hashCode()) * 31) + this.upLinkUUID.hashCode();
    }

    public final boolean isBaseOnHuamiOS() {
        return getVersion().getVersionCode() >= 2;
    }

    public final boolean isSupportChannel() {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            Boolean boolValueOf = Boolean.valueOf(getGattPeripheral().getCharacteristic(ChannelTransferMethod.ChannelDown).init());
            if (!boolValueOf.booleanValue()) {
                boolValueOf = null;
            }
            boolean z = false;
            if (boolValueOf != null) {
                boolValueOf.booleanValue();
                Boolean boolValueOf2 = Boolean.valueOf(getGattPeripheral().getCharacteristic(ChannelTransferMethod.ChannelUp).init());
                Boolean bool = boolValueOf2.booleanValue() ? boolValueOf2 : null;
                if (bool != null) {
                    bool.booleanValue();
                    z = true;
                }
            }
            objM3845constructorimpl = Result.m3845constructorimpl(Boolean.valueOf(z));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("判断是否支持Channel时发生异常:");
            sb.append(thM3848exceptionOrNullimpl);
            sb.append(",此时的参数 ");
            String string = getGattPeripheral().toString();
            if (string == null) {
                string = "null";
            }
            sb.append(string);
            Debug.fi("BleChannelLink", sb.toString());
        }
        if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
            objM3845constructorimpl = Boolean.FALSE;
        }
        return ((Boolean) objM3845constructorimpl).booleanValue();
    }

    @NotNull
    public final ChannelVersion linkVersion() {
        BluetoothCharacteristic characteristic = this.gattPeripheral.getCharacteristic(ChannelTransferMethod.ChannelDown);
        characteristic.init();
        HMNotifyResponse hMNotifyResponseSendCommandWithResponse = this.gattPeripheral.sendCommandWithResponse(characteristic, new byte[]{1});
        if (hMNotifyResponseSendCommandWithResponse != null && hMNotifyResponseSendCommandWithResponse.getOriginResponseData() != null) {
            if (!(hMNotifyResponseSendCommandWithResponse.getOriginResponseData().length == 0)) {
                if (hMNotifyResponseSendCommandWithResponse.getOriginResponseData().length >= 2 && hMNotifyResponseSendCommandWithResponse.getOriginResponseData()[0] == 2) {
                    return ChannelVersion.INSTANCE.parse(ByteArrayKt.subArrayWithoutFirstElement(hMNotifyResponseSendCommandWithResponse.getOriginResponseData()));
                }
                HMLog.info("BleChannelLink", b.a);
                return new ChannelVersion(0, null, 3, null);
            }
        }
        HMLog.info("BleChannelLink", a.a);
        return new ChannelVersion(0, null, 3, null);
    }

    @NotNull
    public String toString() {
        return "BleChannelLink(gattPeripheral=" + this.gattPeripheral + ", address=" + this.address + ", downLinkUUID=" + this.downLinkUUID + ", upLinkUUID=" + this.upLinkUUID + ')';
    }

    public /* synthetic */ BleChannelLink(PeripheralPattern peripheralPattern, String str, UUID uuid, UUID uuid2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(peripheralPattern, str, (i & 4) != 0 ? f : uuid, (i & 8) != 0 ? g : uuid2);
    }

    public BleChannelLink(@NotNull PeripheralPattern peripheralPattern, @NotNull String str) {
        this(peripheralPattern, str, f, g);
    }
}
