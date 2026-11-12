package com.xiaomi.hm.health.dataprocess;

import android.text.TextUtils;
import com.facebook.appevents.UserDataStore;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.event.StatEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class DaySportData extends BaseDaySportData implements Serializable {
    private static final int DAY_SPORT_8_BYTE_LEN = 11520;
    private static final int DAY_SPORT_LEN = 1440;
    private static final long serialVersionUID = 1;
    private ArrayList<SportData> datas;
    private boolean is8Byte;
    private int mDatastatus;
    private byte[] mHrBytes;
    private SleepInfo mSleepInfo;
    private int mStepGoal;
    private StepsInfo mStepsInfo;
    private int version;

    public DaySportData(Calendar calendar) {
        this(new SportDay(calendar));
    }

    private byte[] get4BinaryData() {
        byte[] bArr = new byte[this.datas.size() * 3];
        for (int i = 0; i < this.datas.size(); i++) {
            SportData sportData = this.datas.get(i);
            int i2 = i * 3;
            bArr[i2] = (byte) sportData.getSportMode();
            bArr[i2 + 1] = (byte) sportData.getActivity();
            bArr[i2 + 2] = (byte) sportData.getStep();
        }
        return bArr;
    }

    private byte[] get8BinaryData() {
        byte[] bArr = new byte[this.datas.size() * 8];
        for (int i = 0; i < this.datas.size(); i++) {
            SportData sportData = this.datas.get(i);
            int i2 = i * 8;
            bArr[i2] = (byte) sportData.getSportMode();
            bArr[i2 + 1] = (byte) sportData.getActivity();
            bArr[i2 + 2] = (byte) sportData.getStep();
            bArr[i2 + 3] = (byte) sportData.getHR();
            bArr[i2 + 4] = (byte) sportData.getRetain();
            bArr[i2 + 5] = (byte) sportData.getSleepPostureAndProb();
            bArr[i2 + 6] = (byte) sportData.getSleepProbDeep();
            bArr[i2 + 7] = (byte) sportData.getSleepProbRem();
        }
        return bArr;
    }

    public void add(SportData sportData) {
        int timeIndex = sportData.getTimeIndex();
        if (this.datas.get(timeIndex).getSportMode() == 126) {
            this.datas.set(timeIndex, sportData);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(sportData.getTimeIndex());
        sb.append(",step=");
        sb.append(sportData.getStep());
        sb.append(",hr=");
        sb.append(sportData.getHR());
        HMLog.i("DaySportData", sb, new Object[0]);
    }

    public void clean() {
        ArrayList<SportData> arrayList = this.datas;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.datas.clear();
            this.datas = null;
        }
        StepsInfo stepsInfo = this.mStepsInfo;
        if (stepsInfo != null) {
            stepsInfo.clear();
            this.mStepsInfo = null;
        }
        SleepInfo sleepInfo = this.mSleepInfo;
        if (sleepInfo != null) {
            sleepInfo.clear();
            this.mSleepInfo = null;
        }
    }

    public void clear() {
        ArrayList<SportData> arrayList = this.datas;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.datas.clear();
            for (int i = 0; i < 1440; i++) {
                this.datas.add(new SportData(i, 126, 0, 0));
            }
        }
        this.mDatastatus = 5;
        this.mStepsInfo = null;
        this.mSleepInfo = null;
    }

    public ArrayList<SportData> data() {
        return this.datas;
    }

    public void fromBinaryData(byte[] bArr) {
        int length = bArr.length;
        for (int i = 0; i < length; i += 3) {
            add(new SportData(i / 3, bArr[i] & 255, bArr[i + 1] & 255, bArr[i + 2] & 255));
        }
    }

    public void fromBinaryWithHRData(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        this.mHrBytes = bArr2;
        int i = 0;
        if (length == DAY_SPORT_8_BYTE_LEN) {
            set8Byte(true);
            while (i < length) {
                add(new SportData(i / 8, bArr[i] & 255, bArr[i + 1] & 255, bArr[i + 2] & 255, this.mHrBytes == null ? (byte) -2 : bArr2[i / 8], bArr[i + 4] & 255, bArr[i + 5] & 255, bArr[i + 6] & 255, bArr[i + 7] & 255));
                i += 8;
            }
            return;
        }
        set8Byte(false);
        while (i < length) {
            add(new SportData(i / 3, bArr[i] & 255, bArr[i + 1] & 255, bArr[i + 2] & 255, (this.mHrBytes == null ? (byte) -2 : bArr2[i / 3]) & 255));
            i += 3;
        }
    }

    public byte[] getAlgo8BinaryData() {
        byte[] bArr = new byte[this.datas.size() * 7];
        for (int i = 0; i < this.datas.size(); i++) {
            SportData sportData = this.datas.get(i);
            int i2 = i * 7;
            bArr[i2] = (byte) sportData.getSportMode();
            bArr[i2 + 1] = (byte) sportData.getActivity();
            bArr[i2 + 2] = (byte) sportData.getStep();
            bArr[i2 + 3] = (byte) sportData.getRetain();
            bArr[i2 + 4] = (byte) sportData.getSleepPostureAndProb();
            bArr[i2 + 5] = (byte) sportData.getSleepProbDeep();
            bArr[i2 + 6] = (byte) sportData.getSleepProbRem();
        }
        return bArr;
    }

    public byte[] getAlgoBinaryData() {
        return getAlgo8BinaryData();
    }

    public byte[] getBinaryData() {
        return is8Byte() ? get8BinaryData() : get4BinaryData();
    }

    public byte[] getBinaryHRData() {
        return this.mHrBytes;
    }

    public byte[] getBinaryHRDataOrigin() {
        byte[] bArr = new byte[this.datas.size()];
        int size = this.datas.size();
        for (int i = 0; i < size; i++) {
            bArr[i] = (byte) this.datas.get(i).getHR();
        }
        return bArr;
    }

    public ArrayList<SportData> getDatas() {
        return this.datas;
    }

    public int getDay() {
        return this.sportDay.day;
    }

    public String getHRSummary(String str) {
        int i = 0;
        for (int i2 = 0; i2 < this.datas.size(); i2++) {
            if (HeartRateInfo.isHRValueValid(this.datas.get(i2).getHR())) {
                i++;
            }
        }
        JSONObject jSONObject = null;
        if (str == null) {
            str = "";
        }
        try {
            jSONObject = TextUtils.isEmpty(str) ? new JSONObject() : new JSONObject(str);
            jSONObject.put(UserDataStore.CITY, i);
            if (jSONObject.optJSONArray("id") == null) {
                jSONObject.put("id", new JSONArray());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public String getKey() {
        return this.sportDay.getKey();
    }

    public long getLastValidDataTime() {
        ArrayList<SportData> arrayList = this.datas;
        if (arrayList == null || arrayList.isEmpty()) {
            return Calendar.getInstance().getTimeInMillis();
        }
        int i = 0;
        for (int size = this.datas.size() - 1; size >= 0; size--) {
            SportData sportData = this.datas.get(size);
            if ((sportData.getSportMode() != 126 || (sportData.getSportMode() == 126 && (sportData.getActivity() > 0 || sportData.getStep() > 0))) && sportData.getSportMode() != 127) {
                i = size;
                break;
            }
        }
        return this.sportDay.getTimestamp() + ((long) (i * 60 * 1000));
    }

    public int getMonth() {
        return this.sportDay.mon;
    }

    public String getNormandySummary(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("v", 5);
            StepsInfo stepsInfo = this.mStepsInfo;
            if (stepsInfo != null) {
                jSONObject.put(StepsInfo.KEY_STEP_INFO, stepsInfo.getSummaryJson());
            }
            jSONObject.put(StatEvent.EventParams.TYPE_CARD_GOAL, i);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public SleepInfo getSleepInfo() {
        return this.mSleepInfo;
    }

    public StepsInfo getStepsInfo() {
        return this.mStepsInfo;
    }

    public String getSummary(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("v", this.version);
            SleepInfo sleepInfo = this.mSleepInfo;
            if (sleepInfo != null) {
                jSONObject.put("slp", sleepInfo.getSummaryJson());
            }
            StepsInfo stepsInfo = this.mStepsInfo;
            if (stepsInfo != null) {
                jSONObject.put(StepsInfo.KEY_STEP_INFO, stepsInfo.getSummaryJson());
            }
            jSONObject.put(StatEvent.EventParams.TYPE_CARD_GOAL, i);
            jSONObject.put("tz", "" + (Calendar.getInstance().getTimeZone().getRawOffset() / 1000));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public long getTimestamp() {
        return this.sportDay.getTimestamp();
    }

    public int getYear() {
        return this.sportDay.year;
    }

    public int getmDatastatus() {
        return this.mDatastatus;
    }

    public int getmStepGoal() {
        return this.mStepGoal;
    }

    public boolean is8Byte() {
        return this.is8Byte;
    }

    public boolean isEmpty() {
        return this.mDatastatus == 0;
    }

    public void merge(DaySportData daySportData) {
        if (daySportData.is8Byte) {
            this.is8Byte = true;
        }
        ArrayList<SportData> arrayList = daySportData.datas;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            SportData sportData = arrayList.get(i);
            if ((sportData.getSportMode() != 126 || (sportData.getSportMode() == 126 && (sportData.getActivity() > 0 || sportData.getStep() > 0))) && sportData.getSportMode() != 127) {
                add(sportData);
            }
        }
    }

    public void parseGoalFromSummery(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.mStepGoal = new JSONObject(str).optInt(StatEvent.EventParams.TYPE_CARD_GOAL);
        } catch (Exception e) {
            e.printStackTrace();
            this.mStepGoal = 10000;
        }
    }

    public void set8Byte(boolean z) {
        this.is8Byte = z;
    }

    public void setDataStastus(int i) {
        this.mDatastatus = i;
    }

    public void setDatas(ArrayList<SportData> arrayList) {
        this.datas = arrayList;
    }

    public void setInfos(StepsInfo stepsInfo, SleepInfo sleepInfo, int i) {
        this.mStepsInfo = stepsInfo;
        this.mSleepInfo = sleepInfo;
        this.mDatastatus = i;
    }

    public void setSleepInfo(SleepInfo sleepInfo) {
        this.mSleepInfo = sleepInfo;
    }

    public void setStepsInfo(StepsInfo stepsInfo) {
        this.mStepsInfo = stepsInfo;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public void setmStepGoal(int i) {
        this.mStepGoal = i;
    }

    public DaySportData(SportDay sportDay) {
        this.version = 6;
        this.datas = null;
        this.mStepsInfo = null;
        this.mSleepInfo = null;
        this.mDatastatus = 5;
        this.is8Byte = false;
        this.mStepGoal = -1;
        this.sportDay = sportDay;
        this.datas = new ArrayList<>(1440);
        for (int i = 0; i < 1440; i++) {
            this.datas.add(new SportData(i, 126, 0, 0));
        }
    }

    public byte[] getBinaryHRData(byte[] bArr) {
        byte[] bArr2 = new byte[this.datas.size()];
        if (bArr == null) {
            bArr = new byte[1440];
            Arrays.fill(bArr, (byte) -2);
        }
        int size = this.datas.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            bArr2[i] = -2;
            int hr = this.datas.get(i).getHR();
            int i2 = bArr[i] & 255;
            if (HeartRateInfo.isValueGetByMeasurred(i2)) {
                bArr2[i] = (byte) i2;
            } else {
                if (HeartRateInfo.isValueGetByMeasurred(hr)) {
                    bArr2[i] = (byte) hr;
                }
            }
            z = true;
        }
        if (z) {
            return bArr2;
        }
        return null;
    }

    public void add(SportData sportData, boolean z) {
        int step;
        int i;
        HMLog.i("xxx", "sensorhub step:" + sportData.getStep(), new Object[0]);
        int timeIndex = sportData.getTimeIndex();
        if (z) {
            int step2 = this.datas.get(timeIndex).getStep();
            HMLog.i("xxx", "origin step:" + step2, new Object[0]);
            step = step2 + sportData.getStep();
        } else {
            step = sportData.getStep();
        }
        HMLog.i("xxx", "index:" + timeIndex + ",step:" + step + ",needMerge:" + z, new Object[0]);
        if (step > 255) {
            i = step - 255;
            step = 255;
        } else {
            i = 0;
        }
        int i2 = timeIndex;
        boolean z2 = false;
        while (i > 0) {
            i2 = !z2 ? i2 - 1 : i2 + 1;
            if (i2 < 0) {
                i2 = timeIndex + 1;
                z2 = true;
            }
            SportData sportData2 = this.datas.get(i2);
            int step3 = sportData2.getStep() + i;
            if (step3 > 255) {
                i = step3 - 255;
                step3 = 255;
            } else {
                i = 0;
            }
            HMLog.i("xxx", "merge to old index:" + i2 + ",old steps:" + sportData2.getStep() + ",current steps:" + step3, new Object[0]);
            sportData2.setStep(step3);
            sportData2.setMode(sportData.getSportMode());
            sportData2.setActivity(sportData.getActivity());
        }
        this.datas.set(timeIndex, new SportData(timeIndex, sportData.getSportMode(), sportData.getActivity(), step));
    }
}
