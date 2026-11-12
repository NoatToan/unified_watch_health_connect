package com.huami.ai.speech.xiaoai.interceptor;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.ai.helper.SpeechDevice;
import com.huami.ai.speech.xiaoai.utils.CheckInstructionKt;
import com.huami.bluetooth.profile.channel.module.voice.command.ErrorCommand;
import com.xiaomi.ai.api.Alerts;
import com.xiaomi.ai.api.common.Instruction;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016R\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/ai/speech/xiaoai/interceptor/ReminderTitleInterceptor;", "Lcom/huami/ai/speech/xiaoai/interceptor/InstructionInterceptor;", "Lcom/xiaomi/ai/api/Alerts$SetAlert;", "payload", "", "a", "", "Lcom/xiaomi/ai/api/common/Instruction;", "", "instruction", "intercept", "Lcom/huami/ai/helper/SpeechDevice;", "Lcom/huami/ai/helper/SpeechDevice;", "baseDevice", "b", LogUtil.I, "maxTextSize", "<init>", "(Lcom/huami/ai/helper/SpeechDevice;I)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class ReminderTitleInterceptor implements InstructionInterceptor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SpeechDevice baseDevice;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int maxTextSize;

    public ReminderTitleInterceptor(@NotNull SpeechDevice speechDevice, int i) {
        this.baseDevice = speechDevice;
        this.maxTextSize = i;
    }

    private final int a(Alerts.SetAlert payload) {
        return (payload.getEvent().isPresent() ? payload.getEvent().get() : "").length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huami.ai.speech.xiaoai.interceptor.InstructionInterceptor
    @NotNull
    public List<Instruction<Object>> intercept(@NotNull List<? extends Instruction<Object>> instruction) {
        Object next;
        Iterator it2 = instruction.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!CheckInstructionKt.getCheckSetReminderInstruction().invoke((Instruction) next).booleanValue());
        Instruction instruction2 = (Instruction) next;
        if (instruction2 == null) {
            return instruction;
        }
        T payload = instruction2.getPayload();
        Objects.requireNonNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Alerts.SetAlert");
        if (a((Alerts.SetAlert) payload) <= this.maxTextSize) {
            return instruction;
        }
        SpeechDevice.DefaultImpls.sendCommand$default(this.baseDevice, new ErrorCommand(5, "reminder label words big than 30"), null, 2, null);
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public /* synthetic */ ReminderTitleInterceptor(SpeechDevice speechDevice, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(speechDevice, (i2 & 2) != 0 ? 30 : i);
    }
}
