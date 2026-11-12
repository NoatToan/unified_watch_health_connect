package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class msv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f42357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f42358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42359c;
    private String d;
    private int e;

    public msv(String str, String str2, int i, int i2, long j) {
        this.f42358b = str;
        this.d = str2;
        this.e = i;
        this.f42359c = i2;
        this.f42357a = j;
    }

    public String e() {
        return this.f42358b;
    }

    public String c() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public void c(int i) {
        this.e = i;
    }

    public long d() {
        return this.f42357a;
    }

    public void b(long j) {
        this.f42357a = j;
    }

    public int a() {
        return this.f42359c;
    }

    public String toString() {
        return "DeviceSyncStateBean{deviceId='" + this.f42358b + "', tableName='" + this.d + "', syncAllFlag=" + this.e + ", syncState=" + this.f42359c + ", lastSyncTimestamp=" + this.f42357a + '}';
    }
}
