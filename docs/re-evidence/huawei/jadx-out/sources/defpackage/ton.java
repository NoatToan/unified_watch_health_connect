package defpackage;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.os.Message;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homewear21.R;
import com.huawei.ui.homewear21.home.datasync.DataSyncSwitchContract;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class ton implements DataSyncSwitchContract.Presenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DataSyncSwitchContract.View f49443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f49444b = new Handler() { // from class: ton.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j("DataSyncSwitchPresenterImpl", "mHandler message is null");
                return;
            }
            super.handleMessage(message);
            if (message.what == 1) {
                ton.this.d = false;
                if (!(message.obj instanceof List)) {
                    LogUtil.j("DataSyncSwitchPresenterImpl", "mHandler message.obj not instanceof List");
                    return;
                }
                List<tom> list = (List) message.obj;
                if (ton.this.f49443a != null) {
                    ton.this.f49443a.refreshList(list);
                    return;
                }
                return;
            }
            LogUtil.j("DataSyncSwitchPresenterImpl", "mHandler message.what is other");
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f49445c;
    private boolean d;
    private ThreadPoolManager e;

    class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if ("ONLY_CONTACT".equals(ton.this.f49445c)) {
                ton.this.a(new ArrayList());
                return;
            }
            List listA = ton.this.a();
            ton.this.e((List<tom>) listA);
            ton.this.d(listA);
            if (!top.e() || (CommonUtil.bg() && CommonUtil.ch())) {
                ton.this.c((List<tom>) listA);
            } else {
                ton.this.a(listA);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<tom> list) {
        if (!top.g()) {
            LogUtil.j("DataSyncSwitchPresenterImpl", "obtainCameraData not support capability");
            return;
        }
        tom tomVar = new tom();
        tomVar.e(false);
        tomVar.b(false);
        tomVar.e("");
        tomVar.c(BaseApplication.getContext().getString(R.string.IDS_settings_camera));
        tomVar.d(BaseApplication.getContext().getResources().getDrawable(R.mipmap.home_ic_data_sync_camera));
        list.add(tomVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<tom> list) {
        boolean z;
        if (!top.i()) {
            LogUtil.j("DataSyncSwitchPresenterImpl", "otherPhoneCalendarData not support capability");
            return;
        }
        Iterator<tom> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (top.e(it.next().e())) {
                z = true;
                break;
            }
        }
        LogUtil.a("DataSyncSwitchPresenterImpl", "has calendar item : ", Boolean.valueOf(z));
        if (z) {
            return;
        }
        tom tomVar = new tom();
        tomVar.e(false);
        tomVar.b(false);
        tomVar.e("COM.HUAWEI.HEALTH.CALENDAR");
        tomVar.c(BaseApplication.getContext().getResources().getString(R.string.IDS_app_name_calendar));
        tomVar.d(BaseApplication.getContext().getResources().getDrawable(R.drawable.ic_appicon_calendar));
        list.add(tomVar);
    }

    public ton(DataSyncSwitchContract.View view) {
        this.f49443a = view;
        view.setPresenter(this);
        this.e = ThreadPoolManager.d(1, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x0096  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c2  */
    public List<tom> a() {
        tom tomVar;
        ArrayList arrayList = new ArrayList(0);
        Intent intent = new Intent("com.huawei.intent.action.APP_DATA_SYNC_SWITCH");
        intent.addCategory("android.intent.category.DEFAULT");
        PackageManager packageManager = BaseApplication.getContext().getPackageManager();
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        Collections.sort(listQueryIntentActivities, new ResolveInfo.DisplayNameComparator(packageManager));
        LogUtil.a("DataSyncSwitchPresenterImpl", "obtainData aps:", Integer.valueOf(listQueryIntentActivities.size()));
        for (int i = 0; i < listQueryIntentActivities.size(); i++) {
            ActivityInfo activityInfo = listQueryIntentActivities.get(i).activityInfo;
            String str = activityInfo.packageName;
            if ((!top.e(str) || (top.d() && !top.b())) && (!top.b(str) || top.j())) {
                if (top.a(str)) {
                    if (!top.e()) {
                        LogUtil.j("DataSyncSwitchPresenterImpl", "obtainAllData is not support ContactDataSync");
                    } else if (!CommonUtil.bg() || !CommonUtil.ch()) {
                        LogUtil.j("DataSyncSwitchPresenterImpl", "obtainAllData is not HuaweiSystem or less than Emui1101");
                    } else {
                        tomVar = new tom();
                        String strD = qxg.d(BaseApplication.getContext(), str);
                        LogUtil.a("DataSyncSwitchPresenterImpl", "obtainData packageName:", str, " appName:", strD);
                        tomVar.e(str);
                        tomVar.c(strD);
                        if (activityInfo.applicationInfo != null) {
                            tomVar.d(activityInfo.applicationInfo.loadIcon(packageManager));
                        } else {
                            tomVar.d(activityInfo.loadIcon(packageManager));
                        }
                        arrayList.add(tomVar);
                    }
                } else {
                    tomVar = new tom();
                    String strD2 = qxg.d(BaseApplication.getContext(), str);
                    LogUtil.a("DataSyncSwitchPresenterImpl", "obtainData packageName:", str, " appName:", strD2);
                    tomVar.e(str);
                    tomVar.c(strD2);
                    if (activityInfo.applicationInfo != null) {
                        tomVar.d(activityInfo.applicationInfo.loadIcon(packageManager));
                    } else {
                        tomVar.d(activityInfo.loadIcon(packageManager));
                    }
                    arrayList.add(tomVar);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final List<tom> list) {
        ReleaseLogUtil.d("R_DataSyncSwitchPresenterImpl", "obtainContactsData getSwitchSetting");
        mhs.a().getSwitchSetting("contacts_data_sync_switch", new IBaseResponseCallback() { // from class: ton.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("R_DataSyncSwitchPresenterImpl", "obtainContactsData getSwitchSetting onResponse errorCode=", Integer.valueOf(i));
                boolean z = !Utils.o();
                if (i == 0 && (obj instanceof String)) {
                    z = !"0".equals(obj);
                    LogUtil.a("DataSyncSwitchPresenterImpl", "obtainContactsData isChecked:", Boolean.valueOf(z));
                }
                if (!mtk.d() && z) {
                    LogUtil.a("DataSyncSwitchPresenterImpl", "obtainContactsData READ_CONTACTS permission false and isEnable is true");
                    mhs.a().setSwitchSetting("contacts_data_sync_switch", "0", null);
                    mhs.a().sendSetSwitchSettingCmd(1, "0", null);
                    ReleaseLogUtil.d("R_DataSyncSwitchPresenterImpl", "onResponse setSwitchSetting/sendSetSwitchSettingCmd SWITCH_SETTING_CLOSE");
                    z = false;
                }
                ton.this.e(list, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<tom> list, boolean z) {
        PackageInfo packageInfoB = mir.b("com.huawei.contacts");
        if (packageInfoB == null) {
            packageInfoB = mir.b("com.android.contacts");
        }
        ApplicationInfo applicationInfo = packageInfoB != null ? packageInfoB.applicationInfo : null;
        tom tomVar = new tom();
        tomVar.e(true);
        tomVar.b(z);
        if (applicationInfo == null) {
            LogUtil.a("DataSyncSwitchPresenterImpl", "obtainContactsData default contacts");
            tomVar.e("com.android.contacts");
            tomVar.c(BaseApplication.getContext().getString(R.string.IDS_settings_one_level_menu_settings_item_text_id16));
            tomVar.d(BaseApplication.getContext().getResources().getDrawable(R.mipmap.home_ic_data_sync_contacts));
        } else {
            tomVar.e(packageInfoB.packageName);
            tomVar.c(applicationInfo.loadLabel(BaseApplication.getContext().getPackageManager()).toString());
            tomVar.d(BaseApplication.getContext().getPackageManager().getApplicationIcon(applicationInfo));
        }
        list.add(tomVar);
        c(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<tom> list) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = list;
        this.f49444b.sendMessage(messageObtain);
    }

    @Override // com.huawei.ui.homewear21.home.datasync.DataSyncSwitchContract.Presenter
    public void startQueryData(String str) {
        ThreadPoolManager threadPoolManager;
        if (this.d || (threadPoolManager = this.e) == null) {
            return;
        }
        this.d = true;
        this.f49445c = str;
        threadPoolManager.execute(new b());
    }

    @Override // com.huawei.ui.homewear21.home.datasync.DataSyncSwitchContract.Presenter
    public void onDestroy() {
        this.e.shutdown();
        this.f49443a = null;
    }
}
