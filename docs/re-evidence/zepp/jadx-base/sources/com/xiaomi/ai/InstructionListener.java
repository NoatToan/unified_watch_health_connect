package com.xiaomi.ai;

import com.xiaomi.ai.api.common.Instruction;

/* JADX INFO: loaded from: classes18.dex */
public interface InstructionListener {
    void onInstruction(Instruction[] instructionArr, SpeechResult speechResult);
}
