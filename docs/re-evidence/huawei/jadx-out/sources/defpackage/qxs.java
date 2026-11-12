package defpackage;

import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.device.activity.notification.data.storage.NotificationCallback;
import com.huawei.ui.device.activity.notification.data.storage.NotificationResult;
import com.huawei.ui.device.activity.notification.data.storage.NotificationStorage;
import com.huawei.ui.device.interactors.NotificationPushInteractor;
import health.compact.a.CloudUtils;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes16.dex */
public class qxs implements NotificationStorage {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private lzh f46938b;
    private final qxl d = new qxl();

    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public int getAppSwitch(String str) {
        return 0;
    }

    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public void getAppSwitch(final List<lzj> list, final NotificationCallback<List<lzj>> notificationCallback) {
        LogUtil.a("DataPlatformStrategy", "getTopApplicationSwitch enter");
        if (notificationCallback == null) {
            LogUtil.j("DataPlatformStrategy", "getTopApplicationSwitch callback in null");
        } else {
            this.d.b(1, new NotificationCallback<Boolean>() { // from class: qxs.5
                @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Boolean bool) {
                    LogUtil.d("DataPlatformStrategy", "configManager downloadAppPackageNameConfig successfully");
                    qxs.this.a((List<lzj>) list, (NotificationCallback<List<lzj>>) notificationCallback);
                }

                @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationCallback
                public void onError(NotificationResult notificationResult, String str) {
                    notificationCallback.onError(notificationResult, str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final List<lzj> list, final NotificationCallback<List<lzj>> notificationCallback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("900500035");
        qhq.b("9005", arrayList, new HiDataReadResultListener() { // from class: qxs.2
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                ReleaseLogUtil.d("R_DataPlatformStrategy", "getTopApplicationSwitch onResult errorCode: ", Integer.valueOf(i), ", data: ", obj);
                List list2 = (List) obj;
                if (!njy.b(obj, HiSampleConfig.class) || njy.e(list2)) {
                    ReleaseLogUtil.e("R_DataPlatformStrategy", "syncTopApplicationSwitch list is empty ");
                    qxs.this.f46938b = new lzh();
                    notificationCallback.onSuccess(list);
                    return;
                }
                if (i == 0) {
                    qxs.this.d((List<HiSampleConfig>) list2, (List<lzj>) list, (NotificationCallback<List<lzj>>) notificationCallback);
                } else {
                    notificationCallback.onError(NotificationResult.PLATFORM_NOT_FOUND, "");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<HiSampleConfig> list, List<lzj> list2, NotificationCallback<List<lzj>> notificationCallback) {
        String configData = "";
        for (HiSampleConfig hiSampleConfig : list) {
            if (hiSampleConfig != null && !TextUtils.isEmpty(hiSampleConfig.getConfigData())) {
                configData = hiSampleConfig.getConfigData();
            }
        }
        this.f46938b = (lzh) HiJsonUtil.d(configData, lzh.class);
        ReleaseLogUtil.d("R_DataPlatformStrategy", "getConfigData:", configData);
        notificationCallback.onSuccess(a(list2, this.f46938b));
        c(list2, this.f46938b);
    }

    private void c(List<lzj> list, lzh lzhVar) {
        if (lzhVar == null) {
            ReleaseLogUtil.d("R_DataPlatformStrategy", "switchInfo is null ");
        } else if (lzhVar.b() == null || lzhVar.b().length == 0) {
            ReleaseLogUtil.d("R_DataPlatformStrategy", "NotificationAppSwitchInfo cloud list is null ");
        } else {
            LogUtil.a("DataPlatformStrategy", " saveAppSwitchByDefault ");
            b((List) list.stream().filter(new Predicate() { // from class: qxy
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return this.f46951a.c((lzj) obj);
                }
            }).collect(Collectors.toList()));
        }
    }

    /* synthetic */ boolean c(lzj lzjVar) {
        LogUtil.a("DataPlatformStrategy", "filter ", lzjVar.d(), " - ", Integer.valueOf(lzjVar.e()));
        return this.d.d(lzjVar.f()) && "2".equals(a(lzjVar));
    }

    private List<lzj> a(List<lzj> list, lzh lzhVar) {
        if (lzhVar == null) {
            ReleaseLogUtil.d("R_DataPlatformStrategy", "switchInfo is null ");
            return list;
        }
        if (lzhVar.b() == null || lzhVar.b().length == 0) {
            ReleaseLogUtil.d("R_DataPlatformStrategy", "NotificationAppSwitchInfo cloud list is null ");
            c(lzhVar, list);
            return list;
        }
        long jA = a();
        long jD = CommonUtil.d(lzhVar.d(), 10);
        ReleaseLogUtil.d("R_DataPlatformStrategy", " localModifiedTime= ", Long.valueOf(jA), "cloudModifiedTime = ", Long.valueOf(jD));
        if (jA < jD) {
            for (lzj lzjVar : list) {
                if (this.d.d(lzjVar.f())) {
                    String strA = a(lzjVar);
                    if (!TextUtils.isEmpty(strA) && !strA.equals(String.valueOf(lzjVar.e())) && !"2".equals(strA)) {
                        LogUtil.a("DataPlatformStrategy", "cloud sync to local:", lzjVar.d(), " status:", strA);
                        lzjVar.e("1".equals(strA) ? 1 : 0);
                    }
                }
            }
            a(jD);
        }
        return list;
    }

    private String a(lzj lzjVar) {
        List<lzj> listC = this.d.c();
        if (njy.e(listC)) {
            return "2";
        }
        for (int i = 0; i < listC.size(); i++) {
            if (listC.get(i) != null && this.f46938b.b().length >= i) {
                String strF = listC.get(i).f();
                if (!TextUtils.isEmpty(strF) && strF.contains(lzjVar.f())) {
                    ReleaseLogUtil.d("R_DataPlatformStrategy", "updateSwitchSetting update app name： ", lzjVar.d(), "update status： ", Integer.valueOf(lzjVar.e()));
                    return this.f46938b.b()[i];
                }
            }
        }
        return "2";
    }

    public void c(lzh lzhVar, List<lzj> list) {
        if (njy.e(list)) {
            LogUtil.a("DataPlatformStrategy", "firstSyncAppSwitchStatus appListInfoList is null");
            return;
        }
        String[] strArr = new String[100];
        for (int i = 0; i < 100; i++) {
            strArr[i] = "2";
        }
        lzhVar.b(strArr);
        Iterator<lzj> it = list.iterator();
        while (it.hasNext()) {
            saveAppSwitch(it.next(), null);
        }
    }

    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public void getMainSwitch(final NotificationCallback<Boolean> notificationCallback) {
        LogUtil.a("DataPlatformStrategy", "getMainSwitch enter");
        ArrayList arrayList = new ArrayList();
        arrayList.add("900500009");
        qhq.b("9005", arrayList, new HiDataReadResultListener() { // from class: qxs.1
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                ReleaseLogUtil.d("R_DataPlatformStrategy", "getMainSwitch onResult errorCode: ", Integer.valueOf(i), ", data: ", obj);
                if (njy.b(obj, HiSampleConfig.class)) {
                    List list = (List) obj;
                    if (!njy.e(list)) {
                        notificationCallback.onSuccess(Boolean.valueOf("1".equals(ffv.a(((HiSampleConfig) list.get(0)).getConfigData(), "device_notify_switch"))));
                        return;
                    }
                }
                LogUtil.j("DataPlatformStrategy", "isListTypeMatch false or list is empty");
                qxs.this.c(new NotificationPushInteractor(BaseApplication.getContext()).b() ? "1" : "0", (IBaseResponseCallback) null);
                notificationCallback.onError(NotificationResult.MAIN_DATA_PLATFORM_ERROR, "isListTypeMatch false or list is empty");
            }
        });
    }

    public void c(String str, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("DataPlatformStrategy", "saveMainSwitch enter");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("device_notify_switch", str);
        qhq.d("9005", "900500009", jsonObject.toString(), new HiDataOperateListener() { // from class: qxu
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i, Object obj) {
                qxs.a(iBaseResponseCallback, i, obj);
            }
        }, System.currentTimeMillis());
    }

    static /* synthetic */ void a(IBaseResponseCallback iBaseResponseCallback, int i, Object obj) {
        ReleaseLogUtil.d("R_DataPlatformStrategy", "saveMainSwitch errorCode: ", Integer.valueOf(i), ", object: ", obj);
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(i, obj);
        }
    }

    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public void saveAppSwitch(lzj lzjVar, NotificationCallback<lzj> notificationCallback) {
        if (this.f46938b == null) {
            LogUtil.a("DataPlatformStrategy", "uploadAppStatus switchInfo is null ");
        } else if (this.d.d(lzjVar.f())) {
            lzh lzhVarD = d(this.f46938b, lzjVar.f(), lzjVar.e());
            this.f46938b = lzhVarD;
            ReleaseLogUtil.d("R_DataPlatformStrategy", "saveAppSwitch:", HiJsonUtil.d(lzhVarD));
            e();
        }
    }

    public void b(List<lzj> list) {
        if (this.f46938b == null) {
            LogUtil.a("DataPlatformStrategy", "uploadAppStatus switchInfo is null ");
            return;
        }
        list.stream().filter(new Predicate() { // from class: qxz
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f46952c.e((lzj) obj);
            }
        }).forEach(new Consumer() { // from class: qxx
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f46950b.d((lzj) obj);
            }
        });
        ReleaseLogUtil.d("R_DataPlatformStrategy", "saveAppSwitch list:", HiJsonUtil.d(this.f46938b));
        e();
    }

    /* synthetic */ boolean e(lzj lzjVar) {
        return this.d.d(lzjVar.f());
    }

    /* synthetic */ void d(lzj lzjVar) {
        d(this.f46938b, lzjVar.f(), lzjVar.e());
    }

    private void e() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f46938b.b(String.valueOf(jCurrentTimeMillis));
        this.f46938b.d(BaseApplication.getContext().getPackageName());
        qhq.d("9005", "900500035", HiJsonUtil.d(this.f46938b), new HiDataOperateListener() { // from class: qxw
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i, Object obj) {
                ReleaseLogUtil.d("R_DataPlatformStrategy", "saveSwitchSampleConfig switchStatus errorCode: ", Integer.valueOf(i), ", object: ", obj);
            }
        }, jCurrentTimeMillis);
        a(jCurrentTimeMillis);
    }

    public void a(long j) {
        LogUtil.a("DataPlatformStrategy", "updateTopAppModifiedTime :", Long.valueOf(j));
        SharedPreferenceManager.c("modifiedTimeId", "modifiedTime", j);
    }

    public long a() {
        return SharedPreferenceManager.d("modifiedTimeId", "modifiedTime", 0L);
    }

    private lzh d(lzh lzhVar, String str, int i) {
        List<lzj> listC = this.d.c();
        if (njy.e(listC)) {
            LogUtil.j("DataPlatformStrategy", "configManager list is empty ");
            return lzhVar;
        }
        c(lzhVar, i, str, listC);
        return lzhVar;
    }

    private void c(lzh lzhVar, int i, String str, List<lzj> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2) != null && lzhVar.b() != null && lzhVar.b().length > i2) {
                String strF = list.get(i2).f();
                if (!TextUtils.isEmpty(strF) && strF.contains(str)) {
                    lzhVar.b()[i2] = String.valueOf(i);
                    ReleaseLogUtil.d("R_DataPlatformStrategy", "updateSwitchSetting update app name： ", str, "update status： ", Integer.valueOf(i));
                    return;
                }
            }
        }
    }

    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public void saveMainSwitch(final int i, final NotificationCallback<Integer> notificationCallback) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("device_notify_switch", String.valueOf(i));
        qhq.d("9005", "900500009", jsonObject.toString(), new HiDataOperateListener() { // from class: qxv
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i2, Object obj) {
                qxs.c(notificationCallback, i, i2, obj);
            }
        }, System.currentTimeMillis());
    }

    static /* synthetic */ void c(NotificationCallback notificationCallback, int i, int i2, Object obj) {
        ReleaseLogUtil.d("R_DataPlatformStrategy", "saveMainSwitch errorCode: ", Integer.valueOf(i2), ", object: ", obj);
        if (notificationCallback == null) {
            return;
        }
        if (i2 == 0) {
            notificationCallback.onSuccess(Integer.valueOf(i));
        } else {
            notificationCallback.onError(NotificationResult.MAIN_DATA_PLATFORM_ERROR, "数据字典存储失败");
        }
    }

    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public void getNotifyReminderMode(final int i, final NotificationCallback<Integer> notificationCallback) {
        LogUtil.a("DataPlatformStrategy", "getSmartSwitch enter");
        ArrayList arrayList = new ArrayList();
        arrayList.add("900500010");
        qhq.b("9005", arrayList, new HiDataReadResultListener() { // from class: qxs.3
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                ReleaseLogUtil.d("R_DataPlatformStrategy", "getSmartSwitch onResult errorCode: ", Integer.valueOf(i2), ", data: ", obj);
                if (notificationCallback == null) {
                    LogUtil.j("DataPlatformStrategy", "getSmartSwitch callback in null");
                    return;
                }
                if (njy.b(obj, HiSampleConfig.class)) {
                    List list = (List) obj;
                    if (!njy.e(list)) {
                        String strA = ffv.a(((HiSampleConfig) list.get(0)).getConfigData(), "switch_smart_notify_reminder");
                        if (TextUtils.isEmpty(strA)) {
                            qxs qxsVar = qxs.this;
                            qxsVar.d(i != 3 ? "switch_silent_notify_using_phone" : "switch_smart_notify_reminder", qxsVar.new a(notificationCallback));
                            notificationCallback.onSuccess(3);
                            return;
                        }
                        notificationCallback.onSuccess(Integer.valueOf(!"0".equals(strA) ? 1 : 0));
                        return;
                    }
                }
                LogUtil.j("DataPlatformStrategy", "isListTypeMatch false or list is empty");
                notificationCallback.onError(NotificationResult.QUERY_EMPTY_RESULT, "isListTypeMatch false or list is empty");
            }
        });
    }

    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public void setNotifyReminderMode(int i, final NotificationCallback<Boolean> notificationCallback) {
        ReleaseLogUtil.d("R_DataPlatformStrategy", "setNotifyReminderMode enter, switchStatus: ", Integer.valueOf(i));
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("switch_smart_notify_reminder", String.valueOf(i));
        qhq.d("9005", "900500010", jsonObject.toString(), new HiDataOperateListener() { // from class: qxq
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i2, Object obj) {
                qxs.b(notificationCallback, i2, obj);
            }
        }, System.currentTimeMillis());
    }

    static /* synthetic */ void b(NotificationCallback notificationCallback, int i, Object obj) {
        ReleaseLogUtil.d("R_DataPlatformStrategy", "saveSmartSwitch errorCode: ", Integer.valueOf(i), ", object: ", obj);
        if (i == 0) {
            notificationCallback.onSuccess(true);
        } else {
            notificationCallback.onError(NotificationResult.PLATFORM_NOT_FOUND, "setNotifyReminderMode err");
        }
    }

    public void d(String str, a aVar) {
        aVar.d(str);
        mhs.a().getSwitchSetting(str, aVar);
    }

    public void c() {
        if (CloudUtils.a()) {
            LogUtil.a("DataPlatformStrategy", "syncSampleConfig enter");
            HiSyncOption hiSyncOption = new HiSyncOption();
            hiSyncOption.setSyncModel(2);
            hiSyncOption.setSyncAction(0);
            hiSyncOption.setSyncDataType(900000000);
            hiSyncOption.setSyncMethod(2);
            HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(hiSyncOption, null);
        }
    }

    public class a implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final NotificationCallback<Integer> f46945b;
        private String e;

        public a(NotificationCallback<Integer> notificationCallback) {
            this.f46945b = notificationCallback;
        }

        public void d(String str) {
            this.e = str;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0037  */
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            byte b2;
            if (i != 0) {
                String str = this.e;
                int iHashCode = str.hashCode();
                if (iHashCode != -455202974) {
                    if (iHashCode != 297185500) {
                        if (iHashCode == 2000260967 && str.equals("switch_smart_notify_reminder")) {
                            b2 = 0;
                        } else {
                            b2 = -1;
                        }
                    } else if (str.equals("switch_silent_notify_using_phone")) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                } else if (str.equals("lock_screen_reminder_switch")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
                if (b2 == 0) {
                    qxs.this.d("switch_silent_notify_using_phone", this);
                    return;
                } else if (b2 == 1) {
                    qxs.this.d("lock_screen_reminder_switch", this);
                    return;
                } else {
                    this.f46945b.onError(NotificationResult.PLATFORM_NOT_FOUND, "");
                    return;
                }
            }
            if (!(obj instanceof String)) {
                LogUtil.j("DataPlatformStrategy", "initSmartNotifyReminderView objectData not instanceof String");
            } else {
                this.f46945b.onSuccess(Integer.valueOf("1".equals(obj) ? 1 : 0));
            }
        }
    }
}
