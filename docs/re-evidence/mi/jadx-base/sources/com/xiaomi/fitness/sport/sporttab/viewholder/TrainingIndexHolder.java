package com.xiaomi.fitness.sport.sporttab.viewholder;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.health.threetarget.model.TrainingIndexDataItem;
import com.xiaomi.fitness.login.export.PrivacyEasyModePreference;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.sport.sporttab.recycler.HorizontalCardListItemDecoration;
import com.xiaomi.fitness.sport.sporttab.recycler.TrainingIndicatorAdapterGrid;
import com.xiaomi.fitness.sport.sporttab.recycler.TrainingIndicatorAdapterLinear;
import com.xiaomi.fitness.sport.sporttab.util.SportTabOneTrackExtKt;
import com.xiaomi.fitness.sport.sporttab.viewholder.TrainingIndexHolder;
import com.xiaomi.fitness.sport.utils.ItemDecorationExtKt;
import defpackage.rli;
import defpackage.xri;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 K2\u00020\u0001:\u0001KB\u001f\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\bI\u0010JJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u001d\u0010\n\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJM\u0010\u0014\u001a\u00020\u00022<\u0010\u0013\u001a8\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u0004J\r\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010\u0004J\r\u0010 \u001a\u00020\u0002¢\u0006\u0004\b \u0010\u0004R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010#R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R \u00103\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u000202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\b058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\r088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010/R\u0014\u0010D\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010C¨\u0006L"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/viewholder/TrainingIndexHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "updateData", "()V", "refreshTrainingIndexItems", "refreshSupportedTypes", "", "Lcom/xiaomi/fitness/health/threetarget/model/TrainingIndexDataItem;", "trainingIndexDataItems", "showTrainingItemCards", "(Ljava/util/List;)V", "Lkotlin/Function2;", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "Lkotlin/ParameterName;", "name", "homeDataType", "", "status", "oneTrackCallback", "getVisibleRangeAndDealWithExpose", "(Lkotlin/jvm/functions/Function2;)V", "modelList", "getDataStatus", "(Ljava/util/List;Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;)I", "", "", "map", "getTrainingIndexModelList", "(Ljava/util/Map;)Ljava/util/List;", "addScrollListener", "bindData", "refreshHolder", "Landroid/view/View;", "itemView", "Landroid/view/View;", "getItemView", "()Landroid/view/View;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "emptyHolderView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "container", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerLinear", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerGrid", "", "", "oneTrackReportMap", "Ljava/util/Map;", "", "mModelList", "Ljava/util/List;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "mSupportedTypes", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/xiaomi/fitness/sport/sporttab/recycler/TrainingIndicatorAdapterLinear;", "adapterLinear", "Lcom/xiaomi/fitness/sport/sporttab/recycler/TrainingIndicatorAdapterLinear;", "Lcom/xiaomi/fitness/sport/sporttab/recycler/TrainingIndicatorAdapterGrid;", "adapterGrid", "Lcom/xiaomi/fitness/sport/sporttab/recycler/TrainingIndicatorAdapterGrid;", "validRecycler", "getTrainingCardMarginBetween", "()I", "trainingCardMarginBetween", "getTrainingCardMarginEdg", "trainingCardMarginEdg", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "contextFragment", "<init>", "(Lcom/xiaomi/fitness/baseui/view/BaseFragment;Landroid/view/View;Landroidx/lifecycle/LifecycleOwner;)V", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTrainingIndexHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainingIndexHolder.kt\ncom/xiaomi/fitness/sport/sporttab/viewholder/TrainingIndexHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,294:1\n1863#2,2:295\n1863#2,2:297\n*S KotlinDebug\n*F\n+ 1 TrainingIndexHolder.kt\ncom/xiaomi/fitness/sport/sporttab/viewholder/TrainingIndexHolder\n*L\n197#1:295,2\n208#1:297,2\n*E\n"})
public final class TrainingIndexHolder extends RecyclerView.d0 {

    @NotNull
    public static final String TAG = "TrainingIndicatorHolder";

    @NotNull
    private TrainingIndicatorAdapterGrid adapterGrid;

    @NotNull
    private TrainingIndicatorAdapterLinear adapterLinear;

    @NotNull
    private final ConstraintLayout container;

    @NotNull
    private final View emptyHolderView;

    @NotNull
    private final View itemView;

    @NotNull
    private final LifecycleOwner lifecycleOwner;

    @NotNull
    private final List<TrainingIndexDataItem> mModelList;

    @NotNull
    private final CopyOnWriteArrayList<HomeDataType> mSupportedTypes;

    @NotNull
    private final Map<HomeDataType, Boolean> oneTrackReportMap;

    @NotNull
    private final RecyclerView recyclerGrid;

    @NotNull
    private final RecyclerView recyclerLinear;

    @Nullable
    private RecyclerView validRecycler;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.sporttab.viewholder.TrainingIndexHolder$updateData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.sporttab.viewholder.TrainingIndexHolder$updateData$1", f = "TrainingIndexHolder.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport.sporttab.viewholder.TrainingIndexHolder$updateData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport.sporttab.viewholder.TrainingIndexHolder$updateData$1$1", f = "TrainingIndexHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07431 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ TrainingIndexHolder this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07431(TrainingIndexHolder trainingIndexHolder, Continuation<? super C07431> continuation) {
                super(2, continuation);
                this.this$0 = trainingIndexHolder;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07431(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.refreshTrainingIndexItems();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TrainingIndexHolder.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TrainingIndexHolder.this.refreshSupportedTypes();
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C07431 c07431 = new C07431(TrainingIndexHolder.this, null);
                this.label = 1;
                if (BuildersKt.withContext(main, c07431, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrainingIndexHolder(@NotNull BaseFragment contextFragment, @NotNull View itemView, @NotNull LifecycleOwner lifecycleOwner) {
        super(itemView);
        Intrinsics.checkNotNullParameter(contextFragment, "contextFragment");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.itemView = itemView;
        this.lifecycleOwner = lifecycleOwner;
        View viewFindViewById = itemView.findViewById(xri.B1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.emptyHolderView = viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(xri.o0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.container = (ConstraintLayout) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(xri.Y4);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.recyclerLinear = (RecyclerView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(xri.X4);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.recyclerGrid = (RecyclerView) viewFindViewById4;
        this.oneTrackReportMap = new LinkedHashMap();
        this.mModelList = new ArrayList();
        this.mSupportedTypes = new CopyOnWriteArrayList<>();
        this.adapterLinear = new TrainingIndicatorAdapterLinear(contextFragment);
        this.adapterGrid = new TrainingIndicatorAdapterGrid(contextFragment);
    }

    private final void addScrollListener() {
        TrainingIndexHolder$addScrollListener$scrollListener$1 trainingIndexHolder$addScrollListener$scrollListener$1 = new TrainingIndexHolder$addScrollListener$scrollListener$1(new Ref.IntRef(), this);
        RecyclerView recyclerView = this.validRecycler;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(trainingIndexHolder$addScrollListener$scrollListener$1);
        }
    }

    private final int getDataStatus(List<TrainingIndexDataItem> modelList, HomeDataType homeDataType) {
        boolean noData = true;
        for (TrainingIndexDataItem trainingIndexDataItem : modelList) {
            if (trainingIndexDataItem.getHomeDataType() == homeDataType) {
                noData = trainingIndexDataItem.getNoData();
            }
        }
        return !noData ? 1 : 0;
    }

    private final int getTrainingCardMarginBetween() {
        return UIUtils.INSTANCE.getScreenState() == 0 ? ExtUtilsKt.getDp(12) : ExtUtilsKt.getDp(10);
    }

    private final int getTrainingCardMarginEdg() {
        return UIUtils.INSTANCE.getScreenState() == 0 ? ExtUtilsKt.getDp(14) : ExtUtilsKt.getDp(12);
    }

    private final List<TrainingIndexDataItem> getTrainingIndexModelList(Map<HomeDataType, ? extends Object> map) {
        ArrayList arrayList = new ArrayList();
        HomeDataType homeDataType = HomeDataType.TRAINING_LOAD;
        if (map.containsKey(homeDataType)) {
            IHealthPage healthPageExtKt = HealthPageExtKt.getInstance(IHealthPage.INSTANCE);
            Object obj = map.get(homeDataType);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport");
            ListExtKt.add(arrayList, healthPageExtKt.getTrainingIndexDataItem(homeDataType, (DailyBasicReport) obj));
        }
        HomeDataType homeDataType2 = HomeDataType.V02_MAX;
        if (map.containsKey(homeDataType2)) {
            IHealthPage healthPageExtKt2 = HealthPageExtKt.getInstance(IHealthPage.INSTANCE);
            Object obj2 = map.get(homeDataType2);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport");
            ListExtKt.add(arrayList, healthPageExtKt2.getTrainingIndexDataItem(homeDataType2, (DailyBasicReport) obj2));
        }
        HomeDataType homeDataType3 = HomeDataType.RUNNING_INDICATOR;
        if (map.containsKey(homeDataType3)) {
            IHealthPage healthPageExtKt3 = HealthPageExtKt.getInstance(IHealthPage.INSTANCE);
            Object obj3 = map.get(homeDataType3);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport");
            ListExtKt.add(arrayList, healthPageExtKt3.getTrainingIndexDataItem(homeDataType3, (DailyBasicReport) obj3));
        }
        HomeDataType homeDataType4 = HomeDataType.PHYSICAL_STATUS;
        if (map.containsKey(homeDataType4)) {
            IHealthPage healthPageExtKt4 = HealthPageExtKt.getInstance(IHealthPage.INSTANCE);
            Object obj4 = map.get(homeDataType4);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport");
            ListExtKt.add(arrayList, healthPageExtKt4.getTrainingIndexDataItem(homeDataType4, (DailyBasicReport) obj4));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getVisibleRangeAndDealWithExpose(Function2<? super HomeDataType, ? super Integer, Unit> oneTrackCallback) {
        int iIntValue;
        int iIntValue2;
        ArrayList<HomeDataType> arrayList = new ArrayList();
        if (this.mSupportedTypes.size() > 2) {
            RecyclerView recyclerView = this.validRecycler;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) (recyclerView != null ? recyclerView.getLayoutManager() : null);
            Integer numValueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.findFirstCompletelyVisibleItemPosition()) : null;
            Integer numValueOf2 = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.findLastCompletelyVisibleItemPosition()) : null;
            if (numValueOf != null && numValueOf2 != null && numValueOf.intValue() >= 0 && numValueOf2.intValue() >= 0 && numValueOf2.intValue() >= numValueOf.intValue() && (iIntValue = numValueOf.intValue()) <= (iIntValue2 = numValueOf2.intValue())) {
                while (true) {
                    HomeDataType homeDataType = this.mSupportedTypes.get(iIntValue);
                    Intrinsics.checkNotNullExpressionValue(homeDataType, "get(...)");
                    arrayList.add(homeDataType);
                    if (iIntValue == iIntValue2) {
                        break;
                    } else {
                        iIntValue++;
                    }
                }
            }
        } else {
            arrayList.addAll(this.mSupportedTypes);
        }
        for (HomeDataType homeDataType2 : arrayList) {
            int dataStatus = getDataStatus(this.mModelList, homeDataType2);
            if (oneTrackCallback != null) {
                oneTrackCallback.invoke(homeDataType2, Integer.valueOf(dataStatus));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshSupportedTypes() {
        List<HomeDataType> supportedHomeDataTypesForTrainingIndex = HealthPageExtKt.getInstance(IHealthPage.INSTANCE).getSupportedHomeDataTypesForTrainingIndex();
        this.mSupportedTypes.clear();
        this.mSupportedTypes.addAll(supportedHomeDataTypesForTrainingIndex);
        this.validRecycler = supportedHomeDataTypesForTrainingIndex.size() > 2 ? this.recyclerLinear : this.recyclerGrid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshTrainingIndexItems() {
        FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getHomeDataRepository().getHomeData(this.mSupportedTypes).observe(this.lifecycleOwner, new TrainingIndexHolder$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: etp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TrainingIndexHolder.refreshTrainingIndexItems$lambda$0(this.f17064a, (Map) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshTrainingIndexItems$lambda$0(TrainingIndexHolder this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(TAG, "bindData mapSize=" + map.size() + " map=" + map);
        Intrinsics.checkNotNull(map);
        this$0.showTrainingItemCards(this$0.getTrainingIndexModelList(map));
        return Unit.INSTANCE;
    }

    private final void showTrainingItemCards(List<TrainingIndexDataItem> trainingIndexDataItems) {
        RecyclerView recyclerView;
        int screenState = UIUtils.INSTANCE.getScreenState();
        boolean z = trainingIndexDataItems.size() > 2 && (screenState != 0 && screenState != 1 && screenState != 2);
        RecyclerView recyclerView2 = z ? this.recyclerLinear : this.recyclerGrid;
        this.validRecycler = recyclerView2;
        RecyclerView.Adapter adapter = z ? this.adapterLinear : this.adapterGrid;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(adapter);
        }
        int size = trainingIndexDataItems.size();
        if (z) {
            ViewExtKt.setVisible(this.recyclerLinear, true);
            ViewExtKt.setVisible(this.recyclerGrid, false);
            recyclerView = this.recyclerLinear;
        } else {
            ViewExtKt.setVisible(this.recyclerGrid, true);
            ViewExtKt.setVisible(this.recyclerLinear, false);
            recyclerView = this.recyclerGrid;
        }
        this.validRecycler = recyclerView;
        if (size == 0) {
            ViewExtKt.gone(this.container);
            ViewExtKt.visible(this.emptyHolderView);
            return;
        }
        ViewExtKt.gone(this.emptyHolderView);
        ViewExtKt.visible(this.container);
        RecyclerView recyclerView3 = this.validRecycler;
        if (recyclerView3 != null) {
            ViewExtKt.setVisible(recyclerView3, true);
        }
        RecyclerView recyclerView4 = this.validRecycler;
        if (recyclerView4 != null) {
            ItemDecorationExtKt.clearAllItemDecorations(recyclerView4);
        }
        RecyclerView recyclerView5 = this.validRecycler;
        if (recyclerView5 != null) {
            recyclerView5.setLayoutManager(new GridLayoutManager(this.itemView.getContext(), size, 1, false));
        }
        int dimension = ExtUtilsKt.getDimension(rli.d);
        if (z) {
            int trainingCardMarginBetween = (dimension * size) + ((size - 1) * getTrainingCardMarginBetween()) + (getTrainingCardMarginEdg() * 2);
            Logger.d(TAG, "totalWidth=" + trainingCardMarginBetween);
            this.recyclerLinear.setLayoutParams(new FrameLayout.LayoutParams(trainingCardMarginBetween, -2));
        }
        RecyclerView recyclerView6 = this.validRecycler;
        if (recyclerView6 != null) {
            recyclerView6.addItemDecoration(new HorizontalCardListItemDecoration(size, getTrainingCardMarginEdg(), getTrainingCardMarginBetween()));
        }
        this.mModelList.clear();
        this.mModelList.addAll(trainingIndexDataItems);
        if (z) {
            this.adapterLinear.refreshData(this.mModelList);
        } else {
            this.adapterGrid.refreshData(trainingIndexDataItems);
        }
        RecyclerView recyclerView7 = this.validRecycler;
        if (recyclerView7 != null) {
            recyclerView7.post(new Runnable() { // from class: ftp
                @Override // java.lang.Runnable
                public final void run() {
                    TrainingIndexHolder.showTrainingItemCards$lambda$2(this.f18236a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showTrainingItemCards$lambda$2(final TrainingIndexHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getVisibleRangeAndDealWithExpose(new Function2() { // from class: dtp
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TrainingIndexHolder.showTrainingItemCards$lambda$2$lambda$1(this.f15926a, (HomeDataType) obj, (Integer) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showTrainingItemCards$lambda$2$lambda$1(TrainingIndexHolder this$0, HomeDataType homeDataType, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportTabOneTrackExtKt.oneTrackOnTrainingIndexEntranceExpose(this$0.oneTrackReportMap, homeDataType, num);
        return Unit.INSTANCE;
    }

    private final void updateData() {
        ScopeExtKt.scope(Dispatchers.getIO(), new AnonymousClass1(null));
    }

    public final void bindData() {
        if (PrivacyEasyModePreference.INSTANCE.isEasyMode()) {
            ViewExtKt.gone(this.container);
        } else {
            setIsRecyclable(false);
            updateData();
        }
    }

    @NotNull
    public final View getItemView() {
        return this.itemView;
    }

    public final void refreshHolder() {
        if (PrivacyEasyModePreference.INSTANCE.isEasyMode()) {
            ViewExtKt.gone(this.container);
            return;
        }
        updateData();
        FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getHomeDataRepository().triggerGetHomeData(this.mSupportedTypes);
        addScrollListener();
    }
}
