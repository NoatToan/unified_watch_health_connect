package com.huami.moving.sport.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.sport.ui.R;

/* JADX INFO: loaded from: classes11.dex */
public final class MovingUiIncludeTitleBarBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final LinearLayout llTitle;

    @NonNull
    public final TextView locationAndSportType;

    @NonNull
    public final RelativeLayout rlBack;

    @NonNull
    public final RelativeLayout rlShare;

    @NonNull
    public final RelativeLayout rlTitleBar;

    private MovingUiIncludeTitleBarBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4) {
        this.a = relativeLayout;
        this.llTitle = linearLayout;
        this.locationAndSportType = textView;
        this.rlBack = relativeLayout2;
        this.rlShare = relativeLayout3;
        this.rlTitleBar = relativeLayout4;
    }

    @NonNull
    public static MovingUiIncludeTitleBarBinding bind(@NonNull View view) {
        int i = R.id.ll_title;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.location_and_sport_type;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.rl_back;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout != null) {
                    i = R.id.rl_share;
                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout2 != null) {
                        RelativeLayout relativeLayout3 = (RelativeLayout) view;
                        return new MovingUiIncludeTitleBarBinding(relativeLayout3, linearLayout, textView, relativeLayout, relativeLayout2, relativeLayout3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static MovingUiIncludeTitleBarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static MovingUiIncludeTitleBarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moving_ui_include_title_bar, viewGroup, false);
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
