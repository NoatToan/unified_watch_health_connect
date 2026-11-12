package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.introduce.IntroduceIndicator;
import com.xiaomi.hm.health.device.introduce.webintro.WebIntroLoadingView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityBindIntroduceBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ConstraintLayout bindIntroduceContainer;

    @NonNull
    public final ViewPager bindIntroduceViewPager;

    @NonNull
    public final FrameLayout bottomContainer;

    @NonNull
    public final FrameLayout chooseRestoreContainer;

    @NonNull
    public final FrameLayout h5Container;

    @NonNull
    public final TextView introTitleTv;

    @NonNull
    public final IntroduceIndicator introduceIndicator;

    @NonNull
    public final WebIntroLoadingView loadingView;

    @NonNull
    public final Button startUseBtn;

    @NonNull
    public final LinearLayout statusContainer;

    @NonNull
    public final ImageView statusIcon;

    @NonNull
    public final TextView statusTv;

    @NonNull
    public final FrameLayout viewPagerContainer;

    @NonNull
    public final TextView webIntroTitle;

    private ActivityBindIntroduceBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ViewPager viewPager, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull TextView textView, @NonNull IntroduceIndicator introduceIndicator, @NonNull WebIntroLoadingView webIntroLoadingView, @NonNull Button button, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull FrameLayout frameLayout4, @NonNull TextView textView3) {
        this.a = constraintLayout;
        this.bindIntroduceContainer = constraintLayout2;
        this.bindIntroduceViewPager = viewPager;
        this.bottomContainer = frameLayout;
        this.chooseRestoreContainer = frameLayout2;
        this.h5Container = frameLayout3;
        this.introTitleTv = textView;
        this.introduceIndicator = introduceIndicator;
        this.loadingView = webIntroLoadingView;
        this.startUseBtn = button;
        this.statusContainer = linearLayout;
        this.statusIcon = imageView;
        this.statusTv = textView2;
        this.viewPagerContainer = frameLayout4;
        this.webIntroTitle = textView3;
    }

    @NonNull
    public static ActivityBindIntroduceBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.bind_introduce_view_pager;
        ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, i);
        if (viewPager != null) {
            i = R.id.bottom_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.choose_restore_container;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout2 != null) {
                    i = R.id.h5_container;
                    FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout3 != null) {
                        i = R.id.intro_title_tv;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = R.id.introduce_indicator;
                            IntroduceIndicator introduceIndicator = (IntroduceIndicator) ViewBindings.findChildViewById(view, i);
                            if (introduceIndicator != null) {
                                i = R.id.loading_view;
                                WebIntroLoadingView webIntroLoadingView = (WebIntroLoadingView) ViewBindings.findChildViewById(view, i);
                                if (webIntroLoadingView != null) {
                                    i = R.id.start_use_btn;
                                    Button button = (Button) ViewBindings.findChildViewById(view, i);
                                    if (button != null) {
                                        i = R.id.status_container;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout != null) {
                                            i = R.id.status_icon;
                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView != null) {
                                                i = R.id.status_tv;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView2 != null) {
                                                    i = R.id.view_pager_container;
                                                    FrameLayout frameLayout4 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                    if (frameLayout4 != null) {
                                                        i = R.id.web_intro_title;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView3 != null) {
                                                            return new ActivityBindIntroduceBinding(constraintLayout, constraintLayout, viewPager, frameLayout, frameLayout2, frameLayout3, textView, introduceIndicator, webIntroLoadingView, button, linearLayout, imageView, textView2, frameLayout4, textView3);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityBindIntroduceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityBindIntroduceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_bind_introduce, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
