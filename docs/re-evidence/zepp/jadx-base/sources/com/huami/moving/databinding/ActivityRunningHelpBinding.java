package com.huami.moving.databinding;

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
import com.huami.moving.R;

/* JADX INFO: loaded from: classes11.dex */
public final class ActivityRunningHelpBinding implements ViewBinding {

    @NonNull
    private final ScrollView a;

    @NonNull
    public final ViewStub flightRatioDetail;

    @NonNull
    public final TextView flightRatioTitle;

    @NonNull
    public final ViewStub forefeetDetail;

    @NonNull
    public final TextView forefeetTitle;

    @NonNull
    public final ViewStub heartRateDetail;

    @NonNull
    public final TextView heartRateTitle;

    @NonNull
    public final ScrollView helpContainer;

    @NonNull
    public final ViewStub paceDetail;

    @NonNull
    public final TextView paceTitle;

    @NonNull
    public final ViewStub strideDetail;

    @NonNull
    public final ViewStub strideFreqDetail;

    @NonNull
    public final TextView strideFreqTitle;

    @NonNull
    public final TextView strideTitle;

    @NonNull
    public final ViewStub touchDownDetail;

    @NonNull
    public final TextView touchDownTitle;

    @NonNull
    public final ViewStub upHillDetail;

    @NonNull
    public final TextView upHillTitle;

    private ActivityRunningHelpBinding(@NonNull ScrollView scrollView, @NonNull ViewStub viewStub, @NonNull TextView textView, @NonNull ViewStub viewStub2, @NonNull TextView textView2, @NonNull ViewStub viewStub3, @NonNull TextView textView3, @NonNull ScrollView scrollView2, @NonNull ViewStub viewStub4, @NonNull TextView textView4, @NonNull ViewStub viewStub5, @NonNull ViewStub viewStub6, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull ViewStub viewStub7, @NonNull TextView textView7, @NonNull ViewStub viewStub8, @NonNull TextView textView8) {
        this.a = scrollView;
        this.flightRatioDetail = viewStub;
        this.flightRatioTitle = textView;
        this.forefeetDetail = viewStub2;
        this.forefeetTitle = textView2;
        this.heartRateDetail = viewStub3;
        this.heartRateTitle = textView3;
        this.helpContainer = scrollView2;
        this.paceDetail = viewStub4;
        this.paceTitle = textView4;
        this.strideDetail = viewStub5;
        this.strideFreqDetail = viewStub6;
        this.strideFreqTitle = textView5;
        this.strideTitle = textView6;
        this.touchDownDetail = viewStub7;
        this.touchDownTitle = textView7;
        this.upHillDetail = viewStub8;
        this.upHillTitle = textView8;
    }

    @NonNull
    public static ActivityRunningHelpBinding bind(@NonNull View view) {
        int i = R.id.flightRatioDetail;
        ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(view, i);
        if (viewStub != null) {
            i = R.id.flightRatioTitle;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.forefeetDetail;
                ViewStub viewStub2 = (ViewStub) ViewBindings.findChildViewById(view, i);
                if (viewStub2 != null) {
                    i = R.id.forefeetTitle;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.heartRateDetail;
                        ViewStub viewStub3 = (ViewStub) ViewBindings.findChildViewById(view, i);
                        if (viewStub3 != null) {
                            i = R.id.heartRateTitle;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                ScrollView scrollView = (ScrollView) view;
                                i = R.id.paceDetail;
                                ViewStub viewStub4 = (ViewStub) ViewBindings.findChildViewById(view, i);
                                if (viewStub4 != null) {
                                    i = R.id.paceTitle;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView4 != null) {
                                        i = R.id.strideDetail;
                                        ViewStub viewStub5 = (ViewStub) ViewBindings.findChildViewById(view, i);
                                        if (viewStub5 != null) {
                                            i = R.id.strideFreqDetail;
                                            ViewStub viewStub6 = (ViewStub) ViewBindings.findChildViewById(view, i);
                                            if (viewStub6 != null) {
                                                i = R.id.strideFreqTitle;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView5 != null) {
                                                    i = R.id.strideTitle;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView6 != null) {
                                                        i = R.id.touchDownDetail;
                                                        ViewStub viewStub7 = (ViewStub) ViewBindings.findChildViewById(view, i);
                                                        if (viewStub7 != null) {
                                                            i = R.id.touchDownTitle;
                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView7 != null) {
                                                                i = R.id.upHillDetail;
                                                                ViewStub viewStub8 = (ViewStub) ViewBindings.findChildViewById(view, i);
                                                                if (viewStub8 != null) {
                                                                    i = R.id.upHillTitle;
                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView8 != null) {
                                                                        return new ActivityRunningHelpBinding(scrollView, viewStub, textView, viewStub2, textView2, viewStub3, textView3, scrollView, viewStub4, textView4, viewStub5, viewStub6, textView5, textView6, viewStub7, textView7, viewStub8, textView8);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityRunningHelpBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityRunningHelpBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_running_help, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ScrollView getRoot() {
        return this.a;
    }
}
