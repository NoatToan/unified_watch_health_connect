package com.huami.training.ui.fit;

import android.content.ComponentCallbacks;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.di.koin.ScopesAndQualifersKt;
import com.huami.training.dto.Difficulty;
import com.huami.training.dto.PromotePlace;
import com.huami.training.dto.TrainingPlanState;
import com.huami.training.ext.ImageViewExKt;
import com.huami.training.ext.ViewExKt;
import com.huami.training.navigation.NavigationController;
import com.huami.training.ui.R;
import com.huami.training.ui.fit.MiDongFitFragment;
import com.huami.training.ui.joined.JoinedCourseViewHolder;
import com.huami.training.ui.promotion.PromotionalCourseFragment;
import com.huami.training.utils.AnalyticsHelper;
import com.huami.training.utils.CountListItemVisitHelper;
import com.huami.training.utils.FragmentTrackHelper;
import com.huami.training.utils.FragmentTrackHelperKt;
import com.huami.training.vo.JoinedCourseVo;
import com.huami.training.vo.Resource;
import com.huami.training.vo.TrainingPlanVo;
import com.huami.widget.typeface.TypefaceTextView;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b/\u00100J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J&\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0013H\u0016R\u001d\u0010\u001d\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010*\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00062"}, d2 = {"Lcom/huami/training/ui/fit/MiDongFitFragment;", "Landroidx/fragment/app/Fragment;", "", SOAP.XMLNS, "o", "l", DTransferConstants.SEARCH_KEY, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onResume", "onPause", "", "isVisibleToUser", "setUserVisibleHint", "hidden", "onHiddenChanged", "Lcom/huami/training/navigation/NavigationController;", "a", "Lkotlin/Lazy;", z.j, "()Lcom/huami/training/navigation/NavigationController;", "navigationController", "Lcom/huami/training/ui/fit/FitViewModel;", "b", hl.k, "()Lcom/huami/training/ui/fit/FitViewModel;", "viewModel", "c", "Z", "hasObserved", "Lcom/huami/training/ui/fit/MiDongFitFragment$JoinedTrainingsAdapter;", GoogleApiAvailabilityLight.a, "i", "()Lcom/huami/training/ui/fit/MiDongFitFragment$JoinedTrainingsAdapter;", "joinedTrainingsAdapter", "Lcom/huami/training/utils/FragmentTrackHelper;", "e", "Lcom/huami/training/utils/FragmentTrackHelper;", "trackHelper", "<init>", "()V", "JoinedTrainingsAdapter", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class MiDongFitFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean hasObserved;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy joinedTrainingsAdapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final FragmentTrackHelper trackHelper;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\b\u0006*\u0001!\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\u0014\u0010\u0011\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fR0\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"¨\u0006&"}, d2 = {"Lcom/huami/training/ui/fit/MiDongFitFragment$JoinedTrainingsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/training/ui/joined/JoinedCourseViewHolder;", "", "position", "Lcom/huami/training/vo/JoinedCourseVo;", "b", "Landroid/view/ViewGroup;", "parent", "viewType", GoogleApiAvailabilityLight.a, "holder", "", "c", "getItemCount", "", "list", "setNewData", "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", "getOnItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "onItemClickListener", "", "Ljava/util/List;", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "dataList", "com/huami/training/ui/fit/MiDongFitFragment$JoinedTrainingsAdapter$countItemVisitHelper$1", "Lcom/huami/training/ui/fit/MiDongFitFragment$JoinedTrainingsAdapter$countItemVisitHelper$1;", "countItemVisitHelper", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class JoinedTrainingsAdapter extends RecyclerView.Adapter<JoinedCourseViewHolder> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private Function1<? super JoinedCourseVo, Unit> onItemClickListener;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private List<JoinedCourseVo> dataList = new ArrayList();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final MiDongFitFragment$JoinedTrainingsAdapter$countItemVisitHelper$1 countItemVisitHelper = new CountListItemVisitHelper<JoinedCourseVo>() { // from class: com.huami.training.ui.fit.MiDongFitFragment$JoinedTrainingsAdapter$countItemVisitHelper$1
            @Override // com.huami.training.utils.CountListItemVisitHelper
            public void count(int position, @NotNull JoinedCourseVo v) {
                AnalyticsHelper.INSTANCE.countJoinedCourseVisitInFitness(v.getId());
            }
        };

        private final JoinedCourseVo b(int position) {
            return this.dataList.get(position);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(JoinedTrainingsAdapter joinedTrainingsAdapter, JoinedCourseViewHolder joinedCourseViewHolder, View view) {
            Function1<JoinedCourseVo, Unit> onItemClickListener = joinedTrainingsAdapter.getOnItemClickListener();
            if (onItemClickListener == null) {
                return;
            }
            onItemClickListener.invoke(joinedTrainingsAdapter.b(joinedCourseViewHolder.getAdapterPosition()));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull JoinedCourseViewHolder holder, int position) {
            JoinedCourseVo joinedCourseVoB = b(position);
            holder.bind(joinedCourseVoB);
            put(joinedCourseVoB, position);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JoinedCourseViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            final JoinedCourseViewHolder joinedCourseViewHolder = new JoinedCourseViewHolder(parent);
            joinedCourseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huami.training.ui.fit.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MiDongFitFragment.JoinedTrainingsAdapter.e(this.a, joinedCourseViewHolder, view);
                }
            });
            return joinedCourseViewHolder;
        }

        @NotNull
        public final List<JoinedCourseVo> getDataList() {
            return this.dataList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            return this.dataList.size();
        }

        @Nullable
        public final Function1<JoinedCourseVo, Unit> getOnItemClickListener() {
            return this.onItemClickListener;
        }

        public final void setDataList(@NotNull List<JoinedCourseVo> list) {
            this.dataList = list;
        }

        public final void setNewData(@NotNull List<JoinedCourseVo> list) {
            this.dataList.clear();
            this.dataList.addAll(list);
            notifyDataSetChanged();
        }

        public final void setOnItemClickListener(@Nullable Function1<? super JoinedCourseVo, Unit> function1) {
            this.onItemClickListener = function1;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TrainingPlanState.values().length];
            iArr[TrainingPlanState.WAIT.ordinal()] = 1;
            iArr[TrainingPlanState.ONGOING.ordinal()] = 2;
            iArr[TrainingPlanState.TODAY_FINISHED.ordinal()] = 3;
            iArr[TrainingPlanState.TODAY_REST.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Difficulty.values().length];
            iArr2[Difficulty.JUNIOR.ordinal()] = 1;
            iArr2[Difficulty.INTERMEDIATE.ordinal()] = 2;
            iArr2[Difficulty.SENIOR.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/training/vo/JoinedCourseVo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<JoinedCourseVo, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull JoinedCourseVo joinedCourseVo) {
            MiDongFitFragment.this.j().navigateToTrainingDetail(MiDongFitFragment.this.getContext(), joinedCourseVo.getId(), joinedCourseVo.getTrainingType());
            AnalyticsHelper.INSTANCE.countJoinedCourseClickedInFitness(joinedCourseVo.getId());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JoinedCourseVo joinedCourseVo) {
            a(joinedCourseVo);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/training/ui/fit/MiDongFitFragment$JoinedTrainingsAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<JoinedTrainingsAdapter> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JoinedTrainingsAdapter getA() {
            return new JoinedTrainingsAdapter();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Long, Unit> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            invoke(l.longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
            AnalyticsHelper.INSTANCE.calculationFitPageDuration(j);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AnalyticsHelper.INSTANCE.countFitPageVisit();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MiDongFitFragment() {
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.navigationController = LazyKt__LazyJVMKt.lazy(new Function0<NavigationController>() { // from class: com.huami.training.ui.fit.MiDongFitFragment$special$$inlined$injectInTr$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.training.navigation.NavigationController, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final NavigationController getA() {
                return ScopesAndQualifersKt.trainingScope(ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(NavigationController.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<FitViewModel>() { // from class: com.huami.training.ui.fit.MiDongFitFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.training.ui.fit.FitViewModel, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final FitViewModel getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(FitViewModel.class), objArr2, objArr3);
            }
        });
        this.joinedTrainingsAdapter = LazyKt__LazyJVMKt.lazy(b.a);
        this.trackHelper = FragmentTrackHelperKt.trackHelper(this, c.a, d.a);
    }

    private final JoinedTrainingsAdapter i() {
        return (JoinedTrainingsAdapter) this.joinedTrainingsAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavigationController j() {
        return (NavigationController) this.navigationController.getValue();
    }

    private final FitViewModel k() {
        return (FitViewModel) this.viewModel.getValue();
    }

    private final void l() {
        i().setOnItemClickListener(new a());
        View view = getView();
        RecyclerView recyclerView = (RecyclerView) (view == null ? null : view.findViewById(R.id.joinedTrainings));
        recyclerView.setAdapter(i());
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setNestedScrollingEnabled(false);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), 1);
        Drawable drawable = ContextCompat.getDrawable(recyclerView.getContext(), R.drawable.tr_item_divider);
        if (drawable != null) {
            dividerItemDecoration.setDrawable(drawable);
        }
        Unit unit = Unit.INSTANCE;
        recyclerView.addItemDecoration(dividerItemDecoration);
        View view2 = getView();
        ((TypefaceTextView) (view2 == null ? null : view2.findViewById(R.id.viewMoreJoinedCourse))).setOnClickListener(new View.OnClickListener() { // from class: f45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                MiDongFitFragment.m(this.a, view3);
            }
        });
        View view3 = getView();
        ((ConstraintLayout) (view3 != null ? view3.findViewById(R.id.addTraining) : null)).setOnClickListener(new View.OnClickListener() { // from class: e45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                MiDongFitFragment.n(this.a, view4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(MiDongFitFragment miDongFitFragment, View view) {
        miDongFitFragment.j().navigateToJoinedTrainingList(view.getContext());
        AnalyticsHelper.INSTANCE.countCourseMoreInFitness();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(MiDongFitFragment miDongFitFragment, View view) {
        NavigationController.DefaultImpls.navigateToTrainingFilterList$default(miDongFitFragment.j(), view.getContext(), null, 2, null);
        AnalyticsHelper.INSTANCE.countAddCourseClickedInFitness();
    }

    private final void o() {
        View view = getView();
        ((ImageView) (view == null ? null : view.findViewById(R.id.startPlan))).setOnClickListener(new View.OnClickListener() { // from class: d45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MiDongFitFragment.p(this.a, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(MiDongFitFragment miDongFitFragment, View view) {
        Resource<TrainingPlanVo> value = miDongFitFragment.k().getTrainingPlan().getValue();
        if (value == null) {
            return;
        }
        TrainingPlanVo data = value.getData();
        if (data != null) {
            miDongFitFragment.j().navigateToPlanDetailPage(view.getContext());
            AnalyticsHelper.INSTANCE.countContinuePlanClickInFitness(data.getId());
        } else {
            miDongFitFragment.j().navigateToCreatePlanPage(view.getContext());
            AnalyticsHelper.INSTANCE.countStartPlanClickInFitness();
        }
    }

    private final void q() {
        PromotionalCourseFragment promotionalCourseFragmentCreate = PromotionalCourseFragment.INSTANCE.create(PromotePlace.BEFORE_FITNESS);
        getChildFragmentManager().beginTransaction().replace(R.id.promotionalCourses, promotionalCourseFragmentCreate).commit();
        promotionalCourseFragmentCreate.getVisible().observe(this, new Observer() { // from class: i45
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                MiDongFitFragment.r(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(MiDongFitFragment miDongFitFragment, Boolean bool) {
        if (bool == null) {
            return;
        }
        boolean zBooleanValue = bool.booleanValue();
        View view = miDongFitFragment.getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.promotionalCourses), zBooleanValue);
    }

    private final void s() {
        if (this.hasObserved) {
            return;
        }
        this.hasObserved = true;
        k().loadConfigurations();
        k().getPlanExistence().observe(this, new Observer() { // from class: k45
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                MiDongFitFragment.t(this.a, (Pair) obj);
            }
        });
        k().getTrainingPlan().observe(this, new Observer() { // from class: h45
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                MiDongFitFragment.u(this.a, (Resource) obj);
            }
        });
        k().getPlanBgImage().observe(this, new Observer() { // from class: j45
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                MiDongFitFragment.v(this.a, (String) obj);
            }
        });
        k().getJoinedTrainings().observe(this, new Observer() { // from class: g45
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                MiDongFitFragment.w(this.a, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(MiDongFitFragment miDongFitFragment, Pair pair) {
        boolean zBooleanValue = ((Boolean) pair.component1()).booleanValue();
        Long l = (Long) pair.component2();
        View view = miDongFitFragment.getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.planArea), true);
        View view2 = miDongFitFragment.getView();
        ViewExKt.setVisible(view2 == null ? null : view2.findViewById(R.id.planStartTip), !zBooleanValue);
        View view3 = miDongFitFragment.getView();
        ViewExKt.setVisible(view3 == null ? null : view3.findViewById(R.id.planContent), zBooleanValue);
        View view4 = miDongFitFragment.getView();
        ((ImageView) (view4 != null ? view4.findViewById(R.id.startPlan) : null)).setImageResource(zBooleanValue ? R.drawable.tr_fit_start_md : R.drawable.tr_fit_go_md);
        if (zBooleanValue) {
            AnalyticsHelper.INSTANCE.countContinuePlanVisitInFitness(l.longValue());
        } else {
            AnalyticsHelper.INSTANCE.countStartPlanVisitInFitness();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(MiDongFitFragment miDongFitFragment, Resource resource) {
        String string;
        TrainingPlanVo trainingPlanVo = (TrainingPlanVo) resource.getData();
        if (trainingPlanVo == null) {
            return;
        }
        View view = miDongFitFragment.getView();
        TypefaceTextView typefaceTextView = (TypefaceTextView) (view == null ? null : view.findViewById(R.id.planProgress));
        TrainingPlanState state = trainingPlanVo.getState();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        typefaceTextView.setText(iArr[state.ordinal()] == 1 ? miDongFitFragment.getResources().getQuantityString(R.plurals.tr_wait_x_days_then_begin, trainingPlanVo.getWaitDays(), Integer.valueOf(trainingPlanVo.getWaitDays())) : miDongFitFragment.getString(R.string.tr_plan_day_progress, trainingPlanVo.getDayIndex(), Integer.valueOf(trainingPlanVo.getTotalDays())));
        int i = iArr[trainingPlanVo.getState().ordinal()];
        if (i == 2 || i == 3 || i == 4) {
            View view2 = miDongFitFragment.getView();
            ((ProgressBar) (view2 == null ? null : view2.findViewById(R.id.planProgressBar))).setMax(trainingPlanVo.getTrainingDays());
            View view3 = miDongFitFragment.getView();
            ((ProgressBar) (view3 == null ? null : view3.findViewById(R.id.planProgressBar))).setProgress(trainingPlanVo.getFinishedDays());
        }
        int i2 = iArr[trainingPlanVo.getState().ordinal()];
        if (i2 == 1) {
            View view4 = miDongFitFragment.getView();
            ((TypefaceTextView) (view4 == null ? null : view4.findViewById(R.id.planTitle))).setText(trainingPlanVo.getName());
            View view5 = miDongFitFragment.getView();
            ((TypefaceTextView) (view5 == null ? null : view5.findViewById(R.id.planDesc))).setText("");
        } else if (i2 == 2) {
            View view6 = miDongFitFragment.getView();
            ((TypefaceTextView) (view6 == null ? null : view6.findViewById(R.id.planTitle))).setText(miDongFitFragment.getString(R.string.tr_today_x, trainingPlanVo.getTodayTrainingName()));
            View view7 = miDongFitFragment.getView();
            ((TypefaceTextView) (view7 == null ? null : view7.findViewById(R.id.planDesc))).setText(trainingPlanVo.getName());
        } else if (i2 == 3) {
            View view8 = miDongFitFragment.getView();
            ((TypefaceTextView) (view8 == null ? null : view8.findViewById(R.id.planTitle))).setText(miDongFitFragment.getString(R.string.tr_today_finished));
            View view9 = miDongFitFragment.getView();
            ((TypefaceTextView) (view9 == null ? null : view9.findViewById(R.id.planDesc))).setText(trainingPlanVo.getName());
        } else if (i2 == 4) {
            View view10 = miDongFitFragment.getView();
            ((TypefaceTextView) (view10 == null ? null : view10.findViewById(R.id.planTitle))).setText(miDongFitFragment.getString(R.string.tr_today_is_rest));
            View view11 = miDongFitFragment.getView();
            ((TypefaceTextView) (view11 == null ? null : view11.findViewById(R.id.planDesc))).setText(trainingPlanVo.getName());
        }
        if (trainingPlanVo.getState() == TrainingPlanState.WAIT || trainingPlanVo.getTodayTrainingDuration() == null) {
            View view12 = miDongFitFragment.getView();
            ((TypefaceTextView) (view12 == null ? null : view12.findViewById(R.id.planDuration))).setText("");
        } else {
            Integer todayTrainingDuration = trainingPlanVo.getTodayTrainingDuration();
            if (todayTrainingDuration != null) {
                int iIntValue = todayTrainingDuration.intValue();
                View view13 = miDongFitFragment.getView();
                ((TypefaceTextView) (view13 == null ? null : view13.findViewById(R.id.planDuration))).setText(miDongFitFragment.getResources().getQuantityString(R.plurals.tr_x_minutes, iIntValue, Integer.valueOf(iIntValue)));
            }
        }
        View view14 = miDongFitFragment.getView();
        TypefaceTextView typefaceTextView2 = (TypefaceTextView) (view14 != null ? view14.findViewById(R.id.planDifficulty) : null);
        int i3 = WhenMappings.$EnumSwitchMapping$1[trainingPlanVo.getDifficulty().ordinal()];
        if (i3 == 1) {
            string = miDongFitFragment.getString(R.string.tr_difficulty_junior);
        } else if (i3 == 2) {
            string = miDongFitFragment.getString(R.string.tr_difficulty_intermediate);
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            string = miDongFitFragment.getString(R.string.tr_difficulty_senior);
        }
        typefaceTextView2.setText(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(MiDongFitFragment miDongFitFragment, String str) {
        if (str == null) {
            return;
        }
        View view = miDongFitFragment.getView();
        ImageViewExKt.loadUrl((ImageView) (view == null ? null : view.findViewById(R.id.planBg)), str, R.drawable.tr_fit_plan_default_bg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(MiDongFitFragment miDongFitFragment, Resource resource) {
        Collection collection = (Collection) resource.getData();
        boolean z = !(collection == null || collection.isEmpty());
        View view = miDongFitFragment.getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.joinedTrainings), z);
        View view2 = miDongFitFragment.getView();
        ViewExKt.setVisible(view2 == null ? null : view2.findViewById(R.id.emptyJoinedTrainingTips), !z);
        View view3 = miDongFitFragment.getView();
        ViewExKt.setVisible(view3 == null ? null : view3.findViewById(R.id.viewMoreJoinedCourse), z);
        List<JoinedCourseVo> list = (List) resource.getData();
        if (list != null) {
            miDongFitFragment.i().setNewData(list);
        }
        if (resource.isCompleted()) {
            View view4 = miDongFitFragment.getView();
            if (ViewExKt.isVisible(view4 == null ? null : view4.findViewById(R.id.emptyJoinedTrainingTips))) {
                AnalyticsHelper.INSTANCE.countAddCourseClickedInFitness();
            }
        }
        if (resource.isCompleted()) {
            View view5 = miDongFitFragment.getView();
            if (ViewExKt.isVisible(view5 != null ? view5.findViewById(R.id.viewMoreJoinedCourse) : null)) {
                AnalyticsHelper.INSTANCE.countCourseMoreVisitInFitness();
            }
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tr_fragment_fit_md, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        this.trackHelper.trackOnHiddenChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.trackHelper.trackOnPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.trackHelper.trackOnResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        o();
        l();
        q();
        if (getUserVisibleHint()) {
            s();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        this.trackHelper.trackOnUserVisibleHint();
        if (!isVisibleToUser || getView() == null) {
            return;
        }
        s();
    }
}
