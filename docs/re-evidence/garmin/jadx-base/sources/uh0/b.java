package uh0;

import b63.o;
import c83.a0;
import e23.l;
import java.util.List;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lsh0/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.floors.data.repository.FloorsRepository$getDailyFloorsSummary$2", f = "FloorsRepository.kt", l = {31}, m = "invokeSuspend", v = 2)
public final class b extends i implements l<t13.d<? super a0<List<? extends sh0.b>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f171128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f171129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f171130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f171131d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, o oVar, o oVar2, t13.d<? super b> dVar2) {
        super(1, dVar2);
        this.f171129b = dVar;
        this.f171130c = oVar;
        this.f171131d = oVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b(this.f171129b, this.f171130c, this.f171131d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends sh0.b>>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f171128a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<List<sh0.b>>> i0VarA = this.f171129b.f171136a.a(fz0.d.a(this.f171130c), fz0.d.a(this.f171131d));
        this.f171128a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
