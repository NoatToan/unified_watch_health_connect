package com.huami.bluetooth.profile.channel.module.nfc;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.bluetooth.profile.channel.module.base.ModuleRequest;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.Success;
import com.huami.bluetooth.profile.channel.module.nfc.codec.VersionCodec;
import com.huami.bluetooth.profile.channel.module.nfc.impl.NFCApiImpl;
import com.huami.bluetooth.profile.channel.module.nfc.impl.NFCCommand;
import com.xiaomi.hm.health.bt.debug.Debug;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@ChannelModule(id = 36)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001f\u0010\u0006\u001a\u0004\u0018\u00010\u00048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0013\u001a\u0004\u0018\u00010\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/NFCModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lcom/huami/bluetooth/profile/channel/module/nfc/NFCApi;", GoogleApiAvailabilityLight.a, "Lcom/huami/bluetooth/profile/channel/module/nfc/NFCVersion;", "queryVersion", "version", "loadApi", "", "g", "Ljava/lang/String;", "tag", "h", "Lkotlin/Lazy;", "c", "()Lcom/huami/bluetooth/profile/channel/module/nfc/NFCVersion;", "i", "getNfcApi", "()Lcom/huami/bluetooth/profile/channel/module/nfc/NFCApi;", "nfcApi", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "api", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class NFCModule extends BaseModule {
    private static final long j = 5000;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final String tag;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy version;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy nfcApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/NFCApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<NFCApi> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NFCApi invoke() {
            return NFCModule.this.d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/NFCVersion;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<NFCVersion> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NFCVersion invoke() {
            return NFCModule.this.queryVersion();
        }
    }

    public NFCModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.tag = "NFCModule";
        this.version = LazyKt__LazyJVMKt.lazy(new b());
        this.nfcApi = LazyKt__LazyJVMKt.lazy(new a());
    }

    private final NFCVersion c() {
        return (NFCVersion) this.version.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NFCApi d() {
        return loadApi(c());
    }

    @Nullable
    public final NFCApi getNfcApi() {
        return (NFCApi) this.nfcApi.getValue();
    }

    @Nullable
    public final NFCApi loadApi(@Nullable NFCVersion version) {
        String string;
        String str = this.tag;
        String str2 = "null";
        if (version != null && (string = version.toString()) != null) {
            str2 = string;
        }
        Debug.fi(str, str2);
        if (version == null) {
            return null;
        }
        int version2 = version.getVersion();
        if (version2 == 4 || version2 == 5) {
            return new NFCApiImpl(this, version);
        }
        Debug.fi(this.tag, "UnSupport nfc protocol version");
        return null;
    }

    @Nullable
    public final NFCVersion queryVersion() {
        ModuleResult<byte[]> moduleResultSendRequest = sendRequest(new ModuleRequest(NFCCommand.QueryVersionCommand.INSTANCE, null, 0L, null, false, 30, null));
        if (moduleResultSendRequest == null) {
            return null;
        }
        ModuleResult<NFCVersion> moduleResultDecode = new VersionCodec().decode(moduleResultSendRequest);
        if (moduleResultDecode instanceof Success) {
            return (NFCVersion) ((Success) moduleResultDecode).getData();
        }
        return null;
    }
}
