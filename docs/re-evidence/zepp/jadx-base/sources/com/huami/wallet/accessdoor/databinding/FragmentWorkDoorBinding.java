package com.huami.wallet.accessdoor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.wallet.accessdoor.R;

/* JADX INFO: loaded from: classes15.dex */
public final class FragmentWorkDoorBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final Button btnOpen;

    @NonNull
    public final ImageView imageError;

    @NonNull
    public final TextView message;

    private FragmentWorkDoorBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.a = constraintLayout;
        this.btnOpen = button;
        this.imageError = imageView;
        this.message = textView;
    }

    @NonNull
    public static FragmentWorkDoorBinding bind(@NonNull View view) {
        int i = R.id.btn_open;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R.id.image_error;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.message;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new FragmentWorkDoorBinding((ConstraintLayout) view, button, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentWorkDoorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentWorkDoorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_work_door, viewGroup, false);
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
