package com.xiaomi.ai.android.core;

import android.text.TextUtils;
import com.xiaomi.ai.android.capability.InstructionCapability;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.SpeechSynthesizer;
import com.xiaomi.ai.api.Sys;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.log.Logger;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes18.dex */
public final class f {
    private final boolean a;
    private d b;
    private com.xiaomi.ai.android.impl.a c;

    public f(d dVar) {
        this.b = dVar;
        this.a = dVar.b().getInt(AivsConfig.Asr.VAD_TYPE) == 1;
        this.c = new com.xiaomi.ai.android.impl.a(this.b);
    }

    private void c() {
        com.xiaomi.ai.android.impl.a aVar = this.c;
        if (aVar != null) {
            aVar.a((byte[]) null, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c(Instruction instruction) {
        String id;
        if (this.a && AIApiConstants.SpeechRecognizer.StopCapture.equals(instruction.getFullName())) {
            return;
        }
        if (!instruction.getDialogId().isPresent()) {
            Logger.b("InstructionManager", "processACK dialog is null");
            return;
        }
        String str = instruction.getDialogId().get();
        Sys.Ack ack = new Sys.Ack();
        if (AIApiConstants.System.Ping.equals(instruction.getFullName())) {
            Sys.Ping ping = (Sys.Ping) instruction.getPayload();
            ack.setType(ping.getType());
            id = ping.getId();
        } else {
            ack.setType(AIApiConstants.General.Push.equals(instruction.getFullName()) ? "Push" : "Instruction");
            id = instruction.getId();
        }
        ack.setId(id);
        this.b.postEvent(APIUtils.buildEvent(ack, null, str));
    }

    private void d() {
        if (this.b.b().getInt(AivsConfig.Connection.KEEP_ALIVE_TYPE) != 2 || this.b.c().b() > 0) {
            return;
        }
        Logger.b("InstructionManager", "processFinish: stop Channel because of DO_NOT_KEEP_ALIVE");
        com.xiaomi.ai.core.a aVarG = this.b.g();
        if (aVarG != null) {
            aVarG.stop();
        }
    }

    private void d(Instruction instruction) {
        String fullName = instruction.getFullName();
        fullName.hashCode();
        if (fullName.equals(AIApiConstants.Dialog.Finish)) {
            d();
        }
    }

    private void e(Instruction instruction) {
        String fullName = instruction.getFullName();
        fullName.hashCode();
        if (fullName.equals(AIApiConstants.SpeechSynthesizer.Speak)) {
            f(instruction);
        } else if (fullName.equals(AIApiConstants.SpeechSynthesizer.FinishSpeakStream)) {
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void f(Instruction instruction) {
        SpeechSynthesizer.Speak speak = (SpeechSynthesizer.Speak) instruction.getPayload();
        String str = speak.getUrl().isPresent() ? speak.getUrl().get() : null;
        if (!this.b.b().getBoolean(AivsConfig.Tts.ENABLE_INTERNAL_PLAYER, true) && !TextUtils.isEmpty(str)) {
            Logger.a("InstructionManager", "startAudioPlayer: client play tts, url mode");
            return;
        }
        Optional<String> dialogId = instruction.getDialogId();
        if (dialogId == null) {
            Logger.d("InstructionManager", "startAudioPlayer: dialogId is null," + instruction);
            return;
        }
        if (dialogId.isPresent()) {
            String str2 = dialogId.get();
            if (this.b.e().a(str2)) {
                int iIntValue = speak.getSampleRate().isPresent() ? speak.getSampleRate().get().intValue() : 16000;
                if (str == null) {
                    com.xiaomi.ai.android.impl.a aVar = this.c;
                    if (aVar != null && iIntValue == aVar.a()) {
                        this.c.a(iIntValue, str2);
                        this.c.b();
                        return;
                    } else {
                        com.xiaomi.ai.android.impl.a aVar2 = new com.xiaomi.ai.android.impl.a(this.b, iIntValue, str2);
                        this.c = aVar2;
                        aVar2.b();
                        return;
                    }
                }
                if (this.b.b().getBoolean(AivsConfig.Tts.ENABLE_INTERNAL_PLAYER, true)) {
                    if (this.c == null) {
                        this.c = new com.xiaomi.ai.android.impl.a(this.b, iIntValue, str2);
                    }
                    if (this.c.a(str) && this.c.d()) {
                        return;
                    }
                    this.c.c();
                    Logger.d("InstructionManager", "startAudioPlayer: failed to start url player, " + str);
                }
            }
        }
    }

    public void a() {
        synchronized (this) {
            com.xiaomi.ai.android.impl.a aVar = this.c;
            if (aVar != null) {
                aVar.e();
                this.c = null;
            }
        }
    }

    public void a(Instruction instruction) {
        if (Logger.getLogLevel() == 3) {
            Logger.a("InstructionManager", "handleInstruction: " + instruction);
        } else if (AIApiConstants.System.Exception.equals(instruction.getFullName())) {
            Logger.b("InstructionManager", "handleInstruction: " + instruction);
        } else {
            Logger.b("InstructionManager", "handleInstruction:" + instruction.getFullName() + "," + (instruction.getDialogId().isPresent() ? instruction.getDialogId().get() : ""));
        }
        if (this.b.b().getBoolean(AivsConfig.Connection.ENABLE_INSTRUCTION_ACK, true)) {
            c(instruction);
        }
        this.b.j().a(instruction);
        if (!this.b.e().a(instruction)) {
            Logger.c("InstructionManager", "handleInstruction: discard " + instruction);
            return;
        }
        synchronized (this) {
            d(instruction);
        }
        if (AIApiConstants.System.Heartbeat.equals(instruction.getFullName())) {
            Logger.b("InstructionManager", instruction.getFullName() + "," + (instruction.getDialogId().isPresent() ? instruction.getDialogId().get() : "") + " no need pass to client");
            return;
        }
        InstructionCapability instructionCapability = (InstructionCapability) this.b.a(InstructionCapability.class);
        if (instructionCapability == null || !instructionCapability.process(instruction)) {
            if (Logger.getLogLevel() == 3) {
                Logger.d("InstructionManager", "handleInstruction: failed to handle " + instruction.toString());
                return;
            }
            Logger.d("InstructionManager", "handleInstruction: failed to handle " + instruction.getFullName() + "," + (instruction.getDialogId().isPresent() ? instruction.getDialogId().get() : ""));
        }
    }

    public void a(byte[] bArr) {
        this.b.j().e();
        synchronized (this) {
            com.xiaomi.ai.android.impl.a aVar = this.c;
            if (aVar != null) {
                aVar.a(bArr, false);
            }
        }
    }

    public void b() {
        synchronized (this) {
            com.xiaomi.ai.android.impl.a aVar = this.c;
            if (aVar != null) {
                aVar.c();
            }
        }
    }

    public void b(Instruction instruction) {
        if (Logger.getLogLevel() == 3) {
            Logger.a("InstructionManager", "handleSpeakInstruction: " + instruction);
        } else {
            Logger.b("InstructionManager", "handleSpeakInstruction:" + instruction.getFullName() + "," + (instruction.getDialogId().isPresent() ? instruction.getDialogId().get() : ""));
        }
        if (this.b.e().a(instruction)) {
            synchronized (this) {
                e(instruction);
            }
        } else {
            Logger.c("InstructionManager", "handleSpeakInstruction: discard " + instruction);
        }
    }
}
