package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class gnm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("planType")
    private int f35814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("gradePrediction")
    private int f35815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("pbBeforePlan")
    private int f35816c;

    @SerializedName("pbCurrent")
    private int d;

    @SerializedName("planProgressInfo")
    private gng e;

    @SerializedName("weekCount")
    private int g;

    @SerializedName("relatedSportsCompetitions")
    private List<gnf.e> j;

    public boolean d() {
        if (njy.e(this.j)) {
            return true;
        }
        Iterator<gnf.e> it = this.j.iterator();
        while (it.hasNext()) {
            if (!lsl.z(it.next().d())) {
                return false;
            }
        }
        return true;
    }

    public int c() {
        return this.f35814a;
    }

    public List<gnf.e> a() {
        return this.j;
    }

    public gng b() {
        return this.e;
    }

    public int e() {
        return this.f35815b;
    }

    public String toString() {
        return "SmartTrainPlanMetaData{mPbBeforePlan=" + this.f35816c + ", mPbCurrent=" + this.d + ", mPlanType=" + this.f35814a + ", mWeekCount=" + this.g + ", mRelatedSportsCompetitions=" + this.j + ", mPlanProgressInfo=" + this.e + ", mGradePrediction=" + this.f35815b + '}';
    }
}
