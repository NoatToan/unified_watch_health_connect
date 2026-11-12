package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.view.NestRecyclerView;
import com.huami.watch.hmwatchmanager.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes20.dex */
public final class HealthTagCardLayoutBinding implements ViewBinding {

    @NonNull
    private final View a;

    @NonNull
    public final TextView cancelTv;

    @NonNull
    public final TextView confirmTv;

    @NonNull
    public final TextView counterTv;

    @NonNull
    public final EditText inputEt;

    @NonNull
    public final ConstraintLayout manualLayout;

    @NonNull
    public final TextView selCancelTv;

    @NonNull
    public final ConstraintLayout selectView;

    @NonNull
    public final NestRecyclerView tagRV;

    @NonNull
    public final TextView tagTitleTv;

    private HealthTagCardLayoutBinding(@NonNull View rootView, @NonNull TextView cancelTv, @NonNull TextView confirmTv, @NonNull TextView counterTv, @NonNull EditText inputEt, @NonNull ConstraintLayout manualLayout, @NonNull TextView selCancelTv, @NonNull ConstraintLayout selectView, @NonNull NestRecyclerView tagRV, @NonNull TextView tagTitleTv) {
        this.a = rootView;
        this.cancelTv = cancelTv;
        this.confirmTv = confirmTv;
        this.counterTv = counterTv;
        this.inputEt = inputEt;
        this.manualLayout = manualLayout;
        this.selCancelTv = selCancelTv;
        this.selectView = selectView;
        this.tagRV = tagRV;
        this.tagTitleTv = tagTitleTv;
    }

    @NonNull
    public static HealthTagCardLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.cancelTv;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.cancelTv);
        if (textView != null) {
            i = R.id.confirmTv;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.confirmTv);
            if (textView2 != null) {
                i = R.id.counterTv;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.counterTv);
                if (textView3 != null) {
                    i = R.id.inputEt;
                    EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.inputEt);
                    if (editText != null) {
                        i = R.id.manualLayout;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.manualLayout);
                        if (constraintLayout != null) {
                            i = R.id.selCancelTv;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.selCancelTv);
                            if (textView4 != null) {
                                i = R.id.selectView;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.selectView);
                                if (constraintLayout2 != null) {
                                    i = R.id.tagRV;
                                    NestRecyclerView nestRecyclerView = (NestRecyclerView) ViewBindings.findChildViewById(rootView, R.id.tagRV);
                                    if (nestRecyclerView != null) {
                                        i = R.id.tagTitleTv;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tagTitleTv);
                                        if (textView5 != null) {
                                            return new HealthTagCardLayoutBinding(rootView, textView, textView2, textView3, editText, constraintLayout, textView4, constraintLayout2, nestRecyclerView, textView5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HealthTagCardLayoutBinding inflate(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        Objects.requireNonNull(parent, "parent");
        inflater.inflate(R.layout.health_tag_card_layout, parent);
        return bind(parent);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}
