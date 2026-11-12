package com.xiaomi.hm.health.bt.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.hm.health.bt.debug.Debug;
import java.util.Calendar;
import java.util.Date;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class WeightAdvData implements Parcelable {
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
    public static final int YB = 1;
    private static final float v = 65520.0f;
    private static final int w = 150;
    private static final int x = 180;
    private int a;
    private float b;
    private float c;
    private long d;
    private float e;
    private float f;
    private boolean g;
    private MeasureState h;
    private MeasureData i;
    private String j;
    private String k;
    private int l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private int q;
    private boolean r;
    private boolean s;
    private boolean t;
    private static final String u = WeightAdvData.class.getSimpleName();
    public static final Parcelable.Creator<WeightAdvData> CREATOR = new a();

    public class a implements Parcelable.Creator<WeightAdvData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeightAdvData createFromParcel(Parcel source) {
            return new WeightAdvData(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public WeightAdvData[] newArray(int size) {
            return new WeightAdvData[size];
        }
    }

    public WeightAdvData() {
        this.a = -1;
        this.b = -1.0f;
        this.c = -1.0f;
        this.d = -1L;
        this.e = -1.0f;
        this.f = -1.0f;
        this.g = false;
        this.h = MeasureState.NONE;
        this.i = null;
        this.j = "";
        this.k = "";
        this.l = -1;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = -1;
        this.r = false;
        this.s = false;
        this.t = false;
    }

    private void a() {
        this.e = convertToKg(this.b, this.a);
        this.f = getMax(this.a, this.g);
    }

    public static float convertTo(float weight, int unitFrom, int unitTo) {
        return WeightUnitUtilsKt.convertTo(weight, unitFrom, unitTo);
    }

    public static float convertToKg(float weight, int unitFrom) {
        return convertTo(weight, unitFrom, 0);
    }

    public static WeightAdvData fromJsonString(String jsonString) {
        WeightAdvData weightAdvData = new WeightAdvData();
        try {
            JSONObject jSONObject = new JSONObject(jsonString);
            weightAdvData.f = (float) jSONObject.optDouble(WEIGHTADVDATA_KEY_MAX);
            weightAdvData.b = (float) jSONObject.optDouble(WEIGHTADVDATA_KEY_VALUE);
            weightAdvData.a = jSONObject.optInt(WEIGHTADVDATA_KEY_UNIT);
            weightAdvData.c = (float) jSONObject.optDouble(WEIGHTADVDATA_KEY_BMI);
            weightAdvData.d = jSONObject.optLong(WEIGHTADVDATA_KEY_TIMESTAMP);
            weightAdvData.j = jSONObject.optString(WEIGHTADVDATA_KEY_DEVICE_ID);
            weightAdvData.e = (float) jSONObject.optDouble(WEIGHTADVDATA_KEY_VALUE_KG);
            weightAdvData.m = jSONObject.optBoolean(WEIGHTADVDATA_KEY_STABLE);
            weightAdvData.q = jSONObject.optInt(WEIGHTADVDATA_KEY_IMPEDANCE);
            weightAdvData.r = jSONObject.optBoolean(WEIGHTADVDATA_KEY_IS_IMPEDANCE_STABLE);
        } catch (Exception unused) {
        }
        return weightAdvData;
    }

    public static float getMax(int type, boolean isAmazfitScale) {
        return isAmazfitScale ? getMax(type, 180) : getMax(type);
    }

    public boolean checkTimestamp() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(14, 0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(this.d);
        if (calendar2.get(1) == calendar.get(1)) {
            return true;
        }
        Debug.fi(u, "wrong weight data time:" + calendar2.getTime() + "\nupdate time to current:" + calendar.getTime());
        this.d = calendar.getTimeInMillis();
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getBmi() {
        return this.c;
    }

    public String getDeviceId() {
        return this.j;
    }

    public int getImpedance() {
        return this.q;
    }

    public String getMacAddress() {
        return this.k;
    }

    public MeasureData getMeasureData() {
        return this.i;
    }

    public MeasureState getMeasureState() {
        return this.h;
    }

    public int getSourceValue() {
        return this.l;
    }

    public long getTimestamp() {
        return this.d;
    }

    public int getType() {
        return this.a;
    }

    public float getValue() {
        return this.b;
    }

    public float getValueKg() {
        return this.e;
    }

    public boolean isAmazfitScale() {
        return this.g;
    }

    public boolean isFinish() {
        return this.p;
    }

    public boolean isHistory() {
        return this.n;
    }

    public boolean isImpedanceStable() {
        return this.r;
    }

    public boolean isMeasurement() {
        return this.o;
    }

    public boolean isMemberChoose() {
        return this.t;
    }

    public boolean isOverload() {
        MeasureData measureData = this.i;
        return (measureData != null && measureData.isOverLoad()) || this.b == v;
    }

    public boolean isPart() {
        return this.s;
    }

    public boolean isStable() {
        return this.m;
    }

    public void setAmazfitScale(boolean amazfitScale) {
        this.g = amazfitScale;
        a();
    }

    public void setBmi(float bmi) {
        this.c = bmi;
    }

    public void setDeviceId(String id) {
        this.j = id;
    }

    public void setFinish(boolean finish) {
        this.p = finish;
    }

    public void setHistory(boolean history) {
        this.n = history;
    }

    public void setImpedance(int impedance) {
        this.q = impedance;
    }

    public void setImpedanceStable(boolean isStable) {
        this.r = isStable;
    }

    public void setMacAddress(String macAddress) {
        this.k = macAddress;
    }

    public void setMeasureData(MeasureData measureData) {
        this.i = measureData;
    }

    public void setMeasureState(MeasureState measureState) {
        this.h = measureState;
    }

    public void setMeasurement(boolean measurement) {
        this.o = measurement;
    }

    public void setMemberChoose(boolean memberChoose) {
        this.t = memberChoose;
    }

    public void setPart(boolean part) {
        this.s = part;
    }

    public void setSourceValue(int sourceValue) {
        this.l = sourceValue;
    }

    public void setStable(boolean stable) {
        this.m = stable;
    }

    public void setTimestamp(long timestamp) {
        this.d = timestamp;
    }

    public void setType(int type) {
        this.a = type;
        a();
    }

    public void setValue(float value) {
        this.b = value;
        a();
    }

    public void setValueKg(float value) {
        this.e = value;
    }

    public String toJsonString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(WEIGHTADVDATA_KEY_MAX, this.f);
            jSONObject.put(WEIGHTADVDATA_KEY_VALUE, this.b);
            jSONObject.put(WEIGHTADVDATA_KEY_UNIT, this.a);
            jSONObject.put(WEIGHTADVDATA_KEY_BMI, this.c);
            jSONObject.put(WEIGHTADVDATA_KEY_TIMESTAMP, this.d);
            jSONObject.put(WEIGHTADVDATA_KEY_DEVICE_ID, this.j);
            jSONObject.put(WEIGHTADVDATA_KEY_VALUE_KG, this.e);
            jSONObject.put(WEIGHTADVDATA_KEY_STABLE, this.m);
            jSONObject.put(WEIGHTADVDATA_KEY_IMPEDANCE, this.q);
            jSONObject.put(WEIGHTADVDATA_KEY_IS_IMPEDANCE_STABLE, this.r);
        } catch (Exception unused) {
        }
        Debug.i(u, "WeightAdvData toString " + jSONObject.toString());
        return jSONObject.toString();
    }

    public String toString() {
        return "\n<\ntype:" + this.a + "\nvalue:" + this.b + "\nvalueKg:" + this.e + "\ntimestamp:" + this.d + "\ndate:" + new Date(this.d).toString() + "\nisMeasurement:" + this.o + "\nstable:" + this.m + "\nisHistory:" + this.n + "\nisFinish:" + this.p + "\nimpedance:" + this.q + "\nisImpedanceStable:" + this.r + "\nmeasureData: " + this.i + "\n>";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeLong(this.d);
        parcel.writeFloat(this.e);
        parcel.writeFloat(this.f);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        MeasureState measureState = this.h;
        parcel.writeInt(measureState == null ? -1 : measureState.ordinal());
        parcel.writeParcelable(this.i, i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeInt(this.l);
        parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.p ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.q);
        parcel.writeByte(this.r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.s ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.t ? (byte) 1 : (byte) 0);
    }

    public static float getMax(int type, int value) {
        return WeightUnitUtilsKt.getUnitScaleToKg(type) * value;
    }

    public static float getMax(int type) {
        return getMax(type, 150);
    }

    public float getMax() {
        return this.f;
    }

    public WeightAdvData(int type, float value, long timestamp, boolean isStable, boolean isMeasurement, boolean isHistory, boolean isFinish) {
        this.a = -1;
        this.b = -1.0f;
        this.c = -1.0f;
        this.d = -1L;
        this.e = -1.0f;
        this.f = -1.0f;
        this.g = false;
        this.h = MeasureState.NONE;
        this.i = null;
        this.j = "";
        this.k = "";
        this.l = -1;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = -1;
        this.r = false;
        this.s = false;
        this.t = false;
        this.a = type;
        this.b = value;
        this.d = timestamp;
        this.m = isStable;
        this.o = isMeasurement;
        this.n = isHistory;
        this.p = isFinish;
        a();
    }

    public WeightAdvData(Parcel in) {
        this.a = -1;
        this.b = -1.0f;
        this.c = -1.0f;
        this.d = -1L;
        this.e = -1.0f;
        this.f = -1.0f;
        this.g = false;
        this.h = MeasureState.NONE;
        this.i = null;
        this.j = "";
        this.k = "";
        this.l = -1;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = -1;
        this.r = false;
        this.s = false;
        this.t = false;
        this.a = in.readInt();
        this.b = in.readFloat();
        this.c = in.readFloat();
        this.d = in.readLong();
        this.e = in.readFloat();
        this.f = in.readFloat();
        this.g = in.readByte() != 0;
        int i = in.readInt();
        this.h = i != -1 ? MeasureState.values()[i] : null;
        this.i = (MeasureData) in.readParcelable(MeasureData.class.getClassLoader());
        this.j = in.readString();
        this.k = in.readString();
        this.l = in.readInt();
        this.m = in.readByte() != 0;
        this.n = in.readByte() != 0;
        this.o = in.readByte() != 0;
        this.p = in.readByte() != 0;
        this.q = in.readInt();
        this.r = in.readByte() != 0;
        this.s = in.readByte() != 0;
        this.t = in.readByte() != 0;
    }
}
