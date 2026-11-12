package com.huami.third.xiaomi.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.third.xiaomi.ui.R;

/* JADX INFO: loaded from: classes14.dex */
public final class FragmentBindXiaomiBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final ImageView ivBind;

    @NonNull
    public final ImageView ivBindPointLeft;

    @NonNull
    public final ImageView ivBindPointRight;

    @NonNull
    public final ImageView ivWatch;

    @NonNull
    public final RelativeLayout layoutAuthor;

    @NonNull
    public final TextView tvAuthor;

    private FragmentBindXiaomiBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView) {
        this.a = relativeLayout;
        this.ivBind = imageView;
        this.ivBindPointLeft = imageView2;
        this.ivBindPointRight = imageView3;
        this.ivWatch = imageView4;
        this.layoutAuthor = relativeLayout2;
        this.tvAuthor = textView;
    }

    @NonNull
    public static FragmentBindXiaomiBinding bind(@NonNull View view) {
        int i = R.id.iv_bind;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = R.id.iv_bind_point_left;
            ImageView imageView2 = (ImageView) view.findViewById(i);
            if (imageView2 != null) {
                i = R.id.iv_bind_point_right;
                ImageView imageView3 = (ImageView) view.findViewById(i);
                if (imageView3 != null) {
                    i = R.id.iv_watch;
                    ImageView imageView4 = (ImageView) view.findViewById(i);
                    if (imageView4 != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) view;
                        i = R.id.tv_author;
                        TextView textView = (TextView) view.findViewById(i);
                        if (textView != null) {
                            return new FragmentBindXiaomiBinding(relativeLayout, imageView, imageView2, imageView3, imageView4, relativeLayout, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentBindXiaomiBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentBindXiaomiBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_bind_xiaomi, viewGroup, false);
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
