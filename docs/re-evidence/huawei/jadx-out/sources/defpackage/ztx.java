package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import ohos.security.deviceauth.sdk.DeviceAuthCallback;
import ohos.security.deviceauth.sdk.GroupManager;
import ohos.security.deviceauth.sdk.NativeDas;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
class ztx implements GroupManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f54564b = false;
    private long e = 0;

    ztx() {
    }

    @Override // ohos.security.deviceauth.sdk.GroupManager
    public int initService(Context context, String str) {
        if (this.f54564b) {
            return 0;
        }
        if (!NativeDas.isLibraryLoaded()) {
            zud.d("NativeGroupManager", "The local library was not loaded successfully, the service could not be initialized.");
            return -1;
        }
        if (context == null || context.getFilesDir() == null) {
            zud.d("NativeGroupManager", "initService: Invalid context.");
            return -1;
        }
        int iInitService = NativeDas.initService(context.getFilesDir().getPath(), str);
        if (iInitService != 0) {
            zud.d("NativeGroupManager", "initService: Init group manager service failed.");
            return iInitService;
        }
        long gmInstance = NativeDas.getGmInstance();
        this.e = gmInstance;
        if (gmInstance == 0) {
            zud.d("NativeGroupManager", "initService: Get instance of gm failed.");
            return -1;
        }
        this.f54564b = true;
        return 0;
    }

    @Override // ohos.security.deviceauth.sdk.GroupManager
    public void destroyService() {
        if (this.f54564b) {
            NativeDas.destroyService();
            this.f54564b = false;
        }
    }

    @Override // ohos.security.deviceauth.sdk.GroupManager
    public int registerCallback(String str, DeviceAuthCallback deviceAuthCallback) {
        if (!this.f54564b) {
            zud.d("NativeGroupManager", "The service is not started. Please call the initService first.");
            return -1;
        }
        return NativeDas.registerGmCallback(this.e, str, deviceAuthCallback);
    }

    @Override // ohos.security.deviceauth.sdk.GroupManager
    public int unregisterCallback(String str) {
        if (!this.f54564b) {
            zud.d("NativeGroupManager", "The service is not started. Please call the initService first.");
            return -1;
        }
        return NativeDas.unregisterGmCallback(this.e, str);
    }

    @Override // ohos.security.deviceauth.sdk.GroupManager
    public int createGroup(long j, String str, String str2) {
        if (!this.f54564b) {
            zud.d("NativeGroupManager", "The service is not started. Please call the initService first.");
            return -1;
        }
        return NativeDas.createGroup(this.e, j, str, str2);
    }

    @Override // ohos.security.deviceauth.sdk.GroupManager
    public int deleteGroup(long j, String str, String str2) {
        if (!this.f54564b) {
            zud.d("NativeGroupManager", "The service is not started. Please call the initService first.");
            return -1;
        }
        return NativeDas.deleteGroup(this.e, j, str, str2);
    }

    @Override // ohos.security.deviceauth.sdk.GroupManager
    public int addMemberToGroup(long j, String str, String str2) {
        if (!this.f54564b) {
            zud.d("NativeGroupManager", "The service is not started. Please call the initService first.");
            return -1;
        }
        try {
            if (new JSONObject(str2).getBoolean("isClient")) {
                return NativeDas.addMemberToGroup(this.e, j, str, str2);
            }
            return 0;
        } catch (JSONException unused) {
            return -1;
        }
    }

    @Override // ohos.security.deviceauth.sdk.GroupManager
    public int deleteMemberFromGroup(long j, String str, String str2) {
        if (!this.f54564b) {
            zud.d("NativeGroupManager", "The service is not started. Please call the initService first.");
            return -1;
        }
        try {
            if (new JSONObject(str2).getBoolean("isClient")) {
                return NativeDas.deleteMemberFromGroup(this.e, j, str, str2);
            }
            return 0;
        } catch (JSONException unused) {
            return -1;
        }
    }

    @Override // ohos.security.deviceauth.sdk.GroupManager
    public int processData(long j, byte[] bArr) {
        if (!this.f54564b) {
            zud.d("NativeGroupManager", "The service is not started. Please call the initService first.");
            return -1;
        }
        return NativeDas.processGmData(this.e, j, bArr);
    }

    @Override // ohos.security.deviceauth.sdk.GroupManager
    public int confirmRequest(long j, String str, String str2) {
        if (!this.f54564b) {
            zud.d("NativeGroupManager", "The service is not started. Please call the initService first.");
            return -1;
        }
        return NativeDas.confirmRequest(this.e, j, str, str2);
    }

    @Override // ohos.security.deviceauth.sdk.GroupManager
    public List<String> getGroupInfo(String str, String str2) {
        if (!this.f54564b) {
            zud.d("NativeGroupManager", "The service is not started. Please call the initService first.");
            return new ArrayList(0);
        }
        String groupInfo = NativeDas.getGroupInfo(this.e, str, str2);
        if (groupInfo == null || groupInfo.isEmpty()) {
            return new ArrayList(0);
        }
        try {
            JSONArray jSONArray = new JSONArray(groupInfo);
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getJSONObject(i).toString());
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList(0);
        }
    }

    @Override // ohos.security.deviceauth.sdk.GroupManager
    public boolean isDeviceInGroup(String str, String str2, String str3) {
        if (!this.f54564b) {
            zud.d("NativeGroupManager", "The service is not started. Please call the initService first.");
            return false;
        }
        return NativeDas.isDeviceInGroup(this.e, str, str2, str3);
    }
}
