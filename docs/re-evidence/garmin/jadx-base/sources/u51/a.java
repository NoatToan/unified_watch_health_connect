package u51;

import com.garmin.android.apps.connectmobile.devices.model.j;
import com.garmin.android.apps.connectmobile.devices.model.m;
import com.garmin.android.apps.connectmobile.v2;
import d53.y;
import e23.p;
import i3.e5;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import rd2.f;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/devices/model/j;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.pending.activities.domain.GetDeviceAppInfoUseCase$invoke$2", f = "GetDeviceAppInfoUseCase.kt", l = {35}, m = "invokeSuspend", v = 2)
public final class a extends i implements p<b0, d<? super v2<? extends j>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f168696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f168697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f168698c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Long l14, b bVar, d<? super a> dVar) {
        super(2, dVar);
        this.f168697b = l14;
        this.f168698c = bVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new a(this.f168697b, this.f168698c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super v2<? extends j>> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object next;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f168696a;
        String str = "";
        Object obj2 = null;
        Long l14 = this.f168697b;
        if (i14 == 0) {
            r.b(obj);
            if (l14 == null) {
                return new v2.a(new Exception("Unit ID is null, cannot get device data."), null, null, 6, null);
            }
            f.a().f152045a.getClass();
            Collection collectionD = rd2.j.d();
            if (collectionD == null) {
                collectionD = j0.f134944a;
            }
            if (!collectionD.isEmpty()) {
                Iterator it = collectionD.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((sd2.f) next).getUnitID() != l14.longValue());
                sd2.f fVar = (sd2.f) next;
                if (fVar != null && fVar.getSoftwareVersion() != null) {
                    String displayName = fVar.getDisplayName();
                    String imageURL = fVar.getImageURL();
                    String softwareVersion = fVar.getSoftwareVersion();
                    if (softwareVersion != null) {
                        String strT0 = y.t0(2, softwareVersion);
                        String str2 = strT0.length() > 0 ? strT0 : null;
                        if (str2 != null) {
                            int length = softwareVersion.length();
                            String strS0 = (length < 0 || length >= 3) ? length == 3 ? y.s0(1, softwareVersion) : y.s0(2, softwareVersion) : str2;
                            if (softwareVersion.length() <= 2) {
                                str2 = "00";
                            }
                            softwareVersion = e5.g(strS0, ".", str2);
                        }
                        str = softwareVersion;
                    }
                    return new v2.b(new j(displayName, imageURL, str), 200, null, null, 12, null);
                }
            }
            pc0.j jVar = this.f168698c.f168699a;
            this.f168696a = 1;
            obj = jVar.i(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        List list = (List) obj;
        if (list != null) {
            for (Object obj3 : list) {
                Long unitId = ((m) obj3).getUnitId();
                long jLongValue = l14.longValue();
                if (unitId != null && unitId.longValue() == jLongValue) {
                    obj2 = obj3;
                    break;
                }
            }
            m mVar = (m) obj2;
            if (mVar != null) {
                String displayName2 = mVar.getDisplayName();
                String imageUrl = mVar.getImageUrl();
                String currentFirmwareVersion = mVar.getCurrentFirmwareVersion();
                return new v2.b(new j(displayName2, imageUrl, currentFirmwareVersion != null ? currentFirmwareVersion : ""), 200, null, null, 12, null);
            }
        }
        return new v2.a(new Exception("Device with unitId " + l14 + " not found."), null, null, 6, null);
    }
}
