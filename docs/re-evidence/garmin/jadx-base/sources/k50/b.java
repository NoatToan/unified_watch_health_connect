package k50;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.map.CourseMapViewModel$emitEffect$1", f = "CourseMapViewModel.kt", l = {101}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f102917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f102918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m50.b f102919c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, m50.b bVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f102918b = fVar;
        this.f102919c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f102918b, this.f102919c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f102917a;
        if (i14 == 0) {
            r.b(obj);
            e2 e2Var = this.f102918b.f102927c;
            this.f102917a = 1;
            if (e2Var.emit(this.f102919c, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
