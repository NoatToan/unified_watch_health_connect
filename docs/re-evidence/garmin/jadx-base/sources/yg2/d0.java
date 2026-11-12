package yg2;

import okhttp3.internal.http.StatusLine;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m1;
import p3.n1;
import p3.x3;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.ui.workout.WorkoutEditViewKt$EditWorkoutScreen$4$1", f = "WorkoutEditView.kt", l = {StatusLine.HTTP_TEMP_REDIRECT}, m = "invokeSuspend", v = 2)
public final class d0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f196963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f196964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f196965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n1 f196966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x3<Boolean> f196967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m1 f196968f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(int i14, h hVar, n1 n1Var, x3<Boolean> x3Var, m1 m1Var, t13.d<? super d0> dVar) {
        super(2, dVar);
        this.f196964b = i14;
        this.f196965c = hVar;
        this.f196966d = n1Var;
        this.f196967e = x3Var;
        this.f196968f = m1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d0(this.f196964b, this.f196965c, this.f196966d, this.f196967e, this.f196968f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x003e -> B:19:0x0041). Please report as a decompilation issue!!! */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f196963a;
        n1 n1Var = this.f196966d;
        if (i14 == 0) {
            o13.r.b(obj);
            if (n1Var.getIntValue() <= 0) {
                return Unit.INSTANCE;
            }
            if (n1Var.getIntValue() > 0 || this.f196967e.getF182175a().booleanValue()) {
                if (n1Var.getIntValue() <= 0) {
                    this.f196965c.z4();
                }
                return Unit.INSTANCE;
            }
            this.f196963a = 1;
            if (o53.m0.b(10L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        n1Var.t(n1Var.getIntValue() - 10);
        int i15 = this.f196964b;
        this.f196968f.i(i15 > 0 ? n1Var.getIntValue() / i15 : 0.0f);
        if (n1Var.getIntValue() > 0) {
        }
        if (n1Var.getIntValue() <= 0) {
            this.f196965c.z4();
        }
        return Unit.INSTANCE;
    }
}
