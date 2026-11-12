package go;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;
import v13.i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.history.presentation.components.RangeInputKt$RangeInput$2$1", f = "RangeInput.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Double f78175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Double f78176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1<String> f78177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1<String> f78178d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Double d14, Double d15, p1<String> p1Var, p1<String> p1Var2, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f78175a = d14;
        this.f78176b = d15;
        this.f78177c = p1Var;
        this.f78178d = p1Var2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f78175a, this.f78176b, this.f78177c, this.f78178d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        String strValueOf;
        String strValueOf2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        String str = "";
        Double d14 = this.f78175a;
        if (d14 == null || (strValueOf = String.valueOf((int) d14.doubleValue())) == null) {
            strValueOf = "";
        }
        this.f78177c.setValue(strValueOf);
        Double d15 = this.f78176b;
        if (d15 != null && (strValueOf2 = String.valueOf((int) d15.doubleValue())) != null) {
            str = strValueOf2;
        }
        this.f78178d.setValue(str);
        return Unit.INSTANCE;
    }
}
