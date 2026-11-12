package com.huami.devicerecorder.player;

import androidx.p008lifecycle.ViewModelKt;
import com.huami.devicerecorder.model.ExtKt;
import com.huami.devicerecorder.model.PlayItemData;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/huami/devicerecorder/model/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.devicerecorder.player.RecorderPlayerViewModel$play$$inlined$safeLaunch$1", f = "RecorderPlayerViewModel.kt", i = {0, 0, 1, 1, 2, 2, 3, 3}, l = {66, 68, 72, 76}, m = "invokeSuspend", n = {"curItem", "playResult", "curItem", "playResult", "curItem", "playResult", "curItem", "playResult"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
public final class RecorderPlayerViewModel$play$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ RecorderPlayerViewModel c;
    public final /* synthetic */ PlayItemData d;
    public Object e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecorderPlayerViewModel$play$$inlined$safeLaunch$1(Continuation continuation, RecorderPlayerViewModel recorderPlayerViewModel, PlayItemData playItemData) {
        super(2, continuation);
        this.c = recorderPlayerViewModel;
        this.d = playItemData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        RecorderPlayerViewModel$play$$inlined$safeLaunch$1 recorderPlayerViewModel$play$$inlined$safeLaunch$1 = new RecorderPlayerViewModel$play$$inlined$safeLaunch$1(continuation, this.c, this.d);
        recorderPlayerViewModel$play$$inlined$safeLaunch$1.b = obj;
        return recorderPlayerViewModel$play$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((RecorderPlayerViewModel$play$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Ref.BooleanRef booleanRef;
        Ref.BooleanRef booleanRef2;
        PlayItemData playItemData;
        Ref.BooleanRef booleanRef3;
        PlayItemData playItemData2;
        Ref.BooleanRef booleanRef4;
        Ref.BooleanRef booleanRef5;
        Ref.BooleanRef booleanRef6;
        boolean z;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                Ref.BooleanRef booleanRef7 = (Ref.BooleanRef) this.f;
                Ref.BooleanRef booleanRef8 = (Ref.BooleanRef) this.e;
                playItemData2 = (PlayItemData) this.b;
                ResultKt.throwOnFailure(obj);
                booleanRef4 = booleanRef7;
                booleanRef = booleanRef8;
                booleanRef4.element = ((Boolean) obj).booleanValue();
                this.c.currentItem = this.d;
                if (booleanRef.element) {
                    RecorderPlayerViewModel recorderPlayerViewModel = this.c;
                    PlayItemData playItemData3 = this.d;
                    this.b = playItemData2;
                    this.e = booleanRef;
                    this.f = booleanRef;
                    this.a = 2;
                    obj = recorderPlayerViewModel.c(playItemData3, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    booleanRef6 = booleanRef;
                    playItemData = playItemData2;
                } else {
                    booleanRef5 = booleanRef;
                }
                booleanRef6 = booleanRef;
                playItemData = playItemData2;
                booleanRef = booleanRef5;
                z = false;
                booleanRef6.element = z;
            } else if (i == 2) {
                booleanRef6 = (Ref.BooleanRef) this.f;
                booleanRef = (Ref.BooleanRef) this.e;
                playItemData = (PlayItemData) this.b;
                ResultKt.throwOnFailure(obj);
            } else if (i == 3) {
                booleanRef3 = (Ref.BooleanRef) this.f;
                booleanRef = (Ref.BooleanRef) this.e;
                playItemData = (PlayItemData) this.b;
                ResultKt.throwOnFailure(obj);
                booleanRef3.element = ((Boolean) obj).booleanValue();
            } else {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef2 = (Ref.BooleanRef) this.f;
                booleanRef = (Ref.BooleanRef) this.e;
                playItemData = (PlayItemData) this.b;
                ResultKt.throwOnFailure(obj);
                booleanRef2.element = ((Boolean) obj).booleanValue();
            }
            if (((Boolean) obj).booleanValue()) {
                z = true;
            } else {
                booleanRef5 = booleanRef;
                playItemData2 = playItemData;
                booleanRef = booleanRef6;
                booleanRef6 = booleanRef;
                playItemData = playItemData2;
                booleanRef = booleanRef5;
                z = false;
            }
            booleanRef6.element = z;
        } else {
            ResultKt.throwOnFailure(obj);
            PlayItemData playItemData4 = this.c.currentItem;
            booleanRef = new Ref.BooleanRef();
            if (!Intrinsics.areEqual(this.d, playItemData4) && playItemData4 != null) {
                RecorderPlayerViewModel recorderPlayerViewModel2 = this.c;
                this.b = playItemData4;
                this.e = booleanRef;
                this.f = booleanRef;
                this.a = 1;
                Object objE = recorderPlayerViewModel2.e(playItemData4, this);
                if (objE == coroutine_suspended) {
                    return coroutine_suspended;
                }
                playItemData2 = playItemData4;
                obj = objE;
                booleanRef4 = booleanRef;
                booleanRef4.element = ((Boolean) obj).booleanValue();
                this.c.currentItem = this.d;
                if (booleanRef.element) {
                    RecorderPlayerViewModel recorderPlayerViewModel3 = this.c;
                    PlayItemData playItemData5 = this.d;
                    this.b = playItemData2;
                    this.e = booleanRef;
                    this.f = booleanRef;
                    this.a = 2;
                    obj = recorderPlayerViewModel3.c(playItemData5, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    booleanRef6 = booleanRef;
                    playItemData = playItemData2;
                    if (((Boolean) obj).booleanValue()) {
                        z = true;
                    } else {
                        booleanRef5 = booleanRef;
                        playItemData2 = playItemData;
                        booleanRef = booleanRef6;
                    }
                    booleanRef6.element = z;
                } else {
                    booleanRef5 = booleanRef;
                }
                booleanRef6 = booleanRef;
                playItemData = playItemData2;
                booleanRef = booleanRef5;
                z = false;
                booleanRef6.element = z;
            } else if (Intrinsics.areEqual(this.d, playItemData4)) {
                this.c.currentItem = this.d;
                HMMusicPlayer hMMusicPlayerB = this.c.b();
                this.b = playItemData4;
                this.e = booleanRef;
                this.f = booleanRef;
                this.a = 3;
                Object objResume = hMMusicPlayerB.resume(this);
                if (objResume == coroutine_suspended) {
                    return coroutine_suspended;
                }
                booleanRef3 = booleanRef;
                playItemData = playItemData4;
                obj = objResume;
                booleanRef3.element = ((Boolean) obj).booleanValue();
            } else {
                this.c.currentItem = this.d;
                RecorderPlayerViewModel recorderPlayerViewModel4 = this.c;
                PlayItemData playItemData6 = this.d;
                this.b = playItemData4;
                this.e = booleanRef;
                this.f = booleanRef;
                this.a = 4;
                Object objC = recorderPlayerViewModel4.c(playItemData6, this);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
                booleanRef2 = booleanRef;
                playItemData = playItemData4;
                obj = objC;
                booleanRef2.element = ((Boolean) obj).booleanValue();
            }
        }
        HMLog.info(RecorderPlayerViewModel.TAG, new RecorderPlayerViewModel.g(this.d, playItemData, booleanRef));
        if (booleanRef.element) {
            this.d.setPlaying(true);
            IRecorderPlayer.IPlayerCallback iPlayerCallbackA = this.c.a(this.d, "play");
            e.f(ViewModelKt.getViewModelScope(this.c), ExtKt.getExceptionHandler().plus(Dispatchers.getMain()), null, new RecorderPlayerViewModel$play$lambda1$$inlined$safeLaunch$1(null, iPlayerCallbackA, this.d), 2, null);
        } else {
            this.c.currentItem = null;
        }
        return Unit.INSTANCE;
    }
}
