package defpackage;

import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class vqu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f51490a = {1, 2, 3, 4, 5};
    private static final Object e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f51491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<vrb> f51492c;
    private boolean d;
    private int h;
    private vqn j;

    public vqu() {
        this.h = 0;
        this.d = false;
        this.f51491b = false;
        this.j = new vqn();
        l();
    }

    public vqu(vqn vqnVar) {
        this.h = 0;
        this.d = false;
        this.f51491b = false;
        this.j = vqnVar;
        l();
    }

    private void l() {
        this.f51492c = new ArrayList(10);
    }

    public void a(double d, long j, double d2, int i, long j2) {
        int iB = vrg.b(i);
        vqn vqnVar = this.j;
        if (vqnVar == null || vqnVar.a() == null) {
            this.j = new vqn(new HashMap(), 1, j);
        }
        Map<String, Double> mapA = this.j.a();
        a(d2, "Track_" + iB + 3, mapA);
        a(d, "Track_" + iB + 2, mapA);
        double d3 = (double) j2;
        a(d3, "Track_" + iB + 4, mapA);
        a(d2, "Track_Calorie_Sum", mapA);
        a(d, "Track_Distance_Sum", mapA);
        a(d3, "Track_Duration_Sum", mapA);
        this.j.d(j);
        if (i == 289 || i == 288) {
            return;
        }
        vqn vqnVar2 = this.j;
        vqnVar2.c(vqnVar2.e() + 1);
    }

    private void a(double d, String str, Map<String, Double> map) {
        if (map.get(str) != null) {
            map.put(str, Double.valueOf(map.get(str).doubleValue() + d));
        } else {
            map.put(str, Double.valueOf(d));
        }
    }

    public void c(vrb vrbVar) {
        if (this.f51492c == null) {
            this.f51492c = new ArrayList(10);
        }
        if (vrbVar == null) {
            LogUtil.a("Track_SportHistoryExpandableGroupData", "addSingleTrackData trackData is null");
            return;
        }
        synchronized (e) {
            if (!this.f51492c.contains(vrbVar)) {
                this.f51492c.add(vrbVar);
            }
        }
    }

    public void a(int i, vrb vrbVar) {
        if (this.f51492c == null) {
            this.f51492c = new ArrayList(10);
        }
        if (vrbVar == null) {
            LogUtil.a("Track_SportHistoryExpandableGroupData", "addSingleTrackData trackData is null");
            return;
        }
        if (i >= b() || i < 0) {
            LogUtil.a("Track_SportHistoryExpandableGroupData", "addSingleTrackData index of");
            return;
        }
        synchronized (e) {
            this.f51492c.add(i, vrbVar);
        }
    }

    public int b() {
        List<vrb> list = this.f51492c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public vrb d(int i) {
        synchronized (e) {
            if (njy.e(this.f51492c, i)) {
                return null;
            }
            return this.f51492c.get(i);
        }
    }

    public vrb d(long j, long j2) {
        synchronized (e) {
            if (njy.e(this.f51492c)) {
                return null;
            }
            for (vrb vrbVar : this.f51492c) {
                if (vrbVar.w() == j && vrbVar.m() == j2) {
                    return vrbVar;
                }
            }
            return null;
        }
    }

    public int f() {
        return this.j.e();
    }

    public String i() {
        return this.j.b();
    }

    public long h() {
        return this.j.c();
    }

    public double o() {
        return b(262, 0);
    }

    public long m() {
        return (long) b(262, 3);
    }

    public void b(vqn vqnVar) {
        if (this.j == null) {
            return;
        }
        this.j = vqnVar;
    }

    public vqn d() {
        return this.j;
    }

    public int g() {
        return this.h;
    }

    public void a(int i) {
        this.h = vrg.b(i);
    }

    public boolean k() {
        return this.h != 0;
    }

    public double b(int i) {
        if (i == 0) {
            return d("Track_Duration_Sum") + 0.0d + d(10001, 4);
        }
        if (i == 10001) {
            return d(10001, 4);
        }
        return d(i, 4);
    }

    public double c(int i) {
        if (i == 0) {
            return d("Track_Calorie_Sum") + 0.0d + d(10001, 3);
        }
        if (i == 10001) {
            return d(10001, 3);
        }
        return d(i, 3);
    }

    public String b(boolean z) {
        String quantityString;
        double d = d(287, 22);
        double d2 = d / ((double) 10);
        int i = d2 == 0.0d ? 1 : 0;
        if (UnitUtil.f()) {
            quantityString = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_ft_string, ((int) d) / 10, UnitUtil.e(UnitUtil.e(d2, 1), 1, i ^ 1));
        } else {
            quantityString = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_altitude_meter, ((int) d) / 10, UnitUtil.e(d2, 1, i ^ 1));
        }
        double d3 = d(287, 21);
        double d4 = d3 / 60.0d;
        String quantityString2 = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_plugin_fitnessadvice_min, (int) d3, UnitUtil.e(d4, 1, (d4 > 0.0d ? 1 : (d4 == 0.0d ? 0 : -1)) == 0 ? 0 : 2));
        double d5 = d(287, 5);
        String quantityString3 = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_details_sleep_latency_times, (int) d5, UnitUtil.e(d5, 1, 0));
        if (z) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_history_desc_three, quantityString, quantityString2, quantityString3);
        }
        return BaseApplication.getContext().getResources().getString(R.string.IDS_history_desc_three, quantityString2, quantityString3, "");
    }

    private double d(String str) {
        if (e().containsKey(str)) {
            return e().get(str).doubleValue();
        }
        return 0.0d;
    }

    public double d(int i, int i2) {
        double dDoubleValue = e().containsKey("Track_" + i + i2) ? e().get("Track_" + i + i2).doubleValue() : 0.0d;
        if (i == 286) {
            if (e().containsKey("Track_220" + i2)) {
                dDoubleValue += e().get("Track_220" + i2).doubleValue();
            }
        }
        if (i == 217) {
            for (int i3 : nub.f43727a) {
                String str = "Track_" + i3 + i2;
                if (e().containsKey(str)) {
                    dDoubleValue += e().get(str).doubleValue();
                }
            }
        }
        if (i != 287) {
            return dDoubleValue;
        }
        if (!e().containsKey("Track_291" + i2)) {
            return dDoubleValue;
        }
        return dDoubleValue + e().get("Track_291" + i2).doubleValue();
    }

    public double e(int i) {
        if (i == 0) {
            return d("Track_Distance_Sum");
        }
        return d(i, 2);
    }

    public List<String> c() {
        ArrayList arrayList = new ArrayList();
        vqn vqnVar = this.j;
        if (vqnVar == null || vqnVar.d()) {
            return null;
        }
        for (Map.Entry<String, Double> entry : this.j.a().entrySet()) {
            if (entry.getValue() != null && entry.getValue().doubleValue() > 0.0d && !arrayList.contains(entry.getKey())) {
                arrayList.add(entry.getKey());
            }
        }
        return arrayList;
    }

    public int j() {
        vqn vqnVar;
        HashSet hashSet = new HashSet();
        List<String> listD = jry.a(BaseApplication.getContext()).d();
        if (njy.e(listD) || (vqnVar = this.j) == null || vqnVar.a() == null) {
            return 0;
        }
        for (String str : listD) {
            int iE = vrg.e(str);
            if (this.j.a().containsKey(str) && this.j.a().get(str).doubleValue() > 0.0d && iE != 0 && iE != 288 && iE != 289) {
                hashSet.add(Integer.valueOf(vrg.b(iE)));
            }
        }
        return hashSet.size();
    }

    public Map<String, Double> e() {
        return this.j.a();
    }

    public double b(int i, int i2) {
        vqn vqnVar;
        List<String> listD = vrg.d(i);
        if (!njy.c(listD, i2) || (vqnVar = this.j) == null || vqnVar.a() == null || !this.j.a().containsKey(listD.get(i2)) || this.j.a().get(listD.get(i2)) == null) {
            return 0.0d;
        }
        return this.j.a().get(listD.get(i2)).doubleValue();
    }

    public int a(int i, int i2) {
        LogUtil.a("Track_SportHistoryExpandableGroupData", "deleteChildAt i = ", Integer.valueOf(i));
        if (i >= b() || i < 0) {
            LogUtil.j("Track_SportHistoryExpandableGroupData", "OutOfIndex delete failed childCount = ", Integer.valueOf(b()));
            return b();
        }
        vrb vrbVar = this.f51492c.get(i);
        int iU = vrbVar.u();
        if (iU == 289 || iU == 288) {
            LogUtil.a("Track_SportHistoryExpandableGroupData", "delete BREATH_HOLDING_TRAINING or SPORT_TYPE_BREATH_HOLDING_TRAINING");
            synchronized (e) {
                this.f51492c.remove(i);
            }
            return b();
        }
        vqn vqnVar = this.j;
        vqnVar.c(vqnVar.e() - 1);
        int iB = vrg.b(iU);
        if (iB == 287 && i2 != 0) {
            vrg.b(vrbVar, this.j.a(), this.j.c(), lsl.b(this.j.c()), 5, new IBaseResponseCallback() { // from class: vqv
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i3, Object obj) {
                    this.e.a(i3, obj);
                }
            });
        } else if (k() && i2 == 0 && iB == 287) {
            float fO = vrbVar.o() / 1000.0f;
            if (this.j.a().get("Track_28721") != null) {
                this.j.a().put("Track_28721", Double.valueOf(this.j.a().get("Track_28721").doubleValue() - ((double) fO)));
            }
        } else {
            vrg.c(vrbVar, iB, this.j.a());
        }
        f(iB);
        synchronized (e) {
            this.f51492c.remove(i);
        }
        return b();
    }

    /* synthetic */ void a(int i, Object obj) {
        this.j.b((Map) obj);
    }

    private void f(int i) {
        List<String> listD = vrg.d(i);
        if (listD == null || listD.size() < 3) {
            LogUtil.e("Track_SportHistoryExpandableGroupData", "delete times", Integer.valueOf(i));
            return;
        }
        String str = listD.get(2);
        if (!this.j.a().containsKey(str) || this.j.a().get(str) == null) {
            return;
        }
        this.j.a().put(str, Double.valueOf(this.j.a().get(str).doubleValue() - 1.0d));
    }

    public boolean a() {
        return this.d;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public void e(boolean z) {
        this.f51491b = z;
    }

    public boolean n() {
        if (b() == 0 || !a()) {
            return false;
        }
        return !this.f51491b;
    }
}
