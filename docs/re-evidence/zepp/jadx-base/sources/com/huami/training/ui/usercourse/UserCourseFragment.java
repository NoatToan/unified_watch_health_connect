package com.huami.training.ui.usercourse;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.p008lifecycle.Observer;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.decoration.VerticalLinearSpacingDecoration;
import com.huami.training.di.koin.ScopesAndQualifersKt;
import com.huami.training.ext.ViewExKt;
import com.huami.training.navigation.NavigationController;
import com.huami.training.ui.R;
import com.huami.training.ui.common.TrFragment;
import com.huami.training.ui.common.fragmentdelegate.LoadDataOnVisibleOnce;
import com.huami.training.ui.usercourse.UserCourseFragment;
import com.huami.training.vo.Resource;
import com.huami.training.vo.TrainingVo;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J&\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u001d\u0010\u0014\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001c\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0016\u0010\u001b¨\u0006 "}, d2 = {"Lcom/huami/training/ui/usercourse/UserCourseFragment;", "Lcom/huami/training/ui/common/TrFragment;", "", "f", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/training/navigation/NavigationController;", "b", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/huami/training/navigation/NavigationController;", "navigationController", "Lcom/huami/training/ui/usercourse/UserCourseViewModel;", "c", "e", "()Lcom/huami/training/ui/usercourse/UserCourseViewModel;", "viewModel", "Lcom/huami/training/ui/usercourse/TrainingFilterAdapter;", "()Lcom/huami/training/ui/usercourse/TrainingFilterAdapter;", "adapter", "<init>", "()V", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class UserCourseFragment extends TrFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String e = "UserId";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huami/training/ui/usercourse/UserCourseFragment$Companion;", "", "", "userId", "Lcom/huami/training/ui/usercourse/UserCourseFragment;", "create", "EXTRA_USER_ID", "Ljava/lang/String;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UserCourseFragment create(@NotNull String userId) {
            UserCourseFragment userCourseFragment = new UserCourseFragment();
            Bundle bundle = new Bundle();
            bundle.putString("UserId", userId);
            Unit unit = Unit.INSTANCE;
            userCourseFragment.setArguments(bundle);
            return userCourseFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/training/ui/usercourse/TrainingFilterAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<TrainingFilterAdapter> {

        /* JADX INFO: renamed from: com.huami.training.ui.usercourse.UserCourseFragment$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0632a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ UserCourseFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0632a(UserCourseFragment userCourseFragment) {
                super(0);
                this.a = userCourseFragment;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.e().retry();
            }
        }

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TrainingFilterAdapter invoke() {
            return new TrainingFilterAdapter(null, new C0632a(UserCourseFragment.this), 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"", "<anonymous parameter 0>", "Lcom/huami/training/vo/TrainingVo;", "item", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function2<Integer, TrainingVo, Unit> {
        public final /* synthetic */ RecyclerView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RecyclerView recyclerView) {
            super(2);
            this.b = recyclerView;
        }

        public final void a(int i, @NotNull TrainingVo trainingVo) {
            UserCourseFragment.this.d().navigateToTrainingDetail(this.b.getContext(), trainingVo.getId(), trainingVo.getTrainingType());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, TrainingVo trainingVo) {
            a(num.intValue(), trainingVo);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserCourseFragment() {
        addDelegate(new LoadDataOnVisibleOnce() { // from class: com.huami.training.ui.usercourse.UserCourseFragment.1
            @Override // com.huami.training.ui.common.fragmentdelegate.LoadDataOnVisibleOnce
            public void loadDataOnVisibleOnce() {
                UserCourseFragment.this.f();
            }
        });
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.navigationController = LazyKt__LazyJVMKt.lazy(new Function0<NavigationController>() { // from class: com.huami.training.ui.usercourse.UserCourseFragment$special$$inlined$injectInTr$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.training.navigation.NavigationController, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NavigationController invoke() {
                return ScopesAndQualifersKt.trainingScope(ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(NavigationController.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<UserCourseViewModel>() { // from class: com.huami.training.ui.usercourse.UserCourseFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.training.ui.usercourse.UserCourseViewModel, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final UserCourseViewModel invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(UserCourseViewModel.class), objArr2, objArr3);
            }
        });
        this.adapter = LazyKt__LazyJVMKt.lazy(new a());
    }

    private final TrainingFilterAdapter c() {
        return (TrainingFilterAdapter) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavigationController d() {
        return (NavigationController) this.navigationController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserCourseViewModel e() {
        return (UserCourseViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        e().getPagedList().observe(this, new Observer() { // from class: u58
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                UserCourseFragment.g(this.a, (PagedList) obj);
            }
        });
        e().getNetworkState().observe(this, new Observer() { // from class: v58
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                UserCourseFragment.h(this.a, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(UserCourseFragment userCourseFragment, PagedList pagedList) {
        userCourseFragment.c().submitList(pagedList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(UserCourseFragment userCourseFragment, Resource resource) {
        userCourseFragment.c().setNetworkState(resource);
    }

    @Override // com.huami.training.ui.common.TrFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.training.ui.common.TrFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String string;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("UserId")) == null) {
            return;
        }
        e().setUserId(string);
    }

    @Override // com.huami.training.ui.common.TrFragment, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tr_fragment_user_courses, container, false);
    }

    @Override // com.huami.training.ui.common.TrFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        View view2 = getView();
        RecyclerView recyclerView = (RecyclerView) (view2 == null ? null : view2.findViewById(R.id.recycler_view));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        TrainingFilterAdapter trainingFilterAdapterC = c();
        trainingFilterAdapterC.setOnItemClickListener(new b(recyclerView));
        Unit unit = Unit.INSTANCE;
        recyclerView.setAdapter(trainingFilterAdapterC);
        recyclerView.addItemDecoration(new VerticalLinearSpacingDecoration((int) ViewExKt.dpToPx(recyclerView, 10.0f), (int) ViewExKt.dpToPx(recyclerView, 7.0f), 0, (int) ViewExKt.dpToPx(recyclerView, 7.0f), 0, 20, null));
    }
}
