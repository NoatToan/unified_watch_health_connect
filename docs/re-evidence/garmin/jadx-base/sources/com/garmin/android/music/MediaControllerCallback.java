package com.garmin.android.music;

import android.content.ContentResolver;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import androidx.core.view.j;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import o13.l;
import o13.m;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\t2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\t2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010)R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u00103\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/garmin/android/music/MediaControllerCallback;", "Landroid/media/session/MediaController$Callback;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroid/media/session/MediaController;", "activeMediaController", "Landroid/content/ContentResolver;", "contentResolver", "<init>", "(Ljava/util/concurrent/atomic/AtomicReference;Landroid/content/ContentResolver;)V", "", "onSessionDestroyed", "()V", "", "event", "Landroid/os/Bundle;", "extras", "onSessionEvent", "(Ljava/lang/String;Landroid/os/Bundle;)V", "Landroid/media/session/PlaybackState;", RemoteConfigConstants.ResponseFieldKey.STATE, "onPlaybackStateChanged", "(Landroid/media/session/PlaybackState;)V", "Landroid/media/MediaMetadata;", TtmlNode.TAG_METADATA, "onMetadataChanged", "(Landroid/media/MediaMetadata;)V", "", "Landroid/media/session/MediaSession$QueueItem;", "queue", "onQueueChanged", "(Ljava/util/List;)V", "", "title", "onQueueTitleChanged", "(Ljava/lang/CharSequence;)V", "onExtrasChanged", "(Landroid/os/Bundle;)V", "Landroid/media/session/MediaController$PlaybackInfo;", "info", "onAudioInfoChanged", "(Landroid/media/session/MediaController$PlaybackInfo;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroid/content/ContentResolver;", "Lorg/slf4j/Logger;", "logger$delegate", "Lo13/l;", "getLogger", "()Lorg/slf4j/Logger;", "logger", "getPackageName", "()Ljava/lang/String;", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MediaControllerCallback extends MediaController.Callback {
    private final AtomicReference<MediaController> activeMediaController;
    private final ContentResolver contentResolver;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final l logger;

    public MediaControllerCallback(AtomicReference<MediaController> atomicReference, ContentResolver contentResolver) {
        atomicReference.getClass();
        this.activeMediaController = atomicReference;
        this.contentResolver = contentResolver;
        this.logger = m.b(MediaControllerCallback$logger$2.INSTANCE);
    }

    private final Logger getLogger() {
        return (Logger) this.logger.getValue();
    }

    private final String getPackageName() {
        MediaController mediaController = this.activeMediaController.get();
        if (mediaController == null) {
            return "unknown package name";
        }
        String packageName = mediaController.getPackageName();
        packageName.getClass();
        return packageName;
    }

    @Override // android.media.session.MediaController.Callback
    public void onAudioInfoChanged(MediaController.PlaybackInfo info) {
        info.getClass();
        super.onAudioInfoChanged(info);
        try {
            Logger logger = getLogger();
            String packageName = getPackageName();
            String string = info.toString();
            if (string == null) {
                string = "";
            }
            logger.debug("onAudioInfoChanged -> [" + packageName + "]: " + string);
            MusicManager.getInstance().setCurrentAndMaxVolume(info.getCurrentVolume(), info.getMaxVolume());
        } catch (Throwable th3) {
            getLogger().error("onAudioInfoChanged", th3);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public void onExtrasChanged(Bundle extras) {
        super.onExtrasChanged(extras);
        com.airbnb.lottie.animation.keyframe.a.u("onExtrasChanged -> [", getPackageName(), "]", getLogger());
    }

    @Override // android.media.session.MediaController.Callback
    public void onMetadataChanged(MediaMetadata metadata) {
        super.onMetadataChanged(metadata);
        try {
            getLogger().debug("onMetadataChanged -> [" + getPackageName() + "]");
            MusicManager.getInstance().setMetadata(metadata, this.contentResolver);
        } catch (Throwable th3) {
            getLogger().error("onMetadataChanged", th3);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public void onPlaybackStateChanged(PlaybackState state) {
        String string;
        super.onPlaybackStateChanged(state);
        try {
            Logger logger = getLogger();
            String packageName = getPackageName();
            if (state == null || (string = state.toString()) == null) {
                string = "'null'";
            }
            logger.debug("onPlaybackStateChanged -> [" + packageName + "]: " + string);
            MusicManager.getInstance().setPlaybackState(state);
        } catch (Throwable th3) {
            getLogger().error("onPlaybackStateChanged", th3);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public void onQueueChanged(List<MediaSession.QueueItem> queue) {
        super.onQueueChanged(queue);
        getLogger().debug("onQueueChanged -> [" + getPackageName() + "]: queue " + (queue != null ? j.f(queue.size(), " items") : "'null'"));
    }

    @Override // android.media.session.MediaController.Callback
    public void onQueueTitleChanged(CharSequence title) {
        super.onQueueTitleChanged(title);
        Logger logger = getLogger();
        String packageName = getPackageName();
        if (title == null) {
            title = "'null'";
        }
        logger.debug("onQueueTitleChanged -> [" + packageName + "]: " + ((Object) title));
    }

    @Override // android.media.session.MediaController.Callback
    public void onSessionDestroyed() {
        super.onSessionDestroyed();
        try {
            MusicManager.getInstance().clear();
            getLogger().debug("onSessionDestroyed -> [" + getPackageName() + "]");
        } catch (Throwable th3) {
            getLogger().error("onSessionDestroyed", th3);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public void onSessionEvent(String event, Bundle extras) {
        event.getClass();
        super.onSessionEvent(event, extras);
        getLogger().debug("onSessionEvent -> [" + getPackageName() + "]: " + event);
    }
}
