package com.huami.sleep.sleepedit.viewmodel;

import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.facebook.appevents.UserDataStore;
import com.huami.sleep.sleepedit.repo.ISleepEditRepo;
import com.huami.sleep.statistic.dto.TimeMode;
import com.huami.sleep.util.SleepTimeUtil;
import com.huami.sleep.util.TimeShowUtilsKt;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rR\u0019\u0010\u0015\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/sleep/sleepedit/viewmodel/SleepEditViewModel;", "Landroidx/lifecycle/ViewModel;", "", "userId", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "sleepInfo", "", UserDataStore.STATE, "sp", "Lcom/xiaomi/hm/health/dataprocess/SportDay;", "day", "", "saveEditInfo", "", "position", "getSportDayByIndex", "Lcom/huami/sleep/sleepedit/repo/ISleepEditRepo;", "a", "Lcom/huami/sleep/sleepedit/repo/ISleepEditRepo;", "getRepo", "()Lcom/huami/sleep/sleepedit/repo/ISleepEditRepo;", CommonLanguageSettingFragment.KEY_REPO, "<init>", "(Lcom/huami/sleep/sleepedit/repo/ISleepEditRepo;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepEditViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ISleepEditRepo repo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.sleepedit.viewmodel.SleepEditViewModel$saveEditInfo$1", f = "SleepEditViewModel.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ SleepInfo d;
        public final /* synthetic */ long e;
        public final /* synthetic */ long f;
        public final /* synthetic */ SportDay g;

        /* JADX INFO: renamed from: com.huami.sleep.sleepedit.viewmodel.SleepEditViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleep.sleepedit.viewmodel.SleepEditViewModel$saveEditInfo$1$1", f = "SleepEditViewModel.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0584a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SleepEditViewModel b;
            public final /* synthetic */ String c;
            public final /* synthetic */ SleepInfo d;
            public final /* synthetic */ long e;
            public final /* synthetic */ long f;
            public final /* synthetic */ SportDay g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0584a(SleepEditViewModel sleepEditViewModel, String str, SleepInfo sleepInfo, long j, long j2, SportDay sportDay, Continuation<? super C0584a> continuation) {
                super(2, continuation);
                this.b = sleepEditViewModel;
                this.c = str;
                this.d = sleepInfo;
                this.e = j;
                this.f = j2;
                this.g = sportDay;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0584a(this.b, this.c, this.d, this.e, this.f, this.g, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0584a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ISleepEditRepo repo = this.b.getRepo();
                    String str = this.c;
                    SleepInfo sleepInfo = this.d;
                    long j = this.e;
                    long j2 = this.f;
                    SportDay sportDay = this.g;
                    this.a = 1;
                    if (repo.saveEditSleep(str, sleepInfo, j, j2, sportDay, this) == coroutine_suspended) {
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
        public a(String str, SleepInfo sleepInfo, long j, long j2, SportDay sportDay, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = sleepInfo;
            this.e = j;
            this.f = j2;
            this.g = sportDay;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SleepEditViewModel.this.new a(this.c, this.d, this.e, this.f, this.g, continuation);
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
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C0584a c0584a = new C0584a(SleepEditViewModel.this, this.c, this.d, this.e, this.f, this.g, null);
                this.a = 1;
                if (BuildersKt.withContext(io2, c0584a, this) == coroutine_suspended) {
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

    public SleepEditViewModel(@NotNull ISleepEditRepo iSleepEditRepo) {
        this.repo = iSleepEditRepo;
    }

    @NotNull
    public final ISleepEditRepo getRepo() {
        return this.repo;
    }

    @NotNull
    public final SportDay getSportDayByIndex(int position) {
        return SportDay.fromString(TimeShowUtilsKt.toDateString(SleepTimeUtil.INSTANCE.getTimeFromRegisterDay(position, TimeMode.DAY)));
    }

    public final void saveEditInfo(@NotNull String userId, @NotNull SleepInfo sleepInfo, long st, long sp, @NotNull SportDay day) {
        e.f(ViewModelKt.getViewModelScope(this), null, null, new a(userId, sleepInfo, st, sp, day, null), 3, null);
    }
}
