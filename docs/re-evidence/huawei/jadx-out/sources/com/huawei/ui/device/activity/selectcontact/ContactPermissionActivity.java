package com.huawei.ui.device.activity.selectcontact;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.jsoperation.JsUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.R;
import defpackage.qzq;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class ContactPermissionActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24698b = 0;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_contact_permission);
        c();
        e();
    }

    private void c() {
        ((HealthButton) findViewById(R.id.manually_add_contact)).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.selectcontact.ContactPermissionActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("ContactPermissionActivity", "initView click manual add");
                Intent intent = new Intent(ContactPermissionActivity.this, (Class<?>) ManuallyAddContactActivity.class);
                intent.putExtra("com.huawei.community.action.MAX_SELECT_COUNT", ContactPermissionActivity.this.f24698b);
                ContactPermissionActivity.this.startActivityForResult(intent, 2);
            }
        });
    }

    private void e() {
        LogUtil.a("ContactPermissionActivity", "initData enter");
        Intent intent = getIntent();
        if (intent != null) {
            this.f24698b = intent.getIntExtra("com.huawei.community.action.MAX_SELECT_COUNT", 0);
        }
        b();
    }

    private void b() {
        String string = getString(R.string.IDS_grant_contact_permission);
        String str = String.format(Locale.ENGLISH, getString(R.string.IDS_contact_permission_description), string);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.contact_permission_description);
        int iLastIndexOf = str.lastIndexOf(string);
        if (iLastIndexOf == -1) {
            ReleaseLogUtil.e("DEVMGR_ContactPermissionActivity", "initGoSetPermission index -1");
            healthTextView.setText(str);
        } else {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new ClickableSpan() { // from class: com.huawei.ui.device.activity.selectcontact.ContactPermissionActivity.2
                @Override // android.text.style.ClickableSpan
                public void onClick(View view) {
                    LogUtil.a("ContactPermissionActivity", "initGoSetPermission allow access");
                    qzq.b(ContactPermissionActivity.this, 3);
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setColor(ContactPermissionActivity.this.getResources().getColor(R.color.textColorPrimaryActivated));
                    textPaint.setTypeface(Typeface.create(ContactPermissionActivity.this.getString(R.string.textFontFamilyMedium), 0));
                    textPaint.setUnderlineText(false);
                }
            }, iLastIndexOf, string.length() + iLastIndexOf, 33);
            healthTextView.setText(spannableString);
            healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ReleaseLogUtil.d("DEVMGR_ContactPermissionActivity", "onActivityResult requestCode:", Integer.valueOf(i), " resultCode:", Integer.valueOf(i2));
        if (i != 2) {
            if (i == 3) {
                boolean z = PermissionUtil.e(this, PermissionUtil.PermissionType.READ_CONTACT) == PermissionUtil.PermissionResult.GRANTED;
                ReleaseLogUtil.d("DEVMGR_ContactPermissionActivity", "onActivityResult hasContactPermission:", Boolean.valueOf(z));
                if (z) {
                    finish();
                    return;
                }
                return;
            }
            LogUtil.j("ContactPermissionActivity", "onActivityResult not support requestCode:", Integer.valueOf(i));
            return;
        }
        if (intent == null) {
            ReleaseLogUtil.e("DEVMGR_ContactPermissionActivity", "onActivityResult data is null");
            return;
        }
        Serializable serializableExtra = intent.getSerializableExtra(JsUtil.ServiceType.DATA);
        if (serializableExtra == null) {
            ReleaseLogUtil.e("DEVMGR_ContactPermissionActivity", "onActivityResult resultData is null");
            return;
        }
        Intent intent2 = new Intent();
        intent2.putExtra(JsUtil.ServiceType.DATA, serializableExtra);
        setResult(-1, intent2);
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
