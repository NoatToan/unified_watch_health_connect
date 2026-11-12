package com.xiaomi.fitness.trail.viewmodel;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fit.data.common.data.sport.SportCategoryData;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.SportSummaryApi;
import com.xiaomi.fit.fitness.export.api.SportSummaryApiKt;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001f\u001a\u00020 J\u0012\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0006\u0010$\u001a\u00020\u000bJ\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u001c0\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/trail/viewmodel/RecordMainVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "summaryApi", "Lcom/xiaomi/fit/fitness/export/api/SportSummaryApi;", "getSummaryApi", "()Lcom/xiaomi/fit/fitness/export/api/SportSummaryApi;", "setSummaryApi", "(Lcom/xiaomi/fit/fitness/export/api/SportSummaryApi;)V", "startMills", "", "value", "", "category", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "categoryEmitter", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getCategoryEmitter", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "categoryList", "", "Lcom/xiaomi/fit/data/common/data/sport/SportCategoryData;", "categoriesEmitter", "Landroidx/lifecycle/MutableLiveData;", "", "getCategoriesEmitter", "()Landroidx/lifecycle/MutableLiveData;", "initData", "", "attach", "savedInstanceState", "Landroid/os/Bundle;", "getStartMills", "getCategoryList", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecordMainVM extends AbsViewModel {
    public SportSummaryApi summaryApi;
    private long startMills = FitnessDateUtils.changeToDestZeroTimeOneDay(SportSummaryApiKt.DEFAULT_START_0TZ_SEC, 0, FitnessDateUtils.getCurrentTZOffsetInSec()) * ((long) 1000);

    @NotNull
    private String category = "sport_stats_all";

    @NotNull
    private final MutableStateFlow<String> categoryEmitter = StateFlowKt.MutableStateFlow("sport_stats_all");

    @NotNull
    private final List<SportCategoryData> categoryList = new ArrayList();

    @NotNull
    private final MutableLiveData<List<SportCategoryData>> categoriesEmitter = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.trail.viewmodel.RecordMainVM$initData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.trail.viewmodel.RecordMainVM$initData$1", f = "RecordMainVM.kt", i = {0}, l = {54, 56}, m = "invokeSuspend", n = {"categoriesTask"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = RecordMainVM.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Deferred deferred;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    deferred = (Deferred) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ArrayList arrayList = (ArrayList) obj;
                RecordMainVM.this.categoryList.clear();
                RecordMainVM.this.categoryList.addAll(arrayList);
                Logger.d("SRecordDimenViewModel", "initData: startMills = " + RecordMainVM.this.startMills + "; categories = " + arrayList);
                RecordMainVM.this.getCategoriesEmitter().setValue(arrayList);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, Dispatchers.getIO(), null, new RecordMainVM$initData$1$sportStartTask$1(RecordMainVM.this, null), 2, null);
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, Dispatchers.getIO(), null, new RecordMainVM$initData$1$categoriesTask$1(RecordMainVM.this, null), 2, null);
            this.L$0 = deferredAsync$default2;
            this.label = 1;
            Object objAwait = deferredAsync$default.await(this);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
            deferred = deferredAsync$default2;
            obj = objAwait;
            RecordMainVM.this.startMills = ((Number) obj).longValue() * 1000;
            this.L$0 = null;
            this.label = 2;
            obj = deferred.await(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ArrayList arrayList2 = (ArrayList) obj;
            RecordMainVM.this.categoryList.clear();
            RecordMainVM.this.categoryList.addAll(arrayList2);
            Logger.d("SRecordDimenViewModel", "initData: startMills = " + RecordMainVM.this.startMills + "; categories = " + arrayList2);
            RecordMainVM.this.getCategoriesEmitter().setValue(arrayList2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final MutableLiveData<List<SportCategoryData>> getCategoriesEmitter() {
        return this.categoriesEmitter;
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    public final MutableStateFlow<String> getCategoryEmitter() {
        return this.categoryEmitter;
    }

    @NotNull
    public final List<SportCategoryData> getCategoryList() {
        return this.categoryList;
    }

    public final long getStartMills() {
        return this.startMills;
    }

    @NotNull
    public final SportSummaryApi getSummaryApi() {
        SportSummaryApi sportSummaryApi = this.summaryApi;
        if (sportSummaryApi != null) {
            return sportSummaryApi;
        }
        Intrinsics.throwUninitializedPropertyAccessException("summaryApi");
        return null;
    }

    public final void initData() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final void setCategory(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.category = value;
        this.categoryEmitter.setValue(value);
    }

    public final void setSummaryApi(@NotNull SportSummaryApi sportSummaryApi) {
        Intrinsics.checkNotNullParameter(sportSummaryApi, "<set-?>");
        this.summaryApi = sportSummaryApi;
    }
}
