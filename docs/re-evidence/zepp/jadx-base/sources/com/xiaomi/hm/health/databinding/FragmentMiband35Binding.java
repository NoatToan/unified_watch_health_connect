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

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentMiband35Binding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final View centerView;

    @NonNull
    public final FrameLayout frameImg;

    @NonNull
    public final ImageView handImg;

    @NonNull
    public final TextView subTitleTv;

    @NonNull
    public final TextView titleTv;

    @NonNull
    public final FrameLayout unlockContainer;

    @NonNull
    public final ImageView unlockImg;

    private FragmentMiband35Binding(@NonNull RelativeLayout rootView, @NonNull View centerView, @NonNull FrameLayout frameImg, @NonNull ImageView handImg, @NonNull TextView subTitleTv, @NonNull TextView titleTv, @NonNull FrameLayout unlockContainer, @NonNull ImageView unlockImg) {
        this.a = rootView;
        this.centerView = centerView;
        this.frameImg = frameImg;
        this.handImg = handImg;
        this.subTitleTv = subTitleTv;
        this.titleTv = titleTv;
        this.unlockContainer = unlockContainer;
        this.unlockImg = unlockImg;
    }

    @NonNull
    public static FragmentMiband35Binding bind(@NonNull View rootView) {
        int i = R.id.center_view;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.center_view);
        if (viewFindChildViewById != null) {
            i = R.id.frame_img;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.frame_img);
            if (frameLayout != null) {
                i = R.id.hand_img;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.hand_img);
                if (imageView != null) {
                    i = R.id.sub_title_tv;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.sub_title_tv);
                    if (textView != null) {
                        i = R.id.title_tv;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_tv);
                        if (textView2 != null) {
                            i = R.id.unlock_container;
                            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.unlock_container);
                            if (frameLayout2 != null) {
                                i = R.id.unlock_img;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.unlock_img);
                                if (imageView2 != null) {
                                    return new FragmentMiband35Binding((RelativeLayout) rootView, viewFindChildViewById, frameLayout, imageView, textView, textView2, frameLayout2, imageView2);
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
    public static FragmentMiband35Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentMiband35Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_miband3_5, parent, false);
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
