package com.huawei.ui.device.activity.notification.viewmodel;

import android.app.Application;
import android.text.TextUtils;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.ui.device.activity.notification.data.repository.NotificationRepository;
import com.huawei.ui.device.activity.notification.data.repository.NotificationRepositoryImpl;
import com.huawei.ui.device.activity.notification.data.storage.NotificationCallback;
import com.huawei.ui.device.activity.notification.data.storage.NotificationResult;
import com.huawei.ui.device.activity.notification.viewmodel.NotificationViewModel;
import defpackage.eej;
import defpackage.lzj;
import defpackage.qxr;
import defpackage.xjt;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes16.dex */
public class NotificationViewModel extends AndroidViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MutableLiveData<List<lzj>> f24558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f24559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<lzj> f24560c;
    protected String d;
    protected String e;
    private String f;
    private final MutableLiveData<Boolean> g;
    private boolean h;
    private final MutableLiveData<List<Boolean>> i;
    private final MutableLiveData<NotificationResult> j;
    private final NotificationRepository k;
    private String l;
    private final MutableLiveData<Integer> m;
    private final MutableLiveData<Boolean> n;
    private String o;
    private final MutableLiveData<Boolean> r;
    private final MutableLiveData<Integer> s;

    public NotificationViewModel(Application application) {
        super(application);
        this.d = "";
        this.f24559b = "";
        this.e = "";
        this.f = "";
        this.l = "";
        this.f24558a = new MutableLiveData<>();
        this.r = new MutableLiveData<>();
        this.i = new MutableLiveData<>();
        this.j = new MutableLiveData<>();
        this.n = new MutableLiveData<>();
        this.m = new MutableLiveData<>();
        this.s = new MutableLiveData<>();
        this.g = new MutableLiveData<>();
        this.h = false;
        LogUtil.a("NotificationViewModel", "NotificationViewModel initialized");
        this.k = new NotificationRepositoryImpl();
        v();
    }

    private void v() {
        LogUtil.a("NotificationViewModel", "Initializing default values");
        if (this.r.getValue() == null) {
            this.r.setValue(false);
        }
        if (this.n.getValue() == null) {
            this.n.setValue(false);
        }
        if (this.m.getValue() == null) {
            this.m.setValue(0);
        }
        if (this.s.getValue() == null) {
            this.s.setValue(1);
        }
        if (this.g.getValue() == null) {
            this.g.setValue(true);
        }
        if (this.i.getValue() == null) {
            this.i.setValue(new CopyOnWriteArrayList(Collections.nCopies(3, false)));
        }
        LogUtil.a("NotificationViewModel", "Default values initialized successfully");
    }

    public LiveData<List<lzj>> d() {
        return this.f24558a;
    }

    public LiveData<Boolean> e() {
        return this.r;
    }

    public LiveData<Boolean> a() {
        return this.g;
    }

    public LiveData<List<Boolean>> i() {
        return this.i;
    }

    public LiveData<NotificationResult> c() {
        return this.j;
    }

    public LiveData<Boolean> g() {
        return this.n;
    }

    public LiveData<Integer> j() {
        return this.m;
    }

    public MutableLiveData<Integer> n() {
        return this.s;
    }

    public void s() {
        if (e(0)) {
            LogUtil.a("NotificationViewModel", "repeat loading main ");
        } else {
            b(0, true);
            ThreadPoolManager.c().a("NotificationViewModel", new Runnable() { // from class: qyi
                @Override // java.lang.Runnable
                public final void run() {
                    this.f46958a.l();
                }
            });
        }
    }

    public /* synthetic */ void l() {
        LogUtil.a("NotificationViewModel", "开始加载主开关状态");
        this.k.loadNotificationMainSwitchStatus(new NotificationCallback<Boolean>() { // from class: com.huawei.ui.device.activity.notification.viewmodel.NotificationViewModel.1
            @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Boolean bool) {
                LogUtil.a("NotificationViewModel", "主开关状态加载成功: ", bool);
                NotificationViewModel.this.i(Boolean.TRUE.equals(bool));
                NotificationViewModel.this.i.postValue(NotificationViewModel.this.b(0, false));
            }

            @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationCallback
            public void onError(NotificationResult notificationResult, String str) {
                LogUtil.a("NotificationViewModel", "加载主开关状态失败: ", str);
                if (NotificationResult.MAIN_STATUS_ERR == notificationResult) {
                    NotificationViewModel.this.i(false);
                } else {
                    NotificationViewModel.this.j.postValue(notificationResult);
                }
                NotificationViewModel.this.i.postValue(NotificationViewModel.this.b(0, false));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(boolean z) {
        this.h = z;
        this.n.postValue(Boolean.valueOf(z));
        if (this.h) {
            this.f24558a.postValue(this.f24560c);
            if (TextUtils.isEmpty(this.l)) {
                f();
                this.l = y();
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(this.f)) {
            f();
            this.f = b();
        }
    }

    protected void f() {
        if (TextUtils.isEmpty(this.e) || TextUtils.isEmpty(this.f24559b)) {
            GRSManager gRSManagerC = GRSManager.c(BaseApplication.getContext());
            String countryCode = gRSManagerC.getCountryCode();
            this.d = gRSManagerC.getNoCheckUrl("helpCustomerUrl", countryCode);
            this.f24559b = gRSManagerC.getNoCheckUrl("domainTipsResDbankcdn", countryCode);
            String noCheckUrl = gRSManagerC.getNoCheckUrl("domainTipsResDbankcdnNew", countryCode);
            this.e = noCheckUrl;
            if (TextUtils.isEmpty(noCheckUrl)) {
                LogUtil.j("NotificationViewModel", "Get URL oversea is null");
                return;
            }
            if (TextUtils.isEmpty(this.f24559b)) {
                LogUtil.j("NotificationViewModel", "Get URL is null");
                return;
            }
            if (this.f24559b.contains("drcn")) {
                LogUtil.a("NotificationViewModel", "The location is domestic");
                return;
            }
            if (this.f24559b.contains("dra")) {
                this.f24559b += "/handbook";
                return;
            }
            LogUtil.a("NotificationViewModel", "Get URL completed");
        }
    }

    protected String h() {
        String str = LanguageUtil.b(BaseApplication.getContext()) + Constants.LINK + BaseApplication.getContext().getResources().getConfiguration().locale.getCountry();
        LogUtil.a("NotificationViewModel", "getLanguageTag languageTag is: ", str);
        return str;
    }

    protected String b() {
        String str;
        LogUtil.a("NotificationViewModel", "getNotificationOpenTipUrl siteId:", Integer.valueOf(CommonUtil.n(BaseApplication.getContext(), LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009))));
        String strH = h();
        if (Utils.o()) {
            str = this.e + "/handbook/Jumppage/EMUI8.0/C001B001/en-US/index.html?lang=%s&devicetype=faq_switch".replace("lang=%s", "lang=" + strH);
        } else {
            str = this.e + String.format(Locale.ENGLISH, "/hwtips/scenepage/faq_switch/%s/index.html", x());
        }
        LogUtil.a("NotificationViewModel", "getNotificationOpenTipUrl url : ", str);
        return str;
    }

    private String y() {
        String str;
        int iN = CommonUtil.n(BaseApplication.getContext(), LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009));
        LogUtil.a("NotificationViewModel", "getNotificationTipUrl siteId:", Integer.valueOf(iN));
        if (iN == 1) {
            if (LanguageUtil.l(BaseApplication.getContext())) {
                str = this.d + "/hwtips/browser?lang=zh-CN&prodId=health_help_all&title=%E5%8D%8E%E4%B8%BA%E6%88%96%E4%B8%89%E6%96%B9%E5%AE%89%E5%8D%93%E6%89%8B%E6%9C%BA%E6%B6%88%E6%81%AF%E6%97%A0%E6%B3%95%E6%8E%A8%E9%80%81%E5%88%B0%E7%A9%BF%E6%88%B4%E8%AE%BE%E5%A4%87%E6%80%8E%E4%B9%88%E5%8A%9E&url=https%3A%2F%2Fconsumer-tkb.huawei.com%2Fweknow%2Fservlet%2Fshow%2FknowContextServlet%3FknowId%3Dzh-cn15958978";
            } else {
                str = this.d + "/hwtips/browser?lang=en-US&prodId=health_help_all&title=Unable%20to%20receive%20messages%20after%20my%20wearable%20device%20is%20connected%20to%20a%20HUAWEI%20or%20third-party%20Android%20phone&url=https%3A%2F%2Fconsumer-tkb.huawei.com%2Fweknow%2Fservlet%2Fshow%2FknowContextServlet%3FknowId%3Den-us15945721";
            }
        } else if (CommonUtil.aa(BaseApplication.getContext())) {
            DeviceCapability deviceCapabilityA = eej.a(this.o);
            if (deviceCapabilityA != null && deviceCapabilityA.isAvoidDisturb()) {
                str = this.f24559b + "/Android_Note_fr_FR/EMUI8.0/C001B001/fr-FR/index.html";
            } else {
                str = this.f24559b + "/Android_Note_fr_FR/EMUI8.0/C001B001/fr-FR/index2.html";
            }
        } else if (ac() && LanguageUtil.p(BaseApplication.getContext())) {
            str = this.f24559b + "/Android_Note_en/EMUI8.0/C001B001/de-DE/index.html";
        } else if (iN == 0 && this.f24559b.contains("drcn")) {
            if (LanguageUtil.l(BaseApplication.getContext())) {
                str = this.d + "/hwtips/browser?lang=zh-CN&prodId=health_help_all&title=%E5%8D%8E%E4%B8%BA%E6%88%96%E4%B8%89%E6%96%B9%E5%AE%89%E5%8D%93%E6%89%8B%E6%9C%BA%E6%B6%88%E6%81%AF%E6%97%A0%E6%B3%95%E6%8E%A8%E9%80%81%E5%88%B0%E7%A9%BF%E6%88%B4%E8%AE%BE%E5%A4%87%E6%80%8E%E4%B9%88%E5%8A%9E&url=https%3A%2F%2Fconsumer-tkb.huawei.com%2Fweknow%2Fservlet%2Fshow%2FknowContextServlet%3FknowId%3Dzh-cn15958978";
            } else {
                str = this.d + "/hwtips/browser?lang=en-US&prodId=health_help_all&title=Unable%20to%20receive%20messages%20after%20my%20wearable%20device%20is%20connected%20to%20a%20HUAWEI%20or%20third-party%20Android%20phone&url=https%3A%2F%2Fconsumer-tkb.huawei.com%2Fweknow%2Fservlet%2Fshow%2FknowContextServlet%3FknowId%3Den-us15945721";
            }
        } else {
            str = this.e + "/handbook/Jumppage/EMUI8.0/C001B001/en-US/index.html?lang=%s&devicetype=Notification".replace("lang=%s", "lang=" + h());
        }
        LogUtil.a("NotificationViewModel", "getNoPushTipUrl ", str);
        return str;
    }

    private boolean ac() {
        return !TextUtils.isEmpty(this.f24559b) && this.f24559b.contains("dra");
    }

    private String x() {
        String strB = LanguageUtil.b(BaseApplication.getContext());
        if ("ZH".equalsIgnoreCase(strB) || "BO".equalsIgnoreCase(strB) || "UG".equalsIgnoreCase(strB)) {
            return "zh-CN";
        }
        return "en-US";
    }

    public void t() {
        if (e(2)) {
            LogUtil.a("NotificationViewModel", "正在加载中，跳过重复调用");
            return;
        }
        b(2, true);
        this.j.setValue(null);
        ThreadPoolManager.c().a("NotificationViewModel", new Runnable() { // from class: qyn
            @Override // java.lang.Runnable
            public final void run() {
                this.f46964a.m();
            }
        });
    }

    public /* synthetic */ void m() {
        LogUtil.a("NotificationViewModel", "开始刷新应用列表");
        this.k.loadNotificationAppList(new NotificationCallback<List<lzj>>() { // from class: com.huawei.ui.device.activity.notification.viewmodel.NotificationViewModel.4
            @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<lzj> list) {
                LogUtil.a("NotificationViewModel", "应用列表刷新成功 isMainSwitchEnable:", Boolean.valueOf(NotificationViewModel.this.h));
                NotificationViewModel.this.f24560c = list;
                if (NotificationViewModel.this.h) {
                    NotificationViewModel.this.f24558a.postValue(NotificationViewModel.this.f24560c);
                    NotificationViewModel.this.c(list);
                }
                NotificationViewModel.this.i.postValue(NotificationViewModel.this.b(2, false));
            }

            @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationCallback
            public void onError(NotificationResult notificationResult, String str) {
                LogUtil.a("NotificationViewModel", "刷新应用列表失败: " + str);
                NotificationViewModel.this.j.postValue(notificationResult);
                NotificationViewModel.this.i.postValue(NotificationViewModel.this.b(2, false));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<lzj> list) {
        if (CollectionUtils.a(list)) {
            return;
        }
        Iterator<lzj> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().e() != 1) {
                this.g.postValue(true);
                return;
            }
        }
        this.g.postValue(false);
    }

    public void d(final String str) {
        LogUtil.a("NotificationViewModel", "searchAppByName:", str);
        ThreadPoolManager.c().a("NotificationViewModel", new Runnable() { // from class: qyt
            @Override // java.lang.Runnable
            public final void run() {
                this.f46969b.e(str);
            }
        });
    }

    public /* synthetic */ void e(final String str) {
        if (TextUtils.isEmpty(str)) {
            this.f24558a.postValue(this.f24560c);
        } else {
            if (this.f24560c == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f24560c);
            arrayList.removeIf(new Predicate() { // from class: qym
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return NotificationViewModel.c(str, (lzj) obj);
                }
            });
            this.f24558a.postValue(arrayList);
        }
    }

    public static /* synthetic */ boolean c(String str, lzj lzjVar) {
        return lzjVar.d() == null || !lzjVar.d().toLowerCase().contains(str.toLowerCase());
    }

    public void p() {
        if (e(1)) {
            LogUtil.a("NotificationViewModel", "repeat loading loadNotifyReminderMode");
        } else {
            b(1, true);
            ThreadPoolManager.c().a("NotificationViewModel", new Runnable() { // from class: qyp
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.k();
                }
            });
        }
    }

    public /* synthetic */ void k() {
        LogUtil.a("NotificationViewModel", "loadNotifyReminderMode");
        this.k.loadNotificationRemindMode(new NotificationCallback<Integer>() { // from class: com.huawei.ui.device.activity.notification.viewmodel.NotificationViewModel.3
            @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Integer num) {
                LogUtil.a("NotificationViewModel", "loadNotifyReminderMode:", num);
                NotificationViewModel.this.m.postValue(num);
                NotificationViewModel.this.i.postValue(NotificationViewModel.this.b(1, false));
            }

            @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationCallback
            public void onError(NotificationResult notificationResult, String str) {
                LogUtil.a("NotificationViewModel", "loadNotifyReminderMode 失败: " + str);
                NotificationViewModel.this.j.postValue(notificationResult);
                NotificationViewModel.this.i.postValue(NotificationViewModel.this.b(1, false));
            }
        });
    }

    private boolean e(int i) {
        List<Boolean> value = this.i.getValue();
        if (value != null) {
            return value.get(i).booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Boolean> b(int i, boolean z) {
        List<Boolean> value = this.i.getValue();
        if (value != null) {
            value.set(i, Boolean.valueOf(z));
        }
        return value;
    }

    public void b(final int i) {
        ReleaseLogUtil.d("R_NotificationViewModel", "updateNotifyReminderMode:", Integer.valueOf(i));
        b("sync_mode", String.valueOf(i), null);
        ThreadPoolManager.c().a("NotificationViewModel", new Runnable() { // from class: qyr
            @Override // java.lang.Runnable
            public final void run() {
                this.f46967a.c(i);
            }
        });
    }

    public /* synthetic */ void c(final int i) {
        this.k.setNotificationRemindMode(i, new NotificationCallback<Boolean>() { // from class: com.huawei.ui.device.activity.notification.viewmodel.NotificationViewModel.2
            @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Boolean bool) {
                LogUtil.a("NotificationViewModel", "updateNotifyReminderMode success:", Integer.valueOf(i));
                NotificationViewModel.this.m.postValue(Integer.valueOf(i));
                xjt.ag("updateSyncMode success " + i);
            }

            @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationCallback
            public void onError(NotificationResult notificationResult, String str) {
                LogUtil.a("NotificationViewModel", "updateNotifyReminderMode 失败: " + str);
                NotificationViewModel.this.j.postValue(notificationResult);
                xjt.ag("updateSyncMode fail " + i);
            }
        });
    }

    public void b(final boolean z) {
        if (this.h && z) {
            LogUtil.a("NotificationViewModel", "updateMainSwitchStatus: not change");
            return;
        }
        ReleaseLogUtil.d("R_NotificationViewModel", "updateMainSwitchStatus: ", Boolean.valueOf(z));
        b("main_switch", String.valueOf(z), null);
        ThreadPoolManager.c().a("NotificationViewModel", new Runnable() { // from class: qyf
            @Override // java.lang.Runnable
            public final void run() {
                this.d.d(z);
            }
        });
    }

    public /* synthetic */ void d(final boolean z) {
        this.k.saveNotificationMainSwitchStatus(z, new NotificationCallback<Boolean>() { // from class: com.huawei.ui.device.activity.notification.viewmodel.NotificationViewModel.5
            @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Boolean bool) {
                LogUtil.a("NotificationViewModel", "主开关状态修改成功: ", bool);
                NotificationViewModel.this.i(Boolean.TRUE.equals(bool));
                xjt.ag("updateMainSwitchStatus success " + z);
            }

            @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationCallback
            public void onError(NotificationResult notificationResult, String str) {
                LogUtil.e("NotificationViewModel", "更新主开关状态失败", str);
                NotificationViewModel.this.j.postValue(notificationResult);
                xjt.ag("openNotificationAccess fail " + z);
            }
        });
    }

    public void a(final lzj lzjVar, final boolean z) {
        ReleaseLogUtil.d("R_NotificationViewModel", "updateAppSwitchStatus:", lzjVar.d(), ",", lzjVar.f(), ",", Boolean.valueOf(z));
        b("app_switch", String.valueOf(z), lzjVar.f());
        ThreadPoolManager.c().a("NotificationViewModel", new Runnable() { // from class: qyl
            @Override // java.lang.Runnable
            public final void run() {
                this.f46962a.d(lzjVar, z);
            }
        });
    }

    /* JADX INFO: renamed from: com.huawei.ui.device.activity.notification.viewmodel.NotificationViewModel$9, reason: invalid class name */
    public class AnonymousClass9 implements NotificationCallback<Boolean> {
        final /* synthetic */ lzj d;
        final /* synthetic */ boolean e;

        AnonymousClass9(lzj lzjVar, boolean z) {
            this.d = lzjVar;
            this.e = z;
        }

        @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Boolean bool) {
            LogUtil.a("NotificationViewModel", "应用开关状态更新成功: " + this.d.d() + " -> " + this.e);
            List list = (List) NotificationViewModel.this.f24558a.getValue();
            if (list != null) {
                final lzj lzjVar = this.d;
                final boolean z = this.e;
                list.forEach(new Consumer() { // from class: qyu
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        NotificationViewModel.AnonymousClass9.d(lzjVar, z, (lzj) obj);
                    }
                });
            }
            NotificationViewModel.this.r.postValue(Boolean.valueOf(this.e));
            NotificationViewModel notificationViewModel = NotificationViewModel.this;
            notificationViewModel.c((List<lzj>) notificationViewModel.f24560c);
            xjt.ag("updateAppSwitch success " + this.d.d() + this.e);
        }

        public static /* synthetic */ void d(lzj lzjVar, boolean z, lzj lzjVar2) {
            if (lzjVar2.f().equals(lzjVar.f())) {
                lzjVar2.e(z ? 1 : 0);
            }
        }

        @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationCallback
        public void onError(NotificationResult notificationResult, String str) {
            LogUtil.e("NotificationViewModel", "更新应用开关状态失败", str);
            NotificationViewModel.this.j.postValue(notificationResult);
            xjt.ag("updateAppSwitch fail " + this.d.d() + this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void d(lzj lzjVar, boolean z) {
        this.k.updateNotificationAppAuthorization(lzjVar, z, new AnonymousClass9(lzjVar, z));
    }

    public void q() {
        ThreadPoolManager.c().a("NotificationViewModel", new Runnable() { // from class: qyh
            @Override // java.lang.Runnable
            public final void run() {
                this.e.r();
            }
        });
    }

    public /* synthetic */ void r() {
        this.s.postValue(Integer.valueOf(this.k.loadSwitchSyncVersion()));
    }

    public void u() {
        t();
        s();
        p();
        q();
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        w();
        LogUtil.a("NotificationViewModel", "NotificationViewModel cleared");
        qxr.d();
    }

    public boolean o() {
        for (lzj lzjVar : (List) this.f24560c.stream().filter(new Predicate() { // from class: qyk
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return NotificationViewModel.b((lzj) obj);
            }
        }).collect(Collectors.toList())) {
            if (!a(lzjVar.f(), lzjVar.a())) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean b(lzj lzjVar) {
        LogUtil.a("NotificationViewModel", "filter ", lzjVar.d());
        return (lzjVar.e() == 1 || lzjVar.a() == -1) ? false : true;
    }

    public void a(final boolean z) {
        ReleaseLogUtil.d("R_NotificationViewModel", "changeBatchOperationStatus ", Boolean.valueOf(z));
        if (CollectionUtils.a(this.f24560c)) {
            return;
        }
        b("all_app", String.valueOf(z), null);
        ThreadPoolManager.c().a("NotificationViewModel", new Runnable() { // from class: qyq
            @Override // java.lang.Runnable
            public final void run() {
                this.f46966a.c(z);
            }
        });
    }

    public /* synthetic */ void c(final boolean z) {
        this.k.updateAllAppAuthorization((List) this.f24560c.stream().filter(new Predicate() { // from class: qys
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return NotificationViewModel.e(z, (lzj) obj);
            }
        }).collect(Collectors.toList()), z, new AnonymousClass6(z));
    }

    public static /* synthetic */ boolean e(boolean z, lzj lzjVar) {
        LogUtil.a("NotificationViewModel", "filter ", lzjVar.d(), " - ", Integer.valueOf(lzjVar.e()));
        return (lzjVar.e() == 1 && !z) || (lzjVar.e() != 1 && z);
    }

    /* JADX INFO: renamed from: com.huawei.ui.device.activity.notification.viewmodel.NotificationViewModel$6, reason: invalid class name */
    public class AnonymousClass6 implements NotificationCallback<Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f24563b;

        AnonymousClass6(boolean z) {
            this.f24563b = z;
        }

        @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Boolean bool) {
            LogUtil.a("NotificationViewModel", "应用开关批量更新成功: ", Boolean.valueOf(this.f24563b));
            List list = (List) NotificationViewModel.this.f24558a.getValue();
            if (list != null) {
                final boolean z = this.f24563b;
                list.forEach(new Consumer() { // from class: qyy
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((lzj) obj).e(z ? 1 : 0);
                    }
                });
            }
            NotificationViewModel.this.r.postValue(Boolean.valueOf(this.f24563b));
            NotificationViewModel notificationViewModel = NotificationViewModel.this;
            notificationViewModel.c((List<lzj>) notificationViewModel.f24560c);
            xjt.ag("changeBatchOperationStatus success " + this.f24563b);
        }

        @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationCallback
        public void onError(NotificationResult notificationResult, String str) {
            LogUtil.e("NotificationViewModel", "应用开关批量更新失败", str);
            NotificationViewModel.this.j.postValue(notificationResult);
            xjt.ag("changeBatchOperationStatus fail " + this.f24563b);
        }
    }

    public void b(String str, String str2, String str3) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("status", str2);
        linkedHashMap.put("type", str);
        if (!TextUtils.isEmpty(str3)) {
            linkedHashMap.put("packageName", str3);
        }
        OpAnalyticsUtil.getInstance().setEvent(OperationKey.HEALTH_APP_DEVICE_NOTIFICATION_SETTING.value(), linkedHashMap);
    }

    public String e(boolean z) {
        if (z && TextUtils.isEmpty(this.l)) {
            f();
            this.l = y();
        }
        if (!z && TextUtils.isEmpty(this.f)) {
            f();
            this.f = b();
        }
        return z ? this.l : this.f;
    }

    public boolean a(String str, int i) {
        return this.k.isNotificationEnabledInSystem(str, i);
    }

    public void w() {
        ThreadPoolManager threadPoolManagerC = ThreadPoolManager.c();
        final NotificationRepository notificationRepository = this.k;
        Objects.requireNonNull(notificationRepository);
        threadPoolManagerC.a("NotificationViewModel", new Runnable() { // from class: qyo
            @Override // java.lang.Runnable
            public final void run() {
                notificationRepository.syncSwitchStatusToCloud();
            }
        });
    }

    public void c(String str) {
        this.o = str;
    }
}
