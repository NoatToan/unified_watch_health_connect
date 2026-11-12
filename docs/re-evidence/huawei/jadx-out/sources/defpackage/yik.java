package defpackage;

import android.content.Context;
import android.os.Binder;
import android.text.TextUtils;
import com.huawei.wearengine.auth.AuthInfo;
import com.huawei.wearengine.auth.Permission;
import com.huawei.wearengine.common.WearEngineBiOperate;
import com.huawei.wearengine.repository.api.AuthInfoRepository;
import com.huawei.wearengine.scope.ScopeManager;
import com.huawei.wearengine.scope.ScopeServerRequest;
import com.huawei.wearengine.sensor.Sensor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class yik {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ScopeManager f53384b = new ScopeManager(yiv.a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AuthInfoRepository f53385c;
    private String e;

    public yik(AuthInfoRepository authInfoRepository, String str) {
        this.f53385c = authInfoRepository;
        this.e = str;
    }

    private boolean c(yii yiiVar, WearEngineBiOperate wearEngineBiOperate, String str, ykl yklVar, Permission permission) {
        if (yiiVar == null) {
            yit.b("AuthorityCheck", "checkAllAuthorization callAppInfo is null");
            return false;
        }
        if (wearEngineBiOperate == null || yklVar == null || permission == null) {
            yit.b("AuthorityCheck", "checkAllAuthorization biOperate or scope or permission is null");
            return false;
        }
        if (!TextUtils.isEmpty(yiiVar.c()) && !TextUtils.isEmpty(str)) {
            return true;
        }
        yit.b("AuthorityCheck", "checkAllAuthorization callingPackageName or apiName is null");
        return false;
    }

    public int a(yii yiiVar, WearEngineBiOperate wearEngineBiOperate, String str, ykl yklVar, Permission permission) {
        if (!c(yiiVar, wearEngineBiOperate, str, yklVar, permission)) {
            return 5;
        }
        Context contextA = yiv.a();
        String strC = yln.c(contextA);
        if (!ylm.c(strC)) {
            yit.b("AuthorityCheck", str + " check health is not login in HuaWei Health!");
            wearEngineBiOperate.biApiCalling(contextA, yiiVar.c(), str, String.valueOf(3));
            return 3;
        }
        if (!yln.d(contextA)) {
            yit.b("AuthorityCheck", str + " check user not authorized in HuaWei Health!");
            wearEngineBiOperate.biApiCalling(contextA, yiiVar.c(), str, String.valueOf(7));
            return 7;
        }
        if (b(yiiVar.d(), yiiVar.c())) {
            wearEngineBiOperate.biApiCalling(contextA, yiiVar.c(), str, String.valueOf(0));
            return 0;
        }
        int iJ = yln.j(contextA, yiiVar.c());
        a(yiiVar.d(), yiiVar.a(), String.valueOf(iJ));
        if (!this.f53384b.checkScopeAvailability(yklVar.d(), yiiVar.a(), yiiVar.d(), "wearEngine")) {
            yit.b("AuthorityCheck", str + " check scope not availability in cloud");
            wearEngineBiOperate.biApiCalling(contextA, yiiVar.c(), str, String.valueOf(8));
            return 8;
        }
        if (!ylo.a(this.f53385c.getAuth(yiiVar.d(), strC, iJ), permission)) {
            wearEngineBiOperate.biApiCalling(contextA, yiiVar.c(), str, String.valueOf(9));
            yit.b("AuthorityCheck", str + " check user not authorized in wear engine");
            return 9;
        }
        yit.a("AuthorityCheck", str + " check all authorized");
        return 0;
    }

    public void b(String str, String str2, ykl yklVar, Permission permission) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            yit.b("AuthorityCheck", "checkAllAuthorization callingPackageName or apiName is null");
            return;
        }
        if (yklVar == null) {
            yit.b("AuthorityCheck", "checkAllAuthorization scope is null");
            return;
        }
        if (permission == null) {
            yit.b("AuthorityCheck", "checkAllAuthorization permission is null");
            return;
        }
        Context contextA = yiv.a();
        String strC = yln.c(contextA);
        a(str2, strC);
        a(str2, contextA);
        if (b(yiv.e(), str)) {
            return;
        }
        int iJ = yln.j(contextA, str);
        a(Binder.getCallingUid(), Binder.getCallingPid(), String.valueOf(iJ));
        yit.e("AuthorityCheck", "check scope entry");
        if (!this.f53384b.checkScopeAvailability(yklVar.d(), Binder.getCallingPid(), Binder.getCallingUid(), "wearEngine")) {
            yit.b("AuthorityCheck", str2 + " check scope not availability in cloud");
            throw new IllegalStateException(String.valueOf(8));
        }
        yit.e("AuthorityCheck", "getAuth entry");
        if (!ylo.a(this.f53385c.getAuth(Binder.getCallingUid(), strC, iJ), permission)) {
            yit.b("AuthorityCheck", str2 + " check user not authorized in wear engine");
            throw new IllegalStateException(String.valueOf(9));
        }
        yit.a("AuthorityCheck", str2 + " check all authorized");
    }

    private void a(String str, Context context) {
        if (yln.d(context)) {
            return;
        }
        yit.b("AuthorityCheck", str + " check user not authorized in HuaWei Health!");
        throw new IllegalStateException(String.valueOf(7));
    }

    private void a(String str, String str2) {
        if (ylm.c(str2)) {
            return;
        }
        yit.b("AuthorityCheck", str + " check health is not login in HuaWei Health!");
        throw new IllegalStateException(String.valueOf(3));
    }

    public void c(int i, String str, String str2) {
        Context contextA = yiv.a();
        a(str2, yln.c(contextA));
        a(str2, contextA);
        if (c(i, str)) {
            return;
        }
        yit.b("AuthorityCheck", str2 + " check user not authorized in wear engine");
        throw new IllegalStateException(String.valueOf(9));
    }

    public void a(String str, String str2, ykl yklVar, Permission permission) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            yit.b("AuthorityCheck", str2 + " checkAllAuthorizationIncludeWhiteList callingPackageName or apiName is null");
            return;
        }
        if (yklVar == null) {
            yit.b("AuthorityCheck", str2 + " checkAllAuthorizationIncludeWhiteList scope is null");
            return;
        }
        if (permission == null) {
            yit.b("AuthorityCheck", str2 + " checkAllAuthorizationIncludeWhiteList permission is null");
            return;
        }
        Context contextA = yiv.a();
        String strC = yln.c(contextA);
        a(str2, strC);
        a(str2, contextA);
        int iJ = yln.j(contextA, str);
        a(Binder.getCallingUid(), Binder.getCallingPid(), String.valueOf(iJ));
        yit.e("AuthorityCheck", "check scope entry");
        if (!this.f53384b.checkScopeAvailability(yklVar.d(), Binder.getCallingPid(), Binder.getCallingUid(), "wearEngine")) {
            yit.b("AuthorityCheck", str2 + " check scope not availability in cloud");
            throw new IllegalStateException(String.valueOf(8));
        }
        if (!ylo.a(this.f53385c.getAuth(Binder.getCallingUid(), strC, iJ), permission)) {
            yit.b("AuthorityCheck", str2 + " check user not authorized in wear engine");
            throw new IllegalStateException(String.valueOf(9));
        }
        yit.a("AuthorityCheck", str2 + " check all authorized");
    }

    public void c(String str) {
        a(str, yln.c(yiv.a()));
    }

    public void a(String str) {
        a(str, yiv.a());
    }

    public List<Sensor> c(String str, String str2, List<Sensor> list, ykw ykwVar) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            yis.c("AuthorityCheck", "getAuthorizedSensorList callingPackageName or apiName is null");
            return arrayList;
        }
        if (list == null) {
            yis.c("AuthorityCheck", "getAuthorizedSensorList sensorList is null");
            return arrayList;
        }
        if (ykwVar == null) {
            yis.c("AuthorityCheck", "getAuthorizedSensorList sensorCoreManager is null");
            return arrayList;
        }
        Context contextA = yiv.a();
        if (b(yiv.e(), str)) {
            return list;
        }
        int iJ = yln.j(contextA, str);
        a(Binder.getCallingUid(), Binder.getCallingPid(), String.valueOf(iJ));
        yis.a("AuthorityCheck", "check scope entry");
        boolean zCheckScopeAvailability = this.f53384b.checkScopeAvailability(ykl.f53587b.d(), Binder.getCallingPid(), Binder.getCallingUid(), "wearEngine");
        boolean zCheckScopeAvailability2 = this.f53384b.checkScopeAvailability(ykl.f53586a.d(), Binder.getCallingPid(), Binder.getCallingUid(), "wearEngine");
        String strC = yln.c(contextA);
        if (!zCheckScopeAvailability && !zCheckScopeAvailability2) {
            yit.b("AuthorityCheck", str2 + " check scope not availability in cloud");
            throw new IllegalStateException(String.valueOf(8));
        }
        yis.a("AuthorityCheck", "getAuth entry");
        List<AuthInfo> auth = this.f53385c.getAuth(Binder.getCallingUid(), strC, iJ);
        boolean zA = ylo.a(auth, Permission.SENSOR);
        boolean zA2 = ylo.a(auth, Permission.MOTION_SENSOR);
        if (!zA && !zA2) {
            yit.b("AuthorityCheck", str2 + " check user not authorized in wear engine");
            throw new IllegalStateException(String.valueOf(9));
        }
        yit.a("AuthorityCheck", str2 + " check all authorized");
        if (zA && zCheckScopeAvailability) {
            arrayList.addAll(ykwVar.c(list));
        }
        if (zA2 && zCheckScopeAvailability2) {
            arrayList.addAll(ykwVar.a(list));
        }
        return arrayList;
    }

    private void a(int i, int i2, String str) {
        yit.a("AuthorityCheck", "setScopeManager uid:" + i + "; pid:" + i2 + "; appId:" + str);
        if (TextUtils.isEmpty(this.e)) {
            this.e = yln.b(yiv.a());
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.e)) {
            yit.c("AuthorityCheck", "mGrsUrl =" + this.e);
        } else {
            ScopeServerRequest scopeServerRequest = new ScopeServerRequest(str);
            yit.a("AuthorityCheck", "setScopeManager url:" + scopeServerRequest.getUrl(this.e));
            this.f53384b.setScopeServerUrl(str, scopeServerRequest.getUrl(this.e));
            this.f53384b.setAppId(i2, i, str);
        }
    }

    public static boolean b(int i, String str) {
        return b(i, str, yij.e);
    }

    public boolean c(int i, String str) {
        return b(i, str, yij.f53382b);
    }

    public static boolean b(String str) {
        return b(yiv.e(), str, yij.f53383c);
    }

    public static boolean e(String str) {
        return b(yiv.e(), str, yij.f53381a);
    }

    private static boolean b(int i, String str, a[] aVarArr) {
        if (str == null) {
            yit.b("AuthorityCheck", "checkCaller, error in callingPackageName");
            return false;
        }
        yit.a("AuthorityCheck", "callerUid is " + i);
        int length = aVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            a aVar = aVarArr[i2];
            boolean zEquals = aVar.b().equals(str);
            if (zEquals && aVar.e() == i) {
                return true;
            }
            if (zEquals && aVar.a().equals(yln.c(str))) {
                aVar.b(i);
                return true;
            }
        }
        return false;
    }

    public boolean d(int i, String str) {
        if (!b(i, str, yij.d)) {
            return false;
        }
        yit.e("AuthorityCheck", "checkInternalInvoke true");
        return true;
    }

    public static boolean b(String str, String str2) {
        return e(str, str2, yij.d);
    }

    private static boolean e(String str, String str2, a[] aVarArr) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            yit.b("AuthorityCheck", "checkCaller, srcPkgName or srcFingerPrint is null");
            return false;
        }
        for (a aVar : aVarArr) {
            boolean zEquals = aVar.b().equals(str);
            boolean zEquals2 = aVar.a().equals(str2);
            if (zEquals && zEquals2) {
                yit.e("AuthorityCheck", "isSuperPermissionCaller true");
                return true;
            }
        }
        return false;
    }

    public static List<String> e() {
        ArrayList arrayList = new ArrayList();
        for (a aVar : yij.e) {
            arrayList.add(aVar.b());
        }
        return arrayList;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f53386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f53387b = -1;
        private String d;

        a(String str, String str2) {
            this.d = str;
            this.f53386a = str2;
        }

        public void b(int i) {
            this.f53387b = i;
        }

        public String b() {
            return this.d;
        }

        public String a() {
            return this.f53386a;
        }

        public int e() {
            return this.f53387b;
        }
    }
}
