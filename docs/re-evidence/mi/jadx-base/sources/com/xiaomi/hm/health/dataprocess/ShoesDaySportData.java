package com.xiaomi.hm.health.dataprocess;

import android.text.TextUtils;
import android.util.SparseArray;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import defpackage.le;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class ShoesDaySportData extends BaseDaySportData {
    private static final int DAY_SPORT_LEN = 1440;
    private static final String TAG = "DRD";
    private SparseArray<ShoesSportData> mIndexedDateRawData;
    private final StepsInfo mStepsInfo = new StepsInfo();
    private boolean mIsInParsedState = false;
    private int mDatastatus = 0;
    public int mStepGoal = -1;

    public static class ShoesDateSummary {
        private static final String KEY_CAL = "cal";
        private static final String KEY_DATE_STEP_CNT_GOAL = "goal";
        private static final String KEY_DIS = "dis";
        private static final String KEY_RUN_CAL = "rcal";
        private static final String KEY_RUN_DIST = "rdis";
        private static final String KEY_RUN_FOREFOOT_STEPS = "rfttl";
        private static final String KEY_RUN_STEPS = "rttl";
        private static final String KEY_RUN_TIME = "rn";
        private static final String KEY_STEPS = "ttl";
        private static final String KEY_VERSION = "v";
        private static final String KEY_WALK_TIME = "wk";
        private int mCal = 0;
        private int mRunCal = 0;
        private int mRunSteps = 0;
        private int mSteps = 0;
        private int mRunDis = 0;
        private int mTotalDis = 0;
        private int mRunTime = 0;
        private int mWalkTime = 0;
        private int mVersion = 1;
        private int mForefootRunSteps = 0;
        private int mGoal = 8000;
        private String mUUID = "";

        public JSONObject createJsonSummary(int i) {
            this.mGoal = i;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("goal", this.mGoal);
                jSONObject.put("v", this.mVersion);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("rn", this.mRunTime);
                jSONObject2.put("wk", this.mWalkTime);
                jSONObject2.put("cal", this.mCal);
                jSONObject2.put(KEY_RUN_CAL, this.mRunCal);
                jSONObject2.put(KEY_RUN_DIST, this.mRunDis);
                jSONObject2.put("dis", this.mTotalDis);
                jSONObject2.put("ttl", this.mSteps);
                jSONObject2.put(KEY_RUN_STEPS, this.mRunSteps);
                jSONObject2.put(KEY_RUN_FOREFOOT_STEPS, this.mForefootRunSteps);
                jSONObject.put(StepsInfo.KEY_STEP_INFO, jSONObject2);
            } catch (JSONException e) {
                le.c("SDM", e.getMessage(), new Object[0]);
            }
            return jSONObject;
        }

        public int getCal() {
            return this.mCal;
        }

        public int getDistance() {
            return this.mTotalDis;
        }

        public int getForefootSteps() {
            return this.mForefootRunSteps;
        }

        public int getGoal() {
            return this.mGoal;
        }

        public int getRunCal() {
            return this.mRunCal;
        }

        public int getRunDistance() {
            return this.mRunDis;
        }

        public int getRunSteps() {
            return this.mRunSteps;
        }

        public int getRunTime() {
            return this.mRunTime;
        }

        public int getStepCal() {
            return this.mCal - this.mRunCal;
        }

        public int getStepDistance() {
            return this.mTotalDis - this.mRunDis;
        }

        public int getSteps() {
            return this.mSteps;
        }

        public String getSummary(int i) {
            return createJsonSummary(i).toString();
        }

        public int getTime() {
            return this.mWalkTime + this.mRunTime;
        }

        public String getUUID() {
            return this.mUUID;
        }

        public int getWalkCal() {
            return this.mCal - this.mRunCal;
        }

        public int getWalkDistance() {
            return this.mTotalDis - this.mRunDis;
        }

        public int getWalkTime() {
            return this.mWalkTime;
        }

        public boolean parse(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.mVersion = jSONObject.optInt("v");
                this.mGoal = jSONObject.optInt("goal");
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(StepsInfo.KEY_STEP_INFO);
                if (jSONObjectOptJSONObject == null) {
                    return false;
                }
                this.mRunTime = jSONObjectOptJSONObject.optInt("rn");
                this.mWalkTime = jSONObjectOptJSONObject.optInt("wk");
                this.mCal = jSONObjectOptJSONObject.optInt("cal");
                this.mRunCal = jSONObjectOptJSONObject.optInt(KEY_RUN_CAL);
                this.mTotalDis = jSONObjectOptJSONObject.optInt("dis");
                this.mSteps = jSONObjectOptJSONObject.optInt("ttl");
                this.mRunSteps = jSONObjectOptJSONObject.optInt(KEY_RUN_STEPS);
                this.mForefootRunSteps = jSONObjectOptJSONObject.optInt(KEY_RUN_FOREFOOT_STEPS);
                this.mRunDis = jSONObjectOptJSONObject.optInt(KEY_RUN_DIST);
                return true;
            } catch (JSONException e) {
                le.b("SDM", e.getMessage(), new Object[0]);
                return false;
            }
        }

        public void setCal(int i) {
            this.mCal = i;
        }

        public void setDistance(int i) {
            this.mTotalDis = i;
        }

        public void setForefootStep(int i) {
            this.mForefootRunSteps = i;
        }

        public void setGoal(int i) {
            this.mGoal = i;
        }

        public void setRunCal(int i) {
            this.mRunCal = i;
        }

        public void setRunDistance(int i) {
            this.mRunDis = i;
        }

        public void setRunSteps(int i) {
            this.mRunSteps = i;
        }

        public void setRunTime(int i) {
            this.mRunTime = i;
        }

        public void setSteps(int i) {
            this.mSteps = i;
        }

        public void setWalkTime(int i) {
            this.mWalkTime = i;
        }

        public String toString() {
            return "ShoesDateSummary: mRunTime = " + this.mRunTime + ",mWalkTime = " + this.mWalkTime + ",mRunCal = " + this.mRunCal + ",mCal = " + this.mCal + ",mRunDis = " + this.mRunDis + ",mDis = " + this.mTotalDis + ",mSteps = " + this.mSteps + ",mForefootRunSteps = " + this.mForefootRunSteps + ",mVersion = " + this.mVersion + ",mGoal = " + this.mGoal;
        }
    }

    public ShoesDaySportData(SportDay sportDay) {
        this.mIndexedDateRawData = null;
        this.sportDay = sportDay;
        this.mIndexedDateRawData = new SparseArray<>(DAY_SPORT_LEN);
        for (int i = 0; i < DAY_SPORT_LEN; i++) {
            this.mIndexedDateRawData.put(i, new ShoesSportData((byte) 126, (byte) 0, (byte) 0));
        }
    }

    private ShoesSportData getValidIndexData(int i) {
        ShoesSportData shoesSportData = this.mIndexedDateRawData.get(i);
        if (shoesSportData.getMode() != 126) {
            return shoesSportData;
        }
        return null;
    }

    private void setParsedState(boolean z) {
        this.mIsInParsedState = z;
    }

    public void clean() {
        SparseArray<ShoesSportData> sparseArray = this.mIndexedDateRawData;
        if (sparseArray != null) {
            sparseArray.clear();
            this.mIndexedDateRawData = null;
        }
        this.mStepsInfo.clear();
    }

    public void clear() {
        SparseArray<ShoesSportData> sparseArray = this.mIndexedDateRawData;
        if (sparseArray != null) {
            sparseArray.clear();
            for (int i = 0; i < DAY_SPORT_LEN; i++) {
                this.mIndexedDateRawData.put(i, new ShoesSportData((byte) 126, (byte) 0, (byte) 0));
            }
        }
        this.mDatastatus = 0;
        this.mStepsInfo.clear();
    }

    public byte[] getBinaryData() {
        int size = this.mIndexedDateRawData.size();
        byte[] bArr = new byte[size * 3];
        for (int i = 0; i < size; i++) {
            byte[] bytes = this.mIndexedDateRawData.get(i).toBytes();
            int i2 = i * 3;
            bArr[i2] = bytes[0];
            bArr[i2 + 1] = bytes[1];
            bArr[i2 + 2] = bytes[2];
        }
        return bArr;
    }

    public int getDataSize() {
        return this.mIndexedDateRawData.size();
    }

    public int getDay() {
        return this.sportDay.day;
    }

    public ShoesSportData getMinuteData(int i) {
        return getValidIndexData(i);
    }

    public int getMonth() {
        return this.sportDay.mon;
    }

    public String getShoesSummary(int i) {
        if (this.mStepsInfo == null) {
            return null;
        }
        ShoesDateSummary shoesDateSummary = new ShoesDateSummary();
        shoesDateSummary.setRunTime(this.mStepsInfo.getRunTimeCount());
        shoesDateSummary.setWalkTime(this.mStepsInfo.getStepsTimeCount());
        shoesDateSummary.setSteps(this.mStepsInfo.getStepsCount());
        shoesDateSummary.setForefootStep(this.mStepsInfo.getforefootSteps());
        shoesDateSummary.setRunDistance(this.mStepsInfo.getRunDistance());
        shoesDateSummary.setDistance(this.mStepsInfo.getDistance());
        shoesDateSummary.setRunCal(this.mStepsInfo.getRunCalories());
        shoesDateSummary.setCal(this.mStepsInfo.getCalories());
        shoesDateSummary.setGoal(i);
        return shoesDateSummary.getSummary(i);
    }

    public StepsInfo getStepsInfo() {
        return this.mStepsInfo;
    }

    public String getSummary(int i) {
        return getShoesSummary(i);
    }

    public int getmDatastatus() {
        return this.mDatastatus;
    }

    public SparseArray<ShoesSportData> getmIndexedDateRawData() {
        return this.mIndexedDateRawData;
    }

    public int getmStepGoal() {
        return this.mStepGoal;
    }

    public boolean isAnalysisFinished() {
        return 3 == this.mDatastatus;
    }

    public boolean isEmpty() {
        return this.mDatastatus == 0;
    }

    public boolean isLoading() {
        return 4 == this.mDatastatus;
    }

    public boolean isNeedParseData() {
        return !this.mIsInParsedState;
    }

    public void merge(ShoesDaySportData shoesDaySportData) {
        for (int i = 0; i < DAY_SPORT_LEN; i++) {
            setMinuteData(i, shoesDaySportData.getMinuteData(i));
        }
    }

    public void parseGoalFromSummery(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.mStepGoal = new JSONObject(str).optInt(FitnessPersistKey.Rainbow);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void setDataStastus(int i) {
        this.mDatastatus = i;
    }

    public boolean setMinuteData(int i, ShoesSportData shoesSportData) {
        if (getValidIndexData(i) != null || shoesSportData == null) {
            return false;
        }
        this.mIndexedDateRawData.put(i, shoesSportData);
        setParsedState(false);
        return true;
    }

    public boolean setRawData(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        int length = bArr.length;
        if (length % 3 != 0) {
            return false;
        }
        for (int i = 0; i < length; i += 3) {
            this.mIndexedDateRawData.put(i / 3, new ShoesSportData(bArr[i], bArr[i + 1], bArr[i + 2]));
        }
        setParsedState(false);
        return true;
    }

    public void setStepsInfo(StepsInfo stepsInfo) {
        this.mStepsInfo.copy(stepsInfo);
        setParsedState(true);
    }

    public void setmIndexedDateRawData(SparseArray<ShoesSportData> sparseArray) {
        this.mIndexedDateRawData = sparseArray;
    }

    public void setmStepGoal(int i) {
        this.mStepGoal = i;
    }
}
