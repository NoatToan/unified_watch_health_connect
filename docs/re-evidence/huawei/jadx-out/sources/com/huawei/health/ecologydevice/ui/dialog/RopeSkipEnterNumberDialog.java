package com.huawei.health.ecologydevice.ui.dialog;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.ecologydevice.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.edittext.HealthEditText;
import com.huawei.ui.commonui.healthtextview.HealthTextView;

/* JADX INFO: loaded from: classes7.dex */
public class RopeSkipEnterNumberDialog extends BaseDialog {

    public interface OnConfirmClickListener {
        void onConfirmClick(int i);
    }

    public RopeSkipEnterNumberDialog(Context context, int i) {
        super(context, i);
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthEditText f6577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f6578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Context f6579c;
        private OnConfirmClickListener d;
        private HealthButton e;
        private String f = null;

        private boolean b(int i) {
            return i < 50 || i > 10000;
        }

        public d(Context context, OnConfirmClickListener onConfirmClickListener) {
            this.f6579c = context;
            this.d = onConfirmClickListener;
        }

        public RopeSkipEnterNumberDialog c() {
            Object systemService = this.f6579c.getSystemService("layout_inflater");
            if (!(systemService instanceof LayoutInflater)) {
                LogUtil.a("RopeSkipEnterNumberDialog", "object is not instanceof Inflater");
                return null;
            }
            View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.dialog_rope_skip_set_num_item, (ViewGroup) null);
            HealthButton healthButton = (HealthButton) viewInflate.findViewById(R.id.ok);
            this.e = healthButton;
            healthButton.setEnabled(false);
            RopeSkipEnterNumberDialog ropeSkipEnterNumberDialog = new RopeSkipEnterNumberDialog(this.f6579c, R.style.TrackDialog);
            c(viewInflate, ropeSkipEnterNumberDialog);
            ropeSkipEnterNumberDialog.addContentView(viewInflate, new ViewGroup.LayoutParams(-1, -2));
            ropeSkipEnterNumberDialog.setContentView(viewInflate);
            return ropeSkipEnterNumberDialog;
        }

        private void c(View view, RopeSkipEnterNumberDialog ropeSkipEnterNumberDialog) {
            ((HealthTextView) view.findViewById(R.id.dialog_title)).setText(this.f6579c.getResources().getString(R.string.IDS_rope_exercises_of_group));
            ((HealthTextView) view.findViewById(R.id.number_unit_text)).setText(this.f6579c.getResources().getQuantityString(R.plurals.IDS_indoor_skipper_number_unit_value, 0, ""));
            HealthEditText healthEditText = (HealthEditText) view.findViewById(R.id.custom_target_editText);
            this.f6577a = healthEditText;
            healthEditText.setInputType(2);
            SpannableString spannableString = new SpannableString(this.f6579c.getResources().getString(R.string.IDS_track_skip_enter_number));
            spannableString.setSpan(new AbsoluteSizeSpan(15, true), 0, spannableString.length(), 33);
            this.f6577a.setHint(new SpannedString(spannableString));
            HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.custom_target_tip);
            this.f6578b = healthTextView;
            healthTextView.setText(this.f6579c.getResources().getString(R.string.IDS_track_skip_input_range_tips, String.valueOf(50), String.valueOf(10000)));
            e(view, ropeSkipEnterNumberDialog);
        }

        private void e(View view, final RopeSkipEnterNumberDialog ropeSkipEnterNumberDialog) {
            this.f6577a.addTextChangedListener(new TextWatcher() { // from class: com.huawei.health.ecologydevice.ui.dialog.RopeSkipEnterNumberDialog.d.2
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
                    if (!TextUtils.isEmpty(editable.toString())) {
                        d.this.e.setEnabled(true);
                    } else {
                        d.this.e.setEnabled(false);
                    }
                    d.this.b(editable);
                }
            });
            ((HealthButton) view.findViewById(R.id.cancel)).setOnClickListener(new View.OnClickListener() { // from class: eoc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ropeSkipEnterNumberDialog.dismiss();
                }
            });
            this.e.setOnClickListener(new View.OnClickListener() { // from class: eod
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.d.a(ropeSkipEnterNumberDialog, view2);
                }
            });
        }

        public /* synthetic */ void a(RopeSkipEnterNumberDialog ropeSkipEnterNumberDialog, View view) {
            b();
            int iA = a();
            if (b(iA)) {
                c(false);
            } else {
                this.d.onConfirmClick(iA);
                ropeSkipEnterNumberDialog.dismiss();
            }
        }

        private void b() {
            String strReplaceAll = this.f6577a.getText().toString().trim().replaceAll(",", "");
            this.f = strReplaceAll;
            if (TextUtils.isEmpty(strReplaceAll)) {
                d();
            }
        }

        private int a() {
            try {
                return Integer.parseInt(this.f);
            } catch (NumberFormatException e) {
                LogUtil.e("RopeSkipEnterNumberDialog", e.getMessage());
                return 0;
            }
        }

        private void d() {
            this.f6578b.setTextColor(this.f6579c.getResources().getColor(R.color.colorError));
            this.e.setEnabled(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(Editable editable) {
            if (this.e.isEnabled() || TextUtils.isEmpty(editable)) {
                return;
            }
            try {
                if (b(Integer.parseInt(editable.toString()))) {
                    return;
                }
                c(true);
            } catch (NumberFormatException unused) {
                LogUtil.e("RopeSkipEnterNumberDialog", "afterTextChangedDialogState NumberFormatException");
            }
        }

        private void c(boolean z) {
            if (z) {
                this.f6578b.setTextColor(this.f6579c.getResources().getColor(R.color.textColorSecondary));
                this.e.setEnabled(true);
            } else {
                d();
            }
        }
    }
}
