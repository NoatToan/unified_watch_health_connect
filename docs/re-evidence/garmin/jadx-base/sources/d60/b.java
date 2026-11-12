package d60;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.nutrition.model.HydrationUserPreferenceDTO;
import com.garmin.android.apps.connectmobile.nutrition.model.NutritionUserPreferenceDTO;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import okhttp3.HttpUrl;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ld60/b;", "Lcom/garmin/android/apps/connectmobile/f0;", "<init>", "()V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements com.garmin.android.apps.connectmobile.f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f57806c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f57807a = gt2.c.b(a2.COURSES.f28756a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.t f57808b = o13.m.b(new d4.h(4));

    public static List c(int i14, List list, List list2) {
        list.getClass();
        list2.getClass();
        if (!list2.isEmpty()) {
            if (list.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ((com.garmin.android.apps.connectmobile.courses.model.d) it.next()).isFavorite = true;
                }
                return list2;
            }
            long j8 = i14;
            ArrayList arrayList = new ArrayList();
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                com.garmin.android.apps.connectmobile.courses.model.d dVar = (com.garmin.android.apps.connectmobile.courses.model.d) it3.next();
                if (j8 == dVar.userProfileId) {
                    Iterator it4 = list.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            com.garmin.android.apps.connectmobile.courses.model.d dVar2 = (com.garmin.android.apps.connectmobile.courses.model.d) it4.next();
                            if (p005kotlin.jvm.internal.s.g(dVar2.courseId, dVar.courseId)) {
                                dVar2.isFavorite = true;
                                break;
                            }
                        }
                    }
                }
                dVar.isFavorite = true;
                arrayList.add(dVar);
            }
            if (!arrayList.isEmpty()) {
                list.addAll(arrayList);
            }
        }
        return list;
    }

    public static /* synthetic */ Object f(b bVar, String str, int i14, Double d14, Double d15, Boolean bool, v13.i iVar, int i15) {
        if ((i15 & 4) != 0) {
            d14 = null;
        }
        if ((i15 & 8) != 0) {
            d15 = null;
        }
        return bVar.d(str, i14, d14, d15, bool, iVar);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(String str, v13.c cVar) {
        h hVar;
        j61.i iVar;
        int i14;
        int i15;
        v2 v2Var;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i16 = hVar.f57857f;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                hVar.f57857f = i16 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objH = hVar.f57855d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = hVar.f57857f;
        j61.d dVar = null;
        if (i17 == 0) {
            o13.r.b(objH);
            hVar.f57852a = str;
            hVar.f57854c = 0;
            hVar.f57857f = 1;
            objH = ((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).h(hVar);
            if (objH != aVar) {
            }
            return aVar;
        }
        if (i17 == 1) {
            str = hVar.f57852a;
            o13.r.b(objH);
        } else {
            if (i17 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i15 = hVar.f57854c;
            iVar = hVar.f57853b;
            o13.r.b(objH);
        }
        v2Var = (v2) objH;
        if (!(v2Var instanceof v2.b)) {
            dVar = (j61.d) ((v2.b) v2Var).f47386a;
            i14 = i15;
            return new v2.b(new j61.e(iVar, dVar), i14, null, null, 12, null);
        }
        if (v2Var instanceof v2.a) {
            return v2Var;
        }
        u0.r();
        return null;
        v2 v2Var2 = (v2) objH;
        if (!(v2Var2 instanceof v2.b)) {
            if (v2Var2 instanceof v2.a) {
                return v2Var2;
            }
            u0.r();
            return null;
        }
        v2.b bVar = (v2.b) v2Var2;
        j61.i iVar2 = (j61.i) bVar.f47386a;
        int i18 = bVar.f47387b;
        if (iVar2 != null) {
            i iVar3 = new i(this, str, null);
            hVar.f57852a = null;
            hVar.f57853b = iVar2;
            hVar.f57854c = i18;
            hVar.f57857f = 2;
            Object objJ = com.garmin.android.apps.connectmobile.f0.J(this, iVar3, hVar);
            if (objJ != aVar) {
                objH = objJ;
                i15 = i18;
                iVar = iVar2;
                v2Var = (v2) objH;
                if (!(v2Var instanceof v2.b)) {
                    if (v2Var instanceof v2.a) {
                        return v2Var;
                    }
                    u0.r();
                    return null;
                }
                dVar = (j61.d) ((v2.b) v2Var).f47386a;
                i14 = i15;
            }
            return aVar;
        }
        iVar = iVar2;
        i14 = i18;
        return new v2.b(new j61.e(iVar, dVar), i14, null, null, 12, null);
    }

    public final d60.a b() {
        return (d60.a) this.f57808b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object d(String str, int i14, Double d14, Double d15, Boolean bool, v13.c cVar) {
        n nVar;
        o53.i0<List<com.garmin.android.apps.connectmobile.courses.model.d>> i0VarU;
        b bVar;
        ArrayList arrayListD1;
        Object objAwait;
        ArrayList arrayList;
        b bVar2;
        int i15 = i14;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i16 = nVar.f57906g;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                nVar.f57906g = i16 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object objAwait2 = nVar.f57904e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = nVar.f57906g;
        Logger logger = this.f57807a;
        try {
            try {
                if (i17 != 0) {
                    if (i17 == 1) {
                        o13.r.b(objAwait2);
                        ArrayList arrayListD2 = p13.h0.d1((Collection) objAwait2);
                        logger.debug("CoursesRepo - getMyCourses() -> event flow - SUCCESS =[" + arrayListD2 + "].");
                        return arrayListD2;
                    }
                    if (i17 == 2) {
                        i15 = nVar.f57903d;
                        bVar = nVar.f57901b;
                        i0VarU = nVar.f57900a;
                        o13.r.b(objAwait2);
                        arrayListD1 = p13.h0.d1((Collection) objAwait2);
                        nVar.f57900a = null;
                        nVar.f57901b = bVar;
                        nVar.f57902c = arrayListD1;
                        nVar.f57903d = i15;
                        nVar.f57906g = 3;
                        objAwait = i0VarU.await(nVar);
                        if (objAwait != aVar) {
                            b bVar3 = bVar;
                            arrayList = arrayListD1;
                            objAwait2 = objAwait;
                            bVar2 = bVar3;
                        }
                        return aVar;
                    }
                    if (i17 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i15 = nVar.f57903d;
                    arrayList = nVar.f57902c;
                    bVar2 = nVar.f57901b;
                    o13.r.b(objAwait2);
                    bVar2.getClass();
                    List listC = c(i15, arrayList, (List) objAwait2);
                    logger.debug("CoursesRepo - getMyCourses() -> SUCCESS =[" + listC + "].");
                    return listC;
                }
                o13.r.b(objAwait2);
                o53.i0<List<com.garmin.android.apps.connectmobile.courses.model.d>> i0VarN = b().N(str, d14, d15, null);
                if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                    nVar.f57903d = i15;
                    nVar.f57906g = 1;
                    objAwait2 = i0VarN.await(nVar);
                    if (objAwait2 == aVar) {
                    }
                    ArrayList arrayListD3 = p13.h0.d1((Collection) objAwait2);
                    logger.debug("CoursesRepo - getMyCourses() -> event flow - SUCCESS =[" + arrayListD3 + "].");
                    return arrayListD3;
                }
                i0VarU = b().u();
                nVar.f57900a = i0VarU;
                nVar.f57901b = this;
                nVar.f57903d = i15;
                nVar.f57906g = 2;
                objAwait2 = i0VarN.await(nVar);
                if (objAwait2 != aVar) {
                    bVar = this;
                    arrayListD1 = p13.h0.d1((Collection) objAwait2);
                    nVar.f57900a = null;
                    nVar.f57901b = bVar;
                    nVar.f57902c = arrayListD1;
                    nVar.f57903d = i15;
                    nVar.f57906g = 3;
                    objAwait = i0VarU.await(nVar);
                    if (objAwait != aVar) {
                        b bVar4 = bVar;
                        arrayList = arrayListD1;
                        objAwait2 = objAwait;
                        bVar2 = bVar4;
                        bVar2.getClass();
                        List listC2 = c(i15, arrayList, (List) objAwait2);
                        logger.debug("CoursesRepo - getMyCourses() -> SUCCESS =[" + listC2 + "].");
                        return listC2;
                    }
                }
                return aVar;
            } catch (HttpException e4) {
                logger.error(o2.c.e(e4.code(), "CoursesRepo - getMyCourses() -> event flow - server error response code=[", "] message=[", e4.message(), "]."));
                return null;
            } catch (Throwable th3) {
                logger.error("CoursesRepo - getMyCourses() -> event flow - server error message=[" + th3 + "].");
                return null;
            }
        } catch (HttpException e14) {
            logger.error(o2.c.e(e14.code(), "CoursesRepo - getMyCourses() -> server error response code=[", "] message=[", e14.message(), "]."));
            return null;
        } catch (Throwable th4) {
            logger.error("CoursesRepo - getMyCourses() -> server error message=[" + th4 + "].");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:49:0x0104  */
    /* JADX WARN: Code duplicated, block: B:51:0x0108 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x0109  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c7, code lost:
    
        if (r0 == r9) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Integer num, Double d14, Double d15, Double d16, Integer num2, v13.c cVar) {
        p pVar;
        HttpUrl httpUrl;
        w01.b bVar;
        int i14;
        v2 v2Var;
        q22.b bVar2;
        q22.b bVar3;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i15 = pVar.f57925g;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                pVar.f57925g = i15 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        p pVar2 = pVar;
        Object objJ = pVar2.f57923e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = pVar2.f57925g;
        if (i16 == 0) {
            o13.r.b(objJ);
            r rVar = new r(this, num, d14, d15, d16, num2, null);
            pVar2.f57922d = 0;
            pVar2.f57925g = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, rVar, pVar2);
            if (objJ != aVar) {
            }
            return aVar;
        }
        if (i16 == 1) {
            o13.r.b(objJ);
        } else if (i16 == 2) {
            i14 = pVar2.f57922d;
            HttpUrl httpUrl2 = pVar2.f57920b;
            w01.b bVar4 = pVar2.f57919a;
            o13.r.b(objJ);
            bVar = bVar4;
            httpUrl = httpUrl2;
            v2Var = (v2) objJ;
            if (v2Var instanceof v2.b) {
                if (v2Var instanceof v2.a) {
                    return v2Var;
                }
                u0.r();
                return null;
            }
            bVar2 = ((HydrationUserPreferenceDTO) ((v2.b) v2Var).f47386a).f39577a;
            if (bVar2 == null) {
                bVar2 = q22.b.MILLILITER;
            }
            bVar3 = bVar2;
            s sVar = new s(this, null);
            pVar2.f57919a = bVar;
            pVar2.f57920b = httpUrl;
            pVar2.f57921c = bVar3;
            pVar2.f57922d = i14;
            pVar2.f57925g = 3;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, sVar, pVar2);
        } else {
            if (i16 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = pVar2.f57922d;
            bVar3 = pVar2.f57921c;
            httpUrl = pVar2.f57920b;
            bVar = pVar2.f57919a;
            o13.r.b(objJ);
        }
        HttpUrl httpUrl3 = httpUrl;
        int i17 = i14;
        q22.b bVar5 = bVar3;
        w01.b bVar6 = bVar;
        v2 v2Var2 = (v2) objJ;
        if (v2Var2 instanceof v2.b) {
            w01.e eVar = ((NutritionUserPreferenceDTO) ((v2.b) v2Var2).f47386a).f39579a;
            if (eVar == null) {
                eVar = w01.e.GRAMS;
            }
            return new v2.b(new w01.c(bVar6, eVar, bVar5, null, null, null, null, null, null, false, 1016, null), i17, httpUrl3, null, 8, null);
        }
        if (v2Var2 instanceof v2.a) {
            return v2Var2;
        }
        u0.r();
        return null;
        v2 v2Var3 = (v2) objJ;
        if (!(v2Var3 instanceof v2.b)) {
            if (v2Var3 instanceof v2.a) {
                return v2Var3;
            }
            u0.r();
            return null;
        }
        v2.b bVar7 = (v2.b) v2Var3;
        w01.b bVar8 = (w01.b) bVar7.f47386a;
        int i18 = bVar7.f47387b;
        HttpUrl httpUrl4 = bVar7.f47388c;
        q qVar = new q(this, null);
        pVar2.f57919a = bVar8;
        pVar2.f57920b = httpUrl4;
        pVar2.f57922d = i18;
        pVar2.f57925g = 2;
        Object objJ2 = com.garmin.android.apps.connectmobile.f0.J(this, qVar, pVar2);
        if (objJ2 != aVar) {
            httpUrl = httpUrl4;
            objJ = objJ2;
            bVar = bVar8;
            i14 = i18;
            v2Var = (v2) objJ;
            if (v2Var instanceof v2.b) {
                if (v2Var instanceof v2.a) {
                    return v2Var;
                }
                u0.r();
                return null;
            }
            bVar2 = ((HydrationUserPreferenceDTO) ((v2.b) v2Var).f47386a).f39577a;
            if (bVar2 == null) {
                bVar2 = q22.b.MILLILITER;
            }
            bVar3 = bVar2;
            s sVar2 = new s(this, null);
            pVar2.f57919a = bVar;
            pVar2.f57920b = httpUrl;
            pVar2.f57921c = bVar3;
            pVar2.f57922d = i14;
            pVar2.f57925g = 3;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, sVar2, pVar2);
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:55:0x0104  */
    /* JADX WARN: Code duplicated, block: B:58:0x010d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0110  */
    /* JADX WARN: Code duplicated, block: B:62:0x012f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0133 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x0134  */
    /* JADX WARN: Code duplicated, block: B:66:0x0139  */
    /* JADX WARN: Code duplicated, block: B:68:0x013d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x013e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object h(long j8, v13.c cVar) {
        t tVar;
        String str;
        int i14;
        w01.b bVar;
        int i15;
        int i16;
        long j14;
        int i17;
        v2 v2Var;
        q22.b bVar2;
        Object objJ;
        q22.b bVar3;
        w01.b bVar4;
        int i18;
        v2 v2Var2;
        w01.e eVar;
        boolean z14;
        long j15 = j8;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i19 = tVar.f57948h;
            if ((i19 & Integer.MIN_VALUE) != 0) {
                tVar.f57948h = i19 - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        Object objJ2 = tVar.f57946f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i24 = tVar.f57948h;
        if (i24 == 0) {
            o13.r.b(objJ2);
            v vVar = new v(this, j15, null);
            tVar.f57941a = j15;
            tVar.f57942b = 0;
            tVar.f57943c = 0;
            tVar.f57948h = 1;
            objJ2 = com.garmin.android.apps.connectmobile.f0.J(this, vVar, tVar);
            if (objJ2 != aVar) {
            }
            return aVar;
        }
        if (i24 == 1) {
            j15 = tVar.f57941a;
            o13.r.b(objJ2);
        } else {
            if (i24 == 2) {
                i16 = tVar.f57943c;
                i17 = tVar.f57942b;
                j14 = tVar.f57941a;
                bVar = tVar.f57944d;
                o13.r.b(objJ2);
                v2Var = (v2) objJ2;
                if (v2Var instanceof v2.b) {
                    if (v2Var instanceof v2.a) {
                        return v2Var;
                    }
                    u0.r();
                    return null;
                }
                bVar2 = ((HydrationUserPreferenceDTO) ((v2.b) v2Var).f47386a).f39577a;
                if (bVar2 == null) {
                    bVar2 = q22.b.MILLILITER;
                }
                w wVar = new w(this, null);
                tVar.f57944d = bVar;
                tVar.f57945e = bVar2;
                tVar.f57941a = j14;
                tVar.f57942b = i17;
                tVar.f57943c = i16;
                tVar.f57948h = 3;
                objJ = com.garmin.android.apps.connectmobile.f0.J(this, wVar, tVar);
                if (objJ != aVar) {
                    bVar3 = bVar2;
                    objJ2 = objJ;
                    bVar4 = bVar;
                }
                return aVar;
            }
            if (i24 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i16 = tVar.f57943c;
            i17 = tVar.f57942b;
            q22.b bVar5 = tVar.f57945e;
            w01.b bVar6 = tVar.f57944d;
            o13.r.b(objJ2);
            bVar4 = bVar6;
            bVar3 = bVar5;
        }
        i18 = i17;
        v2Var2 = (v2) objJ2;
        if (v2Var2 instanceof v2.b) {
            if (v2Var2 instanceof v2.a) {
                return v2Var2;
            }
            u0.r();
            return null;
        }
        eVar = ((NutritionUserPreferenceDTO) ((v2.b) v2Var2).f47386a).f39579a;
        if (eVar == null) {
            eVar = w01.e.GRAMS;
        }
        w01.e eVar2 = eVar;
        if (i16 != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        return new v2.b(new w01.c(bVar4, eVar2, bVar3, null, null, null, null, null, null, z14, 504, null), i18, null, null, 12, null);
        v2 v2Var3 = (v2) objJ2;
        if (v2Var3 instanceof v2.b) {
            v2.b bVar7 = (v2.b) v2Var3;
            bVar = (w01.b) bVar7.f47386a;
            i14 = bVar7.f47387b;
            i15 = 0;
        } else {
            if (!(v2Var3 instanceof v2.a)) {
                u0.r();
                return null;
            }
            v2.a aVar2 = (v2.a) v2Var3;
            Integer num = aVar2.f47384b;
            if (num == null || num.intValue() != 500 || (str = aVar2.f47385c) == null || !d53.w.z(str, "WeatherServiceException", false)) {
                return v2Var3;
            }
            i14 = 200;
            bVar = null;
            i15 = 1;
        }
        u uVar = new u(this, null);
        tVar.f57944d = bVar;
        tVar.f57941a = j15;
        tVar.f57942b = i14;
        tVar.f57943c = i15;
        tVar.f57948h = 2;
        Object objJ3 = com.garmin.android.apps.connectmobile.f0.J(this, uVar, tVar);
        if (objJ3 != aVar) {
            long j16 = j15;
            i16 = i15;
            j14 = j16;
            i17 = i14;
            objJ2 = objJ3;
            v2Var = (v2) objJ2;
            if (v2Var instanceof v2.b) {
                if (v2Var instanceof v2.a) {
                    return v2Var;
                }
                u0.r();
                return null;
            }
            bVar2 = ((HydrationUserPreferenceDTO) ((v2.b) v2Var).f47386a).f39577a;
            if (bVar2 == null) {
                bVar2 = q22.b.MILLILITER;
            }
            w wVar2 = new w(this, null);
            tVar.f57944d = bVar;
            tVar.f57945e = bVar2;
            tVar.f57941a = j14;
            tVar.f57942b = i17;
            tVar.f57943c = i16;
            tVar.f57948h = 3;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, wVar2, tVar);
            if (objJ != aVar) {
                bVar3 = bVar2;
                objJ2 = objJ;
                bVar4 = bVar;
                i18 = i17;
                v2Var2 = (v2) objJ2;
                if (v2Var2 instanceof v2.b) {
                    if (v2Var2 instanceof v2.a) {
                        return v2Var2;
                    }
                    u0.r();
                    return null;
                }
                eVar = ((NutritionUserPreferenceDTO) ((v2.b) v2Var2).f47386a).f39579a;
                if (eVar == null) {
                    eVar = w01.e.GRAMS;
                }
                w01.e eVar3 = eVar;
                if (i16 != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                return new v2.b(new w01.c(bVar4, eVar3, bVar3, null, null, null, null, null, null, z14, 504, null), i18, null, null, 12, null);
            }
        }
        return aVar;
    }

    public final Object i(String str, com.garmin.android.apps.connectmobile.courses.model.e eVar, v13.c cVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new o0(this, str, eVar, null), cVar);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ld60/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "COURSE_SEARCH_LIST_SIZE_LIMIT", "I", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
