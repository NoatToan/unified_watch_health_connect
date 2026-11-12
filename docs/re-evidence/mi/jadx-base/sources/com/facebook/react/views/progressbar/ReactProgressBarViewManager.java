package com.facebook.react.views.progressbar;

import android.R;
import android.content.Context;
import android.widget.ProgressBar;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.BaseViewManager;
import defpackage.cci;
import defpackage.dci;
import defpackage.g9p;
import defpackage.iej;
import defpackage.ndj;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = ReactProgressBarViewManager.REACT_CLASS)
public class ReactProgressBarViewManager extends BaseViewManager<cci, dci> {
    static final String DEFAULT_STYLE = "Normal";
    static final String PROP_ANIMATING = "animating";
    static final String PROP_INDETERMINATE = "indeterminate";
    static final String PROP_PROGRESS = "progress";
    static final String PROP_STYLE = "styleAttr";
    public static final String REACT_CLASS = "AndroidProgressBar";
    private static Object sProgressBarCtorLock = new Object();

    public static ProgressBar createProgressBar(Context context, int i) {
        ProgressBar progressBar;
        synchronized (sProgressBarCtorLock) {
            progressBar = new ProgressBar(context, null, i);
        }
        return progressBar;
    }

    public static int getStyleFromString(String str) {
        if (str == null) {
            throw new JSApplicationIllegalArgumentException("ProgressBar needs to have a style, null received");
        }
        if (str.equals("Horizontal")) {
            return R.attr.progressBarStyleHorizontal;
        }
        if (str.equals("Small")) {
            return R.attr.progressBarStyleSmall;
        }
        if (str.equals("Large")) {
            return R.attr.progressBarStyleLarge;
        }
        if (str.equals("Inverse")) {
            return R.attr.progressBarStyleInverse;
        }
        if (str.equals("SmallInverse")) {
            return R.attr.progressBarStyleSmallInverse;
        }
        if (str.equals("LargeInverse")) {
            return R.attr.progressBarStyleLargeInverse;
        }
        if (str.equals(DEFAULT_STYLE)) {
            return R.attr.progressBarStyle;
        }
        throw new JSApplicationIllegalArgumentException("Unknown ProgressBar style: " + str);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<dci> getShadowNodeClass() {
        return dci.class;
    }

    @iej(name = PROP_ANIMATING)
    public void setAnimating(cci cciVar, boolean z) {
        cciVar.b(z);
    }

    @iej(customType = "Color", name = "color")
    public void setColor(cci cciVar, Integer num) {
        cciVar.d(num);
    }

    @iej(name = PROP_INDETERMINATE)
    public void setIndeterminate(cci cciVar, boolean z) {
        cciVar.e(z);
    }

    @iej(name = "progress")
    public void setProgress(cci cciVar, double d) {
        cciVar.f(d);
    }

    @iej(name = PROP_STYLE)
    public void setStyle(cci cciVar, String str) {
        cciVar.g(str);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(cci cciVar, Object obj) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public dci createShadowNodeInstance() {
        return new dci();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public cci createViewInstance(g9p g9pVar) {
        return new cci(g9pVar);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(cci cciVar) {
        cciVar.a();
    }
}
