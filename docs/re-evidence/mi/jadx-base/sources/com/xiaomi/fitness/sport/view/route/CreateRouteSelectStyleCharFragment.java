package com.xiaomi.fitness.sport.view.route;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleCharFragment;
import com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.emn;
import defpackage.p9n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010\fJ+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\fJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010 ¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/CreateRouteSelectStyleCharFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "", "initView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V", "handleBackPressed", "()V", "initCharInput", "initBehavior", "initButtonState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lemn;", "mBinding", "Lemn;", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;", "createRouteActivity", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;", "Lp9n;", "createRouteActivityBinding", "Lp9n;", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "createRouteViewModel", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "midContentView", "Landroid/view/View;", "contentLayout", "<init>", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CreateRouteSelectStyleCharFragment extends Fragment {
    private View contentLayout;
    private CreateRouteActivity createRouteActivity;
    private p9n createRouteActivityBinding;
    private CreateRouteViewModel createRouteViewModel;
    private emn mBinding;
    private View midContentView;

    public CreateRouteSelectStyleCharFragment() {
        super(dvi.g0);
    }

    private final void handleBackPressed() {
        CreateRouteActivity createRouteActivity = this.createRouteActivity;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        createRouteActivity.setBackPressedFragment(this, new Function0() { // from class: p35
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateRouteSelectStyleCharFragment.handleBackPressed$lambda$0(this.f29955a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleBackPressed$lambda$0(CreateRouteSelectStyleCharFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CreateRouteActivity createRouteActivity = this$0.createRouteActivity;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        createRouteActivity.replaceBottomSheetFragment(new CreateRouteSelectStyleFragment());
        return Unit.INSTANCE;
    }

    private final void initBehavior() {
        CreateRouteActivity createRouteActivity;
        CreateRouteActivity createRouteActivity2 = this.createRouteActivity;
        emn emnVar = null;
        if (createRouteActivity2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        } else {
            createRouteActivity = createRouteActivity2;
        }
        emn emnVar2 = this.mBinding;
        if (emnVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            emnVar = emnVar2;
        }
        View root = emnVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        CreateRouteActivity.setDefaultBehavior$default(createRouteActivity, root, 0, false, false, 10, null);
    }

    private final void initButtonState() {
        emn emnVar = this.mBinding;
        emn emnVar2 = null;
        if (emnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            emnVar = null;
        }
        emnVar.D.setOnClickListener(new View.OnClickListener() { // from class: m35
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRouteSelectStyleCharFragment.initButtonState$lambda$3(this.f25704a, view);
            }
        });
        emn emnVar3 = this.mBinding;
        if (emnVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            emnVar3 = null;
        }
        emnVar3.C.setOnClickListener(new View.OnClickListener() { // from class: n35
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRouteSelectStyleCharFragment.initButtonState$lambda$4(this.f27503a, view);
            }
        });
        emn emnVar4 = this.mBinding;
        if (emnVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            emnVar2 = emnVar4;
        }
        emnVar2.B.setOnClickListener(new View.OnClickListener() { // from class: o35
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRouteSelectStyleCharFragment.initButtonState$lambda$5(this.f28689a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initButtonState$lambda$3(CreateRouteSelectStyleCharFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CreateRouteActivity createRouteActivity = this$0.createRouteActivity;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        createRouteActivity.replaceBottomSheetFragment(new CreateRouteSelectStyleFragment());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initButtonState$lambda$4(CreateRouteSelectStyleCharFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new CreateRouteSelectStyleCharFragment$initButtonState$2$1(this$0, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initButtonState$lambda$5(CreateRouteSelectStyleCharFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CreateRouteActivity createRouteActivity = this$0.createRouteActivity;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        String string = this$0.getString(c1j.i3);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        createRouteActivity.showHintText(string, 2500);
    }

    private final void initCharInput() {
        CreateRouteViewModel createRouteViewModel = this.createRouteViewModel;
        emn emnVar = null;
        if (createRouteViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
            createRouteViewModel = null;
        }
        CreateRouteViewModel.ModuleStatus moduleSelected = createRouteViewModel.getModuleSelected();
        final CreateRouteViewModel.ModuleStatus.Char r0 = moduleSelected instanceof CreateRouteViewModel.ModuleStatus.Char ? (CreateRouteViewModel.ModuleStatus.Char) moduleSelected : null;
        emn emnVar2 = this.mBinding;
        if (emnVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            emnVar2 = null;
        }
        emnVar2.E.setOnClickListener(new View.OnClickListener() { // from class: q35
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRouteSelectStyleCharFragment.initCharInput$lambda$1(this.f31036a, r0, view);
            }
        });
        emn emnVar3 = this.mBinding;
        if (emnVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            emnVar3 = null;
        }
        emnVar3.J.addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleCharFragment.initCharInput.2
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                Regex regex = new Regex("^[a-zA-Z0-9]*$");
                String strValueOf = String.valueOf(s);
                if (!regex.matches(strValueOf)) {
                    if (s != null) {
                        s.delete(s.length() - 1, s.length());
                        return;
                    }
                    return;
                }
                emn emnVar4 = null;
                if (strValueOf.length() <= 0) {
                    emn emnVar5 = this.mBinding;
                    if (emnVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        emnVar5 = null;
                    }
                    emnVar5.E.setVisibility(8);
                    emn emnVar6 = this.mBinding;
                    if (emnVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        emnVar6 = null;
                    }
                    emnVar6.C.setVisibility(8);
                    emn emnVar7 = this.mBinding;
                    if (emnVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    } else {
                        emnVar4 = emnVar7;
                    }
                    emnVar4.B.setVisibility(0);
                    return;
                }
                CreateRouteViewModel.ModuleStatus.Char r6 = r0;
                if (r6 != null) {
                    emn emnVar8 = this.mBinding;
                    if (emnVar8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        emnVar8 = null;
                    }
                    r6.setPlanInfo(String.valueOf(emnVar8.J.getText()));
                }
                emn emnVar9 = this.mBinding;
                if (emnVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    emnVar9 = null;
                }
                emnVar9.E.setVisibility(0);
                emn emnVar10 = this.mBinding;
                if (emnVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    emnVar10 = null;
                }
                emnVar10.C.setVisibility(0);
                emn emnVar11 = this.mBinding;
                if (emnVar11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    emnVar4 = emnVar11;
                }
                emnVar4.B.setVisibility(8);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });
        if (r0 != null) {
            if ((!StringsKt__StringsKt.isBlank(r0.getPlanInfo())) || r0.getPlanInfo().length() > 0) {
                emn emnVar4 = this.mBinding;
                if (emnVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    emnVar = emnVar4;
                }
                emnVar.J.setText(r0.getPlanInfo());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCharInput$lambda$1(CreateRouteSelectStyleCharFragment this$0, CreateRouteViewModel.ModuleStatus.Char r4, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        emn emnVar = this$0.mBinding;
        emn emnVar2 = null;
        if (emnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            emnVar = null;
        }
        emnVar.J.setText("");
        if (r4 != null) {
            emn emnVar3 = this$0.mBinding;
            if (emnVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                emnVar2 = emnVar3;
            }
            r4.setPlanInfo(String.valueOf(emnVar2.J.getText()));
        }
    }

    private final void initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        emn emnVarA0 = emn.A0(inflater, container, false);
        this.mBinding = emnVarA0;
        p9n p9nVar = null;
        if (emnVarA0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            emnVarA0 = null;
        }
        this.midContentView = emnVarA0.K;
        emn emnVar = this.mBinding;
        if (emnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            emnVar = null;
        }
        this.contentLayout = emnVar.I;
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
            p9nVar.K.setVisibility(8);
        }
        handleBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        initView(inflater, container, savedInstanceState);
        initButtonState();
        initBehavior();
        initCharInput();
        emn emnVar = this.mBinding;
        if (emnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            emnVar = null;
        }
        View root = emnVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
