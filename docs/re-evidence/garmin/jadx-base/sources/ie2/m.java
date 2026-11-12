package ie2;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.io.IOException;
import java.util.ArrayList;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.library.mapsdkadapter.MapUtil$init$1", f = "MapUtil.kt", l = {}, m = "invokeSuspend", v = 1)
public final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f93148a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f93148a = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f93148a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws IOException {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        com.garmin.android.library.mapsdkadapter.m mVar = com.garmin.android.library.mapsdkadapter.m.f50298a;
        Context context = this.f93148a;
        ArrayList arrayListB = com.garmin.android.library.mapsdkadapter.m.b(mVar, context, R.raw.taiwan_latlng_polygon);
        com.garmin.android.library.mapsdkadapter.m.f50299b = arrayListB;
        com.garmin.android.library.mapsdkadapter.m.f50300c = com.garmin.android.library.mapsdkadapter.m.a(mVar, arrayListB);
        ArrayList arrayListB2 = com.garmin.android.library.mapsdkadapter.m.b(mVar, context, R.raw.hongkong_latlng_polygon);
        com.garmin.android.library.mapsdkadapter.m.f50301d = arrayListB2;
        com.garmin.android.library.mapsdkadapter.m.f50302e = com.garmin.android.library.mapsdkadapter.m.a(mVar, arrayListB2);
        ArrayList arrayListB3 = com.garmin.android.library.mapsdkadapter.m.b(mVar, context, R.raw.china_latlng_polygon_complex);
        com.garmin.android.library.mapsdkadapter.m.f50303f = arrayListB3;
        com.garmin.android.library.mapsdkadapter.m.f50305h = com.garmin.android.library.mapsdkadapter.m.a(mVar, arrayListB3);
        ArrayList<LatLng> arrayList = com.garmin.android.library.mapsdkadapter.m.f50303f;
        if (arrayList == null) {
            p005kotlin.jvm.internal.s.m("COMPLEX_CHINA_POLYGON");
            throw null;
        }
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        for (LatLng latLng : arrayList) {
            f.f93122a.getClass();
            arrayList2.add(f.b(latLng));
        }
        com.garmin.android.library.mapsdkadapter.m.f50304g = arrayList2;
        com.garmin.android.library.mapsdkadapter.m mVar2 = com.garmin.android.library.mapsdkadapter.m.f50298a;
        f fVar = f.f93122a;
        mVar2.getClass();
        LatLngBounds latLngBounds = com.garmin.android.library.mapsdkadapter.m.f50305h;
        if (latLngBounds == null) {
            p005kotlin.jvm.internal.s.m("COMPLEX_CHINA_LATLNG_BOUNDS");
            throw null;
        }
        LatLng latLng2 = latLngBounds.southwest;
        latLng2.getClass();
        fVar.getClass();
        LatLng latLngB = f.b(latLng2);
        LatLngBounds latLngBounds2 = com.garmin.android.library.mapsdkadapter.m.f50305h;
        if (latLngBounds2 == null) {
            p005kotlin.jvm.internal.s.m("COMPLEX_CHINA_LATLNG_BOUNDS");
            throw null;
        }
        LatLng latLng3 = latLngBounds2.northeast;
        latLng3.getClass();
        com.garmin.android.library.mapsdkadapter.m.f50306i = new LatLngBounds(latLngB, f.b(latLng3));
        return Unit.INSTANCE;
    }
}
