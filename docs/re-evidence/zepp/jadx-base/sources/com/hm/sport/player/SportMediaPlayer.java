package com.hm.sport.player;

import android.content.Context;
import android.media.MediaPlayer;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class SportMediaPlayer {
    private static final String h = "SportMediaPlayer";
    private final com.hm.sport.player.a a;
    private f b;
    private ConcurrentHashMap<PlayCommand.CommandId, PlayCommand> c;
    private ConcurrentHashMap<PlayCommand.CommandId, MediaPlayer> d;
    private List<IPlayObserver> e;
    private PlayCommand.CommandId f;
    private boolean g;

    public final class b implements com.hm.sport.player.a {
        private b() {
        }

        @Override // com.hm.sport.player.a
        public void a(PlayCommand.CommandId commandId, MediaPlayer mediaPlayer) {
            Log.i(SportMediaPlayer.h, "onPrepared curCmd:" + commandId + ",player:" + mediaPlayer);
            if (mediaPlayer == null) {
                SportMediaPlayer.this.k(commandId);
                SportMediaPlayer.this.j();
                return;
            }
            SportMediaPlayer.this.f = commandId;
            SportMediaPlayer.this.d.put(commandId, mediaPlayer);
            Iterator it2 = SportMediaPlayer.this.e.iterator();
            while (it2.hasNext()) {
                ((IPlayObserver) it2.next()).onPrepared(commandId);
            }
        }

        @Override // com.hm.sport.player.a
        public void onCompletion(PlayCommand.CommandId commandId) {
            Log.i(SportMediaPlayer.h, "onCompletion curCmd:" + commandId);
            SportMediaPlayer.this.f = null;
            SportMediaPlayer.this.k(commandId);
            SportMediaPlayer.this.j();
            Iterator it2 = SportMediaPlayer.this.e.iterator();
            while (it2.hasNext()) {
                ((IPlayObserver) it2.next()).onCompletion(commandId);
            }
        }

        @Override // com.hm.sport.player.a
        public boolean onError(int i, PlayCommand.CommandId commandId) {
            Log.i(SportMediaPlayer.h, "onError curCmd:" + commandId);
            SportMediaPlayer.this.f = null;
            SportMediaPlayer.this.k(commandId);
            SportMediaPlayer.this.j();
            Iterator it2 = SportMediaPlayer.this.e.iterator();
            while (it2.hasNext()) {
                ((IPlayObserver) it2.next()).onError(i, commandId);
            }
            return true;
        }
    }

    public SportMediaPlayer(Context context) {
        b bVar = new b();
        this.a = bVar;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = false;
        this.c = new ConcurrentHashMap<>();
        this.d = new ConcurrentHashMap<>();
        this.e = new ArrayList();
        this.b = new f(context, bVar);
    }

    private void f(List<PlayCommand.CommandId> list) {
        g(list);
        h(list);
    }

    private void g(List<PlayCommand.CommandId> list) {
        ConcurrentHashMap<PlayCommand.CommandId, PlayCommand> concurrentHashMap = this.c;
        if (concurrentHashMap == null || concurrentHashMap.size() == 0) {
            return;
        }
        for (PlayCommand.CommandId commandId : this.c.keySet()) {
            if (list == null || !list.contains(commandId)) {
                this.c.remove(commandId);
            }
        }
    }

    private void h(List<PlayCommand.CommandId> list) {
        ConcurrentHashMap<PlayCommand.CommandId, MediaPlayer> concurrentHashMap = this.d;
        if (concurrentHashMap == null || concurrentHashMap.size() == 0) {
            return;
        }
        for (Map.Entry<PlayCommand.CommandId, MediaPlayer> entry : this.d.entrySet()) {
            if (list == null || !list.contains(entry.getKey())) {
                MediaPlayer value = entry.getValue();
                if (value != null) {
                    try {
                        if (value.isPlaying()) {
                            value.stop();
                        }
                        value.release();
                    } catch (Exception e) {
                        Log.e(h, e.getMessage(), e);
                    }
                }
                this.d.remove(entry.getKey());
            } else {
                Log.i(h, "clearPlayers match excepted id:" + entry.getKey());
            }
        }
    }

    private void i(PlayCommand playCommand) {
        this.c.put(playCommand.getId(), playCommand);
        Log.i(h, "Execute delayed to play:" + playCommand.getId() + ",cachedSize = " + this.c.size());
        if (this.c.size() == 1 || this.g) {
            this.b.d(playCommand);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j() {
        if (this.c.size() <= 0) {
            return false;
        }
        Iterator<PlayCommand> it2 = this.c.values().iterator();
        if (!it2.hasNext()) {
            Log.i(h, "Delayed cachedMsgMap !hasNext");
            return false;
        }
        PlayCommand next = it2.next();
        if (next == null) {
            return true;
        }
        this.b.d(next);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(PlayCommand.CommandId commandId) {
        if (commandId != null) {
            this.c.remove(commandId);
            this.d.remove(commandId);
        }
    }

    public boolean addObserver(IPlayObserver iPlayObserver) {
        if (iPlayObserver == null) {
            throw new IllegalArgumentException();
        }
        if (this.e.contains(iPlayObserver)) {
            return false;
        }
        this.e.add(iPlayObserver);
        return true;
    }

    public void cancel() {
        cancel(true);
    }

    public void destroy() {
        destroy(null);
    }

    public void dumpCachedCommands() {
        ConcurrentHashMap<PlayCommand.CommandId, PlayCommand> concurrentHashMap = this.c;
        if (concurrentHashMap == null || concurrentHashMap.size() == 0) {
            return;
        }
        Iterator<PlayCommand.CommandId> it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            Log.i(h, "mCachedMsgMap commandId:" + it2.next().toString());
        }
    }

    public void dumpCachedPlayers() {
        ConcurrentHashMap<PlayCommand.CommandId, MediaPlayer> concurrentHashMap = this.d;
        if (concurrentHashMap == null || concurrentHashMap.size() == 0) {
            return;
        }
        for (Map.Entry<PlayCommand.CommandId, MediaPlayer> entry : this.d.entrySet()) {
            MediaPlayer value = entry.getValue();
            if (value != null) {
                Log.i(h, "mCachedPlayerMap player:" + value + ",commandId:" + entry.getKey().toString());
            }
        }
    }

    public void dumpPlayingCommand() {
        if (this.f != null) {
            Log.i(h, "Playing CommandId:" + this.f.toString());
        }
    }

    public boolean isPlaying() {
        ConcurrentHashMap<PlayCommand.CommandId, MediaPlayer> concurrentHashMap = this.d;
        return (concurrentHashMap == null || concurrentHashMap.size() == 0) ? false : true;
    }

    public boolean play(PlayCommand playCommand) {
        if (playCommand == null) {
            throw new IllegalArgumentException();
        }
        i(playCommand);
        this.g = false;
        return true;
    }

    public boolean removeObserver(IPlayObserver iPlayObserver) {
        if (iPlayObserver == null) {
            throw new IllegalArgumentException();
        }
        if (!this.e.contains(iPlayObserver)) {
            return false;
        }
        this.e.remove(iPlayObserver);
        return true;
    }

    public void cancel(boolean z) {
        Log.i(h, "cancel command:" + this.f);
        this.g = true;
        PlayCommand.CommandId commandId = this.f;
        if (commandId != null) {
            MediaPlayer mediaPlayer = this.d.get(commandId);
            Log.i(h, "cancel player:" + mediaPlayer);
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
            k(this.f);
        }
        if (z) {
            f(null);
        }
    }

    public void destroy(List<PlayCommand.CommandId> list) {
        this.e.clear();
        f(list);
        this.b.b(true);
        Log.i(h, "destroy");
    }

    public boolean play() {
        this.g = false;
        j();
        return true;
    }

    public boolean play(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return true;
    }
}
