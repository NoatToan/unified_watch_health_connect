package com.xiaomi.fitness.devicesettings.base.sedenraty;

import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class SedentaryConfig {
    public boolean enable;
    public List<a> middayRest;
    public int workEd;
    public int workSt;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f11952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f11953b;
        public int c;

        public String toString() {
            return "MiddayRest{enable=" + this.f11952a + ", start=" + this.f11953b + ", stop=" + this.c + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public String toString() {
        return "SedentaryConfig{enable=" + this.enable + ", workSt=" + this.workSt + ", workEd=" + this.workEd + ", middayRest=" + this.middayRest + AbstractJsonLexerKt.END_OBJ;
    }
}
