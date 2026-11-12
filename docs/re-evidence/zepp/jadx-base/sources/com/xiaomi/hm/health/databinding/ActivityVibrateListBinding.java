package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.ui.SingleSelectView;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityVibrateListBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final FrameLayout actionContainer;

    @NonNull
    public final TextView addVibrateTv;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final TextView customTv;

    @NonNull
    public final SingleSelectView defaultVibrateSv1;

    @NonNull
    public final SingleSelectView defaultVibrateSv2;

    @NonNull
    public final View divider1;

    @NonNull
    public final View divider2;

    @NonNull
    public final View divider3;

    @NonNull
    public final View dividerAlarm;

    @NonNull
    public final TextView doneVibrateTv;

    @NonNull
    public final TextView editVibrateTv;

    @NonNull
    public final TextView emptyTv;

    @NonNull
    public final View maskView;

    @NonNull
    public final TextView standardTv;

    @NonNull
    public final RecyclerView vibrateList;

    private ActivityVibrateListBinding(@NonNull RelativeLayout rootView, @NonNull FrameLayout actionContainer, @NonNull TextView addVibrateTv, @NonNull FrameLayout container, @NonNull TextView customTv, @NonNull SingleSelectView defaultVibrateSv1, @NonNull SingleSelectView defaultVibrateSv2, @NonNull View divider1, @NonNull View divider2, @NonNull View divider3, @NonNull View dividerAlarm, @NonNull TextView doneVibrateTv, @NonNull TextView editVibrateTv, @NonNull TextView emptyTv, @NonNull View maskView, @NonNull TextView standardTv, @NonNull RecyclerView vibrateList) {
        this.a = rootView;
        this.actionContainer = actionContainer;
        this.addVibrateTv = addVibrateTv;
        this.container = container;
        this.customTv = customTv;
        this.defaultVibrateSv1 = defaultVibrateSv1;
        this.defaultVibrateSv2 = defaultVibrateSv2;
        this.divider1 = divider1;
        this.divider2 = divider2;
        this.divider3 = divider3;
        this.dividerAlarm = dividerAlarm;
        this.doneVibrateTv = doneVibrateTv;
        this.editVibrateTv = editVibrateTv;
        this.emptyTv = emptyTv;
        this.maskView = maskView;
        this.standardTv = standardTv;
        this.vibrateList = vibrateList;
    }

    @NonNull
    public static ActivityVibrateListBinding bind(@NonNull View rootView) {
        int i = R.id.action_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.action_container);
        if (frameLayout != null) {
            i = R.id.add_vibrate_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.add_vibrate_tv);
            if (textView != null) {
                i = R.id.container;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.container);
                if (frameLayout2 != null) {
                    i = R.id.custom_tv;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.custom_tv);
                    if (textView2 != null) {
                        i = R.id.default_vibrate_sv_1;
                        SingleSelectView singleSelectView = (SingleSelectView) ViewBindings.findChildViewById(rootView, R.id.default_vibrate_sv_1);
                        if (singleSelectView != null) {
                            i = R.id.default_vibrate_sv_2;
                            SingleSelectView singleSelectView2 = (SingleSelectView) ViewBindings.findChildViewById(rootView, R.id.default_vibrate_sv_2);
                            if (singleSelectView2 != null) {
                                i = R.id.divider_1;
                                View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider_1);
                                if (viewFindChildViewById != null) {
                                    i = R.id.divider_2;
                                    View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.divider_2);
                                    if (viewFindChildViewById2 != null) {
                                        i = R.id.divider_3;
                                        View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.divider_3);
                                        if (viewFindChildViewById3 != null) {
                                            i = R.id.divider_alarm;
                                            View viewFindChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.divider_alarm);
                                            if (viewFindChildViewById4 != null) {
                                                i = R.id.done_vibrate_tv;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.done_vibrate_tv);
                                                if (textView3 != null) {
                                                    i = R.id.edit_vibrate_tv;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.edit_vibrate_tv);
                                                    if (textView4 != null) {
                                                        i = R.id.empty_tv;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.empty_tv);
                                                        if (textView5 != null) {
                                                            i = R.id.mask_view;
                                                            View viewFindChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.mask_view);
                                                            if (viewFindChildViewById5 != null) {
                                                                i = R.id.standard_tv;
                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.standard_tv);
                                                                if (textView6 != null) {
                                                                    i = R.id.vibrate_list;
                                                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.vibrate_list);
                                                                    if (recyclerView != null) {
                                                                        return new ActivityVibrateListBinding((RelativeLayout) rootView, frameLayout, textView, frameLayout2, textView2, singleSelectView, singleSelectView2, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, textView3, textView4, textView5, viewFindChildViewById5, textView6, recyclerView);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityVibrateListBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityVibrateListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_vibrate_list, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
