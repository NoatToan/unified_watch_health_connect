package de2;

import fe2.v1;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lde2/h0;", "", "Lae2/e0;", "publisher", "", "startTimeMillis", "", "sessionName", "durationInSeconds", "", "Lfe2/v1;", "sessions", "<init>", "(Lae2/e0;JLjava/lang/String;JLjava/util/List;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ae2.e0 f59306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f59307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f59308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f59309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<v1> f59310e;

    public h0(ae2.e0 e0Var, long j8, String str, long j14, List<v1> list) {
        e0Var.getClass();
        str.getClass();
        list.getClass();
        this.f59306a = e0Var;
        this.f59307b = j8;
        this.f59308c = str;
        this.f59309d = j14;
        this.f59310e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f59306a.equals(h0Var.f59306a) && this.f59307b == h0Var.f59307b && this.f59308c.equals(h0Var.f59308c) && this.f59309d == h0Var.f59309d && this.f59310e.equals(h0Var.f59310e);
    }

    public final int hashCode() {
        return this.f59310e.hashCode() + q6.f.e(wr.g.j(q6.f.e(this.f59306a.hashCode() * 31, 31, this.f59307b), 31, this.f59308c), 31, this.f59309d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StartDeviceDrivenRequestDetails(publisher=");
        sb3.append(this.f59306a);
        sb3.append(", startTimeMillis=");
        sb3.append(this.f59307b);
        am.j.y(sb3, ", sessionName=", this.f59308c, ", durationInSeconds=");
        sb3.append(this.f59309d);
        sb3.append(", sessions=");
        sb3.append(this.f59310e);
        sb3.append(")");
        return sb3.toString();
    }
}
