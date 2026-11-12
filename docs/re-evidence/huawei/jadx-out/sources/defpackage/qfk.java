package defpackage;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huawei.haf.common.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class qfk extends qff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("scheduleResults")
    private List<qfl> f46114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("createdTime")
    private long f46115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("scheduleId")
    private String f46116c;

    @SerializedName("planId")
    private String d;

    @SerializedName("taskId")
    private String e;

    public String v() {
        return this.f46116c;
    }

    public void i(String str) {
        this.f46116c = str;
    }

    public String ab() {
        return this.e;
    }

    public void h(String str) {
        this.e = str;
    }

    public void g(String str) {
        this.d = str;
    }

    public void c(long j) {
        this.f46115b = j;
    }

    public List<qfl> y() {
        return this.f46114a;
    }

    public void c(List<qfl> list) {
        this.f46114a = list;
    }

    private qfl ac() {
        if (CollectionUtils.a(this.f46114a)) {
            return null;
        }
        for (qfl qflVar : this.f46114a) {
            if (qflVar != null) {
                return qflVar;
            }
        }
        return null;
    }

    private void f(String str) {
        qfl qflVarAc = ac();
        if (qflVarAc == null) {
            return;
        }
        qflVarAc.a(str);
    }

    private void ad() {
        int i;
        if (CollectionUtils.a(this.f46114a)) {
            return;
        }
        for (qfl qflVar : this.f46114a) {
            if (qflVar != null) {
                List<qfh> listA = qflVar.a();
                if (!CollectionUtils.a(listA)) {
                    Iterator<qfh> it = listA.iterator();
                    while (true) {
                        i = 1;
                        if (!it.hasNext()) {
                            break;
                        }
                        qfh next = it.next();
                        if (next != null && next.e() != 1) {
                            i = 0;
                            break;
                        }
                    }
                    qflVar.d(i);
                }
            }
        }
    }

    public int p() {
        if (CollectionUtils.a(this.f46114a)) {
            return 0;
        }
        for (qfl qflVar : this.f46114a) {
            if (qflVar != null) {
                return qflVar.d();
            }
        }
        return 0;
    }

    public void d(int i, String str, int i2, String str2) {
        List<qfh> listW = w();
        if (CollectionUtils.a(listW)) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(new qfh(x(), i2, str));
            qfl qflVar = new qfl();
            qflVar.d(System.currentTimeMillis());
            qflVar.a(arrayList);
            qflVar.d(q());
            qflVar.b(this.f46116c);
            qflVar.b(i);
            qflVar.c(this.d);
            qflVar.e(this.e);
            if (CollectionUtils.a(this.f46114a)) {
                this.f46114a = new ArrayList(1);
            }
            this.f46114a.add(qflVar);
        } else {
            for (qfh qfhVar : listW) {
                if (qfhVar != null) {
                    qfhVar.a(str);
                    qfhVar.d(i2);
                }
            }
        }
        ad();
        f(str2);
    }

    public List<qfh> w() {
        if (CollectionUtils.a(this.f46114a)) {
            return Collections.EMPTY_LIST;
        }
        for (qfl qflVar : this.f46114a) {
            if (qflVar != null) {
                return qflVar.a();
            }
        }
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.qff
    public String j() {
        qfg qfgVar;
        List<qfg> listN = n();
        return (CollectionUtils.a(listN) || (qfgVar = listN.get(0)) == null) ? "" : qfgVar.e();
    }

    public String u() {
        if (CollectionUtils.a(this.f46114a)) {
            return "";
        }
        for (qfl qflVar : this.f46114a) {
            if (qflVar != null) {
                String strE = qflVar.e();
                if (!TextUtils.isEmpty(strE)) {
                    return strE;
                }
            }
        }
        return "";
    }

    public String aa() {
        List<qfh> listW = w();
        if (CollectionUtils.a(listW)) {
            return "";
        }
        for (qfh qfhVar : listW) {
            if (qfhVar != null) {
                return qfhVar.d();
            }
        }
        return "";
    }

    public int z() {
        List<qfh> listW = w();
        if (CollectionUtils.a(listW)) {
            return 0;
        }
        for (qfh qfhVar : listW) {
            if (qfhVar != null) {
                return qfhVar.e();
            }
        }
        return 0;
    }

    public int x() {
        List<qfh> listW = w();
        if (CollectionUtils.a(listW)) {
            return 0;
        }
        for (qfh qfhVar : listW) {
            if (qfhVar != null) {
                return qfhVar.a();
            }
        }
        return 0;
    }

    @Override // defpackage.qff
    public String toString() {
        return "ScheduleDetail{" + super.toString() + ",scheduleId='" + this.f46116c + ", taskId='" + this.e + ", planId='" + this.d + ", createdTime=" + this.f46115b + ", scheduleResults=" + this.f46114a + '}';
    }
}
