package com.facebook.react.uimanager;

import defpackage.e4f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, ViewManager> f7510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UIManagerModule.f f7511b;

    public f(UIManagerModule.f fVar) {
        this.f7510a = e4f.b();
        this.f7511b = fVar;
    }

    public ViewManager a(String str) {
        ViewManager viewManagerB;
        ViewManager viewManager = this.f7510a.get(str);
        if (viewManager != null) {
            return viewManager;
        }
        UIManagerModule.f fVar = this.f7511b;
        if (fVar != null && (viewManagerB = fVar.b(str)) != null) {
            this.f7510a.put(str, viewManagerB);
            return viewManagerB;
        }
        throw new IllegalViewOperationException("No ViewManager defined for class " + str);
    }

    public f(List<ViewManager> list) {
        HashMap mapB = e4f.b();
        for (ViewManager viewManager : list) {
            mapB.put(viewManager.getName(), viewManager);
        }
        this.f7510a = mapB;
        this.f7511b = null;
    }
}
