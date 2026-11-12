package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.media.session.MediaButtonReceiver;
import defpackage.flf;
import defpackage.h63;
import defpackage.hlf;
import defpackage.lkh;
import defpackage.lpq;
import defpackage.y2r;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MediaSessionCompat {

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_ARGUMENT_CAPTIONING_ENABLED = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_ARGUMENT_EXTRAS = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_ARGUMENT_MEDIA_ID = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_ARGUMENT_PLAYBACK_SPEED = "android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_ARGUMENT_QUERY = "android.support.v4.media.session.action.ARGUMENT_QUERY";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_ARGUMENT_RATING = "android.support.v4.media.session.action.ARGUMENT_RATING";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_ARGUMENT_REPEAT_MODE = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_ARGUMENT_SHUFFLE_MODE = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_ARGUMENT_URI = "android.support.v4.media.session.action.ARGUMENT_URI";
    public static final String ACTION_FLAG_AS_INAPPROPRIATE = "android.support.v4.media.session.action.FLAG_AS_INAPPROPRIATE";
    public static final String ACTION_FOLLOW = "android.support.v4.media.session.action.FOLLOW";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_PLAY_FROM_URI = "android.support.v4.media.session.action.PLAY_FROM_URI";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_PREPARE = "android.support.v4.media.session.action.PREPARE";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_PREPARE_FROM_MEDIA_ID = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_PREPARE_FROM_SEARCH = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_PREPARE_FROM_URI = "android.support.v4.media.session.action.PREPARE_FROM_URI";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_SET_CAPTIONING_ENABLED = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_SET_PLAYBACK_SPEED = "android.support.v4.media.session.action.SET_PLAYBACK_SPEED";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_SET_RATING = "android.support.v4.media.session.action.SET_RATING";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_SET_REPEAT_MODE = "android.support.v4.media.session.action.SET_REPEAT_MODE";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ACTION_SET_SHUFFLE_MODE = "android.support.v4.media.session.action.SET_SHUFFLE_MODE";
    public static final String ACTION_SKIP_AD = "android.support.v4.media.session.action.SKIP_AD";
    public static final String ACTION_UNFOLLOW = "android.support.v4.media.session.action.UNFOLLOW";
    public static final String ARGUMENT_MEDIA_ATTRIBUTE = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE";
    public static final String ARGUMENT_MEDIA_ATTRIBUTE_VALUE = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE_VALUE";

    @Deprecated
    public static final int FLAG_HANDLES_MEDIA_BUTTONS = 1;
    public static final int FLAG_HANDLES_QUEUE_COMMANDS = 4;

    @Deprecated
    public static final int FLAG_HANDLES_TRANSPORT_CONTROLS = 2;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String KEY_EXTRA_BINDER = "android.support.v4.media.session.EXTRA_BINDER";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String KEY_SESSION2_TOKEN = "android.support.v4.media.session.SESSION_TOKEN2";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String KEY_TOKEN = "android.support.v4.media.session.TOKEN";
    public static final int MEDIA_ATTRIBUTE_ALBUM = 1;
    public static final int MEDIA_ATTRIBUTE_ARTIST = 0;
    public static final int MEDIA_ATTRIBUTE_PLAYLIST = 2;
    public static int d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaSessionImpl f1320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaControllerCompat f1321b;
    public final ArrayList<OnActiveChangeListener> c;

    public static abstract class Callback {
        public boolean c;

        @GuardedBy("mLock")
        public CallbackHandler e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f1322a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaSession.Callback f1323b = new MediaSessionCallbackApi21();

        @GuardedBy("mLock")
        public WeakReference<MediaSessionImpl> d = new WeakReference<>(null);

        public class CallbackHandler extends Handler {
            public CallbackHandler(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                MediaSessionImpl mediaSessionImpl;
                Callback callback;
                CallbackHandler callbackHandler;
                if (message.what == 1) {
                    synchronized (Callback.this.f1322a) {
                        mediaSessionImpl = Callback.this.d.get();
                        callback = Callback.this;
                        callbackHandler = callback.e;
                    }
                    if (mediaSessionImpl == null || callback != mediaSessionImpl.getCallback() || callbackHandler == null) {
                        return;
                    }
                    mediaSessionImpl.setCurrentControllerInfo((hlf) message.obj);
                    Callback.this.a(mediaSessionImpl, callbackHandler);
                    mediaSessionImpl.setCurrentControllerInfo(null);
                }
            }
        }

        @RequiresApi(21)
        public class MediaSessionCallbackApi21 extends MediaSession.Callback {
            public MediaSessionCallbackApi21() {
            }

            public final void a(MediaSessionImpl mediaSessionImpl) {
                mediaSessionImpl.setCurrentControllerInfo(null);
            }

            public final MediaSessionImplApi21 b() {
                MediaSessionImplApi21 mediaSessionImplApi21;
                synchronized (Callback.this.f1322a) {
                    mediaSessionImplApi21 = (MediaSessionImplApi21) Callback.this.d.get();
                }
                if (Callback.this == mediaSessionImplApi21.getCallback()) {
                    return mediaSessionImplApi21;
                }
                return null;
            }

            public final void c(MediaSessionImpl mediaSessionImpl) {
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                String callingPackage = mediaSessionImpl.getCallingPackage();
                if (TextUtils.isEmpty(callingPackage)) {
                    callingPackage = "android.media.session.MediaController";
                }
                mediaSessionImpl.setCurrentControllerInfo(new hlf(callingPackage, -1, -1));
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                MediaSessionImplApi21 mediaSessionImplApi21B = b();
                if (mediaSessionImplApi21B == null) {
                    return;
                }
                MediaSessionCompat.ensureClassLoader(bundle);
                c(mediaSessionImplApi21B);
                try {
                    QueueItem queueItem = null;
                    IBinder iBinderAsBinder = null;
                    queueItem = null;
                    if (str.equals(MediaControllerCompat.COMMAND_GET_EXTRA_BINDER)) {
                        Bundle bundle2 = new Bundle();
                        Token sessionToken = mediaSessionImplApi21B.getSessionToken();
                        IMediaSession extraBinder = sessionToken.getExtraBinder();
                        if (extraBinder != null) {
                            iBinderAsBinder = extraBinder.asBinder();
                        }
                        h63.b(bundle2, MediaSessionCompat.KEY_EXTRA_BINDER, iBinderAsBinder);
                        lkh.c(bundle2, MediaSessionCompat.KEY_SESSION2_TOKEN, sessionToken.getSession2Token());
                        resultReceiver.send(0, bundle2);
                    } else if (str.equals(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM)) {
                        Callback.this.onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION));
                    } else if (str.equals(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM_AT)) {
                        Callback.this.onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION), bundle.getInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX));
                    } else if (str.equals(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM)) {
                        Callback.this.onRemoveQueueItem((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION));
                    } else if (!str.equals(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM_AT)) {
                        Callback.this.onCommand(str, bundle, resultReceiver);
                    } else if (mediaSessionImplApi21B.h != null) {
                        int i = bundle.getInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX, -1);
                        if (i >= 0 && i < mediaSessionImplApi21B.h.size()) {
                            queueItem = mediaSessionImplApi21B.h.get(i);
                        }
                        if (queueItem != null) {
                            Callback.this.onRemoveQueueItem(queueItem.getDescription());
                        }
                    }
                } catch (BadParcelableException unused) {
                }
                a(mediaSessionImplApi21B);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCustomAction(String str, Bundle bundle) {
                MediaSessionImplApi21 mediaSessionImplApi21B = b();
                if (mediaSessionImplApi21B == null) {
                    return;
                }
                MediaSessionCompat.ensureClassLoader(bundle);
                c(mediaSessionImplApi21B);
                try {
                    if (str.equals(MediaSessionCompat.ACTION_PLAY_FROM_URI)) {
                        Uri uri = (Uri) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI);
                        Bundle bundle2 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                        MediaSessionCompat.ensureClassLoader(bundle2);
                        Callback.this.onPlayFromUri(uri, bundle2);
                    } else if (str.equals(MediaSessionCompat.ACTION_PREPARE)) {
                        Callback.this.onPrepare();
                    } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
                        String string = bundle.getString(MediaSessionCompat.ACTION_ARGUMENT_MEDIA_ID);
                        Bundle bundle3 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                        MediaSessionCompat.ensureClassLoader(bundle3);
                        Callback.this.onPrepareFromMediaId(string, bundle3);
                    } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_SEARCH)) {
                        String string2 = bundle.getString(MediaSessionCompat.ACTION_ARGUMENT_QUERY);
                        Bundle bundle4 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                        MediaSessionCompat.ensureClassLoader(bundle4);
                        Callback.this.onPrepareFromSearch(string2, bundle4);
                    } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_URI)) {
                        Uri uri2 = (Uri) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI);
                        Bundle bundle5 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                        MediaSessionCompat.ensureClassLoader(bundle5);
                        Callback.this.onPrepareFromUri(uri2, bundle5);
                    } else if (str.equals(MediaSessionCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                        Callback.this.onSetCaptioningEnabled(bundle.getBoolean(MediaSessionCompat.ACTION_ARGUMENT_CAPTIONING_ENABLED));
                    } else if (str.equals(MediaSessionCompat.ACTION_SET_REPEAT_MODE)) {
                        Callback.this.onSetRepeatMode(bundle.getInt(MediaSessionCompat.ACTION_ARGUMENT_REPEAT_MODE));
                    } else if (str.equals(MediaSessionCompat.ACTION_SET_SHUFFLE_MODE)) {
                        Callback.this.onSetShuffleMode(bundle.getInt(MediaSessionCompat.ACTION_ARGUMENT_SHUFFLE_MODE));
                    } else if (str.equals(MediaSessionCompat.ACTION_SET_RATING)) {
                        RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_RATING);
                        Bundle bundle6 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                        MediaSessionCompat.ensureClassLoader(bundle6);
                        Callback.this.onSetRating(ratingCompat, bundle6);
                    } else if (str.equals(MediaSessionCompat.ACTION_SET_PLAYBACK_SPEED)) {
                        Callback.this.onSetPlaybackSpeed(bundle.getFloat(MediaSessionCompat.ACTION_ARGUMENT_PLAYBACK_SPEED, 1.0f));
                    } else {
                        Callback.this.onCustomAction(str, bundle);
                    }
                } catch (BadParcelableException unused) {
                }
                a(mediaSessionImplApi21B);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onFastForward() {
                MediaSessionImplApi21 mediaSessionImplApi21B = b();
                if (mediaSessionImplApi21B == null) {
                    return;
                }
                c(mediaSessionImplApi21B);
                Callback.this.onFastForward();
                a(mediaSessionImplApi21B);
            }

            @Override // android.media.session.MediaSession.Callback
            public boolean onMediaButtonEvent(Intent intent) {
                MediaSessionImplApi21 mediaSessionImplApi21B = b();
                if (mediaSessionImplApi21B == null) {
                    return false;
                }
                c(mediaSessionImplApi21B);
                boolean zOnMediaButtonEvent = Callback.this.onMediaButtonEvent(intent);
                a(mediaSessionImplApi21B);
                return zOnMediaButtonEvent || super.onMediaButtonEvent(intent);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPause() {
                MediaSessionImplApi21 mediaSessionImplApi21B = b();
                if (mediaSessionImplApi21B == null) {
                    return;
                }
                c(mediaSessionImplApi21B);
                Callback.this.onPause();
                a(mediaSessionImplApi21B);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlay() {
                MediaSessionImplApi21 mediaSessionImplApi21B = b();
                if (mediaSessionImplApi21B == null) {
                    return;
                }
                c(mediaSessionImplApi21B);
                Callback.this.onPlay();
                a(mediaSessionImplApi21B);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromMediaId(String str, Bundle bundle) {
                MediaSessionImplApi21 mediaSessionImplApi21B = b();
                if (mediaSessionImplApi21B == null) {
                    return;
                }
                MediaSessionCompat.ensureClassLoader(bundle);
                c(mediaSessionImplApi21B);
                Callback.this.onPlayFromMediaId(str, bundle);
                a(mediaSessionImplApi21B);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromSearch(String str, Bundle bundle) {
                MediaSessionImplApi21 mediaSessionImplApi21B = b();
                if (mediaSessionImplApi21B == null) {
                    return;
                }
                MediaSessionCompat.ensureClassLoader(bundle);
                c(mediaSessionImplApi21B);
                Callback.this.onPlayFromSearch(str, bundle);
                a(mediaSessionImplApi21B);
            }

            @Override // android.media.session.MediaSession.Callback
            @RequiresApi(23)
            public void onPlayFromUri(Uri uri, Bundle bundle) {
                MediaSessionImplApi21 mediaSessionImplApi21B = b();
                if (mediaSessionImplApi21B == null) {
                    return;
                }
                MediaSessionCompat.ensureClassLoader(bundle);
                c(mediaSessionImplApi21B);
                Callback.this.onPlayFromUri(uri, bundle);
                a(mediaSessionImplApi21B);
            }

            @Override // android.media.session.MediaSession.Callback
            @RequiresApi(24)
            public void onPrepare() {
                MediaSessionImplApi21 mediaSessionImplApi21B = b();
                if (mediaSessionImplApi21B == null) {
                    return;
                }
                c(mediaSessionImplApi21B);
                Callback.this.onPrepare();
                a(mediaSessionImplApi21B);
            }

            @Override // android.media.session.MediaSession.Callback
            @RequiresApi(24)
            public void onPrepareFromMediaId(String str, Bundle bundle) {
                MediaSessionImplApi21 mediaSessionImplApi21B = b();
                if (mediaSessionImplApi21B == null) {
                    return;
                }
                MediaSessionCompat.ensureClassLoader(bundle);
                c(mediaSessionImplApi21B);
                Callback.this.onPrepareFromMediaId(str, bundle);
                a(mediaSessionImplApi21B);
            }

            @Override // android.media.session.MediaSession.Callback
            @RequiresApi(24)
            public void onPrepareFromSearch(String str, Bundle bundle) {
                MediaSessionImplApi21 mediaSessionImplApi21B = b();
                if (mediaSessionImplApi21B == null) {
                    return;
                }
                MediaSessionCompat.ensureClassLoader(bundle);
                c(mediaSessionImplApi21B);
                Callback.this.onPrepareFromSearch(str, bundle);
                a(mediaSessionImplApi21B);
            }

            @Override // android.media.session.MediaSession.Callback
            @RequiresApi(24)
            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                MediaSessionImplApi21 mediaSessionImplApi21B = b();
                if (mediaSessionImplApi21B == null) {
                    return;
                }
                MediaSessionCompat.ensureClassLoader(bundle);
                c(mediaSessionImplApi21B);
                Callback.this.onPrepareFromUri(uri, bundle);
                a(mediaSessionImplApi21B);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onRewind() {
                MediaSessionImplApi21 mediaSessionImplApi21B = b();
                if (mediaSessionImplApi21B == null) {
                    return;
                }
                c(mediaSessionImplApi21B);
                Callback.this.onRewind();
                a(mediaSessionImplApi21B);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSeekTo(long j) {
                MediaSessionImplApi21 mediaSessionImplApi21B = b();
                if (mediaSessionImplApi21B == null) {
                    return;
                }
                c(mediaSessionImplApi21B);
                Callback.this.onSeekTo(j);
                a(mediaSessionImplApi21B);
            }

            @Override // android.media.session.MediaSession.Callback
            @RequiresApi(29)
            public void onSetPlaybackSpeed(float f) {
                MediaSessionImplApi21 mediaSessionImplApi21B = b();
                if (mediaSessionImplApi21B == null) {
                    return;
                }
                c(mediaSessionImplApi21B);
                Callback.this.onSetPlaybackSpeed(f);
                a(mediaSessionImplApi21B);
            }

            public void onSetRating(Rating rating, Bundle bundle) {
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToNext() {
                MediaSessionImplApi21 mediaSessionImplApi21B = b();
                if (mediaSessionImplApi21B == null) {
                    return;
                }
                c(mediaSessionImplApi21B);
                Callback.this.onSkipToNext();
                a(mediaSessionImplApi21B);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToPrevious() {
                MediaSessionImplApi21 mediaSessionImplApi21B = b();
                if (mediaSessionImplApi21B == null) {
                    return;
                }
                c(mediaSessionImplApi21B);
                Callback.this.onSkipToPrevious();
                a(mediaSessionImplApi21B);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToQueueItem(long j) {
                MediaSessionImplApi21 mediaSessionImplApi21B = b();
                if (mediaSessionImplApi21B == null) {
                    return;
                }
                c(mediaSessionImplApi21B);
                Callback.this.onSkipToQueueItem(j);
                a(mediaSessionImplApi21B);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onStop() {
                MediaSessionImplApi21 mediaSessionImplApi21B = b();
                if (mediaSessionImplApi21B == null) {
                    return;
                }
                c(mediaSessionImplApi21B);
                Callback.this.onStop();
                a(mediaSessionImplApi21B);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetRating(Rating rating) {
                MediaSessionImplApi21 mediaSessionImplApi21B = b();
                if (mediaSessionImplApi21B == null) {
                    return;
                }
                c(mediaSessionImplApi21B);
                Callback.this.onSetRating(RatingCompat.fromRating(rating));
                a(mediaSessionImplApi21B);
            }
        }

        public void a(MediaSessionImpl mediaSessionImpl, Handler handler) {
            if (this.c) {
                this.c = false;
                handler.removeMessages(1);
                PlaybackStateCompat playbackState = mediaSessionImpl.getPlaybackState();
                long actions = playbackState == null ? 0L : playbackState.getActions();
                boolean z = playbackState != null && playbackState.getState() == 3;
                boolean z2 = (516 & actions) != 0;
                boolean z3 = (actions & 514) != 0;
                if (z && z3) {
                    onPause();
                } else {
                    if (z || !z2) {
                        return;
                    }
                    onPlay();
                }
            }
        }

        public void b(MediaSessionImpl mediaSessionImpl, Handler handler) {
            synchronized (this.f1322a) {
                try {
                    this.d = new WeakReference<>(mediaSessionImpl);
                    CallbackHandler callbackHandler = this.e;
                    CallbackHandler callbackHandler2 = null;
                    if (callbackHandler != null) {
                        callbackHandler.removeCallbacksAndMessages(null);
                    }
                    if (mediaSessionImpl != null && handler != null) {
                        callbackHandler2 = new CallbackHandler(handler.getLooper());
                    }
                    this.e = callbackHandler2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void onCustomAction(String str, Bundle bundle) {
        }

        public void onFastForward() {
        }

        public boolean onMediaButtonEvent(Intent intent) {
            MediaSessionImpl mediaSessionImpl;
            CallbackHandler callbackHandler;
            KeyEvent keyEvent;
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.f1322a) {
                mediaSessionImpl = this.d.get();
                callbackHandler = this.e;
            }
            if (mediaSessionImpl == null || callbackHandler == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            hlf currentControllerInfo = mediaSessionImpl.getCurrentControllerInfo();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79 && keyCode != 85) {
                a(mediaSessionImpl, callbackHandler);
                return false;
            }
            if (keyEvent.getRepeatCount() != 0) {
                a(mediaSessionImpl, callbackHandler);
            } else if (this.c) {
                callbackHandler.removeMessages(1);
                this.c = false;
                PlaybackStateCompat playbackState = mediaSessionImpl.getPlaybackState();
                if (((playbackState == null ? 0L : playbackState.getActions()) & 32) != 0) {
                    onSkipToNext();
                }
            } else {
                this.c = true;
                callbackHandler.sendMessageDelayed(callbackHandler.obtainMessage(1, currentControllerInfo), ViewConfiguration.getDoubleTapTimeout());
            }
            return true;
        }

        public void onPause() {
        }

        public void onPlay() {
        }

        public void onPlayFromMediaId(String str, Bundle bundle) {
        }

        public void onPlayFromSearch(String str, Bundle bundle) {
        }

        public void onPlayFromUri(Uri uri, Bundle bundle) {
        }

        public void onPrepare() {
        }

        public void onPrepareFromMediaId(String str, Bundle bundle) {
        }

        public void onPrepareFromSearch(String str, Bundle bundle) {
        }

        public void onPrepareFromUri(Uri uri, Bundle bundle) {
        }

        public void onRemoveQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        @Deprecated
        public void onRemoveQueueItemAt(int i) {
        }

        public void onRewind() {
        }

        public void onSeekTo(long j) {
        }

        public void onSetCaptioningEnabled(boolean z) {
        }

        public void onSetPlaybackSpeed(float f) {
        }

        public void onSetRating(RatingCompat ratingCompat) {
        }

        public void onSetRepeatMode(int i) {
        }

        public void onSetShuffleMode(int i) {
        }

        public void onSkipToNext() {
        }

        public void onSkipToPrevious() {
        }

        public void onSkipToQueueItem(long j) {
        }

        public void onStop() {
        }

        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        }

        public void onSetRating(RatingCompat ratingCompat, Bundle bundle) {
        }
    }

    public interface MediaSessionImpl {
        Callback getCallback();

        String getCallingPackage();

        hlf getCurrentControllerInfo();

        Object getMediaSession();

        PlaybackStateCompat getPlaybackState();

        Object getRemoteControlClient();

        Token getSessionToken();

        boolean isActive();

        void release();

        void sendSessionEvent(String str, Bundle bundle);

        void setActive(boolean z);

        void setCallback(Callback callback, Handler handler);

        void setCaptioningEnabled(boolean z);

        void setCurrentControllerInfo(hlf hlfVar);

        void setExtras(Bundle bundle);

        void setFlags(int i);

        void setMediaButtonReceiver(PendingIntent pendingIntent);

        void setMetadata(MediaMetadataCompat mediaMetadataCompat);

        void setPlaybackState(PlaybackStateCompat playbackStateCompat);

        void setPlaybackToLocal(int i);

        void setPlaybackToRemote(y2r y2rVar);

        void setQueue(List<QueueItem> list);

        void setQueueTitle(CharSequence charSequence);

        void setRatingType(int i);

        void setRepeatMode(int i);

        void setSessionActivity(PendingIntent pendingIntent);

        void setShuffleMode(int i);
    }

    @RequiresApi(18)
    public static class MediaSessionImplApi18 extends MediaSessionImplBase {
        public static boolean F = true;

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        public int e(long j) {
            int iE = super.e(j);
            return (j & 256) != 0 ? iE | 256 : iE;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        public void g(PendingIntent pendingIntent, ComponentName componentName) {
            if (F) {
                try {
                    this.i.registerMediaButtonEventReceiver(pendingIntent);
                } catch (NullPointerException unused) {
                    F = false;
                }
            }
            if (F) {
                return;
            }
            super.g(pendingIntent, componentName);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        public void s(PlaybackStateCompat playbackStateCompat) {
            long position = playbackStateCompat.getPosition();
            float playbackSpeed = playbackStateCompat.getPlaybackSpeed();
            long lastPositionUpdateTime = playbackStateCompat.getLastPositionUpdateTime();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (playbackStateCompat.getState() == 3) {
                long j = 0;
                if (position > 0) {
                    if (lastPositionUpdateTime > 0) {
                        j = jElapsedRealtime - lastPositionUpdateTime;
                        if (playbackSpeed > 0.0f && playbackSpeed != 1.0f) {
                            j = (long) (j * playbackSpeed);
                        }
                    }
                    position += j;
                }
            }
            this.j.setPlaybackState(d(playbackStateCompat.getState()), position, playbackSpeed);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCallback(Callback callback, Handler handler) {
            super.setCallback(callback, handler);
            if (callback == null) {
                this.j.setPlaybackPositionUpdateListener(null);
            } else {
                this.j.setPlaybackPositionUpdateListener(new RemoteControlClient.OnPlaybackPositionUpdateListener() { // from class: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi18.1
                    @Override // android.media.RemoteControlClient.OnPlaybackPositionUpdateListener
                    public void onPlaybackPositionUpdate(long j) {
                        MediaSessionImplApi18.this.f(18, -1, -1, Long.valueOf(j), null);
                    }
                });
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        public void u(PendingIntent pendingIntent, ComponentName componentName) {
            if (F) {
                this.i.unregisterMediaButtonEventReceiver(pendingIntent);
            } else {
                super.u(pendingIntent, componentName);
            }
        }
    }

    @RequiresApi(19)
    public static class MediaSessionImplApi19 extends MediaSessionImplApi18 {
        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        public RemoteControlClient.MetadataEditor b(Bundle bundle) {
            RemoteControlClient.MetadataEditor metadataEditorB = super.b(bundle);
            PlaybackStateCompat playbackStateCompat = this.t;
            if (((playbackStateCompat == null ? 0L : playbackStateCompat.getActions()) & 128) != 0) {
                metadataEditorB.addEditableKey(268435457);
            }
            if (bundle == null) {
                return metadataEditorB;
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_YEAR)) {
                metadataEditorB.putLong(8, bundle.getLong(MediaMetadataCompat.METADATA_KEY_YEAR));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_RATING)) {
                metadataEditorB.putObject(101, (Object) bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_RATING));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_USER_RATING)) {
                metadataEditorB.putObject(268435457, (Object) bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_USER_RATING));
            }
            return metadataEditorB;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi18, android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        public int e(long j) {
            int iE = super.e(j);
            return (j & 128) != 0 ? iE | 512 : iE;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi18, android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCallback(Callback callback, Handler handler) {
            super.setCallback(callback, handler);
            if (callback == null) {
                this.j.setMetadataUpdateListener(null);
            } else {
                this.j.setMetadataUpdateListener(new RemoteControlClient.OnMetadataUpdateListener() { // from class: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi19.1
                    @Override // android.media.RemoteControlClient.OnMetadataUpdateListener
                    public void onMetadataUpdate(int i, Object obj) {
                        if (i == 268435457 && (obj instanceof Rating)) {
                            MediaSessionImplApi19.this.f(19, -1, -1, RatingCompat.fromRating(obj), null);
                        }
                    }
                });
            }
        }
    }

    @RequiresApi(28)
    public static class MediaSessionImplApi28 extends MediaSessionImplApi21 {
        public MediaSessionImplApi28(MediaSession mediaSession, lpq lpqVar, Bundle bundle) {
            super(mediaSession, lpqVar, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public final hlf getCurrentControllerInfo() {
            return new hlf(this.f1328a.getCurrentControllerInfo());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCurrentControllerInfo(hlf hlfVar) {
        }

        public MediaSessionImplApi28(Object obj) {
            super(obj);
        }
    }

    @RequiresApi(29)
    public static class MediaSessionImplApi29 extends MediaSessionImplApi28 {
        public MediaSessionImplApi29(MediaSession mediaSession, lpq lpqVar, Bundle bundle) {
            super(mediaSession, lpqVar, bundle);
        }

        public MediaSessionImplApi29(Object obj) {
            super(obj);
            this.d = ((MediaSession) obj).getController().getSessionInfo();
        }
    }

    public static class MediaSessionImplBase implements MediaSessionImpl {
        public int A;
        public Bundle B;
        public int C;
        public int D;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f1332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ComponentName f1333b;
        public final PendingIntent c;
        public final MediaSessionStub d;
        public final Token e;
        public final String f;
        public final Bundle g;
        public final String h;
        public final AudioManager i;
        public final RemoteControlClient j;
        public MessageHandler m;
        public volatile Callback p;
        public hlf q;
        public MediaMetadataCompat s;
        public PlaybackStateCompat t;
        public PendingIntent u;
        public List<QueueItem> v;
        public CharSequence w;
        public int x;
        public boolean y;
        public int z;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Object f1334k = new Object();
        public final RemoteCallbackList<IMediaControllerCallback> l = new RemoteCallbackList<>();
        public boolean n = false;
        public boolean o = false;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f1335r = 3;
        public y2r.a E = new y2r.a() { // from class: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.1
            @Override // y2r.a
            public void onVolumeChanged(y2r y2rVar) {
                MediaSessionImplBase.this.getClass();
                MediaSessionImplBase mediaSessionImplBase = MediaSessionImplBase.this;
                int i = mediaSessionImplBase.C;
                int i2 = mediaSessionImplBase.D;
                throw null;
            }
        };

        public static final class Command {
            public final String command;
            public final Bundle extras;
            public final ResultReceiver stub;

            public Command(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.command = str;
                this.extras = bundle;
                this.stub = resultReceiver;
            }
        }

        public class MediaSessionStub extends IMediaSession.Stub {
            public MediaSessionStub() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                p5(25, mediaDescriptionCompat);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                q5(26, mediaDescriptionCompat, i);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void adjustVolume(int i, int i2, String str) {
                MediaSessionImplBase.this.a(i, i2);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void fastForward() throws RemoteException {
                s2(16);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public Bundle getExtras() {
                Bundle bundle;
                synchronized (MediaSessionImplBase.this.f1334k) {
                    bundle = MediaSessionImplBase.this.B;
                }
                return bundle;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public long getFlags() {
                long j;
                synchronized (MediaSessionImplBase.this.f1334k) {
                    j = MediaSessionImplBase.this.f1335r;
                }
                return j;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public PendingIntent getLaunchPendingIntent() {
                PendingIntent pendingIntent;
                synchronized (MediaSessionImplBase.this.f1334k) {
                    pendingIntent = MediaSessionImplBase.this.u;
                }
                return pendingIntent;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public MediaMetadataCompat getMetadata() {
                return MediaSessionImplBase.this.s;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public String getPackageName() {
                return MediaSessionImplBase.this.f;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public PlaybackStateCompat getPlaybackState() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (MediaSessionImplBase.this.f1334k) {
                    MediaSessionImplBase mediaSessionImplBase = MediaSessionImplBase.this;
                    playbackStateCompat = mediaSessionImplBase.t;
                    mediaMetadataCompat = mediaSessionImplBase.s;
                }
                return MediaSessionCompat.b(playbackStateCompat, mediaMetadataCompat);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public List<QueueItem> getQueue() {
                List<QueueItem> list;
                synchronized (MediaSessionImplBase.this.f1334k) {
                    list = MediaSessionImplBase.this.v;
                }
                return list;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public CharSequence getQueueTitle() {
                return MediaSessionImplBase.this.w;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRatingType() {
                return MediaSessionImplBase.this.x;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRepeatMode() {
                return MediaSessionImplBase.this.z;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public Bundle getSessionInfo() {
                if (MediaSessionImplBase.this.g == null) {
                    return null;
                }
                return new Bundle(MediaSessionImplBase.this.g);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getShuffleMode() {
                return MediaSessionImplBase.this.A;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public String getTag() {
                return MediaSessionImplBase.this.h;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public ParcelableVolumeInfo getVolumeAttributes() {
                int i;
                int i2;
                int streamMaxVolume;
                int streamVolume;
                synchronized (MediaSessionImplBase.this.f1334k) {
                    MediaSessionImplBase mediaSessionImplBase = MediaSessionImplBase.this;
                    i = mediaSessionImplBase.C;
                    i2 = mediaSessionImplBase.D;
                    mediaSessionImplBase.getClass();
                    if (i == 2) {
                        throw null;
                    }
                    streamMaxVolume = MediaSessionImplBase.this.i.getStreamMaxVolume(i2);
                    streamVolume = MediaSessionImplBase.this.i.getStreamVolume(i2);
                }
                return new ParcelableVolumeInfo(i, i2, 2, streamMaxVolume, streamVolume);
            }

            public void h4(int i, int i2) {
                MediaSessionImplBase.this.f(i, i2, 0, null, null);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isCaptioningEnabled() {
                return MediaSessionImplBase.this.y;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isShuffleModeEnabledRemoved() {
                return false;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isTransportControlEnabled() {
                return true;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void next() throws RemoteException {
                s2(14);
            }

            public void p5(int i, Object obj) {
                MediaSessionImplBase.this.f(i, 0, 0, obj, null);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void pause() throws RemoteException {
                s2(12);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void play() throws RemoteException {
                s2(7);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromMediaId(String str, Bundle bundle) throws RemoteException {
                r5(8, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromSearch(String str, Bundle bundle) throws RemoteException {
                r5(9, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromUri(Uri uri, Bundle bundle) throws RemoteException {
                r5(10, uri, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepare() throws RemoteException {
                s2(3);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromMediaId(String str, Bundle bundle) throws RemoteException {
                r5(4, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromSearch(String str, Bundle bundle) throws RemoteException {
                r5(5, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromUri(Uri uri, Bundle bundle) throws RemoteException {
                r5(6, uri, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void previous() throws RemoteException {
                s2(15);
            }

            public void q5(int i, Object obj, int i2) {
                MediaSessionImplBase.this.f(i, i2, 0, obj, null);
            }

            public void r5(int i, Object obj, Bundle bundle) {
                MediaSessionImplBase.this.f(i, 0, 0, obj, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rate(RatingCompat ratingCompat) throws RemoteException {
                p5(19, ratingCompat);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                r5(31, ratingCompat, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void registerCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
                if (MediaSessionImplBase.this.n) {
                    try {
                        iMediaControllerCallback.onSessionDestroyed();
                    } catch (Exception unused) {
                    }
                } else {
                    MediaSessionImplBase.this.l.register(iMediaControllerCallback, new hlf(MediaSessionImplBase.this.c(Binder.getCallingUid()), Binder.getCallingPid(), Binder.getCallingUid()));
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                p5(27, mediaDescriptionCompat);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItemAt(int i) {
                h4(28, i);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rewind() throws RemoteException {
                s2(17);
            }

            public void s2(int i) {
                MediaSessionImplBase.this.f(i, 0, 0, null, null);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void seekTo(long j) throws RemoteException {
                p5(18, Long.valueOf(j));
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCommand(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                p5(1, new Command(str, bundle, resultReceiverWrapper == null ? null : resultReceiverWrapper.f1341a));
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCustomAction(String str, Bundle bundle) throws RemoteException {
                r5(20, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean sendMediaButton(KeyEvent keyEvent) {
                p5(21, keyEvent);
                return true;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setCaptioningEnabled(boolean z) throws RemoteException {
                p5(29, Boolean.valueOf(z));
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setPlaybackSpeed(float f) throws RemoteException {
                p5(32, Float.valueOf(f));
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setRepeatMode(int i) throws RemoteException {
                h4(23, i);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleMode(int i) throws RemoteException {
                h4(30, i);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleModeEnabledRemoved(boolean z) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setVolumeTo(int i, int i2, String str) {
                MediaSessionImplBase.this.t(i, i2);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void skipToQueueItem(long j) {
                p5(11, Long.valueOf(j));
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void stop() throws RemoteException {
                s2(13);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
                MediaSessionImplBase.this.l.unregister(iMediaControllerCallback);
            }
        }

        public class MessageHandler extends Handler {
            public MessageHandler(Looper looper) {
                super(looper);
            }

            public final void a(KeyEvent keyEvent, Callback callback) {
                if (keyEvent == null || keyEvent.getAction() != 0) {
                    return;
                }
                PlaybackStateCompat playbackStateCompat = MediaSessionImplBase.this.t;
                long actions = playbackStateCompat == null ? 0L : playbackStateCompat.getActions();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 126) {
                    if ((actions & 4) != 0) {
                        callback.onPlay();
                    }
                    return;
                }
                if (keyCode == 127) {
                    if ((actions & 2) != 0) {
                        callback.onPause();
                        return;
                    }
                    return;
                }
                switch (keyCode) {
                    case 86:
                        if ((actions & 1) != 0) {
                            callback.onStop();
                        }
                        break;
                    case 87:
                        if ((actions & 32) != 0) {
                            callback.onSkipToNext();
                        }
                        break;
                    case 88:
                        if ((actions & 16) != 0) {
                            callback.onSkipToPrevious();
                        }
                        break;
                    case 89:
                        if ((actions & 8) != 0) {
                            callback.onRewind();
                        }
                        break;
                    case 90:
                        if ((actions & 64) != 0) {
                            callback.onFastForward();
                        }
                        break;
                }
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                Callback callback = MediaSessionImplBase.this.p;
                if (callback == null) {
                    return;
                }
                Bundle data = message.getData();
                MediaSessionCompat.ensureClassLoader(data);
                MediaSessionImplBase.this.setCurrentControllerInfo(new hlf(data.getString("data_calling_pkg"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
                Bundle bundle = data.getBundle("data_extras");
                MediaSessionCompat.ensureClassLoader(bundle);
                try {
                    switch (message.what) {
                        case 1:
                            Command command = (Command) message.obj;
                            callback.onCommand(command.command, command.extras, command.stub);
                            break;
                        case 2:
                            MediaSessionImplBase.this.a(message.arg1, 0);
                            break;
                        case 3:
                            callback.onPrepare();
                            break;
                        case 4:
                            callback.onPrepareFromMediaId((String) message.obj, bundle);
                            break;
                        case 5:
                            callback.onPrepareFromSearch((String) message.obj, bundle);
                            break;
                        case 6:
                            callback.onPrepareFromUri((Uri) message.obj, bundle);
                            break;
                        case 7:
                            callback.onPlay();
                            break;
                        case 8:
                            callback.onPlayFromMediaId((String) message.obj, bundle);
                            break;
                        case 9:
                            callback.onPlayFromSearch((String) message.obj, bundle);
                            break;
                        case 10:
                            callback.onPlayFromUri((Uri) message.obj, bundle);
                            break;
                        case 11:
                            callback.onSkipToQueueItem(((Long) message.obj).longValue());
                            break;
                        case 12:
                            callback.onPause();
                            break;
                        case 13:
                            callback.onStop();
                            break;
                        case 14:
                            callback.onSkipToNext();
                            break;
                        case 15:
                            callback.onSkipToPrevious();
                            break;
                        case 16:
                            callback.onFastForward();
                            break;
                        case 17:
                            callback.onRewind();
                            break;
                        case 18:
                            callback.onSeekTo(((Long) message.obj).longValue());
                            break;
                        case 19:
                            callback.onSetRating((RatingCompat) message.obj);
                            break;
                        case 20:
                            callback.onCustomAction((String) message.obj, bundle);
                            break;
                        case 21:
                            KeyEvent keyEvent = (KeyEvent) message.obj;
                            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                            intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                            if (!callback.onMediaButtonEvent(intent)) {
                                a(keyEvent, callback);
                            }
                            break;
                        case 22:
                            MediaSessionImplBase.this.t(message.arg1, 0);
                            break;
                        case 23:
                            callback.onSetRepeatMode(message.arg1);
                            break;
                        case 25:
                            callback.onAddQueueItem((MediaDescriptionCompat) message.obj);
                            break;
                        case 26:
                            callback.onAddQueueItem((MediaDescriptionCompat) message.obj, message.arg1);
                            break;
                        case 27:
                            callback.onRemoveQueueItem((MediaDescriptionCompat) message.obj);
                            break;
                        case 28:
                            List<QueueItem> list = MediaSessionImplBase.this.v;
                            if (list != null) {
                                int i = message.arg1;
                                QueueItem queueItem = (i < 0 || i >= list.size()) ? null : MediaSessionImplBase.this.v.get(message.arg1);
                                if (queueItem != null) {
                                    callback.onRemoveQueueItem(queueItem.getDescription());
                                }
                            }
                            break;
                        case 29:
                            callback.onSetCaptioningEnabled(((Boolean) message.obj).booleanValue());
                            break;
                        case 30:
                            callback.onSetShuffleMode(message.arg1);
                            break;
                        case 31:
                            callback.onSetRating((RatingCompat) message.obj, bundle);
                            break;
                        case 32:
                            callback.onSetPlaybackSpeed(((Float) message.obj).floatValue());
                            break;
                    }
                } finally {
                    MediaSessionImplBase.this.setCurrentControllerInfo(null);
                }
            }
        }

        public MediaSessionImplBase(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, lpq lpqVar, Bundle bundle) {
            if (componentName == null) {
                throw new IllegalArgumentException("MediaButtonReceiver component may not be null");
            }
            this.f1332a = context;
            this.f = context.getPackageName();
            this.g = bundle;
            this.i = (AudioManager) context.getSystemService("audio");
            this.h = str;
            this.f1333b = componentName;
            this.c = pendingIntent;
            MediaSessionStub mediaSessionStub = new MediaSessionStub();
            this.d = mediaSessionStub;
            this.e = new Token(mediaSessionStub, null, lpqVar);
            this.x = 0;
            this.C = 1;
            this.D = 3;
            this.j = new RemoteControlClient(pendingIntent);
        }

        public void a(int i, int i2) {
            if (this.C == 2) {
                return;
            }
            this.i.adjustStreamVolume(this.D, i, i2);
        }

        public RemoteControlClient.MetadataEditor b(Bundle bundle) {
            RemoteControlClient.MetadataEditor metadataEditorEditMetadata = this.j.editMetadata(true);
            if (bundle == null) {
                return metadataEditorEditMetadata;
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_ART)) {
                Bitmap bitmapCopy = (Bitmap) bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_ART);
                if (bitmapCopy != null) {
                    bitmapCopy = bitmapCopy.copy(bitmapCopy.getConfig(), false);
                }
                metadataEditorEditMetadata.putBitmap(100, bitmapCopy);
            } else if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_ALBUM_ART)) {
                Bitmap bitmapCopy2 = (Bitmap) bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_ALBUM_ART);
                if (bitmapCopy2 != null) {
                    bitmapCopy2 = bitmapCopy2.copy(bitmapCopy2.getConfig(), false);
                }
                metadataEditorEditMetadata.putBitmap(100, bitmapCopy2);
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_ALBUM)) {
                metadataEditorEditMetadata.putString(1, bundle.getString(MediaMetadataCompat.METADATA_KEY_ALBUM));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST)) {
                metadataEditorEditMetadata.putString(13, bundle.getString(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_ARTIST)) {
                metadataEditorEditMetadata.putString(2, bundle.getString(MediaMetadataCompat.METADATA_KEY_ARTIST));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_AUTHOR)) {
                metadataEditorEditMetadata.putString(3, bundle.getString(MediaMetadataCompat.METADATA_KEY_AUTHOR));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_COMPILATION)) {
                metadataEditorEditMetadata.putString(15, bundle.getString(MediaMetadataCompat.METADATA_KEY_COMPILATION));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_COMPOSER)) {
                metadataEditorEditMetadata.putString(4, bundle.getString(MediaMetadataCompat.METADATA_KEY_COMPOSER));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_DATE)) {
                metadataEditorEditMetadata.putString(5, bundle.getString(MediaMetadataCompat.METADATA_KEY_DATE));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_DISC_NUMBER)) {
                metadataEditorEditMetadata.putLong(14, bundle.getLong(MediaMetadataCompat.METADATA_KEY_DISC_NUMBER));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_DURATION)) {
                metadataEditorEditMetadata.putLong(9, bundle.getLong(MediaMetadataCompat.METADATA_KEY_DURATION));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_GENRE)) {
                metadataEditorEditMetadata.putString(6, bundle.getString(MediaMetadataCompat.METADATA_KEY_GENRE));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_TITLE)) {
                metadataEditorEditMetadata.putString(7, bundle.getString(MediaMetadataCompat.METADATA_KEY_TITLE));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER)) {
                metadataEditorEditMetadata.putLong(0, bundle.getLong(MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_WRITER)) {
                metadataEditorEditMetadata.putString(11, bundle.getString(MediaMetadataCompat.METADATA_KEY_WRITER));
            }
            return metadataEditorEditMetadata;
        }

        public String c(int i) {
            String nameForUid = this.f1332a.getPackageManager().getNameForUid(i);
            return TextUtils.isEmpty(nameForUid) ? "android.media.session.MediaController" : nameForUid;
        }

        public int d(int i) {
            switch (i) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                case 8:
                    return 8;
                case 7:
                    return 9;
                case 9:
                    return 7;
                case 10:
                case 11:
                    return 6;
                default:
                    return -1;
            }
        }

        public int e(long j) {
            int i = (1 & j) != 0 ? 32 : 0;
            if ((2 & j) != 0) {
                i |= 16;
            }
            if ((4 & j) != 0) {
                i |= 4;
            }
            if ((8 & j) != 0) {
                i |= 2;
            }
            if ((16 & j) != 0) {
                i |= 1;
            }
            if ((32 & j) != 0) {
                i |= 128;
            }
            if ((64 & j) != 0) {
                i |= 64;
            }
            return (j & 512) != 0 ? i | 8 : i;
        }

        public void f(int i, int i2, int i3, Object obj, Bundle bundle) {
            synchronized (this.f1334k) {
                try {
                    MessageHandler messageHandler = this.m;
                    if (messageHandler != null) {
                        Message messageObtainMessage = messageHandler.obtainMessage(i, i2, i3, obj);
                        Bundle bundle2 = new Bundle();
                        int callingUid = Binder.getCallingUid();
                        bundle2.putInt("data_calling_uid", callingUid);
                        bundle2.putString("data_calling_pkg", c(callingUid));
                        int callingPid = Binder.getCallingPid();
                        if (callingPid > 0) {
                            bundle2.putInt("data_calling_pid", callingPid);
                        } else {
                            bundle2.putInt("data_calling_pid", -1);
                        }
                        if (bundle != null) {
                            bundle2.putBundle("data_extras", bundle);
                        }
                        messageObtainMessage.setData(bundle2);
                        messageObtainMessage.sendToTarget();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void g(PendingIntent pendingIntent, ComponentName componentName) {
            this.i.registerMediaButtonEventReceiver(componentName);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Callback getCallback() {
            Callback callback;
            synchronized (this.f1334k) {
                callback = this.p;
            }
            return callback;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public String getCallingPackage() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public hlf getCurrentControllerInfo() {
            hlf hlfVar;
            synchronized (this.f1334k) {
                hlfVar = this.q;
            }
            return hlfVar;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Object getMediaSession() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public PlaybackStateCompat getPlaybackState() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.f1334k) {
                playbackStateCompat = this.t;
            }
            return playbackStateCompat;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Object getRemoteControlClient() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Token getSessionToken() {
            return this.e;
        }

        public final void h(boolean z) {
            for (int iBeginBroadcast = this.l.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((IMediaControllerCallback) this.l.getBroadcastItem(iBeginBroadcast)).onCaptioningEnabledChanged(z);
                } catch (RemoteException unused) {
                }
            }
            this.l.finishBroadcast();
        }

        public final void i(String str, Bundle bundle) {
            for (int iBeginBroadcast = this.l.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((IMediaControllerCallback) this.l.getBroadcastItem(iBeginBroadcast)).onEvent(str, bundle);
                } catch (RemoteException unused) {
                }
            }
            this.l.finishBroadcast();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public boolean isActive() {
            return this.o;
        }

        public final void j(Bundle bundle) {
            for (int iBeginBroadcast = this.l.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((IMediaControllerCallback) this.l.getBroadcastItem(iBeginBroadcast)).onExtrasChanged(bundle);
                } catch (RemoteException unused) {
                }
            }
            this.l.finishBroadcast();
        }

        public final void k(MediaMetadataCompat mediaMetadataCompat) {
            for (int iBeginBroadcast = this.l.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((IMediaControllerCallback) this.l.getBroadcastItem(iBeginBroadcast)).onMetadataChanged(mediaMetadataCompat);
                } catch (RemoteException unused) {
                }
            }
            this.l.finishBroadcast();
        }

        public final void l(List<QueueItem> list) {
            for (int iBeginBroadcast = this.l.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((IMediaControllerCallback) this.l.getBroadcastItem(iBeginBroadcast)).onQueueChanged(list);
                } catch (RemoteException unused) {
                }
            }
            this.l.finishBroadcast();
        }

        public final void m(CharSequence charSequence) {
            for (int iBeginBroadcast = this.l.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((IMediaControllerCallback) this.l.getBroadcastItem(iBeginBroadcast)).onQueueTitleChanged(charSequence);
                } catch (RemoteException unused) {
                }
            }
            this.l.finishBroadcast();
        }

        public final void n(int i) {
            for (int iBeginBroadcast = this.l.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((IMediaControllerCallback) this.l.getBroadcastItem(iBeginBroadcast)).onRepeatModeChanged(i);
                } catch (RemoteException unused) {
                }
            }
            this.l.finishBroadcast();
        }

        public final void o() {
            for (int iBeginBroadcast = this.l.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((IMediaControllerCallback) this.l.getBroadcastItem(iBeginBroadcast)).onSessionDestroyed();
                } catch (RemoteException unused) {
                }
            }
            this.l.finishBroadcast();
            this.l.kill();
        }

        public final void p(int i) {
            for (int iBeginBroadcast = this.l.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((IMediaControllerCallback) this.l.getBroadcastItem(iBeginBroadcast)).onShuffleModeChanged(i);
                } catch (RemoteException unused) {
                }
            }
            this.l.finishBroadcast();
        }

        public final void q(PlaybackStateCompat playbackStateCompat) {
            for (int iBeginBroadcast = this.l.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((IMediaControllerCallback) this.l.getBroadcastItem(iBeginBroadcast)).onPlaybackStateChanged(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.l.finishBroadcast();
        }

        public void r(ParcelableVolumeInfo parcelableVolumeInfo) {
            for (int iBeginBroadcast = this.l.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((IMediaControllerCallback) this.l.getBroadcastItem(iBeginBroadcast)).onVolumeInfoChanged(parcelableVolumeInfo);
                } catch (RemoteException unused) {
                }
            }
            this.l.finishBroadcast();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void release() {
            this.o = false;
            this.n = true;
            v();
            o();
            setCallback(null, null);
        }

        public void s(PlaybackStateCompat playbackStateCompat) {
            this.j.setPlaybackState(d(playbackStateCompat.getState()));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void sendSessionEvent(String str, Bundle bundle) {
            i(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setActive(boolean z) {
            if (z == this.o) {
                return;
            }
            this.o = z;
            v();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCallback(Callback callback, Handler handler) {
            synchronized (this.f1334k) {
                try {
                    MessageHandler messageHandler = this.m;
                    if (messageHandler != null) {
                        messageHandler.removeCallbacksAndMessages(null);
                    }
                    this.m = (callback == null || handler == null) ? null : new MessageHandler(handler.getLooper());
                    if (this.p != callback && this.p != null) {
                        this.p.b(null, null);
                    }
                    this.p = callback;
                    if (this.p != null) {
                        this.p.b(this, handler);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCaptioningEnabled(boolean z) {
            if (this.y != z) {
                this.y = z;
                h(z);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCurrentControllerInfo(hlf hlfVar) {
            synchronized (this.f1334k) {
                this.q = hlfVar;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setExtras(Bundle bundle) {
            this.B = bundle;
            j(bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setFlags(int i) {
            synchronized (this.f1334k) {
                this.f1335r = i | 3;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setMediaButtonReceiver(PendingIntent pendingIntent) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat = new MediaMetadataCompat.Builder(mediaMetadataCompat, MediaSessionCompat.d).build();
            }
            synchronized (this.f1334k) {
                this.s = mediaMetadataCompat;
            }
            k(mediaMetadataCompat);
            if (this.o) {
                b(mediaMetadataCompat == null ? null : mediaMetadataCompat.getBundle()).apply();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackState(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.f1334k) {
                this.t = playbackStateCompat;
            }
            q(playbackStateCompat);
            if (this.o) {
                if (playbackStateCompat == null) {
                    this.j.setPlaybackState(0);
                    this.j.setTransportControlFlags(0);
                } else {
                    s(playbackStateCompat);
                    this.j.setTransportControlFlags(e(playbackStateCompat.getActions()));
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackToLocal(int i) {
            this.D = i;
            this.C = 1;
            int i2 = this.C;
            int i3 = this.D;
            r(new ParcelableVolumeInfo(i2, i3, 2, this.i.getStreamMaxVolume(i3), this.i.getStreamVolume(this.D)));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackToRemote(y2r y2rVar) {
            throw new IllegalArgumentException("volumeProvider may not be null");
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setQueue(List<QueueItem> list) {
            this.v = list;
            l(list);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setQueueTitle(CharSequence charSequence) {
            this.w = charSequence;
            m(charSequence);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRatingType(int i) {
            this.x = i;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRepeatMode(int i) {
            if (this.z != i) {
                this.z = i;
                n(i);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setSessionActivity(PendingIntent pendingIntent) {
            synchronized (this.f1334k) {
                this.u = pendingIntent;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setShuffleMode(int i) {
            if (this.A != i) {
                this.A = i;
                p(i);
            }
        }

        public void t(int i, int i2) {
            if (this.C == 2) {
                return;
            }
            this.i.setStreamVolume(this.D, i, i2);
        }

        public void u(PendingIntent pendingIntent, ComponentName componentName) {
            this.i.unregisterMediaButtonEventReceiver(componentName);
        }

        public void v() {
            if (!this.o) {
                u(this.c, this.f1333b);
                this.j.setPlaybackState(0);
                this.i.unregisterRemoteControlClient(this.j);
            } else {
                g(this.c, this.f1333b);
                this.i.registerRemoteControlClient(this.j);
                setMetadata(this.s);
                setPlaybackState(this.t);
            }
        }
    }

    public interface OnActiveChangeListener {
        void onActiveChanged();
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new Parcelable.Creator<QueueItem>() { // from class: android.support.v4.media.session.MediaSessionCompat.QueueItem.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        };
        public static final int UNKNOWN_ID = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaDescriptionCompat f1339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f1340b;
        public MediaSession.QueueItem c;

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j) {
            this(null, mediaDescriptionCompat, j);
        }

        public static QueueItem fromQueueItem(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
            return new QueueItem(queueItem, MediaDescriptionCompat.fromMediaDescription(queueItem.getDescription()), queueItem.getQueueId());
        }

        public static List<QueueItem> fromQueueItemList(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(fromQueueItem(it.next()));
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public MediaDescriptionCompat getDescription() {
            return this.f1339a;
        }

        public long getQueueId() {
            return this.f1340b;
        }

        public Object getQueueItem() {
            MediaSession.QueueItem queueItem = this.c;
            if (queueItem != null) {
                return queueItem;
            }
            MediaSession.QueueItem queueItem2 = new MediaSession.QueueItem((MediaDescription) this.f1339a.getMediaDescription(), this.f1340b);
            this.c = queueItem2;
            return queueItem2;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f1339a + ", Id=" + this.f1340b + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f1339a.writeToParcel(parcel, i);
            parcel.writeLong(this.f1340b);
        }

        public QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (j == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.f1339a = mediaDescriptionCompat;
            this.f1340b = j;
            this.c = queueItem;
        }

        public QueueItem(Parcel parcel) {
            this.f1339a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f1340b = parcel.readLong();
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new Parcelable.Creator<Token>() { // from class: android.support.v4.media.session.MediaSessionCompat.Token.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Token[] newArray(int i) {
                return new Token[i];
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f1342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f1343b;

        @GuardedBy("mLock")
        public IMediaSession c;

        @GuardedBy("mLock")
        public lpq d;

        public Token(Object obj) {
            this(obj, null, null);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static Token fromBundle(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            IMediaSession iMediaSessionAsInterface = IMediaSession.Stub.asInterface(h63.a(bundle, MediaSessionCompat.KEY_EXTRA_BINDER));
            lpq lpqVarB = lkh.b(bundle, MediaSessionCompat.KEY_SESSION2_TOKEN);
            Token token = (Token) bundle.getParcelable(MediaSessionCompat.KEY_TOKEN);
            if (token == null) {
                return null;
            }
            return new Token(token.f1343b, iMediaSessionAsInterface, lpqVarB);
        }

        public static Token fromToken(Object obj) {
            return fromToken(obj, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f1343b;
            if (obj2 == null) {
                return token.f1343b == null;
            }
            Object obj3 = token.f1343b;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public IMediaSession getExtraBinder() {
            IMediaSession iMediaSession;
            synchronized (this.f1342a) {
                iMediaSession = this.c;
            }
            return iMediaSession;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public lpq getSession2Token() {
            lpq lpqVar;
            synchronized (this.f1342a) {
                lpqVar = this.d;
            }
            return lpqVar;
        }

        public Object getToken() {
            return this.f1343b;
        }

        public int hashCode() {
            Object obj = this.f1343b;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public void setExtraBinder(IMediaSession iMediaSession) {
            synchronized (this.f1342a) {
                this.c = iMediaSession;
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void setSession2Token(lpq lpqVar) {
            synchronized (this.f1342a) {
                this.d = lpqVar;
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaSessionCompat.KEY_TOKEN, this);
            synchronized (this.f1342a) {
                try {
                    IMediaSession iMediaSession = this.c;
                    if (iMediaSession != null) {
                        h63.b(bundle, MediaSessionCompat.KEY_EXTRA_BINDER, iMediaSession.asBinder());
                    }
                    lpq lpqVar = this.d;
                    if (lpqVar != null) {
                        lkh.c(bundle, MediaSessionCompat.KEY_SESSION2_TOKEN, lpqVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bundle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.f1343b, i);
        }

        public Token(Object obj, IMediaSession iMediaSession) {
            this(obj, iMediaSession, null);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static Token fromToken(Object obj, IMediaSession iMediaSession) {
            if (obj == null) {
                return null;
            }
            if (obj instanceof MediaSession.Token) {
                return new Token(obj, iMediaSession);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }

        public Token(Object obj, IMediaSession iMediaSession, lpq lpqVar) {
            this.f1342a = new Object();
            this.f1343b = obj;
            this.c = iMediaSession;
            this.d = lpqVar;
        }
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, null, null);
    }

    public static PlaybackStateCompat b(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        long j;
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j2 = -1;
        if (playbackStateCompat.getPosition() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.getState() != 3 && playbackStateCompat.getState() != 4 && playbackStateCompat.getState() != 5) {
            return playbackStateCompat;
        }
        long lastPositionUpdateTime = playbackStateCompat.getLastPositionUpdateTime();
        if (lastPositionUpdateTime <= 0) {
            return playbackStateCompat;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long playbackSpeed = ((long) (playbackStateCompat.getPlaybackSpeed() * (jElapsedRealtime - lastPositionUpdateTime))) + playbackStateCompat.getPosition();
        if (mediaMetadataCompat != null && mediaMetadataCompat.containsKey(MediaMetadataCompat.METADATA_KEY_DURATION)) {
            j2 = mediaMetadataCompat.getLong(MediaMetadataCompat.METADATA_KEY_DURATION);
        }
        if (j2 < 0 || playbackSpeed <= j2) {
            j = playbackSpeed < 0 ? 0L : playbackSpeed;
        } else {
            j = j2;
        }
        return new PlaybackStateCompat.Builder(playbackStateCompat).setState(playbackStateCompat.getState(), j, playbackStateCompat.getPlaybackSpeed(), jElapsedRealtime).build();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void ensureClassLoader(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static MediaSessionCompat fromMediaSession(Context context, Object obj) {
        MediaSessionImpl mediaSessionImplApi28;
        int i = Build.VERSION.SDK_INT;
        if (context == null || obj == null) {
            return null;
        }
        if (i >= 29) {
            mediaSessionImplApi28 = new MediaSessionImplApi29(obj);
        } else {
            mediaSessionImplApi28 = i >= 28 ? new MediaSessionImplApi28(obj) : new MediaSessionImplApi21(obj);
        }
        return new MediaSessionCompat(context, mediaSessionImplApi28);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Bundle unparcelWithClassLoader(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ensureClassLoader(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            return null;
        }
    }

    @RequiresApi(21)
    public final MediaSession a(Context context, String str, Bundle bundle) {
        return Build.VERSION.SDK_INT >= 29 ? flf.a(context, str, bundle) : new MediaSession(context, str);
    }

    public void addOnActiveChangeListener(OnActiveChangeListener onActiveChangeListener) {
        if (onActiveChangeListener == null) {
            throw new IllegalArgumentException("Listener may not be null");
        }
        this.c.add(onActiveChangeListener);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String getCallingPackage() {
        return this.f1320a.getCallingPackage();
    }

    public MediaControllerCompat getController() {
        return this.f1321b;
    }

    public final hlf getCurrentControllerInfo() {
        return this.f1320a.getCurrentControllerInfo();
    }

    public Object getMediaSession() {
        return this.f1320a.getMediaSession();
    }

    public Object getRemoteControlClient() {
        return this.f1320a.getRemoteControlClient();
    }

    public Token getSessionToken() {
        return this.f1320a.getSessionToken();
    }

    public boolean isActive() {
        return this.f1320a.isActive();
    }

    public void release() {
        this.f1320a.release();
    }

    public void removeOnActiveChangeListener(OnActiveChangeListener onActiveChangeListener) {
        if (onActiveChangeListener == null) {
            throw new IllegalArgumentException("Listener may not be null");
        }
        this.c.remove(onActiveChangeListener);
    }

    public void sendSessionEvent(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("event cannot be null or empty");
        }
        this.f1320a.sendSessionEvent(str, bundle);
    }

    public void setActive(boolean z) {
        this.f1320a.setActive(z);
        Iterator<OnActiveChangeListener> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().onActiveChanged();
        }
    }

    public void setCallback(Callback callback) {
        setCallback(callback, null);
    }

    public void setCaptioningEnabled(boolean z) {
        this.f1320a.setCaptioningEnabled(z);
    }

    public void setExtras(Bundle bundle) {
        this.f1320a.setExtras(bundle);
    }

    public void setFlags(int i) {
        this.f1320a.setFlags(i);
    }

    public void setMediaButtonReceiver(PendingIntent pendingIntent) {
        this.f1320a.setMediaButtonReceiver(pendingIntent);
    }

    public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {
        this.f1320a.setMetadata(mediaMetadataCompat);
    }

    public void setPlaybackState(PlaybackStateCompat playbackStateCompat) {
        this.f1320a.setPlaybackState(playbackStateCompat);
    }

    public void setPlaybackToLocal(int i) {
        this.f1320a.setPlaybackToLocal(i);
    }

    public void setPlaybackToRemote(y2r y2rVar) {
        throw new IllegalArgumentException("volumeProvider may not be null!");
    }

    public void setQueue(List<QueueItem> list) {
        if (list != null) {
            HashSet hashSet = new HashSet();
            for (QueueItem queueItem : list) {
                if (queueItem == null) {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
                if (hashSet.contains(Long.valueOf(queueItem.getQueueId()))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Found duplicate queue id: ");
                    sb.append(queueItem.getQueueId());
                    new IllegalArgumentException("id of each queue item should be unique");
                }
                hashSet.add(Long.valueOf(queueItem.getQueueId()));
            }
        }
        this.f1320a.setQueue(list);
    }

    public void setQueueTitle(CharSequence charSequence) {
        this.f1320a.setQueueTitle(charSequence);
    }

    public void setRatingType(int i) {
        this.f1320a.setRatingType(i);
    }

    public void setRepeatMode(int i) {
        this.f1320a.setRepeatMode(i);
    }

    public void setSessionActivity(PendingIntent pendingIntent) {
        this.f1320a.setSessionActivity(pendingIntent);
    }

    public void setShuffleMode(int i) {
        this.f1320a.setShuffleMode(i);
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new Parcelable.Creator<ResultReceiverWrapper>() { // from class: android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ResultReceiver f1341a;

        public ResultReceiverWrapper(ResultReceiver resultReceiver) {
            this.f1341a = resultReceiver;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f1341a.writeToParcel(parcel, i);
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f1341a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, null);
    }

    public void setCallback(Callback callback, Handler handler) {
        if (callback == null) {
            this.f1320a.setCallback(null, null);
            return;
        }
        MediaSessionImpl mediaSessionImpl = this.f1320a;
        if (handler == null) {
            handler = new Handler();
        }
        mediaSessionImpl.setCallback(callback, handler);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this(context, str, componentName, pendingIntent, bundle, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle, lpq lpqVar) {
        this.c = new ArrayList<>();
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                componentName = componentName == null ? MediaButtonReceiver.a(context) : componentName;
                if (componentName != null && pendingIntent == null) {
                    Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent.setComponent(componentName);
                    pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
                }
                int i = Build.VERSION.SDK_INT;
                MediaSession mediaSessionA = a(context, str, bundle);
                if (i >= 29) {
                    this.f1320a = new MediaSessionImplApi29(mediaSessionA, lpqVar, bundle);
                } else if (i >= 28) {
                    this.f1320a = new MediaSessionImplApi28(mediaSessionA, lpqVar, bundle);
                } else {
                    this.f1320a = new MediaSessionImplApi21(mediaSessionA, lpqVar, bundle);
                }
                setCallback(new Callback() { // from class: android.support.v4.media.session.MediaSessionCompat.1
                }, new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
                this.f1320a.setMediaButtonReceiver(pendingIntent);
                this.f1321b = new MediaControllerCompat(context, this);
                if (d == 0) {
                    d = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        throw new IllegalArgumentException("context must not be null");
    }

    @RequiresApi(21)
    public static class MediaSessionImplApi21 implements MediaSessionImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaSession f1328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Token f1329b;
        public Bundle d;
        public PlaybackStateCompat g;
        public List<QueueItem> h;
        public MediaMetadataCompat i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f1330k;
        public int l;
        public int m;

        @GuardedBy("mLock")
        public Callback n;

        @GuardedBy("mLock")
        public hlf o;
        public final Object c = new Object();
        public boolean e = false;
        public final RemoteCallbackList<IMediaControllerCallback> f = new RemoteCallbackList<>();

        public class ExtraSession extends IMediaSession.Stub {
            public ExtraSession() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void adjustVolume(int i, int i2, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void fastForward() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public Bundle getExtras() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public long getFlags() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public PendingIntent getLaunchPendingIntent() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public MediaMetadataCompat getMetadata() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public String getPackageName() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public PlaybackStateCompat getPlaybackState() {
                MediaSessionImplApi21 mediaSessionImplApi21 = MediaSessionImplApi21.this;
                return MediaSessionCompat.b(mediaSessionImplApi21.g, mediaSessionImplApi21.i);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public List<QueueItem> getQueue() {
                return null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public CharSequence getQueueTitle() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRatingType() {
                return MediaSessionImplApi21.this.j;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRepeatMode() {
                return MediaSessionImplApi21.this.l;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public Bundle getSessionInfo() {
                if (MediaSessionImplApi21.this.d == null) {
                    return null;
                }
                return new Bundle(MediaSessionImplApi21.this.d);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getShuffleMode() {
                return MediaSessionImplApi21.this.m;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public String getTag() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public ParcelableVolumeInfo getVolumeAttributes() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isCaptioningEnabled() {
                return MediaSessionImplApi21.this.f1330k;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isShuffleModeEnabledRemoved() {
                return false;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isTransportControlEnabled() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void next() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void pause() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void play() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromMediaId(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromSearch(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromUri(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepare() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromMediaId(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromSearch(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromUri(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void previous() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rate(RatingCompat ratingCompat) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void registerCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
                if (MediaSessionImplApi21.this.e) {
                    return;
                }
                MediaSessionImplApi21.this.f.register(iMediaControllerCallback, new hlf("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItemAt(int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rewind() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void seekTo(long j) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCommand(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCustomAction(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean sendMediaButton(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setCaptioningEnabled(boolean z) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setPlaybackSpeed(float f) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setRepeatMode(int i) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleMode(int i) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleModeEnabledRemoved(boolean z) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setVolumeTo(int i, int i2, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void skipToQueueItem(long j) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void stop() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
                MediaSessionImplApi21.this.f.unregister(iMediaControllerCallback);
            }
        }

        public MediaSessionImplApi21(MediaSession mediaSession, lpq lpqVar, Bundle bundle) {
            this.f1328a = mediaSession;
            this.f1329b = new Token(mediaSession.getSessionToken(), new ExtraSession(), lpqVar);
            this.d = bundle;
            setFlags(3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Callback getCallback() {
            Callback callback;
            synchronized (this.c) {
                callback = this.n;
            }
            return callback;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public String getCallingPackage() {
            try {
                return (String) this.f1328a.getClass().getMethod("getCallingPackage", new Class[0]).invoke(this.f1328a, new Object[0]);
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public hlf getCurrentControllerInfo() {
            hlf hlfVar;
            synchronized (this.c) {
                hlfVar = this.o;
            }
            return hlfVar;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Object getMediaSession() {
            return this.f1328a;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public PlaybackStateCompat getPlaybackState() {
            return this.g;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Object getRemoteControlClient() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Token getSessionToken() {
            return this.f1329b;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public boolean isActive() {
            return this.f1328a.isActive();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void release() {
            this.e = true;
            this.f.kill();
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    Field declaredField = this.f1328a.getClass().getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    Handler handler = (Handler) declaredField.get(this.f1328a);
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                } catch (Exception unused) {
                }
            }
            this.f1328a.setCallback(null);
            this.f1328a.release();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void sendSessionEvent(String str, Bundle bundle) {
            this.f1328a.sendSessionEvent(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setActive(boolean z) {
            this.f1328a.setActive(z);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCallback(Callback callback, Handler handler) {
            synchronized (this.c) {
                try {
                    this.n = callback;
                    this.f1328a.setCallback(callback == null ? null : callback.f1323b, handler);
                    if (callback != null) {
                        callback.b(this, handler);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCaptioningEnabled(boolean z) {
            if (this.f1330k != z) {
                this.f1330k = z;
                for (int iBeginBroadcast = this.f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((IMediaControllerCallback) this.f.getBroadcastItem(iBeginBroadcast)).onCaptioningEnabledChanged(z);
                    } catch (RemoteException unused) {
                    }
                }
                this.f.finishBroadcast();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCurrentControllerInfo(hlf hlfVar) {
            synchronized (this.c) {
                this.o = hlfVar;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setExtras(Bundle bundle) {
            this.f1328a.setExtras(bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        @SuppressLint({"WrongConstant"})
        public void setFlags(int i) {
            this.f1328a.setFlags(i | 3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setMediaButtonReceiver(PendingIntent pendingIntent) {
            this.f1328a.setMediaButtonReceiver(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {
            this.i = mediaMetadataCompat;
            this.f1328a.setMetadata(mediaMetadataCompat == null ? null : (MediaMetadata) mediaMetadataCompat.getMediaMetadata());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackState(PlaybackStateCompat playbackStateCompat) {
            this.g = playbackStateCompat;
            for (int iBeginBroadcast = this.f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((IMediaControllerCallback) this.f.getBroadcastItem(iBeginBroadcast)).onPlaybackStateChanged(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f.finishBroadcast();
            this.f1328a.setPlaybackState(playbackStateCompat == null ? null : (PlaybackState) playbackStateCompat.getPlaybackState());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackToLocal(int i) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i);
            this.f1328a.setPlaybackToLocal(builder.build());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackToRemote(y2r y2rVar) {
            throw null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setQueue(List<QueueItem> list) {
            this.h = list;
            if (list == null) {
                this.f1328a.setQueue(null);
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<QueueItem> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((MediaSession.QueueItem) it.next().getQueueItem());
            }
            this.f1328a.setQueue(arrayList);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setQueueTitle(CharSequence charSequence) {
            this.f1328a.setQueueTitle(charSequence);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRatingType(int i) {
            this.f1328a.setRatingType(i);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRepeatMode(int i) {
            if (this.l != i) {
                this.l = i;
                for (int iBeginBroadcast = this.f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((IMediaControllerCallback) this.f.getBroadcastItem(iBeginBroadcast)).onRepeatModeChanged(i);
                    } catch (RemoteException unused) {
                    }
                }
                this.f.finishBroadcast();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setSessionActivity(PendingIntent pendingIntent) {
            this.f1328a.setSessionActivity(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setShuffleMode(int i) {
            if (this.m != i) {
                this.m = i;
                for (int iBeginBroadcast = this.f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((IMediaControllerCallback) this.f.getBroadcastItem(iBeginBroadcast)).onShuffleModeChanged(i);
                    } catch (RemoteException unused) {
                    }
                }
                this.f.finishBroadcast();
            }
        }

        public MediaSessionImplApi21(Object obj) {
            if (obj instanceof MediaSession) {
                MediaSession mediaSession = (MediaSession) obj;
                this.f1328a = mediaSession;
                this.f1329b = new Token(mediaSession.getSessionToken(), new ExtraSession());
                this.d = null;
                setFlags(3);
                return;
            }
            throw new IllegalArgumentException("mediaSession is not a valid MediaSession object");
        }
    }

    public MediaSessionCompat(Context context, MediaSessionImpl mediaSessionImpl) {
        this.c = new ArrayList<>();
        this.f1320a = mediaSessionImpl;
        this.f1321b = new MediaControllerCompat(context, this);
    }
}
