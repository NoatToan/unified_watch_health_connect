package kq1;

import b63.o;
import c83.a0;
import e23.l;
import java.util.List;
import jq1.j;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Ljq1/j;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.steps.data.repository.StepsRepositoryImpl$getWeeklyStepsSummary$2", f = "StepsRepositoryImpl.kt", l = {40}, m = "invokeSuspend", v = 2)
public final class f extends i implements l<t13.d<? super a0<List<? extends j>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f106195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f106196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f106197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f106198d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, o oVar, int i14, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f106196b = gVar;
        this.f106197c = oVar;
        this.f106198d = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f106196b, this.f106197c, this.f106198d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends j>>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f106195a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<List<j>>> i0VarE = this.f106196b.f106199a.e(fz0.d.a(this.f106197c), this.f106198d);
        this.f106195a = 1;
        Object objAwait = i0VarE.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
