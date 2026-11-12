package com.google.android.exoplayer2.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ControlDispatcher;
import com.google.android.exoplayer2.DefaultControlDispatcher;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.device.DeviceInfo;
import com.google.android.exoplayer2.m0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.n0;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.NotificationUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoSize;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class PlayerNotificationManager {
    public static final String ACTION_FAST_FORWARD = "com.google.android.exoplayer.ffwd";
    public static final String ACTION_NEXT = "com.google.android.exoplayer.next";
    public static final String ACTION_PAUSE = "com.google.android.exoplayer.pause";
    public static final String ACTION_PLAY = "com.google.android.exoplayer.play";
    public static final String ACTION_PREVIOUS = "com.google.android.exoplayer.prev";
    public static final String ACTION_REWIND = "com.google.android.exoplayer.rewind";
    public static final String ACTION_STOP = "com.google.android.exoplayer.stop";
    public static final String EXTRA_INSTANCE_ID = "INSTANCE_ID";
    private static final String P = "com.google.android.exoplayer.dismiss";
    private static final int Q = 0;
    private static final int R = 1;
    private static int S;
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private int G;
    private boolean H;
    private int I;
    private int J;

    @DrawableRes
    private int K;
    private int L;
    private int M;
    private boolean N;

    @Nullable
    private String O;
    private final Context a;
    private final String b;
    private final int c;
    private final MediaDescriptionAdapter d;

    @Nullable
    private final NotificationListener e;

    @Nullable
    private final CustomActionReceiver f;
    private final Handler g;
    private final NotificationManagerCompat h;
    private final IntentFilter i;
    private final Player.Listener j;
    private final b k;
    private final Map<String, NotificationCompat.Action> l;
    private final Map<String, NotificationCompat.Action> m;
    private final PendingIntent n;
    private final int o;

    @Nullable
    private NotificationCompat.Builder p;

    @Nullable
    private List<NotificationCompat.Action> q;

    @Nullable
    private Player r;
    private ControlDispatcher s;
    private boolean t;
    private int u;

    @Nullable
    private MediaSessionCompat.Token v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public final class BitmapCallback {
        private final int a;

        public void onBitmap(final Bitmap bitmap) {
            if (bitmap != null) {
                PlayerNotificationManager.this.o(bitmap, this.a);
            }
        }

        private BitmapCallback(int notificationTag) {
            this.a = notificationTag;
        }
    }

    public interface CustomActionReceiver {
        Map<String, NotificationCompat.Action> createCustomActions(Context context, int instanceId);

        List<String> getCustomActions(Player player);

        void onCustomAction(Player player, String action, Intent intent);
    }

    public interface MediaDescriptionAdapter {
        @Nullable
        PendingIntent createCurrentContentIntent(Player player);

        @Nullable
        CharSequence getCurrentContentText(Player player);

        CharSequence getCurrentContentTitle(Player player);

        @Nullable
        Bitmap getCurrentLargeIcon(Player player, BitmapCallback callback);

        @Nullable
        CharSequence getCurrentSubText(Player player);
    }

    public interface NotificationListener {
        void onNotificationCancelled(int notificationId, boolean dismissedByUser);

        void onNotificationPosted(int notificationId, Notification notification, boolean ongoing);
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Priority {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Visibility {
    }

    public class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Player player = PlayerNotificationManager.this.r;
            if (player != null && PlayerNotificationManager.this.t && intent.getIntExtra(PlayerNotificationManager.EXTRA_INSTANCE_ID, PlayerNotificationManager.this.o) == PlayerNotificationManager.this.o) {
                String action = intent.getAction();
                if (PlayerNotificationManager.ACTION_PLAY.equals(action)) {
                    if (player.getPlaybackState() == 1) {
                        PlayerNotificationManager.this.s.dispatchPrepare(player);
                    } else if (player.getPlaybackState() == 4) {
                        PlayerNotificationManager.this.s.dispatchSeekTo(player, player.getCurrentWindowIndex(), C.TIME_UNSET);
                    }
                    PlayerNotificationManager.this.s.dispatchSetPlayWhenReady(player, true);
                    return;
                }
                if (PlayerNotificationManager.ACTION_PAUSE.equals(action)) {
                    PlayerNotificationManager.this.s.dispatchSetPlayWhenReady(player, false);
                    return;
                }
                if (PlayerNotificationManager.ACTION_PREVIOUS.equals(action)) {
                    PlayerNotificationManager.this.s.dispatchPrevious(player);
                    return;
                }
                if (PlayerNotificationManager.ACTION_REWIND.equals(action)) {
                    PlayerNotificationManager.this.s.dispatchRewind(player);
                    return;
                }
                if (PlayerNotificationManager.ACTION_FAST_FORWARD.equals(action)) {
                    PlayerNotificationManager.this.s.dispatchFastForward(player);
                    return;
                }
                if (PlayerNotificationManager.ACTION_NEXT.equals(action)) {
                    PlayerNotificationManager.this.s.dispatchNext(player);
                    return;
                }
                if (PlayerNotificationManager.ACTION_STOP.equals(action)) {
                    PlayerNotificationManager.this.s.dispatchStop(player, true);
                    return;
                }
                if (PlayerNotificationManager.P.equals(action)) {
                    PlayerNotificationManager.this.s(true);
                } else {
                    if (action == null || PlayerNotificationManager.this.f == null || !PlayerNotificationManager.this.m.containsKey(action)) {
                        return;
                    }
                    PlayerNotificationManager.this.f.onCustomAction(player, action, intent);
                }
            }
        }
    }

    public class c implements Player.Listener {
        private c() {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.audio.AudioListener
        public /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
            n0.a(this, audioAttributes);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.audio.AudioListener
        public /* synthetic */ void onAudioSessionIdChanged(int i) {
            n0.b(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
            n0.c(this, commands);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.text.TextOutput
        public /* synthetic */ void onCues(List list) {
            n0.d(this, list);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.device.DeviceListener
        public /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
            n0.e(this, deviceInfo);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.device.DeviceListener
        public /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
            n0.f(this, i, z);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public void onEvents(Player player, Player.Events events) {
            if (events.containsAny(5, 6, 8, 0, 13, 12, 9, 10, 15)) {
                PlayerNotificationManager.this.n();
            }
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onIsLoadingChanged(boolean z) {
            n0.h(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onIsPlayingChanged(boolean z) {
            n0.i(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onLoadingChanged(boolean z) {
            m0.e(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onMaxSeekToPreviousPositionChanged(int i) {
            m0.f(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
            n0.j(this, mediaItem, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
            n0.k(this, mediaMetadata);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.metadata.MetadataOutput
        public /* synthetic */ void onMetadata(Metadata metadata) {
            n0.l(this, metadata);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
            n0.m(this, z, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            n0.n(this, playbackParameters);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaybackStateChanged(int i) {
            n0.o(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
            n0.p(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayerError(PlaybackException playbackException) {
            n0.q(this, playbackException);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
            n0.r(this, playbackException);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
            m0.o(this, z, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
            n0.s(this, mediaMetadata);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPositionDiscontinuity(int i) {
            m0.q(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
            n0.t(this, positionInfo, positionInfo2, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.video.VideoListener
        public /* synthetic */ void onRenderedFirstFrame() {
            n0.u(this);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onRepeatModeChanged(int i) {
            n0.v(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onSeekBackIncrementChanged(long j) {
            n0.w(this, j);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onSeekForwardIncrementChanged(long j) {
            n0.x(this, j);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onSeekProcessed() {
            m0.v(this);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
            n0.y(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.audio.AudioListener
        public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
            n0.z(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onStaticMetadataChanged(List list) {
            m0.x(this, list);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.video.VideoListener
        public /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
            n0.A(this, i, i2);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
            n0.B(this, timeline, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
            n0.C(this, trackGroupArray, trackSelectionArray);
        }

        @Override // com.google.android.exoplayer2.video.VideoListener
        public /* synthetic */ void onVideoSizeChanged(int i, int i2, int i3, float f) {
            com.google.android.exoplayer2.video.b.c(this, i, i2, i3, f);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.video.VideoListener
        public /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
            n0.D(this, videoSize);
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.audio.AudioListener
        public /* synthetic */ void onVolumeChanged(float f) {
            n0.E(this, f);
        }
    }

    private static PendingIntent k(String action, Context context, int instanceId) {
        Intent intent = new Intent(action).setPackage(context.getPackageName());
        intent.putExtra(EXTRA_INSTANCE_ID, instanceId);
        return PendingIntent.getBroadcast(context, instanceId, intent, Util.SDK_INT >= 23 ? 201326592 : AMapEngineUtils.HALF_MAX_P20_WIDTH);
    }

    private static Map<String, NotificationCompat.Action> l(Context context, int instanceId, int playActionIconResourceId, int pauseActionIconResourceId, int stopActionIconResourceId, int rewindActionIconResourceId, int fastForwardActionIconResourceId, int previousActionIconResourceId, int nextActionIconResourceId) {
        HashMap map = new HashMap();
        map.put(ACTION_PLAY, new NotificationCompat.Action(playActionIconResourceId, context.getString(R.string.exo_controls_play_description), k(ACTION_PLAY, context, instanceId)));
        map.put(ACTION_PAUSE, new NotificationCompat.Action(pauseActionIconResourceId, context.getString(R.string.exo_controls_pause_description), k(ACTION_PAUSE, context, instanceId)));
        map.put(ACTION_STOP, new NotificationCompat.Action(stopActionIconResourceId, context.getString(R.string.exo_controls_stop_description), k(ACTION_STOP, context, instanceId)));
        map.put(ACTION_REWIND, new NotificationCompat.Action(rewindActionIconResourceId, context.getString(R.string.exo_controls_rewind_description), k(ACTION_REWIND, context, instanceId)));
        map.put(ACTION_FAST_FORWARD, new NotificationCompat.Action(fastForwardActionIconResourceId, context.getString(R.string.exo_controls_fastforward_description), k(ACTION_FAST_FORWARD, context, instanceId)));
        map.put(ACTION_PREVIOUS, new NotificationCompat.Action(previousActionIconResourceId, context.getString(R.string.exo_controls_previous_description), k(ACTION_PREVIOUS, context, instanceId)));
        map.put(ACTION_NEXT, new NotificationCompat.Action(nextActionIconResourceId, context.getString(R.string.exo_controls_next_description), k(ACTION_NEXT, context, instanceId)));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m(Message msg) {
        int i = msg.what;
        if (i == 0) {
            Player player = this.r;
            if (player != null) {
                r(player, null);
            }
        } else {
            if (i != 1) {
                return false;
            }
            Player player2 = this.r;
            if (player2 != null && this.t && this.u == msg.arg1) {
                r(player2, (Bitmap) msg.obj);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (this.g.hasMessages(0)) {
            return;
        }
        this.g.sendEmptyMessage(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(Bitmap bitmap, int notificationTag) {
        this.g.obtainMessage(1, notificationTag, -1, bitmap).sendToTarget();
    }

    private static void p(NotificationCompat.Builder builder, @Nullable Bitmap largeIcon) {
        builder.setLargeIcon(largeIcon);
    }

    private boolean q(Player player) {
        return (player.getPlaybackState() == 4 || player.getPlaybackState() == 1 || !player.getPlayWhenReady()) ? false : true;
    }

    private void r(Player player, @Nullable Bitmap bitmap) {
        boolean ongoing = getOngoing(player);
        NotificationCompat.Builder builderCreateNotification = createNotification(player, this.p, ongoing, bitmap);
        this.p = builderCreateNotification;
        if (builderCreateNotification == null) {
            s(false);
            return;
        }
        Notification notificationBuild = builderCreateNotification.build();
        this.h.notify(this.c, notificationBuild);
        if (!this.t) {
            this.a.registerReceiver(this.k, this.i);
        }
        NotificationListener notificationListener = this.e;
        if (notificationListener != null) {
            notificationListener.onNotificationPosted(this.c, notificationBuild, ongoing || !this.t);
        }
        this.t = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(boolean dismissedByUser) {
        if (this.t) {
            this.t = false;
            this.g.removeMessages(0);
            this.h.cancel(this.c);
            this.a.unregisterReceiver(this.k);
            NotificationListener notificationListener = this.e;
            if (notificationListener != null) {
                notificationListener.onNotificationCancelled(this.c, dismissedByUser);
            }
        }
    }

    @Nullable
    public NotificationCompat.Builder createNotification(Player player, @Nullable NotificationCompat.Builder builder, boolean ongoing, @Nullable Bitmap largeIcon) {
        if (player.getPlaybackState() == 1 && player.getCurrentTimeline().isEmpty()) {
            this.q = null;
            return null;
        }
        List<String> actions = getActions(player);
        ArrayList arrayList = new ArrayList(actions.size());
        for (int i = 0; i < actions.size(); i++) {
            String str = actions.get(i);
            NotificationCompat.Action action = this.l.containsKey(str) ? this.l.get(str) : this.m.get(str);
            if (action != null) {
                arrayList.add(action);
            }
        }
        if (builder == null || !arrayList.equals(this.q)) {
            builder = new NotificationCompat.Builder(this.a, this.b);
            this.q = arrayList;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                builder.addAction((NotificationCompat.Action) arrayList.get(i2));
            }
        }
        androidx.media.app.NotificationCompat.MediaStyle mediaStyle = new androidx.media.app.NotificationCompat.MediaStyle();
        MediaSessionCompat.Token token = this.v;
        if (token != null) {
            mediaStyle.setMediaSession(token);
        }
        mediaStyle.setShowActionsInCompactView(getActionIndicesForCompactView(actions, player));
        mediaStyle.setShowCancelButton(!ongoing);
        mediaStyle.setCancelButtonIntent(this.n);
        builder.setStyle(mediaStyle);
        builder.setDeleteIntent(this.n);
        builder.setBadgeIconType(this.G).setOngoing(ongoing).setColor(this.J).setColorized(this.H).setSmallIcon(this.K).setVisibility(this.L).setPriority(this.M).setDefaults(this.I);
        if (Util.SDK_INT < 21 || !this.N || !player.isPlaying() || player.isPlayingAd() || player.isCurrentWindowDynamic() || player.getPlaybackParameters().speed != 1.0f) {
            builder.setShowWhen(false).setUsesChronometer(false);
        } else {
            builder.setWhen(System.currentTimeMillis() - player.getContentPosition()).setShowWhen(true).setUsesChronometer(true);
        }
        builder.setContentTitle(this.d.getCurrentContentTitle(player));
        builder.setContentText(this.d.getCurrentContentText(player));
        builder.setSubText(this.d.getCurrentSubText(player));
        if (largeIcon == null) {
            MediaDescriptionAdapter mediaDescriptionAdapter = this.d;
            int i3 = this.u + 1;
            this.u = i3;
            largeIcon = mediaDescriptionAdapter.getCurrentLargeIcon(player, new BitmapCallback(i3));
        }
        p(builder, largeIcon);
        builder.setContentIntent(this.d.createCurrentContentIntent(player));
        String str2 = this.O;
        if (str2 != null) {
            builder.setGroup(str2);
        }
        builder.setOnlyAlertOnce(true);
        return builder;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    public int[] getActionIndicesForCompactView(List<String> actionNames, Player player) {
        int iIndexOf;
        int iIndexOf2;
        int i;
        int iIndexOf3 = actionNames.indexOf(ACTION_PAUSE);
        int iIndexOf4 = actionNames.indexOf(ACTION_PLAY);
        if (this.y) {
            iIndexOf = actionNames.indexOf(ACTION_PREVIOUS);
        } else {
            iIndexOf = this.C ? actionNames.indexOf(ACTION_REWIND) : -1;
        }
        if (this.z) {
            iIndexOf2 = actionNames.indexOf(ACTION_NEXT);
        } else {
            iIndexOf2 = this.D ? actionNames.indexOf(ACTION_FAST_FORWARD) : -1;
        }
        int[] iArr = new int[3];
        int i2 = 0;
        if (iIndexOf != -1) {
            iArr[0] = iIndexOf;
            i2 = 1;
        }
        boolean zQ = q(player);
        if (iIndexOf3 == -1 || !zQ) {
            if (iIndexOf4 != -1 && !zQ) {
                i = i2 + 1;
                iArr[i2] = iIndexOf4;
            }
            if (iIndexOf2 != -1) {
                iArr[i2] = iIndexOf2;
                i2++;
            }
            return Arrays.copyOf(iArr, i2);
        }
        i = i2 + 1;
        iArr[i2] = iIndexOf3;
        i2 = i;
        if (iIndexOf2 != -1) {
            iArr[i2] = iIndexOf2;
            i2++;
        }
        return Arrays.copyOf(iArr, i2);
    }

    public List<String> getActions(Player player) {
        boolean zIsCommandAvailable = player.isCommandAvailable(6);
        boolean z = player.isCommandAvailable(10) && this.s.isRewindEnabled();
        boolean z2 = player.isCommandAvailable(11) && this.s.isFastForwardEnabled();
        boolean zIsCommandAvailable2 = player.isCommandAvailable(8);
        ArrayList arrayList = new ArrayList();
        if (this.w && zIsCommandAvailable) {
            arrayList.add(ACTION_PREVIOUS);
        }
        if (this.A && z) {
            arrayList.add(ACTION_REWIND);
        }
        if (this.E) {
            if (q(player)) {
                arrayList.add(ACTION_PAUSE);
            } else {
                arrayList.add(ACTION_PLAY);
            }
        }
        if (this.B && z2) {
            arrayList.add(ACTION_FAST_FORWARD);
        }
        if (this.x && zIsCommandAvailable2) {
            arrayList.add(ACTION_NEXT);
        }
        CustomActionReceiver customActionReceiver = this.f;
        if (customActionReceiver != null) {
            arrayList.addAll(customActionReceiver.getCustomActions(player));
        }
        if (this.F) {
            arrayList.add(ACTION_STOP);
        }
        return arrayList;
    }

    public boolean getOngoing(Player player) {
        int playbackState = player.getPlaybackState();
        return (playbackState == 2 || playbackState == 3) && player.getPlayWhenReady();
    }

    public void invalidate() {
        if (this.t) {
            n();
        }
    }

    public final void setBadgeIconType(int badgeIconType) {
        if (this.G == badgeIconType) {
            return;
        }
        if (badgeIconType != 0 && badgeIconType != 1 && badgeIconType != 2) {
            throw new IllegalArgumentException();
        }
        this.G = badgeIconType;
        invalidate();
    }

    public final void setColor(int color) {
        if (this.J != color) {
            this.J = color;
            invalidate();
        }
    }

    public final void setColorized(boolean colorized) {
        if (this.H != colorized) {
            this.H = colorized;
            invalidate();
        }
    }

    @Deprecated
    public final void setControlDispatcher(ControlDispatcher controlDispatcher) {
        if (this.s != controlDispatcher) {
            this.s = controlDispatcher;
            invalidate();
        }
    }

    public final void setDefaults(int defaults) {
        if (this.I != defaults) {
            this.I = defaults;
            invalidate();
        }
    }

    public final void setMediaSessionToken(MediaSessionCompat.Token token) {
        if (Util.areEqual(this.v, token)) {
            return;
        }
        this.v = token;
        invalidate();
    }

    public final void setPlayer(@Nullable Player player) {
        boolean z = true;
        Assertions.checkState(Looper.myLooper() == Looper.getMainLooper());
        if (player != null && player.getApplicationLooper() != Looper.getMainLooper()) {
            z = false;
        }
        Assertions.checkArgument(z);
        Player player2 = this.r;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.removeListener(this.j);
            if (player == null) {
                s(false);
            }
        }
        this.r = player;
        if (player != null) {
            player.addListener(this.j);
            n();
        }
    }

    public final void setPriority(int priority) {
        if (this.M == priority) {
            return;
        }
        if (priority != -2 && priority != -1 && priority != 0 && priority != 1 && priority != 2) {
            throw new IllegalArgumentException();
        }
        this.M = priority;
        invalidate();
    }

    public final void setSmallIcon(@DrawableRes int smallIconResourceId) {
        if (this.K != smallIconResourceId) {
            this.K = smallIconResourceId;
            invalidate();
        }
    }

    public final void setUseChronometer(boolean useChronometer) {
        if (this.N != useChronometer) {
            this.N = useChronometer;
            invalidate();
        }
    }

    public void setUseFastForwardAction(boolean useFastForwardAction) {
        if (this.B != useFastForwardAction) {
            this.B = useFastForwardAction;
            invalidate();
        }
    }

    public void setUseFastForwardActionInCompactView(boolean useFastForwardActionInCompactView) {
        if (this.D != useFastForwardActionInCompactView) {
            this.D = useFastForwardActionInCompactView;
            if (useFastForwardActionInCompactView) {
                this.z = false;
            }
            invalidate();
        }
    }

    public void setUseNextAction(boolean useNextAction) {
        if (this.x != useNextAction) {
            this.x = useNextAction;
            invalidate();
        }
    }

    public void setUseNextActionInCompactView(boolean useNextActionInCompactView) {
        if (this.z != useNextActionInCompactView) {
            this.z = useNextActionInCompactView;
            if (useNextActionInCompactView) {
                this.D = false;
            }
            invalidate();
        }
    }

    public final void setUsePlayPauseActions(boolean usePlayPauseActions) {
        if (this.E != usePlayPauseActions) {
            this.E = usePlayPauseActions;
            invalidate();
        }
    }

    public void setUsePreviousAction(boolean usePreviousAction) {
        if (this.w != usePreviousAction) {
            this.w = usePreviousAction;
            invalidate();
        }
    }

    public void setUsePreviousActionInCompactView(boolean usePreviousActionInCompactView) {
        if (this.y != usePreviousActionInCompactView) {
            this.y = usePreviousActionInCompactView;
            if (usePreviousActionInCompactView) {
                this.C = false;
            }
            invalidate();
        }
    }

    public void setUseRewindAction(boolean useRewindAction) {
        if (this.A != useRewindAction) {
            this.A = useRewindAction;
            invalidate();
        }
    }

    public void setUseRewindActionInCompactView(boolean useRewindActionInCompactView) {
        if (this.C != useRewindActionInCompactView) {
            this.C = useRewindActionInCompactView;
            if (useRewindActionInCompactView) {
                this.y = false;
            }
            invalidate();
        }
    }

    public final void setUseStopAction(boolean useStopAction) {
        if (this.F == useStopAction) {
            return;
        }
        this.F = useStopAction;
        invalidate();
    }

    public final void setVisibility(int visibility) {
        if (this.L == visibility) {
            return;
        }
        if (visibility != -1 && visibility != 0 && visibility != 1) {
            throw new IllegalStateException();
        }
        this.L = visibility;
        invalidate();
    }

    public static class Builder {
        private final Context a;
        private final int b;
        private final String c;

        @Nullable
        private NotificationListener d;

        @Nullable
        private CustomActionReceiver e;
        private MediaDescriptionAdapter f;
        private int g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;
        private int n;
        private int o;
        private int p;
        private int q;

        @Nullable
        private String r;

        @Deprecated
        public Builder(Context context, int notificationId, String channelId, MediaDescriptionAdapter mediaDescriptionAdapter) {
            this(context, notificationId, channelId);
            this.f = mediaDescriptionAdapter;
        }

        public PlayerNotificationManager build() {
            int i = this.g;
            if (i != 0) {
                NotificationUtil.createNotificationChannel(this.a, this.c, i, this.h, this.i);
            }
            return new PlayerNotificationManager(this.a, this.c, this.b, this.f, this.d, this.e, this.j, this.l, this.m, this.n, this.k, this.o, this.p, this.q, this.r);
        }

        public Builder setChannelDescriptionResourceId(int channelDescriptionResourceId) {
            this.h = channelDescriptionResourceId;
            return this;
        }

        public Builder setChannelImportance(int channelImportance) {
            this.i = channelImportance;
            return this;
        }

        public Builder setChannelNameResourceId(int channelNameResourceId) {
            this.g = channelNameResourceId;
            return this;
        }

        public Builder setCustomActionReceiver(CustomActionReceiver customActionReceiver) {
            this.e = customActionReceiver;
            return this;
        }

        public Builder setFastForwardActionIconResourceId(int fastForwardActionIconResourceId) {
            this.o = fastForwardActionIconResourceId;
            return this;
        }

        public Builder setGroup(String groupKey) {
            this.r = groupKey;
            return this;
        }

        public Builder setMediaDescriptionAdapter(MediaDescriptionAdapter mediaDescriptionAdapter) {
            this.f = mediaDescriptionAdapter;
            return this;
        }

        public Builder setNextActionIconResourceId(int nextActionIconResourceId) {
            this.q = nextActionIconResourceId;
            return this;
        }

        public Builder setNotificationListener(NotificationListener notificationListener) {
            this.d = notificationListener;
            return this;
        }

        public Builder setPauseActionIconResourceId(int pauseActionIconResourceId) {
            this.m = pauseActionIconResourceId;
            return this;
        }

        public Builder setPlayActionIconResourceId(int playActionIconResourceId) {
            this.l = playActionIconResourceId;
            return this;
        }

        public Builder setPreviousActionIconResourceId(int previousActionIconResourceId) {
            this.p = previousActionIconResourceId;
            return this;
        }

        public Builder setRewindActionIconResourceId(int rewindActionIconResourceId) {
            this.k = rewindActionIconResourceId;
            return this;
        }

        public Builder setSmallIconResourceId(int smallIconResourceId) {
            this.j = smallIconResourceId;
            return this;
        }

        public Builder setStopActionIconResourceId(int stopActionIconResourceId) {
            this.n = stopActionIconResourceId;
            return this;
        }

        public Builder(Context context, int notificationId, String channelId) {
            Assertions.checkArgument(notificationId > 0);
            this.a = context;
            this.b = notificationId;
            this.c = channelId;
            this.i = 2;
            this.f = new DefaultMediaDescriptionAdapter(null);
            this.j = R.drawable.exo_notification_small_icon;
            this.l = R.drawable.exo_notification_play;
            this.m = R.drawable.exo_notification_pause;
            this.n = R.drawable.exo_notification_stop;
            this.k = R.drawable.exo_notification_rewind;
            this.o = R.drawable.exo_notification_fastforward;
            this.p = R.drawable.exo_notification_previous;
            this.q = R.drawable.exo_notification_next;
        }
    }

    private PlayerNotificationManager(Context context, String channelId, int notificationId, MediaDescriptionAdapter mediaDescriptionAdapter, @Nullable NotificationListener notificationListener, @Nullable CustomActionReceiver customActionReceiver, int smallIconResourceId, int playActionIconResourceId, int pauseActionIconResourceId, int stopActionIconResourceId, int rewindActionIconResourceId, int fastForwardActionIconResourceId, int previousActionIconResourceId, int nextActionIconResourceId, @Nullable String groupKey) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = channelId;
        this.c = notificationId;
        this.d = mediaDescriptionAdapter;
        this.e = notificationListener;
        this.f = customActionReceiver;
        this.K = smallIconResourceId;
        this.O = groupKey;
        this.s = new DefaultControlDispatcher();
        int i = S;
        S = i + 1;
        this.o = i;
        this.g = Util.createHandler(Looper.getMainLooper(), new Handler.Callback() { // from class: k16
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.a.m(message);
            }
        });
        this.h = NotificationManagerCompat.from(applicationContext);
        this.j = new c();
        this.k = new b();
        this.i = new IntentFilter();
        this.w = true;
        this.x = true;
        this.E = true;
        this.A = true;
        this.B = true;
        this.H = true;
        this.N = true;
        this.J = 0;
        this.I = 0;
        this.M = -1;
        this.G = 1;
        this.L = 1;
        Map<String, NotificationCompat.Action> mapL = l(applicationContext, i, playActionIconResourceId, pauseActionIconResourceId, stopActionIconResourceId, rewindActionIconResourceId, fastForwardActionIconResourceId, previousActionIconResourceId, nextActionIconResourceId);
        this.l = mapL;
        Iterator<String> it2 = mapL.keySet().iterator();
        while (it2.hasNext()) {
            this.i.addAction(it2.next());
        }
        Map<String, NotificationCompat.Action> mapCreateCustomActions = customActionReceiver != null ? customActionReceiver.createCustomActions(applicationContext, this.o) : Collections.emptyMap();
        this.m = mapCreateCustomActions;
        Iterator<String> it3 = mapCreateCustomActions.keySet().iterator();
        while (it3.hasNext()) {
            this.i.addAction(it3.next());
        }
        this.n = k(P, applicationContext, this.o);
        this.i.addAction(P);
    }
}
