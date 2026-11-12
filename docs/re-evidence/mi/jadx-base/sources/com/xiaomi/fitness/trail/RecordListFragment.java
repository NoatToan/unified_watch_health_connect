package com.xiaomi.fitness.trail;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.util.FitnessSportTypeUtils;
import com.xiaomi.fit.fitness.export.api.SportSummaryApi;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.SystemProperties;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.detail.SportDetailCommonFragment;
import com.xiaomi.fitness.detail.SportDetailGpsFragment;
import com.xiaomi.fitness.detail.SportDetailTriathlonFragment;
import com.xiaomi.fitness.map.export.MapDynamicUtils;
import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzerAlpha;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.trail.RecordListFragment;
import com.xiaomi.fitness.trail.adapter.RecordListAdapter;
import com.xiaomi.fitness.trail.viewmodel.RecordListVM;
import com.xiaomi.fitness.trail.viewmodel.RecordMainVM;
import com.xiaomi.fitness.trail.widget.DeleteRecordPopupWindow;
import defpackage.av6;
import defpackage.dqp;
import defpackage.ivi;
import defpackage.j1j;
import defpackage.lp5;
import defpackage.wc0;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import miuix.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 :2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001:B\u0007¢\u0006\u0004\b9\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00042\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\u0006J\u000f\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\u0006R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\"\u00100\u001a\u00020/8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006;"}, d2 = {"Lcom/xiaomi/fitness/trail/RecordListFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/trail/viewmodel/RecordListVM;", "Ldqp;", "", "reqData", "()V", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "record", "Landroid/view/View;", "itemView", "showDeletePopupWindow", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Landroid/view/View;)V", "", "dp", "dp2Px", "(I)I", "showDeleteConfirmDialog", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)V", "", SleepAnalyzerAlpha.NAME_ALPHA, "setWindowAlpha", "(F)V", "", "list", "onDataOk", "(Ljava/util/List;)V", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_DESTROY, "", "timeDim", "Ljava/lang/String;", "category", "Lcom/xiaomi/fitness/trail/adapter/RecordListAdapter;", "adapter", "Lcom/xiaomi/fitness/trail/adapter/RecordListAdapter;", "Lcom/xiaomi/fitness/trail/viewmodel/RecordMainVM;", "activityVM$delegate", "Lkotlin/Lazy;", "getActivityVM", "()Lcom/xiaomi/fitness/trail/viewmodel/RecordMainVM;", "activityVM", "Lcom/xiaomi/fit/fitness/export/api/SportSummaryApi;", "summaryApi", "Lcom/xiaomi/fit/fitness/export/api/SportSummaryApi;", "getSummaryApi", "()Lcom/xiaomi/fit/fitness/export/api/SportSummaryApi;", "setSummaryApi", "(Lcom/xiaomi/fit/fitness/export/api/SportSummaryApi;)V", "", "isExpandedState", "Z", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nRecordListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordListFragment.kt\ncom/xiaomi/fitness/trail/RecordListFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,270:1\n106#2,15:271\n*S KotlinDebug\n*F\n+ 1 RecordListFragment.kt\ncom/xiaomi/fitness/trail/RecordListFragment\n*L\n49#1:271,15\n*E\n"})
public final class RecordListFragment extends Hilt_RecordListFragment<RecordListVM, dqp> {
    private static final int BAR_CHART_VIEW_COL_SIZE = 2;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int EXPANDED_STATE_PLACEHOLDER_COL_SIZE = 1;
    private static final int EXPANDED_STATE_SPORT_RECORD_COL_SIZE = 1;
    private static final int FOLDED_STATE_PLACEHOLDER_COL_SIZE = 0;
    private static final int FOLDED_STATE_SPORT_RECORD_COL_SIZE = 2;
    private static final int MONTH_SEPARATOR_COL_SIZE = 2;

    /* JADX INFO: renamed from: activityVM$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy activityVM;

    @Nullable
    private RecordListAdapter adapter;

    @NotNull
    private String category;
    private boolean isExpandedState;
    public SportSummaryApi summaryApi;
    private String timeDim;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/trail/RecordListFragment$Companion;", "", "<init>", "()V", "EXPANDED_STATE_SPORT_RECORD_COL_SIZE", "", "EXPANDED_STATE_PLACEHOLDER_COL_SIZE", "FOLDED_STATE_SPORT_RECORD_COL_SIZE", "FOLDED_STATE_PLACEHOLDER_COL_SIZE", "BAR_CHART_VIEW_COL_SIZE", "MONTH_SEPARATOR_COL_SIZE", "instance", "Lcom/xiaomi/fitness/trail/RecordListFragment;", "category", "", "timeDim", StatConstants.PARAM_START, "", StatConstants.PARAM_END, "position", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RecordListFragment instance(@NotNull String category, @NotNull String timeDim, long start, long end, int position) {
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(timeDim, "timeDim");
            RecordListFragment recordListFragment = new RecordListFragment();
            Bundle bundle = new Bundle();
            bundle.putString(RecordMainActivityKt.KEY_SPORT_TYPE, category);
            bundle.putString(RecordMainActivityKt.KEY_DIMEN, timeDim);
            bundle.putInt(RecordMainActivityKt.KEY_POS, position);
            bundle.putLong(RecordMainActivityKt.KEY_START, start);
            bundle.putLong(RecordMainActivityKt.KEY_END, end);
            recordListFragment.setArguments(bundle);
            return recordListFragment;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.trail.RecordListFragment$onViewCreated$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.trail.RecordListFragment$onViewCreated$6", f = "RecordListFragment.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass6 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass6(Continuation<? super AnonymousClass6> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RecordListFragment.this.new AnonymousClass6(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow<String> categoryEmitter = RecordListFragment.this.getActivityVM().getCategoryEmitter();
                final RecordListFragment recordListFragment = RecordListFragment.this;
                FlowCollector<? super String> flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.trail.RecordListFragment.onViewCreated.6.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((String) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(String str, Continuation<? super Unit> continuation) {
                        String str2 = recordListFragment.timeDim;
                        if (str2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("timeDim");
                            str2 = null;
                        }
                        Logger.d("SRecordListFra", "onViewCreated: category changed, " + str2);
                        RecordListAdapter recordListAdapter = recordListFragment.adapter;
                        if (recordListAdapter != null) {
                            recordListAdapter.setCategory(recordListFragment.getActivityVM().getCategory());
                        }
                        recordListFragment.reqData();
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (categoryEmitter.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Unit> continuation) {
            return ((AnonymousClass6) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public RecordListFragment() {
        super(ivi.h2);
        this.category = "";
        final Function0 function0 = new Function0() { // from class: m7k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecordListFragment.activityVM_delegate$lambda$0(this.f25845a);
            }
        };
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.xiaomi.fitness.trail.RecordListFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function1 = null;
        this.activityVM = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(RecordMainVM.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.fitness.trail.RecordListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m39viewModels$lambda1(lazy).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "owner.viewModelStore");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.xiaomi.fitness.trail.RecordListFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = function1;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM39viewModels$lambda1 = FragmentViewModelLazyKt.m39viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM39viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM39viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.fitness.trail.RecordListFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM39viewModels$lambda1 = FragmentViewModelLazyKt.m39viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM39viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM39viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ RecordListVM access$getMViewModel(RecordListFragment recordListFragment) {
        return (RecordListVM) recordListFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelStoreOwner activityVM_delegate$lambda$0(RecordListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return fragmentActivityRequireActivity;
    }

    private final int dp2Px(int dp) {
        Resources resources;
        Context context = getContext();
        DisplayMetrics displayMetrics = (context == null || (resources = context.getResources()) == null) ? null : resources.getDisplayMetrics();
        Intrinsics.checkNotNull(displayMetrics);
        return (int) ((dp * displayMetrics.density) + 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecordMainVM getActivityVM() {
        return (RecordMainVM) this.activityVM.getValue();
    }

    private final void onDataOk(List<SportBasicReport> list) {
        List<SportBasicReport> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            RecordListAdapter recordListAdapter = this.adapter;
            if (recordListAdapter != null) {
                LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                recordListAdapter.setData(list, viewLifecycleOwner);
            }
            showContent();
            return;
        }
        RecordListAdapter recordListAdapter2 = this.adapter;
        if (recordListAdapter2 != null) {
            List<SportBasicReport> listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
            recordListAdapter2.setData(listEmptyList, viewLifecycleOwner2);
        }
        PageState.DefaultImpls.showEmpty$default(this, 0, 0, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(RecordListFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onDataOk(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(final RecordListFragment this$0, SportBasicReport it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        final Bundle bundle = new Bundle();
        int iA = lp5.a(it);
        bundle.putLong("time_stamp", it.getTimeStamp());
        bundle.putSerializable("sport_report", it);
        bundle.putInt("sport_type", iA);
        bundle.putString("sport_source", "workout_list_page");
        if (iA == 36) {
            MapDynamicUtils.INSTANCE.checkSoLoaded(this$0.getActivity(), new Function2() { // from class: n7k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecordListFragment.onViewCreated$lambda$4$lambda$2(this.f27622a, bundle, ((Boolean) obj).booleanValue(), (Exception) obj2);
                }
            });
        } else if (FitnessSportTypeUtils.INSTANCE.supportGpsSport(it)) {
            MapDynamicUtils.INSTANCE.checkSoLoaded(this$0.getActivity(), new Function2() { // from class: o7k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecordListFragment.onViewCreated$lambda$4$lambda$3(this.f28823a, bundle, ((Boolean) obj).booleanValue(), (Exception) obj2);
                }
            });
        } else {
            BaseFragmentExKt.gotoPage(this$0, SportDetailCommonFragment.class, bundle);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4$lambda$2(RecordListFragment this$0, Bundle bundle, boolean z, Exception exc) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        if (z) {
            BaseFragmentExKt.gotoPage(this$0, SportDetailTriathlonFragment.class, bundle);
        } else {
            Object[] objArr = new Object[2];
            objArr[0] = "check so load exception:" + (exc != null ? exc.getMessage() : null);
            objArr[1] = exc;
            Logger.e(BaseFragment.TAG, objArr);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4$lambda$3(RecordListFragment this$0, Bundle bundle, boolean z, Exception exc) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        if (z) {
            BaseFragmentExKt.gotoPage(this$0, SportDetailGpsFragment.class, bundle);
        } else {
            Object[] objArr = new Object[2];
            objArr[0] = "check so load exception:" + (exc != null ? exc.getMessage() : null);
            objArr[1] = exc;
            Logger.e(BaseFragment.TAG, objArr);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5(RecordListFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.reqData();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6(RecordListFragment this$0, SportBasicReport record, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(view, "view");
        this$0.showDeletePopupWindow(record, view);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void reqData() {
        String str = this.timeDim;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timeDim");
            str = null;
        }
        Logger.d("SRecordListFra", "reqData: dim = " + str + ", category = " + getActivityVM().getCategory());
        ((RecordListVM) getMViewModel()).getRecord(getActivityVM().getCategory());
        this.category = getActivityVM().getCategory();
    }

    private final void setWindowAlpha(float alpha) {
        Window window;
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = alpha;
        window.addFlags(2);
        window.setAttributes(attributes);
    }

    private final void showDeleteConfirmDialog(final SportBasicReport record) {
        new CommonDialog.c("delete sport record").setDialogTitle(j1j.O0).setDialogDescription(j1j.N0).setPositiveText(j1j.c).setNegativeText(j1j.f22329b).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.trail.RecordListFragment.showDeleteConfirmDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which != -2) {
                    if (which != -1) {
                        return;
                    }
                    RecordListFragment.access$getMViewModel(RecordListFragment.this).deleteRecord(record);
                } else if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }).showIfNeed(getParentFragmentManager());
    }

    private final void showDeletePopupWindow(final SportBasicReport record, View itemView) {
        try {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            final DeleteRecordPopupWindow deleteRecordPopupWindow = new DeleteRecordPopupWindow(contextRequireContext);
            deleteRecordPopupWindow.setOnBtnClickListener(new View.OnClickListener() { // from class: k7k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RecordListFragment.showDeletePopupWindow$lambda$10$lambda$8(deleteRecordPopupWindow, this, record, view);
                }
            });
            deleteRecordPopupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l7k
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    RecordListFragment.showDeletePopupWindow$lambda$10$lambda$9(this.f24747a);
                }
            });
            setWindowAlpha(0.3f);
            int[] iArr = new int[2];
            itemView.getLocationOnScreen(iArr);
            Logger.d("showUnbindWindow " + iArr[0] + iArr[1], new Object[0]);
            deleteRecordPopupWindow.showAtLocation(itemView, (AppUtil.isRTLDirection() ? 8388611 : 8388613) | 48, dp2Px(15), iArr[1] + dp2Px(10));
        } catch (Exception e) {
            Logger.e("showDeletePopupWindow: " + e, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDeletePopupWindow$lambda$10$lambda$8(DeleteRecordPopupWindow this_apply, RecordListFragment this$0, SportBasicReport record, View view) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(record, "$record");
        this_apply.dismiss();
        this$0.showDeleteConfirmDialog(record);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDeletePopupWindow$lambda$10$lambda$9(RecordListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setWindowAlpha(1.0f);
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

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.adapter = null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        reqData();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ea  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String string;
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Logger.d("RecordListFragment", "onViewCreated running");
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.hide();
        }
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString(RecordMainActivityKt.KEY_DIMEN)) == null) {
            string = SportDataTypeKt.DIMEN_MONTHLY;
        }
        this.timeDim = string;
        Bundle arguments2 = getArguments();
        boolean z = false;
        int i = arguments2 != null ? arguments2.getInt(RecordMainActivityKt.KEY_POS) : 0;
        Bundle arguments3 = getArguments();
        long j = arguments3 != null ? arguments3.getLong(RecordMainActivityKt.KEY_START) : 0L;
        Bundle arguments4 = getArguments();
        long j2 = arguments4 != null ? arguments4.getLong(RecordMainActivityKt.KEY_END) : 0L;
        Fragment parentFragment = getParentFragment();
        DimenPeriodFragment dimenPeriodFragment = parentFragment instanceof DimenPeriodFragment ? (DimenPeriodFragment) parentFragment : null;
        if (dimenPeriodFragment != null) {
            dimenPeriodFragment.setIndicatorPos(i);
        }
        this.category = getActivityVM().getCategory();
        ((RecordListVM) getMViewModel()).getResultEmitter().observe(getViewLifecycleOwner(), new RecordListFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: g7k
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RecordListFragment.onViewCreated$lambda$1(this.f18690a, (List) obj);
            }
        }));
        String str2 = this.timeDim;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timeDim");
            str2 = null;
        }
        Logger.i("SRecordListFra", "RecordChartHolder onViewCreated: dim = " + str2 + "; start = " + TimeDateUtil.getDateYYYYMMdd(j) + "; end = " + TimeDateUtil.getDateYYYYMMdd(j2));
        SystemProperties systemProperties = SystemProperties.INSTANCE;
        if (!systemProperties.isFoldDisplay()) {
            z = true;
        } else if (systemProperties.isFoldDisplay()) {
            SettingsPropertiesUtil settingsPropertiesUtil = SettingsPropertiesUtil.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            if (settingsPropertiesUtil.isFolded(fragmentActivityRequireActivity)) {
                z = true;
            }
        }
        this.isExpandedState = !z;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        String str3 = this.timeDim;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timeDim");
            str = null;
        } else {
            str = str3;
        }
        RecordListAdapter recordListAdapter = new RecordListAdapter(contextRequireContext, str, getActivityVM().getCategory(), j, j2, this.isExpandedState, new Function1() { // from class: h7k
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RecordListFragment.onViewCreated$lambda$4(this.f19781a, (SportBasicReport) obj);
            }
        });
        this.adapter = recordListAdapter;
        recordListAdapter.setSummaryApi(getSummaryApi());
        ((RecordListVM) getMViewModel()).getDeleteResult().observe(getViewLifecycleOwner(), new RecordListFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: i7k
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RecordListFragment.onViewCreated$lambda$5(this.f20863a, (Boolean) obj);
            }
        }));
        RecordListAdapter recordListAdapter2 = this.adapter;
        if (recordListAdapter2 != null) {
            recordListAdapter2.setOnLongClickListener(new Function2() { // from class: j7k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecordListFragment.onViewCreated$lambda$6(this.f22499a, (SportBasicReport) obj, (View) obj2);
                }
            });
        }
        boolean z2 = this.isExpandedState;
        final int i2 = z2 ? 1 : 2;
        RecyclerView recyclerView = ((dqp) getMBinding()).A;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 2);
        final int i3 = 2;
        final int i4 = 2;
        final int i5 = z2 ? 1 : 0;
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.trail.RecordListFragment$onViewCreated$5$1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                RecordListAdapter recordListAdapter3 = this.this$0.adapter;
                Integer numValueOf = recordListAdapter3 != null ? Integer.valueOf(recordListAdapter3.getItemViewType(position)) : null;
                if (numValueOf != null && numValueOf.intValue() == 1) {
                    return i2;
                }
                if (numValueOf != null && numValueOf.intValue() == 3) {
                    return i5;
                }
                if (numValueOf != null && numValueOf.intValue() == 0) {
                    return i3;
                }
                if (numValueOf != null && numValueOf.intValue() == 2) {
                    return i4;
                }
                return 2;
            }
        });
        recyclerView.setLayoutManager(gridLayoutManager);
        ((dqp) getMBinding()).A.setAdapter(this.adapter);
        ((RecordListVM) getMViewModel()).setPeriod(j, j2);
        launchOnLifecycleScope(new AnonymousClass6(null));
    }

    public final void setSummaryApi(@NotNull SportSummaryApi sportSummaryApi) {
        Intrinsics.checkNotNullParameter(sportSummaryApi, "<set-?>");
        this.summaryApi = sportSummaryApi;
    }
}
