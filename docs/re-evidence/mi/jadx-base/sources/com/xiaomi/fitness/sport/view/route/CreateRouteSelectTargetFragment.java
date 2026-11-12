package com.xiaomi.fitness.sport.view.route;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.sport.baseui.SportNumberPicker;
import com.xiaomi.fitness.sport.view.route.CreateRouteSelectTargetFragment;
import com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel;
import defpackage.dvi;
import defpackage.imn;
import defpackage.p9n;
import defpackage.zxi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b)\u0010\fJ+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\fJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\fR\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010!R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/CreateRouteSelectTargetFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "", "initView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V", "handleBackPressed", "()V", "initTargetDistancePicker", "initBehavior", "initButtonState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", LifecycleConstantKt.ON_RESUME, "Limn;", "mBinding", "Limn;", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;", "createRouteActivity", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;", "Lp9n;", "createRouteActivityBinding", "Lp9n;", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "createRouteViewModel", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "midContentView", "Landroid/view/View;", "contentLayout", "Lcom/xiaomi/fitness/sport/baseui/SportNumberPicker;", "numberPicker", "Lcom/xiaomi/fitness/sport/baseui/SportNumberPicker;", "", "midMinHeight", "I", "<init>", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCreateRouteSelectTargetFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateRouteSelectTargetFragment.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteSelectTargetFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,148:1\n1557#2:149\n1628#2,3:150\n37#3:153\n36#3,3:154\n*S KotlinDebug\n*F\n+ 1 CreateRouteSelectTargetFragment.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteSelectTargetFragment\n*L\n96#1:149\n96#1:150,3\n96#1:153\n96#1:154,3\n*E\n"})
public final class CreateRouteSelectTargetFragment extends Fragment {

    @NotNull
    public static final String TAG = "CreateRouteSelectTargetFragment";
    private View contentLayout;
    private CreateRouteActivity createRouteActivity;
    private p9n createRouteActivityBinding;
    private CreateRouteViewModel createRouteViewModel;
    private imn mBinding;
    private View midContentView;
    private final int midMinHeight;
    private SportNumberPicker numberPicker;

    public CreateRouteSelectTargetFragment() {
        super(dvi.i0);
        this.midMinHeight = ExtUtilsKt.getDp(52);
    }

    private final void handleBackPressed() {
        CreateRouteActivity createRouteActivity = this.createRouteActivity;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        createRouteActivity.setBackPressedFragment(this, new Function0() { // from class: y35
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateRouteSelectTargetFragment.handleBackPressed$lambda$0(this.f39744a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleBackPressed$lambda$0(CreateRouteSelectTargetFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CreateRouteActivity createRouteActivity = this$0.createRouteActivity;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        createRouteActivity.replaceBottomSheetFragment(new CreateRouteChooseModuleFragment());
        return Unit.INSTANCE;
    }

    private final void initBehavior() {
        CreateRouteActivity createRouteActivity;
        CreateRouteActivity createRouteActivity2 = this.createRouteActivity;
        imn imnVar = null;
        if (createRouteActivity2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        } else {
            createRouteActivity = createRouteActivity2;
        }
        imn imnVar2 = this.mBinding;
        if (imnVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            imnVar = imnVar2;
        }
        View root = imnVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        CreateRouteActivity.setDefaultBehavior$default(createRouteActivity, root, this.midMinHeight, true, false, 8, null);
    }

    private final void initButtonState() {
        imn imnVar = this.mBinding;
        imn imnVar2 = null;
        if (imnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            imnVar = null;
        }
        imnVar.C.setOnClickListener(new View.OnClickListener() { // from class: a45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRouteSelectTargetFragment.initButtonState$lambda$4(this.f595a, view);
            }
        });
        imn imnVar3 = this.mBinding;
        if (imnVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            imnVar2 = imnVar3;
        }
        imnVar2.B.setOnClickListener(new View.OnClickListener() { // from class: b45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRouteSelectTargetFragment.initButtonState$lambda$5(this.f3778a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initButtonState$lambda$4(CreateRouteSelectTargetFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CreateRouteActivity createRouteActivity = this$0.createRouteActivity;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        createRouteActivity.replaceBottomSheetFragment(new CreateRouteChooseModuleFragment());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initButtonState$lambda$5(CreateRouteSelectTargetFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new CreateRouteSelectTargetFragment$initButtonState$2$1(this$0, null), 3, null);
    }

    private final void initTargetDistancePicker() {
        imn imnVar = this.mBinding;
        imn imnVar2 = null;
        if (imnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            imnVar = null;
        }
        SportNumberPicker sportNumberPicker = imnVar.H;
        this.numberPicker = sportNumberPicker;
        if (sportNumberPicker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("numberPicker");
            sportNumberPicker = null;
        }
        sportNumberPicker.setWrapSelectorWheel(false);
        CreateRouteViewModel createRouteViewModel = this.createRouteViewModel;
        if (createRouteViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
            createRouteViewModel = null;
        }
        List<Pair<String, Double>> selectTargetDistanceOptionPairs = createRouteViewModel.getSelectTargetDistanceOptionPairs();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(selectTargetDistanceOptionPairs, 10));
        Iterator<T> it = selectTargetDistanceOptionPairs.iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Pair) it.next()).getFirst());
        }
        sportNumberPicker.setDisplayedValues((String[]) arrayList.toArray(new String[0]));
        sportNumberPicker.setMinValue(0);
        CreateRouteViewModel createRouteViewModel2 = this.createRouteViewModel;
        if (createRouteViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
            createRouteViewModel2 = null;
        }
        sportNumberPicker.setMaxValue(createRouteViewModel2.getSelectTargetDistanceOptionPairs().size() - 1);
        CreateRouteViewModel createRouteViewModel3 = this.createRouteViewModel;
        if (createRouteViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
            createRouteViewModel3 = null;
        }
        sportNumberPicker.setValue(createRouteViewModel3.getSavedPickerPosition());
        String quantityString = sportNumberPicker.getResources().getQuantityString(zxi.p, sportNumberPicker.getMinValue());
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        imn imnVar3 = this.mBinding;
        if (imnVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            imnVar2 = imnVar3;
        }
        imnVar2.L.setText(quantityString);
        sportNumberPicker.setOnValueChangedListener(new SportNumberPicker.h() { // from class: z35
            @Override // com.xiaomi.fitness.sport.baseui.SportNumberPicker.h
            public final void a(SportNumberPicker sportNumberPicker2, int i, int i2) {
                CreateRouteSelectTargetFragment.initTargetDistancePicker$lambda$3$lambda$2(this.f40832a, sportNumberPicker2, i, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTargetDistancePicker$lambda$3$lambda$2(CreateRouteSelectTargetFragment this$0, SportNumberPicker sportNumberPicker, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CreateRouteViewModel createRouteViewModel = this$0.createRouteViewModel;
        if (createRouteViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
            createRouteViewModel = null;
        }
        createRouteViewModel.setSavedPickerPosition(i2);
    }

    private final void initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        imn imnVarA0 = imn.A0(inflater, container, false);
        this.mBinding = imnVarA0;
        p9n p9nVar = null;
        if (imnVarA0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            imnVarA0 = null;
        }
        this.midContentView = imnVarA0.F;
        imn imnVar = this.mBinding;
        if (imnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            imnVar = null;
        }
        this.contentLayout = imnVar.E;
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
        initButtonState();
        initTargetDistancePicker();
        initBehavior();
        imn imnVar = this.mBinding;
        if (imnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            imnVar = null;
        }
        View root = imnVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }
}
