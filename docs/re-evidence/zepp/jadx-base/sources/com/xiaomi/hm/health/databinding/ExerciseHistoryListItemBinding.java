package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes20.dex */
public final class ExerciseHistoryListItemBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final View commonSplitLine;

    @NonNull
    public final View endSplitLine;

    @NonNull
    public final View firstSplitLine;

    @NonNull
    public final TypefaceTextView sportCostTime;

    @NonNull
    public final TypefaceTextView sportFreq;

    @NonNull
    public final TypefaceTextView sportSubData;

    @NonNull
    public final TypefaceTextView sportsBegin;

    @NonNull
    public final ImageView sportsDeviceIcon;

    @NonNull
    public final TypefaceTextView sportsType;

    @NonNull
    public final TypefaceTextView sportsTypeData;

    @NonNull
    public final ImageView sportsTypeIcon;

    private ExerciseHistoryListItemBinding(@NonNull LinearLayout rootView, @NonNull View commonSplitLine, @NonNull View endSplitLine, @NonNull View firstSplitLine, @NonNull TypefaceTextView sportCostTime, @NonNull TypefaceTextView sportFreq, @NonNull TypefaceTextView sportSubData, @NonNull TypefaceTextView sportsBegin, @NonNull ImageView sportsDeviceIcon, @NonNull TypefaceTextView sportsType, @NonNull TypefaceTextView sportsTypeData, @NonNull ImageView sportsTypeIcon) {
        this.a = rootView;
        this.commonSplitLine = commonSplitLine;
        this.endSplitLine = endSplitLine;
        this.firstSplitLine = firstSplitLine;
        this.sportCostTime = sportCostTime;
        this.sportFreq = sportFreq;
        this.sportSubData = sportSubData;
        this.sportsBegin = sportsBegin;
        this.sportsDeviceIcon = sportsDeviceIcon;
        this.sportsType = sportsType;
        this.sportsTypeData = sportsTypeData;
        this.sportsTypeIcon = sportsTypeIcon;
    }

    @NonNull
    public static ExerciseHistoryListItemBinding bind(@NonNull View rootView) {
        int i = R.id.commonSplitLine;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.commonSplitLine);
        if (viewFindChildViewById != null) {
            i = R.id.endSplitLine;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.endSplitLine);
            if (viewFindChildViewById2 != null) {
                i = R.id.firstSplitLine;
                View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.firstSplitLine);
                if (viewFindChildViewById3 != null) {
                    i = R.id.sportCostTime;
                    TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.sportCostTime);
                    if (typefaceTextView != null) {
                        i = R.id.sportFreq;
                        TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.sportFreq);
                        if (typefaceTextView2 != null) {
                            i = R.id.sportSubData;
                            TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.sportSubData);
                            if (typefaceTextView3 != null) {
                                i = R.id.sportsBegin;
                                TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.sportsBegin);
                                if (typefaceTextView4 != null) {
                                    i = R.id.sportsDeviceIcon;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sportsDeviceIcon);
                                    if (imageView != null) {
                                        i = R.id.sportsType;
                                        TypefaceTextView typefaceTextView5 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.sportsType);
                                        if (typefaceTextView5 != null) {
                                            i = R.id.sportsTypeData;
                                            TypefaceTextView typefaceTextView6 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.sportsTypeData);
                                            if (typefaceTextView6 != null) {
                                                i = R.id.sportsTypeIcon;
                                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sportsTypeIcon);
                                                if (imageView2 != null) {
                                                    return new ExerciseHistoryListItemBinding((LinearLayout) rootView, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, typefaceTextView, typefaceTextView2, typefaceTextView3, typefaceTextView4, imageView, typefaceTextView5, typefaceTextView6, imageView2);
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
    public static ExerciseHistoryListItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ExerciseHistoryListItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.exercise_history_list_item, parent, false);
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
