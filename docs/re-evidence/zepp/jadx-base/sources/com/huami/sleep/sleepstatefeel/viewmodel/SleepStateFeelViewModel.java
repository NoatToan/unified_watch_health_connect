package com.huami.sleep.sleepstatefeel.viewmodel;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleep.sleepstatefeel.repo.ISleepStateFeelRepo;
import com.huami.sleep.sleepstatefeel.repo.SleepStateFeelProvider;
import com.huami.sleep.sleepstatefeel.vo.SleepStateFeelVo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b/\u00100J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\t\u001a\u00020\u00042\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0006j\b\u0012\u0004\u0012\u00020\u0002`\u0007R\u0019\u0010\u000f\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R)\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0006j\b\u0012\u0004\u0012\u00020\u0017`\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR)\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0006j\b\u0012\u0004\u0012\u00020\u0017`\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR#\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020 8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R!\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020&8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R3\u0010.\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u00070&8\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*¨\u00061"}, d2 = {"Lcom/huami/sleep/sleepstatefeel/viewmodel/SleepStateFeelViewModel;", "Landroidx/lifecycle/ViewModel;", "", "feeling", "", "saveSelectFeeling", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "state", "saveSelectState", "Lcom/huami/sleep/sleepstatefeel/repo/ISleepStateFeelRepo;", "a", "Lcom/huami/sleep/sleepstatefeel/repo/ISleepStateFeelRepo;", "getRepo", "()Lcom/huami/sleep/sleepstatefeel/repo/ISleepStateFeelRepo;", CommonLanguageSettingFragment.KEY_REPO, "b", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "userId", "Lcom/huami/sleep/sleepstatefeel/vo/SleepStateFeelVo;", "c", "Ljava/util/ArrayList;", "getMSleepBehaviourData", "()Ljava/util/ArrayList;", "mSleepBehaviourData", GoogleApiAvailabilityLight.a, "getMSleepSleepData", "mSleepSleepData", "Landroidx/lifecycle/MutableLiveData;", "e", "Lkotlin/Lazy;", "getDateLiveData", "()Landroidx/lifecycle/MutableLiveData;", "dateLiveData", "Landroidx/lifecycle/LiveData;", "f", "Landroidx/lifecycle/LiveData;", "getEventSleepFeelingChange", "()Landroidx/lifecycle/LiveData;", "eventSleepFeelingChange", "g", "getEventSleepStateChange", "eventSleepStateChange", "<init>", "(Lcom/huami/sleep/sleepstatefeel/repo/ISleepStateFeelRepo;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepStateFeelViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ISleepStateFeelRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private String userId = "";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<SleepStateFeelVo> mSleepBehaviourData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<SleepStateFeelVo> mSleepSleepData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy dateLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> eventSleepFeelingChange;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LiveData<ArrayList<String>> eventSleepStateChange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<MutableLiveData<String>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<String> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.sleepstatefeel.viewmodel.SleepStateFeelViewModel$saveSelectFeeling$1", f = "SleepStateFeelViewModel.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleep.sleepstatefeel.viewmodel.SleepStateFeelViewModel$saveSelectFeeling$1$1", f = "SleepStateFeelViewModel.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SleepStateFeelViewModel b;
            public final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SleepStateFeelViewModel sleepStateFeelViewModel, String str, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = sleepStateFeelViewModel;
                this.c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ISleepStateFeelRepo repo = this.b.getRepo();
                    String userId = this.b.getUserId();
                    String value = this.b.getDateLiveData().getValue();
                    String str = this.c;
                    this.a = 1;
                    if (repo.saveSelectFeeling(userId, value, str, this) == coroutine_suspended) {
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
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SleepStateFeelViewModel.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(SleepStateFeelViewModel.this, this.c, null);
                this.a = 1;
                if (BuildersKt.withContext(io2, aVar, this) == coroutine_suspended) {
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
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.sleepstatefeel.viewmodel.SleepStateFeelViewModel$saveSelectState$1", f = "SleepStateFeelViewModel.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ArrayList<String> c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleep.sleepstatefeel.viewmodel.SleepStateFeelViewModel$saveSelectState$1$1", f = "SleepStateFeelViewModel.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SleepStateFeelViewModel b;
            public final /* synthetic */ ArrayList<String> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SleepStateFeelViewModel sleepStateFeelViewModel, ArrayList<String> arrayList, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = sleepStateFeelViewModel;
                this.c = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ISleepStateFeelRepo repo = this.b.getRepo();
                    String userId = this.b.getUserId();
                    String value = this.b.getDateLiveData().getValue();
                    ArrayList<String> arrayList = this.c;
                    this.a = 1;
                    if (repo.saveSelectState(userId, value, arrayList, this) == coroutine_suspended) {
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
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ArrayList<String> arrayList, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SleepStateFeelViewModel.this.new c(this.c, continuation);
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
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(SleepStateFeelViewModel.this, this.c, null);
                this.a = 1;
                if (BuildersKt.withContext(io2, aVar, this) == coroutine_suspended) {
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
    }

    public SleepStateFeelViewModel(@NotNull ISleepStateFeelRepo iSleepStateFeelRepo) {
        this.repo = iSleepStateFeelRepo;
        SleepStateFeelProvider sleepStateFeelProvider = SleepStateFeelProvider.INSTANCE;
        this.mSleepBehaviourData = sleepStateFeelProvider.getDefaultStates();
        this.mSleepSleepData = sleepStateFeelProvider.getDefaultFeels();
        this.dateLiveData = LazyKt__LazyJVMKt.lazy(a.a);
        this.eventSleepFeelingChange = Transformations.switchMap(getDateLiveData(), new Function<String, LiveData<String>>() { // from class: com.huami.sleep.sleepstatefeel.viewmodel.SleepStateFeelViewModel$special$$inlined$switchMap$1
            @Override // androidx.arch.core.util.Function
            @NotNull
            public final LiveData<String> apply(String str) {
                return this.a.getRepo().getDaySleepFeelingData(this.a.getUserId(), str);
            }
        });
        this.eventSleepStateChange = Transformations.switchMap(getDateLiveData(), new Function<String, LiveData<ArrayList<String>>>() { // from class: com.huami.sleep.sleepstatefeel.viewmodel.SleepStateFeelViewModel$special$$inlined$switchMap$2
            @Override // androidx.arch.core.util.Function
            @NotNull
            public final LiveData<ArrayList<String>> apply(String str) {
                return this.a.getRepo().getDaySleepStateData(this.a.getUserId(), str);
            }
        });
    }

    @NotNull
    public final MutableLiveData<String> getDateLiveData() {
        return (MutableLiveData) this.dateLiveData.getValue();
    }

    @NotNull
    public final LiveData<String> getEventSleepFeelingChange() {
        return this.eventSleepFeelingChange;
    }

    @NotNull
    public final LiveData<ArrayList<String>> getEventSleepStateChange() {
        return this.eventSleepStateChange;
    }

    @NotNull
    public final ArrayList<SleepStateFeelVo> getMSleepBehaviourData() {
        return this.mSleepBehaviourData;
    }

    @NotNull
    public final ArrayList<SleepStateFeelVo> getMSleepSleepData() {
        return this.mSleepSleepData;
    }

    @NotNull
    public final ISleepStateFeelRepo getRepo() {
        return this.repo;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public final void saveSelectFeeling(@NotNull String feeling) {
        e.f(ViewModelKt.getViewModelScope(this), null, null, new b(feeling, null), 3, null);
    }

    public final void saveSelectState(@NotNull ArrayList<String> state) {
        e.f(ViewModelKt.getViewModelScope(this), null, null, new c(state, null), 3, null);
    }

    public final void setUserId(@NotNull String str) {
        this.userId = str;
    }
}
