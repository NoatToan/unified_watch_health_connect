package com.xiaomi.hm.health.databinding;

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
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ScoreParentItemShareBfBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final ImageView bfScoreLlPre;

    @NonNull
    public final RelativeLayout container;

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

    private ScoreParentItemShareBfBinding(@NonNull RelativeLayout rootView, @NonNull ImageView bfScoreLlPre, @NonNull RelativeLayout container, @NonNull TextView contentStateTv, @NonNull View dividerBottom, @NonNull LinearLayout llBf3Params, @NonNull TextView paramsNameTv, @NonNull UnitTextView paramsValueTv) {
        this.a = rootView;
        this.bfScoreLlPre = bfScoreLlPre;
        this.container = container;
        this.contentStateTv = contentStateTv;
        this.dividerBottom = dividerBottom;
        this.llBf3Params = llBf3Params;
        this.paramsNameTv = paramsNameTv;
        this.paramsValueTv = paramsValueTv;
    }

    @NonNull
    public static ScoreParentItemShareBfBinding bind(@NonNull View rootView) {
        int i = R.id.bf_score_ll_pre;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.bf_score_ll_pre);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) rootView;
            i = R.id.content_state_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.content_state_tv);
            if (textView != null) {
                i = R.id.divider_bottom;
                View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider_bottom);
                if (viewFindChildViewById != null) {
                    i = R.id.ll_bf3_params;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_bf3_params);
                    if (linearLayout != null) {
                        i = R.id.params_name_tv;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.params_name_tv);
                        if (textView2 != null) {
                            i = R.id.params_value_tv;
                            UnitTextView unitTextView = (UnitTextView) ViewBindings.findChildViewById(rootView, R.id.params_value_tv);
                            if (unitTextView != null) {
                                return new ScoreParentItemShareBfBinding(relativeLayout, imageView, relativeLayout, textView, viewFindChildViewById, linearLayout, textView2, unitTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ScoreParentItemShareBfBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ScoreParentItemShareBfBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.score_parent_item_share_bf, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
