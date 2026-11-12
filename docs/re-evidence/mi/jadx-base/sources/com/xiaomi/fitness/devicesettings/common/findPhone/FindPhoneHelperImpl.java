package com.xiaomi.fitness.devicesettings.common.findPhone;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.Vibrator;
import android.telephony.TelephonyManager;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.PendingIntentExtKt;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.common.findPhone.FindPhoneHelperImpl;
import com.xiaomi.fitness.devicesettings.export.FindPhoneHelper;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.notify.Constant;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.dxi;
import defpackage.r72;
import defpackage.s7r;
import defpackage.txo;
import defpackage.vzi;
import defpackage.wwg;
import defpackage.wzi;
import java.io.File;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\"\u001a\u00020\u0014H\u0002J\b\u0010%\u001a\u00020\u0014H\u0002J\u0006\u0010&\u001a\u00020\u0014J\u0010\u0010'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u001dH\u0016J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u001dH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u001dX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001dX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u001dX\u0082D¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/findPhone/FindPhoneHelperImpl;", "Lcom/xiaomi/fitness/devicesettings/export/FindPhoneHelper;", "<init>", "()V", "mMediaPlayer", "Landroid/media/MediaPlayer;", "mVibrator", "Landroid/os/Vibrator;", "mSelfStopped", "", "mAudioManager", "Landroid/media/AudioManager;", "mCurrentVolume", "", "mTimeUp", "handler", "Landroid/os/Handler;", "delayCallBack", "Ljava/lang/Runnable;", "stopPlay", "", "release", "stopSelf", "sendStopEvent2Device", OneTrack.Event.PLAY, "vibrator", "duration", "", "TAG", "", "FIND_PHONE_END", "getFIND_PHONE_END", "()Ljava/lang/String;", "sRingtonePath", "needShowNotification", "CHANNEL_ID", "CHANNEL_NAME", "showNotification", BroadcastsKt.SILENT_PUSHING_STOP, StatConstants.PARAM_START, "did", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FindPhoneHelperImpl implements FindPhoneHelper {

    @NotNull
    private final String CHANNEL_ID;

    @NotNull
    private final String CHANNEL_NAME;

    @NotNull
    private final AudioManager mAudioManager;
    private int mCurrentVolume;

    @Nullable
    private MediaPlayer mMediaPlayer;
    private boolean mSelfStopped;
    private boolean mTimeUp;

    @Nullable
    private Vibrator mVibrator;

    @NotNull
    private final String sRingtonePath;

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    @NotNull
    private Runnable delayCallBack = new Runnable() { // from class: pn9
        @Override // java.lang.Runnable
        public final void run() {
            FindPhoneHelperImpl.delayCallBack$lambda$0(this.f30557a);
        }
    };

    @NotNull
    private final String TAG = AIApiConstants.FindPhone.NAME;

    @NotNull
    private final String FIND_PHONE_END = Constant.FIND_PHONE_END;

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.findPhone.FindPhoneHelperImpl$sendStopEvent2Device$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.findPhone.FindPhoneHelperImpl$sendStopEvent2Device$1", f = "FindPhoneHelperImpl.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WearableDeviceModel $deviceModel;
        int label;
        final /* synthetic */ FindPhoneHelperImpl this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.findPhone.FindPhoneHelperImpl$sendStopEvent2Device$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.findPhone.FindPhoneHelperImpl$sendStopEvent2Device$1$1", f = "FindPhoneHelperImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ WearableDeviceModel $deviceModel;
            int label;
            final /* synthetic */ FindPhoneHelperImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04811(WearableDeviceModel wearableDeviceModel, FindPhoneHelperImpl findPhoneHelperImpl, Continuation<? super C04811> continuation) {
                super(2, continuation);
                this.$deviceModel = wearableDeviceModel;
                this.this$0 = findPhoneHelperImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04811(this.$deviceModel, this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(DeviceModelExtKt.getMac(this.$deviceModel));
                Boolean boolBoxBoolean = huaMiApiCaller != null ? Boxing.boxBoolean(huaMiApiCaller.updateFindPhoneStatus(false)) : null;
                Logger.i(this.this$0.TAG, "huami updateFindPhoneStatus:" + boolBoxBoolean);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WearableDeviceModel wearableDeviceModel, FindPhoneHelperImpl findPhoneHelperImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$deviceModel = wearableDeviceModel;
            this.this$0 = findPhoneHelperImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$deviceModel, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C04811 c04811 = new C04811(this.$deviceModel, this.this$0, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c04811, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public FindPhoneHelperImpl() {
        String path = ApplicationExtKt.getApplication().getFilesDir().getPath();
        String str = File.separator;
        this.sRingtonePath = path + str + "ringtone" + str + "mi.mp3";
        this.CHANNEL_ID = "com.xiaomi.wearable-findphone";
        this.CHANNEL_NAME = "com.xiaomi.wearable-findphone-channle";
        Object systemService = ApplicationExtKt.getApplication().getSystemService("audio");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        this.mAudioManager = audioManager;
        int streamVolume = audioManager.getStreamVolume(4);
        this.mCurrentVolume = streamVolume;
        Logger.i(AIApiConstants.FindPhone.NAME, "init mAudioManager  mCurrentVolume:" + streamVolume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void delayCallBack$lambda$0(FindPhoneHelperImpl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mTimeUp = true;
        Logger.i(this$0.TAG, "timeUp");
        this$0.stopSelf();
    }

    private final void needShowNotification() {
        Object systemService = ApplicationExtKt.getApplication().getSystemService("power");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        if (((PowerManager) systemService).isInteractive()) {
            showNotification();
        }
    }

    private final void play() {
        try {
            int streamVolume = this.mAudioManager.getStreamVolume(4);
            this.mCurrentVolume = streamVolume;
            Logger.i(this.TAG, "play  mAudioManager mCurrentVolume:" + streamVolume);
            this.mAudioManager.setStreamVolume(4, this.mAudioManager.getStreamMaxVolume(4), 0);
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.mMediaPlayer = mediaPlayer;
            Intrinsics.checkNotNull(mediaPlayer);
            mediaPlayer.setVolume(1.0f, 1.0f);
            MediaPlayer mediaPlayer2 = this.mMediaPlayer;
            Intrinsics.checkNotNull(mediaPlayer2);
            mediaPlayer2.setAudioStreamType(4);
            MediaPlayer mediaPlayer3 = this.mMediaPlayer;
            Intrinsics.checkNotNull(mediaPlayer3);
            mediaPlayer3.setDataSource(this.sRingtonePath);
            MediaPlayer mediaPlayer4 = this.mMediaPlayer;
            Intrinsics.checkNotNull(mediaPlayer4);
            mediaPlayer4.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: mn9
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer5) {
                    FindPhoneHelperImpl.play$lambda$1(this.f27023a, mediaPlayer5);
                }
            });
            MediaPlayer mediaPlayer5 = this.mMediaPlayer;
            Intrinsics.checkNotNull(mediaPlayer5);
            mediaPlayer5.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: nn9
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer6, int i, int i2) {
                    return FindPhoneHelperImpl.play$lambda$2(this.f28087a, mediaPlayer6, i, i2);
                }
            });
            MediaPlayer mediaPlayer6 = this.mMediaPlayer;
            Intrinsics.checkNotNull(mediaPlayer6);
            mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: on9
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer7) {
                    FindPhoneHelperImpl.play$lambda$3(this.f29315a, mediaPlayer7);
                }
            });
            MediaPlayer mediaPlayer7 = this.mMediaPlayer;
            Intrinsics.checkNotNull(mediaPlayer7);
            mediaPlayer7.setLooping(true);
            MediaPlayer mediaPlayer8 = this.mMediaPlayer;
            Intrinsics.checkNotNull(mediaPlayer8);
            mediaPlayer8.prepare();
            MediaPlayer mediaPlayer9 = this.mMediaPlayer;
            Intrinsics.checkNotNull(mediaPlayer9);
            mediaPlayer9.start();
            this.handler.postDelayed(this.delayCallBack, 60000L);
            Logger.i(this.TAG, StatConstants.PARAM_START);
        } catch (Exception e) {
            Logger.i(this.TAG, e);
            e.printStackTrace();
            stopSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void play$lambda$1(FindPhoneHelperImpl this$0, MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(this$0.TAG, "onPrepared");
        this$0.vibrator(mediaPlayer.getDuration());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean play$lambda$2(FindPhoneHelperImpl this$0, MediaPlayer mediaPlayer, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(this$0.TAG, "onError " + mediaPlayer + " " + i + " " + i2);
        this$0.stopSelf();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void play$lambda$3(FindPhoneHelperImpl this$0, MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(this$0.TAG, "onCompletion");
    }

    private final void release() {
        try {
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            if (mediaPlayer != null) {
                Intrinsics.checkNotNull(mediaPlayer);
                mediaPlayer.release();
                this.mMediaPlayer = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void sendStopEvent2Device() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            if (!DeviceModelExtKt.isBluetooth(wearableDeviceModel) && !DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
                if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
                    ScopeExtKt.scope$default(null, new AnonymousClass1(wearableDeviceModel, this, null), 1, null);
                    return;
                }
                return;
            }
            s7r s7rVar = new s7r();
            s7rVar.e = 2;
            s7rVar.f = 17;
            txo txoVar = new txo();
            txoVar.X(1);
            s7rVar.c0(txoVar);
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 8, null);
        }
    }

    private final void showNotification() {
        Application application = ApplicationExtKt.getApplication();
        Object systemService = application.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        Object systemService2 = application.getSystemService("notification");
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService2).createNotificationChannel(new NotificationChannel(this.CHANNEL_ID, this.CHANNEL_NAME, 3));
        Intent intent = new Intent();
        intent.setAction(this.FIND_PHONE_END);
        Notification notificationD = new wwg.e(application, this.CHANNEL_ID).g(false).k(application.getResources().getString(wzi.X1)).B(System.currentTimeMillis()).u(dxi.f16035a).q(BitmapFactory.decodeResource(application.getResources(), dxi.f16035a)).i(PendingIntentExtKt.getBroadcastPendingIntent$default(application, 0, intent, 0, 4, null)).g(true).d();
        Intrinsics.checkNotNullExpressionValue(notificationD, "build(...)");
        ((NotificationManager) systemService).notify(vzi.f37395a, notificationD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$5(File file, FindPhoneHelperImpl this$0) {
        Intrinsics.checkNotNullParameter(file, "$file");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        Application application = ApplicationExtKt.getApplication();
        File parentFile = file.getParentFile();
        r72.b(application, "ringtone", parentFile != null ? parentFile.getAbsolutePath() : null);
        this$0.play();
    }

    private final void stopPlay() {
        this.handler.removeCallbacks(this.delayCallBack);
        this.mSelfStopped = true;
        try {
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            Boolean boolValueOf = mediaPlayer != null ? Boolean.valueOf(mediaPlayer.isPlaying()) : null;
            Logger.i(this.TAG, "stopPlay isPlaying:" + boolValueOf + " mMediaPlayer:" + this.mMediaPlayer);
            if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
                this.mAudioManager.setStreamVolume(4, this.mCurrentVolume, 0);
            }
            MediaPlayer mediaPlayer2 = this.mMediaPlayer;
            if (mediaPlayer2 != null) {
                Intrinsics.checkNotNull(mediaPlayer2);
                mediaPlayer2.stop();
                MediaPlayer mediaPlayer3 = this.mMediaPlayer;
                Intrinsics.checkNotNull(mediaPlayer3);
                mediaPlayer3.release();
                this.mMediaPlayer = null;
            }
            Vibrator vibrator = this.mVibrator;
            if (vibrator != null) {
                Intrinsics.checkNotNull(vibrator);
                vibrator.cancel();
                this.mVibrator = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            release();
        }
    }

    private final void stopSelf() {
        Logger.i(this.TAG, "stopSelf");
        stopPlay();
        try {
            Logger.i(this.TAG, "mSelfStopped: " + this.mSelfStopped + " mTimeUp: " + this.mTimeUp);
            if (!this.mSelfStopped && !this.mTimeUp) {
                return;
            }
            sendStopEvent2Device();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void vibrator(long duration) {
        Object systemService = ApplicationExtKt.getApplication().getSystemService("vibrator");
        this.mVibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
        int i = (int) (duration / ((long) 4000));
        long[] jArr = new long[i * 2];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 2;
            jArr[i3] = 2000;
            jArr[i3 + 1] = 2000;
        }
        Logger.i(this.TAG, Arrays.toString(jArr) + "  duration:" + duration);
        Vibrator vibrator = this.mVibrator;
        if (vibrator != null) {
            vibrator.vibrate(jArr, -1);
        }
    }

    @NotNull
    public final String getFIND_PHONE_END() {
        return this.FIND_PHONE_END;
    }

    @Override // com.xiaomi.fitness.devicesettings.export.FindPhoneHelper
    public void start(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        Object systemService = ApplicationExtKt.getApplication().getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        boolean zIsPermissionGranted = PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.READ_PHONE_STATE");
        Logger.i(this.TAG, "start did:" + did + " pid:" + Process.myPid() + " isGranted:" + zIsPermissionGranted);
        if (zIsPermissionGranted) {
            int callState = telephonyManager.getCallState();
            Logger.i(this.TAG, "start callState:" + callState);
            if (callState != 0) {
                sendStopEvent2Device();
                return;
            }
        }
        stopPlay();
        needShowNotification();
        final File file = new File(this.sRingtonePath);
        if (file.exists()) {
            play();
        } else {
            new Thread(new Runnable() { // from class: ln9
                @Override // java.lang.Runnable
                public final void run() {
                    FindPhoneHelperImpl.start$lambda$5(file, this);
                }
            }).start();
        }
    }

    public final void stop() {
        synchronized (FindPhoneHelperImpl.class) {
            stopSelf();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.xiaomi.fitness.devicesettings.export.FindPhoneHelper
    public void stop(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        try {
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            Boolean boolValueOf = mediaPlayer != null ? Boolean.valueOf(mediaPlayer.isPlaying()) : null;
            Logger.i(this.TAG, "stop isPlaying:" + boolValueOf + " mMediaPlayer:" + this.mMediaPlayer);
            if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
                synchronized (FindPhoneHelperImpl.class) {
                    stopSelf();
                    Unit unit = Unit.INSTANCE;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            release();
        }
    }
}
