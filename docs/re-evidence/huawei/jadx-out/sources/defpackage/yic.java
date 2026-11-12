package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.wearengine.auth.AuthInfo;
import com.huawei.wearengine.auth.Permission;
import com.huawei.wearengine.repository.api.AuthInfoRepository;
import com.huawei.wearengine.scope.ScopeInfo;
import com.huawei.wearengine.scope.ScopeInfoResponse;
import com.huawei.wearengine.scope.ScopeManager;
import com.huawei.wearengine.scope.ScopeServerRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes20.dex */
public class yic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f53366a;
    private static final Set<String> d;
    private static volatile yic e;
    private ExecutorService f = Executors.newSingleThreadExecutor();
    private AuthInfoRepository i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static List<String> f53368c = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<String, String> f53367b = new ConcurrentHashMap();

    static {
        String[] strArr = {"com.huawei.deveco.assistant", "com.plagh.heartstudy", "com.study.vascular", "com.study.respiratory"};
        f53366a = strArr;
        d = new HashSet(Arrays.asList(strArr));
        f53368c.add(Permission.DEVICE_MANAGER.getName());
        f53368c.add(Permission.NOTIFY.getName());
        f53367b.put(ykl.e.d(), Permission.DEVICE_MANAGER.getName());
        f53367b.put(ykl.f53588c.d(), Permission.NOTIFY.getName());
        f53367b.put(ykl.f53587b.d(), Permission.SENSOR.getName());
        f53367b.put(ykl.f53586a.d(), Permission.MOTION_SENSOR.getName());
        f53367b.put(ykl.i.d(), Permission.WEAR_USER_STATUS.getName());
        f53367b.put(ykl.d.d(), Permission.DEVICE_SN.getName());
    }

    private yic(AuthInfoRepository authInfoRepository) {
        this.i = authInfoRepository;
    }

    public static yic b(AuthInfoRepository authInfoRepository) {
        if (e == null) {
            synchronized (yic.class) {
                if (e == null) {
                    e = new yic(authInfoRepository);
                }
            }
        }
        return e;
    }

    public static List<String> a() {
        return new ArrayList(Arrays.asList(f53366a));
    }

    public int c(final Context context, final int i, final String str) {
        if (TextUtils.isEmpty(str)) {
            yit.c("PreAuthManger", "preGrantPermission clientPkgName is empty");
            return 12;
        }
        if (context == null) {
            yit.c("PreAuthManger", "preGrantPermission context is null");
            return 12;
        }
        yit.e("PreAuthManger", "preGrantPermission start:" + str);
        if (d.contains(str)) {
            yit.e("PreAuthManger", "preGrantPermission caller is special app");
            return 0;
        }
        Future futureSubmit = this.f.submit(new Callable<Integer>() { // from class: yic.3
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Integer call() {
                return Integer.valueOf(yic.this.d(context, i, str));
            }
        });
        try {
            int iIntValue = ((Integer) futureSubmit.get(10000L, TimeUnit.MILLISECONDS)).intValue();
            yit.e("PreAuthManger", "preGrantPermission result:" + iIntValue);
            return iIntValue;
        } catch (InterruptedException unused) {
            yit.b("PreAuthManger", "preGrantPermission InterruptedException");
            return 12;
        } catch (ExecutionException unused2) {
            yit.b("PreAuthManger", "preGrantPermission ExecutionException");
            return 12;
        } catch (TimeoutException unused3) {
            yit.b("PreAuthManger", "preGrantPermission TimeoutException");
            futureSubmit.cancel(true);
            return 12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d(Context context, int i, String str) {
        String strC = yln.c(context);
        if (TextUtils.isEmpty(strC)) {
            yit.b("PreAuthManger", "preGrantPermissionInThread usr_id is null, not login in Huawei Health!");
            return 3;
        }
        int iJ = yln.j(context, str);
        if (iJ == 0) {
            yit.b("PreAuthManger", "preGrantPermissionInThread appId is invalid");
            return 12;
        }
        AuthInfoRepository authInfoRepository = this.i;
        if (authInfoRepository == null) {
            yit.b("PreAuthManger", "preGrantPermissionInThread mAuthInfoRepository is null");
            return 12;
        }
        if (e(authInfoRepository.getAuth(i, strC, iJ))) {
            return 0;
        }
        List<String> listD = d(iJ);
        if (listD == null || listD.isEmpty()) {
            yit.e("PreAuthManger", "preGrantPermissionInThread permission intersection is empty");
            return 8;
        }
        yit.e("PreAuthManger", "preGrantPermissionInThread start update db");
        Iterator<AuthInfo> it = e(listD, context, i, strC, iJ).iterator();
        while (it.hasNext()) {
            this.i.updateAuth(it.next());
        }
        return 0;
    }

    private List<AuthInfo> e(List<String> list, Context context, int i, String str, int i2) {
        if (list == null || list.isEmpty()) {
            yit.b("PreAuthManger", "createAuthInfoList permissionTypes is empty");
            return Collections.EMPTY_LIST;
        }
        if (context == null) {
            yit.b("PreAuthManger", "createAuthInfoList context is null");
            return Collections.EMPTY_LIST;
        }
        String strC = yln.c(i, str, i2);
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            AuthInfo authInfo = new AuthInfo();
            authInfo.setKey(strC + "_" + str2);
            authInfo.setAppUid(i);
            authInfo.setUserId(str);
            authInfo.setAppId(i2);
            authInfo.setPermission(str2);
            authInfo.setOpenStatus(2);
            arrayList.add(authInfo);
            yit.a("PreAuthManger", "createPerAuthInfoList authInfo:" + authInfo.toString());
        }
        return arrayList;
    }

    private boolean e(List<AuthInfo> list) {
        if (list == null || list.isEmpty()) {
            yit.e("PreAuthManger", "isContainNormalPermission authInfoList is empty");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<AuthInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPermission());
        }
        arrayList.retainAll(f53368c);
        yit.a("PreAuthManger", "isContainNormalPermission permissionList is:" + Arrays.toString(arrayList.toArray(new String[0])));
        if (arrayList.isEmpty()) {
            yit.e("PreAuthManger", "isContainNormalPermission permissionList is empty");
            return false;
        }
        yit.e("PreAuthManger", "isContainNormalPermission already grant permission");
        return true;
    }

    private List<String> d(int i) {
        List<String> listB = b(i);
        if (listB == null || listB.isEmpty()) {
            yit.c("PreAuthManger", "getNormalPermissionFromScope permissionsFromScope is empty");
            return Collections.EMPTY_LIST;
        }
        listB.retainAll(f53368c);
        yit.a("PreAuthManger", "getNormalPermissionFromScope intersection is:" + Arrays.toString(listB.toArray(new String[0])));
        return listB;
    }

    private List<String> b(int i) {
        if (i == 0) {
            yit.b("PreAuthManger", "getPermissionByScope appId is invalid");
            return Collections.EMPTY_LIST;
        }
        String strValueOf = String.valueOf(i);
        ScopeServerRequest scopeServerRequest = new ScopeServerRequest(strValueOf);
        Context contextA = yiv.a();
        String url = scopeServerRequest.getUrl(yln.b(contextA));
        ScopeManager scopeManager = new ScopeManager(contextA);
        scopeManager.setScopeServerUrl(strValueOf, url);
        ScopeInfoResponse scope = scopeManager.getScope(strValueOf, "wearEngine");
        if (scope == null) {
            yit.b("PreAuthManger", "getPermissionByScope scopeInfoResponse is null");
            return Collections.EMPTY_LIST;
        }
        yit.a("PreAuthManger", "getPermissionByScope scopeInfoResponse is :" + scope.toString());
        return b(scope);
    }

    private List<String> b(ScopeInfoResponse scopeInfoResponse) {
        List<ScopeInfo> scopes = scopeInfoResponse.getScopes();
        if (scopes == null || scopes.isEmpty()) {
            yit.b("PreAuthManger", "getPermissionByScopeInfoResponse scopeInfoList is null");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (ScopeInfo scopeInfo : scopes) {
            yit.a("PreAuthManger", "getPermissionByScopeInfoResponse scopeInfo is :" + scopeInfo.toString());
            List<String> permissions = scopeInfo.getPermissions();
            if (permissions != null && !permissions.isEmpty()) {
                arrayList.add(d(permissions));
            }
        }
        return arrayList;
    }

    private String d(List<String> list) {
        for (Map.Entry<String, String> entry : f53367b.entrySet()) {
            if (list.contains(entry.getKey())) {
                return entry.getValue();
            }
        }
        return "";
    }
}
