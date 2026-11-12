package com.huami.watchfacesstore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watchfacesstore.R;

/* JADX INFO: loaded from: classes17.dex */
public final class WfDialogTipsBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final LinearLayout dialogBottomArea;

    @NonNull
    public final TextView dialogCancel;

    @NonNull
    public final TextView dialogConfirm;

    @NonNull
    public final TextView dialogEnsure;

    @NonNull
    public final TextView dialogMsg;

    private WfDialogTipsBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout dialogBottomArea, @NonNull TextView dialogCancel, @NonNull TextView dialogConfirm, @NonNull TextView dialogEnsure, @NonNull TextView dialogMsg) {
        this.a = rootView;
        this.dialogBottomArea = dialogBottomArea;
        this.dialogCancel = dialogCancel;
        this.dialogConfirm = dialogConfirm;
        this.dialogEnsure = dialogEnsure;
        this.dialogMsg = dialogMsg;
    }

    @NonNull
    public static WfDialogTipsBinding bind(@NonNull View rootView) {
        int i = R.id.dialog_bottom_area;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = R.id.dialog_cancel;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView != null) {
                i = R.id.dialog_confirm;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView2 != null) {
                    i = R.id.dialog_ensure;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView3 != null) {
                        i = R.id.dialog_msg;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView4 != null) {
                            return new WfDialogTipsBinding((LinearLayout) rootView, linearLayout, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static WfDialogTipsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WfDialogTipsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.wf_dialog_tips, parent, false);
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
