package com.huami.pai.lib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.pai.lib.R;

/* JADX INFO: loaded from: classes12.dex */
public final class FragmentNoheartrateDataBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final FragmentPaiNoHrBinding llNoHrContent;

    @NonNull
    public final LinearLayout llNoHrParent;

    @NonNull
    public final TextView paiValueToday;

    private FragmentNoheartrateDataBinding(@NonNull LinearLayout rootView, @NonNull FragmentPaiNoHrBinding llNoHrContent, @NonNull LinearLayout llNoHrParent, @NonNull TextView paiValueToday) {
        this.a = rootView;
        this.llNoHrContent = llNoHrContent;
        this.llNoHrParent = llNoHrParent;
        this.paiValueToday = paiValueToday;
    }

    @NonNull
    public static FragmentNoheartrateDataBinding bind(@NonNull View rootView) {
        int i = R.id.ll_no_hr_content;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, i);
        if (viewFindChildViewById != null) {
            FragmentPaiNoHrBinding fragmentPaiNoHrBindingBind = FragmentPaiNoHrBinding.bind(viewFindChildViewById);
            LinearLayout linearLayout = (LinearLayout) rootView;
            int i2 = R.id.pai_value_today;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i2);
            if (textView != null) {
                return new FragmentNoheartrateDataBinding(linearLayout, fragmentPaiNoHrBindingBind, linearLayout, textView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentNoheartrateDataBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentNoheartrateDataBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_noheartrate_data, parent, false);
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
