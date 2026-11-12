package ii1;

import androidx.room.a0;
import e23.p;
import o13.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lo13/q;", "Lfi1/a;", "<anonymous>", "(Lo53/b0;)Lo13/q;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.findmydevice.domain.device.GetDeviceInfoUseCase$invoke$2", f = "GetDeviceInfoUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements p<b0, t13.d<? super q<? extends fi1.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f93767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f93768b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, long j8, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f93767a = cVar;
        this.f93768b = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f93767a, this.f93768b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super q<? extends fi1.a>> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        this.f93767a.f93769a.f152045a.getClass();
        long j8 = this.f93768b;
        sd2.f fVarI = rd2.j.i(j8, null);
        if (fVarI != null) {
            String strD0 = fVarI.d0();
            if (strD0 == null) {
                strD0 = fVarI.Q();
            }
            String str = strD0;
            long j14 = this.f93768b;
            if (str != null) {
                int i14 = q.f128596b;
                String displayName = fVarI.getDisplayName();
                String imageURL = fVarI.getImageURL();
                String productNumber = fVarI.getProductNumber();
                productNumber.getClass();
                bVar = new fi1.a(j14, displayName, imageURL, productNumber, str);
            } else {
                int i15 = q.f128596b;
                bVar = new q.b(new IllegalStateException(a0.f(j14, "MacAddress not found for device [deviceId=", "]")));
            }
        } else {
            int i16 = q.f128596b;
            bVar = new q.b(new IllegalStateException(a0.f(j8, "DeviceDatabaseRecord not found [deviceId=", "]")));
        }
        return q.a(bVar);
    }
}
