package com.facebook.react.modules.permissions;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.util.SparseArray;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import defpackage.gsh;
import defpackage.ndj;
import defpackage.prh;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = PermissionsModule.NAME)
public class PermissionsModule extends ReactContextBaseJavaModule implements gsh {
    private static final String ERROR_INVALID_ACTIVITY = "E_INVALID_ACTIVITY";
    public static final String NAME = "PermissionsAndroid";
    private final String DENIED;
    private final String GRANTED;
    private final String NEVER_ASK_AGAIN;
    private final SparseArray<Callback> mCallbacks;
    private int mRequestCode;

    public class a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f7433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f7434b;

        public a(Promise promise, String str) {
            this.f7433a = promise;
            this.f7434b = str;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            int[] iArr = (int[]) objArr[0];
            if (iArr.length > 0 && iArr[0] == 0) {
                this.f7433a.resolve("granted");
            } else if (((prh) objArr[1]).shouldShowRequestPermissionRationale(this.f7434b)) {
                this.f7433a.resolve("denied");
            } else {
                this.f7433a.resolve("never_ask_again");
            }
        }
    }

    public class b implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f7435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ WritableMap f7436b;
        public final /* synthetic */ Promise c;

        public b(ArrayList arrayList, WritableMap writableMap, Promise promise) {
            this.f7435a = arrayList;
            this.f7436b = writableMap;
            this.c = promise;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            int[] iArr = (int[]) objArr[0];
            prh prhVar = (prh) objArr[1];
            for (int i = 0; i < this.f7435a.size(); i++) {
                String str = (String) this.f7435a.get(i);
                if (iArr.length > 0 && iArr[i] == 0) {
                    this.f7436b.putString(str, "granted");
                } else if (prhVar.shouldShowRequestPermissionRationale(str)) {
                    this.f7436b.putString(str, "denied");
                } else {
                    this.f7436b.putString(str, "never_ask_again");
                }
            }
            this.c.resolve(this.f7436b);
        }
    }

    public PermissionsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mRequestCode = 0;
        this.GRANTED = "granted";
        this.DENIED = "denied";
        this.NEVER_ASK_AGAIN = "never_ask_again";
        this.mCallbacks = new SparseArray<>();
    }

    private prh getPermissionAwareActivity() {
        ComponentCallbacks2 currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (currentActivity instanceof prh) {
            return (prh) currentActivity;
        }
        throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
    }

    @ReactMethod
    public void checkPermission(String str, Promise promise) {
        promise.resolve(Boolean.valueOf(getReactApplicationContext().getBaseContext().checkSelfPermission(str) == 0));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // defpackage.gsh
    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mCallbacks.get(i).invoke(iArr, getPermissionAwareActivity());
        this.mCallbacks.remove(i);
        return this.mCallbacks.size() == 0;
    }

    @ReactMethod
    public void requestMultiplePermissions(ReadableArray readableArray, Promise promise) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        ArrayList arrayList = new ArrayList();
        Context baseContext = getReactApplicationContext().getBaseContext();
        int i = 0;
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            String string = readableArray.getString(i2);
            if (baseContext.checkSelfPermission(string) == 0) {
                writableNativeMap.putString(string, "granted");
                i++;
            } else {
                arrayList.add(string);
            }
        }
        if (readableArray.size() == i) {
            promise.resolve(writableNativeMap);
            return;
        }
        try {
            prh permissionAwareActivity = getPermissionAwareActivity();
            this.mCallbacks.put(this.mRequestCode, new b(arrayList, writableNativeMap, promise));
            permissionAwareActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), this.mRequestCode, this);
            this.mRequestCode++;
        } catch (IllegalStateException e) {
            promise.reject(ERROR_INVALID_ACTIVITY, e);
        }
    }

    @ReactMethod
    public void requestPermission(String str, Promise promise) {
        if (getReactApplicationContext().getBaseContext().checkSelfPermission(str) == 0) {
            promise.resolve("granted");
            return;
        }
        try {
            prh permissionAwareActivity = getPermissionAwareActivity();
            this.mCallbacks.put(this.mRequestCode, new a(promise, str));
            permissionAwareActivity.requestPermissions(new String[]{str}, this.mRequestCode, this);
            this.mRequestCode++;
        } catch (IllegalStateException e) {
            promise.reject(ERROR_INVALID_ACTIVITY, e);
        }
    }

    @ReactMethod
    public void shouldShowRequestPermissionRationale(String str, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(getPermissionAwareActivity().shouldShowRequestPermissionRationale(str)));
        } catch (IllegalStateException e) {
            promise.reject(ERROR_INVALID_ACTIVITY, e);
        }
    }
}
