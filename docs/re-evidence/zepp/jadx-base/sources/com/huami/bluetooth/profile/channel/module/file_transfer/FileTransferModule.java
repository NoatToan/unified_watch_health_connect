package com.huami.bluetooth.profile.channel.module.file_transfer;

import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.bluetooth.profile.channel.module.base.IncreasePredict;
import com.huami.bluetooth.profile.channel.module.base.ModuleRequest;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.ModuleResultKt;
import com.huami.bluetooth.profile.channel.module.file_transfer.codec.VersionCodec;
import com.huami.bluetooth.profile.channel.module.file_transfer.model.FileTransferProtocolVersion;
import com.xiaomi.hm.health.bt.debug.Debug;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@ChannelModule(id = 13)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u001f\u0010\b\u001a\u0004\u0018\u00010\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileTransferModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/model/FileTransferProtocolVersion;", "queryVersion", "g", "Lkotlin/Lazy;", "getVersion", "()Lcom/huami/bluetooth/profile/channel/module/file_transfer/model/FileTransferProtocolVersion;", "version", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelController", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class FileTransferModule extends BaseModule {

    @NotNull
    private static final String h = "FileTransferModule";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy version;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/file_transfer/model/FileTransferProtocolVersion;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<FileTransferProtocolVersion> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FileTransferProtocolVersion invoke() {
            return FileTransferModule.this.queryVersion();
        }
    }

    public FileTransferModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.version = LazyKt__LazyJVMKt.lazy(new a());
    }

    @Nullable
    public final FileTransferProtocolVersion getVersion() {
        return (FileTransferProtocolVersion) this.version.getValue();
    }

    @Nullable
    public final FileTransferProtocolVersion queryVersion() {
        ModuleResult<byte[]> moduleResultSendRequest = sendRequest(new ModuleRequest(FileTransferCommand.QueryVersionCommand.INSTANCE, IncreasePredict.INSTANCE, 0L, null, false, 28, null));
        Debug.fi(h, String.valueOf(moduleResultSendRequest));
        return (FileTransferProtocolVersion) ModuleResultKt.peel(new VersionCodec().decode(moduleResultSendRequest));
    }
}
