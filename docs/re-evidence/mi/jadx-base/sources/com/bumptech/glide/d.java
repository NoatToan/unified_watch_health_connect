package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, Object> f6946a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<Class<?>, Object> f6947a = new HashMap();

        public d b() {
            return new d(this);
        }
    }

    public d(a aVar) {
        this.f6946a = Collections.unmodifiableMap(new HashMap(aVar.f6947a));
    }

    public boolean a(Class<Object> cls) {
        return this.f6946a.containsKey(cls);
    }
}
