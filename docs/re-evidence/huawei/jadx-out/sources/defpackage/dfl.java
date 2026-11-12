package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes7.dex */
public class dfl extends ayx implements Comparable<dfl> {

    @SerializedName("planId")
    private int e;

    public dfl(int i, int i2, int i3, int i4) {
        super(i, i2, i3, null);
        this.e = i4;
    }

    public int g() {
        return this.e;
    }

    public void e(int i) {
        this.e = i;
    }

    @Override // defpackage.ayx
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return (obj instanceof dfl) && ((dfl) obj).d() == d();
    }

    @Override // defpackage.ayx
    public int hashCode() {
        return d();
    }

    public String toString() {
        return "BloodPressureAlarmInfo:mPlanId=" + this.e + ",alarmId=" + d() + ",hour=" + c() + ",minute=" + e() + ",daysOfWeek=" + a() + ",enabled=" + h();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(dfl dflVar) {
        if (dflVar == null) {
            return 0;
        }
        int iC = c();
        int iC2 = dflVar.c();
        if (iC == iC2) {
            return e() - dflVar.e();
        }
        if ((iC >= 2 && iC2 > 2) || (iC < 2 && iC2 < 2)) {
            return iC - iC2;
        }
        if (iC < 2) {
            return 1;
        }
        return iC2 < 2 ? -1 : 0;
    }
}
