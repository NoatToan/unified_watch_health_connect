package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityInstructionMibandPage4Binding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView instructionText;

    @NonNull
    public final TextView moreInfo;

    @NonNull
    public final TextView title;

    private ActivityInstructionMibandPage4Binding(@NonNull RelativeLayout rootView, @NonNull TextView instructionText, @NonNull TextView moreInfo, @NonNull TextView title) {
        this.a = rootView;
        this.instructionText = instructionText;
        this.moreInfo = moreInfo;
        this.title = title;
    }

    @NonNull
    public static ActivityInstructionMibandPage4Binding bind(@NonNull View rootView) {
        int i = R.id.instruction_text;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.instruction_text);
        if (textView != null) {
            i = R.id.more_info;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.more_info);
            if (textView2 != null) {
                i = R.id.title;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                if (textView3 != null) {
                    return new ActivityInstructionMibandPage4Binding((RelativeLayout) rootView, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityInstructionMibandPage4Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityInstructionMibandPage4Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_instruction_miband_page_4, parent, false);
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
