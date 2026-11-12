package com.xiaomi.fitness.detail.inner;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.data.LineDataSet;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.widget.SportDetailItemView;
import com.xiaomi.fitness.chart.entrys.SportRecordEntry;
import com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChart;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.detail.BaseSportDetailFragment;
import com.xiaomi.fitness.detail.inner.SportDetailRateFragment;
import com.xiaomi.fitness.detail.model.SportRecordListModel;
import com.xiaomi.fitness.detail.util.HrmUtil;
import com.xiaomi.fitness.detail.util.SportComputeUtil;
import com.xiaomi.fitness.detail.view.BubblePopupWindow;
import com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.util.SportRecordDataUtil;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import defpackage.a0o;
import defpackage.b0o;
import defpackage.bsi;
import defpackage.dki;
import defpackage.dn5;
import defpackage.hoi;
import defpackage.ifa;
import defpackage.j1j;
import defpackage.o5o;
import defpackage.pin;
import defpackage.rz5;
import defpackage.yd5;
import java.util.ArrayList;
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
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 U2\u00020\u0001:\u0001UB\u0007¢\u0006\u0004\bT\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J)\u0010\u000b\u001a\u00020\u00022\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010%\u001a\u00020$2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010#\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b'\u0010\u0010R$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00100\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00106\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00101\u001a\u0004\b7\u00103\"\u0004\b8\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R6\u0010?\u001a\u0016\u0012\u0004\u0012\u00020=\u0018\u00010<j\n\u0012\u0004\u0012\u00020=\u0018\u0001`>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR*\u0010G\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010N\u001a\u0004\u0018\u00010M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S¨\u0006V"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailRateFragment;", "Lcom/xiaomi/fitness/detail/BaseSportDetailFragment;", "", "initView", "()V", "initChartData", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "", "", "map", "bindHrData", "(Ljava/util/Map;)V", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "initParamsFromBundle", "(Landroid/os/Bundle;)V", "initDistributeRecycler", "displayHrmDist", "bindData", "", "type", "", "getHeartValueList", "(I)Ljava/util/List;", "", "getCardName", "()Ljava/lang/String;", "", "hasMaxMinAverage", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onNewIntent", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "titleView", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "getTitleView", "()Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "setTitleView", "(Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerBottom", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerBottom", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerBottom", "(Landroidx/recyclerview/widget/RecyclerView;)V", "recyclerDistribute", "getRecyclerDistribute", "setRecyclerDistribute", "Lifa;", "mBinding", "Lifa;", "Ljava/util/ArrayList;", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "Lkotlin/collections/ArrayList;", "valueList", "Ljava/util/ArrayList;", "getValueList", "()Ljava/util/ArrayList;", "setValueList", "(Ljava/util/ArrayList;)V", "", "Lb0o;", "mDistributeList", "Ljava/util/List;", "getMDistributeList", "()Ljava/util/List;", "setMDistributeList", "(Ljava/util/List;)V", "Lpin;", "mDistributeViewAdapter", "Lpin;", "getMDistributeViewAdapter", "()Lpin;", "setMDistributeViewAdapter", "(Lpin;)V", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDetailRateFragment extends BaseSportDetailFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SportDetailRateFragment";

    @Nullable
    private ifa mBinding;

    @Nullable
    private List<b0o> mDistributeList;

    @Nullable
    private pin mDistributeViewAdapter;

    @Nullable
    private RecyclerView recyclerBottom;

    @Nullable
    private RecyclerView recyclerDistribute;

    @Nullable
    private DataTitleSimpleView titleView;

    @Nullable
    private ArrayList<SportRecordItem> valueList;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailRateFragment$Companion;", "", "<init>", "()V", "TAG", "", "switchDetailFragment", "", "sportValues", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", DailyRecordKey.sportType, "", "triathlonNum", "sportDetailType", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "mBasicReport", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void switchDetailFragment$default(Companion companion, SportBasicReport sportBasicReport, int i, int i2, int i3, FragmentManager fragmentManager, SportBasicReport sportBasicReport2, int i4, Object obj) {
            if ((i4 & 32) != 0) {
                sportBasicReport2 = null;
            }
            companion.switchDetailFragment(sportBasicReport, i, i2, i3, fragmentManager, sportBasicReport2);
        }

        public final void switchDetailFragment(@NotNull SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType, @Nullable FragmentManager fragmentManager, @Nullable SportBasicReport mBasicReport) {
            Intrinsics.checkNotNullParameter(sportValues, "sportValues");
            Bundle bundle = new Bundle();
            bundle.putSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES, sportValues);
            bundle.putInt("sport_type", sportType);
            bundle.putInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, sportDetailType);
            bundle.putSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_BASIC_REPORT, mBasicReport);
            BaseSportDetailFragment.Companion companion = BaseSportDetailFragment.INSTANCE;
            String strCreateFragmentTag = BaseSportDetailFragment.createFragmentTag("SportDetailRateFragment", triathlonNum, sportType);
            int i = bsi.h0;
            Intrinsics.checkNotNull(fragmentManager);
            BaseSportDetailFragment.switchFragment(i, SportDetailRateFragment.class, strCreateFragmentTag, bundle, fragmentManager);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.inner.SportDetailRateFragment$bindHrData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.inner.SportDetailRateFragment$bindHrData$1", f = "SportDetailRateFragment.kt", i = {0, 1}, l = {140, 141, 151}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<SportRecordItem> $hrmList;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SportDetailRateFragment this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.detail.inner.SportDetailRateFragment$bindHrData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.detail.inner.SportDetailRateFragment$bindHrData$1$1", f = "SportDetailRateFragment.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
        public static final class C03961 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ boolean $abnormalState;
            final /* synthetic */ Deferred<ArrayList<SportRecordItem>> $valueListTask;
            Object L$0;
            int label;
            final /* synthetic */ SportDetailRateFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C03961(SportDetailRateFragment sportDetailRateFragment, Deferred<? extends ArrayList<SportRecordItem>> deferred, boolean z, Continuation<? super C03961> continuation) {
                super(2, continuation);
                this.this$0 = sportDetailRateFragment;
                this.$valueListTask = deferred;
                this.$abnormalState = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C03961(this.this$0, this.$valueListTask, this.$abnormalState, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                SportDetailRateFragment sportDetailRateFragment;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SportDetailRateFragment sportDetailRateFragment2 = this.this$0;
                    Deferred<ArrayList<SportRecordItem>> deferred = this.$valueListTask;
                    this.L$0 = sportDetailRateFragment2;
                    this.label = 1;
                    Object objAwait = deferred.await(this);
                    if (objAwait == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sportDetailRateFragment = sportDetailRateFragment2;
                    obj = objAwait;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sportDetailRateFragment = (SportDetailRateFragment) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                sportDetailRateFragment.setValueList((ArrayList) obj);
                SportDetailRateFragment sportDetailRateFragment3 = this.this$0;
                sportDetailRateFragment3.printChartInt("SportDetailRateFragment", sportDetailRateFragment3.getValueList());
                this.this$0.bindData();
                if (this.$abnormalState) {
                    DataTitleSimpleView titleView = this.this$0.getTitleView();
                    Intrinsics.checkNotNull(titleView);
                    titleView.setGuideIcon(hoi.J0, this.this$0.getAbnormalGuideListener());
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C03961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<SportRecordItem> list, SportDetailRateFragment sportDetailRateFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$hrmList = list;
            this.this$0 = sportDetailRateFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$hrmList, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0082 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            MainCoroutineDispatcher main;
            C03961 c03961;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    coroutineScope = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    coroutineScope = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope2 = coroutineScope;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope2, Dispatchers.getIO(), null, new SportDetailRateFragment$bindHrData$1$valueListTask$1(this.$hrmList, this.this$0, null), 2, null);
                    main = Dispatchers.getMain();
                    c03961 = new C03961(this.this$0, deferredAsync$default, zBooleanValue, null);
                    this.L$0 = null;
                    this.label = 3;
                    if (BuildersKt.withContext(main, c03961, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            List<SportRecordItem> list = this.$hrmList;
            this.L$0 = coroutineScope3;
            this.label = 1;
            if (SportComputeUtil.computeMinMaxValue$default(list, null, this, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope = coroutineScope3;
            SportRecordKey sportRecordKey = SportRecordKey.Hr;
            List<SportRecordItem> list2 = this.$hrmList;
            this.L$0 = coroutineScope;
            this.label = 2;
            obj = SportComputeUtil.computeAbnormalState(sportRecordKey, list2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            CoroutineScope coroutineScope4 = coroutineScope;
            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope4, Dispatchers.getIO(), null, new SportDetailRateFragment$bindHrData$1$valueListTask$1(this.$hrmList, this.this$0, null), 2, null);
            main = Dispatchers.getMain();
            c03961 = new C03961(this.this$0, deferredAsync$default2, zBooleanValue2, null);
            this.L$0 = null;
            this.label = 3;
            if (BuildersKt.withContext(main, c03961, this) == coroutine_suspended) {
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
        ArrayList<SportRecordItem> arrayList;
        Integer maxHr;
        Integer avgHr;
        Integer reserveHrZone;
        Integer avgHr2;
        Integer maxHr2;
        if (isInvalid() || (arrayList = this.valueList) == null) {
            return;
        }
        SportRecordListModel sportRecordListModelCreateEntryListInner = SportRecordDataUtil.createEntryListInner(arrayList);
        List<SportRecordEntry> sportRecordList = sportRecordListModelCreateEntryListInner.getSportRecordList();
        SportBasicReport mSportValues = getMSportValues();
        if (mSportValues != null && (maxHr2 = mSportValues.getMaxHr()) != null) {
            rz5 rz5Var = new rz5(getString(j1j.P7), String.valueOf(maxHr2.intValue()));
            SportDetailItemView itemViewRight = getItemViewRight();
            if (itemViewRight != null) {
                SportDetailItemView.bindData$default(itemViewRight, rz5Var, 0, false, false, 12, null);
            }
        }
        SportBasicReport mSportValues2 = getMSportValues();
        if (mSportValues2 != null && (avgHr2 = mSportValues2.getAvgHr()) != null) {
            int iIntValue = avgHr2.intValue();
            CustomLineChart customLineChart = this.mLineChart;
            Intrinsics.checkNotNull(customLineChart);
            CustomLineChart.setLimitLine$default(customLineChart, iIntValue, sportRecordListModelCreateEntryListInner.getValueRange(), 0.0f, 4, null);
            rz5 rz5Var2 = new rz5(getString(j1j.x7), String.valueOf(iIntValue));
            SportDetailItemView itemViewLeft = getItemViewLeft();
            if (itemViewLeft != null) {
                SportDetailItemView.bindData$default(itemViewLeft, rz5Var2, 0, false, false, 12, null);
            }
        }
        SportBasicReport mSportValues3 = getMSportValues();
        List<Float> heartValueList = getHeartValueList((mSportValues3 == null || (reserveHrZone = mSportValues3.getReserveHrZone()) == null) ? 0 : reserveHrZone.intValue());
        ArrayList arrayList2 = new ArrayList();
        ListExtKt.add(arrayList2, Integer.valueOf(ExtUtilsKt.getColor(dki.D)));
        ListExtKt.add(arrayList2, Integer.valueOf(ExtUtilsKt.getColor(dki.C)));
        ListExtKt.add(arrayList2, Integer.valueOf(ExtUtilsKt.getColor(dki.z)));
        ListExtKt.add(arrayList2, Integer.valueOf(ExtUtilsKt.getColor(dki.A)));
        ListExtKt.add(arrayList2, Integer.valueOf(ExtUtilsKt.getColor(dki.B)));
        CustomLineChart customLineChart2 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart2);
        customLineChart2.getAxisRight();
        CustomLineChart customLineChart3 = this.mLineChart;
        if (customLineChart3 != null) {
            customLineChart3.setChartKey(SportRecordKey.Hr);
        }
        CustomLineChart customLineChart4 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart4);
        CustomLineChart.bindData$default(customLineChart4, sportRecordList, LineDataSet.Mode.LINEAR, 0.0f, null, 0, 28, null);
        CustomLineChart customLineChart5 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart5);
        customLineChart5.animateX(2000);
        CustomLineChart customLineChart6 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart6);
        dn5 renderer = customLineChart6.getRenderer();
        Intrinsics.checkNotNull(renderer, "null cannot be cast to non-null type com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChartRenderer");
        ((yd5) renderer).setHeartLine(true, heartValueList, arrayList2);
        o5o.e().n(this.valueList);
        SportBasicReport mSportValues4 = getMSportValues();
        Float fValueOf = (mSportValues4 == null || (avgHr = mSportValues4.getAvgHr()) == null) ? null : Float.valueOf(avgHr.intValue());
        SportBasicReport mSportValues5 = getMSportValues();
        BaseSportDetailFragment.reportCardInfo$default(this, fValueOf, (mSportValues5 == null || (maxHr = mSportValues5.getMaxHr()) == null) ? null : Float.valueOf(maxHr.intValue()), null, 4, null);
    }

    private final void bindHrData(Map<SportRecordKey, ? extends List<? extends Object>> map) {
        if (isInvalid()) {
            return;
        }
        SportRecordKey sportRecordKey = SportRecordKey.Hr;
        if (map.containsKey(sportRecordKey)) {
            List<? extends Object> list = map.get(sportRecordKey);
            Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.data.common.data.sport.SportRecordItem>");
            List<? extends Object> list2 = list;
            if (this.valueList == null) {
                LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), Dispatchers.getIO(), null, new AnonymousClass1(list2, this, null), 2, null);
            }
        }
    }

    private final void displayHrmDist() {
        if (getMSportValues() == null) {
            RecyclerView recyclerView = this.recyclerDistribute;
            Intrinsics.checkNotNull(recyclerView);
            recyclerView.setVisibility(8);
            return;
        }
        HrmUtil hrmUtil = HrmUtil.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        SportBasicReport mSportValues = getMSportValues();
        Intrinsics.checkNotNull(mSportValues);
        SportBasicReport mSportValues2 = getMSportValues();
        List<b0o> listCreateHrmDistributeModel = hrmUtil.createHrmDistributeModel(fragmentActivityRequireActivity, mSportValues, mSportValues2 != null ? mSportValues2.getDuration() : 0);
        if (!(!listCreateHrmDistributeModel.isEmpty())) {
            RecyclerView recyclerView2 = this.recyclerDistribute;
            Intrinsics.checkNotNull(recyclerView2);
            recyclerView2.setVisibility(8);
            return;
        }
        RecyclerView recyclerView3 = this.recyclerDistribute;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setVisibility(0);
        List<b0o> list = this.mDistributeList;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<b0o> list2 = this.mDistributeList;
        Intrinsics.checkNotNull(list2);
        list2.addAll(listCreateHrmDistributeModel);
        pin pinVar = this.mDistributeViewAdapter;
        Intrinsics.checkNotNull(pinVar);
        pinVar.notifyDataSetChanged();
    }

    private final List<Float> getHeartValueList(int type) {
        Integer lowerLimitHeartRateZoneFive;
        Integer lowerLimitHeartRateZoneFour;
        Integer lowerLimitHeartRateZoneThree;
        Integer lowerLimitHeartRateZoneTwo;
        Integer lactateThresholdHeartRate;
        ArrayList arrayList = new ArrayList();
        int hrm = SportReportBaseParser.ReportType.maxWaterTemperature;
        if (type == 0) {
            UserProfile.RecordMaxHrm recordMaxHrm = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserProfile(true).getRecordMaxHrm();
            if (recordMaxHrm != null) {
                hrm = recordMaxHrm.getHrm();
            }
            float f = hrm;
            ListExtKt.add(arrayList, Float.valueOf(0.6f * f));
            ListExtKt.add(arrayList, Float.valueOf(0.7f * f));
            ListExtKt.add(arrayList, Float.valueOf(0.8f * f));
            ListExtKt.add(arrayList, Float.valueOf(f * 0.9f));
        } else if (type == 1) {
            UserProfile.RecordMaxHrm recordMaxHrm2 = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserProfile(true).getRecordMaxHrm();
            if (recordMaxHrm2 != null) {
                hrm = recordMaxHrm2.getHrm();
            }
            float f2 = hrm;
            ListExtKt.add(arrayList, Float.valueOf(0.6f * f2));
            ListExtKt.add(arrayList, Float.valueOf(0.7f * f2));
            ListExtKt.add(arrayList, Float.valueOf(0.8f * f2));
            ListExtKt.add(arrayList, Float.valueOf(f2 * 0.9f));
        } else if (type == 2) {
            UserProfile.RecordMaxHrm recordMaxHrm3 = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserProfile(true).getRecordMaxHrm();
            if (recordMaxHrm3 != null) {
                hrm = recordMaxHrm3.getHrm();
            }
            SportBasicReport mSportValues = getMSportValues();
            ListExtKt.add(arrayList, Float.valueOf((mSportValues == null || (lowerLimitHeartRateZoneTwo = mSportValues.getLowerLimitHeartRateZoneTwo()) == null) ? hrm * 0.72f : lowerLimitHeartRateZoneTwo.intValue()));
            SportBasicReport mSportValues2 = getMSportValues();
            ListExtKt.add(arrayList, Float.valueOf((mSportValues2 == null || (lowerLimitHeartRateZoneThree = mSportValues2.getLowerLimitHeartRateZoneThree()) == null) ? hrm * 0.72f : lowerLimitHeartRateZoneThree.intValue()));
            SportBasicReport mSportValues3 = getMSportValues();
            ListExtKt.add(arrayList, Float.valueOf((mSportValues3 == null || (lowerLimitHeartRateZoneFour = mSportValues3.getLowerLimitHeartRateZoneFour()) == null) ? hrm * 0.72f : lowerLimitHeartRateZoneFour.intValue()));
            SportBasicReport mSportValues4 = getMSportValues();
            ListExtKt.add(arrayList, Float.valueOf((mSportValues4 == null || (lowerLimitHeartRateZoneFive = mSportValues4.getLowerLimitHeartRateZoneFive()) == null) ? hrm * 0.72f : lowerLimitHeartRateZoneFive.intValue()));
        } else if (type != 3) {
            UserProfile.RecordMaxHrm recordMaxHrm4 = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserProfile(true).getRecordMaxHrm();
            if (recordMaxHrm4 != null) {
                hrm = recordMaxHrm4.getHrm();
            }
            float f3 = hrm;
            ListExtKt.add(arrayList, Float.valueOf(0.6f * f3));
            ListExtKt.add(arrayList, Float.valueOf(0.7f * f3));
            ListExtKt.add(arrayList, Float.valueOf(0.8f * f3));
            ListExtKt.add(arrayList, Float.valueOf(f3 * 0.9f));
        } else {
            SportBasicReport mSportValues5 = getMSportValues();
            float fIntValue = (mSportValues5 == null || (lactateThresholdHeartRate = mSportValues5.getLactateThresholdHeartRate()) == null) ? 170 : lactateThresholdHeartRate.intValue();
            ListExtKt.add(arrayList, Float.valueOf(0.8f * fIntValue));
            ListExtKt.add(arrayList, Float.valueOf(0.89f * fIntValue));
            ListExtKt.add(arrayList, Float.valueOf(0.97f * fIntValue));
            ListExtKt.add(arrayList, Float.valueOf(fIntValue * 0.102f));
        }
        return arrayList;
    }

    private final void initChartData() {
        MutableLiveData<Map<SportRecordKey, List<Object>>> recordDetailMaps;
        MutableLiveData<Map<SportRecordKey, List<Object>>> triathlonSwimMaps;
        MutableLiveData<Map<SportRecordKey, List<Object>>> triathlonRidMaps;
        SportRecordDetailViewModel detailViewModel;
        MutableLiveData<Map<SportRecordKey, List<Object>>> triathlonRunMaps;
        initDetailViewModel();
        if (getMSportValues() == null || isInvalid()) {
            return;
        }
        int mDetailSportType = getMDetailSportType();
        if (mDetailSportType == -1) {
            SportRecordDetailViewModel detailViewModel2 = getDetailViewModel();
            if (detailViewModel2 == null || (recordDetailMaps = detailViewModel2.getRecordDetailMaps()) == null) {
                return;
            }
            recordDetailMaps.observe(requireActivity(), new SportDetailRateFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ain
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailRateFragment.initChartData$lambda$1(this.f1068a, (Map) obj);
                }
            }));
            return;
        }
        if (mDetailSportType == 0) {
            SportRecordDetailViewModel detailViewModel3 = getDetailViewModel();
            if (detailViewModel3 == null || (triathlonSwimMaps = detailViewModel3.getTriathlonSwimMaps()) == null) {
                return;
            }
            triathlonSwimMaps.observe(requireActivity(), new SportDetailRateFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: din
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailRateFragment.initChartData$lambda$4(this.f15570a, (Map) obj);
                }
            }));
            return;
        }
        if (mDetailSportType != 1) {
            if (mDetailSportType != 2 || (detailViewModel = getDetailViewModel()) == null || (triathlonRunMaps = detailViewModel.getTriathlonRunMaps()) == null) {
                return;
            }
            triathlonRunMaps.observe(requireActivity(), new SportDetailRateFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: bin
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailRateFragment.initChartData$lambda$2(this.f4256a, (Map) obj);
                }
            }));
            return;
        }
        SportRecordDetailViewModel detailViewModel4 = getDetailViewModel();
        if (detailViewModel4 == null || (triathlonRidMaps = detailViewModel4.getTriathlonRidMaps()) == null) {
            return;
        }
        triathlonRidMaps.observe(requireActivity(), new SportDetailRateFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: cin
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailRateFragment.initChartData$lambda$3(this.f5382a, (Map) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initChartData$lambda$1(SportDetailRateFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(map);
        this$0.bindHrData(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initChartData$lambda$2(SportDetailRateFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(map);
        this$0.bindHrData(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initChartData$lambda$3(SportDetailRateFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(map);
        this$0.bindHrData(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initChartData$lambda$4(SportDetailRateFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(map);
        this$0.bindHrData(map);
        return Unit.INSTANCE;
    }

    private final void initDistributeRecycler() {
        this.mDistributeList = new ArrayList();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getMActivity());
        RecyclerView recyclerView = this.recyclerDistribute;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
        a0o a0oVar = new a0o();
        RecyclerView recyclerView2 = this.recyclerDistribute;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.addItemDecoration(a0oVar);
        RecyclerView recyclerView3 = this.recyclerDistribute;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setLayoutManager(linearLayoutManager);
        pin pinVar = new pin(requireActivity(), this.mDistributeList, null, 3);
        this.mDistributeViewAdapter = pinVar;
        pinVar.j(false);
        RecyclerView recyclerView4 = this.recyclerDistribute;
        Intrinsics.checkNotNull(recyclerView4);
        recyclerView4.setAdapter(this.mDistributeViewAdapter);
        displayHrmDist();
    }

    private final void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            setMSportValues((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES));
            setMDetailSportType(bundle.getInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, -1));
            setMBasicReport((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_BASIC_REPORT));
        }
    }

    private final void initView() {
        initParamsFromBundle(getArguments());
        DataTitleSimpleView dataTitleSimpleView = this.titleView;
        Intrinsics.checkNotNull(dataTitleSimpleView);
        dataTitleSimpleView.bindData(hoi.I0, getString(j1j.d5));
        setAbnormalGuideListener(new View.OnClickListener() { // from class: ein
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportDetailRateFragment.initView$lambda$0(this.f16691a, view);
            }
        });
        initIvExpandViewClick(SportRecordKey.Hr);
        initDistributeRecycler();
        initBaseChart();
        initChartData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(SportDetailRateFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getContext() != null) {
            Context contextRequireContext = this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            String string = this$0.getString(j1j.f6);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            BubblePopupWindow bubblePopupWindowCreateAbnormalBubblePop = this$0.createAbnormalBubblePop(contextRequireContext, string);
            DataTitleSimpleView dataTitleSimpleView = this$0.titleView;
            Intrinsics.checkNotNull(dataTitleSimpleView);
            ImageView imgGuide = dataTitleSimpleView.getImgGuide();
            Intrinsics.checkNotNull(imgGuide);
            bubblePopupWindowCreateAbnormalBubblePop.show(imgGuide);
        }
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    @NotNull
    public String getCardName() {
        return "heart_rate";
    }

    @Nullable
    public final List<b0o> getMDistributeList() {
        return this.mDistributeList;
    }

    @Nullable
    public final pin getMDistributeViewAdapter() {
        return this.mDistributeViewAdapter;
    }

    @Nullable
    public final RecyclerView getRecyclerBottom() {
        return this.recyclerBottom;
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

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        ifa ifaVarA0 = ifa.A0(inflater, container, false);
        this.mBinding = ifaVarA0;
        Intrinsics.checkNotNull(ifaVarA0);
        this.recyclerBottom = ifaVarA0.H;
        ifa ifaVar = this.mBinding;
        Intrinsics.checkNotNull(ifaVar);
        this.recyclerDistribute = ifaVar.I;
        ifa ifaVar2 = this.mBinding;
        Intrinsics.checkNotNull(ifaVar2);
        this.titleView = ifaVar2.B;
        ifa ifaVar3 = this.mBinding;
        Intrinsics.checkNotNull(ifaVar3);
        this.mLineChart = ifaVar3.A;
        ifa ifaVar4 = this.mBinding;
        Intrinsics.checkNotNull(ifaVar4);
        setItemViewLeft(ifaVar4.C);
        ifa ifaVar5 = this.mBinding;
        Intrinsics.checkNotNull(ifaVar5);
        setItemViewRight(ifaVar5.D);
        ifa ifaVar6 = this.mBinding;
        Intrinsics.checkNotNull(ifaVar6);
        setIvExpandView(ifaVar6.F);
        initView();
        ifa ifaVar7 = this.mBinding;
        Intrinsics.checkNotNull(ifaVar7);
        View root = ifaVar7.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onNewIntent(@Nullable Bundle bundle) {
        super.onNewIntent(bundle);
        initParamsFromBundle(bundle);
    }

    public final void setMDistributeList(@Nullable List<b0o> list) {
        this.mDistributeList = list;
    }

    public final void setMDistributeViewAdapter(@Nullable pin pinVar) {
        this.mDistributeViewAdapter = pinVar;
    }

    public final void setRecyclerBottom(@Nullable RecyclerView recyclerView) {
        this.recyclerBottom = recyclerView;
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
