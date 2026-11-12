package com.garmin.android.ancs;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ANCSCommandMessage extends ANCSMessageBase {
    protected static final int COMMAND_ID_LENGTH = 1;
    public final ANCSMessageBase.CommandID commandId;

    public ANCSCommandMessage(ANCSMessageBase.CommandID commandID) {
        this.commandId = commandID;
    }

    public abstract void dump();
}
