package com.xiaomi.hm.health.bt.profile.earbud.model;

import com.tekartik.sqflite.Constant;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/earbud/model/MusicControlCmd;", "", "", Constant.h, "B", "getCmd", "()B", "setCmd", "(B)V", "<init>", "(Ljava/lang/String;IB)V", "PLAY", "PAUSE", "PRE_MUSIC", "NEXT_MUSIC", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public enum MusicControlCmd {
    PLAY((byte) 0),
    PAUSE((byte) 1),
    PRE_MUSIC((byte) 4),
    NEXT_MUSIC((byte) 3);

    private byte cmd;

    MusicControlCmd(byte b) {
        this.cmd = b;
    }

    public final byte getCmd() {
        return this.cmd;
    }

    public final void setCmd(byte b) {
        this.cmd = b;
    }
}
