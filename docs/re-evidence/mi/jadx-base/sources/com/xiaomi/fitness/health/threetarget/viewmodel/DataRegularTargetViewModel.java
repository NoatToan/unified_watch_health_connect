package com.xiaomi.fitness.health.threetarget.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ScopeExtKt;
import com.fitness.banner.export.BannerExtKt;
import com.fitness.banner.export.BannerItem;
import com.fitness.banner.export.BannerRequestParam;
import com.fitness.banner.export.BusinessKey;
import com.fitness.banner.export.IBanner;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.health.threetarget.model.DataSourceModel;
import com.xiaomi.fitness.request.HealthHttpRequest;
import defpackage.ecf;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b-\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u0004J\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0004R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR.\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00050\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u001fR.\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00050\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0011\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010\u001fR.\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0011\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u001fR.\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00050\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0011\u001a\u0004\b\f\u0010\u0013\"\u0004\b(\u0010\u001fR.\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00050\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0011\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010\u001f¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/viewmodel/DataRegularTargetViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "", "onCleared", "()V", "", "", "sidList", "", "Lcom/xiaomi/fitness/health/threetarget/model/DataSourceModel;", "getDataSourceModelList", "(Ljava/util/List;)Ljava/util/List;", "getMedalDataList", "queryBannerDetailLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lorg/joda/time/LocalDate;", "currentSelectedDate", "Landroidx/lifecycle/MutableLiveData;", "getCurrentSelectedDate", "()Landroidx/lifecycle/MutableLiveData;", "", "mCurrentWeekPosition", "I", "getMCurrentWeekPosition", "()I", "setMCurrentWeekPosition", "(I)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "mWeekMapDataList", "getMWeekMapDataList", "setMWeekMapDataList", "(Landroidx/lifecycle/MutableLiveData;)V", "mWeekBarMapDataList", "getMWeekBarMapDataList", "setMWeekBarMapDataList", "sidModeList", "getSidModeList", "setSidModeList", "Lecf$a;", "medalDataList", "setMedalDataList", "Lcom/fitness/banner/export/BannerItem;", "bannerDataList", "getBannerDataList", "setBannerDataList", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDataRegularTargetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataRegularTargetViewModel.kt\ncom/xiaomi/fitness/health/threetarget/viewmodel/DataRegularTargetViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n1863#2,2:80\n*S KotlinDebug\n*F\n+ 1 DataRegularTargetViewModel.kt\ncom/xiaomi/fitness/health/threetarget/viewmodel/DataRegularTargetViewModel\n*L\n34#1:80,2\n*E\n"})
public final class DataRegularTargetViewModel extends AbsViewModel {

    @NotNull
    private final MutableLiveData<LocalDate> currentSelectedDate = new MutableLiveData<>();
    private int mCurrentWeekPosition = -1;

    @NotNull
    private MutableLiveData<List<DailyGoalReport>> mWeekMapDataList = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<List<DailyGoalReport>> mWeekBarMapDataList = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<List<String>> sidModeList = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<List<ecf.a>> medalDataList = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<List<BannerItem>> bannerDataList = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.threetarget.viewmodel.DataRegularTargetViewModel$getMedalDataList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.threetarget.viewmodel.DataRegularTargetViewModel$getMedalDataList$1", f = "DataRegularTargetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(DataRegularTargetViewModel dataRegularTargetViewModel, List list) {
            ScopeExtKt.scopeLife(dataRegularTargetViewModel, Dispatchers.getMain(), new DataRegularTargetViewModel$getMedalDataList$1$1$1(dataRegularTargetViewModel, list, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(String str) {
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DataRegularTargetViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HealthHttpRequest healthHttpRequest = new HealthHttpRequest();
            int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
            final DataRegularTargetViewModel dataRegularTargetViewModel = DataRegularTargetViewModel.this;
            healthHttpRequest.requestThreeTargetMedalList(currentTZOffsetInSec, new Function1() { // from class: com.xiaomi.fitness.health.threetarget.viewmodel.a
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return DataRegularTargetViewModel.AnonymousClass1.invokeSuspend$lambda$0(dataRegularTargetViewModel, (List) obj2);
                }
            }, new Function1() { // from class: com.xiaomi.fitness.health.threetarget.viewmodel.b
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return DataRegularTargetViewModel.AnonymousClass1.invokeSuspend$lambda$1((String) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.threetarget.viewmodel.DataRegularTargetViewModel$queryBannerDetailLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.threetarget.viewmodel.DataRegularTargetViewModel$queryBannerDetailLiveData$1", f = "DataRegularTargetViewModel.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25561 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.threetarget.viewmodel.DataRegularTargetViewModel$queryBannerDetailLiveData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.threetarget.viewmodel.DataRegularTargetViewModel$queryBannerDetailLiveData$1$1", f = "DataRegularTargetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<BannerItem> $bannerList;
            int label;
            final /* synthetic */ DataRegularTargetViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06231(List<BannerItem> list, DataRegularTargetViewModel dataRegularTargetViewModel, Continuation<? super C06231> continuation) {
                super(2, continuation);
                this.$bannerList = list;
                this.this$0 = dataRegularTargetViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06231(this.$bannerList, this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (!this.$bannerList.isEmpty()) {
                    this.this$0.getBannerDataList().postValue(this.$bannerList);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C25561(Continuation<? super C25561> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DataRegularTargetViewModel.this.new C25561(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IBanner instance = BannerExtKt.getINSTANCE(IBanner.INSTANCE);
                BannerRequestParam bannerRequestParam = new BannerRequestParam(BusinessKey.BUSINESS_SPORT, 2, 10);
                this.label = 1;
                obj = instance.getBannerListV1(bannerRequestParam, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ScopeExtKt.scopeLife(DataRegularTargetViewModel.this, Dispatchers.getMain(), new C06231((List) obj, DataRegularTargetViewModel.this, null));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @NotNull
    public final MutableLiveData<List<BannerItem>> getBannerDataList() {
        return this.bannerDataList;
    }

    @NotNull
    public final MutableLiveData<LocalDate> getCurrentSelectedDate() {
        return this.currentSelectedDate;
    }

    @NotNull
    public final List<DataSourceModel> getDataSourceModelList(@NotNull List<String> sidList) {
        Intrinsics.checkNotNullParameter(sidList, "sidList");
        ArrayList arrayList = new ArrayList();
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        String currentPhoneSid = deviceManagerExtKt.getCurrentPhoneSid();
        for (String str : sidList) {
            DeviceInfo<? extends Device> deviceInfoInAll = deviceManagerExtKt.getDeviceInfoInAll(str);
            if (deviceInfoInAll == null) {
                Logger.i("CurrentDeviceModel", "deviceInfo is null " + str);
            } else if (!Intrinsics.areEqual(str, "xiaomiwear_app")) {
                boolean zAreEqual = Intrinsics.areEqual(currentPhoneSid, str);
                String name = deviceInfoInAll.getName();
                Product product = deviceInfoInAll.getProduct();
                arrayList.add(new DataSourceModel(zAreEqual, name, product != null ? product.getSmallIcon() : null));
            }
        }
        return arrayList;
    }

    public final int getMCurrentWeekPosition() {
        return this.mCurrentWeekPosition;
    }

    @NotNull
    public final MutableLiveData<List<DailyGoalReport>> getMWeekBarMapDataList() {
        return this.mWeekBarMapDataList;
    }

    @NotNull
    public final MutableLiveData<List<DailyGoalReport>> getMWeekMapDataList() {
        return this.mWeekMapDataList;
    }

    @NotNull
    public final MutableLiveData<List<ecf.a>> getMedalDataList() {
        return this.medalDataList;
    }

    @NotNull
    public final MutableLiveData<List<String>> getSidModeList() {
        return this.sidModeList;
    }

    @Override // defpackage.dvq
    public void onCleared() {
        super.onCleared();
    }

    public final void queryBannerDetailLiveData() {
        ScopeExtKt.scopeLife(this, Dispatchers.getIO(), new C25561(null));
    }

    public final void setBannerDataList(@NotNull MutableLiveData<List<BannerItem>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.bannerDataList = mutableLiveData;
    }

    public final void setMCurrentWeekPosition(int i) {
        this.mCurrentWeekPosition = i;
    }

    public final void setMWeekBarMapDataList(@NotNull MutableLiveData<List<DailyGoalReport>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mWeekBarMapDataList = mutableLiveData;
    }

    public final void setMWeekMapDataList(@NotNull MutableLiveData<List<DailyGoalReport>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mWeekMapDataList = mutableLiveData;
    }

    public final void setMedalDataList(@NotNull MutableLiveData<List<ecf.a>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.medalDataList = mutableLiveData;
    }

    public final void setSidModeList(@NotNull MutableLiveData<List<String>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.sidModeList = mutableLiveData;
    }

    /* JADX INFO: renamed from: getMedalDataList, reason: collision with other method in class */
    public final void m465getMedalDataList() {
        ScopeExtKt.scopeLife(this, Dispatchers.getIO(), new AnonymousClass1(null));
    }
}
