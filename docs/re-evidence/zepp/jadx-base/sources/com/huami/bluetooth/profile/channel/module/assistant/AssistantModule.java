package com.huami.bluetooth.profile.channel.module.assistant;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV1Impl;
import com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardApiImpl;
import com.huami.bluetooth.profile.channel.module.base.ModuleRequest;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.ResponsePredict;
import com.huami.bluetooth.profile.channel.module.base.Success;
import com.xiaomi.hm.health.bt.utils.BytesDecoder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lcom/huami/bluetooth/profile/channel/module/base/ResponsePredict;", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleRequest;", "request", "", AbstractJSONTokenResponse.RESPONSE, "", "predict", "Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantVersion;", "queryVersion", "Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantApi;", "loadApiV2", "Lcom/huami/bluetooth/profile/channel/module/assistant/QuickCardApi;", "loadQuickCardApi", "g", "Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantVersion;", "version", "", "getModule", "()I", "module", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelController", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class AssistantModule extends BaseModule implements ResponsePredict {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private AssistantVersion version;

    public AssistantModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public int getModule() {
        return 9;
    }

    @NotNull
    public final AssistantApi loadApiV2() {
        return new AssistantV1Impl(this);
    }

    @NotNull
    public final QuickCardApi loadQuickCardApi() {
        return new QuickCardApiImpl(this);
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.ResponsePredict
    public boolean predict(@NotNull ModuleRequest request, @NotNull byte[] response) {
        return response[0] == 2;
    }

    @NotNull
    public final AssistantVersion queryVersion() throws Exception {
        AssistantVersion assistantVersion = this.version;
        if (assistantVersion != null) {
            return assistantVersion;
        }
        ModuleResult<byte[]> moduleResultSendRequest = sendRequest(new ModuleRequest(new Request.Command(new byte[]{1}), this, 0L, null, false, 28, null));
        if (!(moduleResultSendRequest instanceof Success)) {
            throw new Exception(Intrinsics.stringPlus("Query version error: ", moduleResultSendRequest));
        }
        BytesDecoder bytesDecoder = new BytesDecoder((byte[]) ((Success) moduleResultSendRequest).getData());
        BytesDecoder.readUInt8$default(bytesDecoder, 0, 1, null);
        AssistantVersion assistantVersion2 = new AssistantVersion(BytesDecoder.readUInt8$default(bytesDecoder, 0, 1, null), bytesDecoder.readUInt16(0));
        this.version = assistantVersion2;
        return assistantVersion2;
    }
}
