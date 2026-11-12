package com.xiaomi.fitness.training_plan_export.utils;

import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.export.MedalManagerExtKt;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import defpackage.joi;
import defpackage.m1j;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bJ\u001e\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/utils/TrainingPopMedalUtils;", "", "<init>", "()V", "TAG", "", "showHabitFirstTrainingPop", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "dismissCallBack", "Lkotlin/Function0;", "showTrainingFinishedPop", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrainingPopMedalUtils {

    @NotNull
    public static final TrainingPopMedalUtils INSTANCE = new TrainingPopMedalUtils();

    @NotNull
    private static final String TAG = "TrainingPopMedalUtils";

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan_export.utils.TrainingPopMedalUtils$showHabitFirstTrainingPop$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan_export.utils.TrainingPopMedalUtils$showHabitFirstTrainingPop$1", f = "TrainingPopMedalUtils.kt", i = {}, l = {23, 24}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ Function0<Unit> $dismissCallBack;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan_export.utils.TrainingPopMedalUtils$showHabitFirstTrainingPop$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.training_plan_export.utils.TrainingPopMedalUtils$showHabitFirstTrainingPop$1$1", f = "TrainingPopMedalUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C08021 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ FragmentActivity $activity;
            final /* synthetic */ Function0<Unit> $dismissCallBack;
            final /* synthetic */ AccountCoreInfo $userInfo;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08021(FragmentActivity fragmentActivity, Function0<Unit> function0, AccountCoreInfo accountCoreInfo, Continuation<? super C08021> continuation) {
                super(2, continuation);
                this.$activity = fragmentActivity;
                this.$dismissCallBack = function0;
                this.$userInfo = accountCoreInfo;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08021(this.$activity, this.$dismissCallBack, this.$userInfo, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String userName;
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                MedalManager medalManagerExtKt = MedalManagerExtKt.getInstance(MedalManager.INSTANCE);
                FragmentActivity fragmentActivity = this.$activity;
                int i = joi.l;
                String string = ResourceExtKt.getString(m1j.n);
                Function0<Unit> function0 = this.$dismissCallBack;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string2 = ResourceExtKt.getString(m1j.o);
                Object[] objArr = new Object[1];
                AccountCoreInfo accountCoreInfo = this.$userInfo;
                if (accountCoreInfo == null || (userName = accountCoreInfo.getUserName()) == null) {
                    userName = "";
                }
                objArr[0] = userName;
                String str = String.format(string2, Arrays.copyOf(objArr, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                medalManagerExtKt.showTrainingPopMedal(fragmentActivity, i, string, function0, str);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C08021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FragmentActivity fragmentActivity, Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$activity = fragmentActivity;
            this.$dismissCallBack = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$activity, this.$dismissCallBack, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
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
            UserInfoManager accountManagerExtKt = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE);
            this.label = 1;
            obj = accountManagerExtKt.getMiAccountCoreInfo(true, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C08021 c08021 = new C08021(this.$activity, this.$dismissCallBack, (AccountCoreInfo) obj, null);
            this.label = 2;
            if (BuildersKt.withContext(main, c08021, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private TrainingPopMedalUtils() {
    }

    public final void showHabitFirstTrainingPop(@NotNull FragmentActivity activity, @Nullable Function0<Unit> dismissCallBack) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        ScopeExtKt.scope(Dispatchers.getIO(), new AnonymousClass1(activity, dismissCallBack, null));
    }

    public final void showTrainingFinishedPop(@NotNull FragmentActivity activity, @Nullable Function0<Unit> dismissCallBack) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        MedalManagerExtKt.getInstance(MedalManager.INSTANCE).showTrainingFinishPop(activity, ResourceExtKt.getString(m1j.l), dismissCallBack);
    }
}
