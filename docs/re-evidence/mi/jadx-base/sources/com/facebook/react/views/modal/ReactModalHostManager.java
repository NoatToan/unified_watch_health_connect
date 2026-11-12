package com.facebook.react.views.modal;

import android.content.DialogInterface;
import android.graphics.Point;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import defpackage.bdo;
import defpackage.cbe;
import defpackage.e4f;
import defpackage.g9p;
import defpackage.gbm;
import defpackage.gnk;
import defpackage.iej;
import defpackage.ndj;
import defpackage.pd8;
import defpackage.x6g;
import defpackage.y6g;
import defpackage.yej;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = ReactModalHostManager.REACT_CLASS)
public class ReactModalHostManager extends ViewGroupManager<ReactModalHostView> {
    public static final String REACT_CLASS = "RCTModalHostView";

    public class a implements ReactModalHostView.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pd8 f7519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ReactModalHostView f7520b;

        public a(pd8 pd8Var, ReactModalHostView reactModalHostView) {
            this.f7519a = pd8Var;
            this.f7520b = reactModalHostView;
        }

        @Override // com.facebook.react.views.modal.ReactModalHostView.c
        public void a(DialogInterface dialogInterface) {
            this.f7519a.dispatchEvent(new gnk(this.f7520b.getId()));
        }
    }

    public class b implements DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pd8 f7521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ReactModalHostView f7522b;

        public b(pd8 pd8Var, ReactModalHostView reactModalHostView) {
            this.f7521a = pd8Var;
            this.f7522b = reactModalHostView;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            this.f7521a.dispatchEvent(new gbm(this.f7522b.getId()));
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return e4f.a().b("topRequestClose", e4f.d("registrationName", "onRequestClose")).b("topShow", e4f.d("registrationName", "onShow")).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends cbe> getShadowNodeClass() {
        return y6g.class;
    }

    @iej(name = "animationType")
    public void setAnimationType(ReactModalHostView reactModalHostView, String str) {
        reactModalHostView.setAnimationType(str);
    }

    @iej(name = "hardwareAccelerated")
    public void setHardwareAccelerated(ReactModalHostView reactModalHostView, boolean z) {
        reactModalHostView.setHardwareAccelerated(z);
    }

    @iej(name = "transparent")
    public void setTransparent(ReactModalHostView reactModalHostView, boolean z) {
        reactModalHostView.setTransparent(z);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(g9p g9pVar, ReactModalHostView reactModalHostView) {
        pd8 eventDispatcher = ((UIManagerModule) g9pVar.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        reactModalHostView.setOnRequestCloseListener(new a(eventDispatcher, reactModalHostView));
        reactModalHostView.setOnShowListener(new b(eventDispatcher, reactModalHostView));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public cbe createShadowNodeInstance() {
        return new y6g();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactModalHostView createViewInstance(g9p g9pVar) {
        return new TranslucentModalHostView(g9pVar);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(ReactModalHostView reactModalHostView) {
        super.onAfterUpdateTransaction(reactModalHostView);
        reactModalHostView.d();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(ReactModalHostView reactModalHostView) {
        super.onDropViewInstance(reactModalHostView);
        reactModalHostView.c();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(ReactModalHostView reactModalHostView, yej yejVar, bdo bdoVar) {
        Point pointA = x6g.a(reactModalHostView.getContext());
        reactModalHostView.f(bdoVar, pointA.x, pointA.y);
        return null;
    }
}
