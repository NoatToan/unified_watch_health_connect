package com.BV.LinearGradient;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import defpackage.g9p;
import defpackage.iej;

/* JADX INFO: loaded from: classes.dex */
public class LinearGradientManager extends SimpleViewManager<LinearGradientView> {
    public static final String PROP_ANGLE = "angle";
    public static final String PROP_ANGLE_CENTER = "angleCenter";
    public static final String PROP_BORDER_RADII = "borderRadii";
    public static final String PROP_COLORS = "colors";
    public static final String PROP_END_POS = "endPoint";
    public static final String PROP_LOCATIONS = "locations";
    public static final String PROP_START_POS = "startPoint";
    public static final String PROP_USE_ANGLE = "useAngle";
    public static final String REACT_CLASS = "BVLinearGradient";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "BVLinearGradient";
    }

    @iej(defaultFloat = 45.0f, name = "angle")
    public void setAngle(LinearGradientView linearGradientView, float f) {
        linearGradientView.setAngle(f);
    }

    @iej(name = "angleCenter")
    public void setAngleCenter(LinearGradientView linearGradientView, ReadableArray readableArray) {
        linearGradientView.setAngleCenter(readableArray);
    }

    @iej(name = "borderRadii")
    public void setBorderRadii(LinearGradientView linearGradientView, ReadableArray readableArray) {
        linearGradientView.setBorderRadii(readableArray);
    }

    @iej(name = "colors")
    public void setColors(LinearGradientView linearGradientView, ReadableArray readableArray) {
        linearGradientView.setColors(readableArray);
    }

    @iej(name = "endPoint")
    public void setEndPosition(LinearGradientView linearGradientView, ReadableArray readableArray) {
        linearGradientView.setEndPosition(readableArray);
    }

    @iej(name = "locations")
    public void setLocations(LinearGradientView linearGradientView, ReadableArray readableArray) {
        if (readableArray != null) {
            linearGradientView.setLocations(readableArray);
        }
    }

    @iej(name = "startPoint")
    public void setStartPosition(LinearGradientView linearGradientView, ReadableArray readableArray) {
        linearGradientView.setStartPosition(readableArray);
    }

    @iej(defaultBoolean = false, name = "useAngle")
    public void setUseAngle(LinearGradientView linearGradientView, boolean z) {
        linearGradientView.setUseAngle(z);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public LinearGradientView createViewInstance(g9p g9pVar) {
        return new LinearGradientView(g9pVar);
    }
}
