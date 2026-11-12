package com.huawei.watchface;

import android.content.SharedPreferences;
import com.google.gson.reflect.TypeToken;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.api.HwWatchFaceManager;
import com.huawei.watchface.api.MembershipRepository;
import com.huawei.watchface.api.ResponseListener;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.datatype.WatchResourcesInfo;
import com.huawei.watchface.mvp.model.datatype.orderhistory.OrderHistoryRequestModel;
import com.huawei.watchface.mvp.model.datatype.orderhistory.OrderHistoryResponse;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class g5 {
    public static final String f = "g5";
    public static volatile g5 g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f30179b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f30180c = new ArrayList();
    public List d = new ArrayList();
    public boolean e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f30178a = new Runnable() { // from class: com.huawei.watchface.g5$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.i();
        }
    };

    public class a implements ResponseListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f30181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f30182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f30183c;

        public a(boolean z, boolean z2, boolean z3) {
            this.f30181a = z;
            this.f30182b = z2;
            this.f30183c = z3;
        }

        @Override // com.huawei.watchface.api.ResponseListener
        public void onError() {
            HwLog.i(g5.f, "update -- getOrderHistoryResponse -- onError");
            if (this.f30183c) {
                g5.this.j();
            }
        }

        @Override // com.huawei.watchface.api.ResponseListener
        public void onResponse(OrderHistoryResponse orderHistoryResponse) {
            g5.this.l();
            g5.this.b(orderHistoryResponse.getOrderHistoryBeanList());
            if (this.f30181a) {
                s2.b().a(this.f30182b, this.f30183c);
            }
        }
    }

    public class b extends TypeToken<List<String>> {
        public b(g5 g5Var) {
        }
    }

    public static g5 c() {
        g5 g5Var;
        synchronized (g5.class) {
            if (g == null) {
                synchronized (g5.class) {
                    if (g == null) {
                        g = new g5();
                    }
                }
            }
            g5Var = g;
        }
        return g5Var;
    }

    public void a(String str, String str2) {
        synchronized (this) {
            if (str == null || str2 == null) {
                return;
            }
            String strC = c(str, str2);
            if (!this.f30180c.contains(strC)) {
                this.f30180c.add(strC);
            }
        }
    }

    public final void b(List list) {
        synchronized (this) {
            if (list == null) {
                return;
            }
            this.f30179b = list;
        }
    }

    public void d(List list) {
        if (list == null) {
            return;
        }
        this.d = list;
    }

    public void e(String str, String str2) {
        synchronized (this) {
            if (str == null || str2 == null) {
                return;
            }
            this.f30180c.remove(c(str, str2));
        }
    }

    public List f() {
        return (List) GsonHelper.fromJson(e(), new b(this).getType());
    }

    public List g() {
        return this.f30179b;
    }

    public final boolean h() {
        List list = this.f30180c;
        return list == null || list.size() == 0;
    }

    public final /* synthetic */ void i() {
        try {
            HwLog.i(f, "update data on runnable");
            a(CommonUtils.A(), false, false);
        } catch (Exception e) {
            HwLog.e(f, "update data exception: " + HwLog.printException(e));
        }
    }

    public final void j() {
        WatchResourcesInfo currentWatchFace = HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getCurrentWatchFace();
        HwWatchFaceManager.getInstance(Environment.getApplicationContext()).notifyCurrentWatchfaceIsVipFree(currentWatchFace == null ? "" : currentWatchFace.getWatchInfoId(), "0");
    }

    public final void k() {
        synchronized (this) {
            s2.b().a(this.f30180c);
        }
    }

    public final void l() {
        synchronized (this) {
            m();
            HwLog.i(f, "startPolling");
            BackgroundTaskUtils.a(this.f30178a, 3600000);
        }
    }

    public void m() {
        synchronized (this) {
            if (this.f30178a != null) {
                HwLog.i(f, "stopPolling: removeTaskFromWorker");
                BackgroundTaskUtils.a(this.f30178a);
            }
        }
    }

    public void b(String str, String str2) {
        synchronized (this) {
            if (str == null || str2 == null) {
                return;
            }
            String strC = c(str, str2);
            if (!this.d.contains(strC)) {
                this.d.add(strC);
            }
        }
    }

    public boolean d(String str, String str2) {
        return this.d.contains(c(str, str2));
    }

    public String e() {
        SharedPreferences sharedPreferencesB = e4.b(Environment.getApplicationContext(), "WATCH_FACE_DOWNLOAD_QUEUE");
        if (sharedPreferencesB == null) {
            HwLog.i(f, "sharedPreferences is null");
            return null;
        }
        String string = sharedPreferencesB.getString("QUEUE_DATA", null);
        HwLog.d(f, "getSharedPreferencesQueueTask() completed.");
        return string;
    }

    public void a(boolean z) {
        synchronized (this) {
            if (z) {
                HwLog.i(f, "startVipFlow");
                if (h()) {
                    a(true, false, false);
                } else {
                    k();
                }
            }
        }
    }

    public final List d() {
        List<WatchResourcesInfo> watchFaceResourcesInfo = HwWatchFaceManager.getInstance(Environment.getApplicationContext()).getWatchFaceResourcesInfo();
        ArrayList arrayList = new ArrayList();
        for (WatchResourcesInfo watchResourcesInfo : watchFaceResourcesInfo) {
            if ((watchResourcesInfo.getWatchInfoType() & 64) != 64 && watchResourcesInfo.isVipFreeWatchFace()) {
                arrayList.add(new OrderHistoryRequestModel(watchResourcesInfo.getWatchInfoId(), String.valueOf(1)));
            }
        }
        return arrayList;
    }

    public void b() {
        SharedPreferences sharedPreferencesB = e4.b(Environment.getApplicationContext(), "WATCH_FACE_DOWNLOAD_QUEUE");
        if (sharedPreferencesB == null) {
            HwLog.i(f, "sharedPreferences is null");
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
        editorEdit.clear();
        editorEdit.apply();
        HwLog.i(f, "clearSharedPreferencesData completed");
    }

    public void a(boolean z, boolean z2, boolean z3) {
        synchronized (this) {
            try {
                String str = f;
                HwLog.i(str, "update process isDelete:" + z2 + ",isCreate:" + z3);
                try {
                    if (HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceConnectState() != 1) {
                        HwLog.e(str, "update current connect is error ");
                        if (z3) {
                            j();
                        }
                        return;
                    }
                    List listD = d();
                    if (listD.isEmpty()) {
                        HwLog.i(str, "update orderHistoryBody isEmpty");
                        if (z3) {
                            j();
                        }
                        return;
                    }
                    MembershipRepository.getOrderHistoryResponse(listD, new a(z, z2, z3));
                } catch (Exception e) {
                    HwLog.e(f, "update Exception:" + HwLog.printException(e));
                    if (z3) {
                        j();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(List list) {
        synchronized (this) {
            if (list == null) {
                return;
            }
            this.f30180c = list;
            a(list);
        }
    }

    public String c(String str, String str2) {
        synchronized (this) {
            if (str == null || str2 == null) {
                return "";
            }
            return str + "_" + str2;
        }
    }

    public void a() {
        synchronized (this) {
            HwLog.i(f, "clear:");
            m();
            g = null;
        }
    }

    public void a(List list) {
        a(GsonHelper.toJson(list));
    }

    public void a(String str) {
        SharedPreferences sharedPreferencesB = e4.b(Environment.getApplicationContext(), "WATCH_FACE_DOWNLOAD_QUEUE");
        if (sharedPreferencesB == null) {
            HwLog.i(f, "preferences is null");
            return;
        }
        sharedPreferencesB.edit().putString("QUEUE_DATA", str).apply();
        HwLog.i(f, "saveQueueTask jsonString: " + str);
    }
}
