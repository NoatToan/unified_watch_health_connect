package com.huawei.ui.main.stories.me.activity;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.bundle.AppBundleExtension;
import com.huawei.haf.bundle.InstallSessionState;
import com.huawei.haf.bundle.guide.BundleInstallTaskManager;
import com.huawei.haf.bundle.guide.BundleInstaller;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hmf.tasks.OnCompleteListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.network.embedded.g4;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.downloadwidget.HealthDownLoadWidget;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import defpackage.pps;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.LogAnonymous;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class PluginManagerActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f28445c;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_plugin_manager);
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.plugin_management_title_layout);
        customTitleBar.setRightButtonVisibility(0);
        customTitleBar.setRightButtonDrawable(getResources().getDrawable(R.mipmap.ic_me_setting), qre.f(R.string.IDS_main_btn_state_settings));
        customTitleBar.setRightButtonOnClickListener(this);
        d();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 111) {
            LogUtil.a("Bundle_PluginManagerActivity", "onActivityResult resultCode=", Integer.valueOf(i2));
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        qpx.d();
    }

    private void d() {
        ListView listView = (ListView) findViewById(R.id.plugin_manager_list_view);
        listView.setAdapter((ListAdapter) new b(this, R.layout.adapter_plugin_manager, R.id.plugin_manager_name, e()));
        listView.setVisibility(0);
    }

    private List<String> e() {
        ArrayList arrayList;
        Intent intent = getIntent();
        ArrayList<String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("PluginModules") : null;
        if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            arrayList = new ArrayList(AppBundle.c().getAllBundleModules(this, true));
        } else {
            arrayList = new ArrayList(stringArrayListExtra);
        }
        List<String> listB = b(arrayList);
        Collections.sort(listB);
        return listB;
    }

    private List<String> b(List<String> list) {
        list.removeAll(pps.e().c());
        return list;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f28445c <= 1000) {
            return;
        }
        this.f28445c = jCurrentTimeMillis;
        startActivity(new Intent(this, (Class<?>) PluginSettingActivity.class));
    }

    static class b extends ArrayAdapter<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AppBundleExtension f28446c;

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return false;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i) {
            return false;
        }

        b(Context context, int i, int i2, List<String> list) {
            super(context, i, i2, list);
            this.f28446c = AppBundle.c();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public String getItem(int i) {
            return this.f28446c.getModuleTitle(getContext(), (String) super.getItem(i));
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            String str = (String) super.getItem(i);
            Context context = getContext();
            View view2 = super.getView(i, view, viewGroup);
            ((HealthTextView) view2.findViewById(R.id.plugin_manager_desc)).setText(context.getString(R.string.IDS_bundle_desc, this.f28446c.getModuleDescription(context, str)));
            ((HealthTextView) view2.findViewById(R.id.plugin_manager_size)).setText(context.getString(R.string.IDS_bundle_size, qrs.a(context, this.f28446c.getModuleZipSize(context, str))));
            ((HealthTextView) view2.findViewById(R.id.plugin_manager_dependency)).setText(context.getString(R.string.IDS_bundle_dependency, b(context, str)));
            HealthDownLoadWidget healthDownLoadWidget = (HealthDownLoadWidget) view2.findViewById(R.id.plugin_manager_install);
            HealthDownLoadWidget healthDownLoadWidget2 = (HealthDownLoadWidget) view2.findViewById(R.id.plugin_manager_uninstall);
            String string = context.getString(com.huawei.ui.commonui.R.string.IDS_bundle_uninstall_button);
            healthDownLoadWidget2.setIdleText(string);
            healthDownLoadWidget2.setPauseText(string);
            view2.setTag(new d(this, str, healthDownLoadWidget, healthDownLoadWidget2));
            return view2;
        }

        private String b(Context context, String str) {
            List<String> moduleDependencies = this.f28446c.getModuleDependencies(context, str);
            if (moduleDependencies.isEmpty()) {
                return context.getString(com.huawei.ui.commonui.R.string.IDS_bundle_dependency_none);
            }
            StringBuilder sb = new StringBuilder(64);
            for (String str2 : moduleDependencies) {
                if (sb.length() != 0) {
                    sb.append(' ');
                }
                sb.append(this.f28446c.getModuleTitle(context, str2));
                sb.append(' ');
                sb.append(g4.k);
                sb.append(qrs.a(context, this.f28446c.getModuleZipSize(context, str2)));
                sb.append(g4.l);
            }
            return sb.toString();
        }

        int d(String str) {
            if (e(str)) {
                return com.huawei.ui.commonui.R.string.IDS_bundle_install_button;
            }
            if (this.f28446c.isExistLocalModule(str)) {
                return com.huawei.ui.commonui.R.string.IDS_bundle_complete_button;
            }
            if (this.f28446c.getUpdateModules(getContext(), true).contains(str)) {
                return com.huawei.ui.commonui.R.string.IDS_bundle_update_button;
            }
            return com.huawei.ui.commonui.R.string.IDS_bundle_install_button;
        }

        boolean e(String str) {
            return this.f28446c.isUnistalledModule(str);
        }

        boolean a(String str) {
            return this.f28446c.getSetting().isAllowDownloadModule(getContext(), str);
        }
    }

    static class d extends ContextWrapper implements BundleInstaller.InstallHandler, View.OnClickListener, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f28447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final BundleInstaller f28448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HealthDownLoadWidget f28449c;
        private final String d;
        private final b e;
        private final HealthDownLoadWidget i;

        d(b bVar, String str, HealthDownLoadWidget healthDownLoadWidget, HealthDownLoadWidget healthDownLoadWidget2) {
            super(bVar.getContext());
            this.e = bVar;
            this.d = str;
            this.f28449c = healthDownLoadWidget;
            this.i = healthDownLoadWidget2;
            this.f28448b = BundleInstallTaskManager.d().e(str, this);
            healthDownLoadWidget.setOnClickListener(this);
            healthDownLoadWidget2.setOnClickListener(this);
            e();
            if (BundleInstallTaskManager.d("Bundle_PluginManagerActivity", str)) {
                this.f28447a = true;
                healthDownLoadWidget.a(0);
                healthDownLoadWidget.setEnabled(false);
                healthDownLoadWidget2.setEnabled(false);
            }
        }

        @Override // com.huawei.haf.bundle.guide.BundleInstaller.InstallHandler
        public boolean onForceDownloads() {
            LogUtil.a("Bundle_PluginManagerActivity", "onForceDownloads module=", this.d);
            this.f28447a = true;
            this.f28449c.a(0);
            this.f28449c.setEnabled(false);
            this.i.setEnabled(false);
            BundleInstallTaskManager.b("Bundle_PluginManagerActivity", this.d, this.f28448b);
            return false;
        }

        @Override // com.huawei.haf.bundle.guide.BundleInstaller.InstallHandler
        public boolean onInstallRequestError(int i, String str, boolean z) {
            if (!TextUtils.isEmpty(str)) {
                qpx.e(this, str);
            }
            return z;
        }

        @Override // com.huawei.haf.bundle.guide.BundleInstaller.InstallHandler
        public void onRequiresUserConfirmation(InstallSessionState installSessionState) {
            boolean z = true;
            if (!this.f28447a && installSessionState.moduleNames().size() != 1) {
                z = false;
            }
            try {
                this.f28448b.startConfirmationDialogForResult(installSessionState, c(), 111, z);
            } catch (IntentSender.SendIntentException e) {
                LogUtil.e("Bundle_PluginManagerActivity", "onRequiresUserConfirmation ex=", LogAnonymous.b(e));
            }
        }

        @Override // com.huawei.haf.bundle.guide.BundleInstaller.InstallHandler
        public void onPending(InstallSessionState installSessionState, String str) {
            this.f28449c.a(0);
            this.f28449c.setEnabled(false);
            this.f28449c.setPauseText(str);
            this.i.setEnabled(false);
        }

        @Override // com.huawei.haf.bundle.guide.BundleInstaller.InstallHandler
        public void onProgressMessage(InstallSessionState installSessionState, int i, String str) {
            this.f28449c.a(i - this.f28449c.getProgress());
            this.f28449c.setEnabled(false);
            this.f28449c.setPauseText(str);
            this.i.setEnabled(false);
        }

        @Override // com.huawei.haf.bundle.guide.BundleInstaller.InstallHandler
        public void onFinish(boolean z) {
            LogUtil.a("Bundle_PluginManagerActivity", "onFinish module=", this.d, ", result=", Boolean.valueOf(z));
            BundleInstallTaskManager.a("Bundle_PluginManagerActivity");
            this.f28447a = false;
            HandlerExecutor.c(this, 1000L);
            if (z) {
                qpx.e(c(), R.string.IDS_bundle_install_desc);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getId() == R.id.plugin_manager_install) {
                LogUtil.a("Bundle_PluginManagerActivity", "startInstall module=", this.d);
                this.f28449c.setEnabled(false);
                if (this.f28448b.getInstallManager().getInstalledModules().contains(this.d)) {
                    this.f28448b.getInstallManager().deferredInstall(Collections.singletonList(this.d)).addOnCompleteListener(new OnCompleteListener<Void>() { // from class: com.huawei.ui.main.stories.me.activity.PluginManagerActivity.d.4
                        @Override // com.huawei.hmf.tasks.OnCompleteListener
                        public void onComplete(Task<Void> task) {
                            HandlerExecutor.c(d.this, 1000L);
                            qpx.e(d.this.c(), R.string.IDS_bundle_install_desc);
                        }
                    });
                    return;
                } else {
                    this.f28448b.startInstall(Collections.singletonList(this.d));
                    return;
                }
            }
            LogUtil.a("Bundle_PluginManagerActivity", "deferredUninstall module=", this.d);
            this.i.setEnabled(false);
            this.f28448b.getInstallManager().deferredUninstall(Collections.singletonList(this.d)).addOnCompleteListener(new OnCompleteListener<Void>() { // from class: com.huawei.ui.main.stories.me.activity.PluginManagerActivity.d.2
                @Override // com.huawei.hmf.tasks.OnCompleteListener
                public void onComplete(Task<Void> task) {
                    HandlerExecutor.c(d.this, 1000L);
                    qpx.e(d.this.c(), R.string.IDS_bundle_uninstall_desc);
                }
            });
        }

        @Override // java.lang.Runnable
        public void run() {
            e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Activity c() {
            Context context = this.e.getContext();
            if (context instanceof Activity) {
                return (Activity) context;
            }
            return null;
        }

        private void e() {
            int iD = this.e.d(this.d);
            String string = getString(iD);
            this.f28449c.setIdleText(string);
            this.f28449c.setPauseText(string);
            this.f28449c.d();
            this.f28449c.b();
            boolean z = false;
            this.f28449c.setProgress(0);
            this.f28449c.setEnabled((iD == com.huawei.ui.commonui.R.string.IDS_bundle_complete_button || this.f28448b.isRunning()) ? false : true);
            if (iD != com.huawei.ui.commonui.R.string.IDS_bundle_install_button && !this.e.a(this.d)) {
                z = true;
            }
            this.i.setEnabled(z);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
