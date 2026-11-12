package s30;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.library.mapsdkadapter.i;
import com.garmin.android.library.mapsdkadapter.o;
import com.garmin.android.library.mapsdkadapter.p;
import com.google.android.gms.maps.model.LatLng;
import ie2.j;
import j23.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.j0;
import p13.x;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\n\u000bB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Ls30/c;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/garmin/android/library/mapsdkadapter/i;", "map", "Ls30/b;", "config", "<init>", "(Landroid/content/Context;Lcom/garmin/android/library/mapsdkadapter/i;Ls30/b;)V", "a", "b", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f156412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s30.b f156413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f156414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f156415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f156416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<com.garmin.android.library.mapsdkadapter.f> f156417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f156418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap<Integer, Bitmap> f156419h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f156420i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f156421j;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ls30/c$a;", "", "", "zoom", "", "latitude", "<init>", "(FD)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f156422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f156423b;

        public a(float f14, double d14) {
            this.f156422a = f14;
            this.f156423b = d14;
        }
    }

    static {
        new b(null);
    }

    public c(Context context, i iVar, s30.b bVar) {
        context.getClass();
        iVar.getClass();
        bVar.getClass();
        this.f156412a = iVar;
        this.f156413b = bVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.f156414c = applicationContext;
        this.f156415d = new ArrayList();
        this.f156416e = new ArrayList();
        j0 j0Var = j0.f134944a;
        this.f156417f = j0Var;
        this.f156419h = new HashMap<>();
        this.f156420i = j0Var;
        this.f156421j = Integer.MIN_VALUE;
    }

    public final f a() {
        double d14;
        int i14;
        LatLng latLng;
        f.a aVar = f.f156429h;
        List<com.garmin.android.library.mapsdkadapter.f> list = this.f156417f;
        s30.b bVar = this.f156413b;
        double d15 = bVar.f156410k;
        float f14 = bVar.f156411l;
        aVar.getClass();
        list.getClass();
        if (list.size() < 2) {
            return null;
        }
        d.f156424a.getClass();
        List listB = d.b(list);
        com.garmin.android.library.mapsdkadapter.f fVar = (com.garmin.android.library.mapsdkadapter.f) h0.b0(listB);
        LatLng latLng2 = fVar.f50283a;
        double dCos = Math.cos(Math.toRadians(t.c(latLng2.latitude, -85.0d, 85.0d))) * 111320.0d;
        double dMax = Math.max(64.0d, d15);
        HashMap map = new HashMap();
        int size = listB.size() - 1;
        double d16 = 0.0d;
        int i15 = 0;
        while (i15 < size) {
            com.garmin.android.library.mapsdkadapter.f fVar2 = (com.garmin.android.library.mapsdkadapter.f) listB.get(i15);
            int i16 = i15 + 1;
            com.garmin.android.library.mapsdkadapter.f fVar3 = (com.garmin.android.library.mapsdkadapter.f) listB.get(i16);
            List list2 = listB;
            double dB = fVar2.b(fVar3);
            if (dB < 0.1d) {
                latLng = latLng2;
                d14 = dCos;
                d15 = d15;
                i14 = i16;
            } else {
                LatLng latLng3 = fVar2.f50283a;
                d14 = dCos;
                double d17 = latLng3.longitude;
                double d18 = latLng2.longitude;
                double d19 = (d17 - d18) * d14;
                i14 = i16;
                double d24 = latLng3.latitude;
                double d25 = fVar.f50283a.latitude;
                double d26 = (d24 - d25) * 111132.0d;
                LatLng latLng4 = fVar3.f50283a;
                double d27 = (latLng4.longitude - d18) * d14;
                double d28 = (latLng4.latitude - d25) * 111132.0d;
                d.f156424a.getClass();
                double d29 = d27;
                f.c cVar = new f.c(d19, d26, d29, d28, d.a(fVar2, fVar3), d16, dB);
                int iCeil = (int) Math.ceil(dB / dMax);
                if (iCeil < 1) {
                    iCeil = 1;
                }
                if (iCeil >= 0) {
                    int i17 = 0;
                    while (true) {
                        LatLng latLng5 = latLng2;
                        double d34 = ((double) i17) / ((double) iCeil);
                        double d35 = d29;
                        double d36 = d19;
                        double dB2 = o2.c.b(d35, d36, d34, d19);
                        d29 = d35;
                        d19 = d36;
                        double dB3 = o2.c.b(d28, d26, d34, d26);
                        int iFloor = (int) Math.floor((dB2 - d15) / dMax);
                        int iFloor2 = (int) Math.floor((dB2 + d15) / dMax);
                        int iFloor3 = (int) Math.floor((dB3 - d15) / dMax);
                        latLng = latLng5;
                        int iFloor4 = (int) Math.floor((dB3 + d15) / dMax);
                        if (iFloor <= iFloor2) {
                            while (true) {
                                if (iFloor3 <= iFloor4) {
                                    int i18 = iFloor3;
                                    while (true) {
                                        Long lValueOf = Long.valueOf((((long) iFloor) << 32) | (((long) i18) & 4294967295L));
                                        Object arrayList = map.get(lValueOf);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            map.put(lValueOf, arrayList);
                                        }
                                        List list3 = (List) arrayList;
                                        if (h0.n0(list3) != cVar) {
                                            list3.add(cVar);
                                        }
                                        if (i18 == iFloor4) {
                                            break;
                                        }
                                        i18++;
                                    }
                                }
                                if (iFloor == iFloor2) {
                                    break;
                                }
                                iFloor++;
                                i14 = i14;
                                d15 = d15;
                            }
                        } else {
                            d15 = d15;
                            i14 = i14;
                        }
                        if (i17 == iCeil) {
                            break;
                        }
                        i17++;
                        i14 = i14;
                        latLng2 = latLng;
                        d15 = d15;
                    }
                } else {
                    latLng = latLng2;
                    d15 = d15;
                    i14 = i14;
                }
                d16 += dB;
            }
            i15 = i14;
            listB = list2;
            latLng2 = latLng;
            d15 = d15;
            dCos = d14;
            fVar = fVar;
        }
        LatLng latLng6 = latLng2;
        return new f(latLng6.latitude, latLng6.longitude, dCos, d15, dMax, f14, map, null);
    }

    public final void b() {
        ArrayList arrayList = this.f156415d;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f156412a.n((j) it.next());
        }
        arrayList.clear();
        this.f156416e.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r15v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r37v0 */
    /* JADX WARN: Type inference failed for: r37v1 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r50v0 */
    /* JADX WARN: Type inference failed for: r50v5 */
    /* JADX WARN: Type inference failed for: r8v11, types: [ie2.j] */
    public final void c() {
        int i14;
        Object obj;
        double d14;
        double d15;
        List list;
        e eVar;
        s30.a aVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i15;
        com.garmin.android.library.mapsdkadapter.f fVar;
        i iVar = this.f156412a;
        if (iVar.getF50241b()) {
            ie2.c cameraState = iVar.getCameraState();
            a aVar2 = new a(cameraState != null ? (float) cameraState.f93114d : iVar.getF50270z(), ((cameraState == null || (fVar = cameraState.f93111a) == null) ? iVar.getF50269y().f50283a : fVar.f50283a).latitude);
            if (this.f156417f.size() >= 2) {
                s30.b bVar = this.f156413b;
                float f14 = bVar.f156404e;
                float f15 = aVar2.f156422a;
                if (f15 >= f14 && d(bVar.f156400a) != null) {
                    int iC = MathKt.c(f15 / 0.5f);
                    int i16 = 1;
                    if (iC == this.f156421j) {
                        i14 = 1;
                    } else {
                        d.f156424a.getClass();
                        double d16 = aVar2.f156423b;
                        double d17 = f15;
                        double dCos = (Math.cos(Math.toRadians(t.c(d16, -85.0d, 85.0d))) * 156543.03392d) / Math.pow(2.0d, d17);
                        double dMax = Math.max(1.0d, ((Math.cos(Math.toRadians(t.c(d16, -85.0d, 85.0d))) * 156543.03392d) / Math.pow(2.0d, d17)) * ((double) this.f156413b.f156403d));
                        s30.b bVar2 = this.f156413b;
                        double dC = t.c(((double) bVar2.f156409j) * dCos, 1.0d, bVar2.f156410k);
                        List<com.garmin.android.library.mapsdkadapter.f> list2 = this.f156417f;
                        int i17 = this.f156413b.f156406g;
                        f fVar2 = this.f156418g;
                        list2.getClass();
                        if (list2.size() < 2 || dMax <= 0.0d || i17 <= 0) {
                            i14 = 1;
                            obj = j0.f134944a;
                        } else {
                            List listB = d.b(list2);
                            int size = listB.size() - 1;
                            double dB = 0.0d;
                            int i18 = 0;
                            while (i18 < size) {
                                com.garmin.android.library.mapsdkadapter.f fVar3 = (com.garmin.android.library.mapsdkadapter.f) listB.get(i18);
                                i18++;
                                dB += (double) fVar3.b((com.garmin.android.library.mapsdkadapter.f) listB.get(i18));
                                i16 = i16;
                            }
                            int i19 = i16;
                            if (dB < dMax) {
                                i14 = i19;
                                obj = j0.f134944a;
                            } else {
                                double dMax2 = Math.max(dMax, dB / ((double) i17));
                                i.b bVar3 = ((com.garmin.android.library.mapsdkadapter.f) h0.b0(listB)).f50284b;
                                List list3 = listB;
                                ArrayList arrayList3 = new ArrayList(((int) (dB / dMax2)) + i19);
                                double d18 = dMax2 / 2.0d;
                                int size2 = list3.size() - i19;
                                double d19 = 0.0d;
                                int i24 = 0;
                                while (i24 < size2) {
                                    int i25 = i19;
                                    com.garmin.android.library.mapsdkadapter.f fVar4 = (com.garmin.android.library.mapsdkadapter.f) list3.get(i24);
                                    int i26 = i24 + 1;
                                    double d24 = d18;
                                    com.garmin.android.library.mapsdkadapter.f fVar5 = (com.garmin.android.library.mapsdkadapter.f) list3.get(i26);
                                    i.b bVar4 = bVar3;
                                    double dB2 = fVar4.b(fVar5);
                                    if (dB2 < 0.1d) {
                                        d18 = d24;
                                    } else {
                                        float fA = d.a(fVar4, fVar5);
                                        while (true) {
                                            d14 = d24;
                                            d15 = d19 + dB2;
                                            if (d14 > d15) {
                                                break;
                                            }
                                            double d25 = (d14 - d19) / dB2;
                                            LatLng latLng = fVar4.f50283a;
                                            double d26 = dMax2;
                                            double d27 = latLng.latitude;
                                            LatLng latLng2 = fVar5.f50283a;
                                            int i27 = i26;
                                            double d28 = dC;
                                            double dB3 = o2.c.b(latLng2.latitude, d27, d25, d27);
                                            double d29 = latLng.longitude;
                                            int i28 = i27;
                                            double d34 = latLng2.longitude - d29;
                                            if (d34 > 180.0d) {
                                                d34 -= 360.0d;
                                            } else if (d34 < -180.0d) {
                                                d34 += 360.0d;
                                            }
                                            double d35 = (d34 * d25) + d29;
                                            if (d35 > 180.0d) {
                                                d35 -= 360.0d;
                                            } else if (d35 < -180.0d) {
                                                d35 += 360.0d;
                                            }
                                            com.garmin.android.library.mapsdkadapter.f fVar6 = new com.garmin.android.library.mapsdkadapter.f(dB3, d35, bVar4);
                                            double d36 = d14 + d26;
                                            if (fVar2 != null) {
                                                d24 = d36;
                                                double d37 = fVar2.f156434e;
                                                LatLng latLng3 = fVar6.f50283a;
                                                double d38 = fVar2.f156432c * (latLng3.longitude - fVar2.f156431b);
                                                double d39 = (latLng3.latitude - fVar2.f156430a) * 111132.0d;
                                                Map<Long, List<f.c>> map = fVar2.f156436g;
                                                f.a aVar3 = f.f156429h;
                                                int iFloor = (int) Math.floor(d38 / d37);
                                                int iFloor2 = (int) Math.floor(d39 / d37);
                                                aVar3.getClass();
                                                list = list3;
                                                List<f.c> list4 = map.get(Long.valueOf((((long) iFloor2) & 4294967295L) | (((long) iFloor) << 32)));
                                                if (list4 == null) {
                                                    e.f156425c.getClass();
                                                    eVar = e.f156426d;
                                                    fVar5 = fVar5;
                                                    i28 = i28;
                                                } else {
                                                    double d44 = fVar2.f156433d;
                                                    if (d28 <= d44) {
                                                        d44 = d28;
                                                    }
                                                    double d45 = d44 * d44;
                                                    double dMax3 = Math.max(150.0d, d44 * 4.0d);
                                                    Iterator<f.c> it = list4.iterator();
                                                    ?? r14 = 0;
                                                    ?? r15 = 0;
                                                    while (true) {
                                                        if (!it.hasNext()) {
                                                            fVar5 = fVar5;
                                                            i28 = i28;
                                                            break;
                                                        }
                                                        fVar5 = fVar5;
                                                        f.c next = it.next();
                                                        dMax3 = dMax3;
                                                        double d46 = next.f156441c;
                                                        double d47 = next.f156439a;
                                                        double d48 = d46 - d47;
                                                        double d49 = next.f156442d;
                                                        double d54 = next.f156440b;
                                                        double d55 = d49 - d54;
                                                        double d56 = (d55 * d55) + (d48 * d48);
                                                        double dC2 = d56 <= 0.0d ? 0.0d : t.c((((d39 - d54) * d55) + ((d38 - d47) * d48)) / d56, 0.0d, 1.0d);
                                                        double d57 = d38 - ((d48 * dC2) + d47);
                                                        double d58 = d39 - ((d55 * dC2) + d54);
                                                        i28 = i28;
                                                        ?? r37 = r14;
                                                        ?? r54 = r15;
                                                        f.b bVar5 = new f.b((d58 * d58) + (d57 * d57), dC2);
                                                        if (bVar5.f156437a <= d45) {
                                                            double d59 = (bVar5.f156438b * next.f156445g) + next.f156444f;
                                                            if (Math.abs(d59 - d14) >= dMax3) {
                                                                r14 = d59 < d14 ? i25 : r37 == true ? 1 : 0;
                                                                float f16 = next.f156443e;
                                                                float f17 = fVar2.f156435f;
                                                                float fAbs = Math.abs(fA - f16) % 360.0f;
                                                                if (fAbs > 180.0f) {
                                                                    fAbs = 360.0f - fAbs;
                                                                }
                                                                r15 = fAbs >= 180.0f - f17 ? i25 : r54 == true ? 1 : 0;
                                                                if (r14 != 0 && r15 != 0) {
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        r14 = r37 == true ? 1 : 0;
                                                        r15 = r54 == true ? 1 : 0;
                                                    }
                                                    eVar = new e(r14, r15);
                                                }
                                                if (eVar == null) {
                                                }
                                                if (!eVar.f156427a && ((aVar = (s30.a) h0.n0(arrayList3)) == null || aVar.f156397a.b(fVar6) >= 0.5d * d26)) {
                                                    arrayList3.add(new s30.a(fVar6, fA, eVar.f156428b));
                                                }
                                                list3 = list;
                                                i26 = i28;
                                                fVar5 = fVar5;
                                                dMax2 = d26;
                                                dC = d28;
                                            } else {
                                                fVar5 = fVar5;
                                                i28 = i28;
                                                d24 = d36;
                                                list = list3;
                                            }
                                            e.f156425c.getClass();
                                            eVar = e.f156426d;
                                            if (!eVar.f156427a) {
                                                arrayList3.add(new s30.a(fVar6, fA, eVar.f156428b));
                                            }
                                            list3 = list;
                                            i26 = i28;
                                            fVar5 = fVar5;
                                            dMax2 = d26;
                                            dC = d28;
                                        }
                                        d19 = d15;
                                        d18 = d14;
                                    }
                                    list3 = list3;
                                    i19 = i25;
                                    i24 = i26;
                                    bVar3 = bVar4;
                                    dMax2 = dMax2;
                                    dC = dC;
                                }
                                i14 = i19;
                                obj = arrayList3;
                            }
                        }
                        this.f156420i = obj;
                        this.f156421j = iC;
                    }
                    com.garmin.android.library.mapsdkadapter.e a14 = iVar.getA();
                    com.garmin.android.library.mapsdkadapter.e.f50271c.getClass();
                    com.garmin.android.library.mapsdkadapter.e eVarG = s.g(a14, com.garmin.android.library.mapsdkadapter.e.f50272d) ? null : a14.g(this.f156413b.f156408i + 1.0f);
                    ?? r16 = this.f156420i;
                    ?? r17 = r16;
                    if (eVarG != null) {
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj2 : r16) {
                            if (eVarG.b(((s30.a) obj2).f156397a)) {
                                arrayList4.add(obj2);
                            }
                        }
                        r17 = arrayList4;
                    }
                    int i29 = this.f156413b.f156405f;
                    ?? r18 = r17;
                    if (i29 > 0 && r17.size() > i29) {
                        double size3 = ((double) r17.size()) / ((double) i29);
                        ArrayList arrayList5 = new ArrayList(i29);
                        for (int i30 = 0; i30 < i29; i30++) {
                            int i34 = (int) (((double) i30) * size3);
                            int size4 = r17.size() - 1;
                            if (i34 > size4) {
                                r18 = r17;
                                i34 = size4;
                            } else {
                                r18 = r17;
                            }
                            arrayList5.add((s30.a) r17.get(i34));
                        }
                        r18 = r17;
                        r18 = arrayList5;
                    }
                    r18 = r17;
                    int size5 = r18.size();
                    int i35 = 0;
                    while (true) {
                        arrayList = this.f156416e;
                        arrayList2 = this.f156415d;
                        if (i35 >= size5) {
                            break;
                        }
                        s30.a aVar4 = (s30.a) r18.get(i35);
                        if (i35 < arrayList2.size()) {
                            ?? r19 = (j) arrayList2.get(i35);
                            com.garmin.android.library.mapsdkadapter.f fVar7 = aVar4.f156397a;
                            boolean z14 = aVar4.f156399c;
                            r19.g(fVar7);
                            r19.setRotation(e(aVar4));
                            r19.setVisible(i14);
                            if (((Boolean) arrayList.get(i35)).booleanValue() != z14) {
                                j jVar = (j) arrayList2.get(i35);
                                s30.b bVar6 = this.f156413b;
                                jVar.f(d(z14 ? bVar6.f156401b : bVar6.f156400a));
                                arrayList.set(i35, Boolean.valueOf(z14));
                            }
                            i15 = 1;
                        } else {
                            p pVar = new p();
                            com.garmin.android.library.mapsdkadapter.f fVar8 = aVar4.f156397a;
                            boolean z15 = aVar4.f156399c;
                            pVar.d(fVar8);
                            s30.b bVar7 = this.f156413b;
                            pVar.c(d(z15 ? bVar7.f156401b : bVar7.f156400a));
                            float fE = e(aVar4);
                            o oVar = pVar.f50327a;
                            oVar.f50310b = fE;
                            i15 = 1;
                            oVar.f50316h = true;
                            pVar.a(0.5f, 0.5f);
                            float f18 = this.f156413b.f156407h;
                            o oVar2 = pVar.f50327a;
                            oVar2.f50311c = f18;
                            oVar2.f50315g = false;
                            oVar2.f50322n = "course_direction_arrow";
                            j jVarX = iVar.x(pVar);
                            jVarX.a(this.f156413b.f156407h);
                            arrayList2.add(jVarX);
                            arrayList.add(Boolean.valueOf(z15));
                        }
                        i35++;
                        i14 = i15;
                    }
                    while (arrayList2.size() > r18.size()) {
                        iVar.n((j) arrayList2.remove(x.j(arrayList2)));
                        arrayList.remove(x.j(arrayList));
                    }
                    return;
                }
            }
            b();
            this.f156421j = Integer.MIN_VALUE;
        }
    }

    public final Bitmap d(int i14) {
        Integer numValueOf = Integer.valueOf(i14);
        HashMap<Integer, Bitmap> map = this.f156419h;
        Bitmap bitmap = map.get(numValueOf);
        if (bitmap != null) {
            if (bitmap.isRecycled()) {
                bitmap = null;
            }
            if (bitmap != null) {
                return bitmap;
            }
        }
        Drawable drawableA = j.a.a(this.f156414c, i14);
        if (drawableA == null) {
            return null;
        }
        if (drawableA instanceof BitmapDrawable) {
            Bitmap bitmap2 = ((BitmapDrawable) drawableA).getBitmap();
            map.put(Integer.valueOf(i14), bitmap2);
            return bitmap2;
        }
        Integer numValueOf2 = Integer.valueOf(drawableA.getIntrinsicWidth());
        if (numValueOf2.intValue() <= 0) {
            numValueOf2 = null;
        }
        if (numValueOf2 != null) {
            int iIntValue = numValueOf2.intValue();
            Integer numValueOf3 = Integer.valueOf(drawableA.getIntrinsicHeight());
            if (numValueOf3.intValue() <= 0) {
                numValueOf3 = null;
            }
            if (numValueOf3 != null) {
                int iIntValue2 = numValueOf3.intValue();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, iIntValue2, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.getClass();
                Drawable drawableMutate = drawableA.mutate();
                drawableMutate.setBounds(0, 0, iIntValue, iIntValue2);
                drawableMutate.draw(new Canvas(bitmapCreateBitmap));
                map.put(Integer.valueOf(i14), bitmapCreateBitmap);
                return bitmapCreateBitmap;
            }
        }
        return null;
    }

    public final float e(s30.a aVar) {
        float f14 = (aVar.f156398b + this.f156413b.f156402c) % 360.0f;
        return (f14 == 0.0f || Math.signum(f14) == Math.signum(360.0f)) ? f14 : f14 + 360.0f;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Ls30/c$b;", "", "<init>", "()V", "", "TAG_DIRECTION_ARROW", "Ljava/lang/String;", "", "NO_ZOOM_BUCKET", "I", "", "FULL_CIRCLE_DEGREES", "F", "", "MIN_SHARED_LINE_TOLERANCE_METERS", "D", "ZOOM_BUCKET_STEP", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ c(Context context, i iVar, s30.b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
        s30.b bVar2;
        if ((i14 & 4) != 0) {
            bVar2 = new s30.b(0, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0d, 0.0f, 4095, null);
        } else {
            bVar2 = bVar;
        }
        this(context, iVar, bVar2);
    }
}
