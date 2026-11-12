package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.ListTile;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityAddGuestBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final LinearLayout bottomLayout;

    @NonNull
    public final LinearLayout constraintLayout;

    @NonNull
    public final View divider;

    @NonNull
    public final ImageButton ibBack;

    @NonNull
    public final ListTile ivBirth;

    @NonNull
    public final ListTile ivGender;

    @NonNull
    public final ListTile ivHeight;

    @NonNull
    public final ListTile ivMode;

    @NonNull
    public final TextView label;

    @NonNull
    public final TextView textTitle;

    @NonNull
    public final RelativeLayout titleView;

    @NonNull
    public final TextView txBodyFat;

    private ActivityAddGuestBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull View view, @NonNull ImageButton imageButton, @NonNull ListTile listTile, @NonNull ListTile listTile2, @NonNull ListTile listTile3, @NonNull ListTile listTile4, @NonNull TextView textView, @NonNull TextView textView2, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView3) {
        this.a = linearLayout;
        this.bottomLayout = linearLayout2;
        this.constraintLayout = linearLayout3;
        this.divider = view;
        this.ibBack = imageButton;
        this.ivBirth = listTile;
        this.ivGender = listTile2;
        this.ivHeight = listTile3;
        this.ivMode = listTile4;
        this.label = textView;
        this.textTitle = textView2;
        this.titleView = relativeLayout;
        this.txBodyFat = textView3;
    }

    @NonNull
    public static ActivityAddGuestBinding bind(@NonNull View view) {
        int i = R.id.bottom_layout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            LinearLayout linearLayout2 = (LinearLayout) view;
            i = R.id.divider;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
            if (viewFindChildViewById != null) {
                i = R.id.ib_back;
                ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
                if (imageButton != null) {
                    i = R.id.iv_birth;
                    ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
                    if (listTile != null) {
                        i = R.id.iv_gender;
                        ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                        if (listTile2 != null) {
                            i = R.id.iv_height;
                            ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(view, i);
                            if (listTile3 != null) {
                                i = R.id.iv_mode;
                                ListTile listTile4 = (ListTile) ViewBindings.findChildViewById(view, i);
                                if (listTile4 != null) {
                                    i = R.id.label;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        i = R.id.text_title;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView2 != null) {
                                            i = R.id.title_view;
                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                            if (relativeLayout != null) {
                                                i = R.id.tx_body_fat;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView3 != null) {
                                                    return new ActivityAddGuestBinding(linearLayout2, linearLayout, linearLayout2, viewFindChildViewById, imageButton, listTile, listTile2, listTile3, listTile4, textView, textView2, relativeLayout, textView3);
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
    public static ActivityAddGuestBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityAddGuestBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_add_guest, viewGroup, false);
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
