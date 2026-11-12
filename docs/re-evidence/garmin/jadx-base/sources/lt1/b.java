package lt1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.maps.model.LatLng;
import d53.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lr2.o;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p13.k0;
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llt1/b;", "", "<init>", "()V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f114858a = new b();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f114859a;

        static {
            int[] iArr = new int[com.garmin.android.library.mapsdkadapter.i.d.values().length];
            try {
                iArr[com.garmin.android.library.mapsdkadapter.i.d.GOOGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f114859a = iArr;
        }
    }

    private b() {
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:56:0x0131  */
    /* JADX WARN: Code duplicated, block: B:72:0x0170  */
    /* JADX WARN: Code duplicated, block: B:76:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00dc A[SYNTHETIC] */
    public static le2.d a(b bVar, Context context, qs1.d dVar, List list, Map map, int i14) {
        Map map2;
        float fIntValue;
        ArrayList arrayList;
        Iterator it;
        i53.c cVarE;
        ArrayList arrayList2;
        ke2.b bVar2;
        double d14;
        List list2 = (i14 & 4) != 0 ? null : list;
        if ((i14 & 8) != 0) {
            map2 = k0.f134949a;
            map2.getClass();
        } else {
            map2 = map;
        }
        bVar.getClass();
        context.getClass();
        dVar.getClass();
        String courseWKT = dVar.getCourseWKT();
        Long curatedCourseId = dVar.getCuratedCourseId();
        Float f14 = (Float) map2.get(Long.valueOf(curatedCourseId != null ? curatedCourseId.longValue() : -1L));
        if (f14 != null) {
            fIntValue = f14.floatValue();
        } else {
            Integer courseDifficulty = dVar.getCourseDifficulty();
            fIntValue = 10.0f - (courseDifficulty != null ? courseDifficulty.intValue() : 0);
        }
        float f15 = fIntValue;
        us1.h.a aVar = us1.h.f172403e;
        Integer courseDifficulty2 = dVar.getCourseDifficulty();
        aVar.getClass();
        us1.h hVarA = us1.h.a.a(courseDifficulty2);
        String strG0 = courseWKT != null ? w.g0(w.c0(courseWKT, "LINESTRING (", courseWKT), ")") : null;
        List listW = strG0 != null ? w.W(strG0, new String[]{","}) : null;
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList(y.r(list2, 10));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(ke2.c.b((LatLng) it3.next()));
            }
            cVarE = i53.a.e(arrayList3);
            if (cVarE == null) {
                if (listW != null) {
                    return new le2.d(0L, null, null, 0, null, 0, 0.0f, 127, null);
                }
                arrayList = new ArrayList();
                it = listW.iterator();
                while (it.hasNext()) {
                    List listW2 = w.W((String) it.next(), new String[]{StringUtils.SPACE});
                    arrayList2 = new ArrayList();
                    for (Object obj : listW2) {
                        if (!w.J((String) obj)) {
                            arrayList2.add(obj);
                        }
                    }
                    if (arrayList2.size() == 2) {
                        d14 = Double.parseDouble((String) arrayList2.get(1));
                        double d15 = Double.parseDouble((String) arrayList2.get(0));
                        if (zf.b.D(Double.valueOf(d14)) || !zf.b.D(Double.valueOf(d15))) {
                            bVar2 = null;
                        } else {
                            bVar2 = new ke2.b(d14, d15, null, 4, null);
                        }
                    } else {
                        bVar2 = null;
                    }
                    if (bVar2 != null) {
                        arrayList.add(bVar2);
                    }
                }
                cVarE = i53.a.e(arrayList);
            }
        } else {
            if (listW != null) {
                return new le2.d(0L, null, null, 0, null, 0, 0.0f, 127, null);
            }
            arrayList = new ArrayList();
            it = listW.iterator();
            while (it.hasNext()) {
                List listW3 = w.W((String) it.next(), new String[]{StringUtils.SPACE});
                arrayList2 = new ArrayList();
                while (r8.hasNext()) {
                    if (!w.J((String) obj)) {
                        arrayList2.add(obj);
                    }
                }
                if (arrayList2.size() == 2) {
                    d14 = Double.parseDouble((String) arrayList2.get(1));
                    double d16 = Double.parseDouble((String) arrayList2.get(0));
                    if (zf.b.D(Double.valueOf(d14))) {
                        bVar2 = null;
                    } else {
                        bVar2 = null;
                    }
                } else {
                    bVar2 = null;
                }
                if (bVar2 != null) {
                    arrayList.add(bVar2);
                }
            }
            cVarE = i53.a.e(arrayList);
        }
        i53.c cVar = cVarE;
        Long curatedCourseId2 = dVar.getCuratedCourseId();
        long jLongValue = curatedCourseId2 != null ? curatedCourseId2.longValue() : -1L;
        int i15 = R.color.gray_60_static;
        int color = context.getColor(hVarA != null ? hVarA.f172409c : R.color.gray_60_static);
        if (hVarA != null) {
            i15 = hVarA.f172410d;
        }
        return new le2.d(jLongValue, cVar, new o(6), color, new o(7), context.getColor(i15), f15);
    }
}
