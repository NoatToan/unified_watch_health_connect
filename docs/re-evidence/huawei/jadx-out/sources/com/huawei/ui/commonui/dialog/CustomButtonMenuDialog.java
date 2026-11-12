package com.huawei.ui.commonui.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class CustomButtonMenuDialog extends BaseDialog {
    private Context e;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f23398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CharSequence f23399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f23400c;
        private int f;
        private final List<Integer> e = new ArrayList();
        private final List<View.OnClickListener> d = new ArrayList();

        public Builder(Context context) {
            this.f23400c = context;
        }

        public Builder c(int i) {
            this.f = i;
            return this;
        }

        public Builder a(int i) {
            this.f23398a = i;
            return this;
        }

        public Builder e(CharSequence charSequence) {
            this.f23399b = charSequence;
            return this;
        }

        public Builder a(int i, View.OnClickListener onClickListener) {
            this.e.add(Integer.valueOf(i));
            this.d.add(onClickListener);
            return this;
        }

        public CustomButtonMenuDialog d() {
            return new CustomButtonMenuDialog(this.f23400c, this);
        }
    }

    private CustomButtonMenuDialog(Context context, Builder builder) {
        super(context, R.style.CustomDialog);
        this.e = context;
        d(builder);
    }

    private void d(Builder builder) {
        View viewInflate = ((LayoutInflater) this.e.getSystemService("layout_inflater")).inflate(R.layout.commonui_btn_menu_dialog, (ViewGroup) null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.commonui_dialog_title);
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.commonui_dialog_content);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.commonui_btn_menu_dialog_btn_container);
        HealthScrollView healthScrollView = (HealthScrollView) viewInflate.findViewById(R.id.text_scrollview);
        if (qrs.v()) {
            healthScrollView.getLayoutParams().height = (int) (((double) qrs.m()) * (qrs.ac() ? 0.25d : 0.15d));
        }
        if (builder.f != 0) {
            healthTextView.setText(builder.f);
        }
        if (builder.f23398a != 0) {
            healthTextView2.setText(builder.f23398a);
        }
        if (!TextUtils.isEmpty(builder.f23399b)) {
            healthTextView2.setText(builder.f23399b);
        }
        ArrayList arrayList = new ArrayList();
        String str = "";
        for (int i = 0; i < builder.e.size(); i++) {
            int iIntValue = ((Integer) builder.e.get(i)).intValue();
            if (iIntValue != 0) {
                arrayList.add(this.e.getString(iIntValue));
                if (arrayList.get(i).length() > str.length()) {
                    str = arrayList.get(i);
                }
            }
        }
        if (!qrs.y()) {
            d(str, arrayList);
        }
        for (int i2 = 0; i2 < builder.e.size(); i2++) {
            HealthButton healthButton = new HealthButton(this.e);
            healthButton.setBackground(ContextCompat.getDrawable(this.e, R.drawable.button_background_menu_dialog));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            if (i2 > 0) {
                layoutParams.topMargin = this.e.getResources().getDimensionPixelSize(R.dimen.dialog_btn_margin_4dp);
            }
            healthButton.setLayoutParams(layoutParams);
            healthButton.setText(arrayList.get(i2));
            healthButton.setMaxLines(2);
            final View.OnClickListener onClickListener = (View.OnClickListener) builder.d.get(i2);
            healthButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.commonui.dialog.CustomButtonMenuDialog.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    onClickListener.onClick(view);
                    CustomButtonMenuDialog.this.dismiss();
                }
            });
            linearLayout.addView(healthButton);
        }
        setContentView(viewInflate);
    }

    private void d(String str, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            int length = str.length() - list.get(i).length();
            StringBuilder sb = new StringBuilder();
            if (length > 1) {
                list.set(i, a(length, sb, new StringBuilder(list.get(i))));
            }
        }
    }

    private String a(int i, StringBuilder sb, StringBuilder sb2) {
        return qrs.a(i, sb, sb2, true);
    }
}
