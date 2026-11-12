package du2;

import bs2.bk;
import e23.p;
import java.util.Arrays;
import java.util.List;
import o13.r;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "com.garmin.net.weather.gdi.WeatherDataHandler$sendWeatherData$1", f = "WeatherDataHandler.kt", l = {194}, m = "invokeSuspend")
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f61290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f61291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<bk> f61292c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(a aVar, List<? extends bk> list, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f61291b = aVar;
        this.f61292c = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f61291b, this.f61292c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f61290a;
        List<bk> list = this.f61292c;
        a aVar2 = this.f61291b;
        try {
            if (i14 == 0) {
                r.b(obj);
                zs2.h hVar = aVar2.f61271e;
                if (hVar == null) {
                    s.m("fitHandler");
                    throw null;
                }
                bk[] bkVarArr = (bk[]) list.toArray(new bk[0]);
                bk[] bkVarArr2 = (bk[]) Arrays.copyOf(bkVarArr, bkVarArr.length);
                this.f61290a = 1;
                List listAsList = Arrays.asList(bkVarArr2);
                listAsList.getClass();
                Object objE = hVar.e(listAsList, this);
                if (objE != aVar) {
                    objE = Unit.INSTANCE;
                }
                if (objE == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (Exception e4) {
            Logger logger = aVar2.f61270d;
            if (logger == null) {
                s.m("logger");
                throw null;
            }
            logger.warn("sendWeatherData: failed to send " + list.size() + " messages", (Throwable) e4);
        }
        return Unit.INSTANCE;
    }
}
