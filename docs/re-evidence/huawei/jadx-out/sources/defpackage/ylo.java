package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.wearengine.auth.AuthInfo;
import com.huawei.wearengine.auth.HiAppInfo;
import com.huawei.wearengine.auth.Permission;
import com.huawei.wearengine.repository.AuthInfoRepositoryImpl;
import com.huawei.wearengine.scope.ScopeInfoResponse;
import com.huawei.wearengine.scope.ScopeManager;
import com.huawei.wearengine.scope.ScopeServerRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class ylo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<String, Permission> f53623b;

    static {
        HashMap map = new HashMap(16);
        f53623b = map;
        map.put(Permission.DEVICE_MANAGER.getName(), Permission.DEVICE_MANAGER);
        f53623b.put(Permission.NOTIFY.getName(), Permission.NOTIFY);
        f53623b.put(Permission.SENSOR.getName(), Permission.SENSOR);
        f53623b.put(Permission.MOTION_SENSOR.getName(), Permission.MOTION_SENSOR);
        f53623b.put(Permission.WEAR_USER_STATUS.getName(), Permission.WEAR_USER_STATUS);
        f53623b.put(Permission.DEVICE_SN.getName(), Permission.DEVICE_SN);
    }

    public static boolean a(List<AuthInfo> list, Permission permission) {
        if (list == null || list.isEmpty() || permission == null) {
            yit.b("AuthUtil", "isAuthorized authInfoList isEmpty");
            return false;
        }
        yit.a("AuthUtil", "isAuthorized authInfoList:" + list);
        yit.a("AuthUtil", "isAuthorized permission:" + permission.getName());
        for (AuthInfo authInfo : list) {
            if (authInfo.getPermission().equals(permission.getName())) {
                if (authInfo.getOpenStatus() != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean c() {
        return Process.myUid() == Binder.getCallingUid();
    }

    public static Intent a(String str, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            yit.c("AuthUtil", "createAuthIntent packageName is invalid");
            return null;
        }
        if (strArr == null || strArr.length == 0) {
            yit.c("AuthUtil", "createAuthIntent permissionTypes is invalid");
            return null;
        }
        Intent intent = new Intent();
        intent.setClassName("com.huawei.health", "com.huawei.ui.main.stories.devicecapacity.AuthActivity");
        intent.setPackage("com.huawei.health");
        intent.setFlags(268435456);
        intent.addFlags(134217728);
        intent.addFlags(524288);
        intent.addFlags(8388608);
        intent.putExtra("third_party_package_name", str);
        intent.putExtra("permissionTypes", strArr);
        HiAppInfo hiAppInfoA = yln.a(yiv.a(), str);
        if (hiAppInfoA == null) {
            yit.c("AuthUtil", " getAppInfo is null");
            return null;
        }
        String strC = yln.c(yiv.a(), str);
        if (TextUtils.isEmpty(strC)) {
            yit.c("AuthUtil", "getAppName is null");
            return null;
        }
        hiAppInfoA.setAppName(strC);
        yit.a("AuthUtil", "getAppInfo HiAppInfo:" + hiAppInfoA.toString());
        intent.putExtra(MapKeyNames.APP_INFO, hiAppInfoA);
        yit.e("AuthUtil", "startActivity");
        intent.putExtra("come_from", "third_party_app");
        return intent;
    }

    public static boolean d(String str, ScopeInfoResponse scopeInfoResponse) {
        if (scopeInfoResponse == null) {
            yit.c("AuthUtil", "checkFingerprintFromScopeServer appScope isEmpty");
            return false;
        }
        yit.a("AuthUtil", "ScopeInfoResponse:" + scopeInfoResponse.toString());
        if (TextUtils.isEmpty(str)) {
            yit.c("AuthUtil", "packageName == null");
            return false;
        }
        if (e(str, scopeInfoResponse)) {
            return true;
        }
        yit.c("AuthUtil", "checkFingerprintFromScopeServer checkCertFingerprint or checkPermission fail");
        return false;
    }

    public static ScopeInfoResponse e(int i) {
        if (i == 0) {
            yit.b("AuthUtil", "getScope appId is invalid");
            return null;
        }
        String strValueOf = String.valueOf(i);
        ScopeServerRequest scopeServerRequest = new ScopeServerRequest(strValueOf);
        Context contextA = yiv.a();
        String url = scopeServerRequest.getUrl(yln.b(contextA));
        ScopeManager scopeManager = new ScopeManager(contextA);
        scopeManager.setScopeServerUrl(strValueOf, url);
        ScopeInfoResponse scope = scopeManager.getScope(strValueOf, "wearEngine");
        if (scope != null) {
            yit.a("AuthUtil", "getScope scopeInfoResponse is :" + scope.toString());
        }
        return scope;
    }

    public static boolean e(String str, ScopeInfoResponse scopeInfoResponse) throws Throwable {
        if (scopeInfoResponse == null) {
            yit.c("AuthUtil", "checkCertFingerprint scopeInfoResponse isEmpty");
            return false;
        }
        String strC = yln.c(str);
        if (TextUtils.isEmpty(strC)) {
            yit.c("AuthUtil", "checkCertFingerprint appCert isEmpty");
            return false;
        }
        yit.a("AuthUtil", "appCert=" + strC);
        String certFingerprintExtra = scopeInfoResponse.getCertFingerprintExtra();
        if (strC.equals(scopeInfoResponse.getCertFingerprint()) || c(strC, certFingerprintExtra)) {
            return true;
        }
        yit.c("AuthUtil", "checkCertFingerprint appCert not equals");
        return false;
    }

    public static boolean c(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            for (String str3 : str2.split(";")) {
                if (str.equals(str3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean e(String[] strArr, List<String> list) {
        yit.e("AuthUtil", "isAllPermissionsAuthorized enter");
        if (strArr == null || strArr.length == 0) {
            yit.c("AuthUtil", "isAllPermissionsAuthorized permission is null");
            return false;
        }
        if (list == null || list.isEmpty()) {
            yit.c("AuthUtil", "isAllPermissionsAuthorized permissionList is null");
            return false;
        }
        for (String str : strArr) {
            if (!list.contains(str)) {
                return false;
            }
        }
        return true;
    }

    public static List<String> d(String str) {
        yit.e("AuthUtil", "getAuthorizedPermissions enter");
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            yit.c("AuthUtil", "getAuthorizedPermissions callingPackageName is null");
            return arrayList;
        }
        HiAppInfo hiAppInfoA = yln.a(yiv.a(), str);
        if (hiAppInfoA == null) {
            yit.c("AuthUtil", "getAuthorizedPermissions hiAppInfo is null");
            return arrayList;
        }
        List<AuthInfo> auth = new AuthInfoRepositoryImpl(yiv.a()).getAuth(hiAppInfoA.getAppUid(), hiAppInfoA.getUserId(), hiAppInfoA.getAppId());
        if (auth == null || auth.isEmpty()) {
            yit.c("AuthUtil", "getAuthorizedPermissions authInfoList is null");
            return arrayList;
        }
        for (AuthInfo authInfo : auth) {
            if (authInfo.getOpenStatus() != 0) {
                arrayList.add(authInfo.getPermission());
            }
        }
        return arrayList;
    }

    public static Permission[] e(List<String> list) {
        yit.e("AuthUtil", "getPermissionByPermissionList enter");
        if (list == null || list.isEmpty()) {
            yit.c("AuthUtil", "getPermissionByPermissionList permissionsList is null");
            return null;
        }
        Permission[] permissionArr = new Permission[list.size()];
        for (int i = 0; i < list.size(); i++) {
            if (f53623b.containsKey(list.get(i))) {
                permissionArr[i] = f53623b.get(list.get(i));
            } else {
                permissionArr[i] = null;
            }
        }
        return permissionArr;
    }
}
