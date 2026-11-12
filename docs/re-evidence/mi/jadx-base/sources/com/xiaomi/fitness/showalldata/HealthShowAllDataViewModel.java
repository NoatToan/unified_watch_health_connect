package com.xiaomi.fitness.showalldata;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ScopeExtKt;
import com.xiaomi.fit.data.common.constant.FitnessDataConstants;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.homepage.util.HealthDataTypeUtils;
import com.xiaomi.fitness.homepage.util.HealthTypeBean;
import com.xiaomi.fitness.util.HealthUtil;
import defpackage.km5;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0011\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bR#\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/showalldata/HealthShowAllDataViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Landroid/os/Bundle;", "savedInstanceState", "", "attach", "(Landroid/os/Bundle;)V", "loadData", "()V", "onSaveEdit", "Landroidx/lifecycle/MutableLiveData;", "", "Lkm5;", "mAllDataLiveData", "Landroidx/lifecycle/MutableLiveData;", "getMAllDataLiveData", "()Landroidx/lifecycle/MutableLiveData;", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HealthShowAllDataViewModel extends AbsViewModel {

    @NotNull
    private final MutableLiveData<List<km5>> mAllDataLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.showalldata.HealthShowAllDataViewModel$loadData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.showalldata.HealthShowAllDataViewModel$loadData$1", f = "HealthShowAllDataViewModel.kt", i = {0}, l = {30, 38}, m = "invokeSuspend", n = {"zeroTime"}, s = {"J$0"})
    @SourceDebugExtension({"SMAP\nHealthShowAllDataViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthShowAllDataViewModel.kt\ncom/xiaomi/fitness/showalldata/HealthShowAllDataViewModel$loadData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n1863#2,2:61\n*S KotlinDebug\n*F\n+ 1 HealthShowAllDataViewModel.kt\ncom/xiaomi/fitness/showalldata/HealthShowAllDataViewModel$loadData$1\n*L\n32#1:61,2\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        long J$0;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.showalldata.HealthShowAllDataViewModel$loadData$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.showalldata.HealthShowAllDataViewModel$loadData$1$2", f = "HealthShowAllDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<km5> $allHealthData;
            int label;
            final /* synthetic */ HealthShowAllDataViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(HealthShowAllDataViewModel healthShowAllDataViewModel, List<km5> list, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = healthShowAllDataViewModel;
                this.$allHealthData = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$allHealthData, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.getMAllDataLiveData().setValue(this.$allHealthData);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HealthShowAllDataViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            long j;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    j = this.J$0;
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
            long todayZeroTimeInSec = FitnessDateUtils.getTodayZeroTimeInSec();
            HealthDataTypeUtils healthDataTypeUtils = HealthDataTypeUtils.INSTANCE;
            this.J$0 = todayZeroTimeInSec;
            this.label = 1;
            obj = healthDataTypeUtils.getAllDataTypeList(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            j = todayZeroTimeInSec;
            ArrayList arrayList = new ArrayList();
            for (HealthTypeBean healthTypeBean : (List) obj) {
                km5 km5VarCreateDefaultDataModel = HealthUtil.INSTANCE.createDefaultDataModel(j, healthTypeBean.getHealthType(), healthTypeBean.getEnable() ? 0 : -1);
                km5VarCreateDefaultDataModel.l = healthTypeBean.getManualSet();
                arrayList.add(km5VarCreateDefaultDataModel);
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(HealthShowAllDataViewModel.this, arrayList, null);
            this.label = 2;
            if (BuildersKt.withContext(main, anonymousClass2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
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
    public final MutableLiveData<List<km5>> getMAllDataLiveData() {
        return this.mAllDataLiveData;
    }

    public final void loadData() {
        ScopeExtKt.scopeNetLife(this, Dispatchers.getIO(), new AnonymousClass1(null));
    }

    public final void onSaveEdit() {
        List<km5> value = this.mAllDataLiveData.getValue();
        if (value == null) {
            return;
        }
        Logger.i("HealthShowAllDataViewModel", "onSaveHealthDataSetting");
        HealthDataTypeUtils.INSTANCE.saveHealthDataSettingToCloud(value);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (km5 km5Var : value) {
            if (km5Var.e >= 0) {
                arrayList.add(Integer.valueOf(km5Var.f23979b));
            }
        }
        Intent intent = new Intent(FitnessDataConstants.ACTION_DATA_LIST_CHANGED_BROADCAST);
        intent.putIntegerArrayListExtra(FitnessDataConstants.EXTRA_DISPLAY_DATA_LIST, arrayList);
        intent.setPackage(ApplicationExtKt.getApplication().getPackageName());
        ApplicationExtKt.getApplication().sendBroadcast(intent);
    }
}
