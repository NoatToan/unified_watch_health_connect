package com.xiaomi.ai.android.core;

import android.text.TextUtils;
import com.xiaomi.ai.android.capability.InstructionCapability;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.Common;
import com.xiaomi.ai.api.SpeechSynthesizer;
import com.xiaomi.ai.api.Sys;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.common.Optional;
import defpackage.dcd;
import defpackage.gt3;
import defpackage.wpe;
import defpackage.zsd;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f10893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f10894b;
    private com.xiaomi.ai.android.impl.a c;
    private String d;

    public g(e eVar) {
        this.f10894b = eVar;
        this.f10893a = eVar.i().e("asr.vad_type") == 1;
        this.c = new com.xiaomi.ai.android.impl.a(this.f10894b);
    }

    private void a() {
        com.xiaomi.ai.android.impl.a aVar = this.c;
        if (aVar != null) {
            aVar.a((byte[]) null, true);
        }
    }

    private void c() {
        if (this.f10894b.i().e("connection.keep_alive_type") != 2 || this.f10894b.s().b() > 0) {
            return;
        }
        wpe.h("InstructionManager", "processFinish: stop Channel because of DO_NOT_KEEP_ALIVE");
        gt3 gt3VarE = this.f10894b.e();
        if (gt3VarE != null) {
            gt3VarE.stop();
        }
    }

    private void e(Instruction instruction) {
        String fullName = instruction.getFullName();
        fullName.hashCode();
        if (fullName.equals(AIApiConstants.Dialog.Finish)) {
            c();
        }
    }

    public void b() {
        synchronized (this) {
            try {
                com.xiaomi.ai.android.impl.a aVar = this.c;
                if (aVar != null) {
                    aVar.g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d() {
        synchronized (this) {
            try {
                com.xiaomi.ai.android.impl.a aVar = this.c;
                if (aVar != null) {
                    aVar.m();
                    this.c = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0086  */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private void b(Instruction instruction) {
        Sys.Ack ack;
        String str;
        String id;
        if (this.f10893a && AIApiConstants.SpeechRecognizer.StopCapture.equals(instruction.getFullName())) {
            return;
        }
        if (!instruction.getDialogId().c()) {
            wpe.h("InstructionManager", "processACK dialog is null");
            return;
        }
        String strB = instruction.getDialogId().b();
        if (AIApiConstants.System.Ping.equals(instruction.getFullName())) {
            ack = new Sys.Ack();
            Sys.Ping ping = (Sys.Ping) instruction.getPayload();
            ack.setType(ping.getType());
            id = ping.getId();
        } else {
            if (!AIApiConstants.General.Push.equals(instruction.getFullName())) {
                if (AIApiConstants.Dialog.Finish.equals(instruction.getFullName())) {
                    ack = new Sys.Ack();
                    str = "Instruction";
                } else {
                    ack = null;
                }
                if (ack != null) {
                    this.f10894b.postEvent(APIUtils.buildEvent(ack, null, strB));
                }
            }
            ack = new Sys.Ack();
            str = "Push";
            ack.setType(str);
            id = instruction.getId();
        }
        ack.setId(id);
        if (ack != null) {
            this.f10894b.postEvent(APIUtils.buildEvent(ack, null, strB));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c(Instruction instruction) {
        SpeechSynthesizer.Speak speak = (SpeechSynthesizer.Speak) instruction.getPayload();
        String strB = null;
        String strB2 = speak.getUrl().c() ? speak.getUrl().b() : null;
        if (!this.f10894b.i().c("tts.enable_internal_player", true) && !TextUtils.isEmpty(strB2)) {
            wpe.b("InstructionManager", "startAudioPlayer: client play tts, url mode");
            return;
        }
        Optional<String> dialogId = instruction.getDialogId();
        if (dialogId == null) {
            wpe.e("InstructionManager", "startAudioPlayer: dialogId is null," + instruction);
            return;
        }
        if (dialogId.c()) {
            String strB3 = dialogId.b();
            Optional<String> transactionId = instruction.getHeader().getTransactionId();
            if (transactionId != null && transactionId.c()) {
                strB = transactionId.b();
            }
            if (this.f10894b.m().a(strB3) || this.f10894b.m().a(strB)) {
                int iIntValue = speak.getSampleRate().c() ? speak.getSampleRate().b().intValue() : 16000;
                if (strB2 == null) {
                    Common.TTSCodec tTSCodecB = Common.TTSCodec.OPUS;
                    if (speak.getCodec().c()) {
                        tTSCodecB = speak.getCodec().b();
                    }
                    com.xiaomi.ai.android.impl.a aVar = this.c;
                    if (aVar == null || iIntValue != aVar.b()) {
                        this.c = new com.xiaomi.ai.android.impl.a(this.f10894b, iIntValue, strB3, tTSCodecB);
                    } else {
                        this.c.a(iIntValue, strB3, tTSCodecB);
                    }
                    this.c.i();
                    return;
                }
                if (this.f10894b.i().c("tts.enable_internal_player", true)) {
                    if (this.c == null) {
                        this.c = new com.xiaomi.ai.android.impl.a(this.f10894b, iIntValue, strB3);
                    }
                    if (this.c.a(strB2) && this.c.h()) {
                        return;
                    }
                    this.c.g();
                    wpe.e("InstructionManager", "startAudioPlayer: failed to start url player, " + strB2);
                }
            }
        }
    }

    private void d(Instruction instruction) {
        String fullName = instruction.getFullName();
        fullName.hashCode();
        if (fullName.equals(AIApiConstants.SpeechSynthesizer.Speak)) {
            c(instruction);
        } else if (fullName.equals(AIApiConstants.SpeechSynthesizer.FinishSpeakStream)) {
            a();
        }
    }

    public void a(dcd dcdVar) {
        StringBuilder sb;
        String str;
        StringBuilder sb2;
        Instruction<?> instructionA = dcdVar.a();
        String strB = instructionA.getDialogId().c() ? instructionA.getDialogId().b() : "";
        if (wpe.l() == 3) {
            wpe.b("InstructionManager", "handleInstruction: " + instructionA);
        } else {
            if (AIApiConstants.System.Exception.equals(instructionA.getFullName()) || AIApiConstants.System.Abort.equals(instructionA.getFullName())) {
                sb = new StringBuilder();
                sb.append("handleInstruction: ");
                sb.append(instructionA);
            } else {
                sb = new StringBuilder();
                sb.append("handleInstruction:");
                sb.append(instructionA.getFullName());
                sb.append(",");
                sb.append(strB);
            }
            wpe.h("InstructionManager", sb.toString());
        }
        if (this.f10894b.i().c("connection.enable_instruction_ack", true)) {
            b(instructionA);
        }
        this.f10894b.r().d(instructionA);
        if (!this.f10894b.m().a(instructionA)) {
            if (wpe.l() == 3) {
                sb2 = new StringBuilder();
                sb2.append("handleInstruction: discard ");
                sb2.append(instructionA.toString());
            } else {
                sb2 = new StringBuilder();
                sb2.append("handleInstruction: discard ");
                sb2.append(instructionA.getFullName());
                sb2.append(",");
                sb2.append(strB);
            }
            wpe.k("InstructionManager", sb2.toString());
            return;
        }
        synchronized (this) {
            e(instructionA);
        }
        if (AIApiConstants.System.Heartbeat.equals(instructionA.getFullName())) {
            wpe.h("InstructionManager", instructionA.getFullName() + "," + strB + " no need pass to client");
            return;
        }
        if (AIApiConstants.SpeechSynthesizer.Speak.equals(instructionA.getFullName())) {
            this.d = strB;
        } else if (AIApiConstants.SpeechSynthesizer.FinishSpeakStream.equals(instructionA.getFullName())) {
            this.d = null;
        }
        InstructionCapability instructionCapability = (InstructionCapability) this.f10894b.a(InstructionCapability.class);
        if (this.f10894b.i().b("enable.wrapper")) {
            if (instructionCapability != null && instructionCapability.process(dcdVar)) {
                this.f10894b.r().e(instructionA);
                return;
            }
        } else if (!(instructionA.getPayload() instanceof zsd) && instructionCapability != null && instructionCapability.process(instructionA)) {
            this.f10894b.r().e(instructionA);
            return;
        }
        if (wpe.l() == 3) {
            str = "handleInstruction: failed to handle " + dcdVar.b();
        } else {
            str = "handleInstruction: failed to handle " + instructionA.getFullName() + "," + strB;
        }
        wpe.e("InstructionManager", str);
    }

    public void a(Instruction instruction) {
        if (wpe.l() == 3) {
            wpe.b("InstructionManager", "handleSpeakInstruction: " + instruction);
        } else {
            wpe.h("InstructionManager", "handleSpeakInstruction:" + instruction.getFullName() + "," + (instruction.getDialogId().c() ? instruction.getDialogId().b() : ""));
        }
        if (this.f10894b.m().a(instruction)) {
            synchronized (this) {
                d(instruction);
            }
            return;
        }
        if (wpe.l() == 3) {
            wpe.b("InstructionManager", "handleSpeakInstruction: discard " + instruction.toString());
            return;
        }
        wpe.k("InstructionManager", "handleSpeakInstruction: discard " + instruction.getFullName() + "," + (instruction.getDialogId().c() ? instruction.getDialogId().b() : ""));
    }

    public void b(byte[] bArr) {
        this.f10894b.r().i();
        synchronized (this) {
            try {
                com.xiaomi.ai.android.impl.a aVar = this.c;
                if (aVar != null) {
                    aVar.a(bArr, false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(byte[] bArr) {
        InstructionCapability instructionCapability = (InstructionCapability) this.f10894b.a(InstructionCapability.class);
        if (instructionCapability != null) {
            instructionCapability.processBinary(bArr, this.d);
        }
    }
}
