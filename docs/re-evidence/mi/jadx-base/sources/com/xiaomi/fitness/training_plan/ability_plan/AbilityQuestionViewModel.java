package com.xiaomi.fitness.training_plan.ability_plan;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.device.manager.internal.extetions.LogExtKt;
import com.xiaomi.fitness.training_plan.net.TrainingPlanRequest;
import com.xiaomi.fitness.training_plan.net.UserAbility;
import com.xiaomi.fitness.training_plan_export.model.Question;
import com.xiaomi.fitness.training_plan_export.model.QuestionOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\u000fJ,\u0010\u0010\u001a\u00020\u000f2\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R+\u0010\u0005\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/training_plan/ability_plan/AbilityQuestionViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/training_plan/ability_plan/AbilityQuestionModel;", "<init>", "()V", "questionInfo", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "", "Lcom/xiaomi/fitness/training_plan_export/model/Question;", "getQuestionInfo", "()Landroidx/lifecycle/MutableLiveData;", "trainingPlanRequest", "Lcom/xiaomi/fitness/training_plan/net/TrainingPlanRequest;", "", "fuseUserAbility", "questions", "userAbility", "Lcom/xiaomi/fitness/training_plan/net/UserAbility;", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAbilityQuestionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbilityQuestionViewModel.kt\ncom/xiaomi/fitness/training_plan/ability_plan/AbilityQuestionViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n774#2:76\n865#2,2:77\n1863#2,2:79\n774#2:81\n865#2,2:82\n1863#2,2:84\n774#2:86\n865#2,2:87\n1863#2,2:89\n*S KotlinDebug\n*F\n+ 1 AbilityQuestionViewModel.kt\ncom/xiaomi/fitness/training_plan/ability_plan/AbilityQuestionViewModel\n*L\n56#1:76\n56#1:77,2\n57#1:79,2\n61#1:81\n61#1:82,2\n62#1:84,2\n66#1:86\n66#1:87,2\n67#1:89,2\n*E\n"})
public final class AbilityQuestionViewModel extends BaseViewModel<AbilityQuestionModel> {

    @NotNull
    private static final String TAG = "AbilityQuestionViewModel";

    @NotNull
    private final MutableLiveData<Pair<Boolean, List<Question>>> questionInfo = new MutableLiveData<>();

    @NotNull
    private final TrainingPlanRequest trainingPlanRequest = new TrainingPlanRequest();

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.ability_plan.AbilityQuestionViewModel$getQuestionInfo$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.ability_plan.AbilityQuestionViewModel$getQuestionInfo$1", f = "AbilityQuestionViewModel.kt", i = {1}, l = {35, 36}, m = "invokeSuspend", n = {"result"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AbilityQuestionViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0051 A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:7:0x0012, B:23:0x004d, B:25:0x0051, B:27:0x0060, B:26:0x005b, B:13:0x0020, B:19:0x0038, B:16:0x0027), top: B:32:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x005b A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:7:0x0012, B:23:0x004d, B:25:0x0051, B:27:0x0060, B:26:0x005b, B:13:0x0020, B:19:0x0038, B:16:0x0027), top: B:32:0x0008 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Pair<Boolean, List<Question>> pair;
            UserAbility userAbility;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pair = (Pair) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    userAbility = (UserAbility) obj;
                    if (userAbility == null) {
                        AbilityQuestionViewModel.this.getQuestionInfo().postValue(pair);
                    } else {
                        AbilityQuestionViewModel.this.fuseUserAbility(pair, userAbility);
                    }
                    AbilityQuestionViewModel.this.getQuestionInfo().postValue(pair);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                AbilityQuestionModel mModel = AbilityQuestionViewModel.this.getMModel();
                this.label = 1;
                obj = mModel.getQuestionInfo(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Pair<Boolean, List<Question>> pair2 = (Pair) obj;
                TrainingPlanRequest trainingPlanRequest = AbilityQuestionViewModel.this.trainingPlanRequest;
                this.L$0 = pair2;
                this.label = 2;
                Object userAbility2 = trainingPlanRequest.getUserAbility(this);
                if (userAbility2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pair = pair2;
                obj = userAbility2;
                userAbility = (UserAbility) obj;
                if (userAbility == null) {
                    AbilityQuestionViewModel.this.getQuestionInfo().postValue(pair);
                } else {
                    AbilityQuestionViewModel.this.fuseUserAbility(pair, userAbility);
                }
                AbilityQuestionViewModel.this.getQuestionInfo().postValue(pair);
                return Unit.INSTANCE;
            } catch (Exception e) {
                LogExtKt.loge(AbilityQuestionViewModel.this.getTAG(), "getQuestionInfo error:" + e.getMessage());
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fuseUserAbility(Pair<Boolean, ? extends List<Question>> questions, UserAbility userAbility) {
        List<Question> second = questions.getSecond();
        if (second != null) {
            List<Question> list = second;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.areEqual(((Question) obj).getKey(), "running_frequency")) {
                    arrayList.add(obj);
                }
            }
            Iterator<T> it = ((Question) arrayList.get(0)).getOptions().iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                QuestionOption questionOption = (QuestionOption) it.next();
                if (userAbility.getRunningFrequency() != questionOption.getId()) {
                    z = false;
                }
                questionOption.setSelected(Boolean.valueOf(z));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (Intrinsics.areEqual(((Question) obj2).getKey(), "running_distance")) {
                    arrayList2.add(obj2);
                }
            }
            for (QuestionOption questionOption2 : ((Question) arrayList2.get(0)).getOptions()) {
                questionOption2.setSelected(Boolean.valueOf(userAbility.getPerRunningDistance() == questionOption2.getId()));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list) {
                if (Intrinsics.areEqual(((Question) obj3).getKey(), "running_pace")) {
                    arrayList3.add(obj3);
                }
            }
            for (QuestionOption questionOption3 : ((Question) arrayList3.get(0)).getOptions()) {
                questionOption3.setSelected(Boolean.valueOf(userAbility.getRunningPace() == questionOption3.getId()));
            }
        }
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, List<Question>>> getQuestionInfo() {
        return this.questionInfo;
    }

    /* JADX INFO: renamed from: getQuestionInfo, reason: collision with other method in class */
    public final void m613getQuestionInfo() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }
}
