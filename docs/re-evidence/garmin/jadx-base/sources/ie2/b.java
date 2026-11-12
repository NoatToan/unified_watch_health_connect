package ie2;

import android.location.Address;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Landroid/location/Address;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.library.mapsdkadapter.AndroidGeocoder$getFromLocationName$2", f = "AndroidGeocoder.kt", l = {}, m = "invokeSuspend", v = 1)
public final class b extends v13.i implements e23.p<b0, t13.d<? super List<? extends Address>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mapsdkadapter.c f93108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f93109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f93110c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.garmin.android.library.mapsdkadapter.c cVar, String str, int i14, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f93108a = cVar;
        this.f93109b = str;
        this.f93110c = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f93108a, this.f93109b, this.f93110c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super List<? extends Address>> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        try {
            List<Address> fromLocationName = this.f93108a.f50263a.getFromLocationName(this.f93109b, this.f93110c);
            return fromLocationName == null ? j0.f134944a : fromLocationName;
        } catch (Throwable unused) {
            return j0.f134944a;
        }
    }
}
