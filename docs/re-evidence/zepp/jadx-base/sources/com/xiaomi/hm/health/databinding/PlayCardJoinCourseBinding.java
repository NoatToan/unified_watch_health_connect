package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes20.dex */
public final class PlayCardJoinCourseBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final RecyclerView rlJoinCourse;

    @NonNull
    public final TypefaceTextView tvAddCourse;

    @NonNull
    public final TypefaceTextView tvJoinCourseTitle;

    @NonNull
    public final TypefaceTextView tvMore;

    @NonNull
    public final TypefaceTextView tvNoJoinCourse;

    private PlayCardJoinCourseBinding(@NonNull LinearLayout rootView, @NonNull RecyclerView rlJoinCourse, @NonNull TypefaceTextView tvAddCourse, @NonNull TypefaceTextView tvJoinCourseTitle, @NonNull TypefaceTextView tvMore, @NonNull TypefaceTextView tvNoJoinCourse) {
        this.a = rootView;
        this.rlJoinCourse = rlJoinCourse;
        this.tvAddCourse = tvAddCourse;
        this.tvJoinCourseTitle = tvJoinCourseTitle;
        this.tvMore = tvMore;
        this.tvNoJoinCourse = tvNoJoinCourse;
    }

    @NonNull
    public static PlayCardJoinCourseBinding bind(@NonNull View rootView) {
        int i = R.id.rl_join_course;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rl_join_course);
        if (recyclerView != null) {
            i = R.id.tv_add_course;
            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.tv_add_course);
            if (typefaceTextView != null) {
                i = R.id.tv_join_course_title;
                TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.tv_join_course_title);
                if (typefaceTextView2 != null) {
                    i = R.id.tv_more;
                    TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.tv_more);
                    if (typefaceTextView3 != null) {
                        i = R.id.tv_no_join_course;
                        TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.tv_no_join_course);
                        if (typefaceTextView4 != null) {
                            return new PlayCardJoinCourseBinding((LinearLayout) rootView, recyclerView, typefaceTextView, typefaceTextView2, typefaceTextView3, typefaceTextView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PlayCardJoinCourseBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PlayCardJoinCourseBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.play_card_join_course, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
