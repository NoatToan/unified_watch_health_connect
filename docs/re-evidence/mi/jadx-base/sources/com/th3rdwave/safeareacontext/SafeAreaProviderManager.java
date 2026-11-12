package com.th3rdwave.safeareacontext;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import defpackage.aak;
import defpackage.e4f;
import defpackage.f08;
import defpackage.g9p;
import defpackage.pd8;
import defpackage.pwl;
import defpackage.sbd;
import defpackage.y8l;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class SafeAreaProviderManager extends ViewGroupManager<SafeAreaProvider> {
    private final ReactApplicationContext mContext;

    public class a implements SafeAreaProvider.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pd8 f10723a;

        public a(pd8 pd8Var) {
            this.f10723a = pd8Var;
        }

        @Override // com.th3rdwave.safeareacontext.SafeAreaProvider.a
        public void a(SafeAreaProvider safeAreaProvider, f08 f08Var, aak aakVar) {
            this.f10723a.dispatchEvent(new sbd(safeAreaProvider.getId(), f08Var, aakVar));
        }
    }

    public SafeAreaProviderManager(ReactApplicationContext reactApplicationContext) {
        this.mContext = reactApplicationContext;
    }

    private Map<String, Object> getInitialWindowMetrics() {
        ViewGroup viewGroup;
        View viewFindViewById;
        Activity currentActivity = this.mContext.getCurrentActivity();
        if (currentActivity == null || (viewGroup = (ViewGroup) currentActivity.getWindow().getDecorView()) == null || (viewFindViewById = viewGroup.findViewById(R.id.content)) == null) {
            return null;
        }
        f08 f08VarC = y8l.c(viewGroup);
        aak aakVarA = y8l.a(viewGroup, viewFindViewById);
        if (f08VarC == null || aakVarA == null) {
            return null;
        }
        return e4f.e("insets", pwl.a(f08VarC), "frame", pwl.c(aakVarA));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return e4f.a().b("topInsetsChange", e4f.d("registrationName", "onInsetsChange")).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return e4f.d("initialWindowMetrics", getInitialWindowMetrics());
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCSafeAreaProvider";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(g9p g9pVar, SafeAreaProvider safeAreaProvider) {
        safeAreaProvider.setOnInsetsChangeListener(new a(((UIManagerModule) g9pVar.getNativeModule(UIManagerModule.class)).getEventDispatcher()));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public SafeAreaProvider createViewInstance(g9p g9pVar) {
        return new SafeAreaProvider(g9pVar);
    }
}
