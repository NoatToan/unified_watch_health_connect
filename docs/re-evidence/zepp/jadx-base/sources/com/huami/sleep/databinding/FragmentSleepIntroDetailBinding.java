package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.R;
import com.huami.sleep.view.UnitTextView;

/* JADX INFO: loaded from: classes13.dex */
public final class FragmentSleepIntroDetailBinding implements ViewBinding {

    @NonNull
    private final NestedScrollView a;

    @NonNull
    public final View divider;

    @NonNull
    public final LinearLayout layoutSleepIntroDetail;

    @NonNull
    public final RecyclerView recycleView;

    @NonNull
    public final TextView sleepIntroDetailRef;

    @NonNull
    public final UnitTextView sleepIntroDetailValue;

    @NonNull
    public final ImageView sleepIntroDetailValueImg;

    @NonNull
    public final TextView sleepIntroDetailValueTrend;

    @NonNull
    public final TextView sleepReferenceDocuments;

    @NonNull
    public final TextView sleepReferenceDocumentsInfo;

    private FragmentSleepIntroDetailBinding(@NonNull NestedScrollView rootView, @NonNull View divider, @NonNull LinearLayout layoutSleepIntroDetail, @NonNull RecyclerView recycleView, @NonNull TextView sleepIntroDetailRef, @NonNull UnitTextView sleepIntroDetailValue, @NonNull ImageView sleepIntroDetailValueImg, @NonNull TextView sleepIntroDetailValueTrend, @NonNull TextView sleepReferenceDocuments, @NonNull TextView sleepReferenceDocumentsInfo) {
        this.a = rootView;
        this.divider = divider;
        this.layoutSleepIntroDetail = layoutSleepIntroDetail;
        this.recycleView = recycleView;
        this.sleepIntroDetailRef = sleepIntroDetailRef;
        this.sleepIntroDetailValue = sleepIntroDetailValue;
        this.sleepIntroDetailValueImg = sleepIntroDetailValueImg;
        this.sleepIntroDetailValueTrend = sleepIntroDetailValueTrend;
        this.sleepReferenceDocuments = sleepReferenceDocuments;
        this.sleepReferenceDocumentsInfo = sleepReferenceDocumentsInfo;
    }

    @NonNull
    public static FragmentSleepIntroDetailBinding bind(@NonNull View rootView) {
        int i = R.id.divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, i);
        if (viewFindChildViewById != null) {
            i = R.id.layout_sleep_intro_detail;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
            if (linearLayout != null) {
                i = R.id.recycle_view;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, i);
                if (recyclerView != null) {
                    i = R.id.sleep_intro_detail_ref;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView != null) {
                        i = R.id.sleep_intro_detail_value;
                        UnitTextView unitTextView = (UnitTextView) ViewBindings.findChildViewById(rootView, i);
                        if (unitTextView != null) {
                            i = R.id.sleep_intro_detail_value_img;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
                            if (imageView != null) {
                                i = R.id.sleep_intro_detail_value_trend;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                if (textView2 != null) {
                                    i = R.id.sleep_reference_documents;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                    if (textView3 != null) {
                                        i = R.id.sleep_reference_documents_info;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                        if (textView4 != null) {
                                            return new FragmentSleepIntroDetailBinding((NestedScrollView) rootView, viewFindChildViewById, linearLayout, recyclerView, textView, unitTextView, imageView, textView2, textView3, textView4);
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
    public static FragmentSleepIntroDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentSleepIntroDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_sleep_intro_detail, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.a;
    }
}
