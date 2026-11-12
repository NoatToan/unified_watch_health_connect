package com.huami.module.homepage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.module.homepage.R;

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageRomDialogBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ConstraintLayout homepageRomDialogCl;

    @NonNull
    public final TextView homepageRomDialogDetail;

    @NonNull
    public final TextView homepageRomDialogGo;

    @NonNull
    public final NestedScrollView homepageRomDialogNsl;

    @NonNull
    public final TextView homepageRomDialogSkip;

    @NonNull
    public final View homepageRomDialogSplit;

    @NonNull
    public final TextView homepageRomDialogTitle;

    @NonNull
    public final LinearLayout permissionLl;

    private HomepageRomDialogBinding(@NonNull LinearLayout rootView, @NonNull ConstraintLayout homepageRomDialogCl, @NonNull TextView homepageRomDialogDetail, @NonNull TextView homepageRomDialogGo, @NonNull NestedScrollView homepageRomDialogNsl, @NonNull TextView homepageRomDialogSkip, @NonNull View homepageRomDialogSplit, @NonNull TextView homepageRomDialogTitle, @NonNull LinearLayout permissionLl) {
        this.a = rootView;
        this.homepageRomDialogCl = homepageRomDialogCl;
        this.homepageRomDialogDetail = homepageRomDialogDetail;
        this.homepageRomDialogGo = homepageRomDialogGo;
        this.homepageRomDialogNsl = homepageRomDialogNsl;
        this.homepageRomDialogSkip = homepageRomDialogSkip;
        this.homepageRomDialogSplit = homepageRomDialogSplit;
        this.homepageRomDialogTitle = homepageRomDialogTitle;
        this.permissionLl = permissionLl;
    }

    @NonNull
    public static HomepageRomDialogBinding bind(@NonNull View rootView) {
        View viewFindChildViewById;
        int i = R.id.homepage_rom_dialog_cl;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
        if (constraintLayout != null) {
            i = R.id.homepage_rom_dialog_detail;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView != null) {
                i = R.id.homepage_rom_dialog_go;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView2 != null) {
                    i = R.id.homepage_rom_dialog_nsl;
                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, i);
                    if (nestedScrollView != null) {
                        i = R.id.homepage_rom_dialog_skip;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.homepage_rom_dialog_split))) != null) {
                            i = R.id.homepage_rom_dialog_title;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                            if (textView4 != null) {
                                LinearLayout linearLayout = (LinearLayout) rootView;
                                return new HomepageRomDialogBinding(linearLayout, constraintLayout, textView, textView2, nestedScrollView, textView3, viewFindChildViewById, textView4, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HomepageRomDialogBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageRomDialogBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_rom_dialog, parent, false);
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
