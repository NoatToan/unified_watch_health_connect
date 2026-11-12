package defpackage;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import health.compact.a.LogAnonymous;
import health.compact.a.LogUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class pdq implements Serializable, Cloneable {
    private static final long serialVersionUID = 6825022930100640483L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("exeDate")
    private List<Integer> f45200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("intensityZone")
    private List<Integer> f45201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("endTime")
    private long f45202c;

    @SerializedName("isExecutable")
    private boolean d;

    @SerializedName("level")
    private String e;

    @SerializedName("levelDescription")
    private String f;

    @SerializedName("targetDuration")
    private int g;

    @SerializedName("targetPoints")
    private double h;

    @SerializedName("runDate")
    private List<Integer> i;

    @SerializedName("startTime")
    private long j;

    @SerializedName("weekNo")
    private int k;

    @SerializedName("weeklyCourse")
    private List<pdt> l;

    @SerializedName("totalTrainingDays")
    private int m;

    public int j() {
        return this.k;
    }

    public void d(int i) {
        this.k = i;
    }

    public String d() {
        return this.e;
    }

    public String c() {
        return this.f;
    }

    public long b() {
        return this.j;
    }

    public void a(long j) {
        this.j = j;
    }

    public long a() {
        return this.f45202c;
    }

    public void b(long j) {
        this.f45202c = j;
    }

    public List<Integer> e() {
        return this.f45201b;
    }

    private void e(List<Integer> list) {
        this.f45201b = list;
    }

    public void d(List<pdt> list) {
        this.l = list;
    }

    public List<pdt> f() {
        return this.l;
    }

    private void a(List<Integer> list) {
        this.i = list;
    }

    private void b(List<Integer> list) {
        this.f45200a = list;
    }

    public int i() {
        return this.m;
    }

    public String toString() {
        return new Gson().toJson(this);
    }

    public Object clone() {
        try {
            if (!(super.clone() instanceof pdq)) {
                return new pdq();
            }
            pdq pdqVar = (pdq) super.clone();
            if (this.i != null) {
                pdqVar.a(new ArrayList(this.i));
            }
            if (this.f45200a != null) {
                pdqVar.b(new ArrayList(this.f45200a));
            }
            if (this.f45201b != null) {
                pdqVar.e(new ArrayList(this.f45201b));
            }
            if (this.l != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<pdt> it = this.l.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                pdqVar.d(arrayList);
            }
            return pdqVar;
        } catch (CloneNotSupportedException e) {
            LogUtil.d("PlanWeekDataBean clone failed", LogAnonymous.b(e));
            throw new AssertionError();
        }
    }
}
