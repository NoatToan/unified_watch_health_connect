package du2;

import e23.p;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "com.garmin.net.weather.gdi.WeatherDataHandler$onWeatherRequestMessage$1", f = "WeatherDataHandler.kt", l = {154}, m = "invokeSuspend")
public final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f61274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f61275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rs2.c f61276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f61277d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, rs2.c cVar, j jVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f61275b = aVar;
        this.f61276c = cVar;
        this.f61277d = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f61275b, this.f61276c, this.f61277d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f61274a;
        a aVar2 = this.f61275b;
        try {
            if (i14 == 0) {
                r.b(obj);
                rs2.c cVar = this.f61276c;
                j jVar = this.f61277d;
                this.f61274a = 1;
                obj = a.a(aVar2, cVar, jVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            fu2.h hVar = (fu2.h) obj;
            if (hVar == null) {
                throw new IllegalArgumentException("weatherResponse is null");
            }
            aVar2.getClass();
            try {
                aVar2.f(hVar);
                List<gu2.a> list = hVar.f73603i;
                if (list != null && !list.isEmpty()) {
                    aVar2.e(list);
                }
            } catch (Exception e4) {
                a.f61267g.error("processWeatherResponse", (Throwable) e4);
                aVar2.g();
            }
        } catch (Exception e14) {
            a.f61267g.error("onWeatherRequestMessage", (Throwable) e14);
            aVar2.g();
        }
        return Unit.INSTANCE;
    }
}
