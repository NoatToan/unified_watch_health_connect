package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lps/y1;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.datasource.ActivityPolylineDataSourceImpl$getTypedSplits$2", f = "ActivityPolylineDataSourceImpl.kt", l = {SyslogConstants.LOG_LOCAL3}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.l<t13.d<? super c83.a0<ps.y1>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f33297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f33298c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k kVar, long j8, t13.d<? super n> dVar) {
        super(1, dVar);
        this.f33297b = kVar;
        this.f33298c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new n(this.f33297b, this.f33298c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<ps.y1>> dVar) {
        return ((n) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f33296a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<ps.y1>> i0VarA = this.f33297b.f33250d.a(this.f33298c);
        this.f33296a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
