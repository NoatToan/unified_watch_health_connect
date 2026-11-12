package com.huawei.health.suggestion.ui.run.dialog;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.edittext.HealthEditText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes31.dex */
public class EditDialog extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InputFilter f9996a = new InputFilter() { // from class: com.huawei.health.suggestion.ui.run.dialog.EditDialog.4

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Pattern f10002c = Pattern.compile("[🀀-🏿]|[🐀-\u1f7ff]|[☀-⟿]", 66);

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            if (!this.f10002c.matcher(charSequence).find()) {
                return null;
            }
            LogUtil.d("Suggestion_EditDialog", "can not insert emoji");
            return "";
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthEditText f9997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CustomViewDialog.Builder f9998c;
    private CustomViewDialog d;
    private String e;
    private OnTextConformListener h;
    private HealthButton i;

    public interface OnTextConformListener {
        void onTextConform(String str);
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.d == null) {
            this.d = b();
            e();
            c();
        }
        return this.d;
    }

    private CustomViewDialog b() {
        if (getArguments() == null) {
            LogUtil.j("Suggestion_EditDialog", "getArguments()==null");
            return null;
        }
        int i = getArguments().getInt("title");
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(getActivity());
        this.f9998c = builder;
        CustomViewDialog customViewDialogD = builder.b(i).d(d()).c(R.string.IDS_plugin_fitnessadvice_cancal, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.dialog.EditDialog.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).d(com.huawei.health.suggestion.R.string.IDS_plugin_fitnessadvice_ok, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.dialog.EditDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (EditDialog.this.h != null) {
                    EditDialog.this.h.onTextConform(EditDialog.this.f9997b.getText().toString());
                }
            }
        }).d();
        customViewDialogD.setCanceledOnTouchOutside(false);
        this.i = this.f9998c.b();
        if (getActivity() != null) {
            this.i.setTextColor(getActivity().getResources().getColorStateList(com.huawei.ui.commonui.R.color.text_color_btn));
        }
        return customViewDialogD;
    }

    private View d() {
        View viewInflate = LayoutInflater.from(getActivity()).inflate(com.huawei.health.suggestion.R.layout.sug_edit_plan_name, (ViewGroup) new LinearLayout(getActivity()), false);
        HealthEditText healthEditText = (HealthEditText) viewInflate.findViewById(com.huawei.health.suggestion.R.id.sug_edit_plan_name);
        this.f9997b = healthEditText;
        d(healthEditText);
        return viewInflate;
    }

    private void e() {
        HealthEditText healthEditText = this.f9997b;
        if (healthEditText != null) {
            healthEditText.setText(this.e);
            Editable text = this.f9997b.getText();
            if (text != null) {
                this.f9997b.setSelection(text.length());
            }
        }
    }

    private void c() {
        this.f9997b.addTextChangedListener(new TextWatcher() { // from class: com.huawei.health.suggestion.ui.run.dialog.EditDialog.3
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (editable == null) {
                    return;
                }
                if (TextUtils.isEmpty(editable.toString())) {
                    EditDialog.this.i.setEnabled(false);
                } else {
                    EditDialog.this.i.setEnabled(true);
                }
            }
        });
    }

    private void d(EditText editText) {
        ArrayList arrayList = new ArrayList(Arrays.asList(editText.getFilters()));
        arrayList.add(this.f9996a);
        editText.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[arrayList.size()]));
    }
}
