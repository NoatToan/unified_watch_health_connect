package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentChooseTypeOfScaleBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final Button btnNormalType;

    @NonNull
    public final Button btnSportType;

    @NonNull
    public final ImageButton ibBack;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    public final RelativeLayout titleView;

    private FragmentChooseTypeOfScaleBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2, @NonNull ImageButton imageButton, @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout relativeLayout) {
        this.a = linearLayout;
        this.btnNormalType = button;
        this.btnSportType = button2;
        this.ibBack = imageButton;
        this.rootView = linearLayout2;
        this.titleView = relativeLayout;
    }

    @NonNull
    public static FragmentChooseTypeOfScaleBinding bind(@NonNull View view) {
        int i = R.id.btn_normal_type;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R.id.btn_sport_type;
            Button button2 = (Button) ViewBindings.findChildViewById(view, i);
            if (button2 != null) {
                i = R.id.ib_back;
                ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
                if (imageButton != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i = R.id.title_view;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout != null) {
                        return new FragmentChooseTypeOfScaleBinding(linearLayout, button, button2, imageButton, linearLayout, relativeLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentChooseTypeOfScaleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentChooseTypeOfScaleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_choose_type_of_scale, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
