package com.huami.snore.ui.base;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.snore.core.R;
import com.huami.snore.ui.viewmodel.SnoreMonitorViewModel;
import com.huami.tools.analytics.DbUtils;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J&\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0011\u001a\u00020\rH&J\u0010\u0010\u0012\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\rJ\b\u0010\u0013\u001a\u00020\u0002H\u0016R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\u00020\u001b8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/huami/snore/ui/base/BaseSnoreMonitorFragment;", "Landroidx/fragment/app/Fragment;", "", "b", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "onAttach", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "getContentView", "meteorShow", "onDestroyView", "Landroidx/appcompat/app/AppCompatActivity;", "mActivity", "Landroidx/appcompat/app/AppCompatActivity;", "getMActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "setMActivity", "(Landroidx/appcompat/app/AppCompatActivity;)V", "Lcom/huami/snore/ui/viewmodel/SnoreMonitorViewModel;", "a", "Lkotlin/Lazy;", "getModel", "()Lcom/huami/snore/ui/viewmodel/SnoreMonitorViewModel;", "model", "<init>", "()V", "snore_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseSnoreMonitorFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy model;
    public AppCompatActivity mActivity;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseSnoreMonitorFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.snore.ui.base.BaseSnoreMonitorFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.model = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SnoreMonitorViewModel>() { // from class: com.huami.snore.ui.base.BaseSnoreMonitorFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.snore.ui.viewmodel.SnoreMonitorViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SnoreMonitorViewModel invoke() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SnoreMonitorViewModel.class), function0, objArr);
            }
        });
    }

    private final void b() {
        final Animation animationLoadAnimation = AnimationUtils.loadAnimation(getMActivity(), R.anim.meteor1_anim);
        final Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(getMActivity(), R.anim.meteor2_anim);
        final Animation animationLoadAnimation3 = AnimationUtils.loadAnimation(getMActivity(), R.anim.meteor3_anim);
        animationLoadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.huami.snore.ui.base.BaseSnoreMonitorFragment$startAnimation$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(@Nullable Animation p0) {
                BaseSnoreMonitorFragment baseSnoreMonitorFragment = this.a;
                View view = baseSnoreMonitorFragment.getView();
                baseSnoreMonitorFragment.meteorShow(view == null ? null : view.findViewById(R.id.meteorThree));
                View view2 = this.a.getView();
                ImageView imageView = (ImageView) (view2 != null ? view2.findViewById(R.id.meteorThree) : null);
                if (imageView == null) {
                    return;
                }
                imageView.startAnimation(animationLoadAnimation3);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(@Nullable Animation p0) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(@Nullable Animation p0) {
            }
        });
        animationLoadAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: com.huami.snore.ui.base.BaseSnoreMonitorFragment$startAnimation$2
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(@Nullable Animation p0) {
                BaseSnoreMonitorFragment baseSnoreMonitorFragment = this.a;
                View view = baseSnoreMonitorFragment.getView();
                baseSnoreMonitorFragment.meteorShow(view == null ? null : view.findViewById(R.id.meteorOne));
                View view2 = this.a.getView();
                ImageView imageView = (ImageView) (view2 != null ? view2.findViewById(R.id.meteorOne) : null);
                if (imageView == null) {
                    return;
                }
                imageView.startAnimation(animationLoadAnimation);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(@Nullable Animation p0) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(@Nullable Animation p0) {
            }
        });
        animationLoadAnimation3.setAnimationListener(new Animation.AnimationListener() { // from class: com.huami.snore.ui.base.BaseSnoreMonitorFragment$startAnimation$3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(@Nullable Animation p0) {
                BaseSnoreMonitorFragment baseSnoreMonitorFragment = this.a;
                View view = baseSnoreMonitorFragment.getView();
                baseSnoreMonitorFragment.meteorShow(view == null ? null : view.findViewById(R.id.meteorTwo));
                View view2 = this.a.getView();
                ImageView imageView = (ImageView) (view2 != null ? view2.findViewById(R.id.meteorTwo) : null);
                if (imageView == null) {
                    return;
                }
                imageView.startAnimation(animationLoadAnimation2);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(@Nullable Animation p0) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(@Nullable Animation p0) {
            }
        });
        View view = getView();
        meteorShow(view == null ? null : view.findViewById(R.id.meteorOne));
        View view2 = getView();
        ImageView imageView = (ImageView) (view2 != null ? view2.findViewById(R.id.meteorOne) : null);
        if (imageView == null) {
            return;
        }
        imageView.startAnimation(animationLoadAnimation);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public abstract View getContentView();

    @NotNull
    public final AppCompatActivity getMActivity() {
        AppCompatActivity appCompatActivity = this.mActivity;
        Objects.requireNonNull(appCompatActivity);
        return appCompatActivity;
    }

    @NotNull
    public final SnoreMonitorViewModel getModel() {
        return (SnoreMonitorViewModel) this.model.getValue();
    }

    public final void meteorShow(@Nullable View view) {
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = getView();
        if (Intrinsics.areEqual(view, view2 == null ? null : view2.findViewById(R.id.meteorOne))) {
            View view3 = getView();
            ImageView imageView = (ImageView) (view3 == null ? null : view3.findViewById(R.id.meteorTwo));
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            View view4 = getView();
            ImageView imageView2 = (ImageView) (view4 != null ? view4.findViewById(R.id.meteorThree) : null);
            if (imageView2 == null) {
                return;
            }
            imageView2.setVisibility(8);
            return;
        }
        View view5 = getView();
        if (Intrinsics.areEqual(view, view5 == null ? null : view5.findViewById(R.id.meteorTwo))) {
            View view6 = getView();
            ImageView imageView3 = (ImageView) (view6 == null ? null : view6.findViewById(R.id.meteorOne));
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
            View view7 = getView();
            ImageView imageView4 = (ImageView) (view7 != null ? view7.findViewById(R.id.meteorThree) : null);
            if (imageView4 == null) {
                return;
            }
            imageView4.setVisibility(8);
            return;
        }
        View view8 = getView();
        if (Intrinsics.areEqual(view, view8 == null ? null : view8.findViewById(R.id.meteorThree))) {
            View view9 = getView();
            ImageView imageView5 = (ImageView) (view9 == null ? null : view9.findViewById(R.id.meteorOne));
            if (imageView5 != null) {
                imageView5.setVisibility(8);
            }
            View view10 = getView();
            ImageView imageView6 = (ImageView) (view10 != null ? view10.findViewById(R.id.meteorTwo) : null);
            if (imageView6 == null) {
                return;
            }
            imageView6.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        if (context instanceof AppCompatActivity) {
            setMActivity((AppCompatActivity) context);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_snore_monitor_layout, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        View view = getView();
        ImageView imageView = (ImageView) (view == null ? null : view.findViewById(R.id.meteorOne));
        if (imageView != null) {
            imageView.clearAnimation();
        }
        View view2 = getView();
        ImageView imageView2 = (ImageView) (view2 == null ? null : view2.findViewById(R.id.meteorTwo));
        if (imageView2 != null) {
            imageView2.clearAnimation();
        }
        View view3 = getView();
        ImageView imageView3 = (ImageView) (view3 != null ? view3.findViewById(R.id.meteorThree) : null);
        if (imageView3 != null) {
            imageView3.clearAnimation();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        b();
        View view2 = getView();
        ((FrameLayout) (view2 == null ? null : view2.findViewById(R.id.mainContent))).addView(getContentView());
    }

    public final void setMActivity(@NotNull AppCompatActivity appCompatActivity) {
        this.mActivity = appCompatActivity;
    }
}
