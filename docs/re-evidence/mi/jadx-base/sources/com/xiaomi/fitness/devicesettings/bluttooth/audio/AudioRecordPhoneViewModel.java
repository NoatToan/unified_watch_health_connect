package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.core.content.FileProvider;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.t;
import com.google.android.exoplayer2.v;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordPhoneViewModel;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.util.AudioCodecManager;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.util.ErrorType;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.util.IConvertAACResult;
import com.xiaomi.fitness.devicesettings.utils.UtilsKt;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.aop;
import defpackage.n0i;
import defpackage.nm1;
import defpackage.u56;
import defpackage.wrq;
import defpackage.wzi;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 j2\u00020\u0001:\u0003jklB\u0007¢\u0006\u0004\bi\u0010\u000fJ9\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u000fJ\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u00020\u000b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010\u000fJ\r\u0010 \u001a\u00020\u000b¢\u0006\u0004\b \u0010\u000fJ\u0015\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u00172\b\b\u0002\u0010(\u001a\u00020%¢\u0006\u0004\b)\u0010*J\u001f\u0010)\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b)\u0010.J\r\u0010/\u001a\u00020\u0004¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u0004¢\u0006\u0004\b2\u0010\u0016J\r\u00103\u001a\u00020\u000b¢\u0006\u0004\b3\u0010\u000fJ\r\u00104\u001a\u00020\u000b¢\u0006\u0004\b4\u0010\u000fJ\r\u00105\u001a\u00020%¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u000b¢\u0006\u0004\b7\u0010\u000fJ\u001f\u00108\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b8\u0010\u001bJ\u000f\u00109\u001a\u00020\u000bH\u0014¢\u0006\u0004\b9\u0010\u000fR$\u0010;\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R.\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\b0A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020J0A8\u0006¢\u0006\f\n\u0004\bK\u0010B\u001a\u0004\bL\u0010DR\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00020M0A8\u0006¢\u0006\f\n\u0004\bN\u0010B\u001a\u0004\bO\u0010DR\"\u0010P\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bP\u00106\"\u0004\bR\u0010SR\"\u0010T\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u00100\"\u0004\bW\u0010\u0016R\u001d\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00040A8\u0006¢\u0006\f\n\u0004\bX\u0010B\u001a\u0004\bY\u0010DR\u001d\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00040A8\u0006¢\u0006\f\n\u0004\bZ\u0010B\u001a\u0004\b[\u0010DR\u001d\u0010\\\u001a\b\u0012\u0004\u0012\u00020%0A8\u0006¢\u0006\f\n\u0004\b\\\u0010B\u001a\u0004\b]\u0010DR\u001d\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00170A8\u0006¢\u0006\f\n\u0004\b^\u0010B\u001a\u0004\b_\u0010DR\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u001b\u0010h\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g¨\u0006m"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordPhoneViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "", "status", "", "time", "", "objName", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AsrResultItem;", "contentList", "", "transStatus", "(IJLjava/lang/String;Ljava/util/List;)V", "deleteTempFile", "()V", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "loadPhoneRecordList", "loadSingleData", "(J)V", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordEntity;", "item", "format", "postTransTask", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordEntity;Ljava/lang/Integer;)V", "dataList", "getStatus", "(Ljava/util/List;)V", "requestTransResult", "stopRequest", "data", "updateStatusDB", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordEntity;)V", "audioRecordData", "", "deleteRecordFile", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordEntity;)Z", "isSharedAudio", "shared", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordEntity;Z)V", "Landroid/content/Context;", "context", "path", "(Landroid/content/Context;Ljava/lang/String;)V", "duration", "()J", "position", "seekTo", OneTrack.Event.PLAY, "pause", "isPlaying", "()Z", BroadcastsKt.SILENT_PUSHING_STOP, "initMediaSource", "onCleared", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "setDeviceModel", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MutableLiveData;", "getDataList", "()Landroidx/lifecycle/MutableLiveData;", "setDataList", "(Landroidx/lifecycle/MutableLiveData;)V", "Lcom/google/android/exoplayer2/t;", "exoPlayer", "Lcom/google/android/exoplayer2/t;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordPhoneViewModel$RecordTransStatus;", "statusChanged", "getStatusChanged", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordPhoneViewModel$LoadingStatus;", "loadingChanged", "getLoadingChanged", "isTouchSeekBar", "Z", "setTouchSeekBar", "(Z)V", "currentAudioStartTime", "J", "getCurrentAudioStartTime", "setCurrentAudioStartTime", "currentPositionTime", "getCurrentPositionTime", "durationTime", "getDurationTime", "audioStatusChanged", "getAudioStatusChanged", "singleDataChanged", "getSingleDataChanged", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/StopWatch;", "progressTimer$delegate", "Lkotlin/Lazy;", "getProgressTimer", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/StopWatch;", "progressTimer", "<init>", "Companion", "RecordTransStatus", "LoadingStatus", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAudioRecordPhoneViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioRecordPhoneViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordPhoneViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,438:1\n1863#2,2:439\n13402#3,2:441\n*S KotlinDebug\n*F\n+ 1 AudioRecordPhoneViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordPhoneViewModel\n*L\n132#1:439,2\n274#1:441,2\n*E\n"})
public final class AudioRecordPhoneViewModel extends AbsViewModel {
    public static final int AUDIO_NOMAL = 0;
    public static final int AUDIO_PAUSE = 2;
    public static final int AUDIO_START = 1;

    @NotNull
    public static final String REFRESH_DATA_NOTIFY = "refresh_data";

    @NotNull
    public static final String TAG = "AudioRecordPhoneViewModel";

    @NotNull
    public static final String sAction = "com.xiaomi.fitness.audioRecordViewModel.uploadRecordResult";

    @NotNull
    public static final String sKeyId = "sKeyId";

    @NotNull
    public static final String sKeyIsSuccess = "sKeyIsSuccess";

    @NotNull
    private final MutableLiveData<Boolean> audioStatusChanged;
    private long currentAudioStartTime;

    @NotNull
    private final MutableLiveData<Long> currentPositionTime;

    @NotNull
    private final MutableLiveData<Long> durationTime;

    @NotNull
    private final t exoPlayer;

    @NotNull
    private final Handler handler;
    private boolean isTouchSeekBar;

    @NotNull
    private final MutableLiveData<LoadingStatus> loadingChanged;

    /* JADX INFO: renamed from: progressTimer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy progressTimer;

    @NotNull
    private final MutableLiveData<AudioRecordEntity> singleDataChanged;

    @NotNull
    private final MutableLiveData<RecordTransStatus> statusChanged;

    @Nullable
    private WearableDeviceModel deviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();

    @NotNull
    private MutableLiveData<List<AudioRecordEntity>> dataList = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordPhoneViewModel$attach$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function4<Integer, Long, String, List<? extends AsrResultItem>, Unit> {
        public AnonymousClass1(Object obj) {
            super(4, obj, AudioRecordPhoneViewModel.class, "transStatus", "transStatus(IJLjava/lang/String;Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Long l, String str, List<? extends AsrResultItem> list) {
            invoke(num.intValue(), l.longValue(), str, (List<AsrResultItem>) list);
            return Unit.INSTANCE;
        }

        public final void invoke(int i, long j, String str, List<AsrResultItem> list) {
            ((AudioRecordPhoneViewModel) this.receiver).transStatus(i, j, str, list);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordPhoneViewModel$deleteRecordFile$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordPhoneViewModel$deleteRecordFile$1", f = "AudioRecordPhoneViewModel.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AudioRecordEntity $audioRecordData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20301(AudioRecordEntity audioRecordEntity, Continuation<? super C20301> continuation) {
            super(2, continuation);
            this.$audioRecordData = audioRecordEntity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C20301(this.$audioRecordData, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AudioRecordDao audioRecordDao = AudioRecordDataBase.INSTANCE.getInstance().audioRecordDao();
                AudioRecordEntity audioRecordEntity = this.$audioRecordData;
                this.label = 1;
                if (audioRecordDao.deleteOne(audioRecordEntity, this) == coroutine_suspended) {
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
            return ((C20301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordPhoneViewModel$initMediaSource$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"com/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordPhoneViewModel$initMediaSource$1", "Lcom/google/android/exoplayer2/q$e;", "", "isPlaying", "", "onIsPlayingChanged", "(Z)V", "", "state", "onPlaybackStateChanged", "(I)V", "Lcom/google/android/exoplayer2/ExoPlaybackException;", "error", "onPlayerError", "(Lcom/google/android/exoplayer2/ExoPlaybackException;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class C20311 implements q.e {
        public C20311() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onIsPlayingChanged$lambda$0(AudioRecordPhoneViewModel this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.getAudioStatusChanged().setValue(Boolean.FALSE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onPlaybackStateChanged$lambda$1(AudioRecordPhoneViewModel this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.getProgressTimer().cancel();
        }

        @Override // defpackage.jn1
        public /* bridge */ /* synthetic */ void onAudioAttributesChanged(nm1 nm1Var) {
            super.onAudioAttributesChanged(nm1Var);
        }

        @Override // defpackage.jn1
        public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i) {
            super.onAudioSessionIdChanged(i);
        }

        @Override // com.google.android.exoplayer2.q.c
        public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(q.b bVar) {
            super.onAvailableCommandsChanged(bVar);
        }

        @Override // com.google.android.exoplayer2.q.e
        public /* bridge */ /* synthetic */ void onCues(List list) {
            super.onCues(list);
        }

        @Override // defpackage.d96
        public /* bridge */ /* synthetic */ void onDeviceInfoChanged(u56 u56Var) {
            super.onDeviceInfoChanged(u56Var);
        }

        @Override // defpackage.d96
        public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
            super.onDeviceVolumeChanged(i, z);
        }

        @Override // com.google.android.exoplayer2.q.c
        public /* bridge */ /* synthetic */ void onEvents(q qVar, q.d dVar) {
            super.onEvents(qVar, dVar);
        }

        @Override // com.google.android.exoplayer2.q.c
        public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z) {
            super.onIsLoadingChanged(z);
        }

        @Override // com.google.android.exoplayer2.q.c
        public void onIsPlayingChanged(boolean isPlaying) {
            super.onIsPlayingChanged(isPlaying);
            Logger.i(AudioRecordPhoneViewModel.TAG, "onIsPlayingChanged " + isPlaying + " " + AudioRecordPhoneViewModel.this.exoPlayer.getPlaybackState() + " " + AudioRecordPhoneViewModel.this.exoPlayer.getCurrentPosition() + " " + AudioRecordPhoneViewModel.this.exoPlayer.getDuration());
            if (isPlaying) {
                AudioRecordPhoneViewModel.this.getProgressTimer().start();
            } else {
                AudioRecordPhoneViewModel.this.getProgressTimer().pause();
            }
            if (isPlaying || AudioRecordPhoneViewModel.this.exoPlayer.getPlaybackState() == 2) {
                AudioRecordPhoneViewModel.this.getAudioStatusChanged().setValue(Boolean.TRUE);
                return;
            }
            if (AudioRecordPhoneViewModel.this.exoPlayer.getPlaybackState() != 4) {
                AudioRecordPhoneViewModel.this.getAudioStatusChanged().postValue(Boolean.FALSE);
                return;
            }
            long duration = AudioRecordPhoneViewModel.this.exoPlayer.getDuration();
            Long value = AudioRecordPhoneViewModel.this.getCurrentPositionTime().getValue();
            long jLongValue = duration - (value != null ? value.longValue() : 0L);
            Logger.i(AudioRecordPhoneViewModel.TAG, "postdelay end " + jLongValue + " " + AudioRecordPhoneViewModel.this.getCurrentPositionTime().getValue() + " " + AudioRecordPhoneViewModel.this.exoPlayer.getDuration());
            Handler handler = AudioRecordPhoneViewModel.this.handler;
            final AudioRecordPhoneViewModel audioRecordPhoneViewModel = AudioRecordPhoneViewModel.this;
            handler.postDelayed(new Runnable() { // from class: ho1
                @Override // java.lang.Runnable
                public final void run() {
                    AudioRecordPhoneViewModel.C20311.onIsPlayingChanged$lambda$0(audioRecordPhoneViewModel);
                }
            }, jLongValue >= 0 ? jLongValue : 0L);
        }

        @Override // com.google.android.exoplayer2.q.c
        @Deprecated
        public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z) {
            super.onLoadingChanged(z);
        }

        @Override // com.google.android.exoplayer2.q.c
        public /* bridge */ /* synthetic */ void onMediaItemTransition(m mVar, int i) {
            super.onMediaItemTransition(mVar, i);
        }

        @Override // com.google.android.exoplayer2.q.c
        public /* bridge */ /* synthetic */ void onMediaMetadataChanged(n nVar) {
            super.onMediaMetadataChanged(nVar);
        }

        @Override // com.google.android.exoplayer2.q.e, defpackage.stf
        public /* bridge */ /* synthetic */ void onMetadata(com.google.android.exoplayer2.metadata.Metadata metadata) {
            super.onMetadata(metadata);
        }

        @Override // com.google.android.exoplayer2.q.c
        public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
            super.onPlayWhenReadyChanged(z, i);
        }

        @Override // com.google.android.exoplayer2.q.c
        public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(n0i n0iVar) {
            super.onPlaybackParametersChanged(n0iVar);
        }

        @Override // com.google.android.exoplayer2.q.c
        public void onPlaybackStateChanged(int state) {
            if (state == 3) {
                Logger.i(AudioRecordPhoneViewModel.TAG, "onPlaybackStateChanged  STATE_READY duration:" + AudioRecordPhoneViewModel.this.exoPlayer.getDuration());
                AudioRecordPhoneViewModel.this.getDurationTime().postValue(Long.valueOf(AudioRecordPhoneViewModel.this.exoPlayer.getDuration()));
                return;
            }
            if (state != 4) {
                return;
            }
            AudioRecordPhoneViewModel.this.getCurrentPositionTime().postValue(Long.valueOf(AudioRecordPhoneViewModel.this.exoPlayer.getDuration()));
            long duration = AudioRecordPhoneViewModel.this.exoPlayer.getDuration();
            Long value = AudioRecordPhoneViewModel.this.getCurrentPositionTime().getValue();
            long jLongValue = duration - (value != null ? value.longValue() : 0L);
            Handler handler = AudioRecordPhoneViewModel.this.handler;
            final AudioRecordPhoneViewModel audioRecordPhoneViewModel = AudioRecordPhoneViewModel.this;
            handler.postDelayed(new Runnable() { // from class: go1
                @Override // java.lang.Runnable
                public final void run() {
                    AudioRecordPhoneViewModel.C20311.onPlaybackStateChanged$lambda$1(audioRecordPhoneViewModel);
                }
            }, jLongValue);
        }

        @Override // com.google.android.exoplayer2.q.c
        public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
            super.onPlaybackSuppressionReasonChanged(i);
        }

        @Override // com.google.android.exoplayer2.q.c
        public void onPlayerError(ExoPlaybackException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            super.onPlayerError(error);
            Logger.e(AudioTransVM.TAG, "onPlayerError " + error.getMessage());
        }

        @Override // com.google.android.exoplayer2.q.c
        @Deprecated
        public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
            super.onPlayerStateChanged(z, i);
        }

        @Override // com.google.android.exoplayer2.q.c
        @Deprecated
        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i) {
            super.onPositionDiscontinuity(i);
        }

        @Override // defpackage.erq
        public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
            super.onRenderedFirstFrame();
        }

        @Override // com.google.android.exoplayer2.q.c
        public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i) {
            super.onRepeatModeChanged(i);
        }

        @Override // com.google.android.exoplayer2.q.c
        @Deprecated
        public /* bridge */ /* synthetic */ void onSeekProcessed() {
            super.onSeekProcessed();
        }

        @Override // com.google.android.exoplayer2.q.c
        public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
            super.onShuffleModeEnabledChanged(z);
        }

        @Override // defpackage.jn1
        public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
            super.onSkipSilenceEnabledChanged(z);
        }

        @Override // com.google.android.exoplayer2.q.c
        public /* bridge */ /* synthetic */ void onStaticMetadataChanged(List list) {
            super.onStaticMetadataChanged(list);
        }

        @Override // defpackage.erq
        public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
            super.onSurfaceSizeChanged(i, i2);
        }

        @Override // com.google.android.exoplayer2.q.c
        public /* bridge */ /* synthetic */ void onTimelineChanged(v vVar, int i) {
            super.onTimelineChanged(vVar, i);
        }

        @Override // com.google.android.exoplayer2.q.c
        public /* bridge */ /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, aop aopVar) {
            super.onTracksChanged(trackGroupArray, aopVar);
        }

        @Override // defpackage.erq
        @Deprecated
        public /* bridge */ /* synthetic */ void onVideoSizeChanged(int i, int i2, int i3, float f) {
            super.onVideoSizeChanged(i, i2, i3, f);
        }

        @Override // defpackage.jn1
        public /* bridge */ /* synthetic */ void onVolumeChanged(float f) {
            super.onVolumeChanged(f);
        }

        @Override // com.google.android.exoplayer2.q.c
        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(q.f fVar, q.f fVar2, int i) {
            super.onPositionDiscontinuity(fVar, fVar2, i);
        }

        @Override // com.google.android.exoplayer2.q.c
        @Deprecated
        public /* bridge */ /* synthetic */ void onTimelineChanged(v vVar, Object obj, int i) {
            super.onTimelineChanged(vVar, obj, i);
        }

        @Override // defpackage.erq
        public /* bridge */ /* synthetic */ void onVideoSizeChanged(wrq wrqVar) {
            super.onVideoSizeChanged(wrqVar);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordPhoneViewModel$loadPhoneRecordList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordPhoneViewModel$loadPhoneRecordList$1", f = "AudioRecordPhoneViewModel.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20321 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C20321(Continuation<? super C20321> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AudioRecordPhoneViewModel.this.new C20321(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WearableDeviceModel deviceModel = AudioRecordPhoneViewModel.this.getDeviceModel();
                if ((deviceModel != null ? deviceModel.getDid() : null) != null) {
                    AudioRecordDao audioRecordDao = AudioRecordDataBase.INSTANCE.getInstance().audioRecordDao();
                    WearableDeviceModel deviceModel2 = AudioRecordPhoneViewModel.this.getDeviceModel();
                    String did = deviceModel2 != null ? deviceModel2.getDid() : null;
                    Intrinsics.checkNotNull(did);
                    this.label = 1;
                    obj = audioRecordDao.list(did, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<AudioRecordEntity> list = (List) obj;
            WearableDeviceModel deviceModel3 = AudioRecordPhoneViewModel.this.getDeviceModel();
            Logger.d(AudioRecordPhoneViewModel.TAG, "did: " + (deviceModel3 != null ? deviceModel3.getDid() : null) + ", record list: " + list);
            AudioRecordPhoneViewModel.this.getDataList().postValue(list);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordPhoneViewModel$loadSingleData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordPhoneViewModel$loadSingleData$1", f = "AudioRecordPhoneViewModel.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $time;
        int label;
        final /* synthetic */ AudioRecordPhoneViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20331(long j, AudioRecordPhoneViewModel audioRecordPhoneViewModel, Continuation<? super C20331> continuation) {
            super(2, continuation);
            this.$time = j;
            this.this$0 = audioRecordPhoneViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C20331(this.$time, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AudioRecordDao audioRecordDao = AudioRecordDataBase.INSTANCE.getInstance().audioRecordDao();
                long j = this.$time;
                this.label = 1;
                obj = audioRecordDao.get(j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AudioRecordEntity audioRecordEntity = (AudioRecordEntity) obj;
            if (audioRecordEntity == null) {
                return Unit.INSTANCE;
            }
            Logger.i(AudioRecordPhoneViewModel.TAG, "loadSingleData " + audioRecordEntity);
            this.this$0.getSingleDataChanged().postValue(audioRecordEntity);
            this.this$0.getStatusChanged().postValue(new RecordTransStatus(audioRecordEntity.getStatus(), this.$time, audioRecordEntity.getFdsName(), audioRecordEntity.getContentList(), audioRecordEntity.getTitle()));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordPhoneViewModel$shared$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordPhoneViewModel$shared$1", f = "AudioRecordPhoneViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nAudioRecordPhoneViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioRecordPhoneViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordPhoneViewModel$shared$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,438:1\n1863#2,2:439\n*S KotlinDebug\n*F\n+ 1 AudioRecordPhoneViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordPhoneViewModel$shared$1\n*L\n190#1:439,2\n*E\n"})
    public static final class C20341 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AudioRecordEntity $audioRecordData;
        final /* synthetic */ File $file;
        int label;
        final /* synthetic */ AudioRecordPhoneViewModel this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordPhoneViewModel$shared$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordPhoneViewModel$shared$1$2", f = "AudioRecordPhoneViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ File $file;
            int label;
            final /* synthetic */ AudioRecordPhoneViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(AudioRecordPhoneViewModel audioRecordPhoneViewModel, File file, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = audioRecordPhoneViewModel;
                this.$file = file;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$file, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Logger.i(AudioRecordPhoneViewModel.TAG, "shared file= download end");
                this.this$0.getLoadingChanged().setValue(new LoadingStatus(false, this.$file.getPath()));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20341(AudioRecordEntity audioRecordEntity, File file, AudioRecordPhoneViewModel audioRecordPhoneViewModel, Continuation<? super C20341> continuation) {
            super(2, continuation);
            this.$audioRecordData = audioRecordEntity;
            this.$file = file;
            this.this$0 = audioRecordPhoneViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C20341(this.$audioRecordData, this.$file, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            StringBuilder sb = new StringBuilder();
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = -1;
            List<AsrResultItem> contentList = this.$audioRecordData.getContentList();
            if (contentList != null) {
                for (AsrResultItem asrResultItem : contentList) {
                    int speakerId = asrResultItem.getSpeakerId();
                    String content = asrResultItem.getContent();
                    int i = intRef.element;
                    if (i != speakerId) {
                        if (i != -1) {
                            sb.append("\n");
                            sb.append("\n");
                        }
                        intRef.element = speakerId;
                        sb.append(asrResultItem.getUserName() + ":");
                    }
                    sb.append(content);
                }
            }
            File file = this.$file;
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            FilesKt__FileReadWriteKt.writeText$default(file, string, null, 2, null);
            AnyExtKt.main$default(null, new AnonymousClass2(this.this$0, this.$file, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordPhoneViewModel$shared$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordPhoneViewModel$shared$2", f = "AudioRecordPhoneViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ File $file;
        final /* synthetic */ String $path;
        int label;
        final /* synthetic */ AudioRecordPhoneViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, File file, AudioRecordPhoneViewModel audioRecordPhoneViewModel, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$path = str;
            this.$file = file;
            this.this$0 = audioRecordPhoneViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$path, this.$file, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AudioCodecManager audioCodecManager = AudioCodecManager.INSTANCE;
            String str = this.$path;
            String path = this.$file.getPath();
            final AudioRecordPhoneViewModel audioRecordPhoneViewModel = this.this$0;
            final File file = this.$file;
            audioCodecManager.convert(str, path, new IConvertAACResult() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordPhoneViewModel.shared.2.1
                @Override // com.xiaomi.fitness.devicesettings.bluttooth.audio.util.IConvertAACResult
                public void codecFail(ErrorType errorType) {
                    Intrinsics.checkNotNullParameter(errorType, "errorType");
                    Logger.i(AudioRecordPhoneViewModel.TAG, "shared audio convert fail");
                    AnyExtKt.main$default(null, new AudioRecordPhoneViewModel$shared$2$1$codecFail$1(audioRecordPhoneViewModel, null), 1, null);
                }

                @Override // com.xiaomi.fitness.devicesettings.bluttooth.audio.util.IConvertAACResult
                public void codecIsOver() {
                    Logger.i(AudioRecordPhoneViewModel.TAG, "shared audio convert success");
                    AnyExtKt.main$default(null, new AudioRecordPhoneViewModel$shared$2$1$codecIsOver$1(audioRecordPhoneViewModel, file, null), 1, null);
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordPhoneViewModel$updateStatusDB$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordPhoneViewModel$updateStatusDB$1", f = "AudioRecordPhoneViewModel.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20351 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AudioRecordEntity $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20351(AudioRecordEntity audioRecordEntity, Continuation<? super C20351> continuation) {
            super(2, continuation);
            this.$data = audioRecordEntity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C20351(this.$data, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AudioRecordDao audioRecordDao = AudioRecordDataBase.INSTANCE.getInstance().audioRecordDao();
                AudioRecordEntity audioRecordEntity = this.$data;
                this.label = 1;
                if (audioRecordDao.update(audioRecordEntity, this) == coroutine_suspended) {
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
            return ((C20351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public AudioRecordPhoneViewModel() {
        t tVarX = new t.b(AppUtil.getApp()).x();
        Intrinsics.checkNotNullExpressionValue(tVarX, "build(...)");
        this.exoPlayer = tVarX;
        this.statusChanged = new MutableLiveData<>();
        this.loadingChanged = new MutableLiveData<>();
        this.currentPositionTime = new MutableLiveData<>();
        this.durationTime = new MutableLiveData<>();
        this.audioStatusChanged = new MutableLiveData<>();
        this.singleDataChanged = new MutableLiveData<>();
        this.handler = new Handler(Looper.getMainLooper());
        this.progressTimer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: eo1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AudioRecordPhoneViewModel.progressTimer_delegate$lambda$3(this.f16865a);
            }
        });
    }

    private final void deleteTempFile() {
        File externalFilesDir = ApplicationExtKt.getApplication().getExternalFilesDir("/tempData");
        if (externalFilesDir != null && externalFilesDir.exists() && externalFilesDir.isDirectory()) {
            File[] fileArrListFiles = externalFilesDir.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    file.delete();
                }
            }
            externalFilesDir.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StopWatch getProgressTimer() {
        return (StopWatch) this.progressTimer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StopWatch progressTimer_delegate$lambda$3(final AudioRecordPhoneViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new StopWatch(250L, new Function1() { // from class: fo1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AudioRecordPhoneViewModel.progressTimer_delegate$lambda$3$lambda$2(this.f17989a, ((Long) obj).longValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit progressTimer_delegate$lambda$3$lambda$2(AudioRecordPhoneViewModel this$0, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isTouchSeekBar) {
            Logger.i(AudioTransVM.TAG, "isTouchSeekBar is true do not refresh progress ui");
            return Unit.INSTANCE;
        }
        this$0.currentPositionTime.postValue(Long.valueOf(this$0.exoPlayer.getCurrentPosition()));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void shared$default(AudioRecordPhoneViewModel audioRecordPhoneViewModel, AudioRecordEntity audioRecordEntity, boolean z, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            z = true;
        }
        audioRecordPhoneViewModel.shared(audioRecordEntity, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void transStatus(int status, long time, String objName, List<AsrResultItem> contentList) {
        Logger.i(TAG, "transStatus status=" + status + ",objName=" + objName + ",time=" + time);
        this.statusChanged.setValue(new RecordTransStatus(status, time, objName, contentList, null, 16, null));
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        AudioTransManager.INSTANCE.getInstance().addCallBack(new AnonymousClass1(this));
    }

    public final boolean deleteRecordFile(@Nullable AudioRecordEntity audioRecordData) {
        if (audioRecordData == null) {
            return false;
        }
        AnyExtKt.io$default(null, new C20301(audioRecordData, null), 1, null);
        File externalFilesDir = ApplicationExtKt.getApplication().getExternalFilesDir("/recorder");
        String strSimpleRecordFileRawName = UtilsKt.simpleRecordFileRawName(audioRecordData.getTitle());
        String str = audioRecordData.getDid() + "/" + strSimpleRecordFileRawName + ".ogg";
        Logger.i(TAG, "deleteRecordFile file= " + str);
        File file = new File(externalFilesDir, str);
        if (file.exists()) {
            return file.delete();
        }
        return false;
    }

    public final long duration() {
        return this.exoPlayer.getDuration();
    }

    @NotNull
    public final MutableLiveData<Boolean> getAudioStatusChanged() {
        return this.audioStatusChanged;
    }

    public final long getCurrentAudioStartTime() {
        return this.currentAudioStartTime;
    }

    @NotNull
    public final MutableLiveData<Long> getCurrentPositionTime() {
        return this.currentPositionTime;
    }

    @NotNull
    public final MutableLiveData<List<AudioRecordEntity>> getDataList() {
        return this.dataList;
    }

    @Nullable
    public final WearableDeviceModel getDeviceModel() {
        return this.deviceModel;
    }

    @NotNull
    public final MutableLiveData<Long> getDurationTime() {
        return this.durationTime;
    }

    @NotNull
    public final MutableLiveData<LoadingStatus> getLoadingChanged() {
        return this.loadingChanged;
    }

    @NotNull
    public final MutableLiveData<AudioRecordEntity> getSingleDataChanged() {
        return this.singleDataChanged;
    }

    public final void getStatus(@NotNull List<AudioRecordEntity> dataList) {
        String fdsName;
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        for (AudioRecordEntity audioRecordEntity : dataList) {
            if (audioRecordEntity.getStatus() == 2 && (fdsName = audioRecordEntity.getFdsName()) != null && fdsName.length() != 0) {
                AudioTransManager companion = AudioTransManager.INSTANCE.getInstance();
                long timestamp = audioRecordEntity.getTimestamp();
                String fdsName2 = audioRecordEntity.getFdsName();
                Intrinsics.checkNotNull(fdsName2);
                companion.addData(timestamp, fdsName2);
            }
        }
        AudioTransManager.INSTANCE.getInstance().startHandler();
    }

    @NotNull
    public final MutableLiveData<RecordTransStatus> getStatusChanged() {
        return this.statusChanged;
    }

    public final void initMediaSource(@NotNull AudioRecordEntity item, @Nullable Integer format) {
        Intrinsics.checkNotNullParameter(item, "item");
        getProgressTimer().cancel();
        this.currentAudioStartTime = item.getTimestamp();
        String str = ApplicationExtKt.getApplication().getExternalFilesDir("/recorder") + "/" + item.getDid() + "/" + UtilsKt.simpleRecordFileRawName(item.getTitle()) + ".ogg";
        Logger.i(TAG, "initMediaSource path=" + str);
        m mVarB = m.b(Uri.fromFile(new File(str)));
        Intrinsics.checkNotNullExpressionValue(mVarB, "fromUri(...)");
        this.exoPlayer.I(mVarB);
        this.exoPlayer.prepare();
        this.exoPlayer.K(new C20311());
    }

    public final boolean isPlaying() {
        return this.exoPlayer.isPlaying();
    }

    /* JADX INFO: renamed from: isTouchSeekBar, reason: from getter */
    public final boolean getIsTouchSeekBar() {
        return this.isTouchSeekBar;
    }

    public final void loadPhoneRecordList() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C20321(null), 3, null);
    }

    public final void loadSingleData(long time) {
        AnyExtKt.io$default(null, new C20331(time, this, null), 1, null);
    }

    @Override // defpackage.dvq
    public void onCleared() {
        super.onCleared();
        AudioTransManager.INSTANCE.getInstance().removeCallBack();
        this.exoPlayer.release();
        getProgressTimer().cancel();
        deleteTempFile();
    }

    public final void pause() {
        Logger.i(TAG, "pause isPlaying:" + this.exoPlayer.isPlaying());
        if (isPlaying()) {
            this.exoPlayer.pause();
        }
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public final void play() {
        Logger.i(TAG, "playOrPause   currentPosition:" + this.exoPlayer.getCurrentPosition() + " duration:" + this.exoPlayer.getDuration() + " playbackState:" + this.exoPlayer.getPlaybackState());
        if (this.exoPlayer.getPlaybackState() == 4) {
            this.exoPlayer.seekTo(0L);
        } else {
            this.exoPlayer.play();
        }
    }

    public final void postTransTask(@NotNull AudioRecordEntity item, @Nullable Integer format) {
        Intrinsics.checkNotNullParameter(item, "item");
        AudioTransManager.Companion companion = AudioTransManager.INSTANCE;
        if (!companion.getInstance().canAddData()) {
            ToastUtil.INSTANCE.showToast(wzi.k0);
        } else {
            if ("ogg".length() == 0) {
                return;
            }
            companion.getInstance().postTransTask(item, "ogg");
        }
    }

    public final void requestTransResult() {
        AudioTransManager.INSTANCE.getInstance().startHandler();
    }

    public final void seekTo(long position) {
        this.exoPlayer.seekTo(position);
        this.exoPlayer.play();
        this.currentPositionTime.postValue(Long.valueOf(position));
    }

    public final void setCurrentAudioStartTime(long j) {
        this.currentAudioStartTime = j;
    }

    public final void setDataList(@NotNull MutableLiveData<List<AudioRecordEntity>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.dataList = mutableLiveData;
    }

    public final void setDeviceModel(@Nullable WearableDeviceModel wearableDeviceModel) {
        this.deviceModel = wearableDeviceModel;
    }

    public final void setTouchSeekBar(boolean z) {
        this.isTouchSeekBar = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void shared(@NotNull AudioRecordEntity audioRecordData, boolean isSharedAudio) throws IOException {
        Intrinsics.checkNotNullParameter(audioRecordData, "audioRecordData");
        this.loadingChanged.setValue(new LoadingStatus(true, null, 2, 0 == true ? 1 : 0));
        if (!isSharedAudio) {
            File file = new File(ApplicationExtKt.getApplication().getExternalFilesDir("/tempData"), UtilsKt.simpleRecordFileName(audioRecordData.getNewTitle()) + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + TimeUtils.INSTANCE.getDateString(audioRecordData.getTimestamp()) + ".txt");
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            Logger.i(TAG, "shared file download start");
            AnyExtKt.io$default(null, new C20341(audioRecordData, file, this, null), 1, null);
            return;
        }
        String str = ApplicationExtKt.getApplication().getExternalFilesDir("/recorder") + "/" + audioRecordData.getDid() + "/" + UtilsKt.simpleRecordFileRawName(audioRecordData.getTitle()) + ".ogg";
        if (audioRecordData.getFormat() == 2) {
            this.loadingChanged.setValue(new LoadingStatus(false, str));
            return;
        }
        File file2 = new File(ApplicationExtKt.getApplication().getExternalFilesDir("/tempData"), UtilsKt.simpleRecordFileRawName(audioRecordData.getTitle()) + ".m4a");
        if (file2.exists()) {
            file2.delete();
        }
        Logger.i(TAG, "shared audio convert start");
        AnyExtKt.io$default(null, new AnonymousClass2(str, file2, this, null), 1, null);
    }

    public final void stop() {
        if (isPlaying()) {
            this.exoPlayer.stop();
        }
    }

    public final void stopRequest() {
        AudioTransManager.INSTANCE.getInstance().stopHandler();
    }

    public final void updateStatusDB(@NotNull AudioRecordEntity data) {
        Intrinsics.checkNotNullParameter(data, "data");
        AnyExtKt.io$default(null, new C20351(data, null), 1, null);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordPhoneViewModel$LoadingStatus;", "", "isLoading", "", "filePath", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getFilePath", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LoadingStatus {

        @Nullable
        private final String filePath;
        private final boolean isLoading;

        public LoadingStatus(boolean z, @Nullable String str) {
            this.isLoading = z;
            this.filePath = str;
        }

        public static /* synthetic */ LoadingStatus copy$default(LoadingStatus loadingStatus, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = loadingStatus.isLoading;
            }
            if ((i & 2) != 0) {
                str = loadingStatus.filePath;
            }
            return loadingStatus.copy(z, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFilePath() {
            return this.filePath;
        }

        @NotNull
        public final LoadingStatus copy(boolean isLoading, @Nullable String filePath) {
            return new LoadingStatus(isLoading, filePath);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadingStatus)) {
                return false;
            }
            LoadingStatus loadingStatus = (LoadingStatus) other;
            return this.isLoading == loadingStatus.isLoading && Intrinsics.areEqual(this.filePath, loadingStatus.filePath);
        }

        @Nullable
        public final String getFilePath() {
            return this.filePath;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isLoading) * 31;
            String str = this.filePath;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        @NotNull
        public String toString() {
            return "LoadingStatus(isLoading=" + this.isLoading + ", filePath=" + this.filePath + ")";
        }

        public /* synthetic */ LoadingStatus(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordPhoneViewModel$RecordTransStatus;", "", "status", "", "time", "", "objName", "", "contentList", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AsrResultItem;", "title", "<init>", "(IJLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getStatus", "()I", "getTime", "()J", "getObjName", "()Ljava/lang/String;", "getContentList", "()Ljava/util/List;", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RecordTransStatus {

        @Nullable
        private final List<AsrResultItem> contentList;

        @Nullable
        private final String objName;
        private final int status;
        private final long time;

        @Nullable
        private final String title;

        public RecordTransStatus(int i, long j, @Nullable String str, @Nullable List<AsrResultItem> list, @Nullable String str2) {
            this.status = i;
            this.time = j;
            this.objName = str;
            this.contentList = list;
            this.title = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RecordTransStatus copy$default(RecordTransStatus recordTransStatus, int i, long j, String str, List list, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = recordTransStatus.status;
            }
            if ((i2 & 2) != 0) {
                j = recordTransStatus.time;
            }
            long j2 = j;
            if ((i2 & 4) != 0) {
                str = recordTransStatus.objName;
            }
            String str3 = str;
            if ((i2 & 8) != 0) {
                list = recordTransStatus.contentList;
            }
            List list2 = list;
            if ((i2 & 16) != 0) {
                str2 = recordTransStatus.title;
            }
            return recordTransStatus.copy(i, j2, str3, list2, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getStatus() {
            return this.status;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTime() {
            return this.time;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getObjName() {
            return this.objName;
        }

        @Nullable
        public final List<AsrResultItem> component4() {
            return this.contentList;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final RecordTransStatus copy(int status, long time, @Nullable String objName, @Nullable List<AsrResultItem> contentList, @Nullable String title) {
            return new RecordTransStatus(status, time, objName, contentList, title);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RecordTransStatus)) {
                return false;
            }
            RecordTransStatus recordTransStatus = (RecordTransStatus) other;
            return this.status == recordTransStatus.status && this.time == recordTransStatus.time && Intrinsics.areEqual(this.objName, recordTransStatus.objName) && Intrinsics.areEqual(this.contentList, recordTransStatus.contentList) && Intrinsics.areEqual(this.title, recordTransStatus.title);
        }

        @Nullable
        public final List<AsrResultItem> getContentList() {
            return this.contentList;
        }

        @Nullable
        public final String getObjName() {
            return this.objName;
        }

        public final int getStatus() {
            return this.status;
        }

        public final long getTime() {
            return this.time;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.status) * 31) + Long.hashCode(this.time)) * 31;
            String str = this.objName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<AsrResultItem> list = this.contentList;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            String str2 = this.title;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "RecordTransStatus(status=" + this.status + ", time=" + this.time + ", objName=" + this.objName + ", contentList=" + this.contentList + ", title=" + this.title + ")";
        }

        public /* synthetic */ RecordTransStatus(int i, long j, String str, List list, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, j, str, list, (i2 & 16) != 0 ? null : str2);
        }
    }

    public final void shared(@NotNull Context context, @Nullable String path) {
        Intrinsics.checkNotNullParameter(context, "context");
        Logger.i(TAG, "shared file= " + path);
        if (path == null) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setFlags(268435456);
        intent.putExtra("android.intent.extra.STREAM", FileProvider.getUriForFile(context, AppUtil.getApp().getPackageName() + ".fileprovider", new File(path)));
        intent.setType("*/*");
        context.startActivity(Intent.createChooser(intent, "share"));
    }
}
