package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.R;

/* JADX INFO: loaded from: classes11.dex */
public final class DialogSharePreNewBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final TextView cancelTv;

    @NonNull
    public final View lineBottom;

    @NonNull
    public final View lineTop;

    @NonNull
    public final LinearLayout llShareOption;

    @NonNull
    public final TextView runShareExport;

    @NonNull
    public final TextView runShareLongCam;

    @NonNull
    public final TextView runShareLongImg;

    @NonNull
    public final TextView runShareVideo;

    @NonNull
    public final TextView title;

    private DialogSharePreNewBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull View view, @NonNull View view2, @NonNull LinearLayout linearLayout, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.a = frameLayout;
        this.cancelTv = textView;
        this.lineBottom = view;
        this.lineTop = view2;
        this.llShareOption = linearLayout;
        this.runShareExport = textView2;
        this.runShareLongCam = textView3;
        this.runShareLongImg = textView4;
        this.runShareVideo = textView5;
        this.title = textView6;
    }

    @NonNull
    public static DialogSharePreNewBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.cancel_tv;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line_bottom))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.line_top))) != null) {
            i = R.id.ll_share_option;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.run_share_export;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.run_share_long_cam;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = R.id.run_share_long_img;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            i = R.id.run_share_video;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView5 != null) {
                                i = R.id.title;
                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView6 != null) {
                                    return new DialogSharePreNewBinding((FrameLayout) view, textView, viewFindChildViewById, viewFindChildViewById2, linearLayout, textView2, textView3, textView4, textView5, textView6);
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
    public static DialogSharePreNewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogSharePreNewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_share_pre_new, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
