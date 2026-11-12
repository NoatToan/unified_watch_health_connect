package ohos.ace.adapter.capability.web;

import android.content.Context;
import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes46.dex */
public class AceGeolocationPermissions {
    private static final int DELETE_FAILED = -1;
    private static final long INSERT_FAILED = -1;
    private static final int INTEGER_ONE = 1;
    private static final int INTEGER_ZERO = 0;
    private static final String INVALID_ORIGIN = "INVALID_ORIGIN";
    private static final String LOG_TAG = "AceGeolocationPermissions";
    private static final String ORIGIN_END_WITH = "/";
    private Context context;
    private WebDataBaseManager dataBase;

    protected static native void onReceiveGetAccessibleGeolocationError(String str, long j);

    protected static native void onReceiveGetAccessibleGeolocationValue(boolean z, long j);

    protected static native void onReceiveGetStoredGeolocationValue(String[] strArr, long j);

    protected native void nativeInit();

    public AceGeolocationPermissions(Context context) {
        this.dataBase = WebDataBaseManager.getInstance(context);
        nativeInit();
    }

    public void allowGeolocation(String str, boolean z, boolean z2) {
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        if (z2) {
            long jInsertPermissionByOrigin = this.dataBase.getGeolocationPermissionsDao().insertPermissionByOrigin(new WebDataBaseGeolocationPermissions(str, Integer.valueOf(z ? 1 : 0)));
            Long.valueOf(jInsertPermissionByOrigin).getClass();
            if (jInsertPermissionByOrigin != -1) {
                return;
            }
            throw new RuntimeException("Failed to insert geolocation permission for origin: " + str);
        }
        try {
            GeolocationPermissions.getInstance().allow(str);
        } catch (Exception unused) {
            throw new RuntimeException("GeolocationPermissions Failed to allowGeolocation  geolocation permissions");
        }
    }

    public void deleteGeolocation(String str, boolean z) {
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        if (z) {
            int iClearPermissionByOrigin = this.dataBase.getGeolocationPermissionsDao().clearPermissionByOrigin(str);
            Integer.valueOf(iClearPermissionByOrigin).getClass();
            if (iClearPermissionByOrigin != -1) {
                return;
            }
            throw new RuntimeException("Failed to clear geolocation permission for origin: " + str);
        }
        try {
            GeolocationPermissions.getInstance().clear(str);
        } catch (Exception unused) {
            throw new RuntimeException("GeolocationPermissions Failed to deleteGeolocation  geolocation permissions");
        }
    }

    public void deleteAllGeolocation(boolean z) {
        if (z) {
            int iClearAllPermission = this.dataBase.getGeolocationPermissionsDao().clearAllPermission();
            Integer.valueOf(iClearAllPermission).getClass();
            if (iClearAllPermission == -1) {
                throw new RuntimeException("Failed to clear all geolocation permissions");
            }
            return;
        }
        try {
            GeolocationPermissions.getInstance().clearAll();
        } catch (Exception unused) {
            throw new RuntimeException("GeolocationPermissions Failed to deleteAllGeolocation  geolocation permissions");
        }
    }

    public void getAccessibleGeolocation(String str, final long j, boolean z) {
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        final String str2 = str;
        if (z) {
            WebDataBaseGeolocationPermissions permissionResultByOrigin = this.dataBase.getGeolocationPermissionsDao().getPermissionResultByOrigin(str2);
            if (permissionResultByOrigin == null) {
                onReceiveGetAccessibleGeolocationError(INVALID_ORIGIN, j);
                return;
            } else {
                onReceiveGetAccessibleGeolocationValue(permissionResultByOrigin.getResult().intValue() == 1, j);
                return;
            }
        }
        final ArrayList arrayList = new ArrayList();
        GeolocationPermissions.getInstance().getOrigins(new ValueCallback<Set<String>>() { // from class: ohos.ace.adapter.capability.web.AceGeolocationPermissions.1
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(Set<String> set) {
                arrayList.addAll(set);
                if (arrayList.contains(str2)) {
                    GeolocationPermissions.getInstance().getAllowed(str2, new ValueCallback<Boolean>() { // from class: ohos.ace.adapter.capability.web.AceGeolocationPermissions.1.1
                        @Override // android.webkit.ValueCallback
                        public void onReceiveValue(Boolean bool) {
                            AceGeolocationPermissions.onReceiveGetAccessibleGeolocationValue(bool.booleanValue(), j);
                        }
                    });
                } else {
                    AceGeolocationPermissions.onReceiveGetAccessibleGeolocationError(AceGeolocationPermissions.INVALID_ORIGIN, j);
                }
            }
        });
    }

    public void getStoredGeolocation(final long j, boolean z) {
        if (z) {
            List<WebDataBaseGeolocationPermissions> originsByPermission = this.dataBase.getGeolocationPermissionsDao().getOriginsByPermission();
            ArrayList arrayList = new ArrayList();
            Iterator<WebDataBaseGeolocationPermissions> it = originsByPermission.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getOrigin());
            }
            onReceiveGetStoredGeolocationValue((String[]) arrayList.toArray(new String[0]), j);
            return;
        }
        GeolocationPermissions.getInstance().getOrigins(new ValueCallback<Set<String>>() { // from class: ohos.ace.adapter.capability.web.AceGeolocationPermissions.2
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(Set<String> set) {
                String[] strArr = new String[set.size()];
                set.toArray(strArr);
                AceGeolocationPermissions.onReceiveGetStoredGeolocationValue(strArr, j);
            }
        });
    }
}
