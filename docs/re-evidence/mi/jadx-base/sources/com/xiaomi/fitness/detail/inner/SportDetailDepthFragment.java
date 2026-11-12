package com.xiaomi.fitness.detail.inner;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.LineDataSet;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportBasicReportKt;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.widget.SportDetailItemView;
import com.xiaomi.fitness.chart.entrys.SportRecordEntry;
import com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChart;
import com.xiaomi.fitness.detail.BaseSportDetailFragment;
import com.xiaomi.fitness.detail.data.HeightDistribute;
import com.xiaomi.fitness.detail.inner.SportDetailDepthFragment;
import com.xiaomi.fitness.detail.model.SportRecordListModel;
import com.xiaomi.fitness.detail.util.SportComputeUtil;
import com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.util.SportRecordDataUtil;
import com.xiaomi.fitness.widget.distribute.DistributeDataUtil;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import defpackage.bl5;
import defpackage.bsi;
import defpackage.dki;
import defpackage.hoi;
import defpackage.j1j;
import defpackage.rz5;
import defpackage.tdc;
import defpackage.uz6;
import defpackage.x44;
import defpackage.xr5;
import defpackage.yda;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 k2\u00020\u0001:\u0001kB\u0007¢\u0006\u0004\bj\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\u00042\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\bJ%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\bJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J-\u0010+\u001a\u00020*2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010)\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0004H\u0004¢\u0006\u0004\b-\u0010\bJ\u0019\u0010.\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b.\u0010\u0006R$\u00100\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00107\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010>\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010D\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010?\u001a\u0004\bE\u0010A\"\u0004\bF\u0010CR$\u0010H\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0018\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR*\u0010S\u001a\n\u0012\u0004\u0012\u00020R\u0018\u00010Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR*\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R$\u0010a\u001a\u0004\u0018\u00010`8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u0011\u0010i\u001a\u00020N8F¢\u0006\u0006\u001a\u0004\bg\u0010h¨\u0006l"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailDepthFragment;", "Lcom/xiaomi/fitness/detail/BaseSportDetailFragment;", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "", "initParamsFromBundle", "(Landroid/os/Bundle;)V", "initChartData", "()V", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "", "", "map", "bindHeightData", "(Ljava/util/Map;)V", "bindData", "initDistributeRecycler", "displayHeightDist", "Landroid/content/Context;", "context", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportValues", "Luz6;", "createHeightDistributeModel", "(Landroid/content/Context;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)Ljava/util/List;", "Lcom/xiaomi/fitness/detail/data/HeightDistribute;", "heightDistribute", "createHeightDistributeModelList", "(Landroid/content/Context;Lcom/xiaomi/fitness/detail/data/HeightDistribute;)Ljava/util/List;", "createDetailModelList", "", "getCardName", "()Ljava/lang/String;", "", "hasMaxMinAverage", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "initView", "onNewIntent", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "titleView", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "getTitleView", "()Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "setTitleView", "(Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;)V", "Landroid/widget/LinearLayout;", "itemViewContainer", "Landroid/widget/LinearLayout;", "getItemViewContainer", "()Landroid/widget/LinearLayout;", "setItemViewContainer", "(Landroid/widget/LinearLayout;)V", "Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "itemView1", "Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "getItemView1", "()Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "setItemView1", "(Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;)V", "itemView2", "getItemView2", "setItemView2", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerDistribute", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerDistribute", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerDistribute", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lyda;", "_binding", "Lyda;", "Ljava/util/ArrayList;", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "valueList", "Ljava/util/ArrayList;", "getValueList", "()Ljava/util/ArrayList;", "setValueList", "(Ljava/util/ArrayList;)V", "", "mDistributeList", "Ljava/util/List;", "getMDistributeList", "()Ljava/util/List;", "setMDistributeList", "(Ljava/util/List;)V", "Ltdc;", "mDistributeViewAdapter", "Ltdc;", "getMDistributeViewAdapter", "()Ltdc;", "setMDistributeViewAdapter", "(Ltdc;)V", "getBinding", "()Lyda;", "binding", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDetailDepthFragment extends BaseSportDetailFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SportDetailDepthFragment";

    @Nullable
    private yda _binding;

    @Nullable
    private SportDetailItemView itemView1;

    @Nullable
    private SportDetailItemView itemView2;

    @Nullable
    private LinearLayout itemViewContainer;

    @Nullable
    private List<uz6> mDistributeList;

    @Nullable
    private tdc mDistributeViewAdapter;

    @Nullable
    private RecyclerView recyclerDistribute;

    @Nullable
    private DataTitleSimpleView titleView;

    @Nullable
    private ArrayList<SportRecordItem> valueList;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailDepthFragment$Companion;", "", "<init>", "()V", "TAG", "", "switchDetailFragment", "", "sportValues", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", DailyRecordKey.sportType, "", "triathlonNum", "sportDetailType", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "mBasicReport", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void switchDetailFragment(@NotNull SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType, @Nullable FragmentManager fragmentManager, @Nullable SportBasicReport mBasicReport) {
            Intrinsics.checkNotNullParameter(sportValues, "sportValues");
            Bundle bundle = new Bundle();
            bundle.putSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES, sportValues);
            bundle.putInt("sport_type", sportType);
            bundle.putInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, sportDetailType);
            bundle.putSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_BASIC_REPORT, mBasicReport);
            BaseSportDetailFragment.Companion companion = BaseSportDetailFragment.INSTANCE;
            String strCreateFragmentTag = BaseSportDetailFragment.createFragmentTag(SportDetailDepthFragment.TAG, triathlonNum, sportType);
            int i = bsi.R;
            Intrinsics.checkNotNull(fragmentManager);
            BaseSportDetailFragment.switchFragment(i, SportDetailDepthFragment.class, strCreateFragmentTag, bundle, fragmentManager);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.inner.SportDetailDepthFragment$bindHeightData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.inner.SportDetailDepthFragment$bindHeightData$1", f = "SportDetailDepthFragment.kt", i = {0}, l = {141, 145}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<SportRecordItem> $heightList;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SportDetailDepthFragment this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.detail.inner.SportDetailDepthFragment$bindHeightData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.detail.inner.SportDetailDepthFragment$bindHeightData$1$1", f = "SportDetailDepthFragment.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
        public static final class C03901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Deferred<ArrayList<SportRecordItem>> $valueListTask;
            Object L$0;
            int label;
            final /* synthetic */ SportDetailDepthFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C03901(SportDetailDepthFragment sportDetailDepthFragment, Deferred<? extends ArrayList<SportRecordItem>> deferred, Continuation<? super C03901> continuation) {
                super(2, continuation);
                this.this$0 = sportDetailDepthFragment;
                this.$valueListTask = deferred;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C03901(this.this$0, this.$valueListTask, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                SportDetailDepthFragment sportDetailDepthFragment;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SportDetailDepthFragment sportDetailDepthFragment2 = this.this$0;
                    Deferred<ArrayList<SportRecordItem>> deferred = this.$valueListTask;
                    this.L$0 = sportDetailDepthFragment2;
                    this.label = 1;
                    Object objAwait = deferred.await(this);
                    if (objAwait == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sportDetailDepthFragment = sportDetailDepthFragment2;
                    obj = objAwait;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sportDetailDepthFragment = (SportDetailDepthFragment) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                sportDetailDepthFragment.setValueList((ArrayList) obj);
                SportDetailDepthFragment sportDetailDepthFragment3 = this.this$0;
                sportDetailDepthFragment3.printChartFloat(SportDetailDepthFragment.TAG, sportDetailDepthFragment3.getValueList());
                this.this$0.bindData();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C03901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<SportRecordItem> list, SportDetailDepthFragment sportDetailDepthFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$heightList = list;
            this.this$0 = sportDetailDepthFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$heightList, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    coroutineScope = (CoroutineScope) this.L$0;
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
            coroutineScope = (CoroutineScope) this.L$0;
            List<SportRecordItem> list = this.$heightList;
            this.L$0 = coroutineScope;
            this.label = 1;
            if (SportComputeUtil.computeMinMaxValue$default(list, null, this, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, Dispatchers.getIO(), null, new SportDetailDepthFragment$bindHeightData$1$valueListTask$1(this.$heightList, this.this$0, null), 2, null);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C03901 c03901 = new C03901(this.this$0, deferredAsync$default, null);
            this.L$0 = null;
            this.label = 2;
            if (BuildersKt.withContext(main, c03901, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindData() {
        YAxis axisRight;
        if (isInvalid()) {
            return;
        }
        CustomLineChart customLineChart = this.mLineChart;
        if (customLineChart != null && (axisRight = customLineChart.getAxisRight()) != null) {
            axisRight.r(true);
        }
        SportRecordListModel sportRecordListModelCreateEntryListInner = SportRecordDataUtil.createEntryListInner(this.valueList);
        List<SportRecordEntry> sportRecordList = sportRecordListModelCreateEntryListInner.getSportRecordList();
        if (sportRecordList.isEmpty()) {
            ImageView ivExpandView = getIvExpandView();
            if (ivExpandView != null) {
                ivExpandView.setVisibility(8);
            }
            CustomLineChart customLineChart2 = this.mLineChart;
            if (customLineChart2 != null) {
                customLineChart2.setVisibility(8);
                return;
            }
            return;
        }
        SportBasicReport mSportValues = getMSportValues();
        Intrinsics.checkNotNull(mSportValues);
        if (mSportValues.getMaxHeight() != null) {
            int i = j1j.r5;
            SportBasicReport mSportValues2 = getMSportValues();
            Intrinsics.checkNotNull(mSportValues2);
            Float maxHeight = mSportValues2.getMaxHeight();
            Intrinsics.checkNotNull(maxHeight);
            String string = getString(i, xr5.f(maxHeight.floatValue()));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            CustomLineChart customLineChart3 = this.mLineChart;
            Intrinsics.checkNotNull(customLineChart3);
            customLineChart3.setMaxStr(string);
        }
        SportBasicReport mSportValues3 = getMSportValues();
        if ((mSportValues3 != null ? mSportValues3.getAvgDivingDepth() : null) != null) {
            CustomLineChart customLineChart4 = this.mLineChart;
            Intrinsics.checkNotNull(customLineChart4);
            SportBasicReport mSportValues4 = getMSportValues();
            Intrinsics.checkNotNull(mSportValues4);
            Float avgDivingDepth = mSportValues4.getAvgDivingDepth();
            Intrinsics.checkNotNull(avgDivingDepth);
            CustomLineChart.setLimitLine$default(customLineChart4, avgDivingDepth.floatValue(), "", sportRecordListModelCreateEntryListInner.getValueRange(), 0.0f, 8, null);
        }
        CustomLineChart customLineChart5 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart5);
        customLineChart5.setChartKey(SportRecordKey.DivingDepth);
        CustomLineChart customLineChart6 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart6);
        CustomLineChart.bindData$default(customLineChart6, sportRecordList, LineDataSet.Mode.LINEAR, 0.0f, null, 0, 28, null);
        CustomLineChart customLineChart7 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart7);
        customLineChart7.animateX(2000);
    }

    private final void bindHeightData(Map<SportRecordKey, ? extends List<? extends Object>> map) {
        SportRecordKey sportRecordKey = SportRecordKey.DivingDepth;
        if (!map.containsKey(sportRecordKey)) {
            ImageView ivExpandView = getIvExpandView();
            if (ivExpandView != null) {
                ivExpandView.setVisibility(8);
            }
            CustomLineChart customLineChart = this.mLineChart;
            if (customLineChart != null) {
                customLineChart.setVisibility(8);
                return;
            }
            return;
        }
        List<? extends Object> list = map.get(sportRecordKey);
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.data.common.data.sport.SportRecordItem>");
        List<? extends Object> list2 = list;
        if (this.valueList == null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), Dispatchers.getIO(), null, new AnonymousClass1(list2, this, null), 2, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0056  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:9:0x0052  */
    private final void createDetailModelList() {
        SportDetailItemView sportDetailItemView;
        SportDetailItemView sportDetailItemView2;
        SportBasicReport mSportValues = getMSportValues();
        Intrinsics.checkNotNull(mSportValues);
        if (mSportValues.getAvgDivingDepth() != null) {
            SportBasicReport mSportValues2 = getMSportValues();
            Intrinsics.checkNotNull(mSportValues2);
            Float avgDivingDepth = mSportValues2.getAvgDivingDepth();
            Intrinsics.checkNotNull(avgDivingDepth);
            if (avgDivingDepth.floatValue() > 0.0f) {
                String string = getString(j1j.H2);
                SportBasicReport mSportValues3 = getMSportValues();
                Intrinsics.checkNotNull(mSportValues3);
                Float avgDivingDepth2 = mSportValues3.getAvgDivingDepth();
                Intrinsics.checkNotNull(avgDivingDepth2);
                rz5 rz5Var = new rz5(string, xr5.f(avgDivingDepth2.floatValue()));
                SportDetailItemView sportDetailItemView3 = this.itemView1;
                if (sportDetailItemView3 != null) {
                    SportDetailItemView.bindData$default(sportDetailItemView3, rz5Var, false, 2, null);
                }
            } else {
                sportDetailItemView = this.itemView1;
                if (sportDetailItemView != null) {
                    sportDetailItemView.setVisibility(8);
                }
            }
        } else {
            sportDetailItemView = this.itemView1;
            if (sportDetailItemView != null) {
                sportDetailItemView.setVisibility(8);
            }
        }
        SportBasicReport mSportValues4 = getMSportValues();
        Intrinsics.checkNotNull(mSportValues4);
        if (mSportValues4.getMaxDivingDepth() != null) {
            SportBasicReport mSportValues5 = getMSportValues();
            Intrinsics.checkNotNull(mSportValues5);
            Float maxDivingDepth = mSportValues5.getMaxDivingDepth();
            Intrinsics.checkNotNull(maxDivingDepth);
            if (maxDivingDepth.floatValue() > 0.0f) {
                String string2 = getString(j1j.n5);
                SportBasicReport mSportValues6 = getMSportValues();
                Intrinsics.checkNotNull(mSportValues6);
                Float maxDivingDepth2 = mSportValues6.getMaxDivingDepth();
                Intrinsics.checkNotNull(maxDivingDepth2);
                rz5 rz5Var2 = new rz5(string2, xr5.f(maxDivingDepth2.floatValue()));
                SportDetailItemView sportDetailItemView4 = this.itemView2;
                if (sportDetailItemView4 != null) {
                    SportDetailItemView.bindData$default(sportDetailItemView4, rz5Var2, false, 2, null);
                }
            } else {
                sportDetailItemView2 = this.itemView2;
                if (sportDetailItemView2 != null) {
                    sportDetailItemView2.setVisibility(8);
                }
            }
        } else {
            sportDetailItemView2 = this.itemView2;
            if (sportDetailItemView2 != null) {
                sportDetailItemView2.setVisibility(8);
            }
        }
        SportBasicReport mSportValues7 = getMSportValues();
        Float avgDivingDepth3 = mSportValues7 != null ? mSportValues7.getAvgDivingDepth() : null;
        SportBasicReport mSportValues8 = getMSportValues();
        BaseSportDetailFragment.reportCardInfo$default(this, avgDivingDepth3, mSportValues8 != null ? mSportValues8.getMaxDivingDepth() : null, null, 4, null);
    }

    private final List<uz6> createHeightDistributeModel(Context context, SportBasicReport sportValues) {
        ArrayList arrayList = new ArrayList();
        if (!SportBasicReportKt.showClimbDuration(sportValues)) {
            return arrayList;
        }
        Integer riseClimbDuration = sportValues.getRiseClimbDuration();
        int iIntValue = riseClimbDuration != null ? riseClimbDuration.intValue() : 0;
        Integer fallClimbDuration = sportValues.getFallClimbDuration();
        List<uz6> listCreateHeightDistributeModelList = createHeightDistributeModelList(context, new HeightDistribute(iIntValue, fallClimbDuration != null ? fallClimbDuration.intValue() : 0, sportValues.getDuration()));
        DistributeDataUtil.setPositionOfList(listCreateHeightDistributeModelList);
        return listCreateHeightDistributeModelList;
    }

    private final List<uz6> createHeightDistributeModelList(Context context, HeightDistribute heightDistribute) {
        LinkedList linkedList = new LinkedList();
        if (heightDistribute.getSumDuration() == 0) {
            return linkedList;
        }
        linkedList.add(new uz6(x44.a(dki.Y0), context.getString(j1j.h1), 8, heightDistribute.getRiseClimbDuration(), heightDistribute.getRisePer()));
        linkedList.add(new uz6(x44.a(dki.X0), context.getString(j1j.g1), 8, heightDistribute.getFlatDuration(), heightDistribute.getFlatPer()));
        linkedList.add(new uz6(x44.a(dki.W0), context.getString(j1j.f1), 8, heightDistribute.getFallClimbDuration(), heightDistribute.getFallPer()));
        return linkedList;
    }

    private final void displayHeightDist() {
        if (getMSportValues() == null) {
            RecyclerView recyclerView = this.recyclerDistribute;
            Intrinsics.checkNotNull(recyclerView);
            recyclerView.setVisibility(8);
            return;
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        SportBasicReport mSportValues = getMSportValues();
        Intrinsics.checkNotNull(mSportValues);
        List<uz6> listCreateHeightDistributeModel = createHeightDistributeModel(fragmentActivityRequireActivity, mSportValues);
        if (listCreateHeightDistributeModel != null) {
            List<uz6> list = listCreateHeightDistributeModel;
            if (!list.isEmpty()) {
                RecyclerView recyclerView2 = this.recyclerDistribute;
                Intrinsics.checkNotNull(recyclerView2);
                recyclerView2.setVisibility(0);
                List<uz6> list2 = this.mDistributeList;
                Intrinsics.checkNotNull(list2);
                list2.clear();
                List<uz6> list3 = this.mDistributeList;
                Intrinsics.checkNotNull(list3);
                list3.addAll(list);
                tdc tdcVar = this.mDistributeViewAdapter;
                Intrinsics.checkNotNull(tdcVar);
                tdcVar.notifyDataSetChanged();
                return;
            }
        }
        RecyclerView recyclerView3 = this.recyclerDistribute;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setVisibility(8);
    }

    private final void initChartData() {
        MutableLiveData<Map<SportRecordKey, List<Object>>> recordDetailMaps;
        MutableLiveData<Map<SportRecordKey, List<Object>>> triathlonRidMaps;
        SportRecordDetailViewModel detailViewModel;
        MutableLiveData<Map<SportRecordKey, List<Object>>> triathlonRunMaps;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        setDetailViewModel((SportRecordDetailViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(SportRecordDetailViewModel.class));
        if (getMSportValues() == null || isInvalid()) {
            return;
        }
        int mDetailSportType = getMDetailSportType();
        if (mDetailSportType == -1) {
            SportRecordDetailViewModel detailViewModel2 = getDetailViewModel();
            if (detailViewModel2 == null || (recordDetailMaps = detailViewModel2.getRecordDetailMaps()) == null) {
                return;
            }
            recordDetailMaps.observe(requireActivity(), new SportDetailDepthFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ien
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailDepthFragment.initChartData$lambda$0(this.f21062a, (Map) obj);
                }
            }));
            return;
        }
        if (mDetailSportType != 1) {
            if (mDetailSportType != 2 || (detailViewModel = getDetailViewModel()) == null || (triathlonRunMaps = detailViewModel.getTriathlonRunMaps()) == null) {
                return;
            }
            triathlonRunMaps.observe(requireActivity(), new SportDetailDepthFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ken
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailDepthFragment.initChartData$lambda$2(this.f23781a, (Map) obj);
                }
            }));
            return;
        }
        SportRecordDetailViewModel detailViewModel3 = getDetailViewModel();
        if (detailViewModel3 == null || (triathlonRidMaps = detailViewModel3.getTriathlonRidMaps()) == null) {
            return;
        }
        triathlonRidMaps.observe(requireActivity(), new SportDetailDepthFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: jen
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailDepthFragment.initChartData$lambda$1(this.f22713a, (Map) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initChartData$lambda$0(SportDetailDepthFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(map);
        this$0.bindHeightData(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initChartData$lambda$1(SportDetailDepthFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(map);
        this$0.bindHeightData(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initChartData$lambda$2(SportDetailDepthFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(map);
        this$0.bindHeightData(map);
        return Unit.INSTANCE;
    }

    private final void initDistributeRecycler() {
        this.mDistributeList = new ArrayList();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getMActivity(), 2);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.detail.inner.SportDetailDepthFragment.initDistributeRecycler.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                tdc mDistributeViewAdapter = SportDetailDepthFragment.this.getMDistributeViewAdapter();
                Intrinsics.checkNotNull(mDistributeViewAdapter);
                return mDistributeViewAdapter.isHeaderView(position) ? 2 : 1;
            }
        });
        RecyclerView recyclerView = this.recyclerDistribute;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(gridLayoutManager);
        bl5 bl5Var = new bl5();
        RecyclerView recyclerView2 = this.recyclerDistribute;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.addItemDecoration(bl5Var);
        RecyclerView recyclerView3 = this.recyclerDistribute;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setLayoutManager(gridLayoutManager);
        this.mDistributeViewAdapter = new tdc(requireActivity(), this.mDistributeList);
        RecyclerView recyclerView4 = this.recyclerDistribute;
        Intrinsics.checkNotNull(recyclerView4);
        recyclerView4.setAdapter(this.mDistributeViewAdapter);
        displayHeightDist();
    }

    private final void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            setMSportValues((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES));
            setMDetailSportType(bundle.getInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, -1));
            setMBasicReport((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_BASIC_REPORT));
        }
    }

    @NotNull
    public final yda getBinding() {
        yda ydaVar = this._binding;
        Intrinsics.checkNotNull(ydaVar);
        return ydaVar;
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    @NotNull
    public String getCardName() {
        return "depth";
    }

    @Nullable
    public final SportDetailItemView getItemView1() {
        return this.itemView1;
    }

    @Nullable
    public final SportDetailItemView getItemView2() {
        return this.itemView2;
    }

    @Nullable
    public final LinearLayout getItemViewContainer() {
        return this.itemViewContainer;
    }

    @Nullable
    public final List<uz6> getMDistributeList() {
        return this.mDistributeList;
    }

    @Nullable
    public final tdc getMDistributeViewAdapter() {
        return this.mDistributeViewAdapter;
    }

    @Nullable
    public final RecyclerView getRecyclerDistribute() {
        return this.recyclerDistribute;
    }

    @Nullable
    public final DataTitleSimpleView getTitleView() {
        return this.titleView;
    }

    @Nullable
    public final ArrayList<SportRecordItem> getValueList() {
        return this.valueList;
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    public boolean hasMaxMinAverage() {
        return true;
    }

    public final void initView() {
        initParamsFromBundle(getArguments());
        DataTitleSimpleView dataTitleSimpleView = this.titleView;
        Intrinsics.checkNotNull(dataTitleSimpleView);
        dataTitleSimpleView.bindData(hoi.l0, getString(j1j.T3));
        initIvExpandViewClick(SportRecordKey.DivingDepth);
        initBaseChart();
        initChartData();
        createDetailModelList();
        initDistributeRecycler();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this._binding = yda.A0(inflater, container, false);
        this.itemViewContainer = getBinding().F;
        this.itemView2 = getBinding().D;
        this.itemView1 = getBinding().C;
        this.recyclerDistribute = getBinding().E;
        this.titleView = getBinding().B;
        this.mLineChart = getBinding().A;
        setIvExpandView(getBinding().G);
        initView();
        View root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onNewIntent(@Nullable Bundle bundle) {
        super.onNewIntent(bundle);
        initParamsFromBundle(bundle);
    }

    public final void setItemView1(@Nullable SportDetailItemView sportDetailItemView) {
        this.itemView1 = sportDetailItemView;
    }

    public final void setItemView2(@Nullable SportDetailItemView sportDetailItemView) {
        this.itemView2 = sportDetailItemView;
    }

    public final void setItemViewContainer(@Nullable LinearLayout linearLayout) {
        this.itemViewContainer = linearLayout;
    }

    public final void setMDistributeList(@Nullable List<uz6> list) {
        this.mDistributeList = list;
    }

    public final void setMDistributeViewAdapter(@Nullable tdc tdcVar) {
        this.mDistributeViewAdapter = tdcVar;
    }

    public final void setRecyclerDistribute(@Nullable RecyclerView recyclerView) {
        this.recyclerDistribute = recyclerView;
    }

    public final void setTitleView(@Nullable DataTitleSimpleView dataTitleSimpleView) {
        this.titleView = dataTitleSimpleView;
    }

    public final void setValueList(@Nullable ArrayList<SportRecordItem> arrayList) {
        this.valueList = arrayList;
    }
}
