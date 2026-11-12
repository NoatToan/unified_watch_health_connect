package zp;

import am.b2;
import b63.o;
import c83.a0;
import e23.l;
import java.util.List;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.repository.ActivitiesRepositoryImpl$getRecentActivityTypesAsync$2", f = "ActivitiesRepositoryImpl.kt", l = {26}, m = "invokeSuspend", v = 2)
public final class d extends i implements l<t13.d<? super a0<List<? extends String>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f206546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f206547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f206548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f206549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f206550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f206551f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, Long l14, o oVar, o oVar2, int i14, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f206547b = bVar;
        this.f206548c = l14;
        this.f206549d = oVar;
        this.f206550e = oVar2;
        this.f206551f = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f206547b, this.f206548c, this.f206549d, this.f206550e, this.f206551f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends String>>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f206546a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        b2 b2Var = this.f206547b.f206536a;
        fz0.c cVarA = fz0.d.a(this.f206549d);
        o oVar = this.f206550e;
        i0<a0<List<String>>> i0VarM = b2Var.m(this.f206548c, cVarA, oVar != null ? fz0.d.a(oVar) : null, this.f206551f);
        this.f206546a = 1;
        Object objAwait = i0VarM.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
