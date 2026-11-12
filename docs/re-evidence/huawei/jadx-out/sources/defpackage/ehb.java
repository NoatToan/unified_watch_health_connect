package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ehb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f32969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Object> f32970b;
    private String d;

    public Map<String, Object> d() {
        return this.f32970b;
    }

    public void b(Map<String, Object> map) {
        this.f32970b = map;
    }

    public long b() {
        return this.f32969a;
    }

    public void e(long j) {
        this.f32969a = j;
    }

    public String c() {
        return this.d;
    }

    public void b(String str) {
        this.d = str;
    }

    public String toString() {
        return "BiAnalyticsInfo{mTime=" + this.f32969a + ", mEventId='" + this.d + "', mBiMap=" + this.f32970b + '}';
    }
}
