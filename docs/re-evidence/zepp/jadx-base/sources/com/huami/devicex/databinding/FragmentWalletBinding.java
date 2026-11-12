package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.xiaomi.hm.health.nfc.NfcItemView;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentWalletBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final NfcItemView bankItem;

    @NonNull
    public final NfcItemView busItem;

    @NonNull
    public final com.huami.watch.companion.ui.view.NfcItemView carItem;

    @NonNull
    public final NfcItemView doorItem;

    @NonNull
    public final com.huami.watch.companion.ui.view.NfcItemView eidItem;

    @NonNull
    public final NfcItemView itemMasterCard;

    @NonNull
    public final com.huami.watch.companion.ui.view.NfcItemView jacCarItem;

    private FragmentWalletBinding(@NonNull LinearLayout linearLayout, @NonNull NfcItemView nfcItemView, @NonNull NfcItemView nfcItemView2, @NonNull com.huami.watch.companion.ui.view.NfcItemView nfcItemView3, @NonNull NfcItemView nfcItemView4, @NonNull com.huami.watch.companion.ui.view.NfcItemView nfcItemView5, @NonNull NfcItemView nfcItemView6, @NonNull com.huami.watch.companion.ui.view.NfcItemView nfcItemView7) {
        this.a = linearLayout;
        this.bankItem = nfcItemView;
        this.busItem = nfcItemView2;
        this.carItem = nfcItemView3;
        this.doorItem = nfcItemView4;
        this.eidItem = nfcItemView5;
        this.itemMasterCard = nfcItemView6;
        this.jacCarItem = nfcItemView7;
    }

    @NonNull
    public static FragmentWalletBinding bind(@NonNull View view) {
        int i = R.id.bankItem;
        NfcItemView nfcItemView = (NfcItemView) ViewBindings.findChildViewById(view, i);
        if (nfcItemView != null) {
            i = R.id.busItem;
            NfcItemView nfcItemView2 = (NfcItemView) ViewBindings.findChildViewById(view, i);
            if (nfcItemView2 != null) {
                i = R.id.carItem;
                com.huami.watch.companion.ui.view.NfcItemView nfcItemView3 = (com.huami.watch.companion.ui.view.NfcItemView) ViewBindings.findChildViewById(view, i);
                if (nfcItemView3 != null) {
                    i = R.id.doorItem;
                    NfcItemView nfcItemView4 = (NfcItemView) ViewBindings.findChildViewById(view, i);
                    if (nfcItemView4 != null) {
                        i = R.id.eidItem;
                        com.huami.watch.companion.ui.view.NfcItemView nfcItemView5 = (com.huami.watch.companion.ui.view.NfcItemView) ViewBindings.findChildViewById(view, i);
                        if (nfcItemView5 != null) {
                            i = R.id.item_master_card;
                            NfcItemView nfcItemView6 = (NfcItemView) ViewBindings.findChildViewById(view, i);
                            if (nfcItemView6 != null) {
                                i = R.id.jacCarItem;
                                com.huami.watch.companion.ui.view.NfcItemView nfcItemView7 = (com.huami.watch.companion.ui.view.NfcItemView) ViewBindings.findChildViewById(view, i);
                                if (nfcItemView7 != null) {
                                    return new FragmentWalletBinding((LinearLayout) view, nfcItemView, nfcItemView2, nfcItemView3, nfcItemView4, nfcItemView5, nfcItemView6, nfcItemView7);
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
    public static FragmentWalletBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentWalletBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_wallet, viewGroup, false);
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
