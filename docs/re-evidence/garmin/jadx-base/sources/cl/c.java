package cl;

import c83.a0;
import e23.l;
import java.util.List;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {1, 9, 0})
@e(c = "com.garmin.analytics.gcs.api.AnalyticsRepo$postEvent$2", f = "AnalyticsRepo.kt", l = {12}, m = "invokeSuspend")
public final class c extends i implements l<d<? super a0<String>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f27924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<dl.a> f27925c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, List<dl.a> list, d<? super c> dVar) {
        super(1, dVar);
        this.f27924b = bVar;
        this.f27925c = list;
    }

    @Override // v13.a
    public final d<Unit> create(d<?> dVar) {
        return new c(this.f27924b, this.f27925c, dVar);
    }

    @Override // e23.l
    public final Object invoke(d<? super a0<String>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f27923a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<String>> i0VarA = this.f27924b.f27922a.a(this.f27925c);
        this.f27923a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
