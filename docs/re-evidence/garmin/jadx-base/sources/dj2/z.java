package dj2;

import i3.e5;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lfj2/e;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.customermanagementlib.data.CustomerManagementRepository$getDistrictsProvinces$resource$1", f = "CustomerManagementRepository.kt", l = {226}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends fj2.e>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f60151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f60152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f60153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f60154d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a aVar, String str, String str2, t13.d<? super z> dVar) {
        super(1, dVar);
        this.f60152b = aVar;
        this.f60153c = str;
        this.f60154d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new z(this.f60152b, this.f60153c, this.f60154d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends fj2.e>>> dVar) {
        return ((z) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f60151a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a aVar2 = this.f60152b;
        hj2.b bVar = aVar2.f59957a;
        StringBuilder sbL = e5.l(aVar2.f59961e.d(), "/geography-services/countries/", this.f60153c, "/subcountries/", this.f60154d);
        sbL.append("/subsubcountries");
        String string = sbL.toString();
        this.f60151a = 1;
        Object objF = bVar.f(string, this);
        return objF == aVar ? aVar : objF;
    }
}
