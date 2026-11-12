package com.garmin.android.apps.connectmobile.golf.truswing;

import android.content.Context;
import android.text.TextUtils;
import bs2.bx;
import bs2.zw;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.golf.truswing.model.SwingDTO;
import com.garmin.android.golfswing.GolfSwingData;
import com.garmin.android.golfswing.GolfSwingsInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import wl0.t;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    public static class a {
        private a() {
        }

        public static SwingDTO a(t tVar) {
            com.garmin.android.apps.connectmobile.golf.truswing.model.k next;
            char c14;
            char c15;
            com.garmin.android.apps.connectmobile.golf.truswing.model.k kVar;
            double[][] dArrC;
            if (tVar == null) {
                return null;
            }
            ArrayList arrayList = tVar.f186002g;
            SwingDTO swingDTO = new SwingDTO();
            wl0.h hVarI = wl0.h.i();
            long j8 = tVar.f185996a;
            List<com.garmin.android.apps.connectmobile.golf.truswing.model.k> list = hVarI.f185929g;
            if (list != null) {
                Iterator<com.garmin.android.apps.connectmobile.golf.truswing.model.k> it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (next.f35952a != j8);
            } else {
                next = null;
                break;
            }
            swingDTO.f35875d = next;
            com.garmin.android.apps.connectmobile.golf.truswing.model.i iVar = new com.garmin.android.apps.connectmobile.golf.truswing.model.i();
            zw zwVar = tVar.f185999d;
            if (zwVar == null) {
                swingDTO.f35879h = iVar;
                c14 = 0;
                c15 = 2;
            } else {
                double d14 = d(zwVar.h(1));
                double d15 = d(zwVar.h(2));
                c14 = 0;
                c15 = 2;
                iVar.f35934a = d(zwVar.h(0));
                iVar.f35935b = d14;
                iVar.f35936c = d15;
                iVar.f35939f = d(zwVar.h(3));
                iVar.f35940g = d(zwVar.h(4));
                iVar.f35941h = d(zwVar.h(5));
                iVar.f35942i = d(zwVar.h(7));
                iVar.f35943j = d(zwVar.h(18));
                iVar.f35944k = d(zwVar.h(8));
                iVar.f35945l = d(zwVar.h(9));
                iVar.f35946m = d(zwVar.h(19));
                iVar.f35947n = d(zwVar.h(10));
                iVar.f35948o = d(zwVar.h(11));
                com.garmin.android.apps.connectmobile.golf.truswing.model.j jVar = new com.garmin.android.apps.connectmobile.golf.truswing.model.j();
                jVar.f35950a = new double[]{d(zwVar.h(12)), d(zwVar.h(13)), d(zwVar.h(14))};
                iVar.f35949p = jVar;
                if (!Double.isNaN(d14) && !Double.isNaN(d15) && d15 > 0.0d) {
                    iVar.f35937d = d14 / d15;
                }
                swingDTO.f35879h = iVar;
                swingDTO.f35880i = zwVar.j(17, 65535).longValue();
            }
            swingDTO.f35880i = tVar.a();
            swingDTO.f35872a = tVar.a();
            wl0.h hVarI2 = wl0.h.i();
            long j14 = tVar.f185996a;
            List<com.garmin.android.apps.connectmobile.golf.truswing.model.k> list2 = hVarI2.f185929g;
            if (list2 != null) {
                Iterator<com.garmin.android.apps.connectmobile.golf.truswing.model.k> it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        kVar = null;
                        break;
                    }
                    com.garmin.android.apps.connectmobile.golf.truswing.model.k next2 = it3.next();
                    if (next2.f35952a == j14) {
                        kVar = next2;
                        break;
                    }
                }
            } else {
                kVar = null;
                break;
            }
            swingDTO.f35875d = kVar;
            double[][] dArrC2 = c(tVar.f186000e);
            if (dArrC2 != null) {
                swingDTO.f35876e = dArrC2;
            }
            zw zwVar2 = tVar.f186001f;
            if (zwVar2 != null) {
                double d16 = d(zwVar2.h(12));
                double d17 = d(zwVar2.h(13));
                double d18 = d(zwVar2.h(14));
                double[] dArr = new double[3];
                dArr[c14] = d16;
                dArr[1] = d17;
                dArr[c15] = d18;
                com.garmin.android.apps.connectmobile.golf.truswing.model.j jVar2 = iVar.f35949p;
                if (jVar2 == null) {
                    jVar2 = new com.garmin.android.apps.connectmobile.golf.truswing.model.j();
                }
                jVar2.f35951b = dArr;
                iVar.f35949p = jVar2;
                swingDTO.f35879h = iVar;
            }
            if (arrayList != 0 && arrayList.size() > 0 && (dArrC = c(arrayList)) != null) {
                swingDTO.f35877f = dArrC;
            }
            return swingDTO;
        }

        public static GolfSwingsInfo b(SwingDTO swingDTO, String str) {
            double[] dArr;
            GolfSwingData golfSwingData = new GolfSwingData();
            GolfSwingsInfo golfSwingsInfo = new GolfSwingsInfo();
            Vector vector = null;
            com.garmin.android.apps.connectmobile.golf.truswing.model.i iVar = swingDTO != null ? swingDTO.f35879h : null;
            golfSwingData.mTimestamp = Long.valueOf(swingDTO != null ? swingDTO.f35880i : 0L).floatValue();
            if (iVar != null) {
                if (str.equals("CLUB")) {
                    golfSwingData.mSwingSpeed = (float) iVar.f35934a;
                    golfSwingData.mBackswingTime = (float) iVar.f35935b;
                    golfSwingData.mDownswingTime = (float) iVar.f35936c;
                    golfSwingData.mShaftAngleAtAddress = (float) iVar.f35940g;
                    golfSwingData.mShaftLeanAtAddress = (float) iVar.f35939f;
                    golfSwingData.mClubPathAtImpact = (float) iVar.f35941h;
                    golfSwingData.mFaceAngleAtImpact = (float) iVar.f35942i;
                    golfSwingData.mFaceTargetAtImpact = (float) iVar.f35943j;
                    golfSwingData.mClubLoftAtImpact = (float) iVar.f35945l;
                    golfSwingData.mShaftLeanAtImpact = (float) iVar.f35947n;
                    golfSwingData.mShaftAngleAtImpact = (float) iVar.f35948o;
                }
                if (iVar.f35949p != null) {
                    boolean zEquals = str.equals("CLUB");
                    com.garmin.android.apps.connectmobile.golf.truswing.model.j jVar = iVar.f35949p;
                    dArr = zEquals ? jVar.f35950a : jVar.f35951b;
                } else {
                    dArr = null;
                }
                if (dArr != null && dArr.length >= 3) {
                    golfSwingData.mFrontVectorNorth = (float) dArr[0];
                    golfSwingData.mFrontVectorEast = (float) dArr[1];
                    golfSwingData.mFrontVectorGround = (float) dArr[2];
                }
            }
            if (swingDTO != null) {
                double[][] dArr2 = str.equals("CLUB") ? swingDTO.f35876e : swingDTO.f35877f;
                if (dArr2 != null) {
                    vector = new Vector();
                    for (double[] dArr3 : dArr2) {
                        if (dArr3 != null && dArr3.length >= 3) {
                            for (int i14 = 0; i14 < 3; i14++) {
                                vector.add(Float.valueOf((float) dArr3[i14]));
                            }
                            if (dArr3.length >= 7) {
                                for (int i15 = 3; i15 < 7; i15++) {
                                    vector.add(Float.valueOf((float) dArr3[i15]));
                                }
                            } else {
                                for (int i16 = 3; i16 < 7; i16++) {
                                    vector.add(Float.valueOf(0.0f));
                                }
                            }
                        }
                    }
                }
                golfSwingData.mSwingPoints = vector;
            }
            HashMap<Double, GolfSwingData> map = new HashMap<>();
            golfSwingsInfo.mSwings = map;
            map.put(Double.valueOf(golfSwingData.mTimestamp), golfSwingData);
            return golfSwingsInfo;
        }

        public static double[][] c(ArrayList arrayList) {
            if (arrayList == null) {
                return null;
            }
            double[][] dArr = new double[arrayList.size()][];
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                bx bxVar = (bx) arrayList.get(i14);
                double[] dArr2 = new double[7];
                dArr[i14] = dArr2;
                dArr2[0] = d(bxVar.h(4));
                dArr[i14][1] = d(bxVar.h(5));
                dArr[i14][2] = d(bxVar.h(6));
                dArr[i14][3] = d(bxVar.h(0));
                dArr[i14][4] = d(bxVar.h(1));
                dArr[i14][5] = d(bxVar.h(2));
                dArr[i14][6] = d(bxVar.h(3));
            }
            return dArr;
        }

        public static double d(Float f14) {
            if (f14 == null) {
                return Double.NaN;
            }
            return f14.doubleValue();
        }
    }

    private k() {
    }

    public static SwingDTO a() {
        SwingDTO swingDTO = new SwingDTO();
        swingDTO.f35879h = new com.garmin.android.apps.connectmobile.golf.truswing.model.i();
        return swingDTO;
    }

    public static String b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (DateTime.now().withTimeAtStartOfDay().equals(new DateTime(str).withTimeAtStartOfDay())) {
            return context.getString(R.string.challenge_leaderboard_header_today_label);
        }
        String strE = j0.e(str, DateTimeZone.getDefault(), "MMMM d, yyyy", DateTimeZone.getDefault());
        return !TextUtils.isEmpty(strE) ? strE : str;
    }

    public static double c(GolfSwingsInfo golfSwingsInfo) {
        HashMap<Double, GolfSwingData> map = golfSwingsInfo.mSwings;
        if (map == null || map.isEmpty()) {
            return 0.0d;
        }
        return golfSwingsInfo.mSwings.keySet().iterator().next().doubleValue();
    }
}
