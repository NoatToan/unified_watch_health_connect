package com.huami.bluetooth.profile.channel.module.find;

import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.bluetooth.profile.channel.module.base.IncreasePredict;
import com.huami.bluetooth.profile.channel.module.base.ModuleRequest;
import com.huami.bluetooth.profile.channel.module.base.ModuleResultKt;
import com.huami.bluetooth.profile.channel.module.find.codec.VersionCodec;
import com.huami.bluetooth.profile.channel.module.find.impl.FindDeviceApiImpl;
import com.xiaomi.hm.health.bt.debug.Debug;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@ChannelModule(id = 26)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\u0004R\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u00068F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "", "queryVersion", "()Ljava/lang/Integer;", "version", "Lcom/huami/bluetooth/profile/channel/module/find/IFindDeviceBleCmdApi;", "loadApi", "(Ljava/lang/Integer;)Lcom/huami/bluetooth/profile/channel/module/find/IFindDeviceBleCmdApi;", "g", "Lkotlin/Lazy;", "getVersion", "h", "getFindDeviceApi", "()Lcom/huami/bluetooth/profile/channel/module/find/IFindDeviceBleCmdApi;", "findDeviceApi", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelApi", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class FindDeviceModule extends BaseModule {
    public static final int VERSION_1 = 1;
    public static final int VERSION_2 = 2;

    @NotNull
    private static final String i = "FindDeviceModule";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy version;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy findDeviceApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/find/IFindDeviceBleCmdApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<IFindDeviceBleCmdApi> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IFindDeviceBleCmdApi invoke() {
            FindDeviceModule findDeviceModule = FindDeviceModule.this;
            return findDeviceModule.loadApi(findDeviceModule.getVersion());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Integer> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return FindDeviceModule.this.queryVersion();
        }
    }

    public FindDeviceModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.version = LazyKt__LazyJVMKt.lazy(new b());
        this.findDeviceApi = LazyKt__LazyJVMKt.lazy(new a());
    }

    @Nullable
    public final IFindDeviceBleCmdApi getFindDeviceApi() {
        return (IFindDeviceBleCmdApi) this.findDeviceApi.getValue();
    }

    @Nullable
    public final Integer getVersion() {
        return (Integer) this.version.getValue();
    }

    @Nullable
    public final IFindDeviceBleCmdApi loadApi(@Nullable Integer version) {
        Debug.fi(i, Intrinsics.stringPlus("version is: ", version));
        if (version == null) {
            return null;
        }
        int iIntValue = version.intValue();
        if (iIntValue == 1 || iIntValue == 2) {
            return new FindDeviceApiImpl(getAddress(), this, version.intValue());
        }
        Debug.fi(i, "UnSupport nfc protocol version");
        return null;
    }

    @Nullable
    public final Integer queryVersion() {
        return (Integer) ModuleResultKt.peel(new VersionCodec().decode(sendRequest(new ModuleRequest(FindDeviceCommand.QueryVersionCommand.INSTANCE, IncreasePredict.INSTANCE, 0L, null, false, 28, null))));
    }
}
