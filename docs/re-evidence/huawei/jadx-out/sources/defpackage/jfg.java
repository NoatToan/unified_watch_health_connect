package defpackage;

import android.os.Handler;
import android.os.Message;
import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.LatLong;
import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.LenLatLong;
import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.ReTrackSimplify;
import com.huawei.hwfoundationmodel.trackmodel.MarkPoint;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class jfg extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f38535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<LenLatLong> f38536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38537c;
    private boolean d;
    private int e;
    private MotionPath f;
    private List<njj> g;
    private Handler h;
    private MotionPathSimplify i;
    private List<njj> j;
    private Set<Integer> k;
    private ArrayList<LatLong> l;
    private Set<Integer> m;
    private ReTrackSimplify o;

    public jfg() {
        super("Track_ReTrackProcess");
        this.f = null;
        this.i = null;
        this.j = null;
        this.g = null;
        this.m = new HashSet();
        this.k = new HashSet();
        this.f38536b = null;
        this.l = null;
        this.o = new ReTrackSimplify();
        this.d = false;
        this.f38535a = false;
        this.h = null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        LogUtil.a("Track_ReTrackProcess", "go into ReTrackProcess Thread");
        if (!i() || this.f == null || this.i == null) {
            this.f38535a = true;
            return;
        }
        if (this.o == null) {
            this.o = new ReTrackSimplify();
        }
        this.o.setHiHealthMarkerList(izt.d((List<MarkPoint>) izt.e(this.f.requestMarkPointList(), this.f38537c), true));
        this.f38535a = false;
        jfm jfmVarB = new jfm(this.f, this.i, this.o).b(this.j).c(this.g).a(this.e).b(this.f38537c);
        ArrayList<LatLong> arrayListC = jfmVarB.c();
        jfs jfsVarC = new jfs().d(jfmVarB.b()).b(jfmVarB.a()).c(jfmVarB.e());
        jfe jfeVarE = new jfe().e(arrayListC).d(jfsVarC.f()).e(jfsVarC.a());
        jfeVarE.d();
        this.l = jfeVarE.c();
        Message messageObtain = Message.obtain();
        messageObtain.what = 6;
        messageObtain.obj = Integer.valueOf(this.l.size());
        this.h.sendMessage(messageObtain);
        this.o.setTrackTotalDistance(jfeVarE.e()).setCycles(jfsVarC.c()).setMinMultiplexField(jfeVarE.b()).setMaxMultiplexField(jfeVarE.a());
        jfb jfbVarD = new jfb().d(this.l);
        jfbVarD.e();
        this.l = jfbVarD.d();
        this.o.setAreaNumber(jfbVarD.a());
        jff jffVarC = new jff().d(jfsVarC.b()).e(jfsVarC.e()).c(jfsVarC.d());
        jffVarC.c(this.l);
        this.o.setLensTotalDistance(jffVarC.c());
        this.f38536b = jffVarC.d();
        jfmVarB.e(this.l.size());
        this.o.setHiHealthMarkerMap(new jfi().d(this.o.getHiHealthMarkerList(), this.l));
        this.o.syncMaxValue();
        this.f38535a = true;
        LogUtil.a("Track_ReTrackProcess", "go out ReTrackProcess Thread");
    }

    public jfg d(MotionPath motionPath) {
        if (motionPath == null) {
            this.d = true;
            return this;
        }
        this.f = motionPath;
        return this;
    }

    public jfg a(MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null) {
            this.d = true;
            return this;
        }
        this.i = motionPathSimplify;
        return this;
    }

    public jfg d(List<njj> list) {
        if (list == null) {
            return this;
        }
        this.j = list;
        return this;
    }

    public jfg b(List<njj> list) {
        if (list == null) {
            return this;
        }
        this.g = list;
        return this;
    }

    public jfg b(int i) {
        this.e = i;
        return this;
    }

    public jfg e(int i) {
        this.k.add(Integer.valueOf(i));
        return this;
    }

    public jfg c(Handler handler) {
        this.h = handler;
        return this;
    }

    public ReTrackSimplify a() {
        return this.o;
    }

    public ArrayList<LatLong> b() {
        return this.l;
    }

    public ArrayList<LenLatLong> e() {
        return this.f38536b;
    }

    public boolean d() {
        return this.f38535a;
    }

    public boolean c() {
        ArrayList<LenLatLong> arrayList;
        return (this.o == null || (arrayList = this.f38536b) == null || this.l == null || arrayList.size() < 2 || this.l.size() < 2) ? false : true;
    }

    public boolean i() {
        MotionPathSimplify motionPathSimplify;
        if (!this.d && (motionPathSimplify = this.i) != null && this.f != null) {
            int iRequestSportType = motionPathSimplify.requestSportType();
            Iterator<Integer> it = this.m.iterator();
            while (it.hasNext()) {
                if (it.next().intValue() == iRequestSportType) {
                    return false;
                }
            }
            Iterator<Integer> it2 = this.k.iterator();
            while (it2.hasNext()) {
                if (it2.next().intValue() == iRequestSportType) {
                    return true;
                }
            }
        }
        return false;
    }

    public jfg c(int i) {
        this.f38537c = i;
        return this;
    }
}
