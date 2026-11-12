package com.huami.healthlabel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.healthlabel.R;

/* JADX INFO: loaded from: classes9.dex */
public final class HealthLabelExpandCardBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ImageView healthLabelAdd;

    @NonNull
    public final ImageView healthLabelArrow;

    @NonNull
    public final ConstraintLayout healthLabelContainer;

    @NonNull
    public final ImageView healthLabelEdit;

    @NonNull
    public final ConstraintLayout healthLabelExpand;

    @NonNull
    public final RecyclerView healthLabelExpandRv;

    @NonNull
    public final RelativeLayout healthLabelHeader;

    @NonNull
    public final ImageView healthLabelIcon;

    @NonNull
    public final ImageView healthLabelLoadingIv;

    @NonNull
    public final LinearLayout healthLabelLoadingLl;

    @NonNull
    public final TextView healthLabelNetworkError;

    @NonNull
    public final ImageView healthLabelRecord;

    @NonNull
    public final Button healthLabelRetry;

    @NonNull
    public final LinearLayout healthLabelRvAll;

    @NonNull
    public final RecyclerView healthLabelRvOne;

    @NonNull
    public final RecyclerView healthLabelRvThree;

    @NonNull
    public final RecyclerView healthLabelRvTwo;

    @NonNull
    public final TextView healthLabelTitle;

    private HealthLabelExpandCardBinding(@NonNull LinearLayout rootView, @NonNull ImageView healthLabelAdd, @NonNull ImageView healthLabelArrow, @NonNull ConstraintLayout healthLabelContainer, @NonNull ImageView healthLabelEdit, @NonNull ConstraintLayout healthLabelExpand, @NonNull RecyclerView healthLabelExpandRv, @NonNull RelativeLayout healthLabelHeader, @NonNull ImageView healthLabelIcon, @NonNull ImageView healthLabelLoadingIv, @NonNull LinearLayout healthLabelLoadingLl, @NonNull TextView healthLabelNetworkError, @NonNull ImageView healthLabelRecord, @NonNull Button healthLabelRetry, @NonNull LinearLayout healthLabelRvAll, @NonNull RecyclerView healthLabelRvOne, @NonNull RecyclerView healthLabelRvThree, @NonNull RecyclerView healthLabelRvTwo, @NonNull TextView healthLabelTitle) {
        this.a = rootView;
        this.healthLabelAdd = healthLabelAdd;
        this.healthLabelArrow = healthLabelArrow;
        this.healthLabelContainer = healthLabelContainer;
        this.healthLabelEdit = healthLabelEdit;
        this.healthLabelExpand = healthLabelExpand;
        this.healthLabelExpandRv = healthLabelExpandRv;
        this.healthLabelHeader = healthLabelHeader;
        this.healthLabelIcon = healthLabelIcon;
        this.healthLabelLoadingIv = healthLabelLoadingIv;
        this.healthLabelLoadingLl = healthLabelLoadingLl;
        this.healthLabelNetworkError = healthLabelNetworkError;
        this.healthLabelRecord = healthLabelRecord;
        this.healthLabelRetry = healthLabelRetry;
        this.healthLabelRvAll = healthLabelRvAll;
        this.healthLabelRvOne = healthLabelRvOne;
        this.healthLabelRvThree = healthLabelRvThree;
        this.healthLabelRvTwo = healthLabelRvTwo;
        this.healthLabelTitle = healthLabelTitle;
    }

    @NonNull
    public static HealthLabelExpandCardBinding bind(@NonNull View rootView) {
        int i = R.id.health_label_add;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
        if (imageView != null) {
            i = R.id.health_label_arrow;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, i);
            if (imageView2 != null) {
                i = R.id.health_label_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
                if (constraintLayout != null) {
                    i = R.id.health_label_edit;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                    if (imageView3 != null) {
                        i = R.id.health_label_expand;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
                        if (constraintLayout2 != null) {
                            i = R.id.health_label_expand_rv;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, i);
                            if (recyclerView != null) {
                                i = R.id.health_label_header;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, i);
                                if (relativeLayout != null) {
                                    i = R.id.health_label_icon;
                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                                    if (imageView4 != null) {
                                        i = R.id.health_label_loading_iv;
                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                                        if (imageView5 != null) {
                                            i = R.id.health_label_loading_ll;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                                            if (linearLayout != null) {
                                                i = R.id.health_label_network_error;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                if (textView != null) {
                                                    i = R.id.health_label_record;
                                                    ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                                                    if (imageView6 != null) {
                                                        i = R.id.health_label_retry;
                                                        Button button = (Button) ViewBindings.findChildViewById(rootView, i);
                                                        if (button != null) {
                                                            i = R.id.health_label_rv_all;
                                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                                                            if (linearLayout2 != null) {
                                                                i = R.id.health_label_rv_one;
                                                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, i);
                                                                if (recyclerView2 != null) {
                                                                    i = R.id.health_label_rv_three;
                                                                    RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(rootView, i);
                                                                    if (recyclerView3 != null) {
                                                                        i = R.id.health_label_rv_two;
                                                                        RecyclerView recyclerView4 = (RecyclerView) ViewBindings.findChildViewById(rootView, i);
                                                                        if (recyclerView4 != null) {
                                                                            i = R.id.health_label_title;
                                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                            if (textView2 != null) {
                                                                                return new HealthLabelExpandCardBinding((LinearLayout) rootView, imageView, imageView2, constraintLayout, imageView3, constraintLayout2, recyclerView, relativeLayout, imageView4, imageView5, linearLayout, textView, imageView6, button, linearLayout2, recyclerView2, recyclerView3, recyclerView4, textView2);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HealthLabelExpandCardBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HealthLabelExpandCardBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.health_label_expand_card, parent, false);
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
