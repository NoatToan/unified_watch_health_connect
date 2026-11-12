package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.ui.playmiband2.MovableImageView;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentMiband32Binding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final View centerView;

    @NonNull
    public final View centerViewSmall;

    @NonNull
    public final FrameLayout frameImg1;

    @NonNull
    public final FrameLayout frameImg2;

    @NonNull
    public final FrameLayout frameImg3;

    @NonNull
    public final MovableImageView handImg;

    @NonNull
    public final FrameLayout indicatorContainer;

    @NonNull
    public final ImageView indicatorImg;

    @NonNull
    public final TextView subTitleTv;

    @NonNull
    public final TextView titleTv;

    private FragmentMiband32Binding(@NonNull RelativeLayout rootView, @NonNull View centerView, @NonNull View centerViewSmall, @NonNull FrameLayout frameImg1, @NonNull FrameLayout frameImg2, @NonNull FrameLayout frameImg3, @NonNull MovableImageView handImg, @NonNull FrameLayout indicatorContainer, @NonNull ImageView indicatorImg, @NonNull TextView subTitleTv, @NonNull TextView titleTv) {
        this.a = rootView;
        this.centerView = centerView;
        this.centerViewSmall = centerViewSmall;
        this.frameImg1 = frameImg1;
        this.frameImg2 = frameImg2;
        this.frameImg3 = frameImg3;
        this.handImg = handImg;
        this.indicatorContainer = indicatorContainer;
        this.indicatorImg = indicatorImg;
        this.subTitleTv = subTitleTv;
        this.titleTv = titleTv;
    }

    @NonNull
    public static FragmentMiband32Binding bind(@NonNull View rootView) {
        int i = R.id.center_view;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.center_view);
        if (viewFindChildViewById != null) {
            i = R.id.center_view_small;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.center_view_small);
            if (viewFindChildViewById2 != null) {
                i = R.id.frame_img_1;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.frame_img_1);
                if (frameLayout != null) {
                    i = R.id.frame_img_2;
                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.frame_img_2);
                    if (frameLayout2 != null) {
                        i = R.id.frame_img_3;
                        FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.frame_img_3);
                        if (frameLayout3 != null) {
                            i = R.id.hand_img;
                            MovableImageView movableImageView = (MovableImageView) ViewBindings.findChildViewById(rootView, R.id.hand_img);
                            if (movableImageView != null) {
                                i = R.id.indicator_container;
                                FrameLayout frameLayout4 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.indicator_container);
                                if (frameLayout4 != null) {
                                    i = R.id.indicator_img;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.indicator_img);
                                    if (imageView != null) {
                                        i = R.id.sub_title_tv;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.sub_title_tv);
                                        if (textView != null) {
                                            i = R.id.title_tv;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_tv);
                                            if (textView2 != null) {
                                                return new FragmentMiband32Binding((RelativeLayout) rootView, viewFindChildViewById, viewFindChildViewById2, frameLayout, frameLayout2, frameLayout3, movableImageView, frameLayout4, imageView, textView, textView2);
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
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMiband32Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentMiband32Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_miband3_2, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
