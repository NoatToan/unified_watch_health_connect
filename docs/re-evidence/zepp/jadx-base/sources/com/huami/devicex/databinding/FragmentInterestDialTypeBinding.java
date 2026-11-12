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
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentInterestDialTypeBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final AppCompatImageView btnBack;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final ListTile followDialIv;

    @NonNull
    public final CardView functionContainer;

    @NonNull
    public final View maskView;

    @NonNull
    public final RecyclerView screenOffDialTypeRv;

    @NonNull
    public final CardView styleContainer;

    @NonNull
    public final Toolbar toolbar;

    @NonNull
    public final TextView typeSelectTv;

    private FragmentInterestDialTypeBinding(@NonNull LinearLayout linearLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull FrameLayout frameLayout, @NonNull ListTile listTile, @NonNull CardView cardView, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull CardView cardView2, @NonNull Toolbar toolbar, @NonNull TextView textView) {
        this.a = linearLayout;
        this.btnBack = appCompatImageView;
        this.container = frameLayout;
        this.followDialIv = listTile;
        this.functionContainer = cardView;
        this.maskView = view;
        this.screenOffDialTypeRv = recyclerView;
        this.styleContainer = cardView2;
        this.toolbar = toolbar;
        this.typeSelectTv = textView;
    }

    @NonNull
    public static FragmentInterestDialTypeBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.btn_back;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.follow_dial_iv;
                ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
                if (listTile != null) {
                    i = R.id.function_container;
                    CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                    if (cardView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.mask_view))) != null) {
                        i = R.id.screen_off_dial_type_rv;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            i = R.id.style_container;
                            CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
                            if (cardView2 != null) {
                                i = R.id.toolbar;
                                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, i);
                                if (toolbar != null) {
                                    i = R.id.type_select_tv;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        return new FragmentInterestDialTypeBinding((LinearLayout) view, appCompatImageView, frameLayout, listTile, cardView, viewFindChildViewById, recyclerView, cardView2, toolbar, textView);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentInterestDialTypeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentInterestDialTypeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_interest_dial_type, viewGroup, false);
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
