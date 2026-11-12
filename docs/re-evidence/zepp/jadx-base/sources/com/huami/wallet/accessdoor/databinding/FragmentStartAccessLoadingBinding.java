package com.huami.wallet.accessdoor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.wallet.accessdoor.R;
import com.huami.wallet.accessdoor.widget.CarouselViewPager;
import net.lucode.hackware.magicindicator.MagicIndicator;

/* JADX INFO: loaded from: classes15.dex */
public final class FragmentStartAccessLoadingBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final Space bottomSpace;

    @NonNull
    public final MagicIndicator magicIndicator;

    @NonNull
    public final ProgressBar progressBar;

    @NonNull
    public final TextView progressText;

    @NonNull
    public final CarouselViewPager viewPager;

    private FragmentStartAccessLoadingBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Space space, @NonNull MagicIndicator magicIndicator, @NonNull ProgressBar progressBar, @NonNull TextView textView, @NonNull CarouselViewPager carouselViewPager) {
        this.a = constraintLayout;
        this.bottomSpace = space;
        this.magicIndicator = magicIndicator;
        this.progressBar = progressBar;
        this.progressText = textView;
        this.viewPager = carouselViewPager;
    }

    @NonNull
    public static FragmentStartAccessLoadingBinding bind(@NonNull View view) {
        int i = R.id.bottom_space;
        Space space = (Space) ViewBindings.findChildViewById(view, i);
        if (space != null) {
            i = R.id.magic_indicator;
            MagicIndicator magicIndicator = (MagicIndicator) ViewBindings.findChildViewById(view, i);
            if (magicIndicator != null) {
                i = R.id.progress_bar;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                if (progressBar != null) {
                    i = R.id.progress_text;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.view_pager;
                        CarouselViewPager carouselViewPager = (CarouselViewPager) ViewBindings.findChildViewById(view, i);
                        if (carouselViewPager != null) {
                            return new FragmentStartAccessLoadingBinding((ConstraintLayout) view, space, magicIndicator, progressBar, textView, carouselViewPager);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentStartAccessLoadingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentStartAccessLoadingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_start_access_loading, viewGroup, false);
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
