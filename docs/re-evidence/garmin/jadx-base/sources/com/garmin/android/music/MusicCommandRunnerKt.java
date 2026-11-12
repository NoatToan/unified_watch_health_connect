package com.garmin.android.music;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.KeyEvent;
import com.google.android.exoplayer2.util.MimeTypes;
import o13.l;
import o13.m;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\r\u001a\u00020\n*\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\f\"\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"", "maxVolume", "getVolumeFactor", "(I)I", "Landroid/content/Context;", "Landroid/media/AudioManager;", "audioManager", "(Landroid/content/Context;)Landroid/media/AudioManager;", "Lcom/garmin/android/music/MusicControlCommand;", "command", "", "sendMediaKeyEvent", "(Landroid/content/Context;Lcom/garmin/android/music/MusicControlCommand;)V", "sendMediaBroadcast", "Lorg/slf4j/Logger;", "logger$delegate", "Lo13/l;", "getLogger", "()Lorg/slf4j/Logger;", "logger", "Landroid/util/SparseArray;", "", "PLAYBACK_STATE_NAMES", "Landroid/util/SparseArray;", "gncs-all-modules_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MusicCommandRunnerKt {
    private static final SparseArray<String> PLAYBACK_STATE_NAMES;
    private static final l logger$delegate = m.b(MusicCommandRunnerKt$logger$2.INSTANCE);

    static {
        SparseArray<String> sparseArray = new SparseArray<>(12);
        sparseArray.append(0, "NONE");
        sparseArray.append(1, "STOPPED");
        sparseArray.append(2, "PAUSED");
        sparseArray.append(3, "PLAYING");
        sparseArray.append(4, "FAST_FORWARDING");
        sparseArray.append(5, "REWINDING");
        sparseArray.append(6, "BUFFERING");
        sparseArray.append(7, "ERROR");
        sparseArray.append(8, "CONNECTING");
        sparseArray.append(9, "SKIPPING_TO_PREVIOUS");
        sparseArray.append(10, "SKIPPING_TO_NEXT");
        sparseArray.append(11, "SKIPPING_TO_QUEUE_ITEM");
        PLAYBACK_STATE_NAMES = sparseArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AudioManager audioManager(Context context) {
        Object systemService = context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (systemService instanceof AudioManager) {
            return (AudioManager) systemService;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Logger getLogger() {
        return (Logger) logger$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getVolumeFactor(int i14) {
        if (i14 == 0) {
            return 0;
        }
        int iMax = Math.max(1, (int) ((4.0d / ((double) 100)) * ((double) i14)));
        getLogger().debug("Volume increment factor: {}", Integer.valueOf(iMax));
        return iMax;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendMediaBroadcast(Context context, MusicControlCommand musicControlCommand) {
        ComponentName defaultMusicPlayer = MusicPlayerUtilKt.getDefaultMusicPlayer(context);
        if (defaultMusicPlayer == null) {
            getLogger().warn(musicControlCommand + " (media broadcast) -> cannot determine default music player");
            return;
        }
        if (musicControlCommand.keyCode == 0) {
            getLogger().warn(musicControlCommand + " (media broadcast) -> cannot determine key event");
            return;
        }
        getLogger().warn(musicControlCommand + " (media broadcast)");
        long jUptimeMillis = SystemClock.uptimeMillis();
        context.getApplicationContext().sendOrderedBroadcast(new Intent("android.intent.action.MEDIA_BUTTON").putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(jUptimeMillis, jUptimeMillis, 0, musicControlCommand.keyCode, 0)).setComponent(defaultMusicPlayer), null, null, null, -1, null, null);
        context.getApplicationContext().sendOrderedBroadcast(new Intent("android.intent.action.MEDIA_BUTTON").putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(jUptimeMillis, jUptimeMillis, 1, musicControlCommand.keyCode, 0)).setComponent(defaultMusicPlayer), null, null, null, -1, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendMediaKeyEvent(Context context, MusicControlCommand musicControlCommand) {
        AudioManager audioManager = audioManager(context);
        if (audioManager == null) {
            getLogger().warn(musicControlCommand + " -> no audio manager");
            return;
        }
        if (musicControlCommand.keyCode != 0) {
            getLogger().debug("{} (media key event)", musicControlCommand);
            audioManager.dispatchMediaKeyEvent(new KeyEvent(0, musicControlCommand.keyCode));
            audioManager.dispatchMediaKeyEvent(new KeyEvent(1, musicControlCommand.keyCode));
        } else {
            getLogger().error(musicControlCommand + " (media key event) -> cannot determine key event");
        }
    }
}
