package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityMiliproIllustrationBinding implements ViewBinding {

    @NonNull
    private final ScrollView a;

    @NonNull
    public final ViewStub bandAlertDetail;

    @NonNull
    public final TextView bandAlertText;

    @NonNull
    public final ViewStub clickToSeeDetail;

    @NonNull
    public final TextView clickToSeeText;

    @NonNull
    public final ScrollView illustrationContainer;

    @NonNull
    public final TextView stepReachGoalAlert;

    @NonNull
    public final ViewStub stepReachGoalAlertDetail;

    private ActivityMiliproIllustrationBinding(@NonNull ScrollView rootView, @NonNull ViewStub bandAlertDetail, @NonNull TextView bandAlertText, @NonNull ViewStub clickToSeeDetail, @NonNull TextView clickToSeeText, @NonNull ScrollView illustrationContainer, @NonNull TextView stepReachGoalAlert, @NonNull ViewStub stepReachGoalAlertDetail) {
        this.a = rootView;
        this.bandAlertDetail = bandAlertDetail;
        this.bandAlertText = bandAlertText;
        this.clickToSeeDetail = clickToSeeDetail;
        this.clickToSeeText = clickToSeeText;
        this.illustrationContainer = illustrationContainer;
        this.stepReachGoalAlert = stepReachGoalAlert;
        this.stepReachGoalAlertDetail = stepReachGoalAlertDetail;
    }

    @NonNull
    public static ActivityMiliproIllustrationBinding bind(@NonNull View rootView) {
        int i = R.id.band_alert_detail;
        ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(rootView, R.id.band_alert_detail);
        if (viewStub != null) {
            i = R.id.band_alert_text;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.band_alert_text);
            if (textView != null) {
                i = R.id.click_to_see_detail;
                ViewStub viewStub2 = (ViewStub) ViewBindings.findChildViewById(rootView, R.id.click_to_see_detail);
                if (viewStub2 != null) {
                    i = R.id.click_to_see_text;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.click_to_see_text);
                    if (textView2 != null) {
                        ScrollView scrollView = (ScrollView) rootView;
                        i = R.id.step_reach_goal_alert;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.step_reach_goal_alert);
                        if (textView3 != null) {
                            i = R.id.step_reach_goal_alert_detail;
                            ViewStub viewStub3 = (ViewStub) ViewBindings.findChildViewById(rootView, R.id.step_reach_goal_alert_detail);
                            if (viewStub3 != null) {
                                return new ActivityMiliproIllustrationBinding(scrollView, viewStub, textView, viewStub2, textView2, scrollView, textView3, viewStub3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityMiliproIllustrationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityMiliproIllustrationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_milipro_illustration, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ScrollView getRoot() {
        return this.a;
    }
}
