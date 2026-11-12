package com.huawei.ui.main.stories.nps.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;

/* JADX INFO: loaded from: classes43.dex */
public class NpsBackAlertDialog extends BaseDialog {
    private static final String TAG = "NpsBackAlertDialog";

    private NpsBackAlertDialog(Context context, int i) {
        super(context, i);
    }

    public static class Builder {
        private HealthButton mCommitButton;
        private View.OnClickListener mCommitClickListener;
        private String mCommitText;
        private Context mContext;
        private HealthButton mContinueButton;
        private View.OnClickListener mContinueClickListener;
        private String mContinueText;
        private NpsBackAlertDialog mDialog;
        private HealthButton mExitButton;
        private View.OnClickListener mExitClickListener;
        private String mExitText;
        private String mTitle;

        public Builder(Context context) {
            this.mContext = context;
        }

        public Builder setTitle(String str) {
            LogUtil.d(NpsBackAlertDialog.TAG, "setTitle: ", str);
            this.mTitle = str;
            return this;
        }

        public Builder setCommitButton(String str, View.OnClickListener onClickListener) {
            if (!TextUtils.isEmpty(str)) {
                this.mCommitText = str;
            }
            this.mCommitClickListener = onClickListener;
            return this;
        }

        public Builder setContinueButton(String str, View.OnClickListener onClickListener) {
            if (!TextUtils.isEmpty(str)) {
                this.mContinueText = str;
            }
            this.mContinueClickListener = onClickListener;
            return this;
        }

        public Builder setExitButton(String str, View.OnClickListener onClickListener) {
            if (!TextUtils.isEmpty(str)) {
                this.mExitText = str;
            }
            this.mExitClickListener = onClickListener;
            return this;
        }

        public NpsBackAlertDialog create() {
            Drawable drawable;
            this.mDialog = new NpsBackAlertDialog(this.mContext, R.style.CustomDialog);
            TypedValue typedValue = new TypedValue();
            this.mContext.getTheme().resolveAttribute(R.attr.customDialogStyleRefer, typedValue, true);
            if (typedValue.resourceId != 0) {
                TypedArray typedArrayObtainStyledAttributes = this.mContext.getTheme().obtainStyledAttributes(typedValue.resourceId, R.styleable.customDialogDefinition);
                drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.customDialogDefinition_dialogBackground);
                TypedValue typedValue2 = new TypedValue();
                TypedValue typedValue3 = new TypedValue();
                typedArrayObtainStyledAttributes.getValue(R.styleable.customDialogDefinition_titleTextSize, typedValue2);
                typedArrayObtainStyledAttributes.getValue(R.styleable.customDialogDefinition_contentTextSize, typedValue3);
                typedArrayObtainStyledAttributes.recycle();
            } else {
                drawable = ContextCompat.getDrawable(this.mContext, R.drawable.activity_dialog_bg);
            }
            View viewInflate = ((LayoutInflater) this.mContext.getSystemService("layout_inflater")).inflate(R.layout.device_nps_back_dialog, (ViewGroup) null);
            viewInflate.setBackground(drawable);
            setDialogTitle(viewInflate);
            setButtonStyle(viewInflate);
            this.mDialog.setContentView(viewInflate);
            return this.mDialog;
        }

        private void setDialogTitle(View view) {
            ((HealthTextView) view.findViewById(R.id.custom_text_alert_dialog_title_simple)).setText(this.mTitle);
        }

        private void setButtonStyle(View view) {
            this.mCommitButton = (HealthButton) view.findViewById(R.id.dialog_btn1);
            this.mContinueButton = (HealthButton) view.findViewById(R.id.dialog_btn2);
            this.mExitButton = (HealthButton) view.findViewById(R.id.dialog_btn3);
            this.mCommitButton.setText(this.mCommitText);
            this.mCommitButton.setAllCaps(true);
            if (this.mCommitClickListener != null) {
                this.mCommitButton.setOnClickListener(new MyCommitOnClickListener());
            }
            this.mContinueButton.setText(this.mContinueText);
            this.mContinueButton.setAllCaps(true);
            if (this.mContinueClickListener != null) {
                this.mContinueButton.setOnClickListener(new MyContinueOnClickListener());
            }
            this.mExitButton.setText(this.mExitText);
            this.mExitButton.setAllCaps(true);
            if (this.mExitClickListener != null) {
                this.mExitButton.setOnClickListener(new MyExitOnClickListener());
            }
        }

        class MyCommitOnClickListener implements View.OnClickListener {
            MyCommitOnClickListener() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                NpsBackAlertDialog.customTextAlertDialogOnClickListener(Builder.this.mDialog, Builder.this.mCommitClickListener, view);
            }
        }

        class MyContinueOnClickListener implements View.OnClickListener {
            MyContinueOnClickListener() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                NpsBackAlertDialog.customTextAlertDialogOnClickListener(Builder.this.mDialog, Builder.this.mContinueClickListener, view);
            }
        }

        class MyExitOnClickListener implements View.OnClickListener {
            MyExitOnClickListener() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                NpsBackAlertDialog.customTextAlertDialogOnClickListener(Builder.this.mDialog, Builder.this.mExitClickListener, view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void customTextAlertDialogOnClickListener(NpsBackAlertDialog npsBackAlertDialog, View.OnClickListener onClickListener, View view) {
        if (npsBackAlertDialog != null) {
            npsBackAlertDialog.dismiss();
        }
        if (onClickListener != null) {
            onClickListener.onClick(view);
        } else {
            LogUtil.d(TAG, "buttonClickListener is null");
        }
    }
}
