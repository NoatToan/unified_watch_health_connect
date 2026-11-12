package com.xiaomi.hm.health.bt.profile.sport;

/* JADX INFO: loaded from: classes11.dex */
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

    SportCommand(byte b2) {
        this.cmd = b2;
    }

    public static SportCommand fromValue(byte b2) {
        for (SportCommand sportCommand : values()) {
            if (sportCommand.getCommand() == b2) {
                return sportCommand;
            }
        }
        return null;
    }

    public byte getCommand() {
        return this.cmd;
    }
}
