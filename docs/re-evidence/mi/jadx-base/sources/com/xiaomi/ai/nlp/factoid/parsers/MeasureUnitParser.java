package com.xiaomi.ai.nlp.factoid.parsers;

import com.google.code.regexp.Pattern;
import com.xiaomi.ai.nlp.factoid.entities.EntityType;
import defpackage.a8f;
import defpackage.dq5;
import defpackage.g2h;
import defpackage.jlo;
import defpackage.pr5;
import defpackage.sbf;
import defpackage.yb8;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public class MeasureUnitParser extends NumberBasedParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Pattern f11070a = Pattern.compile(jlo.c(Arrays.asList("(?<kiloMeterPerHour1><Number>)(?:千米每小时|千米一小时|公里每小时|公里一小时)", "(?:每小时|一小时)(?<kiloMeterPerHour2><Number>)(?:千米|公里)", "(?<milePerHour1><Number>)(?:英里每小时|英里一小时|迈|码)", "(?:每小时|一小时)(?<milePerHour2><Number>)(?:英里|迈|码)", "(?<meterPerSec1><Number>)(?:米每秒|米一秒)", "(?:每秒|一秒)(?<meterPerSec2><Number>)(?:米)", "(?<feetPerSec1><Number>)(?:英尺每秒|英尺一秒|尺每秒|尺一秒)", "(?:每秒|一秒)(?<feetPerSec2><Number>)(?:英尺|尺)"), "|"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List<EntityType> f11071b = Collections.singletonList(EntityType.Number);

    @Override // com.xiaomi.ai.nlp.factoid.parsers.Parser
    public String c() {
        return "MeasureUnitParser";
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public EntityType i() {
        return EntityType.MeasureUnit;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public List<EntityType> j() {
        return f11071b;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public Pattern k() {
        return f11070a;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public yb8 l(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, pr5 pr5Var, boolean z) {
        if (a8fVar.d("kiloMeterPerHour1") != null) {
            h(z, pr5Var, "kiloMeterPerHour1");
            return s(str, a8fVar, treeMap, "kiloMeterPerHour1", "千米每小时");
        }
        if (a8fVar.d("kiloMeterPerHour2") != null) {
            h(z, pr5Var, "kiloMeterPerHour2");
            return s(str, a8fVar, treeMap, "kiloMeterPerHour2", "千米每小时");
        }
        if (a8fVar.d("milePerHour1") != null) {
            h(z, pr5Var, "milePerHour1");
            return s(str, a8fVar, treeMap, "milePerHour1", "英里每小时");
        }
        if (a8fVar.d("milePerHour2") != null) {
            h(z, pr5Var, "milePerHour2");
            return s(str, a8fVar, treeMap, "milePerHour2", "英里每小时");
        }
        if (a8fVar.d("meterPerSec1") != null) {
            h(z, pr5Var, "meterPerSec1");
            return s(str, a8fVar, treeMap, "meterPerSec1", "米每秒");
        }
        if (a8fVar.d("meterPerSec2") != null) {
            h(z, pr5Var, "meterPerSec2");
            return s(str, a8fVar, treeMap, "meterPerSec2", "米每秒");
        }
        if (a8fVar.d("feetPerSec1") != null) {
            h(z, pr5Var, "feetPerSec1");
            return s(str, a8fVar, treeMap, "feetPerSec1", "英尺每秒");
        }
        if (a8fVar.d("feetPerSec2") != null) {
            h(z, pr5Var, "feetPerSec2");
            return s(str, a8fVar, treeMap, "feetPerSec2", "英尺每秒");
        }
        h(z, pr5Var, "None");
        return null;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.NumberBasedParser
    public g2h m(int i, int i2, String str, double d, double d2, boolean z) {
        return new sbf(i, i2, str, d);
    }

    public final yb8 s(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, String str2, String str3) {
        sbf sbfVar = (sbf) n(str, a8fVar, treeMap, str2);
        if (sbfVar != null) {
            sbfVar.p(str3);
        }
        return sbfVar;
    }
}
