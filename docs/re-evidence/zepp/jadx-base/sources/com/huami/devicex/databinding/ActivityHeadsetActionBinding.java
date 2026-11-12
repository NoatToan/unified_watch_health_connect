package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.lib.view.scroll.HMScrollView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityHeadsetActionBinding implements ViewBinding {

    @NonNull
    private final HMScrollView a;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final Button headsetActionDefaultBt;

    @NonNull
    public final ListTile headsetActionItemLeftDoubleTouch;

    @NonNull
    public final ListTile headsetActionItemLeftSingleTouch;

    @NonNull
    public final ListTile headsetActionItemLeftTripleTouch;

    @NonNull
    public final ListTile headsetActionItemRightDoubleTouch;

    @NonNull
    public final ListTile headsetActionItemRightSingleTouch;

    @NonNull
    public final ListTile headsetActionItemRightTripleTouch;

    @NonNull
    public final RainbowTitleBar rainbowTitleBar;

    private ActivityHeadsetActionBinding(@NonNull HMScrollView hMScrollView, @NonNull FrameLayout frameLayout, @NonNull Button button, @NonNull ListTile listTile, @NonNull ListTile listTile2, @NonNull ListTile listTile3, @NonNull ListTile listTile4, @NonNull ListTile listTile5, @NonNull ListTile listTile6, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = hMScrollView;
        this.container = frameLayout;
        this.headsetActionDefaultBt = button;
        this.headsetActionItemLeftDoubleTouch = listTile;
        this.headsetActionItemLeftSingleTouch = listTile2;
        this.headsetActionItemLeftTripleTouch = listTile3;
        this.headsetActionItemRightDoubleTouch = listTile4;
        this.headsetActionItemRightSingleTouch = listTile5;
        this.headsetActionItemRightTripleTouch = listTile6;
        this.rainbowTitleBar = rainbowTitleBar;
    }

    @NonNull
    public static ActivityHeadsetActionBinding bind(@NonNull View view) {
        int i = R.id.container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.headset_action_default_bt;
            Button button = (Button) ViewBindings.findChildViewById(view, i);
            if (button != null) {
                i = R.id.headset_action_item_left_double_touch;
                ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
                if (listTile != null) {
                    i = R.id.headset_action_item_left_single_touch;
                    ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                    if (listTile2 != null) {
                        i = R.id.headset_action_item_left_triple_touch;
                        ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(view, i);
                        if (listTile3 != null) {
                            i = R.id.headset_action_item_right_double_touch;
                            ListTile listTile4 = (ListTile) ViewBindings.findChildViewById(view, i);
                            if (listTile4 != null) {
                                i = R.id.headset_action_item_right_single_touch;
                                ListTile listTile5 = (ListTile) ViewBindings.findChildViewById(view, i);
                                if (listTile5 != null) {
                                    i = R.id.headset_action_item_right_triple_touch;
                                    ListTile listTile6 = (ListTile) ViewBindings.findChildViewById(view, i);
                                    if (listTile6 != null) {
                                        i = R.id.rainbowTitleBar;
                                        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                                        if (rainbowTitleBar != null) {
                                            return new ActivityHeadsetActionBinding((HMScrollView) view, frameLayout, button, listTile, listTile2, listTile3, listTile4, listTile5, listTile6, rainbowTitleBar);
                                        }
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
    public static ActivityHeadsetActionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityHeadsetActionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_headset_action, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public HMScrollView getRoot() {
        return this.a;
    }
}
