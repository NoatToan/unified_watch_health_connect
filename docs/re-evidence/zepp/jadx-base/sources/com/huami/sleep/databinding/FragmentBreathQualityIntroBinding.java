package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.R;

/* JADX INFO: loaded from: classes13.dex */
public final class FragmentBreathQualityIntroBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TextView feedBack;

    @NonNull
    public final RecyclerView funcListView;

    @NonNull
    public final TextView sleepReferenceDocuments;

    private FragmentBreathQualityIntroBinding(@NonNull LinearLayout rootView, @NonNull TextView feedBack, @NonNull RecyclerView funcListView, @NonNull TextView sleepReferenceDocuments) {
        this.a = rootView;
        this.feedBack = feedBack;
        this.funcListView = funcListView;
        this.sleepReferenceDocuments = sleepReferenceDocuments;
    }

    @NonNull
    public static FragmentBreathQualityIntroBinding bind(@NonNull View rootView) {
        int i = R.id.feed_back;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.funcListView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, i);
            if (recyclerView != null) {
                i = R.id.sleep_reference_documents;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView2 != null) {
                    return new FragmentBreathQualityIntroBinding((LinearLayout) rootView, textView, recyclerView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentBreathQualityIntroBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentBreathQualityIntroBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_breath_quality_intro, parent, false);
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
