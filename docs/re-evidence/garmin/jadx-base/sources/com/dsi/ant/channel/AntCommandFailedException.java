package com.dsi.ant.channel;

import bk.i;
import ck.k;
import dk.a;
import wj.c;
import xj.b;

/* JADX INFO: loaded from: classes7.dex */
public class AntCommandFailedException extends Exception {
    private static final long serialVersionUID = -3831208250794408210L;
    private c mAntCommandFailureReason;
    private a mAntMessage;
    private k mAttemptedMessageType;

    public AntCommandFailedException(k kVar, b bVar) {
        super(getResultDetailMessage(bVar));
        this.mAntCommandFailureReason = c.UNKNOWN;
        this.mAntMessage = null;
        this.mAttemptedMessageType = kVar;
        if (bVar != null) {
            this.mAntCommandFailureReason = bVar.f191153c;
            this.mAntMessage = bVar.f191154d;
        }
    }

    private static String getResultDetailMessage(b bVar) {
        return bVar == null ? "Null result" : bVar.f191152b;
    }

    public a getAntMessage() {
        return this.mAntMessage;
    }

    public k getAttemptedMessageType() {
        return this.mAttemptedMessageType;
    }

    public c getFailureReason() {
        return this.mAntCommandFailureReason;
    }

    public i getResponseMessage() {
        if (c.CHANNEL_RESPONSE == this.mAntCommandFailureReason) {
            return new i(this.mAntMessage);
        }
        return null;
    }
}
