package com.garmin.android.music;

import am.j;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public enum MusicControlCommand {
    TOGGLE_PLAY_PAUSE(85, (byte) 0),
    SKIP_TO_NEXT_ITEM(87, (byte) 1),
    SKIP_TO_PREVIOUS_ITEM(88, (byte) 2),
    VOLUME_UP(24, (byte) 3),
    VOLUME_DOWN(25, (byte) 4),
    PLAY(126, (byte) 5),
    PAUSE(127, (byte) 6),
    SKIP_FORWARD(272, (byte) 7),
    SKIP_BACKWARDS(273, (byte) 8);


    /* JADX INFO: renamed from: id, reason: collision with root package name */
    final byte f50583id;
    final int keyCode;

    MusicControlCommand(int i14, byte b14) {
        this.keyCode = i14;
        this.f50583id = b14;
    }

    public static MusicControlCommand fromId(byte b14) {
        for (MusicControlCommand musicControlCommand : values()) {
            if (musicControlCommand.f50583id == b14) {
                return musicControlCommand;
            }
        }
        h.s(j.h(b14, "Unsupported ID: "));
        return null;
    }
}
