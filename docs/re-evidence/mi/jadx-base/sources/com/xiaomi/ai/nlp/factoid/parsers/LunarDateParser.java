package com.xiaomi.ai.nlp.factoid.parsers;

import com.google.code.regexp.Pattern;
import com.xiaomi.ai.nlp.factoid.entities.EntityType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.DayType;
import defpackage.a8f;
import defpackage.cwe;
import defpackage.dq5;
import defpackage.dwe;
import defpackage.hbc;
import defpackage.i2h;
import defpackage.j4n;
import defpackage.jlo;
import defpackage.kzr;
import defpackage.m2h;
import defpackage.pr5;
import defpackage.yb8;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public class LunarDateParser extends RegexBasedParser {
    public static List<EntityType> c;
    public static Map<String, DayType> d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Pattern f11069b = Pattern.compile("\\d{2}|\\d{4}|(一|二|三|四|五|六|七|八|九){2}|(一|二|三|四|五|六|七|八|九){4}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Pattern f11068a = Pattern.compile(jlo.c(Arrays.asList("(?:农历|阴历)?(?<lunarYear><Year>)?的?(?:农历|阴历)?(?<lunarLeap>闰)?(?<lunarMonth><Number>|正|冬|腊)月(?<lunarTens>初|廿|卅)?((?<lunarDayHour><Hour>)|(?<lunarDayNumberHour><Number>)点半?|((?<lunarDay><Number>)(?:日|号)?的?(?<partOfDay>早上|早晨|晨间|下午|晚上|中午|午间|上午|傍晚|黄昏|凌晨|半夜|夜间|夜晚)?(?<hour><Hour>)?))"), "|"));

    static {
        HashMap map = new HashMap();
        d = map;
        DayType dayType = DayType.MORNING;
        map.put("早上", dayType);
        d.put("早晨", dayType);
        d.put("晨间", dayType);
        d.put("下午", DayType.AFTERNOON);
        Map<String, DayType> map2 = d;
        DayType dayType2 = DayType.NIGHT;
        map2.put("晚上", dayType2);
        d.put("夜间", dayType2);
        d.put("夜晚", dayType2);
        Map<String, DayType> map3 = d;
        DayType dayType3 = DayType.NOON;
        map3.put("中午", dayType3);
        d.put("午间", dayType3);
        d.put("上午", DayType.FORENOON);
        Map<String, DayType> map4 = d;
        DayType dayType4 = DayType.EVENING;
        map4.put("傍晚", dayType4);
        d.put("黄昏", dayType4);
        Map<String, DayType> map5 = d;
        DayType dayType5 = DayType.EARLY_MORNING;
        map5.put("凌晨", dayType5);
        d.put("半夜", dayType5);
        c = Arrays.asList(EntityType.Number, EntityType.Year, EntityType.Hour);
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.Parser
    public String c() {
        return "LunarDateParser";
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public EntityType i() {
        return EntityType.LunarDate;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public List<EntityType> j() {
        return c;
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public Pattern k() {
        return f11068a;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0062  */
    /* JADX WARN: Code duplicated, block: B:19:0x006a  */
    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x0092  */
    /* JADX WARN: Code duplicated, block: B:29:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00da  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00fa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:54:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:57:0x010a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0124  */
    /* JADX WARN: Code duplicated, block: B:61:0x012d  */
    /* JADX WARN: Code duplicated, block: B:63:0x014d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0157  */
    /* JADX WARN: Code duplicated, block: B:67:0x0164  */
    /* JADX WARN: Code duplicated, block: B:69:0x0170  */
    /* JADX WARN: Code duplicated, block: B:71:0x0197 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:73:0x019c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x019e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:76:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x0218 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x021d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x021f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x0223  */
    /* JADX WARN: Code duplicated, block: B:92:0x023e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0251 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x0253 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Instruction removed from duplicated block: B:82:0x01ef, please report this as an issue */
    @Override // com.xiaomi.ai.nlp.factoid.parsers.RegexBasedParser
    public yb8 l(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, pr5 pr5Var, boolean z) {
        int iB;
        boolean z2;
        String strD;
        int i;
        m2h m2hVar;
        int iK;
        boolean z3;
        String strD2;
        int i2;
        int i3;
        boolean z4;
        int iIntValue;
        int i4;
        DayType dayType;
        int i5;
        boolean z5;
        int iK2;
        int i6;
        int iA;
        hbc hbcVar;
        String strE;
        int iIntValue2;
        int i7;
        int i8;
        boolean z6;
        int iIntValue3;
        DayType dayType2;
        j4n j4nVarH;
        int iC;
        DayType dayType3;
        boolean z7;
        int i9;
        int iL;
        if (z) {
            pr5Var.a("matches lunar date pattern");
        }
        int iQ = dq5Var.q();
        if (a8fVar.d("lunarYear") != null) {
            kzr kzrVar = (kzr) treeMap.get(Integer.valueOf(a8fVar.f("lunarYear")));
            int iQ2 = kzrVar.n().q();
            iB = b(a8fVar, "lunarYear", kzrVar);
            if (f11069b.matcher(kzrVar.e()).b()) {
                iQ = iQ2;
                z2 = true;
            } else {
                iQ = iQ2;
            }
            strD = a8fVar.d("lunarMonth");
            if (strD.equals("正")) {
                i = 1;
            } else {
                if (strD.equals("冬")) {
                    i = 12;
                    if (strD.equals("腊")) {
                        m2hVar = (m2h) treeMap.get(Integer.valueOf(a8fVar.f("lunarMonth")));
                        iK = (int) m2hVar.k();
                        if (iK >= 1 || iK > 12) {
                            i = 0;
                        } else {
                            i = iK;
                        }
                    }
                    if (iB == -1) {
                        if (m2hVar == null) {
                            iB = d(a8fVar.start(), treeMap);
                        } else {
                            iB = b(a8fVar, "lunarMonth", m2hVar);
                        }
                    }
                    if (a8fVar.d("lunarLeap") != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    strD2 = a8fVar.d("lunarTens");
                    if (strD2 == null) {
                        i2 = 0;
                    } else if (strD2.equals("廿")) {
                        i2 = 2;
                    } else if (strD2.equals("卅")) {
                        i2 = 3;
                    } else {
                        i2 = 0;
                    }
                    if (a8fVar.d("lunarDay") != null) {
                        m2h m2hVar2 = (m2h) treeMap.get(Integer.valueOf(a8fVar.f("lunarDay")));
                        i3 = iB;
                        z4 = z2;
                        iK2 = (int) m2hVar2.k();
                        if (iK2 < 1 && iK2 <= 9) {
                            iK2 += i2 * 10;
                        } else if (iK2 >= 10 || iK2 > 30) {
                            iK2 = 0;
                        }
                        iA = a(a8fVar, "lunarDay", m2hVar2);
                        if (a8fVar.d("partOfDay") != null) {
                            String strD3 = a8fVar.d("partOfDay");
                            dayType3 = d.get(strD3);
                            iA = strD3.length() + d(a8fVar.f("partOfDay"), treeMap);
                        } else {
                            dayType3 = null;
                        }
                        if (a8fVar.d("hour") != null) {
                            hbc hbcVar2 = (hbc) treeMap.get(Integer.valueOf(a8fVar.f("hour")));
                            int iG = hbcVar2.n().g();
                            iL = hbcVar2.n().l();
                            if (dayType3 == null) {
                                dayType3 = DayType.MORNING;
                            }
                            i9 = iG;
                            iA = a(a8fVar, "hour", hbcVar2);
                            z7 = true;
                        } else {
                            z7 = false;
                            i9 = 0;
                            iL = 0;
                        }
                        z5 = z7;
                        i5 = i9;
                        dayType = dayType3;
                        i6 = iL;
                    } else {
                        i3 = iB;
                        z4 = z2;
                        if (a8fVar.d("lunarDayHour") != null) {
                            hbcVar = (hbc) treeMap.get(Integer.valueOf(a8fVar.f("lunarDayHour")));
                            strE = hbcVar.e();
                            iIntValue2 = i2h.e(strE.substring(0, 1)).a().intValue();
                            if (iIntValue2 < 1 && iIntValue2 <= 9) {
                                i7 = (i2 * 10) + iIntValue2;
                            } else if (iIntValue2 >= 10 || iIntValue2 > 30) {
                                i7 = 0;
                            } else {
                                i7 = iIntValue2;
                            }
                            if (strE.contains("点")) {
                                iIntValue3 = i2h.e(strE.substring(1, strE.indexOf("点"))).a().intValue();
                                int iL2 = hbcVar.n().l();
                                dayType2 = DayType.MORNING;
                                int iA2 = a(a8fVar, "lunarDayHour", hbcVar);
                                z6 = true;
                                iA = iA2;
                                i8 = iL2;
                            } else {
                                iA = a(a8fVar, "lunarDayHour", hbcVar) - (strE.length() - 1);
                                i8 = 0;
                                z6 = false;
                                iIntValue3 = 0;
                                dayType2 = null;
                            }
                            i6 = i8;
                            z5 = z6;
                            i5 = iIntValue3;
                            iK2 = i7;
                            dayType = dayType2;
                        } else {
                            yb8 yb8Var = (m2h) treeMap.get(Integer.valueOf(a8fVar.f("lunarDayNumberHour")));
                            String strE2 = yb8Var.e();
                            iIntValue = i2h.e(strE2.substring(0, 1)).a().intValue();
                            if (iIntValue < 1 && iIntValue <= 9) {
                                i4 = (i2 * 10) + iIntValue;
                            } else if (iIntValue >= 10 || iIntValue > 30) {
                                i4 = 0;
                            } else {
                                i4 = iIntValue;
                            }
                            int iIntValue4 = i2h.e(strE2.substring(1)).a().intValue();
                            int i10 = strE2.contains("半") ? 30 : 0;
                            dayType = DayType.MORNING;
                            i5 = iIntValue4;
                            z5 = true;
                            iK2 = i4;
                            i6 = i10;
                            iA = a(a8fVar, "lunarDayNumberHour", yb8Var);
                        }
                    }
                    if (i != 0 || iK2 == 0 || (j4nVarH = dwe.h(iQ, i, iK2, z3)) == null) {
                        return null;
                    }
                    int iC2 = j4nVarH.c();
                    if (iQ >= iC2 || dq5Var.m() > 6 || z4) {
                        iC = iC2;
                    } else {
                        j4nVarH = dwe.h(iQ - 1, i, iK2, z3);
                        if (j4nVarH == null) {
                            return null;
                        }
                        iC = j4nVarH.c();
                    }
                    int iB2 = j4nVarH.b();
                    int iA3 = j4nVarH.a();
                    int i11 = i3;
                    if (str.charAt(i11) == 30340) {
                        i11++;
                    }
                    if (str.charAt(iA - 1) == 30340) {
                        iA--;
                    }
                    return new cwe(i11, iA, str.substring(i11, iA), new dq5(iC, iB2, iA3, i5, i6, 0), dayType, z5);
                }
                i = 11;
            }
            m2hVar = null;
            if (iB == -1) {
                if (m2hVar == null) {
                    iB = d(a8fVar.start(), treeMap);
                } else {
                    iB = b(a8fVar, "lunarMonth", m2hVar);
                }
            }
            if (a8fVar.d("lunarLeap") != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            strD2 = a8fVar.d("lunarTens");
            if (strD2 == null) {
                i2 = 0;
            } else if (strD2.equals("廿")) {
                i2 = 2;
            } else if (strD2.equals("卅")) {
                i2 = 3;
            } else {
                i2 = 0;
            }
            if (a8fVar.d("lunarDay") != null) {
                m2h m2hVar3 = (m2h) treeMap.get(Integer.valueOf(a8fVar.f("lunarDay")));
                i3 = iB;
                z4 = z2;
                iK2 = (int) m2hVar3.k();
                if (iK2 < 1) {
                    if (iK2 >= 10) {
                        iK2 = 0;
                    } else {
                        iK2 = 0;
                    }
                } else if (iK2 >= 10) {
                    iK2 = 0;
                } else {
                    iK2 = 0;
                }
                iA = a(a8fVar, "lunarDay", m2hVar3);
                if (a8fVar.d("partOfDay") != null) {
                    String strD4 = a8fVar.d("partOfDay");
                    dayType3 = d.get(strD4);
                    iA = strD4.length() + d(a8fVar.f("partOfDay"), treeMap);
                } else {
                    dayType3 = null;
                }
                if (a8fVar.d("hour") != null) {
                    hbc hbcVar3 = (hbc) treeMap.get(Integer.valueOf(a8fVar.f("hour")));
                    int iG2 = hbcVar3.n().g();
                    iL = hbcVar3.n().l();
                    if (dayType3 == null) {
                        dayType3 = DayType.MORNING;
                    }
                    i9 = iG2;
                    iA = a(a8fVar, "hour", hbcVar3);
                    z7 = true;
                } else {
                    z7 = false;
                    i9 = 0;
                    iL = 0;
                }
                z5 = z7;
                i5 = i9;
                dayType = dayType3;
                i6 = iL;
            } else {
                i3 = iB;
                z4 = z2;
                if (a8fVar.d("lunarDayHour") != null) {
                    hbcVar = (hbc) treeMap.get(Integer.valueOf(a8fVar.f("lunarDayHour")));
                    strE = hbcVar.e();
                    iIntValue2 = i2h.e(strE.substring(0, 1)).a().intValue();
                    if (iIntValue2 < 1) {
                        if (iIntValue2 >= 10) {
                            i7 = 0;
                        } else {
                            i7 = 0;
                        }
                    } else if (iIntValue2 >= 10) {
                        i7 = 0;
                    } else {
                        i7 = 0;
                    }
                    if (strE.contains("点")) {
                        iIntValue3 = i2h.e(strE.substring(1, strE.indexOf("点"))).a().intValue();
                        int iL3 = hbcVar.n().l();
                        dayType2 = DayType.MORNING;
                        int iA4 = a(a8fVar, "lunarDayHour", hbcVar);
                        z6 = true;
                        iA = iA4;
                        i8 = iL3;
                    } else {
                        iA = a(a8fVar, "lunarDayHour", hbcVar) - (strE.length() - 1);
                        i8 = 0;
                        z6 = false;
                        iIntValue3 = 0;
                        dayType2 = null;
                    }
                    i6 = i8;
                    z5 = z6;
                    i5 = iIntValue3;
                    iK2 = i7;
                    dayType = dayType2;
                } else {
                    yb8 yb8Var2 = (m2h) treeMap.get(Integer.valueOf(a8fVar.f("lunarDayNumberHour")));
                    String strE3 = yb8Var2.e();
                    iIntValue = i2h.e(strE3.substring(0, 1)).a().intValue();
                    if (iIntValue < 1) {
                        if (iIntValue >= 10) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                    } else if (iIntValue >= 10) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                    }
                    int iIntValue5 = i2h.e(strE3.substring(1)).a().intValue();
                    if (strE3.contains("半")) {
                    }
                    dayType = DayType.MORNING;
                    i5 = iIntValue5;
                    z5 = true;
                    iK2 = i4;
                    i6 = i10;
                    iA = a(a8fVar, "lunarDayNumberHour", yb8Var2);
                }
            }
            if (i != 0) {
                return null;
            }
            return null;
        }
        iB = -1;
        z2 = false;
        strD = a8fVar.d("lunarMonth");
        if (strD.equals("正")) {
            i = 1;
        } else {
            if (strD.equals("冬")) {
                i = 12;
                if (strD.equals("腊")) {
                    m2hVar = (m2h) treeMap.get(Integer.valueOf(a8fVar.f("lunarMonth")));
                    iK = (int) m2hVar.k();
                    if (iK >= 1) {
                        i = 0;
                    } else {
                        i = 0;
                    }
                }
                if (iB == -1) {
                    if (m2hVar == null) {
                        iB = d(a8fVar.start(), treeMap);
                    } else {
                        iB = b(a8fVar, "lunarMonth", m2hVar);
                    }
                }
                if (a8fVar.d("lunarLeap") != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                strD2 = a8fVar.d("lunarTens");
                if (strD2 == null) {
                    i2 = 0;
                } else if (strD2.equals("廿")) {
                    i2 = 2;
                } else if (strD2.equals("卅")) {
                    i2 = 3;
                } else {
                    i2 = 0;
                }
                if (a8fVar.d("lunarDay") != null) {
                    m2h m2hVar4 = (m2h) treeMap.get(Integer.valueOf(a8fVar.f("lunarDay")));
                    i3 = iB;
                    z4 = z2;
                    iK2 = (int) m2hVar4.k();
                    if (iK2 < 1) {
                        if (iK2 >= 10) {
                            iK2 = 0;
                        } else {
                            iK2 = 0;
                        }
                    } else if (iK2 >= 10) {
                        iK2 = 0;
                    } else {
                        iK2 = 0;
                    }
                    iA = a(a8fVar, "lunarDay", m2hVar4);
                    if (a8fVar.d("partOfDay") != null) {
                        String strD5 = a8fVar.d("partOfDay");
                        dayType3 = d.get(strD5);
                        iA = strD5.length() + d(a8fVar.f("partOfDay"), treeMap);
                    } else {
                        dayType3 = null;
                    }
                    if (a8fVar.d("hour") != null) {
                        hbc hbcVar4 = (hbc) treeMap.get(Integer.valueOf(a8fVar.f("hour")));
                        int iG3 = hbcVar4.n().g();
                        iL = hbcVar4.n().l();
                        if (dayType3 == null) {
                            dayType3 = DayType.MORNING;
                        }
                        i9 = iG3;
                        iA = a(a8fVar, "hour", hbcVar4);
                        z7 = true;
                    } else {
                        z7 = false;
                        i9 = 0;
                        iL = 0;
                    }
                    z5 = z7;
                    i5 = i9;
                    dayType = dayType3;
                    i6 = iL;
                } else {
                    i3 = iB;
                    z4 = z2;
                    if (a8fVar.d("lunarDayHour") != null) {
                        hbcVar = (hbc) treeMap.get(Integer.valueOf(a8fVar.f("lunarDayHour")));
                        strE = hbcVar.e();
                        iIntValue2 = i2h.e(strE.substring(0, 1)).a().intValue();
                        if (iIntValue2 < 1) {
                            if (iIntValue2 >= 10) {
                                i7 = 0;
                            } else {
                                i7 = 0;
                            }
                        } else if (iIntValue2 >= 10) {
                            i7 = 0;
                        } else {
                            i7 = 0;
                        }
                        if (strE.contains("点")) {
                            iIntValue3 = i2h.e(strE.substring(1, strE.indexOf("点"))).a().intValue();
                            int iL4 = hbcVar.n().l();
                            dayType2 = DayType.MORNING;
                            int iA5 = a(a8fVar, "lunarDayHour", hbcVar);
                            z6 = true;
                            iA = iA5;
                            i8 = iL4;
                        } else {
                            iA = a(a8fVar, "lunarDayHour", hbcVar) - (strE.length() - 1);
                            i8 = 0;
                            z6 = false;
                            iIntValue3 = 0;
                            dayType2 = null;
                        }
                        i6 = i8;
                        z5 = z6;
                        i5 = iIntValue3;
                        iK2 = i7;
                        dayType = dayType2;
                    } else {
                        yb8 yb8Var3 = (m2h) treeMap.get(Integer.valueOf(a8fVar.f("lunarDayNumberHour")));
                        String strE4 = yb8Var3.e();
                        iIntValue = i2h.e(strE4.substring(0, 1)).a().intValue();
                        if (iIntValue < 1) {
                            if (iIntValue >= 10) {
                                i4 = 0;
                            } else {
                                i4 = 0;
                            }
                        } else if (iIntValue >= 10) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        int iIntValue6 = i2h.e(strE4.substring(1)).a().intValue();
                        if (strE4.contains("半")) {
                        }
                        dayType = DayType.MORNING;
                        i5 = iIntValue6;
                        z5 = true;
                        iK2 = i4;
                        i6 = i10;
                        iA = a(a8fVar, "lunarDayNumberHour", yb8Var3);
                    }
                }
                if (i != 0) {
                    return null;
                }
                return null;
            }
            i = 11;
        }
        m2hVar = null;
        if (iB == -1) {
            if (m2hVar == null) {
                iB = d(a8fVar.start(), treeMap);
            } else {
                iB = b(a8fVar, "lunarMonth", m2hVar);
            }
        }
        if (a8fVar.d("lunarLeap") != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        strD2 = a8fVar.d("lunarTens");
        if (strD2 == null) {
            i2 = 0;
        } else if (strD2.equals("廿")) {
            i2 = 2;
        } else if (strD2.equals("卅")) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        if (a8fVar.d("lunarDay") != null) {
            m2h m2hVar5 = (m2h) treeMap.get(Integer.valueOf(a8fVar.f("lunarDay")));
            i3 = iB;
            z4 = z2;
            iK2 = (int) m2hVar5.k();
            if (iK2 < 1) {
                if (iK2 >= 10) {
                    iK2 = 0;
                } else {
                    iK2 = 0;
                }
            } else if (iK2 >= 10) {
                iK2 = 0;
            } else {
                iK2 = 0;
            }
            iA = a(a8fVar, "lunarDay", m2hVar5);
            if (a8fVar.d("partOfDay") != null) {
                String strD6 = a8fVar.d("partOfDay");
                dayType3 = d.get(strD6);
                iA = strD6.length() + d(a8fVar.f("partOfDay"), treeMap);
            } else {
                dayType3 = null;
            }
            if (a8fVar.d("hour") != null) {
                hbc hbcVar5 = (hbc) treeMap.get(Integer.valueOf(a8fVar.f("hour")));
                int iG4 = hbcVar5.n().g();
                iL = hbcVar5.n().l();
                if (dayType3 == null) {
                    dayType3 = DayType.MORNING;
                }
                i9 = iG4;
                iA = a(a8fVar, "hour", hbcVar5);
                z7 = true;
            } else {
                z7 = false;
                i9 = 0;
                iL = 0;
            }
            z5 = z7;
            i5 = i9;
            dayType = dayType3;
            i6 = iL;
        } else {
            i3 = iB;
            z4 = z2;
            if (a8fVar.d("lunarDayHour") != null) {
                hbcVar = (hbc) treeMap.get(Integer.valueOf(a8fVar.f("lunarDayHour")));
                strE = hbcVar.e();
                iIntValue2 = i2h.e(strE.substring(0, 1)).a().intValue();
                if (iIntValue2 < 1) {
                    if (iIntValue2 >= 10) {
                        i7 = 0;
                    } else {
                        i7 = 0;
                    }
                } else if (iIntValue2 >= 10) {
                    i7 = 0;
                } else {
                    i7 = 0;
                }
                if (strE.contains("点")) {
                    iIntValue3 = i2h.e(strE.substring(1, strE.indexOf("点"))).a().intValue();
                    int iL5 = hbcVar.n().l();
                    dayType2 = DayType.MORNING;
                    int iA6 = a(a8fVar, "lunarDayHour", hbcVar);
                    z6 = true;
                    iA = iA6;
                    i8 = iL5;
                } else {
                    iA = a(a8fVar, "lunarDayHour", hbcVar) - (strE.length() - 1);
                    i8 = 0;
                    z6 = false;
                    iIntValue3 = 0;
                    dayType2 = null;
                }
                i6 = i8;
                z5 = z6;
                i5 = iIntValue3;
                iK2 = i7;
                dayType = dayType2;
            } else {
                yb8 yb8Var4 = (m2h) treeMap.get(Integer.valueOf(a8fVar.f("lunarDayNumberHour")));
                String strE5 = yb8Var4.e();
                iIntValue = i2h.e(strE5.substring(0, 1)).a().intValue();
                if (iIntValue < 1) {
                    if (iIntValue >= 10) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                    }
                } else if (iIntValue >= 10) {
                    i4 = 0;
                } else {
                    i4 = 0;
                }
                int iIntValue7 = i2h.e(strE5.substring(1)).a().intValue();
                if (strE5.contains("半")) {
                }
                dayType = DayType.MORNING;
                i5 = iIntValue7;
                z5 = true;
                iK2 = i4;
                i6 = i10;
                iA = a(a8fVar, "lunarDayNumberHour", yb8Var4);
            }
        }
        if (i != 0) {
            return null;
        }
        return null;
    }
}
