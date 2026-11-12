package com.huami.bluetooth.profile.channel.module.dial;

import com.huami.bluetooth.profile.channel.module.ChannelModuleProvider;
import com.huami.bluetooth.profile.channel.module.ChannelModuleStoreOwner;
import com.huami.bluetooth.profile.channel.module.DialModule;
import com.huami.bluetooth.profile.channel.module.settings.EcfCmdProvider;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.xiaomi.hm.health.bt.profile.milipro.MiLiProProfile;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/dial/DialApiFactory;", "", "Lcom/huami/bluetooth/profile/channel/module/ChannelModuleStoreOwner;", DataCacher.o, "Lcom/huami/bluetooth/profile/channel/module/dial/DialApi;", "create", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DialApiFactory {

    @NotNull
    public static final DialApiFactory INSTANCE = new DialApiFactory();

    private DialApiFactory() {
    }

    @Nullable
    public final DialApi create(@NotNull ChannelModuleStoreOwner owner) {
        if (!owner.supportModule(35)) {
            if (owner instanceof MiLiProProfile) {
                return new DialDefaultImpl((EcfCmdProvider) owner);
            }
            return null;
        }
        DialModule dialModule = (DialModule) ChannelModuleProvider.INSTANCE.of(owner).get(DialModule.class);
        if (dialModule == null) {
            return null;
        }
        return new DialOsImpl(dialModule);
    }
}
