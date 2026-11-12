package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class PlayCardNfcLayoutBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final PlayCardCommonTitleBinding llTitle;

    @NonNull
    public final AppCompatTextView nfcBus;

    @NonNull
    public final AppCompatTextView nfcDoor;

    @NonNull
    public final TextView tvDesc;

    private PlayCardNfcLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull PlayCardCommonTitleBinding llTitle, @NonNull AppCompatTextView nfcBus, @NonNull AppCompatTextView nfcDoor, @NonNull TextView tvDesc) {
        this.a = rootView;
        this.llTitle = llTitle;
        this.nfcBus = nfcBus;
        this.nfcDoor = nfcDoor;
        this.tvDesc = tvDesc;
    }

    @NonNull
    public static PlayCardNfcLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.ll_title;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.ll_title);
        if (viewFindChildViewById != null) {
            PlayCardCommonTitleBinding playCardCommonTitleBindingBind = PlayCardCommonTitleBinding.bind(viewFindChildViewById);
            i = R.id.nfc_bus;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.nfc_bus);
            if (appCompatTextView != null) {
                i = R.id.nfc_door;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.nfc_door);
                if (appCompatTextView2 != null) {
                    i = R.id.tv_desc;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_desc);
                    if (textView != null) {
                        return new PlayCardNfcLayoutBinding((ConstraintLayout) rootView, playCardCommonTitleBindingBind, appCompatTextView, appCompatTextView2, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PlayCardNfcLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PlayCardNfcLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.play_card_nfc_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
