package com.huami.training.ui.joined;

import android.content.ComponentCallbacks;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.training.di.koin.ScopesAndQualifersKt;
import com.huami.training.ext.ViewExKt;
import com.huami.training.navigation.NavigationController;
import com.huami.training.ui.R;
import com.huami.training.ui.joined.JoinedCourseListActivity;
import com.huami.training.ui.widget.CustomSmartRefreshLayout;
import com.huami.training.utils.AnalyticsHelper;
import com.huami.training.vo.JoinedCourseVo;
import com.huami.training.vo.Resource;
import com.huami.training.vo.Status;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.typeface.TypefaceTextView;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import defpackage.GlobalTitleStyleKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014R\u001d\u0010\u0013\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010!R\u001d\u0010&\u001a\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0010\u001a\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/huami/training/ui/joined/JoinedCourseListActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "initTitle", "initRecyclerView", "observeData", "u", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onPostCreate", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onRightOnClicked", "Lcom/huami/training/navigation/NavigationController;", "x", "Lkotlin/Lazy;", "r", "()Lcom/huami/training/navigation/NavigationController;", "navigationController", "Lcom/huami/training/ui/joined/JoinedCourseDelegate;", "y", SOAP.XMLNS, "()Lcom/huami/training/ui/joined/JoinedCourseDelegate;", "uiDelegate", "Lcom/huami/training/ui/joined/JoinedCourseViewModel;", "z", "t", "()Lcom/huami/training/ui/joined/JoinedCourseViewModel;", "viewModel", "Lcom/huami/training/ui/joined/JoinedCourseAdapter;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, com.google.android.exoplayer2.text.ttml.b.r, "()Lcom/huami/training/ui/joined/JoinedCourseAdapter;", "adapter", "B", DTransferConstants.SEARCH_KEY, "()Landroid/view/View;", "contentView", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class JoinedCourseListActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final Lazy contentView;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationController;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy uiDelegate;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.LOADING.ordinal()] = 1;
            iArr[Status.SUCCESS.ordinal()] = 2;
            iArr[Status.ERROR.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/training/ui/joined/JoinedCourseAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<JoinedCourseAdapter> {

        /* JADX INFO: renamed from: com.huami.training.ui.joined.JoinedCourseListActivity$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0629a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ JoinedCourseListActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0629a(JoinedCourseListActivity joinedCourseListActivity) {
                super(0);
                this.a = joinedCourseListActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.t().retry();
            }
        }

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JoinedCourseAdapter getA() {
            return new JoinedCourseAdapter(null, new C0629a(JoinedCourseListActivity.this), 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<View> {
        public b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final View getA() {
            JoinedCourseDelegate joinedCourseDelegateS = JoinedCourseListActivity.this.s();
            JoinedCourseListActivity joinedCourseListActivity = JoinedCourseListActivity.this;
            return joinedCourseDelegateS.getContentListView(joinedCourseListActivity, (ConstraintLayout) joinedCourseListActivity.findViewById(R.id.refresh_content));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"", "<anonymous parameter 0>", "Lcom/huami/training/vo/JoinedCourseVo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function2<Integer, JoinedCourseVo, Unit> {
        public c() {
            super(2);
        }

        public final void a(int i, @NotNull JoinedCourseVo joinedCourseVo) {
            AnalyticsHelper.INSTANCE.countCourseClickedInCourseJoinPage(String.valueOf(joinedCourseVo.getId()));
            JoinedCourseListActivity.this.r().navigateToTrainingDetail(JoinedCourseListActivity.this, joinedCourseVo.getId(), joinedCourseVo.getTrainingType());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, JoinedCourseVo joinedCourseVo) {
            a(num.intValue(), joinedCourseVo);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JoinedCourseListActivity() {
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.navigationController = LazyKt__LazyJVMKt.lazy(new Function0<NavigationController>() { // from class: com.huami.training.ui.joined.JoinedCourseListActivity$special$$inlined$injectInTr$default$1
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
        this.uiDelegate = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<JoinedCourseDelegate>() { // from class: com.huami.training.ui.joined.JoinedCourseListActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.training.ui.joined.JoinedCourseDelegate, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final JoinedCourseDelegate getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(JoinedCourseDelegate.class), objArr2, objArr3);
            }
        });
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<JoinedCourseViewModel>() { // from class: com.huami.training.ui.joined.JoinedCourseListActivity$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.training.ui.joined.JoinedCourseViewModel, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final JoinedCourseViewModel getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(JoinedCourseViewModel.class), objArr4, objArr5);
            }
        });
        this.adapter = LazyKt__LazyJVMKt.lazy(new a());
        this.contentView = LazyKt__LazyJVMKt.lazy(new b());
    }

    private final void initRecyclerView() {
        ((ConstraintLayout) findViewById(R.id.refresh_content)).addView(q());
        RecyclerView recyclerView = (RecyclerView) q().findViewById(R.id.recycler_view);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(p());
            DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), 1);
            Drawable drawable = ContextCompat.getDrawable(recyclerView.getContext(), R.drawable.tr_item_divider);
            if (drawable != null) {
                dividerItemDecoration.setDrawable(drawable);
            }
            recyclerView.addItemDecoration(dividerItemDecoration);
        }
        p().setOnItemClickListener(new c());
    }

    private final void initTitle() {
        String string = getResources().getString(R.string.tr_add_course);
        ContextCompat.getColor(this, R.color.tr_orange);
        setRightTitle(string);
        setLeftImageRes(R.drawable.ic_arrow_back_20, R.color.s1);
        getRightTitle().setTextColor(s().getAddCourseButtonTextColor());
    }

    private final void observeData() {
        t().getPagedList().observe(this, new Observer() { // from class: xi4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                JoinedCourseListActivity.w(this.a, (PagedList) obj);
            }
        });
        t().getNetworkState().observe(this, new Observer() { // from class: yi4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                JoinedCourseListActivity.x(this.a, (Resource) obj);
            }
        });
        t().getRefreshState().observe(this, new Observer() { // from class: zi4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                JoinedCourseListActivity.y(this.a, (Resource) obj);
            }
        });
    }

    private final JoinedCourseAdapter p() {
        return (JoinedCourseAdapter) this.adapter.getValue();
    }

    private final View q() {
        return (View) this.contentView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavigationController r() {
        return (NavigationController) this.navigationController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JoinedCourseDelegate s() {
        return (JoinedCourseDelegate) this.uiDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JoinedCourseViewModel t() {
        return (JoinedCourseViewModel) this.viewModel.getValue();
    }

    private final void u() {
        CustomSmartRefreshLayout customSmartRefreshLayout = (CustomSmartRefreshLayout) findViewById(R.id.smart_refresh);
        customSmartRefreshLayout.setEnabled(true);
        customSmartRefreshLayout.setEnableLoadmore(false);
        customSmartRefreshLayout.setOnRefreshListener(new OnRefreshListener() { // from class: aj4
            @Override // com.scwang.smartrefresh.layout.listener.OnRefreshListener
            public final void onRefresh(RefreshLayout refreshLayout) {
                JoinedCourseListActivity.v(this.a, refreshLayout);
            }
        });
        customSmartRefreshLayout.autoRefresh(200);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(JoinedCourseListActivity joinedCourseListActivity, RefreshLayout refreshLayout) {
        joinedCourseListActivity.t().refresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(JoinedCourseListActivity joinedCourseListActivity, PagedList pagedList) {
        ViewExKt.setVisible((TypefaceTextView) joinedCourseListActivity.findViewById(R.id.empty_tips), pagedList == null || pagedList.isEmpty());
        ViewExKt.setVisible(joinedCourseListActivity.q(), !(pagedList == null || pagedList.isEmpty()));
        joinedCourseListActivity.p().submitList(pagedList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(JoinedCourseListActivity joinedCourseListActivity, Resource resource) {
        joinedCourseListActivity.p().setNetworkState(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(JoinedCourseListActivity joinedCourseListActivity, Resource resource) {
        if (resource != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
            if (i == 1) {
                ((CustomSmartRefreshLayout) joinedCourseListActivity.findViewById(R.id.smart_refresh)).startRefreshingAnim();
            } else if (i == 2) {
                ((CustomSmartRefreshLayout) joinedCourseListActivity.findViewById(R.id.smart_refresh)).finishRefresh(true);
            } else {
                if (i != 3) {
                    return;
                }
                ((CustomSmartRefreshLayout) joinedCourseListActivity.findViewById(R.id.smart_refresh)).finishRefresh(false);
            }
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GlobalTitleStyleKt.setUnifyTitleStyle$default(this, getResources().getString(R.string.tr_joined_course), null, 2, null);
        setContentView(R.layout.tr_activity_joined_course_list);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        initTitle();
        initRecyclerView();
        u();
        observeData();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onRightOnClicked(@Nullable View view) {
        super.onRightOnClicked(view);
        r().navigateToTrainingFilterList(this, null);
        AnalyticsHelper.INSTANCE.countAddCourseClicked();
    }
}
