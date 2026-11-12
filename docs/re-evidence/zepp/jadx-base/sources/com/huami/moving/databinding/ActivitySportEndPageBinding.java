package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.R;
import com.huami.moving.ui.view.card.EndCardOverView;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes11.dex */
public final class ActivitySportEndPageBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final RecyclerView sportEndPageActivities;

    @NonNull
    public final TypefaceTextView sportEndPageActivitiesTitle;

    @NonNull
    public final LinearLayout sportEndPageActivitiesTitleLayout;

    @NonNull
    public final ImageView sportEndPageCloseImg;

    @NonNull
    public final FrameLayout sportEndPageCourse;

    @NonNull
    public final TypefaceTextView sportEndPageCourseTitle;

    @NonNull
    public final LinearLayout sportEndPageCourseTitleLayout;

    @NonNull
    public final EndCardOverView sportEndPageEndCardOverView;

    @NonNull
    public final TypefaceTextView sportEndPageGoodJobTv;

    @NonNull
    public final NestedScrollView sportEndPageScrollView;

    @NonNull
    public final FrameLayout sportEndPageShareCard;

    @NonNull
    public final TypefaceTextView sportEndPageShowToFriendsTv;

    @NonNull
    public final TypefaceTextView sportEndPageSportTimesTv;

    @NonNull
    public final FrameLayout sportEndPageTextChainLayout;

    @NonNull
    public final ImageView sportEndPageWellDoneImg;

    private ActivitySportEndPageBinding(@NonNull FrameLayout frameLayout, @NonNull RecyclerView recyclerView, @NonNull TypefaceTextView typefaceTextView, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout2, @NonNull TypefaceTextView typefaceTextView2, @NonNull LinearLayout linearLayout2, @NonNull EndCardOverView endCardOverView, @NonNull TypefaceTextView typefaceTextView3, @NonNull NestedScrollView nestedScrollView, @NonNull FrameLayout frameLayout3, @NonNull TypefaceTextView typefaceTextView4, @NonNull TypefaceTextView typefaceTextView5, @NonNull FrameLayout frameLayout4, @NonNull ImageView imageView2) {
        this.a = frameLayout;
        this.sportEndPageActivities = recyclerView;
        this.sportEndPageActivitiesTitle = typefaceTextView;
        this.sportEndPageActivitiesTitleLayout = linearLayout;
        this.sportEndPageCloseImg = imageView;
        this.sportEndPageCourse = frameLayout2;
        this.sportEndPageCourseTitle = typefaceTextView2;
        this.sportEndPageCourseTitleLayout = linearLayout2;
        this.sportEndPageEndCardOverView = endCardOverView;
        this.sportEndPageGoodJobTv = typefaceTextView3;
        this.sportEndPageScrollView = nestedScrollView;
        this.sportEndPageShareCard = frameLayout3;
        this.sportEndPageShowToFriendsTv = typefaceTextView4;
        this.sportEndPageSportTimesTv = typefaceTextView5;
        this.sportEndPageTextChainLayout = frameLayout4;
        this.sportEndPageWellDoneImg = imageView2;
    }

    @NonNull
    public static ActivitySportEndPageBinding bind(@NonNull View view) {
        int i = R.id.sport_end_page_activities;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = R.id.sport_end_page_activities_title;
            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
            if (typefaceTextView != null) {
                i = R.id.sport_end_page_activities_title_layout;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.sport_end_page_close_img;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.sport_end_page_course;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout != null) {
                            i = R.id.sport_end_page_course_title;
                            TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                            if (typefaceTextView2 != null) {
                                i = R.id.sport_end_page_course_title_layout;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout2 != null) {
                                    i = R.id.sport_end_page_end_card_over_view;
                                    EndCardOverView endCardOverView = (EndCardOverView) ViewBindings.findChildViewById(view, i);
                                    if (endCardOverView != null) {
                                        i = R.id.sport_end_page_good_job_tv;
                                        TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                        if (typefaceTextView3 != null) {
                                            i = R.id.sport_end_page_scroll_view;
                                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                            if (nestedScrollView != null) {
                                                i = R.id.sport_end_page_share_card;
                                                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                if (frameLayout2 != null) {
                                                    i = R.id.sport_end_page_show_to_friends_tv;
                                                    TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                                    if (typefaceTextView4 != null) {
                                                        i = R.id.sport_end_page_sport_times_tv;
                                                        TypefaceTextView typefaceTextView5 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                                        if (typefaceTextView5 != null) {
                                                            i = R.id.sport_end_page_text_chain_layout;
                                                            FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                            if (frameLayout3 != null) {
                                                                i = R.id.sport_end_page_well_done_img;
                                                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                if (imageView2 != null) {
                                                                    return new ActivitySportEndPageBinding((FrameLayout) view, recyclerView, typefaceTextView, linearLayout, imageView, frameLayout, typefaceTextView2, linearLayout2, endCardOverView, typefaceTextView3, nestedScrollView, frameLayout2, typefaceTextView4, typefaceTextView5, frameLayout3, imageView2);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySportEndPageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySportEndPageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_sport_end_page, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
