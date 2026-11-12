package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class vgo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("modifiedTime")
    private long f51071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("localDate")
    private int f51072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("overview")
    private vfy f51073c;

    @SerializedName("meals")
    private List<vgw> d;

    @SerializedName("time")
    private long e;

    @SerializedName("timeZone")
    private String g;

    public vgo(int i, long j, vfy vfyVar, List<vgw> list, String str) {
        this.e = j;
        this.f51073c = vfyVar;
        this.d = list;
        this.g = str;
        this.f51072b = i;
    }

    public void f() {
        if (this.f51073c == null) {
            return;
        }
        int iA = lsl.a(HiDateUtil.a(this.f51072b));
        int iA2 = lsl.a(System.currentTimeMillis());
        ReleaseLogUtil.d("R_DietRecord", "setHistoryDietCalorie timeDays ", Integer.valueOf(iA), " currentDays", Integer.valueOf(iA2));
        double dI = this.f51073c.i();
        if (iA < iA2) {
            this.f51073c.a((int) UnitUtil.d(dI, 0));
        }
    }

    public void a(long j) {
        this.e = j;
    }

    public void j() {
        if (String.valueOf(this.e).matches("\\d{13}")) {
            this.e /= 1000;
        }
        if (njy.e(this.d)) {
            return;
        }
        Iterator<vgw> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().m();
        }
    }

    public void e() {
        if (njy.e(this.d)) {
            LogUtil.j("DietRecord", "filterDuplicatesMeal mMeals is empty");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (vgw vgwVar : this.d) {
            if (arrayList.contains(vgwVar)) {
                if (!njy.e(vgwVar.c())) {
                    int iIndexOf = arrayList.indexOf(vgwVar);
                    if (njy.e(((vgw) arrayList.get(iIndexOf)).c())) {
                        arrayList.set(iIndexOf, vgwVar);
                    } else {
                        arrayList.add(vgwVar);
                    }
                }
            } else {
                arrayList.add(vgwVar);
            }
        }
        this.d = arrayList;
        h();
    }

    public void b(vgw vgwVar) {
        if (vgwVar == null) {
            return;
        }
        if (this.d == null) {
            this.d = new ArrayList();
        }
        vgw vgwVarA = a(vgwVar.i());
        if (vgwVarA != null) {
            LogUtil.j("DietRecord", "has such meal");
            if (vgwVar.d() == vgwVarA.d()) {
                LogUtil.a("DietRecord", "duplicate meal");
                return;
            }
            if (vgwVar.f() > 0) {
                vgwVarA.b(Long.valueOf(vgwVar.f()));
            }
            vgwVarA.d(vgwVar.j());
            vgwVarA.c(vgwVar.e() + vgwVarA.e());
            vgwVarA.c().addAll(vgwVar.c());
            h();
            return;
        }
        try {
            this.d.add(vgwVar);
        } catch (UnsupportedOperationException e) {
            ReleaseLogUtil.e("R_DietRecord", "UnsupportedOperationException error: ", LogAnonymous.b(e));
        }
        vfy vfyVar = this.f51073c;
        if (vfyVar == null) {
            LogUtil.j("DietRecord", "addMeal overview is null");
        } else {
            vfyVar.e(vgwVar.e());
        }
    }

    public boolean c(vgw vgwVar) {
        if (vgwVar == null) {
            LogUtil.j("DietRecord", "updateMeal meal is null");
            return false;
        }
        List<vgw> list = this.d;
        if (list == null || !list.contains(vgwVar)) {
            LogUtil.j("DietRecord", "meals is empty or meals is not contains meal");
            return false;
        }
        int iIndexOf = this.d.indexOf(vgwVar);
        if (iIndexOf < 0) {
            LogUtil.j("DietRecord", "no such meal");
            return false;
        }
        this.d.set(iIndexOf, vgwVar);
        h();
        return true;
    }

    public boolean e(vgw vgwVar) {
        if (vgwVar == null) {
            ReleaseLogUtil.e("R_DietRecord", "recordMeal meal is null");
            return false;
        }
        if (this.d == null) {
            this.d = new ArrayList();
        }
        LogUtil.a("DietRecord", "recordMeal meal is: ", vgwVar, "recordMeal mMeals is: ", this.d);
        int iIndexOf = this.d.indexOf(vgwVar);
        if (iIndexOf < 0) {
            LogUtil.a("DietRecord", "recordMeal no such meal");
            b(vgwVar);
            return true;
        }
        if (vgwVar.j() > this.d.get(iIndexOf).j()) {
            this.d.set(iIndexOf, vgwVar);
            h();
            return true;
        }
        LogUtil.j("DietRecord", "recordMeal modifiedTime is not big");
        return false;
    }

    private void h() {
        if (this.f51073c == null) {
            LogUtil.j("DietRecord", "updateInTake mOverview is null");
            return;
        }
        float fE = 0.0f;
        for (vgw vgwVar : this.d) {
            if (vgwVar != null) {
                fE += vgwVar.e();
            }
        }
        this.f51073c.b(fE);
    }

    private vgw a(int i) {
        if (njy.e(this.d)) {
            LogUtil.j("DietRecord", "mMeals is empty");
            return null;
        }
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            vgw vgwVar = this.d.get(i2);
            if (vgwVar.i() == i) {
                return vgwVar;
            }
        }
        return null;
    }

    public String g() {
        if (this.g == null) {
            if (njy.e(this.d)) {
                this.g = HiDateUtil.c("");
            } else {
                this.g = this.d.get(0).g();
            }
        }
        return this.g;
    }

    public long i() {
        if (this.e == 0) {
            this.e = DateFormatUtil.c(c(), lsl.a(g()));
        }
        return this.e;
    }

    public vfy d() {
        return this.f51073c;
    }

    public List<vgw> a() {
        if (njy.e(this.d)) {
            return new ArrayList();
        }
        return this.d;
    }

    public long b() {
        return this.f51071a;
    }

    public void d(long j) {
        this.f51071a = j;
    }

    public int c() {
        return this.f51072b;
    }

    public void e(int i) {
        this.f51072b = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DietRecord{LocalDate=");
        sb.append(this.f51072b);
        sb.append(",time=");
        sb.append(this.e);
        sb.append(",timeZone=");
        sb.append(this.g);
        sb.append(", overview=");
        sb.append(this.f51073c);
        sb.append(", meals=");
        List<vgw> list = this.d;
        sb.append(list == null ? new ArrayList() : list.toString());
        sb.append(", mModifiedTime=");
        sb.append(this.f51071a);
        sb.append('}');
        return sb.toString();
    }
}
