package cu2;

import com.garmin.net.weather.exception.FailedHttpRequestException;
import e23.p;
import o13.r;
import o53.b0;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lgu2/b;", "<anonymous>", "(Lo53/b0;)Lgu2/b;"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "com.garmin.net.weather.WeatherService$fetchConditions$2", f = "WeatherService.kt", l = {}, m = "invokeSuspend")
public final class c extends v13.i implements p<b0, t13.d<? super gu2.b>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fu2.g f55737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f55738b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(fu2.g gVar, boolean z14, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f55737a = gVar;
        this.f55738b = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f55737a, this.f55738b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super gu2.b> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Exception {
        boolean z14 = this.f55738b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        try {
            fu2.g gVar = this.f55737a;
            gu2.b bVarB = new eu2.c(gVar.f73587a, gVar.f73590d, gVar.f73591e, gVar.f73588b, gVar.f73589c).b();
            if (!z14) {
                return bVarB;
            }
            h hVar = h.f55758a;
            a aVar2 = h.f55761d;
            aVar2.getClass();
            h.b(hVar, aVar2.f55731c / DateTimeConstants.MILLIS_PER_MINUTE);
            return bVarB;
        } catch (FailedHttpRequestException e4) {
            if (!z14) {
                throw e4;
            }
            h.b(h.f55758a, h.f55764g);
            throw e4;
        } catch (Exception e14) {
            if (!z14) {
                throw e14;
            }
            h.b(h.f55758a, h.f55764g);
            throw e14;
        }
    }
}
