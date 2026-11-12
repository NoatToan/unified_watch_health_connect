package v41;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Typeface;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.o2;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.domain.usecase.PlanMapUseCase$updatePaceProMapState$2", f = "PlanMapUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f175648a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f175649a;

        static {
            int[] iArr = new int[com.garmin.android.library.mapsdkadapter.i.d.values().length];
            try {
                iArr[com.garmin.android.library.mapsdkadapter.i.d.MAPBOX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f175649a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f175648a = qVar;
    }

    public static final ke2.b a(GeoPointDTO geoPointDTO, com.garmin.android.library.mapsdkadapter.i.b bVar, com.garmin.android.library.mapsdkadapter.i.d dVar) {
        Double d14 = geoPointDTO.latitude;
        Double d15 = geoPointDTO.longitude;
        if (d14 == null || d15 == null) {
            return null;
        }
        double dDoubleValue = d15.doubleValue();
        double dDoubleValue2 = d14.doubleValue();
        if (bVar == null) {
            bVar = com.garmin.android.library.mapsdkadapter.m.c(new LatLng(dDoubleValue2, dDoubleValue), dVar);
        }
        return new ke2.b(dDoubleValue2, dDoubleValue, bVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f175648a, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x025f  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List list;
        GeoPointDTO geoPointDTO;
        ArrayList arrayList;
        Iterable<com.garmin.android.apps.connectmobile.courses.model.g> iterableV;
        u41.b value;
        Object cVar;
        com.garmin.android.library.mapsdkadapter.i.b bVarH;
        List listU;
        ke2.b bVarA;
        ke2.b bVarA2;
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        qw0.s sVar;
        int i14;
        ArrayList arrayList2;
        le2.d dVar;
        Integer num;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        q qVar = this.f175648a;
        o2<com.garmin.android.apps.connectmobile.courses.model.e> o2Var = qVar.f175652c;
        qw0.s sVar2 = qVar.f175653d;
        z1<u41.b> z1Var = qVar.f175651b;
        Context context = qVar.f175650a;
        com.garmin.android.apps.connectmobile.courses.model.e value2 = o2Var.getValue();
        com.garmin.android.library.mapsdkadapter.i.b bVarH2 = value2 != null ? value2.h() : null;
        if (value2 == null || (list = value2.geoPoints) == null) {
            list = p13.j0.f134944a;
        }
        List<com.garmin.android.apps.connectmobile.courses.model.g> list2 = z1Var.getValue().f168610b;
        List<Integer> list3 = z1Var.getValue().f168611c;
        com.garmin.android.library.mapsdkadapter.i.d dVarV = sVar2.v();
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList();
            int i15 = 0;
            for (Object obj2 : list2) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    p13.x.q();
                    throw null;
                }
                com.garmin.android.apps.connectmobile.courses.model.g gVar = list2.get(i15);
                com.garmin.android.apps.connectmobile.courses.model.g gVar2 = (com.garmin.android.apps.connectmobile.courses.model.g) p13.h0.e0(i16, list2);
                if (gVar2 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : list) {
                        com.garmin.android.apps.connectmobile.courses.model.e eVar2 = value2;
                        qw0.s sVar3 = sVar2;
                        GeoPointDTO geoPointDTO2 = (GeoPointDTO) obj3;
                        int i17 = i16;
                        Double d14 = geoPointDTO2.distance;
                        double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                        Double distance = gVar.getDistance();
                        if (dDoubleValue >= (distance != null ? distance.doubleValue() : 0.0d)) {
                            Double d15 = geoPointDTO2.distance;
                            double dDoubleValue2 = d15 != null ? d15.doubleValue() : 0.0d;
                            Double distance2 = gVar2.getDistance();
                            if (dDoubleValue2 <= (distance2 != null ? distance2.doubleValue() : 0.0d)) {
                                arrayList4.add(obj3);
                            }
                        }
                        value2 = eVar2;
                        sVar2 = sVar3;
                        i16 = i17;
                    }
                    eVar = value2;
                    sVar = sVar2;
                    i14 = i16;
                    arrayList2 = new ArrayList();
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        ke2.b bVarA3 = a((GeoPointDTO) it.next(), bVarH2, dVarV);
                        if (bVarA3 != null) {
                            arrayList2.add(bVarA3);
                        }
                    }
                } else {
                    eVar = value2;
                    sVar = sVar2;
                    i14 = i16;
                    arrayList2 = null;
                }
                if (arrayList2 != null) {
                    dVar = new le2.d(i15, i53.a.e(arrayList2), new uj1.a(25), context.getColor((list3 == null || (num = (Integer) p13.h0.e0(i15, list3)) == null) ? R.color.gcm_pace_pro_avg : num.intValue()), new uj1.a(26), o4.f0.j(new gl.e().f77791l), 0.0f, 64, null);
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    arrayList3.add(dVar);
                }
                value2 = eVar;
                sVar2 = sVar;
                i15 = i14;
            }
            geoPointDTO = null;
            arrayList = arrayList3;
        } else {
            geoPointDTO = null;
            arrayList = null;
        }
        com.garmin.android.apps.connectmobile.courses.model.e eVar3 = value2;
        qw0.s sVar4 = sVar2;
        Object obj4 = arrayList;
        if (arrayList == null) {
            obj4 = p13.j0.f134944a;
        }
        i53.c cVarE = i53.a.e((Iterable) obj4);
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            ke2.b bVarA4 = a((GeoPointDTO) it3.next(), bVarH2, dVarV);
            if (bVarA4 != null) {
                arrayList5.add(bVarA4);
            }
        }
        i53.c cVarE2 = i53.a.e(arrayList5);
        GeoPointDTO geoPointDTOD = eVar3 != null ? eVar3.D() : geoPointDTO;
        GeoPointDTO geoPointDTO3 = (GeoPointDTO) p13.h0.n0(list);
        q13.b bVarB = p13.w.b();
        if (geoPointDTOD != null && (bVarA2 = a(geoPointDTOD, bVarH2, dVarV)) != null) {
            bVarB.add(q.a(qVar, context, bVarA2, 2131232000));
        }
        if (geoPointDTO3 != null && (bVarA = a(geoPointDTO3, bVarH2, dVarV)) != null) {
            bVarB.add(q.a(qVar, context, bVarA, 2131232001));
        }
        i53.c cVarE3 = i53.a.e(p13.w.a(bVarB));
        if (list2 == null || (listU = p13.h0.U(list2, 1)) == null || (iterableV = p13.h0.V(1, listU)) == null) {
            iterableV = p13.j0.f134944a;
        }
        ArrayList arrayList6 = new ArrayList();
        for (com.garmin.android.apps.connectmobile.courses.model.g gVar3 : iterableV) {
            if (gVar3.lat == null || gVar3.lon == null) {
                cVar = geoPointDTO;
            } else {
                Paint paint = new Paint(65);
                paint.setColor(-16777216);
                paint.setTypeface(Typeface.SANS_SERIF);
                paint.setStyle(Paint.Style.FILL);
                paint.setTextSize(context.getResources().getDimension(R.dimen.andfont_caption));
                Bitmap bitmapA = qw0.j.a(context.getResources(), gVar3.name, paint);
                Double d16 = gVar3.lat;
                Double d17 = gVar3.lon;
                if (d16 == null || d17 == null) {
                    cVar = geoPointDTO;
                } else {
                    double dDoubleValue3 = d17.doubleValue();
                    double dDoubleValue4 = d16.doubleValue();
                    com.garmin.android.apps.connectmobile.courses.model.e value3 = qVar.f175652c.getValue();
                    if (value3 == null || (bVarH = value3.h()) == null) {
                        bVarH = com.garmin.android.library.mapsdkadapter.i.b.WGS84;
                    }
                    cVar = new le2.c(new ke2.b(dDoubleValue4, dDoubleValue3, bVarH), bitmapA, q.b(bitmapA), 1.0f);
                }
            }
            if (cVar != null) {
                arrayList6.add(cVar);
            }
        }
        o51.e eVar4 = new o51.e(dVarV, qVar.f175654e.c1(), sVar4.c(), sVar4.C(), cVarE, cVarE2, cVarE3, i53.a.e(p13.h0.C0(cVarE3, arrayList6)));
        do {
            value = z1Var.getValue();
        } while (!z1Var.b(value, u41.b.a(value, null, null, null, 0, 0, eVar4, null, null, null, null, null, false, false, false, 16351)));
        return Unit.INSTANCE;
    }
}
