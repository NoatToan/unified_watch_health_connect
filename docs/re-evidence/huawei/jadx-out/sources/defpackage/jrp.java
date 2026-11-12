package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class jrp {
    private int i;
    private List<jpf> d = new ArrayList();
    private List<jpg> f = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<jpg> f38942c = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<jpg> f38941b = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<jpg> f38940a = new ArrayList();
    private List<jpk> e = new ArrayList();

    public int h() {
        return this.i;
    }

    public void c(int i) {
        this.i = i;
    }

    public List<jpf> a() {
        return this.d;
    }

    public void e(List<jpf> list) {
        if (list == null) {
            this.d = new ArrayList();
        } else {
            this.d = list;
        }
    }

    public List<jpg> d() {
        return this.f;
    }

    public void a(List<jpg> list) {
        if (list == null) {
            this.f = new ArrayList();
        } else {
            this.f = list;
        }
    }

    public List<jpg> e() {
        return this.f38942c;
    }

    public void c(List<jpg> list) {
        if (list == null) {
            this.f38942c = new ArrayList();
        } else {
            this.f38942c = list;
        }
    }

    public List<jpg> b() {
        return this.f38941b;
    }

    public void b(List<jpg> list) {
        if (this.f38941b == null) {
            this.f38941b = new ArrayList();
        } else {
            this.f38941b = list;
        }
    }

    public List<jpk> c() {
        return this.e;
    }

    public void d(List<jpk> list) {
        this.e = list;
    }

    public String toString() {
        return "sportType:" + h() + " lineList size:" + a().size() + " markerDrawBefore size:" + d().size() + " markerDrawAfter size:" + e().size() + " markerNormal size:" + b() + " mHealthMarkerList size:" + c().size();
    }
}
