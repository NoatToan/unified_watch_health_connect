package cn.miao.health.bean;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class MiaoHealthManualInputInfo extends MiaoHealthBaseInfo {
    private Double calories;
    private Integer distance;
    private Integer intensity;
    private Integer step;

    public Double getCalories() {
        return this.calories;
    }

    public Integer getDistance() {
        return this.distance;
    }

    public Integer getIntensity() {
        return this.intensity;
    }

    public Integer getStep() {
        return this.step;
    }

    public void setCalories(Double d) {
        this.calories = d;
    }

    public void setDistance(Integer num) {
        this.distance = num;
    }

    public void setIntensity(Integer num) {
        this.intensity = num;
    }

    public void setStep(Integer num) {
        this.step = num;
    }

    public String toString() {
        return "MiaoHealthManualInputInfo{step=" + this.step + ", distance=" + this.distance + ", intensity=" + this.intensity + ", calories=" + this.calories + AbstractJsonLexerKt.END_OBJ;
    }
}
