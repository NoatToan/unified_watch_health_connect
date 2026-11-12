package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.R;
import com.huami.sleep.view.UnitTextView;
import com.huami.view.weightfigure.WeightFigureView;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes13.dex */
public final class FragmentSleepBreathQualityBinding implements ViewBinding {

    @NonNull
    private final NestedScrollView a;

    @NonNull
    public final WeightFigureView breathFigureView;

    @NonNull
    public final TextView feedBack;

    @NonNull
    public final RecyclerView funcListView;

    @NonNull
    public final ConstraintLayout odiListLayout;

    @NonNull
    public final RecyclerView odiListView;

    @NonNull
    public final TypefaceTextView refValue;

    @NonNull
    public final TypefaceTextView scoreDesc;

    @NonNull
    public final UnitTextView scoreTv;

    @NonNull
    public final TextView sleepReferenceDocuments;

    @NonNull
    public final TypefaceTextView textView5;

    @NonNull
    public final TextView valueTip;

    private FragmentSleepBreathQualityBinding(@NonNull NestedScrollView rootView, @NonNull WeightFigureView breathFigureView, @NonNull TextView feedBack, @NonNull RecyclerView funcListView, @NonNull ConstraintLayout odiListLayout, @NonNull RecyclerView odiListView, @NonNull TypefaceTextView refValue, @NonNull TypefaceTextView scoreDesc, @NonNull UnitTextView scoreTv, @NonNull TextView sleepReferenceDocuments, @NonNull TypefaceTextView textView5, @NonNull TextView valueTip) {
        this.a = rootView;
        this.breathFigureView = breathFigureView;
        this.feedBack = feedBack;
        this.funcListView = funcListView;
        this.odiListLayout = odiListLayout;
        this.odiListView = odiListView;
        this.refValue = refValue;
        this.scoreDesc = scoreDesc;
        this.scoreTv = scoreTv;
        this.sleepReferenceDocuments = sleepReferenceDocuments;
        this.textView5 = textView5;
        this.valueTip = valueTip;
    }

    @NonNull
    public static FragmentSleepBreathQualityBinding bind(@NonNull View rootView) {
        int i = R.id.breath_figure_view;
        WeightFigureView weightFigureView = (WeightFigureView) ViewBindings.findChildViewById(rootView, i);
        if (weightFigureView != null) {
            i = R.id.feed_back;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView != null) {
                i = R.id.funcListView;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, i);
                if (recyclerView != null) {
                    i = R.id.odiListLayout;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
                    if (constraintLayout != null) {
                        i = R.id.odiListView;
                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, i);
                        if (recyclerView2 != null) {
                            i = R.id.ref_value;
                            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                            if (typefaceTextView != null) {
                                i = R.id.scoreDesc;
                                TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                                if (typefaceTextView2 != null) {
                                    i = R.id.scoreTv;
                                    UnitTextView unitTextView = (UnitTextView) ViewBindings.findChildViewById(rootView, i);
                                    if (unitTextView != null) {
                                        i = R.id.sleep_reference_documents;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                        if (textView2 != null) {
                                            i = R.id.textView5;
                                            TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                                            if (typefaceTextView3 != null) {
                                                i = R.id.value_tip;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                if (textView3 != null) {
                                                    return new FragmentSleepBreathQualityBinding((NestedScrollView) rootView, weightFigureView, textView, recyclerView, constraintLayout, recyclerView2, typefaceTextView, typefaceTextView2, unitTextView, textView2, typefaceTextView3, textView3);
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
    public static FragmentSleepBreathQualityBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentSleepBreathQualityBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_sleep_breath_quality, parent, false);
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
