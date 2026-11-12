package com.garmin.android.apps.connectmobile.util.simplecropimage;

import am.j;
import ch.qos.logback.classic.spi.CallerData;
import com.google.common.net.HttpHeaders;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f47321b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap<Thread, c> f47322a = new WeakHashMap<>();

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.util.simplecropimage.a$a, reason: collision with other inner class name */
    public enum EnumC0924a {
        CANCEL,
        ALLOW
    }

    public static class b implements Iterable<Thread> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakHashMap<Thread, Object> f47326a = new WeakHashMap<>();

        @Override // java.lang.Iterable
        public final Iterator<Thread> iterator() {
            return this.f47326a.keySet().iterator();
        }
    }

    private a() {
    }

    public static synchronized a b() {
        try {
            if (f47321b == null) {
                f47321b = new a();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f47321b;
    }

    public final synchronized void a(Thread thread) {
        c cVar;
        synchronized (this) {
            cVar = this.f47322a.get(thread);
            if (cVar == null) {
                cVar = new c(0);
                this.f47322a.put(thread, cVar);
            }
        }
        cVar.f47327a = EnumC0924a.CANCEL;
        notifyAll();
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public EnumC0924a f47327a;

        private c() {
            this.f47327a = EnumC0924a.ALLOW;
        }

        public final String toString() {
            String str;
            EnumC0924a enumC0924a = this.f47327a;
            if (enumC0924a == EnumC0924a.CANCEL) {
                str = "Cancel";
            } else {
                str = enumC0924a == EnumC0924a.ALLOW ? HttpHeaders.ALLOW : CallerData.NA;
            }
            return j.m("thread state = ", str, ", options = null");
        }

        public /* synthetic */ c(int i14) {
            this();
        }
    }
}
