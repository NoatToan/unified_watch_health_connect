package zr;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.p1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.overview.components.group.SelfEvaluationBottomSheetKt$SelfEvaluationBottomSheet$1$1", f = "SelfEvaluationBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<Boolean, Unit> f206743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Integer f206744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f206745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1<Integer> f206746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1<Integer> f206747e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(e23.l<? super Boolean, Unit> lVar, Integer num, Integer num2, p1<Integer> p1Var, p1<Integer> p1Var2, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f206743a = lVar;
        this.f206744b = num;
        this.f206745c = num2;
        this.f206746d = p1Var;
        this.f206747e = p1Var2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f206743a, this.f206744b, this.f206745c, this.f206746d, this.f206747e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        this.f206743a.invoke(Boolean.valueOf((s.g(this.f206746d.getF182175a(), this.f206744b) && s.g(this.f206747e.getF182175a(), this.f206745c)) ? false : true));
        return Unit.INSTANCE;
    }
}
