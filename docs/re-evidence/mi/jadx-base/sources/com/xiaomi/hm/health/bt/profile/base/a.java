package com.xiaomi.hm.health.bt.profile.base;

import com.xiaomi.hm.health.bt.model.HMLanguage;
import defpackage.lxs;
import defpackage.q9;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13476b = 0;
    public int c = 0;
    public int d = -1;
    public int e = -1;
    public int f = -1;
    public lxs g = null;
    public q9 h = null;
    public SystemImageStatus i = SystemImageStatus.d.t;
    public HMLanguage j = new HMLanguage(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f13477k = null;
    public int l = -1;
    public String m = null;
    public Integer n = null;
    public Long o = null;
    public Long p = null;
    public Boolean q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Boolean f13478r = null;

    public void a(String str) {
        this.m = str;
    }

    public void b(String str) {
        this.f13477k = str;
    }

    public int c() {
        return this.f13476b;
    }

    public void d(int i) {
        this.l = i;
    }

    public void e(int i) {
        this.e = i;
    }

    public String f() {
        return this.m;
    }

    public HMLanguage g() {
        return this.j;
    }

    public int h() {
        return this.e;
    }

    public int i() {
        return this.d;
    }

    public SystemImageStatus j() {
        return this.i;
    }

    public int k() {
        return this.f13475a;
    }

    public String toString() {
        return "HMOtherVersion{version=" + this.f13475a + ", fontFlag=" + this.f13476b + ", fontVersion=" + this.c + ", resourceVersion=" + this.d + ", resourceFlag=" + this.e + ", emojiVersion=" + this.f + ", baseResourceInfo=" + this.g + ", language=" + this.j + ", fwFlag=" + this.l + ", differentialPackageOtaMark: " + this.q + ", systemImageStatus: " + this.i + ", domesticProduct: " + this.f13478r + AbstractJsonLexerKt.END_OBJ;
    }

    public void a(Integer num) {
        this.n = num;
    }

    public void b(Long l) {
        this.o = l;
    }

    public void c(int i) {
        this.c = i;
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.l;
    }

    public void f(int i) {
        this.d = i;
    }

    public void g(int i) {
        this.f13475a = i;
    }

    public void a(Long l) {
        this.p = l;
    }

    public void b(int i) {
        this.f13476b = i;
    }

    public void a(int i) {
        this.f = i;
    }

    public q9 b() {
        return this.h;
    }

    public void a(HMLanguage hMLanguage) {
        this.j = hMLanguage;
    }

    public void b(Boolean bool) {
        this.f13478r = bool;
    }

    public lxs a() {
        return this.g;
    }

    public void a(lxs lxsVar) {
        this.g = lxsVar;
    }

    public void a(q9 q9Var) {
        this.h = q9Var;
    }

    public void a(Boolean bool) {
        this.q = bool;
    }

    public void a(SystemImageStatus systemImageStatus) {
        this.i = systemImageStatus;
    }
}
