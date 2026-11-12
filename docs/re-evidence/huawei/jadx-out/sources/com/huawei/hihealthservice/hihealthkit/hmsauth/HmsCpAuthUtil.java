package com.huawei.hihealthservice.hihealthkit.hmsauth;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealth.util.HiScopeUtil;
import com.huawei.hihealthservice.hihealthkit.hmsauth.HmsCpAuthUtil;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.hihealth.AuthController;
import com.huawei.hms.hihealth.HiHealthOptions;
import com.huawei.hms.hihealth.HuaweiHiHealth;
import com.huawei.hms.support.hwid.HuaweiIdAuthManager;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import com.huawei.hwauthutil.HsfSignValidator;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.kxj;
import defpackage.kzw;
import defpackage.lcm;
import defpackage.ldm;
import defpackage.lek;
import defpackage.let;
import defpackage.lev;
import defpackage.oet;
import health.compact.a.CommonUtil;
import health.compact.a.HwEncryptUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class HmsCpAuthUtil {
    private static final Long e = 86400000L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f12513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AuthController f12514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Set<Integer> f12515c = new HashSet(Arrays.asList(Integer.valueOf(DicDataTypeUtil.DataType.BLOODPRESSURE_RISK_RESEARCH_RESULT.value()), Integer.valueOf(DicDataTypeUtil.DataType.VASCULAR_HEALTH_RESULT.value()), Integer.valueOf(DicDataTypeUtil.DataType.SPORT_BLOOD_PRESSURE_RESULT.value()), Integer.valueOf(DicDataTypeUtil.DataType.OVARY_HEALTH_RESULT_SET.value()), Integer.valueOf(DicDataTypeUtil.DataType.OVARY_HEALTH_DAILY_STATUS_SET.value()), Integer.valueOf(DicDataTypeUtil.DataType.AFIB_BURDEN_RESULT_RESEARCH.value()), Integer.valueOf(DicDataTypeUtil.DataType.PPG_OF_VASCULAR_HEALTH.value()), Integer.valueOf(DicDataTypeUtil.DataType.ECG_OF_VASCULAR_HEALTH.value()), Integer.valueOf(DicDataTypeUtil.DataType.SPO2_RESP_INFECTION.value()), Integer.valueOf(DicDataTypeUtil.DataType.RRI_RESP_INFECTION.value()), Integer.valueOf(DicDataTypeUtil.DataType.TEMPERATURE_RESP_INFECTION.value()), Integer.valueOf(DicDataTypeUtil.DataType.SLEEP_FRAGMENT_RESP_INFECTION.value()), Integer.valueOf(DicDataTypeUtil.DataType.CORONARY_HEART_DISEASE_RISK_STUDY.value())));

    public HmsCpAuthUtil(Context context) {
        AuthHuaweiId extendedAuthResult = HuaweiIdAuthManager.getExtendedAuthResult(HiHealthOptions.builder().build());
        this.f12513a = context;
        this.f12514b = HuaweiHiHealth.getAuthController(context, extendedAuthResult);
    }

    private boolean b(String str, final List<String> list) {
        final boolean[] zArr = {false};
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.a("R_HiH_HMSAuth_HmsCpAuthUtil", "packageName is empty");
            return false;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            Task<List<String>> taskQueryAuthInfoByAppId = this.f12514b.queryAuthInfoByAppId(HiScopeUtil.b(this.f12513a, str));
            taskQueryAuthInfoByAppId.addOnSuccessListener(new OnSuccessListener() { // from class: ldf
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    HmsCpAuthUtil.e(list, zArr, countDownLatch, (List) obj);
                }
            });
            taskQueryAuthInfoByAppId.addOnFailureListener(new OnFailureListener() { // from class: com.huawei.hihealthservice.hihealthkit.hmsauth.HmsCpAuthUtil.2
                @Override // com.huawei.hmf.tasks.OnFailureListener
                public void onFailure(Exception exc) {
                    ReleaseLogUtil.a("R_HiH_HMSAuth_HmsCpAuthUtil", "queryAuthInfo on Failure: ", exc.getMessage());
                    countDownLatch.countDown();
                }
            });
        } catch (Exception e2) {
            ReleaseLogUtil.a("R_HiH_HMSAuth_HmsCpAuthUtil", "query auth info error ", LogAnonymous.b(e2));
        }
        try {
            ReleaseLogUtil.d("R_HiH_HMSAuth_HmsCpAuthUtil", "queryAuthInfo isOnTime: ", Boolean.valueOf(countDownLatch.await(5000L, TimeUnit.MILLISECONDS)));
            HuaweiHiHealth.disconnect();
            ReleaseLogUtil.d("R_HiH_HMSAuth_HmsCpAuthUtil", "Hms auth result: ", Boolean.valueOf(zArr[0]));
            return zArr[0];
        } catch (InterruptedException e3) {
            LogUtil.e("R_HiH_HMSAuth_HmsCpAuthUtil", "queryAuthInfo InterruptedException", LogAnonymous.b(e3));
            return false;
        }
    }

    public static /* synthetic */ void e(List list, boolean[] zArr, CountDownLatch countDownLatch, List list2) {
        ReleaseLogUtil.d("R_HiH_HMSAuth_HmsCpAuthUtil", "queryAuthInfo success, scopeList: ", HiJsonUtil.d(list2));
        Object obj = (String) list.get(0);
        String str = (String) list.get(1);
        String str2 = (String) list.get(2);
        String str3 = (String) list.get(3);
        boolean z = (!TextUtils.isEmpty(str) && list2.contains(str)) || (!TextUtils.isEmpty(str2) && list2.contains(str2));
        boolean zContains = list2.contains(obj);
        boolean z2 = !TextUtils.isEmpty(str3) && list2.contains(str3);
        ReleaseLogUtil.d("R_HiH_HMSAuth_HmsCpAuthUtil", "isAtomicScopePassed:", Boolean.valueOf(z), " isHmsScopePassed:", Boolean.valueOf(zContains), " isExtendScopePassed:", Boolean.valueOf(z2));
        if (zContains || z || z2) {
            zArr[0] = true;
            ReleaseLogUtil.d("R_HiH_HMSAuth_HmsCpAuthUtil", "verify scopes pass");
        }
        countDownLatch.countDown();
    }

    private boolean d(String str) {
        final boolean[] zArr = {false};
        String strB = HiScopeUtil.b(this.f12513a, str);
        if (TextUtils.isEmpty(strB)) {
            ReleaseLogUtil.a("R_HiH_HMSAuth_HmsCpAuthUtil", "The cp which packageName is ", str, "authorization failed because appId is null.");
            return zArr[0];
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Task<String> taskCheckFingerprint = this.f12514b.checkFingerprint(strB, str);
            taskCheckFingerprint.addOnSuccessListener(new OnSuccessListener() { // from class: ldg
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    HmsCpAuthUtil.c(zArr, jCurrentTimeMillis, countDownLatch, (String) obj);
                }
            });
            taskCheckFingerprint.addOnFailureListener(new OnFailureListener() { // from class: ldh
                @Override // com.huawei.hmf.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    HmsCpAuthUtil.c(jCurrentTimeMillis, countDownLatch, exc);
                }
            });
        } catch (Exception e2) {
            ReleaseLogUtil.a("R_HiH_HMSAuth_HmsCpAuthUtil", "check finger error ", LogAnonymous.b(e2));
        }
        try {
            ReleaseLogUtil.d("R_HiH_HMSAuth_HmsCpAuthUtil", "checkFingerprint isOnTime: ", Boolean.valueOf(countDownLatch.await(5000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException e3) {
            ReleaseLogUtil.a("R_HiH_HMSAuth_HmsCpAuthUtil", "isHMSCertFingerAuthorized InterruptedException", LogAnonymous.b(e3));
        }
        HuaweiHiHealth.disconnect();
        ReleaseLogUtil.d("R_HiH_HMSAuth_HmsCpAuthUtil", "checkFingerprint result: ", Boolean.valueOf(zArr[0]));
        return zArr[0];
    }

    public static /* synthetic */ void c(boolean[] zArr, long j, CountDownLatch countDownLatch, String str) {
        ReleaseLogUtil.d("R_HiH_HMSAuth_HmsCpAuthUtil", "checkFingerprint has response");
        if (str != null && "0".equals(str)) {
            zArr[0] = true;
            ReleaseLogUtil.d("R_HiH_HMSAuth_HmsCpAuthUtil", "fingerprint authority success");
        }
        LogUtil.d("HMSAuth_HmsCpAuthUtil", "isHMSCertFingerAuthorized needs ", Long.valueOf(System.currentTimeMillis() - j), " ms");
        countDownLatch.countDown();
    }

    public static /* synthetic */ void c(long j, CountDownLatch countDownLatch, Exception exc) {
        ReleaseLogUtil.a("R_HiH_HMSAuth_HmsCpAuthUtil", "fingerprint authority failure");
        LogUtil.d("HMSAuth_HmsCpAuthUtil", "isHMSCertFingerAuthorized needs ", Long.valueOf(System.currentTimeMillis() - j), " ms");
        countDownLatch.countDown();
    }

    public int e(int i, String str, boolean z) {
        ReleaseLogUtil.d("R_HiH_HMSAuth_HmsCpAuthUtil", "getAuthCode");
        if (CommonUtil.cj()) {
            ReleaseLogUtil.d("R_HiH_HMSAuth_HmsCpAuthUtil", "isTestThirdDeviceVersion, Auth success");
            return 0;
        }
        if (lek.c()) {
            ReleaseLogUtil.d("R_HiH_HMSAuth_HmsCpAuthUtil", "package is whiteHap, Auth success");
            return 0;
        }
        if (lcm.b(str, this.f12513a)) {
            ReleaseLogUtil.d("R_HiH_HMSAuth_HmsCpAuthUtil", "isWhiteApp, checkDataSharingEnable");
            return lcm.c(str);
        }
        if (d(i, str, z)) {
            return 0;
        }
        if (ldm.a(i, z)) {
            ReleaseLogUtil.a("R_HiH_HMSAuth_HmsCpAuthUtil", "dataType is not right");
            return 1001;
        }
        if (str == null || str.length() == 0) {
            ReleaseLogUtil.a("R_HiH_HMSAuth_HmsCpAuthUtil", "packageName is empty");
            return 1001;
        }
        if (c(i, z) == 0) {
            ReleaseLogUtil.d("R_HiH_HMSAuth_HmsCpAuthUtil", "local permission is passed");
            return 0;
        }
        boolean zD = d();
        ReleaseLogUtil.d("R_HiH_HMSAuth_HmsCpAuthUtil", "isHmsVersionUsable : ", Boolean.valueOf(zD), " api level : ", Integer.valueOf(Build.VERSION.SDK_INT));
        if (zD) {
            return a(str, i, z);
        }
        return let.e(str, 4) ? 32 : 1001;
    }

    private boolean d(int i, String str, boolean z) {
        return !z && !TextUtils.isEmpty(str) && "com.huawei.study.hiresearch".equals(str) && this.f12515c.contains(Integer.valueOf(i)) && b(str) == 0;
    }

    public int a(String str, int i, boolean z) {
        ReleaseLogUtil.d("R_HiH_HMSAuth_HmsCpAuthUtil", "checkHmsPermission");
        int iB = b(str);
        if (iB != 0) {
            return iB;
        }
        ReleaseLogUtil.d("R_HiH_HMSAuth_HmsCpAuthUtil", "HmsCertFingerAuthorized is passed");
        List<String> listB = ldm.b(i, z);
        if (ldm.a(i, z)) {
            ReleaseLogUtil.a("R_HiH_HMSAuth_HmsCpAuthUtil", "dataType is not right");
            return 1001;
        }
        LogUtil.a("HMSAuth_HmsCpAuthUtil", "hmsScope:", listB.get(0), " atomicScope:", listB.get(1), " bothScope:", listB.get(2), "new extendScope:", listB.get(3));
        return b(str, listB) ? 8 : 1001;
    }

    private int b(String str) {
        String strC = c(str);
        if (strC.equals("0")) {
            if (!d(str)) {
                ReleaseLogUtil.a("R_HiH_HMSAuth_HmsCpAuthUtil", str + ": HmsCertFingerAuthorized is failed");
                return 1001;
            }
            ReleaseLogUtil.d("R_HiH_HMSAuth_HmsCpAuthUtil", str + ": update certFinger");
            a(str, e(str));
            return 0;
        }
        if (e(str).equals(strC)) {
            return 0;
        }
        ReleaseLogUtil.a("R_HiH_HMSAuth_HmsCpAuthUtil", str, "old signature is not equal new signature");
        return 1001;
    }

    private int c(int i, boolean z) {
        boolean zE;
        ReleaseLogUtil.d("R_HiH_HMSAuth_HmsCpAuthUtil", "go to loaclPermission");
        if (!lcm.c(this.f12513a, Binder.getCallingUid())) {
            ReleaseLogUtil.a("R_HiH_HMSAuth_HmsCpAuthUtil", "newUid is not equal oldUid");
            return 1001;
        }
        try {
            int iD = kzw.c().d();
            kxj kxjVarA = kxj.a(this.f12513a);
            if (kxjVarA == null) {
                ReleaseLogUtil.a("R_HiH_HMSAuth_HmsCpAuthUtil", "hiHealthUserPermissionManager == null");
                return 4;
            }
            if (z) {
                zE = kxjVarA.d(iD, i);
            } else {
                zE = kxjVarA.e(iD, i);
            }
            ReleaseLogUtil.d("R_HiH_HMSAuth_HmsCpAuthUtil", "isHasLocalPermission:", Boolean.valueOf(zE));
            if (!zE) {
                return 1001;
            }
            oet.d();
            lev levVarE = lev.e(this.f12513a);
            boolean zE2 = levVarE.e(z ? levVarE.c(i) : levVarE.a(i));
            ReleaseLogUtil.d("R_HiH_HMSAuth_HmsCpAuthUtil", " isLocalScopes ", Boolean.valueOf(zE2));
            return zE2 ? 0 : 1002;
        } catch (RemoteException e2) {
            ReleaseLogUtil.a("R_HiH_HMSAuth_HmsCpAuthUtil", "thirdAppId has error", LogAnonymous.b(e2));
            return 1001;
        }
    }

    private void a(String str, String str2) {
        String strE;
        SharedPreferences.Editor editorEdit = this.f12513a.getSharedPreferences("thirdAppCertFingerFile", 0).edit();
        try {
            strE = HwEncryptUtil.b(this.f12513a).e(1, str2 + "/" + Long.valueOf(System.currentTimeMillis()));
        } catch (GeneralSecurityException e2) {
            ReleaseLogUtil.a("R_HiH_HMSAuth_HmsCpAuthUtil", "saveThirdAppCertFinger data is not right", LogAnonymous.b(e2));
            strE = "";
        }
        editorEdit.putString(str, strE);
        editorEdit.apply();
    }

    private String c(String str) {
        String strC;
        String string = this.f12513a.getSharedPreferences("thirdAppCertFingerFile", 0).getString(str, "0");
        LogUtil.a("HMSAuth_HmsCpAuthUtil", "PackageName : ", str);
        if (string.equals("0")) {
            ReleaseLogUtil.d("R_HiH_HMSAuth_HmsCpAuthUtil", "CertFinger is no cache, return default value");
            return "0";
        }
        try {
            strC = HwEncryptUtil.b(this.f12513a).c(1, string);
        } catch (GeneralSecurityException e2) {
            ReleaseLogUtil.a("R_HiH_HMSAuth_HmsCpAuthUtil", "readThirdAppCertFinger data is not right", LogAnonymous.b(e2));
            strC = "";
        }
        if (TextUtils.isEmpty(strC)) {
            ReleaseLogUtil.a("R_HiH_HMSAuth_HmsCpAuthUtil", "decryptCertFinger is empty, return default value");
            return "0";
        }
        String[] strArrSplit = strC.split("/");
        Long lValueOf = Long.valueOf(strArrSplit[1]);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long.valueOf(jCurrentTimeMillis).getClass();
        long jLongValue = jCurrentTimeMillis - lValueOf.longValue();
        Long.valueOf(jLongValue).getClass();
        if (jLongValue >= e.longValue()) {
            return "0";
        }
        return strArrSplit[0];
    }

    private String e(String str) {
        String strA = HsfSignValidator.a(this.f12513a, str);
        if (strA == null) {
            ReleaseLogUtil.a("R_HiH_HMSAuth_HmsCpAuthUtil", "thirdAppCertFinger is null");
            return "0";
        }
        LogUtil.a("HMSAuth_HmsCpAuthUtil", "thirdApp : ", str, " thirdAppCertFinger : ", strA);
        return strA;
    }

    private boolean d() {
        LogUtil.a("HMSAuth_HmsCpAuthUtil", "isHmsUsableVersion");
        Context context = this.f12513a;
        if (context == null) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(CommonUtil.x(), 0);
            LogUtil.a("HMSAuth_HmsCpAuthUtil", "isHmsUsableVersion packageInfo=", packageInfo);
            int i = packageInfo.versionCode;
            ReleaseLogUtil.d("R_HiH_HMSAuth_HmsCpAuthUtil", "isHmsUsableVersion versionCode=", Integer.valueOf(i));
            return i >= 50100300;
        } catch (PackageManager.NameNotFoundException e2) {
            ReleaseLogUtil.a("R_HiH_HMSAuth_HmsCpAuthUtil", "HmsUsableVersion NameNotFoundException", LogAnonymous.b(e2));
            return false;
        }
    }
}
