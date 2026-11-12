package com.xiaomi.hm.health.device.headset.ui.fragment;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.huami.devicex.R;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.headset.ui.fragment.HeadsetBindHintFragment;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 +2\u00020\u0001:\u0001+B\u0011\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016R\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R*\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006,"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/ui/fragment/HeadsetBindHintFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "", "h", "i", GoogleApiAvailabilityLight.a, z.j, hl.k, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "dismiss", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "a", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getBindDeviceSource", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "bindDeviceSource", "Landroidx/appcompat/widget/AppCompatImageView;", "b", "Landroidx/appcompat/widget/AppCompatImageView;", "headsetAnimImg", "Landroid/animation/AnimatorSet;", "c", "Landroid/animation/AnimatorSet;", "headsetAnim", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "getDismissListener", "()Lkotlin/jvm/functions/Function0;", "setDismissListener", "(Lkotlin/jvm/functions/Function0;)V", "dismissListener", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HeadsetBindHintFragment extends BottomSheetDialogFragment {

    @NotNull
    public static final String TAG = "HeadsetBindHintFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final HMDeviceSource bindDeviceSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private AppCompatImageView headsetAnimImg;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private AnimatorSet headsetAnim;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> dismissListener;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.OTHER_LULLABY.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HeadsetBindHintFragment(@Nullable HMDeviceSource hMDeviceSource) {
        this.bindDeviceSource = hMDeviceSource;
    }

    private final void d() {
        View view = getView();
        ((Button) (view == null ? null : view.findViewById(R.id.negative_btn))).setOnClickListener(new View.OnClickListener() { // from class: gt3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HeadsetBindHintFragment.e(this.a, view2);
            }
        });
        View view2 = getView();
        ((Button) (view2 == null ? null : view2.findViewById(R.id.positive_btn))).setOnClickListener(new View.OnClickListener() { // from class: ht3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                HeadsetBindHintFragment.f(this.a, view3);
            }
        });
        View view3 = getView();
        ((Button) (view3 != null ? view3.findViewById(R.id.done) : null)).setOnClickListener(new View.OnClickListener() { // from class: ft3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                HeadsetBindHintFragment.g(this.a, view4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(HeadsetBindHintFragment headsetBindHintFragment, View view) {
        headsetBindHintFragment.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(HeadsetBindHintFragment headsetBindHintFragment, View view) {
        headsetBindHintFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(HeadsetBindHintFragment headsetBindHintFragment, View view) {
        headsetBindHintFragment.dismiss();
    }

    private final void h() {
        View view = getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.title))).setText(getString(R.string.headset_bind_hint_title_1));
        View view2 = getView();
        ((TextView) (view2 == null ? null : view2.findViewById(R.id.msg))).setText(getString(R.string.headset_bind_hint_msg_1));
        View view3 = getView();
        ((AppCompatImageView) (view3 == null ? null : view3.findViewById(R.id.headset_img))).setBackgroundResource(R.drawable.private_haydn_img_bind_headset_searching);
        j();
        View view4 = getView();
        ((Button) (view4 == null ? null : view4.findViewById(R.id.negative_btn))).setVisibility(0);
        View view5 = getView();
        ((Button) (view5 == null ? null : view5.findViewById(R.id.positive_btn))).setVisibility(0);
        View view6 = getView();
        ((Button) (view6 == null ? null : view6.findViewById(R.id.done))).setVisibility(8);
        View view7 = getView();
        ((LottieAnimationView) (view7 == null ? null : view7.findViewById(R.id.lottie_btn))).setVisibility(8);
        View view8 = getView();
        if (((LottieAnimationView) (view8 == null ? null : view8.findViewById(R.id.lottie_btn))).isAnimating()) {
            View view9 = getView();
            ((LottieAnimationView) (view9 != null ? view9.findViewById(R.id.lottie_btn) : null)).cancelAnimation();
        }
    }

    private final void i() {
        View view = getView();
        TextView textView = (TextView) (view == null ? null : view.findViewById(R.id.title));
        HMDeviceSource hMDeviceSource = this.bindDeviceSource;
        textView.setText((hMDeviceSource == null ? -1 : WhenMappings.$EnumSwitchMapping$0[hMDeviceSource.ordinal()]) == 1 ? getString(R.string.headset_lullbay_bind_light_title) : getString(R.string.headset_bind_hint_title_2));
        View view2 = getView();
        TextView textView2 = (TextView) (view2 == null ? null : view2.findViewById(R.id.msg));
        HMDeviceSource hMDeviceSource2 = this.bindDeviceSource;
        textView2.setText((hMDeviceSource2 != null ? WhenMappings.$EnumSwitchMapping$0[hMDeviceSource2.ordinal()] : -1) == 1 ? getString(R.string.headset_lullbay_bind_light_msg) : getString(R.string.headset_bind_hint_msg_2));
        k();
        View view3 = getView();
        ((AppCompatImageView) (view3 == null ? null : view3.findViewById(R.id.headset_img))).setBackgroundResource(R.drawable.private_haydn_img_back);
        View view4 = getView();
        ((Button) (view4 == null ? null : view4.findViewById(R.id.negative_btn))).setVisibility(8);
        View view5 = getView();
        ((Button) (view5 == null ? null : view5.findViewById(R.id.positive_btn))).setVisibility(8);
        View view6 = getView();
        ((Button) (view6 == null ? null : view6.findViewById(R.id.done))).setVisibility(0);
        View view7 = getView();
        ((LottieAnimationView) (view7 == null ? null : view7.findViewById(R.id.lottie_btn))).setVisibility(0);
        View view8 = getView();
        ((LottieAnimationView) (view8 != null ? view8.findViewById(R.id.lottie_btn) : null)).playAnimation();
    }

    private final void j() {
        AppCompatImageView appCompatImageView = this.headsetAnimImg;
        if (appCompatImageView == null) {
            AppCompatImageView appCompatImageView2 = new AppCompatImageView(requireContext());
            this.headsetAnimImg = appCompatImageView2;
            appCompatImageView2.setBackgroundResource(R.drawable.private_haydn_placeholder_img);
            View view = getView();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(((AppCompatImageView) (view == null ? null : view.findViewById(R.id.headset_img))).getLayoutParams());
            AppCompatImageView appCompatImageView3 = this.headsetAnimImg;
            if (appCompatImageView3 != null) {
                appCompatImageView3.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            }
            View view2 = getView();
            View viewFindViewById = view2 != null ? view2.findViewById(R.id.frame_headset_img) : null;
            Objects.requireNonNull(viewFindViewById, "null cannot be cast to non-null type android.widget.FrameLayout");
            ((FrameLayout) viewFindViewById).addView(this.headsetAnimImg, layoutParams);
        } else if (appCompatImageView != null) {
            appCompatImageView.setVisibility(0);
        }
        if (this.headsetAnim == null) {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(requireContext(), R.animator.anim_headset_bind_searching);
            Objects.requireNonNull(animatorLoadAnimator, "null cannot be cast to non-null type android.animation.AnimatorSet");
            AnimatorSet animatorSet = (AnimatorSet) animatorLoadAnimator;
            this.headsetAnim = animatorSet;
            animatorSet.setTarget(this.headsetAnimImg);
            AnimatorSet animatorSet2 = this.headsetAnim;
            if (animatorSet2 != null) {
                animatorSet2.addListener(new Animator.AnimatorListener() { // from class: com.xiaomi.hm.health.device.headset.ui.fragment.HeadsetBindHintFragment$startHeadsetAnimation$1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(@NotNull Animator animation) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(@NotNull Animator animation) {
                        AnimatorSet animatorSet3;
                        AppCompatImageView appCompatImageView4 = this.a.headsetAnimImg;
                        boolean z = false;
                        if (appCompatImageView4 != null && appCompatImageView4.getVisibility() == 0) {
                            z = true;
                        }
                        if (!z || (animatorSet3 = this.a.headsetAnim) == null) {
                            return;
                        }
                        animatorSet3.start();
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(@NotNull Animator animation) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(@NotNull Animator animation) {
                    }
                });
            }
        }
        AnimatorSet animatorSet3 = this.headsetAnim;
        if (animatorSet3 == null) {
            return;
        }
        animatorSet3.start();
    }

    private final void k() {
        AppCompatImageView appCompatImageView = this.headsetAnimImg;
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(8);
        }
        AnimatorSet animatorSet = this.headsetAnim;
        if (animatorSet == null) {
            return;
        }
        animatorSet.cancel();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.fragment.app.DialogFragment
    public void dismiss() {
        Function0<Unit> function0 = this.dismissListener;
        if (function0 != null) {
            function0.invoke();
        }
        super.dismiss();
    }

    @Nullable
    public final HMDeviceSource getBindDeviceSource() {
        return this.bindDeviceSource;
    }

    @Nullable
    public final Function0<Unit> getDismissListener() {
        return this.dismissListener;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R.style.CustomBottomSheetDialogTheme);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_headset_bind_hint, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        h();
        d();
    }

    public final void setDismissListener(@Nullable Function0<Unit> function0) {
        this.dismissListener = function0;
    }
}
