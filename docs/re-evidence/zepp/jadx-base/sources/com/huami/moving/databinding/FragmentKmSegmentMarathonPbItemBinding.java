package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.moving.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public final class FragmentKmSegmentMarathonPbItemBinding implements ViewBinding {

    @NonNull
    private final TextView a;

    @NonNull
    public final TextView marathonTag;

    private FragmentKmSegmentMarathonPbItemBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.a = textView;
        this.marathonTag = textView2;
    }

    @NonNull
    public static FragmentKmSegmentMarathonPbItemBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        TextView textView = (TextView) view;
        return new FragmentKmSegmentMarathonPbItemBinding(textView, textView);
    }

    @NonNull
    public static FragmentKmSegmentMarathonPbItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentKmSegmentMarathonPbItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_km_segment_marathon_pb_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public TextView getRoot() {
        return this.a;
    }
}
