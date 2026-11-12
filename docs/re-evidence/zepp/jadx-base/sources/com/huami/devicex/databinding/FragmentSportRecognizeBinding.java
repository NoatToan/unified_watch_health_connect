package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentSportRecognizeBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ListTile alertLt;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final AppCompatImageView questionImg;

    @NonNull
    public final ListTile sensitiveLt;

    @NonNull
    public final ConstraintLayout typeContainer;

    @NonNull
    public final TextView typeTv;

    private FragmentSportRecognizeBinding(@NonNull LinearLayout linearLayout, @NonNull ListTile listTile, @NonNull FrameLayout frameLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull ListTile listTile2, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView) {
        this.a = linearLayout;
        this.alertLt = listTile;
        this.container = frameLayout;
        this.questionImg = appCompatImageView;
        this.sensitiveLt = listTile2;
        this.typeContainer = constraintLayout;
        this.typeTv = textView;
    }

    @NonNull
    public static FragmentSportRecognizeBinding bind(@NonNull View view) {
        int i = R.id.alert_lt;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
        if (listTile != null) {
            i = R.id.container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.question_img;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = R.id.sensitive_lt;
                    ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                    if (listTile2 != null) {
                        i = R.id.type_container;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = R.id.type_tv;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                return new FragmentSportRecognizeBinding((LinearLayout) view, listTile, frameLayout, appCompatImageView, listTile2, constraintLayout, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentSportRecognizeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSportRecognizeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_sport_recognize, viewGroup, false);
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
