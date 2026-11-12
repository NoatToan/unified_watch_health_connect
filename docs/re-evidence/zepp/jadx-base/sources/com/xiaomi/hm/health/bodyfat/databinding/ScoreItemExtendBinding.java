package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.view.text.UnitTextView;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ScoreItemExtendBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final ImageView bfScoreLlPre;

    @NonNull
    public final TextView contentStateTv;

    @NonNull
    public final View dividerBottom;

    @NonNull
    public final LinearLayout llBf3Params;

    @NonNull
    public final TextView paramsNameTv;

    @NonNull
    public final UnitTextView paramsValueTv;

    @NonNull
    public final TextView textViewDetails;

    private ScoreItemExtendBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull TextView textView2, @NonNull UnitTextView unitTextView, @NonNull TextView textView3) {
        this.a = relativeLayout;
        this.bfScoreLlPre = imageView;
        this.contentStateTv = textView;
        this.dividerBottom = view;
        this.llBf3Params = linearLayout;
        this.paramsNameTv = textView2;
        this.paramsValueTv = unitTextView;
        this.textViewDetails = textView3;
    }

    @NonNull
    public static ScoreItemExtendBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.bf_score_ll_pre;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.content_state_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.divider_bottom))) != null) {
                i = R.id.ll_bf3_params;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.params_name_tv;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.params_value_tv;
                        UnitTextView unitTextView = (UnitTextView) ViewBindings.findChildViewById(view, i);
                        if (unitTextView != null) {
                            i = R.id.text_view_details;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                return new ScoreItemExtendBinding((RelativeLayout) view, imageView, textView, viewFindChildViewById, linearLayout, textView2, unitTextView, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ScoreItemExtendBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ScoreItemExtendBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.score_item_extend, viewGroup, false);
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
