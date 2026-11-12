package com.google.common.collect;

import defpackage.dua;
import defpackage.j4h;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dua<? extends Map<?, ?>, ? extends Map<?, ?>> f9225a = new a();

    public class a implements dua<Map<Object, Object>, Map<Object, Object>> {
        @Override // defpackage.dua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<Object, Object> apply(Map<Object, Object> map) {
            return Collections.unmodifiableMap(map);
        }
    }

    public static abstract class b<R, C, V> implements q0.a<R, C, V> {
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof q0.a)) {
                return false;
            }
            q0.a aVar = (q0.a) obj;
            return j4h.a(a(), aVar.a()) && j4h.a(getColumnKey(), aVar.getColumnKey()) && j4h.a(getValue(), aVar.getValue());
        }

        public int hashCode() {
            return j4h.b(a(), getColumnKey(), getValue());
        }

        public String toString() {
            String strValueOf = String.valueOf(a());
            String strValueOf2 = String.valueOf(getColumnKey());
            String strValueOf3 = String.valueOf(getValue());
            StringBuilder sb = new StringBuilder(strValueOf.length() + 4 + strValueOf2.length() + strValueOf3.length());
            sb.append("(");
            sb.append(strValueOf);
            sb.append(",");
            sb.append(strValueOf2);
            sb.append(")=");
            sb.append(strValueOf3);
            return sb.toString();
        }
    }

    public static final class c<R, C, V> extends b<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final R f9226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C f9227b;
        public final V c;

        public c(R r2, C c, V v) {
            this.f9226a = r2;
            this.f9227b = c;
            this.c = v;
        }

        @Override // com.google.common.collect.q0.a
        public R a() {
            return this.f9226a;
        }

        @Override // com.google.common.collect.q0.a
        public C getColumnKey() {
            return this.f9227b;
        }

        @Override // com.google.common.collect.q0.a
        public V getValue() {
            return this.c;
        }
    }

    public static boolean a(q0<?, ?, ?> q0Var, Object obj) {
        if (obj == q0Var) {
            return true;
        }
        if (obj instanceof q0) {
            return q0Var.cellSet().equals(((q0) obj).cellSet());
        }
        return false;
    }

    public static <R, C, V> q0.a<R, C, V> b(R r2, C c2, V v) {
        return new c(r2, c2, v);
    }
}
