package com.huami.devicerecorder.player;

import android.app.Application;
import android.content.res.AssetFileDescriptor;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicerecorder.model.ExtKt;
import com.huami.devicerecorder.model.PlayItemData;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.mediac.Command;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001\u000bB\u000f\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0002J\u001b\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\nH\u0016J\b\u0010\u0018\u001a\u00020\rH\u0014R\u001d\u0010\u001d\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lcom/huami/devicerecorder/player/RecorderPlayerViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lcom/huami/devicerecorder/player/IRecorderPlayer;", "Lcom/huami/devicerecorder/model/PlayItemData;", "item", "", "e", "(Lcom/huami/devicerecorder/model/PlayItemData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "tag", "Lcom/huami/devicerecorder/player/IRecorderPlayer$IPlayerCallback;", "a", "c", "", "play", "handleError", "handleFileNotExist", "pause", "", "position", "setPlayerPosition", "callback", "registerPlayerCallback", "unRegisterPlayerCallback", "onCleared", "Lcom/huami/devicerecorder/player/HMMusicPlayer;", "Lkotlin/Lazy;", "b", "()Lcom/huami/devicerecorder/player/HMMusicPlayer;", "player", "Lcom/huami/devicerecorder/model/PlayItemData;", "currentItem", "", "Ljava/util/List;", "callbacks", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", GoogleApiAvailabilityLight.a, "device-recorder_release"}, k = 1, mv = {1, 5, 1})
public final class RecorderPlayerViewModel extends AndroidViewModel implements IRecorderPlayer {

    @Deprecated
    @NotNull
    public static final String TAG = "PlayerViewModel";

    @NotNull
    private static final a d = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy player;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private PlayItemData currentItem;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final List<IRecorderPlayer.IPlayerCallback> callbacks;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/devicerecorder/player/RecorderPlayerViewModel$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + " find callback failed as record file is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + " find callback is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "release";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ PlayItemData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(PlayItemData playItemData) {
            super(0);
            this.a = playItemData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "pause " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ PlayItemData a;
        public final /* synthetic */ RecorderPlayerViewModel b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(PlayItemData playItemData, RecorderPlayerViewModel recorderPlayerViewModel) {
            super(0);
            this.a = playItemData;
            this.b = recorderPlayerViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "pause " + this.a + " failed as current file is " + this.b.currentItem;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ PlayItemData a;
        public final /* synthetic */ PlayItemData b;
        public final /* synthetic */ Ref.BooleanRef c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(PlayItemData playItemData, PlayItemData playItemData2, Ref.BooleanRef booleanRef) {
            super(0);
            this.a = playItemData;
            this.b = playItemData2;
            this.c = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "play " + this.a + " and pre is " + this.b + "; and play result: " + this.c.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.devicerecorder.player.RecorderPlayerViewModel", f = "RecorderPlayerViewModel.kt", i = {0}, l = {149, 152}, m = "playRecordFile", n = {"item"}, s = {"L$0"})
    public static final class h extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return RecorderPlayerViewModel.this.c(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/devicerecorder/player/HMMusicPlayer;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<HMMusicPlayer> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMMusicPlayer invoke() {
            return new HMMusicPlayer();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ PlayItemData b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i, PlayItemData playItemData) {
            super(0);
            this.a = i;
            this.b = playItemData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "setPosition " + this.a + " to " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ PlayItemData a;
        public final /* synthetic */ RecorderPlayerViewModel b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(PlayItemData playItemData, RecorderPlayerViewModel recorderPlayerViewModel) {
            super(0);
            this.a = playItemData;
            this.b = recorderPlayerViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return " " + this.a + " setPlayerPosition failed as current file is " + this.b.currentItem;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.devicerecorder.player.RecorderPlayerViewModel", f = "RecorderPlayerViewModel.kt", i = {0, 0}, l = {92}, m = Command.STOP, n = {"this", "curItem"}, s = {"L$0", "L$1"})
    public static final class l extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return RecorderPlayerViewModel.this.e(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public static final m a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "stop record failed";
        }
    }

    public RecorderPlayerViewModel(@NotNull Application application) {
        super(application);
        this.player = LazyKt__LazyJVMKt.lazy(i.a);
        this.callbacks = new ArrayList();
        b().setCallback(new IPlayer.IPlayerCallback() { // from class: com.huami.devicerecorder.player.RecorderPlayerViewModel.1

            /* JADX INFO: renamed from: com.huami.devicerecorder.player.RecorderPlayerViewModel$1$WhenMappings */
            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[IPlayer.PlayerStatus.values().length];
                    iArr[IPlayer.PlayerStatus.STATUS_COMPLETE.ordinal()] = 1;
                    iArr[IPlayer.PlayerStatus.STATUS_ERROR.ordinal()] = 2;
                    iArr[IPlayer.PlayerStatus.STATUS_FILE_NOT_EXIST.ordinal()] = 3;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX INFO: renamed from: com.huami.devicerecorder.player.RecorderPlayerViewModel$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "update position failed, as current record file is null";
                }
            }

            /* JADX INFO: renamed from: com.huami.devicerecorder.player.RecorderPlayerViewModel$1$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public static final b a = new b();

                public b() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "onStatusChanged failed as record file is null";
                }
            }

            @Override // com.huami.devicerecorder.player.IPlayer.IPlayerCallback
            public void onPositionChanged(int position, int duration) {
                PlayItemData playItemData = RecorderPlayerViewModel.this.currentItem;
                if (playItemData == null) {
                    HMLog.info(RecorderPlayerViewModel.TAG, a.a);
                    return;
                }
                IRecorderPlayer.IPlayerCallback iPlayerCallbackA = RecorderPlayerViewModel.this.a(playItemData, "progress");
                if (iPlayerCallbackA == null) {
                    return;
                }
                iPlayerCallbackA.onProgressChanged(playItemData, position, duration);
            }

            @Override // com.huami.devicerecorder.player.IPlayer.IPlayerCallback
            public void onStatusChanged(@NotNull IPlayer.PlayerStatus status) {
                PlayItemData playItemData = RecorderPlayerViewModel.this.currentItem;
                if (playItemData == null) {
                    HMLog.info(RecorderPlayerViewModel.TAG, b.a);
                    return;
                }
                int i2 = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
                if (i2 == 1) {
                    kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(RecorderPlayerViewModel.this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new RecorderPlayerViewModel$1$onStatusChanged$$inlined$safeLaunch$1(null, RecorderPlayerViewModel.this, playItemData), 2, null);
                    return;
                }
                if (i2 == 2) {
                    RecorderPlayerViewModel.this.handleError(playItemData);
                } else {
                    if (i2 != 3) {
                        return;
                    }
                    RecorderPlayerViewModel.this.handleFileNotExist(playItemData);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IRecorderPlayer.IPlayerCallback a(PlayItemData item, String tag) {
        Object obj = null;
        if (item == null) {
            HMLog.info(TAG, new b(tag));
            return null;
        }
        for (Object obj2 : this.callbacks) {
            if (((IRecorderPlayer.IPlayerCallback) obj2).needNotifyAbout(item)) {
                obj = obj2;
                break;
            }
        }
        IRecorderPlayer.IPlayerCallback iPlayerCallback = (IRecorderPlayer.IPlayerCallback) obj;
        if (iPlayerCallback == null) {
            HMLog.info(TAG, new c(tag));
        }
        return iPlayerCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMMusicPlayer b() {
        return (HMMusicPlayer) this.player.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(PlayItemData playItemData, Continuation<? super Boolean> continuation) {
        h hVar;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i2 = hVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.d = i2 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        Object objPlay = hVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = hVar.d;
        boolean zBooleanValue = false;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objPlay);
            AssetFileDescriptor fileDescriptor = playItemData.getRecordFile().getFileDescriptor();
            String localPath = playItemData.getRecordFile().getLocalPath();
            if (fileDescriptor == null) {
                if (localPath.length() == 0) {
                    handleFileNotExist(playItemData);
                    return Boxing.boxBoolean(false);
                }
            }
            if (playItemData.getRecordFile().getLocalPath().length() > 0) {
                HMMusicPlayer hMMusicPlayerB = b();
                String localPath2 = playItemData.getRecordFile().getLocalPath();
                hVar.a = playItemData;
                hVar.d = 1;
                objPlay = hMMusicPlayerB.play(localPath2, hVar);
                if (objPlay == coroutine_suspended) {
                    return coroutine_suspended;
                }
                zBooleanValue = ((Boolean) objPlay).booleanValue();
                playItemData.setPlaying(zBooleanValue);
            } else if (fileDescriptor != null) {
                HMMusicPlayer hMMusicPlayerB2 = b();
                hVar.d = 2;
                objPlay = hMMusicPlayerB2.play(fileDescriptor, hVar);
                if (objPlay == coroutine_suspended) {
                    return coroutine_suspended;
                }
                zBooleanValue = ((Boolean) objPlay).booleanValue();
            }
        } else if (i3 == 1) {
            playItemData = (PlayItemData) hVar.a;
            ResultKt.throwOnFailure(objPlay);
            zBooleanValue = ((Boolean) objPlay).booleanValue();
            playItemData.setPlaying(zBooleanValue);
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objPlay);
            zBooleanValue = ((Boolean) objPlay).booleanValue();
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(PlayItemData playItemData, Continuation<? super Boolean> continuation) {
        l lVar;
        RecorderPlayerViewModel recorderPlayerViewModel;
        PlayItemData playItemData2;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i2 = lVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.e = i2 - Integer.MIN_VALUE;
            } else {
                lVar = new l(continuation);
            }
        } else {
            lVar = new l(continuation);
        }
        Object obj = lVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = lVar.e;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            PlayItemData playItemData3 = this.currentItem;
            if (!Intrinsics.areEqual(playItemData3, playItemData)) {
                return Boxing.boxBoolean(false);
            }
            HMMusicPlayer hMMusicPlayerB = b();
            lVar.a = this;
            lVar.b = playItemData3;
            lVar.e = 1;
            Object objStop = hMMusicPlayerB.stop(lVar);
            if (objStop == coroutine_suspended) {
                return coroutine_suspended;
            }
            recorderPlayerViewModel = this;
            obj = objStop;
            playItemData2 = playItemData3;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            playItemData2 = (PlayItemData) lVar.b;
            recorderPlayerViewModel = (RecorderPlayerViewModel) lVar.a;
            ResultKt.throwOnFailure(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            HMLog.info(TAG, m.a);
            return Boxing.boxBoolean(false);
        }
        IRecorderPlayer.IPlayerCallback iPlayerCallbackA = recorderPlayerViewModel.a(playItemData2, Command.STOP);
        playItemData2.setPlaying(false);
        playItemData2.setPosition(0);
        recorderPlayerViewModel.currentItem = null;
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(recorderPlayerViewModel), ExtKt.getExceptionHandler().plus(Dispatchers.getMain()), null, new RecorderPlayerViewModel$stop$$inlined$safeLaunch$1(null, iPlayerCallbackA, playItemData2), 2, null);
        return Boxing.boxBoolean(true);
    }

    public final void handleError(@NotNull PlayItemData item) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getMain()), null, new RecorderPlayerViewModel$handleError$$inlined$safeLaunch$1(null, item, this), 2, null);
    }

    public final void handleFileNotExist(@NotNull PlayItemData item) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getMain()), null, new RecorderPlayerViewModel$handleFileNotExist$$inlined$safeLaunch$1(null, item, this), 2, null);
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        HMLog.info(TAG, d.a);
        b().release();
        this.currentItem = null;
        synchronized (this.callbacks) {
            this.callbacks.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.huami.devicerecorder.player.IRecorderPlayer
    public void pause(@NotNull PlayItemData item) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new RecorderPlayerViewModel$pause$$inlined$safeLaunch$1(null, this, item), 2, null);
    }

    @Override // com.huami.devicerecorder.player.IRecorderPlayer
    public void play(@NotNull PlayItemData item) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new RecorderPlayerViewModel$play$$inlined$safeLaunch$1(null, this, item), 2, null);
    }

    @Override // com.huami.devicerecorder.player.IRecorderPlayer
    public void registerPlayerCallback(@NotNull IRecorderPlayer.IPlayerCallback callback) {
        synchronized (this.callbacks) {
            if (!this.callbacks.contains(callback)) {
                callback.injectPlayer(this);
                this.callbacks.add(callback);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.huami.devicerecorder.player.IRecorderPlayer
    public void setPlayerPosition(@NotNull PlayItemData item, int position) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new RecorderPlayerViewModel$setPlayerPosition$$inlined$safeLaunch$1(null, this, item, position), 2, null);
    }

    @Override // com.huami.devicerecorder.player.IRecorderPlayer
    public void unRegisterPlayerCallback(@NotNull IRecorderPlayer.IPlayerCallback callback) {
        synchronized (this.callbacks) {
            if (this.callbacks.contains(callback)) {
                this.callbacks.remove(callback);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
