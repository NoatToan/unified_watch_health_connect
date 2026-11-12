package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentTodoEditBinding implements ViewBinding {

    @NonNull
    private final LinearLayoutCompat a;

    @NonNull
    public final ListTile dateTile;

    @NonNull
    public final TextView deleteBtn;

    @NonNull
    public final AppCompatEditText etContent;

    @NonNull
    public final ListTile repeatTile;

    @NonNull
    public final RainbowTitleBar titleBar;

    @NonNull
    public final AppCompatTextView tvLimit;

    private FragmentTodoEditBinding(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ListTile listTile, @NonNull TextView textView, @NonNull AppCompatEditText appCompatEditText, @NonNull ListTile listTile2, @NonNull RainbowTitleBar rainbowTitleBar, @NonNull AppCompatTextView appCompatTextView) {
        this.a = linearLayoutCompat;
        this.dateTile = listTile;
        this.deleteBtn = textView;
        this.etContent = appCompatEditText;
        this.repeatTile = listTile2;
        this.titleBar = rainbowTitleBar;
        this.tvLimit = appCompatTextView;
    }

    @NonNull
    public static FragmentTodoEditBinding bind(@NonNull View view) {
        int i = R.id.date_tile;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
        if (listTile != null) {
            i = R.id.delete_btn;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.et_content;
                AppCompatEditText appCompatEditText = (AppCompatEditText) ViewBindings.findChildViewById(view, i);
                if (appCompatEditText != null) {
                    i = R.id.repeat_tile;
                    ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                    if (listTile2 != null) {
                        i = R.id.title_bar;
                        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                        if (rainbowTitleBar != null) {
                            i = R.id.tv_limit;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView != null) {
                                return new FragmentTodoEditBinding((LinearLayoutCompat) view, listTile, textView, appCompatEditText, listTile2, rainbowTitleBar, appCompatTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentTodoEditBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentTodoEditBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_todo_edit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.a;
    }
}
