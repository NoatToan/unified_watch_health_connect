package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.R;
import com.huami.sleep.view.NestRecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public final class FragmentStateFeelLayoutBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final NestRecyclerView feelListView;

    @NonNull
    public final NestRecyclerView stateListView;

    @NonNull
    public final TextView titleBehTv;

    @NonNull
    public final TextView titleFeelTv;

    @NonNull
    public final TextView titleRecordTv;

    private FragmentStateFeelLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull NestRecyclerView feelListView, @NonNull NestRecyclerView stateListView, @NonNull TextView titleBehTv, @NonNull TextView titleFeelTv, @NonNull TextView titleRecordTv) {
        this.a = rootView;
        this.feelListView = feelListView;
        this.stateListView = stateListView;
        this.titleBehTv = titleBehTv;
        this.titleFeelTv = titleFeelTv;
        this.titleRecordTv = titleRecordTv;
    }

    @NonNull
    public static FragmentStateFeelLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.feelListView;
        NestRecyclerView nestRecyclerView = (NestRecyclerView) ViewBindings.findChildViewById(rootView, i);
        if (nestRecyclerView != null) {
            i = R.id.stateListView;
            NestRecyclerView nestRecyclerView2 = (NestRecyclerView) ViewBindings.findChildViewById(rootView, i);
            if (nestRecyclerView2 != null) {
                i = R.id.titleBehTv;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView != null) {
                    i = R.id.titleFeelTv;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView2 != null) {
                        i = R.id.titleRecordTv;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView3 != null) {
                            return new FragmentStateFeelLayoutBinding((ConstraintLayout) rootView, nestRecyclerView, nestRecyclerView2, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentStateFeelLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentStateFeelLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_state_feel_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
