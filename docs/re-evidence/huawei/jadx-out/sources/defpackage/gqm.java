package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public class gqm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f35906c;
    private List<Integer> d;
    private int e;
    private gqo f;
    private String g;
    private List<gql> h;
    private double i;
    private gql j;

    public String a() {
        return this.f35904a;
    }

    public void b(String str) {
        this.f35904a = str;
    }

    public void a(String str) {
        this.g = str;
    }

    public void e(gqo gqoVar) {
        this.f = gqoVar;
    }

    public List<gql> e() {
        return this.h;
    }

    public void e(List<gql> list) {
        this.h = list;
    }

    public void d(double d) {
        this.i = d;
    }

    public void d(gql gqlVar) {
        this.j = gqlVar;
    }

    public void d(List<Integer> list) {
        this.d = list;
    }

    public double c() {
        return this.f35906c;
    }

    public void e(double d) {
        this.f35906c = d;
    }

    public int d() {
        return this.e;
    }

    public void b(int i) {
        this.e = i;
    }

    public void c(String str) {
        this.f35905b = str;
    }

    public String toString() {
        return "MotionPathInfo{geoHash='" + this.f35904a + "', pathId='" + this.g + "', pathRange=" + this.f + ", pathPoints=" + this.h + ", totalDistance=" + this.i + ", pathLocation=" + this.j + ", heat=" + this.d + ", confidence=" + this.f35906c + ", flag=" + this.e + ", executionTime='" + this.f35905b + "'}";
    }
}
