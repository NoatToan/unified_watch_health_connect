package com.xiaomi.hm.health.bt.profile.sport;

/* JADX INFO: loaded from: classes18.dex */
public enum SportCommand {
    CONFIG((byte) 1),
    START((byte) 2),
    PAUSE((byte) 3),
    RESUME((byte) 4),
    STOP((byte) 5),
    SHOW((byte) 6),
    NOTIFY((byte) 7),
    HEART((byte) 8);

    private byte cmd;

    SportCommand(byte cmd) {
        this.cmd = (byte) 1;
        this.cmd = cmd;
    }

    public static SportCommand fromValue(byte value) {
        for (SportCommand sportCommand : values()) {
            if (sportCommand.getCommand() == value) {
                return sportCommand;
            }
        }
        return null;
    }

    public byte getCommand() {
        return this.cmd;
    }
}
