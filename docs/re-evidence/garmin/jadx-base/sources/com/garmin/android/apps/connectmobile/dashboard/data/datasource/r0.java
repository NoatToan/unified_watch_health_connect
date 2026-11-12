package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.datasource.DashboardConfigDataSourceImpl$updateDashboardConfig$dashboardConfigServerResult$1", f = "DashboardConfigDataSourceImpl.kt", l = {145}, m = "invokeSuspend", v = 2)
public final class r0 extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<o70.f> f33335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<j70.b> f33336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<j70.b> f33337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<j70.b> f33338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<j70.b> f33339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m0 f33340g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r0(List<? extends o70.f> list, List<j70.b> list2, List<j70.b> list3, List<j70.b> list4, List<j70.b> list5, m0 m0Var, t13.d<? super r0> dVar) {
        super(1, dVar);
        this.f33335b = list;
        this.f33336c = list2;
        this.f33337d = list3;
        this.f33338e = list4;
        this.f33339f = list5;
        this.f33340g = m0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new r0(this.f33335b, this.f33336c, this.f33337d, this.f33338e, this.f33339f, this.f33340g, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((r0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f33334a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        List<o70.f> list = this.f33335b;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(p13.y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(new j70.v(((o70.f) it.next()).f129989a));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        List<j70.b> list2 = this.f33336c;
        j70.f fVar = new j70.f(null, (list2 == null && this.f33337d == null && this.f33338e == null && this.f33339f == null) ? null : new j70.c(list2, this.f33337d, this.f33338e, null, this.f33339f, null, null), arrayList, null, null);
        k0 k0Var = this.f33340g.f33270a;
        this.f33334a = 1;
        Object objA = k0Var.a(fVar, this);
        return objA == aVar ? aVar : objA;
    }
}
