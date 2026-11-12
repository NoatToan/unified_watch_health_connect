package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentSmartAssistantSettingBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final RainbowTitleBar actionbar;

    @NonNull
    public final ListTile itemCardSetting;

    @NonNull
    public final ListTile itemShowAttention;

    @NonNull
    public final Guideline lienEnd;

    @NonNull
    public final Guideline lienStart;

    private FragmentSmartAssistantSettingBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RainbowTitleBar rainbowTitleBar, @NonNull ListTile listTile, @NonNull ListTile listTile2, @NonNull Guideline guideline, @NonNull Guideline guideline2) {
        this.a = constraintLayout;
        this.actionbar = rainbowTitleBar;
        this.itemCardSetting = listTile;
        this.itemShowAttention = listTile2;
        this.lienEnd = guideline;
        this.lienStart = guideline2;
    }

    @NonNull
    public static FragmentSmartAssistantSettingBinding bind(@NonNull View view) {
        int i = R.id.actionbar;
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
        if (rainbowTitleBar != null) {
            i = R.id.item_card_setting;
            ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
            if (listTile != null) {
                i = R.id.item_show_attention;
                ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                if (listTile2 != null) {
                    i = R.id.lien_end;
                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                    if (guideline != null) {
                        i = R.id.lien_start;
                        Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                        if (guideline2 != null) {
                            return new FragmentSmartAssistantSettingBinding((ConstraintLayout) view, rainbowTitleBar, listTile, listTile2, guideline, guideline2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentSmartAssistantSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSmartAssistantSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_smart_assistant_setting, viewGroup, false);
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
