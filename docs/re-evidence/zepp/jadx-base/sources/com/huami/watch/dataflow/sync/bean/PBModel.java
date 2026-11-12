package com.huami.watch.dataflow.sync.bean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class PBModel {
    private static final int SPORT_TYPE_BIKE = 9;
    private static final int SPORT_TYPE_OUTDOOR_RUN = 1;
    private static final String TAG = "PBModel";
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
    private boolean hasRun3Km = false;
    private boolean hasRun5Km = false;
    private boolean hasRun10Km = false;
    private boolean hasRun3Mi = false;
    private boolean hasRun5Mi = false;
    private boolean hasRun10Mi = false;
    private boolean hasRide5Km = false;
    private boolean hasRide10Km = false;
    private boolean hasRide20Km = false;
    private boolean hasRide40Km = false;
    private boolean hasRide5Mi = false;
    private boolean hasRide10Mi = false;
    private boolean hasRide20Mi = false;
    private boolean hasRide40Mi = false;

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

    public static class PauseInfo {
        public static final byte PAUSE_TYPE_AUTO = 1;
        public static final byte PAUSE_TYPE_MANUAL = 2;
        private long mStart = -1;
        private long mEnd = -1;
        private byte mPauseType = 2;

        public long getEnd() {
            return this.mEnd;
        }

        public byte getPauseType() {
            return this.mPauseType;
        }

        public long getStart() {
            return this.mStart;
        }

        public void setEnd(long j) {
            this.mEnd = j;
        }

        public void setPauseType(byte b) {
            this.mPauseType = b;
        }

        public void setStart(long j) {
            this.mStart = j;
        }
    }

    public static class RunningInfoPerKM {
        private long mTrackId = -1;
        private int mIndex = 0;
        private double mSpeed = 0.0d;
        private int mCostTime = 0;
        private int mTotalCostTime = 0;
        private int mUnit = 0;

        public long getCostTime() {
            return this.mCostTime;
        }

        public int getIndex() {
            return this.mIndex;
        }

        public double getSpeed() {
            return this.mSpeed;
        }

        public long getTotalCostTime() {
            return this.mTotalCostTime;
        }

        public long getTrackId() {
            return this.mTrackId;
        }

        public int getUnit() {
            return this.mUnit;
        }

        public void setCostTime(int i) {
            this.mCostTime = i;
        }

        public void setIndex(int i) {
            this.mIndex = i;
        }

        public void setSpeed(double d) {
            this.mSpeed = d;
        }

        public void setTotalCostTime(int i) {
            this.mTotalCostTime = i;
        }

        public void setTrackId(long j) {
            this.mTrackId = j;
        }

        public void setUnit(int i) {
            this.mUnit = i;
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0228 A[PHI: r15
      0x0228: PHI (r15v2 com.huami.watch.dataflow.sync.bean.PBModel$RunningInfoPerKM) = 
      (r15v1 com.huami.watch.dataflow.sync.bean.PBModel$RunningInfoPerKM)
      (r15v4 com.huami.watch.dataflow.sync.bean.PBModel$RunningInfoPerKM)
     binds: [B:96:0x01cc, B:109:0x01fb] A[DONT_GENERATE, DONT_INLINE]] */
    public static PBModel checkPBInfo(int i, List<RunningInfoPerKM> list, List<PauseInfo> list2) {
        RunningInfoPerKM runningInfoPerKM;
        RunningInfoPerKM runningInfoPerKM2;
        RunningInfoPerKM runningInfoPerKM3 = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i2 = 1;
        if (i != 1 && i != 9) {
            return null;
        }
        PBModel pBModel = new PBModel();
        int costTime = 0;
        int unit = list.get(0).getUnit();
        ArrayList<Integer> arrayList = new ArrayList();
        ArrayList<Integer> arrayList2 = new ArrayList();
        ArrayList<Integer> arrayList3 = new ArrayList();
        ArrayList<Integer> arrayList4 = new ArrayList();
        ArrayList<Integer> arrayList5 = new ArrayList();
        if (isPerKmDataContinuity(list)) {
            for (RunningInfoPerKM runningInfoPerKM4 : list) {
                costTime = (int) (((long) costTime) + runningInfoPerKM4.getCostTime());
                int index = runningInfoPerKM4.getIndex();
                if (i == 1 && (index + 1) % 3 == 0) {
                    Iterator it2 = arrayList.iterator();
                    int iIntValue = costTime;
                    while (it2.hasNext()) {
                        iIntValue -= ((Integer) it2.next()).intValue();
                    }
                    arrayList.add(Integer.valueOf(iIntValue));
                }
                int i3 = index + 1;
                if (i3 % 5 == 0) {
                    Iterator it3 = arrayList2.iterator();
                    int iIntValue2 = costTime;
                    while (it3.hasNext()) {
                        iIntValue2 -= ((Integer) it3.next()).intValue();
                    }
                    arrayList2.add(Integer.valueOf(iIntValue2));
                }
                if (i3 % 10 == 0) {
                    Iterator it4 = arrayList3.iterator();
                    int iIntValue3 = costTime;
                    while (it4.hasNext()) {
                        iIntValue3 -= ((Integer) it4.next()).intValue();
                    }
                    arrayList3.add(Integer.valueOf(iIntValue3));
                }
                if (i == 9) {
                    if (i3 % 20 == 0) {
                        Iterator it5 = arrayList4.iterator();
                        int iIntValue4 = costTime;
                        while (it5.hasNext()) {
                            iIntValue4 -= ((Integer) it5.next()).intValue();
                        }
                        arrayList4.add(Integer.valueOf(iIntValue4));
                    }
                    if (i3 % 40 == 0) {
                        Iterator it6 = arrayList5.iterator();
                        int iIntValue5 = costTime;
                        while (it6.hasNext()) {
                            iIntValue5 -= ((Integer) it6.next()).intValue();
                        }
                        arrayList5.add(Integer.valueOf(iIntValue5));
                    }
                }
            }
        } else {
            Iterator<RunningInfoPerKM> it7 = list.iterator();
            RunningInfoPerKM runningInfoPerKM5 = null;
            RunningInfoPerKM runningInfoPerKM6 = null;
            RunningInfoPerKM runningInfoPerKM7 = null;
            RunningInfoPerKM runningInfoPerKM8 = null;
            while (it7.hasNext()) {
                RunningInfoPerKM next = it7.next();
                Iterator<RunningInfoPerKM> it8 = it7;
                int index2 = next.getIndex();
                if (i == i2 && (index2 + 1) % 3 == 0) {
                    int timeCost = getTimeCost(next, list2);
                    if (runningInfoPerKM3 == null) {
                        if (index2 == 2) {
                            arrayList.add(Integer.valueOf(timeCost));
                        }
                    } else if (index2 == runningInfoPerKM3.getIndex() + 3) {
                        arrayList.add(Integer.valueOf(timeCost - getTimeCost(runningInfoPerKM3, list2)));
                    }
                    runningInfoPerKM3 = next;
                }
                int i4 = index2 + 1;
                if (i4 % 5 == 0) {
                    int timeCost2 = getTimeCost(next, list2);
                    if (runningInfoPerKM5 == null) {
                        if (index2 == 4) {
                            arrayList2.add(Integer.valueOf(timeCost2));
                        }
                        runningInfoPerKM = runningInfoPerKM3;
                    } else {
                        runningInfoPerKM = runningInfoPerKM3;
                        if (index2 == runningInfoPerKM5.getIndex() + 5) {
                            arrayList2.add(Integer.valueOf(timeCost2 - getTimeCost(runningInfoPerKM5, list2)));
                        }
                    }
                    runningInfoPerKM5 = next;
                } else {
                    runningInfoPerKM = runningInfoPerKM3;
                }
                if (i4 % 10 == 0) {
                    int timeCost3 = getTimeCost(next, list2);
                    if (runningInfoPerKM6 == null) {
                        runningInfoPerKM2 = runningInfoPerKM5;
                        if (index2 == 9) {
                            arrayList3.add(Integer.valueOf(timeCost3));
                        }
                    } else {
                        runningInfoPerKM2 = runningInfoPerKM5;
                        if (index2 == runningInfoPerKM6.getIndex() + 10) {
                            arrayList3.add(Integer.valueOf(timeCost3 - getTimeCost(runningInfoPerKM6, list2)));
                        }
                    }
                    runningInfoPerKM6 = next;
                } else {
                    runningInfoPerKM2 = runningInfoPerKM5;
                }
                if (i == 9) {
                    if (i4 % 20 == 0) {
                        int timeCost4 = getTimeCost(next, list2);
                        if (runningInfoPerKM7 == null) {
                            if (index2 == 19) {
                                arrayList4.add(Integer.valueOf(timeCost4));
                            }
                        } else if (index2 == runningInfoPerKM7.getIndex() + 20) {
                            arrayList4.add(Integer.valueOf(timeCost4 - getTimeCost(runningInfoPerKM7, list2)));
                        }
                        runningInfoPerKM7 = next;
                    }
                    if (i4 % 40 == 0) {
                        int timeCost5 = getTimeCost(next, list2);
                        RunningInfoPerKM runningInfoPerKM9 = runningInfoPerKM8;
                        if (runningInfoPerKM9 == null) {
                            if (index2 == 39) {
                                arrayList5.add(Integer.valueOf(timeCost5));
                            }
                        } else if (index2 == runningInfoPerKM9.getIndex() + 40) {
                            arrayList5.add(Integer.valueOf(timeCost5 - getTimeCost(runningInfoPerKM9, list2)));
                        }
                        runningInfoPerKM8 = next;
                    }
                }
                it7 = it8;
                runningInfoPerKM5 = runningInfoPerKM2;
                runningInfoPerKM3 = runningInfoPerKM;
                i2 = 1;
            }
        }
        int iIntValue6 = Integer.MAX_VALUE;
        if (!arrayList.isEmpty()) {
            int iIntValue7 = Integer.MAX_VALUE;
            for (Integer num : arrayList) {
                if (num.intValue() < iIntValue7) {
                    iIntValue7 = num.intValue();
                }
            }
            if (unit == 0) {
                pBModel.setRun3Km(iIntValue7);
            } else {
                pBModel.setRun3Mi(iIntValue7);
            }
        }
        if (!arrayList2.isEmpty()) {
            int iIntValue8 = Integer.MAX_VALUE;
            for (Integer num2 : arrayList2) {
                if (num2.intValue() < iIntValue8) {
                    iIntValue8 = num2.intValue();
                }
            }
            if (unit == 0) {
                if (i == 1) {
                    pBModel.setRun5Km(iIntValue8);
                } else {
                    pBModel.setRide5Km(iIntValue8);
                }
            } else if (i == 1) {
                pBModel.setRun5Mi(iIntValue8);
            } else {
                pBModel.setRide5Mi(iIntValue8);
            }
        }
        if (!arrayList3.isEmpty()) {
            int iIntValue9 = Integer.MAX_VALUE;
            for (Integer num3 : arrayList3) {
                if (num3.intValue() < iIntValue9) {
                    iIntValue9 = num3.intValue();
                }
            }
            if (unit == 0) {
                if (i == 1) {
                    pBModel.setRun10Km(iIntValue9);
                } else {
                    pBModel.setRide10Km(iIntValue9);
                }
            } else if (i == 1) {
                pBModel.setRun10Mi(iIntValue9);
            } else {
                pBModel.setRide10Mi(iIntValue9);
            }
        }
        if (!arrayList4.isEmpty()) {
            int iIntValue10 = Integer.MAX_VALUE;
            for (Integer num4 : arrayList4) {
                if (num4.intValue() < iIntValue10) {
                    iIntValue10 = num4.intValue();
                }
            }
            if (unit == 0) {
                pBModel.setRide20Km(iIntValue10);
            } else {
                pBModel.setRide20Mi(iIntValue10);
            }
        }
        if (!arrayList5.isEmpty()) {
            for (Integer num5 : arrayList5) {
                if (num5.intValue() < iIntValue6) {
                    iIntValue6 = num5.intValue();
                }
            }
            if (unit == 0) {
                pBModel.setRide40Km(iIntValue6);
            } else {
                pBModel.setRide40Mi(iIntValue6);
            }
        }
        return pBModel;
    }

    public static int getTimeCost(RunningInfoPerKM runningInfoPerKM, List<PauseInfo> list) {
        long totalCostTime = runningInfoPerKM.getTotalCostTime();
        for (PauseInfo pauseInfo : list) {
            long start = pauseInfo.getStart();
            long end = pauseInfo.getEnd();
            if (end - runningInfoPerKM.getTrackId() < runningInfoPerKM.getTotalCostTime()) {
                totalCostTime -= end - start;
            }
        }
        return (int) totalCostTime;
    }

    private static boolean isPerKmDataContinuity(List<RunningInfoPerKM> list) {
        int index = -1;
        for (RunningInfoPerKM runningInfoPerKM : list) {
            if (runningInfoPerKM.getIndex() != index + 1) {
                return false;
            }
            index = runningInfoPerKM.getIndex();
        }
        return true;
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
        if (this.hasRun3Km) {
            jSONObject.put("run_3_km", this.run3Km);
        }
        if (this.hasRun5Km) {
            jSONObject.put("run_5_km", this.run5Km);
        }
        if (this.hasRun10Km) {
            jSONObject.put("run_10_km", this.run10Km);
        }
        if (this.hasRun3Mi) {
            jSONObject.put("run_3_mi", this.run3Mi);
        }
        if (this.hasRun5Mi) {
            jSONObject.put("run_5_mi", this.run5Mi);
        }
        if (this.hasRun10Mi) {
            jSONObject.put("run_10_mi", this.run10Mi);
        }
        if (this.hasRide5Km) {
            jSONObject.put("ride_5_km", this.ride5Km);
        }
        if (this.hasRide10Km) {
            jSONObject.put("ride_10_km", this.ride10Km);
        }
        if (this.hasRide20Km) {
            jSONObject.put("ride_20_km", this.ride20Km);
        }
        if (this.hasRide40Km) {
            jSONObject.put("ride_40_km", this.ride40Km);
        }
        if (this.hasRide5Mi) {
            jSONObject.put("ride_5_mi", this.ride5Mi);
        }
        if (this.hasRide10Mi) {
            jSONObject.put("ride_10_mi", this.ride10Mi);
        }
        if (this.hasRide20Mi) {
            jSONObject.put("ride_20_mi", this.ride20Mi);
        }
        if (this.hasRide40Mi) {
            jSONObject.put("ride_40_mi", this.ride40Mi);
        }
    }

    public void setRide10Km(int i) {
        this.hasRide10Km = true;
        this.ride10Km = i;
    }

    public void setRide10Mi(int i) {
        this.hasRide10Mi = true;
        this.ride10Mi = i;
    }

    public void setRide20Km(int i) {
        this.hasRide20Km = true;
        this.ride20Km = i;
    }

    public void setRide20Mi(int i) {
        this.hasRide20Mi = true;
        this.ride20Mi = i;
    }

    public void setRide40Km(int i) {
        this.hasRide40Km = true;
        this.ride40Km = i;
    }

    public void setRide40Mi(int i) {
        this.hasRide40Mi = true;
        this.ride40Mi = i;
    }

    public void setRide5Km(int i) {
        this.hasRide5Km = true;
        this.ride5Km = i;
    }

    public void setRide5Mi(int i) {
        this.hasRide5Mi = true;
        this.ride5Mi = i;
    }

    public void setRun10Km(int i) {
        this.hasRun10Km = true;
        this.run10Km = i;
    }

    public void setRun10Mi(int i) {
        this.hasRun10Mi = true;
        this.run10Mi = i;
    }

    public void setRun3Km(int i) {
        this.hasRun3Km = true;
        this.run3Km = i;
    }

    public void setRun3Mi(int i) {
        this.hasRun3Mi = true;
        this.run3Mi = i;
    }

    public void setRun5Km(int i) {
        this.hasRun5Km = true;
        this.run5Km = i;
    }

    public void setRun5Mi(int i) {
        this.hasRun5Mi = true;
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
        return "PBModel{run3Km=" + this.run3Km + ", run5Km=" + this.run5Km + ", run10Km=" + this.run10Km + ", run3Mi=" + this.run3Mi + ", run5Mi=" + this.run5Mi + ", run10Mi=" + this.run10Mi + ", ride5Km=" + this.ride5Km + ", ride10Km=" + this.ride10Km + ", ride20Km=" + this.ride20Km + ", ride40Km=" + this.ride40Km + ", ride5Mi=" + this.ride5Mi + ", ride10Mi=" + this.ride10Mi + ", ride20Mi=" + this.ride20Mi + ", ride40Mi=" + this.ride40Mi + ", hasRun3Km=" + this.hasRun3Km + ", hasRun5Km=" + this.hasRun5Km + ", hasRun10Km=" + this.hasRun10Km + ", hasRun3Mi=" + this.hasRun3Mi + ", hasRun5Mi=" + this.hasRun5Mi + ", hasRun10Mi=" + this.hasRun10Mi + ", hasRide5Km=" + this.hasRide5Km + ", hasRide10Km=" + this.hasRide10Km + ", hasRide20Km=" + this.hasRide20Km + ", hasRide40Km=" + this.hasRide40Km + ", hasRide5Mi=" + this.hasRide5Mi + ", hasRide10Mi=" + this.hasRide10Mi + ", hasRide20Mi=" + this.hasRide20Mi + ", hasRide40Mi=" + this.hasRide40Mi + '}';
    }
}
