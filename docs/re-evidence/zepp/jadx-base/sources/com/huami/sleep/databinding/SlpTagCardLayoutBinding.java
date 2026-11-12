package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.R;
import com.huami.sleep.view.NestRecyclerView;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public final class SlpTagCardLayoutBinding implements ViewBinding {

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
    public final TextView sleepTagTv;

    @NonNull
    public final NestRecyclerView tagRV;

    private SlpTagCardLayoutBinding(@NonNull View rootView, @NonNull TextView cancelTv, @NonNull TextView confirmTv, @NonNull TextView counterTv, @NonNull EditText inputEt, @NonNull ConstraintLayout manualLayout, @NonNull TextView selCancelTv, @NonNull ConstraintLayout selectView, @NonNull TextView sleepTagTv, @NonNull NestRecyclerView tagRV) {
        this.a = rootView;
        this.cancelTv = cancelTv;
        this.confirmTv = confirmTv;
        this.counterTv = counterTv;
        this.inputEt = inputEt;
        this.manualLayout = manualLayout;
        this.selCancelTv = selCancelTv;
        this.selectView = selectView;
        this.sleepTagTv = sleepTagTv;
        this.tagRV = tagRV;
    }

    @NonNull
    public static SlpTagCardLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.cancelTv;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.confirmTv;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = R.id.counterTv;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView3 != null) {
                    i = R.id.inputEt;
                    EditText editText = (EditText) ViewBindings.findChildViewById(rootView, i);
                    if (editText != null) {
                        i = R.id.manualLayout;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
                        if (constraintLayout != null) {
                            i = R.id.selCancelTv;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                            if (textView4 != null) {
                                i = R.id.selectView;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
                                if (constraintLayout2 != null) {
                                    i = R.id.sleepTagTv;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                    if (textView5 != null) {
                                        i = R.id.tagRV;
                                        NestRecyclerView nestRecyclerView = (NestRecyclerView) ViewBindings.findChildViewById(rootView, i);
                                        if (nestRecyclerView != null) {
                                            return new SlpTagCardLayoutBinding(rootView, textView, textView2, textView3, editText, constraintLayout, textView4, constraintLayout2, textView5, nestRecyclerView);
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
    public static SlpTagCardLayoutBinding inflate(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        Objects.requireNonNull(parent, "parent");
        inflater.inflate(R.layout.slp_tag_card_layout, parent);
        return bind(parent);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}
