package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class PlayCardEditBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ImageView editIcon;

    @NonNull
    public final TextView editName;

    private PlayCardEditBinding(@NonNull LinearLayout rootView, @NonNull ImageView editIcon, @NonNull TextView editName) {
        this.a = rootView;
        this.editIcon = editIcon;
        this.editName = editName;
    }

    @NonNull
    public static PlayCardEditBinding bind(@NonNull View rootView) {
        int i = R.id.edit_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.edit_icon);
        if (imageView != null) {
            i = R.id.edit_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.edit_name);
            if (textView != null) {
                return new PlayCardEditBinding((LinearLayout) rootView, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PlayCardEditBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PlayCardEditBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.play_card_edit, parent, false);
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
