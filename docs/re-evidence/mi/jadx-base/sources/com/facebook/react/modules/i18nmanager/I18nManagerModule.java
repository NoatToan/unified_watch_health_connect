package com.facebook.react.modules.i18nmanager;

import android.content.Context;
import com.facebook.react.bridge.ContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import defpackage.e4f;
import defpackage.ndj;
import defpackage.poc;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = I18nManagerModule.NAME)
public class I18nManagerModule extends ContextBaseJavaModule {
    public static final String NAME = "I18nManager";
    private final poc sharedI18nUtilInstance;

    public I18nManagerModule(Context context) {
        super(context);
        this.sharedI18nUtilInstance = poc.d();
    }

    @ReactMethod
    public void allowRTL(boolean z) {
        this.sharedI18nUtilInstance.a(getContext(), z);
    }

    @ReactMethod
    public void forceRTL(boolean z) {
        this.sharedI18nUtilInstance.c(getContext(), z);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        Context context = getContext();
        Locale locale = context.getResources().getConfiguration().locale;
        HashMap mapB = e4f.b();
        mapB.put("isRTL", Boolean.valueOf(this.sharedI18nUtilInstance.g(context)));
        mapB.put("doLeftAndRightSwapInRTL", Boolean.valueOf(this.sharedI18nUtilInstance.b(context)));
        mapB.put("localeIdentifier", locale.toString());
        return mapB;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void swapLeftAndRightInRTL(boolean z) {
        this.sharedI18nUtilInstance.k(getContext(), z);
    }
}
