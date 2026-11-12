package sy1;

import c83.a0;
import e23.l;
import my1.g;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lmy1/g;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.traininginitiative.repo.GeoCodingRepo$getGeoReverseLookup$2", f = "GeoCodingRepo.kt", l = {28}, m = "invokeSuspend", v = 2)
public final class b extends i implements l<t13.d<? super a0<g>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f161287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f161288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f161289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f161290d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, double d14, double d15, t13.d<? super b> dVar) {
        super(1, dVar);
        this.f161288b = aVar;
        this.f161289c = d14;
        this.f161290d = d15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b(this.f161288b, this.f161289c, this.f161290d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<g>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f161287a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<g>> i0VarA = this.f161288b.f161286a.a(this.f161289c, this.f161290d);
        this.f161287a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
