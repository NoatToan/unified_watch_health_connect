package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivitySelectCityBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ListTile autoLocate;

    @NonNull
    public final AppCompatImageView backImg;

    @NonNull
    public final EditText cityEdit;

    @NonNull
    public final AppCompatImageView closeImg;

    @NonNull
    public final TextView currentSelectedTv;

    @NonNull
    public final AppCompatImageView editSearchImg;

    @NonNull
    public final FrameLayout noResultContainer;

    @NonNull
    public final TextView noResultText;

    @NonNull
    public final LinearLayout quickSelectContainer;

    @NonNull
    public final RecyclerView quickSelectList;

    @NonNull
    public final LinearLayout searchCityEdit;

    @NonNull
    public final RecyclerView searchResultList;

    @NonNull
    public final LinearLayout searchTitleContainer;

    @NonNull
    public final TextView selectedCityTv;

    @NonNull
    public final AppCompatImageView titleBackImg;

    @NonNull
    public final RelativeLayout titleContainer;

    private ActivitySelectCityBinding(@NonNull LinearLayout linearLayout, @NonNull ListTile listTile, @NonNull AppCompatImageView appCompatImageView, @NonNull EditText editText, @NonNull AppCompatImageView appCompatImageView2, @NonNull TextView textView, @NonNull AppCompatImageView appCompatImageView3, @NonNull FrameLayout frameLayout, @NonNull TextView textView2, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull LinearLayout linearLayout3, @NonNull RecyclerView recyclerView2, @NonNull LinearLayout linearLayout4, @NonNull TextView textView3, @NonNull AppCompatImageView appCompatImageView4, @NonNull RelativeLayout relativeLayout) {
        this.a = linearLayout;
        this.autoLocate = listTile;
        this.backImg = appCompatImageView;
        this.cityEdit = editText;
        this.closeImg = appCompatImageView2;
        this.currentSelectedTv = textView;
        this.editSearchImg = appCompatImageView3;
        this.noResultContainer = frameLayout;
        this.noResultText = textView2;
        this.quickSelectContainer = linearLayout2;
        this.quickSelectList = recyclerView;
        this.searchCityEdit = linearLayout3;
        this.searchResultList = recyclerView2;
        this.searchTitleContainer = linearLayout4;
        this.selectedCityTv = textView3;
        this.titleBackImg = appCompatImageView4;
        this.titleContainer = relativeLayout;
    }

    @NonNull
    public static ActivitySelectCityBinding bind(@NonNull View view) {
        int i = R.id.auto_locate;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
        if (listTile != null) {
            i = R.id.back_img;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = R.id.city_edit;
                EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
                if (editText != null) {
                    i = R.id.close_img;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView2 != null) {
                        i = R.id.current_selected_tv;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = R.id.edit_search_img;
                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                            if (appCompatImageView3 != null) {
                                i = R.id.no_result_container;
                                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                if (frameLayout != null) {
                                    i = R.id.no_result_text;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = R.id.quick_select_container;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout != null) {
                                            i = R.id.quick_select_list;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                            if (recyclerView != null) {
                                                i = R.id.search_city_edit;
                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout2 != null) {
                                                    i = R.id.search_result_list;
                                                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                    if (recyclerView2 != null) {
                                                        i = R.id.search_title_container;
                                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                        if (linearLayout3 != null) {
                                                            i = R.id.selected_city_tv;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView3 != null) {
                                                                i = R.id.title_back_img;
                                                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                                if (appCompatImageView4 != null) {
                                                                    i = R.id.title_container;
                                                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (relativeLayout != null) {
                                                                        return new ActivitySelectCityBinding((LinearLayout) view, listTile, appCompatImageView, editText, appCompatImageView2, textView, appCompatImageView3, frameLayout, textView2, linearLayout, recyclerView, linearLayout2, recyclerView2, linearLayout3, textView3, appCompatImageView4, relativeLayout);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySelectCityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySelectCityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_select_city, viewGroup, false);
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
