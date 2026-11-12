package am;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityTypesListContentKt$ActivityTypesListContent$2$1", f = "ActivityTypesListContent.kt", l = {209}, m = "invokeSuspend", v = 2)
public final class n1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e2.i0 f4119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gr.a f4120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3.p1<String> f4121e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(String str, e2.i0 i0Var, gr.a aVar, p3.p1<String> p1Var, t13.d<? super n1> dVar) {
        super(2, dVar);
        this.f4118b = str;
        this.f4119c = i0Var;
        this.f4120d = aVar;
        this.f4121e = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n1(this.f4118b, this.f4119c, this.f4120d, this.f4121e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f4117a;
        if (i14 == 0) {
            o13.r.b(obj);
            p3.p1<String> p1Var = this.f4121e;
            boolean zJ = d53.w.J(p1Var.getF182175a());
            String str = this.f4118b;
            p1Var.setValue(str);
            if (!zJ && d53.w.J(str)) {
                int i15 = this.f4120d.f78518e;
                this.f4117a = 1;
                if (e2.i0.f(this.f4119c, i15, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
