package com.zoontek.rnlocalize;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import defpackage.ndj;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ndj(name = RNLocalizeModuleImpl.NAME)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0007J\b\u0010\t\u001a\u00020\u0007H\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u0007H\u0007J\b\u0010\u0010\u001a\u00020\u0007H\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0012H\u0007J\b\u0010\u0014\u001a\u00020\u0012H\u0007J\b\u0010\u0015\u001a\u00020\u0012H\u0007¨\u0006\u0016"}, d2 = {"Lcom/zoontek/rnlocalize/RNLocalizeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "getCalendar", "getCountry", "getCurrencies", "Lcom/facebook/react/bridge/WritableArray;", "getLocales", "getNumberFormatSettings", "Lcom/facebook/react/bridge/WritableMap;", "getTemperatureUnit", "getTimeZone", "uses24HourClock", "", "usesMetricSystem", "usesAutoDateAndTime", "usesAutoTimeZone", "react-native-localize_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RNLocalizeModule extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNLocalizeModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @NotNull
    public final String getCalendar() {
        return RNLocalizeModuleImpl.INSTANCE.getCalendar();
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @NotNull
    public final String getCountry() {
        RNLocalizeModuleImpl rNLocalizeModuleImpl = RNLocalizeModuleImpl.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        return rNLocalizeModuleImpl.getCountry(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @NotNull
    public final WritableArray getCurrencies() {
        RNLocalizeModuleImpl rNLocalizeModuleImpl = RNLocalizeModuleImpl.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        return rNLocalizeModuleImpl.getCurrencies(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @NotNull
    public final WritableArray getLocales() {
        RNLocalizeModuleImpl rNLocalizeModuleImpl = RNLocalizeModuleImpl.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        return rNLocalizeModuleImpl.getLocales(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return RNLocalizeModuleImpl.NAME;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @NotNull
    public final WritableMap getNumberFormatSettings() {
        RNLocalizeModuleImpl rNLocalizeModuleImpl = RNLocalizeModuleImpl.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        return rNLocalizeModuleImpl.getNumberFormatSettings(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @NotNull
    public final String getTemperatureUnit() {
        RNLocalizeModuleImpl rNLocalizeModuleImpl = RNLocalizeModuleImpl.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        return rNLocalizeModuleImpl.getTemperatureUnit(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @NotNull
    public final String getTimeZone() {
        return RNLocalizeModuleImpl.INSTANCE.getTimeZone();
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final boolean uses24HourClock() {
        RNLocalizeModuleImpl rNLocalizeModuleImpl = RNLocalizeModuleImpl.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        return rNLocalizeModuleImpl.uses24HourClock(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final boolean usesAutoDateAndTime() {
        RNLocalizeModuleImpl rNLocalizeModuleImpl = RNLocalizeModuleImpl.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        return rNLocalizeModuleImpl.usesAutoDateAndTime(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final boolean usesAutoTimeZone() {
        RNLocalizeModuleImpl rNLocalizeModuleImpl = RNLocalizeModuleImpl.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        return rNLocalizeModuleImpl.usesAutoTimeZone(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final boolean usesMetricSystem() {
        RNLocalizeModuleImpl rNLocalizeModuleImpl = RNLocalizeModuleImpl.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        return rNLocalizeModuleImpl.usesMetricSystem(reactApplicationContext);
    }
}
