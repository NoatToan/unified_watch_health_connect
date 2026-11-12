package com.huawei.ui.device.activity.selectcontact;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.datatype.Contact;
import com.huawei.datatype.PhoneNumber;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.jsoperation.JsUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.device.R;
import com.huawei.ui.device.views.selectcontact.ManuallyAddContactAdapter;
import defpackage.qre;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public class ManuallyAddContactActivity extends BaseActivity implements IUpdateListItemListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f24699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomTitleBar f24700b;
    private ArrayList<Contact> d = new ArrayList<>(16);

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_manually_add_contact);
        e();
        b();
        d();
    }

    private void e() {
        this.f24700b = (CustomTitleBar) findViewById(R.id.manually_add_contact_title);
        LogUtil.a("ManuallyAddContactActivity", "initTitleBar enter");
        this.f24700b.setRightButtonVisibility(0);
        this.f24700b.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.selectcontact.ManuallyAddContactActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ArrayList arrayList = new ArrayList(16);
                for (Contact contact : ManuallyAddContactActivity.this.d) {
                    String name = contact.getName();
                    String strA = ManuallyAddContactAdapter.a(contact);
                    if (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(strA)) {
                        arrayList.add(contact);
                    }
                }
                Intent intent = new Intent();
                intent.putExtra(JsUtil.ServiceType.DATA, arrayList);
                ManuallyAddContactActivity.this.setResult(-1, intent);
                ManuallyAddContactActivity.this.finish();
            }
        });
        this.f24700b.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.selectcontact.ManuallyAddContactActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ManuallyAddContactActivity.this.finish();
            }
        });
        updateSaveButtonState(false);
    }

    private void b() {
        Intent intent = getIntent();
        if (intent != null) {
            this.f24699a = intent.getIntExtra("com.huawei.community.action.MAX_SELECT_COUNT", 0);
        }
    }

    private void d() {
        Contact contact = new Contact();
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(new PhoneNumber());
        contact.setPhoneNumbers(arrayList);
        this.d.add(contact);
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.manually_add_contact_recyclerView);
        ManuallyAddContactAdapter manuallyAddContactAdapter = new ManuallyAddContactAdapter(this, this.d, this, this.f24699a);
        manuallyAddContactAdapter.setHasStableIds(true);
        healthRecycleView.setLayoutManager(new LinearLayoutManager(this));
        healthRecycleView.setAdapter(manuallyAddContactAdapter);
    }

    @Override // com.huawei.ui.device.activity.selectcontact.IUpdateListItemListener
    public void updateSaveButtonState(boolean z) {
        if (z) {
            this.f24700b.setRightButtonClickable(true);
            this.f24700b.setRightButtonDrawable(getResources().getDrawable(R.drawable.ic_public_ok), qre.f(R.string.IDS_contact_confirm));
        } else {
            this.f24700b.setRightButtonClickable(false);
            this.f24700b.setRightButtonDrawable(getResources().getDrawable(R.drawable.ic_ok_un_click), qre.f(R.string.IDS_contact_confirm));
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
