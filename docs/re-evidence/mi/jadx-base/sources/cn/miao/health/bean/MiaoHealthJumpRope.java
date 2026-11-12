package cn.miao.health.bean;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class MiaoHealthJumpRope extends MiaoHealthBaseInfo {
    private double calories;
    private AnalyzeInfo jumpRopeEvaluation;

    public double getCalories() {
        return this.calories;
    }

    public AnalyzeInfo getJumpRopeEvaluation() {
        return this.jumpRopeEvaluation;
    }

    public void setCalories(double d) {
        this.calories = d;
    }

    public void setJumpRopeEvaluation(AnalyzeInfo analyzeInfo) {
        this.jumpRopeEvaluation = analyzeInfo;
    }

    public String toString() {
        return "MiaoHealthJumpRope{jumpRopeEvaluation=" + this.jumpRopeEvaluation + ", calories=" + this.calories + AbstractJsonLexerKt.END_OBJ;
    }
}
