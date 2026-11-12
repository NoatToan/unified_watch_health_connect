package com.garmin.android.music;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.media.session.MediaController;
import android.os.Handler;
import android.view.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a5\u0010\f\u001a\u00020\n*\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\r\u001a1\u0010\u000f\u001a\u00020\n*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013\"\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013\"\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013\"\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroid/content/Context;", "Landroid/content/ComponentName;", "getDefaultMusicPlayer", "(Landroid/content/Context;)Landroid/content/ComponentName;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroid/media/session/MediaController;", "activeMediaController", "Landroid/os/Handler;", "handler", "Lkotlin/Function0;", "", "playMusic", "launchMusicPlayer", "(Landroid/content/Context;Ljava/util/concurrent/atomic/AtomicReference;Landroid/os/Handler;Le23/a;)V", "musicPlayer", "startMusicPlayerActivity", "(Landroid/content/Context;Landroid/content/ComponentName;Landroid/os/Handler;Le23/a;)V", "", "MUSIC_PLAYER_UTIL_LOG_PREFIX", "Ljava/lang/String;", "YOUTUBE_MUSIC_PACKAGE_NAME", "GOOGLE_PLAY_MUSIC_PACKAGE_NAME", "OPPO_MUSIC_PACKAGE_NAME", "", "appsResumeByPlayPauseMediaKey", "Ljava/util/List;", "gncs-all-modules_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MusicPlayerUtilKt {
    private static final String MUSIC_PLAYER_UTIL_LOG_PREFIX = "MC#MusicPlayerUtil";
    private static final String YOUTUBE_MUSIC_PACKAGE_NAME = "com.google.android.apps.youtube.music";
    private static final String GOOGLE_PLAY_MUSIC_PACKAGE_NAME = "com.google.android.music";
    private static final String OPPO_MUSIC_PACKAGE_NAME = "com.oppo.music";
    private static final List<String> appsResumeByPlayPauseMediaKey = x.k(GOOGLE_PLAY_MUSIC_PACKAGE_NAME, OPPO_MUSIC_PACKAGE_NAME);

    public static final ComponentName getDefaultMusicPlayer(Context context) {
        Object next;
        ActivityInfo activityInfo;
        Object next2;
        Object next3;
        context.getClass();
        ComponentName userPreferredPlayer = MusicControlsSharedPrefs.getUserPreferredPlayer(context);
        if (userPreferredPlayer != null) {
            int i14 = gt2.c.f79010a;
            gt2.b.f79005a.i(MUSIC_PLAYER_UTIL_LOG_PREFIX).debug("getDefaultMusicPlayer -> source [user preferred]: " + userPreferredPlayer.toShortString());
            return userPreferredPlayer;
        }
        ComponentName lastUsedPlayer = MusicControlsSharedPrefs.getLastUsedPlayer(context);
        if (lastUsedPlayer != null) {
            int i15 = gt2.c.f79010a;
            gt2.b.f79005a.i(MUSIC_PLAYER_UTIL_LOG_PREFIX).debug("getDefaultMusicPlayer -> source [last known]: " + lastUsedPlayer.toShortString());
            return lastUsedPlayer;
        }
        ResolveInfo resolveInfoResolveActivity = context.getApplicationContext().getPackageManager().resolveActivity(new Intent("android.intent.action.MEDIA_BUTTON"), 65536);
        if (resolveInfoResolveActivity != null) {
            ActivityInfo activityInfo2 = resolveInfoResolveActivity.activityInfo;
            ComponentName componentName = new ComponentName(activityInfo2.packageName, activityInfo2.name);
            int i16 = gt2.c.f79010a;
            gt2.b.f79005a.i(MUSIC_PLAYER_UTIL_LOG_PREFIX).debug("getDefaultMusicPlayer -> source [system default]: " + componentName.toShortString());
            return componentName;
        }
        List<ResolveInfo> listQueryBroadcastReceivers = context.getApplicationContext().getPackageManager().queryBroadcastReceivers(new Intent("android.intent.action.MEDIA_BUTTON"), 64);
        listQueryBroadcastReceivers.getClass();
        Iterator<T> it = listQueryBroadcastReceivers.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s.g(((ResolveInfo) next).activityInfo.packageName, YOUTUBE_MUSIC_PACKAGE_NAME));
        ResolveInfo resolveInfo = (ResolveInfo) next;
        if (resolveInfo == null) {
            Iterator<T> it3 = listQueryBroadcastReceivers.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (!s.g(((ResolveInfo) next2).activityInfo.packageName, GOOGLE_PLAY_MUSIC_PACKAGE_NAME));
            resolveInfo = (ResolveInfo) next2;
            if (resolveInfo == null) {
                Iterator<T> it4 = listQueryBroadcastReceivers.iterator();
                do {
                    if (!it4.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it4.next();
                } while (MusicConfig.getInstance().notMusicPlayer(((ResolveInfo) next3).activityInfo.packageName));
                resolveInfo = (ResolveInfo) next3;
            }
        }
        if (resolveInfo == null || (activityInfo = resolveInfo.activityInfo) == null) {
            int i17 = gt2.c.f79010a;
            gt2.b.f79005a.i(MUSIC_PLAYER_UTIL_LOG_PREFIX).warn("getDefaultMusicPlayer -> null");
            return null;
        }
        ComponentName componentName2 = new ComponentName(activityInfo.packageName, activityInfo.name);
        int i18 = gt2.c.f79010a;
        gt2.b.f79005a.i(MUSIC_PLAYER_UTIL_LOG_PREFIX).debug("getDefaultMusicPlayer -> source [" + activityInfo.packageName + "]: " + componentName2.toShortString());
        return componentName2;
    }

    public static final void launchMusicPlayer(Context context, AtomicReference<MediaController> atomicReference, Handler handler, e23.a<Unit> aVar) {
        context.getClass();
        atomicReference.getClass();
        handler.getClass();
        aVar.getClass();
        ComponentName defaultMusicPlayer = getDefaultMusicPlayer(context);
        if (defaultMusicPlayer == null) {
            int i14 = gt2.c.f79010a;
            gt2.b.f79005a.i(MUSIC_PLAYER_UTIL_LOG_PREFIX).error("launchMusicPlayer -> no known music player exists");
            return;
        }
        if (!appsResumeByPlayPauseMediaKey.contains(defaultMusicPlayer.getPackageName())) {
            int i15 = gt2.c.f79010a;
            gt2.b.f79005a.i(MUSIC_PLAYER_UTIL_LOG_PREFIX).debug("launchMusicPlayer -> directly start activity of '" + defaultMusicPlayer.getPackageName() + "'");
            startMusicPlayerActivity(context, defaultMusicPlayer, handler, aVar);
            return;
        }
        int i16 = gt2.c.f79010a;
        gt2.b.f79005a.i(MUSIC_PLAYER_UTIL_LOG_PREFIX).debug("launchMusicPlayer -> send key events to '" + defaultMusicPlayer.getPackageName() + "'");
        context.sendBroadcast(new Intent("android.intent.action.MEDIA_BUTTON").putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, 85)).setPackage(defaultMusicPlayer.getPackageName()));
        context.sendBroadcast(new Intent("android.intent.action.MEDIA_BUTTON").putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(1, 85)).setPackage(defaultMusicPlayer.getPackageName()));
        handler.postDelayed(new at0.c(atomicReference, context, handler, aVar, 2), 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void launchMusicPlayer$lambda$8(AtomicReference atomicReference, Context context, Handler handler, e23.a aVar) {
        atomicReference.getClass();
        context.getClass();
        handler.getClass();
        aVar.getClass();
        if (atomicReference.get() != null) {
            int i14 = gt2.c.f79010a;
            gt2.b.f79005a.i(MUSIC_PLAYER_UTIL_LOG_PREFIX).debug("launchMusicPlayer -> media session is active so cancel start media player activity task");
            return;
        }
        int i15 = gt2.c.f79010a;
        gt2.b.f79005a.i(MUSIC_PLAYER_UTIL_LOG_PREFIX).debug("launchMusicPlayer -> the media session is still not active so start media player activity ");
        ComponentName defaultMusicPlayer = getDefaultMusicPlayer(context);
        if (defaultMusicPlayer != null) {
            startMusicPlayerActivity(context, defaultMusicPlayer, handler, aVar);
        }
    }

    private static final void startMusicPlayerActivity(Context context, ComponentName componentName, Handler handler, e23.a<Unit> aVar) {
        Intent launchIntentForPackage = context.getApplicationContext().getPackageManager().getLaunchIntentForPackage(componentName.getPackageName());
        if (launchIntentForPackage == null) {
            int i14 = gt2.c.f79010a;
            gt2.b.f79005a.i(MUSIC_PLAYER_UTIL_LOG_PREFIX).warn("startMusicPlayerActivity -> unable to create launch intent for '" + componentName.getPackageName() + "'");
            return;
        }
        try {
            context.startActivity(launchIntentForPackage);
            int i15 = gt2.c.f79010a;
            gt2.b.f79005a.i(MUSIC_PLAYER_UTIL_LOG_PREFIX).debug("startMusicPlayerActivity -> started activity for '" + componentName.getPackageName() + "', waiting 5 seconds to issue play command");
        } catch (Exception e4) {
            int i16 = gt2.c.f79010a;
            gt2.b.f79005a.i(MUSIC_PLAYER_UTIL_LOG_PREFIX).warn("startMusicPlayerActivity -> failed to start activity for '" + componentName.getPackageName() + "'", (Throwable) e4);
        }
        handler.postDelayed(new c(aVar, 0), 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startMusicPlayerActivity$lambda$9(e23.a aVar) {
        aVar.getClass();
        aVar.invoke();
    }
}
