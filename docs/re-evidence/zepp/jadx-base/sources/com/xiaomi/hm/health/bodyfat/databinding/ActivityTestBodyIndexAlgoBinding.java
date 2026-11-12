package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityTestBodyIndexAlgoBinding implements ViewBinding {

    @NonNull
    private final ScrollView a;

    @NonNull
    public final EditText ageValueEdittv;

    @NonNull
    public final TextView analysisCompare;

    @NonNull
    public final TextView analysisResult;

    @NonNull
    public final EditText heightValueEdittv;

    @NonNull
    public final EditText impedanceEdit;

    @NonNull
    public final RadioButton radioEncode;

    @NonNull
    public final RadioButton radioFemale;

    @NonNull
    public final RadioButton radioMale;

    @NonNull
    public final RadioButton radioModeNormal;

    @NonNull
    public final RadioButton radioModeSport;

    @NonNull
    public final RadioButton radioNoEncode;

    @NonNull
    public final RadioGroup setAlgoVersion;

    @NonNull
    public final RadioGroup setMeasureMode;

    @NonNull
    public final RadioGroup setRp;

    @NonNull
    public final Button startButton;

    @NonNull
    public final EditText weightValueEdittv;

    private ActivityTestBodyIndexAlgoBinding(@NonNull ScrollView scrollView, @NonNull EditText editText, @NonNull TextView textView, @NonNull TextView textView2, @NonNull EditText editText2, @NonNull EditText editText3, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull RadioButton radioButton3, @NonNull RadioButton radioButton4, @NonNull RadioButton radioButton5, @NonNull RadioButton radioButton6, @NonNull RadioGroup radioGroup, @NonNull RadioGroup radioGroup2, @NonNull RadioGroup radioGroup3, @NonNull Button button, @NonNull EditText editText4) {
        this.a = scrollView;
        this.ageValueEdittv = editText;
        this.analysisCompare = textView;
        this.analysisResult = textView2;
        this.heightValueEdittv = editText2;
        this.impedanceEdit = editText3;
        this.radioEncode = radioButton;
        this.radioFemale = radioButton2;
        this.radioMale = radioButton3;
        this.radioModeNormal = radioButton4;
        this.radioModeSport = radioButton5;
        this.radioNoEncode = radioButton6;
        this.setAlgoVersion = radioGroup;
        this.setMeasureMode = radioGroup2;
        this.setRp = radioGroup3;
        this.startButton = button;
        this.weightValueEdittv = editText4;
    }

    @NonNull
    public static ActivityTestBodyIndexAlgoBinding bind(@NonNull View view) {
        int i = R.id.age_value_edittv;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
        if (editText != null) {
            i = R.id.analysisCompare;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.analysisResult;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.height_value_edittv;
                    EditText editText2 = (EditText) ViewBindings.findChildViewById(view, i);
                    if (editText2 != null) {
                        i = R.id.impedanceEdit;
                        EditText editText3 = (EditText) ViewBindings.findChildViewById(view, i);
                        if (editText3 != null) {
                            i = R.id.radioEncode;
                            RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i);
                            if (radioButton != null) {
                                i = R.id.radioFemale;
                                RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i);
                                if (radioButton2 != null) {
                                    i = R.id.radioMale;
                                    RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, i);
                                    if (radioButton3 != null) {
                                        i = R.id.radioModeNormal;
                                        RadioButton radioButton4 = (RadioButton) ViewBindings.findChildViewById(view, i);
                                        if (radioButton4 != null) {
                                            i = R.id.radioModeSport;
                                            RadioButton radioButton5 = (RadioButton) ViewBindings.findChildViewById(view, i);
                                            if (radioButton5 != null) {
                                                i = R.id.radioNoEncode;
                                                RadioButton radioButton6 = (RadioButton) ViewBindings.findChildViewById(view, i);
                                                if (radioButton6 != null) {
                                                    i = R.id.setAlgoVersion;
                                                    RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
                                                    if (radioGroup != null) {
                                                        i = R.id.setMeasureMode;
                                                        RadioGroup radioGroup2 = (RadioGroup) ViewBindings.findChildViewById(view, i);
                                                        if (radioGroup2 != null) {
                                                            i = R.id.set_rp;
                                                            RadioGroup radioGroup3 = (RadioGroup) ViewBindings.findChildViewById(view, i);
                                                            if (radioGroup3 != null) {
                                                                i = R.id.startButton;
                                                                Button button = (Button) ViewBindings.findChildViewById(view, i);
                                                                if (button != null) {
                                                                    i = R.id.weight_value_edittv;
                                                                    EditText editText4 = (EditText) ViewBindings.findChildViewById(view, i);
                                                                    if (editText4 != null) {
                                                                        return new ActivityTestBodyIndexAlgoBinding((ScrollView) view, editText, textView, textView2, editText2, editText3, radioButton, radioButton2, radioButton3, radioButton4, radioButton5, radioButton6, radioGroup, radioGroup2, radioGroup3, button, editText4);
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
    public static ActivityTestBodyIndexAlgoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityTestBodyIndexAlgoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_test_body_index_algo, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ScrollView getRoot() {
        return this.a;
    }
}
