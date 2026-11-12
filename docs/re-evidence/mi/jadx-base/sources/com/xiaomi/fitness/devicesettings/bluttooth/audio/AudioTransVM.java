package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.lifecycle.MutableLiveData;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.t;
import com.google.android.exoplayer2.v;
import com.tencent.wcdb.FileUtils;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioTransVM;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.SummaryAllowed;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.net.DeviceSettingsRequestExtKt;
import com.xiaomi.fitness.devicesettings.utils.UtilsKt;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.aop;
import defpackage.n0i;
import defpackage.nm1;
import defpackage.u56;
import defpackage.wrq;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 W2\u00020\u0001:\u0001WB\u0007¢\u0006\u0004\bV\u0010\u0017J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0017J\u0015\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010\u0006J\u000f\u0010#\u001a\u00020\u0004H\u0014¢\u0006\u0004\b#\u0010\u0017J\u0015\u0010%\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0004¢\u0006\u0004\b'\u0010\u0017J\u0015\u0010(\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b(\u0010&R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\f0,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020\u001b0,8\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020\b0,8\u0006¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u00100R\u001d\u00105\u001a\b\u0012\u0004\u0012\u00020\u00020,8\u0006¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u00100R\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020\u00020,8\u0006¢\u0006\f\n\u0004\b7\u0010.\u001a\u0004\b8\u00100R)\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b090,8\u0006¢\u0006\f\n\u0004\b:\u0010.\u001a\u0004\b;\u00100R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010\u000fR\"\u0010@\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\b@\u0010B\"\u0004\bC\u0010\u001eR\"\u0010D\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010A\u001a\u0004\bD\u0010B\"\u0004\bE\u0010\u001eR$\u0010G\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010AR\u001b\u0010U\u001a\u00020P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T¨\u0006X"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioTransVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "", "currentPosition", "", "sendPositionAndIndex", "(J)V", "time", "", "format", "initMediaSource", "(JLjava/lang/Integer;)V", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/MeetingBean;", "meetingBean", "refreshMeetingBean", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/MeetingBean;)V", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "loadData", "(Ljava/lang/Long;)V", "loadSummaryPermission", "()V", "playOrPause", "pause", "release", "", "isTouchSeekBar", "setIsToucheSeekBar", "(Z)V", "duration", "()J", "position", "seekTo", "onCleared", "", "longTime2timestr", "(J)Ljava/lang/String;", "getRecordData", "getFileName", "Lcom/google/android/exoplayer2/t;", "exoPlayer", "Lcom/google/android/exoplayer2/t;", "Landroidx/lifecycle/MutableLiveData;", "dataChanged", "Landroidx/lifecycle/MutableLiveData;", "getDataChanged", "()Landroidx/lifecycle/MutableLiveData;", "statusChanged", "getStatusChanged", "progressChanged", "getProgressChanged", "currentPositionTime", "getCurrentPositionTime", "durationTime", "getDurationTime", "Lkotlin/Pair;", "positionIndexChange", "getPositionIndexChange", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/MeetingBean;", "getMeetingBean", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/MeetingBean;", "setMeetingBean", "isEmpty", "Z", "()Z", "setEmpty", "isSummaryAllowed", "setSummaryAllowed", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordEntity;", "audioRecord", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordEntity;", "getAudioRecord", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordEntity;", "setAudioRecord", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordEntity;)V", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/StopWatch;", "progressTimer$delegate", "Lkotlin/Lazy;", "getProgressTimer", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/StopWatch;", "progressTimer", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAudioTransVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioTransVM.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioTransVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,325:1\n1863#2:326\n774#2:327\n865#2,2:328\n1864#2:330\n774#2:331\n865#2:332\n1755#2,3:333\n866#2:336\n1872#2,2:337\n1872#2,3:339\n1874#2:342\n*S KotlinDebug\n*F\n+ 1 AudioTransVM.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioTransVM\n*L\n121#1:326\n122#1:327\n122#1:328,2\n121#1:330\n126#1:331\n126#1:332\n126#1:333,3\n126#1:336\n88#1:337,2\n99#1:339,3\n88#1:342\n*E\n"})
public final class AudioTransVM extends AbsViewModel {

    @NotNull
    public static final String TAG = "AudioTransVM";
    public static final int sWhatIsPlayUi = 10;

    @Nullable
    private AudioRecordEntity audioRecord;

    @NotNull
    private final MutableLiveData<Long> currentPositionTime;

    @NotNull
    private final MutableLiveData<MeetingBean> dataChanged;

    @NotNull
    private final MutableLiveData<Long> durationTime;

    @NotNull
    private final t exoPlayer;

    @NotNull
    private final Handler handler;
    private boolean isEmpty;
    private boolean isSummaryAllowed;
    private volatile boolean isTouchSeekBar;

    @Nullable
    private MeetingBean meetingBean;

    @NotNull
    private final MutableLiveData<Pair<Integer, Integer>> positionIndexChange;

    @NotNull
    private final MutableLiveData<Integer> progressChanged;

    /* JADX INFO: renamed from: progressTimer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy progressTimer;

    @NotNull
    private final MutableLiveData<Boolean> statusChanged;

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioTransVM$getRecordData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioTransVM$getRecordData$1", f = "AudioTransVM.kt", i = {}, l = {309}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20361 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C20361(Continuation<? super C20361> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AudioTransVM.this.new C20361(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AudioRecordDao audioRecordDao = AudioRecordDataBase.INSTANCE.getInstance().audioRecordDao();
                MeetingBean value = AudioTransVM.this.getDataChanged().getValue();
                Intrinsics.checkNotNull(value);
                long time = value.getTime();
                this.label = 1;
                obj = audioRecordDao.get(time, this);
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
            AudioRecordEntity audioRecordEntityCopy = audioRecordEntity != null ? audioRecordEntity.copy((511 & 1) != 0 ? audioRecordEntity.timestamp : 0L, (511 & 2) != 0 ? audioRecordEntity.title : null, (511 & 4) != 0 ? audioRecordEntity.newTitle : null, (511 & 8) != 0 ? audioRecordEntity.did : null, (511 & 16) != 0 ? audioRecordEntity.duration : 0L, (511 & 32) != 0 ? audioRecordEntity.status : 0, (511 & 64) != 0 ? audioRecordEntity.format : 0, (511 & 128) != 0 ? audioRecordEntity.fdsName : null, (511 & 256) != 0 ? audioRecordEntity.contentList : null) : null;
            StringBuilder sb = new StringBuilder();
            sb.append("record ");
            sb.append(audioRecordEntityCopy);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioTransVM$loadData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioTransVM$loadData$1", f = "AudioTransVM.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nAudioTransVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioTransVM.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioTransVM$loadData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,325:1\n774#2:326\n865#2,2:327\n1863#2,2:329\n*S KotlinDebug\n*F\n+ 1 AudioTransVM.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioTransVM$loadData$1\n*L\n155#1:326\n155#1:327,2\n155#1:329,2\n*E\n"})
    public static final class C20381 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Long $time;
        int label;
        final /* synthetic */ AudioTransVM this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioTransVM$loadData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioTransVM$loadData$1$1", f = "AudioTransVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04581 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ AudioRecordEntity $dbData;
            final /* synthetic */ Long $time;
            int label;
            final /* synthetic */ AudioTransVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04581(AudioTransVM audioTransVM, AudioRecordEntity audioRecordEntity, Long l, Continuation<? super C04581> continuation) {
                super(2, continuation);
                this.this$0 = audioTransVM;
                this.$dbData = audioRecordEntity;
                this.$time = l;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04581(this.this$0, this.$dbData, this.$time, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.setAudioRecord(this.$dbData);
                AudioTransVM audioTransVM = this.this$0;
                long jLongValue = this.$time.longValue();
                AudioRecordEntity audioRecordEntity = this.$dbData;
                audioTransVM.initMediaSource(jLongValue, audioRecordEntity != null ? Boxing.boxInt(audioRecordEntity.getFormat()) : null);
                this.this$0.exoPlayer.prepare();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20381(Long l, AudioTransVM audioTransVM, Continuation<? super C20381> continuation) {
            super(2, continuation);
            this.$time = l;
            this.this$0 = audioTransVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C20381(this.$time, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            List<TalkBean> talkList;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AudioRecordDao audioRecordDao = AudioRecordDataBase.INSTANCE.getInstance().audioRecordDao();
                long jLongValue = this.$time.longValue();
                this.label = 1;
                obj2 = audioRecordDao.get(jLongValue, this);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
            }
            AudioRecordEntity audioRecordEntity = (AudioRecordEntity) obj2;
            TalkBean talkBean = null;
            AnyExtKt.main$default(null, new C04581(this.this$0, audioRecordEntity, this.$time, null), 1, null);
            if (audioRecordEntity != null) {
                AudioTransVM audioTransVM = this.this$0;
                List<AsrResultItem> contentList = audioRecordEntity.getContentList();
                if (contentList != null && !contentList.isEmpty()) {
                    z = false;
                }
                audioTransVM.setEmpty(z);
                audioTransVM.setMeetingBean(new MeetingBean(audioRecordEntity.getTimestamp(), audioRecordEntity.getDid(), audioRecordEntity.getStatus(), audioRecordEntity.getTitle(), audioRecordEntity.getNewTitle(), audioRecordEntity.getFdsName(), null, null, 0, FileUtils.S_IRWXU, null));
                List<AsrResultItem> contentList2 = audioRecordEntity.getContentList();
                if (contentList2 != null) {
                    ArrayList<AsrResultItem> arrayList = new ArrayList();
                    for (Object obj3 : contentList2) {
                        if (((AsrResultItem) obj3).getContent().length() > 0) {
                            arrayList.add(obj3);
                        }
                    }
                    for (AsrResultItem asrResultItem : arrayList) {
                        if (talkBean == null || talkBean.getSpeakerId() != asrResultItem.getSpeakerId()) {
                            TalkBean talkBean2 = new TalkBean(asrResultItem.getSpeakerId(), asrResultItem.getUserName(), null, null, 12, null);
                            MeetingBean meetingBean = audioTransVM.getMeetingBean();
                            if (meetingBean != null && (talkList = meetingBean.getTalkList()) != null) {
                                ListExtKt.add(talkList, talkBean2);
                            }
                            talkBean = talkBean2;
                        }
                        List<MessageBean> msgList = talkBean.getMsgList();
                        if (msgList != null) {
                            ListExtKt.add(msgList, new MessageBean(asrResultItem.getStart_time(), asrResultItem.getEnd_time(), asrResultItem.getContent(), null, null, null, false, 120, null));
                        }
                    }
                }
                audioTransVM.getDurationTime().postValue(Boxing.boxLong(audioRecordEntity.getDuration()));
                audioTransVM.getDataChanged().postValue(audioTransVM.getMeetingBean());
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public AudioTransVM() {
        t tVarX = new t.b(AppUtil.getApp()).x();
        Intrinsics.checkNotNullExpressionValue(tVarX, "build(...)");
        this.exoPlayer = tVarX;
        this.dataChanged = new MutableLiveData<>();
        this.statusChanged = new MutableLiveData<>();
        this.progressChanged = new MutableLiveData<>();
        this.currentPositionTime = new MutableLiveData<>();
        this.durationTime = new MutableLiveData<>();
        this.positionIndexChange = new MutableLiveData<>();
        HandlerThread handlerThread = new HandlerThread("HandlerThread");
        handlerThread.start();
        this.handler = new Handler(handlerThread.getLooper()) { // from class: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioTransVM.1
            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                if (msg.what == 10) {
                    MutableLiveData<Boolean> statusChanged = AudioTransVM.this.getStatusChanged();
                    Object obj = msg.obj;
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
                    statusChanged.postValue((Boolean) obj);
                }
            }
        };
        this.progressTimer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: zp1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AudioTransVM.progressTimer_delegate$lambda$1(this.f41534a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StopWatch getProgressTimer() {
        return (StopWatch) this.progressTimer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initMediaSource(long time, Integer format) {
        String title;
        File externalFilesDir = ApplicationExtKt.getApplication().getExternalFilesDir("/recorder");
        AudioRecordEntity audioRecordEntity = this.audioRecord;
        String did = audioRecordEntity != null ? audioRecordEntity.getDid() : null;
        AudioRecordEntity audioRecordEntity2 = this.audioRecord;
        if (audioRecordEntity2 == null || (title = audioRecordEntity2.getTitle()) == null) {
            title = "";
        }
        String str = externalFilesDir + "/" + did + "/" + UtilsKt.simpleRecordFileRawName(title) + ".ogg";
        Logger.i(TAG, "initMediaSource path=" + str);
        m mVarB = m.b(Uri.fromFile(new File(str)));
        Intrinsics.checkNotNullExpressionValue(mVarB, "fromUri(...)");
        this.exoPlayer.I(mVarB);
        this.exoPlayer.K(new q.e() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioTransVM.initMediaSource.1
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
                Logger.i(AudioTransVM.TAG, "onIsPlayingChanged " + isPlaying + " " + AudioTransVM.this.exoPlayer.getPlaybackState() + " " + AudioTransVM.this.exoPlayer.getCurrentPosition() + " " + AudioTransVM.this.exoPlayer.getDuration());
                if (isPlaying) {
                    AudioTransVM.this.getProgressTimer().start();
                } else {
                    AudioTransVM.this.getProgressTimer().pause();
                }
                Message messageObtain = Message.obtain();
                messageObtain.what = 10;
                boolean z = true;
                if (!isPlaying && AudioTransVM.this.exoPlayer.getPlaybackState() != 2) {
                    z = false;
                }
                messageObtain.obj = Boolean.valueOf(z);
                AudioTransVM.this.handler.sendMessageDelayed(messageObtain, 50L);
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
                if (state != 3) {
                    if (state != 4) {
                        return;
                    }
                    AudioTransVM.this.getCurrentPositionTime().postValue(Long.valueOf(AudioTransVM.this.exoPlayer.getDuration()));
                    AudioTransVM audioTransVM = AudioTransVM.this;
                    audioTransVM.sendPositionAndIndex(audioTransVM.exoPlayer.getDuration());
                    AudioTransVM.this.getProgressTimer().cancel();
                    return;
                }
                Logger.i(AudioTransVM.TAG, "onPlaybackStateChanged   duration:" + AudioTransVM.this.exoPlayer.getDuration());
                AudioTransVM.this.getDurationTime().postValue(Long.valueOf(AudioTransVM.this.exoPlayer.getDuration()));
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
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadSummaryPermission$lambda$10(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.e(TAG, "loadSummaryPermission error=" + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadSummaryPermission$lambda$9(AudioTransVM this$0, SummaryAllowed it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "loadSummaryPermission result=" + it);
        this$0.isSummaryAllowed = it.getAllow();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StopWatch progressTimer_delegate$lambda$1(final AudioTransVM this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new StopWatch(250L, new Function1() { // from class: yp1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AudioTransVM.progressTimer_delegate$lambda$1$lambda$0(this.f40389a, ((Long) obj).longValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit progressTimer_delegate$lambda$1$lambda$0(AudioTransVM this$0, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.isTouchSeekBar) {
            long currentPosition = this$0.exoPlayer.getCurrentPosition();
            this$0.currentPositionTime.postValue(Long.valueOf(currentPosition));
            this$0.sendPositionAndIndex(currentPosition);
            return Unit.INSTANCE;
        }
        Logger.i(TAG, "isTouchSeekBar " + this$0.isTouchSeekBar + " do not refresh progress ui");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendPositionAndIndex(final long currentPosition) {
        this.handler.postDelayed(new Runnable() { // from class: aq1
            @Override // java.lang.Runnable
            public final void run() {
                AudioTransVM.sendPositionAndIndex$lambda$4(this.f3346a, currentPosition);
            }
        }, 10L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendPositionAndIndex$lambda$4(AudioTransVM this$0, long j) {
        List<TalkBean> talkList;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MeetingBean meetingBean = this$0.meetingBean;
        if (meetingBean != null && (talkList = meetingBean.getTalkList()) != null) {
            int i = 0;
            for (Object obj : talkList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                List<MessageBean> msgList = ((TalkBean) obj).getMsgList();
                if (!msgList.isEmpty()) {
                    long start_time = msgList.get(0).getStart_time();
                    long end_time = msgList.get(CollectionsKt__CollectionsKt.getLastIndex(msgList)).getEnd_time();
                    boolean z = start_time <= j && j <= end_time;
                    Logger.i(TAG, "currentPosition: " + j + " sendPositionAndIndex isInTalkBean:" + z + "  startTime:" + start_time + "   endTime" + end_time + " position" + i);
                    if (z) {
                        int i3 = 0;
                        for (Object obj2 : msgList) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                            }
                            MessageBean messageBean = (MessageBean) obj2;
                            boolean z2 = j <= messageBean.getEnd_time() && messageBean.getStart_time() <= j;
                            Logger.i(TAG, "找到了  " + i + " " + i3);
                            if (z2) {
                                if (this$0.isTouchSeekBar) {
                                    return;
                                }
                                this$0.positionIndexChange.postValue(new Pair<>(Integer.valueOf(i), Integer.valueOf(i3)));
                                return;
                            }
                            i3 = i4;
                        }
                    } else {
                        continue;
                    }
                }
                i = i2;
            }
        }
        this$0.positionIndexChange.postValue(new Pair<>(-1, -1));
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final long duration() {
        return this.exoPlayer.getDuration();
    }

    @Nullable
    public final AudioRecordEntity getAudioRecord() {
        return this.audioRecord;
    }

    @NotNull
    public final MutableLiveData<Long> getCurrentPositionTime() {
        return this.currentPositionTime;
    }

    @NotNull
    public final MutableLiveData<MeetingBean> getDataChanged() {
        return this.dataChanged;
    }

    @NotNull
    public final MutableLiveData<Long> getDurationTime() {
        return this.durationTime;
    }

    @NotNull
    public final String getFileName(long time) {
        String str = new SimpleDateFormat("yyyy-MM-dd HH_mm_ss", Locale.getDefault()).format(new Date(time * ((long) 1000)));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @Nullable
    public final MeetingBean getMeetingBean() {
        return this.meetingBean;
    }

    @NotNull
    public final MutableLiveData<Pair<Integer, Integer>> getPositionIndexChange() {
        return this.positionIndexChange;
    }

    @NotNull
    public final MutableLiveData<Integer> getProgressChanged() {
        return this.progressChanged;
    }

    public final void getRecordData() {
        if (this.dataChanged.getValue() == null) {
            return;
        }
        AnyExtKt.io$default(null, new C20361(null), 1, null);
    }

    @NotNull
    public final MutableLiveData<Boolean> getStatusChanged() {
        return this.statusChanged;
    }

    /* JADX INFO: renamed from: isEmpty, reason: from getter */
    public final boolean getIsEmpty() {
        return this.isEmpty;
    }

    /* JADX INFO: renamed from: isSummaryAllowed, reason: from getter */
    public final boolean getIsSummaryAllowed() {
        return this.isSummaryAllowed;
    }

    public final void loadData(@Nullable Long time) {
        if (time != null) {
            AnyExtKt.io$default(null, new C20381(time, this, null), 1, null);
        }
    }

    public final void loadSummaryPermission() {
        DeviceSettingsRequestExtKt.getDeviceSettingsRequest().summaryAllow(new Function1() { // from class: wp1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AudioTransVM.loadSummaryPermission$lambda$9(this.f38200a, (SummaryAllowed) obj);
            }
        }, new Function1() { // from class: xp1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AudioTransVM.loadSummaryPermission$lambda$10((ApiException) obj);
            }
        });
    }

    @NotNull
    public final String longTime2timestr(long time) {
        Object objValueOf;
        Object objValueOf2;
        long j = time / ((long) 1000);
        long j2 = 60;
        long j3 = j / j2;
        if (j3 < 10) {
            objValueOf = "0" + j3;
        } else {
            objValueOf = Long.valueOf(j3);
        }
        long j4 = j % j2;
        if (j4 < 10) {
            objValueOf2 = "0" + j4;
        } else {
            objValueOf2 = Long.valueOf(j4);
        }
        return objValueOf + ":" + objValueOf2;
    }

    @Override // defpackage.dvq
    public void onCleared() {
        super.onCleared();
        this.exoPlayer.release();
        getProgressTimer().cancel();
    }

    public final void pause() {
        if (this.exoPlayer.isPlaying()) {
            this.exoPlayer.pause();
        }
    }

    public final void playOrPause() {
        Logger.i(TAG, "playOrPause   isPlaying:" + this.exoPlayer.isPlaying());
        if (this.exoPlayer.isPlaying()) {
            this.exoPlayer.pause();
            return;
        }
        Logger.i(TAG, "playOrPause   currentPosition:" + this.exoPlayer.getCurrentPosition() + " duration:" + this.exoPlayer.getDuration() + " playbackState:" + this.exoPlayer.getPlaybackState());
        if (this.exoPlayer.getPlaybackState() == 4) {
            this.exoPlayer.seekTo(0L);
        } else {
            this.exoPlayer.play();
        }
    }

    public final void refreshMeetingBean(@NotNull MeetingBean meetingBean) {
        Intrinsics.checkNotNullParameter(meetingBean, "meetingBean");
        List<TalkBean> talkList = meetingBean.getTalkList();
        for (TalkBean talkBean : talkList) {
            List<MessageBean> msgList = talkBean.getMsgList();
            ArrayList arrayList = new ArrayList();
            for (Object obj : msgList) {
                if (((MessageBean) obj).getContent().length() > 0) {
                    arrayList.add(obj);
                }
            }
            talkBean.setMsgList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : talkList) {
            List<MessageBean> msgList2 = ((TalkBean) obj2).getMsgList();
            if (!(msgList2 instanceof Collection) || !msgList2.isEmpty()) {
                Iterator<T> it = msgList2.iterator();
                while (it.hasNext()) {
                    if (((MessageBean) it.next()).getContent().length() > 0) {
                        arrayList2.add(obj2);
                        break;
                    }
                }
            }
        }
        MeetingBean meetingBeanCopy = meetingBean.copy((447 & 1) != 0 ? meetingBean.time : 0L, (447 & 2) != 0 ? meetingBean.address : null, (447 & 4) != 0 ? meetingBean.status : 0, (447 & 8) != 0 ? meetingBean.title : null, (447 & 16) != 0 ? meetingBean.newTitle : null, (447 & 32) != 0 ? meetingBean.fdsName : null, (447 & 64) != 0 ? meetingBean.talkList : arrayList2, (447 & 128) != 0 ? meetingBean.scene : null, (447 & 256) != 0 ? meetingBean.type : 0);
        this.meetingBean = meetingBeanCopy;
        this.dataChanged.postValue(meetingBeanCopy);
    }

    public final void release() {
        this.exoPlayer.stop();
        this.exoPlayer.release();
    }

    public final void seekTo(long position) {
        this.exoPlayer.seekTo(position);
        this.exoPlayer.play();
    }

    public final void setAudioRecord(@Nullable AudioRecordEntity audioRecordEntity) {
        this.audioRecord = audioRecordEntity;
    }

    public final void setEmpty(boolean z) {
        this.isEmpty = z;
    }

    public final void setIsToucheSeekBar(boolean isTouchSeekBar) {
        this.isTouchSeekBar = isTouchSeekBar;
    }

    public final void setMeetingBean(@Nullable MeetingBean meetingBean) {
        this.meetingBean = meetingBean;
    }

    public final void setSummaryAllowed(boolean z) {
        this.isSummaryAllowed = z;
    }
}
