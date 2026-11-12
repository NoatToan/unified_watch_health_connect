package com.xiaomi.fitness.sport.view.route;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.sport.view.route.CreateRouteChooseModuleFragment;
import com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel;
import defpackage.dvi;
import defpackage.p9n;
import defpackage.sln;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010\fJ+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\fJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010 ¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/CreateRouteChooseModuleFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "", "initView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V", "initChoice", "()V", "handleBackPressed", "initBehavior", "initButtonState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lsln;", "mBinding", "Lsln;", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;", "createRouteActivity", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;", "Lp9n;", "createRouteActivityBinding", "Lp9n;", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "createRouteViewModel", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "midContentView", "Landroid/view/View;", "contentLayout", "<init>", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CreateRouteChooseModuleFragment extends Fragment {
    private View contentLayout;
    private CreateRouteActivity createRouteActivity;
    private p9n createRouteActivityBinding;
    private CreateRouteViewModel createRouteViewModel;
    private sln mBinding;
    private View midContentView;

    public CreateRouteChooseModuleFragment() {
        super(dvi.a0);
    }

    private final void handleBackPressed() {
        CreateRouteActivity createRouteActivity = this.createRouteActivity;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        createRouteActivity.setBackPressedFragment(this, new Function0() { // from class: y15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateRouteChooseModuleFragment.handleBackPressed$lambda$2(this.f39675a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleBackPressed$lambda$2(CreateRouteChooseModuleFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CreateRouteActivity createRouteActivity = this$0.createRouteActivity;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        createRouteActivity.finish();
        return Unit.INSTANCE;
    }

    private final void initBehavior() {
        CreateRouteActivity createRouteActivity;
        CreateRouteActivity createRouteActivity2 = this.createRouteActivity;
        sln slnVar = null;
        if (createRouteActivity2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        } else {
            createRouteActivity = createRouteActivity2;
        }
        sln slnVar2 = this.mBinding;
        if (slnVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            slnVar = slnVar2;
        }
        View root = slnVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        CreateRouteActivity.setDefaultBehavior$default(createRouteActivity, root, 0, false, false, 10, null);
    }

    private final void initButtonState() {
        sln slnVar = this.mBinding;
        if (slnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            slnVar = null;
        }
        slnVar.B.setOnClickListener(new View.OnClickListener() { // from class: x15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRouteChooseModuleFragment.initButtonState$lambda$3(this.f38568a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initButtonState$lambda$3(CreateRouteChooseModuleFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CreateRouteViewModel createRouteViewModel = this$0.createRouteViewModel;
        CreateRouteActivity createRouteActivity = null;
        if (createRouteViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
            createRouteViewModel = null;
        }
        if (createRouteViewModel.getModuleSelected() instanceof CreateRouteViewModel.ModuleStatus.DistancePlan) {
            CreateRouteActivity createRouteActivity2 = this$0.createRouteActivity;
            if (createRouteActivity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            } else {
                createRouteActivity = createRouteActivity2;
            }
            createRouteActivity.replaceBottomSheetFragment(new CreateRouteSelectTargetFragment());
            return;
        }
        CreateRouteViewModel createRouteViewModel2 = this$0.createRouteViewModel;
        if (createRouteViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
            createRouteViewModel2 = null;
        }
        if (!(createRouteViewModel2.getModuleSelected() instanceof CreateRouteViewModel.ModuleStatus.Char)) {
            CreateRouteViewModel createRouteViewModel3 = this$0.createRouteViewModel;
            if (createRouteViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                createRouteViewModel3 = null;
            }
            if (!(createRouteViewModel3.getModuleSelected() instanceof CreateRouteViewModel.ModuleStatus.Pattern)) {
                return;
            }
        }
        CreateRouteActivity createRouteActivity3 = this$0.createRouteActivity;
        if (createRouteActivity3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
        } else {
            createRouteActivity = createRouteActivity3;
        }
        createRouteActivity.replaceBottomSheetFragment(new CreateRouteSelectStyleFragment());
    }

    private final void initChoice() {
        CreateRouteViewModel createRouteViewModel = this.createRouteViewModel;
        sln slnVar = null;
        if (createRouteViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
            createRouteViewModel = null;
        }
        if (createRouteViewModel.getModuleSelected() instanceof CreateRouteViewModel.ModuleStatus.DistancePlan) {
            sln slnVar2 = this.mBinding;
            if (slnVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                slnVar2 = null;
            }
            slnVar2.M.setSelected(false);
            sln slnVar3 = this.mBinding;
            if (slnVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                slnVar3 = null;
            }
            slnVar3.G.setSelected(true);
        } else {
            sln slnVar4 = this.mBinding;
            if (slnVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                slnVar4 = null;
            }
            slnVar4.G.setSelected(false);
            sln slnVar5 = this.mBinding;
            if (slnVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                slnVar5 = null;
            }
            slnVar5.M.setSelected(true);
        }
        sln slnVar6 = this.mBinding;
        if (slnVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            slnVar6 = null;
        }
        slnVar6.I.setOnClickListener(new View.OnClickListener() { // from class: v15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRouteChooseModuleFragment.initChoice$lambda$0(this.f36368a, view);
            }
        });
        sln slnVar7 = this.mBinding;
        if (slnVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            slnVar = slnVar7;
        }
        slnVar.O.setOnClickListener(new View.OnClickListener() { // from class: w15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRouteChooseModuleFragment.initChoice$lambda$1(this.f37434a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initChoice$lambda$0(CreateRouteChooseModuleFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CreateRouteViewModel createRouteViewModel = this$0.createRouteViewModel;
        sln slnVar = null;
        if (createRouteViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
            createRouteViewModel = null;
        }
        createRouteViewModel.setModuleSelected(new CreateRouteViewModel.ModuleStatus.DistancePlan());
        sln slnVar2 = this$0.mBinding;
        if (slnVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            slnVar2 = null;
        }
        slnVar2.M.setSelected(false);
        sln slnVar3 = this$0.mBinding;
        if (slnVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            slnVar = slnVar3;
        }
        slnVar.G.setSelected(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initChoice$lambda$1(CreateRouteChooseModuleFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CreateRouteViewModel createRouteViewModel = this$0.createRouteViewModel;
        sln slnVar = null;
        if (createRouteViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
            createRouteViewModel = null;
        }
        createRouteViewModel.setModuleSelected(new CreateRouteViewModel.ModuleStatus.Char(""));
        sln slnVar2 = this$0.mBinding;
        if (slnVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            slnVar2 = null;
        }
        slnVar2.G.setSelected(false);
        sln slnVar3 = this$0.mBinding;
        if (slnVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            slnVar = slnVar3;
        }
        slnVar.M.setSelected(true);
    }

    private final void initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        sln slnVarA0 = sln.A0(inflater, container, false);
        this.mBinding = slnVarA0;
        p9n p9nVar = null;
        if (slnVarA0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            slnVarA0 = null;
        }
        this.midContentView = slnVarA0.K;
        sln slnVar = this.mBinding;
        if (slnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            slnVar = null;
        }
        this.contentLayout = slnVar.F;
        if (getActivity() instanceof CreateRouteActivity) {
            FragmentActivity activity = getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.xiaomi.fitness.sport.view.route.CreateRouteActivity");
            CreateRouteActivity createRouteActivity = (CreateRouteActivity) activity;
            this.createRouteActivity = createRouteActivity;
            if (createRouteActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
                createRouteActivity = null;
            }
            this.createRouteActivityBinding = createRouteActivity.getCreateRouteActivityBinding();
            CreateRouteActivity createRouteActivity2 = this.createRouteActivity;
            if (createRouteActivity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
                createRouteActivity2 = null;
            }
            this.createRouteViewModel = createRouteActivity2.getCreateRouteViewModel();
            p9n p9nVar2 = this.createRouteActivityBinding;
            if (p9nVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivityBinding");
            } else {
                p9nVar = p9nVar2;
            }
            p9nVar.K.setVisibility(0);
        }
        handleBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        initView(inflater, container, savedInstanceState);
        initChoice();
        initButtonState();
        initBehavior();
        sln slnVar = this.mBinding;
        if (slnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            slnVar = null;
        }
        View root = slnVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
