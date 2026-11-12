package com.xiaomi.fitness.userinfo.information;

import android.text.TextUtils;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.training_plan_export.manager.ITrainingManager;
import com.xiaomi.fitness.training_plan_export.manager.TrainingManagerExtKt;
import defpackage.o1j;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.userinfo.information.UserIndicatorsActivity$handleAbilityCreatePlan$2$1", f = "UserIndicatorsActivity.kt", i = {}, l = {523}, m = "invokeSuspend", n = {}, s = {})
public final class UserIndicatorsActivity$handleAbilityCreatePlan$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UserIndicatorsActivity this$0;

    /* JADX INFO: renamed from: com.xiaomi.fitness.userinfo.information.UserIndicatorsActivity$handleAbilityCreatePlan$2$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.userinfo.information.UserIndicatorsActivity$handleAbilityCreatePlan$2$1$1", f = "UserIndicatorsActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ UserIndicatorsActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UserIndicatorsActivity userIndicatorsActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = userIndicatorsActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.showLoading(o1j.l, false);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.userinfo.information.UserIndicatorsActivity$handleAbilityCreatePlan$2$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.userinfo.information.UserIndicatorsActivity$handleAbilityCreatePlan$2$1$2", f = "UserIndicatorsActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $confirmResult;
        int label;
        final /* synthetic */ UserIndicatorsActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UserIndicatorsActivity userIndicatorsActivity, boolean z, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = userIndicatorsActivity;
            this.$confirmResult = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$confirmResult, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.dismissDialog();
            if (this.$confirmResult) {
                TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE).launchAbilityPlanQuestionPage(this.this$0);
            } else {
                ToastUtil.INSTANCE.showToast(o1j.m);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserIndicatorsActivity$handleAbilityCreatePlan$2$1(UserIndicatorsActivity userIndicatorsActivity, Continuation<? super UserIndicatorsActivity$handleAbilityCreatePlan$2$1> continuation) {
        super(2, continuation);
        this.this$0 = userIndicatorsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserIndicatorsActivity$handleAbilityCreatePlan$2$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String sex = UserInfoManager.getUserProfile$default(UserIndicatorsActivity.access$getMViewModel(this.this$0).getMUserInfoManager(), false, 1, null).getSex();
            if (TextUtils.isEmpty(sex)) {
                ToastUtil.INSTANCE.showToast(o1j.j1);
                return Unit.INSTANCE;
            }
            int i2 = (sex == null || !sex.equals("female")) ? 1 : 2;
            if (UserInfoManager.getUserProfile$default(UserIndicatorsActivity.access$getMViewModel(this.this$0).getMUserInfoManager(), false, 1, null).getHeight() == 0.0f) {
                ToastUtil.INSTANCE.showToast(o1j.j1);
                return Unit.INSTANCE;
            }
            float height = UserInfoManager.getUserProfile$default(UserIndicatorsActivity.access$getMViewModel(this.this$0).getMUserInfoManager(), false, 1, null).getHeight();
            if (UserInfoManager.getUserProfile$default(UserIndicatorsActivity.access$getMViewModel(this.this$0).getMUserInfoManager(), false, 1, null).getWeight() == 0.0f) {
                ToastUtil.INSTANCE.showToast(o1j.j1);
                return Unit.INSTANCE;
            }
            float weight = UserInfoManager.getUserProfile$default(UserIndicatorsActivity.access$getMViewModel(this.this$0).getMUserInfoManager(), false, 1, null).getWeight();
            if (TextUtils.isEmpty(UserInfoManager.getUserProfile$default(UserIndicatorsActivity.access$getMViewModel(this.this$0).getMUserInfoManager(), false, 1, null).getBirth())) {
                ToastUtil.INSTANCE.showToast(o1j.j1);
                return Unit.INSTANCE;
            }
            AnyExtKt.main$default(null, new AnonymousClass1(this.this$0, null), 1, null);
            ITrainingManager trainingManagerExtKt = TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE);
            String string = new LocalDate(UserIndicatorsActivity.access$getMViewModel(this.this$0).birthStringToMillis()).toString("yyyy-MM-dd");
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            this.label = 1;
            obj = trainingManagerExtKt.confirmUserInfo(i2, string, (int) height, (int) weight, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        AnyExtKt.main$default(null, new AnonymousClass2(this.this$0, ((Boolean) obj).booleanValue(), null), 1, null);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UserIndicatorsActivity$handleAbilityCreatePlan$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
