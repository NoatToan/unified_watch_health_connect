package com.huami.module.homepage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.module.homepage.R;

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageItemCardPhnDialogBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView homepagePhnDialogDescription;

    @NonNull
    public final TextView homepagePhnDialogTitle;

    private HomepageItemCardPhnDialogBinding(@NonNull ConstraintLayout rootView, @NonNull TextView homepagePhnDialogDescription, @NonNull TextView homepagePhnDialogTitle) {
        this.a = rootView;
        this.homepagePhnDialogDescription = homepagePhnDialogDescription;
        this.homepagePhnDialogTitle = homepagePhnDialogTitle;
    }

    @NonNull
    public static HomepageItemCardPhnDialogBinding bind(@NonNull View rootView) {
        int i = R.id.homepage_phn_dialog_description;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.homepage_phn_dialog_title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView2 != null) {
                return new HomepageItemCardPhnDialogBinding((ConstraintLayout) rootView, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HomepageItemCardPhnDialogBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageItemCardPhnDialogBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_item_card_phn_dialog, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
