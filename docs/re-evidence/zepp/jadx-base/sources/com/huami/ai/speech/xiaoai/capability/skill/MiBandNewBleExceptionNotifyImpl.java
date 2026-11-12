package com.huami.ai.speech.xiaoai.capability.skill;

import com.huami.ai.helper.SpeechDevice;
import com.huami.ai.notify.EngineExceptionNotify;
import com.huami.bluetooth.profile.channel.module.voice.command.ErrorCommand;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/skill/MiBandNewBleExceptionNotifyImpl;", "Lcom/huami/ai/notify/EngineExceptionNotify;", "", "errorCommandCode", "", "a", "errorCode", "engineException", "Lcom/huami/ai/helper/SpeechDevice;", "Lcom/huami/ai/helper/SpeechDevice;", "baseDevice", "<init>", "(Lcom/huami/ai/helper/SpeechDevice;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class MiBandNewBleExceptionNotifyImpl implements EngineExceptionNotify {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SpeechDevice baseDevice;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("send error command ", Integer.valueOf(this.a));
        }
    }

    public MiBandNewBleExceptionNotifyImpl(@NotNull SpeechDevice speechDevice) {
        this.baseDevice = speechDevice;
    }

    private final void a(int errorCommandCode) {
        HMLog.info("speech", new a(errorCommandCode));
        SpeechDevice.DefaultImpls.sendCommand$default(this.baseDevice, new ErrorCommand(errorCommandCode, ""), null, 2, null);
    }

    @Override // com.huami.ai.notify.EngineExceptionNotify
    public void engineException(int errorCode) {
        if (errorCode == 1 || errorCode == 2) {
            a(3);
            return;
        }
        if (errorCode == 3) {
            a(2);
            return;
        }
        if (errorCode != 4) {
            if (errorCode != 5) {
                if (errorCode != 8) {
                    if (errorCode != 9) {
                        if (errorCode == 17) {
                            a(11);
                            return;
                        } else {
                            if (errorCode != 18) {
                                return;
                            }
                            a(6);
                            return;
                        }
                    }
                }
            }
            a(8);
            return;
        }
        a(9);
    }
}
