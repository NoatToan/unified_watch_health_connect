package ohos.security.deviceauth.sdk;

import android.content.Context;
import android.util.Pair;
import com.huawei.operation.h5pro.jsmodules.complaint.ComplaintConstants;
import com.huawei.security.deviceauth.GroupOperation;
import com.huawei.security.deviceauth.HichainAuthManager;
import com.huawei.security.deviceauth.HwDeviceGroupManager;
import defpackage.zud;
import defpackage.zue;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class PlatformGroupManager implements GroupManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f44338c;
    private HwDeviceGroupManager e;
    private final CallbackProxy d = new CallbackProxy();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f44337b = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Pair<String, DeviceAuthCallback> f44336a = null;

    @Override // ohos.security.deviceauth.sdk.GroupManager
    public int confirmRequest(long j, String str, String str2) {
        return 0;
    }

    private void a(final long j, final int i, final int i2, final String str) {
        Runnable runnable;
        if (i2 == 0) {
            runnable = new Runnable() { // from class: ohos.security.deviceauth.sdk.PlatformGroupManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.d(j, i, str);
                }
            };
        } else {
            runnable = new Runnable() { // from class: ohos.security.deviceauth.sdk.PlatformGroupManager$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(j, i, i2);
                }
            };
        }
        this.f44337b.execute(runnable);
    }

    /* synthetic */ void d(long j, int i, String str) {
        ((DeviceAuthCallback) this.f44336a.second).onFinish(j, i, str);
    }

    /* synthetic */ void a(long j, int i, int i2) {
        ((DeviceAuthCallback) this.f44336a.second).onError(j, i, i2, null);
    }

    private boolean e(String str) {
        Pair<String, DeviceAuthCallback> pair;
        if (this.e != null && (pair = this.f44336a) != null && ((String) pair.first).equals(str)) {
            return false;
        }
        zud.d("PlatformGroupManager", "Please call initService and registerCallback first.");
        return true;
    }

    private HwDeviceGroupManager.HichainGroupCallback b() {
        return new HwDeviceGroupManager.HichainGroupCallback() { // from class: ohos.security.deviceauth.sdk.PlatformGroupManager.1
            public void onError(long j, GroupOperation groupOperation, int i, String str) {
            }

            public void onFinish(long j, GroupOperation groupOperation, String str) {
            }

            public String onRequest(long j, GroupOperation groupOperation, String str) {
                return "";
            }
        };
    }

    private HwDeviceGroupManager.HichainGroupCallback c(final String str) {
        return new HwDeviceGroupManager.HichainGroupCallback() { // from class: ohos.security.deviceauth.sdk.PlatformGroupManager.2
            public String onRequest(long j, GroupOperation groupOperation, String str2) {
                if (PlatformGroupManager.this.f44336a == null || !((String) PlatformGroupManager.this.f44336a.first).equals(str)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("confirmation", -2147483643);
                    } catch (JSONException unused) {
                        zud.d("PlatformGroupManager", "Pass confirmation failed.");
                    }
                    return jSONObject.toString();
                }
                try {
                    JSONObject jSONObject2 = new JSONObject(str2);
                    JSONObject jSONObject3 = new JSONObject();
                    if (jSONObject2.has("deviceId")) {
                        jSONObject3.put("deviceId", jSONObject2.getString("deviceId"));
                    }
                    if (jSONObject2.has("groupVisibility")) {
                        jSONObject3.put("groupVisibility", jSONObject2.getInt("groupVisibility"));
                    }
                    jSONObject2.put("groupInfo", jSONObject3);
                    return ((DeviceAuthCallback) PlatformGroupManager.this.f44336a.second).onRequest(j, getOperationCode(groupOperation), jSONObject2.toString());
                } catch (JSONException unused2) {
                    zud.d("PlatformGroupManager", "onRequest: parse json failed");
                    return ((DeviceAuthCallback) PlatformGroupManager.this.f44336a.second).onRequest(j, getOperationCode(groupOperation), str2);
                }
            }

            public void onError(long j, GroupOperation groupOperation, int i, String str2) {
                if (PlatformGroupManager.this.f44336a == null || !((String) PlatformGroupManager.this.f44336a.first).equals(str)) {
                    return;
                }
                ((DeviceAuthCallback) PlatformGroupManager.this.f44336a.second).onError(j, getOperationCode(groupOperation), i, str2);
            }

            public void onFinish(long j, GroupOperation groupOperation, String str2) {
                if (PlatformGroupManager.this.f44336a == null || !((String) PlatformGroupManager.this.f44336a.first).equals(str)) {
                    return;
                }
                ((DeviceAuthCallback) PlatformGroupManager.this.f44336a.second).onFinish(j, getOperationCode(groupOperation), str2);
            }

            private int getOperationCode(GroupOperation groupOperation) {
                return groupOperation == null ? GroupOperation.CODE_NULL.toInt() : groupOperation.toInt();
            }
        };
    }

    @Override // ohos.security.deviceauth.sdk.GroupManager
    public boolean isDeviceInGroup(String str, String str2, String str3) {
        HwDeviceGroupManager hwDeviceGroupManager = this.e;
        if (hwDeviceGroupManager == null) {
            zud.d("PlatformGroupManager", "isDeviceInGroup: Please call initService first.");
            return false;
        }
        List listListTrustedDevices = hwDeviceGroupManager.listTrustedDevices(str2);
        if (listListTrustedDevices == null || listListTrustedDevices.isEmpty()) {
            zud.d("PlatformGroupManager", "isDeviceInGroup: device list is empty, retry one time.");
            try {
                Thread.sleep(200L);
            } catch (InterruptedException unused) {
                zud.c("PlatformGroupManager", "retry directly.");
            }
            listListTrustedDevices = this.e.listTrustedDevices(str2);
            if (listListTrustedDevices == null || listListTrustedDevices.isEmpty()) {
                zud.d("PlatformGroupManager", "isDeviceInGroup: device list is empty.");
                return false;
            }
        }
        return listListTrustedDevices.contains(str3);
    }

    @Override // ohos.security.deviceauth.sdk.GroupManager
    public List<String> getGroupInfo(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            jSONObject.put("appId", str);
            return HichainAuthManager.getInstance(this.f44338c).getGroupInfo(jSONObject.toString());
        } catch (JSONException unused) {
            return new ArrayList(0);
        }
    }

    @Override // ohos.security.deviceauth.sdk.GroupManager
    public int processData(long j, byte[] bArr) {
        HwDeviceGroupManager hwDeviceGroupManager = this.e;
        if (hwDeviceGroupManager == null) {
            zud.d("PlatformGroupManager", "processData: Please call initService first.");
            return -1;
        }
        return ((Integer) zue.b(hwDeviceGroupManager, "processRequestData", new Class[]{Long.TYPE, byte[].class}, new Object[]{Long.valueOf(j), bArr}, Integer.class)).intValue();
    }

    @Override // ohos.security.deviceauth.sdk.GroupManager
    public int deleteMemberFromGroup(long j, String str, String str2) {
        if (e(str)) {
            return -1;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (jSONObject.has("connectParams")) {
                if (jSONObject.getBoolean("isClient")) {
                    return this.e.deleteMemberFromGroup(str, j, str2, jSONObject.getString("connectParams"));
                }
                return 0;
            }
            boolean z = jSONObject.getBoolean("isIgnoreChannel");
            boolean z2 = jSONObject.getBoolean("isForceDelete");
            Class<?> clsB = zue.b("com.huawei.security.deviceauth.HwDeviceGroupManager$CommunicationChannel");
            int iIntValue = ((Integer) zue.b(this.e, "deleteMemberFromGroupByChannel", new Class[]{String.class, Long.TYPE, String.class, clsB}, new Object[]{str, Long.valueOf(j), str2, (z2 && z) ? null : Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{clsB}, this.d)}, Integer.class)).intValue();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("groupId", jSONObject.getString("groupId"));
            jSONObject2.put("deleteId", jSONObject.getString("deleteId"));
            a(j, 4, iIntValue, jSONObject2.toString());
            return iIntValue;
        } catch (JSONException unused) {
            return -1;
        }
    }

    @Override // ohos.security.deviceauth.sdk.GroupManager
    public int addMemberToGroup(long j, String str, String str2) {
        if (e(str)) {
            return -1;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int i = jSONObject.getInt("groupType");
            if (jSONObject.has("connectParams")) {
                if (jSONObject.getBoolean("isClient")) {
                    return this.e.addMemberToGroup(str, j, str2, jSONObject.getString("connectParams"), i);
                }
                return 0;
            }
            Class<?> clsB = zue.b("com.huawei.security.deviceauth.HwDeviceGroupManager$CommunicationChannel");
            return ((Integer) zue.b(this.e, "addMemberToGroupByChannel", new Class[]{String.class, Long.TYPE, String.class, clsB, Integer.TYPE}, new Object[]{str, Long.valueOf(j), str2, Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{clsB}, this.d), Integer.valueOf(i)}, Integer.class)).intValue();
        } catch (JSONException unused) {
            return -1;
        }
    }

    @Override // ohos.security.deviceauth.sdk.GroupManager
    public int deleteGroup(long j, String str, String str2) {
        if (e(str)) {
            return -1;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int iDeleteGroup = this.e.deleteGroup(jSONObject.getString("groupId"));
            a(j, 1, iDeleteGroup, jSONObject.toString());
            return iDeleteGroup;
        } catch (JSONException unused) {
            return -1;
        }
    }

    @Override // ohos.security.deviceauth.sdk.GroupManager
    public int createGroup(long j, String str, String str2) {
        if (e(str)) {
            return -1;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            return this.e.createGroup(str, jSONObject.getString(ComplaintConstants.GROUP_NAME_PARAM_KEY), jSONObject.getInt("groupType"), str2);
        } catch (JSONException unused) {
            return -1;
        }
    }

    @Override // ohos.security.deviceauth.sdk.GroupManager
    public int unregisterCallback(String str) {
        Pair<String, DeviceAuthCallback> pair = this.f44336a;
        if (pair == null || !((String) pair.first).equals(str)) {
            zud.b("PlatformGroupManager", "The appId is not registered, no need to unregister.");
            return 0;
        }
        this.f44336a = null;
        return 0;
    }

    @Override // ohos.security.deviceauth.sdk.GroupManager
    public int registerCallback(String str, DeviceAuthCallback deviceAuthCallback) {
        if (deviceAuthCallback == null || str == null) {
            zud.d("PlatformGroupManager", "registerCallback: parameters cannot be null");
            return -1;
        }
        HwDeviceGroupManager hwDeviceGroupManager = HwDeviceGroupManager.getInstance(this.f44338c, str, c(str));
        this.e = hwDeviceGroupManager;
        if (hwDeviceGroupManager == null) {
            zud.d("PlatformGroupManager", "registerCallback: register callback fail, retry one time");
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
                zud.c("PlatformGroupManager", "retry directly.");
            }
            HwDeviceGroupManager hwDeviceGroupManager2 = HwDeviceGroupManager.getInstance(this.f44338c, str, c(str));
            this.e = hwDeviceGroupManager2;
            if (hwDeviceGroupManager2 == null) {
                zud.d("PlatformGroupManager", "registerCallback: retry fail!");
                return -1;
            }
        }
        this.f44336a = new Pair<>(str, deviceAuthCallback);
        return 0;
    }

    @Override // ohos.security.deviceauth.sdk.GroupManager
    public void destroyService() {
        HwDeviceGroupManager hwDeviceGroupManager = this.e;
        if (hwDeviceGroupManager != null) {
            hwDeviceGroupManager.unbindHwGroupManageService();
            this.e = null;
        }
    }

    @Override // ohos.security.deviceauth.sdk.GroupManager
    public int initService(Context context, String str) {
        if (context == null) {
            return -1;
        }
        this.f44338c = context;
        HwDeviceGroupManager hwDeviceGroupManager = HwDeviceGroupManager.getInstance(context, context.getPackageName(), b());
        this.e = hwDeviceGroupManager;
        if (hwDeviceGroupManager != null) {
            return 0;
        }
        zud.d("PlatformGroupManager", "initService: init service fail, retry one time");
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException unused) {
            zud.c("PlatformGroupManager", "retry directly.");
        }
        HwDeviceGroupManager hwDeviceGroupManager2 = HwDeviceGroupManager.getInstance(context, context.getPackageName(), b());
        this.e = hwDeviceGroupManager2;
        if (hwDeviceGroupManager2 != null) {
            return 0;
        }
        zud.d("PlatformGroupManager", "initService: retry fail!");
        return -1;
    }

    class CallbackProxy implements InvocationHandler {
        CallbackProxy() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (objArr.length != 2 || objArr[0].getClass() != Long.class || objArr[1].getClass() != byte[].class) {
                return -1;
            }
            return Integer.valueOf(((DeviceAuthCallback) PlatformGroupManager.this.f44336a.second).onTransmit(((Long) objArr[0]).longValue(), (byte[]) objArr[1]) ? 0 : -1);
        }
    }
}
