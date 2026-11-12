package com.facebook.react.views.drawer;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.miui.tsmclient.net.TSMAuthContants;
import defpackage.bdj;
import defpackage.cm8;
import defpackage.e4f;
import defpackage.exh;
import defpackage.g9p;
import defpackage.iej;
import defpackage.l57;
import defpackage.m57;
import defpackage.n57;
import defpackage.ndj;
import defpackage.o57;
import defpackage.pd8;
import java.util.Map;
import kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = ReactDrawerLayoutManager.REACT_CLASS)
public class ReactDrawerLayoutManager extends ViewGroupManager<bdj> {
    public static final int CLOSE_DRAWER = 2;
    public static final int OPEN_DRAWER = 1;
    protected static final String REACT_CLASS = "AndroidDrawerLayout";

    public static class a implements DrawerLayout.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DrawerLayout f7512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final pd8 f7513b;

        public a(DrawerLayout drawerLayout, pd8 pd8Var) {
            this.f7512a = drawerLayout;
            this.f7513b = pd8Var;
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void a(View view) {
            this.f7513b.dispatchEvent(new m57(this.f7512a.getId()));
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void b(View view) {
            this.f7513b.dispatchEvent(new l57(this.f7512a.getId()));
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void c(int i) {
            this.f7513b.dispatchEvent(new o57(this.f7512a.getId(), i));
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void d(View view, float f) {
            this.f7513b.dispatchEvent(new n57(this.f7512a.getId(), f));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return e4f.e("openDrawer", 1, "closeDrawer", 2);
    }

    @iej(defaultFloat = FloatCompanionObject.NaN, name = "drawerWidth")
    public void getDrawerWidth(bdj bdjVar, float f) {
        bdjVar.a0(Float.isNaN(f) ? -1 : Math.round(exh.c(f)));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return e4f.g("topDrawerSlide", e4f.d("registrationName", "onDrawerSlide"), "topDrawerOpen", e4f.d("registrationName", "onDrawerOpen"), "topDrawerClose", e4f.d("registrationName", "onDrawerClose"), "topDrawerStateChanged", e4f.d("registrationName", "onDrawerStateChanged"));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedViewConstants() {
        return e4f.d("DrawerPosition", e4f.e("Left", 8388611, "Right", 8388613));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.o0d
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(bdj bdjVar, int i, ReadableArray readableArray) {
        if (i == 1) {
            bdjVar.X();
        } else {
            if (i != 2) {
                return;
            }
            bdjVar.W();
        }
    }

    @iej(name = "drawerLockMode")
    public void setDrawerLockMode(bdj bdjVar, String str) {
        if (str == null || "unlocked".equals(str)) {
            bdjVar.setDrawerLockMode(0);
            return;
        }
        if ("locked-closed".equals(str)) {
            bdjVar.setDrawerLockMode(1);
        } else {
            if ("locked-open".equals(str)) {
                bdjVar.setDrawerLockMode(2);
                return;
            }
            throw new JSApplicationIllegalArgumentException("Unknown drawerLockMode " + str);
        }
    }

    @iej(name = "drawerPosition")
    public void setDrawerPosition(bdj bdjVar, Dynamic dynamic) {
        if (dynamic.isNull()) {
            bdjVar.Y(8388611);
            return;
        }
        if (dynamic.getType() == ReadableType.Number) {
            int iAsInt = dynamic.asInt();
            if (8388611 == iAsInt || 8388613 == iAsInt) {
                bdjVar.Y(iAsInt);
                return;
            }
            throw new JSApplicationIllegalArgumentException("Unknown drawerPosition " + iAsInt);
        }
        if (dynamic.getType() != ReadableType.String) {
            throw new JSApplicationIllegalArgumentException("drawerPosition must be a string or int");
        }
        String strAsString = dynamic.asString();
        if (strAsString.equals("left")) {
            bdjVar.Y(8388611);
        } else {
            if (strAsString.equals(TSMAuthContants.PARAM_KEY_RIGHT)) {
                bdjVar.Y(8388613);
                return;
            }
            throw new JSApplicationIllegalArgumentException("drawerPosition must be 'left' or 'right', received" + strAsString);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(g9p g9pVar, bdj bdjVar) {
        bdjVar.setDrawerListener(new a(bdjVar, ((UIManagerModule) g9pVar.getNativeModule(UIManagerModule.class)).getEventDispatcher()));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(bdj bdjVar, View view, int i) {
        if (getChildCount(bdjVar) >= 2) {
            throw new JSApplicationIllegalArgumentException("The Drawer cannot have more than two children");
        }
        if (i == 0 || i == 1) {
            bdjVar.addView(view, i);
            bdjVar.Z();
        } else {
            throw new JSApplicationIllegalArgumentException("The only valid indices for drawer's child are 0 or 1. Got " + i + " instead.");
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public bdj createViewInstance(g9p g9pVar) {
        return new bdj(g9pVar);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setElevation(bdj bdjVar, float f) {
        try {
            bdj.class.getMethod("setDrawerElevation", Float.TYPE).invoke(bdjVar, Float.valueOf(exh.c(f)));
        } catch (Exception e) {
            cm8.D("ReactNative", "setDrawerElevation is not available in this version of the support lib.", e);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(bdj bdjVar, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("closeDrawer")) {
            bdjVar.W();
        } else if (str.equals("openDrawer")) {
            bdjVar.X();
        }
    }
}
