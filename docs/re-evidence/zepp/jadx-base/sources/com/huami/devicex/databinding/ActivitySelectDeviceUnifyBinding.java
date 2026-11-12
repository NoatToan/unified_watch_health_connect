package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivitySelectDeviceUnifyBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final ListView deviceList;

    @NonNull
    public final CardView layoutBindNotRightNow;

    @NonNull
    public final TextView skipTv;

    @NonNull
    public final TextView tvBindNotRightNow;

    private ActivitySelectDeviceUnifyBinding(@NonNull RelativeLayout relativeLayout, @NonNull ListView listView, @NonNull CardView cardView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.a = relativeLayout;
        this.deviceList = listView;
        this.layoutBindNotRightNow = cardView;
        this.skipTv = textView;
        this.tvBindNotRightNow = textView2;
    }

    @NonNull
    public static ActivitySelectDeviceUnifyBinding bind(@NonNull View view) {
        int i = R.id.device_list;
        ListView listView = (ListView) ViewBindings.findChildViewById(view, i);
        if (listView != null) {
            i = R.id.layout_bind_not_right_now;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.skip_tv;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tv_bind_not_right_now;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        return new ActivitySelectDeviceUnifyBinding((RelativeLayout) view, listView, cardView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySelectDeviceUnifyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySelectDeviceUnifyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_select_device_unify, viewGroup, false);
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
