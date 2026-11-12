package com.huawei.featureuserprofile.sos.activity;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.featureuserprofile.R;
import com.huawei.featureuserprofile.sos.adapter.EditContactAdapter;
import com.huawei.featureuserprofile.sos.interf.ContactInfoChangeListener;
import com.huawei.featureuserprofile.sos.manager.EmergencyInfoManager;
import com.huawei.featureuserprofile.sos.manager.WrapContentLinearLayoutManager;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import defpackage.cxy;
import defpackage.cxz;
import defpackage.cyb;
import defpackage.iod;
import defpackage.njy;
import defpackage.qpx;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class EditContactActivity extends BaseActivity implements EditContactAdapter.EditContactAdapterCallback, ContactInfoChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EditContactAdapter f5650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EmergencyInfoManager.e f5651c;
    private boolean d;
    private RelativeLayout g;
    private CustomAlertDialog i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<iod> f5649a = new ArrayList(10);
    private Handler e = new Handler(Looper.getMainLooper());

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(8192);
        setContentView(R.layout.edit_contact_activity_layout);
        i();
        f();
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.recycler_view);
        healthRecycleView.setLayoutManager(new WrapContentLinearLayoutManager(this, 1, false));
        EditContactAdapter editContactAdapter = new EditContactAdapter(this, this.f5649a);
        this.f5650b = editContactAdapter;
        healthRecycleView.setAdapter(editContactAdapter);
        healthRecycleView.b(false);
        healthRecycleView.e(false);
        h();
        setViewSafeRegion(false, healthRecycleView);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rel_route_loading);
        this.g = relativeLayout;
        relativeLayout.setVisibility(8);
        LogUtil.a("EditContactActivity", "onCreate");
        List<iod> list = this.f5649a;
        if (list == null || list.isEmpty()) {
            LogUtil.a("EditContactActivity", "onCreate contact infos is null or empty ");
        } else if (!PermissionUtil.b(this, new String[]{"android.permission.READ_CONTACTS"})) {
            LogUtil.a("EditContactActivity", "onCreate no read contact permission ");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: cxv
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.a();
                }
            });
        }
    }

    public /* synthetic */ void a() {
        try {
            EmergencyInfoManager.a().c(this.f5649a, true);
            LogUtil.a("EditContactActivity", "onCreate start sync contacts ");
        } catch (Exception e) {
            LogUtil.e("EditContactActivity", "onCreate Failed to update emergency contacts", e);
        }
    }

    private void i() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.edit_contact_title_bar);
        customTitleBar.setRightButtonVisibility(8);
        customTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.featureuserprofile.sos.activity.EditContactActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EditContactActivity.this.finish();
            }
        });
    }

    private void f() {
        this.f5649a = cxz.e("emergency_contacts", getApplicationContext(), cxz.b(this));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        j();
        LogUtil.a("EditContactActivity", BaseDialog.LIFE_CYCLE_ON_RESUME);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        a(this.i);
        o();
        this.f5649a.clear();
        this.f5649a = null;
        LogUtil.a("EditContactActivity", "onDestroy");
    }

    private void o() {
        EmergencyInfoManager.a().m();
    }

    private void a(CustomAlertDialog customAlertDialog) {
        if (customAlertDialog == null || !customAlertDialog.isShowing()) {
            return;
        }
        customAlertDialog.dismiss();
    }

    @Override // com.huawei.featureuserprofile.sos.adapter.EditContactAdapter.EditContactAdapterCallback
    public void onAddContact() {
        c();
    }

    @Override // com.huawei.featureuserprofile.sos.adapter.EditContactAdapter.EditContactAdapterCallback
    public void onManuallyAddContact() {
        startActivityForResult(new Intent(this, (Class<?>) ManuallyAddActivity.class), 1002);
    }

    private void c() {
        PermissionUtil.d(this, PermissionUtil.PermissionType.READ_CONTACT, new c(this));
    }

    /* JADX INFO: loaded from: classes6.dex */
    static class c extends CustomPermissionAction {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<EditContactActivity> f5667c;

        c(EditContactActivity editContactActivity) {
            super(editContactActivity);
            this.f5667c = new WeakReference<>(editContactActivity);
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            EditContactActivity editContactActivity = this.f5667c.get();
            if (editContactActivity == null) {
                return;
            }
            try {
                editContactActivity.startActivityForResult(new Intent("android.intent.action.PICK", ContactsContract.CommonDataKinds.Phone.CONTENT_URI), 1001);
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("EditContactActivity", "activity not found: Intent.ACTION_PICK");
            }
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onDenied(String str) {
            if (this.f5667c.get() == null) {
                return;
            }
            LogUtil.j("EditContactActivity", "permission denied");
            super.onDenied(str);
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
            if (this.f5667c.get() == null) {
                return;
            }
            LogUtil.j("EditContactActivity", "permission forever denied, show the guide window");
            super.onForeverDenied(permissionType);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        super.onActivityResult(i, i2, intent);
        if (i == 1001 && i2 == -1 && intent != null && (data = intent.getData()) != null) {
            iod iodVarB = EmergencyInfoManager.a().b(data);
            LogUtil.d("EditContactActivity", "contactInfo uri: ", data, "contactInfo: ", iodVarB.toString());
            if (iodVarB != null && !TextUtils.isEmpty(iodVarB.d())) {
                a(iodVarB);
            }
        }
        if (i != 1002 || intent == null) {
            return;
        }
        Serializable serializableExtra = intent.getSerializableExtra("contactInfo");
        if (serializableExtra instanceof iod) {
            a((iod) serializableExtra);
        }
    }

    private void a(final iod iodVar) {
        if (this.f5649a.contains(iodVar) || !this.f5649a.add(iodVar)) {
            return;
        }
        this.e.post(new Runnable() { // from class: com.huawei.featureuserprofile.sos.activity.EditContactActivity.4
            @Override // java.lang.Runnable
            public void run() {
                EditContactActivity.this.f5650b.notifyItemInserted(EditContactActivity.this.f5649a.indexOf(iodVar));
            }
        });
        EmergencyInfoManager.a().c(this.f5649a, true);
    }

    @Override // com.huawei.featureuserprofile.sos.adapter.EditContactAdapter.EditContactAdapterCallback
    public void showRemoveContactDialog(EmergencyInfoManager.e eVar) {
        if (eVar == null) {
            LogUtil.j("EditContactActivity", "showRemoveContactDialog contact is null");
            return;
        }
        if (this.i == null) {
            this.i = e().b();
        }
        this.f5651c = eVar;
        String strC = eVar.c();
        CustomAlertDialog customAlertDialog = this.i;
        Locale locale = Locale.ENGLISH;
        String string = getString(R.string.IDS_remove_contact);
        if (strC.trim().length() == 0) {
            strC = eVar.d();
        }
        customAlertDialog.e(String.format(locale, string, strC));
        this.i.show();
    }

    private CustomAlertDialog.Builder e() {
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this);
        builder.d(R.string.IDS_remove_emergency_contact_text);
        builder.a(R.string.IDS_emergency_cancel, new DialogInterface.OnClickListener() { // from class: com.huawei.featureuserprofile.sos.activity.EditContactActivity.7
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                LogUtil.a("EditContactActivity", "Canceling the deletion of a contact");
            }
        });
        builder.d(R.string.IDS_remove, new DialogInterface.OnClickListener() { // from class: com.huawei.featureuserprofile.sos.activity.EditContactActivity.9
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                ReleaseLogUtil.d("R_EditContactActivity", "click to remove emergency contact");
                EditContactActivity.this.d();
            }
        });
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        EmergencyInfoManager.e eVar;
        if (this.i == null || (eVar = this.f5651c) == null) {
            LogUtil.j("EditContactActivity", "deleteContact mRemoveContactDialog or mDelContact is null");
            return;
        }
        if (TextUtils.isEmpty(eVar.c()) || TextUtils.isEmpty(this.f5651c.d())) {
            LogUtil.a("EditContactActivity", "delete contact name or phoneNumber is Null");
            return;
        }
        int i = 0;
        while (true) {
            if (i >= this.f5649a.size()) {
                i = -1;
                break;
            }
            iod iodVar = this.f5649a.get(i);
            LogUtil.d("EditContactActivity", "contactInfo uri: ", iodVar.a(), "contactInfo: ", this.f5651c.b().toString());
            if (iodVar.a().equals(this.f5651c.b().toString())) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            LogUtil.a("EditContactActivity", "mDelContact is not exists in mEmergencyContactInfo");
        } else if (Utils.o()) {
            LogUtil.a("EditContactActivity", "is oversea");
            d(i);
        } else {
            this.g.setVisibility(0);
            c(i);
        }
    }

    private void c(final int i) {
        cyb.a(new ResultCallback<cxy>() { // from class: com.huawei.featureuserprofile.sos.activity.EditContactActivity.10
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(cxy cxyVar) {
                if (cxyVar.getResultCode().intValue() == 0) {
                    LogUtil.a("EditContactActivity", "queryFollowUsers success");
                    if (!njy.e(cxyVar.a())) {
                        EditContactActivity.this.e(cxyVar, i);
                        return;
                    }
                    LogUtil.a("EditContactActivity", "familyCareRelations is empty");
                    EditContactActivity.this.b();
                    EditContactActivity.this.d(i);
                    return;
                }
                LogUtil.a("EditContactActivity", "queryFollowUsers failure,code = ", cxyVar.getResultCode());
                onFailure(null);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.a("EditContactActivity", "queryFollowUsers failure");
                EditContactActivity.this.b();
                EditContactActivity.this.e(R.string.IDS_edit_contact_fail);
            }
        });
    }

    private void j() {
        final int size = this.f5649a.size();
        boolean z = cxz.a(getApplicationContext()) || size >= 3;
        if (this.d != z) {
            return;
        }
        boolean z2 = !z;
        this.d = z2;
        this.f5650b.a(z2);
        if (this.d) {
            this.e.post(new Runnable() { // from class: com.huawei.featureuserprofile.sos.activity.EditContactActivity.8
                @Override // java.lang.Runnable
                public void run() {
                    EditContactActivity.this.f5650b.notifyItemInserted(size);
                }
            });
        } else {
            this.e.post(new Runnable() { // from class: com.huawei.featureuserprofile.sos.activity.EditContactActivity.6
                @Override // java.lang.Runnable
                public void run() {
                    EditContactActivity.this.f5650b.notifyItemRemoved(size);
                }
            });
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        LogUtil.d("EditContactActivity", "onRequestPermissionsResult requestCode ", Integer.valueOf(i));
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    private void h() {
        if (PermissionUtil.b(this, new String[]{"android.permission.READ_CONTACTS"})) {
            EmergencyInfoManager.a().c(this);
            LogUtil.a("EditContactActivity", "registerContactChangeListener()");
        } else {
            LogUtil.a("EditContactActivity", "permission.READ_CONTACTS not request");
        }
    }

    @Override // com.huawei.featureuserprofile.sos.interf.ContactInfoChangeListener
    public void onContactInfoChange() {
        g();
        j();
    }

    private void g() {
        List<iod> listB = EmergencyInfoManager.a().b(this);
        ArrayList<iod> arrayList = new ArrayList(10);
        arrayList.addAll(this.f5649a);
        for (iod iodVar : arrayList) {
            if (iodVar == null) {
                LogUtil.j("EditContactActivity", "refreshUi contactInfo is null");
            } else {
                int iIndexOf = this.f5649a.indexOf(iodVar);
                for (iod iodVar2 : listB) {
                    if (iodVar2 == null) {
                        LogUtil.j("EditContactActivity", "refreshUi newInfo is null");
                    } else if (iodVar.a() == null || iodVar2.a() == null) {
                        LogUtil.j("EditContactActivity", "refreshUi getUri() is null");
                    } else if (iodVar.d() == null || iodVar2.d() == null) {
                        LogUtil.j("EditContactActivity", "refreshUi getContactVersion() is null");
                    } else if (iodVar.a().equals(iodVar2.a()) && !iodVar.d().equals(iodVar2.d())) {
                        b(iIndexOf);
                    }
                }
                if (!e(listB, iodVar.a())) {
                    a(iIndexOf);
                    this.f5649a.remove(iIndexOf);
                }
            }
        }
    }

    private void b(final int i) {
        this.e.post(new Runnable() { // from class: com.huawei.featureuserprofile.sos.activity.EditContactActivity.12
            @Override // java.lang.Runnable
            public void run() {
                EditContactActivity.this.f5650b.notifyItemChanged(i);
            }
        });
    }

    private boolean e(List<iod> list, String str) {
        if (list == null || str == null) {
            LogUtil.j("EditContactActivity", "containsUri info or uri is null");
            return false;
        }
        for (iod iodVar : list) {
            if (iodVar == null || iodVar.a() == null) {
                LogUtil.j("EditContactActivity", "containsUri contactInfo or getUri is null");
                break;
            }
            if (iodVar.a().equals(str)) {
                return true;
            }
        }
        return false;
    }

    private void a(final int i) {
        if (cxz.c(getApplicationContext()) && this.f5649a.size() == 0) {
            finish();
        } else {
            this.e.post(new Runnable() { // from class: com.huawei.featureuserprofile.sos.activity.EditContactActivity.13
                @Override // java.lang.Runnable
                public void run() {
                    EditContactActivity.this.f5650b.notifyItemRemoved(i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(cxy cxyVar, int i) {
        boolean z = false;
        for (cxy.e eVar : cxyVar.a()) {
            if (this.f5651c.c().equals(eVar.d()) && this.f5651c.d().equals(eVar.c())) {
                b(eVar.b(), i);
                z = true;
            }
        }
        if (z) {
            return;
        }
        LogUtil.a("EditContactActivity", "no one match");
        b();
        d(i);
    }

    private void b(long j, final int i) {
        LogUtil.a("EditContactActivity", "deleteFamilyCareUser,huid: ", Long.valueOf(j));
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j));
        cyb.d(arrayList, new ResultCallback<CloudCommonReponse>() { // from class: com.huawei.featureuserprofile.sos.activity.EditContactActivity.2
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(CloudCommonReponse cloudCommonReponse) {
                EditContactActivity.this.d(i);
                EditContactActivity.this.b();
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                EditContactActivity.this.b();
                EditContactActivity.this.e(R.string.IDS_edit_contact_fail);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final int i) {
        this.e.post(new Runnable() { // from class: com.huawei.featureuserprofile.sos.activity.EditContactActivity.3
            @Override // java.lang.Runnable
            public void run() {
                qpx.e(EditContactActivity.this, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.e.post(new Runnable() { // from class: com.huawei.featureuserprofile.sos.activity.EditContactActivity.5
            @Override // java.lang.Runnable
            public void run() {
                EditContactActivity.this.g.setVisibility(8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        ReleaseLogUtil.d("R_EditContactActivity", "removeDelItem");
        this.f5649a.remove(i);
        EmergencyInfoManager.a().c(this.f5649a, true);
        a(i);
        j();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
