package com.huawei.hihealthservice.store.stat;

import android.content.Context;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiNoonSleepInfo;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcloudmodel.model.unite.ProfessionalSleep;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.kuk;
import defpackage.kwi;
import defpackage.kws;
import defpackage.kwt;
import defpackage.kwu;
import defpackage.kwy;
import defpackage.kxe;
import defpackage.kyj;
import defpackage.kyn;
import defpackage.lji;
import defpackage.ljq;
import defpackage.ljx;
import defpackage.ljz;
import health.compact.a.CommonUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class HiCoreSleepStat extends HiStatCommon {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kyn f12559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f12560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kyj f12561c;
    private int d;
    private kwu e;
    private int h;

    public HiCoreSleepStat(Context context) {
        super(context);
        this.f12560b = context;
        this.e = kwu.c(context);
        this.f12559a = kyn.d(this.f12560b);
        this.f12561c = kyj.c();
    }

    @Override // com.huawei.hihealthservice.store.stat.HiStatCommon
    public boolean stat(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.h = hiHealthData.getUserId();
        this.d = hiHealthData.getSyncStatus();
        kuk kukVar = new kuk();
        kukVar.c(HiDateUtil.r(hiHealthData.getStartTime()));
        kukVar.h(this.h);
        kukVar.i(0);
        kukVar.e(hiHealthData.getType());
        ReleaseLogUtil.d("Debug_HiCoreSleepStat", "stat() coreSleepData ", Integer.valueOf(kukVar.e()), " mSyncStatus ", Integer.valueOf(this.d));
        boolean zB = b(HiDateUtil.o(hiHealthData.getStartTime()), HiDateUtil.m(hiHealthData.getStartTime()), kukVar, this.h);
        LogUtil.d("Debug_HiCoreSleepStat", "stat() coreSleepTotalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return zB;
    }

    private boolean b(long j, long j2, kuk kukVar, int i) {
        int iE = this.f12559a.e(0, i, 0);
        kukVar.a(iE);
        if (iE <= 0) {
            LogUtil.j("Debug_HiCoreSleepStat", "statSleepDataByUser() statClient <= 0, userID = ", Integer.valueOf(i));
            return false;
        }
        List<Integer> listC = this.f12561c.c(i);
        if (HiCommonUtil.b(listC)) {
            LogUtil.j("Debug_HiCoreSleepStat", "statSleepDataByUser() statClients is null, userID = ", Integer.valueOf(i));
            return false;
        }
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(j);
        hiDataReadOption.setEndTime(j2);
        hiDataReadOption.setSortOrder(0);
        return c(kukVar, this.e.b(hiDataReadOption, listC, 22100, 22199), listC);
    }

    private boolean c(kuk kukVar, List<HiHealthData> list, List<Integer> list2) throws JSONException {
        HiCoreSleepStat hiCoreSleepStat;
        if (HiCommonUtil.b(list)) {
            if (this.d != 2) {
                return true;
            }
            ReleaseLogUtil.d("Debug_HiCoreSleepStat", "statCoreSleepData deleteAllStatDatas");
            e(kukVar);
            return ljz.c(kukVar, HiHealthDataType.e());
        }
        ReleaseLogUtil.d("Debug_HiCoreSleepStat", "statCoreSleepData sleepDatas size = ", Integer.valueOf(list.size()));
        int iA = a(kukVar, list);
        boolean z = iA == Integer.parseInt("06D", 16) || iA == Integer.parseInt("06E", 16);
        ArrayList arrayList = new ArrayList(10);
        int size = list.size();
        double d = 0.0d;
        int i = 0;
        double d2 = 0.0d;
        double d3 = 0.0d;
        int i2 = -1;
        int i3 = 0;
        double d4 = 0.0d;
        double d5 = 0.0d;
        double d6 = 0.0d;
        double d7 = 0.0d;
        boolean z2 = false;
        boolean z3 = false;
        double d8 = 0.0d;
        while (i < size) {
            int iMax = Math.max(i2, ljx.c(list.get(i)));
            if (list.get(i).getType() == 22103) {
                d3 += 1.0d;
            } else if (list.get(i).getType() == 22101) {
                d2 += 1.0d;
            } else if (list.get(i).getType() == 22102) {
                d += 1.0d;
            } else if (list.get(i).getType() == 22104) {
                if (!z) {
                    d4 += 1.0d;
                }
            } else if (list.get(i).getType() == 22105) {
                d6 += 1.0d;
                arrayList.add(list.get(i));
            } else if (list.get(i).getType() == 22106) {
                d7 += 1.0d;
            } else if (list.get(i).getType() == 22107) {
                d5 += 1.0d;
            } else {
                ReleaseLogUtil.d("Debug_HiCoreSleepStat", "sleepDatas type error = ", Integer.valueOf(list.get(i).getType()));
            }
            if (!z2 && list.get(i).getType() != 22104) {
                z3 = true;
            }
            if (z3 && list.get(i).getType() == 22104) {
                d8 += 1.0d;
                z2 = true;
            }
            if (z3 && z2 && list.get(i).getType() != 22104) {
                i3++;
                if (z) {
                    d4 += d8;
                    d8 = 0.0d;
                }
                z2 = false;
            }
            int i4 = i + 1;
            if (i4 < size && list.get(i).getEndTime() != list.get(i4).getStartTime()) {
                z2 = false;
                z3 = false;
                d8 = 0.0d;
            }
            i = i4;
            i2 = iMax;
        }
        double d9 = d3 + d2 + d + d5;
        Map<String, Long> mapB = lji.b(list);
        double d10 = d;
        long jA = CommonUtil.a(String.valueOf(mapB.get("core_sleep_start_time_key")), 0L);
        long jA2 = CommonUtil.a(String.valueOf(mapB.get("core_sleep_end_time_key")), 0L);
        long jA3 = CommonUtil.a(String.valueOf(mapB.get("core_sleep_start_wake_key")), Long.MAX_VALUE);
        long jA4 = CommonUtil.a(String.valueOf(mapB.get("core_sleep_end_wake_key")), 0L);
        if (i2 > -1) {
            b(kukVar, i2, 44235, 0);
            e(kukVar, 0.0d, 0.0d, 0.0d, d9);
            b(kukVar, Integer.valueOf((int) d3), Integer.valueOf((int) d2), Integer.valueOf((int) d10));
            hiCoreSleepStat = this;
        } else {
            ReleaseLogUtil.d("Debug_HiCoreSleepStat", "delete sleepVersion 44235");
            ljz.c(kukVar, new int[]{44235});
            hiCoreSleepStat = this;
            e(kukVar, d3, d2, d10, d9);
            hiCoreSleepStat.b(kukVar, (Integer) null, (Integer) null, (Integer) null);
        }
        e(kukVar, d4, d6, d7 + d5);
        a(kukVar, jA, jA2, jA3, jA4);
        b(kukVar, arrayList, d6, list2);
        if (i3 > 0) {
            b(kukVar, i3, 44107, 16);
        } else {
            ReleaseLogUtil.d("Debug_HiCoreSleepStat", "delete sleep wakeCount 44107");
            ljz.c(kukVar, new int[]{44107});
        }
        a(kukVar, list.get(0), list2, ((double) list.size()) - d6);
        if (z || hiCoreSleepStat.d != 2) {
            return true;
        }
        ReleaseLogUtil.d("Debug_HiCoreSleepStat", "delete sleep WearDevice");
        ljz.c(kukVar, new int[]{44203, 44106, 44206, 44208});
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0246  */
    /* JADX WARN: Code duplicated, block: B:115:0x026f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0290  */
    /* JADX WARN: Code duplicated, block: B:129:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:131:0x0300  */
    /* JADX WARN: Code duplicated, block: B:132:0x0315  */
    /* JADX WARN: Code duplicated, block: B:135:0x031c  */
    /* JADX WARN: Code duplicated, block: B:136:0x031f  */
    /* JADX WARN: Code duplicated, block: B:138:0x0323  */
    /* JADX WARN: Code duplicated, block: B:141:0x0333  */
    /* JADX WARN: Code duplicated, block: B:144:0x0344  */
    /* JADX WARN: Code duplicated, block: B:153:0x0374  */
    /* JADX WARN: Code duplicated, block: B:154:0x0389  */
    /* JADX WARN: Code duplicated, block: B:156:0x038e  */
    /* JADX WARN: Code duplicated, block: B:158:0x0397  */
    /* JADX WARN: Code duplicated, block: B:159:0x039b  */
    /* JADX WARN: Code duplicated, block: B:161:0x039f  */
    /* JADX WARN: Code duplicated, block: B:170:0x0235 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x0210 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0228 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0205 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0118  */
    /* JADX WARN: Code duplicated, block: B:25:0x0132  */
    /* JADX WARN: Code duplicated, block: B:33:0x0158  */
    /* JADX WARN: Code duplicated, block: B:40:0x016a  */
    /* JADX WARN: Code duplicated, block: B:41:0x016c A[Catch: JSONException -> 0x0265, TryCatch #3 {JSONException -> 0x0265, blocks: (B:38:0x0164, B:41:0x016c, B:43:0x0172, B:45:0x0178, B:46:0x017c, B:48:0x0182, B:49:0x018a), top: B:174:0x0164 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0182 A[Catch: JSONException -> 0x0265, TryCatch #3 {JSONException -> 0x0265, blocks: (B:38:0x0164, B:41:0x016c, B:43:0x0172, B:45:0x0178, B:46:0x017c, B:48:0x0182, B:49:0x018a), top: B:174:0x0164 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0196 A[Catch: JSONException -> 0x019f, TRY_LEAVE, TryCatch #9 {JSONException -> 0x019f, blocks: (B:51:0x0190, B:53:0x0196), top: B:186:0x0190 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x01bc A[Catch: JSONException -> 0x0262, TryCatch #2 {JSONException -> 0x0262, blocks: (B:57:0x01a3, B:59:0x01a9, B:61:0x01af, B:62:0x01b6, B:64:0x01bc, B:69:0x01c7, B:71:0x01cd, B:73:0x01d3, B:74:0x01d7, B:76:0x01dd, B:78:0x01e6, B:79:0x01ea, B:81:0x01f0, B:83:0x01f9), top: B:172:0x01a3 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:94:0x021e  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 5 */
    private void a(kuk kukVar, HiHealthData hiHealthData, List<Integer> list, double d) throws JSONException {
        boolean z;
        boolean z2;
        ProfessionalSleep professionalSleep;
        Integer numValueOf;
        double d2;
        HiCoreSleepStat hiCoreSleepStat;
        boolean z3;
        String str;
        int i;
        int i2;
        int i3;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        boolean z4;
        int i4;
        Iterator<HiHealthData> it;
        double d8;
        boolean z5;
        int i5;
        HiHealthData next;
        String str2;
        String str3;
        JSONObject jSONObject;
        String str4;
        int i6;
        this = this;
        String str5 = "minHeartrate";
        String str6 = "stableSleepRatio";
        String str7 = "maxOxygenSaturation";
        long jO = HiDateUtil.o(hiHealthData.getStartTime());
        long jM = HiDateUtil.m(hiHealthData.getStartTime());
        String str8 = "maxBreathrate";
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(jO);
        hiDataReadOption.setEndTime(jM);
        hiDataReadOption.setSortOrder(0);
        List<HiHealthData> listI = kws.e(this.f12560b).i(list, hiDataReadOption, DicDataTypeUtil.DataType.SLEEP_DETAILS.value());
        List<HiHealthData> listD = this.d(listI);
        String str9 = "Debug_HiCoreSleepStat";
        if (!HiCommonUtil.b(listD)) {
            ReleaseLogUtil.d("Debug_HiCoreSleepStat", "Date=", Integer.valueOf(HiDateUtil.d(listD.get(0).getEndTime())), ",statSleepV>=2,sz=", Integer.valueOf(listD.size()));
            listI = listD;
        }
        if (HiCommonUtil.b(listI)) {
            ReleaseLogUtil.d("Debug_HiCoreSleepStat", "saveSleepHealthDataStat sequenceHealthDatas null");
            if (this.d == 2) {
                ljz.c(kukVar, HiHealthDataType.g());
                return;
            }
        }
        kuk kukVarB = this.mDataStatManager.b(kukVar.e(), 44209, kukVar.c());
        String str10 = "minBreathrate";
        kuk kukVarB2 = this.mDataStatManager.b(kukVar.e(), 44219, kukVar.c());
        if (this.d == 2) {
            ReleaseLogUtil.d("Debug_HiCoreSleepStat", "saveSleepHealthDataStat sequenceHealthDatas", Integer.valueOf(listI.size()));
            z = false;
        } else {
            if (kukVarB != null) {
                ReleaseLogUtil.d("Debug_HiCoreSleepStat", "support truSleep4.0");
                z = true;
            } else {
                z = false;
            }
            if (kukVarB2 != null) {
                ReleaseLogUtil.d("Debug_HiCoreSleepStat", "support truSleep5.0");
                z2 = true;
            }
            professionalSleep = new ProfessionalSleep();
            numValueOf = null;
            d2 = Double.MAX_VALUE;
            if (HiCommonUtil.b(listI)) {
                hiCoreSleepStat = this;
                z3 = z2;
                str = "Debug_HiCoreSleepStat";
                i = 0;
                i2 = 0;
                i3 = Integer.MAX_VALUE;
                d3 = Double.MAX_VALUE;
                d4 = 0.0d;
                d5 = 0.0d;
                d6 = 0.0d;
                d7 = 0.0d;
            } else {
                it = listI.iterator();
                i3 = Integer.MAX_VALUE;
                d8 = Double.MAX_VALUE;
                d4 = 0.0d;
                d5 = 0.0d;
                d6 = 0.0d;
                d7 = 0.0d;
                i2 = 0;
                z5 = z;
                i5 = 0;
                while (it.hasNext()) {
                    Iterator<HiHealthData> it2 = it;
                    next = it.next();
                    boolean z6 = z2;
                    try {
                        str2 = str9;
                        try {
                            jSONObject = new JSONObject(next.getMetaData());
                            next = next;
                            try {
                                if (jSONObject.optInt("validData", 0) == 65535) {
                                    try {
                                        if (jSONObject.optInt("sleepEfficiency", 0) == 255) {
                                            try {
                                                if (jSONObject.optInt("deepPart", 0) == 255) {
                                                    str8 = str8;
                                                    str6 = str6;
                                                    str7 = str7;
                                                    str10 = str10;
                                                    this = this;
                                                    str3 = str5;
                                                } else {
                                                    if (jSONObject.has("sleepScore") && jSONObject.getInt("sleepScore") > i5) {
                                                        i5 = jSONObject.getInt("sleepScore");
                                                    }
                                                    if (jSONObject.has(str6)) {
                                                        numValueOf = Integer.valueOf(jSONObject.getInt(str6));
                                                    }
                                                    if (jSONObject.has("snoreFreq")) {
                                                        try {
                                                            if (jSONObject.getInt("snoreFreq") > 0) {
                                                                d6 = jSONObject.getInt("snoreFreq");
                                                            }
                                                        } catch (JSONException unused) {
                                                            str6 = str6;
                                                            str7 = str7;
                                                            this = this;
                                                            str3 = str5;
                                                            ReleaseLogUtil.a("HiH_HiCoreSleepStat", "metadata jsonException", next);
                                                            z5 = z5;
                                                            i5 = i5;
                                                            str6 = str6;
                                                            str5 = str3;
                                                            z2 = z6;
                                                            str9 = str2;
                                                            str10 = str10;
                                                            str8 = str8;
                                                            this = this;
                                                            str7 = str7;
                                                            it = it2;
                                                        }
                                                    }
                                                    try {
                                                        if (jSONObject.has("deepPart") && jSONObject.getInt("deepPart") > 0) {
                                                            d5 = jSONObject.getInt("deepPart");
                                                        }
                                                        if (jSONObject.has(str5)) {
                                                            i6 = jSONObject.getInt(str5);
                                                            if (i6 > 0) {
                                                                z5 = true;
                                                            }
                                                            if (i6 < i3) {
                                                                i3 = i6;
                                                            }
                                                        }
                                                        if (jSONObject.has("maxHeartrate") && jSONObject.getInt("maxHeartrate") > i2) {
                                                            i2 = jSONObject.getInt("maxHeartrate");
                                                        }
                                                        if (jSONObject.has("minOxygenSaturation") && jSONObject.getInt("minOxygenSaturation") < d8) {
                                                            d8 = jSONObject.getDouble("minOxygenSaturation");
                                                        }
                                                        if (jSONObject.has(str7) && jSONObject.getInt(str7) > d4) {
                                                            d4 = jSONObject.getDouble(str7);
                                                        }
                                                        str4 = str10;
                                                        try {
                                                            if (jSONObject.has(str4)) {
                                                                try {
                                                                    str7 = str7;
                                                                    if (jSONObject.getInt(str4) < d2) {
                                                                        try {
                                                                            d2 = jSONObject.getDouble(str4);
                                                                        } catch (JSONException unused2) {
                                                                            str8 = str8;
                                                                            str3 = str5;
                                                                            str10 = str4;
                                                                            ReleaseLogUtil.a("HiH_HiCoreSleepStat", "metadata jsonException", next);
                                                                            z5 = z5;
                                                                            i5 = i5;
                                                                            str6 = str6;
                                                                            str5 = str3;
                                                                            z2 = z6;
                                                                            str9 = str2;
                                                                            str10 = str10;
                                                                            str8 = str8;
                                                                            this = this;
                                                                            str7 = str7;
                                                                            it = it2;
                                                                        }
                                                                    }
                                                                } catch (JSONException unused3) {
                                                                    str7 = str7;
                                                                }
                                                            } else {
                                                                str7 = str7;
                                                            }
                                                            str8 = str8;
                                                            try {
                                                                try {
                                                                    if (jSONObject.has(str8)) {
                                                                        try {
                                                                            str3 = str5;
                                                                            str10 = str4;
                                                                            if (jSONObject.getInt(str8) > d7) {
                                                                                try {
                                                                                    d7 = jSONObject.getDouble(str8);
                                                                                } catch (JSONException unused4) {
                                                                                    this = this;
                                                                                    ReleaseLogUtil.a("HiH_HiCoreSleepStat", "metadata jsonException", next);
                                                                                    z5 = z5;
                                                                                    i5 = i5;
                                                                                    str6 = str6;
                                                                                    str5 = str3;
                                                                                    z2 = z6;
                                                                                    str9 = str2;
                                                                                    str10 = str10;
                                                                                    str8 = str8;
                                                                                    this = this;
                                                                                    str7 = str7;
                                                                                    it = it2;
                                                                                }
                                                                            }
                                                                            a(jSONObject, professionalSleep);
                                                                        } catch (JSONException unused5) {
                                                                            str3 = str5;
                                                                            str10 = str4;
                                                                        }
                                                                    } else {
                                                                        str3 = str5;
                                                                        str10 = str4;
                                                                    }
                                                                    a(jSONObject, professionalSleep);
                                                                } catch (JSONException unused6) {
                                                                    ReleaseLogUtil.a("HiH_HiCoreSleepStat", "metadata jsonException", next);
                                                                    z5 = z5;
                                                                    i5 = i5;
                                                                }
                                                            } catch (JSONException unused7) {
                                                                str3 = str5;
                                                                str10 = str4;
                                                                ReleaseLogUtil.a("HiH_HiCoreSleepStat", "metadata jsonException", next);
                                                                z5 = z5;
                                                                i5 = i5;
                                                                str6 = str6;
                                                                str5 = str3;
                                                                z2 = z6;
                                                                str9 = str2;
                                                                str10 = str10;
                                                                str8 = str8;
                                                                this = this;
                                                                str7 = str7;
                                                                it = it2;
                                                            }
                                                        } catch (JSONException unused8) {
                                                            str8 = str8;
                                                            str3 = str5;
                                                            str10 = str4;
                                                            str7 = str7;
                                                        }
                                                    } catch (JSONException unused9) {
                                                        str7 = str7;
                                                        this = this;
                                                        str3 = str5;
                                                        ReleaseLogUtil.a("HiH_HiCoreSleepStat", "metadata jsonException", next);
                                                        z5 = z5;
                                                        i5 = i5;
                                                        str6 = str6;
                                                        str5 = str3;
                                                        z2 = z6;
                                                        str9 = str2;
                                                        str10 = str10;
                                                        str8 = str8;
                                                        this = this;
                                                        str7 = str7;
                                                        it = it2;
                                                    }
                                                }
                                            } catch (JSONException unused10) {
                                                str6 = str6;
                                            }
                                        } else {
                                            str8 = str8;
                                            str6 = str6;
                                            str7 = str7;
                                            str10 = str10;
                                            this = this;
                                            str3 = str5;
                                        }
                                    } catch (JSONException unused11) {
                                        str8 = str8;
                                        str7 = str7;
                                        this = this;
                                        str10 = str10;
                                        str3 = str5;
                                        str6 = str6;
                                    }
                                } else {
                                    str8 = str8;
                                    str7 = str7;
                                    this = this;
                                    str10 = str10;
                                    str3 = str5;
                                    str6 = str6;
                                }
                            } catch (JSONException unused12) {
                                str7 = str7;
                                this = this;
                                str8 = str8;
                                str6 = str6;
                                str3 = str5;
                                ReleaseLogUtil.a("HiH_HiCoreSleepStat", "metadata jsonException", next);
                                z5 = z5;
                                i5 = i5;
                                str6 = str6;
                                str5 = str3;
                                z2 = z6;
                                str9 = str2;
                                str10 = str10;
                                str8 = str8;
                                this = this;
                                str7 = str7;
                                it = it2;
                            }
                        } catch (JSONException unused13) {
                            str8 = str8;
                            str6 = str6;
                            str3 = str5;
                            ReleaseLogUtil.a("HiH_HiCoreSleepStat", "metadata jsonException", next);
                            z5 = z5;
                            i5 = i5;
                            str6 = str6;
                            str5 = str3;
                            z2 = z6;
                            str9 = str2;
                            str10 = str10;
                            str8 = str8;
                            this = this;
                            str7 = str7;
                            it = it2;
                        }
                    } catch (JSONException unused14) {
                        str2 = str9;
                    }
                    str6 = str6;
                    str5 = str3;
                    z2 = z6;
                    str9 = str2;
                    str10 = str10;
                    str8 = str8;
                    this = this;
                    str7 = str7;
                    it = it2;
                }
                hiCoreSleepStat = this;
                z3 = z2;
                str = str9;
                i = i5;
                z = z5;
                d3 = d2;
                d2 = d8;
            }
            if (numValueOf != null) {
                b(kukVar, numValueOf.intValue(), 44236, 0);
            }
            if (professionalSleep.getLastAvgHeartrate() != null) {
                z4 = true;
            } else {
                z4 = z3;
            }
            if (i != 0) {
                b(kukVar, i, 44203, 0);
            }
            if (d5 != 0.0d) {
                b(kukVar, d5, 44106, 0);
            }
            if (d6 != 0.0d) {
                b(kukVar, d6, 44208, 0);
            }
            if (z && !z4) {
                ReleaseLogUtil.d(str, "saveSleepHealthDataStat not support truSleep");
                if (hiCoreSleepStat.d == 2) {
                    ljz.c(kukVar, HiHealthDataType.g());
                    return;
                }
                return;
            }
            if (z) {
                b(kukVar, i3, d2, d3);
                a(kukVar, i2, d4, d7);
                i4 = 2;
            } else {
                i4 = 2;
                if (hiCoreSleepStat.d == 2) {
                    ljz.c(kukVar, HiHealthDataType.p());
                }
            }
            if (z4) {
                hiCoreSleepStat.b(kukVar, professionalSleep);
            } else if (hiCoreSleepStat.d == i4) {
                ljz.c(kukVar, HiHealthDataType.t());
            }
            b(kukVar, d, 44217, 15);
        }
        z2 = false;
        professionalSleep = new ProfessionalSleep();
        numValueOf = null;
        d2 = Double.MAX_VALUE;
        if (HiCommonUtil.b(listI)) {
            it = listI.iterator();
            i3 = Integer.MAX_VALUE;
            d8 = Double.MAX_VALUE;
            d4 = 0.0d;
            d5 = 0.0d;
            d6 = 0.0d;
            d7 = 0.0d;
            i2 = 0;
            z5 = z;
            i5 = 0;
            while (it.hasNext()) {
                Iterator<HiHealthData> it3 = it;
                next = it.next();
                boolean z7 = z2;
                str2 = str9;
                jSONObject = new JSONObject(next.getMetaData());
                next = next;
                if (jSONObject.optInt("validData", 0) == 65535) {
                    str8 = str8;
                    str7 = str7;
                    this = this;
                    str10 = str10;
                    str3 = str5;
                    str6 = str6;
                } else if (jSONObject.optInt("sleepEfficiency", 0) == 255) {
                    str8 = str8;
                    str6 = str6;
                    str7 = str7;
                    str10 = str10;
                    this = this;
                    str3 = str5;
                } else if (jSONObject.optInt("deepPart", 0) == 255) {
                    str8 = str8;
                    str6 = str6;
                    str7 = str7;
                    str10 = str10;
                    this = this;
                    str3 = str5;
                } else {
                    if (jSONObject.has("sleepScore")) {
                        i5 = jSONObject.getInt("sleepScore");
                    }
                    if (jSONObject.has(str6)) {
                        numValueOf = Integer.valueOf(jSONObject.getInt(str6));
                    }
                    if (jSONObject.has("snoreFreq")) {
                        if (jSONObject.getInt("snoreFreq") > 0) {
                            d6 = jSONObject.getInt("snoreFreq");
                        }
                    }
                    if (jSONObject.has("deepPart")) {
                        d5 = jSONObject.getInt("deepPart");
                    }
                    if (jSONObject.has(str5)) {
                        i6 = jSONObject.getInt(str5);
                        if (i6 > 0) {
                            z5 = true;
                        }
                        if (i6 < i3) {
                            i3 = i6;
                        }
                    }
                    if (jSONObject.has("maxHeartrate")) {
                        i2 = jSONObject.getInt("maxHeartrate");
                    }
                    if (jSONObject.has("minOxygenSaturation")) {
                        d8 = jSONObject.getDouble("minOxygenSaturation");
                    }
                    if (jSONObject.has(str7)) {
                        d4 = jSONObject.getDouble(str7);
                    }
                    str4 = str10;
                    if (jSONObject.has(str4)) {
                        str7 = str7;
                        if (jSONObject.getInt(str4) < d2) {
                            d2 = jSONObject.getDouble(str4);
                        }
                    } else {
                        str7 = str7;
                    }
                    str8 = str8;
                    if (jSONObject.has(str8)) {
                        str3 = str5;
                        str10 = str4;
                        if (jSONObject.getInt(str8) > d7) {
                            d7 = jSONObject.getDouble(str8);
                        }
                        a(jSONObject, professionalSleep);
                    } else {
                        str3 = str5;
                        str10 = str4;
                    }
                    a(jSONObject, professionalSleep);
                }
                str6 = str6;
                str5 = str3;
                z2 = z7;
                str9 = str2;
                str10 = str10;
                str8 = str8;
                this = this;
                str7 = str7;
                it = it3;
            }
            hiCoreSleepStat = this;
            z3 = z2;
            str = str9;
            i = i5;
            z = z5;
            d3 = d2;
            d2 = d8;
        } else {
            hiCoreSleepStat = this;
            z3 = z2;
            str = "Debug_HiCoreSleepStat";
            i = 0;
            i2 = 0;
            i3 = Integer.MAX_VALUE;
            d3 = Double.MAX_VALUE;
            d4 = 0.0d;
            d5 = 0.0d;
            d6 = 0.0d;
            d7 = 0.0d;
        }
        if (numValueOf != null) {
            b(kukVar, numValueOf.intValue(), 44236, 0);
        }
        if (professionalSleep.getLastAvgHeartrate() != null) {
            z4 = true;
        } else {
            z4 = z3;
        }
        if (i != 0) {
            b(kukVar, i, 44203, 0);
        }
        if (d5 != 0.0d) {
            b(kukVar, d5, 44106, 0);
        }
        if (d6 != 0.0d) {
            b(kukVar, d6, 44208, 0);
        }
        if (z) {
        }
        if (z) {
            b(kukVar, i3, d2, d3);
            a(kukVar, i2, d4, d7);
            i4 = 2;
        } else {
            i4 = 2;
            if (hiCoreSleepStat.d == 2) {
                ljz.c(kukVar, HiHealthDataType.p());
            }
        }
        if (z4) {
            hiCoreSleepStat.b(kukVar, professionalSleep);
        } else if (hiCoreSleepStat.d == i4) {
            ljz.c(kukVar, HiHealthDataType.t());
        }
        b(kukVar, d, 44217, 15);
    }

    private List<HiHealthData> d(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList(10);
        for (HiHealthData hiHealthData : list) {
            if (ljx.c(hiHealthData) == 5) {
                arrayList.add(hiHealthData);
            }
        }
        return arrayList;
    }

    private void a(JSONObject jSONObject, ProfessionalSleep professionalSleep) throws JSONException {
        if (jSONObject.has("avgHeartrate")) {
            professionalSleep.setLastAvgHeartrate(Integer.valueOf(jSONObject.getInt("avgHeartrate")));
        }
        if (jSONObject.has("minHeartrateBaseline")) {
            professionalSleep.setLastMinHeartrateBaseline(Integer.valueOf(jSONObject.getInt("minHeartrateBaseline")));
        }
        if (jSONObject.has("maxHeartrateBaseline")) {
            professionalSleep.setLastMaxHeartrateBaseline(Integer.valueOf(jSONObject.getInt("maxHeartrateBaseline")));
        }
        if (jSONObject.has("heartrateDayToBaseline")) {
            professionalSleep.setLastHeartrateDayToBaseline(Integer.valueOf(jSONObject.getInt("heartrateDayToBaseline")));
        }
        if (jSONObject.has("avgOxygenSaturation")) {
            professionalSleep.setLastAvgSpO2(Integer.valueOf(jSONObject.getInt("avgOxygenSaturation")));
        }
        if (jSONObject.has("minOxygenSaturationBaseline")) {
            professionalSleep.setLastMinSpO2Baseline(Integer.valueOf(jSONObject.getInt("minOxygenSaturationBaseline")));
        }
        if (jSONObject.has("maxOxygenSaturationBaseline")) {
            professionalSleep.setLastMaxSpO2Baseline(Integer.valueOf(jSONObject.getInt("maxOxygenSaturationBaseline")));
        }
        if (jSONObject.has("oxygenSaturationDayToBaseline")) {
            professionalSleep.setLastSpO2DayToBaseline(Integer.valueOf(jSONObject.getInt("oxygenSaturationDayToBaseline")));
        }
        if (jSONObject.has("avgBreathrate")) {
            professionalSleep.setLastAvgBreathrate(Integer.valueOf(jSONObject.getInt("avgBreathrate")));
        }
        if (jSONObject.has("minBreathrateBaseline")) {
            professionalSleep.setLastMinBreathrateBaseline(Integer.valueOf(jSONObject.getInt("minBreathrateBaseline")));
        }
        if (jSONObject.has("maxBreathrateBaseline")) {
            professionalSleep.setLastMaxBreathrateBaseline(Integer.valueOf(jSONObject.getInt("maxBreathrateBaseline")));
        }
        if (jSONObject.has("breathrateDayToBaseline")) {
            professionalSleep.setLastBreathrateDayToBaseline(Integer.valueOf(jSONObject.getInt("breathrateDayToBaseline")));
        }
        if (jSONObject.has("avgHrv")) {
            professionalSleep.setLastAvgHrv(Integer.valueOf(jSONObject.getInt("avgHrv")));
        }
        if (jSONObject.has("minHrvBaseline")) {
            professionalSleep.setLastMinHrvBaseline(Integer.valueOf(jSONObject.getInt("minHrvBaseline")));
        }
        if (jSONObject.has("maxHrvBaseline")) {
            professionalSleep.setLastMaxHrvBaseline(Integer.valueOf(jSONObject.getInt("maxHrvBaseline")));
        }
        if (jSONObject.has("hrvDayToBaseline")) {
            professionalSleep.setLastHrvDayToBaseline(Integer.valueOf(jSONObject.getInt("hrvDayToBaseline")));
        }
    }

    private void b(kuk kukVar, ProfessionalSleep professionalSleep) {
        e(kukVar, professionalSleep.getLastAvgHeartrate(), 44219, 8);
        e(kukVar, professionalSleep.getLastMinHeartrateBaseline(), 44220, 8);
        e(kukVar, professionalSleep.getLastMaxHeartrateBaseline(), 44221, 8);
        e(kukVar, professionalSleep.getLastHeartrateDayToBaseline(), 44222, 0);
        e(kukVar, professionalSleep.getLastAvgSpO2(), 44223, 0);
        e(kukVar, professionalSleep.getLastMinSpO2Baseline(), 44224, 0);
        e(kukVar, professionalSleep.getLastMaxSpO2Baseline(), 44225, 0);
        e(kukVar, professionalSleep.getLastSpO2DayToBaseline(), 44226, 0);
        e(kukVar, professionalSleep.getLastAvgBreathrate(), 44227, 0);
        e(kukVar, professionalSleep.getLastMinBreathrateBaseline(), 44228, 0);
        e(kukVar, professionalSleep.getLastMaxBreathrateBaseline(), 44229, 0);
        e(kukVar, professionalSleep.getLastBreathrateDayToBaseline(), 44230, 0);
        e(kukVar, professionalSleep.getLastAvgHrv(), 44231, 0);
        e(kukVar, professionalSleep.getLastMinHrvBaseline(), 44232, 0);
        e(kukVar, professionalSleep.getLastMaxHrvBaseline(), 44233, 0);
        e(kukVar, professionalSleep.getLastHrvDayToBaseline(), 44234, 0);
    }

    private void e(kuk kukVar, Integer num, int i, int i2) {
        if (num != null) {
            b(kukVar, num.intValue(), i, i2);
        }
    }

    private void b(kuk kukVar, int i, double d, double d2) {
        ReleaseLogUtil.d("Debug_HiCoreSleepStat", "min ", Integer.valueOf(i), Double.valueOf(d), Double.valueOf(d2));
        if (i != Integer.MAX_VALUE) {
            b(kukVar, i, 44209, 0);
        }
        if (d != Double.MAX_VALUE) {
            b(kukVar, d, 44211, 0);
        }
        if (d2 != Double.MAX_VALUE) {
            b(kukVar, d2, 44213, 0);
        }
    }

    private void a(kuk kukVar, int i, double d, double d2) {
        ReleaseLogUtil.d("Debug_HiCoreSleepStat", "max ", Integer.valueOf(i), Double.valueOf(d), Double.valueOf(d2));
        b(kukVar, i, 44210, 0);
        b(kukVar, d, 44212, 0);
        b(kukVar, d2, 44214, 0);
    }

    private void e(kuk kukVar, double d, double d2, double d3) {
        if (d <= 0.0d) {
            ReleaseLogUtil.d("Debug_HiCoreSleepStat", "delete sleep wakeDuration 44104");
            ljz.c(kukVar, new int[]{44104});
        } else {
            b(kukVar, d, 44104, 15);
        }
        if (d2 <= 0.0d) {
            ReleaseLogUtil.d("Debug_HiCoreSleepStat", "delete sleep noonDuration 44108");
            ljz.c(kukVar, new int[]{44108});
        } else {
            b(kukVar, d2, 44108, 15);
        }
        if (d3 <= 0.0d) {
            ReleaseLogUtil.d("Debug_HiCoreSleepStat", "delete sleep bedDuration 44109");
            ljz.c(kukVar, new int[]{44109});
        } else {
            b(kukVar, d3, 44109, 15);
        }
    }

    private void a(kuk kukVar, long j, long j2, long j3, long j4) {
        if (j > 0) {
            b(kukVar, j, 44201, 5);
        }
        if (j2 > 0) {
            b(kukVar, j2, 44202, 5);
        }
        if (j > j3) {
            b(kukVar, ((j - j3) / 1000) / 60, 44218, 0);
        } else {
            ReleaseLogUtil.d("Debug_HiCoreSleepStat", "delete sleep new latency 44218");
            ljz.c(kukVar, new int[]{44218});
        }
        if (j > j3) {
            b(kukVar, j3, 44205, 5);
        } else {
            b(kukVar, j, 44205, 5);
        }
        if (j4 > j2) {
            b(kukVar, j4, 44216, 5);
        } else {
            b(kukVar, j2, 44216, 5);
        }
    }

    private void b(kuk kukVar, Integer num, Integer num2, Integer num3) {
        if (num3 == null) {
            ReleaseLogUtil.d("Debug_HiCoreSleepStat", "delete sleep aasm dreamDuration 44111");
            ljz.c(kukVar, new int[]{44111});
        } else {
            b(kukVar, num3.intValue(), 44111, 15);
        }
        if (num == null) {
            ReleaseLogUtil.d("Debug_HiCoreSleepStat", "delete sleep aasm deep duration 44112");
            ljz.c(kukVar, new int[]{44112});
        } else {
            b(kukVar, num.intValue(), 44112, 15);
        }
        if (num2 == null) {
            ReleaseLogUtil.d("Debug_HiCoreSleepStat", "delete sleep aasm shallowDuration 44113");
            ljz.c(kukVar, new int[]{44113});
        } else {
            b(kukVar, num2.intValue(), 44113, 15);
        }
    }

    private void e(kuk kukVar, double d, double d2, double d3, double d4) {
        if (d3 <= 0.0d) {
            ReleaseLogUtil.d("Debug_HiCoreSleepStat", "delete sleep dreamDuration 44101");
            ljz.c(kukVar, new int[]{44101});
        } else {
            b(kukVar, d3, 44101, 15);
        }
        if (d <= 0.0d) {
            ReleaseLogUtil.d("Debug_HiCoreSleepStat", "delete sleep deep duration 44102");
            ljz.c(kukVar, new int[]{44102});
        } else {
            b(kukVar, d, 44102, 15);
        }
        if (d2 <= 0.0d) {
            ReleaseLogUtil.d("Debug_HiCoreSleepStat", "delete sleep shallowDuration 44103");
            ljz.c(kukVar, new int[]{44103});
        } else {
            b(kukVar, d2, 44103, 15);
        }
        if (d4 <= 0.0d) {
            ReleaseLogUtil.d("Debug_HiCoreSleepStat", "delete sleep totalDuration 44105");
            ljz.c(kukVar, new int[]{44105});
        } else {
            b(kukVar, d4, 44105, 15);
        }
    }

    private boolean b(kuk kukVar, double d, int i, int i2) {
        kukVar.c(d);
        kukVar.d(i);
        kukVar.f(i2);
        return this.mDataStatManager.b(kukVar, true, kukVar.g() < 50);
    }

    private void b(kuk kukVar, List<HiHealthData> list, double d, List<Integer> list2) {
        List<HiNoonSleepInfo.TimeInterval> listA = lji.a(list);
        if (HiCommonUtil.b(listA)) {
            e(kukVar);
            return;
        }
        HiNoonSleepInfo hiNoonSleepInfo = new HiNoonSleepInfo();
        hiNoonSleepInfo.d(listA);
        hiNoonSleepInfo.c(d);
        long jR = HiDateUtil.r(list.get(0).getStartTime());
        List<HiHealthData> listB = ljq.a(this.f12560b, DicDataTypeUtil.DataType.NOON_SLEEP_INFO.value()).b(jR, jR, DicDataTypeUtil.DataType.NOON_SLEEP_INFO.value(), list2);
        int i = (HiCommonUtil.b(listB) || !listB.get(0).getMetaData().equals(HiJsonUtil.d(hiNoonSleepInfo))) ? 0 : 1;
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setType(DicDataTypeUtil.DataType.NOON_SLEEP_INFO.value());
        hiHealthData.setStartTime(jR);
        hiHealthData.setEndTime(jR);
        hiHealthData.setMetaData(HiJsonUtil.d(hiNoonSleepInfo));
        hiHealthData.setSyncStatus(i);
        kxe.d(this.f12560b).c(hiHealthData, kwt.b().a(this.h, kwy.b(this.f12560b).c("-1"), kwi.b().b(this.f12560b.getPackageName())), 0);
    }

    private void e(kuk kukVar) {
        int iA = kwt.b().a(this.h, kwy.b(this.f12560b).c("-1"), kwi.b().b(this.f12560b.getPackageName()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(iA));
        List<HiHealthData> listA = kxe.d(this.f12560b).a(HiDateUtil.a(kukVar.e()), HiDateUtil.a(kukVar.e()), new int[]{DicDataTypeUtil.DataType.NOON_SLEEP_INFO.value()}, arrayList);
        if (HiCommonUtil.b(listA)) {
            return;
        }
        HiHealthData hiHealthData = listA.get(0);
        if (hiHealthData.getSyncStatus() == 0) {
            kxe.d(this.f12560b).b(hiHealthData.getStartTime(), hiHealthData.getEndTime(), hiHealthData.getType(), hiHealthData.getClientId());
        } else {
            kxe.d(this.f12560b).b(hiHealthData.getDataId(), 2, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004d  */
    private int a(kuk kukVar, List<HiHealthData> list) {
        String strE;
        HiDeviceInfo hiDeviceInfoB = kwy.b(this.f12560b).b(kwt.b().c(list.get(0).getClientId()));
        if (hiDeviceInfoB == null) {
            ReleaseLogUtil.e("Debug_HiCoreSleepStat", "deviceInfo is null!");
            return -1;
        }
        int deviceType = hiDeviceInfoB.getDeviceType();
        if (deviceType != 0) {
            List<ProductMapInfo> listC = ProductMap.c("deviceId", String.valueOf(deviceType));
            if (HiCommonUtil.b(listC)) {
                strE = null;
            } else {
                strE = listC.get(0).e();
            }
        } else {
            strE = null;
        }
        int iB = CommonUtil.b(strE, 16);
        if (iB == -1) {
            ReleaseLogUtil.e("Debug_HiCoreSleepStat", "categoryValue is invalid");
            return -1;
        }
        b(kukVar, iB, 44110, 0);
        return iB;
    }
}
