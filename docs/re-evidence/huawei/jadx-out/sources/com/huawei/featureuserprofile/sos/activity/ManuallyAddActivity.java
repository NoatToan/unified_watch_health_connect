package com.huawei.featureuserprofile.sos.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import com.huawei.featureuserprofile.R;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.edittext.HealthEditText;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.iod;
import defpackage.lmf;
import defpackage.qqz;
import health.compact.a.LanguageUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class ManuallyAddActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f5673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthEditText f5674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f5675c;
    private HealthEditText d;
    private CustomTitleBar e;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(8192);
        setContentView(R.layout.activity_manually_add);
        b();
    }

    private void b() {
        ImageView imageView = (ImageView) findViewById(R.id.manually_add_name_image);
        this.f5673a = imageView;
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_contact));
        ImageView imageView2 = (ImageView) findViewById(R.id.manually_add_phonenumber_image);
        this.f5675c = imageView2;
        imageView2.setImageDrawable(getResources().getDrawable(R.drawable.ic_phone_number));
        this.d = (HealthEditText) findViewById(R.id.manually_add_name_edit);
        this.f5674b = (HealthEditText) findViewById(R.id.manually_add_phone_edit);
        e(this.f5675c, R.drawable.ic_phone_number);
        d();
        this.e = (CustomTitleBar) findViewById(R.id.manually_add_titlebar);
        if (a()) {
            this.e.setRightButtonVisibility(0);
        } else {
            this.e.setRightButtonVisibility(8);
        }
        this.e.setRightButtonClickable(true);
        this.e.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.featureuserprofile.sos.activity.ManuallyAddActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HashMap map = new HashMap();
                map.put("activity", "ManuallyAddActivity");
                map.put("add", 1);
                lmf.d().c(BaseApplication.getContext(), AnalyticsValue.MANUALLY_ADD_2041089.value(), map, 0);
                String string = ManuallyAddActivity.this.f5674b.getText().toString();
                String string2 = TextUtils.isEmpty(ManuallyAddActivity.this.d.getText().toString()) ? string : ManuallyAddActivity.this.d.getText().toString();
                iod iodVar = new iod();
                iodVar.d(string);
                iodVar.b(string);
                iodVar.c(string);
                iodVar.b(false);
                iodVar.e(string2);
                Intent intent = new Intent();
                intent.putExtra("contactInfo", iodVar);
                ManuallyAddActivity.this.setResult(1002, intent);
                ManuallyAddActivity.this.finish();
            }
        });
    }

    private void d() {
        this.f5674b.addTextChangedListener(new TextWatcher() { // from class: com.huawei.featureuserprofile.sos.activity.ManuallyAddActivity.2
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                LogUtil.a("ManuallyAddActivity", "manuallyAddPhone not empty");
                if (ManuallyAddActivity.this.a()) {
                    ManuallyAddActivity.this.e.setRightButtonVisibility(0);
                } else {
                    ManuallyAddActivity.this.e.setRightButtonVisibility(8);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        return !TextUtils.isEmpty(this.f5674b.getText());
    }

    private void e(ImageView imageView, int i) {
        if (LanguageUtil.ba(this)) {
            BitmapDrawable bitmapDrawableE = qqz.e(this, i);
            if (bitmapDrawableE != null) {
                imageView.setImageDrawable(bitmapDrawableE);
                return;
            }
            return;
        }
        imageView.setImageResource(i);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
