package com.facebook.react.views.view;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import defpackage.adj;
import defpackage.e4f;
import defpackage.exh;
import defpackage.g9p;
import defpackage.iej;
import defpackage.j0s;
import defpackage.jej;
import defpackage.ndj;
import defpackage.ntq;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = ReactViewManager.REACT_CLASS)
public class ReactViewManager extends ViewGroupManager<ReactViewGroup> {
    private static final int CMD_HOTSPOT_UPDATE = 1;
    private static final int CMD_SET_PRESSED = 2;
    private static final String HOTSPOT_UPDATE_KEY = "hotspotUpdate";
    public static final String REACT_CLASS = "RCTView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5};
    private ReadableMap mNativeBackground;
    private ReadableMap mNativeForeground;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ReactViewGroup f7596a;

        public a(ReactViewGroup reactViewGroup) {
            this.f7596a = reactViewGroup;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((UIManagerModule) ((ReactContext) this.f7596a.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(new ntq(this.f7596a.getId()));
        }
    }

    private void handleHotspotUpdate(ReactViewGroup reactViewGroup, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() != 2) {
            throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'updateHotspot' command");
        }
        reactViewGroup.drawableHotspotChanged(exh.b(readableArray.getDouble(0)), exh.b(readableArray.getDouble(1)));
    }

    private void handleSetPressed(ReactViewGroup reactViewGroup, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() != 1) {
            throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'setPressed' command");
        }
        reactViewGroup.setPressed(readableArray.getBoolean(0));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return e4f.e(HOTSPOT_UPDATE_KEY, 1, "setPressed", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @iej(defaultInt = -1, name = "nextFocusDown")
    public void nextFocusDown(ReactViewGroup reactViewGroup, int i) {
        reactViewGroup.setNextFocusDownId(i);
    }

    @iej(defaultInt = -1, name = "nextFocusForward")
    public void nextFocusForward(ReactViewGroup reactViewGroup, int i) {
        reactViewGroup.setNextFocusForwardId(i);
    }

    @iej(defaultInt = -1, name = "nextFocusLeft")
    public void nextFocusLeft(ReactViewGroup reactViewGroup, int i) {
        reactViewGroup.setNextFocusLeftId(i);
    }

    @iej(defaultInt = -1, name = "nextFocusRight")
    public void nextFocusRight(ReactViewGroup reactViewGroup, int i) {
        reactViewGroup.setNextFocusRightId(i);
    }

    @iej(defaultInt = -1, name = "nextFocusUp")
    public void nextFocusUp(ReactViewGroup reactViewGroup, int i) {
        reactViewGroup.setNextFocusUpId(i);
    }

    @iej(name = "accessible")
    public void setAccessible(ReactViewGroup reactViewGroup, boolean z) {
        reactViewGroup.setFocusable(z);
    }

    @iej(name = "backfaceVisibility")
    public void setBackfaceVisibility(ReactViewGroup reactViewGroup, String str) {
        reactViewGroup.setBackfaceVisibility(str);
    }

    @jej(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor", "borderStartColor", "borderEndColor"})
    public void setBorderColor(ReactViewGroup reactViewGroup, int i, Integer num) {
        reactViewGroup.setBorderColor(SPACING_TYPES[i], num == null ? Float.NaN : num.intValue() & 16777215, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @jej(defaultFloat = FloatCompanionObject.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius", "borderTopStartRadius", "borderTopEndRadius", "borderBottomStartRadius", "borderBottomEndRadius"})
    public void setBorderRadius(ReactViewGroup reactViewGroup, int i, float f) {
        if (!j0s.a(f) && f < 0.0f) {
            f = Float.NaN;
        }
        if (!j0s.a(f)) {
            f = exh.c(f);
        }
        if (i == 0) {
            reactViewGroup.setBorderRadius(f);
        } else {
            reactViewGroup.setBorderRadius(f, i - 1);
        }
        ReadableMap readableMap = this.mNativeBackground;
        if (readableMap != null) {
            setNativeBackground(reactViewGroup, readableMap);
        }
        ReadableMap readableMap2 = this.mNativeForeground;
        if (readableMap2 != null) {
            setNativeForeground(reactViewGroup, readableMap2);
        }
    }

    @iej(name = "borderStyle")
    public void setBorderStyle(ReactViewGroup reactViewGroup, String str) {
        reactViewGroup.setBorderStyle(str);
    }

    @jej(defaultFloat = FloatCompanionObject.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"})
    public void setBorderWidth(ReactViewGroup reactViewGroup, int i, float f) {
        if (!j0s.a(f) && f < 0.0f) {
            f = Float.NaN;
        }
        if (!j0s.a(f)) {
            f = exh.c(f);
        }
        reactViewGroup.setBorderWidth(SPACING_TYPES[i], f);
    }

    @iej(name = "collapsable")
    public void setCollapsable(ReactViewGroup reactViewGroup, boolean z) {
    }

    @iej(name = "focusable")
    public void setFocusable(ReactViewGroup reactViewGroup, boolean z) {
        if (z) {
            reactViewGroup.setOnClickListener(new a(reactViewGroup));
            reactViewGroup.setFocusable(true);
        } else {
            reactViewGroup.setOnClickListener(null);
            reactViewGroup.setClickable(false);
        }
    }

    @iej(name = "hitSlop")
    public void setHitSlop(ReactViewGroup reactViewGroup, ReadableMap readableMap) {
        if (readableMap == null) {
            reactViewGroup.setHitSlopRect(null);
        } else {
            reactViewGroup.setHitSlopRect(new Rect(readableMap.hasKey("left") ? (int) exh.b(readableMap.getDouble("left")) : 0, readableMap.hasKey("top") ? (int) exh.b(readableMap.getDouble("top")) : 0, readableMap.hasKey(TSMAuthContants.PARAM_KEY_RIGHT) ? (int) exh.b(readableMap.getDouble(TSMAuthContants.PARAM_KEY_RIGHT)) : 0, readableMap.hasKey("bottom") ? (int) exh.b(readableMap.getDouble("bottom")) : 0));
        }
    }

    @iej(name = "nativeBackgroundAndroid")
    public void setNativeBackground(ReactViewGroup reactViewGroup, ReadableMap readableMap) {
        this.mNativeBackground = readableMap;
        reactViewGroup.setTranslucentBackgroundDrawable(readableMap == null ? null : adj.a(reactViewGroup, readableMap));
    }

    @iej(name = "nativeForegroundAndroid")
    @TargetApi(23)
    public void setNativeForeground(ReactViewGroup reactViewGroup, ReadableMap readableMap) {
        this.mNativeForeground = readableMap;
        reactViewGroup.setForeground(readableMap == null ? null : adj.a(reactViewGroup, readableMap));
    }

    @iej(name = "needsOffscreenAlphaCompositing")
    public void setNeedsOffscreenAlphaCompositing(ReactViewGroup reactViewGroup, boolean z) {
        reactViewGroup.setNeedsOffscreenAlphaCompositing(z);
    }

    @iej(name = "overflow")
    public void setOverflow(ReactViewGroup reactViewGroup, String str) {
        reactViewGroup.setOverflow(str);
    }

    @iej(name = "pointerEvents")
    public void setPointerEvents(ReactViewGroup reactViewGroup, String str) {
        if (str == null) {
            reactViewGroup.setPointerEvents(PointerEvents.AUTO);
        } else {
            reactViewGroup.setPointerEvents(PointerEvents.valueOf(str.toUpperCase(Locale.US).replace("-", RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR)));
        }
    }

    @iej(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(ReactViewGroup reactViewGroup, boolean z) {
        reactViewGroup.setRemoveClippedSubviews(z);
    }

    @iej(name = "hasTVPreferredFocus")
    public void setTVPreferredFocus(ReactViewGroup reactViewGroup, boolean z) {
        if (z) {
            reactViewGroup.setFocusable(true);
            reactViewGroup.setFocusableInTouchMode(true);
            reactViewGroup.requestFocus();
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(ReactViewGroup reactViewGroup, View view, int i) {
        if (reactViewGroup.getRemoveClippedSubviews()) {
            reactViewGroup.addViewWithSubviewClippingEnabled(view, i);
        } else {
            reactViewGroup.addView(view, i);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactViewGroup createViewInstance(g9p g9pVar) {
        return new ReactViewGroup(g9pVar);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(ReactViewGroup reactViewGroup, int i) {
        return reactViewGroup.getRemoveClippedSubviews() ? reactViewGroup.getChildAtWithSubviewClippingEnabled(i) : reactViewGroup.getChildAt(i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(ReactViewGroup reactViewGroup) {
        return reactViewGroup.getRemoveClippedSubviews() ? reactViewGroup.getAllChildrenCount() : reactViewGroup.getChildCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeAllViews(ReactViewGroup reactViewGroup) {
        if (reactViewGroup.getRemoveClippedSubviews()) {
            reactViewGroup.removeAllViewsWithSubviewClippingEnabled();
        } else {
            reactViewGroup.removeAllViews();
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(ReactViewGroup reactViewGroup, int i) {
        if (!reactViewGroup.getRemoveClippedSubviews()) {
            reactViewGroup.removeViewAt(i);
            return;
        }
        View childAt = getChildAt(reactViewGroup, i);
        if (childAt.getParent() != null) {
            reactViewGroup.removeView(childAt);
        }
        reactViewGroup.removeViewWithSubviewClippingEnabled(childAt);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setOpacity(ReactViewGroup reactViewGroup, float f) {
        reactViewGroup.setOpacityIfPossible(f);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setTransform(ReactViewGroup reactViewGroup, ReadableArray readableArray) {
        super.setTransform(reactViewGroup, readableArray);
        reactViewGroup.setBackfaceVisibilityDependantOpacity();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactViewGroup reactViewGroup, int i, ReadableArray readableArray) {
        if (i == 1) {
            handleHotspotUpdate(reactViewGroup, readableArray);
        } else {
            if (i != 2) {
                return;
            }
            handleSetPressed(reactViewGroup, readableArray);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactViewGroup reactViewGroup, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setPressed")) {
            handleSetPressed(reactViewGroup, readableArray);
        } else if (str.equals(HOTSPOT_UPDATE_KEY)) {
            handleHotspotUpdate(reactViewGroup, readableArray);
        }
    }
}
