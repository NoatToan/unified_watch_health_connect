package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.Bean;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Function;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes11.dex */
public class mub {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile mub f42414c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentLinkedQueue<Bean> f42415a;
    private HandlerThread f;
    private ExtendHandler g;
    private ConcurrentLinkedQueue<String> h;
    private Handler j;
    private ConcurrentLinkedQueue<List<Bean>> o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f42413b = new Object();
    private static final Object e = new Object();
    private e i = new e();
    private Map<String, Boolean> d = new ConcurrentHashMap(16);

    private boolean d(char c2) {
        if (c2 < 'A' || c2 > 'Z') {
            return c2 >= 'a' && c2 <= 'z';
        }
        return true;
    }

    private mub() {
        g();
    }

    public static mub e() {
        mub mubVar;
        synchronized (f42413b) {
            if (f42414c == null) {
                f42414c = new mub();
            }
            mubVar = f42414c;
        }
        return mubVar;
    }

    private static void o() {
        synchronized (f42413b) {
            f42414c = null;
        }
    }

    private void g() {
        this.o = new ConcurrentLinkedQueue<>();
        this.f42415a = new ConcurrentLinkedQueue<>();
        this.h = new ConcurrentLinkedQueue<>();
        this.f = new HandlerThread("observe_contact_change_thread");
        this.g = HandlerCenter.b(this.i, "SportContactSyncUtils");
        this.f.start();
        this.j = new Handler(this.f.getLooper());
        mti.a();
    }

    public void b(int i) {
        ReleaseLogUtil.d("R_SportContactSyncUtils", "onCompleteSendFile errorCode is : ", Integer.valueOf(i));
        if (i != 207) {
            e().c("SportContactSyncUtils onCompleteSendFile errorCode is : " + i);
            mrt.a().b();
        }
    }

    public void a(String str) {
        LogUtil.a("SportContactSyncUtils", "onReceiveDeviceSyncFile begin");
        f(str);
        i(str);
        a();
        e().b().remove(str);
    }

    private void i(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("SportContactSyncUtils", "storeLastAdded: deviceId is null or empty.");
            return;
        }
        ReleaseLogUtil.d("R_SportContactSyncUtils", "storeLastAdded begin.");
        List<msz> listJ = j();
        mti.c(str, listJ);
        ReleaseLogUtil.d("R_SportContactSyncUtils", "storeLastAdded: sync add contacts successfully. add list Size: ", Integer.valueOf(listJ.size()));
    }

    private void f(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("SportContactSyncUtils", "storeLastDelete: deviceId is null or empty.");
            return;
        }
        ReleaseLogUtil.d("R_SportContactSyncUtils", "storeLastDelete begin.");
        List<String> listH = h();
        mti.a(str, listH);
        ReleaseLogUtil.d("R_SportContactSyncUtils", "storeLastDeleted: sync delete contacts successfully. deleted list size: ", Integer.valueOf(listH.size()));
    }

    private List<msz> j() {
        if (this.f42415a.isEmpty()) {
            ReleaseLogUtil.e("R_SportContactSyncUtils", "getCurrentSynced: current add queue is empty.");
            return Collections.EMPTY_LIST;
        }
        LogUtil.a("SportContactSyncUtils", "getCurrentSynced: start");
        ArrayList arrayList = new ArrayList(this.f42415a.size());
        for (Bean bean : this.f42415a) {
            if (bean instanceof mtc) {
                mtc mtcVar = (mtc) bean;
                String uid = mtcVar.getUid();
                String strD = mtcVar.d("data1");
                if (StringUtils.g(strD)) {
                    strD = a(mtcVar);
                }
                String strC = e().c(mtcVar.n(), strD);
                String strB = mtr.b(d(mtcVar, strC, strD));
                int iE = CommonUtil.e(mtcVar.getId(), -1);
                if (iE != -1) {
                    arrayList.add(new msz(iE, uid, strB, strC));
                }
            }
        }
        LogUtil.a("SportContactSyncUtils", "getCurrentSynced: current add list size: ", Integer.valueOf(arrayList.size()));
        this.f42415a.clear();
        return arrayList;
    }

    public String d(mtc mtcVar, String str, String str2) {
        return new Gson().toJson(a(mtcVar, str, str2));
    }

    private List<String> h() {
        if (this.h.isEmpty()) {
            ReleaseLogUtil.e("R_SportContactSyncUtils", "mCurrentSyncDelContactsQueue is empty.");
            return Collections.EMPTY_LIST;
        }
        LogUtil.a("SportContactSyncUtils", "getCurrentDeleted: current delete list size: ", Integer.valueOf(this.h.size()));
        ArrayList arrayList = new ArrayList(this.h);
        this.h.clear();
        return arrayList;
    }

    public int c(String str, boolean z) {
        boolean zE = mud.e();
        LogUtil.a("SportContactSyncUtils", "checkPreCondition isSupportSportContact is : ", Boolean.valueOf(zE));
        if (!zE) {
            ReleaseLogUtil.d("R_SportContactSyncUtils", "notSupport SportContact device");
            return 5;
        }
        Boolean bool = e().b().get(str);
        if (bool != null && bool.booleanValue()) {
            ReleaseLogUtil.d("R_SportContactSyncUtils", "checkPreCondition SyncContact data is syncing");
            return 2;
        }
        if (!mtk.d()) {
            ReleaseLogUtil.d("R_SportContactSyncUtils", "checkPreCondition has no read contacts permissions");
            return 4;
        }
        if (!z || !coq.d(f42414c.d(str))) {
            return 0;
        }
        ReleaseLogUtil.d("R_SportContactSyncUtils", "syncAllContact but Contact is null");
        return 1;
    }

    public void c(boolean z) {
        String strE = mtn.e();
        if (CommonUtil.bg() && CommonUtil.ch()) {
            LogUtil.a("SportContactSyncUtils", "syncContactsData is up emui110");
            if (!n()) {
                c("SportContactSyncUtils isUpEmui110 syncContactData code is false");
                if (z) {
                    mrt.a().c(3);
                    return;
                }
                return;
            }
            if (z) {
                e().b().put(strE, true);
                e().d(strE, mrt.a().d, mrt.a().f42298a);
                return;
            } else {
                mrt.a().j();
                return;
            }
        }
        b(z, strE);
    }

    private void b(final boolean z, final String str) {
        mhs.a().getSwitchSetting("contacts_data_sync_switch", new IBaseResponseCallback() { // from class: mub.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                boolean z2 = !Utils.o();
                if (i == 0 && (obj instanceof String)) {
                    z2 = !"0".equals(obj);
                    ReleaseLogUtil.d("R_SportContactSyncUtils", "syncContactsData isChecked:", Boolean.valueOf(z2));
                }
                if (!z2) {
                    c();
                } else if (z) {
                    mub.e().b().put(str, true);
                    mub.e().d(str, mrt.a().d, mrt.a().f42298a);
                } else {
                    mrt.a().j();
                }
            }

            private void c() {
                ReleaseLogUtil.e("R_SportContactSyncUtils", "syncContactsData switch is false return");
                mub.this.c("SportContactSyncUtils third syncContactsData switch is false");
                if (z) {
                    mrt.a().c(3);
                }
            }
        });
    }

    private boolean n() {
        int i;
        try {
            i = Settings.System.getInt(BaseApplication.getContext().getContentResolver(), "contactsSwitch");
        } catch (Settings.SettingNotFoundException unused) {
            LogUtil.e("SportContactSyncUtils", "isSyncContactData SettingNotFoundException");
            i = -1;
        }
        LogUtil.a("SportContactSyncUtils", "isSyncContactData contactsSwitch:", Integer.valueOf(i));
        boolean z = true;
        if (i != 1 && i != -1) {
            z = false;
        }
        ReleaseLogUtil.d("R_SportContactSyncUtils", "isSyncContactData isSync:", Boolean.valueOf(z));
        return z;
    }

    public List<Bean> d(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("SportContactSyncUtils", "syncAllContacts: deviceId is null or empty.");
            return arrayList;
        }
        if (!mtk.d()) {
            ReleaseLogUtil.e("R_SportContactSyncUtils", "getAllContacts: no contacts permissions");
            return arrayList;
        }
        mti.c(str);
        return msm.d();
    }

    public void d(String str, int i, int i2) {
        a(str, i, i2);
    }

    private void a(String str, int i, int i2) {
        LogUtil.a("SportContactSyncUtils", "syncAllContacts begin");
        synchronized (e) {
            if (!TextUtils.isEmpty(str) && !"00:00:00:00:00:00".equals(str)) {
                if (!mtk.d()) {
                    LogUtil.j("SportContactSyncUtils", "syncAllContacts: no contacts permissions");
                    this.d.remove(str);
                    return;
                } else {
                    List<Bean> listD = d(str);
                    ReleaseLogUtil.d("R_SportContactSyncUtils", "syncAllContacts: ", Integer.valueOf(listD.size()));
                    a(c(listD), str, 0);
                    return;
                }
            }
            LogUtil.j("SportContactSyncUtils", "syncChangeContacts: deviceId is null or empty.");
            this.d.clear();
        }
    }

    public static <T> List<T> c(List<T> list) {
        if (list == null || list.size() <= 8100) {
            return new ArrayList(list);
        }
        return new ArrayList(list.subList(0, JosStatusCodes.RTN_CODE_PARAMS_ERROR));
    }

    public void b(String str) {
        LogUtil.a("SportContactSyncUtils", "syncChangeContacts begin");
        synchronized (e) {
            if (!TextUtils.isEmpty(str) && !"00:00:00:00:00:00".equals(str)) {
                if (!mtk.d()) {
                    LogUtil.j("SportContactSyncUtils", "syncChangeContacts: no contacts permissions");
                    this.d.remove(str);
                    return;
                }
                long jE = e(str);
                LogUtil.a("SportContactSyncUtils", "syncChangeContacts lastSyncedTime is : ", Long.valueOf(jE));
                if (coq.d(msm.d())) {
                    Boolean bool = e().b().get(str);
                    if (bool != null && bool.booleanValue()) {
                        ReleaseLogUtil.d("R_SportContactSyncUtils", "send delete operate fail , checkPreCondition SyncContact data is syncing");
                        return;
                    } else {
                        e().b().put(str, true);
                        mrt.a().g();
                        return;
                    }
                }
                e().b().put(str, true);
                if (mti.f(str).isEmpty()) {
                    e().d(str, mrt.a().d, mrt.a().f42298a);
                    return;
                }
                List<Bean> listB = msm.b(jE);
                ArrayList arrayList = new ArrayList(16);
                ArrayList arrayList2 = new ArrayList(16);
                ArrayList arrayList3 = new ArrayList(16);
                muf.b(listB, str, arrayList, arrayList2, arrayList3);
                ReleaseLogUtil.d("R_SportContactSyncUtils", "compare: updated size: ", Integer.valueOf(arrayList.size()), " deleted size :", Integer.valueOf(arrayList2.size()), " added size : ", Integer.valueOf(arrayList3.size()));
                if (coq.d(arrayList3) && coq.d(arrayList2)) {
                    LogUtil.j("SportContactSyncUtils", "added list size is ", Integer.valueOf(arrayList3.size()), "deleted list size is ", Integer.valueOf(arrayList2.size()));
                    this.d.remove(str);
                    return;
                }
                List<Bean> listC = c(arrayList2);
                List<Bean> listC2 = c(arrayList3);
                ArrayList arrayList4 = new ArrayList();
                c(listC, arrayList4, 3);
                c(listC2, arrayList4, 1);
                a(arrayList4, 1, str);
                return;
            }
            LogUtil.j("SportContactSyncUtils", "syncChangeContacts: deviceId is null or empty.");
            this.d.clear();
        }
    }

    private void a(List<Bean> list, String str, int i) {
        ArrayList arrayList = new ArrayList();
        c(list, arrayList, 1);
        mtg.a(BaseApplication.getContext()).d(str + "_sport");
        a(arrayList, i, str);
    }

    private void a(List<String> list, int i, String str) {
        ReleaseLogUtil.d("R_SportContactSyncUtils", "sendFile: jsonList size: ", Integer.valueOf(list.size()), "flag is ", Integer.valueOf(i));
        try {
            a();
            if (!mue.c(list, msd.f42343b, "contacts.json", i)) {
                ReleaseLogUtil.d("R_SportContactSyncUtils", "sendFile: json write to file failed. ");
                this.d.remove(str);
                e().c("SportContactSyncUtils sendFile: json write to file failed");
            } else {
                b(str, System.currentTimeMillis());
                mrt.a().e(msd.f42343b + "contacts.json");
            }
        } catch (Exception unused) {
            ReleaseLogUtil.d("R_SportContactSyncUtils", "sendContactListToDevice failed.");
            this.d.remove(str);
        }
    }

    private void c(List<Bean> list, List<String> list2, int i) {
        LogUtil.a("SportContactSyncUtils", "beanList size is ", Integer.valueOf(list.size()), "operate is ", Integer.valueOf(i));
        Gson gson = new Gson();
        if (i == 1) {
            this.f42415a.clear();
            this.f42415a.addAll(list);
            e(list, gson, list2, i);
        } else if (i == 3) {
            this.h.clear();
            List list3 = (List) list.stream().map(new Function() { // from class: muc
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((Bean) obj).getUid();
                }
            }).collect(Collectors.toList());
            LogUtil.a("SportContactSyncUtils", "ids size is ", Integer.valueOf(list3.size()));
            this.h.addAll(list3);
            d(list, gson, list2, i);
        }
        LogUtil.a("SportContactSyncUtils", "jsonList size is : ", Integer.valueOf(list2.size()));
    }

    private void e(List<Bean> list, Gson gson, List<String> list2, int i) {
        TreeMap treeMap = new TreeMap();
        LogUtil.a("SportContactSyncUtils", "createJsonList polled size is : ", Integer.valueOf(list.size()));
        Iterator<Bean> it = list.iterator();
        while (it.hasNext()) {
            mtc mtcVar = (mtc) it.next();
            String strD = mtcVar.d("data1");
            if (StringUtils.g(strD)) {
                strD = a(mtcVar);
                if (StringUtils.g(strD)) {
                    LogUtil.a("SportContactSyncUtils", "displayName is null");
                }
            }
            String strC = c(mtcVar.n(), strD);
            if (treeMap.containsKey(strC)) {
                treeMap.get(strC).add(a(mtcVar, strC, strD));
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(a(mtcVar, strC, strD));
                treeMap.put(strC, arrayList);
            }
        }
        LogUtil.a("SportContactSyncUtils", "letterMap size is : ", Integer.valueOf(treeMap.size()));
        a(gson, list2, i, treeMap);
    }

    private msw a(mtc mtcVar, String str, String str2) {
        msw mswVar = new msw();
        List<msx> arrayList = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : mtcVar.a("vnd.android.cursor.item/phone_v2").entrySet()) {
            String key = entry.getKey();
            for (String str3 : entry.getValue()) {
                msx msxVar = new msx();
                msxVar.a(mue.a(key, 28));
                msxVar.e(mue.a(str3, 28));
                arrayList.add(msxVar);
            }
        }
        mswVar.c(str);
        mswVar.e(mue.a(str2, 28));
        mswVar.d(mue.a(mtcVar.n(), 56));
        mswVar.a(mue.a(mtcVar.getUid(), 32));
        if (arrayList.size() > 7) {
            arrayList = arrayList.subList(0, 7);
        }
        mswVar.b(arrayList);
        return mswVar;
    }

    public String a(mtc mtcVar) {
        Iterator<Map.Entry<String, List<String>>> it = mtcVar.a("vnd.android.cursor.item/phone_v2").entrySet().iterator();
        String next = "";
        while (it.hasNext()) {
            Iterator<String> it2 = it.next().getValue().iterator();
            if (it2.hasNext()) {
                next = it2.next();
            }
        }
        return next;
    }

    private void a(Gson gson, List<String> list, int i, Map<String, List<msw>> map) {
        for (Map.Entry<String, List<msw>> entry : map.entrySet()) {
            for (List<msw> list2 : d(entry.getValue())) {
                mtf mtfVar = new mtf();
                mtfVar.e(mue.a(CommonUtil.k(BaseApplication.getContext()), 32));
                mtfVar.e(mrt.a().d + 1);
                mtfVar.a(i);
                mtfVar.c(entry.getKey());
                mtfVar.c(list2);
                String json = gson.toJson(mtfVar);
                LogUtil.a("SportContactSyncUtils", "getJsonListFromMap size is : ", Integer.valueOf(list2.size()), " letter is :", entry.getKey());
                list.add(json);
            }
        }
    }

    public static <T> List<List<T>> d(List<T> list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 20;
            arrayList.add(list.subList(i, Math.min(i2, size)));
            i = i2;
        }
        return arrayList;
    }

    private void d(List<Bean> list, Gson gson, List<String> list2, int i) {
        TreeMap treeMap = new TreeMap();
        LogUtil.a("SportContactSyncUtils", "createDeleteJsonList polled size is : ", Integer.valueOf(list.size()));
        Iterator<Bean> it = list.iterator();
        while (it.hasNext()) {
            mtc mtcVar = (mtc) it.next();
            String strN = mtcVar.n();
            LogUtil.a("SportContactSyncUtils", "firstLetter is : ", strN);
            if (treeMap.containsKey(strN)) {
                List<msw> list3 = treeMap.get(strN);
                msw mswVar = new msw();
                mswVar.c(strN);
                mswVar.a(mue.a(mtcVar.getUid(), 32));
                list3.add(mswVar);
            } else {
                ArrayList arrayList = new ArrayList();
                msw mswVar2 = new msw();
                mswVar2.c(strN);
                mswVar2.a(mue.a(mtcVar.getUid(), 32));
                arrayList.add(mswVar2);
                treeMap.put(strN, arrayList);
            }
        }
        LogUtil.a("SportContactSyncUtils", "letterMap size is : ", Integer.valueOf(treeMap.size()));
        a(gson, list2, i, treeMap);
    }

    public String c(String str, String str2) {
        if (CommonUtil.bc() || CommonUtil.cq()) {
            return a(str, str2);
        }
        return g(str2);
    }

    private String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "#";
        }
        char cCharAt = str.charAt(0);
        if (d(cCharAt)) {
            return String.valueOf(cCharAt).toUpperCase(Locale.ENGLISH);
        }
        return g(str2);
    }

    private String g(String str) {
        if (TextUtils.isEmpty(str)) {
            return "#";
        }
        String upperCase = "";
        String strB = aji.b(str, "");
        if (strB != null && !strB.isEmpty()) {
            upperCase = strB.substring(0, 1).toUpperCase(Locale.ENGLISH);
        }
        return upperCase.matches("[A-Z]") ? upperCase : "#";
    }

    public void a() {
        LogUtil.a("SportContactSyncUtils", "deleteUpdatedCache.");
        mtt.c(msd.f42343b);
    }

    private void i() {
        this.o.clear();
        this.f42415a.clear();
        this.h.clear();
    }

    private void f() {
        ExtendHandler extendHandler = this.g;
        if (extendHandler != null) {
            extendHandler.removeTasksAndMessages();
        }
        this.j.removeCallbacksAndMessages(null);
    }

    public void d() {
        mrt.a().c();
        mrt.a().b();
        a();
        i();
        f();
    }

    public void c() {
        i();
        f();
        ExtendHandler extendHandler = this.g;
        if (extendHandler != null) {
            extendHandler.removeTasksAndMessages();
            this.g = null;
        }
        this.f.quit();
        o();
    }

    class e implements Handler.Callback {
        private e() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 16) {
                return true;
            }
            LogUtil.j("SportContactSyncUtils", "handleMessage: fail in default case. what: ", Integer.valueOf(message.what));
            return false;
        }
    }

    public Map<String, Boolean> b() {
        return this.d;
    }

    public void c(String str) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(4);
        linkedHashMap.put("keyWords", "ContactSync");
        linkedHashMap.put("messages", str);
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_SPORT_WATCH_CONTACT_SYNC_2129039.value(), linkedHashMap);
    }

    public static void b(String str, long j) {
        LogUtil.a("SportContactSyncUtils", "setSportContactLastSyncedTime in lastSyncedTime: ", Long.valueOf(j));
        SharedPreferenceManager.c("sport_contact_module", str, j);
    }

    public static long e(String str) {
        return SharedPreferenceManager.d("sport_contact_module", str, 0L);
    }
}
