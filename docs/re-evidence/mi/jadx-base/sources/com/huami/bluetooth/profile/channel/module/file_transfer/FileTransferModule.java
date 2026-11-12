package com.huami.bluetooth.profile.channel.module.file_transfer;

import com.huami.bluetooth.profile.channel.module.a;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.C3621pl;
import defpackage.FileTransferProtocolVersion;
import defpackage.d4;
import defpackage.dw;
import defpackage.ia;
import defpackage.mj;
import defpackage.nl;
import defpackage.ol;
import defpackage.r3;
import defpackage.t5t;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u001d\u0010\b\u001a\u0004\u0018\u00010\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileTransferModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lna;", "queryVersion", "version$delegate", "Lkotlin/Lazy;", "getVersion", "()Lna;", "version", "Lr3;", "channelController", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 13)
public final class FileTransferModule extends a {

    @NotNull
    private static final String tag = "FileTransferModule";

    /* JADX INFO: renamed from: version$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy version;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lna;", PluginDeviceInfo.FMODEL, "()Lna;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<FileTransferProtocolVersion> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FileTransferProtocolVersion invoke() {
            return FileTransferModule.this.queryVersion();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileTransferModule(@NotNull r3 channelController) {
        super(channelController);
        Intrinsics.checkNotNullParameter(channelController, "channelController");
        this.version = LazyKt__LazyJVMKt.lazy(new b());
    }

    @Nullable
    public final FileTransferProtocolVersion getVersion() {
        return (FileTransferProtocolVersion) this.version.getValue();
    }

    @Nullable
    public final FileTransferProtocolVersion queryVersion() {
        ol<byte[]> olVarSendRequest = sendRequest(new nl(ia.a.f20922b, mj.t, 0L, null, false, 28, null));
        t5t.d(tag, String.valueOf(olVarSendRequest));
        return (FileTransferProtocolVersion) C3621pl.a(new dw().a(olVarSendRequest));
    }
}
