package com.xiaomi.hm.health.bodyfat.slimming.viewmodel;

import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.slimming.repo.LoseWeightPlan;
import com.xiaomi.hm.health.bodyfat.slimming.repo.LoseWeightRepo;
import com.xiaomi.hm.health.bodyfat.slimming.repo.LoseWeightWeightInfo;
import com.xiaomi.hm.health.bodyfat.slimming.repo.PostResponseCallback;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/slimming/viewmodel/LoseWeightSelectSportViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightPlan;", "loseWeightPlan", "", "savePlan", "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightWeightInfo;", "loseWeightWeightInfo", "saveWeightInfo", "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightRepo;", "a", "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightRepo;", "loseWeightRepo", "<init>", "(Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightRepo;)V", "Companion", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class LoseWeightSelectSportViewModel extends ViewModel {

    @NotNull
    public static final String TAG = "LoseWeightSelectSportViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LoseWeightRepo loseWeightRepo;

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightSelectSportViewModel$savePlan$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightSelectSportViewModel$savePlan$1", f = "LoseWeightSelectSportViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ LoseWeightPlan c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LoseWeightPlan loseWeightPlan, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.c = loseWeightPlan;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LoseWeightSelectSportViewModel.this.new AnonymousClass1(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            LoseWeightSelectSportViewModel.this.loseWeightRepo.saveLoseWeightPlan(this.c, new PostResponseCallback() { // from class: com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightSelectSportViewModel.savePlan.1.1

                /* JADX INFO: renamed from: com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightSelectSportViewModel$savePlan$1$1$a */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public static final a a = new a();

                    public a() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "save lose weight plan to server failed";
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightSelectSportViewModel$savePlan$1$1$b */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class b extends Lambda implements Function0<String> {
                    public static final b a = new b();

                    public b() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "save lose weight plan to server success";
                    }
                }

                @Override // com.xiaomi.hm.health.bodyfat.slimming.repo.PostResponseCallback
                public void onPostFailure() {
                    HMLog.debug(LoseWeightSelectSportViewModel.TAG, a.a);
                }

                @Override // com.xiaomi.hm.health.bodyfat.slimming.repo.PostResponseCallback
                public void onPostSuccess() {
                    HMLog.debug(LoseWeightSelectSportViewModel.TAG, b.a);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightSelectSportViewModel$saveWeightInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightSelectSportViewModel$saveWeightInfo$1", f = "LoseWeightSelectSportViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15641 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ LoseWeightWeightInfo b;
        public final /* synthetic */ LoseWeightSelectSportViewModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15641(LoseWeightWeightInfo loseWeightWeightInfo, LoseWeightSelectSportViewModel loseWeightSelectSportViewModel, Continuation<? super C15641> continuation) {
            super(2, continuation);
            this.b = loseWeightWeightInfo;
            this.c = loseWeightSelectSportViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C15641(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C15641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.b != null) {
                this.c.loseWeightRepo.saveLoseWeightWeightInfo(this.b, new PostResponseCallback() { // from class: com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightSelectSportViewModel.saveWeightInfo.1.1

                    /* JADX INFO: renamed from: com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightSelectSportViewModel$saveWeightInfo$1$1$a */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class a extends Lambda implements Function0<String> {
                        public static final a a = new a();

                        public a() {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            return "save lose weight info to server failed";
                        }
                    }

                    /* JADX INFO: renamed from: com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightSelectSportViewModel$saveWeightInfo$1$1$b */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class b extends Lambda implements Function0<String> {
                        public static final b a = new b();

                        public b() {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            return "save lose weight info to server success";
                        }
                    }

                    @Override // com.xiaomi.hm.health.bodyfat.slimming.repo.PostResponseCallback
                    public void onPostFailure() {
                        HMLog.debug(LoseWeightSelectSportViewModel.TAG, a.a);
                    }

                    @Override // com.xiaomi.hm.health.bodyfat.slimming.repo.PostResponseCallback
                    public void onPostSuccess() {
                        HMLog.debug(LoseWeightSelectSportViewModel.TAG, b.a);
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    public LoseWeightSelectSportViewModel(@NotNull LoseWeightRepo loseWeightRepo) {
        this.loseWeightRepo = loseWeightRepo;
    }

    public final void savePlan(@NotNull LoseWeightPlan loseWeightPlan) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(loseWeightPlan, null), 2, null);
    }

    public final void saveWeightInfo(@Nullable LoseWeightWeightInfo loseWeightWeightInfo) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C15641(loseWeightWeightInfo, this, null), 2, null);
    }
}
