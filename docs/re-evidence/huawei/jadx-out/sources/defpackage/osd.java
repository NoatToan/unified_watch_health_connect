package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class osd extends osf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f44635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f44636c;
    private String d;
    private Map<String, Object> e;
    private int f;

    public osd() {
        super(13);
    }

    public String e() {
        return this.d;
    }

    public void c(String str) {
        this.d = str;
    }

    public int d() {
        return this.f44636c;
    }

    public void e(int i) {
        this.f44636c = i;
    }

    public int b() {
        return this.f;
    }

    public void d(int i) {
        this.f = i;
    }

    public void a(String str) {
        this.f44635b = str;
    }

    public String c() {
        return this.f44634a;
    }

    public void e(String str) {
        this.f44634a = str;
    }

    public Map<String, Object> a() {
        return this.e;
    }

    public void a(Map<String, Object> map) {
        this.e = map;
    }

    public String toString() {
        return "KakaUpdateReturnBody{rewardKaka=" + this.f44636c + ", totalKaka=" + this.f + ", resultDes='" + this.f44635b + "', results=" + this.e + '}';
    }
}
