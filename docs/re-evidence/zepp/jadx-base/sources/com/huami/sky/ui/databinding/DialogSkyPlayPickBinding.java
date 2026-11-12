package com.huami.sky.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sky.ui.R;
import com.huami.widget.wheelview.WheelView;

/* JADX INFO: loaded from: classes13.dex */
public final class DialogSkyPlayPickBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final LinearLayout bottom;

    @NonNull
    public final TextView cancelButton;

    @NonNull
    public final TextView doneButton;

    @NonNull
    public final TextView title;

    @NonNull
    public final WheelView wheelView;

    private DialogSkyPlayPickBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull WheelView wheelView) {
        this.a = constraintLayout;
        this.bottom = linearLayout;
        this.cancelButton = textView;
        this.doneButton = textView2;
        this.title = textView3;
        this.wheelView = wheelView;
    }

    @NonNull
    public static DialogSkyPlayPickBinding bind(@NonNull View view) {
        int i = R.id.bottom;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.cancel_button;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.done_button;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.title;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = R.id.wheelView;
                        WheelView wheelView = (WheelView) ViewBindings.findChildViewById(view, i);
                        if (wheelView != null) {
                            return new DialogSkyPlayPickBinding((ConstraintLayout) view, linearLayout, textView, textView2, textView3, wheelView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static DialogSkyPlayPickBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogSkyPlayPickBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_sky_play_pick, viewGroup, false);
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
