package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class vgw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("localDate")
    private int f51081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("eatTime")
    private long f51082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("index")
    private int f51083c;

    @SerializedName("kiloCalorie")
    private float d;

    @SerializedName("foodDescriptors")
    private List<vgu> e;

    @SerializedName("timeZone")
    private String f;

    @SerializedName("sugRange")
    private int[] g;

    @SerializedName("whichMeal")
    private int h;

    @SerializedName("setTime")
    private Long i;

    @SerializedName("modifiedTime")
    private long j;

    public vgw(int i, long j, int i2, List<vgu> list) {
        this.h = i;
        this.f51082b = j;
        this.d = i2;
        this.e = new ArrayList(list);
    }

    public void e(String str) {
        this.f = str;
    }

    public void m() {
        if (String.valueOf(this.f51082b).matches("\\d{13}")) {
            this.f51082b /= 1000;
        }
        if (njy.e(this.e)) {
            return;
        }
        Iterator<vgu> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().o();
        }
    }

    public void l() {
        if (String.valueOf(this.f51082b).matches("\\d{10}")) {
            this.f51082b *= 1000;
        }
        if (njy.e(this.e)) {
            return;
        }
        Iterator<vgu> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().l();
        }
    }

    public long f() {
        Long l = this.i;
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public void b(Long l) {
        this.i = l;
    }

    public int a() {
        return this.f51083c;
    }

    public int i() {
        return this.h;
    }

    public long d() {
        return this.f51082b;
    }

    public void a(long j) {
        this.f51082b = j;
    }

    public long j() {
        long j = this.j;
        if (j == 0) {
            return String.valueOf(this.f51082b).matches("\\d{10}") ? this.f51082b * 1000 : this.f51082b;
        }
        return j;
    }

    public void d(long j) {
        this.j = j;
    }

    public float e() {
        return this.d;
    }

    public void c(float f) {
        this.d = f;
    }

    public List<vgu> c() {
        return this.e;
    }

    public int[] h() {
        return this.g;
    }

    public void c(int[] iArr) {
        this.g = iArr;
    }

    public String g() {
        return this.f;
    }

    public int hashCode() {
        if (i() != 0) {
            return Integer.valueOf(i()).hashCode() + Integer.valueOf(a()).hashCode();
        }
        return Long.valueOf(d()).hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof vgw)) {
            return false;
        }
        vgw vgwVar = (vgw) obj;
        if (i() != 0) {
            return i() == vgwVar.i() && a() == vgwVar.a();
        }
        return d() == vgwVar.d();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Meal{whichMeal=");
        sb.append(this.h);
        sb.append(", eatTime=");
        sb.append(this.f51082b);
        sb.append(", timeZone =");
        sb.append(this.f);
        sb.append(", setTime=");
        sb.append(this.i);
        sb.append(", index=");
        sb.append(this.f51083c);
        sb.append(", kcal=");
        sb.append(this.d);
        sb.append(", modifiedTime=");
        sb.append(this.j);
        sb.append(", sugRange=");
        sb.append(this.g);
        sb.append(", localDate=");
        sb.append(this.f51081a);
        sb.append(", foodDescriptors=");
        List<vgu> list = this.e;
        sb.append(list == null ? new ArrayList() : list.toString());
        sb.append('}');
        return sb.toString();
    }

    public int b() {
        return this.f51081a;
    }

    public void a(int i) {
        this.f51081a = i;
    }
}
