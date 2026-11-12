package com.huami.bluetooth.profile.channel.module.voice;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.r3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/AiVoiceModule;", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceModule;", "", "getModule", "()I", RnReportConst.ApiReport.PARAM_MODULE, "Lr3;", "channelController", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class AiVoiceModule extends VoiceModule {
    public static final int VOICE_MODULE_AI = 16;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiVoiceModule(@NotNull r3 channelController) {
        super(channelController);
        Intrinsics.checkNotNullParameter(channelController, "channelController");
    }

    @Override // com.huami.bluetooth.profile.channel.module.voice.VoiceModule, com.huami.bluetooth.profile.channel.module.a
    /* JADX INFO: renamed from: getModule */
    public int getChannelModule() {
        return 16;
    }
}
