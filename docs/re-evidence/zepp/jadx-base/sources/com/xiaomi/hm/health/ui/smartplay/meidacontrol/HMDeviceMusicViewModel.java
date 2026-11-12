package com.xiaomi.hm.health.ui.smartplay.meidacontrol;

import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.musiccontrol.bean.MusicInfo;
import com.huami.musiccontrol.bean.MusicPlayInfo;
import com.huami.musiccontrol.bean.MusicState;
import com.huami.musiccontrol.bean.VolumeInfo;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.amc.HMMusicControl;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 72\u00020\u0001:\u00017B\u0007¢\u0006\u0004\b5\u00106J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001c\u0010\u000b\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\u001b\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000eH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aJ\u0006\u0010\u001d\u001a\u00020\u0011J\u000e\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010!\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001fJ\u0006\u0010\"\u001a\u00020\nR\u001d\u0010'\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010+R\u0016\u0010/\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0016\u00102\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u00101R\u0018\u00104\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00103\u0082\u0002\u0004\n\u0002\b\u0019¨\u00068"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/meidacontrol/HMDeviceMusicViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "e", "Lcom/huami/musiccontrol/bean/MusicInfo;", WebConstant.QueryParam.TYPE_MUSIC, "", "b", "music1", "music2", "", "f", "Lcom/huami/musiccontrol/bean/MusicState;", "state", "Lcom/xiaomi/hm/health/bt/profile/amc/HMMusicControl;", "a", "deviceMusicInfo", "", "g", "h", "i", "", "c", z.j, "(Lcom/xiaomi/hm/health/bt/profile/amc/HMMusicControl;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showMusic", "Lcom/huami/musiccontrol/bean/MusicPlayInfo;", "playInfo", "showMusicAndState", "showNoPermission", "showPlayState", "Lcom/huami/musiccontrol/bean/VolumeInfo;", "volumeInfo", "showVolume", "supportMusicControl", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "Lkotlin/Lazy;", "getSource", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Z", "hasVolumeFeature", "Lcom/xiaomi/hm/health/bt/profile/amc/HMMusicControl$PhoneState;", "Lcom/xiaomi/hm/health/bt/profile/amc/HMMusicControl$PhoneState;", "curState", GoogleApiAvailabilityLight.a, LogUtil.I, "curVolume", "curPosition", "J", "preTime", "Lcom/huami/musiccontrol/bean/MusicInfo;", "lastMusic", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HMDeviceMusicViewModel extends ViewModel {

    @NotNull
    private static final String h = "HMDeviceMusicViewModel";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean hasVolumeFeature;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int curVolume;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int curPosition;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long preTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private MusicInfo lastMusic;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy source = LazyKt__LazyJVMKt.lazy(g.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private HMMusicControl.PhoneState curState = HMMusicControl.PhoneState.PAUSE;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MusicState.values().length];
            iArr[MusicState.DISABLE.ordinal()] = 1;
            iArr[MusicState.STOPPED.ordinal()] = 2;
            iArr[MusicState.BUFFERING.ordinal()] = 3;
            iArr[MusicState.PLAYING.ordinal()] = 4;
            iArr[MusicState.PAUSED.ordinal()] = 5;
            iArr[MusicState.NOTIFICATION_DISABLE.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "music changed, curPosition: " + HMDeviceMusicViewModel.this.curPosition;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.meidacontrol.HMDeviceMusicViewModel$showMusic$1", f = "HMDeviceMusicViewModel.kt", i = {0}, l = {61}, m = "invokeSuspend", n = {"adjustPosition"}, s = {"I$0"})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public final /* synthetic */ MusicInfo d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ MusicInfo a;
            public final /* synthetic */ boolean b;
            public final /* synthetic */ int c;
            public final /* synthetic */ HMDeviceMusicViewModel d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MusicInfo musicInfo, boolean z, int i, HMDeviceMusicViewModel hMDeviceMusicViewModel) {
                super(0);
                this.a = musicInfo;
                this.b = z;
                this.c = i;
                this.d = hMDeviceMusicViewModel;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "sync music " + this.a.getTitle() + " to device and result: " + this.b + "， adjustPos: " + this.c + ", curPos: " + this.d.curPosition;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MusicInfo musicInfo, Continuation<? super b> continuation) {
            super(2, continuation);
            this.d = musicInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HMDeviceMusicViewModel.this.new b(this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            int i;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i2 = this.b;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                HMMusicControl hMMusicControl = new HMMusicControl(HMDeviceMusicViewModel.this.curState);
                HMDeviceMusicViewModel.this.g(this.d, hMMusicControl);
                int iB = HMDeviceMusicViewModel.this.b(this.d);
                HMDeviceMusicViewModel.this.lastMusic = this.d;
                hMMusicControl.setElapsedTime(iB);
                if (HMDeviceMusicViewModel.this.hasVolumeFeature) {
                    hMMusicControl.setVolume(HMDeviceMusicViewModel.this.curVolume);
                }
                HMDeviceMusicViewModel hMDeviceMusicViewModel = HMDeviceMusicViewModel.this;
                this.a = iB;
                this.b = 1;
                obj = hMDeviceMusicViewModel.j(hMMusicControl, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = iB;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.a;
                ResultKt.throwOnFailure(obj);
            }
            HMLog.info(HMDeviceMusicViewModel.h, new a(this.d, ((Boolean) obj).booleanValue(), i, HMDeviceMusicViewModel.this));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.meidacontrol.HMDeviceMusicViewModel$showMusicAndState$1", f = "HMDeviceMusicViewModel.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ MusicPlayInfo c;
        public final /* synthetic */ MusicInfo d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ MusicInfo a;
            public final /* synthetic */ MusicPlayInfo b;
            public final /* synthetic */ boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MusicInfo musicInfo, MusicPlayInfo musicPlayInfo, boolean z) {
                super(0);
                this.a = musicInfo;
                this.b = musicPlayInfo;
                this.c = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "sync music " + this.a.getTitle() + " and play info: " + this.b + " to device and result: " + this.c;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MusicPlayInfo musicPlayInfo, MusicInfo musicInfo, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = musicPlayInfo;
            this.d = musicInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HMDeviceMusicViewModel.this.new c(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMMusicControl hMMusicControlA = HMDeviceMusicViewModel.this.a(this.c.getState());
                HMDeviceMusicViewModel.this.curState = hMMusicControlA.getState();
                HMDeviceMusicViewModel.this.g(this.d, hMMusicControlA);
                HMDeviceMusicViewModel.this.curPosition = (int) (this.c.getPosition() / ((long) 1000));
                if (HMDeviceMusicViewModel.this.curState == HMMusicControl.PhoneState.PLAY) {
                    HMDeviceMusicViewModel.this.h();
                } else {
                    HMDeviceMusicViewModel.this.i();
                }
                hMMusicControlA.setElapsedTime(HMDeviceMusicViewModel.this.curPosition);
                if (HMDeviceMusicViewModel.this.hasVolumeFeature) {
                    hMMusicControlA.setVolume(HMDeviceMusicViewModel.this.curVolume);
                }
                HMDeviceMusicViewModel hMDeviceMusicViewModel = HMDeviceMusicViewModel.this;
                this.a = 1;
                obj = hMDeviceMusicViewModel.j(hMMusicControlA, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            HMLog.info(HMDeviceMusicViewModel.h, new a(this.d, this.c, ((Boolean) obj).booleanValue()));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.meidacontrol.HMDeviceMusicViewModel$showNoPermission$1", f = "HMDeviceMusicViewModel.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "sync no permission to device and result: " + this.a;
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HMDeviceMusicViewModel.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMMusicControl hMMusicControlA = HMDeviceMusicViewModel.this.a(MusicState.NOTIFICATION_DISABLE);
                HMDeviceMusicViewModel hMDeviceMusicViewModel = HMDeviceMusicViewModel.this;
                this.a = 1;
                obj = hMDeviceMusicViewModel.j(hMMusicControlA, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            HMLog.info(HMDeviceMusicViewModel.h, new a(((Boolean) obj).booleanValue()));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.meidacontrol.HMDeviceMusicViewModel$showPlayState$1", f = "HMDeviceMusicViewModel.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ MusicPlayInfo c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ MusicPlayInfo a;
            public final /* synthetic */ boolean b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MusicPlayInfo musicPlayInfo, boolean z) {
                super(0);
                this.a = musicPlayInfo;
                this.b = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "sync play state: " + this.a + " to device and result: " + this.b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MusicPlayInfo musicPlayInfo, Continuation<? super e> continuation) {
            super(2, continuation);
            this.c = musicPlayInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HMDeviceMusicViewModel.this.new e(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMMusicControl hMMusicControlA = HMDeviceMusicViewModel.this.a(this.c.getState());
                HMDeviceMusicViewModel.this.curState = hMMusicControlA.getState();
                HMDeviceMusicViewModel.this.curPosition = (int) (this.c.getPosition() / ((long) 1000));
                if (HMDeviceMusicViewModel.this.curState == HMMusicControl.PhoneState.PLAY) {
                    HMDeviceMusicViewModel.this.h();
                } else {
                    HMDeviceMusicViewModel.this.i();
                }
                hMMusicControlA.setElapsedTime(HMDeviceMusicViewModel.this.curPosition);
                hMMusicControlA.setVolume(HMDeviceMusicViewModel.this.curVolume);
                HMDeviceMusicViewModel hMDeviceMusicViewModel = HMDeviceMusicViewModel.this;
                this.a = 1;
                obj = hMDeviceMusicViewModel.j(hMMusicControlA, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            HMLog.info(HMDeviceMusicViewModel.h, new a(this.c, ((Boolean) obj).booleanValue()));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.meidacontrol.HMDeviceMusicViewModel$showVolume$1", f = "HMDeviceMusicViewModel.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ VolumeInfo c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ HMDeviceMusicViewModel a;
            public final /* synthetic */ boolean b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HMDeviceMusicViewModel hMDeviceMusicViewModel, boolean z) {
                super(0);
                this.a = hMDeviceMusicViewModel;
                this.b = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "sync volume: " + this.a.curVolume + " to device and result: " + this.b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(VolumeInfo volumeInfo, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = volumeInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HMDeviceMusicViewModel.this.new f(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMMusicControl hMMusicControl = new HMMusicControl(HMDeviceMusicViewModel.this.curState);
                hMMusicControl.setOnlyVolume(true);
                HMDeviceMusicViewModel.this.curVolume = this.c.getVolume();
                hMMusicControl.setVolume(HMDeviceMusicViewModel.this.curVolume);
                HMDeviceMusicViewModel hMDeviceMusicViewModel = HMDeviceMusicViewModel.this;
                this.a = 1;
                obj = hMDeviceMusicViewModel.j(hMMusicControl, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            HMLog.info(HMDeviceMusicViewModel.h, new a(HMDeviceMusicViewModel.this, ((Boolean) obj).booleanValue()));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<HMDeviceSource> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMDeviceSource invoke() {
            return HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ HMMiLiProDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(HMMiLiProDevice hMMiLiProDevice) {
            super(0);
            this.a = hMMiLiProDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            HMMiLiProDevice hMMiLiProDevice = this.a;
            return "sync to device failed as device is " + hMMiLiProDevice + " and connected: " + (hMMiLiProDevice == null ? null : Boolean.valueOf(hMMiLiProDevice.isConnected()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMMusicControl a(MusicState state) {
        switch (WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
            case 2:
                HMMusicControl hMMusicControl = new HMMusicControl(HMMusicControl.PhoneState.PAUSE);
                hMMusicControl.setException(HMMusicControl.AppException.NO_MUSIC);
                return hMMusicControl;
            case 3:
                return new HMMusicControl(HMMusicControl.PhoneState.PAUSE);
            case 4:
                return new HMMusicControl(HMMusicControl.PhoneState.PLAY);
            case 5:
                return new HMMusicControl(HMMusicControl.PhoneState.PAUSE);
            case 6:
                HMMusicControl hMMusicControl2 = new HMMusicControl(HMMusicControl.PhoneState.PAUSE);
                hMMusicControl2.setException(HMMusicControl.AppException.NO_PERMISSION);
                return hMMusicControl2;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int b(MusicInfo music) {
        if (f(music, this.lastMusic) || this.lastMusic == null) {
            long jC = ((long) this.curPosition) + (c() / ((long) 1000));
            return jC > music.getDuration() ? this.curPosition : (int) jC;
        }
        HMLog.info(h, new a());
        this.curPosition = 0;
        if (this.curState == HMMusicControl.PhoneState.PLAY) {
            h();
        } else {
            i();
        }
        return this.curPosition;
    }

    private final long c() {
        return System.currentTimeMillis() - this.preTime;
    }

    private final HMMiLiProDevice e() {
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        if (!(device instanceof HMMiLiProDevice)) {
            return null;
        }
        this.hasVolumeFeature = HMDeviceConfig.hasFeatureMusicVolume();
        return (HMMiLiProDevice) device;
    }

    private final boolean f(MusicInfo music1, MusicInfo music2) {
        if (Intrinsics.areEqual(music1 == null ? null : music1.getAlbum(), music2 == null ? null : music2.getAlbum())) {
            if (Intrinsics.areEqual(music1 == null ? null : music1.getArtist(), music2 == null ? null : music2.getArtist())) {
                if (Intrinsics.areEqual(music1 == null ? null : Long.valueOf(music1.getDuration()), music2 != null ? Long.valueOf(music2.getDuration()) : null)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(MusicInfo music, HMMusicControl deviceMusicInfo) {
        deviceMusicInfo.setArtist(music.getArtist());
        deviceMusicInfo.setAlbum(music.getAlbum());
        deviceMusicInfo.setTitle(music.getTitle());
        deviceMusicInfo.setDuration((int) (music.getDuration() / ((long) 1000)));
    }

    private final HMDeviceSource getSource() {
        return (HMDeviceSource) this.source.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        this.preTime = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        this.preTime = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object j(HMMusicControl hMMusicControl, Continuation<? super Boolean> continuation) {
        HMMiLiProDevice hMMiLiProDeviceE = e();
        if (hMMiLiProDeviceE == null || !hMMiLiProDeviceE.isConnected()) {
            HMLog.info(h, new h(hMMiLiProDeviceE));
            return Boxing.boxBoolean(false);
        }
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        hMMiLiProDeviceE.sendMusicControl(hMMusicControl, new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.ui.smartplay.meidacontrol.HMDeviceMusicViewModel$syncToDevice$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(false);
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
                onFinish(bool.booleanValue());
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
                Continuation<Boolean> continuation2 = safeContinuation;
                Boolean boolValueOf = Boolean.valueOf(result);
                Result.Companion companion = Result.Companion;
                continuation2.resumeWith(Result.m3845constructorimpl(boolValueOf));
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public final void showMusic(@NotNull MusicInfo music) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(music, null), 2, null);
    }

    public final void showMusicAndState(@NotNull MusicInfo music, @NotNull MusicPlayInfo playInfo) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new c(playInfo, music, null), 2, null);
    }

    public final void showNoPermission() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new d(null), 2, null);
    }

    public final void showPlayState(@NotNull MusicPlayInfo playInfo) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new e(playInfo, null), 2, null);
    }

    public final void showVolume(@NotNull VolumeInfo volumeInfo) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new f(volumeInfo, null), 2, null);
    }

    public final boolean supportMusicControl() {
        return HMDeviceConfig.supportMusicControl(getSource());
    }
}
