package com.huawei.ui.main.stories.health.interactors.healthdata;

import android.content.Context;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiDataFilter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.main.R;
import defpackage.dnb;
import defpackage.exz;
import defpackage.vei;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes19.dex */
public class BodyReportRecycleItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e[] f27982a;
    private dnb f;
    private BodyReportType i;
    private static final int[] e = {2, 1, 10, 26};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f27980b = {5, 25, 4, 11};
    private static final int[] d = {5, 7, 4, 26};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f27981c = {5, 4, 11};

    public enum BodyReportType {
        BODY_ANALYSIS,
        PEER_COMPARISON,
        MUSCLE_ANALYSIS,
        FAT_ANALYSIS,
        PHYSIQUE_PREDICTION,
        IMPORTANT_INDICATORS,
        OTHER_INDICATORS
    }

    private int d(int i) {
        return (i == 94 || i == 95 || i == 106 || i == 385) ? 1 : 0;
    }

    public BodyReportRecycleItem(BodyReportType bodyReportType, dnb dnbVar) {
        this.i = bodyReportType;
        this.f = dnbVar;
        if (bodyReportType == BodyReportType.IMPORTANT_INDICATORS || this.i == BodyReportType.OTHER_INDICATORS) {
            this.f27982a = c(this.i, this.f);
        }
    }

    private e[] c(BodyReportType bodyReportType, dnb dnbVar) {
        int[] iArr;
        if (this.i != BodyReportType.IMPORTANT_INDICATORS && this.i != BodyReportType.OTHER_INDICATORS) {
            LogUtil.j("BodyReportRecycleItem", "buildIndexTableItems illegal argument: itemType", bodyReportType);
        }
        if (bodyReportType == BodyReportType.IMPORTANT_INDICATORS) {
            iArr = e;
        } else if (Utils.o()) {
            iArr = f27981c;
        } else if ("b29df4e3-b1f7-4e40-960d-4cfb63ccca05".equals(dnbVar.getWeightScaleProductId()) && dnbVar.c() < 18) {
            iArr = d;
        } else {
            iArr = f27980b;
        }
        e[] eVarArr = new e[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            eVarArr[i] = d(iArr[i], dnbVar);
        }
        return eVarArr;
    }

    private e d(int i, dnb dnbVar) {
        e eVar = new e(i);
        eVar.e(a(i, dnbVar));
        eVar.b(a(i));
        eVar.a(c(i, dnbVar));
        eVar.d(b(i, dnbVar));
        return eVar;
    }

    private String a(int i, dnb dnbVar) {
        Context contextB = BaseApplication.b();
        if (i == 1) {
            return contextB.getResources().getString(R.string.IDS_hw_health_show_healthdata_bodyfat_rate);
        }
        if (i == 2) {
            return contextB.getResources().getString(R.string.IDS_hw_show_BMI);
        }
        if (i == 4) {
            return contextB.getResources().getString(R.string.IDS_hw_show_metabolism);
        }
        if (i == 5) {
            return contextB.getResources().getString(R.string.IDS_hw_show_haslet);
        }
        if (i == 7) {
            return contextB.getResources().getString(R.string.IDS_hw_show_bone);
        }
        if (i == 10) {
            return contextB.getResources().getString(R.string.IDS_hw_show_skeletal_muscle_mass);
        }
        if (i == 11) {
            return contextB.getResources().getString(R.string.IDS_main_watch_heart_rate_string);
        }
        if (i == 25) {
            if (dnbVar.as() > 0.0d) {
                return contextB.getResources().getString(R.string.IDS_weight_waist_to_hip_ratio);
            }
            return contextB.getResources().getString(R.string.IDS_weight_spectral_waist_to_hip_ratio);
        }
        if (i == 26) {
            return contextB.getResources().getString(R.string.IDS_weight_limb_skeletal_muscle_index);
        }
        LogUtil.j("BodyReportRecycleItem", "getWeightIndexName unknow weightIndex");
        return "";
    }

    private String b(int i, dnb dnbVar) {
        if (dnbVar == null) {
            LogUtil.j("BodyReportRecycleItem", "getWeightIndexValueFormat: weightBean is null");
            return "";
        }
        double dE = e(i, dnbVar);
        if (i != 1 && i != 2) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 7) {
                        return UnitUtil.e(dE, 1, dnbVar.getFractionDigitByType(7));
                    }
                    if (i != 10) {
                        if (i != 11) {
                            if (i == 25) {
                                return UnitUtil.e(dE, 1, 2);
                            }
                            if (i != 26) {
                                LogUtil.j("BodyReportRecycleItem", "getWeightIndexValueFormat: unknown itemType");
                                return "";
                            }
                        }
                    }
                }
            }
            return UnitUtil.e(dE, 1, 0);
        }
        return UnitUtil.e(dE, 1, 1);
    }

    private double e(int i, dnb dnbVar) {
        if (dnbVar == null) {
            LogUtil.j("BodyReportRecycleItem", "getWeightIndexValueFromWeightBean illegal weightBean");
            return -1.0d;
        }
        if (i == 1) {
            return dnbVar.b();
        }
        if (i == 2) {
            return dnbVar.f();
        }
        if (i == 4) {
            return dnbVar.e();
        }
        if (i == 5) {
            return dnbVar.s();
        }
        if (i == 7) {
            return dnbVar.g();
        }
        if (i == 10) {
            return dnbVar.am();
        }
        if (i == 11) {
            return dnbVar.q();
        }
        if (i == 25) {
            if (dnbVar.as() > 0.0d) {
                return dnbVar.as();
            }
            return dnbVar.ao();
        }
        if (i != 26) {
            LogUtil.j("BodyReportRecycleItem", "getWeightIndexValueFromWeightBean unknow weightIndex");
            return -1.0d;
        }
        return dnbVar.af();
    }

    private String a(int i) {
        Context contextB = BaseApplication.b();
        String string = contextB.getResources().getString(R.string.IDS_hw_health_empty_unit);
        if (i == 1) {
            return "%";
        }
        if (i != 2) {
            if (i == 4) {
                return contextB.getResources().getString(R.string.IDS_hw_show_sport_cal_unit_new);
            }
            if (i == 5) {
                return contextB.getResources().getString(R.string.IDS_hw_show_haslet_unit);
            }
            if (i == 7 || i == 10) {
                return vei.b();
            }
            if (i == 11) {
                return contextB.getResources().getString(R.string.IDS_device_measure_pressure_result_heart_rate_unit);
            }
            if (i != 25) {
                if (i == 26) {
                    return contextB.getResources().getString(R.string.IDS_weight_kg_square);
                }
                LogUtil.j("BodyReportRecycleItem", "getWeightIndexUnit unknow weightIndex");
                return string;
            }
        }
        return string;
    }

    private String c(int i, dnb dnbVar) {
        byte bAn = dnbVar.an();
        int iD = d(dnbVar.o());
        if (i == 1) {
            return e(exz.e(dnbVar.an(), dnbVar.c(), iD), HiDataFilter.DataFilterExpression.LESS_THAN);
        }
        if (i == 2) {
            return e(exz.c(Utils.o()));
        }
        if (i == 4) {
            return e(exz.e(dnbVar.an(), dnbVar.c(), dnbVar.av(), iD));
        }
        if (i == 5) {
            return e(new double[]{exz.w()[0], exz.z()[1] - 1.0d});
        }
        if (i == 7) {
            return e(exz.b(dnbVar.an(), dnbVar.r(), dnbVar.getFractionDigitByType(7), dnbVar.c()));
        }
        if (i == 10) {
            return e(exz.k());
        }
        if (i == 11) {
            return e(new double[]{exz.i()[0], exz.i()[1]});
        }
        if (i == 25) {
            return e(exz.b(dnbVar.an())[0], HiDataFilter.DataFilterExpression.LESS_THAN);
        }
        if (i == 26) {
            return e(exz.d(bAn, dnbVar.c()));
        }
        LogUtil.j("BodyReportRecycleItem", "getWeightIndexStandardRange unknow weightIndex");
        return "";
    }

    private String e(String[] strArr) {
        if (strArr == null || strArr.length != 2) {
            LogUtil.j("BodyReportRecycleItem", "getCloseRangeString illegal range");
            return "";
        }
        return strArr[0] + Constants.LINK + strArr[1];
    }

    private String e(double d2, String str) {
        return str + UnitUtil.e(d2, 1, 2);
    }

    private static String e(double[] dArr) {
        if (dArr == null || dArr.length != 2) {
            LogUtil.j("BodyReportRecycleItem", "getCloseRangeString illegal range");
            return "";
        }
        return UnitUtil.e(dArr[0], 1, 0) + Constants.LINK + UnitUtil.e(dArr[1], 1, 0);
    }

    public BodyReportType e() {
        return this.i;
    }

    public e[] c() {
        return (e[]) this.f27982a.clone();
    }

    public dnb a() {
        return this.f;
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f27983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f27984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f27985c;
        private String d;
        private String e;

        public e(int i) {
            this.f27984b = i;
        }

        public String e() {
            return this.d;
        }

        public String a() {
            return this.f27983a;
        }

        public String c() {
            return this.e;
        }

        public String b() {
            return this.f27985c;
        }

        public void e(String str) {
            this.d = str;
        }

        public void b(String str) {
            this.f27983a = str;
        }

        public void d(String str) {
            this.e = str;
        }

        public void a(String str) {
            this.f27985c = str;
        }
    }
}
