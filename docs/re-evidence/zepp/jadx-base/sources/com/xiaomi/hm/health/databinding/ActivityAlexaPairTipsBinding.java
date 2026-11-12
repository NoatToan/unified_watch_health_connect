package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityAlexaPairTipsBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TextView alexaText1;

    @NonNull
    public final TextView alexaText2;

    @NonNull
    public final TextView alexaText3;

    @NonNull
    public final TextView alexaText4;

    @NonNull
    public final TextView alexaText5;

    @NonNull
    public final TextView deviceNameTv;

    @NonNull
    public final TextView goToBluetoothSettingBtn;

    private ActivityAlexaPairTipsBinding(@NonNull LinearLayout rootView, @NonNull TextView alexaText1, @NonNull TextView alexaText2, @NonNull TextView alexaText3, @NonNull TextView alexaText4, @NonNull TextView alexaText5, @NonNull TextView deviceNameTv, @NonNull TextView goToBluetoothSettingBtn) {
        this.a = rootView;
        this.alexaText1 = alexaText1;
        this.alexaText2 = alexaText2;
        this.alexaText3 = alexaText3;
        this.alexaText4 = alexaText4;
        this.alexaText5 = alexaText5;
        this.deviceNameTv = deviceNameTv;
        this.goToBluetoothSettingBtn = goToBluetoothSettingBtn;
    }

    @NonNull
    public static ActivityAlexaPairTipsBinding bind(@NonNull View rootView) {
        int i = R.id.alexa_text_1;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.alexa_text_1);
        if (textView != null) {
            i = R.id.alexa_text_2;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.alexa_text_2);
            if (textView2 != null) {
                i = R.id.alexa_text_3;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.alexa_text_3);
                if (textView3 != null) {
                    i = R.id.alexa_text_4;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.alexa_text_4);
                    if (textView4 != null) {
                        i = R.id.alexa_text_5;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.alexa_text_5);
                        if (textView5 != null) {
                            i = R.id.device_name_tv;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.device_name_tv);
                            if (textView6 != null) {
                                i = R.id.go_to_bluetooth_setting_btn;
                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.go_to_bluetooth_setting_btn);
                                if (textView7 != null) {
                                    return new ActivityAlexaPairTipsBinding((LinearLayout) rootView, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
    public static ActivityAlexaPairTipsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityAlexaPairTipsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_alexa_pair_tips, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
