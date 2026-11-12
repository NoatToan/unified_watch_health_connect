package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class jpf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Integer> f38784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38785b;
    private List<jpg> d;

    public jpf() {
        this.f38784a = new ArrayList();
        this.d = new ArrayList();
    }

    public jpf(int i, List<Integer> list, List<jpg> list2) {
        this.f38784a = new ArrayList();
        new ArrayList();
        this.f38785b = i;
        this.f38784a = list;
        this.d = list2;
    }

    public int a() {
        return this.f38785b;
    }

    public void c(int i) {
        this.f38785b = i;
    }

    public List<Integer> b() {
        return this.f38784a;
    }

    public void c(List<Integer> list) {
        this.f38784a = list;
    }

    public List<jpg> d() {
        return this.d;
    }

    public void a(List<jpg> list) {
        this.d = list;
    }
}
