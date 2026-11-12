package cn.miao.health.bean;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class AnalyzeInfo implements Serializable {
    private int analyzeMapping;
    private int explainMapping;

    public int getAnalyzeMapping() {
        return this.analyzeMapping;
    }

    public int getExplainMapping() {
        return this.explainMapping;
    }

    public void setAnalyzeMapping(int i) {
        this.analyzeMapping = i;
    }

    public void setExplainMapping(int i) {
        this.explainMapping = i;
    }

    public String toString() {
        return "AnalyzeInfo{analyzeMapping=" + this.analyzeMapping + ", explainMapping=" + this.explainMapping + AbstractJsonLexerKt.END_OBJ;
    }
}
