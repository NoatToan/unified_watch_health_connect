package com.xiaomi.hm.health.training.media.audio.player;

import android.content.Context;
import android.media.MediaPlayer;
import com.xiaomi.hm.health.training.media.audio.model.AudioRes;
import com.xiaomi.hm.health.training.media.audio.model.IAudioPlayerObserver;
import com.xiaomi.hm.health.training.media.audio.model.IPlayerListener;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public class TrainingAudioPlayer {
    private final IPlayerListener a;
    private AudioPlayerTask b;
    private ArrayList<AudioRes> c;
    private ArrayList<MediaPlayer> d;
    private ArrayList<IAudioPlayerObserver> e;
    private boolean f;

    public final class a implements IPlayerListener {
        private a() {
        }

        @Override // com.xiaomi.hm.health.training.media.audio.model.IPlayerListener
        public void onComplete(AudioRes audioRes) {
            TrainingAudioPlayer.this.c.remove(audioRes);
            TrainingAudioPlayer.this.playNext();
        }

        @Override // com.xiaomi.hm.health.training.media.audio.model.IPlayerListener
        public void onError(AudioRes audioRes) {
            TrainingAudioPlayer.this.c.remove(audioRes);
            TrainingAudioPlayer.this.playNext();
        }

        @Override // com.xiaomi.hm.health.training.media.audio.model.IPlayerListener
        public void onPrepared(AudioRes audioRes, MediaPlayer mediaPlayer) {
            if (mediaPlayer == null) {
                TrainingAudioPlayer.this.c.remove(audioRes);
                TrainingAudioPlayer.this.playNext();
            }
            TrainingAudioPlayer.this.d.add(mediaPlayer);
        }
    }

    public TrainingAudioPlayer(Context context) {
        a aVar = new a();
        this.a = aVar;
        this.b = null;
        this.f = false;
        this.c = new ArrayList<>();
        this.d = new ArrayList<>();
        this.e = new ArrayList<>();
        this.b = new AudioPlayerTask(context, aVar);
    }

    public boolean addObserver(IAudioPlayerObserver iAudioPlayerObserver) {
        if (iAudioPlayerObserver == null) {
            throw new IllegalArgumentException();
        }
        if (this.e.contains(iAudioPlayerObserver)) {
            return false;
        }
        this.e.add(iAudioPlayerObserver);
        return true;
    }

    public void clear() {
        this.f = true;
        this.e.clear();
        this.b.quitPlayer();
        for (int i = 0; i < this.d.size(); i++) {
            try {
                MediaPlayer mediaPlayer = this.d.get(i);
                mediaPlayer.stop();
                mediaPlayer.release();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isPlaying() {
        ArrayList<AudioRes> arrayList = this.c;
        return arrayList != null && arrayList.size() > 0;
    }

    public void observersDo() {
        Iterator<IAudioPlayerObserver> it2 = this.e.iterator();
        while (it2.hasNext()) {
            it2.next().onEnd();
        }
    }

    public void pause() {
        this.f = true;
    }

    public void playAudioRes(ArrayList<AudioRes> arrayList, boolean z) {
        this.f = z;
        this.c = arrayList;
        if (arrayList == null || arrayList.size() <= 0) {
            observersDo();
        } else {
            if (z) {
                return;
            }
            this.b.startPlayer(this.c.get(0));
        }
    }

    public void playNext() {
        ArrayList<AudioRes> arrayList = this.c;
        if (arrayList != null && arrayList.size() == 0) {
            observersDo();
            return;
        }
        Iterator<AudioRes> it2 = this.c.iterator();
        if (!it2.hasNext()) {
            observersDo();
        } else {
            if (this.f) {
                return;
            }
            this.b.startPlayer(it2.next());
        }
    }

    public void resume() {
        this.f = false;
        ArrayList<AudioRes> arrayList = this.c;
        if (arrayList == null || arrayList.size() <= 0) {
            observersDo();
        } else {
            this.b.startPlayer(this.c.get(0));
        }
    }

    public void setPaused(boolean z) {
        this.f = z;
    }
}
