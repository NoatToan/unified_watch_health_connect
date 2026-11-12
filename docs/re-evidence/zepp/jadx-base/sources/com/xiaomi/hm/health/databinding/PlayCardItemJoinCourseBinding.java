package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes20.dex */
public final class PlayCardItemJoinCourseBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final View divider;

    @NonNull
    public final AppCompatImageView ivCourseImage;

    @NonNull
    public final TypefaceTextView tvCourseName;

    @NonNull
    public final TypefaceTextView tvCourseNum;

    @NonNull
    public final TypefaceTextView tvCourseStatus;

    private PlayCardItemJoinCourseBinding(@NonNull ConstraintLayout rootView, @NonNull View divider, @NonNull AppCompatImageView ivCourseImage, @NonNull TypefaceTextView tvCourseName, @NonNull TypefaceTextView tvCourseNum, @NonNull TypefaceTextView tvCourseStatus) {
        this.a = rootView;
        this.divider = divider;
        this.ivCourseImage = ivCourseImage;
        this.tvCourseName = tvCourseName;
        this.tvCourseNum = tvCourseNum;
        this.tvCourseStatus = tvCourseStatus;
    }

    @NonNull
    public static PlayCardItemJoinCourseBinding bind(@NonNull View rootView) {
        int i = R.id.divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider);
        if (viewFindChildViewById != null) {
            i = R.id.iv_course_image;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_course_image);
            if (appCompatImageView != null) {
                i = R.id.tv_course_name;
                TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.tv_course_name);
                if (typefaceTextView != null) {
                    i = R.id.tv_course_num;
                    TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.tv_course_num);
                    if (typefaceTextView2 != null) {
                        i = R.id.tv_course_status;
                        TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.tv_course_status);
                        if (typefaceTextView3 != null) {
                            return new PlayCardItemJoinCourseBinding((ConstraintLayout) rootView, viewFindChildViewById, appCompatImageView, typefaceTextView, typefaceTextView2, typefaceTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PlayCardItemJoinCourseBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PlayCardItemJoinCourseBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.play_card_item_join_course, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
