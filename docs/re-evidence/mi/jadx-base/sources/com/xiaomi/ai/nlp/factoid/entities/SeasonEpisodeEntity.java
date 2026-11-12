package com.xiaomi.ai.nlp.factoid.entities;

import defpackage.g2h;

/* JADX INFO: loaded from: classes7.dex */
public class SeasonEpisodeEntity extends g2h {
    public Type i;

    public enum Type {
        Season,
        Episode
    }

    public SeasonEpisodeEntity(int i, int i2, String str, double d) {
        super(i, i2, str, d, d, true, false);
        n("episode");
    }

    @Override // defpackage.yb8
    public String c() {
        return "<SeasonEpisode>";
    }

    public void p(Type type) {
        this.i = type;
        if (type == Type.Season) {
            n("season");
        }
    }
}
