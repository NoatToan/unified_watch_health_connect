package com.xiaomi.fitness.milink.circulate;

import android.media.AudioManager;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.MediaMetadataCompat;
import com.miui.circulate.api.protocol.audio.support.MediaMetaData;
import com.miui.circulate.api.service.CirculateDeviceInfo;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.milink.bean.ExtraAudioData;
import com.xiaomi.fitness.milink.circulate.PhoneDeviceController;
import com.xiaomi.fitness.milink.local.ActiveAudioSessionManager;
import com.xiaomi.fitness.milink.util.AudioServiceControllerExtKt;
import com.xiaomi.fitness.milink.util.MilinkHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0006*\u0002\u001a\u001d\u0018\u0000 P2\u00020\u0001:\u0001PB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002J\u0017\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0002\u0010'J \u0010(\u001a\u00020)2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010+2\u0006\u0010,\u001a\u00020 H\u0002J\u0014\u0010-\u001a\u00020)2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020)0/J.\u00100\u001a\u00020)2\u0006\u00101\u001a\u00020%2\u0006\u00102\u001a\u00020%2\u0006\u00103\u001a\u00020\u00162\u0006\u00104\u001a\u00020 H\u0096@¢\u0006\u0002\u00105J\u0010\u00106\u001a\u00020)2\u0006\u00107\u001a\u00020%H\u0016J\b\u00108\u001a\u00020%H\u0016J\u0010\u00109\u001a\u00020)2\u0006\u00107\u001a\u00020%H\u0016J\u0010\u0010E\u001a\u00020)2\u0006\u0010&\u001a\u00020%H\u0016J\u0010\u0010F\u001a\u00020)2\u0006\u0010&\u001a\u00020%H\u0002J\u000e\u0010G\u001a\u00020)2\u0006\u0010H\u001a\u00020\u0016J\u0010\u0010I\u001a\u00020)2\u0006\u0010J\u001a\u00020KH\u0016J\u0006\u0010L\u001a\u00020)R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001bR\u0010\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u001c\u0010:\u001a\u0004\u0018\u00010;X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010@\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0014\u0010M\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Lcom/xiaomi/fitness/milink/circulate/PhoneDeviceController;", "Lcom/xiaomi/fitness/milink/circulate/AudioDeviceController;", "deviceInfo", "Lcom/miui/circulate/api/service/CirculateDeviceInfo;", "<init>", "(Lcom/miui/circulate/api/service/CirculateDeviceInfo;)V", "mHandler", "Landroid/os/Handler;", "mAudioManager", "Landroid/media/AudioManager;", "mediaSessionManager", "Landroid/media/session/MediaSessionManager;", "onActiveSessionsChangedListener", "Landroid/media/session/MediaSessionManager$OnActiveSessionsChangedListener;", "currentMediaController", "Landroid/media/session/MediaController;", "getCurrentMediaController", "()Landroid/media/session/MediaController;", "setCurrentMediaController", "(Landroid/media/session/MediaController;)V", "blockList", "", "", "getBlockList", "()Ljava/util/List;", "activeAudioSessionCallback", "com/xiaomi/fitness/milink/circulate/PhoneDeviceController$activeAudioSessionCallback$1", "Lcom/xiaomi/fitness/milink/circulate/PhoneDeviceController$activeAudioSessionCallback$1;", "mediaControllerCallback", "com/xiaomi/fitness/milink/circulate/PhoneDeviceController$mediaControllerCallback$1", "Lcom/xiaomi/fitness/milink/circulate/PhoneDeviceController$mediaControllerCallback$1;", "isSameMetaData", "", "old", "Lcom/miui/circulate/api/protocol/audio/support/MediaMetaData;", "new", "getPlayState", "", "state", "(Ljava/lang/Integer;)I", "handleOnActiveSessionsChanged", "", "controllers", "", "init", "updateAudioInfoSync", "complete", "Lkotlin/Function0;", "handleAudioControl", "cmd", "intValue", "strValue", "isCirculate", "(IILjava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setVolume", "volume", "getVolume", "onVolumeChange", "updateJob", "Lkotlinx/coroutines/Job;", "getUpdateJob", "()Lkotlinx/coroutines/Job;", "setUpdateJob", "(Lkotlinx/coroutines/Job;)V", "attemptPlayState", "getAttemptPlayState", "()I", "setAttemptPlayState", "(I)V", "onPlayStateChange", "updatePlayState", "updatePhoneOutputId", "id", "onPositionChange", "position", "", "release", "TAG", "getTAG", "()Ljava/lang/String;", "Companion", "milink_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PhoneDeviceController extends AudioDeviceController {
    private static final long UPDATE_PLAY_STATE_INTERVAL = 2000;

    @NotNull
    private final PhoneDeviceController$activeAudioSessionCallback$1 activeAudioSessionCallback;
    private int attemptPlayState;

    @NotNull
    private final List<String> blockList;

    @Nullable
    private MediaController currentMediaController;

    @NotNull
    private final AudioManager mAudioManager;

    @NotNull
    private final Handler mHandler;

    @NotNull
    private final PhoneDeviceController$mediaControllerCallback$1 mediaControllerCallback;

    @NotNull
    private final MediaSessionManager mediaSessionManager;

    @NotNull
    private final MediaSessionManager.OnActiveSessionsChangedListener onActiveSessionsChangedListener;

    @Nullable
    private Job updateJob;

    /* JADX INFO: renamed from: com.xiaomi.fitness.milink.circulate.PhoneDeviceController$handleAudioControl$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.milink.circulate.PhoneDeviceController", f = "PhoneDeviceController.kt", i = {0, 0, 0}, l = {244}, m = "handleAudioControl", n = {"this", "cmd", "intValue"}, s = {"L$0", "I$0", "I$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PhoneDeviceController.this.handleAudioControl(0, 0, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.milink.circulate.PhoneDeviceController$onPlayStateChange$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.milink.circulate.PhoneDeviceController$onPlayStateChange$1", f = "PhoneDeviceController.kt", i = {}, l = {314}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C26161(Continuation<? super C26161> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PhoneDeviceController.this.new C26161(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long jCurrentTimeMillis = 2000 - (System.currentTimeMillis() - PhoneDeviceController.this.getChangeMediaEventTime());
                this.label = 1;
                if (DelayKt.delay(jCurrentTimeMillis, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Logger.i(PhoneDeviceController.this.getTAG(), "play state change wait finally: " + PhoneDeviceController.this.getAttemptPlayState());
            PhoneDeviceController phoneDeviceController = PhoneDeviceController.this;
            phoneDeviceController.updatePlayState(phoneDeviceController.getAttemptPlayState());
            PhoneDeviceController phoneDeviceController2 = PhoneDeviceController.this;
            phoneDeviceController2.setPlayState(phoneDeviceController2.getAttemptPlayState());
            PhoneDeviceController.this.setUpdateJob(null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C26161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.xiaomi.fitness.milink.circulate.PhoneDeviceController$activeAudioSessionCallback$1] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.xiaomi.fitness.milink.circulate.PhoneDeviceController$mediaControllerCallback$1] */
    public PhoneDeviceController(@NotNull final CirculateDeviceInfo deviceInfo) {
        super(deviceInfo);
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Handler handler = new Handler(Looper.getMainLooper());
        this.mHandler = handler;
        MediaSessionManager.OnActiveSessionsChangedListener onActiveSessionsChangedListener = new MediaSessionManager.OnActiveSessionsChangedListener() { // from class: lth
            @Override // android.media.session.MediaSessionManager.OnActiveSessionsChangedListener
            public final void onActiveSessionsChanged(List list) {
                PhoneDeviceController.onActiveSessionsChangedListener$lambda$0(this.f25422a, list);
            }
        };
        this.onActiveSessionsChangedListener = onActiveSessionsChangedListener;
        Object systemService = ApplicationExtKt.getApplication().getSystemService("audio");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.mAudioManager = (AudioManager) systemService;
        Object systemService2 = ApplicationExtKt.getApplication().getSystemService("media_session");
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.media.session.MediaSessionManager");
        MediaSessionManager mediaSessionManager = (MediaSessionManager) systemService2;
        this.mediaSessionManager = mediaSessionManager;
        mediaSessionManager.addOnActiveSessionsChangedListener(onActiveSessionsChangedListener, null, handler);
        ArrayList arrayList = new ArrayList();
        arrayList.add("com.android.server.telecom");
        arrayList.add("com.android.bluetooth");
        arrayList.add("com.miui.mediaviewer");
        this.blockList = arrayList;
        this.activeAudioSessionCallback = new ActiveAudioSessionManager.ActiveAudioSessionCallback() { // from class: com.xiaomi.fitness.milink.circulate.PhoneDeviceController$activeAudioSessionCallback$1
            @Override // com.xiaomi.fitness.milink.local.ActiveAudioSessionManager.ActiveAudioSessionCallback
            public void onTopActiveSessionChange(MediaController controller, boolean init) {
                PlaybackState playbackState;
                Object mLock = this.this$0.getMLock();
                PhoneDeviceController phoneDeviceController = this.this$0;
                CirculateDeviceInfo circulateDeviceInfo = deviceInfo;
                synchronized (mLock) {
                    try {
                        Logger.i(phoneDeviceController.getTAG(), "onTopActiveSessionChange init: " + init + " " + (controller != null ? controller.getPackageName() : null) + " ");
                        if (CollectionsKt___CollectionsKt.contains(phoneDeviceController.getBlockList(), controller != null ? controller.getPackageName() : null)) {
                            Logger.i(phoneDeviceController.getTAG(), "onTopActiveSessionChange block list, ignore");
                        } else {
                            MediaController currentMediaController = phoneDeviceController.getCurrentMediaController();
                            if (currentMediaController != null) {
                                currentMediaController.unregisterCallback(phoneDeviceController.mediaControllerCallback);
                            }
                            phoneDeviceController.setCurrentMediaController(controller);
                            MediaController currentMediaController2 = phoneDeviceController.getCurrentMediaController();
                            if (currentMediaController2 != null) {
                                currentMediaController2.registerCallback(phoneDeviceController.mediaControllerCallback, phoneDeviceController.mHandler);
                            }
                            if (controller != null) {
                                MediaMetadata metadata = controller.getMetadata();
                                if (metadata != null) {
                                    String string = metadata.getString(MediaMetadataCompat.METADATA_KEY_TITLE);
                                    long j = metadata.getLong(MediaMetadataCompat.METADATA_KEY_DURATION);
                                    Logger.i(phoneDeviceController.getTAG(), "updateMediaInfo " + string + " " + j);
                                    phoneDeviceController.setMediaMetaData(new MediaMetaData.b().i(metadata.getString(MediaMetadataCompat.METADATA_KEY_ALBUM)).k(metadata.getString(MediaMetadataCompat.METADATA_KEY_ARTIST)).p(metadata.getString(MediaMetadataCompat.METADATA_KEY_TITLE)).m(metadata.getLong(MediaMetadataCompat.METADATA_KEY_DURATION)).h());
                                } else {
                                    Logger.i(phoneDeviceController.getTAG(), "updateMediaInfo empty");
                                    phoneDeviceController.setMediaMetaData(new MediaMetaData.b().i("").k("").p("").m(0L).h());
                                }
                                int volume = phoneDeviceController.getVolume();
                                Logger.i(phoneDeviceController.getTAG(), "updateMediaInfo " + circulateDeviceInfo.c + "'s volume: " + volume);
                                long position = (metadata == null || (playbackState = controller.getPlaybackState()) == null) ? 0L : playbackState.getPosition();
                                Logger.i(phoneDeviceController.getTAG(), "updateMediaInfo " + circulateDeviceInfo.c + "'s position: " + position);
                                if (phoneDeviceController.getExtraAudioData() == null) {
                                    phoneDeviceController.setExtraAudioData(new ExtraAudioData(0, 0L, 3, null));
                                }
                                ExtraAudioData extraAudioData = phoneDeviceController.getExtraAudioData();
                                if (extraAudioData != null) {
                                    extraAudioData.setPosition(position);
                                }
                                ExtraAudioData extraAudioData2 = phoneDeviceController.getExtraAudioData();
                                if (extraAudioData2 != null) {
                                    extraAudioData2.setVolume(volume);
                                }
                                PlaybackState playbackState2 = controller.getPlaybackState();
                                int playState = phoneDeviceController.getPlayState(playbackState2 != null ? Integer.valueOf(playbackState2.getState()) : null);
                                Logger.i(phoneDeviceController.getTAG(), "updateMediaInfo " + circulateDeviceInfo.c + "'s playState: " + playState);
                                phoneDeviceController.setPlayState(playState);
                            } else {
                                phoneDeviceController.setPlayState(0);
                            }
                            if (!init) {
                                MilinkHelper milinkHelper = MilinkHelper.INSTANCE;
                                milinkHelper.updateCirculateDeviceWrapperList(phoneDeviceController);
                                if (milinkHelper.isSomeDeviceCirculating()) {
                                    BaseDeviceController currentDeviceController = milinkHelper.getCurrentDeviceController();
                                    if (currentDeviceController != null) {
                                        currentDeviceController.onPlayStateChange(phoneDeviceController.getPlayState());
                                    }
                                    if (currentDeviceController != null) {
                                        currentDeviceController.onMediaInfoChange(phoneDeviceController.getMediaMetaData());
                                    }
                                    if (currentDeviceController instanceof AudioDeviceController) {
                                        AudioDeviceController audioDeviceController = (AudioDeviceController) currentDeviceController;
                                        ExtraAudioData extraAudioData3 = phoneDeviceController.getExtraAudioData();
                                        audioDeviceController.onPositionChange(extraAudioData3 != null ? extraAudioData3.getPosition() : 0L);
                                    }
                                }
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.mediaControllerCallback = new MediaController.Callback() { // from class: com.xiaomi.fitness.milink.circulate.PhoneDeviceController$mediaControllerCallback$1
            @Override // android.media.session.MediaController.Callback
            public void onMetadataChanged(MediaMetadata metadata) {
                PlaybackState playbackState;
                MediaMetaData mediaMetaData;
                super.onMetadataChanged(metadata);
                if (metadata == null) {
                    return;
                }
                Object mLock = this.this$0.getMLock();
                PhoneDeviceController phoneDeviceController = this.this$0;
                synchronized (mLock) {
                    try {
                        String string = metadata.getString(MediaMetadataCompat.METADATA_KEY_TITLE);
                        long j = metadata.getLong(MediaMetadataCompat.METADATA_KEY_DURATION);
                        Logger.i(phoneDeviceController.getTAG(), "onMetadataChanged: " + string + " duration: " + j);
                        MediaMetaData mediaMetaData2 = phoneDeviceController.getMediaMetaData();
                        if (Intrinsics.areEqual(string, mediaMetaData2 != null ? mediaMetaData2.e() : null) && (mediaMetaData = phoneDeviceController.getMediaMetaData()) != null && j == mediaMetaData.d()) {
                            Logger.i(phoneDeviceController.getTAG(), "onMetadataChanged same, mute");
                        } else {
                            phoneDeviceController.setMediaMetaData(new MediaMetaData.b().i(metadata.getString(MediaMetadataCompat.METADATA_KEY_ALBUM)).k(metadata.getString(MediaMetadataCompat.METADATA_KEY_ARTIST)).p(string).m(j).h());
                            if (phoneDeviceController.getExtraAudioData() == null) {
                                phoneDeviceController.setExtraAudioData(new ExtraAudioData(0, 0L, 3, null));
                            }
                            ExtraAudioData extraAudioData = phoneDeviceController.getExtraAudioData();
                            if (extraAudioData != null) {
                                MediaController currentMediaController = phoneDeviceController.getCurrentMediaController();
                                extraAudioData.setPosition((currentMediaController == null || (playbackState = currentMediaController.getPlaybackState()) == null) ? 0L : playbackState.getPosition());
                            }
                            MilinkHelper milinkHelper = MilinkHelper.INSTANCE;
                            milinkHelper.updateCirculateDeviceWrapperList(phoneDeviceController);
                            if (milinkHelper.isSomeDeviceCirculating()) {
                                BaseDeviceController currentDeviceController = milinkHelper.getCurrentDeviceController();
                                if (currentDeviceController != null) {
                                    currentDeviceController.onMediaInfoChange(phoneDeviceController.getMediaMetaData());
                                }
                                if (currentDeviceController instanceof AudioDeviceController) {
                                    AudioDeviceController audioDeviceController = (AudioDeviceController) currentDeviceController;
                                    ExtraAudioData extraAudioData2 = phoneDeviceController.getExtraAudioData();
                                    audioDeviceController.onPositionChange(extraAudioData2 != null ? extraAudioData2.getPosition() : 0L);
                                }
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onPlaybackStateChanged(PlaybackState state) {
                Integer numValueOf;
                PlaybackState playbackState;
                super.onPlaybackStateChanged(state);
                Logger.i(this.this$0.getTAG(), "mediaControllerCallback onPlaybackStateChanged " + state);
                Object mLock = this.this$0.getMLock();
                PhoneDeviceController phoneDeviceController = this.this$0;
                synchronized (mLock) {
                    if (state != null) {
                        try {
                            numValueOf = Integer.valueOf(state.getState());
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else {
                        numValueOf = null;
                    }
                    int playState = phoneDeviceController.getPlayState(numValueOf);
                    long position = 0;
                    if (playState == 2) {
                        phoneDeviceController.setPlayState(playState);
                        if (phoneDeviceController.getExtraAudioData() == null) {
                            phoneDeviceController.setExtraAudioData(new ExtraAudioData(0, 0L, 3, null));
                        }
                        MediaController currentMediaController = phoneDeviceController.getCurrentMediaController();
                        if (currentMediaController != null && (playbackState = currentMediaController.getPlaybackState()) != null) {
                            position = playbackState.getPosition();
                        }
                        ExtraAudioData extraAudioData = phoneDeviceController.getExtraAudioData();
                        if (extraAudioData != null) {
                            extraAudioData.setPosition(position);
                        }
                        MilinkHelper milinkHelper = MilinkHelper.INSTANCE;
                        milinkHelper.updateCirculateDeviceWrapperList(phoneDeviceController);
                        if (milinkHelper.isSomeDeviceCirculating()) {
                            BaseDeviceController currentDeviceController = milinkHelper.getCurrentDeviceController();
                            if (currentDeviceController != null) {
                                currentDeviceController.onPlayStateChange(playState);
                            }
                            if (currentDeviceController instanceof AudioDeviceController) {
                                ((AudioDeviceController) currentDeviceController).onPositionChange(position);
                            }
                        }
                    } else if (playState == phoneDeviceController.getPlayState()) {
                        Logger.i(phoneDeviceController.getTAG(), "onPlaybackStateChanged state same, mute");
                    } else {
                        if (phoneDeviceController.getExtraAudioData() == null) {
                            phoneDeviceController.setExtraAudioData(new ExtraAudioData(0, 0L, 3, null));
                        }
                        ExtraAudioData extraAudioData2 = phoneDeviceController.getExtraAudioData();
                        if (extraAudioData2 != null) {
                            extraAudioData2.setPosition(state != null ? state.getPosition() : 0L);
                        }
                        phoneDeviceController.setPlayState(playState);
                        MilinkHelper milinkHelper2 = MilinkHelper.INSTANCE;
                        milinkHelper2.updateCirculateDeviceWrapperList(phoneDeviceController);
                        if (milinkHelper2.isSomeDeviceCirculating()) {
                            BaseDeviceController currentDeviceController2 = milinkHelper2.getCurrentDeviceController();
                            if (currentDeviceController2 != null) {
                                currentDeviceController2.onPlayStateChange(playState);
                            }
                            if (currentDeviceController2 instanceof AudioDeviceController) {
                                ((AudioDeviceController) currentDeviceController2).onPositionChange(state != null ? state.getPosition() : 0L);
                            }
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionDestroyed() {
                super.onSessionDestroyed();
                Logger.i(this.this$0.getTAG(), "mediaControllerCallback onSessionDestroyed");
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPlayState(Integer state) {
        if ((state != null && state.intValue() == 0) || (state != null && state.intValue() == 7)) {
            return 0;
        }
        if (state != null && state.intValue() == 3) {
            return 2;
        }
        return (state != null && state.intValue() == 2) ? 3 : 9;
    }

    private final void handleOnActiveSessionsChanged(List<MediaController> controllers, boolean init) {
        ActiveAudioSessionManager activeAudioSessionManager = ActiveAudioSessionManager.INSTANCE;
        if (controllers == null) {
            controllers = this.mediaSessionManager.getActiveSessions(null);
            Intrinsics.checkNotNullExpressionValue(controllers, "getActiveSessions(...)");
        }
        activeAudioSessionManager.handleOnActiveSessionsChanged(controllers, init);
    }

    private final boolean isSameMetaData(MediaMetaData old, MediaMetaData mediaMetaData) {
        if (old == null && mediaMetaData == null) {
            return true;
        }
        if (old == null || mediaMetaData == null) {
            return false;
        }
        return Intrinsics.areEqual(old.e(), mediaMetaData.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActiveSessionsChangedListener$lambda$0(PhoneDeviceController this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(this$0.getTAG(), "OnActiveSessionsChangedListener size: " + (list != null ? Integer.valueOf(list.size()) : null));
        this$0.handleOnActiveSessionsChanged(list, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePlayState(int state) {
        synchronized (getMLock()) {
            try {
                setPlayState(state);
                MilinkHelper milinkHelper = MilinkHelper.INSTANCE;
                AudioServiceControllerExtKt.getLatestPosition(milinkHelper.getAudioServiceController(), getDeviceInfo());
                if (milinkHelper.isSomeDeviceCirculating()) {
                    Logger.i(getTAG(), "onPlayStateChange local, also need change " + getOutputId());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int getAttemptPlayState() {
        return this.attemptPlayState;
    }

    @NotNull
    public final List<String> getBlockList() {
        return this.blockList;
    }

    @Nullable
    public final MediaController getCurrentMediaController() {
        return this.currentMediaController;
    }

    @Override // com.xiaomi.fitness.milink.circulate.AudioDeviceController, com.xiaomi.fitness.milink.circulate.BaseDeviceController
    @NotNull
    public String getTAG() {
        return "MilinkHelper_Phone";
    }

    @Nullable
    public final Job getUpdateJob() {
        return this.updateJob;
    }

    @Override // com.xiaomi.fitness.milink.circulate.AudioDeviceController
    public int getVolume() {
        super.getVolume();
        int streamMaxVolume = this.mAudioManager.getStreamMaxVolume(3);
        int streamVolume = this.mAudioManager.getStreamVolume(3);
        int i = (streamVolume * 100) / streamMaxVolume;
        Logger.i(getTAG(), "get phone volume: " + streamVolume + ", max: " + streamMaxVolume + " target: " + i);
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.xiaomi.fitness.milink.circulate.BaseDeviceController
    @Nullable
    public Object handleAudioControl(int i, int i2, @NotNull String str, boolean z, @NotNull Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        PhoneDeviceController phoneDeviceController;
        PlaybackState playbackState;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object obj = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = anonymousClass2.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            anonymousClass2.L$0 = this;
            anonymousClass2.I$0 = i;
            anonymousClass2.I$1 = i2;
            anonymousClass2.label = 1;
            if (super.handleAudioControl(i, i2, str, z, anonymousClass2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            phoneDeviceController = this;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = anonymousClass2.I$1;
            i = anonymousClass2.I$0;
            phoneDeviceController = (PhoneDeviceController) anonymousClass2.L$0;
            ResultKt.throwOnFailure(obj);
        }
        MediaController mediaController = phoneDeviceController.currentMediaController;
        MediaController.TransportControls transportControls = mediaController != null ? mediaController.getTransportControls() : null;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    MediaController mediaController2 = phoneDeviceController.currentMediaController;
                    long position = (mediaController2 == null || (playbackState = mediaController2.getPlaybackState()) == null) ? 0L : playbackState.getPosition();
                    if (transportControls != null) {
                        transportControls.seekTo(position + ((long) (i2 * 1000)));
                    }
                } else if (i == 3) {
                    phoneDeviceController.setVolume(i2);
                } else if (i != 4) {
                    if (i == 5 && transportControls != null) {
                        transportControls.skipToNext();
                    }
                } else if (transportControls != null) {
                    transportControls.skipToPrevious();
                }
            } else if (transportControls != null) {
                transportControls.pause();
            }
        } else if (transportControls != null) {
            transportControls.play();
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.milink.circulate.BaseDeviceController
    public void onPlayStateChange(int state) {
        super.onPlayStateChange(state);
        if (state == this.attemptPlayState) {
            Logger.i(getTAG(), "onPlayStateChange same, mute");
            return;
        }
        this.attemptPlayState = state;
        Logger.i(getTAG(), "onPlayStateChange updateJob: " + this.updateJob);
        if (System.currentTimeMillis() - getChangeMediaEventTime() >= 2000) {
            Logger.i(getTAG(), "onPlayStateChange so get position");
            updatePlayState(state);
        } else if (this.updateJob == null) {
            Logger.i(getTAG(), "play state change in interval, delay");
            this.updateJob = AnyExtKt.main$default(null, new C26161(null), 1, null);
        }
    }

    @Override // com.xiaomi.fitness.milink.circulate.AudioDeviceController
    public void onPositionChange(long position) {
    }

    @Override // com.xiaomi.fitness.milink.circulate.AudioDeviceController
    public void onVolumeChange(int volume) {
        PlaybackState playbackState;
        synchronized (getMLock()) {
            try {
                ExtraAudioData extraAudioData = getExtraAudioData();
                if (extraAudioData == null || extraAudioData.getVolume() != volume) {
                    if (getExtraAudioData() == null) {
                        setExtraAudioData(new ExtraAudioData(0, 0L, 3, null));
                    }
                    ExtraAudioData extraAudioData2 = getExtraAudioData();
                    if (extraAudioData2 != null) {
                        extraAudioData2.setVolume(volume);
                    }
                    ExtraAudioData extraAudioData3 = getExtraAudioData();
                    if (extraAudioData3 != null) {
                        MediaController mediaController = this.currentMediaController;
                        extraAudioData3.setPosition((mediaController == null || (playbackState = mediaController.getPlaybackState()) == null) ? 0L : playbackState.getPosition());
                    }
                    MilinkHelper.INSTANCE.updateCirculateDeviceWrapperList(this);
                } else {
                    Logger.i(getTAG(), "onVolumeChange same: " + volume + ", mute");
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void release() {
        MediaController mediaController = this.currentMediaController;
        if (mediaController != null) {
            mediaController.unregisterCallback(this.mediaControllerCallback);
        }
    }

    public final void setAttemptPlayState(int i) {
        this.attemptPlayState = i;
    }

    public final void setCurrentMediaController(@Nullable MediaController mediaController) {
        this.currentMediaController = mediaController;
    }

    public final void setUpdateJob(@Nullable Job job) {
        this.updateJob = job;
    }

    @Override // com.xiaomi.fitness.milink.circulate.BaseDeviceController
    public void setVolume(int volume) {
        super.setVolume(volume);
        int streamMaxVolume = this.mAudioManager.getStreamMaxVolume(3);
        float f = volume * (streamMaxVolume / 100);
        Logger.i(getTAG(), "set phone volume: " + volume + ", max: " + streamMaxVolume + " target: " + f);
        this.mAudioManager.setStreamVolume(3, MathKt__MathJVMKt.roundToInt(f), 1);
    }

    public final void updateAudioInfoSync(@NotNull Function0<Unit> complete) {
        Intrinsics.checkNotNullParameter(complete, "complete");
        Logger.i(getTAG(), "updateAudioInfoSync start");
        ActiveAudioSessionManager.INSTANCE.registerActiveAudioSessionCallback(this.activeAudioSessionCallback);
        handleOnActiveSessionsChanged(null, true);
        complete.invoke();
    }

    public final void updatePhoneOutputId(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (getMLock()) {
            setOutputId(id);
            MilinkHelper.INSTANCE.updateCirculateDeviceWrapperList(this);
            Unit unit = Unit.INSTANCE;
        }
    }
}
