package com.google.common.math;

import defpackage.c6i;
import defpackage.y27;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f9275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f9276b;

        public a a(double d) {
            c6i.d(!Double.isNaN(d));
            return y27.c(d) ? new d(d, this.f9276b - (this.f9275a * d)) : new e(this.f9275a);
        }

        public b(double d, double d2) {
            this.f9275a = d;
            this.f9276b = d2;
        }
    }

    public static final class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f9277a = new c();

        public String toString() {
            return "NaN";
        }
    }

    public static final class d extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f9278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f9279b;
        public a c = null;

        public d(double d, double d2) {
            this.f9278a = d;
            this.f9279b = d2;
        }

        public String toString() {
            return String.format("y = %g * x + %g", Double.valueOf(this.f9278a), Double.valueOf(this.f9279b));
        }
    }

    public static final class e extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f9280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f9281b = null;

        public e(double d) {
            this.f9280a = d;
        }

        public String toString() {
            return String.format("x = %g", Double.valueOf(this.f9280a));
        }
    }

    public static a a() {
        return c.f9277a;
    }

    public static a b(double d2) {
        c6i.d(y27.c(d2));
        return new d(0.0d, d2);
    }

    public static b c(double d2, double d3) {
        c6i.d(y27.c(d2) && y27.c(d3));
        return new b(d2, d3);
    }

    public static a d(double d2) {
        c6i.d(y27.c(d2));
        return new e(d2);
    }
}
