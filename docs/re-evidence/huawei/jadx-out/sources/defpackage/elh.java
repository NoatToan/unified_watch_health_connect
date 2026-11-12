package defpackage;

import android.os.Bundle;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.ecologydevice.connectivity.ScanFilter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class elh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33123a;
    private ArrayList<c> aa;
    private List<cmy> ab;
    private String ac;
    private dmm ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<c> f33124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f33125c;
    private ArrayList<c> d;
    private String e;
    private Bundle f;
    private a g;
    private String h;
    private String i;
    private String j;
    private d k;
    private boolean l;
    private int m;
    private HealthDevice.HealthDeviceKind n;
    private boolean o;
    private String p;
    private String q;
    private ArrayList<b> r;
    private String s;
    private ArrayList<c> t;
    private e u;
    private String v;
    private String w;
    private String x;
    private ScanFilter y;
    private ArrayList<c> z;

    public elh(int i) {
        this.h = "";
        this.o = false;
        this.l = true;
        this.m = i;
    }

    public elh() {
        this.m = -1;
        this.h = "";
        this.o = false;
        this.l = true;
        this.f = new Bundle();
        this.k = new d();
        this.u = new e();
        this.r = new ArrayList<>(10);
        this.f33124b = new ArrayList<>(10);
        this.t = new ArrayList<>(10);
        this.d = new ArrayList<>(10);
        this.aa = new ArrayList<>(10);
        this.z = new ArrayList<>(10);
        this.g = new a();
    }

    public long j() {
        return new dsa("deviceUsedTime").b(dxw.d(), this.v);
    }

    public int k() {
        return ((Integer) dym.d(Integer.valueOf(this.m))).intValue();
    }

    public String i() {
        return (String) dym.d(this.h);
    }

    public void g(String str) {
        this.h = str;
    }

    public boolean f() {
        return this.o;
    }

    public void c(boolean z) {
        this.o = z;
    }

    public boolean w() {
        return this.l;
    }

    public void e(boolean z) {
        this.l = z;
    }

    public void b(String str, String str2, String str3) {
        this.k.f33130b = str;
        this.k.f33131c = str2;
        this.k.f33129a = str3;
    }

    public e y() {
        return (e) dym.d(this.u);
    }

    public ArrayList<c> d() {
        return (ArrayList) dym.d(this.f33124b);
    }

    public String q() {
        return (String) dym.d(this.q);
    }

    public void f(String str) {
        this.q = (String) dym.d(str);
    }

    public HealthDevice.HealthDeviceKind m() {
        return (HealthDevice.HealthDeviceKind) dym.d(this.n);
    }

    public void a(HealthDevice.HealthDeviceKind healthDeviceKind) {
        this.n = (HealthDevice.HealthDeviceKind) dym.d(healthDeviceKind);
    }

    public dmm v() {
        return (dmm) dym.d(this.ad);
    }

    public void b(dmm dmmVar) {
        this.ad = (dmm) dym.d(dmmVar);
    }

    public String u() {
        return (String) dym.d(this.w);
    }

    public void k(String str) {
        this.w = str;
    }

    public String h() {
        return (String) dym.d(this.i);
    }

    public void a(String str) {
        this.i = (String) dym.d(str);
    }

    public String t() {
        return (String) dym.d(this.v);
    }

    public void l(String str) {
        this.v = (String) dym.d(str);
    }

    public String ab() {
        return (String) dym.d(this.ac);
    }

    public void o(String str) {
        this.ac = (String) dym.d(str);
    }

    public String g() {
        return (String) dym.d(this.j);
    }

    public void i(String str) {
        this.j = str;
    }

    public d l() {
        return (d) dym.d(this.k);
    }

    public String r() {
        return (String) dym.d(this.s);
    }

    public void h(String str) {
        this.s = str;
    }

    public String o() {
        return (String) dym.d(this.p);
    }

    public void j(String str) {
        this.p = str;
    }

    public String p() {
        return (String) dym.d(this.x);
    }

    public void n(String str) {
        this.x = str;
    }

    public String e() {
        return (String) dym.d(this.f33125c);
    }

    public void b(String str) {
        this.f33125c = str;
    }

    public ScanFilter x() {
        return this.y;
    }

    public void c(ScanFilter scanFilter) {
        this.y = scanFilter;
    }

    public List<cmy> ac() {
        return this.ab;
    }

    public void c(List<cmy> list) {
        this.ab = list;
    }

    public a n() {
        return (a) dym.d(this.g);
    }

    public void e(String str, String str2) {
        this.r.add(new b(str, str2));
    }

    public void a(String str, String str2) {
        this.f33124b.add(new c(str, str2));
    }

    public void h(String str, String str2) {
        Bundle bundle = this.f;
        if (bundle != null) {
            bundle.putString(str, str2);
        }
    }

    public String c(String str) {
        Bundle bundle = this.f;
        return bundle == null ? "" : bundle.getString(str);
    }

    public ArrayList<c> s() {
        return this.t;
    }

    public void b(String str, String str2) {
        this.t.add(new c(str, str2));
    }

    public ArrayList<c> ad() {
        return this.aa;
    }

    public void a(String str, String str2, String str3) {
        this.aa.add(new c(str, str2, str3));
    }

    public ArrayList<c> c() {
        return (ArrayList) dym.d(this.d);
    }

    public void c(String str, String str2) {
        this.d.add(new c(str, str2));
    }

    public ArrayList<c> aa() {
        return this.z;
    }

    public void d(String str, String str2) {
        this.z.add(new c(str, str2));
    }

    public String a() {
        return (String) dym.d(this.e);
    }

    public void d(String str) {
        this.e = (String) dym.d(str);
    }

    public String b() {
        return (String) dym.d(this.f33123a);
    }

    public void e(String str) {
        this.f33123a = (String) dym.d(str);
    }

    public static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f33132b;

        public String d() {
            return this.f33132b;
        }

        public void b(String str) {
            this.f33132b = str;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f33129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f33130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f33131c;
        private String e;

        public String d() {
            return (String) dym.d(this.f33131c);
        }

        public String b() {
            return (String) dym.d(this.f33130b);
        }

        public String e() {
            return this.f33129a;
        }

        public String c() {
            return this.e;
        }

        public void b(String str) {
            this.e = str;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f33127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f33128c;
        private String e;

        protected c(String str, String str2) {
            this.f33127b = str;
            this.e = str2;
        }

        protected c(String str, String str2, String str3) {
            this.f33128c = str;
            this.f33127b = str2;
            this.e = str3;
        }

        public String a() {
            return (String) dym.d(this.f33128c);
        }

        public String c() {
            return (String) dym.d(this.f33127b);
        }

        public String d() {
            return (String) dym.d(this.e);
        }
    }

    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f33126c = "";

        public String b() {
            return this.f33126c;
        }

        public void a(String str) {
            this.f33126c = str;
        }
    }

    public static class b {
        private String d;
        private String e;

        protected b(String str, String str2) {
            this.d = str;
            this.e = str2;
        }
    }
}
