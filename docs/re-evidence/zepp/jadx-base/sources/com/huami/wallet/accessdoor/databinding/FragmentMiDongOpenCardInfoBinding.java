package com.huami.wallet.accessdoor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.wallet.accessdoor.R;

/* JADX INFO: loaded from: classes15.dex */
public final class FragmentMiDongOpenCardInfoBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final EditText etCommunity;

    @NonNull
    public final EditText etPhone;

    @NonNull
    public final TextView tvCommunity;

    @NonNull
    public final Button tvNextButton;

    @NonNull
    public final TextView tvOpenCardTip;

    @NonNull
    public final TextView tvPhone;

    @NonNull
    public final TextView tvSupport;

    @NonNull
    public final View viewCommunity;

    @NonNull
    public final View viewPhone;

    private FragmentMiDongOpenCardInfoBinding(@NonNull ConstraintLayout constraintLayout, @NonNull EditText editText, @NonNull EditText editText2, @NonNull TextView textView, @NonNull Button button, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull View view, @NonNull View view2) {
        this.a = constraintLayout;
        this.etCommunity = editText;
        this.etPhone = editText2;
        this.tvCommunity = textView;
        this.tvNextButton = button;
        this.tvOpenCardTip = textView2;
        this.tvPhone = textView3;
        this.tvSupport = textView4;
        this.viewCommunity = view;
        this.viewPhone = view2;
    }

    @NonNull
    public static FragmentMiDongOpenCardInfoBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.et_community;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
        if (editText != null) {
            i = R.id.et_phone;
            EditText editText2 = (EditText) ViewBindings.findChildViewById(view, i);
            if (editText2 != null) {
                i = R.id.tv_community;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tv_next_button;
                    Button button = (Button) ViewBindings.findChildViewById(view, i);
                    if (button != null) {
                        i = R.id.tv_open_card_tip;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.tv_phone;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = R.id.tv_support;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.view_community))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.view_phone))) != null) {
                                    return new FragmentMiDongOpenCardInfoBinding((ConstraintLayout) view, editText, editText2, textView, button, textView2, textView3, textView4, viewFindChildViewById, viewFindChildViewById2);
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
    public static FragmentMiDongOpenCardInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMiDongOpenCardInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_mi_dong_open_card_info, viewGroup, false);
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
