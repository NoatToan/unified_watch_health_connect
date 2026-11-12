package com.huami.bluetooth.profile.channel.module;

import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.bluetooth.profile.channel.module.base.ModuleRequest;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.ResponsePredict;
import com.huami.bluetooth.profile.channel.module.base.Success;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@ChannelModule(id = 129)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/EncryptEchoModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "", "byteArray", "echo", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "g", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelController", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class EncryptEchoModule extends BaseModule {
    public static final int CMD_DATA_ECHO = 2;

    @NotNull
    public static final String TAG = "EncryptEchoModule";
    public static final long TIMEOUT = 5000;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final ChannelApi channelController;

    public EncryptEchoModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.channelController = channelApi;
    }

    @Nullable
    public final byte[] echo(@NotNull byte[] byteArray) {
        ModuleResult<byte[]> moduleResultSendRequest = sendRequest(new ModuleRequest(EchoCommand.Echo.INSTANCE.withBytes(byteArray), new ResponsePredict() { // from class: com.huami.bluetooth.profile.channel.module.EncryptEchoModule$echo$request$1
            @Override // com.huami.bluetooth.profile.channel.module.base.ResponsePredict
            public boolean predict(@NotNull ModuleRequest request, @NotNull byte[] response) {
                return true;
            }
        }, 0L, null, false, 28, null));
        if (moduleResultSendRequest instanceof Success) {
            return (byte[]) ((Success) moduleResultSendRequest).getData();
        }
        return null;
    }
}
