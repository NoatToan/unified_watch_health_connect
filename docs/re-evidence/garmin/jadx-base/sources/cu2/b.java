package cu2;

import com.garmin.net.weather.exception.FailedHttpRequestException;
import e23.p;
import java.util.List;
import o13.r;
import o53.b0;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lgu2/a;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "com.garmin.net.weather.WeatherService$fetchAlertsObservable$2", f = "WeatherService.kt", l = {}, m = "invokeSuspend")
public final class b extends v13.i implements p<b0, t13.d<? super List<? extends gu2.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fu2.g f55736a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(fu2.g gVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f55736a = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f55736a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super List<? extends gu2.a>> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Exception {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        try {
            fu2.g gVar = this.f55736a;
            List<? extends gu2.a> listB = new eu2.b(gVar.f73587a, gVar.f73588b, gVar.f73589c).b();
            h hVar = h.f55758a;
            a aVar2 = h.f55761d;
            aVar2.getClass();
            h.a(hVar, aVar2.f55730b / DateTimeConstants.MILLIS_PER_MINUTE);
            return listB;
        } catch (FailedHttpRequestException e4) {
            h.a(h.f55758a, h.f55764g);
            throw e4;
        } catch (Exception e14) {
            h.a(h.f55758a, h.f55764g);
            throw e14;
        }
    }
}
