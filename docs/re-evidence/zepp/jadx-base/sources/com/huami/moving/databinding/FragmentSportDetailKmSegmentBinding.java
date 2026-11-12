package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes11.dex */
public final class FragmentSportDetailKmSegmentBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final RadioButton fiveDistance;

    @NonNull
    public final TypefaceTextView heartRateTitle;

    @NonNull
    public final TypefaceTextView kmTextIndex;

    @NonNull
    public final RadioButton oneDistance;

    @NonNull
    public final TypefaceTextView paceNameTitle;

    @NonNull
    public final TypefaceTextView paceTimeTitle;

    @NonNull
    public final RadioGroup segmentDistance;

    @NonNull
    public final TextView tvRecords;

    private FragmentSportDetailKmSegmentBinding(@NonNull LinearLayout linearLayout, @NonNull RadioButton radioButton, @NonNull TypefaceTextView typefaceTextView, @NonNull TypefaceTextView typefaceTextView2, @NonNull RadioButton radioButton2, @NonNull TypefaceTextView typefaceTextView3, @NonNull TypefaceTextView typefaceTextView4, @NonNull RadioGroup radioGroup, @NonNull TextView textView) {
        this.a = linearLayout;
        this.fiveDistance = radioButton;
        this.heartRateTitle = typefaceTextView;
        this.kmTextIndex = typefaceTextView2;
        this.oneDistance = radioButton2;
        this.paceNameTitle = typefaceTextView3;
        this.paceTimeTitle = typefaceTextView4;
        this.segmentDistance = radioGroup;
        this.tvRecords = textView;
    }

    @NonNull
    public static FragmentSportDetailKmSegmentBinding bind(@NonNull View view) {
        int i = R.id.five_distance;
        RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i);
        if (radioButton != null) {
            i = R.id.heart_rate_title;
            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
            if (typefaceTextView != null) {
                i = R.id.km_text_index;
                TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                if (typefaceTextView2 != null) {
                    i = R.id.one_distance;
                    RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i);
                    if (radioButton2 != null) {
                        i = R.id.pace_name_title;
                        TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                        if (typefaceTextView3 != null) {
                            i = R.id.pace_time_title;
                            TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                            if (typefaceTextView4 != null) {
                                i = R.id.segment_distance;
                                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
                                if (radioGroup != null) {
                                    i = R.id.tv_records;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        return new FragmentSportDetailKmSegmentBinding((LinearLayout) view, radioButton, typefaceTextView, typefaceTextView2, radioButton2, typefaceTextView3, typefaceTextView4, radioGroup, textView);
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
    public static FragmentSportDetailKmSegmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSportDetailKmSegmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_sport_detail_km_segment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
