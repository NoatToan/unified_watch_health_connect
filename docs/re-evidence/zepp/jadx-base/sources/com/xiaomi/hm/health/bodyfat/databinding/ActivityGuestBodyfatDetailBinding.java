package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.view.text.UnitTextView;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.view.SlidingConflictScrollView;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityGuestBodyfatDetailBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView bodyFatEmptyTv;

    @NonNull
    public final RelativeLayout bodyFatRl;

    @NonNull
    public final FrameLayout bodyIndexContainer;

    @NonNull
    public final SlidingConflictScrollView guestBodyFatScroll;

    @NonNull
    public final FrameLayout hrPressureContainer;

    @NonNull
    public final TypefaceTextView scoreDesc;

    @NonNull
    public final TypefaceTextView scoreSubValueTv;

    @NonNull
    public final UnitTextView scoreValueTv;

    private ActivityGuestBodyfatDetailBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull RelativeLayout relativeLayout2, @NonNull FrameLayout frameLayout, @NonNull SlidingConflictScrollView slidingConflictScrollView, @NonNull FrameLayout frameLayout2, @NonNull TypefaceTextView typefaceTextView, @NonNull TypefaceTextView typefaceTextView2, @NonNull UnitTextView unitTextView) {
        this.a = relativeLayout;
        this.bodyFatEmptyTv = textView;
        this.bodyFatRl = relativeLayout2;
        this.bodyIndexContainer = frameLayout;
        this.guestBodyFatScroll = slidingConflictScrollView;
        this.hrPressureContainer = frameLayout2;
        this.scoreDesc = typefaceTextView;
        this.scoreSubValueTv = typefaceTextView2;
        this.scoreValueTv = unitTextView;
    }

    @NonNull
    public static ActivityGuestBodyfatDetailBinding bind(@NonNull View view) {
        int i = R.id.bodyFatEmptyTv;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.body_fat_rl;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null) {
                i = R.id.body_index_container;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = R.id.guestBodyFatScroll;
                    SlidingConflictScrollView slidingConflictScrollView = (SlidingConflictScrollView) ViewBindings.findChildViewById(view, i);
                    if (slidingConflictScrollView != null) {
                        i = R.id.hr_pressure_container;
                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout2 != null) {
                            i = R.id.score_desc;
                            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                            if (typefaceTextView != null) {
                                i = R.id.scoreSubValueTv;
                                TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                if (typefaceTextView2 != null) {
                                    i = R.id.scoreValueTv;
                                    UnitTextView unitTextView = (UnitTextView) ViewBindings.findChildViewById(view, i);
                                    if (unitTextView != null) {
                                        return new ActivityGuestBodyfatDetailBinding((RelativeLayout) view, textView, relativeLayout, frameLayout, slidingConflictScrollView, frameLayout2, typefaceTextView, typefaceTextView2, unitTextView);
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
    public static ActivityGuestBodyfatDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityGuestBodyfatDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_guest_bodyfat_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
