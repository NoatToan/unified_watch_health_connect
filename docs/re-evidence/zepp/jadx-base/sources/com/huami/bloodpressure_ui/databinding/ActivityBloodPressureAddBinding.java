package com.huami.bloodpressure_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.bloodpressure_ui.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityBloodPressureAddBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TitlebarBloodPressureBinding containerTitlebar;

    @NonNull
    public final ConstraintLayout dataEdit;

    @NonNull
    public final ConstraintLayout dataItem;

    @NonNull
    public final AppCompatTextView dataText;

    @NonNull
    public final AppCompatTextView date;

    @NonNull
    public final ConstraintLayout dateItem;

    @NonNull
    public final AppCompatTextView dateText;

    @NonNull
    public final EditText editText;

    @NonNull
    public final ConstraintLayout extraDataItem;

    @NonNull
    public final AppCompatTextView extraDataText;

    @NonNull
    public final EditText extraEditText;

    @NonNull
    public final Button save;

    @NonNull
    public final AppCompatTextView time;

    @NonNull
    public final ConstraintLayout timeItem;

    @NonNull
    public final AppCompatTextView timeText;

    private ActivityBloodPressureAddBinding(@NonNull LinearLayout linearLayout, @NonNull TitlebarBloodPressureBinding titlebarBloodPressureBinding, @NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull ConstraintLayout constraintLayout3, @NonNull AppCompatTextView appCompatTextView3, @NonNull EditText editText, @NonNull ConstraintLayout constraintLayout4, @NonNull AppCompatTextView appCompatTextView4, @NonNull EditText editText2, @NonNull Button button, @NonNull AppCompatTextView appCompatTextView5, @NonNull ConstraintLayout constraintLayout5, @NonNull AppCompatTextView appCompatTextView6) {
        this.a = linearLayout;
        this.containerTitlebar = titlebarBloodPressureBinding;
        this.dataEdit = constraintLayout;
        this.dataItem = constraintLayout2;
        this.dataText = appCompatTextView;
        this.date = appCompatTextView2;
        this.dateItem = constraintLayout3;
        this.dateText = appCompatTextView3;
        this.editText = editText;
        this.extraDataItem = constraintLayout4;
        this.extraDataText = appCompatTextView4;
        this.extraEditText = editText2;
        this.save = button;
        this.time = appCompatTextView5;
        this.timeItem = constraintLayout5;
        this.timeText = appCompatTextView6;
    }

    @NonNull
    public static ActivityBloodPressureAddBinding bind(@NonNull View view) {
        int i = R.id.container_titlebar;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            TitlebarBloodPressureBinding titlebarBloodPressureBindingBind = TitlebarBloodPressureBinding.bind(viewFindChildViewById);
            i = R.id.data_edit;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R.id.data_item;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout2 != null) {
                    i = R.id.data_text;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        i = R.id.date;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView2 != null) {
                            i = R.id.date_item;
                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout3 != null) {
                                i = R.id.date_text;
                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView3 != null) {
                                    i = R.id.editText;
                                    EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
                                    if (editText != null) {
                                        i = R.id.extra_data_item;
                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout4 != null) {
                                            i = R.id.extra_data_text;
                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView4 != null) {
                                                i = R.id.extra_editText;
                                                EditText editText2 = (EditText) ViewBindings.findChildViewById(view, i);
                                                if (editText2 != null) {
                                                    i = R.id.save;
                                                    Button button = (Button) ViewBindings.findChildViewById(view, i);
                                                    if (button != null) {
                                                        i = R.id.time;
                                                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                        if (appCompatTextView5 != null) {
                                                            i = R.id.time_item;
                                                            ConstraintLayout constraintLayout5 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                            if (constraintLayout5 != null) {
                                                                i = R.id.time_text;
                                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                if (appCompatTextView6 != null) {
                                                                    return new ActivityBloodPressureAddBinding((LinearLayout) view, titlebarBloodPressureBindingBind, constraintLayout, constraintLayout2, appCompatTextView, appCompatTextView2, constraintLayout3, appCompatTextView3, editText, constraintLayout4, appCompatTextView4, editText2, button, appCompatTextView5, constraintLayout5, appCompatTextView6);
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
    public static ActivityBloodPressureAddBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityBloodPressureAddBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_blood_pressure_add, viewGroup, false);
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
