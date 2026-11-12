package com.facebook.systrace;

import android.os.Trace;

/* JADX INFO: loaded from: classes4.dex */
public class Systrace {

    public enum EventScope {
        THREAD('t'),
        PROCESS('p'),
        GLOBAL('g');

        private final char mCode;

        EventScope(char c) {
            this.mCode = c;
        }

        public char getCode() {
            return this.mCode;
        }
    }

    public static void a(long j, String str, int i) {
    }

    public static void b(long j, String str, int i, long j2) {
    }

    public static void c(long j, String str) {
        Trace.beginSection(str);
    }

    public static void d(long j, String str, int i) {
    }

    public static void e(long j, String str, int i) {
    }

    public static void f(long j, String str, int i, long j2) {
    }

    public static void g(long j) {
        Trace.endSection();
    }

    public static boolean h(long j) {
        return false;
    }

    public static void i(TraceListener traceListener) {
    }

    public static void j(long j, String str, int i) {
    }

    public static void k(long j, String str, int i) {
    }

    public static void l(long j, String str, EventScope eventScope) {
    }

    public static void m(TraceListener traceListener) {
    }
}
