package zp;

import am.x0;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Ldn/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.repository.ActivitiesRepositoryImpl$getFastestSplits$2", f = "ActivitiesRepositoryImpl.kt", l = {43}, m = "invokeSuspend", v = 2)
public final class c extends i implements l<t13.d<? super a0<List<? extends dn.a>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f206540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f206541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f206542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f206543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0 f206544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f206545f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, o oVar, o oVar2, x0 x0Var, int i14, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f206541b = bVar;
        this.f206542c = oVar;
        this.f206543d = oVar2;
        this.f206544e = x0Var;
        this.f206545f = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f206541b, this.f206542c, this.f206543d, this.f206544e, this.f206545f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends dn.a>>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f206540a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<List<dn.a>>> i0VarF = this.f206541b.f206536a.F(fz0.d.a(this.f206542c), fz0.d.a(this.f206543d), this.f206544e.f4358a, this.f206545f);
        this.f206540a = 1;
        Object objAwait = i0VarF.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
