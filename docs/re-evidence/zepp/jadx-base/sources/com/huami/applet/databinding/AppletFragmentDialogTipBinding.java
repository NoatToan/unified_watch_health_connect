package com.huami.applet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.applet.R;

/* JADX INFO: loaded from: classes5.dex */
public final class AppletFragmentDialogTipBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView tvConfirm;

    @NonNull
    public final TextView tvTip;

    @NonNull
    public final View viewBottom;

    @NonNull
    public final View viewTop;

    private AppletFragmentDialogTipBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull View view, @NonNull View view2) {
        this.a = constraintLayout;
        this.tvConfirm = textView;
        this.tvTip = textView2;
        this.viewBottom = view;
        this.viewTop = view2;
    }

    @NonNull
    public static AppletFragmentDialogTipBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.tv_confirm;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.tv_tip;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.view_bottom))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.view_top))) != null) {
                return new AppletFragmentDialogTipBinding((ConstraintLayout) view, textView, textView2, viewFindChildViewById, viewFindChildViewById2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static AppletFragmentDialogTipBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static AppletFragmentDialogTipBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.applet_fragment_dialog_tip, viewGroup, false);
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
