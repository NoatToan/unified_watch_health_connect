package com.huawei.ui.commonui.dialog;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.edittext.HealthEditText;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.qre;
import defpackage.qrs;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes16.dex */
public class CustomEditDialog extends BaseDialog {
    public CustomEditDialog(Context context) {
        super(context);
    }

    public CustomEditDialog(Context context, int i, int i2) {
        super(context, i, i2);
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog, android.app.Dialog
    public void show() {
        super.show();
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog
    public void configDialog() {
        a();
    }

    private void a() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.y = 0;
        if (qrs.aa()) {
            attributes.width = (int) (((double) qrs.i(this.mContext)) * 0.75d);
            attributes.height = (int) (((double) attributes.width) * 1.2d);
            window.setGravity(17);
            window.setBackgroundDrawableResource(R.drawable.activity_dialog_bg_next_widescreen);
        } else {
            attributes.width = qrs.i(this.mContext);
            attributes.height = -2;
            window.setGravity(80);
            window.setBackgroundDrawableResource(R.drawable.activity_dialog_bg_next);
        }
        window.setAttributes(attributes);
    }

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f23401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CustomEditDialog f23402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Context f23403c;
        private CloseBtnListener d;
        private String e;
        private final Pattern f = Pattern.compile("(?:[🌀-🗿]|[🤀-🧿]|[😀-🙏]|[🚀-\u1f6ff]|[☀-⛿]️?|[✀-➿]️?|Ⓜ️?|[🇦-🇿]{1,2}|[🅰🅱🅾🅿🆎🆑-🆚]️?|[#*0-9]️?⃣|[↔-↙↩-↪]️?|[⬅-⬇⬛⬜⭐⭕]️?|[⤴⤵]️?|[〰〽]️?|[㊗㊙]️?|[🈁🈂🈚🈯🈲-🈺🉐🉑]️?|[‼⁉]️?|[▪▫▶◀◻-◾]️?|[©®]️?|[™ℹ]️?|🀄️?|🃏️?|[⌚⌛⌨⏏⏩-⏳⏸-⏺]️?|[🨀-\u1faff])", 66);
        private int g = Integer.MAX_VALUE;
        private OnTextConformListener h;
        private HealthEditText i;
        private HealthButton j;
        private String m;
        private HealthTextView n;

        public interface CloseBtnListener {
            void onClick();
        }

        public interface EditTextTipListener {
            void setEditCheckTip(boolean z, String str, int i);
        }

        public interface OnTextConformListener {
            void onTextConform(String str, EditTextTipListener editTextTipListener);
        }

        public Builder(Context context) {
            this.f23403c = context;
        }

        public Builder e(String str) {
            this.m = str;
            return this;
        }

        public Builder a(String str) {
            this.e = str;
            return this;
        }

        public Builder c(String str) {
            this.f23401a = str;
            return this;
        }

        public Builder e(OnTextConformListener onTextConformListener) {
            this.h = onTextConformListener;
            return this;
        }

        public Builder a(CloseBtnListener closeBtnListener) {
            this.d = closeBtnListener;
            return this;
        }

        public Builder b(int i) {
            this.g = i;
            return this;
        }

        public CustomEditDialog c() {
            View viewInflate = ((LayoutInflater) this.f23403c.getSystemService("layout_inflater")).inflate(R.layout.common_edit_dialog_layout, (ViewGroup) null);
            this.f23402b = new CustomEditDialog(this.f23403c, R.style.CustomEditDialog, 0);
            a(viewInflate);
            this.f23402b.setContentView(viewInflate);
            this.f23402b.setCanceledOnTouchOutside(false);
            return this.f23402b;
        }

        private void a(View view) {
            this.n = (HealthTextView) view.findViewById(R.id.edit_dialog_check_hint);
            HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.edit_dialog_title);
            this.i = (HealthEditText) view.findViewById(R.id.edit_dialog_edit_view);
            this.j = (HealthButton) view.findViewById(R.id.edit_dialog_positive_btn);
            healthTextView.setText(this.m);
            e();
            d();
            b(view);
        }

        private void e() {
            this.j.setOnClickListener(new View.OnClickListener() { // from class: qjw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f46329c.e(view);
                }
            });
        }

        public /* synthetic */ void e(View view) {
            if (qrs.e(view)) {
                LogUtil.a("CustomEditDialog_Builder", "PositiveButton fast click");
                return;
            }
            OnTextConformListener onTextConformListener = this.h;
            if (onTextConformListener != null) {
                onTextConformListener.onTextConform(this.i.getText().toString(), new EditTextTipListener() { // from class: qjv
                    @Override // com.huawei.ui.commonui.dialog.CustomEditDialog.Builder.EditTextTipListener
                    public final void setEditCheckTip(boolean z, String str, int i) {
                        this.f46328c.e(z, str, i);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(boolean z, final String str, final int i) {
            CustomEditDialog customEditDialog = this.f23402b;
            if (customEditDialog == null) {
                LogUtil.e("CustomEditDialog_Builder", "mEditDialog is null");
            } else if (z) {
                customEditDialog.dismiss();
            } else {
                customEditDialog.getBuildHandler().post(new Runnable() { // from class: qju
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e.e(str, i);
                    }
                });
            }
        }

        public /* synthetic */ void e(String str, int i) {
            HealthTextView healthTextView = this.n;
            if (healthTextView != null) {
                healthTextView.setText(str);
                this.n.setTextColor(i);
            }
        }

        private void d() {
            e(false);
            this.i.setHint(this.e);
            this.i.addTextChangedListener(new TextWatcher() { // from class: com.huawei.ui.commonui.dialog.CustomEditDialog.Builder.5
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
                    Builder.this.c(editable);
                }
            });
            a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(final Editable editable) {
            this.f23402b.getBuildHandler().post(new Runnable() { // from class: qjx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f46331c.e(editable);
                }
            });
        }

        public /* synthetic */ void e(Editable editable) {
            try {
                if (editable.toString().getBytes("gbk").length >= this.g) {
                    this.n.setText(this.f23401a);
                    this.n.setTextColor(qre.e(R.color.change_record_name_tip));
                } else {
                    this.n.setText("");
                }
            } catch (UnsupportedEncodingException e) {
                LogUtil.e("CustomEditDialog_Builder", e);
            }
            e(!TextUtils.isEmpty(editable.toString()));
        }

        private void e(boolean z) {
            HealthButton healthButton = this.j;
            if (healthButton == null) {
                return;
            }
            if (z) {
                healthButton.setAlpha(1.0f);
                this.j.setEnabled(true);
                this.j.setTextColor(this.f23403c.getColor(R.color.color_ffffffff));
            } else {
                healthButton.setEnabled(false);
                this.j.setAlpha(0.4f);
                this.j.setTextColor(this.f23403c.getColor(R.color.color_ffffffff));
            }
        }

        private void a() {
            InputFilter inputFilter = new InputFilter() { // from class: com.huawei.ui.commonui.dialog.CustomEditDialog.Builder.3
                @Override // android.text.InputFilter
                public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                    try {
                        if (spanned.toString().getBytes("gbk").length + charSequence.subSequence(i, i2).toString().getBytes("gbk").length > Builder.this.g) {
                            return "";
                        }
                        return null;
                    } catch (UnsupportedEncodingException e) {
                        LogUtil.e("CustomEditDialog_Builder", e);
                        return null;
                    }
                }
            };
            InputFilter inputFilter2 = new InputFilter() { // from class: com.huawei.ui.commonui.dialog.CustomEditDialog.Builder.2
                @Override // android.text.InputFilter
                public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                    if (!Builder.this.f.matcher(charSequence).find()) {
                        return null;
                    }
                    LogUtil.d("CustomEditDialog_Builder", "can not insert emoji");
                    return "";
                }
            };
            ArrayList arrayList = new ArrayList(Arrays.asList(this.i.getFilters()));
            arrayList.add(inputFilter);
            arrayList.add(inputFilter2);
            this.i.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[0]));
        }

        private void b(View view) {
            ((HealthImageView) view.findViewById(R.id.edit_dialog_close_btn)).setOnClickListener(new View.OnClickListener() { // from class: qkc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f46377c.d(view2);
                }
            });
        }

        public /* synthetic */ void d(View view) {
            if (qrs.e(view)) {
                LogUtil.a("CustomEditDialog_Builder", "closeBtn fast click");
                return;
            }
            CustomEditDialog customEditDialog = this.f23402b;
            if (customEditDialog != null) {
                customEditDialog.dismiss();
            }
            CloseBtnListener closeBtnListener = this.d;
            if (closeBtnListener != null) {
                closeBtnListener.onClick();
            }
        }
    }
}
