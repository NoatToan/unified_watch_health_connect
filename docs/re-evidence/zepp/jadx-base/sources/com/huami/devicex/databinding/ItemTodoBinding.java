package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ItemTodoBinding implements ViewBinding {

    @NonNull
    private final CardView a;

    @NonNull
    public final AppCompatCheckBox cb;

    @NonNull
    public final ImageView ivQuickDelete;

    @NonNull
    public final TextView tvContent;

    @NonNull
    public final TextView tvTime;

    private ItemTodoBinding(@NonNull CardView cardView, @NonNull AppCompatCheckBox appCompatCheckBox, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.a = cardView;
        this.cb = appCompatCheckBox;
        this.ivQuickDelete = imageView;
        this.tvContent = textView;
        this.tvTime = textView2;
    }

    @NonNull
    public static ItemTodoBinding bind(@NonNull View view) {
        int i = R.id.cb;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(view, i);
        if (appCompatCheckBox != null) {
            i = R.id.iv_quick_delete;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tv_content;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tv_time;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        return new ItemTodoBinding((CardView) view, appCompatCheckBox, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemTodoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemTodoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_todo, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.a;
    }
}
