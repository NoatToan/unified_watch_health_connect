package com.facebook.react.views.switchview;

import android.view.View;
import android.widget.CompoundButton;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import defpackage.afj;
import defpackage.cbe;
import defpackage.g9p;
import defpackage.iej;
import defpackage.k0s;
import defpackage.l0s;
import defpackage.zej;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes4.dex */
public class ReactSwitchManager extends SimpleViewManager<zej> {
    private static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new a();
    public static final String REACT_CLASS = "AndroidSwitch";

    public class a implements CompoundButton.OnCheckedChangeListener {
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ((UIManagerModule) ((ReactContext) compoundButton.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(new afj(compoundButton.getId(), z));
        }
    }

    public static class b extends cbe implements YogaMeasureFunction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7559b;
        public boolean c;

        public /* synthetic */ b(a aVar) {
            this();
        }

        private void a() {
            setMeasureFunction(this);
        }

        @Override // com.facebook.yoga.YogaMeasureFunction
        public long measure(l0s l0sVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            if (!this.c) {
                zej zejVar = new zej(getThemedContext());
                zejVar.setShowText(false);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                zejVar.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                this.f7558a = zejVar.getMeasuredWidth();
                this.f7559b = zejVar.getMeasuredHeight();
                this.c = true;
            }
            return k0s.b(this.f7558a, this.f7559b);
        }

        public b() {
            a();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return b.class;
    }

    @iej(defaultBoolean = false, name = "disabled")
    public void setDisabled(zej zejVar, boolean z) {
        zejVar.setEnabled(!z);
    }

    @iej(defaultBoolean = true, name = "enabled")
    public void setEnabled(zej zejVar, boolean z) {
        zejVar.setEnabled(z);
    }

    @iej(name = DebugKt.DEBUG_PROPERTY_VALUE_ON)
    public void setOn(zej zejVar, boolean z) {
        setValue(zejVar, z);
    }

    @iej(customType = "Color", name = "thumbColor")
    public void setThumbColor(zej zejVar, Integer num) {
        zejVar.t(num);
    }

    @iej(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(zej zejVar, Integer num) {
        setThumbColor(zejVar, num);
    }

    @iej(customType = "Color", name = "trackColorForFalse")
    public void setTrackColorForFalse(zej zejVar, Integer num) {
        zejVar.w(num);
    }

    @iej(customType = "Color", name = "trackColorForTrue")
    public void setTrackColorForTrue(zej zejVar, Integer num) {
        zejVar.x(num);
    }

    @iej(customType = "Color", name = "trackTintColor")
    public void setTrackTintColor(zej zejVar, Integer num) {
        zejVar.u(num);
    }

    @iej(name = "value")
    public void setValue(zej zejVar, boolean z) {
        zejVar.setOnCheckedChangeListener(null);
        zejVar.s(z);
        zejVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(g9p g9pVar, zej zejVar) {
        zejVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public cbe createShadowNodeInstance() {
        return new b(null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public zej createViewInstance(g9p g9pVar) {
        zej zejVar = new zej(g9pVar);
        zejVar.setShowText(false);
        return zejVar;
    }
}
