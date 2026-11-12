package com.xiaomi.hm.health.bt.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ix;
import defpackage.t5t;
import defpackage.zk;
import java.util.Calendar;
import java.util.Date;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class WeightAdvData implements Parcelable {
    private static final int AMAZFIT_SCALE_MAX_VALUE = 180;
    public static final Parcelable.Creator<WeightAdvData> CREATOR = new a();
    private static final int DEFAULT_MAX_VALUE = 150;
    public static final int FINISH_MASK = 128;
    public static final int GRAM = 2;
    public static final int HISTORY_MASK = 64;
    public static final int IMPEDANCE_STABLE_MASK = 2;
    public static final int KG = 0;
    public static final int MEMBER_CHOOSE_MASK = 64;
    public static final int OUNCE = 3;
    public static final int PART_MASK = 4;
    public static final int SJ = 16;
    public static final int ST = 17;
    public static final int STABLE_MASK = 32;
    private static final String TAG = "WeightAdvData";
    public static final int UNIT_MASK = 17;
    public static final String WEIGHTADVDATA_KEY = "WEIGHTADVDATA_KEY";
    public static final String WEIGHTADVDATA_KEY_BMI = "WEIGHTADVDATA_KEY_BMI";
    public static final String WEIGHTADVDATA_KEY_DEVICE_ID = "WEIGHTADVDATA_KEY_DEVICE_ID";
    public static final String WEIGHTADVDATA_KEY_IMPEDANCE = "WEIGHTADVDATA_KEY_IMPEDANCE";
    public static final String WEIGHTADVDATA_KEY_IS_IMPEDANCE_STABLE = "WEIGHTADVDATA_KEY_IS_IMPEDANCE_STABLE";
    public static final String WEIGHTADVDATA_KEY_MAX = "WEIGHTADVDATA_KEY_MAX";
    public static final String WEIGHTADVDATA_KEY_STABLE = "WEIGHTADVDATA_KEY_STABLE";
    public static final String WEIGHTADVDATA_KEY_TIMESTAMP = "WEIGHTADVDATA_KEY_TIMESTAMP";
    public static final String WEIGHTADVDATA_KEY_UNIT = "WEIGHTADVDATA_KEY_UNIT";
    public static final String WEIGHTADVDATA_KEY_VALUE = "WEIGHTADVDATA_KEY_VALUE";
    public static final String WEIGHTADVDATA_KEY_VALUE_KG = "WEIGHTADVDATA_KEY_KG";
    public static final float WEIGHT_MAX_IN_SJ = 300.0f;
    private static final float WEIGHT_OVERLOAD_VALUE = 65520.0f;
    public static final int YB = 1;
    private float bmi;
    private String deviceId;
    private int deviceSourceValue;
    private int impedance;
    private boolean isAmazfitScale;
    private boolean isFinish;
    private boolean isHistory;
    private boolean isImpedanceStable;
    private boolean isMeasurement;
    private boolean isMemberChoose;
    private boolean isPart;
    private boolean isStable;
    private String macAddress;
    private float max;
    private MeasureData measureData;
    private zk measureState;
    private long timestamp;
    private int type;
    private float value;
    private float valueKg;

    public class a implements Parcelable.Creator<WeightAdvData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeightAdvData createFromParcel(Parcel parcel) {
            return new WeightAdvData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeightAdvData[] newArray(int i) {
            return new WeightAdvData[i];
        }
    }

    public WeightAdvData() {
        this.type = -1;
        this.value = -1.0f;
        this.bmi = -1.0f;
        this.timestamp = -1L;
        this.valueKg = -1.0f;
        this.max = -1.0f;
        this.isAmazfitScale = false;
        this.measureState = zk.NONE;
        this.measureData = null;
        this.deviceId = "";
        this.macAddress = "";
        this.deviceSourceValue = -1;
        this.isStable = false;
        this.isHistory = false;
        this.isMeasurement = false;
        this.isFinish = false;
        this.impedance = -1;
        this.isImpedanceStable = false;
        this.isPart = false;
        this.isMemberChoose = false;
    }

    public static float convertTo(float f, int i, int i2) {
        return ix.a(f, i, i2);
    }

    public static float convertToKg(float f, int i) {
        return convertTo(f, i, 0);
    }

    private void format() {
        this.valueKg = convertToKg(this.value, this.type);
        this.max = getMax(this.type, this.isAmazfitScale);
    }

    public static WeightAdvData fromJsonString(String str) {
        WeightAdvData weightAdvData = new WeightAdvData();
        try {
            JSONObject jSONObject = new JSONObject(str);
            weightAdvData.max = (float) jSONObject.optDouble(WEIGHTADVDATA_KEY_MAX);
            weightAdvData.value = (float) jSONObject.optDouble(WEIGHTADVDATA_KEY_VALUE);
            weightAdvData.type = jSONObject.optInt(WEIGHTADVDATA_KEY_UNIT);
            weightAdvData.bmi = (float) jSONObject.optDouble(WEIGHTADVDATA_KEY_BMI);
            weightAdvData.timestamp = jSONObject.optLong(WEIGHTADVDATA_KEY_TIMESTAMP);
            weightAdvData.deviceId = jSONObject.optString(WEIGHTADVDATA_KEY_DEVICE_ID);
            weightAdvData.valueKg = (float) jSONObject.optDouble(WEIGHTADVDATA_KEY_VALUE_KG);
            weightAdvData.isStable = jSONObject.optBoolean(WEIGHTADVDATA_KEY_STABLE);
            weightAdvData.impedance = jSONObject.optInt(WEIGHTADVDATA_KEY_IMPEDANCE);
            weightAdvData.isImpedanceStable = jSONObject.optBoolean(WEIGHTADVDATA_KEY_IS_IMPEDANCE_STABLE);
        } catch (Exception unused) {
        }
        return weightAdvData;
    }

    public static float getMax(int i, boolean z) {
        return z ? getMax(i, 180) : getMax(i);
    }

    public boolean checkTimestamp() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(14, 0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(this.timestamp);
        if (calendar2.get(1) == calendar.get(1)) {
            return true;
        }
        t5t.d(TAG, "wrong weight data time:" + calendar2.getTime() + "\nupdate time to current:" + calendar.getTime());
        this.timestamp = calendar.getTimeInMillis();
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getBmi() {
        return this.bmi;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public int getImpedance() {
        return this.impedance;
    }

    public String getMacAddress() {
        return this.macAddress;
    }

    public MeasureData getMeasureData() {
        return this.measureData;
    }

    public zk getMeasureState() {
        return this.measureState;
    }

    public int getSourceValue() {
        return this.deviceSourceValue;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public int getType() {
        return this.type;
    }

    public float getValue() {
        return this.value;
    }

    public float getValueKg() {
        return this.valueKg;
    }

    public boolean isAmazfitScale() {
        return this.isAmazfitScale;
    }

    public boolean isFinish() {
        return this.isFinish;
    }

    public boolean isHistory() {
        return this.isHistory;
    }

    public boolean isImpedanceStable() {
        return this.isImpedanceStable;
    }

    public boolean isMeasurement() {
        return this.isMeasurement;
    }

    public boolean isMemberChoose() {
        return this.isMemberChoose;
    }

    public boolean isOverload() {
        MeasureData measureData = this.measureData;
        return (measureData != null && measureData.getIsOverLoad()) || this.value == WEIGHT_OVERLOAD_VALUE;
    }

    public boolean isPart() {
        return this.isPart;
    }

    public boolean isStable() {
        return this.isStable;
    }

    public void setAmazfitScale(boolean z) {
        this.isAmazfitScale = z;
        format();
    }

    public void setBmi(float f) {
        this.bmi = f;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setFinish(boolean z) {
        this.isFinish = z;
    }

    public void setHistory(boolean z) {
        this.isHistory = z;
    }

    public void setImpedance(int i) {
        this.impedance = i;
    }

    public void setImpedanceStable(boolean z) {
        this.isImpedanceStable = z;
    }

    public void setMacAddress(String str) {
        this.macAddress = str;
    }

    public void setMeasureData(MeasureData measureData) {
        this.measureData = measureData;
    }

    public void setMeasureState(zk zkVar) {
        this.measureState = zkVar;
    }

    public void setMeasurement(boolean z) {
        this.isMeasurement = z;
    }

    public void setMemberChoose(boolean z) {
        this.isMemberChoose = z;
    }

    public void setPart(boolean z) {
        this.isPart = z;
    }

    public void setSourceValue(int i) {
        this.deviceSourceValue = i;
    }

    public void setStable(boolean z) {
        this.isStable = z;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }

    public void setType(int i) {
        this.type = i;
        format();
    }

    public void setValue(float f) {
        this.value = f;
        format();
    }

    public void setValueKg(float f) {
        this.valueKg = f;
    }

    public String toJsonString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(WEIGHTADVDATA_KEY_MAX, this.max);
            jSONObject.put(WEIGHTADVDATA_KEY_VALUE, this.value);
            jSONObject.put(WEIGHTADVDATA_KEY_UNIT, this.type);
            jSONObject.put(WEIGHTADVDATA_KEY_BMI, this.bmi);
            jSONObject.put(WEIGHTADVDATA_KEY_TIMESTAMP, this.timestamp);
            jSONObject.put(WEIGHTADVDATA_KEY_DEVICE_ID, this.deviceId);
            jSONObject.put(WEIGHTADVDATA_KEY_VALUE_KG, this.valueKg);
            jSONObject.put(WEIGHTADVDATA_KEY_STABLE, this.isStable);
            jSONObject.put(WEIGHTADVDATA_KEY_IMPEDANCE, this.impedance);
            jSONObject.put(WEIGHTADVDATA_KEY_IS_IMPEDANCE_STABLE, this.isImpedanceStable);
        } catch (Exception unused) {
        }
        t5t.m(TAG, "WeightAdvData toString " + jSONObject.toString());
        return jSONObject.toString();
    }

    public String toString() {
        return "\n<\ntype:" + this.type + "\nvalue:" + this.value + "\nvalueKg:" + this.valueKg + "\ntimestamp:" + this.timestamp + "\ndate:" + new Date(this.timestamp).toString() + "\nisMeasurement:" + this.isMeasurement + "\nstable:" + this.isStable + "\nisHistory:" + this.isHistory + "\nisFinish:" + this.isFinish + "\nimpedance:" + this.impedance + "\nisImpedanceStable:" + this.isImpedanceStable + "\nmeasureData: " + this.measureData + "\n>";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.type);
        parcel.writeFloat(this.value);
        parcel.writeFloat(this.bmi);
        parcel.writeLong(this.timestamp);
        parcel.writeFloat(this.valueKg);
        parcel.writeFloat(this.max);
        parcel.writeByte(this.isAmazfitScale ? (byte) 1 : (byte) 0);
        zk zkVar = this.measureState;
        parcel.writeInt(zkVar == null ? -1 : zkVar.ordinal());
        parcel.writeParcelable(this.measureData, i);
        parcel.writeString(this.deviceId);
        parcel.writeString(this.macAddress);
        parcel.writeInt(this.deviceSourceValue);
        parcel.writeByte(this.isStable ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isHistory ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isMeasurement ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isFinish ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.impedance);
        parcel.writeByte(this.isImpedanceStable ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isPart ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isMemberChoose ? (byte) 1 : (byte) 0);
    }

    public static float getMax(int i, int i2) {
        return ix.a(i) * i2;
    }

    public static float getMax(int i) {
        return getMax(i, 150);
    }

    public float getMax() {
        return this.max;
    }

    public WeightAdvData(int i, float f, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        this.type = -1;
        this.value = -1.0f;
        this.bmi = -1.0f;
        this.timestamp = -1L;
        this.valueKg = -1.0f;
        this.max = -1.0f;
        this.isAmazfitScale = false;
        this.measureState = zk.NONE;
        this.measureData = null;
        this.deviceId = "";
        this.macAddress = "";
        this.deviceSourceValue = -1;
        this.impedance = -1;
        this.isImpedanceStable = false;
        this.isPart = false;
        this.isMemberChoose = false;
        this.type = i;
        this.value = f;
        this.timestamp = j;
        this.isStable = z;
        this.isMeasurement = z2;
        this.isHistory = z3;
        this.isFinish = z4;
        format();
    }

    public WeightAdvData(Parcel parcel) {
        this.type = -1;
        this.value = -1.0f;
        this.bmi = -1.0f;
        this.timestamp = -1L;
        this.valueKg = -1.0f;
        this.max = -1.0f;
        this.isAmazfitScale = false;
        this.measureState = zk.NONE;
        this.measureData = null;
        this.deviceId = "";
        this.macAddress = "";
        this.deviceSourceValue = -1;
        this.isStable = false;
        this.isHistory = false;
        this.isMeasurement = false;
        this.isFinish = false;
        this.impedance = -1;
        this.isImpedanceStable = false;
        this.isPart = false;
        this.isMemberChoose = false;
        this.type = parcel.readInt();
        this.value = parcel.readFloat();
        this.bmi = parcel.readFloat();
        this.timestamp = parcel.readLong();
        this.valueKg = parcel.readFloat();
        this.max = parcel.readFloat();
        this.isAmazfitScale = parcel.readByte() != 0;
        int i = parcel.readInt();
        this.measureState = i != -1 ? zk.values()[i] : null;
        this.measureData = (MeasureData) parcel.readParcelable(MeasureData.class.getClassLoader());
        this.deviceId = parcel.readString();
        this.macAddress = parcel.readString();
        this.deviceSourceValue = parcel.readInt();
        this.isStable = parcel.readByte() != 0;
        this.isHistory = parcel.readByte() != 0;
        this.isMeasurement = parcel.readByte() != 0;
        this.isFinish = parcel.readByte() != 0;
        this.impedance = parcel.readInt();
        this.isImpedanceStable = parcel.readByte() != 0;
        this.isPart = parcel.readByte() != 0;
        this.isMemberChoose = parcel.readByte() != 0;
    }
}
