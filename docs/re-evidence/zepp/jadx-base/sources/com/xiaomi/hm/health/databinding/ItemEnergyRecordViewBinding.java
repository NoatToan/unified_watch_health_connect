package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ItemEnergyRecordViewBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final View energyDivider;

    @NonNull
    public final TextView energyRecordCal;

    @NonNull
    public final TextView energyRecordDesc;

    @NonNull
    public final ImageView energyRecordIcon;

    @NonNull
    public final TextView energyRecordStart;

    @NonNull
    public final TextView energyRecordTitle;

    private ItemEnergyRecordViewBinding(@NonNull ConstraintLayout rootView, @NonNull View energyDivider, @NonNull TextView energyRecordCal, @NonNull TextView energyRecordDesc, @NonNull ImageView energyRecordIcon, @NonNull TextView energyRecordStart, @NonNull TextView energyRecordTitle) {
        this.a = rootView;
        this.energyDivider = energyDivider;
        this.energyRecordCal = energyRecordCal;
        this.energyRecordDesc = energyRecordDesc;
        this.energyRecordIcon = energyRecordIcon;
        this.energyRecordStart = energyRecordStart;
        this.energyRecordTitle = energyRecordTitle;
    }

    @NonNull
    public static ItemEnergyRecordViewBinding bind(@NonNull View rootView) {
        int i = R.id.energy_divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.energy_divider);
        if (viewFindChildViewById != null) {
            i = R.id.energy_record_cal;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.energy_record_cal);
            if (textView != null) {
                i = R.id.energy_record_desc;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.energy_record_desc);
                if (textView2 != null) {
                    i = R.id.energy_record_icon;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.energy_record_icon);
                    if (imageView != null) {
                        i = R.id.energy_record_start;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.energy_record_start);
                        if (textView3 != null) {
                            i = R.id.energy_record_title;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.energy_record_title);
                            if (textView4 != null) {
                                return new ItemEnergyRecordViewBinding((ConstraintLayout) rootView, viewFindChildViewById, textView, textView2, imageView, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemEnergyRecordViewBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemEnergyRecordViewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_energy_record_view, parent, false);
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
