package com.xiaomi.fitness.media;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.media.MediaMetadata;
import android.media.RemoteController;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.provider.Settings;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.annotation.RequiresApi;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DeviceUtil;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.devicesettings.export.DeviceSettingConstants;
import com.xiaomi.fitness.devicesettings.export.DeviceSettingsExportPreference;
import com.xiaomi.fitness.main.export.ConfigPreference;
import com.xiaomi.fitness.media.MediaSyncManager;
import com.xiaomi.fitness.notify.export.NotifyHelperExtKt;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import com.xiaomi.hm.health.bt.profile.amc.HMMusicControl;
import defpackage.s7r;
import defpackage.vkf;
import defpackage.ykf;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u007f2\u00020\u0001:\r\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u007f\u0085\u0001B\u0007¢\u0006\u0004\b~\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0011J\u0019\u0010\u0019\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0011J\u0019\u0010\u001a\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0011J\u000f\u0010\u001b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u0004J\u0019\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0003¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0005H\u0003¢\u0006\u0004\b$\u0010\bJ\u000f\u0010%\u001a\u00020\u0002H\u0002¢\u0006\u0004\b%\u0010\u0004J\u000f\u0010&\u001a\u00020\u0002H\u0002¢\u0006\u0004\b&\u0010\u0004J\r\u0010'\u001a\u00020\u0002¢\u0006\u0004\b'\u0010\u0004J\u0017\u0010*\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0012¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u0005¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020\u00052\u0006\u00102\u001a\u00020 ¢\u0006\u0004\b3\u00104J\u001d\u00107\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u00020 ¢\u0006\u0004\b7\u00108J\u0015\u0010:\u001a\u00020\u00052\u0006\u00109\u001a\u00020 ¢\u0006\u0004\b:\u00104J\u0015\u0010<\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u0005¢\u0006\u0004\b<\u0010\bJ\u0015\u0010>\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u0005¢\u0006\u0004\b>\u0010\bJ\u0017\u0010<\u001a\u00020\u00022\b\u0010@\u001a\u0004\u0018\u00010?¢\u0006\u0004\b<\u0010AJ\u0017\u0010C\u001a\u00020\u00022\u0006\u0010B\u001a\u00020 H\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u0005H\u0016¢\u0006\u0004\bE\u0010\bJ/\u0010E\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\n2\u0006\u0010G\u001a\u00020\n2\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bE\u0010JJ\u0017\u0010L\u001a\u00020\u00022\u0006\u0010K\u001a\u00020\u0005H\u0016¢\u0006\u0004\bL\u0010\bJ\u001b\u0010P\u001a\u00020\u00022\n\u0010O\u001a\u00060MR\u00020NH\u0016¢\u0006\u0004\bP\u0010QR\u001c\u0010S\u001a\b\u0018\u00010RR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010U\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010X\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010[\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010^\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010a\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010g\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010i\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010k\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010jR\u0016\u0010l\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u001c\u0010p\u001a\b\u0012\u0004\u0012\u00020o0n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010r\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u001a\u0010u\u001a\u00060tR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0016\u0010w\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010z\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010|\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}¨\u0006\u0086\u0001"}, d2 = {"Lcom/xiaomi/fitness/media/MediaSyncManager;", "Landroid/media/RemoteController$OnClientUpdateListener;", "", "initData", "()V", "", "cmd", "sendPointMessage", "(I)V", "removePointMessage", "", "delayMillis", "onSync", "(J)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "iDeviceModel", "exeSync", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "", "mac", "Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "getHuamiApiCaller", "(Ljava/lang/String;)Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "deviceModel", "syncNoPermission", "syncNoMusicPlay", "syncHuami", "updateCurrentVolume", "syncDefaultDevice", "clearAllCotroller", "Landroid/media/session/MediaController;", "controller", "", "mediaControllerAvailable", "(Landroid/media/session/MediaController;)Z", "keyCode", "sendMusicKeyEvent", "registerVolumeChangeReceiver", "unregisterVolumeChangeReceiver", LifecycleConstantKt.ON_DESTROY, "Landroid/content/ComponentName;", "componentName", "registerRemoteController", "(Landroid/content/ComponentName;)V", "did", "onRequest", "(Ljava/lang/String;)V", "state", "onAivsControl", "(I)I", "raise", "onAivsAdjustVolume", "(Z)I", "volume", "percent", "onAivsSetVolume", "(IZ)I", "mute", "onAivsSetMute", "controll", "onControl", "command", "sendCmdPoint", "Lvkf;", Feature.MEDIA, "(Lvkf;)V", "clearing", "onClientChange", "(Z)V", "onClientPlaybackStateUpdate", "stateChangeTimeMs", "currentPosMs", "", "speed", "(IJJF)V", "transportControlFlags", "onClientTransportControlUpdate", "Landroid/media/RemoteController$MetadataEditor;", "Landroid/media/RemoteController;", "metadataEditor", "onClientMetadataUpdate", "(Landroid/media/RemoteController$MetadataEditor;)V", "Lcom/xiaomi/fitness/media/MediaSyncManager$SettingsContentObserver;", "mSettingsContentObserver", "Lcom/xiaomi/fitness/media/MediaSyncManager$SettingsContentObserver;", "mListenerComponent", "Landroid/content/ComponentName;", "Landroid/media/session/MediaSessionManager;", "mSessionManager", "Landroid/media/session/MediaSessionManager;", "Landroid/media/session/MediaSessionManager$OnActiveSessionsChangedListener;", "mSessionListener", "Landroid/media/session/MediaSessionManager$OnActiveSessionsChangedListener;", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "Landroid/media/AudioManager;", "mAudioManager", "Landroid/media/AudioManager;", "Lykf;", "mPlayerInfo", "Lykf;", "Lcom/xiaomi/fitness/media/MusicInfo;", "musicInfo", "Lcom/xiaomi/fitness/media/MusicInfo;", "mCurrentPosition", "J", "mCurrentPositionCallbackTime", "mCurrentVolume", "I", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/media/MediaSyncManager$ControllerAndCallBack;", "controllerAndCaback", "Ljava/util/ArrayList;", "mCurrentMediaController", "Landroid/media/session/MediaController;", "Lcom/xiaomi/fitness/media/MediaSyncManager$MusicSettingChangeReceiver;", "musicSettingChangeReceiver", "Lcom/xiaomi/fitness/media/MediaSyncManager$MusicSettingChangeReceiver;", "isRegistered", "Z", "Ljava/lang/Runnable;", "mSyncRunnable", "Ljava/lang/Runnable;", "isNotificationPolicyAccessGranted", "()Z", "<init>", "Companion", "MusicSettingChangeReceiver", "ControllerAndCallBack", "MediaControllerCallBack", "TopTransportSessionListener", "SettingsContentObserver", "PointBean", "media_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMediaSyncManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaSyncManager.kt\ncom/xiaomi/fitness/media/MediaSyncManager\n+ 2 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1131:1\n29#2:1132\n1#3:1133\n1863#4,2:1134\n*S KotlinDebug\n*F\n+ 1 MediaSyncManager.kt\ncom/xiaomi/fitness/media/MediaSyncManager\n*L\n1123#1:1132\n1009#1:1134,2\n*E\n"})
public final class MediaSyncManager implements RemoteController.OnClientUpdateListener {
    private static int MIN_VOLUME = 0;

    @NotNull
    private static final String TAG = "MediaSyncManager";
    public static final int sControlNext = 2;
    public static final int sControlPause = 1;
    public static final int sControlPlay = 0;
    public static final int sControlPrev = 3;
    public static final int sControlVolDonw = 5;
    public static final int sControlVolUp = 4;
    public static final int sWhatPoint = 10;
    private boolean isRegistered;

    @Nullable
    private AudioManager mAudioManager;

    @Nullable
    private MediaController mCurrentMediaController;
    private long mCurrentPosition;
    private long mCurrentPositionCallbackTime;
    private int mCurrentVolume;

    @Nullable
    private Handler mHandler;

    @Nullable
    private ComponentName mListenerComponent;

    @Nullable
    private MediaSessionManager.OnActiveSessionsChangedListener mSessionListener;

    @Nullable
    private MediaSessionManager mSessionManager;

    @Nullable
    private SettingsContentObserver mSettingsContentObserver;

    @Nullable
    private MusicInfo musicInfo;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int MAX_VOLUME = 15;

    @NotNull
    private static final MediaSyncManager instance = new MediaSyncManager();

    @NotNull
    private static ArrayList<String> sBlackListPackgeName = CollectionsKt__CollectionsKt.arrayListOf("tv.danmaku.bili", "com.duowan.kiwi", "com.shuqi.controller", "com.ss.android.ugc.aweme", "com.ss.android.ugc.aweme.lite", "com.smile.gifmaker", "com.kuaishou.nebula");

    @NotNull
    private final ykf mPlayerInfo = new ykf();

    @NotNull
    private ArrayList<ControllerAndCallBack> controllerAndCaback = new ArrayList<>();

    @NotNull
    private MusicSettingChangeReceiver musicSettingChangeReceiver = new MusicSettingChangeReceiver();

    @NotNull
    private final Runnable mSyncRunnable = new Runnable() { // from class: emf
        @Override // java.lang.Runnable
        public final void run() {
            MediaSyncManager.mSyncRunnable$lambda$5(this.f16809a);
        }
    };

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/media/MediaSyncManager$Companion;", "", "<init>", "()V", "TAG", "", "sControlPlay", "", "sControlPause", "sControlNext", "sControlPrev", "sControlVolUp", "sControlVolDonw", "sWhatPoint", "MAX_VOLUME", "MIN_VOLUME", "instance", "Lcom/xiaomi/fitness/media/MediaSyncManager;", "getInstance", "()Lcom/xiaomi/fitness/media/MediaSyncManager;", "sBlackListPackgeName", "Ljava/util/ArrayList;", "getSBlackListPackgeName", "()Ljava/util/ArrayList;", "setSBlackListPackgeName", "(Ljava/util/ArrayList;)V", "media_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MediaSyncManager getInstance() {
            return MediaSyncManager.instance;
        }

        @NotNull
        public final ArrayList<String> getSBlackListPackgeName() {
            return MediaSyncManager.sBlackListPackgeName;
        }

        public final void setSBlackListPackgeName(@NotNull ArrayList<String> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
            MediaSyncManager.sBlackListPackgeName = arrayList;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005R\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\r\u0010\u000e\u001a\u00060\u0005R\u00020\u0006HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\b\u0002\u0010\u0004\u001a\u00060\u0005R\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u00060\u0005R\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/media/MediaSyncManager$ControllerAndCallBack;", "", "controller", "Landroid/media/session/MediaController;", "mediaCallBack", "Lcom/xiaomi/fitness/media/MediaSyncManager$MediaControllerCallBack;", "Lcom/xiaomi/fitness/media/MediaSyncManager;", "<init>", "(Landroid/media/session/MediaController;Lcom/xiaomi/fitness/media/MediaSyncManager$MediaControllerCallBack;)V", "getController", "()Landroid/media/session/MediaController;", "getMediaCallBack", "()Lcom/xiaomi/fitness/media/MediaSyncManager$MediaControllerCallBack;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "media_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ControllerAndCallBack {

        @NotNull
        private final MediaController controller;

        @NotNull
        private final MediaControllerCallBack mediaCallBack;

        public ControllerAndCallBack(@NotNull MediaController controller, @NotNull MediaControllerCallBack mediaCallBack) {
            Intrinsics.checkNotNullParameter(controller, "controller");
            Intrinsics.checkNotNullParameter(mediaCallBack, "mediaCallBack");
            this.controller = controller;
            this.mediaCallBack = mediaCallBack;
        }

        public static /* synthetic */ ControllerAndCallBack copy$default(ControllerAndCallBack controllerAndCallBack, MediaController mediaController, MediaControllerCallBack mediaControllerCallBack, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaController = controllerAndCallBack.controller;
            }
            if ((i & 2) != 0) {
                mediaControllerCallBack = controllerAndCallBack.mediaCallBack;
            }
            return controllerAndCallBack.copy(mediaController, mediaControllerCallBack);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final MediaController getController() {
            return this.controller;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final MediaControllerCallBack getMediaCallBack() {
            return this.mediaCallBack;
        }

        @NotNull
        public final ControllerAndCallBack copy(@NotNull MediaController controller, @NotNull MediaControllerCallBack mediaCallBack) {
            Intrinsics.checkNotNullParameter(controller, "controller");
            Intrinsics.checkNotNullParameter(mediaCallBack, "mediaCallBack");
            return new ControllerAndCallBack(controller, mediaCallBack);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ControllerAndCallBack)) {
                return false;
            }
            ControllerAndCallBack controllerAndCallBack = (ControllerAndCallBack) other;
            return Intrinsics.areEqual(this.controller, controllerAndCallBack.controller) && Intrinsics.areEqual(this.mediaCallBack, controllerAndCallBack.mediaCallBack);
        }

        @NotNull
        public final MediaController getController() {
            return this.controller;
        }

        @NotNull
        public final MediaControllerCallBack getMediaCallBack() {
            return this.mediaCallBack;
        }

        public int hashCode() {
            return (this.controller.hashCode() * 31) + this.mediaCallBack.hashCode();
        }

        @NotNull
        public String toString() {
            return "ControllerAndCallBack(controller=" + this.controller + ", mediaCallBack=" + this.mediaCallBack + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/media/MediaSyncManager$MediaControllerCallBack;", "Landroid/media/session/MediaController$Callback;", "<init>", "(Lcom/xiaomi/fitness/media/MediaSyncManager;)V", "onPlaybackStateChanged", "", "state", "Landroid/media/session/PlaybackState;", "onMetadataChanged", "metadata", "Landroid/media/MediaMetadata;", "media_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class MediaControllerCallBack extends MediaController.Callback {
        public MediaControllerCallBack() {
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0137  */
        /* JADX WARN: Code duplicated, block: B:45:0x019b  */
        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(@Nullable MediaMetadata metadata) {
            MediaControllerCallBack mediaCallBack;
            boolean z;
            boolean z2;
            super.onMetadataChanged(metadata);
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, "56.0.0.0.42329"), "name", "music_receive", "source", "info_change");
            MediaSyncManager.this.removePointMessage();
            Logger.e(MediaSyncManager.TAG, "onMetadataChanged  metadata:" + metadata);
            int size = MediaSyncManager.this.controllerAndCaback.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    mediaCallBack = null;
                    break;
                }
                Object obj = MediaSyncManager.this.controllerAndCaback.get(i);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                ControllerAndCallBack controllerAndCallBack = (ControllerAndCallBack) obj;
                PlaybackState playbackState = controllerAndCallBack.getController().getPlaybackState();
                if (playbackState != null && playbackState.getState() == 3) {
                    mediaCallBack = controllerAndCallBack.getMediaCallBack();
                    MediaSyncManager.this.mCurrentMediaController = controllerAndCallBack.getController();
                    Logger.e(MediaSyncManager.TAG, "onMetadataChanged find playing media info packageName:" + controllerAndCallBack.getController().getPackageName());
                    break;
                }
                i++;
            }
            if (mediaCallBack != null && !Intrinsics.areEqual(mediaCallBack, this)) {
                Logger.e(MediaSyncManager.TAG, "onMetadataChanged only sync playing media info");
                return;
            }
            if (mediaCallBack != null) {
                MusicInfo musicInfo = MediaSyncManager.this.musicInfo;
                Intrinsics.checkNotNull(musicInfo);
                musicInfo.setState(3);
            }
            if (metadata == null) {
                return;
            }
            String string = metadata.getString(MediaMetadataCompat.METADATA_KEY_ARTIST);
            String string2 = metadata.getString(MediaMetadataCompat.METADATA_KEY_TITLE);
            Logger.i(MediaSyncManager.TAG, "onMetadataChanged  MediaMetadata.METADATA_KEY_TITLE title:" + string2 + "  ");
            if (TextUtils.isEmpty(string2)) {
                Logger.i(MediaSyncManager.TAG, "onMetadataChanged  MediaMetadata.METADATA_KEY_DISPLAY_TITLE title:" + string2 + "  ");
                string2 = metadata.getString(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE);
            }
            long j = metadata.getLong(MediaMetadataCompat.METADATA_KEY_DURATION);
            int iRound = Math.round((j * 1.0f) / 1000);
            if (mediaCallBack != null) {
                MusicInfo musicInfo2 = MediaSyncManager.this.musicInfo;
                Intrinsics.checkNotNull(musicInfo2);
                if (musicInfo2.getState() == 3) {
                    ykf ykfVar = MediaSyncManager.this.mPlayerInfo;
                    Intrinsics.checkNotNull(ykfVar);
                    if (ykfVar.c == 1) {
                        z = false;
                    }
                }
                z = true;
            } else {
                z = false;
            }
            MusicInfo musicInfo3 = MediaSyncManager.this.musicInfo;
            Intrinsics.checkNotNull(musicInfo3);
            if (TextUtils.isEmpty(musicInfo3.getTitle())) {
                z2 = false;
            } else {
                MusicInfo musicInfo4 = MediaSyncManager.this.musicInfo;
                Intrinsics.checkNotNull(musicInfo4);
                if (Intrinsics.areEqual(musicInfo4.getTitle(), string2)) {
                    MusicInfo musicInfo5 = MediaSyncManager.this.musicInfo;
                    Intrinsics.checkNotNull(musicInfo5);
                    if (TextUtils.isEmpty(musicInfo5.getArtist())) {
                        z2 = false;
                    } else {
                        MusicInfo musicInfo6 = MediaSyncManager.this.musicInfo;
                        Intrinsics.checkNotNull(musicInfo6);
                        if (!Intrinsics.areEqual(musicInfo6.getArtist(), string) || j == 0) {
                            z2 = false;
                        } else {
                            MusicInfo musicInfo7 = MediaSyncManager.this.musicInfo;
                            Intrinsics.checkNotNull(musicInfo7);
                            if (musicInfo7.getDuration() == iRound) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                    }
                } else {
                    z2 = false;
                }
            }
            Logger.i(MediaSyncManager.TAG, "onMetadataChanged  isStateNeedSync:" + z + "  isInfoSame:" + z2);
            if (z2 && !z) {
                Logger.i(MediaSyncManager.TAG, "onMetadataChanged  quchong");
                return;
            }
            if (mediaCallBack != null) {
                MusicInfo musicInfo8 = MediaSyncManager.this.musicInfo;
                Intrinsics.checkNotNull(musicInfo8);
                musicInfo8.setState(3);
                ykf ykfVar2 = MediaSyncManager.this.mPlayerInfo;
                Intrinsics.checkNotNull(ykfVar2);
                ykfVar2.c = 1;
            } else {
                int size2 = MediaSyncManager.this.controllerAndCaback.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Object obj2 = MediaSyncManager.this.controllerAndCaback.get(i2);
                    Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                    ControllerAndCallBack controllerAndCallBack2 = (ControllerAndCallBack) obj2;
                    if (Intrinsics.areEqual(controllerAndCallBack2.getMediaCallBack(), this)) {
                        MediaSyncManager.this.mCurrentMediaController = controllerAndCallBack2.getController();
                    }
                }
            }
            Logger.e(MediaSyncManager.TAG, "onMetadataChanged...  title: " + string2 + ", artist: " + string + ", duration = " + j);
            if (string2 == null) {
                string2 = "";
            }
            if (string == null) {
                string = "";
            }
            ykf ykfVar3 = MediaSyncManager.this.mPlayerInfo;
            Intrinsics.checkNotNull(ykfVar3);
            ykfVar3.f = string2;
            ykf ykfVar4 = MediaSyncManager.this.mPlayerInfo;
            Intrinsics.checkNotNull(ykfVar4);
            ykfVar4.g = string;
            ykf ykfVar5 = MediaSyncManager.this.mPlayerInfo;
            Intrinsics.checkNotNull(ykfVar5);
            ykfVar5.i = iRound;
            MusicInfo musicInfo9 = MediaSyncManager.this.musicInfo;
            Intrinsics.checkNotNull(musicInfo9);
            musicInfo9.setTitle(string2);
            MusicInfo musicInfo10 = MediaSyncManager.this.musicInfo;
            Intrinsics.checkNotNull(musicInfo10);
            musicInfo10.setArtist(string);
            MusicInfo musicInfo11 = MediaSyncManager.this.musicInfo;
            Intrinsics.checkNotNull(musicInfo11);
            musicInfo11.setDuration(iRound);
            MusicInfo musicInfo12 = MediaSyncManager.this.musicInfo;
            Intrinsics.checkNotNull(musicInfo12);
            musicInfo12.setCurrentPosition(0L);
            MusicInfo musicInfo13 = MediaSyncManager.this.musicInfo;
            Intrinsics.checkNotNull(musicInfo13);
            musicInfo13.setSystemTime(SystemClock.elapsedRealtime());
            MediaSyncManager.this.onSync(j == 0 ? 100L : 50L);
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(@Nullable PlaybackState state) {
            super.onPlaybackStateChanged(state);
            MediaSyncManager.this.removePointMessage();
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, "56.0.0.0.42329"), "name", "music_receive", "source", "state_change");
            Logger.e(MediaSyncManager.TAG, "onPlaybackStateChanged   ====");
            if (state == null || state.getPosition() == -1) {
                MediaSyncManager.this.onClientPlaybackStateUpdate(state != null ? state.getState() : 0);
            } else {
                MediaSyncManager.this.onClientPlaybackStateUpdate(state.getState(), state.getLastPositionUpdateTime(), state.getPosition(), state.getPlaybackSpeed());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/media/MediaSyncManager$MusicSettingChangeReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lcom/xiaomi/fitness/media/MediaSyncManager;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "media_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class MusicSettingChangeReceiver extends BroadcastReceiver {
        public MusicSettingChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            boolean booleanExtra = intent.getBooleanExtra("isNeedSync", true);
            Logger.i(MediaSyncManager.TAG, "MediaSyncManager isNeedSync:" + booleanExtra);
            if (booleanExtra) {
                return;
            }
            DeviceSettingsExportPreference.INSTANCE.setAppMusicSync2Device(false);
            MediaSyncManager.this.onSync(0L);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/media/MediaSyncManager$PointBean;", "", "operation", "", "package_name", "", "phone_brand", "timestamp", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;J)V", "getOperation", "()I", "getPackage_name", "()Ljava/lang/String;", "getPhone_brand", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "media_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PointBean {
        private final int operation;

        @Nullable
        private final String package_name;

        @NotNull
        private final String phone_brand;
        private final long timestamp;

        public PointBean(int i, @Nullable String str, @NotNull String phone_brand, long j) {
            Intrinsics.checkNotNullParameter(phone_brand, "phone_brand");
            this.operation = i;
            this.package_name = str;
            this.phone_brand = phone_brand;
            this.timestamp = j;
        }

        public static /* synthetic */ PointBean copy$default(PointBean pointBean, int i, String str, String str2, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = pointBean.operation;
            }
            if ((i2 & 2) != 0) {
                str = pointBean.package_name;
            }
            String str3 = str;
            if ((i2 & 4) != 0) {
                str2 = pointBean.phone_brand;
            }
            String str4 = str2;
            if ((i2 & 8) != 0) {
                j = pointBean.timestamp;
            }
            return pointBean.copy(i, str3, str4, j);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getOperation() {
            return this.operation;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPackage_name() {
            return this.package_name;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getPhone_brand() {
            return this.phone_brand;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        public final PointBean copy(int operation, @Nullable String package_name, @NotNull String phone_brand, long timestamp) {
            Intrinsics.checkNotNullParameter(phone_brand, "phone_brand");
            return new PointBean(operation, package_name, phone_brand, timestamp);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PointBean)) {
                return false;
            }
            PointBean pointBean = (PointBean) other;
            return this.operation == pointBean.operation && Intrinsics.areEqual(this.package_name, pointBean.package_name) && Intrinsics.areEqual(this.phone_brand, pointBean.phone_brand) && this.timestamp == pointBean.timestamp;
        }

        public final int getOperation() {
            return this.operation;
        }

        @Nullable
        public final String getPackage_name() {
            return this.package_name;
        }

        @NotNull
        public final String getPhone_brand() {
            return this.phone_brand;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.operation) * 31;
            String str = this.package_name;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.phone_brand.hashCode()) * 31) + Long.hashCode(this.timestamp);
        }

        @NotNull
        public String toString() {
            return "PointBean(operation=" + this.operation + ", package_name=" + this.package_name + ", phone_brand=" + this.phone_brand + ", timestamp=" + this.timestamp + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/media/MediaSyncManager$SettingsContentObserver;", "Landroid/database/ContentObserver;", "handler", "Landroid/os/Handler;", "<init>", "(Lcom/xiaomi/fitness/media/MediaSyncManager;Landroid/os/Handler;)V", "deliverSelfNotifications", "", "onChange", "", "selfChange", "media_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class SettingsContentObserver extends ContentObserver {
        public SettingsContentObserver(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return false;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange) {
            super.onChange(selfChange);
            boolean zIsAppMusicSync2Device = DeviceSettingsExportPreference.INSTANCE.isAppMusicSync2Device();
            Logger.i(MediaSyncManager.TAG, "SettingsContentObserver onChange onSync " + zIsAppMusicSync2Device);
            if (zIsAppMusicSync2Device) {
                AudioManager audioManager = MediaSyncManager.this.mAudioManager;
                Intrinsics.checkNotNull(audioManager);
                if (MediaSyncManager.this.mCurrentVolume == audioManager.getStreamVolume(3)) {
                    return;
                }
                MediaSyncManager.this.onSync(50L);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/media/MediaSyncManager$TopTransportSessionListener;", "Landroid/media/session/MediaSessionManager$OnActiveSessionsChangedListener;", "<init>", "(Lcom/xiaomi/fitness/media/MediaSyncManager;)V", "onActiveSessionsChanged", "", "controllers", "", "Landroid/media/session/MediaController;", "media_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nMediaSyncManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaSyncManager.kt\ncom/xiaomi/fitness/media/MediaSyncManager$TopTransportSessionListener\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1131:1\n295#2,2:1132\n1863#2,2:1134\n*S KotlinDebug\n*F\n+ 1 MediaSyncManager.kt\ncom/xiaomi/fitness/media/MediaSyncManager$TopTransportSessionListener\n*L\n975#1:1132,2\n983#1:1134,2\n*E\n"})
    public final class TopTransportSessionListener implements MediaSessionManager.OnActiveSessionsChangedListener {
        public TopTransportSessionListener() {
        }

        @Override // android.media.session.MediaSessionManager.OnActiveSessionsChangedListener
        public void onActiveSessionsChanged(@Nullable List<MediaController> controllers) {
            MediaController mediaController;
            Object next;
            Integer num = null;
            Integer numValueOf = controllers != null ? Integer.valueOf(controllers.size()) : null;
            Logger.e(MediaSyncManager.TAG, "onActiveSessionsChanged controllerSize=" + numValueOf + " controllerAndCaback.size=" + MediaSyncManager.this.controllerAndCaback.size());
            if (!NotifyHelperExtKt.getNotificationManagerExport().isNotifyServiceRunning()) {
                Logger.e(MediaSyncManager.TAG, "NotifyService is not running");
                return;
            }
            MediaController mediaController2 = MediaSyncManager.this.mCurrentMediaController;
            String packageName = mediaController2 != null ? mediaController2.getPackageName() : null;
            if (packageName != null) {
                if (controllers != null) {
                    Iterator<T> it = controllers.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.areEqual(((MediaController) next).getPackageName(), packageName));
                    mediaController = (MediaController) next;
                } else {
                    mediaController = null;
                }
                if (mediaController == null) {
                    MediaSyncManager.this.mCurrentMediaController = null;
                    MediaSyncManager.this.onClientChange(true);
                }
            }
            MediaSyncManager.this.clearAllCotroller();
            if (controllers != null) {
                MediaSyncManager mediaSyncManager = MediaSyncManager.this;
                boolean z = false;
                for (MediaController mediaController3 : controllers) {
                    String packageName2 = mediaController3.getPackageName();
                    boolean zContains = MediaSyncManager.INSTANCE.getSBlackListPackgeName().contains(packageName2);
                    Logger.i(MediaSyncManager.TAG, "onActiveSessionsChanged packageName:" + packageName2 + " isInBlackList:" + zContains);
                    if (!zContains) {
                        MediaControllerCallBack mediaControllerCallBack = mediaSyncManager.new MediaControllerCallBack();
                        mediaController3.registerCallback(mediaControllerCallBack);
                        mediaSyncManager.controllerAndCaback.add(new ControllerAndCallBack(mediaController3, mediaControllerCallBack));
                        if (!z) {
                            PlaybackState playbackState = mediaController3.getPlaybackState();
                            boolean z2 = playbackState != null && playbackState.getState() == 3;
                            Logger.e(MediaSyncManager.TAG, "updateController packageName:" + packageName2 + " playbackState:" + (playbackState != null ? Integer.valueOf(playbackState.getState()) : num) + " playbackState?.actions:" + (playbackState != null ? Long.valueOf(playbackState.getActions()) : num) + " playbackState:" + playbackState);
                            if (z2) {
                                Logger.e(MediaSyncManager.TAG, "updateController init");
                                mediaControllerCallBack.onMetadataChanged(mediaController3.getMetadata());
                                mediaControllerCallBack.onPlaybackStateChanged(playbackState);
                                z = true;
                            }
                        }
                    }
                    num = null;
                }
            }
        }
    }

    public MediaSyncManager() {
        registerVolumeChangeReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(DeviceSettingConstants.INSTANCE.getSActionMusicSettingChange());
        if (Build.VERSION.SDK_INT >= 33) {
            AppUtil.getApp().registerReceiver(this.musicSettingChangeReceiver, intentFilter, 2);
        } else {
            AppUtil.getApp().registerReceiver(this.musicSettingChangeReceiver, intentFilter);
        }
        initData();
        ConfigPreference configPreference = ConfigPreference.INSTANCE;
        if (TextUtils.isEmpty(configPreference.getMEDIASESSION_BLACKLIST())) {
            return;
        }
        sBlackListPackgeName = (ArrayList) new Gson().fromJson(configPreference.getMEDIASESSION_BLACKLIST(), new TypeToken<ArrayList<String>>() { // from class: com.xiaomi.fitness.media.MediaSyncManager$special$$inlined$fromJson$1
        }.getType());
        Logger.i(TAG, "init ConfigPreference.MEDIASESSION_BLACKLIST:" + configPreference.getMEDIASESSION_BLACKLIST() + " sBlackListPackgeName.size:" + sBlackListPackgeName.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearAllCotroller() {
        for (ControllerAndCallBack controllerAndCallBack : this.controllerAndCaback) {
            controllerAndCallBack.getController().unregisterCallback(controllerAndCallBack.getMediaCallBack());
        }
        this.controllerAndCaback.clear();
    }

    private final void exeSync(WearableDeviceModel iDeviceModel) {
        if (iDeviceModel == null) {
            Logger.i(TAG, "sync posted model == null ");
            return;
        }
        if (!NotifyHelperExtKt.getNotificationManagerExport().isNotificationListenersEnabled()) {
            syncNoPermission(iDeviceModel);
            Logger.e(TAG, "NotifyService isNotificationListenersEnabled false");
            return;
        }
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, "56.0.0.0.42327"), "name", "music_send_to_device");
        String did = iDeviceModel.getDid();
        ykf ykfVar = this.mPlayerInfo;
        Logger.i(TAG, did + " sync posted " + (ykfVar != null ? ykfVar.f : null));
        if (DeviceModelExtKt.isHuaMi(iDeviceModel)) {
            Logger.i(TAG, "syncHuami");
            syncHuami(iDeviceModel);
        } else {
            Logger.i(TAG, "syncDefaultDevice");
            syncDefaultDevice();
        }
    }

    private final HuamiApiCaller getHuamiApiCaller(String mac) {
        return DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(mac);
    }

    private final void initData() {
        Logger.i(TAG, "initData");
        if (this.mHandler == null) {
            this.mHandler = new Handler(Looper.getMainLooper()) { // from class: com.xiaomi.fitness.media.MediaSyncManager.initData.1
                @Override // android.os.Handler
                public void handleMessage(Message msg) {
                    Intrinsics.checkNotNullParameter(msg, "msg");
                    if (msg.what == 10) {
                        Object obj = msg.obj;
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fitness.media.MediaSyncManager.PointBean");
                        PointBean pointBean = (PointBean) obj;
                        Logger.i(MediaSyncManager.TAG, "send pointBean");
                        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.81.1.1.34983"), TuplesKt.to("name", "ControllMusicError"), TuplesKt.to("operation", Integer.valueOf(pointBean.getOperation())), TuplesKt.to("package_name", pointBean.getPackage_name()), TuplesKt.to("timestamp", Long.valueOf(pointBean.getTimestamp())), TuplesKt.to("phone_brand", pointBean.getPhone_brand())));
                    }
                }
            };
        }
        this.musicInfo = new MusicInfo();
        Object systemService = AppUtil.getApp().getSystemService("audio");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        this.mAudioManager = audioManager;
        if (audioManager != null) {
            Intrinsics.checkNotNull(audioManager);
            MAX_VOLUME = audioManager.getStreamMaxVolume(3);
            if (Build.VERSION.SDK_INT >= 28) {
                AudioManager audioManager2 = this.mAudioManager;
                Intrinsics.checkNotNull(audioManager2);
                MIN_VOLUME = audioManager2.getStreamMinVolume(3);
            }
            AudioManager audioManager3 = this.mAudioManager;
            Intrinsics.checkNotNull(audioManager3);
            this.mCurrentVolume = audioManager3.getStreamVolume(3);
            ykf ykfVar = this.mPlayerInfo;
            Intrinsics.checkNotNull(ykfVar);
            ykfVar.d = (int) Math.ceil(((this.mCurrentVolume - MIN_VOLUME) * 100.0f) / MAX_VOLUME);
        }
        this.mPlayerInfo.m();
        ykf ykfVar2 = this.mPlayerInfo;
        Intrinsics.checkNotNull(ykfVar2);
        ykfVar2.c = 0;
    }

    private final boolean isNotificationPolicyAccessGranted() {
        Object systemService = AppUtil.getApp().getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        if (((NotificationManager) systemService).isNotificationPolicyAccessGranted()) {
            return true;
        }
        Logger.e(TAG, "MediaSyncManager isNotificationPolicyAccessGranted false");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mSyncRunnable$lambda$5(MediaSyncManager this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Logger.i(TAG, "mSyncRunnable deviceModel?.isHuaMi:" + (wearableDeviceModel != null ? Boolean.valueOf(DeviceModelExtKt.isHuaMi(wearableDeviceModel)) : null) + " deviceModel?.isBluetooth:" + (wearableDeviceModel != null ? Boolean.valueOf(DeviceModelExtKt.isBluetooth(wearableDeviceModel)) : null) + "  deviceModel:" + wearableDeviceModel);
        if ((wearableDeviceModel == null || !DeviceModelExtKt.isHuaMi(wearableDeviceModel)) && (wearableDeviceModel == null || !DeviceModelExtKt.isBluetooth(wearableDeviceModel))) {
            return;
        }
        this$0.exeSync(wearableDeviceModel);
    }

    @RequiresApi(api = 21)
    private final boolean mediaControllerAvailable(MediaController controller) {
        PlaybackState playbackState;
        int state;
        return (controller == null || controller.getPackageName() == null || (playbackState = controller.getPlaybackState()) == null || (state = playbackState.getState()) == 2 || state == 7 || state == 0 || state == 1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onControl$lambda$4(MediaSyncManager this$0, vkf vkfVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AudioManager audioManager = this$0.mAudioManager;
        Intrinsics.checkNotNull(audioManager);
        int streamVolume = audioManager.getStreamVolume(3);
        Logger.i(TAG, "onControl currentVolume = " + streamVolume);
        int iCeil = (int) Math.ceil((double) (((streamVolume - MIN_VOLUME) * 100) / MAX_VOLUME));
        ykf ykfVar = this$0.mPlayerInfo;
        Intrinsics.checkNotNull(ykfVar);
        ykfVar.d = iCeil;
        int i = vkfVar.p().d;
        ykf ykfVar2 = this$0.mPlayerInfo;
        Intrinsics.checkNotNull(ykfVar2);
        Logger.i(TAG, "onControl deviceVolume:" + i + "  sync2DeviceVolume:" + ykfVar2.d);
        this$0.onSync(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSync(long delayMillis) {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mSyncRunnable);
        }
        boolean zIsAppMusicSync2Device = DeviceSettingsExportPreference.INSTANCE.isAppMusicSync2Device();
        Logger.i(TAG, "onSync " + zIsAppMusicSync2Device);
        if (!zIsAppMusicSync2Device) {
            syncNoMusicPlay((WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel());
            return;
        }
        Handler handler2 = this.mHandler;
        if (handler2 != null) {
            handler2.postDelayed(this.mSyncRunnable, delayMillis);
        }
    }

    private final void registerVolumeChangeReceiver() {
        if (this.mSettingsContentObserver == null) {
            Logger.i(TAG, "registerVolumeChangeReceiver new SettingsContentObserver");
            this.mSettingsContentObserver = new SettingsContentObserver(this.mHandler);
        } else {
            unregisterVolumeChangeReceiver();
            Logger.i(TAG, "registerVolumeChangeReceiver unregister old SettingsContentObserver");
        }
        ContentResolver contentResolver = AppUtil.getApp().getContentResolver();
        Uri uri = Settings.System.CONTENT_URI;
        SettingsContentObserver settingsContentObserver = this.mSettingsContentObserver;
        Intrinsics.checkNotNull(settingsContentObserver);
        contentResolver.registerContentObserver(uri, true, settingsContentObserver);
        Logger.i(TAG, "registerVolumeChangeReceiver registerContentObserver");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removePointMessage() {
        Logger.i(TAG, "removePointMessage");
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeMessages(10);
        }
    }

    @RequiresApi(api = 21)
    private final void sendMusicKeyEvent(int keyCode) {
        MediaController mediaController = this.mCurrentMediaController;
        Logger.i(TAG, "sendMusicKeyEvent " + keyCode + ", c = " + mediaController + "  packName:" + (mediaController != null ? mediaController.getPackageName() : null));
        if (this.mCurrentMediaController != null) {
            KeyEvent keyEvent = new KeyEvent(0, keyCode);
            MediaController mediaController2 = this.mCurrentMediaController;
            Intrinsics.checkNotNull(mediaController2);
            mediaController2.dispatchMediaButtonEvent(keyEvent);
            KeyEvent keyEvent2 = new KeyEvent(1, keyCode);
            MediaController mediaController3 = this.mCurrentMediaController;
            Intrinsics.checkNotNull(mediaController3);
            mediaController3.dispatchMediaButtonEvent(keyEvent2);
        }
    }

    private final void sendPointMessage(int cmd) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 10;
        MediaController mediaController = this.mCurrentMediaController;
        PointBean pointBean = new PointBean(cmd, mediaController != null ? mediaController.getPackageName() : null, DeviceUtil.INSTANCE.getDeviceModel(), new Date().getTime());
        Logger.i(TAG, "sendPointMessage " + pointBean);
        messageObtain.obj = pointBean;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendMessageDelayed(messageObtain, 1000L);
        }
    }

    private final void syncDefaultDevice() {
        s7r s7rVar = new s7r();
        s7rVar.e = 18;
        s7rVar.f = 1;
        vkf vkfVar = new vkf();
        AudioManager audioManager = this.mAudioManager;
        if (audioManager != null) {
            Intrinsics.checkNotNull(audioManager);
            this.mCurrentVolume = audioManager.getStreamVolume(3);
            ykf ykfVar = this.mPlayerInfo;
            Intrinsics.checkNotNull(ykfVar);
            ykfVar.d = (int) Math.ceil(((this.mCurrentVolume - MIN_VOLUME) * 100.0f) / MAX_VOLUME);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ykf ykfVar2 = this.mPlayerInfo;
        Intrinsics.checkNotNull(ykfVar2);
        long j = ykfVar2.c == 1 ? jElapsedRealtime - this.mCurrentPositionCallbackTime : 0L;
        ykf ykfVar3 = this.mPlayerInfo;
        Intrinsics.checkNotNull(ykfVar3);
        ykf ykfVar4 = this.mPlayerInfo;
        Intrinsics.checkNotNull(ykfVar4);
        ykfVar3.h = RangesKt___RangesKt.coerceAtMost(ykfVar4.i, (int) Math.ceil(((this.mCurrentPosition + j) * 1.0f) / 1000));
        Logger.i(TAG, "syncTime: " + jElapsedRealtime + "  " + this.mCurrentPositionCallbackTime + "  " + j + " " + this.mCurrentPosition);
        ykf ykfVar5 = this.mPlayerInfo;
        Intrinsics.checkNotNull(ykfVar5);
        if (ykfVar5.c == 0) {
            ykf ykfVar6 = this.mPlayerInfo;
            Intrinsics.checkNotNull(ykfVar6);
            if (!TextUtils.isEmpty(ykfVar6.f)) {
                ykf ykfVar7 = this.mPlayerInfo;
                Intrinsics.checkNotNull(ykfVar7);
                ykfVar7.c = 2;
            }
        }
        vkfVar.A(this.mPlayerInfo);
        s7rVar.Y(vkfVar);
        ykf ykfVar8 = this.mPlayerInfo;
        Intrinsics.checkNotNull(ykfVar8);
        int i = ykfVar8.h;
        ykf ykfVar9 = this.mPlayerInfo;
        Intrinsics.checkNotNull(ykfVar9);
        int i2 = ykfVar9.i;
        ykf ykfVar10 = this.mPlayerInfo;
        Intrinsics.checkNotNull(ykfVar10);
        int i3 = ykfVar10.c;
        ykf ykfVar11 = this.mPlayerInfo;
        Intrinsics.checkNotNull(ykfVar11);
        Logger.i(TAG, "currentPosition:" + i + "  duration:" + i2 + " state:" + i3 + " volume:" + ykfVar11.d);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 8, null);
    }

    private final void syncHuami(WearableDeviceModel deviceModel) {
        HMMusicControl hMMusicControl;
        MusicInfo musicInfo = this.musicInfo;
        Logger.i(TAG, "syncHuami musicInfo==  " + musicInfo + " deviceModel== " + deviceModel + " musicInfo state== " + (musicInfo != null ? Integer.valueOf(musicInfo.getState()) : null) + " ");
        MusicInfo musicInfo2 = this.musicInfo;
        if (musicInfo2 == null || deviceModel == null) {
            return;
        }
        Integer numValueOf = musicInfo2 != null ? Integer.valueOf(musicInfo2.getState()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            hMMusicControl = new HMMusicControl(HMMusicControl.PhoneState.PAUSE);
            hMMusicControl.setException(HMMusicControl.AppException.NO_MUSIC);
        } else if (numValueOf != null && numValueOf.intValue() == 3) {
            hMMusicControl = new HMMusicControl(HMMusicControl.PhoneState.PLAY);
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            hMMusicControl = new HMMusicControl(HMMusicControl.PhoneState.PAUSE);
        } else if (numValueOf != null && numValueOf.intValue() == 5) {
            hMMusicControl = new HMMusicControl(HMMusicControl.PhoneState.REWIND);
        } else if (numValueOf != null && numValueOf.intValue() == 4) {
            hMMusicControl = new HMMusicControl(HMMusicControl.PhoneState.FORWARD);
        } else {
            MusicInfo musicInfo3 = this.musicInfo;
            Logger.e(TAG, "syncHuami unkown state:" + (musicInfo3 != null ? Integer.valueOf(musicInfo3.getState()) : null));
            hMMusicControl = null;
        }
        Logger.i(TAG, "syncHuami hmMusicControl state==  " + (hMMusicControl != null ? hMMusicControl.getState() : null));
        if (hMMusicControl != null) {
            MusicInfo musicInfo4 = this.musicInfo;
            hMMusicControl.setArtist(musicInfo4 != null ? musicInfo4.getArtist() : null);
            MusicInfo musicInfo5 = this.musicInfo;
            hMMusicControl.setTitle(musicInfo5 != null ? musicInfo5.getTitle() : null);
            MusicInfo musicInfo6 = this.musicInfo;
            hMMusicControl.setDuration(musicInfo6 != null ? musicInfo6.getDuration() : 0);
            AudioManager audioManager = this.mAudioManager;
            Integer numValueOf2 = audioManager != null ? Integer.valueOf(audioManager.getStreamMaxVolume(3)) : null;
            AudioManager audioManager2 = this.mAudioManager;
            Integer numValueOf3 = audioManager2 != null ? Integer.valueOf(audioManager2.getStreamVolume(3)) : null;
            Intrinsics.checkNotNull(numValueOf3);
            double dIntValue = ((double) numValueOf3.intValue()) * 1.0d;
            Intrinsics.checkNotNull(numValueOf2);
            hMMusicControl.setVolume((int) ((dIntValue / ((double) numValueOf2.intValue())) * ((double) 100)));
            Logger.i(TAG, "syncHuami currentVolume:" + numValueOf3 + " hmMusicControl.volume" + hMMusicControl.getVolume());
            ykf ykfVar = this.mPlayerInfo;
            Intrinsics.checkNotNull(ykfVar);
            long jElapsedRealtime = ykfVar.c == 1 ? SystemClock.elapsedRealtime() - this.mCurrentPositionCallbackTime : 0L;
            ykf ykfVar2 = this.mPlayerInfo;
            Intrinsics.checkNotNull(ykfVar2);
            hMMusicControl.setElapsedTime(RangesKt___RangesKt.coerceAtMost(ykfVar2.i, (int) Math.ceil(((jElapsedRealtime + this.mCurrentPosition) * 1.0f) / 1000)));
            HuamiApiCaller huamiApiCaller = getHuamiApiCaller(DeviceModelExtKt.getMac(deviceModel));
            Boolean boolValueOf = huamiApiCaller != null ? Boolean.valueOf(huamiApiCaller.sendMusicControl(hMMusicControl)) : null;
            Logger.i(TAG, "sendMusicControl==  " + boolValueOf + " elapsedTime:" + hMMusicControl.getElapsedTime() + "  duration" + hMMusicControl.getDuration() + " volume:" + hMMusicControl.getVolume());
        }
        updateCurrentVolume();
    }

    private final void syncNoMusicPlay(WearableDeviceModel deviceModel) {
        if (deviceModel == null || !DeviceModelExtKt.isHuaMi(deviceModel)) {
            Logger.i(TAG, "syncNoMusicPlay deviceModel?.isBle");
            s7r s7rVar = new s7r();
            s7rVar.e = 18;
            s7rVar.f = 1;
            vkf vkfVar = new vkf();
            ykf ykfVar = new ykf();
            ykfVar.c = 0;
            vkfVar.A(ykfVar);
            s7rVar.Y(vkfVar);
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 8, null);
            return;
        }
        Logger.i(TAG, "syncNoMusicPlay deviceModel?.isHuaMi  " + (deviceModel != null ? Boolean.valueOf(DeviceModelExtKt.isHuaMi(deviceModel)) : null));
        HMMusicControl hMMusicControl = new HMMusicControl(HMMusicControl.PhoneState.PLAY);
        hMMusicControl.setException(HMMusicControl.AppException.APP_NONE);
        HuamiApiCaller huamiApiCaller = getHuamiApiCaller(DeviceModelExtKt.getMac(deviceModel));
        if (huamiApiCaller != null) {
            huamiApiCaller.sendMusicControl(hMMusicControl);
        }
    }

    private final void syncNoPermission(WearableDeviceModel deviceModel) {
        if (deviceModel == null || !DeviceModelExtKt.isHuaMi(deviceModel)) {
            Logger.i(TAG, "syncNoPermission deviceModel?.isBle ");
            s7r s7rVar = new s7r();
            s7rVar.e = 18;
            s7rVar.f = 1;
            vkf vkfVar = new vkf();
            ykf ykfVar = new ykf();
            ykfVar.c = 10;
            vkfVar.A(ykfVar);
            s7rVar.Y(vkfVar);
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 8, null);
            return;
        }
        Logger.i(TAG, "syncNoPermission deviceModel?.isHuaMi  " + (deviceModel != null ? Boolean.valueOf(DeviceModelExtKt.isHuaMi(deviceModel)) : null));
        HMMusicControl hMMusicControl = new HMMusicControl(HMMusicControl.PhoneState.PLAY);
        hMMusicControl.setException(HMMusicControl.AppException.NO_PERMISSION);
        HuamiApiCaller huamiApiCaller = getHuamiApiCaller(DeviceModelExtKt.getMac(deviceModel));
        if (huamiApiCaller != null) {
            huamiApiCaller.sendMusicControl(hMMusicControl);
        }
    }

    private final void unregisterVolumeChangeReceiver() {
        ContentResolver contentResolver = AppUtil.getApp().getContentResolver();
        SettingsContentObserver settingsContentObserver = this.mSettingsContentObserver;
        Intrinsics.checkNotNull(settingsContentObserver);
        contentResolver.unregisterContentObserver(settingsContentObserver);
    }

    private final void updateCurrentVolume() {
        if (this.mAudioManager == null) {
            Object systemService = AppUtil.getApp().getSystemService("audio");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            this.mAudioManager = (AudioManager) systemService;
        }
        AudioManager audioManager = this.mAudioManager;
        this.mCurrentVolume = audioManager != null ? audioManager.getStreamVolume(3) : 0;
    }

    public final int onAivsAdjustVolume(boolean raise) {
        if (!isNotificationPolicyAccessGranted()) {
            return 2;
        }
        updateCurrentVolume();
        if (raise) {
            if (this.mCurrentVolume >= MAX_VOLUME) {
                return 6;
            }
            try {
                AudioManager audioManager = this.mAudioManager;
                if (audioManager != null) {
                    audioManager.adjustStreamVolume(3, 1, 1);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            AudioManager audioManager2 = this.mAudioManager;
            int streamVolume = audioManager2 != null ? audioManager2.getStreamVolume(3) : 0;
            Logger.i(TAG, "onControl currentVolume = " + streamVolume);
            this.mPlayerInfo.d = (int) Math.ceil((double) (((streamVolume - MIN_VOLUME) * 100) / MAX_VOLUME));
            onSync(0L);
            return 0;
        }
        if (this.mCurrentVolume <= MIN_VOLUME) {
            return 7;
        }
        try {
            AudioManager audioManager3 = this.mAudioManager;
            if (audioManager3 != null) {
                audioManager3.adjustStreamVolume(3, -1, 1);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        AudioManager audioManager4 = this.mAudioManager;
        Intrinsics.checkNotNull(audioManager4);
        int streamVolume2 = audioManager4.getStreamVolume(3);
        Logger.i(TAG, "onControl currentVolume = " + streamVolume2);
        this.mPlayerInfo.d = (int) Math.ceil((double) (((streamVolume2 - MIN_VOLUME) * 100) / MAX_VOLUME));
        onSync(0L);
        return 0;
    }

    public final int onAivsControl(int state) {
        if (state == 0) {
            ykf ykfVar = this.mPlayerInfo;
            Intrinsics.checkNotNull(ykfVar);
            if (ykfVar.c == 1) {
                return 4;
            }
            ykf ykfVar2 = this.mPlayerInfo;
            Intrinsics.checkNotNull(ykfVar2);
            if (ykfVar2.c != 2) {
                return 3;
            }
            sendMusicKeyEvent(126);
            return 0;
        }
        if (state == 1 || state == 2) {
            ykf ykfVar3 = this.mPlayerInfo;
            Intrinsics.checkNotNull(ykfVar3);
            int i = ykfVar3.c;
            if (i != 1) {
                return i != 2 ? 3 : 5;
            }
            sendMusicKeyEvent(127);
            return 0;
        }
        if (state == 3) {
            ykf ykfVar4 = this.mPlayerInfo;
            Intrinsics.checkNotNull(ykfVar4);
            if (ykfVar4.c != 1) {
                ykf ykfVar5 = this.mPlayerInfo;
                Intrinsics.checkNotNull(ykfVar5);
                if (ykfVar5.c != 2) {
                    return 3;
                }
            }
            sendMusicKeyEvent(88);
            return 0;
        }
        if (state != 4) {
            return 0;
        }
        ykf ykfVar6 = this.mPlayerInfo;
        Intrinsics.checkNotNull(ykfVar6);
        if (ykfVar6.c != 1) {
            ykf ykfVar7 = this.mPlayerInfo;
            Intrinsics.checkNotNull(ykfVar7);
            if (ykfVar7.c != 2) {
                return 3;
            }
        }
        sendMusicKeyEvent(87);
        return 0;
    }

    public final int onAivsSetMute(boolean mute) {
        if (!isNotificationPolicyAccessGranted()) {
            return 2;
        }
        try {
            AudioManager audioManager = this.mAudioManager;
            Intrinsics.checkNotNull(audioManager);
            audioManager.adjustStreamVolume(3, mute ? -100 : 100, 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        AudioManager audioManager2 = this.mAudioManager;
        Intrinsics.checkNotNull(audioManager2);
        int streamVolume = audioManager2.getStreamVolume(3);
        Logger.i(TAG, "onControl currentVolume = " + streamVolume);
        int iCeil = (int) Math.ceil((double) (((streamVolume - MIN_VOLUME) * 100) / MAX_VOLUME));
        ykf ykfVar = this.mPlayerInfo;
        Intrinsics.checkNotNull(ykfVar);
        ykfVar.d = iCeil;
        onSync(0L);
        return 0;
    }

    public final int onAivsSetVolume(int volume, boolean percent) {
        if (!isNotificationPolicyAccessGranted()) {
            return 2;
        }
        if (!percent) {
            int i = MAX_VOLUME;
            if (volume >= i || volume <= (i = MIN_VOLUME)) {
                volume = i;
            }
        } else if (volume >= 100) {
            volume = MAX_VOLUME;
        } else if (volume <= 0) {
            volume = MIN_VOLUME;
        } else {
            int i2 = MAX_VOLUME;
            int i3 = MIN_VOLUME;
            volume = (((i2 - i3) * volume) / 100) + i3;
        }
        try {
            AudioManager audioManager = this.mAudioManager;
            Intrinsics.checkNotNull(audioManager);
            audioManager.setStreamVolume(3, volume, 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        AudioManager audioManager2 = this.mAudioManager;
        Intrinsics.checkNotNull(audioManager2);
        int streamVolume = audioManager2.getStreamVolume(3);
        Logger.i(TAG, "onControl currentVolume = " + streamVolume);
        int iCeil = (int) Math.ceil((double) (((streamVolume - MIN_VOLUME) * 100) / MAX_VOLUME));
        ykf ykfVar = this.mPlayerInfo;
        Intrinsics.checkNotNull(ykfVar);
        ykfVar.d = iCeil;
        onSync(0L);
        return 0;
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientChange(boolean clearing) {
        Logger.i(TAG, "onClientChange, clearing = " + clearing);
        if (clearing) {
            initData();
            onSync(0L);
        }
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientMetadataUpdate(@NotNull RemoteController.MetadataEditor metadataEditor) {
        Intrinsics.checkNotNullParameter(metadataEditor, "metadataEditor");
        Logger.e(TAG, "onClientMetadataUpdate   ====");
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientPlaybackStateUpdate(int state) {
        onClientPlaybackStateUpdate(state, 0L, 0L, 0.0f);
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientTransportControlUpdate(int transportControlFlags) {
        Logger.e(TAG, "onClientTransportControlUpdate   ====");
    }

    public final void onControl(int controll) {
        Logger.i(TAG, "onControl huami " + controll);
        if (controll == 0) {
            sendMusicKeyEvent(126);
            sendCmdPoint(0);
        } else if (controll == 1) {
            sendCmdPoint(1);
            sendMusicKeyEvent(127);
        } else if (controll == 2) {
            sendCmdPoint(4);
            sendMusicKeyEvent(87);
        } else if (controll == 3) {
            sendCmdPoint(3);
            sendMusicKeyEvent(88);
        } else if (controll == 4) {
            sendCmdPoint(5);
            AudioManager audioManager = this.mAudioManager;
            Intrinsics.checkNotNull(audioManager);
            int streamVolume = audioManager.getStreamVolume(3);
            AudioManager audioManager2 = this.mAudioManager;
            Intrinsics.checkNotNull(audioManager2);
            Logger.i(TAG, "onControl up before currentVolume:" + streamVolume + " isVolumeFixed:" + audioManager2.isVolumeFixed());
            AudioManager audioManager3 = this.mAudioManager;
            Intrinsics.checkNotNull(audioManager3);
            audioManager3.adjustStreamVolume(3, 1, 1);
            onSync(0L);
        } else if (controll == 5) {
            sendCmdPoint(5);
            AudioManager audioManager4 = this.mAudioManager;
            Intrinsics.checkNotNull(audioManager4);
            int streamVolume2 = audioManager4.getStreamVolume(3);
            AudioManager audioManager5 = this.mAudioManager;
            Intrinsics.checkNotNull(audioManager5);
            Logger.i(TAG, "onControl down before currentVolume:" + streamVolume2 + " isVolumeFixed:" + audioManager5.isVolumeFixed());
            AudioManager audioManager6 = this.mAudioManager;
            Intrinsics.checkNotNull(audioManager6);
            audioManager6.adjustStreamVolume(3, -1, 1);
            onSync(0L);
        }
        if (controll == 0 || controll == 1 || controll == 2 || controll == 3) {
            sendPointMessage(controll);
        }
    }

    public final void onDestroy() {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        unregisterVolumeChangeReceiver();
        this.mCurrentMediaController = null;
        clearAllCotroller();
        this.mListenerComponent = null;
        MediaSessionManager mediaSessionManager = this.mSessionManager;
        if (mediaSessionManager != null) {
            if (mediaSessionManager != null) {
                MediaSessionManager.OnActiveSessionsChangedListener onActiveSessionsChangedListener = this.mSessionListener;
                Intrinsics.checkNotNull(onActiveSessionsChangedListener);
                mediaSessionManager.removeOnActiveSessionsChangedListener(onActiveSessionsChangedListener);
            }
            this.mSessionManager = null;
            this.mSessionListener = null;
        }
    }

    public final void onRequest(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i(TAG, "onRequest did:" + did);
        onSync(0L);
    }

    public final void registerRemoteController(@Nullable ComponentName componentName) {
        if (componentName == null) {
            Logger.i(TAG, "registerRemoteController componentName is null");
            return;
        }
        if (!NotifyHelperExtKt.getNotificationManagerExport().isNotificationListenersEnabled()) {
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, "56.0.0.0.42325"), "name", "music_permission_setting", "result", Boolean.FALSE);
            Logger.e(TAG, "registerRemoteController isNotificationListenersEnabled false");
            syncNoPermission((WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel());
            return;
        }
        if (this.mListenerComponent == null) {
            this.mListenerComponent = componentName;
        }
        if (this.mSessionManager == null) {
            Object systemService = AppUtil.getApp().getSystemService("media_session");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.session.MediaSessionManager");
            this.mSessionManager = (MediaSessionManager) systemService;
        }
        if (this.mSessionListener == null) {
            this.mSessionListener = new TopTransportSessionListener();
        }
        try {
            this.isRegistered = true;
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, "56.0.0.0.42325"), "name", "music_permission_setting", "result", Boolean.TRUE);
            MediaSessionManager.OnActiveSessionsChangedListener onActiveSessionsChangedListener = this.mSessionListener;
            if (onActiveSessionsChangedListener != null) {
                MediaSessionManager mediaSessionManager = this.mSessionManager;
                if (mediaSessionManager != null) {
                    mediaSessionManager.removeOnActiveSessionsChangedListener(onActiveSessionsChangedListener);
                }
                MediaSessionManager mediaSessionManager2 = this.mSessionManager;
                if (mediaSessionManager2 != null) {
                    mediaSessionManager2.addOnActiveSessionsChangedListener(onActiveSessionsChangedListener, this.mListenerComponent, this.mHandler);
                }
                MediaSessionManager.OnActiveSessionsChangedListener onActiveSessionsChangedListener2 = this.mSessionListener;
                if (onActiveSessionsChangedListener2 != null) {
                    MediaSessionManager mediaSessionManager3 = this.mSessionManager;
                    onActiveSessionsChangedListener2.onActiveSessionsChanged(mediaSessionManager3 != null ? mediaSessionManager3.getActiveSessions(this.mListenerComponent) : null);
                }
                Logger.i(TAG, "registerRemoteController true");
            }
        } catch (Exception e) {
            Logger.e(TAG, e);
        }
    }

    public final void sendCmdPoint(int command) {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, "56.0.0.0.42328"), "name", "music_control_cmd", "operation", Integer.valueOf(command));
    }

    /* JADX WARN: Code duplicated, block: B:46:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:53:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:56:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ec  */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x01a2, please report this as an issue */
    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientPlaybackStateUpdate(int state, long stateChangeTimeMs, long currentPosMs, float speed) {
        int i;
        HMMusicControl.PhoneState phoneState;
        MediaController mediaController;
        MediaMetadata metadata;
        String string;
        String string2;
        long j = this.mCurrentPosition;
        MusicInfo musicInfo = this.musicInfo;
        Intrinsics.checkNotNull(musicInfo);
        Logger.i(TAG, "onClientPlaybackStateUpdate, state = " + state + ", currentPosMs = " + currentPosMs + ", speed = " + speed + ", mCurrentPosition = " + j + ",  duration = " + musicInfo.getDuration());
        MusicInfo musicInfo2 = this.musicInfo;
        Intrinsics.checkNotNull(musicInfo2);
        if (state == musicInfo2.getState() && this.mCurrentPosition == currentPosMs) {
            return;
        }
        int size = this.controllerAndCaback.size();
        for (int i2 = 0; i2 < size; i2++) {
            ControllerAndCallBack controllerAndCallBack = this.controllerAndCaback.get(i2);
            Intrinsics.checkNotNullExpressionValue(controllerAndCallBack, "get(...)");
            ControllerAndCallBack controllerAndCallBack2 = controllerAndCallBack;
            PlaybackState playbackState = controllerAndCallBack2.getController().getPlaybackState();
            if (playbackState != null && playbackState.getState() == 3) {
                this.mCurrentMediaController = controllerAndCallBack2.getController();
                Logger.e(TAG, "onClientPlaybackStateUpdate find playing media info packageName:" + controllerAndCallBack2.getController().getPackageName());
                break;
            }
        }
        this.mCurrentPositionCallbackTime = SystemClock.elapsedRealtime();
        this.mCurrentPosition = currentPosMs;
        switch (state) {
            case 0:
            case 7:
            default:
                i = 0;
                break;
            case 1:
                i = 3;
                break;
            case 2:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
                i = 2;
                break;
            case 3:
                i = 1;
                break;
        }
        HMMusicControl.AppException appException = HMMusicControl.AppException.UNKNOWN;
        switch (state) {
            case 0:
                phoneState = HMMusicControl.PhoneState.PLAY;
                appException = HMMusicControl.AppException.NO_MUSIC;
                break;
            case 1:
            case 2:
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
                phoneState = HMMusicControl.PhoneState.PAUSE;
                break;
            case 3:
                phoneState = HMMusicControl.PhoneState.PLAY;
                break;
            case 4:
                phoneState = HMMusicControl.PhoneState.FORWARD;
                break;
            case 5:
                phoneState = HMMusicControl.PhoneState.REWIND;
                break;
            case 7:
            default:
                phoneState = null;
                break;
        }
        MusicInfo musicInfo3 = this.musicInfo;
        Intrinsics.checkNotNull(musicInfo3);
        musicInfo3.setState(state);
        HMMusicControl hMMusicControl = new HMMusicControl(phoneState);
        hMMusicControl.setException(appException);
        MusicInfo musicInfo4 = this.musicInfo;
        Intrinsics.checkNotNull(musicInfo4);
        hMMusicControl.setArtist(musicInfo4.getArtist());
        MusicInfo musicInfo5 = this.musicInfo;
        Intrinsics.checkNotNull(musicInfo5);
        hMMusicControl.setTitle(musicInfo5.getTitle());
        MusicInfo musicInfo6 = this.musicInfo;
        Intrinsics.checkNotNull(musicInfo6);
        hMMusicControl.setDuration(musicInfo6.getDuration());
        MusicInfo musicInfo7 = this.musicInfo;
        Intrinsics.checkNotNull(musicInfo7);
        musicInfo7.setCurrentPosition(currentPosMs);
        MusicInfo musicInfo8 = this.musicInfo;
        Intrinsics.checkNotNull(musicInfo8);
        musicInfo8.setSystemTime(SystemClock.elapsedRealtime());
        float f = 1000;
        hMMusicControl.setElapsedTime(Math.round((currentPosMs * 1.0f) / f));
        AudioManager audioManager = this.mAudioManager;
        Intrinsics.checkNotNull(audioManager);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        AudioManager audioManager2 = this.mAudioManager;
        Intrinsics.checkNotNull(audioManager2);
        hMMusicControl.setVolume((int) (((((double) audioManager2.getStreamVolume(3)) * 1.0d) / ((double) streamMaxVolume)) * ((double) 100)));
        ykf ykfVar = this.mPlayerInfo;
        Intrinsics.checkNotNull(ykfVar);
        ykfVar.c = i;
        boolean z = state == 3;
        ykf ykfVar2 = this.mPlayerInfo;
        Intrinsics.checkNotNull(ykfVar2);
        Logger.i(TAG, "onClientPlaybackStateUpdate isPlaying:" + z + " mPlayerInfo!!.state:" + ykfVar2.c);
        if (z) {
            int size2 = this.controllerAndCaback.size();
            for (int i3 = 0; i3 < size2; i3++) {
                MediaController controller = this.controllerAndCaback.get(i3).getController();
                PlaybackState playbackState2 = controller.getPlaybackState();
                if (playbackState2 != null && playbackState2.getState() == 3) {
                    this.mCurrentMediaController = controller;
                    Logger.i(TAG, "onClientPlaybackStateUpdate find playing controller");
                    if (this.mCurrentMediaController == null) {
                        Logger.e(TAG, "onClientPlaybackStateUpdate can't find playing controller isPlaying:" + z);
                    }
                    mediaController = this.mCurrentMediaController;
                    if (mediaController != null && (metadata = mediaController.getMetadata()) != null) {
                        string = metadata.getString(MediaMetadataCompat.METADATA_KEY_ARTIST);
                        string2 = metadata.getString(MediaMetadataCompat.METADATA_KEY_TITLE);
                        if (TextUtils.isEmpty(string2)) {
                            string2 = metadata.getString(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE);
                        }
                        int iRound = Math.round((metadata.getLong(MediaMetadataCompat.METADATA_KEY_DURATION) * 1.0f) / f);
                        if (string2 == null) {
                            string2 = "";
                        }
                        if (string == null) {
                            string = "";
                        }
                        ykf ykfVar3 = this.mPlayerInfo;
                        Intrinsics.checkNotNull(ykfVar3);
                        ykfVar3.f = string2;
                        ykf ykfVar4 = this.mPlayerInfo;
                        Intrinsics.checkNotNull(ykfVar4);
                        ykfVar4.g = string;
                        ykf ykfVar5 = this.mPlayerInfo;
                        Intrinsics.checkNotNull(ykfVar5);
                        ykfVar5.i = iRound;
                        MusicInfo musicInfo9 = this.musicInfo;
                        Intrinsics.checkNotNull(musicInfo9);
                        musicInfo9.setTitle(string2);
                        MusicInfo musicInfo10 = this.musicInfo;
                        Intrinsics.checkNotNull(musicInfo10);
                        musicInfo10.setArtist(string);
                        MusicInfo musicInfo11 = this.musicInfo;
                        Intrinsics.checkNotNull(musicInfo11);
                        musicInfo11.setDuration(iRound);
                    }
                    Logger.i(TAG, "onClientPlaybackStateUpdate init playing controller media Info mPlayerInfo:" + this.mPlayerInfo);
                }
            }
            if (this.mCurrentMediaController == null) {
                Logger.e(TAG, "onClientPlaybackStateUpdate can't find playing controller isPlaying:" + z);
            }
            mediaController = this.mCurrentMediaController;
            if (mediaController != null) {
                string = metadata.getString(MediaMetadataCompat.METADATA_KEY_ARTIST);
                string2 = metadata.getString(MediaMetadataCompat.METADATA_KEY_TITLE);
                if (TextUtils.isEmpty(string2)) {
                    string2 = metadata.getString(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE);
                }
                int iRound2 = Math.round((metadata.getLong(MediaMetadataCompat.METADATA_KEY_DURATION) * 1.0f) / f);
                if (string2 == null) {
                    string2 = "";
                }
                if (string == null) {
                    string = "";
                }
                ykf ykfVar6 = this.mPlayerInfo;
                Intrinsics.checkNotNull(ykfVar6);
                ykfVar6.f = string2;
                ykf ykfVar7 = this.mPlayerInfo;
                Intrinsics.checkNotNull(ykfVar7);
                ykfVar7.g = string;
                ykf ykfVar8 = this.mPlayerInfo;
                Intrinsics.checkNotNull(ykfVar8);
                ykfVar8.i = iRound2;
                MusicInfo musicInfo12 = this.musicInfo;
                Intrinsics.checkNotNull(musicInfo12);
                musicInfo12.setTitle(string2);
                MusicInfo musicInfo13 = this.musicInfo;
                Intrinsics.checkNotNull(musicInfo13);
                musicInfo13.setArtist(string);
                MusicInfo musicInfo14 = this.musicInfo;
                Intrinsics.checkNotNull(musicInfo14);
                musicInfo14.setDuration(iRound2);
            }
            Logger.i(TAG, "onClientPlaybackStateUpdate init playing controller media Info mPlayerInfo:" + this.mPlayerInfo);
        }
        ykf ykfVar9 = this.mPlayerInfo;
        Intrinsics.checkNotNull(ykfVar9);
        onSync(ykfVar9.c == 1 ? 0L : 100L);
    }

    public final void onControl(@Nullable final vkf media) {
        MediaController.TransportControls transportControls;
        MediaController.TransportControls transportControls2;
        MediaController.TransportControls transportControls3;
        MediaController.TransportControls transportControls4;
        Logger.i(TAG, "MediaSyncManager onControl");
        if (media != null && media.p() != null) {
            int i = media.p().c;
            MediaController mediaController = this.mCurrentMediaController;
            Logger.i(TAG, "onControl ble " + i + " packName:" + (mediaController != null ? mediaController.getPackageName() : null));
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, "56.0.0.0.42328"), "name", "music_control_cmd", "operation", Integer.valueOf(media.p().c));
            int i2 = media.p().c;
            if (i2 == 0) {
                MediaController mediaController2 = this.mCurrentMediaController;
                if (mediaController2 != null && (transportControls = mediaController2.getTransportControls()) != null) {
                    transportControls.play();
                }
            } else if (i2 == 1) {
                MediaController mediaController3 = this.mCurrentMediaController;
                if (mediaController3 != null && (transportControls2 = mediaController3.getTransportControls()) != null) {
                    transportControls2.pause();
                }
            } else if (i2 == 3) {
                MediaController mediaController4 = this.mCurrentMediaController;
                if (mediaController4 != null && (transportControls3 = mediaController4.getTransportControls()) != null) {
                    transportControls3.skipToPrevious();
                }
            } else if (i2 == 4) {
                MediaController mediaController5 = this.mCurrentMediaController;
                if (mediaController5 != null && (transportControls4 = mediaController5.getTransportControls()) != null) {
                    transportControls4.skipToNext();
                }
            } else if (i2 == 5) {
                int i3 = media.p().d;
                ykf ykfVar = this.mPlayerInfo;
                Intrinsics.checkNotNull(ykfVar);
                int i4 = ykfVar.d;
                AudioManager audioManager = this.mAudioManager;
                Intrinsics.checkNotNull(audioManager);
                Logger.i(TAG, "onControl deviceVolume:" + i3 + "  preVolume:" + i4 + " isVolumeFixed:" + audioManager.isVolumeFixed());
                int i5 = media.p().d;
                ykf ykfVar2 = this.mPlayerInfo;
                Intrinsics.checkNotNull(ykfVar2);
                if (i5 > ykfVar2.d) {
                    Logger.i(TAG, "onControl ADJUST_RAISE");
                    AudioManager audioManager2 = this.mAudioManager;
                    Intrinsics.checkNotNull(audioManager2);
                    audioManager2.adjustStreamVolume(3, 1, 1);
                } else {
                    int i6 = media.p().d;
                    ykf ykfVar3 = this.mPlayerInfo;
                    Intrinsics.checkNotNull(ykfVar3);
                    if (i6 < ykfVar3.d) {
                        Logger.i(TAG, "onControl ADJUST_LOWER");
                        AudioManager audioManager3 = this.mAudioManager;
                        Intrinsics.checkNotNull(audioManager3);
                        audioManager3.adjustStreamVolume(3, -1, 1);
                    }
                }
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: dmf
                        @Override // java.lang.Runnable
                        public final void run() {
                            MediaSyncManager.onControl$lambda$4(this.f15688a, media);
                        }
                    });
                }
            }
            int i7 = media.p().c;
            if (i7 == 0 || i7 == 1 || i7 == 3 || i7 == 4) {
                sendPointMessage(media.p().c);
                return;
            }
            return;
        }
        Logger.i(TAG, "onControl ble media == null || media.playerControl == null");
    }
}
