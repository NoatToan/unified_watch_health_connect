package ey0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import o53.i0;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ley0/g0;", "Lcom/garmin/android/apps/connectmobile/f0;", "<init>", "()V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g0 implements com.garmin.android.apps.connectmobile.f0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f67173j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o13.t f67174a = o13.m.b(new e51.c(29));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.t f67175b = o13.m.b(new a(0));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f67176c = o13.m.b(new a(1));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f67177d = o13.m.b(new a(2));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13.t f67178e = o13.m.b(new a(3));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o13.t f67179f = o13.m.b(new a(4));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o13.t f67180g = o13.m.b(new a(5));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o13.t f67181h = o13.m.b(new a(6));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o13.t f67182i = o13.m.b(new a(7));

    public static final dy0.e a(g0 g0Var) {
        return (dy0.e) g0Var.f67179f.getValue();
    }

    public static final dy0.f b(g0 g0Var) {
        return (dy0.f) g0Var.f67174a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ad A[Catch: all -> 0x0032, HttpException -> 0x0035, TryCatch #2 {HttpException -> 0x0035, all -> 0x0032, blocks: (B:13:0x002e, B:33:0x008a, B:34:0x00a7, B:36:0x00ad, B:38:0x00bb, B:39:0x00bf, B:22:0x0041, B:29:0x006e, B:25:0x0056), top: B:45:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable c(String str, v13.c cVar) {
        h hVar;
        int i14;
        List list;
        ArrayList arrayList;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i15 = hVar.f67187e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                hVar.f67187e = i15 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object obj = hVar.f67185c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = hVar.f67187e;
        o13.t tVar = this.f67177d;
        try {
            if (i16 == 0) {
                o13.r.b(obj);
                int userProfilePk = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk();
                i0<List<com.garmin.android.apps.connectmobile.courses.model.d>> i0VarN = ((d60.a) tVar.getValue()).N(str, null, null, null);
                hVar.f67184b = userProfilePk;
                hVar.f67187e = 1;
                Object objAwait = i0VarN.await(hVar);
                if (objAwait != aVar) {
                    obj = objAwait;
                    i14 = userProfilePk;
                }
                return aVar;
            }
            if (i16 == 1) {
                i14 = hVar.f67184b;
                o13.r.b(obj);
            } else {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i14 = hVar.f67184b;
                list = hVar.f67183a;
                o13.r.b(obj);
            }
            d60.b.f57806c.getClass();
            new d60.b();
            List listC = d60.b.c(i14, h0.d1(list), (List) obj);
            arrayList = new ArrayList();
            for (Object obj2 : listC) {
                if (((com.garmin.android.apps.connectmobile.courses.model.d) obj2).userProfileId == i14) {
                    arrayList.add(obj2);
                }
            }
            i2.f36769a.getClass();
            i2.a.a(a2.MULTI_DAY_ACTIVITY, "getCourses() -> SUCCESS =[" + arrayList + "].");
            return arrayList;
            List list2 = (List) obj;
            i0<List<com.garmin.android.apps.connectmobile.courses.model.d>> i0VarU = ((d60.a) tVar.getValue()).u();
            hVar.f67183a = list2;
            hVar.f67184b = i14;
            hVar.f67187e = 2;
            Object objAwait2 = i0VarU.await(hVar);
            if (objAwait2 != aVar) {
                list = list2;
                obj = objAwait2;
                d60.b.f57806c.getClass();
                new d60.b();
                List listC2 = d60.b.c(i14, h0.d1(list), (List) obj);
                arrayList = new ArrayList();
                while (r11.hasNext()) {
                    if (((com.garmin.android.apps.connectmobile.courses.model.d) obj2).userProfileId == i14) {
                        arrayList.add(obj2);
                    }
                }
                i2.f36769a.getClass();
                i2.a.a(a2.MULTI_DAY_ACTIVITY, "getCourses() -> SUCCESS =[" + arrayList + "].");
                return arrayList;
            }
            return aVar;
        } catch (HttpException e4) {
            a2 a2Var = a2.MULTI_DAY_ACTIVITY;
            String strE = o2.c.e(e4.code(), "getCourses() -> server error response code=[", "] message=[", e4.message(), "].");
            i2.f36769a.getClass();
            i2.a.e(a2Var, strE);
            return j0.f134944a;
        } catch (Throwable th3) {
            i2.f36769a.getClass();
            i2.a.e(a2.MULTI_DAY_ACTIVITY, "getCourses() -> server error message=[" + th3 + "].");
            return j0.f134944a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0242  */
    /* JADX WARN: Code duplicated, block: B:110:0x0253  */
    /* JADX WARN: Code duplicated, block: B:115:0x0264  */
    /* JADX WARN: Code duplicated, block: B:120:0x0275  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:36:0x010b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0110  */
    /* JADX WARN: Code duplicated, block: B:42:0x0132  */
    /* JADX WARN: Code duplicated, block: B:45:0x0144  */
    /* JADX WARN: Code duplicated, block: B:47:0x0169  */
    /* JADX WARN: Code duplicated, block: B:48:0x016e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0195  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:77:0x01df  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:88:0x0203  */
    /* JADX WARN: Code duplicated, block: B:93:0x0214  */
    /* JADX WARN: Code duplicated, block: B:98:0x0225  */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x00e6, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x0144, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object d(fz0.c cVar, fz0.c cVar2, fz0.c cVar3, v13.c cVar4) throws IOException {
        u uVar;
        fz0.c cVar5;
        fz0.c cVar6;
        c83.a0 a0Var;
        c83.a0 a0Var2;
        Object objAwait;
        c83.a0 a0Var3;
        c83.a0 a0Var4;
        ResponseBody responseBody;
        String strString;
        c83.a0 a0Var5;
        Response response;
        cy0.s sVar;
        Double d14;
        cy0.s sVar2;
        Double d15;
        cy0.d dVar;
        Float restingCaloriesAverage;
        cy0.d dVar2;
        Float activeCaloriesAverage;
        Float totalCaloriesAverage;
        mm1.b bVar;
        Double averageSleepScore;
        Double meanAvgHeartRate;
        Double averageRestingHeartRate;
        Integer num;
        Double averageSpO2;
        Double averageRespiration;
        Double averageSkinTempC;
        mm1.a overallStats;
        mm1.a overallStats2;
        mm1.a overallStats3;
        mm1.a overallStats4;
        mm1.a overallStats5;
        Double averageBodyBatteryChange;
        mm1.a overallStats6;
        mm1.a overallStats7;
        mm1.a overallStats8;
        cy0.d.a aggregations;
        cy0.d.a aggregations2;
        cy0.d.a aggregations3;
        cy0.s.b bVarB;
        Integer numB;
        cy0.s.b bVarB2;
        Integer numD;
        ResponseBody responseBody2;
        String strString2;
        fz0.c cVar7 = cVar;
        fz0.c cVar8 = cVar2;
        if (cVar4 instanceof u) {
            uVar = (u) cVar4;
            int i14 = uVar.f67242h;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                uVar.f67242h = i14 - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar4);
            }
        } else {
            uVar = new u(this, cVar4);
        }
        Object objAwait2 = uVar.f67240f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = uVar.f67242h;
        o13.t tVar = this.f67182i;
        Double averageSkinTempF = null;
        if (i15 == 0) {
            o13.r.b(objAwait2);
            i0<c83.a0<cy0.s>> i0VarC = ((dy0.d) tVar.getValue()).c(cVar7, cVar8);
            uVar.f67235a = cVar7;
            uVar.f67236b = cVar8;
            cVar5 = cVar3;
            uVar.f67237c = cVar5;
            uVar.f67242h = 1;
            objAwait2 = i0VarC.await(uVar);
            if (objAwait2 != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            fz0.c cVar9 = uVar.f67237c;
            cVar8 = uVar.f67236b;
            fz0.c cVar10 = uVar.f67235a;
            o13.r.b(objAwait2);
            cVar5 = cVar9;
            cVar7 = cVar10;
        } else {
            if (i15 == 2) {
                a0Var = uVar.f67238d;
                cVar8 = uVar.f67236b;
                cVar6 = uVar.f67235a;
                o13.r.b(objAwait2);
                a0Var2 = (c83.a0) objAwait2;
                if (!a0Var2.f25745a.isSuccessful()) {
                    IOException iOException = new IOException("Error Occurred during getting safe Api result, Response [" + a0Var2 + "]");
                    Integer num2 = new Integer(a0Var2.f25745a.code());
                    responseBody = a0Var2.f25747c;
                    if (responseBody != null) {
                        strString = responseBody.string();
                    } else {
                        strString = null;
                    }
                    new v2.a(iOException, num2, strString);
                }
                i0<c83.a0<mm1.b>> i0VarB = ((dy0.d) tVar.getValue()).b(cVar6, cVar8);
                uVar.f67235a = null;
                uVar.f67236b = null;
                uVar.f67237c = null;
                uVar.f67238d = a0Var;
                uVar.f67239e = a0Var2;
                uVar.f67242h = 3;
                objAwait = i0VarB.await(uVar);
                if (objAwait != aVar) {
                    a0Var3 = a0Var;
                    a0Var4 = a0Var2;
                    objAwait2 = objAwait;
                }
                return aVar;
            }
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a0Var4 = uVar.f67239e;
            a0Var3 = uVar.f67238d;
            o13.r.b(objAwait2);
        }
        a0Var5 = (c83.a0) objAwait2;
        response = a0Var5.f25745a;
        T t7 = a0Var5.f25746b;
        if (!response.isSuccessful()) {
            IOException iOException2 = new IOException("Error Occurred during getting safe Api result, Response [" + a0Var5 + "]");
            Integer num3 = new Integer(a0Var5.f25745a.code());
            responseBody2 = a0Var5.f25747c;
            if (responseBody2 != null) {
                strString2 = responseBody2.string();
            } else {
                strString2 = null;
            }
            new v2.a(iOException2, num3, strString2);
        }
        sVar = (cy0.s) a0Var3.f25746b;
        if (sVar != null || (bVarB2 = sVar.getValues()) == null || (numD = bVarB2.getWellnessMaxAvgHR()) == null) {
            d14 = null;
        } else {
            d14 = new Double(numD.intValue());
        }
        sVar2 = (cy0.s) a0Var3.f25746b;
        if (sVar2 != null || (bVarB = sVar2.getValues()) == null || (numB = bVarB.getAvgRestingHR()) == null) {
            d15 = null;
        } else {
            d15 = new Double(numB.intValue());
        }
        T t14 = a0Var4.f25746b;
        dVar = (cy0.d) t14;
        if (dVar != null || (aggregations3 = dVar.getAggregations()) == null) {
            restingCaloriesAverage = null;
        } else {
            restingCaloriesAverage = aggregations3.getRestingCaloriesAverage();
        }
        dVar2 = (cy0.d) t14;
        if (dVar2 != null || (aggregations2 = dVar2.getAggregations()) == null) {
            activeCaloriesAverage = null;
        } else {
            activeCaloriesAverage = aggregations2.getActiveCaloriesAverage();
        }
        if (dVar2 != null || (aggregations = dVar2.getAggregations()) == null) {
            totalCaloriesAverage = null;
        } else {
            totalCaloriesAverage = aggregations.getTotalCaloriesAverage();
        }
        bVar = (mm1.b) t7;
        if (bVar != null || (overallStats8 = bVar.getOverallStats()) == null) {
            averageSleepScore = null;
        } else {
            averageSleepScore = overallStats8.getAverageSleepScore();
        }
        if (bVar != null || (overallStats7 = bVar.getOverallStats()) == null) {
            meanAvgHeartRate = null;
        } else {
            meanAvgHeartRate = overallStats7.getMeanAvgHeartRate();
        }
        if (bVar != null || (overallStats6 = bVar.getOverallStats()) == null) {
            averageRestingHeartRate = null;
        } else {
            averageRestingHeartRate = overallStats6.getAverageRestingHeartRate();
        }
        if (bVar != null || (overallStats5 = bVar.getOverallStats()) == null || (averageBodyBatteryChange = overallStats5.getAverageBodyBatteryChange()) == null) {
            num = null;
        } else {
            num = new Integer((int) averageBodyBatteryChange.doubleValue());
        }
        if (bVar != null || (overallStats4 = bVar.getOverallStats()) == null) {
            averageSpO2 = null;
        } else {
            averageSpO2 = overallStats4.getAverageSpO2();
        }
        if (bVar != null || (overallStats3 = bVar.getOverallStats()) == null) {
            averageRespiration = null;
        } else {
            averageRespiration = overallStats3.getAverageRespiration();
        }
        if (bVar != null || (overallStats2 = bVar.getOverallStats()) == null) {
            averageSkinTempC = null;
        } else {
            averageSkinTempC = overallStats2.getAverageSkinTempC();
        }
        if (bVar != null && (overallStats = bVar.getOverallStats()) != null) {
            averageSkinTempF = overallStats.getAverageSkinTempF();
        }
        return new v2.b(new cy0.i(d14, d15, restingCaloriesAverage, activeCaloriesAverage, totalCaloriesAverage, averageSleepScore, meanAvgHeartRate, averageRestingHeartRate, num, averageSpO2, averageRespiration, averageSkinTempC, averageSkinTempF), a0Var3.f25745a.code(), null, null, 12, null);
        c83.a0 a0Var6 = (c83.a0) objAwait2;
        if (!a0Var6.f25745a.isSuccessful()) {
            IOException iOException3 = new IOException("Error Occurred during getting safe Api result, Response [" + a0Var6 + "]");
            Integer num4 = new Integer(a0Var6.f25745a.code());
            ResponseBody responseBody3 = a0Var6.f25747c;
            new v2.a(iOException3, num4, responseBody3 != null ? responseBody3.string() : null);
        }
        i0<c83.a0<cy0.d>> i0VarA = ((dy0.d) tVar.getValue()).a(cVar7, cVar8, "CALORIES", cVar5);
        uVar.f67235a = cVar7;
        uVar.f67236b = cVar8;
        uVar.f67237c = null;
        uVar.f67238d = a0Var6;
        uVar.f67242h = 2;
        Object objAwait3 = i0VarA.await(uVar);
        if (objAwait3 != aVar) {
            cVar6 = cVar7;
            a0Var = a0Var6;
            objAwait2 = objAwait3;
            a0Var2 = (c83.a0) objAwait2;
            if (!a0Var2.f25745a.isSuccessful()) {
                IOException iOException4 = new IOException("Error Occurred during getting safe Api result, Response [" + a0Var2 + "]");
                Integer num5 = new Integer(a0Var2.f25745a.code());
                responseBody = a0Var2.f25747c;
                if (responseBody != null) {
                    strString = responseBody.string();
                } else {
                    strString = null;
                }
                new v2.a(iOException4, num5, strString);
            }
            i0<c83.a0<mm1.b>> i0VarB2 = ((dy0.d) tVar.getValue()).b(cVar6, cVar8);
            uVar.f67235a = null;
            uVar.f67236b = null;
            uVar.f67237c = null;
            uVar.f67238d = a0Var;
            uVar.f67239e = a0Var2;
            uVar.f67242h = 3;
            objAwait = i0VarB2.await(uVar);
            if (objAwait != aVar) {
                a0Var3 = a0Var;
                a0Var4 = a0Var2;
                objAwait2 = objAwait;
                a0Var5 = (c83.a0) objAwait2;
                response = a0Var5.f25745a;
                T t15 = a0Var5.f25746b;
                if (!response.isSuccessful()) {
                    IOException iOException5 = new IOException("Error Occurred during getting safe Api result, Response [" + a0Var5 + "]");
                    Integer num6 = new Integer(a0Var5.f25745a.code());
                    responseBody2 = a0Var5.f25747c;
                    if (responseBody2 != null) {
                        strString2 = responseBody2.string();
                    } else {
                        strString2 = null;
                    }
                    new v2.a(iOException5, num6, strString2);
                }
                sVar = (cy0.s) a0Var3.f25746b;
                if (sVar != null) {
                    d14 = null;
                } else {
                    d14 = null;
                }
                sVar2 = (cy0.s) a0Var3.f25746b;
                if (sVar2 != null) {
                    d15 = null;
                } else {
                    d15 = null;
                }
                T t16 = a0Var4.f25746b;
                dVar = (cy0.d) t16;
                if (dVar != null) {
                    restingCaloriesAverage = null;
                } else {
                    restingCaloriesAverage = null;
                }
                dVar2 = (cy0.d) t16;
                if (dVar2 != null) {
                    activeCaloriesAverage = null;
                } else {
                    activeCaloriesAverage = null;
                }
                if (dVar2 != null) {
                    totalCaloriesAverage = null;
                } else {
                    totalCaloriesAverage = null;
                }
                bVar = (mm1.b) t15;
                if (bVar != null) {
                    averageSleepScore = null;
                } else {
                    averageSleepScore = null;
                }
                if (bVar != null) {
                    meanAvgHeartRate = null;
                } else {
                    meanAvgHeartRate = null;
                }
                if (bVar != null) {
                    averageRestingHeartRate = null;
                } else {
                    averageRestingHeartRate = null;
                }
                if (bVar != null) {
                    num = null;
                } else {
                    num = null;
                }
                if (bVar != null) {
                    averageSpO2 = null;
                } else {
                    averageSpO2 = null;
                }
                if (bVar != null) {
                    averageRespiration = null;
                } else {
                    averageRespiration = null;
                }
                if (bVar != null) {
                    averageSkinTempC = null;
                } else {
                    averageSkinTempC = null;
                }
                if (bVar != null) {
                    averageSkinTempF = overallStats.getAverageSkinTempF();
                }
                return new v2.b(new cy0.i(d14, d15, restingCaloriesAverage, activeCaloriesAverage, totalCaloriesAverage, averageSleepScore, meanAvgHeartRate, averageRestingHeartRate, num, averageSpO2, averageRespiration, averageSkinTempC, averageSkinTempF), a0Var3.f25745a.code(), null, null, 12, null);
            }
        }
        return aVar;
    }
}
