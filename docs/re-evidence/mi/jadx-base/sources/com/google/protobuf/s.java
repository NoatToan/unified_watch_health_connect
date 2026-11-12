package com.google.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class s extends t {
    public static final s j = new s(true);
    public final Map<String, b> f;
    public final Map<String, b> g;
    public final Map<a, b> h;
    public final Map<a, b> i;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Descriptors.b f9745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9746b;

        public a(Descriptors.b bVar, int i) {
            this.f9745a = bVar;
            this.f9746b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9745a == aVar.f9745a && this.f9746b == aVar.f9746b;
        }

        public int hashCode() {
            return (this.f9745a.hashCode() * 65535) + this.f9746b;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Descriptors.FieldDescriptor f9747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p0 f9748b;
    }

    public s() {
        this.f = new HashMap();
        this.g = new HashMap();
        this.h = new HashMap();
        this.i = new HashMap();
    }

    public static s g() {
        return j;
    }

    @Deprecated
    public b e(Descriptors.b bVar, int i) {
        return f(bVar, i);
    }

    public b f(Descriptors.b bVar, int i) {
        return this.h.get(new a(bVar, i));
    }

    public s(boolean z) {
        super(t.e);
        this.f = Collections.emptyMap();
        this.g = Collections.emptyMap();
        this.h = Collections.emptyMap();
        this.i = Collections.emptyMap();
    }
}
