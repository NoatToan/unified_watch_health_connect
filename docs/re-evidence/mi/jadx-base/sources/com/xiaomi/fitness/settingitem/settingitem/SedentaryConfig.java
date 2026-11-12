package com.xiaomi.fitness.settingitem.settingitem;

import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class SedentaryConfig {
    public boolean enable;
    public List<MiddayRest> middayRest;
    public int workEd;
    public int workSt;

    public static class MiddayRest {
        public boolean enable;
        public int start;
        public int stop;

        public String toString() {
            return "MiddayRest{enable=" + this.enable + ", start=" + this.start + ", stop=" + this.stop + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public String toString() {
        return "SedentaryConfig{enable=" + this.enable + ", workSt=" + this.workSt + ", workEd=" + this.workEd + ", middayRest=" + this.middayRest + AbstractJsonLexerKt.END_OBJ;
    }
}
