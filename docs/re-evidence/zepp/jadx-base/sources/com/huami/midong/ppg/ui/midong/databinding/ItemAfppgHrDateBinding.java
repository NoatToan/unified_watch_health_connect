package com.huami.midong.ppg.ui.midong.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.midong.ppg.ui.midong.R;

/* JADX INFO: loaded from: classes11.dex */
public final class ItemAfppgHrDateBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final View divideLine;

    @NonNull
    public final TextView hrDate;

    private ItemAfppgHrDateBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull TextView textView) {
        this.a = linearLayout;
        this.divideLine = view;
        this.hrDate = textView;
    }

    @NonNull
    public static ItemAfppgHrDateBinding bind(@NonNull View view) {
        int i = R.id.divideLine;
        View viewFindViewById = view.findViewById(i);
        if (viewFindViewById != null) {
            i = R.id.hr_date;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                return new ItemAfppgHrDateBinding((LinearLayout) view, viewFindViewById, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemAfppgHrDateBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemAfppgHrDateBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_afppg_hr_date, viewGroup, false);
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
