package com.huami.ai.koin.common;

import com.huami.ai.skill.FindPhoneSkill;
import com.huami.ai.uitls.DeviceUtilsKt;
import com.huami.bluetooth.profile.channel.module.voice.command.NLPCommand;
import com.huami.bluetooth.profile.channel.module.voice.content.OpenAppContent;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/ai/koin/common/NewBleFindPhoneSkill;", "Lcom/huami/ai/skill/FindPhoneSkill;", "", "findPhone", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "a", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "baseDevice", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;)V", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public final class NewBleFindPhoneSkill implements FindPhoneSkill {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMBaseDevice baseDevice;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("发送查找手机的指令：", Boolean.valueOf(this.a));
        }
    }

    public NewBleFindPhoneSkill(@NotNull HMBaseDevice hMBaseDevice) {
        this.baseDevice = hMBaseDevice;
    }

    @Override // com.huami.ai.skill.FindPhoneSkill
    public boolean findPhone() {
        boolean zSendCommand$default = DeviceUtilsKt.sendCommand$default(this.baseDevice, new NLPCommand(new OpenAppContent(12, null, 2, null)), null, 2, null);
        HMLog.info("speech", new a(zSendCommand$default));
        return zSendCommand$default;
    }
}
