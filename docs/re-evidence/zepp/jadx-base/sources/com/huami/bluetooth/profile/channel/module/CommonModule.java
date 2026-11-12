package com.huami.bluetooth.profile.channel.module;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.ChannelApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/CommonModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "", "g", LogUtil.I, "channelModule", "getModule", "()I", "module", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelController", "<init>", "(ILcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class CommonModule extends BaseModule {

    @NotNull
    public static final String TAG = "CommonModule";
    public static final long TIMEOUT = 5000;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int channelModule;

    public CommonModule(int i, @NotNull ChannelApi channelApi) {
        super(channelApi);
        this.channelModule = i;
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    /* JADX INFO: renamed from: getModule, reason: from getter */
    public int getChannelModule() {
        return this.channelModule;
    }
}
