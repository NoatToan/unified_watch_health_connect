package com.huawei.ui.commonui.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;

/* JADX INFO: loaded from: classes16.dex */
public class CommonDialog21 extends BaseDialog {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthProgressBar f23382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f23383c;

    public CommonDialog21(Context context) {
        super(context);
    }

    public CommonDialog21(Context context, int i) {
        super(context, i);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public static CommonDialog21 b(Context context) {
        return d(context, R.style.common_dialog21);
    }

    public static CommonDialog21 a(Context context, int i) {
        return d(context, i);
    }

    private static CommonDialog21 d(Context context, int i) {
        CommonDialog21 commonDialog21 = new CommonDialog21(context, i);
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.commonui_loading21, (ViewGroup) null);
        commonDialog21.f23383c = (HealthTextView) viewInflate.findViewById(R.id.BasicInfo_check_textView);
        HealthProgressBar healthProgressBar = (HealthProgressBar) viewInflate.findViewById(R.id.BasicInfo_check_img);
        commonDialog21.f23382b = healthProgressBar;
        healthProgressBar.setLayerType(1, null);
        commonDialog21.f23382b.setVisibility(0);
        commonDialog21.addContentView(viewInflate, new ViewGroup.LayoutParams(-1, -2));
        return commonDialog21;
    }

    public void b(String str) {
        if (this.f23383c == null || str == null) {
            return;
        }
        int color = ContextCompat.getColor(this.mContext, R.color.textColorPrimary);
        float dimension = this.mContext.getResources().getDimension(R.dimen.default_text_font_size_large2);
        this.f23383c.setTextColor(color);
        this.f23383c.setTextSize(0, dimension);
        this.f23383c.setText(str);
    }

    public void c() {
        show();
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        LogUtil.a("CommonDialog21", "enter dismiss");
        super.dismiss();
        if (this.f23382b != null) {
            this.f23382b = null;
        }
    }
}
