package com.huawei.phoneservice.feedback.ui;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.huawei.openalliance.ad.constant.OsType;
import com.huawei.phoneservice.faq.base.util.g;
import com.huawei.phoneservice.faq.base.widget.c;
import com.huawei.uikit.hwresources.R;

/* JADX INFO: loaded from: classes13.dex */
public abstract class FeedBaseActivity extends FeedbackAbstractBaseActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ProgressDialog f21697c;
    public AlertDialog d;

    public TextView v() {
        return (TextView) getWindow().findViewById(Resources.getSystem().getIdentifier("action_bar_title", "id", OsType.ANDROID));
    }

    public void u() {
        ProgressDialog progressDialog;
        if (isFinishing() || isDestroyed() || (progressDialog = this.f21697c) == null || !progressDialog.isShowing()) {
            return;
        }
        this.f21697c.dismiss();
        this.f21697c = null;
    }

    public void t() {
        try {
            AlertDialog alertDialog = this.d;
            if (alertDialog == null || !alertDialog.isShowing()) {
                return;
            }
            this.d.dismiss();
            this.d = null;
        } catch (Exception e2) {
            g.c("FeedBaseActivity", e2.getMessage());
        }
    }

    public void showAlertDialog(View view) {
        a(view, true);
    }

    @Override // android.app.Activity
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            c.d(actionBar, charSequence);
        }
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected int s() {
        return R.dimen.emui_dimens_max_start;
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected int p() {
        return R.dimen.padding_m;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        setTitle(getTitle());
        super.onResume();
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        u();
        t();
        super.onDestroy();
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            try {
                c.d(actionBar, true, new a());
                c.e(actionBar, true);
                TextView textViewV = v();
                if (textViewV != null) {
                    c.c(actionBar, textViewV);
                }
                actionBar.setHomeActionContentDescription(com.huawei.phoneservice.feedback.R.string.feedback_sdk_back);
            } catch (Exception e2) {
                g.c("FeedBaseActivity", e2.getMessage());
            }
        }
    }

    public void a(String str, String str2, String str3, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        View viewInflate = getLayoutInflater().inflate(com.huawei.phoneservice.feedback.R.layout.feedback_sdk_dialog_upload_prompt, (ViewGroup) null);
        if (viewInflate == null) {
            return;
        }
        TextView textView = (TextView) viewInflate.findViewById(com.huawei.phoneservice.feedback.R.id.txtContent);
        TextView textView2 = (TextView) viewInflate.findViewById(com.huawei.phoneservice.feedback.R.id.btnYes);
        TextView textView3 = (TextView) viewInflate.findViewById(com.huawei.phoneservice.feedback.R.id.btnNo);
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            textView2.setText(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            textView3.setText(str3);
        }
        if (onClickListener != null) {
            textView2.setOnClickListener(onClickListener);
        }
        if (onClickListener2 != null) {
            textView3.setOnClickListener(onClickListener2);
        }
        a(viewInflate, false);
    }

    protected void a(View view, boolean z) {
        Window window;
        if (isFinishing()) {
            return;
        }
        AlertDialog alertDialog = this.d;
        if (alertDialog == null || !alertDialog.isShowing()) {
            this.d = null;
            AlertDialog alertDialogCreate = new AlertDialog.Builder(this).create();
            this.d = alertDialogCreate;
            alertDialogCreate.setCanceledOnTouchOutside(z);
            this.d.setCancelable(z);
            AlertDialog alertDialog2 = this.d;
            if (alertDialog2 == null || alertDialog2.isShowing()) {
                return;
            }
            this.d.show();
            this.d.setContentView(view);
            if (this.f21725a && (window = this.d.getWindow()) != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                window.setGravity(80);
                attributes.y = 50;
                attributes.dimAmount = 0.2f;
                window.setAttributes(attributes);
            }
        }
    }

    public void a(View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        View viewInflate = getLayoutInflater().inflate(com.huawei.phoneservice.feedback.R.layout.feedback_sdk_dialog_delete_history, (ViewGroup) null);
        if (viewInflate == null) {
            return;
        }
        TextView textView = (TextView) viewInflate.findViewById(com.huawei.phoneservice.feedback.R.id.delete_history_dialog_cancel);
        TextView textView2 = (TextView) viewInflate.findViewById(com.huawei.phoneservice.feedback.R.id.delete_history_dialog_delete);
        if (textView == null || textView2 == null) {
            return;
        }
        if (onClickListener != null) {
            textView.setOnClickListener(onClickListener);
        }
        if (onClickListener2 != null) {
            textView2.setOnClickListener(onClickListener2);
        }
        a(viewInflate, false);
    }

    static class d implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        private d() {
        }
    }

    public void a(Activity activity, String str, String str2, CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        if (isFinishing()) {
            return;
        }
        AlertDialog alertDialog = this.d;
        if (alertDialog == null || !alertDialog.isShowing()) {
            a aVar = null;
            if (!this.f21725a) {
                AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setTitle(str).setCancelable(false).setNegativeButton(str2, new d(aVar)).setSingleChoiceItems(charSequenceArr, i, onClickListener).create();
                this.d = alertDialogCreate;
                alertDialogCreate.setCanceledOnTouchOutside(true);
                com.huawei.phoneservice.faq.base.util.a.d(this.d);
                return;
            }
            AlertDialog alertDialogCreate2 = new AlertDialog.Builder(activity).create();
            this.d = alertDialogCreate2;
            alertDialogCreate2.setCanceledOnTouchOutside(false);
            AlertDialog alertDialog2 = this.d;
            if (alertDialog2 == null || alertDialog2.isShowing()) {
                return;
            }
            this.d.show();
            View viewInflate = getLayoutInflater().inflate(com.huawei.phoneservice.feedback.R.layout.feedback_sdk_dialog_list, (ViewGroup) null);
            ((TextView) viewInflate.findViewById(com.huawei.phoneservice.feedback.R.id.title)).setText(str);
            TextView textView = (TextView) viewInflate.findViewById(com.huawei.phoneservice.feedback.R.id.cancel);
            textView.setText(str2);
            textView.setOnClickListener(new b());
            a(viewInflate, charSequenceArr, i, onClickListener);
        }
    }

    class a implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FeedBaseActivity.this.onBackPressed(view);
        }

        a() {
        }
    }

    class b implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FeedBaseActivity.this.t();
        }

        b() {
        }
    }

    class e implements AdapterView.OnItemClickListener {
        final /* synthetic */ DialogInterface.OnClickListener e;

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            DialogInterface.OnClickListener onClickListener = this.e;
            if (onClickListener != null) {
                onClickListener.onClick(FeedBaseActivity.this.d, i);
            }
        }

        e(DialogInterface.OnClickListener onClickListener) {
            this.e = onClickListener;
        }
    }

    public void a(long j, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        View viewInflate = getLayoutInflater().inflate(com.huawei.phoneservice.feedback.R.layout.feedback_sdk_dialog_upload_flow, (ViewGroup) null);
        if (viewInflate == null) {
            return;
        }
        TextView textView = (TextView) viewInflate.findViewById(com.huawei.phoneservice.feedback.R.id.txtContent);
        TextView textView2 = (TextView) viewInflate.findViewById(com.huawei.phoneservice.feedback.R.id.btnYes);
        TextView textView3 = (TextView) viewInflate.findViewById(com.huawei.phoneservice.feedback.R.id.btnNo);
        if (textView == null || textView2 == null || textView3 == null) {
            return;
        }
        textView.setText("CN".equals(com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk("country")) ? getResources().getString(com.huawei.phoneservice.feedback.R.string.feedback_sdk_upload_flow_zh, Formatter.formatFileSize(this, j)) : getString(com.huawei.phoneservice.feedback.R.string.feedback_sdk_upload_flow, new Object[]{Formatter.formatFileSize(this, j)}));
        if (onClickListener != null) {
            textView2.setOnClickListener(onClickListener);
        }
        if (onClickListener2 != null) {
            textView3.setOnClickListener(onClickListener2);
        }
        showAlertDialog(viewInflate);
    }

    private void a(View view, CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        ListView listView = (ListView) view.findViewById(com.huawei.phoneservice.feedback.R.id.list);
        listView.setAdapter((ListAdapter) new com.huawei.phoneservice.feedback.adapter.e(charSequenceArr, i));
        listView.setOnItemClickListener(new e(onClickListener));
        this.d.setContentView(view);
        Window window = this.d.getWindow();
        if (window == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        window.setGravity(80);
        attributes.y = 50;
        attributes.dimAmount = 0.2f;
        window.setAttributes(attributes);
    }
}
