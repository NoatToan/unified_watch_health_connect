package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import java.util.Iterator;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.datasource.ActivityPolylineDataSourceImpl", f = "ActivityPolylineDataSourceImpl.kt", l = {67, 70, 88, 102, 121}, m = "getActivitiesPolyline", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f33256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f33257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f33258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p005kotlin.jvm.internal.r0 f33259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p005kotlin.jvm.internal.r0 f33260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f33261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f33262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f33263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k f33264i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f33265j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f33264i = kVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f33263h = obj;
        this.f33265j |= Integer.MIN_VALUE;
        return this.f33264i.a(this);
    }
}
