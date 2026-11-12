package com.google.protobuf;

import defpackage.trf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class l1 implements trf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProtoSyntax f9702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9703b;
    public final int[] c;
    public final x[] d;
    public final q0 e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<x> f9704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ProtoSyntax f9705b;
        public boolean c;
        public boolean d;
        public int[] e = null;
        public Object f;

        public a(int i) {
            this.f9704a = new ArrayList(i);
        }

        public l1 a() {
            if (this.c) {
                throw new IllegalStateException("Builder can only build once");
            }
            if (this.f9705b == null) {
                throw new IllegalStateException("Must specify a proto syntax");
            }
            this.c = true;
            Collections.sort(this.f9704a);
            return new l1(this.f9705b, this.d, this.e, (x[]) this.f9704a.toArray(new x[0]), this.f);
        }

        public void b(int[] iArr) {
            this.e = iArr;
        }

        public void c(Object obj) {
            this.f = obj;
        }

        public void d(x xVar) {
            if (this.c) {
                throw new IllegalStateException("Builder can only build once");
            }
            this.f9704a.add(xVar);
        }

        public void e(boolean z) {
            this.d = z;
        }

        public void f(ProtoSyntax protoSyntax) {
            this.f9705b = (ProtoSyntax) d0.b(protoSyntax, "syntax");
        }
    }

    public l1(ProtoSyntax protoSyntax, boolean z, int[] iArr, x[] xVarArr, Object obj) {
        this.f9702a = protoSyntax;
        this.f9703b = z;
        this.c = iArr;
        this.d = xVarArr;
        this.e = (q0) d0.b(obj, "defaultInstance");
    }

    public static a f(int i) {
        return new a(i);
    }

    @Override // defpackage.trf
    public boolean a() {
        return this.f9703b;
    }

    @Override // defpackage.trf
    public q0 b() {
        return this.e;
    }

    @Override // defpackage.trf
    public ProtoSyntax c() {
        return this.f9702a;
    }

    public int[] d() {
        return this.c;
    }

    public x[] e() {
        return this.d;
    }
}
