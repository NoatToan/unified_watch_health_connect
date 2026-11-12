package com.huami.healthlabel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.healthlabel.R;

/* JADX INFO: loaded from: classes9.dex */
public final class HealthLabelWindowBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ImageView healthLabelBlurIv;

    @NonNull
    public final ScrollView healthLabelContentSv;

    @NonNull
    public final ImageView healthLabelHistoryDeleteIv;

    @NonNull
    public final LinearLayout healthLabelHistoryDeleteLl;

    @NonNull
    public final ImageView healthLabelHomeAdd;

    @NonNull
    public final ConstraintLayout healthLabelHomeCl;

    @NonNull
    public final ImageView healthLabelHomeClose;

    @NonNull
    public final ImageView healthLabelHomeEdit;

    @NonNull
    public final LinearLayout healthLabelHomeLl;

    @NonNull
    public final ImageView healthLabelHomeRecord;

    @NonNull
    public final TextView healthLabelHomeTitle;

    @NonNull
    public final ImageView healthLabelLoadingIv;

    @NonNull
    public final LinearLayout healthLabelLoadingLl;

    @NonNull
    public final Button healthLabelRetryBt;

    @NonNull
    public final LinearLayout healthLabelRetryLl;

    @NonNull
    public final RecyclerView homeHealthLabelRv;

    private HealthLabelWindowBinding(@NonNull LinearLayout rootView, @NonNull ImageView healthLabelBlurIv, @NonNull ScrollView healthLabelContentSv, @NonNull ImageView healthLabelHistoryDeleteIv, @NonNull LinearLayout healthLabelHistoryDeleteLl, @NonNull ImageView healthLabelHomeAdd, @NonNull ConstraintLayout healthLabelHomeCl, @NonNull ImageView healthLabelHomeClose, @NonNull ImageView healthLabelHomeEdit, @NonNull LinearLayout healthLabelHomeLl, @NonNull ImageView healthLabelHomeRecord, @NonNull TextView healthLabelHomeTitle, @NonNull ImageView healthLabelLoadingIv, @NonNull LinearLayout healthLabelLoadingLl, @NonNull Button healthLabelRetryBt, @NonNull LinearLayout healthLabelRetryLl, @NonNull RecyclerView homeHealthLabelRv) {
        this.a = rootView;
        this.healthLabelBlurIv = healthLabelBlurIv;
        this.healthLabelContentSv = healthLabelContentSv;
        this.healthLabelHistoryDeleteIv = healthLabelHistoryDeleteIv;
        this.healthLabelHistoryDeleteLl = healthLabelHistoryDeleteLl;
        this.healthLabelHomeAdd = healthLabelHomeAdd;
        this.healthLabelHomeCl = healthLabelHomeCl;
        this.healthLabelHomeClose = healthLabelHomeClose;
        this.healthLabelHomeEdit = healthLabelHomeEdit;
        this.healthLabelHomeLl = healthLabelHomeLl;
        this.healthLabelHomeRecord = healthLabelHomeRecord;
        this.healthLabelHomeTitle = healthLabelHomeTitle;
        this.healthLabelLoadingIv = healthLabelLoadingIv;
        this.healthLabelLoadingLl = healthLabelLoadingLl;
        this.healthLabelRetryBt = healthLabelRetryBt;
        this.healthLabelRetryLl = healthLabelRetryLl;
        this.homeHealthLabelRv = homeHealthLabelRv;
    }

    @NonNull
    public static HealthLabelWindowBinding bind(@NonNull View rootView) {
        int i = R.id.health_label_blur_iv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
        if (imageView != null) {
            i = R.id.health_label_content_sv;
            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(rootView, i);
            if (scrollView != null) {
                i = R.id.health_label_history_delete_iv;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                if (imageView2 != null) {
                    i = R.id.health_label_history_delete_ll;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                    if (linearLayout != null) {
                        i = R.id.health_label_home_add;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                        if (imageView3 != null) {
                            i = R.id.health_label_home_cl;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
                            if (constraintLayout != null) {
                                i = R.id.health_label_home_close;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                                if (imageView4 != null) {
                                    i = R.id.health_label_home_edit;
                                    ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                                    if (imageView5 != null) {
                                        LinearLayout linearLayout2 = (LinearLayout) rootView;
                                        i = R.id.health_label_home_record;
                                        ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                                        if (imageView6 != null) {
                                            i = R.id.health_label_home_title;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                                            if (textView != null) {
                                                i = R.id.health_label_loading_iv;
                                                ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                                                if (imageView7 != null) {
                                                    i = R.id.health_label_loading_ll;
                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                                                    if (linearLayout3 != null) {
                                                        i = R.id.health_label_retry_bt;
                                                        Button button = (Button) ViewBindings.findChildViewById(rootView, i);
                                                        if (button != null) {
                                                            i = R.id.health_label_retry_ll;
                                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                                                            if (linearLayout4 != null) {
                                                                i = R.id.home_health_label_rv;
                                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, i);
                                                                if (recyclerView != null) {
                                                                    return new HealthLabelWindowBinding(linearLayout2, imageView, scrollView, imageView2, linearLayout, imageView3, constraintLayout, imageView4, imageView5, linearLayout2, imageView6, textView, imageView7, linearLayout3, button, linearLayout4, recyclerView);
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
    public static HealthLabelWindowBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HealthLabelWindowBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.health_label_window, parent, false);
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
