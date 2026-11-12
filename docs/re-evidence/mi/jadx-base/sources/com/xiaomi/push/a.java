package com.xiaomi.push;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinkedList<C0842a> f14027a = new LinkedList<>();

    /* JADX INFO: renamed from: com.xiaomi.push.a$a, reason: collision with other inner class name */
    public static class C0842a {
        public static final a d = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f14029b;
        public Object c;

        public C0842a(int i, Object obj) {
            this.f14028a = i;
            this.c = obj;
        }
    }

    public static a b() {
        return C0842a.d;
    }

    public synchronized int a() {
        return this.f14027a.size();
    }

    public synchronized LinkedList<C0842a> c() {
        LinkedList<C0842a> linkedList;
        linkedList = this.f14027a;
        this.f14027a = new LinkedList<>();
        return linkedList;
    }

    public final void d() {
        if (this.f14027a.size() > 100) {
            this.f14027a.removeFirst();
        }
    }

    public synchronized void e(Object obj) {
        this.f14027a.add(new C0842a(0, obj));
        d();
    }
}
