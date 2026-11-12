package kv1;

import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lav1/h;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.network.FBTPlansRepo$getTrainingPremiumContent$2", f = "FBTPlansRepo.kt", l = {89}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends av1.h>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f106770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f106771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f106772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f106773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f106774e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b bVar, long j8, String str, String str2, t13.d<? super n> dVar) {
        super(1, dVar);
        this.f106771b = bVar;
        this.f106772c = j8;
        this.f106773d = str;
        this.f106774e = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new n(this.f106771b, this.f106772c, this.f106773d, this.f106774e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends av1.h>>> dVar) {
        return ((n) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f106770a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<List<av1.h>>> i0VarM = this.f106771b.f106720a.m(this.f106772c, this.f106773d, this.f106774e);
        this.f106770a = 1;
        Object objAwait = i0VarM.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
