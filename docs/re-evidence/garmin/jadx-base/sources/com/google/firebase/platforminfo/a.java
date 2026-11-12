package com.google.firebase.platforminfo;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.tracing.ComponentMonitor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ComponentFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f53811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f53812c;

    public /* synthetic */ a(int i14, String str, Object obj) {
        this.f53810a = i14;
        this.f53811b = str;
        this.f53812c = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        switch (this.f53810a) {
            case 0:
                return LibraryVersionComponent.lambda$fromContext$0(this.f53811b, (LibraryVersionComponent.VersionExtractor) this.f53812c, componentContainer);
            default:
                return ComponentMonitor.lambda$processRegistrar$0(this.f53811b, (Component) this.f53812c, componentContainer);
        }
    }
}
