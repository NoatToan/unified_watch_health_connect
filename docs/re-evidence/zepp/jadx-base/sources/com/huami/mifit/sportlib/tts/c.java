package com.huami.mifit.sportlib.tts;

import android.content.Context;
import com.hm.sport.player.PlayCommand;
import com.hm.sport.player.SportMediaPlayer;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
class c extends b<List<String>> {
    private SportMediaPlayer n;

    public c(Context context) {
        super(context);
        this.n = new SportMediaPlayer(context);
    }

    @Override // com.huami.mifit.sportlib.tts.b
    public void a() {
        if (this.n.isPlaying()) {
            this.n.cancel();
        }
    }

    @Override // com.huami.mifit.sportlib.tts.b
    public void b() {
        this.n.cancel();
        this.n.destroy();
        this.a.destroy();
    }

    @Override // com.huami.mifit.sportlib.tts.b
    public boolean c() {
        return this.n.isPlaying();
    }

    @Override // com.huami.mifit.sportlib.tts.b
    public a<List<String>> d() {
        return new d();
    }

    @Override // com.huami.mifit.sportlib.tts.b
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void e(int i, List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.n.play(new PlayCommand(i, list));
    }
}
