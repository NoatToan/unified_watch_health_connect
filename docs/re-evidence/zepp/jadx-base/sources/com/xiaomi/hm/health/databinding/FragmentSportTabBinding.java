package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.running.ExpendRecyclerView;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentSportTabBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final View bottomSpace;

    @NonNull
    public final FrameLayout promotionalCourse;

    @NonNull
    public final FrameLayout promotionalTreadmill;

    @NonNull
    public final TextView sportTabAdvertiseTitle;

    @NonNull
    public final ExpendRecyclerView sportTabBody;

    @NonNull
    public final FrameLayout sportTabHead;

    private FragmentSportTabBinding(@NonNull LinearLayout rootView, @NonNull View bottomSpace, @NonNull FrameLayout promotionalCourse, @NonNull FrameLayout promotionalTreadmill, @NonNull TextView sportTabAdvertiseTitle, @NonNull ExpendRecyclerView sportTabBody, @NonNull FrameLayout sportTabHead) {
        this.a = rootView;
        this.bottomSpace = bottomSpace;
        this.promotionalCourse = promotionalCourse;
        this.promotionalTreadmill = promotionalTreadmill;
        this.sportTabAdvertiseTitle = sportTabAdvertiseTitle;
        this.sportTabBody = sportTabBody;
        this.sportTabHead = sportTabHead;
    }

    @NonNull
    public static FragmentSportTabBinding bind(@NonNull View rootView) {
        int i = R.id.bottom_space;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.bottom_space);
        if (viewFindChildViewById != null) {
            i = R.id.promotional_course;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.promotional_course);
            if (frameLayout != null) {
                i = R.id.promotional_treadmill;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.promotional_treadmill);
                if (frameLayout2 != null) {
                    i = R.id.sport_tab_advertise_title;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.sport_tab_advertise_title);
                    if (textView != null) {
                        i = R.id.sport_tab_body;
                        ExpendRecyclerView expendRecyclerView = (ExpendRecyclerView) ViewBindings.findChildViewById(rootView, R.id.sport_tab_body);
                        if (expendRecyclerView != null) {
                            i = R.id.sport_tab_head;
                            FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.sport_tab_head);
                            if (frameLayout3 != null) {
                                return new FragmentSportTabBinding((LinearLayout) rootView, viewFindChildViewById, frameLayout, frameLayout2, textView, expendRecyclerView, frameLayout3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentSportTabBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentSportTabBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_sport_tab, parent, false);
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
