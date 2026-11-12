package com.xiaomi.hm.health.bodyfat.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoRepository;
import com.xiaomi.hm.health.bodyfat.model.Birthday;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.WeightInfoCreateHelper;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004R%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/BabyWeightViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/xiaomi/hm/health/bt/model/WeightAdvData;", "data", "", "hasChildFamily", "weightMatchUsers", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "a", "Landroidx/lifecycle/MutableLiveData;", "getMatchUser", "()Landroidx/lifecycle/MutableLiveData;", "matchUser", "b", "Lcom/xiaomi/hm/health/bt/model/WeightAdvData;", "getWeightAdvData", "()Lcom/xiaomi/hm/health/bt/model/WeightAdvData;", "setWeightAdvData", "(Lcom/xiaomi/hm/health/bt/model/WeightAdvData;)V", "weightAdvData", "", "c", "getHasChild", "hasChild", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class BabyWeightViewModel extends ViewModel {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private WeightAdvData weightAdvData;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<UserInfos>> matchUser = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> hasChild = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.viewmodel.BabyWeightViewModel$hasChildFamily$1", f = "BabyWeightViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ WeightAdvData c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WeightAdvData weightAdvData, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = weightAdvData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BabyWeightViewModel.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BabyWeightViewModel.this.setWeightAdvData(this.c);
            boolean z = false;
            Iterator<T> it2 = UserInfoManager.getManager().getAllInfos().iterator();
            while (it2.hasNext()) {
                if (Birthday.fromStr(((UserInfos) it2.next()).getBirthday()).getAge() <= 7) {
                    z = true;
                }
            }
            BabyWeightViewModel.this.getHasChild().postValue(Boxing.boxBoolean(z));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.viewmodel.BabyWeightViewModel$weightMatchUsers$1", f = "BabyWeightViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BabyWeightViewModel.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            WeightInfos weightInfosCreateWeightInfo;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WeightAdvData weightAdvData = BabyWeightViewModel.this.getWeightAdvData();
            if (weightAdvData != null) {
                BabyWeightViewModel babyWeightViewModel = BabyWeightViewModel.this;
                List<UserInfos> listMatchUsers = HMWeightUtils.matchUsers(weightAdvData);
                ArrayList arrayList = new ArrayList();
                Iterator<T> it2 = listMatchUsers.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (Boxing.boxBoolean(Birthday.fromStr(((UserInfos) next).getBirthday()).getAge() <= 7).booleanValue()) {
                        arrayList.add(next);
                    }
                }
                if (arrayList.size() == 1 && (weightInfosCreateWeightInfo = WeightInfoCreateHelper.INSTANCE.createWeightInfo((UserInfos) CollectionsKt.first((List) arrayList), weightAdvData.getTimestamp(), weightAdvData.getValueKg(), weightAdvData.getImpedance())) != null) {
                    Boxing.boxLong(WeightInfoRepository.INSTANCE.getInstance().addWeightInfo(weightInfosCreateWeightInfo));
                }
                babyWeightViewModel.getMatchUser().postValue(arrayList);
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final MutableLiveData<Boolean> getHasChild() {
        return this.hasChild;
    }

    @NotNull
    public final MutableLiveData<List<UserInfos>> getMatchUser() {
        return this.matchUser;
    }

    @Nullable
    public final WeightAdvData getWeightAdvData() {
        return this.weightAdvData;
    }

    public final void hasChildFamily(@NotNull WeightAdvData data) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(data, null), 2, null);
    }

    public final void setWeightAdvData(@Nullable WeightAdvData weightAdvData) {
        this.weightAdvData = weightAdvData;
    }

    public final void weightMatchUsers() {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(null), 2, null);
    }
}
