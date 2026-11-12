package com.huami.sleep.viewmodel.breathquality;

import android.content.Context;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.huami.sleep.repo.IBreathQualityRepo;
import com.huami.sleep.vo.BreathQualityDayScoreVo;
import com.huami.snore.core.ext.KoinExtKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/sleep/viewmodel/breathquality/BreathQualityDayScoreViewModel;", "Landroidx/lifecycle/ViewModel;", "", "userId", "", "timeStamp", "", "getScoreShowData", "Lcom/huami/sleep/repo/IBreathQualityRepo;", "a", "Lcom/huami/sleep/repo/IBreathQualityRepo;", "getRepo", "()Lcom/huami/sleep/repo/IBreathQualityRepo;", CommonLanguageSettingFragment.KEY_REPO, "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/sleep/vo/BreathQualityDayScoreVo;", "b", "Lkotlin/Lazy;", "getScoreShowLifeData", "()Landroidx/lifecycle/MutableLiveData;", "scoreShowLifeData", "<init>", "(Lcom/huami/sleep/repo/IBreathQualityRepo;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class BreathQualityDayScoreViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IBreathQualityRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy scoreShowLifeData = LazyKt__LazyJVMKt.lazy(b.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.viewmodel.breathquality.BreathQualityDayScoreViewModel$getScoreShowData$1", f = "BreathQualityDayScoreViewModel.kt", i = {}, l = {26, 26}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ long d;

        /* JADX INFO: renamed from: com.huami.sleep.viewmodel.breathquality.BreathQualityDayScoreViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/huami/sleep/vo/BreathQualityDayScoreVo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleep.viewmodel.breathquality.BreathQualityDayScoreViewModel$getScoreShowData$1$1", f = "BreathQualityDayScoreViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0589a extends SuspendLambda implements Function2<BreathQualityDayScoreVo, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ BreathQualityDayScoreViewModel c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0589a(BreathQualityDayScoreViewModel breathQualityDayScoreViewModel, Continuation<? super C0589a> continuation) {
                super(2, continuation);
                this.c = breathQualityDayScoreViewModel;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull BreathQualityDayScoreVo breathQualityDayScoreVo, @Nullable Continuation<? super Unit> continuation) {
                return ((C0589a) create(breathQualityDayScoreVo, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0589a c0589a = new C0589a(this.c, continuation);
                c0589a.b = obj;
                return c0589a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.c.getScoreShowLifeData().postValue((BreathQualityDayScoreVo) this.b);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, long j, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BreathQualityDayScoreViewModel.this.new a(this.c, this.d, continuation);
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
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            IBreathQualityRepo repo = BreathQualityDayScoreViewModel.this.getRepo();
            Context appContext = KoinExtKt.getAppContext();
            String str = this.c;
            long j = this.d;
            this.a = 1;
            obj = repo.getDayScoreShowInfo(appContext, str, j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            C0589a c0589a = new C0589a(BreathQualityDayScoreViewModel.this, null);
            this.a = 2;
            if (FlowKt.collectLatest((Flow) obj, c0589a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/sleep/vo/BreathQualityDayScoreVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<MutableLiveData<BreathQualityDayScoreVo>> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<BreathQualityDayScoreVo> invoke() {
            return new MutableLiveData<>();
        }
    }

    public BreathQualityDayScoreViewModel(@NotNull IBreathQualityRepo iBreathQualityRepo) {
        this.repo = iBreathQualityRepo;
    }

    @NotNull
    public final IBreathQualityRepo getRepo() {
        return this.repo;
    }

    public final void getScoreShowData(@NotNull String userId, long timeStamp) {
        e.f(ViewModelKt.getViewModelScope(this), null, null, new a(userId, timeStamp, null), 3, null);
    }

    @NotNull
    public final MutableLiveData<BreathQualityDayScoreVo> getScoreShowLifeData() {
        return (MutableLiveData) this.scoreShowLifeData.getValue();
    }
}
