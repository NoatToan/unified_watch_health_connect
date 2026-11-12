package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityIndividuationBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final Button btnDelete;

    @NonNull
    public final FrameLayout layoutBottom;

    @NonNull
    public final RecyclerView rvContacts;

    @NonNull
    public final RainbowTitleBar titleBar;

    @NonNull
    public final TextView tvAddContact;

    @NonNull
    public final TextView tvUsage;

    private ActivityIndividuationBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull FrameLayout frameLayout, @NonNull RecyclerView recyclerView, @NonNull RainbowTitleBar rainbowTitleBar, @NonNull TextView textView, @NonNull TextView textView2) {
        this.a = relativeLayout;
        this.btnDelete = button;
        this.layoutBottom = frameLayout;
        this.rvContacts = recyclerView;
        this.titleBar = rainbowTitleBar;
        this.tvAddContact = textView;
        this.tvUsage = textView2;
    }

    @NonNull
    public static ActivityIndividuationBinding bind(@NonNull View view) {
        int i = R.id.btn_delete;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R.id.layout_bottom;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.rv_contacts;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = R.id.title_bar;
                    RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                    if (rainbowTitleBar != null) {
                        i = R.id.tv_add_contact;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = R.id.tv_usage;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                return new ActivityIndividuationBinding((RelativeLayout) view, button, frameLayout, recyclerView, rainbowTitleBar, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityIndividuationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityIndividuationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_individuation, viewGroup, false);
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
