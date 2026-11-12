package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityHuamiosAlarmBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView alarmAdd;

    @NonNull
    public final TextView alarmDone;

    @NonNull
    public final TextView alarmEdit;

    @NonNull
    public final LinearLayout alarmEditParent;

    @NonNull
    public final LinearLayout alarmLayout;

    @NonNull
    public final RecyclerView alarmList;

    @NonNull
    public final TextView alarmTip;

    @NonNull
    public final LinearLayout alarmTipRl;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final RelativeLayout editLayout;

    @NonNull
    public final View maskView;

    @NonNull
    public final LinearLayout nullText;

    @NonNull
    public final TextView nullTip;

    private ActivityHuamiosAlarmBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull TextView textView4, @NonNull LinearLayout linearLayout3, @NonNull FrameLayout frameLayout, @NonNull RelativeLayout relativeLayout, @NonNull View view, @NonNull LinearLayout linearLayout4, @NonNull TextView textView5) {
        this.a = constraintLayout;
        this.alarmAdd = textView;
        this.alarmDone = textView2;
        this.alarmEdit = textView3;
        this.alarmEditParent = linearLayout;
        this.alarmLayout = linearLayout2;
        this.alarmList = recyclerView;
        this.alarmTip = textView4;
        this.alarmTipRl = linearLayout3;
        this.container = frameLayout;
        this.editLayout = relativeLayout;
        this.maskView = view;
        this.nullText = linearLayout4;
        this.nullTip = textView5;
    }

    @NonNull
    public static ActivityHuamiosAlarmBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.alarm_add;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.alarm_done;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.alarm_edit;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = R.id.alarm_edit_parent;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R.id.alarm_layout;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout2 != null) {
                            i = R.id.alarm_list;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = R.id.alarm_tip;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null) {
                                    i = R.id.alarm_tip_rl;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout3 != null) {
                                        i = R.id.container;
                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                        if (frameLayout != null) {
                                            i = R.id.edit_layout;
                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                            if (relativeLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.mask_view))) != null) {
                                                i = R.id.null_text;
                                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout4 != null) {
                                                    i = R.id.null_tip;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView5 != null) {
                                                        return new ActivityHuamiosAlarmBinding((ConstraintLayout) view, textView, textView2, textView3, linearLayout, linearLayout2, recyclerView, textView4, linearLayout3, frameLayout, relativeLayout, viewFindChildViewById, linearLayout4, textView5);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityHuamiosAlarmBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityHuamiosAlarmBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_huamios_alarm, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
