package com.huami.nps.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.nps.R;

/* JADX INFO: loaded from: classes12.dex */
public final class NpsLayoutBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final CheckBox cb0;

    @NonNull
    public final CheckBox cb1;

    @NonNull
    public final CheckBox cb10;

    @NonNull
    public final CheckBox cb2;

    @NonNull
    public final CheckBox cb3;

    @NonNull
    public final CheckBox cb4;

    @NonNull
    public final CheckBox cb5;

    @NonNull
    public final CheckBox cb6;

    @NonNull
    public final CheckBox cb7;

    @NonNull
    public final CheckBox cb8;

    @NonNull
    public final CheckBox cb9;

    @NonNull
    public final ConstraintLayout clNpsBox;

    @NonNull
    public final ImageView ivNpsClose;

    @NonNull
    public final ImageView ivNpsSmile;

    @NonNull
    public final TextView tvNpsLike;

    @NonNull
    public final TextView tvNpsNotLike;

    @NonNull
    public final TextView tvNpsRecommendTitle;

    @NonNull
    public final TextView tvNpsTks;

    @NonNull
    public final TextView tvNpsTksContent;

    private NpsLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull CheckBox checkBox, @NonNull CheckBox checkBox2, @NonNull CheckBox checkBox3, @NonNull CheckBox checkBox4, @NonNull CheckBox checkBox5, @NonNull CheckBox checkBox6, @NonNull CheckBox checkBox7, @NonNull CheckBox checkBox8, @NonNull CheckBox checkBox9, @NonNull CheckBox checkBox10, @NonNull CheckBox checkBox11, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.a = constraintLayout;
        this.cb0 = checkBox;
        this.cb1 = checkBox2;
        this.cb10 = checkBox3;
        this.cb2 = checkBox4;
        this.cb3 = checkBox5;
        this.cb4 = checkBox6;
        this.cb5 = checkBox7;
        this.cb6 = checkBox8;
        this.cb7 = checkBox9;
        this.cb8 = checkBox10;
        this.cb9 = checkBox11;
        this.clNpsBox = constraintLayout2;
        this.ivNpsClose = imageView;
        this.ivNpsSmile = imageView2;
        this.tvNpsLike = textView;
        this.tvNpsNotLike = textView2;
        this.tvNpsRecommendTitle = textView3;
        this.tvNpsTks = textView4;
        this.tvNpsTksContent = textView5;
    }

    @NonNull
    public static NpsLayoutBinding bind(@NonNull View view) {
        int i = R.id.cb_0;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i);
        if (checkBox != null) {
            i = R.id.cb_1;
            CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(view, i);
            if (checkBox2 != null) {
                i = R.id.cb_10;
                CheckBox checkBox3 = (CheckBox) ViewBindings.findChildViewById(view, i);
                if (checkBox3 != null) {
                    i = R.id.cb_2;
                    CheckBox checkBox4 = (CheckBox) ViewBindings.findChildViewById(view, i);
                    if (checkBox4 != null) {
                        i = R.id.cb_3;
                        CheckBox checkBox5 = (CheckBox) ViewBindings.findChildViewById(view, i);
                        if (checkBox5 != null) {
                            i = R.id.cb_4;
                            CheckBox checkBox6 = (CheckBox) ViewBindings.findChildViewById(view, i);
                            if (checkBox6 != null) {
                                i = R.id.cb_5;
                                CheckBox checkBox7 = (CheckBox) ViewBindings.findChildViewById(view, i);
                                if (checkBox7 != null) {
                                    i = R.id.cb_6;
                                    CheckBox checkBox8 = (CheckBox) ViewBindings.findChildViewById(view, i);
                                    if (checkBox8 != null) {
                                        i = R.id.cb_7;
                                        CheckBox checkBox9 = (CheckBox) ViewBindings.findChildViewById(view, i);
                                        if (checkBox9 != null) {
                                            i = R.id.cb_8;
                                            CheckBox checkBox10 = (CheckBox) ViewBindings.findChildViewById(view, i);
                                            if (checkBox10 != null) {
                                                i = R.id.cb_9;
                                                CheckBox checkBox11 = (CheckBox) ViewBindings.findChildViewById(view, i);
                                                if (checkBox11 != null) {
                                                    i = R.id.cl_nps_box;
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                    if (constraintLayout != null) {
                                                        i = R.id.ivNpsClose;
                                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                                        if (imageView != null) {
                                                            i = R.id.ivNpsSmile;
                                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                            if (imageView2 != null) {
                                                                i = R.id.tvNpsLike;
                                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView != null) {
                                                                    i = R.id.tvNpsNotLike;
                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView2 != null) {
                                                                        i = R.id.tvNpsRecommendTitle;
                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView3 != null) {
                                                                            i = R.id.tvNpsTks;
                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView4 != null) {
                                                                                i = R.id.tvNpsTksContent;
                                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                if (textView5 != null) {
                                                                                    return new NpsLayoutBinding((ConstraintLayout) view, checkBox, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8, checkBox9, checkBox10, checkBox11, constraintLayout, imageView, imageView2, textView, textView2, textView3, textView4, textView5);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static NpsLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NpsLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.nps_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
