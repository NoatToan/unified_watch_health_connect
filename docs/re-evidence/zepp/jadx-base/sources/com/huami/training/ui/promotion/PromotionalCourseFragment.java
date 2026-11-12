package com.huami.training.ui.promotion;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.training.decoration.VerticalLinearSpacingDecoration;
import com.huami.training.di.koin.ScopesAndQualifersKt;
import com.huami.training.dto.PromotePlace;
import com.huami.training.ext.ViewExKt;
import com.huami.training.helper.AppExecutors;
import com.huami.training.navigation.NavigationController;
import com.huami.training.ui.R;
import com.huami.training.ui.promotion.PromotionalCourseFragment;
import com.huami.training.utils.AnalyticsHelper;
import com.huami.training.vo.Resource;
import com.huami.training.vo.TrainingVo;
import com.loc.z;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 >2\u00020\u0001:\u0001>B\u0007¢\u0006\u0004\b<\u0010=J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016R\u001d\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010%\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$R\u001d\u0010*\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010)R\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00060/8\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u00100\u001a\u0004\b1\u00102R\u001d\u00106\u001a\u0002048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b,\u00105R\u0018\u00108\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u00107R\u0018\u0010:\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u00109R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00109¨\u0006?"}, d2 = {"Lcom/huami/training/ui/promotion/PromotionalCourseFragment;", "Landroidx/fragment/app/Fragment;", "", "text", "", "setTitleText", "", "shown", "showTitleBar", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "onAttach", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/training/helper/AppExecutors;", "a", "Lkotlin/Lazy;", "f", "()Lcom/huami/training/helper/AppExecutors;", "appExecutors", "Lcom/huami/training/navigation/NavigationController;", "b", "g", "()Lcom/huami/training/navigation/NavigationController;", "navigationController", "Lcom/huami/training/ui/promotion/PromotionalCourseUiDelegate;", "c", "h", "()Lcom/huami/training/ui/promotion/PromotionalCourseUiDelegate;", "uiDelegate", "Lcom/huami/training/ui/promotion/PromotionalCourseViewModel;", GoogleApiAvailabilityLight.a, "i", "()Lcom/huami/training/ui/promotion/PromotionalCourseViewModel;", "viewModel", "Landroidx/lifecycle/MutableLiveData;", "e", "Landroidx/lifecycle/MutableLiveData;", "_visible", "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/LiveData;", "getVisible", "()Landroidx/lifecycle/LiveData;", "visible", "Lcom/huami/training/ui/promotion/BaseCourseListAdapter;", "()Lcom/huami/training/ui/promotion/BaseCourseListAdapter;", "adapter", "Ljava/lang/String;", "titleText", "Ljava/lang/Boolean;", "showViewMore", z.j, "<init>", "()V", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class PromotionalCourseFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String k = "PromotePlace";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy appExecutors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy uiDelegate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _visible;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> visible;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private String titleText;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private Boolean showViewMore;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private Boolean showTitleBar;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/training/ui/promotion/PromotionalCourseFragment$Companion;", "", "Lcom/huami/training/dto/PromotePlace;", "promotePlace", "Lcom/huami/training/ui/promotion/PromotionalCourseFragment;", "create", "", "EXTRA_PROMOTE_PLACE", "Ljava/lang/String;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PromotionalCourseFragment create(@NotNull PromotePlace promotePlace) {
            PromotionalCourseFragment promotionalCourseFragment = new PromotionalCourseFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(PromotionalCourseFragment.k, promotePlace.ordinal());
            promotionalCourseFragment.setArguments(bundle);
            return promotionalCourseFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/training/ui/promotion/BaseCourseListAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<BaseCourseListAdapter> {

        /* JADX INFO: renamed from: com.huami.training.ui.promotion.PromotionalCourseFragment$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/training/dto/PromotePlace;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0630a extends Lambda implements Function0<PromotePlace> {
            public final /* synthetic */ PromotionalCourseFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0630a(PromotionalCourseFragment promotionalCourseFragment) {
                super(0);
                this.a = promotionalCourseFragment;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PromotePlace invoke() {
                return this.a.i().getPromotePlace();
            }
        }

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseCourseListAdapter invoke() {
            return PromotionalCourseFragment.this.h().getAdapter(PromotionalCourseFragment.this.f(), new C0630a(PromotionalCourseFragment.this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"", "pos", "Lcom/huami/training/vo/TrainingVo;", "item", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function2<Integer, TrainingVo, Unit> {
        public b() {
            super(2);
        }

        public final void a(int i, @NotNull TrainingVo trainingVo) {
            Context context = PromotionalCourseFragment.this.getContext();
            if (context == null) {
                return;
            }
            PromotionalCourseFragment promotionalCourseFragment = PromotionalCourseFragment.this;
            promotionalCourseFragment.g().navigateToTrainingDetail(context, trainingVo.getId(), trainingVo.getTrainingType());
            PromotePlace promotePlace = promotionalCourseFragment.i().getPromotePlace();
            if (promotePlace == null) {
                return;
            }
            AnalyticsHelper.INSTANCE.countPromotionalCourseClick(i + 1, trainingVo.getId(), promotePlace);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, TrainingVo trainingVo) {
            a(num.intValue(), trainingVo);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PromotionalCourseFragment() {
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.appExecutors = LazyKt__LazyJVMKt.lazy(new Function0<AppExecutors>() { // from class: com.huami.training.ui.promotion.PromotionalCourseFragment$special$$inlined$injectInTr$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.training.helper.AppExecutors, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AppExecutors invoke() {
                return ScopesAndQualifersKt.trainingScope(ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(AppExecutors.class), qualifier, objArr);
            }
        });
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.navigationController = LazyKt__LazyJVMKt.lazy(new Function0<NavigationController>() { // from class: com.huami.training.ui.promotion.PromotionalCourseFragment$special$$inlined$injectInTr$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.training.navigation.NavigationController, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NavigationController invoke() {
                return ScopesAndQualifersKt.trainingScope(ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(NavigationController.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.uiDelegate = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<PromotionalCourseUiDelegate>() { // from class: com.huami.training.ui.promotion.PromotionalCourseFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.training.ui.promotion.PromotionalCourseUiDelegate, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PromotionalCourseUiDelegate invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(PromotionalCourseUiDelegate.class), objArr4, objArr5);
            }
        });
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<PromotionalCourseViewModel>() { // from class: com.huami.training.ui.promotion.PromotionalCourseFragment$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.training.ui.promotion.PromotionalCourseViewModel, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PromotionalCourseViewModel invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(PromotionalCourseViewModel.class), objArr6, objArr7);
            }
        });
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this._visible = mutableLiveData;
        this.visible = mutableLiveData;
        this.adapter = LazyKt__LazyJVMKt.lazy(new a());
    }

    private final BaseCourseListAdapter e() {
        return (BaseCourseListAdapter) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppExecutors f() {
        return (AppExecutors) this.appExecutors.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavigationController g() {
        return (NavigationController) this.navigationController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PromotionalCourseUiDelegate h() {
        return (PromotionalCourseUiDelegate) this.uiDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PromotionalCourseViewModel i() {
        return (PromotionalCourseViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(PromotionalCourseFragment promotionalCourseFragment, String str) {
        View view = promotionalCourseFragment.getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.title))).setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(PromotionalCourseFragment promotionalCourseFragment, Boolean bool) {
        View view = promotionalCourseFragment.getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.title), bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(PromotionalCourseFragment promotionalCourseFragment, Resource resource) {
        promotionalCourseFragment.e().submitList(resource == null ? null : (List) resource.getData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(PromotionalCourseFragment promotionalCourseFragment, Boolean bool) {
        View view = promotionalCourseFragment.getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.promotional_courses), bool.booleanValue());
        promotionalCourseFragment._visible.setValue(bool);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final LiveData<Boolean> getVisible() {
        return this.visible;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        String str = this.titleText;
        if (str != null) {
            i().getTitleText().setValue(str);
        }
        Boolean bool = this.showViewMore;
        if (bool != null) {
            i().getShowViewMore().setValue(Boolean.valueOf(bool.booleanValue()));
        }
        Boolean bool2 = this.showTitleBar;
        if (bool2 != null) {
            i().getShowTitleBar().setValue(Boolean.valueOf(bool2.booleanValue()));
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        i().setPromotePlace(PromotePlace.values()[arguments.getInt(k)]);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tr_fragment_course_promotion, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        View view2 = getView();
        ViewGroup.LayoutParams layoutParams = ((TextView) (view2 == null ? null : view2.findViewById(R.id.title))).getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        View view3 = getView();
        marginLayoutParams.setMarginStart((int) ViewExKt.dpToPx(view3 == null ? null : view3.findViewById(R.id.title), h().getTitleHorizontalMargin()));
        View view4 = getView();
        ((TextView) (view4 == null ? null : view4.findViewById(R.id.title))).setLayoutParams(marginLayoutParams);
        e().setOnItemClickListener(new b());
        View view5 = getView();
        RecyclerView recyclerView = (RecyclerView) (view5 != null ? view5.findViewById(R.id.list) : null);
        recyclerView.setOverScrollMode(2);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(e());
        recyclerView.addItemDecoration(new VerticalLinearSpacingDecoration((int) ViewExKt.dpToPx(recyclerView, h().getItemHorizontalMargin()), (int) ViewExKt.dpToPx(recyclerView, h().getItemSpacing()), 0, (int) ViewExKt.dpToPx(recyclerView, 7.0f), 0, 20, null));
        PromotionalCourseViewModel promotionalCourseViewModelI = i();
        if (promotionalCourseViewModelI == null) {
            return;
        }
        promotionalCourseViewModelI.getTitleText().observe(this, new Observer() { // from class: t46
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PromotionalCourseFragment.j(this.a, (String) obj);
            }
        });
        promotionalCourseViewModelI.getShowTitleBar().observe(this, new Observer() { // from class: s46
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PromotionalCourseFragment.k(this.a, (Boolean) obj);
            }
        });
        promotionalCourseViewModelI.getCourses().observe(this, new Observer() { // from class: q46
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PromotionalCourseFragment.l(this.a, (Resource) obj);
            }
        });
        promotionalCourseViewModelI.getVisible().observe(this, new Observer() { // from class: r46
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PromotionalCourseFragment.m(this.a, (Boolean) obj);
            }
        });
    }

    public final void setTitleText(@NotNull String text) {
        this.titleText = text;
        i().getTitleText().setValue(text);
    }

    public final void showTitleBar(boolean shown) {
        this.showTitleBar = Boolean.valueOf(shown);
        i().getShowTitleBar().setValue(Boolean.valueOf(shown));
    }
}
