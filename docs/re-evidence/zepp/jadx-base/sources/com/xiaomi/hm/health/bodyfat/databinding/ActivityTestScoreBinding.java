package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityTestScoreBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final EditText ageValueEdittv;

    @NonNull
    public final EditText bmrValueEdit;

    @NonNull
    public final EditText bodyFatEdit;

    @NonNull
    public final EditText boneValueEdit;

    @NonNull
    public final Button clearButton;

    @NonNull
    public final EditText heightValueEdittv;

    @NonNull
    public final EditText muscleValueEdit;

    @NonNull
    public final EditText pmrValueEdit;

    @NonNull
    public final RadioButton radioFemale;

    @NonNull
    public final RadioButton radioMale;

    @NonNull
    public final EditText resultView;

    @NonNull
    public final RadioGroup setRp;

    @NonNull
    public final EditText skeletalMuscleValueEdit;

    @NonNull
    public final Button startButton;

    @NonNull
    public final EditText subcutaneousFatValueEdit;

    @NonNull
    public final EditText visceralFatValue;

    @NonNull
    public final EditText waterValueEdit;

    @NonNull
    public final EditText weightValueEdittv;

    private ActivityTestScoreBinding(@NonNull RelativeLayout relativeLayout, @NonNull EditText editText, @NonNull EditText editText2, @NonNull EditText editText3, @NonNull EditText editText4, @NonNull Button button, @NonNull EditText editText5, @NonNull EditText editText6, @NonNull EditText editText7, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull EditText editText8, @NonNull RadioGroup radioGroup, @NonNull EditText editText9, @NonNull Button button2, @NonNull EditText editText10, @NonNull EditText editText11, @NonNull EditText editText12, @NonNull EditText editText13) {
        this.a = relativeLayout;
        this.ageValueEdittv = editText;
        this.bmrValueEdit = editText2;
        this.bodyFatEdit = editText3;
        this.boneValueEdit = editText4;
        this.clearButton = button;
        this.heightValueEdittv = editText5;
        this.muscleValueEdit = editText6;
        this.pmrValueEdit = editText7;
        this.radioFemale = radioButton;
        this.radioMale = radioButton2;
        this.resultView = editText8;
        this.setRp = radioGroup;
        this.skeletalMuscleValueEdit = editText9;
        this.startButton = button2;
        this.subcutaneousFatValueEdit = editText10;
        this.visceralFatValue = editText11;
        this.waterValueEdit = editText12;
        this.weightValueEdittv = editText13;
    }

    @NonNull
    public static ActivityTestScoreBinding bind(@NonNull View view) {
        int i = R.id.age_value_edittv;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
        if (editText != null) {
            i = R.id.bmr_value_edit;
            EditText editText2 = (EditText) ViewBindings.findChildViewById(view, i);
            if (editText2 != null) {
                i = R.id.body_fat_edit;
                EditText editText3 = (EditText) ViewBindings.findChildViewById(view, i);
                if (editText3 != null) {
                    i = R.id.bone_value_edit;
                    EditText editText4 = (EditText) ViewBindings.findChildViewById(view, i);
                    if (editText4 != null) {
                        i = R.id.clearButton;
                        Button button = (Button) ViewBindings.findChildViewById(view, i);
                        if (button != null) {
                            i = R.id.height_value_edittv;
                            EditText editText5 = (EditText) ViewBindings.findChildViewById(view, i);
                            if (editText5 != null) {
                                i = R.id.muscle_value_edit;
                                EditText editText6 = (EditText) ViewBindings.findChildViewById(view, i);
                                if (editText6 != null) {
                                    i = R.id.pmr_value_edit;
                                    EditText editText7 = (EditText) ViewBindings.findChildViewById(view, i);
                                    if (editText7 != null) {
                                        i = R.id.radioFemale;
                                        RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i);
                                        if (radioButton != null) {
                                            i = R.id.radioMale;
                                            RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i);
                                            if (radioButton2 != null) {
                                                i = R.id.result_view;
                                                EditText editText8 = (EditText) ViewBindings.findChildViewById(view, i);
                                                if (editText8 != null) {
                                                    i = R.id.set_rp;
                                                    RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
                                                    if (radioGroup != null) {
                                                        i = R.id.skeletal_muscle_value_edit;
                                                        EditText editText9 = (EditText) ViewBindings.findChildViewById(view, i);
                                                        if (editText9 != null) {
                                                            i = R.id.startButton;
                                                            Button button2 = (Button) ViewBindings.findChildViewById(view, i);
                                                            if (button2 != null) {
                                                                i = R.id.subcutaneous_fat_value_edit;
                                                                EditText editText10 = (EditText) ViewBindings.findChildViewById(view, i);
                                                                if (editText10 != null) {
                                                                    i = R.id.visceral_fat_value;
                                                                    EditText editText11 = (EditText) ViewBindings.findChildViewById(view, i);
                                                                    if (editText11 != null) {
                                                                        i = R.id.water_value_edit;
                                                                        EditText editText12 = (EditText) ViewBindings.findChildViewById(view, i);
                                                                        if (editText12 != null) {
                                                                            i = R.id.weight_value_edittv;
                                                                            EditText editText13 = (EditText) ViewBindings.findChildViewById(view, i);
                                                                            if (editText13 != null) {
                                                                                return new ActivityTestScoreBinding((RelativeLayout) view, editText, editText2, editText3, editText4, button, editText5, editText6, editText7, radioButton, radioButton2, editText8, radioGroup, editText9, button2, editText10, editText11, editText12, editText13);
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
    public static ActivityTestScoreBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityTestScoreBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_test_score, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
