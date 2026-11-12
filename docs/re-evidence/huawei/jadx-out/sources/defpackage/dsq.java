package defpackage;

import android.text.TextUtils;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.fatscale.multiusers.WeightDataManager;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.CommonUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Date;

/* JADX INFO: loaded from: classes7.dex */
public class dsq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f32333b = false;
    private static dnj e;

    public static dnb d(HealthDevice healthDevice, HealthData healthData, dnj dnjVar, int i) {
        if (healthData instanceof dso) {
            dso dsoVar = (dso) healthData;
            dnb dnbVar = new dnb();
            HiHealthData hiHealthData = new HiHealthData(i);
            long time = new Date().getTime();
            if (healthData.getStartTime() != 0 && healthData.getEndTime() != 0) {
                hiHealthData.setStartTime(healthData.getStartTime());
                hiHealthData.setEndTime(healthData.getEndTime());
            } else {
                hiHealthData.setStartTime(time);
                hiHealthData.setEndTime(time);
            }
            d(healthDevice, hiHealthData);
            double bodyFatRat = dsoVar.getBodyFatRat();
            if (bodyFatRat > 0.0d) {
                a(hiHealthData, BleConstants.BODY_FAT_RATE, Double.valueOf(bodyFatRat));
                dnbVar.d(bodyFatRat);
            }
            c(dsoVar, hiHealthData, dnbVar, dnjVar);
            if (TextUtils.isEmpty(hiHealthData.getDeviceUuid()) || "-1".equals(hiHealthData.getDeviceUuid()) || "0".equals(hiHealthData.getDeviceUuid())) {
                dnbVar.d(-1);
                hiHealthData.setDeviceUuid("-1");
            } else {
                dnbVar.d(2);
            }
            dnbVar.e(hiHealthData.getStartTime());
            dnbVar.d(hiHealthData.getEndTime());
            dnbVar.af(dsoVar.getWeight());
            dnbVar.e(dnjVar.c());
            dnbVar.c(dnjVar.e());
            dnbVar.c(dnjVar.d());
            if (healthDevice != null) {
                dnbVar.e(healthDevice.getDeviceName());
            }
            return dnbVar;
        }
        LogUtil.j("ConverResisToWeightDataUtil", "guestConvertWeightAndFatRateData data not WeightAndFatRateData");
        return null;
    }

    private static void d(HealthDevice healthDevice, HiHealthData hiHealthData) {
        if (!(healthDevice instanceof MeasurableDevice)) {
            if (healthDevice != null) {
                hiHealthData.setDeviceUuid(healthDevice.getUniqueId());
                return;
            }
            return;
        }
        MeasurableDevice measurableDevice = (MeasurableDevice) healthDevice;
        String productId = measurableDevice.getProductId();
        String strL = dxm.l(measurableDevice.getUniqueId());
        boolean z = (TextUtils.isEmpty(strL) || "0".equals(strL)) ? false : true;
        if (dxm.y(productId) && z) {
            hiHealthData.setDeviceUuid(strL);
        } else {
            hiHealthData.setDeviceUuid(healthDevice.getUniqueId());
        }
    }

    public static void b(HiHealthData hiHealthData, dso dsoVar, dnj dnjVar) {
        LogUtil.d("ConverResisToWeightDataUtil", "IHealthDataHandler HiHealthDataType.DATA_SET_WEIGHT_EX bodyDatas ", Float.valueOf(dsoVar.getWeight()), " ", Float.valueOf(dsoVar.getBodyFatRat()));
        a(hiHealthData, "bodyWeight", Float.valueOf(dsoVar.getWeight()));
        if (dnjVar == null) {
            dnjVar = MultiUsersManager.INSTANCE.getCurrentUser();
            dsoVar.a(dnjVar.i());
        }
        e = dnjVar;
        dnjVar.e(dsoVar.getWeight());
        String strI = dnjVar.i();
        MultiUsersManager.INSTANCE.saveUser(dnjVar, new IBaseResponseCallback() { // from class: dsq.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
            }
        });
        c(hiHealthData, strI, dsoVar);
        dnb dnbVar = new dnb();
        double bodyFatRat = dsoVar.getBodyFatRat();
        if (bodyFatRat > 0.0d) {
            a(hiHealthData, BleConstants.BODY_FAT_RATE, Double.valueOf(bodyFatRat));
            dnbVar.d(bodyFatRat);
        }
        c(hiHealthData, dnjVar);
        d(dsoVar, hiHealthData, dnbVar, dnjVar);
        c(dsoVar, hiHealthData, dnbVar, dnjVar);
        e(dsoVar, hiHealthData, dnbVar);
        if (TextUtils.isEmpty(hiHealthData.getDeviceUuid()) || hiHealthData.getDeviceUuid().equals("-1") || hiHealthData.getDeviceUuid().equals("0")) {
            dnbVar.d(-1);
            hiHealthData.setDeviceUuid("-1");
        } else {
            dnbVar.d(2);
        }
        dnbVar.e(hiHealthData.getStartTime());
        dnbVar.d(hiHealthData.getEndTime());
        dnbVar.af(dsoVar.getWeight());
        dnbVar.e(dnjVar.c());
        dnbVar.c(dnjVar.e());
        dnbVar.c(dnjVar.d());
        WeightDataManager.INSTANCE.setMapData(dnbVar, strI);
    }

    private static void c(HiHealthData hiHealthData, dnj dnjVar) {
        a(hiHealthData, "age", Integer.valueOf(dnjVar.c()));
        a(hiHealthData, "height", Integer.valueOf(dnjVar.e()));
        a(hiHealthData, CommonConstant.KEY_GENDER, Byte.valueOf(dnjVar.d()));
    }

    private static void d(dso dsoVar, HiHealthData hiHealthData, dnb dnbVar, dnj dnjVar) {
        if (!eny.a().b() || dsoVar.p() || dsoVar.getBodyFatRat() <= 0.5f) {
            return;
        }
        a(hiHealthData, dnbVar, new eac(dnjVar.e(), dsoVar.getWeight(), dne.a(dnjVar.d()), dnjVar.c(), dsoVar.getBodyFatRat(), dsoVar.l()));
        d(hiHealthData, dsoVar, dnbVar);
    }

    private static void e(dso dsoVar, HiHealthData hiHealthData, dnb dnbVar) {
        if (eny.a().c() || eny.a().b()) {
            return;
        }
        a(hiHealthData, BleConstants.BMI, Double.valueOf(dsoVar.c()));
        dnbVar.c(dsoVar.c());
        a(hiHealthData, BleConstants.VISCERAL_FAT_LEVEL, Double.valueOf(dsoVar.j()));
        dnbVar.l(dsoVar.j());
        a(hiHealthData, BleConstants.BASAL_METABOLISM, Double.valueOf(dsoVar.e()));
        dnbVar.b(dsoVar.e());
        a(hiHealthData, BleConstants.MOISTURE_RATE, Double.valueOf(dsoVar.n()));
        dnbVar.ag(dsoVar.n());
        a(hiHealthData, BleConstants.BONE_SALT, Double.valueOf(dsoVar.a()));
        dnbVar.h(dsoVar.a());
        a(hiHealthData, "protein", Double.valueOf(dsoVar.k()));
        dnbVar.s(dsoVar.k());
        a(hiHealthData, BleConstants.BODY_AGE, Double.valueOf(dsoVar.b()));
        dnbVar.a(dsoVar.b());
        a(hiHealthData, IndoorEquipManagerApi.KEY_HEART_RATE, Double.valueOf(dsoVar.i()));
        dnbVar.o(dsoVar.i());
    }

    private static void d(HiHealthData hiHealthData, dso dsoVar, dnb dnbVar) {
        double bodyFatRat = dsoVar.getBodyFatRat();
        dnj dnjVar = e;
        if (dnjVar != null && !TextUtils.equals(dnjVar.i(), dsoVar.o())) {
            double dL = dsoVar.l();
            if (dL > 0.0d) {
                wj wjVar = new wj();
                wjVar.b(e.e(), dsoVar.getWeight(), dne.a(e.d()), e.c(), (float) dL);
                try {
                    bodyFatRat = wjVar.c();
                } catch (wk unused) {
                    LogUtil.e("ConverResisToWeightDataUtil", "getBodyFatRate NoAuthException");
                    bodyFatRat = 0.0d;
                }
            }
        }
        if (bodyFatRat > 0.0d) {
            a(hiHealthData, BleConstants.BODY_FAT_RATE, Double.valueOf(bodyFatRat));
            dnbVar.d(bodyFatRat);
        }
    }

    private static void a(HiHealthData hiHealthData, dnb dnbVar, eac eacVar) {
        a(hiHealthData, BleConstants.BMI, Float.valueOf(eacVar.a()));
        a(hiHealthData, BleConstants.BASAL_METABOLISM, Float.valueOf(eacVar.b()));
        a(hiHealthData, BleConstants.BODY_AGE, Float.valueOf(eacVar.c()));
        a(hiHealthData, BleConstants.BODY_SCORE, Float.valueOf(eacVar.g()));
        a(hiHealthData, BleConstants.BONE_SALT, Float.valueOf(eacVar.d()));
        a(hiHealthData, BleConstants.MUSCLE_MASS, Float.valueOf(eacVar.i()));
        a(hiHealthData, "protein", Float.valueOf(eacVar.e()));
        a(hiHealthData, BleConstants.MOISTURE_RATE, Float.valueOf(eacVar.h()));
        a(hiHealthData, BleConstants.VISCERAL_FAT_LEVEL, Float.valueOf(eacVar.l()));
        a(hiHealthData, BleConstants.IMPEDANCE, Float.valueOf(eacVar.j()));
        a(hiHealthData, "skeletalMusclelMass", Float.valueOf(eacVar.f()));
        dnbVar.a(eacVar.c());
        dnbVar.j(eacVar.g());
        dnbVar.s(eacVar.e());
        dnbVar.c(eacVar.a());
        dnbVar.b(eacVar.b());
        dnbVar.p(eacVar.i());
        dnbVar.l(eacVar.l());
        dnbVar.h(eacVar.d());
        dnbVar.ag(eacVar.h());
        dnbVar.ab(eacVar.f());
    }

    private static void c(dso dsoVar, HiHealthData hiHealthData, dnb dnbVar, dnj dnjVar) {
        float bodyFatRat = dsoVar.getBodyFatRat();
        if (f32333b.booleanValue()) {
            LogUtil.a("ConverResisToWeightDataUtil", "setHagridWeightData sIsRecalculateBodyFatRate is ", f32333b);
            bodyFatRat = 0.0f;
        }
        double d = bodyFatRat;
        double d2 = 0.0d;
        if (d > 0.0d) {
            ReleaseLogUtil.d("R_Weight_ConverResisToWeightDataUtil", "the bodyFatRat is real");
            d2 = d / 100.0d;
        }
        LogUtil.a("ConverResisToWeightDataUtil", "setHagridWeightData scaleBodyFatRat = ", Double.valueOf(d2));
        if (!eny.a().c() || dsoVar.p()) {
            return;
        }
        double[] dArrA = dyh.a(dsoVar.m());
        double[] dArrA2 = dyh.a(dsoVar.f());
        if (dArrA.length == 0) {
            LogUtil.j("ConverResisToWeightDataUtil", "resistanceAraay is null or its length is less then zero");
            return;
        }
        if (dyh.b(dArrA)) {
            ReleaseLogUtil.d("R_Weight_ConverResisToWeightDataUtil", "four electrode constructor invoke");
            b(hiHealthData, dnbVar, dArrA, dArrA2);
            dyh dyhVarC = c(dsoVar, dnjVar, d2, dArrA, dArrA2);
            c(hiHealthData, dnbVar, dyhVarC);
            a(hiHealthData, "pole", (Number) 1);
            dnbVar.f(1);
            c(hiHealthData, dsoVar, dnbVar, dyhVarC, 1);
        } else {
            ReleaseLogUtil.d("R_Weight_ConverResisToWeightDataUtil", "eight electrode constructor invoke");
            a(hiHealthData, dnbVar, dArrA2);
            dyh dyhVarA = a(dsoVar, dnjVar, d2, dArrA, dArrA2);
            a(hiHealthData, dnbVar, dyhVarA);
            b(hiHealthData, dnbVar, dArrA);
            a(hiHealthData, "pole", (Number) 2);
            dnbVar.f(2);
            c(hiHealthData, dsoVar, dnbVar, dyhVarA, 2);
        }
        double dI = dsoVar.i();
        a(hiHealthData, IndoorEquipManagerApi.KEY_HEART_RATE, Double.valueOf(dI));
        dnbVar.o(dI);
    }

    private static dyh a(dso dsoVar, dnj dnjVar, double d, double[] dArr, double[] dArr2) {
        if (dArr2.length > 0 && dxm.c(dArr2[0])) {
            return new dyh(dnjVar.e(), dsoVar.getWeight(), dne.a(dnjVar.d()), dnjVar.c(), dnjVar.j(), 8, dArr, d, 2, dArr2);
        }
        return new dyh(dnjVar.e(), dsoVar.getWeight(), dne.a(dnjVar.d()), dnjVar.c(), dnjVar.j(), dArr, d);
    }

    private static void a(HiHealthData hiHealthData, dnb dnbVar, double[] dArr) {
        if (dArr.length <= 0 || !dxm.c(dArr[0])) {
            return;
        }
        d(hiHealthData, dnbVar, dArr);
    }

    private static void b(HiHealthData hiHealthData, dnb dnbVar, double[] dArr, double[] dArr2) {
        if (dArr2.length > 0 && dxm.c(dArr2[0])) {
            d(hiHealthData, dnbVar, dArr2);
        }
        if (dArr.length > 0) {
            b(hiHealthData, dnbVar, dArr);
        }
    }

    private static dyh c(dso dsoVar, dnj dnjVar, double d, double[] dArr, double[] dArr2) {
        if (dArr2.length > 0 && dxm.c(dArr2[0])) {
            return new dyh(dnjVar.e(), dsoVar.getWeight(), dne.a(dnjVar.d()), dnjVar.c(), dnjVar.j(), 4, dArr, d, 1, dArr2);
        }
        return new dyh(dnjVar.e(), dsoVar.getWeight(), dne.a(dnjVar.d()), dnjVar.c(), dnjVar.j(), dArr[0], d);
    }

    private static void c(HiHealthData hiHealthData, String str, dso dsoVar) {
        MeasurableDevice measurableDeviceB;
        if (dsoVar.s() && (measurableDeviceB = dmp.d().b(hiHealthData.getDeviceUuid(), true)) != null && dxm.av(measurableDeviceB.getProductId())) {
            LogUtil.a("ConverResisToWeightDataUtil", "weight data is suspected");
            hiHealthData.setMetaData("-1");
            return;
        }
        String strI = MultiUsersManager.INSTANCE.getMainUser().i();
        if (str == null) {
            MultiUsersManager.INSTANCE.setCurrentUser(MultiUsersManager.INSTANCE.getMainUser());
            return;
        }
        if (strI == null) {
            hiHealthData.setMetaData("0");
        } else if (strI.equals(str)) {
            hiHealthData.setMetaData("0");
        } else {
            hiHealthData.setMetaData(str);
        }
    }

    public static void c(HiHealthData hiHealthData, dnb dnbVar, dyh dyhVar) {
        if (dyhVar == null) {
            LogUtil.j("ConverResisToWeightDataUtil", "convertHaiGeWeightAlgorithmDataHalf hwWeightAlgorithm is null");
            return;
        }
        float fAn = dyhVar.an();
        a(hiHealthData, BleConstants.MOISTURE, Float.valueOf(fAn));
        dnbVar.aa(fAn);
        float fAl = dyhVar.al();
        a(hiHealthData, BleConstants.MOISTURE_RATE, Float.valueOf(fAl));
        dnbVar.ag(fAl);
        float fY = dyhVar.y();
        a(hiHealthData, BleConstants.MUSCLE_MASS, Float.valueOf(fY));
        dnbVar.p(fY);
        float fM = dyhVar.m();
        a(hiHealthData, BleConstants.BONE_SALT, Float.valueOf(fM));
        dnbVar.h(fM);
        float fW = dyhVar.w();
        a(hiHealthData, "protein", Float.valueOf(fW));
        dnbVar.s(fW);
        if (hiHealthData.getDouble(BleConstants.BODY_FAT_RATE) <= 0.0d || f32333b.booleanValue()) {
            f32333b = false;
            float fN = dyhVar.n();
            a(hiHealthData, BleConstants.BODY_FAT_RATE, Float.valueOf(fN));
            dnbVar.d(fN);
        }
        float fB = dyhVar.b();
        a(hiHealthData, BleConstants.BMI, Float.valueOf(fB));
        dnbVar.c(fB);
        float fE = dyhVar.e();
        a(hiHealthData, BleConstants.BASAL_METABOLISM, Float.valueOf(fE));
        dnbVar.b(fE);
        float fAe = dyhVar.ae();
        a(hiHealthData, "skeletalMusclelMass", Float.valueOf(fAe));
        dnbVar.ab(fAe);
        float fAs = dyhVar.as();
        a(hiHealthData, BleConstants.VISCERAL_FAT_LEVEL, Float.valueOf(fAs));
        dnbVar.l(fAs);
        float fAi = dyhVar.ai();
        a(hiHealthData, BleConstants.BODY_SCORE, Float.valueOf(fAi));
        dnbVar.j(fAi);
        float fA = dyhVar.a();
        a(hiHealthData, BleConstants.BODY_AGE, Float.valueOf(fA));
        dnbVar.a(fA);
        float f = dyhVar.f();
        a(hiHealthData, "bodySize", Float.valueOf(f));
        dnbVar.i(f);
    }

    public static void a(HiHealthData hiHealthData, dnb dnbVar, dyh dyhVar) {
        if (dyhVar == null) {
            LogUtil.j("ConverResisToWeightDataUtil", "convertHaiGeWeightAlgorithmData HwWeightAlgorithm is null");
            return;
        }
        float fAn = dyhVar.an();
        a(hiHealthData, BleConstants.MOISTURE, Float.valueOf(fAn));
        dnbVar.aa(fAn);
        float fAm = dyhVar.am();
        a(hiHealthData, BleConstants.MOISTURE_RATE, Float.valueOf(fAm));
        dnbVar.ag(fAm);
        float fV = dyhVar.v();
        a(hiHealthData, BleConstants.MUSCLE_MASS, Float.valueOf(fV));
        dnbVar.p(fV);
        float fK = dyhVar.k();
        a(hiHealthData, BleConstants.BONE_SALT, Float.valueOf(fK));
        dnbVar.h(fK);
        float fU = dyhVar.u();
        a(hiHealthData, "protein", Float.valueOf(fU));
        dnbVar.s(fU);
        if (hiHealthData.getDouble(BleConstants.BODY_FAT_RATE) <= 0.0d || f32333b.booleanValue()) {
            f32333b = false;
            float fJ = dyhVar.j();
            a(hiHealthData, BleConstants.BODY_FAT_RATE, Float.valueOf(fJ));
            dnbVar.d(fJ);
        }
        float fB = dyhVar.b();
        a(hiHealthData, BleConstants.BMI, Float.valueOf(fB));
        dnbVar.c(fB);
        d(hiHealthData, dnbVar, dyhVar);
        b(hiHealthData, dnbVar, dyhVar);
    }

    private static void b(HiHealthData hiHealthData, dnb dnbVar, double[] dArr) {
        a(hiHealthData, "lfrfImpedance", Double.valueOf(dArr[0]));
        a(hiHealthData, "lhrhImpedance", Double.valueOf(dArr[1]));
        a(hiHealthData, "lhlfImpedance", Double.valueOf(dArr[2]));
        a(hiHealthData, "lhrfImpedance", Double.valueOf(dArr[3]));
        a(hiHealthData, "rhlfImpedance", Double.valueOf(dArr[4]));
        a(hiHealthData, "rhrfImpedance", Double.valueOf(dArr[5]));
        dnbVar.c(dArr);
    }

    private static void d(HiHealthData hiHealthData, dnb dnbVar, double[] dArr) {
        a(hiHealthData, "lfrfHfImpedance", Double.valueOf(dArr[0]));
        a(hiHealthData, "lhrhHfImpedance", Double.valueOf(dArr[1]));
        a(hiHealthData, "lhlfHfImpedance", Double.valueOf(dArr[2]));
        a(hiHealthData, "lhrfHfImpedance", Double.valueOf(dArr[3]));
        a(hiHealthData, "rhlfHfImpedance", Double.valueOf(dArr[4]));
        a(hiHealthData, "rhrfHfImpedance", Double.valueOf(dArr[5]));
        dnbVar.d(dArr);
        dnbVar.a(2);
    }

    private static void d(HiHealthData hiHealthData, dnb dnbVar, dyh dyhVar) {
        if (dyhVar == null) {
            LogUtil.j("ConverResisToWeightDataUtil", "setSegmentationIndicator HwWeightAlgorithm is null");
            return;
        }
        float fAa = dyhVar.aa();
        a(hiHealthData, "rightLegMuscleMass", Float.valueOf(fAa));
        dnbVar.w(fAa);
        float fR = dyhVar.r();
        a(hiHealthData, "leftLegMuscleMass", Float.valueOf(fR));
        dnbVar.m(fR);
        float fAh = dyhVar.ah();
        a(hiHealthData, "rightArmMuscleMass", Float.valueOf(fAh));
        dnbVar.ad(fAh);
        float fS = dyhVar.s();
        a(hiHealthData, "leftArmMuscleMass", Float.valueOf(fS));
        dnbVar.q(fS);
        float fAr = dyhVar.ar();
        a(hiHealthData, "trunkMuscleMass", Float.valueOf(fAr));
        dnbVar.z(fAr);
        float fZ = dyhVar.z();
        a(hiHealthData, "rightLegFatMass", Float.valueOf(fZ));
        dnbVar.x(fZ);
        float fP = dyhVar.p();
        a(hiHealthData, "leftLegFatMass", Float.valueOf(fP));
        dnbVar.n(fP);
        float fAc = dyhVar.ac();
        a(hiHealthData, "rightArmFatMass", Float.valueOf(fAc));
        dnbVar.y(fAc);
        float fQ = dyhVar.q();
        a(hiHealthData, "leftArmFatMass", Float.valueOf(fQ));
        dnbVar.k(fQ);
        float fAk = dyhVar.ak();
        a(hiHealthData, "trunkFatMass", Float.valueOf(fAk));
        dnbVar.ac(fAk);
    }

    private static void b(HiHealthData hiHealthData, dnb dnbVar, dyh dyhVar) {
        if (dyhVar == null) {
            LogUtil.j("ConverResisToWeightDataUtil", "setOtherIndicator HwWeightAlgorithm is null");
            return;
        }
        float fD = dyhVar.d();
        a(hiHealthData, BleConstants.BASAL_METABOLISM, Float.valueOf(fD));
        dnbVar.b(fD);
        float fAp = dyhVar.ap();
        a(hiHealthData, "waistHipRatio", Float.valueOf(fAp));
        dnbVar.ae(fAp);
        float fAf = dyhVar.af();
        a(hiHealthData, "skeletalMusclelMass", Float.valueOf(fAf));
        dnbVar.ab(fAf);
        float fX = dyhVar.x();
        a(hiHealthData, "rasm", Float.valueOf(fX));
        dnbVar.u(fX);
        float fAo = dyhVar.ao();
        a(hiHealthData, BleConstants.VISCERAL_FAT_LEVEL, Float.valueOf(fAo));
        dnbVar.l(fAo);
        float fAg = dyhVar.ag();
        a(hiHealthData, BleConstants.BODY_SCORE, Float.valueOf(fAg));
        dnbVar.j(fAg);
        float fC = dyhVar.c();
        a(hiHealthData, BleConstants.BODY_AGE, Float.valueOf(fC));
        dnbVar.a(fC);
        float fG = dyhVar.g();
        a(hiHealthData, "bodySize", Float.valueOf(fG));
        dnbVar.i(fG);
        float fH = dyhVar.h();
        a(hiHealthData, "bodyShape", Float.valueOf(fH));
        dnbVar.f(fH);
        float fT = dyhVar.t();
        a(hiHealthData, "muscleBalance", Float.valueOf(fT));
        dnbVar.r(fT);
        float fI = dyhVar.i();
        a(hiHealthData, "fatBalance", Float.valueOf(fI));
        dnbVar.g(fI);
    }

    private static void c(HiHealthData hiHealthData, dso dsoVar, dnb dnbVar, dyh dyhVar, int i) {
        float fJ;
        LogUtil.a("ConverResisToWeightDataUtil", "mUser is ", e, ", bodyDatas userId is ", dsoVar.o());
        dnj dnjVar = e;
        if (dnjVar == null || TextUtils.equals(dnjVar.i(), dsoVar.o())) {
            return;
        }
        LogUtil.j("ConverResisToWeightDataUtil", "recalculate body fat");
        if (i == 1) {
            fJ = dyhVar.n();
        } else {
            fJ = dyhVar.j();
        }
        double d = fJ;
        if (d > 0.0d) {
            a(hiHealthData, BleConstants.BODY_FAT_RATE, Double.valueOf(d));
            dnbVar.d(d);
        }
    }

    private static void a(HiHealthData hiHealthData, String str, Number number) {
        if (str == null || number == null) {
            ReleaseLogUtil.e("R_Weight_ConverResisToWeightDataUtil", "setWeightPiontDataChecked: value is null or invalid, key ", str);
            return;
        }
        double dA = CommonUtils.a(number.toString());
        if (dA <= 0.0d) {
            ReleaseLogUtil.e("R_Weight_ConverResisToWeightDataUtil", "setWeightPiontDataChecked: value <= 0.0 for key ", str);
        } else if (hiHealthData != null) {
            hiHealthData.putDouble(str, dA);
        }
    }

    public static void a(Boolean bool) {
        f32333b = bool;
    }
}
