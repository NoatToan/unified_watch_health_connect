package me0;

import am.b2;
import c83.a0;
import ch.qos.logback.core.net.SyslogConstants;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lps/n;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.data.repository.DogsRepository$getActivityPolyline$2", f = "DogsRepository.kt", l = {SyslogConstants.LOG_LOCAL7}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.l<t13.d<? super a0<ps.n>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f118005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f118006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f118007c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(w wVar, long j8, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f118006b = wVar;
        this.f118007c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f118006b, this.f118007c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<ps.n>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f118005a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<a0<ps.n>> i0VarH = ((b2) this.f118006b.f118069d.getValue()).H(this.f118007c, null, null);
        this.f118005a = 1;
        Object objAwait = i0VarH.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
