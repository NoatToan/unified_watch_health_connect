package defpackage;

import android.app.Activity;
import android.content.Context;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.hwbasemgr.WeightBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.views.HealthBodyBarData;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class vdh {
    public static void d(final Context context, final dnb dnbVar, final HealthBodyBarData healthBodyBarData) {
        dnj currentUser = MultiUsersManager.INSTANCE.getCurrentUser();
        if (currentUser.s()) {
            d(dnbVar, healthBodyBarData, currentUser.j());
        } else {
            MultiUsersManager.INSTANCE.getCurrentUser(new WeightBaseResponseCallback<dnj>() { // from class: vdh.3
                @Override // com.huawei.hwbasemgr.WeightBaseResponseCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onResponse(final int i, final dnj dnjVar) {
                    Context context2 = context;
                    if (context2 == null || !(context2 instanceof Activity)) {
                        LogUtil.j("HealthWeight_PeerComparisionUtils", "mContext is null or mContext is not Activity");
                    } else {
                        ((Activity) context2).runOnUiThread(new Runnable() { // from class: vdh.3.4
                            @Override // java.lang.Runnable
                            public void run() {
                                dnj currentUser2 = dnjVar;
                                if (currentUser2 == null || i != 0) {
                                    LogUtil.j("HealthWeight_PeerComparisionUtils", "loadDataSuccess getCurrentUser: currentUser is null return");
                                    currentUser2 = MultiUsersManager.INSTANCE.getCurrentUser();
                                }
                                vdh.d(dnbVar, healthBodyBarData, currentUser2.j());
                            }
                        });
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(dnb dnbVar, HealthBodyBarData healthBodyBarData, int i) {
        if (dnbVar == null || healthBodyBarData == null) {
            LogUtil.j("HealthWeight_PeerComparisionUtils", "setPeerBarView weightBean ", dnbVar, "healthBodyBarData ", healthBodyBarData);
            return;
        }
        wus wusVarB = b(dnbVar, i);
        e(dnbVar, wusVarB, healthBodyBarData);
        c(dnbVar, wusVarB, healthBodyBarData);
        a(dnbVar, wusVarB, healthBodyBarData);
        b(dnbVar, wusVarB, healthBodyBarData);
        d(dnbVar, wusVarB, healthBodyBarData);
    }

    private static void e(dnb dnbVar, wus wusVar, HealthBodyBarData healthBodyBarData) {
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setMinimumFractionDigits(1);
        double dF = dnbVar.f();
        boolean zO = Utils.o();
        if (!ezh.c(dF, zO)) {
            LogUtil.j("HealthWeight_PeerComparisionUtils", "setPeerBmiView Bmi is out of range");
            healthBodyBarData.setBmiBar(null);
            return;
        }
        float fP = wusVar.p();
        String str = percentInstance.format(wusVar.m());
        double[] dArrC = exz.c(zO);
        double[] dArrE = exz.e(zO, dnbVar.an(), dnbVar.c());
        healthBodyBarData.setBmiBar(a(vcw.a(0), String.format(BaseApplication.getContext().getResources().getString(R.string.IDS_weight_better_than_of_peers), str), "", new float[]{(float) dF, fP, (float) dArrC[0], (float) dArrE[0], (float) dArrE[1], (float) dArrC[1]}));
    }

    private static void c(dnb dnbVar, wus wusVar, HealthBodyBarData healthBodyBarData) {
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setMinimumFractionDigits(1);
        float fB = (float) dnbVar.b();
        double[] doubleArrayLevelByType = dnbVar.getDoubleArrayLevelByType(1);
        if (!ezh.g(fB)) {
            LogUtil.j("HealthWeight_PeerComparisionUtils", "setPeerBodyFatView BodyFat is out of range");
            healthBodyBarData.setFatBar(null);
        } else {
            if (vei.b(doubleArrayLevelByType, 1)) {
                float fO = wusVar.o();
                String str = percentInstance.format(wusVar.l());
                double[] dArrH = exz.h();
                healthBodyBarData.setFatBar(a(vcw.h(0), String.format(BaseApplication.getContext().getResources().getString(R.string.IDS_weight_better_than_of_peers), str), BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_show_chart_unit_string, BaseApplication.getContext().getResources().getString(R.string.IDS_hw_health_show_healthdata_weight_percent)), new float[]{fB, fO * 100.0f, (float) dArrH[0], (float) doubleArrayLevelByType[0], (float) doubleArrayLevelByType[1], (float) dArrH[1]}));
                return;
            }
            healthBodyBarData.setFatBar(null);
        }
    }

    private static void a(dnb dnbVar, wus wusVar, HealthBodyBarData healthBodyBarData) {
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setMinimumFractionDigits(1);
        float fS = (float) dnbVar.s();
        if (!ezh.u(fS)) {
            LogUtil.j("HealthWeight_PeerComparisionUtils", "setPeerVisceralLevelView VisceralLevel is out of range");
            healthBodyBarData.setVisceralBar(null);
            return;
        }
        float fW = wusVar.w();
        String str = percentInstance.format(wusVar.u());
        double[] dArrW = exz.w();
        double[] doubleArrayLevelByType = dnbVar.getDoubleArrayLevelByType(5);
        if (vei.b(doubleArrayLevelByType, 1)) {
            healthBodyBarData.setVisceralBar(a(vcw.q(0), String.format(BaseApplication.getContext().getResources().getString(R.string.IDS_weight_better_than_of_peers), str), BaseApplication.getContext().getResources().getString(R.string.IDS_weight_brackets_grade), new float[]{fS, fW, 0.0f, (float) dArrW[0], ((float) doubleArrayLevelByType[1]) - 1.0f, (float) dArrW[1]}));
            return;
        }
        healthBodyBarData.setVisceralBar(null);
    }

    private static void b(dnb dnbVar, wus wusVar, HealthBodyBarData healthBodyBarData) {
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setMinimumFractionDigits(1);
        double dAm = (float) dnbVar.am();
        if (!ezh.t(dAm)) {
            LogUtil.j("HealthWeight_PeerComparisionUtils", "setPeerSkeletalMuscleView skeletalMuscle is out of range");
            healthBodyBarData.setMuscleBar(null);
            return;
        }
        float fS = wusVar.s();
        double[] dArrQ = exz.q();
        double d = dArrQ[0];
        double d2 = dArrQ[1];
        double[] doubleArrayLevelByType = dnbVar.getDoubleArrayLevelByType(10);
        if (vei.b(doubleArrayLevelByType, 1)) {
            float fFloatValue = BigDecimal.valueOf((float) UnitUtil.c(dAm)).setScale(1, 4).floatValue();
            float fFloatValue2 = BigDecimal.valueOf((float) UnitUtil.c(fS)).setScale(1, 4).floatValue();
            double dFloatValue = BigDecimal.valueOf((float) UnitUtil.c(d)).setScale(1, 4).floatValue();
            double dFloatValue2 = BigDecimal.valueOf((float) UnitUtil.c(d2)).setScale(1, 4).floatValue();
            healthBodyBarData.setMuscleBar(a(vcw.n(0), String.format(BaseApplication.getContext().getResources().getString(R.string.IDS_weight_better_than_of_peers), percentInstance.format(wusVar.q())), BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_show_chart_unit_string, vei.b()), new float[]{fFloatValue, fFloatValue2, (float) dFloatValue, BigDecimal.valueOf((float) UnitUtil.c(doubleArrayLevelByType[0])).setScale(1, 4).floatValue(), BigDecimal.valueOf((float) UnitUtil.c(doubleArrayLevelByType[1])).setScale(1, 4).floatValue(), (float) dFloatValue2}));
            return;
        }
        healthBodyBarData.setMuscleBar(null);
    }

    private static void d(dnb dnbVar, wus wusVar, HealthBodyBarData healthBodyBarData) {
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setMinimumFractionDigits(1);
        float fAf = (float) dnbVar.af();
        if (!ezh.p(fAf)) {
            LogUtil.j("HealthWeight_PeerComparisionUtils", "setRasmView Rasm is out of range");
            healthBodyBarData.setLimbBar(null);
            return;
        }
        float fT = wusVar.t();
        byte bAn = dnbVar.an();
        String str = percentInstance.format(wusVar.r());
        double[] dArrP = exz.p();
        double d = dArrP[0];
        double d2 = dArrP[1];
        double[] dArrD = exz.d(bAn, dnbVar.c());
        healthBodyBarData.setLimbBar(a(vcw.o(0), String.format(BaseApplication.getContext().getResources().getString(R.string.IDS_weight_better_than_of_peers), str), BaseApplication.getContext().getResources().getString(R.string.IDS_weight_brackets_kg_square), new float[]{fAf, fT, (float) d, (float) dArrD[0], (float) dArrD[1], (float) d2}));
    }

    private static qtd a(String str, String str2, String str3, float[] fArr) {
        qtd qtdVar = new qtd();
        qtdVar.b(str);
        qtdVar.c(str2);
        qtdVar.e(str3);
        if (fArr != null && fArr.length >= 5) {
            qtdVar.c((float) exz.b(fArr[0]));
            qtdVar.e((float) exz.b(fArr[1]));
            qtdVar.i((float) exz.b(fArr[2]));
            qtdVar.b((float) exz.b(fArr[3]));
            qtdVar.d((float) exz.b(fArr[4]));
            qtdVar.a((float) exz.b(fArr[5]));
        }
        return qtdVar;
    }

    public static wus b(dnb dnbVar, int i) {
        int iC = dnbVar.c();
        byte bAn = dnbVar.an();
        int iA = dor.a(i, iC);
        int iE = dor.e(i);
        float fR = dnbVar.r();
        float f = (float) dnbVar.f();
        float fB = (float) dnbVar.b();
        int iS = (int) dnbVar.s();
        float fAm = (float) dnbVar.am();
        float fAf = (float) dnbVar.af();
        LogUtil.a("HealthWeight_PeerComparisionUtils", "getPeerAnalysis age=", Integer.valueOf(iC), ",sex=", Integer.valueOf(bAn), ",realityAge=", Integer.valueOf(iA), "realityMonth=", Integer.valueOf(iE), ",height=", Float.valueOf(fR), ",bmi=", Float.valueOf(f), "bodyFat=", Float.valueOf(fB), ",visceralLevel=", Integer.valueOf(iS), ",skeletalMuscle=", Float.valueOf(fAm), ",rasm=", Float.valueOf(fAf));
        return new wus(iA, iE, bAn, fR / 100.0f, f, fB / 100.0f, iS, fAm, fAf);
    }

    public static String b(dnb dnbVar) {
        if (dnbVar == null) {
            LogUtil.j("HealthWeight_PeerComparisionUtils", "getPeerComparisionSuggestion WeightBean is null");
            return "";
        }
        int iC = dnbVar.c();
        int iD = d(exz.b(dnbVar.f(), Utils.o(), dnbVar.an(), iC));
        int iA = a((int) dnbVar.getDoubleOrIntLevelByType(1));
        int iA2 = a((int) dnbVar.getDoubleOrIntLevelByType(5));
        int iE = e((int) dnbVar.getDoubleOrIntLevelByType(10));
        int iE2 = e(exz.c(dnbVar.an(), dnbVar.af(), iC));
        int i = iD + iA + iA2 + iE + iE2;
        String[] stringArray = BaseApplication.getContext().getResources().getStringArray(R.array.IDS_comprehensive_evaluation_of_peers);
        boolean z = false;
        if (dnbVar.ac() != 2) {
            boolean z2 = iA2 > 0 && iE > 0;
            if (i >= 6 && iD > 0 && iA > 0 && z2) {
                return stringArray[3];
            }
            if (i >= 4) {
                return stringArray[2];
            }
            if (i >= 2) {
                return stringArray[1];
            }
            return stringArray[0];
        }
        if (iA2 > 0 && iE > 0 && iE2 > 0) {
            z = true;
        }
        if (i >= 8 && iD > 0 && iA > 0 && z) {
            return stringArray[3];
        }
        if (i >= 5) {
            return stringArray[2];
        }
        if (i >= 2) {
            return stringArray[1];
        }
        return stringArray[3];
    }

    private static int d(int i) {
        if (i < 0 || i > 4) {
            LogUtil.j("HealthWeight_PeerComparisionUtils", "getLevelToScoreOne level is out of range");
            return 0;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(0);
        arrayList.add(0);
        return ((Integer) arrayList.get(i - 1)).intValue();
    }

    private static int a(int i) {
        if (i < 0 || i > 4) {
            LogUtil.j("HealthWeight_PeerComparisionUtils", "getLevelToScoreTwo level is out of range");
            return 0;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(0);
        arrayList.add(0);
        return ((Integer) arrayList.get(i - 1)).intValue();
    }

    private static int e(int i) {
        if (i < 0 || i > 4) {
            LogUtil.j("HealthWeight_PeerComparisionUtils", "getLevelToScoreThree level is out of range");
            return 0;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);
        return ((Integer) arrayList.get(i - 1)).intValue();
    }
}
