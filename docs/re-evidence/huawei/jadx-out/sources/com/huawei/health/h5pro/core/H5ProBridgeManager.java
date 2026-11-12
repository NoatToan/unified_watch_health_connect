package com.huawei.health.h5pro.core;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.huawei.health.h5pro.ext.permission.PermissionResultHandler;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.jsbridge.base.JsModuleBase;
import com.huawei.health.h5pro.load.H5ProCustomJsInterfaceCbk;
import com.huawei.health.h5pro.load.H5ProJsInterfacePreRequest;
import com.huawei.health.h5pro.load.JsInterfacePreRequestObj;
import com.huawei.health.h5pro.utils.CommonUtil;
import com.huawei.health.h5pro.utils.GsonUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.utils.PermissionUtil;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import com.huawei.health.h5pro.vengine.H5ProJsCbkInvoker;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class H5ProBridgeManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile H5ProBridgeManager f6720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f6721c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, Class<? extends JsBaseModule>> f6722a;
    private Map<H5ProInstance, Map<String, JsModuleBase>> g = new HashMap();
    private Map<H5ProInstance, Map<String, Class<? extends JsModuleBase>>> i = new HashMap();
    private Map<Integer, H5ProActivityResultCallback> e = new ConcurrentHashMap();
    private ConcurrentHashMap<String, Class<? extends JsModuleBase>> d = new ConcurrentHashMap<>();

    public static class CbkInvoker<T> implements H5ProJsCbkInvoker<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        H5ProCustomJsInterfaceCbk f6725c;
        H5ProBridgeCbkExecutor d;

        public CbkInvoker(H5ProBridgeCbkExecutor h5ProBridgeCbkExecutor) {
            this.d = h5ProBridgeCbkExecutor;
        }

        private String a(Object... objArr) {
            if (objArr == null || objArr.length == 0) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < objArr.length; i++) {
                sb.append(GsonUtil.contentValueToJson(objArr[i]));
                if (i < objArr.length - 1) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        private void c(long j, int i, Object obj, boolean z) {
            H5ProCustomJsInterfaceCbk h5ProCustomJsInterfaceCbk = this.f6725c;
            if (h5ProCustomJsInterfaceCbk == null || j >= 0) {
                invokeJsFunc("window.h5proRuntime.bridge.consumeCallback", e(j, i, obj, z));
            } else if (i == 0) {
                h5ProCustomJsInterfaceCbk.onCallback(j, obj);
            }
        }

        private d e(long j, int i, Object obj, boolean z) {
            LogUtil.d("H5PRO_BridgeManager", "triggerCallback enter, callback id:" + j + " errorCode:" + i + " isComplete" + z);
            d dVar = new d();
            dVar.e = j;
            dVar.d = i;
            if (obj instanceof JSONObject) {
                dVar.f6726b = new Gson().fromJson(obj.toString(), (Class) JsonObject.class);
            } else {
                dVar.f6726b = obj;
            }
            dVar.f6727c = z;
            return dVar;
        }

        @Override // com.huawei.health.h5pro.vengine.H5ProJsCbkInvoker
        public void invokeJsFunc(String str, Object... objArr) {
            this.d.execute(str + com.huawei.operation.utils.Constants.LEFT_BRACKET_ONLY + a(objArr) + com.huawei.operation.utils.Constants.RIGHT_BRACKET_ONLY);
        }

        @Override // com.huawei.health.h5pro.vengine.H5ProJsCbkInvoker
        public void onComplete(int i, String str, long j) {
            c(j, i, str, true);
        }

        @Override // com.huawei.health.h5pro.vengine.H5ProJsCbkInvoker
        public void onFailure(int i, String str, long j) {
            c(j, i, str, false);
        }

        @Override // com.huawei.health.h5pro.vengine.H5ProJsCbkInvoker
        public void onSuccess(T t, long j) {
            c(j, 0, t, false);
        }

        public void registerCustomCallback(H5ProCustomJsInterfaceCbk h5ProCustomJsInterfaceCbk) {
            this.f6725c = h5ProCustomJsInterfaceCbk;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("data")
        Object f6726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("isComplete")
        boolean f6727c;

        @SerializedName("err_code")
        int d;

        @SerializedName("callback_id")
        long e;
    }

    private H5ProBridgeManager() {
    }

    private void b(String str, String str2) {
        if (this.d.containsKey(str)) {
            LogUtil.e("H5PRO_BridgeManager", "registerBridgeClassByName: one js module should only be register once");
            return;
        }
        Class<?> cls = CommonUtil.getClass(str2);
        if (cls == null || !JsModuleBase.class.isAssignableFrom(cls)) {
            return;
        }
        this.d.put(str, (Class<? extends JsModuleBase>) cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, String[] strArr, int[] iArr, H5ProInstance h5ProInstance) {
        Map<String, JsModuleBase> map = this.g.get(h5ProInstance);
        if (map != null) {
            for (JsModuleBase jsModuleBase : map.values()) {
                if (jsModuleBase != null) {
                    jsModuleBase.onRequestPermissionsResult(i, strArr, iArr);
                }
            }
        }
        if (h5ProInstance != null) {
            h5ProInstance.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public static H5ProBridgeManager getInstance() {
        if (f6720b == null) {
            synchronized (f6721c) {
                if (f6720b == null) {
                    f6720b = new H5ProBridgeManager();
                }
            }
        }
        return f6720b;
    }

    public Map<String, JsModuleBase> createBridges(Context context, H5ProInstance h5ProInstance, Map<String, Class<? extends JsModuleBase>> map, Map<String, H5ProBundle> map2) {
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap(this.d);
        HashMap<String, Class<? extends JsBaseModule>> map5 = this.f6722a;
        if (map5 != null && !map5.isEmpty()) {
            map4.putAll(this.f6722a);
        }
        if (map != null) {
            map4.putAll(map);
            if (this.i == null) {
                this.i = new HashMap();
            }
            this.i.put(h5ProInstance, map);
        }
        for (Map.Entry entry : map4.entrySet()) {
            try {
                H5ProBundle h5ProBundle = null;
                JsModuleBase jsModuleBase = (JsModuleBase) ((Class) entry.getValue()).getConstructor(null).newInstance(null);
                if (jsModuleBase instanceof JsBaseModule) {
                    if (map2 != null) {
                        h5ProBundle = map2.get(entry.getKey());
                    }
                    ((JsBaseModule) jsModuleBase).onMount(context, h5ProInstance, h5ProBundle);
                } else {
                    jsModuleBase.onMount(context, h5ProInstance);
                }
                map3.put((String) entry.getKey(), jsModuleBase);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                LogUtil.e("H5PRO_BridgeManager", "createBridges fail:" + e.getClass().getName() + e.getMessage());
            }
        }
        this.g.put(h5ProInstance, map3);
        return map3;
    }

    public H5ProJsCbkInvoker<Object> createJsCbkInvoker(H5ProBridgeCbkExecutor h5ProBridgeCbkExecutor) {
        return new CbkInvoker(h5ProBridgeCbkExecutor);
    }

    public void destroy(H5ProInstance h5ProInstance) {
        LogUtil.i("H5PRO_BridgeManager", "destroy resources");
        Map<String, JsModuleBase> map = this.g.get(h5ProInstance);
        if (map != null) {
            for (JsModuleBase jsModuleBase : map.values()) {
                if (jsModuleBase != null) {
                    jsModuleBase.onDestroy();
                }
            }
            this.g.remove(h5ProInstance);
        }
        Map<H5ProInstance, Map<String, Class<? extends JsModuleBase>>> map2 = this.i;
        if (map2 != null) {
            map2.remove(h5ProInstance);
        }
        unRegisterBridgeExtClass();
    }

    public String[] getBridgeClassStrings() {
        if (CommonUtil.isMapEmpty(this.d)) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.d.keySet()) {
            Class<? extends JsModuleBase> cls = this.d.get(str);
            if (cls != null) {
                arrayList.add(str + "," + cls.getName());
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public Map<String, Class<? extends JsModuleBase>> getCustomJsModule(H5ProInstance h5ProInstance) {
        Map<H5ProInstance, Map<String, Class<? extends JsModuleBase>>> map;
        return (h5ProInstance == null || (map = this.i) == null) ? new HashMap() : map.get(h5ProInstance);
    }

    public void notifyActivityResult(H5ProInstance h5ProInstance, int i, int i2, Intent intent) {
        H5ProActivityResultCallback h5ProActivityResultCallback = this.e.get(Integer.valueOf(i));
        if (h5ProActivityResultCallback != null) {
            h5ProActivityResultCallback.onResult(intent);
            this.e.remove(Integer.valueOf(i));
        }
        Map<String, JsModuleBase> map = this.g.get(h5ProInstance);
        if (map != null) {
            for (JsModuleBase jsModuleBase : map.values()) {
                if (jsModuleBase != null) {
                    jsModuleBase.onActivityResult(i, i2, intent);
                }
            }
        }
        if (h5ProInstance != null) {
            h5ProInstance.onActivityResult(i, i2, intent);
        }
    }

    public void notifyPermissionResult(final H5ProInstance h5ProInstance, int i, String[] strArr, int[] iArr) {
        PermissionUtil.getInstance().handlePermissionResult(i, strArr, iArr, new PermissionResultHandler() { // from class: com.huawei.health.h5pro.core.H5ProBridgeManager.5
            @Override // com.huawei.health.h5pro.ext.permission.PermissionResultHandler
            public void handle(int i2, String[] strArr2, int[] iArr2) {
                H5ProBridgeManager.this.d(i2, strArr2, iArr2, h5ProInstance);
            }
        });
    }

    public void onConfigurationChanged(H5ProInstance h5ProInstance) {
        LogUtil.i("H5PRO_BridgeManager", "onConfigurationChanged resources");
        Map<String, JsModuleBase> map = this.g.get(h5ProInstance);
        if (map != null) {
            for (Object obj : map.values()) {
                if (obj != null && (obj instanceof WebViewConfigChangeListener)) {
                    ((WebViewConfigChangeListener) obj).onConfigurationChanged();
                }
            }
        }
    }

    public void preExecute(H5ProInstance h5ProInstance, long j, JsInterfacePreRequestObj jsInterfacePreRequestObj) {
        Map<H5ProInstance, Map<String, JsModuleBase>> map;
        if (jsInterfacePreRequestObj == null) {
            LogUtil.w("H5PRO_BridgeManager", "preRequestExecute: requestObj is null");
            return;
        }
        LogUtil.i("H5PRO_BridgeManager", "preRequestExecute: enter -> " + jsInterfacePreRequestObj.getRequestKey());
        if (!jsInterfacePreRequestObj.isAsync()) {
            LogUtil.w("H5PRO_BridgeManager", "preRequestExecute: Synchronization is not supported");
        } else if (h5ProInstance == null || (map = this.g) == null) {
            LogUtil.w("H5PRO_BridgeManager", "preExecute, h5ProInstance or bridgeObjectMap is null");
        } else {
            H5ProJsInterfacePreRequest.preRequestExecute(j, jsInterfacePreRequestObj, h5ProInstance, map.get(h5ProInstance));
        }
    }

    public void registerActivityResultCallback(int i, H5ProActivityResultCallback h5ProActivityResultCallback) {
        this.e.put(Integer.valueOf(i), h5ProActivityResultCallback);
    }

    public void registerBridgeClass(String str, Class<? extends JsModuleBase> cls) {
        if (this.d.containsKey(str)) {
            LogUtil.e("H5PRO_BridgeManager", "registerBridgeClass: one js module should only be register once");
        } else {
            this.d.put(str, cls);
        }
    }

    public void registerBridgeExtClass(String str, Class<? extends JsBaseModule> cls) {
        if (TextUtils.isEmpty(str) || cls == null) {
            LogUtil.w("H5PRO_BridgeManager", "registerExtBridgeClass: moduleName or extBridgeClass is null");
            return;
        }
        HashMap<String, Class<? extends JsBaseModule>> map = this.f6722a;
        if (map == null) {
            this.f6722a = new HashMap<>();
        } else if (map.containsKey(str)) {
            LogUtil.e("H5PRO_BridgeManager", "registerExtBridgeClass: one js module should only be register once");
            return;
        }
        this.f6722a.put(str, cls);
    }

    public void restoreBridgeClasses(String[] strArr) {
        if (strArr == null || strArr.length == 0 || !CommonUtil.isMapEmpty(this.d)) {
            return;
        }
        LogUtil.i("H5PRO_BridgeManager", "restoreBridgeClasses");
        for (int i = 0; i < strArr.length; i++) {
            if (!TextUtils.isEmpty(strArr[i])) {
                String[] strArrSplit = strArr[i].split(",");
                if (strArrSplit.length == 2) {
                    b(strArrSplit[0], strArrSplit[1]);
                }
            }
        }
    }

    public void unRegisterBridgeExtClass() {
        HashMap<String, Class<? extends JsBaseModule>> map = this.f6722a;
        if (map != null) {
            map.clear();
        }
    }
}
