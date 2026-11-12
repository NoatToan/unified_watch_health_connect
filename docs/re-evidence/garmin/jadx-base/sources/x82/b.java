package x82;

import e23.p;
import java.util.concurrent.CancellationException;
import o13.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.ui.patterns.reports.page.state.fetch.FetchingReportsPageDataState$doRefresh$1", f = "FetchingReportsPageDataState.kt", l = {76}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f189563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f189564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a<Object> f189565c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z14, a<Object> aVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f189564b = z14;
        this.f189565c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f189564b, this.f189565c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object value;
        Object value2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f189563a;
        a<Object> aVar2 = this.f189565c;
        try {
            if (i14 == 0) {
                r.b(obj);
                if (this.f189564b) {
                    p2 p2Var = aVar2.f189559d;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, new w82.a(w82.a.InterfaceC3402a.c.f183559a, ((w82.a) value).f183553b)));
                }
                f<Object> fVar = aVar2.f189557b;
                this.f189563a = 1;
                objA = fVar.a(this);
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                objA = ((q) obj).f128597a;
            }
            int i15 = q.f128596b;
            if (!(objA instanceof q.b)) {
                p2 p2Var2 = aVar2.f189559d;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, new w82.a(w82.a.InterfaceC3402a.d.f183560a, objA)));
            }
            Throwable thB = q.b(objA);
            if (thB != null) {
                a.b(aVar2, thB);
            }
        } catch (CancellationException e4) {
            throw e4;
        } catch (Throwable th3) {
            a.b(aVar2, th3);
        }
        return Unit.INSTANCE;
    }
}
