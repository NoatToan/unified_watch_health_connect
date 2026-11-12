package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.datasource.EventImageUrlsDataSourceImpl", f = "EventImageUrlsDataSourceImpl.kt", l = {24}, m = "getImageUrls", v = 2)
public final class m1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f33287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f33288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f33289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f33292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f33293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l1 f33294h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f33295i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(l1 l1Var, t13.d<? super m1> dVar) {
        super(dVar);
        this.f33294h = l1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f33293g = obj;
        this.f33295i |= Integer.MIN_VALUE;
        return this.f33294h.a(this);
    }
}
