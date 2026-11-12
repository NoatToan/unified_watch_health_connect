package android.support.v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.media.AudioAttributesCompat;
import defpackage.h63;
import defpackage.lkh;
import defpackage.lpq;
import defpackage.spi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class MediaControllerCompat {

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String COMMAND_ADD_QUEUE_ITEM = "android.support.v4.media.session.command.ADD_QUEUE_ITEM";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String COMMAND_ADD_QUEUE_ITEM_AT = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String COMMAND_ARGUMENT_INDEX = "android.support.v4.media.session.command.ARGUMENT_INDEX";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String COMMAND_ARGUMENT_MEDIA_DESCRIPTION = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String COMMAND_GET_EXTRA_BINDER = "android.support.v4.media.session.command.GET_EXTRA_BINDER";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String COMMAND_REMOVE_QUEUE_ITEM = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String COMMAND_REMOVE_QUEUE_ITEM_AT = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaControllerImpl f1303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaSessionCompat.Token f1304b;
    public final ConcurrentHashMap<Callback, Boolean> c = new ConcurrentHashMap<>();

    public static abstract class Callback implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaController.Callback f1305a = new MediaControllerCallbackApi21(this);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MessageHandler f1306b;
        public IMediaControllerCallback c;

        @RequiresApi(21)
        public static class MediaControllerCallbackApi21 extends MediaController.Callback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WeakReference<Callback> f1307a;

            public MediaControllerCallbackApi21(Callback callback) {
                this.f1307a = new WeakReference<>(callback);
            }

            @Override // android.media.session.MediaController.Callback
            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                Callback callback = this.f1307a.get();
                if (callback != null) {
                    callback.onAudioInfoChanged(new PlaybackInfo(playbackInfo.getPlaybackType(), AudioAttributesCompat.d(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.ensureClassLoader(bundle);
                Callback callback = this.f1307a.get();
                if (callback != null) {
                    callback.onExtrasChanged(bundle);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                Callback callback = this.f1307a.get();
                if (callback != null) {
                    callback.onMetadataChanged(MediaMetadataCompat.fromMediaMetadata(mediaMetadata));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onPlaybackStateChanged(PlaybackState playbackState) {
                Callback callback = this.f1307a.get();
                if (callback == null || callback.c != null) {
                    return;
                }
                callback.onPlaybackStateChanged(PlaybackStateCompat.fromPlaybackState(playbackState));
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueChanged(List<MediaSession.QueueItem> list) {
                Callback callback = this.f1307a.get();
                if (callback != null) {
                    callback.onQueueChanged(MediaSessionCompat.QueueItem.fromQueueItemList(list));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueTitleChanged(CharSequence charSequence) {
                Callback callback = this.f1307a.get();
                if (callback != null) {
                    callback.onQueueTitleChanged(charSequence);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionDestroyed() {
                Callback callback = this.f1307a.get();
                if (callback != null) {
                    callback.onSessionDestroyed();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.ensureClassLoader(bundle);
                Callback callback = this.f1307a.get();
                if (callback != null) {
                    callback.onSessionEvent(str, bundle);
                }
            }
        }

        public class MessageHandler extends Handler {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f1308a;

            public MessageHandler(Looper looper) {
                super(looper);
                this.f1308a = false;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (this.f1308a) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            MediaSessionCompat.ensureClassLoader(data);
                            Callback.this.onSessionEvent((String) message.obj, data);
                            break;
                        case 2:
                            Callback.this.onPlaybackStateChanged((PlaybackStateCompat) message.obj);
                            break;
                        case 3:
                            Callback.this.onMetadataChanged((MediaMetadataCompat) message.obj);
                            break;
                        case 4:
                            Callback.this.onAudioInfoChanged((PlaybackInfo) message.obj);
                            break;
                        case 5:
                            Callback.this.onQueueChanged((List) message.obj);
                            break;
                        case 6:
                            Callback.this.onQueueTitleChanged((CharSequence) message.obj);
                            break;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            MediaSessionCompat.ensureClassLoader(bundle);
                            Callback.this.onExtrasChanged(bundle);
                            break;
                        case 8:
                            Callback.this.onSessionDestroyed();
                            break;
                        case 9:
                            Callback.this.onRepeatModeChanged(((Integer) message.obj).intValue());
                            break;
                        case 11:
                            Callback.this.onCaptioningEnabledChanged(((Boolean) message.obj).booleanValue());
                            break;
                        case 12:
                            Callback.this.onShuffleModeChanged(((Integer) message.obj).intValue());
                            break;
                        case 13:
                            Callback.this.onSessionReady();
                            break;
                    }
                }
            }
        }

        public static class StubCompat extends IMediaControllerCallback.Stub {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WeakReference<Callback> f1310a;

            public StubCompat(Callback callback) {
                this.f1310a = new WeakReference<>(callback);
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onCaptioningEnabledChanged(boolean z) throws RemoteException {
                Callback callback = this.f1310a.get();
                if (callback != null) {
                    callback.a(11, Boolean.valueOf(z), null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onEvent(String str, Bundle bundle) throws RemoteException {
                Callback callback = this.f1310a.get();
                if (callback != null) {
                    callback.a(1, str, bundle);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onExtrasChanged(Bundle bundle) throws RemoteException {
                Callback callback = this.f1310a.get();
                if (callback != null) {
                    callback.a(7, bundle, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                Callback callback = this.f1310a.get();
                if (callback != null) {
                    callback.a(3, mediaMetadataCompat, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                Callback callback = this.f1310a.get();
                if (callback != null) {
                    callback.a(2, playbackStateCompat, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                Callback callback = this.f1310a.get();
                if (callback != null) {
                    callback.a(5, list, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onQueueTitleChanged(CharSequence charSequence) throws RemoteException {
                Callback callback = this.f1310a.get();
                if (callback != null) {
                    callback.a(6, charSequence, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onRepeatModeChanged(int i) throws RemoteException {
                Callback callback = this.f1310a.get();
                if (callback != null) {
                    callback.a(9, Integer.valueOf(i), null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onSessionDestroyed() throws RemoteException {
                Callback callback = this.f1310a.get();
                if (callback != null) {
                    callback.a(8, null, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onSessionReady() throws RemoteException {
                Callback callback = this.f1310a.get();
                if (callback != null) {
                    callback.a(13, null, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onShuffleModeChanged(int i) throws RemoteException {
                Callback callback = this.f1310a.get();
                if (callback != null) {
                    callback.a(12, Integer.valueOf(i), null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onShuffleModeChangedRemoved(boolean z) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                Callback callback = this.f1310a.get();
                if (callback != null) {
                    callback.a(4, parcelableVolumeInfo != null ? new PlaybackInfo(parcelableVolumeInfo.volumeType, parcelableVolumeInfo.audioStream, parcelableVolumeInfo.controlType, parcelableVolumeInfo.maxVolume, parcelableVolumeInfo.currentVolume) : null, null);
                }
            }
        }

        public void a(int i, Object obj, Bundle bundle) {
            MessageHandler messageHandler = this.f1306b;
            if (messageHandler != null) {
                Message messageObtainMessage = messageHandler.obtainMessage(i, obj);
                messageObtainMessage.setData(bundle);
                messageObtainMessage.sendToTarget();
            }
        }

        public void b(Handler handler) {
            if (handler != null) {
                MessageHandler messageHandler = new MessageHandler(handler.getLooper());
                this.f1306b = messageHandler;
                messageHandler.f1308a = true;
            } else {
                MessageHandler messageHandler2 = this.f1306b;
                if (messageHandler2 != null) {
                    messageHandler2.f1308a = false;
                    messageHandler2.removeCallbacksAndMessages(null);
                    this.f1306b = null;
                }
            }
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            a(8, null, null);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public IMediaControllerCallback getIControllerCallback() {
            return this.c;
        }

        public void onAudioInfoChanged(PlaybackInfo playbackInfo) {
        }

        public void onCaptioningEnabledChanged(boolean z) {
        }

        public void onExtrasChanged(Bundle bundle) {
        }

        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
        }

        public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) {
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
        }

        public void onRepeatModeChanged(int i) {
        }

        public void onSessionDestroyed() {
        }

        public void onSessionEvent(String str, Bundle bundle) {
        }

        public void onSessionReady() {
        }

        public void onShuffleModeChanged(int i) {
        }
    }

    public interface MediaControllerImpl {
        void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat);

        void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i);

        void adjustVolume(int i, int i2);

        boolean dispatchMediaButtonEvent(KeyEvent keyEvent);

        Bundle getExtras();

        long getFlags();

        Object getMediaController();

        MediaMetadataCompat getMetadata();

        String getPackageName();

        PlaybackInfo getPlaybackInfo();

        PlaybackStateCompat getPlaybackState();

        List<MediaSessionCompat.QueueItem> getQueue();

        CharSequence getQueueTitle();

        int getRatingType();

        int getRepeatMode();

        PendingIntent getSessionActivity();

        Bundle getSessionInfo();

        int getShuffleMode();

        TransportControls getTransportControls();

        boolean isCaptioningEnabled();

        boolean isSessionReady();

        void registerCallback(Callback callback, Handler handler);

        void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat);

        void sendCommand(String str, Bundle bundle, ResultReceiver resultReceiver);

        void setVolumeTo(int i, int i2);

        void unregisterCallback(Callback callback);
    }

    public static final class PlaybackInfo {
        public static final int PLAYBACK_TYPE_LOCAL = 1;
        public static final int PLAYBACK_TYPE_REMOTE = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AudioAttributesCompat f1317b;
        public final int c;
        public final int d;
        public final int e;

        public PlaybackInfo(int i, int i2, int i3, int i4, int i5) {
            this(i, new AudioAttributesCompat.a().b(i2).a(), i3, i4, i5);
        }

        public AudioAttributesCompat getAudioAttributes() {
            return this.f1317b;
        }

        @Deprecated
        public int getAudioStream() {
            return this.f1317b.a();
        }

        public int getCurrentVolume() {
            return this.e;
        }

        public int getMaxVolume() {
            return this.d;
        }

        public int getPlaybackType() {
            return this.f1316a;
        }

        public int getVolumeControl() {
            return this.c;
        }

        public PlaybackInfo(int i, AudioAttributesCompat audioAttributesCompat, int i2, int i3, int i4) {
            this.f1316a = i;
            this.f1317b = audioAttributesCompat;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    public static abstract class TransportControls {
        public static final String EXTRA_LEGACY_STREAM_TYPE = "android.media.session.extra.LEGACY_STREAM_TYPE";

        public abstract void fastForward();

        public abstract void pause();

        public abstract void play();

        public abstract void playFromMediaId(String str, Bundle bundle);

        public abstract void playFromSearch(String str, Bundle bundle);

        public abstract void playFromUri(Uri uri, Bundle bundle);

        public abstract void prepare();

        public abstract void prepareFromMediaId(String str, Bundle bundle);

        public abstract void prepareFromSearch(String str, Bundle bundle);

        public abstract void prepareFromUri(Uri uri, Bundle bundle);

        public abstract void rewind();

        public abstract void seekTo(long j);

        public abstract void sendCustomAction(PlaybackStateCompat.CustomAction customAction, Bundle bundle);

        public abstract void sendCustomAction(String str, Bundle bundle);

        public abstract void setCaptioningEnabled(boolean z);

        public void setPlaybackSpeed(float f) {
        }

        public abstract void setRating(RatingCompat ratingCompat);

        public abstract void setRating(RatingCompat ratingCompat, Bundle bundle);

        public abstract void setRepeatMode(int i);

        public abstract void setShuffleMode(int i);

        public abstract void skipToNext();

        public abstract void skipToPrevious();

        public abstract void skipToQueueItem(long j);

        public abstract void stop();
    }

    @RequiresApi(21)
    public static class TransportControlsApi21 extends TransportControls {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaController.TransportControls f1318a;

        public TransportControlsApi21(MediaController.TransportControls transportControls) {
            this.f1318a = transportControls;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void fastForward() {
            this.f1318a.fastForward();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void pause() {
            this.f1318a.pause();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void play() {
            this.f1318a.play();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void playFromMediaId(String str, Bundle bundle) {
            this.f1318a.playFromMediaId(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void playFromSearch(String str, Bundle bundle) {
            this.f1318a.playFromSearch(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void playFromUri(Uri uri, Bundle bundle) {
            this.f1318a.playFromUri(uri, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepare() {
            this.f1318a.prepare();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromMediaId(String str, Bundle bundle) {
            this.f1318a.prepareFromMediaId(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromSearch(String str, Bundle bundle) {
            this.f1318a.prepareFromSearch(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromUri(Uri uri, Bundle bundle) {
            this.f1318a.prepareFromUri(uri, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void rewind() {
            this.f1318a.rewind();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void seekTo(long j) {
            this.f1318a.seekTo(j);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void sendCustomAction(PlaybackStateCompat.CustomAction customAction, Bundle bundle) {
            MediaControllerCompat.a(customAction.getAction(), bundle);
            this.f1318a.sendCustomAction(customAction.getAction(), bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setCaptioningEnabled(boolean z) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(MediaSessionCompat.ACTION_ARGUMENT_CAPTIONING_ENABLED, z);
            sendCustomAction(MediaSessionCompat.ACTION_SET_CAPTIONING_ENABLED, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setPlaybackSpeed(float f) {
            if (f == 0.0f) {
                throw new IllegalArgumentException("speed must not be zero");
            }
            if (Build.VERSION.SDK_INT >= 29) {
                this.f1318a.setPlaybackSpeed(f);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat(MediaSessionCompat.ACTION_ARGUMENT_PLAYBACK_SPEED, f);
            sendCustomAction(MediaSessionCompat.ACTION_SET_PLAYBACK_SPEED, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setRating(RatingCompat ratingCompat) {
            this.f1318a.setRating(ratingCompat != null ? (Rating) ratingCompat.getRating() : null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setRepeatMode(int i) {
            Bundle bundle = new Bundle();
            bundle.putInt(MediaSessionCompat.ACTION_ARGUMENT_REPEAT_MODE, i);
            sendCustomAction(MediaSessionCompat.ACTION_SET_REPEAT_MODE, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setShuffleMode(int i) {
            Bundle bundle = new Bundle();
            bundle.putInt(MediaSessionCompat.ACTION_ARGUMENT_SHUFFLE_MODE, i);
            sendCustomAction(MediaSessionCompat.ACTION_SET_SHUFFLE_MODE, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void skipToNext() {
            this.f1318a.skipToNext();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void skipToPrevious() {
            this.f1318a.skipToPrevious();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void skipToQueueItem(long j) {
            this.f1318a.skipToQueueItem(j);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void stop() {
            this.f1318a.stop();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setRating(RatingCompat ratingCompat, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MediaSessionCompat.ACTION_ARGUMENT_RATING, ratingCompat);
            bundle2.putBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS, bundle);
            sendCustomAction(MediaSessionCompat.ACTION_SET_RATING, bundle2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void sendCustomAction(String str, Bundle bundle) {
            MediaControllerCompat.a(str, bundle);
            this.f1318a.sendCustomAction(str, bundle);
        }
    }

    public static class TransportControlsBase extends TransportControls {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public IMediaSession f1319a;

        public TransportControlsBase(IMediaSession iMediaSession) {
            this.f1319a = iMediaSession;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void fastForward() {
            try {
                this.f1319a.fastForward();
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void pause() {
            try {
                this.f1319a.pause();
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void play() {
            try {
                this.f1319a.play();
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void playFromMediaId(String str, Bundle bundle) {
            try {
                this.f1319a.playFromMediaId(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void playFromSearch(String str, Bundle bundle) {
            try {
                this.f1319a.playFromSearch(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void playFromUri(Uri uri, Bundle bundle) {
            try {
                this.f1319a.playFromUri(uri, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepare() {
            try {
                this.f1319a.prepare();
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromMediaId(String str, Bundle bundle) {
            try {
                this.f1319a.prepareFromMediaId(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromSearch(String str, Bundle bundle) {
            try {
                this.f1319a.prepareFromSearch(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromUri(Uri uri, Bundle bundle) {
            try {
                this.f1319a.prepareFromUri(uri, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void rewind() {
            try {
                this.f1319a.rewind();
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void seekTo(long j) {
            try {
                this.f1319a.seekTo(j);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void sendCustomAction(PlaybackStateCompat.CustomAction customAction, Bundle bundle) {
            sendCustomAction(customAction.getAction(), bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setCaptioningEnabled(boolean z) {
            try {
                this.f1319a.setCaptioningEnabled(z);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setPlaybackSpeed(float f) {
            if (f == 0.0f) {
                throw new IllegalArgumentException("speed must not be zero");
            }
            try {
                this.f1319a.setPlaybackSpeed(f);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setRating(RatingCompat ratingCompat) {
            try {
                this.f1319a.rate(ratingCompat);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setRepeatMode(int i) {
            try {
                this.f1319a.setRepeatMode(i);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setShuffleMode(int i) {
            try {
                this.f1319a.setShuffleMode(i);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void skipToNext() {
            try {
                this.f1319a.next();
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void skipToPrevious() {
            try {
                this.f1319a.previous();
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void skipToQueueItem(long j) {
            try {
                this.f1319a.skipToQueueItem(j);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void stop() {
            try {
                this.f1319a.stop();
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void sendCustomAction(String str, Bundle bundle) {
            MediaControllerCompat.a(str, bundle);
            try {
                this.f1319a.sendCustomAction(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setRating(RatingCompat ratingCompat, Bundle bundle) {
            try {
                this.f1319a.rateWithExtras(ratingCompat, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        if (mediaSessionCompat == null) {
            throw new IllegalArgumentException("session must not be null");
        }
        MediaSessionCompat.Token sessionToken = mediaSessionCompat.getSessionToken();
        this.f1304b = sessionToken;
        this.f1303a = new MediaControllerImplApi21(context, sessionToken);
    }

    public static void a(String str, Bundle bundle) {
        if (str == null) {
            return;
        }
        if (str.equals(MediaSessionCompat.ACTION_FOLLOW) || str.equals(MediaSessionCompat.ACTION_UNFOLLOW)) {
            if (bundle == null || !bundle.containsKey(MediaSessionCompat.ARGUMENT_MEDIA_ATTRIBUTE)) {
                throw new IllegalArgumentException("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action " + str + ".");
            }
        }
    }

    public static MediaControllerCompat getMediaController(Activity activity) {
        Object tag = activity.getWindow().getDecorView().getTag(spi.f33864a);
        if (tag instanceof MediaControllerCompat) {
            return (MediaControllerCompat) tag;
        }
        MediaController mediaController = activity.getMediaController();
        if (mediaController == null) {
            return null;
        }
        return new MediaControllerCompat(activity, MediaSessionCompat.Token.fromToken(mediaController.getSessionToken()));
    }

    public static void setMediaController(Activity activity, MediaControllerCompat mediaControllerCompat) {
        activity.getWindow().getDecorView().setTag(spi.f33864a, mediaControllerCompat);
        activity.setMediaController(mediaControllerCompat != null ? new MediaController(activity, (MediaSession.Token) mediaControllerCompat.getSessionToken().getToken()) : null);
    }

    public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        this.f1303a.addQueueItem(mediaDescriptionCompat);
    }

    public void adjustVolume(int i, int i2) {
        this.f1303a.adjustVolume(i, i2);
    }

    public boolean dispatchMediaButtonEvent(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f1303a.dispatchMediaButtonEvent(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    public Bundle getExtras() {
        return this.f1303a.getExtras();
    }

    public long getFlags() {
        return this.f1303a.getFlags();
    }

    public MediaMetadataCompat getMetadata() {
        return this.f1303a.getMetadata();
    }

    public String getPackageName() {
        return this.f1303a.getPackageName();
    }

    public PlaybackInfo getPlaybackInfo() {
        return this.f1303a.getPlaybackInfo();
    }

    public PlaybackStateCompat getPlaybackState() {
        return this.f1303a.getPlaybackState();
    }

    public List<MediaSessionCompat.QueueItem> getQueue() {
        return this.f1303a.getQueue();
    }

    public CharSequence getQueueTitle() {
        return this.f1303a.getQueueTitle();
    }

    public int getRatingType() {
        return this.f1303a.getRatingType();
    }

    public int getRepeatMode() {
        return this.f1303a.getRepeatMode();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public lpq getSession2Token() {
        return this.f1304b.getSession2Token();
    }

    public PendingIntent getSessionActivity() {
        return this.f1303a.getSessionActivity();
    }

    public Bundle getSessionInfo() {
        return this.f1303a.getSessionInfo();
    }

    public MediaSessionCompat.Token getSessionToken() {
        return this.f1304b;
    }

    public int getShuffleMode() {
        return this.f1303a.getShuffleMode();
    }

    public TransportControls getTransportControls() {
        return this.f1303a.getTransportControls();
    }

    public boolean isCaptioningEnabled() {
        return this.f1303a.isCaptioningEnabled();
    }

    public boolean isSessionReady() {
        return this.f1303a.isSessionReady();
    }

    public void registerCallback(Callback callback) {
        registerCallback(callback, null);
    }

    public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        this.f1303a.removeQueueItem(mediaDescriptionCompat);
    }

    @Deprecated
    public void removeQueueItemAt(int i) {
        MediaSessionCompat.QueueItem queueItem;
        List<MediaSessionCompat.QueueItem> queue = getQueue();
        if (queue == null || i < 0 || i >= queue.size() || (queueItem = queue.get(i)) == null) {
            return;
        }
        removeQueueItem(queueItem.getDescription());
    }

    public void sendCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("command must neither be null nor empty");
        }
        this.f1303a.sendCommand(str, bundle, resultReceiver);
    }

    public void setVolumeTo(int i, int i2) {
        this.f1303a.setVolumeTo(i, i2);
    }

    public void unregisterCallback(Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (this.c.remove(callback) == null) {
            return;
        }
        try {
            this.f1303a.unregisterCallback(callback);
        } finally {
            callback.b(null);
        }
    }

    public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        this.f1303a.addQueueItem(mediaDescriptionCompat, i);
    }

    public void registerCallback(Callback callback, Handler handler) {
        if (callback == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (this.c.putIfAbsent(callback, Boolean.TRUE) != null) {
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        callback.b(handler);
        this.f1303a.registerCallback(callback, handler);
    }

    public static class MediaControllerImplBase implements MediaControllerImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public IMediaSession f1314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TransportControls f1315b;
        public Bundle c;

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
            try {
                if ((this.f1314a.getFlags() & 4) == 0) {
                    throw new UnsupportedOperationException("This session doesn't support queue management operations");
                }
                this.f1314a.addQueueItem(mediaDescriptionCompat);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void adjustVolume(int i, int i2) {
            try {
                this.f1314a.adjustVolume(i, i2, null);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public boolean dispatchMediaButtonEvent(KeyEvent keyEvent) {
            if (keyEvent == null) {
                throw new IllegalArgumentException("event may not be null.");
            }
            try {
                this.f1314a.sendMediaButton(keyEvent);
                return false;
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public Bundle getExtras() {
            try {
                return this.f1314a.getExtras();
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public long getFlags() {
            try {
                return this.f1314a.getFlags();
            } catch (RemoteException unused) {
                return 0L;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public Object getMediaController() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public MediaMetadataCompat getMetadata() {
            try {
                return this.f1314a.getMetadata();
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public String getPackageName() {
            try {
                return this.f1314a.getPackageName();
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public PlaybackInfo getPlaybackInfo() {
            try {
                ParcelableVolumeInfo volumeAttributes = this.f1314a.getVolumeAttributes();
                return new PlaybackInfo(volumeAttributes.volumeType, volumeAttributes.audioStream, volumeAttributes.controlType, volumeAttributes.maxVolume, volumeAttributes.currentVolume);
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public PlaybackStateCompat getPlaybackState() {
            try {
                return this.f1314a.getPlaybackState();
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public List<MediaSessionCompat.QueueItem> getQueue() {
            try {
                return this.f1314a.getQueue();
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public CharSequence getQueueTitle() {
            try {
                return this.f1314a.getQueueTitle();
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public int getRatingType() {
            try {
                return this.f1314a.getRatingType();
            } catch (RemoteException unused) {
                return 0;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public int getRepeatMode() {
            try {
                return this.f1314a.getRepeatMode();
            } catch (RemoteException unused) {
                return -1;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public PendingIntent getSessionActivity() {
            try {
                return this.f1314a.getLaunchPendingIntent();
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public Bundle getSessionInfo() {
            try {
                this.c = this.f1314a.getSessionInfo();
            } catch (RemoteException unused) {
            }
            Bundle bundleUnparcelWithClassLoader = MediaSessionCompat.unparcelWithClassLoader(this.c);
            this.c = bundleUnparcelWithClassLoader;
            return bundleUnparcelWithClassLoader == null ? Bundle.EMPTY : new Bundle(this.c);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public int getShuffleMode() {
            try {
                return this.f1314a.getShuffleMode();
            } catch (RemoteException unused) {
                return -1;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public TransportControls getTransportControls() {
            if (this.f1315b == null) {
                this.f1315b = new TransportControlsBase(this.f1314a);
            }
            return this.f1315b;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public boolean isCaptioningEnabled() {
            try {
                return this.f1314a.isCaptioningEnabled();
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public boolean isSessionReady() {
            return true;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void registerCallback(Callback callback, Handler handler) {
            if (callback == null) {
                throw new IllegalArgumentException("callback may not be null.");
            }
            try {
                this.f1314a.asBinder().linkToDeath(callback, 0);
                this.f1314a.registerCallbackListener(callback.c);
                callback.a(13, null, null);
            } catch (RemoteException unused) {
                callback.a(8, null, null);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
            try {
                if ((this.f1314a.getFlags() & 4) == 0) {
                    throw new UnsupportedOperationException("This session doesn't support queue management operations");
                }
                this.f1314a.removeQueueItem(mediaDescriptionCompat);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void sendCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
            try {
                this.f1314a.sendCommand(str, bundle, resultReceiver == null ? null : new MediaSessionCompat.ResultReceiverWrapper(resultReceiver));
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void setVolumeTo(int i, int i2) {
            try {
                this.f1314a.setVolumeTo(i, i2, null);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void unregisterCallback(Callback callback) {
            if (callback == null) {
                throw new IllegalArgumentException("callback may not be null.");
            }
            try {
                this.f1314a.unregisterCallbackListener(callback.c);
                this.f1314a.asBinder().unlinkToDeath(callback, 0);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            try {
                if ((this.f1314a.getFlags() & 4) != 0) {
                    this.f1314a.addQueueItemAt(mediaDescriptionCompat, i);
                    return;
                }
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            } catch (RemoteException unused) {
            }
        }
    }

    @RequiresApi(21)
    public static class MediaControllerImplApi21 implements MediaControllerImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaController f1311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f1312b = new Object();

        @GuardedBy("mLock")
        public final List<Callback> c = new ArrayList();
        public HashMap<Callback, ExtraCallback> d = new HashMap<>();
        public Bundle e;
        public final MediaSessionCompat.Token f;

        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public WeakReference<MediaControllerImplApi21> f1313a;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f1313a = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.f1313a.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                synchronized (mediaControllerImplApi21.f1312b) {
                    mediaControllerImplApi21.f.setExtraBinder(IMediaSession.Stub.asInterface(h63.a(bundle, MediaSessionCompat.KEY_EXTRA_BINDER)));
                    mediaControllerImplApi21.f.setSession2Token(lkh.b(bundle, MediaSessionCompat.KEY_SESSION2_TOKEN));
                    mediaControllerImplApi21.a();
                }
            }
        }

        public static class ExtraCallback extends Callback.StubCompat {
            public ExtraCallback(Callback callback) {
                super(callback);
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public void onExtrasChanged(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public void onQueueTitleChanged(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public void onSessionDestroyed() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f = token;
            this.f1311a = new MediaController(context, (MediaSession.Token) token.getToken());
            if (token.getExtraBinder() == null) {
                b();
            }
        }

        @GuardedBy("mLock")
        public void a() {
            if (this.f.getExtraBinder() == null) {
                return;
            }
            for (Callback callback : this.c) {
                ExtraCallback extraCallback = new ExtraCallback(callback);
                this.d.put(callback, extraCallback);
                callback.c = extraCallback;
                try {
                    this.f.getExtraBinder().registerCallbackListener(extraCallback);
                    callback.a(13, null, null);
                } catch (RemoteException unused) {
                }
            }
            this.c.clear();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
            if ((getFlags() & 4) == 0) {
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, mediaDescriptionCompat);
            sendCommand(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM, bundle, null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void adjustVolume(int i, int i2) {
            this.f1311a.adjustVolume(i, i2);
        }

        public final void b() {
            sendCommand(MediaControllerCompat.COMMAND_GET_EXTRA_BINDER, null, new ExtraBinderRequestResultReceiver(this));
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public boolean dispatchMediaButtonEvent(KeyEvent keyEvent) {
            return this.f1311a.dispatchMediaButtonEvent(keyEvent);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public Bundle getExtras() {
            return this.f1311a.getExtras();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public long getFlags() {
            return this.f1311a.getFlags();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public Object getMediaController() {
            return this.f1311a;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public MediaMetadataCompat getMetadata() {
            MediaMetadata metadata = this.f1311a.getMetadata();
            if (metadata != null) {
                return MediaMetadataCompat.fromMediaMetadata(metadata);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public String getPackageName() {
            return this.f1311a.getPackageName();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public PlaybackInfo getPlaybackInfo() {
            MediaController.PlaybackInfo playbackInfo = this.f1311a.getPlaybackInfo();
            if (playbackInfo != null) {
                return new PlaybackInfo(playbackInfo.getPlaybackType(), AudioAttributesCompat.d(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public PlaybackStateCompat getPlaybackState() {
            if (this.f.getExtraBinder() != null) {
                try {
                    return this.f.getExtraBinder().getPlaybackState();
                } catch (RemoteException unused) {
                }
            }
            PlaybackState playbackState = this.f1311a.getPlaybackState();
            if (playbackState != null) {
                return PlaybackStateCompat.fromPlaybackState(playbackState);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public List<MediaSessionCompat.QueueItem> getQueue() {
            List<MediaSession.QueueItem> queue = this.f1311a.getQueue();
            if (queue != null) {
                return MediaSessionCompat.QueueItem.fromQueueItemList(queue);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public CharSequence getQueueTitle() {
            return this.f1311a.getQueueTitle();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public int getRatingType() {
            return this.f1311a.getRatingType();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public int getRepeatMode() {
            if (this.f.getExtraBinder() == null) {
                return -1;
            }
            try {
                return this.f.getExtraBinder().getRepeatMode();
            } catch (RemoteException unused) {
                return -1;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public PendingIntent getSessionActivity() {
            return this.f1311a.getSessionActivity();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public Bundle getSessionInfo() {
            if (this.e != null) {
                return new Bundle(this.e);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                this.e = this.f1311a.getSessionInfo();
            } else if (this.f.getExtraBinder() != null) {
                try {
                    this.e = this.f.getExtraBinder().getSessionInfo();
                } catch (RemoteException unused) {
                    this.e = Bundle.EMPTY;
                }
            }
            Bundle bundleUnparcelWithClassLoader = MediaSessionCompat.unparcelWithClassLoader(this.e);
            this.e = bundleUnparcelWithClassLoader;
            return bundleUnparcelWithClassLoader == null ? Bundle.EMPTY : new Bundle(this.e);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public int getShuffleMode() {
            if (this.f.getExtraBinder() == null) {
                return -1;
            }
            try {
                return this.f.getExtraBinder().getShuffleMode();
            } catch (RemoteException unused) {
                return -1;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public TransportControls getTransportControls() {
            return new TransportControlsApi21(this.f1311a.getTransportControls());
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public boolean isCaptioningEnabled() {
            if (this.f.getExtraBinder() == null) {
                return false;
            }
            try {
                return this.f.getExtraBinder().isCaptioningEnabled();
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public boolean isSessionReady() {
            return this.f.getExtraBinder() != null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public final void registerCallback(Callback callback, Handler handler) {
            this.f1311a.registerCallback(callback.f1305a, handler);
            synchronized (this.f1312b) {
                if (this.f.getExtraBinder() != null) {
                    ExtraCallback extraCallback = new ExtraCallback(callback);
                    this.d.put(callback, extraCallback);
                    callback.c = extraCallback;
                    try {
                        this.f.getExtraBinder().registerCallbackListener(extraCallback);
                        callback.a(13, null, null);
                    } catch (RemoteException unused) {
                    }
                } else {
                    callback.c = null;
                    this.c.add(callback);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
            if ((getFlags() & 4) == 0) {
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, mediaDescriptionCompat);
            sendCommand(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM, bundle, null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void sendCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
            this.f1311a.sendCommand(str, bundle, resultReceiver);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void setVolumeTo(int i, int i2) {
            this.f1311a.setVolumeTo(i, i2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public final void unregisterCallback(Callback callback) {
            this.f1311a.unregisterCallback(callback.f1305a);
            synchronized (this.f1312b) {
                if (this.f.getExtraBinder() != null) {
                    try {
                        ExtraCallback extraCallbackRemove = this.d.remove(callback);
                        if (extraCallbackRemove != null) {
                            callback.c = null;
                            this.f.getExtraBinder().unregisterCallbackListener(extraCallbackRemove);
                        }
                    } catch (RemoteException unused) {
                    }
                } else {
                    this.c.remove(callback);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if ((getFlags() & 4) != 0) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, mediaDescriptionCompat);
                bundle.putInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX, i);
                sendCommand(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM_AT, bundle, null);
                return;
            }
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token != null) {
            this.f1304b = token;
            this.f1303a = new MediaControllerImplApi21(context, token);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public Object getMediaController() {
        return this.f1303a.getMediaController();
    }
}
