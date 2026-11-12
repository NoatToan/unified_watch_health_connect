package com.facebook.react.views.image;

import android.graphics.PorterDuff;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import defpackage.apa;
import defpackage.e4f;
import defpackage.exh;
import defpackage.g9p;
import defpackage.iej;
import defpackage.j0s;
import defpackage.jej;
import defpackage.ndj;
import defpackage.o0b;
import defpackage.s5d;
import defpackage.t4d;
import java.util.Map;
import kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = ReactImageManager.REACT_CLASS)
public class ReactImageManager extends SimpleViewManager<ReactImageView> {
    public static final String REACT_CLASS = "RCTImageView";
    private final Object mCallerContext;
    private AbstractDraweeControllerBuilder mDraweeControllerBuilder;
    private o0b mGlobalImageLoadListener;

    public ReactImageManager(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, Object obj) {
        this(abstractDraweeControllerBuilder, null, obj);
    }

    public Object getCallerContext() {
        return this.mCallerContext;
    }

    public AbstractDraweeControllerBuilder getDraweeControllerBuilder() {
        if (this.mDraweeControllerBuilder == null) {
            this.mDraweeControllerBuilder = apa.f();
        }
        return this.mDraweeControllerBuilder;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return e4f.g(t4d.a(4), e4f.d("registrationName", "onLoadStart"), t4d.a(2), e4f.d("registrationName", "onLoad"), t4d.a(1), e4f.d("registrationName", "onError"), t4d.a(3), e4f.d("registrationName", "onLoadEnd"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @iej(name = "blurRadius")
    public void setBlurRadius(ReactImageView reactImageView, float f) {
        reactImageView.setBlurRadius(f);
    }

    @iej(customType = "Color", name = "borderColor")
    public void setBorderColor(ReactImageView reactImageView, Integer num) {
        if (num == null) {
            reactImageView.setBorderColor(0);
        } else {
            reactImageView.setBorderColor(num.intValue());
        }
    }

    @jej(defaultFloat = FloatCompanionObject.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(ReactImageView reactImageView, int i, float f) {
        if (!j0s.a(f)) {
            f = exh.c(f);
        }
        if (i == 0) {
            reactImageView.setBorderRadius(f);
        } else {
            reactImageView.u(f, i - 1);
        }
    }

    @iej(name = "borderWidth")
    public void setBorderWidth(ReactImageView reactImageView, float f) {
        reactImageView.setBorderWidth(f);
    }

    @iej(name = "defaultSrc")
    public void setDefaultSource(ReactImageView reactImageView, String str) {
        reactImageView.setDefaultSource(str);
    }

    @iej(name = "fadeDuration")
    public void setFadeDuration(ReactImageView reactImageView, int i) {
        reactImageView.setFadeDuration(i);
    }

    @iej(name = "headers")
    public void setHeaders(ReactImageView reactImageView, ReadableMap readableMap) {
        reactImageView.setHeaders(readableMap);
    }

    @iej(name = "shouldNotifyLoadEvents")
    public void setLoadHandlersRegistered(ReactImageView reactImageView, boolean z) {
        reactImageView.setShouldNotifyLoadEvents(z);
    }

    @iej(name = "loadingIndicatorSrc")
    public void setLoadingIndicatorSource(ReactImageView reactImageView, String str) {
        reactImageView.setLoadingIndicatorSource(str);
    }

    @iej(customType = "Color", name = "overlayColor")
    public void setOverlayColor(ReactImageView reactImageView, Integer num) {
        if (num == null) {
            reactImageView.setOverlayColor(0);
        } else {
            reactImageView.setOverlayColor(num.intValue());
        }
    }

    @iej(name = "progressiveRenderingEnabled")
    public void setProgressiveRenderingEnabled(ReactImageView reactImageView, boolean z) {
        reactImageView.setProgressiveRenderingEnabled(z);
    }

    @iej(name = "resizeMethod")
    public void setResizeMethod(ReactImageView reactImageView, String str) {
        if (str == null || "auto".equals(str)) {
            reactImageView.setResizeMethod(ImageResizeMethod.AUTO);
            return;
        }
        if ("resize".equals(str)) {
            reactImageView.setResizeMethod(ImageResizeMethod.RESIZE);
            return;
        }
        if ("scale".equals(str)) {
            reactImageView.setResizeMethod(ImageResizeMethod.SCALE);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Invalid resize method: '" + str + "'");
    }

    @iej(name = "resizeMode")
    public void setResizeMode(ReactImageView reactImageView, String str) {
        reactImageView.setScaleType(s5d.c(str));
        reactImageView.setTileMode(s5d.d(str));
    }

    @iej(name = "src")
    public void setSource(ReactImageView reactImageView, ReadableArray readableArray) {
        reactImageView.setSource(readableArray);
    }

    @iej(customType = "Color", name = "tintColor")
    public void setTintColor(ReactImageView reactImageView, Integer num) {
        if (num == null) {
            reactImageView.clearColorFilter();
        } else {
            reactImageView.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    public ReactImageManager(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, o0b o0bVar, Object obj) {
        this.mDraweeControllerBuilder = abstractDraweeControllerBuilder;
        this.mCallerContext = obj;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactImageView createViewInstance(g9p g9pVar) {
        return new ReactImageView(g9pVar, getDraweeControllerBuilder(), null, getCallerContext());
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(ReactImageView reactImageView) {
        super.onAfterUpdateTransaction(reactImageView);
        reactImageView.t();
    }

    public ReactImageManager() {
        this.mDraweeControllerBuilder = null;
        this.mCallerContext = null;
    }
}
