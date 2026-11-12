package com.huami.wallet.accessdoor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.wallet.accessdoor.R;

/* JADX INFO: loaded from: classes15.dex */
public final class DialogUserPrivacyAgreementBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final CheckBox checkUserPrivacy;

    @NonNull
    public final View dlgEmptyAreaBtn;

    @NonNull
    public final TextView tvCancel;

    @NonNull
    public final TextView tvConfirm;

    @NonNull
    public final TextView tvUserPrivacyAgree;

    @NonNull
    public final TextView tvUserPrivacyLink;

    @NonNull
    public final TextView userAgreementTip;

    @NonNull
    public final TextView userAgreementTitle;

    private DialogUserPrivacyAgreementBinding(@NonNull LinearLayout linearLayout, @NonNull CheckBox checkBox, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.a = linearLayout;
        this.checkUserPrivacy = checkBox;
        this.dlgEmptyAreaBtn = view;
        this.tvCancel = textView;
        this.tvConfirm = textView2;
        this.tvUserPrivacyAgree = textView3;
        this.tvUserPrivacyLink = textView4;
        this.userAgreementTip = textView5;
        this.userAgreementTitle = textView6;
    }

    @NonNull
    public static DialogUserPrivacyAgreementBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.check_user_privacy;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i);
        if (checkBox != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.dlg_empty_area_btn))) != null) {
            i = R.id.tv_cancel;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.tv_confirm;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.tv_user_privacy_agree;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = R.id.tv_user_privacy_link;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            i = R.id.user_agreement_tip;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView5 != null) {
                                i = R.id.user_agreement_title;
                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView6 != null) {
                                    return new DialogUserPrivacyAgreementBinding((LinearLayout) view, checkBox, viewFindChildViewById, textView, textView2, textView3, textView4, textView5, textView6);
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
    public static DialogUserPrivacyAgreementBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogUserPrivacyAgreementBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_user_privacy_agreement, viewGroup, false);
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
