package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentUserslistBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final LinearLayout content;

    @NonNull
    public final LinearLayout dlgEmptyAreaBtn;

    @NonNull
    public final ImageView giveupIv;

    @NonNull
    public final RelativeLayout mainContent;

    @NonNull
    public final HorizontalScrollView scrollview;

    @NonNull
    public final TextView titleTv;

    @NonNull
    public final GridView usersList;

    private FragmentUserslistBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout2, @NonNull HorizontalScrollView horizontalScrollView, @NonNull TextView textView, @NonNull GridView gridView) {
        this.a = relativeLayout;
        this.content = linearLayout;
        this.dlgEmptyAreaBtn = linearLayout2;
        this.giveupIv = imageView;
        this.mainContent = relativeLayout2;
        this.scrollview = horizontalScrollView;
        this.titleTv = textView;
        this.usersList = gridView;
    }

    @NonNull
    public static FragmentUserslistBinding bind(@NonNull View view) {
        int i = R.id.content;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.dlg_empty_area_btn;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = R.id.giveup_iv;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i = R.id.scrollview;
                    HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view, i);
                    if (horizontalScrollView != null) {
                        i = R.id.title_tv;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = R.id.users_list;
                            GridView gridView = (GridView) ViewBindings.findChildViewById(view, i);
                            if (gridView != null) {
                                return new FragmentUserslistBinding(relativeLayout, linearLayout, linearLayout2, imageView, relativeLayout, horizontalScrollView, textView, gridView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentUserslistBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentUserslistBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_userslist, viewGroup, false);
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
