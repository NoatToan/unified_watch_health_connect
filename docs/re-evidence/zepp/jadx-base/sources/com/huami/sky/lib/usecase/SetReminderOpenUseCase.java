package com.huami.sky.lib.usecase;

import com.huami.sky.lib.entity.SleepReminderInfo;
import com.huami.sky.lib.repo.reminder.ISleepReminderRepo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086Bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/huami/sky/lib/usecase/SetReminderOpenUseCase;", "", "", "isOpen", "", "invoke", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/sky/lib/repo/reminder/ISleepReminderRepo;", "a", "Lcom/huami/sky/lib/repo/reminder/ISleepReminderRepo;", "getRepo", "()Lcom/huami/sky/lib/repo/reminder/ISleepReminderRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lkotlinx/coroutines/CoroutineDispatcher;", "b", "Lkotlinx/coroutines/CoroutineDispatcher;", "defaultDispatcher", "<init>", "(Lcom/huami/sky/lib/repo/reminder/ISleepReminderRepo;Lkotlinx/coroutines/CoroutineDispatcher;)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class SetReminderOpenUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ISleepReminderRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CoroutineDispatcher defaultDispatcher;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.lib.usecase.SetReminderOpenUseCase$invoke$2", f = "SetReminderOpenUseCase.kt", i = {}, l = {25, 28}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SetReminderOpenUseCase.this.new a(this.c, continuation);
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
            ISleepReminderRepo repo = SetReminderOpenUseCase.this.getRepo();
            this.a = 1;
            obj = repo.getSleepReminderInfo(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            boolean z = this.c;
            SetReminderOpenUseCase setReminderOpenUseCase = SetReminderOpenUseCase.this;
            SleepReminderInfo sleepReminderInfo = (SleepReminderInfo) obj;
            SleepReminderInfo sleepReminderInfo2 = new SleepReminderInfo(z ? 1 : 0, sleepReminderInfo.getDays(), sleepReminderInfo.getTime());
            ISleepReminderRepo repo2 = setReminderOpenUseCase.getRepo();
            this.a = 2;
            if (repo2.saveSleepReminderToServer(sleepReminderInfo2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public SetReminderOpenUseCase(@NotNull ISleepReminderRepo iSleepReminderRepo, @NotNull CoroutineDispatcher coroutineDispatcher) {
        this.repo = iSleepReminderRepo;
        this.defaultDispatcher = coroutineDispatcher;
    }

    @NotNull
    public final ISleepReminderRepo getRepo() {
        return this.repo;
    }

    @Nullable
    public final Object invoke(boolean z, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objWithContext = BuildersKt.withContext(this.defaultDispatcher, new a(z, null), continuation);
        return objWithContext == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public /* synthetic */ SetReminderOpenUseCase(ISleepReminderRepo iSleepReminderRepo, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iSleepReminderRepo, (i & 2) != 0 ? Dispatchers.getDefault() : coroutineDispatcher);
    }
}
