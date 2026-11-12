package vx;

import e23.l;
import e23.p;
import i3.c5;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.x3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.calendar.CalendarDatePickerKt$DateRangePicker$1$1$1", f = "CalendarDatePicker.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c5 f180637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3<Long> f180638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l<Long, Unit> f180639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x3<Long> f180640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l<Long, Unit> f180641e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(c5 c5Var, x3<Long> x3Var, l<? super Long, Unit> lVar, x3<Long> x3Var2, l<? super Long, Unit> lVar2, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f180637a = c5Var;
        this.f180638b = x3Var;
        this.f180639c = lVar;
        this.f180640d = x3Var2;
        this.f180641e = lVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f180637a, this.f180638b, this.f180639c, this.f180640d, this.f180641e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Long f182175a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        x3<Long> x3Var = this.f180638b;
        Long f182175a2 = x3Var.getF182175a();
        c5 c5Var = this.f180637a;
        if (s.g(f182175a2, c5Var.k())) {
            x3<Long> x3Var2 = this.f180640d;
            if (!s.g(x3Var2.getF182175a(), c5Var.i()) && (f182175a = x3Var2.getF182175a()) != null) {
                this.f180641e.invoke(new Long(f182175a.longValue()));
            }
        } else {
            Long f182175a3 = x3Var.getF182175a();
            if (f182175a3 != null) {
                this.f180639c.invoke(new Long(f182175a3.longValue()));
            }
        }
        return Unit.INSTANCE;
    }
}
