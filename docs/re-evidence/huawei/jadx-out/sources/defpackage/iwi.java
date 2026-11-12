package defpackage;

import android.content.ContentValues;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter;
import com.huawei.healthcloud.plugintrack.model.IHeartRateCallback;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class iwi {
    private PluginSportTrackAdapter m;
    private long n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<HeartRateData> f38130b = new ArrayList<>(Collections.EMPTY_LIST);
    private ArrayList<HeartRateData> o = new ArrayList<>(Collections.EMPTY_LIST);
    private int d = -1;
    private boolean k = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HeartRateData f38129a = null;
    private int r = 0;
    private boolean l = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StringBuilder f38131c = new StringBuilder(4);
    private int h = 0;
    private d e = null;
    private int j = -1;
    private long i = 0;
    private long f = 0;
    private long g = 0;
    private ArrayList<HeartRateData> q = new ArrayList<>(Collections.EMPTY_LIST);
    private ArrayList<HeartRateData> p = new ArrayList<>(Collections.EMPTY_LIST);

    public iwi(PluginSportTrackAdapter pluginSportTrackAdapter) {
        this.m = null;
        this.n = 0L;
        if (pluginSportTrackAdapter == null) {
            LogUtil.j("Track_HeartRateUtils", "HeartRateUtils adapter is null");
        } else {
            this.m = pluginSportTrackAdapter;
            this.n = System.currentTimeMillis();
        }
    }

    public long a() {
        return this.i;
    }

    public HeartRateData c() {
        return this.f38129a;
    }

    public void d(int i) {
        this.r = i;
    }

    public void e(int i, long j) {
        if (j < this.n) {
            ReleaseLogUtil.a("Track_HeartRateUtils", "setHeartRateData time is error");
            return;
        }
        if (j - this.i >= TimeUnit.SECONDS.toMillis(2L) && izn.b(i)) {
            if (jem.f() && jem.h()) {
                jeh.e().f38472a.add(Integer.valueOf(i));
                jeh.e().d.add(Integer.valueOf(i));
                jeh.e().f38474c = i;
            }
            this.d = i;
            this.l = true;
            StringBuilder sb = this.f38131c;
            sb.append(jaa.b(j));
            sb.append(":");
            sb.append(i);
            sb.append(";");
            this.i = j;
        }
        if (c(i)) {
            this.d = 0;
        }
        this.g = j;
        if (izn.b(i)) {
            this.j = i;
            return;
        }
        this.j = -1;
        if (j - this.f >= TimeUnit.SECONDS.toMillis(60L)) {
            ReleaseLogUtil.d("Track_HeartRateUtils", "setHeartRateData heartRate = ", -1);
            this.f = j;
        }
    }

    public int e() {
        return this.d;
    }

    public void i() {
        LogUtil.a("Track_HeartRateUtils", "HeartRateUtils startHeartHandler");
        if (this.e == null) {
            this.e = new d(Looper.getMainLooper(), this);
        }
    }

    static class d extends Handler {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<iwi> f38133c;

        d(Looper looper, iwi iwiVar) {
            super(looper);
            this.f38133c = new WeakReference<>(iwiVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.a("Track_HeartRateUtils", "Heart Rate Message is null");
                return;
            }
            super.handleMessage(message);
            LogUtil.a("Track_HeartRateUtils", "Heart Rate Handler handleMessage", Integer.valueOf(message.what));
            iwi iwiVar = this.f38133c.get();
            if (iwiVar == null) {
                LogUtil.a("Track_HeartRateUtils", "Heart Rate Handler manager is null");
                return;
            }
            if (message.what == 1 && (message.obj instanceof ContentValues)) {
                ContentValues contentValues = (ContentValues) message.obj;
                long jLongValue = ((Long) contentValues.get("time")).longValue();
                int iIntValue = ((Integer) contentValues.get("heartrate")).intValue();
                boolean zBooleanValue = ((Boolean) contentValues.get("isinvalidheartrate")).booleanValue();
                HeartRateData heartRateData = new HeartRateData();
                heartRateData.saveTime(jLongValue);
                heartRateData.saveHeartRate(iIntValue);
                if (zBooleanValue) {
                    iwiVar.e(heartRateData);
                } else {
                    iwiVar.f38129a = heartRateData;
                    iwiVar.d(heartRateData);
                }
            }
        }
    }

    public void a(PluginSportTrackAdapter pluginSportTrackAdapter) {
        if (pluginSportTrackAdapter == null) {
            LogUtil.j("Track_HeartRateUtils", "setAdapter adapter is null");
        } else {
            this.m = pluginSportTrackAdapter;
        }
    }

    public void f() {
        PluginSportTrackAdapter pluginSportTrackAdapter = this.m;
        if (pluginSportTrackAdapter == null) {
            LogUtil.e("Track_HeartRateUtils", "startGetHeartRateData mPluginTrackAdapter is null!");
        } else {
            pluginSportTrackAdapter.startHeartDeviceMeasure();
        }
    }

    public void b() {
        if (jaa.h(this.r)) {
            LogUtil.a("Track_HeartRateUtils", "registerHeartRate begin");
            PluginSportTrackAdapter pluginSportTrackAdapter = this.m;
            if (pluginSportTrackAdapter == null) {
                LogUtil.e("Track_HeartRateUtils", "registerHeartRate mPluginTrackAdapter is null!");
            } else {
                pluginSportTrackAdapter.regHeartRateListener(new a(), 15);
                this.k = true;
            }
        }
    }

    class a implements IHeartRateCallback {
        @Override // com.huawei.healthcloud.plugintrack.model.IHeartRateCallback
        public void onResult(int i) {
        }

        private a() {
        }

        @Override // com.huawei.healthcloud.plugintrack.model.IHeartRateCallback
        public void onChange(int i, long j) {
            iwi.this.e(i, j);
        }
    }

    private boolean c(int i) {
        return i == 0 && this.d != -1;
    }

    public void d() {
        PluginSportTrackAdapter pluginSportTrackAdapter;
        if (this.k) {
            if (jaa.h(this.r) && (pluginSportTrackAdapter = this.m) != null) {
                pluginSportTrackAdapter.unregHeartRateListener();
            }
            this.k = false;
        }
    }

    public void g() {
        PluginSportTrackAdapter pluginSportTrackAdapter;
        if (!jaa.h(this.r) || (pluginSportTrackAdapter = this.m) == null) {
            return;
        }
        pluginSportTrackAdapter.stopHeartDeviceMeasure();
        LogUtil.a("Track_HeartRateUtils", "stopHeartRateDevice");
    }

    public void a(int i) {
        if (i == 2) {
            this.d = 0;
            this.i = System.currentTimeMillis();
        }
    }

    public void a(Bundle bundle) {
        j();
        if (bundle == null) {
            LogUtil.a("Track_HeartRateUtils", "sportData is null");
            return;
        }
        int i = this.d;
        if (i > 0) {
            bundle.putString(IndoorEquipManagerApi.KEY_HEART_RATE, String.valueOf(i));
        }
    }

    private void j() {
        if (this.i == 0 || this.d == -1 || System.currentTimeMillis() - this.i <= TimeUnit.SECONDS.toMillis(10L)) {
            return;
        }
        this.d = 0;
    }

    public void h() {
        int i = this.h + 1;
        this.h = i;
        if (i == 5) {
            this.h = 0;
            LogUtil.a("Track_HeartRateUtils", "saveHeartRate mHeartRateStartTime = ", Long.valueOf(this.i));
            long jCurrentTimeMillis = System.currentTimeMillis() - this.g;
            boolean z = jCurrentTimeMillis >= 20000;
            if (this.j == -1) {
                z = true;
            }
            ContentValues contentValues = new ContentValues();
            if (z) {
                contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
            } else if (jCurrentTimeMillis > 5000) {
                contentValues.put("time", Long.valueOf(this.g + ((jCurrentTimeMillis / 5000) * 5000)));
            } else {
                contentValues.put("time", Long.valueOf(this.g));
            }
            contentValues.put("heartrate", Integer.valueOf(this.j));
            contentValues.put("isinvalidheartrate", Boolean.valueOf(z));
            c(1, 0, 0, contentValues);
        }
    }

    private void c(int i, int i2, int i3, Object obj) {
        d dVar = this.e;
        if (dVar != null) {
            this.e.sendMessage(dVar.obtainMessage(i, i2, i3, obj));
        } else {
            LogUtil.a("Track_HeartRateUtils", "postRunnableToHandlerThread() mHandler is null");
        }
    }

    public void a(List<HeartRateData> list, List<HeartRateData> list2) {
        LogUtil.j("Track_HeartRateUtils", "recoveryHeartRateList");
        this.f38130b.clear();
        this.o.clear();
        if (list != null && list.size() > 0) {
            this.f38130b.addAll(list);
        }
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        this.o.addAll(list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(HeartRateData heartRateData) {
        if (!this.f38130b.contains(heartRateData)) {
            this.f38130b.add(heartRateData);
        }
        if (this.q.contains(heartRateData)) {
            return;
        }
        this.q.add(heartRateData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(HeartRateData heartRateData) {
        if (!this.o.contains(heartRateData)) {
            this.o.add(heartRateData);
        }
        if (this.p.contains(heartRateData)) {
            return;
        }
        this.p.add(heartRateData);
    }

    public ArrayList<HeartRateData> a(boolean z) {
        ArrayList<HeartRateData> arrayList = new ArrayList<>(Collections.EMPTY_LIST);
        if (this.q.size() > 0) {
            arrayList.addAll(this.q);
            if (z) {
                this.q.clear();
            }
        }
        return arrayList;
    }

    public ArrayList<HeartRateData> c(boolean z) {
        ArrayList<HeartRateData> arrayList = new ArrayList<>(Collections.EMPTY_LIST);
        if (this.p.size() > 0) {
            arrayList.addAll(this.p);
            if (z) {
                this.p.clear();
            }
        }
        return arrayList;
    }
}
