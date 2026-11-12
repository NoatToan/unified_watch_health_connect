package defpackage;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import health.compact.a.CompileParameterUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class vcs {
    public static List<uwc> a(dnb dnbVar, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList(31);
        if (dnbVar != null) {
            a((ArrayList<uwc>) arrayList, dnbVar, z2);
            j(arrayList, dnbVar, z2);
            k(arrayList, dnbVar, z2);
            s(arrayList, dnbVar, z2);
            m(arrayList, dnbVar, z2);
            t(arrayList, dnbVar, z2);
            d(arrayList, dnbVar, z2);
            c(arrayList, dnbVar, z2);
            e(arrayList, dnbVar, z2);
            o(arrayList, dnbVar, z2);
            f(arrayList, dnbVar, z2);
            l(arrayList, dnbVar, z2);
            i(arrayList, dnbVar, z2);
            h(arrayList, dnbVar, z2);
            b((ArrayList<uwc>) arrayList, dnbVar, z2);
            g(arrayList, dnbVar, z2);
            if (CompileParameterUtil.c("SUPPORT_WIFI_WEIGHT_DEVICE", false)) {
                n(arrayList, dnbVar, z);
            }
        }
        return arrayList;
    }

    private static void b(double d, uwc uwcVar, int i) {
        double dB = UnitUtil.b(d, i);
        uwcVar.d(UnitUtil.e(dB, 1, i));
        uwcVar.e(vei.e(dB, false));
    }

    private static void a(ArrayList<uwc> arrayList, dnb dnbVar, boolean z) {
        if (dnbVar.isVisible(2, z)) {
            double dF = dnbVar.f();
            if (!ezh.c(dF, Utils.o())) {
                dF = exz.c(dnbVar.av(), dnbVar.r());
            }
            uwc uwcVar = new uwc();
            uwcVar.e(dF);
            uwcVar.b(2);
            uwcVar.a(R.string.IDS_hw_show_BMI);
            uwcVar.d(UnitUtil.e(dF, 1, 1));
            uwcVar.e(BaseApplication.getContext().getResources().getString(R.string.IDS_hw_health_empty_unit));
            arrayList.add(uwcVar);
        }
    }

    private static void j(ArrayList<uwc> arrayList, dnb dnbVar, boolean z) {
        if (dnbVar.isVisible(1, z)) {
            double dB = dnbVar.b();
            uwc uwcVar = new uwc();
            uwcVar.e(dB);
            uwcVar.b(1);
            uwcVar.a(R.string.IDS_hw_health_show_healthdata_bodyfat_rate);
            uwcVar.d(a(dB));
            arrayList.add(uwcVar);
        }
    }

    private static void k(ArrayList<uwc> arrayList, dnb dnbVar, boolean z) {
        if (dnbVar.isVisible(10, z)) {
            double dAm = dnbVar.am();
            uwc uwcVar = new uwc();
            uwcVar.e(dAm);
            uwcVar.b(10);
            uwcVar.a(R.string.IDS_hw_show_skeletal_muscle_mass);
            b(dAm, uwcVar, 1);
            arrayList.add(uwcVar);
        }
    }

    private static void s(ArrayList<uwc> arrayList, dnb dnbVar, boolean z) {
        if (dnbVar.isVisible(5, z)) {
            double dS = dnbVar.s();
            uwc uwcVar = new uwc();
            uwcVar.e(dS);
            uwcVar.b(5);
            uwcVar.a(R.string.IDS_hw_show_haslet);
            uwcVar.d(UnitUtil.e(dS, 1, 1));
            uwcVar.e(BaseApplication.getContext().getResources().getString(R.string.IDS_hw_show_haslet_unit));
            arrayList.add(uwcVar);
        }
    }

    private static void m(ArrayList<uwc> arrayList, dnb dnbVar, boolean z) {
        if (dnbVar.isVisible(26, z)) {
            double dAf = dnbVar.af();
            uwc uwcVar = new uwc();
            uwcVar.e(dAf);
            uwcVar.b(26);
            uwcVar.a(R.string.IDS_weight_limb_skeletal_muscle_index);
            uwcVar.d(UnitUtil.e(dAf, 1, 1));
            uwcVar.e(BaseApplication.getContext().getResources().getString(R.string.IDS_weight_kg_square));
            arrayList.add(uwcVar);
        }
    }

    private static void t(ArrayList<uwc> arrayList, dnb dnbVar, boolean z) {
        if (dnbVar.isVisible(25, z)) {
            double dAo = dnbVar.ao();
            double dAs = dnbVar.as();
            int i = R.string.IDS_weight_spectral_waist_to_hip_ratio;
            if (dAs > 0.0d) {
                i = R.string.IDS_weight_waist_to_hip_ratio;
                dAo = dAs;
            }
            uwc uwcVar = new uwc();
            uwcVar.e(dAo);
            uwcVar.b(25);
            uwcVar.a(i);
            uwcVar.d(UnitUtil.e(dAo, 1, 2));
            uwcVar.e(BaseApplication.getContext().getResources().getString(R.string.IDS_hw_health_empty_unit));
            arrayList.add(uwcVar);
        }
    }

    private static void d(ArrayList<uwc> arrayList, dnb dnbVar, boolean z) {
        if (dnbVar.isVisible(13, z)) {
            int iD = vei.d(dnbVar);
            uwc uwcVar = new uwc();
            uwcVar.e(iD);
            uwcVar.b(13);
            uwcVar.a(R.string.IDS_hw_weight_body_type);
            uwcVar.d(vcz.d(iD));
            uwcVar.e(BaseApplication.getContext().getResources().getString(R.string.IDS_hw_health_empty_unit));
            arrayList.add(uwcVar);
        }
    }

    private static void c(ArrayList<uwc> arrayList, dnb dnbVar, boolean z) {
        if (dnbVar.isVisible(27, z)) {
            int iB = exz.b(dnbVar.an(), dnbVar.j());
            uwc uwcVar = new uwc();
            uwcVar.e(dnbVar.j());
            uwcVar.b(27);
            uwcVar.a(R.string.IDS_hw_weight_body_shape);
            uwcVar.d(vcz.e(iB));
            uwcVar.e(BaseApplication.getContext().getResources().getString(R.string.IDS_hw_health_empty_unit));
            arrayList.add(uwcVar);
        }
    }

    private static void e(ArrayList<uwc> arrayList, dnb dnbVar, boolean z) {
        if (dnbVar.isVisible(4, z)) {
            double dE = dnbVar.e();
            uwc uwcVar = new uwc();
            uwcVar.e(dE);
            uwcVar.b(4);
            uwcVar.a(R.string.IDS_hw_show_metabolism);
            uwcVar.d(UnitUtil.e(dE, 1, 0));
            uwcVar.e(BaseApplication.getContext().getResources().getString(R.string.IDS_hw_show_sport_cal_unit_new));
            arrayList.add(uwcVar);
        }
    }

    private static void o(ArrayList<uwc> arrayList, dnb dnbVar, boolean z) {
        if (dnbVar.isVisible(3, z)) {
            double dAq = dnbVar.aq();
            if (!ezh.r(dAq)) {
                dAq = dnbVar.ak();
            }
            uwc uwcVar = new uwc();
            uwcVar.e(dAq);
            uwcVar.b(3);
            uwcVar.a(R.string.IDS_hw_show_water);
            uwcVar.d(a(dAq));
            arrayList.add(uwcVar);
        }
    }

    private static void f(ArrayList<uwc> arrayList, dnb dnbVar, boolean z) {
        if (dnbVar.isVisible(7, z)) {
            double dG = dnbVar.g();
            uwc uwcVar = new uwc();
            uwcVar.e(dG);
            uwcVar.b(7);
            uwcVar.a(R.string.IDS_hw_show_bone);
            b(dG, uwcVar, dnbVar.getFractionDigitByType(7));
            arrayList.add(uwcVar);
        }
    }

    private static void l(ArrayList<uwc> arrayList, dnb dnbVar, boolean z) {
        if (dnbVar.isVisible(8, z)) {
            double dAq = dnbVar.aq();
            if (!ezh.r(dAq)) {
                dAq = dnbVar.ak();
            }
            double dE = exz.e(dnbVar.av(), dAq, dnbVar.b(), dnbVar.g(), dnbVar.getFractionDigitByType(0));
            uwc uwcVar = new uwc();
            uwcVar.e(dE);
            uwcVar.b(8);
            uwcVar.a(R.string.IDS_hw_show_protein);
            uwcVar.d(a(dE));
            arrayList.add(uwcVar);
        }
    }

    private static void i(ArrayList<uwc> arrayList, dnb dnbVar, boolean z) {
        if (dnbVar.isVisible(6, z)) {
            double dAd = dnbVar.ad();
            uwc uwcVar = new uwc();
            uwcVar.e(dAd);
            uwcVar.b(6);
            uwcVar.a(R.string.IDS_hw_show_muscle);
            b(dAd, uwcVar, 1);
            arrayList.add(uwcVar);
        }
    }

    private static void h(ArrayList<uwc> arrayList, dnb dnbVar, boolean z) {
        if (dnbVar.isVisible(14, z)) {
            double dA = exz.a(dnbVar.b(), dnbVar.av());
            uwc uwcVar = new uwc();
            uwcVar.e(dA);
            uwcVar.b(14);
            uwcVar.a(R.string.IDS_weight_fat_free);
            b(dA, uwcVar, 1);
            arrayList.add(uwcVar);
        }
    }

    private static void b(ArrayList<uwc> arrayList, dnb dnbVar, boolean z) {
        if (dnbVar.isVisible(9, z)) {
            double dA = dnbVar.a();
            uwc uwcVar = new uwc();
            uwcVar.e(dA);
            uwcVar.b(9);
            uwcVar.a(R.string.IDS_hw_show_bodyage);
            uwcVar.d(UnitUtil.e(dA, 1, 0));
            uwcVar.e(BaseApplication.getContext().getResources().getString(R.string.IDS_hw_health_empty_unit));
            arrayList.add(uwcVar);
        }
    }

    private static void g(ArrayList<uwc> arrayList, dnb dnbVar, boolean z) {
        if (dnbVar.isVisible(11, z)) {
            double dQ = dnbVar.q();
            uwc uwcVar = new uwc();
            uwcVar.e(dQ);
            uwcVar.b(11);
            uwcVar.a(R.string.IDS_main_watch_heart_rate_string);
            uwcVar.d(UnitUtil.e(dQ, 1, 0));
            uwcVar.e(BaseApplication.getContext().getResources().getString(R.string.IDS_device_measure_pressure_result_heart_rate_unit));
            arrayList.add(uwcVar);
        }
    }

    private static void n(ArrayList<uwc> arrayList, dnb dnbVar, boolean z) {
        int iO = dnbVar.o();
        boolean zE = e(iO);
        boolean z2 = true;
        boolean z3 = iO == 82 || iO == 85;
        boolean z4 = iO == 84 || iO == 86;
        if (!z3 && !z4) {
            z2 = false;
        }
        if (z && z2) {
            if (!d(arrayList, dnbVar) && ean.e() && !zE) {
                uwc uwcVar = new uwc();
                uwcVar.b(12);
                uwcVar.a(R.string.IDS_hw_show_pressure_index);
                uwcVar.d(BaseApplication.getContext().getResources().getString(R.string.IDS_hw_health_empty_unit));
                uwcVar.e(BaseApplication.getContext().getResources().getString(R.string.IDS_device_wifi_no_pressure_calibrate_msg));
                uwcVar.a(false);
                arrayList.add(uwcVar);
                return;
            }
            LogUtil.j("HealthWeight_BodyIndexConstructUtils", "Exist pressure value or don't bind wifi device or isPressureCalibrated");
            return;
        }
        d(arrayList, dnbVar);
    }

    private static boolean e(int i) {
        String str;
        dnj currentUser = MultiUsersManager.INSTANCE.getCurrentUser();
        dnj mainUser = MultiUsersManager.INSTANCE.getMainUser();
        String strI = currentUser.i();
        String strI2 = mainUser.i();
        if (!TextUtils.isEmpty(strI) && !TextUtils.isEmpty(strI2)) {
            if (strI.equals(strI2)) {
                LogUtil.a("HealthWeight_BodyIndexConstructUtils", "Current User is main user");
                strI = "0";
            }
        } else {
            strI = "";
        }
        if (i == 82 || i == 85) {
            str = "pressure_calibrate_hrv_userinfo_e4b0b1d5-2003-4d88-8b5f-c4f64542040b";
        } else if (i == 84 || i == 86) {
            str = "pressure_calibrate_hrv_userinfo_a8ba095d-4123-43c4-a30a-0240011c58de";
        } else {
            LogUtil.j("HealthWeight_BodyIndexConstructUtils", "no fliter");
            str = "pressure_calibrate_hrv_userinfo_";
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), str);
        if (!TextUtils.isEmpty(strE)) {
            LogUtil.a("HealthWeight_BodyIndexConstructUtils", "hrvUserInfo details: ", strE);
            for (String str2 : strE.split(";")) {
                if (strI.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean d(ArrayList<uwc> arrayList, dnb dnbVar) {
        double dZ = dnbVar.z();
        if (ezh.m(dZ) && dZ > 0.0d) {
            uwc uwcVar = new uwc();
            uwcVar.e(dZ);
            uwcVar.b(12);
            uwcVar.a(R.string.IDS_hw_show_pressure_index);
            uwcVar.d(UnitUtil.e(dZ, 1, 0));
            uwcVar.e(BaseApplication.getContext().getResources().getString(R.string.IDS_hw_health_empty_unit));
            uwcVar.a(true);
            arrayList.add(uwcVar);
            return true;
        }
        LogUtil.j("HealthWeight_BodyIndexConstructUtils", "showPressureData() don't add small pressure card...");
        return false;
    }

    private static SpannableString a(double d) {
        String strE = UnitUtil.e(d, 1, 1);
        SpannableString spannableString = new SpannableString(UnitUtil.e(d, 2, 1));
        int iIndexOf = spannableString.toString().indexOf(strE);
        if (iIndexOf != -1) {
            spannableString.setSpan(new TextAppearanceSpan(BaseApplication.getContext(), R.style.weight_body_index_unit_text_style), 0, spannableString.length(), 33);
            spannableString.setSpan(new TextAppearanceSpan(BaseApplication.getContext(), R.style.weight_body_index_value_text_style), iIndexOf, strE.length() + iIndexOf, 33);
        }
        return spannableString;
    }
}
