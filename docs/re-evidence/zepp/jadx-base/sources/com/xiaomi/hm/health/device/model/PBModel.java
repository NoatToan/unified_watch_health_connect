package com.xiaomi.hm.health.device.model;

import com.xiaomi.hm.health.bt.profile.gdsp.gps.KmPaceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.MilePaceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportDetail;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class PBModel {
    private static final String o = "PBModel";
    private static final int p = 1;
    private static final int q = 9;
    private static List<Marked> r = new ArrayList();
    private static List<Marked> s = new ArrayList();
    public int run3Km = -1;
    public int run5Km = -1;
    public int run10Km = -1;
    public int run3Mi = -1;
    public int run5Mi = -1;
    public int run10Mi = -1;
    public int ride5Km = -1;
    public int ride10Km = -1;
    public int ride20Km = -1;
    public int ride40Km = -1;
    public int ride5Mi = -1;
    public int ride10Mi = -1;
    public int ride20Mi = -1;
    public int ride40Mi = -1;
    private boolean a = false;
    private boolean b = false;
    private boolean c = false;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;
    private boolean m = false;
    private boolean n = false;

    public static class JSONKeys {
        public static final String KEY_RIDE_10_KM = "ride_10_km";
        public static final String KEY_RIDE_10_MI = "ride_10_mi";
        public static final String KEY_RIDE_20_KM = "ride_20_km";
        public static final String KEY_RIDE_20_MI = "ride_20_mi";
        public static final String KEY_RIDE_40_KM = "ride_40_km";
        public static final String KEY_RIDE_40_MI = "ride_40_mi";
        public static final String KEY_RIDE_5_KM = "ride_5_km";
        public static final String KEY_RIDE_5_MI = "ride_5_mi";
        public static final String KEY_RUN_10_KM = "run_10_km";
        public static final String KEY_RUN_10_MI = "run_10_mi";
        public static final String KEY_RUN_3_KM = "run_3_km";
        public static final String KEY_RUN_3_MI = "run_3_mi";
        public static final String KEY_RUN_5_KM = "run_5_km";
        public static final String KEY_RUN_5_MI = "run_5_mi";
    }

    public static class Marked {
        public static final int f = 0;
        public static final int g = 1;
        public int a = -1;
        public int b = -1;
        public int c;
        public double d;
        public double e;

        public Marked(int i) {
            this.c = i;
        }

        public int a() {
            return this.b;
        }

        public void b(int i) {
            this.b = i;
        }

        public void c(double d) {
            this.d = d;
        }

        public int getDis() {
            return this.a;
        }

        public double getLat() {
            return this.e;
        }

        public double getLon() {
            return this.d;
        }

        public boolean isValid() {
            return (this.a == -1 || this.b == -1) ? false : true;
        }

        public void setDis(int i) {
            this.a = i;
        }

        public void setLat(double d) {
            this.e = d;
        }

        public String toString() {
            return " mDis " + this.a + " mCt " + this.b;
        }
    }

    private static void a(SportDetail sportDetail) {
        r.clear();
        s.clear();
        ArrayList<KmPaceInfo> kmPaceInfos = sportDetail.getKmPaceInfos();
        ArrayList<MilePaceInfo> milePaceInfos = sportDetail.getMilePaceInfos();
        if (kmPaceInfos != null) {
            for (int i = 0; i < kmPaceInfos.size(); i++) {
                Marked marked = new Marked(0);
                KmPaceInfo kmPaceInfo = kmPaceInfos.get(i);
                if (kmPaceInfo != null) {
                    marked.setDis(kmPaceInfo.getIndex());
                    marked.b(kmPaceInfo.getPace());
                }
                if (marked.isValid()) {
                    r.add(marked);
                }
            }
        }
        if (milePaceInfos != null) {
            for (int i2 = 0; i2 < milePaceInfos.size(); i2++) {
                Marked marked2 = new Marked(1);
                MilePaceInfo milePaceInfo = milePaceInfos.get(i2);
                if (milePaceInfo != null) {
                    marked2.setDis(milePaceInfo.getIndex());
                    marked2.b(milePaceInfo.getPace());
                }
                if (marked2.isValid()) {
                    s.add(marked2);
                }
            }
        }
    }

    private static void b(int i, List<Marked> list, List<Integer> list2) {
        int i2;
        if (list.get(list.size() - 1).a < i) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            if (i5 >= i3 && c(list, i5, i)) {
                int i6 = i5;
                while (true) {
                    i2 = i5 + i;
                    if (i6 >= i2) {
                        break;
                    }
                    i4 += list.get(i6).b;
                    i6++;
                }
                list2.add(Integer.valueOf(i4));
                i3 = i2;
            }
        }
    }

    private static boolean c(List<Marked> list, int i, int i2) {
        int i3 = (i + i2) - 1;
        if (i3 >= list.size()) {
            return false;
        }
        int i4 = list.get(i).a;
        int i5 = list.get(i3).a;
        return i5 - i4 == i2 + (-1) && i5 % i2 == 0;
    }

    public static PBModel checkPBInfo(int i, SportDetail sportDetail) {
        a(sportDetail);
        if (r.isEmpty() && s.isEmpty()) {
            return null;
        }
        if (i != 1 && i != 9) {
            return null;
        }
        PBModel pBModel = new PBModel();
        ArrayList<Integer> arrayList = new ArrayList();
        ArrayList<Integer> arrayList2 = new ArrayList();
        ArrayList<Integer> arrayList3 = new ArrayList();
        ArrayList<Integer> arrayList4 = new ArrayList();
        ArrayList<Integer> arrayList5 = new ArrayList();
        ArrayList<Integer> arrayList6 = new ArrayList();
        ArrayList<Integer> arrayList7 = new ArrayList();
        ArrayList<Integer> arrayList8 = new ArrayList();
        ArrayList<Integer> arrayList9 = new ArrayList();
        ArrayList<Integer> arrayList10 = new ArrayList();
        if (!r.isEmpty()) {
            if (i == 1) {
                b(3, r, arrayList);
            }
            b(5, r, arrayList2);
            b(10, r, arrayList3);
            if (i == 9) {
                b(20, r, arrayList4);
                b(40, r, arrayList5);
            }
        }
        if (!s.isEmpty()) {
            if (i == 1) {
                b(3, s, arrayList6);
            }
            b(5, s, arrayList7);
            b(10, s, arrayList8);
            if (i == 9) {
                b(20, s, arrayList9);
                b(40, s, arrayList10);
            }
        }
        if (!arrayList.isEmpty()) {
            int iIntValue = Integer.MAX_VALUE;
            for (Integer num : arrayList) {
                if (num.intValue() < iIntValue) {
                    iIntValue = num.intValue();
                }
            }
            pBModel.setRun3Km(iIntValue);
        }
        if (!arrayList6.isEmpty()) {
            int iIntValue2 = Integer.MAX_VALUE;
            for (Integer num2 : arrayList6) {
                if (num2.intValue() < iIntValue2) {
                    iIntValue2 = num2.intValue();
                }
            }
            pBModel.setRun3Mi(iIntValue2);
        }
        if (!arrayList2.isEmpty()) {
            int iIntValue3 = Integer.MAX_VALUE;
            for (Integer num3 : arrayList2) {
                if (num3.intValue() < iIntValue3) {
                    iIntValue3 = num3.intValue();
                }
            }
            if (i == 1) {
                pBModel.setRun5Km(iIntValue3);
            } else {
                pBModel.setRide5Km(iIntValue3);
            }
        }
        if (!arrayList7.isEmpty()) {
            int iIntValue4 = Integer.MAX_VALUE;
            for (Integer num4 : arrayList7) {
                if (num4.intValue() < iIntValue4) {
                    iIntValue4 = num4.intValue();
                }
            }
            if (i == 1) {
                pBModel.setRun5Mi(iIntValue4);
            } else {
                pBModel.setRide5Mi(iIntValue4);
            }
        }
        if (!arrayList3.isEmpty()) {
            int iIntValue5 = Integer.MAX_VALUE;
            for (Integer num5 : arrayList3) {
                if (num5.intValue() < iIntValue5) {
                    iIntValue5 = num5.intValue();
                }
            }
            if (i == 1) {
                pBModel.setRun10Km(iIntValue5);
            } else {
                pBModel.setRide10Km(iIntValue5);
            }
        }
        if (!arrayList8.isEmpty()) {
            int iIntValue6 = Integer.MAX_VALUE;
            for (Integer num6 : arrayList8) {
                if (num6.intValue() < iIntValue6) {
                    iIntValue6 = num6.intValue();
                }
            }
            if (i == 1) {
                pBModel.setRun10Mi(iIntValue6);
            } else {
                pBModel.setRide10Mi(iIntValue6);
            }
        }
        if (!arrayList4.isEmpty()) {
            int iIntValue7 = Integer.MAX_VALUE;
            for (Integer num7 : arrayList4) {
                if (num7.intValue() < iIntValue7) {
                    iIntValue7 = num7.intValue();
                }
            }
            pBModel.setRide20Km(iIntValue7);
        }
        if (!arrayList9.isEmpty()) {
            int iIntValue8 = Integer.MAX_VALUE;
            for (Integer num8 : arrayList9) {
                if (num8.intValue() < iIntValue8) {
                    iIntValue8 = num8.intValue();
                }
            }
            pBModel.setRide20Mi(iIntValue8);
        }
        if (!arrayList5.isEmpty()) {
            int iIntValue9 = Integer.MAX_VALUE;
            for (Integer num9 : arrayList5) {
                if (num9.intValue() < iIntValue9) {
                    iIntValue9 = num9.intValue();
                }
            }
            pBModel.setRide40Km(iIntValue9);
        }
        if (!arrayList10.isEmpty()) {
            int iIntValue10 = Integer.MAX_VALUE;
            for (Integer num10 : arrayList10) {
                if (num10.intValue() < iIntValue10) {
                    iIntValue10 = num10.intValue();
                }
            }
            pBModel.setRide40Mi(iIntValue10);
        }
        return pBModel;
    }

    public int getRide10Km() {
        return this.ride10Km;
    }

    public int getRide10Mi() {
        return this.ride10Mi;
    }

    public int getRide20Km() {
        return this.ride20Km;
    }

    public int getRide20Mi() {
        return this.ride20Mi;
    }

    public int getRide40Km() {
        return this.ride40Km;
    }

    public int getRide40Mi() {
        return this.ride40Mi;
    }

    public int getRide5Km() {
        return this.ride5Km;
    }

    public int getRide5Mi() {
        return this.ride5Mi;
    }

    public int getRun10Km() {
        return this.run10Km;
    }

    public int getRun10Mi() {
        return this.run10Mi;
    }

    public int getRun3Km() {
        return this.run3Km;
    }

    public int getRun3Mi() {
        return this.run3Mi;
    }

    public int getRun5Km() {
        return this.run5Km;
    }

    public int getRun5Mi() {
        return this.run5Mi;
    }

    public void initJSONFromObject(JSONObject jSONObject) throws JSONException {
        if (this.a) {
            jSONObject.put("run_3_km", this.run3Km);
        }
        if (this.b) {
            jSONObject.put("run_5_km", this.run5Km);
        }
        if (this.c) {
            jSONObject.put("run_10_km", this.run10Km);
        }
        if (this.d) {
            jSONObject.put("run_3_mi", this.run3Mi);
        }
        if (this.e) {
            jSONObject.put("run_5_mi", this.run5Mi);
        }
        if (this.f) {
            jSONObject.put("run_10_mi", this.run10Mi);
        }
        if (this.g) {
            jSONObject.put("ride_5_km", this.ride5Km);
        }
        if (this.h) {
            jSONObject.put("ride_10_km", this.ride10Km);
        }
        if (this.i) {
            jSONObject.put("ride_20_km", this.ride20Km);
        }
        if (this.j) {
            jSONObject.put("ride_40_km", this.ride40Km);
        }
        if (this.k) {
            jSONObject.put("ride_5_mi", this.ride5Mi);
        }
        if (this.l) {
            jSONObject.put("ride_10_mi", this.ride10Mi);
        }
        if (this.m) {
            jSONObject.put("ride_20_mi", this.ride20Mi);
        }
        if (this.n) {
            jSONObject.put("ride_40_mi", this.ride40Mi);
        }
    }

    public void setRide10Km(int i) {
        this.h = true;
        this.ride10Km = i;
    }

    public void setRide10Mi(int i) {
        this.l = true;
        this.ride10Mi = i;
    }

    public void setRide20Km(int i) {
        this.i = true;
        this.ride20Km = i;
    }

    public void setRide20Mi(int i) {
        this.m = true;
        this.ride20Mi = i;
    }

    public void setRide40Km(int i) {
        this.j = true;
        this.ride40Km = i;
    }

    public void setRide40Mi(int i) {
        this.n = true;
        this.ride40Mi = i;
    }

    public void setRide5Km(int i) {
        this.g = true;
        this.ride5Km = i;
    }

    public void setRide5Mi(int i) {
        this.k = true;
        this.ride5Mi = i;
    }

    public void setRun10Km(int i) {
        this.c = true;
        this.run10Km = i;
    }

    public void setRun10Mi(int i) {
        this.f = true;
        this.run10Mi = i;
    }

    public void setRun3Km(int i) {
        this.a = true;
        this.run3Km = i;
    }

    public void setRun3Mi(int i) {
        this.d = true;
        this.run3Mi = i;
    }

    public void setRun5Km(int i) {
        this.b = true;
        this.run5Km = i;
    }

    public void setRun5Mi(int i) {
        this.e = true;
        this.run5Mi = i;
    }

    public String toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            initJSONFromObject(jSONObject);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String toString() {
        return "PBModel{run3Km=" + this.run3Km + ", run5Km=" + this.run5Km + ", run10Km=" + this.run10Km + ", run3Mi=" + this.run3Mi + ", run5Mi=" + this.run5Mi + ", run10Mi=" + this.run10Mi + ", ride5Km=" + this.ride5Km + ", ride10Km=" + this.ride10Km + ", ride20Km=" + this.ride20Km + ", ride40Km=" + this.ride40Km + ", ride5Mi=" + this.ride5Mi + ", ride10Mi=" + this.ride10Mi + ", ride20Mi=" + this.ride20Mi + ", ride40Mi=" + this.ride40Mi + ", hasRun3Km=" + this.a + ", hasRun5Km=" + this.b + ", hasRun10Km=" + this.c + ", hasRun3Mi=" + this.d + ", hasRun5Mi=" + this.e + ", hasRun10Mi=" + this.f + ", hasRide5Km=" + this.g + ", hasRide10Km=" + this.h + ", hasRide20Km=" + this.i + ", hasRide40Km=" + this.j + ", hasRide5Mi=" + this.k + ", hasRide10Mi=" + this.l + ", hasRide20Mi=" + this.m + ", hasRide40Mi=" + this.n + '}';
    }
}
