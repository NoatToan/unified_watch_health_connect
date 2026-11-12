package com.xiaomi.hm.health.play.skill;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.discovery.bridge.WebFragment;
import com.huami.discovery.bridge.model.WebItem;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import com.huami.watch.hmwatchmanager.R;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.play.skill.SkillFragment;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b-\u0010.J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001a\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)¨\u00060"}, d2 = {"Lcom/xiaomi/hm/health/play/skill/SkillFragment;", "Lcom/huami/discovery/bridge/WebFragment;", "", "j0", "g0", "showLoadingDialog", "hideLoadingDialog", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "", "errorCode", "dealErrorTip", "onResume", "onPause", "Lcom/xiaomi/hm/health/play/skill/SkillViewModel;", "K", "Lkotlin/Lazy;", "f0", "()Lcom/xiaomi/hm/health/play/skill/SkillViewModel;", "skillViewModel", "L", "e0", "()Landroid/view/View;", "errorLayout", "Landroid/widget/ProgressBar;", "M", "Landroid/widget/ProgressBar;", "progressBar", "Landroid/widget/FrameLayout;", "N", "Landroid/widget/FrameLayout;", "webLayout", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "O", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "", "P", "Z", "isPageHidden", "Q", "isNeedReload", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
@SuppressLint({"InflateParams"})
public final class SkillFragment extends WebFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String R = "Item";

    @NotNull
    private static final String S = "SkillFragment";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    private final Lazy skillViewModel;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    private final Lazy errorLayout;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private ProgressBar progressBar;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private FrameLayout webLayout;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mLoadingDialog;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private boolean isPageHidden;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private boolean isNeedReload;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/play/skill/SkillFragment$Companion;", "", "Lcom/xiaomi/hm/health/play/skill/SkillFragment;", "newInstance", "", "ARGS_ITEM", "Ljava/lang/String;", "TAG", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SkillFragment newInstance() {
            SkillFragment skillFragment = new SkillFragment();
            Bundle bundle = new Bundle();
            WebItem webItem = new WebItem();
            webItem.showProgressBar = true;
            webItem.isUseCache = false;
            Unit unit = Unit.INSTANCE;
            bundle.putParcelable(SkillFragment.R, webItem);
            skillFragment.setArguments(bundle);
            return skillFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<View> {
        public a() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(SkillFragment skillFragment, TextView textView, View view) {
            if (!NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
                IconToast.showError(textView.getContext(), R.string.bridge_no_network);
            } else {
                skillFragment.showLoadingDialog();
                skillFragment.f0().getSkillUrl();
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            View viewInflate = LayoutInflater.from(SkillFragment.this.requireContext()).inflate(R.layout.play_skill_layout_error, (ViewGroup) null);
            final SkillFragment skillFragment = SkillFragment.this;
            final TextView textView = (TextView) viewInflate.findViewById(R.id.tv_retry);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(ExtensionsKt.getDp(6.0f));
            gradientDrawable.setColor(Color.parseColor("#fe5757"));
            Unit unit = Unit.INSTANCE;
            textView.setBackground(gradientDrawable);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.play.skill.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SkillFragment.a.b(skillFragment, textView, view);
                }
            });
            return viewInflate;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "final url: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceBindEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HMDeviceBindEvent hMDeviceBindEvent) {
            super(0);
            this.a = hMDeviceBindEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "receive device bound " + this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SkillFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.play.skill.SkillFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.skillViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SkillViewModel>() { // from class: com.xiaomi.hm.health.play.skill.SkillFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.play.skill.SkillViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SkillViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SkillViewModel.class), function0, objArr);
            }
        });
        this.errorLayout = LazyKt__LazyJVMKt.lazy(new a());
        this.isPageHidden = true;
    }

    private final View e0() {
        return (View) this.errorLayout.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SkillViewModel f0() {
        return (SkillViewModel) this.skillViewModel.getValue();
    }

    private final void g0() {
        ExtensionsKt.visible(getWebView());
        e0().setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h0(SkillFragment skillFragment, String str) {
        HMLog.info(S, new b(str));
        skillFragment.hideLoadingDialog();
        if (str == null) {
            skillFragment.j0();
            return;
        }
        skillFragment.g0();
        skillFragment.loadPage(str);
        if (skillFragment.isNeedReload) {
            skillFragment.getWebView().loadUrl("javascript:window.location.reload(true)");
        }
    }

    private final void hideLoadingDialog() {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog != null && loadingDialog.isShowing()) {
            loadingDialog.dismiss();
            this.mLoadingDialog = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i0(SkillFragment skillFragment, HMDeviceBindEvent hMDeviceBindEvent) {
        if (hMDeviceBindEvent != null) {
            skillFragment.isNeedReload = true;
            HMLog.info(S, new c(hMDeviceBindEvent));
        }
        skillFragment.f0().getSkillUrl();
    }

    private final void j0() {
        ProgressBar progressBar = this.progressBar;
        Objects.requireNonNull(progressBar);
        progressBar.setProgress(0);
        ExtensionsKt.gone(getWebView());
        e0().setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLoadingDialog() {
        if (this.isPageHidden) {
            return;
        }
        String string = getString(R.string.wf_page_loading);
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog == null) {
            this.mLoadingDialog = LoadingDialog.showDialog(getActivity(), string);
        } else {
            if (loadingDialog.isShowing()) {
                return;
            }
            loadingDialog.setCancelable(false);
            loadingDialog.setMessage(string);
            loadingDialog.show();
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.discovery.bridge.WebFragment
    public void dealErrorTip(int errorCode) {
        this.isNeedReload = true;
        j0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.isPageHidden = true;
    }

    @Override // com.huami.discovery.bridge.WebFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.isPageHidden = false;
    }

    @Override // com.huami.discovery.bridge.WebFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.webLayout = (FrameLayout) view.findViewById(R.id.web_view_layout);
        getWebView().setBackgroundColor(0);
        FrameLayout frameLayout = this.webLayout;
        Objects.requireNonNull(frameLayout);
        View viewE0 = e0();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        Unit unit = Unit.INSTANCE;
        frameLayout.addView(viewE0, layoutParams);
        this.progressBar = (ProgressBar) view.findViewById(R.id.web_view_progress_inner);
        e0().setVisibility(8);
        f0().getSkillLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: sv6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SkillFragment.h0(this.a, (String) obj);
            }
        });
        f0().getDeviceBoundLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: rv6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SkillFragment.i0(this.a, (HMDeviceBindEvent) obj);
            }
        });
    }
}
