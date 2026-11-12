package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.zhouyou.recyclerview.swipemenu.SwipeMenuLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class WeatherItemCityListBinding implements ViewBinding {

    @NonNull
    private final SwipeMenuLayout a;

    @NonNull
    public final TextView cityTitleTv;

    @NonNull
    public final CheckBox defaultCityCb;

    @NonNull
    public final LinearLayout smContentView;

    @NonNull
    public final TextView smMenuView;

    private WeatherItemCityListBinding(@NonNull SwipeMenuLayout swipeMenuLayout, @NonNull TextView textView, @NonNull CheckBox checkBox, @NonNull LinearLayout linearLayout, @NonNull TextView textView2) {
        this.a = swipeMenuLayout;
        this.cityTitleTv = textView;
        this.defaultCityCb = checkBox;
        this.smContentView = linearLayout;
        this.smMenuView = textView2;
    }

    @NonNull
    public static WeatherItemCityListBinding bind(@NonNull View view) {
        int i = R.id.city_title_tv;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.default_city_cb;
            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i);
            if (checkBox != null) {
                i = R.id.smContentView;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.smMenuView;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        return new WeatherItemCityListBinding((SwipeMenuLayout) view, textView, checkBox, linearLayout, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static WeatherItemCityListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static WeatherItemCityListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.weather_item_city_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public SwipeMenuLayout getRoot() {
        return this.a;
    }
}
