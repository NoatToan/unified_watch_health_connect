package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes15.dex */
public class qdu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("item")
    private String f46034c;

    @SerializedName("daysNeed")
    private int d;
    private int e;

    public int a() {
        return this.d;
    }

    public String b() {
        return this.f46034c;
    }

    public int d() {
        return this.e;
    }

    public void c(int i) {
        this.e = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || this.f46034c == null) {
            return false;
        }
        qdu qduVar = (qdu) obj;
        return this.d == qduVar.a() && this.f46034c.equals(qduVar.b());
    }

    public String toString() {
        return "DayRemains{daysNeed=" + this.d + ", item='" + this.f46034c + "'}";
    }
}
