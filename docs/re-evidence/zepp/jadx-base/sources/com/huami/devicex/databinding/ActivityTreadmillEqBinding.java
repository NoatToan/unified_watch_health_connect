package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.view.TreadmillEqBottomView;
import com.xiaomi.hm.health.device.view.TreadmillEqView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityTreadmillEqBinding implements ViewBinding {

    @NonNull
    private final View a;

    @Nullable
    public final TextView eqBlue;

    @Nullable
    public final TreadmillEqBottomView eqBottomView;

    @Nullable
    public final TextView eqClassic;

    @Nullable
    public final TextView eqClose;

    @Nullable
    public final TextView eqCountry;

    @Nullable
    public final TextView eqDance;

    @Nullable
    public final TextView eqDiy;

    @Nullable
    public final TextView eqElectronic;

    @Nullable
    public final TextView eqJazz;

    @Nullable
    public final TextView eqPopular;

    @Nullable
    public final TextView eqRock;

    @Nullable
    public final TextView eqSlow;

    @Nullable
    public final TreadmillEqView eqView;

    @Nullable
    public final TextView eqVoice;

    @Nullable
    public final View maskView;

    @NonNull
    public final FrameLayout titleContainer;

    private ActivityTreadmillEqBinding(@NonNull View view, @Nullable TextView textView, @Nullable TreadmillEqBottomView treadmillEqBottomView, @Nullable TextView textView2, @Nullable TextView textView3, @Nullable TextView textView4, @Nullable TextView textView5, @Nullable TextView textView6, @Nullable TextView textView7, @Nullable TextView textView8, @Nullable TextView textView9, @Nullable TextView textView10, @Nullable TextView textView11, @Nullable TreadmillEqView treadmillEqView, @Nullable TextView textView12, @Nullable View view2, @NonNull FrameLayout frameLayout) {
        this.a = view;
        this.eqBlue = textView;
        this.eqBottomView = treadmillEqBottomView;
        this.eqClassic = textView2;
        this.eqClose = textView3;
        this.eqCountry = textView4;
        this.eqDance = textView5;
        this.eqDiy = textView6;
        this.eqElectronic = textView7;
        this.eqJazz = textView8;
        this.eqPopular = textView9;
        this.eqRock = textView10;
        this.eqSlow = textView11;
        this.eqView = treadmillEqView;
        this.eqVoice = textView12;
        this.maskView = view2;
        this.titleContainer = frameLayout;
    }

    @NonNull
    public static ActivityTreadmillEqBinding bind(@NonNull View view) {
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.eq_blue);
        TreadmillEqBottomView treadmillEqBottomView = (TreadmillEqBottomView) ViewBindings.findChildViewById(view, R.id.eq_bottom_view);
        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.eq_classic);
        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.eq_close);
        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.eq_country);
        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.eq_dance);
        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.eq_diy);
        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.eq_electronic);
        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.eq_jazz);
        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.eq_popular);
        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.eq_rock);
        TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.eq_slow);
        TreadmillEqView treadmillEqView = (TreadmillEqView) ViewBindings.findChildViewById(view, R.id.eq_view);
        TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.eq_voice);
        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.mask_view);
        int i = R.id.title_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            return new ActivityTreadmillEqBinding(view, textView, treadmillEqBottomView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, treadmillEqView, textView12, viewFindChildViewById, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityTreadmillEqBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }

    @NonNull
    public static ActivityTreadmillEqBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_treadmill_eq, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }
}
