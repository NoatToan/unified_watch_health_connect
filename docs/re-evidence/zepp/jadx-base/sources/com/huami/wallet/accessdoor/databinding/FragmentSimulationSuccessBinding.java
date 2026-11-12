package com.huami.wallet.accessdoor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.wallet.accessdoor.R;

/* JADX INFO: loaded from: classes15.dex */
public final class FragmentSimulationSuccessBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final EditText etCardName;

    @NonNull
    public final ImageView ivSuccess;

    @NonNull
    public final LinearLayout llTags;

    @NonNull
    public final TextView tvCardName;

    @NonNull
    public final TextView tvCompany;

    @NonNull
    public final TextView tvEmulationTip;

    @NonNull
    public final TextView tvFamily;

    @NonNull
    public final Button tvFinish;

    @NonNull
    public final TextView tvSchool;

    @NonNull
    public final TextView tvTip;

    @NonNull
    public final TextView tvWhiteMessage;

    @NonNull
    public final View view1;

    @NonNull
    public final View view2;

    private FragmentSimulationSuccessBinding(@NonNull RelativeLayout relativeLayout, @NonNull EditText editText, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull Button button, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull View view, @NonNull View view2) {
        this.a = relativeLayout;
        this.etCardName = editText;
        this.ivSuccess = imageView;
        this.llTags = linearLayout;
        this.tvCardName = textView;
        this.tvCompany = textView2;
        this.tvEmulationTip = textView3;
        this.tvFamily = textView4;
        this.tvFinish = button;
        this.tvSchool = textView5;
        this.tvTip = textView6;
        this.tvWhiteMessage = textView7;
        this.view1 = view;
        this.view2 = view2;
    }

    @NonNull
    public static FragmentSimulationSuccessBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.et_card_name;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
        if (editText != null) {
            i = R.id.iv_success;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.ll_tags;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.tv_card_name;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.tv_company;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.tv_emulation_tip;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = R.id.tv_family;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null) {
                                    i = R.id.tv_finish;
                                    Button button = (Button) ViewBindings.findChildViewById(view, i);
                                    if (button != null) {
                                        i = R.id.tv_school;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView5 != null) {
                                            i = R.id.tv_tip;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView6 != null) {
                                                i = R.id.tv_white_message;
                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView7 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.view1))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.view2))) != null) {
                                                    return new FragmentSimulationSuccessBinding((RelativeLayout) view, editText, imageView, linearLayout, textView, textView2, textView3, textView4, button, textView5, textView6, textView7, viewFindChildViewById, viewFindChildViewById2);
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
    public static FragmentSimulationSuccessBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSimulationSuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_simulation_success, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
