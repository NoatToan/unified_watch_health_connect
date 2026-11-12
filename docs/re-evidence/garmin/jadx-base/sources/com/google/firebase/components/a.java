package com.google.firebase.components;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ComponentFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53644b;

    public /* synthetic */ a(Object obj, int i14) {
        this.f53643a = i14;
        this.f53644b = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        switch (this.f53643a) {
            case 0:
                return Component.lambda$of$2(this.f53644b, componentContainer);
            case 1:
                return Component.lambda$intoSet$4(this.f53644b, componentContainer);
            case 2:
                return Component.lambda$intoSet$3(this.f53644b, componentContainer);
            case 3:
                return Component.lambda$of$0(this.f53644b, componentContainer);
            default:
                return Component.lambda$of$1(this.f53644b, componentContainer);
        }
    }
}
