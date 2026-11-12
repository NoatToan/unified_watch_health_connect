package com.huami.bluetooth.profile.channel.module.sport;

import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.bluetooth.profile.channel.module.base.IncreasePredict;
import com.huami.bluetooth.profile.channel.module.base.ModuleRequest;
import com.huami.bluetooth.profile.channel.module.base.ModuleResultKt;
import com.huami.bluetooth.profile.channel.module.sport.codec.PhnVersionCodec;
import com.huami.bluetooth.profile.channel.module.sport.impl.PHNApiImpl;
import com.xiaomi.hm.health.bt.debug.Debug;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@ChannelModule(id = 55)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sport/PHNModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lcom/huami/bluetooth/profile/channel/module/sport/PhnVersion;", "queryVersion", "Lcom/huami/bluetooth/profile/channel/module/sport/PHNApi;", "loadApi", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "api", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class PHNModule extends BaseModule {

    @NotNull
    private static final String g = "PHNModule";
    private static final int h = 1;

    public PHNModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
    }

    @Nullable
    public final PHNApi loadApi() {
        String string;
        PhnVersion phnVersionQueryVersion = queryVersion();
        String str = "null";
        if (phnVersionQueryVersion != null && (string = phnVersionQueryVersion.toString()) != null) {
            str = string;
        }
        Debug.fi(g, str);
        if (phnVersionQueryVersion == null) {
            return null;
        }
        if (phnVersionQueryVersion.getProtocolVersion() == 1) {
            return new PHNApiImpl(this, phnVersionQueryVersion.getAlgorithmVersion());
        }
        Debug.fi(g, "UnSupport phn protocol version");
        return null;
    }

    @Nullable
    public final PhnVersion queryVersion() {
        return (PhnVersion) ModuleResultKt.peel(new PhnVersionCodec().decode(sendRequest(new ModuleRequest(PHNCommand.QueryVersionCommand.INSTANCE, IncreasePredict.INSTANCE, 0L, null, false, 28, null))));
    }
}
