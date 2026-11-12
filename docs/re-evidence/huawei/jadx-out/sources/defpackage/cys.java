package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class cys {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("id")
    private long f31504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("recordDays")
    private List<Long> f31505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("completeValue")
    private double f31506c;

    @SerializedName("status")
    private int e;

    public void a(long j) {
        this.f31504a = j;
    }

    public void d(double d) {
        this.f31506c = d;
    }

    public void b(List<Long> list) {
        this.f31505b = list;
    }

    public void a(int i) {
        this.e = i;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("UpdateGoalBean{id=");
        stringBuffer.append(this.f31504a);
        stringBuffer.append(", completeValue=").append(this.f31506c);
        stringBuffer.append(", recordDays=").append(this.f31505b);
        stringBuffer.append(", status=").append(this.e);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
