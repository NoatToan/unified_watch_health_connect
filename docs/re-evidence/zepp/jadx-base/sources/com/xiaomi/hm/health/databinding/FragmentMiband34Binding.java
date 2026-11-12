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
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.ui.playmiband2.MovableImageView;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentMiband34Binding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final View centerView;

    @NonNull
    public final View centerViewSmall;

    @NonNull
    public final MovableImageView closeImg;

    @NonNull
    public final ImageView findPhoneImg;

    @NonNull
    public final TypefaceTextView findPhoneTv;

    @NonNull
    public final FrameLayout findingPhoneImg;

    @NonNull
    public final MovableImageView handImg;

    @NonNull
    public final MovableImageView handImg1;

    @NonNull
    public final TextView subTitleTv;

    @NonNull
    public final TextView titleTv;

    private FragmentMiband34Binding(@NonNull RelativeLayout rootView, @NonNull View centerView, @NonNull View centerViewSmall, @NonNull MovableImageView closeImg, @NonNull ImageView findPhoneImg, @NonNull TypefaceTextView findPhoneTv, @NonNull FrameLayout findingPhoneImg, @NonNull MovableImageView handImg, @NonNull MovableImageView handImg1, @NonNull TextView subTitleTv, @NonNull TextView titleTv) {
        this.a = rootView;
        this.centerView = centerView;
        this.centerViewSmall = centerViewSmall;
        this.closeImg = closeImg;
        this.findPhoneImg = findPhoneImg;
        this.findPhoneTv = findPhoneTv;
        this.findingPhoneImg = findingPhoneImg;
        this.handImg = handImg;
        this.handImg1 = handImg1;
        this.subTitleTv = subTitleTv;
        this.titleTv = titleTv;
    }

    @NonNull
    public static FragmentMiband34Binding bind(@NonNull View rootView) {
        int i = R.id.center_view;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.center_view);
        if (viewFindChildViewById != null) {
            i = R.id.center_view_small;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.center_view_small);
            if (viewFindChildViewById2 != null) {
                i = R.id.close_img;
                MovableImageView movableImageView = (MovableImageView) ViewBindings.findChildViewById(rootView, R.id.close_img);
                if (movableImageView != null) {
                    i = R.id.find_phone_img;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.find_phone_img);
                    if (imageView != null) {
                        i = R.id.find_phone_tv;
                        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.find_phone_tv);
                        if (typefaceTextView != null) {
                            i = R.id.finding_phone_img;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.finding_phone_img);
                            if (frameLayout != null) {
                                i = R.id.hand_img;
                                MovableImageView movableImageView2 = (MovableImageView) ViewBindings.findChildViewById(rootView, R.id.hand_img);
                                if (movableImageView2 != null) {
                                    i = R.id.hand_img_1;
                                    MovableImageView movableImageView3 = (MovableImageView) ViewBindings.findChildViewById(rootView, R.id.hand_img_1);
                                    if (movableImageView3 != null) {
                                        i = R.id.sub_title_tv;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.sub_title_tv);
                                        if (textView != null) {
                                            i = R.id.title_tv;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_tv);
                                            if (textView2 != null) {
                                                return new FragmentMiband34Binding((RelativeLayout) rootView, viewFindChildViewById, viewFindChildViewById2, movableImageView, imageView, typefaceTextView, frameLayout, movableImageView2, movableImageView3, textView, textView2);
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
    public static FragmentMiband34Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentMiband34Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_miband3_4, parent, false);
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
