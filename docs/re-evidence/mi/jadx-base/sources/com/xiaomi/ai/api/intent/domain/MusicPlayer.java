package com.xiaomi.ai.api.intent.domain;

import com.xiaomi.ai.api.intent.AIApiConstants;

/* JADX INFO: loaded from: classes7.dex */
public enum MusicPlayer {
    Unknown(-1, "Unknown"),
    QQ(0, AIApiConstants.QQ.NAME),
    Xiaomi(1, "Xiaomi"),
    Netease(2, "Netease"),
    Kuwo(3, "Kuwo"),
    Sogou(4, "Sogou"),
    Xiami(5, "Xiami"),
    Kugou(6, "Kugou");

    private int id;
    private String name;

    MusicPlayer(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public static MusicPlayer find(String str) {
        for (MusicPlayer musicPlayer : values()) {
            if (musicPlayer.name.equals(str)) {
                return musicPlayer;
            }
        }
        if (values().length > 0) {
            return values()[0];
        }
        return null;
    }

    public static MusicPlayer read(String str) {
        return find(str);
    }

    public static String write(MusicPlayer musicPlayer) {
        return musicPlayer.getName();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
