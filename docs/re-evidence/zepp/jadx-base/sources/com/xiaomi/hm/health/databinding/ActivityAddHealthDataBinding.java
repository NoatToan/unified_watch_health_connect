package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityAddHealthDataBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ConstraintLayout dataEdit;

    @NonNull
    public final ConstraintLayout dataItem;

    @NonNull
    public final TypefaceTextView dataText;

    @NonNull
    public final TypefaceTextView date;

    @NonNull
    public final ConstraintLayout dateItem;

    @NonNull
    public final TypefaceTextView dateText;

    @NonNull
    public final EditText editText;

    @NonNull
    public final ConstraintLayout extraDataItem;

    @NonNull
    public final TypefaceTextView extraDataText;

    @NonNull
    public final EditText extraEditText;

    @NonNull
    public final Button save;

    @NonNull
    public final TypefaceTextView time;

    @NonNull
    public final ConstraintLayout timeItem;

    @NonNull
    public final TypefaceTextView timeText;

    private ActivityAddHealthDataBinding(@NonNull ConstraintLayout rootView, @NonNull ConstraintLayout dataEdit, @NonNull ConstraintLayout dataItem, @NonNull TypefaceTextView dataText, @NonNull TypefaceTextView date, @NonNull ConstraintLayout dateItem, @NonNull TypefaceTextView dateText, @NonNull EditText editText, @NonNull ConstraintLayout extraDataItem, @NonNull TypefaceTextView extraDataText, @NonNull EditText extraEditText, @NonNull Button save, @NonNull TypefaceTextView time, @NonNull ConstraintLayout timeItem, @NonNull TypefaceTextView timeText) {
        this.a = rootView;
        this.dataEdit = dataEdit;
        this.dataItem = dataItem;
        this.dataText = dataText;
        this.date = date;
        this.dateItem = dateItem;
        this.dateText = dateText;
        this.editText = editText;
        this.extraDataItem = extraDataItem;
        this.extraDataText = extraDataText;
        this.extraEditText = extraEditText;
        this.save = save;
        this.time = time;
        this.timeItem = timeItem;
        this.timeText = timeText;
    }

    @NonNull
    public static ActivityAddHealthDataBinding bind(@NonNull View rootView) {
        int i = R.id.data_edit;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.data_edit);
        if (constraintLayout != null) {
            i = R.id.data_item;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.data_item);
            if (constraintLayout2 != null) {
                i = R.id.data_text;
                TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.data_text);
                if (typefaceTextView != null) {
                    i = R.id.date;
                    TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.date);
                    if (typefaceTextView2 != null) {
                        i = R.id.date_item;
                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.date_item);
                        if (constraintLayout3 != null) {
                            i = R.id.date_text;
                            TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.date_text);
                            if (typefaceTextView3 != null) {
                                i = R.id.editText;
                                EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.editText);
                                if (editText != null) {
                                    i = R.id.extra_data_item;
                                    ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.extra_data_item);
                                    if (constraintLayout4 != null) {
                                        i = R.id.extra_data_text;
                                        TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.extra_data_text);
                                        if (typefaceTextView4 != null) {
                                            i = R.id.extra_editText;
                                            EditText editText2 = (EditText) ViewBindings.findChildViewById(rootView, R.id.extra_editText);
                                            if (editText2 != null) {
                                                i = R.id.save;
                                                Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.save);
                                                if (button != null) {
                                                    i = R.id.time;
                                                    TypefaceTextView typefaceTextView5 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.time);
                                                    if (typefaceTextView5 != null) {
                                                        i = R.id.time_item;
                                                        ConstraintLayout constraintLayout5 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.time_item);
                                                        if (constraintLayout5 != null) {
                                                            i = R.id.time_text;
                                                            TypefaceTextView typefaceTextView6 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.time_text);
                                                            if (typefaceTextView6 != null) {
                                                                return new ActivityAddHealthDataBinding((ConstraintLayout) rootView, constraintLayout, constraintLayout2, typefaceTextView, typefaceTextView2, constraintLayout3, typefaceTextView3, editText, constraintLayout4, typefaceTextView4, editText2, button, typefaceTextView5, constraintLayout5, typefaceTextView6);
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
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityAddHealthDataBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityAddHealthDataBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_add_health_data, parent, false);
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
