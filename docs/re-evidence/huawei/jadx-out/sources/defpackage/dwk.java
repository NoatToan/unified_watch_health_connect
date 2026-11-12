package defpackage;

import android.text.TextUtils;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.ui.openservice.OpenServiceUtil;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class dwk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f32457c;
    private String d;
    private dwb e;
    private int f;
    private String g;
    private String h;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;
    private String t;
    private String u;
    private String w;
    private int x;
    private String y;
    private int z;
    private int j = 1;
    private int k = 0;
    private int i = 0;
    private String v = OpenServiceUtil.Source.THIRD_H5;

    public String a() {
        return this.r;
    }

    public void n(String str) {
        this.r = str;
    }

    public void s(String str) {
        this.u = str;
    }

    public String d() {
        return this.n;
    }

    public void f(String str) {
        this.n = str;
    }

    public void c(String str) {
        this.f32456b = str;
    }

    public int c() {
        return this.z;
    }

    public void i(int i) {
        this.z = i;
    }

    public void k(String str) {
        this.q = str;
    }

    public void m(String str) {
        this.t = str;
    }

    public void e(String str) {
        this.f32457c = str;
    }

    public String e() {
        return this.w;
    }

    public void r(String str) {
        this.w = str;
    }

    public void j(String str) {
        this.l = str;
    }

    public void g(int i) {
        this.x = i;
    }

    public void c(int i) {
        this.f32455a = i;
    }

    public void d(String str) {
        this.g = str;
    }

    public void a(int i) {
        this.f = i;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.e = (dwb) HiJsonUtil.d(str, dwb.class);
    }

    public void h(String str) {
        this.h = str;
    }

    public void b(int i) {
        this.j = i;
    }

    public void e(int i) {
        this.k = i;
    }

    public void d(int i) {
        this.i = i;
    }

    public void g(String str) {
        this.m = str;
    }

    public void t(String str) {
        this.v = str;
    }

    public void o(String str) {
        this.s = str;
    }

    public void l(String str) {
        this.p = str;
    }

    public void q(String str) {
        this.y = str;
    }

    public void i(String str) {
        this.o = str;
    }

    public void b(String str) {
        this.d = str;
    }

    public static void e(List<dwk> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Collections.sort(list, new Comparator<dwk>() { // from class: dwk.3
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public int compare(dwk dwkVar, dwk dwkVar2) {
                return dwkVar.c() - dwkVar2.c();
            }
        });
    }
}
