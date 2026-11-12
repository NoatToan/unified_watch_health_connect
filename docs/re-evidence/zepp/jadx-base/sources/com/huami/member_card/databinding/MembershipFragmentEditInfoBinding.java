package com.huami.member_card.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.member_card.R;

/* JADX INFO: loaded from: classes11.dex */
public final class MembershipFragmentEditInfoBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final CardView cardViewInfoEdit;

    @NonNull
    public final AppCompatEditText editName;

    @NonNull
    public final AppCompatEditText editNumber;

    @NonNull
    public final RainbowTitleBar rainbowTitleBar;

    @NonNull
    public final RecyclerView recyclerViewColor;

    private MembershipFragmentEditInfoBinding(@NonNull ConstraintLayout constraintLayout, @NonNull CardView cardView, @NonNull AppCompatEditText appCompatEditText, @NonNull AppCompatEditText appCompatEditText2, @NonNull RainbowTitleBar rainbowTitleBar, @NonNull RecyclerView recyclerView) {
        this.a = constraintLayout;
        this.cardViewInfoEdit = cardView;
        this.editName = appCompatEditText;
        this.editNumber = appCompatEditText2;
        this.rainbowTitleBar = rainbowTitleBar;
        this.recyclerViewColor = recyclerView;
    }

    @NonNull
    public static MembershipFragmentEditInfoBinding bind(@NonNull View view) {
        int i = R.id.cardView_info_edit;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.edit_name;
            AppCompatEditText appCompatEditText = (AppCompatEditText) ViewBindings.findChildViewById(view, i);
            if (appCompatEditText != null) {
                i = R.id.edit_number;
                AppCompatEditText appCompatEditText2 = (AppCompatEditText) ViewBindings.findChildViewById(view, i);
                if (appCompatEditText2 != null) {
                    i = R.id.rainbow_title_bar;
                    RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                    if (rainbowTitleBar != null) {
                        i = R.id.recycler_view_color;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            return new MembershipFragmentEditInfoBinding((ConstraintLayout) view, cardView, appCompatEditText, appCompatEditText2, rainbowTitleBar, recyclerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static MembershipFragmentEditInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static MembershipFragmentEditInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.membership_fragment_edit_info, viewGroup, false);
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
