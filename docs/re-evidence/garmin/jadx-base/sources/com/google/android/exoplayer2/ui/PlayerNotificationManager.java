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
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.NotificationUtil;
import com.google.android.exoplayer2.util.Util;
import j20.x;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import z6.a0;
import z6.q;

/* JADX INFO: loaded from: classes14.dex */
public class PlayerNotificationManager {
    private static final String ACTION_DISMISS = "com.google.android.exoplayer.dismiss";
    public static final String ACTION_FAST_FORWARD = "com.google.android.exoplayer.ffwd";
    public static final String ACTION_NEXT = "com.google.android.exoplayer.next";
    public static final String ACTION_PAUSE = "com.google.android.exoplayer.pause";
    public static final String ACTION_PLAY = "com.google.android.exoplayer.play";
    public static final String ACTION_PREVIOUS = "com.google.android.exoplayer.prev";
    public static final String ACTION_REWIND = "com.google.android.exoplayer.rewind";
    public static final String ACTION_STOP = "com.google.android.exoplayer.stop";
    public static final String EXTRA_INSTANCE_ID = "INSTANCE_ID";
    private static final int MSG_START_OR_UPDATE_NOTIFICATION = 0;
    private static final int MSG_UPDATE_NOTIFICATION_BITMAP = 1;
    private static int instanceIdCounter;
    private int badgeIconType;
    private q builder;
    private List<z6.k> builderActions;
    private final String channelId;
    private int color;
    private boolean colorized;
    private final Context context;
    private int currentNotificationTag;
    private final CustomActionReceiver customActionReceiver;
    private final Map<String, z6.k> customActions;
    private int defaults;
    private final PendingIntent dismissPendingIntent;
    private String groupKey;
    private final int instanceId;
    private final IntentFilter intentFilter;
    private boolean isNotificationStarted;
    private final Handler mainHandler;
    private final MediaDescriptionAdapter mediaDescriptionAdapter;
    private MediaSessionCompat.Token mediaSessionToken;
    private final NotificationBroadcastReceiver notificationBroadcastReceiver;
    private final int notificationId;
    private final NotificationListener notificationListener;
    private final a0 notificationManager;
    private final Map<String, z6.k> playbackActions;
    private Player player;
    private final Player.Listener playerListener;
    private int priority;
    private int smallIconResourceId;
    private boolean useChronometer;
    private boolean useFastForwardAction;
    private boolean useFastForwardActionInCompactView;
    private boolean useNextAction;
    private boolean useNextActionInCompactView;
    private boolean usePlayPauseActions;
    private boolean usePreviousAction;
    private boolean usePreviousActionInCompactView;
    private boolean useRewindAction;
    private boolean useRewindActionInCompactView;
    private boolean useStopAction;
    private int visibility;

    public final class BitmapCallback {
        private final int notificationTag;

        private BitmapCallback(int i14) {
            this.notificationTag = i14;
        }

        public void onBitmap(Bitmap bitmap) {
            if (bitmap != null) {
                PlayerNotificationManager.this.postUpdateNotificationBitmap(bitmap, this.notificationTag);
            }
        }
    }

    public interface CustomActionReceiver {
        Map<String, z6.k> createCustomActions(Context context, int i14);

        List<String> getCustomActions(Player player);

        void onCustomAction(Player player, String str, Intent intent);
    }

    public interface MediaDescriptionAdapter {
        PendingIntent createCurrentContentIntent(Player player);

        CharSequence getCurrentContentText(Player player);

        CharSequence getCurrentContentTitle(Player player);

        Bitmap getCurrentLargeIcon(Player player, BitmapCallback bitmapCallback);

        default CharSequence getCurrentSubText(Player player) {
            return null;
        }
    }

    public class NotificationBroadcastReceiver extends BroadcastReceiver {
        private NotificationBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Player player = PlayerNotificationManager.this.player;
            if (player != null && PlayerNotificationManager.this.isNotificationStarted && intent.getIntExtra(PlayerNotificationManager.EXTRA_INSTANCE_ID, PlayerNotificationManager.this.instanceId) == PlayerNotificationManager.this.instanceId) {
                String action = intent.getAction();
                if (PlayerNotificationManager.ACTION_PLAY.equals(action)) {
                    if (player.getPlaybackState() == 1) {
                        player.prepare();
                    } else if (player.getPlaybackState() == 4) {
                        player.seekToDefaultPosition(player.getCurrentMediaItemIndex());
                    }
                    player.play();
                    return;
                }
                if (PlayerNotificationManager.ACTION_PAUSE.equals(action)) {
                    player.pause();
                    return;
                }
                if (PlayerNotificationManager.ACTION_PREVIOUS.equals(action)) {
                    player.seekToPrevious();
                    return;
                }
                if (PlayerNotificationManager.ACTION_REWIND.equals(action)) {
                    player.seekBack();
                    return;
                }
                if (PlayerNotificationManager.ACTION_FAST_FORWARD.equals(action)) {
                    player.seekForward();
                    return;
                }
                if (PlayerNotificationManager.ACTION_NEXT.equals(action)) {
                    player.seekToNext();
                    return;
                }
                if (PlayerNotificationManager.ACTION_STOP.equals(action)) {
                    player.stop(true);
                    return;
                }
                if (PlayerNotificationManager.ACTION_DISMISS.equals(action)) {
                    PlayerNotificationManager.this.stopNotification(true);
                } else {
                    if (action == null || PlayerNotificationManager.this.customActionReceiver == null || !PlayerNotificationManager.this.customActions.containsKey(action)) {
                        return;
                    }
                    PlayerNotificationManager.this.customActionReceiver.onCustomAction(player, action, intent);
                }
            }
        }
    }

    public interface NotificationListener {
        default void onNotificationCancelled(int i14, boolean z14) {
        }

        default void onNotificationPosted(int i14, Notification notification, boolean z14) {
        }
    }

    public class PlayerListener implements Player.Listener {
        private PlayerListener() {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onEvents(Player player, Player.Events events) {
            if (events.containsAny(4, 5, 7, 0, 12, 11, 8, 9, 14)) {
                PlayerNotificationManager.this.postStartOrUpdateNotification();
            }
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Priority {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Visibility {
    }

    public PlayerNotificationManager(Context context, String str, int i14, MediaDescriptionAdapter mediaDescriptionAdapter, NotificationListener notificationListener, CustomActionReceiver customActionReceiver, int i15, int i16, int i17, int i18, int i19, int i24, int i25, int i26, String str2) {
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.channelId = str;
        this.notificationId = i14;
        this.mediaDescriptionAdapter = mediaDescriptionAdapter;
        this.notificationListener = notificationListener;
        this.customActionReceiver = customActionReceiver;
        this.smallIconResourceId = i15;
        this.groupKey = str2;
        int i27 = instanceIdCounter;
        instanceIdCounter = i27 + 1;
        this.instanceId = i27;
        this.mainHandler = Util.createHandler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.exoplayer2.ui.d
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f53109a.handleMessage(message);
            }
        });
        this.notificationManager = a0.a(applicationContext);
        this.playerListener = new PlayerListener();
        this.notificationBroadcastReceiver = new NotificationBroadcastReceiver();
        this.intentFilter = new IntentFilter();
        this.usePreviousAction = true;
        this.useNextAction = true;
        this.usePlayPauseActions = true;
        this.useRewindAction = true;
        this.useFastForwardAction = true;
        this.colorized = true;
        this.useChronometer = true;
        this.color = 0;
        this.defaults = 0;
        this.priority = -1;
        this.badgeIconType = 1;
        this.visibility = 1;
        Map<String, z6.k> mapCreatePlaybackActions = createPlaybackActions(applicationContext, i27, i16, i17, i18, i19, i24, i25, i26);
        this.playbackActions = mapCreatePlaybackActions;
        Iterator<String> it = mapCreatePlaybackActions.keySet().iterator();
        while (it.hasNext()) {
            this.intentFilter.addAction(it.next());
        }
        Map<String, z6.k> mapCreateCustomActions = customActionReceiver != null ? customActionReceiver.createCustomActions(applicationContext, this.instanceId) : Collections.EMPTY_MAP;
        this.customActions = mapCreateCustomActions;
        Iterator<String> it3 = mapCreateCustomActions.keySet().iterator();
        while (it3.hasNext()) {
            this.intentFilter.addAction(it3.next());
        }
        this.dismissPendingIntent = createBroadcastIntent(ACTION_DISMISS, applicationContext, this.instanceId);
        this.intentFilter.addAction(ACTION_DISMISS);
    }

    private static PendingIntent createBroadcastIntent(String str, Context context, int i14) {
        Intent intent = new Intent(str).setPackage(context.getPackageName());
        intent.putExtra(EXTRA_INSTANCE_ID, i14);
        return PendingIntent.getBroadcast(context, i14, intent, Util.SDK_INT >= 23 ? 201326592 : 134217728);
    }

    private static Map<String, z6.k> createPlaybackActions(Context context, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
        HashMap map = new HashMap();
        map.put(ACTION_PLAY, new z6.k(i15, context.getString(R.string.exo_controls_play_description), createBroadcastIntent(ACTION_PLAY, context, i14)));
        map.put(ACTION_PAUSE, new z6.k(i16, context.getString(R.string.exo_controls_pause_description), createBroadcastIntent(ACTION_PAUSE, context, i14)));
        map.put(ACTION_STOP, new z6.k(i17, context.getString(R.string.exo_controls_stop_description), createBroadcastIntent(ACTION_STOP, context, i14)));
        map.put(ACTION_REWIND, new z6.k(i18, context.getString(R.string.exo_controls_rewind_description), createBroadcastIntent(ACTION_REWIND, context, i14)));
        map.put(ACTION_FAST_FORWARD, new z6.k(i19, context.getString(R.string.exo_controls_fastforward_description), createBroadcastIntent(ACTION_FAST_FORWARD, context, i14)));
        map.put(ACTION_PREVIOUS, new z6.k(i24, context.getString(R.string.exo_controls_previous_description), createBroadcastIntent(ACTION_PREVIOUS, context, i14)));
        map.put(ACTION_NEXT, new z6.k(i25, context.getString(R.string.exo_controls_next_description), createBroadcastIntent(ACTION_NEXT, context, i14)));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        int i14 = message.what;
        if (i14 == 0) {
            Player player = this.player;
            if (player != null) {
                startOrUpdateNotification(player, null);
            }
        } else {
            if (i14 != 1) {
                return false;
            }
            Player player2 = this.player;
            if (player2 != null && this.isNotificationStarted && this.currentNotificationTag == message.arg1) {
                startOrUpdateNotification(player2, (Bitmap) message.obj);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postStartOrUpdateNotification() {
        if (this.mainHandler.hasMessages(0)) {
            return;
        }
        this.mainHandler.sendEmptyMessage(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postUpdateNotificationBitmap(Bitmap bitmap, int i14) {
        this.mainHandler.obtainMessage(1, i14, -1, bitmap).sendToTarget();
    }

    private static void setLargeIcon(q qVar, Bitmap bitmap) {
        qVar.j(bitmap);
    }

    private boolean shouldShowPauseButton(Player player) {
        return (player.getPlaybackState() == 4 || player.getPlaybackState() == 1 || !player.getPlayWhenReady()) ? false : true;
    }

    private void startOrUpdateNotification(Player player, Bitmap bitmap) {
        boolean ongoing = getOngoing(player);
        q qVarCreateNotification = createNotification(player, this.builder, ongoing, bitmap);
        this.builder = qVarCreateNotification;
        if (qVarCreateNotification == null) {
            stopNotification(false);
            return;
        }
        Notification notificationC = qVarCreateNotification.c();
        this.notificationManager.c(this.notificationId, notificationC);
        if (!this.isNotificationStarted) {
            this.context.registerReceiver(this.notificationBroadcastReceiver, this.intentFilter);
        }
        NotificationListener notificationListener = this.notificationListener;
        if (notificationListener != null) {
            notificationListener.onNotificationPosted(this.notificationId, notificationC, ongoing || !this.isNotificationStarted);
        }
        this.isNotificationStarted = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopNotification(boolean z14) {
        if (this.isNotificationStarted) {
            this.isNotificationStarted = false;
            this.mainHandler.removeMessages(0);
            a0 a0Var = this.notificationManager;
            a0Var.f202582b.cancel(null, this.notificationId);
            this.context.unregisterReceiver(this.notificationBroadcastReceiver);
            NotificationListener notificationListener = this.notificationListener;
            if (notificationListener != null) {
                notificationListener.onNotificationCancelled(this.notificationId, z14);
            }
        }
    }

    public q createNotification(Player player, q qVar, boolean z14, Bitmap bitmap) {
        if (player.getPlaybackState() == 1 && player.getCurrentTimeline().isEmpty()) {
            this.builderActions = null;
            return null;
        }
        List<String> actions = getActions(player);
        ArrayList arrayList = new ArrayList(actions.size());
        for (int i14 = 0; i14 < actions.size(); i14++) {
            String str = actions.get(i14);
            z6.k kVar = this.playbackActions.containsKey(str) ? this.playbackActions.get(str) : this.customActions.get(str);
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        if (qVar == null || !arrayList.equals(this.builderActions)) {
            qVar = new q(this.context, this.channelId);
            this.builderActions = arrayList;
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                qVar.b((z6.k) arrayList.get(i15));
            }
        }
        Notification notification = qVar.N;
        ba.c cVar = new ba.c();
        MediaSessionCompat.Token token = this.mediaSessionToken;
        if (token != null) {
            cVar.f16964f = token;
        }
        cVar.f16963e = getActionIndicesForCompactView(actions, player);
        qVar.l(cVar);
        notification.deleteIntent = this.dismissPendingIntent;
        qVar.H = this.badgeIconType;
        qVar.i(2, z14);
        qVar.D = this.color;
        qVar.f202704z = this.colorized;
        qVar.A = true;
        notification.icon = this.smallIconResourceId;
        qVar.E = this.visibility;
        qVar.f202691m = this.priority;
        qVar.h(this.defaults);
        if (Util.SDK_INT < 21 || !this.useChronometer || !player.isPlaying() || player.isPlayingAd() || player.isCurrentMediaItemDynamic() || player.getPlaybackParameters().speed != 1.0f) {
            qVar.f202692n = false;
            qVar.f202693o = false;
        } else {
            notification.when = System.currentTimeMillis() - player.getContentPosition();
            qVar.f202692n = true;
            qVar.f202693o = true;
        }
        qVar.g(this.mediaDescriptionAdapter.getCurrentContentTitle(player));
        qVar.f(this.mediaDescriptionAdapter.getCurrentContentText(player));
        qVar.f202695q = q.e(this.mediaDescriptionAdapter.getCurrentSubText(player));
        if (bitmap == null) {
            MediaDescriptionAdapter mediaDescriptionAdapter = this.mediaDescriptionAdapter;
            int i16 = this.currentNotificationTag + 1;
            this.currentNotificationTag = i16;
            bitmap = mediaDescriptionAdapter.getCurrentLargeIcon(player, new BitmapCallback(i16));
        }
        setLargeIcon(qVar, bitmap);
        qVar.f202686h = this.mediaDescriptionAdapter.createCurrentContentIntent(player);
        String str2 = this.groupKey;
        if (str2 != null) {
            qVar.f202700v = str2;
        }
        qVar.i(8, true);
        return qVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    public int[] getActionIndicesForCompactView(List<String> list, Player player) {
        int iIndexOf;
        int iIndexOf2;
        int i14;
        int iIndexOf3 = list.indexOf(ACTION_PAUSE);
        int iIndexOf4 = list.indexOf(ACTION_PLAY);
        if (this.usePreviousActionInCompactView) {
            iIndexOf = list.indexOf(ACTION_PREVIOUS);
        } else {
            iIndexOf = this.useRewindActionInCompactView ? list.indexOf(ACTION_REWIND) : -1;
        }
        if (this.useNextActionInCompactView) {
            iIndexOf2 = list.indexOf(ACTION_NEXT);
        } else {
            iIndexOf2 = this.useFastForwardActionInCompactView ? list.indexOf(ACTION_FAST_FORWARD) : -1;
        }
        int[] iArr = new int[3];
        int i15 = 0;
        if (iIndexOf != -1) {
            iArr[0] = iIndexOf;
            i15 = 1;
        }
        boolean zShouldShowPauseButton = shouldShowPauseButton(player);
        if (iIndexOf3 == -1 || !zShouldShowPauseButton) {
            if (iIndexOf4 != -1 && !zShouldShowPauseButton) {
                i14 = i15 + 1;
                iArr[i15] = iIndexOf4;
            }
            if (iIndexOf2 != -1) {
                iArr[i15] = iIndexOf2;
                i15++;
            }
            return Arrays.copyOf(iArr, i15);
        }
        i14 = i15 + 1;
        iArr[i15] = iIndexOf3;
        i15 = i14;
        if (iIndexOf2 != -1) {
            iArr[i15] = iIndexOf2;
            i15++;
        }
        return Arrays.copyOf(iArr, i15);
    }

    public List<String> getActions(Player player) {
        boolean zIsCommandAvailable = player.isCommandAvailable(7);
        boolean zIsCommandAvailable2 = player.isCommandAvailable(11);
        boolean zIsCommandAvailable3 = player.isCommandAvailable(12);
        boolean zIsCommandAvailable4 = player.isCommandAvailable(9);
        ArrayList arrayList = new ArrayList();
        if (this.usePreviousAction && zIsCommandAvailable) {
            arrayList.add(ACTION_PREVIOUS);
        }
        if (this.useRewindAction && zIsCommandAvailable2) {
            arrayList.add(ACTION_REWIND);
        }
        if (this.usePlayPauseActions) {
            if (shouldShowPauseButton(player)) {
                arrayList.add(ACTION_PAUSE);
            } else {
                arrayList.add(ACTION_PLAY);
            }
        }
        if (this.useFastForwardAction && zIsCommandAvailable3) {
            arrayList.add(ACTION_FAST_FORWARD);
        }
        if (this.useNextAction && zIsCommandAvailable4) {
            arrayList.add(ACTION_NEXT);
        }
        CustomActionReceiver customActionReceiver = this.customActionReceiver;
        if (customActionReceiver != null) {
            arrayList.addAll(customActionReceiver.getCustomActions(player));
        }
        if (this.useStopAction) {
            arrayList.add(ACTION_STOP);
        }
        return arrayList;
    }

    public boolean getOngoing(Player player) {
        int playbackState = player.getPlaybackState();
        return (playbackState == 2 || playbackState == 3) && player.getPlayWhenReady();
    }

    public final void invalidate() {
        if (this.isNotificationStarted) {
            postStartOrUpdateNotification();
        }
    }

    public final void setBadgeIconType(int i14) {
        if (this.badgeIconType == i14) {
            return;
        }
        if (i14 != 0 && i14 != 1 && i14 != 2) {
            vb.h.w();
        } else {
            this.badgeIconType = i14;
            invalidate();
        }
    }

    public final void setColor(int i14) {
        if (this.color != i14) {
            this.color = i14;
            invalidate();
        }
    }

    public final void setColorized(boolean z14) {
        if (this.colorized != z14) {
            this.colorized = z14;
            invalidate();
        }
    }

    public final void setDefaults(int i14) {
        if (this.defaults != i14) {
            this.defaults = i14;
            invalidate();
        }
    }

    public final void setMediaSessionToken(MediaSessionCompat.Token token) {
        if (Util.areEqual(this.mediaSessionToken, token)) {
            return;
        }
        this.mediaSessionToken = token;
        invalidate();
    }

    public final void setPlayer(Player player) {
        boolean z14 = true;
        Assertions.checkState(Looper.myLooper() == Looper.getMainLooper());
        if (player != null && player.getApplicationLooper() != Looper.getMainLooper()) {
            z14 = false;
        }
        Assertions.checkArgument(z14);
        Player player2 = this.player;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.removeListener(this.playerListener);
            if (player == null) {
                stopNotification(false);
            }
        }
        this.player = player;
        if (player != null) {
            player.addListener(this.playerListener);
            postStartOrUpdateNotification();
        }
    }

    public final void setPriority(int i14) {
        if (this.priority == i14) {
            return;
        }
        if (i14 != -2 && i14 != -1 && i14 != 0 && i14 != 1 && i14 != 2) {
            vb.h.w();
        } else {
            this.priority = i14;
            invalidate();
        }
    }

    public final void setSmallIcon(int i14) {
        if (this.smallIconResourceId != i14) {
            this.smallIconResourceId = i14;
            invalidate();
        }
    }

    public final void setUseChronometer(boolean z14) {
        if (this.useChronometer != z14) {
            this.useChronometer = z14;
            invalidate();
        }
    }

    public final void setUseFastForwardAction(boolean z14) {
        if (this.useFastForwardAction != z14) {
            this.useFastForwardAction = z14;
            invalidate();
        }
    }

    public final void setUseFastForwardActionInCompactView(boolean z14) {
        if (this.useFastForwardActionInCompactView != z14) {
            this.useFastForwardActionInCompactView = z14;
            if (z14) {
                this.useNextActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUseNextAction(boolean z14) {
        if (this.useNextAction != z14) {
            this.useNextAction = z14;
            invalidate();
        }
    }

    public final void setUseNextActionInCompactView(boolean z14) {
        if (this.useNextActionInCompactView != z14) {
            this.useNextActionInCompactView = z14;
            if (z14) {
                this.useFastForwardActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUsePlayPauseActions(boolean z14) {
        if (this.usePlayPauseActions != z14) {
            this.usePlayPauseActions = z14;
            invalidate();
        }
    }

    public final void setUsePreviousAction(boolean z14) {
        if (this.usePreviousAction != z14) {
            this.usePreviousAction = z14;
            invalidate();
        }
    }

    public final void setUsePreviousActionInCompactView(boolean z14) {
        if (this.usePreviousActionInCompactView != z14) {
            this.usePreviousActionInCompactView = z14;
            if (z14) {
                this.useRewindActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUseRewindAction(boolean z14) {
        if (this.useRewindAction != z14) {
            this.useRewindAction = z14;
            invalidate();
        }
    }

    public final void setUseRewindActionInCompactView(boolean z14) {
        if (this.useRewindActionInCompactView != z14) {
            this.useRewindActionInCompactView = z14;
            if (z14) {
                this.usePreviousActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUseStopAction(boolean z14) {
        if (this.useStopAction == z14) {
            return;
        }
        this.useStopAction = z14;
        invalidate();
    }

    public final void setVisibility(int i14) {
        if (this.visibility == i14) {
            return;
        }
        if (i14 != -1 && i14 != 0 && i14 != 1) {
            x.h();
        } else {
            this.visibility = i14;
            invalidate();
        }
    }

    public static class Builder {
        protected int channelDescriptionResourceId;
        protected final String channelId;
        protected int channelImportance;
        protected int channelNameResourceId;
        protected final Context context;
        protected CustomActionReceiver customActionReceiver;
        protected int fastForwardActionIconResourceId;
        protected String groupKey;
        protected MediaDescriptionAdapter mediaDescriptionAdapter;
        protected int nextActionIconResourceId;
        protected final int notificationId;
        protected NotificationListener notificationListener;
        protected int pauseActionIconResourceId;
        protected int playActionIconResourceId;
        protected int previousActionIconResourceId;
        protected int rewindActionIconResourceId;
        protected int smallIconResourceId;
        protected int stopActionIconResourceId;

        public Builder(Context context, int i14, String str) {
            Assertions.checkArgument(i14 > 0);
            this.context = context;
            this.notificationId = i14;
            this.channelId = str;
            this.channelImportance = 2;
            this.mediaDescriptionAdapter = new DefaultMediaDescriptionAdapter(null);
            this.smallIconResourceId = R.drawable.exo_notification_small_icon;
            this.playActionIconResourceId = R.drawable.exo_notification_play;
            this.pauseActionIconResourceId = R.drawable.exo_notification_pause;
            this.stopActionIconResourceId = R.drawable.exo_notification_stop;
            this.rewindActionIconResourceId = R.drawable.exo_notification_rewind;
            this.fastForwardActionIconResourceId = R.drawable.exo_notification_fastforward;
            this.previousActionIconResourceId = R.drawable.exo_notification_previous;
            this.nextActionIconResourceId = R.drawable.exo_notification_next;
        }

        public PlayerNotificationManager build() {
            int i14 = this.channelNameResourceId;
            if (i14 != 0) {
                NotificationUtil.createNotificationChannel(this.context, this.channelId, i14, this.channelDescriptionResourceId, this.channelImportance);
            }
            return new PlayerNotificationManager(this.context, this.channelId, this.notificationId, this.mediaDescriptionAdapter, this.notificationListener, this.customActionReceiver, this.smallIconResourceId, this.playActionIconResourceId, this.pauseActionIconResourceId, this.stopActionIconResourceId, this.rewindActionIconResourceId, this.fastForwardActionIconResourceId, this.previousActionIconResourceId, this.nextActionIconResourceId, this.groupKey);
        }

        public Builder setChannelDescriptionResourceId(int i14) {
            this.channelDescriptionResourceId = i14;
            return this;
        }

        public Builder setChannelImportance(int i14) {
            this.channelImportance = i14;
            return this;
        }

        public Builder setChannelNameResourceId(int i14) {
            this.channelNameResourceId = i14;
            return this;
        }

        public Builder setCustomActionReceiver(CustomActionReceiver customActionReceiver) {
            this.customActionReceiver = customActionReceiver;
            return this;
        }

        public Builder setFastForwardActionIconResourceId(int i14) {
            this.fastForwardActionIconResourceId = i14;
            return this;
        }

        public Builder setGroup(String str) {
            this.groupKey = str;
            return this;
        }

        public Builder setMediaDescriptionAdapter(MediaDescriptionAdapter mediaDescriptionAdapter) {
            this.mediaDescriptionAdapter = mediaDescriptionAdapter;
            return this;
        }

        public Builder setNextActionIconResourceId(int i14) {
            this.nextActionIconResourceId = i14;
            return this;
        }

        public Builder setNotificationListener(NotificationListener notificationListener) {
            this.notificationListener = notificationListener;
            return this;
        }

        public Builder setPauseActionIconResourceId(int i14) {
            this.pauseActionIconResourceId = i14;
            return this;
        }

        public Builder setPlayActionIconResourceId(int i14) {
            this.playActionIconResourceId = i14;
            return this;
        }

        public Builder setPreviousActionIconResourceId(int i14) {
            this.previousActionIconResourceId = i14;
            return this;
        }

        public Builder setRewindActionIconResourceId(int i14) {
            this.rewindActionIconResourceId = i14;
            return this;
        }

        public Builder setSmallIconResourceId(int i14) {
            this.smallIconResourceId = i14;
            return this;
        }

        public Builder setStopActionIconResourceId(int i14) {
            this.stopActionIconResourceId = i14;
            return this;
        }

        @Deprecated
        public Builder(Context context, int i14, String str, MediaDescriptionAdapter mediaDescriptionAdapter) {
            this(context, i14, str);
            this.mediaDescriptionAdapter = mediaDescriptionAdapter;
        }
    }
}
