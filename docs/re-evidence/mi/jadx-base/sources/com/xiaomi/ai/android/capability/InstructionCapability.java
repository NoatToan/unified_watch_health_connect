package com.xiaomi.ai.android.capability;

import com.xiaomi.ai.api.common.Instruction;
import defpackage.dcd;

/* JADX INFO: loaded from: classes6.dex */
public abstract class InstructionCapability implements Capability {
    public abstract boolean process(Instruction instruction);

    public boolean process(dcd dcdVar) {
        throw new AbstractMethodError("InstructionCapability.process wrapper is not implemented");
    }

    public boolean processBinary(byte[] bArr, String str) {
        throw new AbstractMethodError("InstructionCapability.processBinary is not implemented");
    }
}
