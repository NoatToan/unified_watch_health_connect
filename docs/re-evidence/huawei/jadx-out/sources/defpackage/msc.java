package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.network.embedded.w9;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.ContactsDataSender;
import com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.Bean;
import com.huawei.hwdevice.phoneprocess.service.ContactSyncJobService;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes11.dex */
public class msc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile msc f42336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Lock f42337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Condition f42338c;
    private static final Object e = new Object();
    private ContentResolver f;
    private ContentObserver i;
    private ConcurrentLinkedQueue<String> j;
    private Handler k;
    private ConcurrentLinkedQueue<Bean> l;
    private ConcurrentLinkedQueue<List<String>> m;
    private HandlerThread n;
    private ExtendHandler q;
    private ConcurrentLinkedQueue<List<Bean>> s;
    private a o = new a();
    private AtomicInteger d = new AtomicInteger(0);
    private AtomicInteger r = new AtomicInteger(0);
    private AtomicInteger g = new AtomicInteger(0);
    private Map<String, Boolean> h = new HashMap(16);
    private ContactsDataSender.SendFileCallback t = new ContactsDataSender.SendFileCallback() { // from class: msc.1
        @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.ContactsDataSender.SendFileCallback
        public void onTransferring(int i) {
        }

        @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.ContactsDataSender.SendFileCallback
        public void onTransferredFailed(int i, String str) {
            msc.this.s();
            ReleaseLogUtil.d("R_ContactsSyncUtils", "onTransferredFailed: update zip file, errorCode: ", Integer.valueOf(i));
            if (i == 140004) {
                LogUtil.a("ContactsSyncUtils", "onTransferredFailed: update zip file, device has no space.");
            } else if (i == 141001) {
                LogUtil.a("ContactsSyncUtils", "onTransferredFailed: update zip file, connect lost.");
            } else if (i == 140005) {
                LogUtil.a("ContactsSyncUtils", "onTransferredFailed: update zip file, device file information is abnormal.");
            } else if (i == 141000) {
                LogUtil.a("ContactsSyncUtils", "onTransferredFailed: ", str);
            } else if (i == 20000) {
                LogUtil.a("ContactsSyncUtils", "onTransferredFailed: transfer file non existent.");
            } else if (i == 140001) {
                LogUtil.a("ContactsSyncUtils", "onTransferredFailed: ", str);
            } else {
                msc.this.b(mtn.e(), 1);
                LogUtil.a("ContactsSyncUtils", "onTransferredFailed: update zip file transfer failed.");
            }
            msc.this.b(mtn.e(), false);
        }

        @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.ContactsDataSender.SendFileCallback
        public void onTransferredSucceed() {
            msc.this.b(mtn.e(), true);
            msc.this.r.set(0);
            msc.this.j();
            msc.this.b(mtn.e());
        }
    };
    private ContactsDataSender.SendFileCallback p = new ContactsDataSender.SendFileCallback() { // from class: msc.3
        @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.ContactsDataSender.SendFileCallback
        public void onTransferring(int i) {
        }

        @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.ContactsDataSender.SendFileCallback
        public void onTransferredFailed(int i, String str) {
            msc.this.s();
            ReleaseLogUtil.d("R_ContactsSyncUtils", "onTransferredFailed: delete csv file, errorCode: ", Integer.valueOf(i));
            if (i == 140004) {
                LogUtil.a("ContactsSyncUtils", "onTransferredFailed: delete csv file, device has no space. ");
            } else if (i == 141001) {
                LogUtil.a("ContactsSyncUtils", "onTransferredFailed: delete csv file, connect lost. ");
            } else if (i == 140005) {
                LogUtil.a("ContactsSyncUtils", "onTransferredFailed: delete csv file, device file information is abnormal.");
            } else if (i == 141000) {
                LogUtil.a("ContactsSyncUtils", "onTransferredFailed: ", str);
            } else if (i == 20000) {
                LogUtil.a("ContactsSyncUtils", "onTransferredFailed: transfer file non existent.");
            } else if (i == 140001) {
                LogUtil.a("ContactsSyncUtils", "onTransferredFailed: ", str);
            } else {
                msc.this.a(mtn.e(), 2);
                LogUtil.a("ContactsSyncUtils", "onTransferredFailed: delete csv file transfer failed. ");
            }
            msc.this.b(mtn.e(), false);
        }

        @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.ContactsDataSender.SendFileCallback
        public void onTransferredSucceed() {
            msc.this.b(mtn.e(), true);
            msc.this.g.set(0);
            msc.this.f();
            msc.this.c(mtn.e());
        }
    };

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f42337b = reentrantLock;
        f42338c = reentrantLock.newCondition();
    }

    private msc() {
        k();
    }

    public static msc c() {
        msc mscVar;
        synchronized (e) {
            if (f42336a == null) {
                f42336a = new msc();
            }
            mscVar = f42336a;
        }
        return mscVar;
    }

    private static void t() {
        synchronized (e) {
            f42336a = null;
        }
    }

    public void e(final String str, final int i) {
        if (!m()) {
            LogUtil.a("ContactsSyncUtils", "syncContactsData not support contactDataSync");
            d(str, i);
        } else {
            if (CommonUtil.bg() && CommonUtil.ch()) {
                LogUtil.a("ContactsSyncUtils", "syncContactsData is up emui110");
                if (o()) {
                    d(str, i);
                    return;
                }
                return;
            }
            mhs.a().getSwitchSetting("contacts_data_sync_switch", new IBaseResponseCallback() { // from class: msc.5
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    boolean z = !Utils.o();
                    if (i2 == 0 && (obj instanceof String)) {
                        z = !"0".equals(obj);
                        ReleaseLogUtil.d("R_ContactsSyncUtils", "syncContactsData isChecked:", Boolean.valueOf(z));
                    }
                    if (z) {
                        msc.this.d(str, i);
                    } else {
                        LogUtil.j("ContactsSyncUtils", "syncContactsData switch is false return");
                    }
                }
            });
        }
    }

    private boolean o() {
        int i;
        try {
            i = Settings.System.getInt(BaseApplication.getContext().getContentResolver(), "contactsSwitch");
        } catch (Settings.SettingNotFoundException unused) {
            LogUtil.e("ContactsSyncUtils", "isSyncContactData SettingNotFoundException");
            i = -1;
        }
        LogUtil.a("ContactsSyncUtils", "isSyncContactData contactsSwitch:", Integer.valueOf(i));
        boolean z = true;
        if (i != 1 && i != -1) {
            z = false;
        }
        LogUtil.a("ContactsSyncUtils", "isSyncContactData isSync:", Boolean.valueOf(z));
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, int i) {
        boolean zB = mti.b(str);
        LogUtil.a("ContactsSyncUtils", "syncContactsData： isSynchronizedOnce: ", Boolean.valueOf(zB));
        if (zB) {
            c(str, i);
        } else {
            d(str);
        }
    }

    private boolean m() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "ContactsSyncUtils");
        if (deviceList.size() == 0) {
            LogUtil.j("ContactsSyncUtils", "isSupportContactDataSync deviceInfo is null");
            return false;
        }
        return eey.d(deviceList.get(0), 23);
    }

    public void c(final DeviceInfo deviceInfo) {
        if (!mtk.d()) {
            LogUtil.j("ContactsSyncUtils", "syncContactsExtraData: ", "have no contacts permissions");
            return;
        }
        if (!m()) {
            LogUtil.a("ContactsSyncUtils", "syncContactsExtraData not support contactDataSync");
            b(deviceInfo);
        } else {
            if (CommonUtil.bg() && CommonUtil.ch()) {
                LogUtil.a("ContactsSyncUtils", "syncContactsExtraData is up emui110");
                if (o()) {
                    b(deviceInfo);
                    return;
                }
                return;
            }
            mhs.a().getSwitchSetting("contacts_data_sync_switch", new IBaseResponseCallback() { // from class: msc.2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    boolean z = !Utils.o();
                    if (i == 0 && (obj instanceof String)) {
                        z = !"0".equals(obj);
                        ReleaseLogUtil.d("R_ContactsSyncUtils", "syncContactsExtraData isChecked:", Boolean.valueOf(z));
                    }
                    if (z) {
                        msc.this.b(deviceInfo);
                    } else {
                        LogUtil.j("ContactsSyncUtils", "syncContactsExtraData switch is false return");
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("R_ContactsSyncUtils", "syncContactsExtraDataEnable: start to sync lite data.");
        ContactsDataSender.d().d(mtl.a(), mtl.c(), mtl.b(), deviceInfo);
    }

    public void a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.j("ContactsSyncUtils", "startListen: context or deviceId is invalid.");
            return;
        }
        if (mto.a(context, 65281)) {
            LogUtil.j("ContactsSyncUtils", "The ContactSyncJobService is Running.");
            return;
        }
        d(context);
        if (mtk.e()) {
            mto.e(context, ContactSyncJobService.class);
        } else {
            mto.c(a(context), a(this.k));
        }
    }

    public void d(Context context) {
        mto.e(context);
    }

    public void e() {
        LogUtil.a("ContactsSyncUtils", "storeSyncContactExtras: SYNC CONTACTS EXTRA DATA SUCCESSFULLY.");
        this.d.set(0);
    }

    public void a(DeviceInfo deviceInfo) {
        LogUtil.a("ContactsSyncUtils", "tryAgainContactExtras: try again SYNC CONTACT-EXTRAS-DATA failed count：", Integer.valueOf(this.r.get()));
        if (this.d.incrementAndGet() > 3) {
            this.d.set(0);
        } else {
            c(deviceInfo);
        }
    }

    public void a() {
        j();
        f();
        g();
        i();
    }

    public void b() {
        g();
        i();
        ExtendHandler extendHandler = this.q;
        if (extendHandler != null) {
            extendHandler.removeTasksAndMessages();
            this.q = null;
        }
        this.n.quit();
        t();
    }

    private void k() {
        this.s = new ConcurrentLinkedQueue<>();
        this.l = new ConcurrentLinkedQueue<>();
        this.m = new ConcurrentLinkedQueue<>();
        this.j = new ConcurrentLinkedQueue<>();
        this.n = new HandlerThread("observe_contacts_change_thread");
        this.q = HandlerCenter.b(this.o, "ContactsSyncUtils");
        this.n.start();
        this.k = new Handler(this.n.getLooper());
        mti.a();
    }

    private List<msy> n() {
        if (this.l.isEmpty()) {
            LogUtil.a("ContactsSyncUtils", "getCurrentSynced: current update queue is empty.");
            return Collections.EMPTY_LIST;
        }
        LogUtil.a("ContactsSyncUtils", "getCurrentSynced: start");
        ArrayList arrayList = new ArrayList(this.l.size());
        for (Bean bean : this.l) {
            if (bean instanceof mtc) {
                mtc mtcVar = (mtc) bean;
                String uid = mtcVar.getUid();
                mtcVar.setUid("0");
                String strB = mtr.b(mtq.e(mtcVar));
                int iE = CommonUtil.e(mtcVar.getId(), -1);
                if (iE != -1) {
                    arrayList.add(new msy(iE, uid, strB));
                }
            }
        }
        LogUtil.a("ContactsSyncUtils", "getCurrentSynced: currentUpdated list's size: ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    private List<String> h() {
        if (this.j.isEmpty()) {
            LogUtil.j("ContactsSyncUtils", "mCurrentDeleteContactsQueue is or empty.");
            return Collections.EMPTY_LIST;
        }
        LogUtil.a("ContactsSyncUtils", "getCurrentDeleted: currentDeleted list's size: ", Integer.valueOf(this.j.size()));
        return new ArrayList(this.j);
    }

    private void b(List<Bean> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("ContactsSyncUtils", "sendUpdatedContactsToDevice: failure. contactList is null or empty.");
            b(mtn.e(), true);
            return;
        }
        this.s.offer(list);
        ExtendHandler extendHandler = this.q;
        if (extendHandler != null) {
            extendHandler.sendEmptyMessage(16);
        }
    }

    private void a(List<String> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("ContactsSyncUtils", "sendDeletedContactsToDevice: failure. deletedUidList is null or empty. ");
            b(mtn.e(), true);
            return;
        }
        this.m.offer(list);
        ExtendHandler extendHandler = this.q;
        if (extendHandler != null) {
            extendHandler.sendEmptyMessage(32);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        LogUtil.a("ContactsSyncUtils", "sendZip: queue size: ", Integer.valueOf(this.s.size()));
        f42337b.lock();
        try {
            j();
            while (!this.s.isEmpty()) {
                List<Bean> listPoll = this.s.poll();
                if (listPoll != null && !listPoll.isEmpty()) {
                    this.l.clear();
                    this.l.addAll(listPoll);
                    if (!mtt.d(mtq.c(listPoll), msa.f42333a, a(".vcf"))) {
                        LogUtil.j("ContactsSyncUtils", "sendZip: vcard text write to file failed. ");
                        break;
                    }
                    String str = w9.o + a(".zip");
                    if (mtt.d(msa.f42333a, msa.d, str)) {
                        ContactsDataSender.d().b(msa.d + str, str, this.t);
                        l();
                    } else {
                        LogUtil.j("ContactsSyncUtils", "sendZip: zip vcard package failed.");
                        xjt.k("sendZip: zip vcard package failed.");
                    }
                }
            }
        } finally {
            f42337b.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        LogUtil.a("ContactsSyncUtils", "sendCsv: queue size: ", Integer.valueOf(this.m.size()));
        f42337b.lock();
        try {
            f();
            while (!this.m.isEmpty()) {
                List<String> listPoll = this.m.poll();
                if (listPoll != null && !listPoll.isEmpty()) {
                    this.j.clear();
                    this.j.addAll(listPoll);
                    String str = "delete" + a(".csv");
                    if (mtt.c(listPoll, msa.f42334b, str)) {
                        ContactsDataSender.d().a(msa.f42334b + str, str, this.p);
                        l();
                    } else {
                        LogUtil.j("ContactsSyncUtils", "sendCsv: failed to write csv text to file.");
                    }
                }
            }
        } finally {
            f42337b.unlock();
        }
    }

    private void l() {
        try {
            LogUtil.a("ContactsSyncUtils", "lock: is timeout: ", Boolean.valueOf(f42338c.await(300000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException e2) {
            LogUtil.e("ContactsSyncUtils", "lock: InterruptedException occurred on locking thread.", Thread.currentThread().getName(), e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        f42337b.lock();
        try {
            f42338c.signalAll();
        } finally {
            f42337b.unlock();
        }
    }

    private String a(String str) {
        return "_" + System.currentTimeMillis() + str;
    }

    private void d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("ContactsSyncUtils", "syncAllContacts: deviceId is null or empty.");
            return;
        }
        if (!mtk.d()) {
            ReleaseLogUtil.e("R_ContactsSyncUtils", "syncAllContacts: no contacts permissions");
        } else if (mti.b(str)) {
            LogUtil.a("ContactsSyncUtils", "syncAllContacts: has already synchronized all contacts once.");
        } else {
            mti.d(str);
            b(msm.c());
        }
    }

    private void c(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("ContactsSyncUtils", "syncChangedContacts: failure, parameter is null");
            return;
        }
        if (!mtk.d()) {
            ReleaseLogUtil.e("R_ContactsSyncUtils", "syncChangedContacts: have no contacts permissions");
            return;
        }
        List<Bean> listC = msm.c(mti.a(str));
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        mtm.c(listC, str, arrayList, arrayList2);
        if (i == 1) {
            b(arrayList);
        } else if (i == 2) {
            a(arrayList2);
        } else {
            b(arrayList);
            a(arrayList2);
        }
        ReleaseLogUtil.d("R_ContactsSyncUtils", "syncChangedContacts: updated size: ", Integer.valueOf(arrayList.size()), " deleted size: ", Integer.valueOf(arrayList2.size()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        LogUtil.a("ContactsSyncUtils", "deleteUpdatedCache.");
        mtt.c(msa.d);
        mtt.c(msa.f42333a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        LogUtil.a("ContactsSyncUtils", "deleteDeletedCache.");
        mtt.c(msa.f42334b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("ContactsSyncUtils", "storeLastUpdated: deviceId is null or empty.");
            return;
        }
        ReleaseLogUtil.d("R_ContactsSyncUtils", "storeLastUpdated.");
        List<msy> listN = n();
        mti.b(str, listN);
        s();
        LogUtil.a("ContactsSyncUtils", "storeLastUpdated: SYNC UPDATED CONTACTS SUCCESSFULLY. updated list's Size: ", Integer.valueOf(listN.size()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("ContactsSyncUtils", "storeLastDeleted: deviceId is null or empty.");
            return;
        }
        ReleaseLogUtil.d("R_ContactsSyncUtils", "storeLastDeleted.");
        List<String> listH = h();
        mti.e(str, listH);
        s();
        LogUtil.a("ContactsSyncUtils", "storeLastDeleted: SYNC DELETED CONTACTS SUCCESSFULLY. deleted list's size: ", Integer.valueOf(listH.size()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("ContactsSyncUtils", "tryAgainUpdated: deviceId is null or empty.");
            return;
        }
        LogUtil.a("ContactsSyncUtils", "tryAgainUpdated: try again SYNC UPDATE failed count:", Integer.valueOf(this.r.get()));
        if (this.r.incrementAndGet() > 3) {
            this.r.set(0);
            j();
        } else {
            e(str, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("ContactsSyncUtils", "tryAgainDeleted: deviceId is null or empty.");
            return;
        }
        LogUtil.a("ContactsSyncUtils", "tryAgainDeleted: try again SYNC DELETE failed count: ", Integer.valueOf(this.g.get()));
        if (this.g.incrementAndGet() > 3) {
            this.g.set(0);
            f();
        } else {
            e(str, i);
        }
    }

    private void g() {
        this.s.clear();
        this.l.clear();
        this.m.clear();
        this.j.clear();
    }

    private void i() {
        ExtendHandler extendHandler = this.q;
        if (extendHandler != null) {
            extendHandler.removeTasksAndMessages();
        }
        this.k.removeCallbacksAndMessages(null);
    }

    private ContentObserver a(Handler handler) {
        if (this.i == null) {
            this.i = new msf(handler);
        }
        return this.i;
    }

    private ContentResolver a(Context context) {
        if (this.f == null) {
            this.f = context.getContentResolver();
        }
        return this.f;
    }

    public void d() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "ContactsSyncUtils");
        if (deviceList.size() != 0) {
            Iterator<DeviceInfo> it = deviceList.iterator();
            while (it.hasNext()) {
                e(it.next());
            }
        }
    }

    private void e(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("ContactsSyncUtils", "setContactListenerChange: deviceInfo is null.");
            return;
        }
        this.h.put("contact_sync_" + mtr.e(deviceInfo.getDeviceIdentify()), false);
    }

    public Boolean e(String str) {
        return this.h.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("ContactsSyncUtils", "resetContactChangeValue: deviceId is null or empty.");
            return;
        }
        if (this.h.containsKey(str)) {
            this.h.remove(str);
        }
        this.h.put(str, Boolean.valueOf(z));
    }

    class a implements Handler.Callback {
        private a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 16) {
                msc.this.r();
                return true;
            }
            if (i == 32) {
                msc.this.p();
                return true;
            }
            LogUtil.j("ContactsSyncUtils", "handleMessage: fail in default case. what: ", Integer.valueOf(message.what));
            return false;
        }
    }
}
