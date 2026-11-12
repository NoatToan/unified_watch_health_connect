package l52;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.data.WorkoutsRepositoryImpl$removeWorkoutTaskAsync$2", f = "WorkoutsRepositoryImpl.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR}, m = "invokeSuspend", v = 2)
public final class p1 extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f110333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f110334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f110335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f110336d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(z zVar, long j8, long j14, t13.d<? super p1> dVar) {
        super(1, dVar);
        this.f110334b = zVar;
        this.f110335c = j8;
        this.f110336d = j14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new p1(this.f110334b, this.f110335c, this.f110336d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((p1) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f110333a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<Unit>> i0VarW = this.f110334b.f110390a.w(this.f110335c, this.f110336d);
        this.f110333a = 1;
        Object objAwait = i0VarW.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
