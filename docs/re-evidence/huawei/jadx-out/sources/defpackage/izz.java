package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.handler.BaseHandlerCallback;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter;
import com.huawei.healthcloud.plugintrack.model.IRidePostureDataCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class izz {
    private static final Object e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IRidePostureDataCallback f38271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f38272c;
    private ExtendHandler f;
    private PluginSportTrackAdapter g;
    private boolean h = false;
    private int k = 0;
    private int o = 0;
    private CopyOnWriteArrayList<gzr> m = new CopyOnWriteArrayList<>();
    private CopyOnWriteArrayList<gzr> l = new CopyOnWriteArrayList<>();
    private CopyOnWriteArrayList<gzr> n = new CopyOnWriteArrayList<>();
    private int j = 0;
    private int d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f38270a = 0;
    private gzr i = new gzr();

    public izz(PluginSportTrackAdapter pluginSportTrackAdapter, Context context) {
        this.g = null;
        this.g = pluginSportTrackAdapter;
        this.f38272c = context;
    }

    public void d(int i) {
        this.o = i;
    }

    public void b(int i) {
        this.k = i;
    }

    public void c(PluginSportTrackAdapter pluginSportTrackAdapter) {
        this.g = pluginSportTrackAdapter;
    }

    public void c(List<gzr> list) {
        LogUtil.a("Track_RidePostureUtils", "recoveryCadenceDataList");
        this.m.clear();
        if (njy.b(list)) {
            this.m.addAll(list);
        }
    }

    public void d() {
        gzr gzrVar;
        LogUtil.a("Track_RidePostureUtils", "recoveryCadenceDataList");
        this.n.clear();
        CopyOnWriteArrayList<gzr> copyOnWriteArrayList = (CopyOnWriteArrayList) izn.d(SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), "saved_temp_cadence"), new TypeToken<CopyOnWriteArrayList<gzr>>(this) { // from class: com.huawei.healthcloud.plugintrack.manager.utils.RidePostureUtils$1
        });
        if (njy.b(copyOnWriteArrayList)) {
            this.n = copyOnWriteArrayList;
        } else {
            LogUtil.j("Track_RidePostureUtils", "RidePostureData is empty");
        }
        if (njy.b(this.n)) {
            this.j = this.n.size() - 1;
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), "saved_maximum_cadence");
        if (TextUtils.isEmpty(strE) || (gzrVar = (gzr) izn.d(strE, new TypeToken<gzr>(this) { // from class: com.huawei.healthcloud.plugintrack.manager.utils.RidePostureUtils$2
        })) == null || gzrVar.c() == 0) {
            return;
        }
        this.i = gzrVar;
    }

    public void e(IRidePostureDataCallback iRidePostureDataCallback) {
        if (jaa.h(this.k) && this.o == 259) {
            LogUtil.a("Track_RidePostureUtils", "registerRidePosture begin");
            if (this.g == null) {
                LogUtil.e("Track_RidePostureUtils", "registerRidePosture mPluginSportTrackAdapter is null!");
                return;
            }
            this.f38271b = iRidePostureDataCallback;
            g();
            this.g.registerRidePosture(new IRidePostureDataCallback() { // from class: izz.4
                @Override // com.huawei.healthcloud.plugintrack.model.IRidePostureDataCallback
                public void onResult() {
                }

                @Override // com.huawei.healthcloud.plugintrack.model.IRidePostureDataCallback
                public void onChange(gzr gzrVar) {
                    if (gzrVar == null) {
                        LogUtil.j("Track_RidePostureUtils", "ridePostureData is null");
                    } else {
                        izz.this.b(gzrVar);
                    }
                }
            });
            this.h = true;
            return;
        }
        LogUtil.a("Track_RidePostureUtils", "registerRidePosture not support ridePosture");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(gzr gzrVar) {
        if (this.f == null) {
            LogUtil.e("Track_RidePostureUtils", "sendRidePostureDataToThread ");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = gzrVar;
        this.f.sendMessage(messageObtain);
    }

    private void g() {
        LogUtil.a("Track_RidePostureUtils", "startHandlerThread enter");
        if (this.f == null) {
            this.f = HandlerCenter.b(new e(this), "CADENCE_HANDLER_THREAD");
        }
    }

    private void f() {
        LogUtil.a("Track_RidePostureUtils", "stopHandlerThread enter");
        ExtendHandler extendHandler = this.f;
        if (extendHandler != null) {
            extendHandler.removeTasksAndMessages();
            this.f.quit(false);
            this.f = null;
        }
    }

    public void b(Bundle bundle) {
        if (bundle == null) {
            LogUtil.a("Track_RidePostureUtils", "sportData is null");
            return;
        }
        if (this.f38270a != 0 && System.currentTimeMillis() - this.f38270a > 20000) {
            this.d = Integer.MIN_VALUE;
        }
        int i = this.d;
        if (i != Integer.MIN_VALUE) {
            bundle.putInt("cadenceData", i);
        }
        if (a(this.m) != 0) {
            bundle.putInt("avgCadence", a(this.m));
        }
    }

    private void e(gzr gzrVar) {
        IRidePostureDataCallback iRidePostureDataCallback;
        if (gzrVar.c() != -1) {
            this.j++;
            this.d = gzrVar.c();
            this.n.add(gzrVar);
        }
        if (gzrVar.d() == -1 || (iRidePostureDataCallback = this.f38271b) == null) {
            return;
        }
        iRidePostureDataCallback.onChange(gzrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(gzr gzrVar) {
        LogUtil.a("Track_RidePostureUtils", "enter updateRidePosture,", Long.valueOf(gzrVar.acquireTime()));
        e(gzrVar);
        if (njy.b(this.n)) {
            long jAcquireTime = gzrVar.acquireTime();
            CopyOnWriteArrayList<gzr> copyOnWriteArrayList = this.n;
            if (jAcquireTime - copyOnWriteArrayList.get(copyOnWriteArrayList.size() - 1).acquireTime() > 20000) {
                b();
            }
        }
        if (this.i.c() < gzrVar.c()) {
            this.i.e(gzrVar.c());
            this.i.c(gzrVar.acquireTime());
            if (this.i.c() != 0) {
                e();
            }
        }
        if (this.j == 5) {
            b();
        }
    }

    private void b() {
        synchronized (e) {
            if (njy.e(this.n)) {
                LogUtil.j("Track_RidePostureUtils", "mSaveCadenceDataBuffer is empty");
                return;
            }
            this.j = 0;
            gzr gzrVar = new gzr(this.n.get(0).acquireTime(), a(this.n));
            this.n.clear();
            if (!this.m.contains(gzrVar)) {
                this.m.add(gzrVar);
            }
            if (!this.l.contains(gzrVar)) {
                this.l.add(gzrVar);
            }
        }
    }

    public void c() {
        PluginSportTrackAdapter pluginSportTrackAdapter;
        if (this.h) {
            b();
            if (jaa.h(this.k) && (pluginSportTrackAdapter = this.g) != null) {
                pluginSportTrackAdapter.unregisterRidePosture();
            }
            this.h = false;
            f();
        }
    }

    public ArrayList<gzr> e(boolean z) {
        ArrayList<gzr> arrayList;
        synchronized (e) {
            arrayList = new ArrayList<>(16);
            if (njy.b(this.l)) {
                arrayList.addAll(this.l);
                if (z) {
                    this.l.clear();
                }
            }
        }
        return arrayList;
    }

    public void d(List<gzr> list) {
        if (njy.e(list)) {
            return;
        }
        LogUtil.a("Track_RidePostureUtils", "enter dealMaxCadence");
        long jAcquireTime = this.i.acquireTime();
        for (gzr gzrVar : list) {
            if (gzrVar != null && gzrVar.acquireTime() + 4000 >= jAcquireTime) {
                gzrVar.e(this.i.c());
                LogUtil.a("Track_RidePostureUtils", "after CadenceList");
                return;
            }
        }
        if (list.get(list.size() - 1) == null || list.get(list.size() - 1).acquireTime() >= jAcquireTime) {
            return;
        }
        list.get(list.size() - 1).e(this.i.c());
        LogUtil.a("Track_RidePostureUtils", "after end CadenceList");
    }

    public void a() {
        SharedPreferenceManager.e(this.f38272c, Integer.toString(20002), "saved_temp_cadence", new Gson().toJson(this.n), new StorageParams());
    }

    public void e() {
        SharedPreferenceManager.e(this.f38272c, Integer.toString(20002), "saved_maximum_cadence", new Gson().toJson(this.i), null);
    }

    private int a(List<gzr> list) {
        int iC = 0;
        if (njy.e(list)) {
            LogUtil.j("Track_RidePostureUtils", "getAverageCadence cadenceDataList is empty");
            return 0;
        }
        for (gzr gzrVar : list) {
            if (gzrVar != null) {
                iC += gzrVar.c();
            }
        }
        return (int) Math.ceil(((double) iC) / ((double) list.size()));
    }

    public void c(MotionPathSimplify motionPathSimplify) {
        int iA;
        if (motionPathSimplify != null && (iA = a(this.m)) > 0) {
            motionPathSimplify.addExtendDataMap("avgCadence", String.valueOf(iA));
        }
    }

    static class e extends BaseHandlerCallback<izz> {
        public e(izz izzVar) {
            super(izzVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandlerCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean handleMessageWhenReferenceNotNull(izz izzVar, Message message) {
            if (message.what != 1) {
                return false;
            }
            gzr gzrVar = (gzr) message.obj;
            izzVar.f38270a = gzrVar.acquireTime();
            gzrVar.c((gzrVar.acquireTime() - System.currentTimeMillis()) + iwy.a(izzVar.f38272c).getSportDuration());
            izzVar.a(gzrVar);
            return true;
        }
    }

    public static List<String> b(List<gzr> list) {
        ArrayList arrayList = new ArrayList(16);
        StringBuffer stringBuffer = new StringBuffer(16);
        if (!njy.e(list)) {
            for (gzr gzrVar : list) {
                stringBuffer.append(MotionPath.CADENCE_TAG).append(MotionPath.CONTENT_KEY).append(gzrVar.acquireTime()).append(";").append(MotionPath.CONTENT_VALUE).append(gzrVar.c()).append(";").append(System.lineSeparator());
                arrayList.add(stringBuffer.toString());
                stringBuffer.setLength(0);
            }
        }
        return arrayList;
    }
}
