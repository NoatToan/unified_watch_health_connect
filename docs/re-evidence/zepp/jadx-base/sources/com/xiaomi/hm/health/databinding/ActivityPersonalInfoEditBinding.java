package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityPersonalInfoEditBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final EditText ftCareTopicEdit;

    @NonNull
    public final TypefaceTextView ftCareTopicEditCount;

    private ActivityPersonalInfoEditBinding(@NonNull ConstraintLayout rootView, @NonNull EditText ftCareTopicEdit, @NonNull TypefaceTextView ftCareTopicEditCount) {
        this.a = rootView;
        this.ftCareTopicEdit = ftCareTopicEdit;
        this.ftCareTopicEditCount = ftCareTopicEditCount;
    }

    @NonNull
    public static ActivityPersonalInfoEditBinding bind(@NonNull View rootView) {
        int i = R.id.ft_care_topic_edit;
        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.ft_care_topic_edit);
        if (editText != null) {
            i = R.id.ft_care_topic_edit_count;
            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.ft_care_topic_edit_count);
            if (typefaceTextView != null) {
                return new ActivityPersonalInfoEditBinding((ConstraintLayout) rootView, editText, typefaceTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityPersonalInfoEditBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityPersonalInfoEditBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_personal_info_edit, parent, false);
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
