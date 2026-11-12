package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class d extends ContextWrapper {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f28476k = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi.b f28477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qj.f f28478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nj.f f28479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b.a f28480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<mj.g<Object>> f28481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<Class<?>, l<?, ?>> f28482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wi.k f28483g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f28484h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f28485i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public mj.h f28486j;

    public d(Context context, xi.b bVar, qj.g<Registry> gVar, nj.f fVar, b.a aVar, Map<Class<?>, l<?, ?>> map, List<mj.g<Object>> list, wi.k kVar, e eVar, int i14) {
        super(context.getApplicationContext());
        this.f28477a = bVar;
        this.f28479c = fVar;
        this.f28480d = aVar;
        this.f28481e = list;
        this.f28482f = map;
        this.f28483g = kVar;
        this.f28484h = eVar;
        this.f28485i = i14;
        this.f28478b = new qj.f(gVar);
    }

    public final Registry a() {
        return (Registry) this.f28478b.get();
    }
}
