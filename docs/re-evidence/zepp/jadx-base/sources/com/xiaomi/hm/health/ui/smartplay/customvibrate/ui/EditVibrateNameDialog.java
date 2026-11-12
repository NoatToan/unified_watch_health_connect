package com.xiaomi.hm.health.ui.smartplay.customvibrate.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.lib.view.SystemBarTintSupport;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.utils.Utils;

/* JADX INFO: loaded from: classes22.dex */
public class EditVibrateNameDialog extends BaseDialogFragment {
    public static final String KEY_NAME = "name";
    private static final int i = 20;
    private EditText e = null;
    private INameChangedListener f = null;
    private TextView g;
    private String h;

    public interface INameChangedListener {
        void onDisplayNameChanged(BaseDialogFragment dialog, String newName);
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            if (s == null || s.length() == 0 || s.toString().trim().length() == 0) {
                EditVibrateNameDialog.this.g.setEnabled(false);
                return;
            }
            EditVibrateNameDialog.this.g.setEnabled(true);
            Editable text = EditVibrateNameDialog.this.e.getText();
            int length = text.toString().length();
            if (length > 20) {
                int selectionEnd = Selection.getSelectionEnd(text);
                EditVibrateNameDialog.this.e.setText(text.toString().substring(0, length - 1));
                Editable text2 = EditVibrateNameDialog.this.e.getText();
                if (selectionEnd > text2.length()) {
                    selectionEnd = text2.length();
                }
                Selection.setSelection(text2, selectionEnd);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(View view) {
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        j();
    }

    private void i() {
        dismiss();
        Utils.closeSoftInput(getContext());
    }

    private void j() {
        INameChangedListener iNameChangedListener = this.f;
        if (iNameChangedListener != null) {
            iNameChangedListener.onDisplayNameChanged(this, this.e.getText().toString());
        }
    }

    public static EditVibrateNameDialog newInstance() {
        return new EditVibrateNameDialog();
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasBackground() {
        return false;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return true;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    @SuppressLint({"InflateParams"})
    public View initView() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.fragment_person_info_setting_nickname, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.updateTv);
        textView.setTextSize(14.0f);
        textView.setText(R.string.custom_vibrate_name);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.nick_name_btn_cancel);
        textView2.setText(R.string.cancel);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: zj1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.g(view);
            }
        });
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.nick_name_btn_save);
        this.g = textView3;
        textView3.setText(R.string.save);
        this.g.setEnabled(false);
        this.g.setOnClickListener(new View.OnClickListener() { // from class: yj1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.h(view);
            }
        });
        viewInflate.setFitsSystemWindows(true);
        EditText editText = (EditText) viewInflate.findViewById(R.id.info_nick_name);
        this.e = editText;
        editText.setHint(R.string.custom_vibrate_name_hint);
        if (!TextUtils.isEmpty(this.h)) {
            this.e.setText(this.h);
            this.e.setSelection(this.h.length());
        }
        this.e.addTextChangedListener(new a());
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.h = arguments.getString("name");
        }
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, SystemBarTintSupport.isSupport(getActivity()) ? R.style.DimPanelTint : R.style.DimPanel);
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = getDialog().getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.height = -1;
            window.setAttributes(attributes);
            window.setSoftInputMode(5);
        }
    }

    public void setNameChangedListener(INameChangedListener listener) {
        this.f = listener;
    }
}
