package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.xiaomi.hm.health.device.view.PassWordLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityOffWistLockPasswordBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final LinearLayout inputLayoutCinco;

    @NonNull
    public final RecyclerView inputLayoutGt;

    @NonNull
    public final PassWordLayout password;

    @NonNull
    public final ImageView passwordBackspaceBtn;

    @NonNull
    public final TextView passwordKey1;

    @NonNull
    public final TextView passwordKey2;

    @NonNull
    public final TextView passwordKey3;

    @NonNull
    public final TextView passwordKey4;

    @NonNull
    public final ImageView passwordNotMatchIcon;

    @NonNull
    public final TextView statusTitle;

    @NonNull
    public final RainbowTitleBar titleBar;

    @NonNull
    public final LinearLayout titleContainer;

    @NonNull
    public final ImageView toggleClearImg;

    private ActivityOffWistLockPasswordBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull PassWordLayout passWordLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull ImageView imageView2, @NonNull TextView textView5, @NonNull RainbowTitleBar rainbowTitleBar, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView3) {
        this.a = relativeLayout;
        this.inputLayoutCinco = linearLayout;
        this.inputLayoutGt = recyclerView;
        this.password = passWordLayout;
        this.passwordBackspaceBtn = imageView;
        this.passwordKey1 = textView;
        this.passwordKey2 = textView2;
        this.passwordKey3 = textView3;
        this.passwordKey4 = textView4;
        this.passwordNotMatchIcon = imageView2;
        this.statusTitle = textView5;
        this.titleBar = rainbowTitleBar;
        this.titleContainer = linearLayout2;
        this.toggleClearImg = imageView3;
    }

    @NonNull
    public static ActivityOffWistLockPasswordBinding bind(@NonNull View view) {
        int i = R.id.input_layout_cinco;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.input_layout_gt;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = R.id.password;
                PassWordLayout passWordLayout = (PassWordLayout) ViewBindings.findChildViewById(view, i);
                if (passWordLayout != null) {
                    i = R.id.password_backspace_btn;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.password_key_1;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = R.id.password_key_2;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = R.id.password_key_3;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = R.id.password_key_4;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView4 != null) {
                                        i = R.id.password_not_match_icon;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView2 != null) {
                                            i = R.id.status_title;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView5 != null) {
                                                i = R.id.titleBar;
                                                RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                                                if (rainbowTitleBar != null) {
                                                    i = R.id.title_container;
                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                    if (linearLayout2 != null) {
                                                        i = R.id.toggle_clear_img;
                                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                        if (imageView3 != null) {
                                                            return new ActivityOffWistLockPasswordBinding((RelativeLayout) view, linearLayout, recyclerView, passWordLayout, imageView, textView, textView2, textView3, textView4, imageView2, textView5, rainbowTitleBar, linearLayout2, imageView3);
                                                        }
                                                    }
                                                }
                                            }
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
    public static ActivityOffWistLockPasswordBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOffWistLockPasswordBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_off_wist_lock_password, viewGroup, false);
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
