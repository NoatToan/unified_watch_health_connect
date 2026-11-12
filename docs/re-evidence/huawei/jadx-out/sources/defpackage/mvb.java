package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class mvb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<Integer, String> f42481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f42482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f42483c;
    private long d;
    private HashMap<Integer, Double> e;

    public long c() {
        return this.f42482b;
    }

    public void d(long j) {
        this.f42482b = j;
    }

    public long d() {
        return this.d;
    }

    public void e(long j) {
        this.d = j;
    }

    public long e() {
        return this.f42483c;
    }

    public void a(long j) {
        this.f42483c = j;
    }

    public HashMap<Integer, String> a() {
        return this.f42481a;
    }

    public void c(HashMap<Integer, String> map) {
        this.f42481a = map;
    }

    public HashMap<Integer, Double> b() {
        return this.e;
    }

    public void a(HashMap<Integer, Double> map) {
        this.e = map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{mStartTime:");
        sb.append(this.f42482b);
        sb.append(",mEndTime:");
        sb.append(this.d);
        sb.append(",mModifyTime:");
        sb.append(this.f42483c);
        sb.append(",mFieldsValueData:");
        HashMap<Integer, Double> map = this.e;
        sb.append(map == null ? null : map.toString());
        sb.append(",mFieldsMetaData:");
        HashMap<Integer, String> map2 = this.f42481a;
        sb.append(map2 != null ? map2.toString() : null);
        sb.append("}");
        return sb.toString();
    }
}
