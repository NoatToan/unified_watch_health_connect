package ll0;

import e23.p;
import hl0.g;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.presentation.downloaded.DownloadedGolfCoursesViewModel$deleteDownloadedGolfCourse$1", f = "DownloadedGolfCoursesViewModel.kt", l = {53}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f113351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f113352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f113353c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, int i14, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f113352b = fVar;
        this.f113353c = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f113352b, this.f113353c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f113351a;
        if (i14 == 0) {
            r.b(obj);
            hl0.f fVar = this.f113352b.f113354a;
            this.f113351a = 1;
            Object objE0 = ge1.b.e0(fVar.f84287c, new g(fVar, this.f113353c, null), this);
            if (objE0 != obj2) {
                objE0 = Unit.INSTANCE;
            }
            if (objE0 == obj2) {
                return obj2;
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
