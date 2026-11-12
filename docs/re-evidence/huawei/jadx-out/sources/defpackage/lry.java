package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class lry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f40747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<lru> f40748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40749c;
    private String d;
    private ArrayList<lrq> e;

    public int d() {
        return ((Integer) lst.d(Integer.valueOf(this.f40749c))).intValue();
    }

    public void e(int i) {
        this.f40749c = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public ArrayList<lru> b() {
        return (ArrayList) lst.d(this.f40748b);
    }

    public void b(ArrayList<lru> arrayList) {
        this.f40748b = (ArrayList) lst.d(arrayList);
    }

    public void a(ArrayList<lrq> arrayList) {
        this.e = (ArrayList) lst.d(arrayList);
    }

    public int c() {
        return ((Integer) lst.d(Integer.valueOf(this.f40747a))).intValue();
    }

    public void c(int i) {
        this.f40747a = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public String a() {
        return (String) lst.d(this.d);
    }

    public void e(String str) {
        this.d = (String) lst.d(str);
    }
}
