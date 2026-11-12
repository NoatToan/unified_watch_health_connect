package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes7.dex */
public final class DialogRepeatDayBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final RecyclerView recyclerView;

    @NonNull
    public final TypefaceTextView titleTv;

    @NonNull
    public final TextView tvCancel;

    @NonNull
    public final TextView tvConfirm;

    private DialogRepeatDayBinding(@NonNull FrameLayout frameLayout, @NonNull RecyclerView recyclerView, @NonNull TypefaceTextView typefaceTextView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.a = frameLayout;
        this.recyclerView = recyclerView;
        this.titleTv = typefaceTextView;
        this.tvCancel = textView;
        this.tvConfirm = textView2;
    }

    @NonNull
    public static DialogRepeatDayBinding bind(@NonNull View view) {
        int i = R.id.recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = R.id.title_tv;
            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
            if (typefaceTextView != null) {
                i = R.id.tv_cancel;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tv_confirm;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        return new DialogRepeatDayBinding((FrameLayout) view, recyclerView, typefaceTextView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static DialogRepeatDayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogRepeatDayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_repeat_day, viewGroup, false);
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
