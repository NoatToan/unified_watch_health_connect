package kl0;

import am.j;
import android.location.Location;
import android.net.Uri;
import com.garmin.android.library.mapsdkadapter.m;
import com.garmin.android.library.mapsdkadapter.n;
import com.google.android.gms.maps.model.LatLng;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.presentation.details.GolfCourseDetailsViewModel$setDrivingDirections$1", f = "GolfCourseDetailsViewModel.kt", l = {70}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f105258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f105259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ il0.a f105260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mapsdkadapter.i.d f105261d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d dVar, il0.a aVar, com.garmin.android.library.mapsdkadapter.i.d dVar2, t13.d<? super i> dVar3) {
        super(2, dVar3);
        this.f105259b = dVar;
        this.f105260c = aVar;
        this.f105261d = dVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f105259b, this.f105260c, this.f105261d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Uri uri;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f105258a;
        d dVar = this.f105259b;
        if (i14 == 0) {
            r.b(obj);
            this.f105258a = 1;
            obj = d.x4(dVar, this);
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
        Location location = (Location) obj;
        if (location != null) {
            il0.a aVar2 = this.f105260c;
            Integer latitude = aVar2.getLatitude();
            Integer longitude = aVar2.getLongitude();
            if (latitude != null && longitude != null) {
                int iIntValue = longitude.intValue();
                int iIntValue2 = latitude.intValue();
                String name = aVar2.getName();
                String state = aVar2.getState();
                if (state == null) {
                    state = "";
                }
                String city = aVar2.getCity();
                String str = city != null ? city : "";
                int i15 = d.f105234g;
                dVar.getClass();
                com.garmin.android.library.mapsdkadapter.f fVar = new com.garmin.android.library.mapsdkadapter.f(lb2.b.b(iIntValue2), lb2.b.b(iIntValue), com.garmin.android.library.mapsdkadapter.i.b.WGS84);
                if (this.f105261d == com.garmin.android.library.mapsdkadapter.i.d.BAIDU) {
                    LatLng latLng = fVar.f50283a;
                    double d14 = latLng.latitude;
                    double d15 = latLng.longitude;
                    StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("https://api.map.baidu.com/marker?location=", d14, ",");
                    sbA.append(d15);
                    sbA.append("&title=");
                    sbA.append(name);
                    sn.a.t(sbA, "&content=", state, ", ", str);
                    sbA.append("&output=html&coord_type=wgs84");
                    uri = Uri.parse(sbA.toString());
                    uri.getClass();
                } else {
                    com.garmin.android.library.mapsdkadapter.f fVarC = n.c(location);
                    if (m.e(fVarC)) {
                        fVarC = fVarC.f();
                    }
                    if (m.e(fVar)) {
                        fVar = fVar.f();
                    }
                    LatLng latLng2 = fVarC.f50283a;
                    double d16 = latLng2.latitude;
                    double d17 = latLng2.longitude;
                    LatLng latLng3 = fVar.f50283a;
                    double d18 = latLng3.latitude;
                    double d19 = latLng3.longitude;
                    StringBuilder sbA2 = com.airbnb.lottie.parser.moshi.a.a("https://maps.google.com/maps?saddr=", d16, ",");
                    sbA2.append(d17);
                    j.x(sbA2, "&daddr=", d18, ",");
                    sbA2.append(d19);
                    uri = Uri.parse(sbA2.toString());
                    uri.getClass();
                }
                dVar.f105239e.k(null, uri);
            }
        }
        return Unit.INSTANCE;
    }
}
