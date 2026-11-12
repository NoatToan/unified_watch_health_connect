package com.huawei.wearengine.service.api;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.wearengine.AuthManager;
import com.huawei.wearengine.auth.AuthInfo;
import com.huawei.wearengine.auth.AuthListener;
import com.huawei.wearengine.auth.Permission;
import com.huawei.wearengine.common.WearEngineBiOperate;
import com.huawei.wearengine.core.common.ClientBinderDied;
import com.huawei.wearengine.core.device.PowerModeChangeManager;
import com.huawei.wearengine.repository.api.AuthInfoRepository;
import defpackage.yia;
import defpackage.yik;
import defpackage.yit;
import defpackage.yiv;
import defpackage.yiw;
import defpackage.ylm;
import defpackage.yln;
import defpackage.ylo;
import defpackage.ylt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public class AuthManagerImpl extends AuthManager.Stub implements ClientBinderDied {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f30792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AuthInfoRepository f30793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HandlerThread f30794c;
    private yiw e;

    public AuthManagerImpl(AuthInfoRepository authInfoRepository, yiw yiwVar) {
        yit.a("AuthManagerImpl", "AuthManagerImpl Constructor enter!");
        this.f30793b = authInfoRepository;
        this.e = yiwVar;
        HandlerThread handlerThread = new HandlerThread("WearEngineHandlerThread");
        this.f30794c = handlerThread;
        handlerThread.start();
        if (this.f30794c.getLooper() == null) {
            yit.b("AuthManagerImpl", "mWorkThread getLooper is null!");
        } else {
            this.f30792a = new Handler(this.f30794c.getLooper()) { // from class: com.huawei.wearengine.service.api.AuthManagerImpl.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    super.handleMessage(message);
                    AuthManagerImpl.this.b(message);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message) {
        if (message != null && message.what == 101) {
            try {
                d(message);
            } catch (RemoteException unused) {
                yit.b("AuthManagerImpl", "handleMessage RemoteException");
            }
        }
    }

    @Override // com.huawei.wearengine.AuthManager
    public int requestPermission(AuthListener authListener, Permission[] permissionArr) throws RemoteException {
        yit.a("AuthManagerImpl", "requestPermission enter!");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        Context contextA = yiv.a();
        int callingUid = Binder.getCallingUid();
        yit.a("AuthManagerImpl", "requestPermission uid:" + callingUid);
        yit.e("AuthManagerImpl", "requestPermission pid:" + Binder.getCallingPid());
        String strB = yln.b(callingUid, contextA, this.e.getApplicationIdByPid(Integer.valueOf(Binder.getCallingPid())));
        try {
            d(authListener, permissionArr, "requestPermission", strB);
            List<String> listD = ylo.d(strB);
            if (ylo.e(a(permissionArr), listD)) {
                authListener.onOk(ylo.e(listD));
                return 0;
            }
            HashSet hashSet = new HashSet(permissionArr.length);
            for (Permission permission : permissionArr) {
                hashSet.add(permission.getName());
            }
            String[] strArr = (String[]) hashSet.toArray(new String[0]);
            yit.a("AuthManagerImpl", "requestPermission permissionTypes：" + Arrays.toString(strArr));
            yit.e("AuthManagerImpl", "putCallbackToMap PackageName:" + strB);
            yia.c().e(strB, authListener);
            Message messageObtain = Message.obtain();
            messageObtain.what = 101;
            messageObtain.obj = strB;
            Bundle bundle = new Bundle();
            bundle.putStringArray("permissionTypes", strArr);
            messageObtain.setData(bundle);
            yit.a("AuthManagerImpl", "requestPermission sendMessage");
            this.f30792a.sendMessage(messageObtain);
            wearEngineBiOperate.biApiCalling(contextA, strB, "requestPermission", String.valueOf(0));
            return 0;
        } catch (IllegalStateException e) {
            wearEngineBiOperate.biApiCalling(contextA, strB, "requestPermission", String.valueOf(ylt.a(e)));
            throw e;
        }
    }

    private void d(AuthListener authListener, Permission[] permissionArr, String str, String str2) {
        if (authListener == null || permissionArr == null || permissionArr.length == 0) {
            throw new IllegalStateException(String.valueOf(5));
        }
        if (permissionArr.length > 10) {
            throw new IllegalStateException(String.valueOf(5));
        }
        PowerModeChangeManager.a().e(true);
        c(str, str2);
    }

    private String[] a(Permission[] permissionArr) {
        String[] strArr = new String[permissionArr.length];
        for (int i = 0; i < permissionArr.length; i++) {
            Permission permission = permissionArr[i];
            if (permission != null) {
                strArr[i] = permission.getName();
            } else {
                strArr[i] = "";
                yit.c("AuthManagerImpl", "permissions is null");
            }
        }
        return strArr;
    }

    @Override // com.huawei.wearengine.AuthManager
    public boolean checkPermission(Permission permission) throws RemoteException {
        yit.a("AuthManagerImpl", "checkPermission enter!");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        Context contextA = yiv.a();
        int callingUid = Binder.getCallingUid();
        String strB = yln.b(callingUid, contextA, this.e.getApplicationIdByPid(Integer.valueOf(Binder.getCallingPid())));
        try {
            if (permission == null) {
                throw new IllegalStateException(String.valueOf(5));
            }
            PowerModeChangeManager.a().e(true);
            if (yik.b(callingUid, strB)) {
                yit.e("AuthManagerImpl", "checkPermission isSuperCaller");
                return true;
            }
            List<String> listE = e();
            wearEngineBiOperate.biApiCalling(contextA, strB, "checkPermission", String.valueOf(0));
            return listE.contains(permission.getName());
        } catch (IllegalStateException e) {
            wearEngineBiOperate.biApiCalling(contextA, strB, "checkPermission", String.valueOf(ylt.a(e)));
            throw e;
        }
    }

    @Override // com.huawei.wearengine.AuthManager
    public boolean[] checkPermissions(Permission[] permissionArr) throws RemoteException {
        yit.a("AuthManagerImpl", "checkPermission enter!");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        Context contextA = yiv.a();
        int callingUid = Binder.getCallingUid();
        String strB = yln.b(callingUid, contextA, this.e.getApplicationIdByPid(Integer.valueOf(Binder.getCallingPid())));
        if (permissionArr != null) {
            try {
                if (permissionArr.length != 0 && permissionArr.length <= 10) {
                    PowerModeChangeManager.a().e(true);
                    int length = permissionArr.length;
                    boolean[] zArr = new boolean[length];
                    if (yik.b(callingUid, strB)) {
                        yit.e("AuthManagerImpl", "checkPermission isSuperCaller");
                        Arrays.fill(zArr, true);
                        return zArr;
                    }
                    List<String> listE = e();
                    wearEngineBiOperate.biApiCalling(contextA, strB, "checkPermissions", String.valueOf(0));
                    for (int i = 0; i < length; i++) {
                        zArr[i] = listE.contains(permissionArr[i].getName());
                    }
                    return zArr;
                }
            } catch (IllegalStateException e) {
                wearEngineBiOperate.biApiCalling(contextA, strB, "checkPermissions", String.valueOf(ylt.a(e)));
                throw e;
            }
        }
        throw new IllegalStateException(String.valueOf(5));
    }

    @Override // com.huawei.wearengine.AuthManager
    public String preStartAuth(AuthListener authListener) throws RemoteException {
        yit.e("AuthManagerImpl", "preStartAuth enter!");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        Context contextA = yiv.a();
        int callingUid = Binder.getCallingUid();
        yit.e("AuthManagerImpl", "preStartAuth uid:" + callingUid);
        yit.e("AuthManagerImpl", "preStartAuth pid:" + Binder.getCallingPid());
        String strB = yln.b(callingUid, contextA, this.e.getApplicationIdByPid(Integer.valueOf(Binder.getCallingPid())));
        try {
            if (strB == null) {
                throw new IllegalStateException(String.valueOf(12));
            }
            if (authListener == null) {
                throw new IllegalStateException(String.valueOf(5));
            }
            PowerModeChangeManager.a().e(true);
            c("preStartAuth", strB);
            yit.e("AuthManagerImpl", "putCallbackToMap PackageName:" + strB);
            if (!ylo.d(strB, ylo.e(yln.j(yiv.a(), strB)))) {
                throw new IllegalStateException(String.valueOf(8));
            }
            yia.c().e(strB, authListener);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("target_package_name", "com.huawei.health");
                jSONObject.put("target_activity_name", "com.huawei.wearengine.ui.JumpActivity");
                wearEngineBiOperate.biApiCalling(contextA, strB, "preStartAuth", String.valueOf(0));
                return jSONObject.toString();
            } catch (JSONException unused) {
                yit.b("AuthManagerImpl", "preStartAuth JSONException");
                throw new IllegalStateException(String.valueOf(12));
            }
        } catch (IllegalStateException e) {
            wearEngineBiOperate.biApiCalling(contextA, strB, "preStartAuth", String.valueOf(ylt.a(e)));
            throw e;
        }
    }

    private List<String> e() {
        ArrayList arrayList = new ArrayList();
        Context contextA = yiv.a();
        String strC = yln.c(contextA);
        if (TextUtils.isEmpty(strC)) {
            yit.b("AuthManagerImpl", "usr_id is null, not login in Huawei Health!");
            throw new IllegalStateException(String.valueOf(3));
        }
        List<AuthInfo> auth = this.f30793b.getAuth(Binder.getCallingUid(), strC, yln.j(contextA, yln.b(Binder.getCallingUid(), contextA, this.e.getApplicationIdByPid(Integer.valueOf(Binder.getCallingPid())))));
        if (auth != null && !auth.isEmpty()) {
            for (AuthInfo authInfo : auth) {
                if (authInfo.getOpenStatus() != 0) {
                    arrayList.add(authInfo.getPermission());
                }
            }
        }
        return arrayList;
    }

    private void c(String str, String str2) {
        yit.e("AuthManagerImpl", "checkAllAuthorization apiName is " + str + " ,pkgName is " + str2);
        Context contextA = yiv.a();
        if (!ylm.c(yln.c(contextA))) {
            yit.b("AuthManagerImpl", "requestPermission check health is not login in Huawei Health!");
            throw new IllegalStateException(String.valueOf(3));
        }
        if (yln.d(contextA)) {
            return;
        }
        yit.b("AuthManagerImpl", "requestPermission check user not authorized in Huawei Health!");
        throw new IllegalStateException(String.valueOf(7));
    }

    private void d(Message message) throws RemoteException {
        yit.e("AuthManagerImpl", "Start handleAuthMessage");
        Bundle data = message.getData();
        if (data == null) {
            yit.c("AuthManagerImpl", "handleAuthMessage bundle == null!");
            throw new IllegalStateException(String.valueOf(12));
        }
        if (!(message.obj instanceof String)) {
            yit.c("AuthManagerImpl", "handleAuthMessage message.obj is not string");
            return;
        }
        try {
            Intent intentA = ylo.a((String) message.obj, data.getStringArray("permissionTypes"));
            if (intentA == null) {
                yit.c("AuthManagerImpl", " handleAuthMessage intent is null");
            } else {
                yiv.a().startActivity(intentA);
            }
        } catch (ActivityNotFoundException unused) {
            yit.b("AuthManagerImpl", " handleAuthMessage ActivityNotFoundException");
        } catch (ArrayIndexOutOfBoundsException unused2) {
            yit.b("AuthManagerImpl", " bundle getStringArray error");
        }
    }

    @Override // com.huawei.wearengine.core.common.ClientBinderDied
    public void handleClientBinderDied(String str) {
        yit.c("AuthManagerImpl", "handleClientBinderDied clientPkgName is: " + str);
        yia.c().c(str);
        this.f30793b.deleteAuthFromCache(str);
    }
}
