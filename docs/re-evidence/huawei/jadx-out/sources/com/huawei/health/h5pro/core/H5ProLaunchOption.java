package com.huawei.health.h5pro.core;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.ArrayMap;
import com.huawei.health.h5pro.jsbridge.H5ProJsExtModule;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.jsbridge.base.JsModuleBase;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.operation.utils.WebViewHelp;
import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class H5ProLaunchOption implements Parcelable {
    public static final Parcelable.Creator<H5ProLaunchOption> CREATOR = new Parcelable.Creator<H5ProLaunchOption>() { // from class: com.huawei.health.h5pro.core.H5ProLaunchOption.5
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public H5ProLaunchOption[] newArray(int i) {
            return new H5ProLaunchOption[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public H5ProLaunchOption createFromParcel(Parcel parcel) {
            return new H5ProLaunchOption(parcel);
        }
    };
    public static final int DEFAULT_BACKGROUND_COLOR = 0;
    public static final int DEFAULT_FORCE_DARK_MODE = -1;
    private static final String KEY_H5PRO_BUNDLES = "KEY_H5PRO_BUNDLES";
    private static final String KEY_H5PRO_GLOBAL_BI_PARAMS = "KEY_H5PRO_GLOBAL_BI_PARAMS";
    private static final String KEY_H5PRO_JS_EXT_MODULES = "KEY_H5PRO_JS_EXT_MODULES";
    private static final String KEY_JS_MODULE_CLASS = "KEY_JS_MODULE_CLASS";
    public static final int PREFER_WEB_THEME_OVER_USER_AGENT_DARKENING = 2;
    public static final int START_MODE_ACTIVITY_CLEAR_TOP = 1;
    public static final int START_MODE_DEFAULT = 0;
    public static final int START_MODE_H5_CLEAR_TOP = 2;
    public static final int START_MODE_H5_SINGLE_TOP = 3;
    private static final String TAG = "H5ProLaunchOption";
    public static final int THEME_LIGHT_ONLY = -1;
    public static final int USER_AGENT_DARKENING_ONLY = 0;
    public static final int WEB_THEME_DARKENING_ONLY = 1;
    private String anim;
    private int backgroundColor;
    private ArrayMap<String, String> customizeArgMap;
    private int forceDarkMode;
    private HashMap<String, String> globalBiParams;
    private HashMap<String, H5ProBundle> h5ProBundles;
    private boolean isDisableAllJsExtModules;
    private boolean isDisableImageProxy;
    private boolean isEnableImageCache;
    private boolean isEnableOnDestroyCallback;
    private boolean isEnableOnPauseCallback;
    private boolean isEnableOnResumeCallback;
    private boolean isEnableSelfProtection;
    private boolean isEnableSlowWholeDocumentDraw;
    private boolean isForResult;
    private boolean isHideBottomVirtualKeys;
    private boolean isImmerse;
    private boolean isNeedSoftInputAdapter;
    private boolean isShowStatusBar;
    private boolean isStartAtBottomOfStatusBar;
    private boolean isStatusBarTextBlack;
    private boolean isTextZoom;
    private ArrayList<H5ProJsExtModule> jsExtModules;
    private HashMap<String, Class<? extends JsModuleBase>> jsModuleClassMap;
    private String path;
    private int requestCode;
    private int screenOrientation;
    private int startFlag;
    private int startMode;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HashMap<String, String> f6732a;
        private HashMap<String, H5ProBundle> j;
        private ArrayList<H5ProJsExtModule> u;
        private String x;
        private ArrayMap<String, String> e = new ArrayMap<>();
        private boolean g = false;
        private boolean y = false;
        private boolean s = false;
        private boolean k = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f6733b = 0;
        private boolean q = false;
        private boolean w = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f6734c = -1;
        private int z = 268435456;
        private int aa = -1;
        private boolean t = false;
        private String d = "";
        private boolean o = true;
        private boolean h = true;
        private boolean m = true;
        private boolean r = false;
        private boolean p = false;
        private boolean l = false;
        private boolean n = false;
        private int ac = -1;
        private boolean f = false;
        private boolean i = false;
        private int ad = 0;
        private HashMap<String, Class<? extends JsModuleBase>> v = new HashMap<>();

        public Builder addBundle(H5ProBundle h5ProBundle) {
            return h5ProBundle == null ? this : d(h5ProBundle.getModuleName(), h5ProBundle);
        }

        public Builder addCustomizeArg(String str, String str2) {
            this.e.put(str, str2);
            return this;
        }

        public Builder addCustomizeJsModule(String str, Class<? extends JsModuleBase> cls) {
            if (this.v.get(str) == null) {
                this.v.put(str, cls);
                return this;
            }
            Locale locale = Locale.ROOT;
            LogUtil.w(H5ProLaunchOption.TAG, "js module '" + str + "' already exist, don't add it again.");
            return this;
        }

        public Builder addGlobalBiParam(String str, String str2) {
            if (this.f6732a == null) {
                this.f6732a = new HashMap<>();
            }
            this.f6732a.put(str, str2);
            return this;
        }

        public Builder addJsExtModule(H5ProJsExtModule h5ProJsExtModule) {
            if (this.u == null) {
                this.u = new ArrayList<>();
            }
            if (!this.u.contains(h5ProJsExtModule)) {
                this.u.add(h5ProJsExtModule);
            }
            return this;
        }

        public Builder addPath(String str) {
            if (this.x != null) {
                throw new RuntimeException("path already set");
            }
            this.x = str;
            return this;
        }

        public H5ProLaunchOption build() {
            return new H5ProLaunchOption(this);
        }

        public Builder copy(H5ProLaunchOption h5ProLaunchOption) {
            this.v = h5ProLaunchOption.jsModuleClassMap;
            this.e = h5ProLaunchOption.customizeArgMap;
            this.x = h5ProLaunchOption.path;
            this.y = h5ProLaunchOption.isTextZoom;
            this.s = h5ProLaunchOption.isImmerse;
            this.k = h5ProLaunchOption.isEnableSlowWholeDocumentDraw;
            this.f6733b = h5ProLaunchOption.backgroundColor;
            this.q = h5ProLaunchOption.isShowStatusBar;
            this.w = h5ProLaunchOption.isStatusBarTextBlack;
            this.f6734c = h5ProLaunchOption.forceDarkMode;
            this.z = h5ProLaunchOption.startFlag;
            this.aa = h5ProLaunchOption.screenOrientation;
            this.t = h5ProLaunchOption.isNeedSoftInputAdapter;
            this.d = h5ProLaunchOption.anim;
            this.f6732a = h5ProLaunchOption.globalBiParams;
            this.o = h5ProLaunchOption.isEnableOnResumeCallback;
            this.h = h5ProLaunchOption.isEnableOnDestroyCallback;
            this.m = h5ProLaunchOption.isEnableOnPauseCallback;
            this.r = h5ProLaunchOption.isStartAtBottomOfStatusBar;
            this.p = h5ProLaunchOption.isHideBottomVirtualKeys;
            this.l = h5ProLaunchOption.isEnableSelfProtection;
            this.j = h5ProLaunchOption.h5ProBundles;
            this.g = h5ProLaunchOption.isDisableAllJsExtModules;
            this.u = h5ProLaunchOption.jsExtModules;
            this.n = h5ProLaunchOption.isForResult;
            this.ac = h5ProLaunchOption.requestCode;
            this.f = h5ProLaunchOption.isEnableImageCache;
            this.i = h5ProLaunchOption.isDisableImageProxy;
            this.ad = h5ProLaunchOption.startMode;
            return this;
        }

        public Builder disableAllJsExtModules() {
            this.g = true;
            return this;
        }

        public Builder disableImageProxy() {
            this.i = true;
            return this;
        }

        public Builder enableImageCache() {
            this.f = true;
            return this;
        }

        public Builder enableOnDestroyCallback() {
            this.h = true;
            return this;
        }

        public Builder enableOnPauseCallback() {
            this.m = true;
            return this;
        }

        public Builder enableOnResumeCallback() {
            this.o = true;
            return this;
        }

        public Builder enableSelfProtection() {
            this.l = true;
            return this;
        }

        public Builder enableSlowWholeDocumentDraw() {
            this.k = true;
            return this;
        }

        public String getPath() {
            return this.x;
        }

        public Builder hideBottomVirtualKeys() {
            this.p = true;
            return this;
        }

        public Builder setActivityStartFlag(int i) {
            this.z = i;
            return this;
        }

        public Builder setAnim(String str) {
            this.d = str;
            return this;
        }

        public Builder setBackgroundColor(int i) {
            this.f6733b = i;
            return this;
        }

        public Builder setForceDarkMode(int i) {
            this.f6734c = i;
            return this;
        }

        public Builder setFromPageTitle(String str) {
            return addGlobalBiParam("fromPageTitle", str);
        }

        public Builder setImmerse() {
            this.s = true;
            return this;
        }

        public Builder setIsForResult(boolean z) {
            this.n = z;
            return this;
        }

        public Builder setNeedSoftInputAdapter() {
            this.t = true;
            return this;
        }

        public Builder setRequestCode(int i) {
            this.ac = i;
            return this;
        }

        public Builder setScreenOrientation(int i) {
            this.aa = i;
            return this;
        }

        public Builder setStartMode(int i) {
            this.ad = i;
            return this;
        }

        public Builder setStartSource(String str) {
            return addGlobalBiParam(WebViewHelp.BI_KEY_PULL_FROM, str);
        }

        public Builder setStatusBarTextBlack(boolean z) {
            this.w = z;
            return this;
        }

        public Builder setTextZoom() {
            this.y = true;
            return this;
        }

        public Builder showStatusBar() {
            this.q = true;
            return this;
        }

        public Builder startAtBottomOfStatusBar() {
            this.r = true;
            return this;
        }

        private Builder d(String str, H5ProBundle h5ProBundle) {
            if (h5ProBundle == null) {
                LogUtil.w(H5ProLaunchOption.TAG, "h5ProBundle is null");
                return this;
            }
            if (this.j == null) {
                this.j = new HashMap<>(1);
            }
            H5ProBundle h5ProBundle2 = this.j.get(str);
            if (h5ProBundle2 == null) {
                h5ProBundle2 = new H5ProBundle(str);
            }
            h5ProBundle2.putAll(h5ProBundle);
            this.j.put(str, h5ProBundle2);
            return this;
        }

        public Builder addCustomizeJsModule(String str, Class<? extends JsBaseModule> cls, H5ProBundle h5ProBundle) {
            if (this.v.get(str) != null) {
                Locale locale = Locale.ENGLISH;
                LogUtil.w(H5ProLaunchOption.TAG, "js module '" + str + "' already exist, don't add it again.");
                return this;
            }
            this.v.put(str, cls);
            return d(str, h5ProBundle);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ScreenOrientation {
    }

    @Deprecated
    public void addCustomizeArg(String str, String str2) {
        this.customizeArgMap.put(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getActivityStartFlag() {
        return this.startFlag;
    }

    public String getAllCustomizeArg() {
        return new JSONObject(this.customizeArgMap).toString();
    }

    public String getAnim() {
        return this.anim;
    }

    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public Map<String, H5ProBundle> getBundles() {
        HashMap<String, H5ProBundle> map = this.h5ProBundles;
        return map == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(map);
    }

    public Map<String, Class<? extends JsModuleBase>> getCustomizeJsModules() {
        HashMap<String, Class<? extends JsModuleBase>> map = this.jsModuleClassMap;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    public int getForceDarkMode() {
        return this.forceDarkMode;
    }

    public HashMap<String, String> getGlobalBiParams() {
        return this.globalBiParams;
    }

    public ArrayList<H5ProJsExtModule> getJsExtModules() {
        return this.jsExtModules;
    }

    public String getPath() {
        return this.path;
    }

    public int getRequestCode() {
        return this.requestCode;
    }

    public int getScreenOrientation() {
        return this.screenOrientation;
    }

    public int getStartMode() {
        return this.startMode;
    }

    public boolean getStatusBarTextColor() {
        return this.isStatusBarTextBlack;
    }

    public boolean isDisableAllJsExtModules() {
        return this.isDisableAllJsExtModules;
    }

    public boolean isDisableImageProxy() {
        return this.isDisableImageProxy;
    }

    public boolean isEnableImageCache() {
        return this.isEnableImageCache;
    }

    public boolean isEnableOnDestroyCallback() {
        return this.isEnableOnDestroyCallback;
    }

    public boolean isEnableOnPauseCallback() {
        return this.isEnableOnPauseCallback;
    }

    public boolean isEnableOnResumeCallback() {
        return this.isEnableOnResumeCallback;
    }

    public boolean isEnableSelfProtection() {
        return this.isEnableSelfProtection;
    }

    public boolean isEnableSlowWholeDocumentDraw() {
        return this.isEnableSlowWholeDocumentDraw;
    }

    public boolean isForResult() {
        return this.isForResult;
    }

    public boolean isHideBottomVirtualKeys() {
        return this.isHideBottomVirtualKeys;
    }

    public boolean isImmerse() {
        return this.isImmerse;
    }

    public boolean isNeedSoftInputAdapter() {
        return this.isNeedSoftInputAdapter;
    }

    public boolean isShowStatusBar() {
        return this.isShowStatusBar;
    }

    public boolean isStartAtBottomOfStatusBar() {
        return this.isStartAtBottomOfStatusBar;
    }

    public boolean isTextZoom() {
        return this.isTextZoom;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.path);
        parcel.writeByte(this.isTextZoom ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isImmerse ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isShowStatusBar ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isEnableSlowWholeDocumentDraw ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isStatusBarTextBlack ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.forceDarkMode);
        parcel.writeInt(this.backgroundColor);
        parcel.writeInt(this.startFlag);
        parcel.writeInt(this.startFlag);
        parcel.writeInt(this.screenOrientation);
        parcel.writeByte(this.isNeedSoftInputAdapter ? (byte) 1 : (byte) 0);
        parcel.writeString(this.anim);
        parcel.writeByte(this.isEnableOnResumeCallback ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isEnableOnDestroyCallback ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isEnableOnPauseCallback ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isStartAtBottomOfStatusBar ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isHideBottomVirtualKeys ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isEnableSelfProtection ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isForResult ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.requestCode);
        parcel.writeByte(this.isEnableImageCache ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isDisableImageProxy ? (byte) 1 : (byte) 0);
        parcel.writeMap(this.customizeArgMap);
        parcel.writeByte(this.isDisableAllJsExtModules ? (byte) 1 : (byte) 0);
        Bundle bundle = new Bundle();
        bundle.putSerializable(KEY_JS_MODULE_CLASS, this.jsModuleClassMap);
        bundle.putSerializable(KEY_H5PRO_BUNDLES, this.h5ProBundles);
        bundle.putParcelableArrayList(KEY_H5PRO_JS_EXT_MODULES, this.jsExtModules);
        bundle.putSerializable(KEY_H5PRO_GLOBAL_BI_PARAMS, this.globalBiParams);
        parcel.writeBundle(bundle);
    }

    public H5ProLaunchOption() {
        this.customizeArgMap = new ArrayMap<>();
        this.isDisableAllJsExtModules = false;
        this.isTextZoom = false;
        this.isImmerse = false;
        this.isShowStatusBar = false;
        this.isEnableSlowWholeDocumentDraw = false;
        this.isStatusBarTextBlack = false;
        this.forceDarkMode = -1;
        this.backgroundColor = 0;
        this.startFlag = 268435456;
        this.screenOrientation = -1;
        this.isNeedSoftInputAdapter = false;
        this.anim = "";
        this.isEnableOnResumeCallback = false;
        this.isEnableOnDestroyCallback = false;
        this.isEnableOnPauseCallback = false;
        this.isStartAtBottomOfStatusBar = false;
        this.isHideBottomVirtualKeys = false;
        this.isEnableSelfProtection = false;
        this.isForResult = false;
        this.requestCode = -1;
        this.isEnableImageCache = false;
        this.isDisableImageProxy = false;
        this.startMode = 0;
    }

    private H5ProLaunchOption(Builder builder) {
        this.customizeArgMap = new ArrayMap<>();
        this.isDisableAllJsExtModules = false;
        this.isTextZoom = false;
        this.isImmerse = false;
        this.isShowStatusBar = false;
        this.isEnableSlowWholeDocumentDraw = false;
        this.isStatusBarTextBlack = false;
        this.forceDarkMode = -1;
        this.backgroundColor = 0;
        this.startFlag = 268435456;
        this.screenOrientation = -1;
        this.isNeedSoftInputAdapter = false;
        this.anim = "";
        this.isEnableOnResumeCallback = false;
        this.isEnableOnDestroyCallback = false;
        this.isEnableOnPauseCallback = false;
        this.isStartAtBottomOfStatusBar = false;
        this.isHideBottomVirtualKeys = false;
        this.isEnableSelfProtection = false;
        this.isForResult = false;
        this.requestCode = -1;
        this.isEnableImageCache = false;
        this.isDisableImageProxy = false;
        this.startMode = 0;
        this.jsModuleClassMap = builder.v;
        this.customizeArgMap = builder.e;
        this.path = builder.x;
        this.isTextZoom = builder.y;
        this.isImmerse = builder.s;
        this.isShowStatusBar = builder.q;
        this.isStatusBarTextBlack = builder.w;
        this.forceDarkMode = builder.f6734c;
        this.isEnableSlowWholeDocumentDraw = builder.k;
        this.backgroundColor = builder.f6733b;
        this.startFlag = builder.z;
        this.screenOrientation = builder.aa;
        this.isNeedSoftInputAdapter = builder.t;
        this.anim = builder.d;
        this.globalBiParams = builder.f6732a;
        this.isEnableOnResumeCallback = builder.o;
        this.isEnableOnDestroyCallback = builder.h;
        this.isEnableOnPauseCallback = builder.m;
        this.isStartAtBottomOfStatusBar = builder.r;
        this.isHideBottomVirtualKeys = builder.p;
        this.isEnableSelfProtection = builder.l;
        this.h5ProBundles = builder.j;
        this.isDisableAllJsExtModules = builder.g;
        this.jsExtModules = builder.u;
        this.isForResult = builder.n;
        this.requestCode = builder.ac;
        this.isEnableImageCache = builder.f;
        this.isDisableImageProxy = builder.i;
        this.startMode = builder.ad;
    }

    public H5ProLaunchOption(Parcel parcel) {
        this.customizeArgMap = new ArrayMap<>();
        this.isDisableAllJsExtModules = false;
        this.isTextZoom = false;
        this.isImmerse = false;
        this.isShowStatusBar = false;
        this.isEnableSlowWholeDocumentDraw = false;
        this.isStatusBarTextBlack = false;
        this.forceDarkMode = -1;
        this.backgroundColor = 0;
        this.startFlag = 268435456;
        this.screenOrientation = -1;
        this.isNeedSoftInputAdapter = false;
        this.anim = "";
        this.isEnableOnResumeCallback = false;
        this.isEnableOnDestroyCallback = false;
        this.isEnableOnPauseCallback = false;
        this.isStartAtBottomOfStatusBar = false;
        this.isHideBottomVirtualKeys = false;
        this.isEnableSelfProtection = false;
        this.isForResult = false;
        this.requestCode = -1;
        this.isEnableImageCache = false;
        this.isDisableImageProxy = false;
        this.startMode = 0;
        this.path = parcel.readString();
        this.isTextZoom = parcel.readByte() != 0;
        this.isImmerse = parcel.readByte() != 0;
        this.isShowStatusBar = parcel.readByte() != 0;
        this.isEnableSlowWholeDocumentDraw = parcel.readByte() != 0;
        this.isStatusBarTextBlack = parcel.readByte() != 0;
        this.forceDarkMode = parcel.readInt();
        this.backgroundColor = parcel.readInt();
        this.startFlag = parcel.readInt();
        this.startMode = parcel.readInt();
        this.screenOrientation = parcel.readInt();
        this.isNeedSoftInputAdapter = parcel.readByte() != 0;
        this.anim = parcel.readString();
        this.isEnableOnResumeCallback = parcel.readByte() != 0;
        this.isEnableOnDestroyCallback = parcel.readByte() != 0;
        this.isEnableOnPauseCallback = parcel.readByte() != 0;
        this.isStartAtBottomOfStatusBar = parcel.readByte() != 0;
        this.isHideBottomVirtualKeys = parcel.readByte() != 0;
        this.isEnableSelfProtection = parcel.readByte() != 0;
        this.isForResult = parcel.readByte() != 0;
        this.requestCode = parcel.readInt();
        this.isEnableImageCache = parcel.readByte() != 0;
        this.isDisableImageProxy = parcel.readByte() != 0;
        parcel.readMap(this.customizeArgMap, getClass().getClassLoader());
        this.isDisableAllJsExtModules = parcel.readByte() != 0;
        Bundle bundle = parcel.readBundle(getClass().getClassLoader());
        Serializable serializable = bundle.getSerializable(KEY_JS_MODULE_CLASS);
        if (serializable != null) {
            this.jsModuleClassMap = (HashMap) serializable;
        }
        Serializable serializable2 = bundle.getSerializable(KEY_H5PRO_BUNDLES);
        if (serializable2 != null) {
            this.h5ProBundles = (HashMap) serializable2;
        }
        ArrayList<H5ProJsExtModule> parcelableArrayList = bundle.getParcelableArrayList(KEY_H5PRO_JS_EXT_MODULES);
        if (parcelableArrayList != null) {
            this.jsExtModules = parcelableArrayList;
        }
        Serializable serializable3 = bundle.getSerializable(KEY_H5PRO_GLOBAL_BI_PARAMS);
        if (serializable3 instanceof HashMap) {
            this.globalBiParams = (HashMap) serializable3;
        }
    }
}
