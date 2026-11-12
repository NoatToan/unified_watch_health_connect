package com.huami.bluetooth.profile.channel.module;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.d4;
import defpackage.f9;
import defpackage.fu;
import defpackage.nl;
import defpackage.ol;
import defpackage.qq;
import defpackage.r3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/EncryptEchoModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "", "byteArray", "echo", "Lr3;", "channelController", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 129)
public final class EncryptEchoModule extends a {
    public static final int CMD_DATA_ECHO = 2;

    @NotNull
    public static final String TAG = "EncryptEchoModule";
    public static final long TIMEOUT = 5000;

    @NotNull
    private final r3 channelController;

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/huami/bluetooth/profile/channel/module/EncryptEchoModule$b", "Lqq;", "Lnl;", "request", "", com.xiaomi.onetrack.api.b.I, "", "predict", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements qq {
        @Override // defpackage.qq
        public boolean predict(@NotNull nl request, @NotNull byte[] response) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EncryptEchoModule(@NotNull r3 channelController) {
        super(channelController);
        Intrinsics.checkNotNullParameter(channelController, "channelController");
        this.channelController = channelController;
    }

    @Nullable
    public final byte[] echo(@NotNull byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        ol<byte[]> olVarSendRequest = sendRequest(new nl(f9.a.f17540a.withBytes(byteArray), new b(), 0L, null, false, 28, null));
        if (olVarSendRequest instanceof fu) {
            return (byte[]) ((fu) olVarSendRequest).a();
        }
        return null;
    }
}
