package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityMibandAlarmBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

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
    public final View maskView;

    @NonNull
    public final LinearLayout nullText;

    @NonNull
    public final TextView nullTip;

    @NonNull
    public final TextView vibrateTv;

    private ActivityMibandAlarmBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull RecyclerView recyclerView, @NonNull TextView textView4, @NonNull LinearLayout linearLayout4, @NonNull FrameLayout frameLayout, @NonNull View view, @NonNull LinearLayout linearLayout5, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.a = linearLayout;
        this.alarmAdd = textView;
        this.alarmDone = textView2;
        this.alarmEdit = textView3;
        this.alarmEditParent = linearLayout2;
        this.alarmLayout = linearLayout3;
        this.alarmList = recyclerView;
        this.alarmTip = textView4;
        this.alarmTipRl = linearLayout4;
        this.container = frameLayout;
        this.maskView = view;
        this.nullText = linearLayout5;
        this.nullTip = textView5;
        this.vibrateTv = textView6;
    }

    @NonNull
    public static ActivityMibandAlarmBinding bind(@NonNull View view) {
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
                                        if (frameLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.mask_view))) != null) {
                                            i = R.id.null_text;
                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout4 != null) {
                                                i = R.id.null_tip;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView5 != null) {
                                                    i = R.id.vibrate_tv;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView6 != null) {
                                                        return new ActivityMibandAlarmBinding((LinearLayout) view, textView, textView2, textView3, linearLayout, linearLayout2, recyclerView, textView4, linearLayout3, frameLayout, viewFindChildViewById, linearLayout4, textView5, textView6);
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
    public static ActivityMibandAlarmBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityMibandAlarmBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_miband_alarm, viewGroup, false);
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
