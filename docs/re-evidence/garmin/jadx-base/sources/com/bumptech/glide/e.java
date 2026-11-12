package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, Object> f28487a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f28488a = new HashMap();
    }

    public e(a aVar) {
        this.f28487a = Collections.unmodifiableMap(new HashMap(aVar.f28488a));
    }
}
