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
public final class SlpFragmentMonthStateFeelLayoutBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final RecyclerView feelListView;

    @NonNull
    public final TextView sleepFeelTv;

    @NonNull
    public final View sleepLine;

    @NonNull
    public final TextView sleepStateTv;

    @NonNull
    public final View stateLine;

    @NonNull
    public final RecyclerView stateListView;

    private SlpFragmentMonthStateFeelLayoutBinding(@NonNull LinearLayout rootView, @NonNull RecyclerView feelListView, @NonNull TextView sleepFeelTv, @NonNull View sleepLine, @NonNull TextView sleepStateTv, @NonNull View stateLine, @NonNull RecyclerView stateListView) {
        this.a = rootView;
        this.feelListView = feelListView;
        this.sleepFeelTv = sleepFeelTv;
        this.sleepLine = sleepLine;
        this.sleepStateTv = sleepStateTv;
        this.stateLine = stateLine;
        this.stateListView = stateListView;
    }

    @NonNull
    public static SlpFragmentMonthStateFeelLayoutBinding bind(@NonNull View rootView) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.feelListView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, i);
        if (recyclerView != null) {
            i = R.id.sleepFeelTv;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.sleepLine))) != null) {
                i = R.id.sleepStateTv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView2 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, (i = R.id.stateLine))) != null) {
                    i = R.id.stateListView;
                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, i);
                    if (recyclerView2 != null) {
                        return new SlpFragmentMonthStateFeelLayoutBinding((LinearLayout) rootView, recyclerView, textView, viewFindChildViewById, textView2, viewFindChildViewById2, recyclerView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static SlpFragmentMonthStateFeelLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static SlpFragmentMonthStateFeelLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.slp_fragment_month_state_feel_layout, parent, false);
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
