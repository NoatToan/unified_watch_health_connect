package cz2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import o53.b0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 6, 0})
@v13.e(c = "com.garmin.util.coroutines.ScheduledSingleRunner$joinOrSchedule$2$1", f = "ScheduledSingleRunner.kt", l = {130, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "invokeSuspend")
public final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.r f56940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f56942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j<Object> f56943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r0<o53.r<Object>> f56944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l<t13.d<Object>, Object> f56945f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(long j8, j<Object> jVar, r0<o53.r<Object>> r0Var, e23.l<? super t13.d<Object>, ? extends Object> lVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f56942c = j8;
        this.f56943d = jVar;
        this.f56944e = r0Var;
        this.f56945f = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f56942c, this.f56943d, this.f56944e, this.f56945f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.r<Object> rVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f56941b;
        r0<o53.r<Object>> r0Var = this.f56944e;
        j<Object> jVar = this.f56943d;
        long j8 = this.f56942c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                this.f56941b = 1;
                if (m0.b(j8, this) != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rVar = this.f56940a;
                o13.r.b(obj);
            }
            rVar.p(obj);
            jVar.a("Finish task for delay " + j8);
            jVar.f56921f.set(null);
            jVar.a("Finish cleanup for delay " + j8);
            return Unit.INSTANCE;
            jVar.a("Start task for delay " + j8);
            o53.r<Object> rVar2 = r0Var.f105810a;
            e23.l<t13.d<Object>, Object> lVar = this.f56945f;
            this.f56940a = rVar2;
            this.f56941b = 2;
            Object objInvoke = lVar.invoke(this);
            if (objInvoke != aVar) {
                rVar = rVar2;
                obj = objInvoke;
                rVar.p(obj);
                jVar.a("Finish task for delay " + j8);
                jVar.f56921f.set(null);
                jVar.a("Finish cleanup for delay " + j8);
                return Unit.INSTANCE;
            }
            return aVar;
        } catch (Throwable th3) {
            r0Var.f105810a.O(th3);
        }
    }
}
