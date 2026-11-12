package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class uid {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f50125c;
    private List<uwh> d;
    private String j = "--";
    private String g = "--";
    private String i = "--";
    private String h = "--";
    private int e = -1;
    private long f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f50124b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<uwh> f50123a = new ArrayList();

    public void c(long j) {
        this.f50125c = j;
    }

    public long e() {
        return this.f50125c;
    }

    public String a() {
        return this.j;
    }

    public void e(String str) {
        this.j = str;
    }

    public String d() {
        return this.g;
    }

    public void a(String str) {
        this.g = str;
    }

    public String c() {
        return this.i;
    }

    public void c(String str) {
        this.i = str;
    }

    public String i() {
        return this.h;
    }

    public void d(String str) {
        this.h = str;
    }

    public int b() {
        return this.e;
    }

    public void e(int i) {
        this.e = i;
    }

    public String toString() {
        return "HeartRate [mHeartRate=" + this.d + "]";
    }
}
