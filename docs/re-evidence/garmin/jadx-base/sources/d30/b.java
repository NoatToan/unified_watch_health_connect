package d30;

import com.garmin.android.apps.connectmobile.courses.model.CourseSegmentDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.model.e;
import com.garmin.android.apps.connectmobile.courses.model.g;
import com.garmin.android.library.mapsdkadapter.f;
import com.garmin.android.library.mapsdkadapter.i;
import com.garmin.android.library.mapsdkadapter.m;
import com.google.android.gms.maps.model.LatLng;
import f12.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p13.h0;
import p13.x;
import p13.y;
import s20.d;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    public static final void a(List<GeoPointDTO> list, List<? extends List<GeoPointDTO>> list2, List<CourseSegmentDTO> list3) {
        Double d14;
        Double d15;
        Double d16;
        Double d17;
        Double dValueOf = Double.valueOf(0.0d);
        list.getClass();
        list2.getClass();
        list3.getClass();
        int i14 = 0;
        int i15 = 0;
        for (Object obj : y.s(list2)) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                x.q();
                throw null;
            }
            GeoPointDTO geoPointDTO = (GeoPointDTO) obj;
            GeoPointDTO geoPointDTO2 = (GeoPointDTO) h0.e0(i15, list);
            if (geoPointDTO2 == null || (d16 = geoPointDTO2.distance) == null) {
                d16 = dValueOf;
            }
            geoPointDTO.distance = d16;
            GeoPointDTO geoPointDTO3 = (GeoPointDTO) h0.e0(i15, list);
            if (geoPointDTO3 == null || (d17 = geoPointDTO3.elevation) == null) {
                d17 = dValueOf;
            }
            geoPointDTO.elevation = d17;
            i15 = i16;
        }
        for (Object obj2 : list2) {
            int i17 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            List list4 = (List) obj2;
            CourseSegmentDTO courseSegmentDTO = (CourseSegmentDTO) h0.e0(i14, list3);
            if (courseSegmentDTO != null) {
                GeoPointDTO geoPointDTO4 = (GeoPointDTO) h0.n0(list4);
                double dDoubleValue = (geoPointDTO4 == null || (d15 = geoPointDTO4.distance) == null) ? 0.0d : d15.doubleValue();
                GeoPointDTO geoPointDTO5 = (GeoPointDTO) h0.d0(list4);
                double dDoubleValue2 = dDoubleValue - ((geoPointDTO5 == null || (d14 = geoPointDTO5.distance) == null) ? 0.0d : d14.doubleValue());
                if (dDoubleValue2 < 0.0d) {
                    dDoubleValue2 = 0.0d;
                }
                courseSegmentDTO.h(Double.valueOf(dDoubleValue2));
            }
            i14 = i17;
        }
    }

    public static final ArrayList b(List list, i.b bVar) {
        Double d14;
        Double d15;
        Double d16;
        Double d17;
        list.getClass();
        bVar.getClass();
        ArrayList arrayList = new ArrayList();
        List list2 = (List) h0.d0(list);
        GeoPointDTO geoPointDTO = list2 != null ? (GeoPointDTO) h0.d0(list2) : null;
        arrayList.add(new f((geoPointDTO == null || (d17 = geoPointDTO.latitude) == null) ? 0.0d : d17.doubleValue(), (geoPointDTO == null || (d16 = geoPointDTO.longitude) == null) ? 0.0d : d16.doubleValue(), bVar));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GeoPointDTO geoPointDTO2 = (GeoPointDTO) h0.n0((List) it.next());
            arrayList.add(new f((geoPointDTO2 == null || (d15 = geoPointDTO2.latitude) == null) ? 0.0d : d15.doubleValue(), (geoPointDTO2 == null || (d14 = geoPointDTO2.longitude) == null) ? 0.0d : d14.doubleValue(), bVar));
        }
        return arrayList;
    }

    public static final i.b c(ArrayList arrayList, e eVar) {
        eVar.getClass();
        GeoPointDTO geoPointDTOD = eVar.D();
        i.b bVarH = eVar.h();
        i.b bVar = i.b.WGS84;
        if (bVarH != bVar) {
            return eVar.h();
        }
        if (geoPointDTOD == null) {
            if (arrayList.isEmpty()) {
                return bVar;
            }
            double d14 = ((LatLng) arrayList.get(0)).latitude;
            double d15 = ((LatLng) arrayList.get(0)).longitude;
            s20.b bVar2 = s20.b.f156004a;
            return m.d(d14, d15);
        }
        i.b bVarH2 = eVar.h();
        if (bVarH2 != null) {
            return bVarH2;
        }
        Double d16 = geoPointDTOD.latitude;
        double dDoubleValue = d16 != null ? d16.doubleValue() : 0.0d;
        Double d17 = geoPointDTOD.longitude;
        double dDoubleValue2 = d17 != null ? d17.doubleValue() : 0.0d;
        s20.b bVar3 = s20.b.f156004a;
        return m.d(dDoubleValue, dDoubleValue2);
    }

    public static final fn0.a d(fn0.b bVar) {
        bVar.getClass();
        return new fn0.a(bVar.getTypeKey(), bVar.getGeohash(), lb2.b.a(bVar.getLat()), lb2.b.a(bVar.getLon()), bVar.getLastReportedDateTime(), bVar.getConfirmCount());
    }

    public static final void e(List list, e eVar) {
        Double d14;
        Double d15;
        eVar.getClass();
        list.getClass();
        GeoPointDTO geoPointDTO = (GeoPointDTO) h0.d0(list);
        eVar.J0(geoPointDTO);
        eVar.geoPoints = list;
        double dDoubleValue = 0.0d;
        double dDoubleValue2 = (geoPointDTO == null || (d15 = geoPointDTO.latitude) == null) ? 0.0d : d15.doubleValue();
        if (geoPointDTO != null && (d14 = geoPointDTO.longitude) != null) {
            dDoubleValue = d14.doubleValue();
        }
        s20.b bVar = s20.b.f156004a;
        eVar.g0(m.d(dDoubleValue2, dDoubleValue));
        t20.f.a(list, eVar);
        boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
        d.f156005a.getClass();
        eVar.intervalMarkers = d.f(list, zY);
    }

    public static final void f(List list, e eVar) {
        Object next;
        ArrayList<g> arrayListK = eVar.k();
        if (arrayListK != null) {
            for (g gVar : arrayListK) {
                Double distance = gVar.getDistance();
                if (distance != null) {
                    double dDoubleValue = distance.doubleValue();
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            Double d14 = ((GeoPointDTO) next).distance;
                            double dAbs = Math.abs((d14 != null ? d14.doubleValue() : 0.0d) - dDoubleValue);
                            do {
                                Object next2 = it.next();
                                Double d15 = ((GeoPointDTO) next2).distance;
                                double dAbs2 = Math.abs((d15 != null ? d15.doubleValue() : 0.0d) - dDoubleValue);
                                if (Double.compare(dAbs, dAbs2) > 0) {
                                    next = next2;
                                    dAbs = dAbs2;
                                }
                            } while (it.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    GeoPointDTO geoPointDTO = (GeoPointDTO) next;
                    if (geoPointDTO != null) {
                        Double d16 = geoPointDTO.latitude;
                        if (d16 != null) {
                            gVar.lat = Double.valueOf(d16.doubleValue());
                        }
                        Double d17 = geoPointDTO.longitude;
                        if (d17 != null) {
                            gVar.lon = Double.valueOf(d17.doubleValue());
                        }
                        Double d18 = geoPointDTO.distance;
                        if (d18 != null) {
                            gVar.o(Double.valueOf(d18.doubleValue()));
                        }
                        Double d19 = geoPointDTO.elevation;
                        if (d19 != null) {
                            double dDoubleValue2 = d19.doubleValue();
                            gVar.elevation = null;
                            gVar.derivedElevation = Double.valueOf(dDoubleValue2);
                        }
                    }
                }
            }
        }
    }
}
