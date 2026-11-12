package com.huawei.ui.commonui.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qqf;
import defpackage.qrs;

/* JADX INFO: loaded from: classes16.dex */
public class CustomImageDialog extends BaseDialog {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f23407c;

    private CustomImageDialog(Context context, int i) {
        super(context, i, 0);
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog, android.app.Dialog
    public void show() {
        e();
        super.show();
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog
    public void configDialog() {
        e();
    }

    private void e() {
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.height = -2;
            if (qrs.af(getContext())) {
                window.setGravity(17);
                attributes.width = (int) getContext().getResources().getDimension(R.dimen.health_common_480dp);
                this.f23407c.setBackgroundResource(R.drawable.activity_dialog_bg);
            } else {
                window.setGravity(81);
                attributes.width = -1;
                this.f23407c.setBackgroundResource(R.drawable.activity_dialog_top_radius_bg);
            }
            window.setWindowAnimations(R.style.track_dialog_anim);
        }
    }

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f23408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f23409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private View.OnClickListener f23410c;
        private View.OnClickListener d;
        private String e;
        private final Context f;
        private View.OnClickListener g;
        private String h;
        private View.OnClickListener i;
        private CustomImageDialog j;
        private int k;
        private String o;

        public Builder(Context context) {
            this.f = context;
        }

        public Builder e(int i) {
            this.k = i;
            return this;
        }

        public Builder c(String str) {
            this.o = str;
            return this;
        }

        public Builder a(String str) {
            this.h = str;
            return this;
        }

        public Builder e(String str) {
            this.f23409b = str;
            return this;
        }

        public Builder b(String str) {
            this.f23408a = str;
            return this;
        }

        public Builder d(String str) {
            this.e = str;
            return this;
        }

        public Builder e(View.OnClickListener onClickListener) {
            this.g = onClickListener;
            return this;
        }

        public Builder b(View.OnClickListener onClickListener) {
            this.d = onClickListener;
            return this;
        }

        public Builder c(View.OnClickListener onClickListener) {
            this.i = onClickListener;
            return this;
        }

        public Builder a(View.OnClickListener onClickListener) {
            this.f23410c = onClickListener;
            return this;
        }

        public CustomImageDialog b() {
            LayoutInflater layoutInflater = (LayoutInflater) this.f.getSystemService("layout_inflater");
            CustomImageDialog customImageDialog = new CustomImageDialog(this.f, R.style.CustomDialog);
            this.j = customImageDialog;
            customImageDialog.f23407c = layoutInflater.inflate(R.layout.layout_image_three_btn_dialog, (ViewGroup) null);
            HealthTextView healthTextView = (HealthTextView) this.j.f23407c.findViewById(R.id.custom_text_dialog_title);
            ImageView imageView = (ImageView) this.j.f23407c.findViewById(R.id.dialog_image_content);
            HealthTextView healthTextView2 = (HealthTextView) this.j.f23407c.findViewById(R.id.custom_text_dialog_content);
            ImageView imageView2 = (ImageView) this.j.f23407c.findViewById(R.id.dialog_close_icon);
            HealthButton healthButton = (HealthButton) this.j.f23407c.findViewById(R.id.dialog_one_btn);
            HealthButton healthButton2 = (HealthButton) this.j.f23407c.findViewById(R.id.dialog_two_btn);
            HealthButton healthButton3 = (HealthButton) this.j.f23407c.findViewById(R.id.dialog_three_btn);
            if (!TextUtils.isEmpty(this.o)) {
                healthTextView.setText(this.o);
            }
            b(healthTextView2, this.h);
            b(healthButton, this.f23409b);
            b(healthButton2, this.f23408a);
            b(healthButton3, this.e);
            int i = this.k;
            if (i != 0) {
                qqf.a(i, imageView, (int) this.f.getResources().getDimension(R.dimen.emui_corner_radius_dialog));
            } else {
                LogUtil.a("CustomImageDialog", "mImage = null");
            }
            e(healthButton, this.j.f23407c, this.f23410c);
            e(healthButton2, this.j.f23407c, this.d);
            e(healthButton3, this.j.f23407c, this.i);
            e(imageView2, this.j.f23407c, this.g);
            CustomImageDialog customImageDialog2 = this.j;
            customImageDialog2.setContentView(customImageDialog2.f23407c);
            return this.j;
        }

        private void b(TextView textView, String str) {
            if (!TextUtils.isEmpty(str)) {
                textView.setText(str);
            } else {
                textView.setVisibility(8);
            }
        }

        private void e(View view, final View view2, final View.OnClickListener onClickListener) {
            view.setOnClickListener(new View.OnClickListener() { // from class: qkb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.f46375a.a(onClickListener, view2, view3);
                }
            });
        }

        public /* synthetic */ void a(View.OnClickListener onClickListener, View view, View view2) {
            CustomImageDialog customImageDialog = this.j;
            if (customImageDialog != null) {
                customImageDialog.dismiss();
            }
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }
}
