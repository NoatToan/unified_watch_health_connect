package com.huami.midong.ppg.ui.midong.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.midong.ppg.ui.midong.R;

/* JADX INFO: loaded from: classes11.dex */
public final class ItemAfppgHeartAbnormalBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView hrAbnormalDuration;

    @NonNull
    public final TextView hrAbnormalTime;

    @NonNull
    public final TextView hrAbnormalTitle;

    @NonNull
    public final Space lastSpace;

    private ItemAfppgHeartAbnormalBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull Space space) {
        this.a = relativeLayout;
        this.hrAbnormalDuration = textView;
        this.hrAbnormalTime = textView2;
        this.hrAbnormalTitle = textView3;
        this.lastSpace = space;
    }

    @NonNull
    public static ItemAfppgHeartAbnormalBinding bind(@NonNull View view) {
        int i = R.id.hr_abnormal_duration;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = R.id.hr_abnormal_time;
            TextView textView2 = (TextView) view.findViewById(i);
            if (textView2 != null) {
                i = R.id.hr_abnormal_title;
                TextView textView3 = (TextView) view.findViewById(i);
                if (textView3 != null) {
                    i = R.id.lastSpace;
                    Space space = (Space) view.findViewById(i);
                    if (space != null) {
                        return new ItemAfppgHeartAbnormalBinding((RelativeLayout) view, textView, textView2, textView3, space);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemAfppgHeartAbnormalBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemAfppgHeartAbnormalBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_afppg_heart_abnormal, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
