package com.huami.musiccontrol.bean;

import kotlin.Metadata;
import org.cybergarage.upnp.std.av.renderer.AVTransport;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/huami/musiccontrol/bean/MusicState;", "", "<init>", "(Ljava/lang/String;I)V", "STOPPED", "PAUSED", AVTransport.PLAYING, "BUFFERING", "NOTIFICATION_DISABLE", "DISABLE", "music_control_release"}, k = 1, mv = {1, 4, 1})
public enum MusicState {
    STOPPED,
    PAUSED,
    PLAYING,
    BUFFERING,
    NOTIFICATION_DISABLE,
    DISABLE
}
