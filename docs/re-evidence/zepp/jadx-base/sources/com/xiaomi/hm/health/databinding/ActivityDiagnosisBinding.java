package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityDiagnosisBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final Button btnDiagnose;

    @NonNull
    public final CheckBox cbAlertNameless;

    @NonNull
    public final CheckBox cbAppAlert;

    @NonNull
    public final CheckBox cbMsgAlert;

    @NonNull
    public final CheckBox cbPhoneAlert;

    @NonNull
    public final LinearLayout layoutDiagnosisResult;

    @NonNull
    public final LinearLayout layoutPermissionRequest;

    @NonNull
    public final LinearLayout layoutQuestions;

    @NonNull
    public final TextView tvFeedback;

    @NonNull
    public final TextView tvSettingTip;

    @NonNull
    public final TextView tvTip;

    private ActivityDiagnosisBinding(@NonNull RelativeLayout rootView, @NonNull Button btnDiagnose, @NonNull CheckBox cbAlertNameless, @NonNull CheckBox cbAppAlert, @NonNull CheckBox cbMsgAlert, @NonNull CheckBox cbPhoneAlert, @NonNull LinearLayout layoutDiagnosisResult, @NonNull LinearLayout layoutPermissionRequest, @NonNull LinearLayout layoutQuestions, @NonNull TextView tvFeedback, @NonNull TextView tvSettingTip, @NonNull TextView tvTip) {
        this.a = rootView;
        this.btnDiagnose = btnDiagnose;
        this.cbAlertNameless = cbAlertNameless;
        this.cbAppAlert = cbAppAlert;
        this.cbMsgAlert = cbMsgAlert;
        this.cbPhoneAlert = cbPhoneAlert;
        this.layoutDiagnosisResult = layoutDiagnosisResult;
        this.layoutPermissionRequest = layoutPermissionRequest;
        this.layoutQuestions = layoutQuestions;
        this.tvFeedback = tvFeedback;
        this.tvSettingTip = tvSettingTip;
        this.tvTip = tvTip;
    }

    @NonNull
    public static ActivityDiagnosisBinding bind(@NonNull View rootView) {
        int i = R.id.btn_diagnose;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_diagnose);
        if (button != null) {
            i = R.id.cb_alert_nameless;
            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_alert_nameless);
            if (checkBox != null) {
                i = R.id.cb_app_alert;
                CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_app_alert);
                if (checkBox2 != null) {
                    i = R.id.cb_msg_alert;
                    CheckBox checkBox3 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_msg_alert);
                    if (checkBox3 != null) {
                        i = R.id.cb_phone_alert;
                        CheckBox checkBox4 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_phone_alert);
                        if (checkBox4 != null) {
                            i = R.id.layout_diagnosis_result;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.layout_diagnosis_result);
                            if (linearLayout != null) {
                                i = R.id.layout_permission_request;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.layout_permission_request);
                                if (linearLayout2 != null) {
                                    i = R.id.layout_questions;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.layout_questions);
                                    if (linearLayout3 != null) {
                                        i = R.id.tv_feedback;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_feedback);
                                        if (textView != null) {
                                            i = R.id.tv_setting_tip;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_setting_tip);
                                            if (textView2 != null) {
                                                i = R.id.tv_tip;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_tip);
                                                if (textView3 != null) {
                                                    return new ActivityDiagnosisBinding((RelativeLayout) rootView, button, checkBox, checkBox2, checkBox3, checkBox4, linearLayout, linearLayout2, linearLayout3, textView, textView2, textView3);
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
    public static ActivityDiagnosisBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityDiagnosisBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_diagnosis, parent, false);
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
