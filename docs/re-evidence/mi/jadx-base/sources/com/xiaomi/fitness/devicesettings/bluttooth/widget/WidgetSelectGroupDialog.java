package com.xiaomi.fitness.devicesettings.bluttooth.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.view.ViewModelCreator;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetSelectGroupDialog;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import defpackage.eui;
import defpackage.in6;
import defpackage.l2j;
import defpackage.qyi;
import defpackage.sk5;
import defpackage.wzi;
import defpackage.zqi;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001&B\u0007¢\u0006\u0004\b%\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0006R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010 \u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetSelectGroupDialog;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lcom/xiaomi/fitness/baseui/view/ViewModelCreator;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetManagerV2ViewModel;", "", "initData", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", LifecycleConstantKt.ON_START, "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "Lin6;", "mBinding", "Lin6;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetV3SupportedList;", "mSupportedList", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetV3SupportedList;", "mViewModel$delegate", "Lkotlin/Lazy;", "getMViewModel", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetManagerV2ViewModel;", "mViewModel", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "viewModelFactory", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WidgetSelectGroupDialog extends BottomSheetDialogFragment implements ViewModelCreator<WidgetManagerV2ViewModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String WIDGET_GROUP_TAG = "widget_support_tag";
    private in6 mBinding;
    private Context mContext;
    private WidgetV3SupportedList mSupportedList;

    /* JADX INFO: renamed from: mViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: rjr
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetSelectGroupDialog.mViewModel_delegate$lambda$0(this.f32623a);
        }
    });

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetSelectGroupDialog$Companion;", "", "<init>", "()V", "WIDGET_GROUP_TAG", "", "startDialog", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startDialog(@NotNull FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            new WidgetSelectGroupDialog().show(fragmentManager, WidgetSelectGroupDialog.WIDGET_GROUP_TAG);
        }
    }

    private final WidgetManagerV2ViewModel getMViewModel() {
        return (WidgetManagerV2ViewModel) this.mViewModel.getValue();
    }

    private final void initData() {
        WidgetV3SupportedList value = getMViewModel().getSupportWidget().getValue();
        Intrinsics.checkNotNull(value);
        this.mSupportedList = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WidgetManagerV2ViewModel mViewModel_delegate$lambda$0(WidgetSelectGroupDialog this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (WidgetManagerV2ViewModel) this$0.initViewModel((ViewModelStoreOwner) this$0.requireActivity(), Reflection.getOrCreateKotlinClass(WidgetManagerV2ViewModel.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$1(WidgetSelectGroupDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(WidgetSelectGroupDialog this$0, int i, RightArrowSingleLineTextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        WidgetManagerV2ViewModel mViewModel = this$0.getMViewModel();
        WidgetV3SupportedList widgetV3SupportedList = this$0.mSupportedList;
        if (widgetV3SupportedList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSupportedList");
            widgetV3SupportedList = null;
        }
        mViewModel.setSelectNativeBuiltinGroup(widgetV3SupportedList.getBuiltinGroups().get(i));
        WidgetSelectDialog.Companion companion = WidgetSelectDialog.INSTANCE;
        FragmentManager parentFragmentManager = this$0.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        companion.startDialog(parentFragmentManager);
        this$0.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.ViewModelCreator
    @NotNull
    public ViewModelProvider.Factory getViewModelFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = requireActivity().getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "<get-defaultViewModelProviderFactory>(...)");
        return defaultViewModelProviderFactory;
    }

    @Override // com.xiaomi.fitness.baseui.view.ViewModelCreator
    public /* bridge */ /* synthetic */ AbsViewModel initViewModel(ViewModelStoreOwner viewModelStoreOwner, KClass kClass) {
        return initViewModel(viewModelStoreOwner, (KClass<WidgetManagerV2ViewModel>) kClass);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, l2j.f24570a);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.mContext = requireContext();
        in6 in6Var = (in6) sk5.j(inflater, eui.i2, container, false);
        this.mBinding = in6Var;
        in6 in6Var2 = null;
        if (in6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            in6Var = null;
        }
        in6Var.C.C.setText(getString(wzi.V9));
        in6 in6Var3 = this.mBinding;
        if (in6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            in6Var3 = null;
        }
        in6Var3.C.A.setOnClickListener(new View.OnClickListener() { // from class: tjr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WidgetSelectGroupDialog.onCreateView$lambda$1(this.f34774a, view);
            }
        });
        initData();
        in6 in6Var4 = this.mBinding;
        if (in6Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            in6Var2 = in6Var4;
        }
        return in6Var2.getRoot();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Context context;
        super.onStart();
        Dialog dialog = getDialog();
        FrameLayout frameLayout = dialog != null ? (FrameLayout) dialog.findViewById(zqi.f1) : null;
        if (frameLayout != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            UIUtils uIUtils = UIUtils.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            int screenHeight = uIUtils.getScreenHeight(fragmentActivityRequireActivity);
            Context context2 = this.mContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
                context2 = null;
            }
            layoutParams.height = screenHeight - uIUtils.dip2px(context2, 52.0f);
            in6 in6Var = this.mBinding;
            if (in6Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                in6Var = null;
            }
            in6Var.B.getLayoutParams().height = frameLayout.getLayoutParams().height;
            BottomSheetBehavior bottomSheetBehaviorB = BottomSheetBehavior.B(frameLayout);
            Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorB, "from(...)");
            bottomSheetBehaviorB.W(3000);
            bottomSheetBehaviorB.setState(3);
        }
        if (this.mSupportedList != null) {
            in6 in6Var2 = this.mBinding;
            if (in6Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                in6Var2 = null;
            }
            in6Var2.A.removeAllViews();
            WidgetV3SupportedList widgetV3SupportedList = this.mSupportedList;
            if (widgetV3SupportedList == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSupportedList");
                widgetV3SupportedList = null;
            }
            int size = widgetV3SupportedList.getBuiltinGroups().size();
            for (final int i = 0; i < size; i++) {
                WidgetV3SupportedList widgetV3SupportedList2 = this.mSupportedList;
                if (widgetV3SupportedList2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSupportedList");
                    widgetV3SupportedList2 = null;
                }
                WidgetV3NativeBuiltinGroup widgetV3NativeBuiltinGroup = widgetV3SupportedList2.getBuiltinGroups().get(i);
                int size2 = widgetV3NativeBuiltinGroup.getBuiltinWidgets().size();
                if (size2 != 0) {
                    Context context3 = this.mContext;
                    if (context3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mContext");
                        context = null;
                    } else {
                        context = context3;
                    }
                    RightArrowSingleLineTextView rightArrowSingleLineTextView = new RightArrowSingleLineTextView(context, null, 0, 6, null);
                    rightArrowSingleLineTextView.showMore(true);
                    rightArrowSingleLineTextView.setRemindText(getResources().getQuantityString(qyi.y, size2, Integer.valueOf(size2)));
                    rightArrowSingleLineTextView.setTitle(widgetV3NativeBuiltinGroup.getName());
                    ViewExtKt.clickWithTrigger$default(rightArrowSingleLineTextView, 0L, new Function1() { // from class: sjr
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return WidgetSelectGroupDialog.onStart$lambda$3(this.f33716a, i, (RightArrowSingleLineTextView) obj);
                        }
                    }, 1, null);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams2.setMargins(0, 15, 0, 15);
                    UIUtils uIUtils2 = UIUtils.INSTANCE;
                    Context context4 = this.mContext;
                    if (context4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mContext");
                        context4 = null;
                    }
                    layoutParams2.setMarginStart(uIUtils2.dip2px(context4, 26.0f));
                    Context context5 = this.mContext;
                    if (context5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mContext");
                        context5 = null;
                    }
                    layoutParams2.setMarginEnd(uIUtils2.dip2px(context5, 16.0f));
                    rightArrowSingleLineTextView.setLayoutParams(layoutParams2);
                    in6 in6Var3 = this.mBinding;
                    if (in6Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        in6Var3 = null;
                    }
                    in6Var3.A.addView(rightArrowSingleLineTextView);
                }
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.ViewModelCreator
    @NotNull
    public WidgetManagerV2ViewModel initViewModel(@Nullable ViewModelStoreOwner viewModelStoreOwner, @Nullable KClass<WidgetManagerV2ViewModel> kClass) {
        return (WidgetManagerV2ViewModel) ViewModelCreator.DefaultImpls.initViewModel(this, viewModelStoreOwner, kClass);
    }
}
