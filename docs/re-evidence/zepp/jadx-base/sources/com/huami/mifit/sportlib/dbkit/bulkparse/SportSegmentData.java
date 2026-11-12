package com.huami.mifit.sportlib.dbkit.bulkparse;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.mifit.sportlib.core.Geohash;
import com.huami.nfc.web.Constant;
import kotlin.Metadata;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b5\n\u0002\u0010\u0006\n\u0002\b-\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bi\u0010jJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\"\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\"\u0010\u0015\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\"\u0010\u0018\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\"\u0010\u001b\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\"\u0010\u001e\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\"\u0010!\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\n\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\"\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010*\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R$\u0010\u0003\u001a\u00020\b2\u0006\u0010-\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b.\u0010\fR\"\u0010/\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\n\u001a\u0004\b0\u0010\f\"\u0004\b1\u0010\u000eR\"\u00102\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\n\u001a\u0004\b3\u0010\f\"\u0004\b4\u0010\u000eR.\u00105\u001a\u0004\u0018\u00010\u00062\b\u00105\u001a\u0004\u0018\u00010\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010;\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010\n\u001a\u0004\b<\u0010\f\"\u0004\b=\u0010\u000eR\"\u0010?\u001a\u00020>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010@\u001a\u0004\bF\u0010B\"\u0004\bG\u0010DR\"\u0010H\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010\n\u001a\u0004\bI\u0010\f\"\u0004\bJ\u0010\u000eR\"\u0010K\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010\n\u001a\u0004\bL\u0010\f\"\u0004\bM\u0010\u000eR\"\u0010N\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010\n\u001a\u0004\bO\u0010\f\"\u0004\bP\u0010\u000eR\"\u0010Q\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010\n\u001a\u0004\bR\u0010\f\"\u0004\bS\u0010\u000eR\"\u0010T\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010\n\u001a\u0004\bU\u0010\f\"\u0004\bV\u0010\u000eR\"\u0010W\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010\n\u001a\u0004\bX\u0010\f\"\u0004\bY\u0010\u000eR\"\u0010Z\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010\n\u001a\u0004\b[\u0010\f\"\u0004\b\\\u0010\u000eR\"\u0010]\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010%\u001a\u0004\b^\u0010'\"\u0004\b_\u0010)R\"\u0010`\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010\n\u001a\u0004\ba\u0010\f\"\u0004\bb\u0010\u000eR\"\u0010c\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010\n\u001a\u0004\bd\u0010\f\"\u0004\be\u0010\u000eR\"\u0010f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010\n\u001a\u0004\bg\u0010\f\"\u0004\bh\u0010\u000e¨\u0006k"}, d2 = {"Lcom/huami/mifit/sportlib/dbkit/bulkparse/SportSegmentData;", "", "", "strokeSpeed", "", "setStrokeSpeed", "", "toString", "", "index", LogUtil.I, "getIndex", "()I", "setIndex", "(I)V", "costTime", "getCostTime", "setCostTime", "offsetTime", "getOffsetTime", "setOffsetTime", "timeDifference", "getTimeDifference", "setTimeDifference", "distance", "getDistance", "setDistance", "totalDistance", "getTotalDistance", "setTotalDistance", "type", "getType", "setType", "childType", "getChildType", "setChildType", Constants.DATA_KEY_AVG_PACE, "F", "getAvgPace", "()F", "setAvgPace", "(F)V", "maxPace", "getMaxPace", "setMaxPace", "<set-?>", "getStrokeSpeed", "strokes", "getStrokes", "setStrokes", "swolf", "getSwolf", "setSwolf", "geohash", "Ljava/lang/String;", "getGeohash", "()Ljava/lang/String;", "setGeohash", "(Ljava/lang/String;)V", "ropeSkippingCount", "getRopeSkippingCount", "setRopeSkippingCount", "", Constant.KEY_LATITUDE, LogUtil.D, "getLatitude", "()D", "setLatitude", "(D)V", Constant.KEY_LONGITUDE, "getLongitude", "setLongitude", "avgStepFreq", "getAvgStepFreq", "setAvgStepFreq", "cal", "getCal", "setCal", "avgHR", "getAvgHR", "setAvgHR", "weight", "getWeight", "setWeight", "count", "getCount", "setCount", "unit", "getUnit", "setUnit", "floor", "getFloor", "setFloor", "floorPerMin", "getFloorPerMin", "setFloorPerMin", "swimStyle", "getSwimStyle", "setSwimStyle", "trainGroupType", "getTrainGroupType", "setTrainGroupType", "strengthTrainType", "getStrengthTrainType", "setStrengthTrainType", "<init>", "()V", "sportlib_release"}, k = 1, mv = {1, 5, 1})
public final class SportSegmentData {
    private int avgHR = -1;
    private float avgPace;
    private int avgStepFreq;
    private int cal;
    private int childType;
    private int costTime;
    private int count;
    private int distance;
    private int floor;
    private float floorPerMin;

    @Nullable
    private String geohash;
    private int index;
    private double latitude;
    private double longitude;
    private float maxPace;
    private int offsetTime;
    private int ropeSkippingCount;
    private int strengthTrainType;
    private int strokeSpeed;
    private int strokes;
    private int swimStyle;
    private int swolf;
    private int timeDifference;
    private int totalDistance;
    private int trainGroupType;
    private int type;
    private int unit;
    private int weight;

    public final int getAvgHR() {
        return this.avgHR;
    }

    public final float getAvgPace() {
        return this.avgPace;
    }

    public final int getAvgStepFreq() {
        return this.avgStepFreq;
    }

    public final int getCal() {
        return this.cal;
    }

    public final int getChildType() {
        return this.childType;
    }

    public final int getCostTime() {
        return this.costTime;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final int getFloor() {
        return this.floor;
    }

    public final float getFloorPerMin() {
        return this.floorPerMin;
    }

    @Nullable
    public final String getGeohash() {
        return this.geohash;
    }

    public final int getIndex() {
        return this.index;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final float getMaxPace() {
        return this.maxPace;
    }

    public final int getOffsetTime() {
        return this.offsetTime;
    }

    public final int getRopeSkippingCount() {
        return this.ropeSkippingCount;
    }

    public final int getStrengthTrainType() {
        return this.strengthTrainType;
    }

    public final int getStrokeSpeed() {
        return this.strokeSpeed;
    }

    public final int getStrokes() {
        return this.strokes;
    }

    public final int getSwimStyle() {
        return this.swimStyle;
    }

    public final int getSwolf() {
        return this.swolf;
    }

    public final int getTimeDifference() {
        return this.timeDifference;
    }

    public final int getTotalDistance() {
        return this.totalDistance;
    }

    public final int getTrainGroupType() {
        return this.trainGroupType;
    }

    public final int getType() {
        return this.type;
    }

    public final int getUnit() {
        return this.unit;
    }

    public final int getWeight() {
        return this.weight;
    }

    public final void setAvgHR(int i) {
        this.avgHR = i;
    }

    public final void setAvgPace(float f) {
        this.avgPace = f;
    }

    public final void setAvgStepFreq(int i) {
        this.avgStepFreq = i;
    }

    public final void setCal(int i) {
        this.cal = i;
    }

    public final void setChildType(int i) {
        this.childType = i;
    }

    public final void setCostTime(int i) {
        this.costTime = i;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setDistance(int i) {
        this.distance = i;
    }

    public final void setFloor(int i) {
        this.floor = i;
    }

    public final void setFloorPerMin(float f) {
        this.floorPerMin = f;
    }

    public final void setGeohash(@Nullable String str) {
        this.geohash = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        double[] dArrDecode = Geohash.decode(str);
        this.latitude = dArrDecode[0];
        this.longitude = dArrDecode[1];
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setLatitude(double d) {
        this.latitude = d;
    }

    public final void setLongitude(double d) {
        this.longitude = d;
    }

    public final void setMaxPace(float f) {
        this.maxPace = f;
    }

    public final void setOffsetTime(int i) {
        this.offsetTime = i;
    }

    public final void setRopeSkippingCount(int i) {
        this.ropeSkippingCount = i;
    }

    public final void setStrengthTrainType(int i) {
        this.strengthTrainType = i;
    }

    public final void setStrokeSpeed(float strokeSpeed) {
        this.strokeSpeed = Math.round(strokeSpeed);
    }

    public final void setStrokes(int i) {
        this.strokes = i;
    }

    public final void setSwimStyle(int i) {
        this.swimStyle = i;
    }

    public final void setSwolf(int i) {
        this.swolf = i;
    }

    public final void setTimeDifference(int i) {
        this.timeDifference = i;
    }

    public final void setTotalDistance(int i) {
        this.totalDistance = i;
    }

    public final void setTrainGroupType(int i) {
        this.trainGroupType = i;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUnit(int i) {
        this.unit = i;
    }

    public final void setWeight(int i) {
        this.weight = i;
    }

    @NotNull
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(JsonLexerKt.BEGIN_LIST);
        stringBuffer.append("type=" + this.type + ",");
        stringBuffer.append("index=" + this.index + ",");
        stringBuffer.append("costTime=" + this.costTime + ",");
        stringBuffer.append("offsetTime=" + this.offsetTime + ",");
        stringBuffer.append("timeDifference=" + this.timeDifference + ",");
        stringBuffer.append("distance=" + this.distance + ",");
        stringBuffer.append("totalDistance=" + this.totalDistance + ",");
        stringBuffer.append("avgPace=" + this.avgPace + ",");
        stringBuffer.append("strokeSpeed=" + this.strokeSpeed + ",");
        stringBuffer.append("strokes=" + this.strokes + ",");
        stringBuffer.append("geohash=" + this.geohash + ",");
        stringBuffer.append("swolf=" + this.swolf + ",");
        stringBuffer.append("childType=" + this.childType + ",");
        stringBuffer.append("avgStepFreq=" + this.avgStepFreq + ",");
        stringBuffer.append("cal=" + this.cal);
        stringBuffer.append("weight=" + this.weight);
        stringBuffer.append("count=" + this.count);
        stringBuffer.append("unit=" + this.unit);
        stringBuffer.append("floor=" + this.floor);
        stringBuffer.append("floorPerMin=" + this.floorPerMin);
        stringBuffer.append("swimStyle=" + this.swimStyle);
        stringBuffer.append("trainGroupType=" + this.trainGroupType);
        stringBuffer.append("strengthTrainType=" + this.strengthTrainType);
        stringBuffer.append(JsonLexerKt.END_LIST);
        return stringBuffer.toString();
    }
}
