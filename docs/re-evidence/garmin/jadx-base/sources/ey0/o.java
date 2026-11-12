package ey0;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcy0/k;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.repository.MultiDayActivitiesRepository$getEpicActivityDetail$2", f = "MultiDayActivitiesRepository.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.l<t13.d<? super c83.a0<cy0.k>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f67214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f67215c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(g0 g0Var, String str, t13.d<? super o> dVar) {
        super(1, dVar);
        this.f67214b = g0Var;
        this.f67215c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new o(this.f67214b, this.f67215c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<cy0.k>> dVar) {
        return ((o) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67213a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<cy0.k>> i0VarG = g0.b(this.f67214b).g(this.f67215c);
        this.f67213a = 1;
        Object objAwait = i0VarG.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
