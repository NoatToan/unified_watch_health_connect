package com.xiaomi.hm.health.device.model;

import com.xiaomi.hm.health.bt.profile.gdsp.gps.KmPaceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.MarathonInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.MilePaceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportDetail;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class MarathonModel {
    private static final String a = "MarathonModel";
    private static final int b = 1;
    private static List<Marked> c = new ArrayList();
    private static List<Marked> d = new ArrayList();

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
        c.clear();
        d.clear();
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
                    c.add(marked);
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
                    d.add(marked2);
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

    public static List<MarathonInfo> checkMarathonInfo(int i, SportDetail sportDetail) {
        a(sportDetail);
        if ((c.isEmpty() && d.isEmpty()) || i != 1) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<Integer> arrayList2 = new ArrayList();
        ArrayList<Integer> arrayList3 = new ArrayList();
        ArrayList<Integer> arrayList4 = new ArrayList();
        ArrayList<Integer> arrayList5 = new ArrayList();
        if (!c.isEmpty()) {
            b(21, c, arrayList2);
            b(42, c, arrayList3);
        } else if (c.isEmpty() && !d.isEmpty()) {
            b(13, d, arrayList4);
            b(26, d, arrayList5);
        }
        int iIntValue = Integer.MAX_VALUE;
        if (!arrayList2.isEmpty()) {
            int iIntValue2 = Integer.MAX_VALUE;
            for (Integer num : arrayList2) {
                if (num.intValue() < iIntValue2) {
                    iIntValue2 = num.intValue();
                }
            }
            MarathonInfo marathonInfo = new MarathonInfo(0);
            marathonInfo.setDistance(21000L);
            marathonInfo.setTimeUsage(iIntValue2);
            arrayList.add(marathonInfo);
        }
        if (!arrayList4.isEmpty()) {
            int iIntValue3 = Integer.MAX_VALUE;
            for (Integer num2 : arrayList4) {
                if (num2.intValue() < iIntValue3) {
                    iIntValue3 = num2.intValue();
                }
            }
            MarathonInfo marathonInfo2 = new MarathonInfo(0);
            marathonInfo2.setDistance(22880L);
            marathonInfo2.setTimeUsage(iIntValue3);
            arrayList.add(marathonInfo2);
        }
        if (!arrayList3.isEmpty()) {
            int iIntValue4 = Integer.MAX_VALUE;
            for (Integer num3 : arrayList3) {
                if (num3.intValue() < iIntValue4) {
                    iIntValue4 = num3.intValue();
                }
            }
            MarathonInfo marathonInfo3 = new MarathonInfo(1);
            marathonInfo3.setDistance(42000L);
            marathonInfo3.setTimeUsage(iIntValue4);
            arrayList.add(marathonInfo3);
        }
        if (!arrayList5.isEmpty()) {
            for (Integer num4 : arrayList5) {
                if (num4.intValue() < iIntValue) {
                    iIntValue = num4.intValue();
                }
            }
            MarathonInfo marathonInfo4 = new MarathonInfo(1);
            marathonInfo4.setDistance(45760L);
            marathonInfo4.setTimeUsage(iIntValue);
            arrayList.add(marathonInfo4);
        }
        return arrayList;
    }
}
