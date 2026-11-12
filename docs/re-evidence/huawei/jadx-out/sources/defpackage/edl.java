package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class edl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f32792c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private List<edy> k;
    private edz l;
    private String n;

    public edz i() {
        return (edz) lst.d(this.l);
    }

    public void d(edz edzVar) {
        this.l = (edz) lst.d(edzVar);
    }

    public void j(String str) {
        this.g = (String) lst.d(str);
    }

    public String c() {
        return (String) lst.d(this.h);
    }

    public void g(String str) {
        this.h = (String) lst.d(str);
    }

    public String b() {
        return (String) lst.d(this.n);
    }

    public void h(String str) {
        this.n = (String) lst.d(str);
    }

    public void i(String str) {
        this.f = (String) lst.d(str);
    }

    public int d() {
        return ((Integer) lst.d(Integer.valueOf(this.f32790a))).intValue();
    }

    public void a(int i) {
        this.f32790a = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public String e() {
        return (String) lst.d(this.f32791b);
    }

    public void d(String str) {
        this.f32791b = (String) lst.d(str);
    }

    public void c(String str) {
        this.i = (String) lst.d(str);
    }

    public void e(String str) {
        this.e = (String) lst.d(str);
    }

    public void f(String str) {
        this.j = (String) lst.d(str);
    }

    public void b(String str) {
        this.f32792c = (String) lst.d(str);
    }

    public String a() {
        return (String) lst.d(this.d);
    }

    public void a(String str) {
        this.d = (String) lst.d(str);
    }

    public List<edy> g() {
        return this.k;
    }

    public void c(List<edy> list) {
        this.k = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("DescriptionInfo{, pluginName='");
        sb.append(this.g);
        sb.append("', pluginUuid='");
        sb.append(this.h);
        sb.append("', version='");
        sb.append(this.n);
        sb.append("', modifyDate='");
        sb.append(this.f);
        sb.append("', fileSize='");
        sb.append(this.f32790a);
        sb.append("', digest='");
        sb.append(this.f32791b);
        sb.append("', form='");
        sb.append(this.i);
        sb.append("', description='");
        sb.append(this.e);
        sb.append("', prompt='");
        sb.append(this.j);
        sb.append("', fileName='");
        sb.append(this.f32792c);
        sb.append("', fileType='");
        sb.append(this.d);
        sb.append("'}");
        return sb.toString();
    }
}
