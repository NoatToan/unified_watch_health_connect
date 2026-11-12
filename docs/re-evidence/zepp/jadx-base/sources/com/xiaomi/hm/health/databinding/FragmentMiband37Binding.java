package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.ui.playmiband2.MovableImageView;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentMiband37Binding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final Guideline guideline;

    @NonNull
    public final ImageView imgPos;

    @NonNull
    public final MovableImageView imgSlotCard;

    @NonNull
    public final TextView indicatorTv;

    @NonNull
    public final TextView titleTv;

    @NonNull
    public final TextView tvGotoAdd;

    private FragmentMiband37Binding(@NonNull ConstraintLayout rootView, @NonNull Guideline guideline, @NonNull ImageView imgPos, @NonNull MovableImageView imgSlotCard, @NonNull TextView indicatorTv, @NonNull TextView titleTv, @NonNull TextView tvGotoAdd) {
        this.a = rootView;
        this.guideline = guideline;
        this.imgPos = imgPos;
        this.imgSlotCard = imgSlotCard;
        this.indicatorTv = indicatorTv;
        this.titleTv = titleTv;
        this.tvGotoAdd = tvGotoAdd;
    }

    @NonNull
    public static FragmentMiband37Binding bind(@NonNull View rootView) {
        int i = R.id.guideline;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(rootView, R.id.guideline);
        if (guideline != null) {
            i = R.id.img_pos;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_pos);
            if (imageView != null) {
                i = R.id.img_slot_card;
                MovableImageView movableImageView = (MovableImageView) ViewBindings.findChildViewById(rootView, R.id.img_slot_card);
                if (movableImageView != null) {
                    i = R.id.indicator_tv;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.indicator_tv);
                    if (textView != null) {
                        i = R.id.title_tv;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_tv);
                        if (textView2 != null) {
                            i = R.id.tv_goto_add;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_goto_add);
                            if (textView3 != null) {
                                return new FragmentMiband37Binding((ConstraintLayout) rootView, guideline, imageView, movableImageView, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMiband37Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentMiband37Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_miband3_7, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
